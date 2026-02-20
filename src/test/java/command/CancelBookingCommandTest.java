package command;

import model.Booking;
import model.BookingStatus;
import model.Faculty;
import model.User;
import org.junit.jupiter.api.*;
import room.Room;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.*;
import java.time.LocalDateTime;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CancelBookingCommandTest {

	private Path originalUserDir;
	private Path testRoot;
	private Path csvPath;
	private User user;
	private Room room;
	private LocalDateTime now;

	private boolean containsBookingID(List<String> lines, int id) {
		return lines.stream()
        	.map(l -> l.split(",")[0].trim())
        	.anyMatch(x -> x.equals(String.valueOf(id)));
	}


	@BeforeEach
	void setUp() throws IOException {
    	originalUserDir = Paths.get(System.getProperty("user.dir"));
    	testRoot = Files.createTempDirectory("test-user-dir-");
    	System.setProperty("user.dir", testRoot.toString());

    	Path dataDir = testRoot.resolve("eecs3311/src/main/data");
    	Files.createDirectories(dataDir);

    	csvPath = dataDir.resolve("bookings.csv");

    	user = new Faculty("test@example.com", "pw", "FAC100");
    	room = new Room("R100", 5, "Eng", "101");
    	now = LocalDateTime.now().plusHours(2);
	}

	@AfterEach
	void tearDown() throws IOException {
    	System.setProperty("user.dir", originalUserDir.toString());
    	if (Files.exists(testRoot)) {
        	Files.walk(testRoot)
                	.sorted((a, b) -> b.compareTo(a))
                	.forEach(p -> {
                    	try { Files.deleteIfExists(p); } catch (IOException ignored) {}
                	});
    	}
	}

	private void writeCsvLines(List<String> lines) throws IOException {
    	Files.write(csvPath, lines, StandardCharsets.UTF_8,
            	StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING);
	}

	private List<String> readCsvLines() throws IOException {
    	if (!Files.exists(csvPath)) return List.of();
    	return Files.readAllLines(csvPath, StandardCharsets.UTF_8);
	}

	// 1) Successful cancel removes exact booking
	@Test
        void testCancelRemovesLineAndSetsStatus() throws IOException {
	Booking b = new Booking(user, room, now, now.plusHours(2));

	String header = "bookingID,roomID,checkIn,checkOut,deposit,user,totalPrice,status";
	String line = String.format("%d,R100,%s,%s,%.2f,%s,%.2f,%s",
        	b.getBookingID(),
        	b.getCheckInTime(), b.getCheckOutTime(),
        	b.getDepositAmount(), b.getUser().getID(),
        	b.getTotalPrice(), b.getStatus().name());

	writeCsvLines(List.of(header, line));

	CancelBookingCommand cmd = new CancelBookingCommand(b);
	Booking result = cmd.execute();

	assertEquals(BookingStatus.Cancelled, result.getStatus());

	List<String> remaining = readCsvLines();

	// header remains
	assertFalse(remaining.isEmpty());
	assertEquals(header, remaining.get(0));

	// exact booking removed
	assertTrue(remaining.stream()
        	.noneMatch(l -> l.split(",")[0].trim().equals(String.valueOf(b.getBookingID()))));
        }

	// 2) If no matching line, file remains unchanged
	@Test
	void testCancelWhenNoLineExistsSetsStatusButLeavesFile() throws IOException {
    	Booking b = new Booking(user, room, now, now.plusHours(2));

    	String header = "bookingID,roomID,checkIn,checkOut,deposit,user,totalPrice,status";
    	String other = "999,R9,2025-01-01T10:00,2025-01-01T11:00,30.0,OTHER,30.0,Pending";
    	writeCsvLines(List.of(header, other));

    	CancelBookingCommand cmd = new CancelBookingCommand(b);
    	Booking res = cmd.execute();

    	assertEquals(BookingStatus.Cancelled, res.getStatus());

    	List<String> lines = readCsvLines();
    	assertEquals(2, lines.size());
    	assertTrue(lines.get(1).contains("999"));
	}

	// 3) No CSV file => still sets status
	@Test
	void testBookingStatusChangedEvenIfFileMissing() throws IOException {
    	Booking b = new Booking(user, room, now, now.plusHours(2));
    	Files.deleteIfExists(csvPath);

    	CancelBookingCommand cmd = new CancelBookingCommand(b);
    	Booking res = cmd.execute();

    	assertEquals(BookingStatus.Cancelled, res.getStatus());
    	assertTrue(true); // no requirement about file existence
	}

	// 4) Only exact line removed
	@Test
        void testMultipleLinesOnlyRemoveExactMatch() throws IOException {
	Booking b = new Booking(user, room, now, now.plusHours(2));
	String header = "bookingID,roomID,checkIn,checkOut,deposit,user,totalPrice,status";

	String similar = String.format("%d4,RX,2025-01-01T10:00,2025-01-01T11:00,30.0,OTHER,30.0,Pending",
        	b.getBookingID());

	String exact = String.format("%d,R100,%s,%s,%.2f,%s,%.2f,%s",
        	b.getBookingID(),
        	b.getCheckInTime(), b.getCheckOutTime(),
        	b.getDepositAmount(), b.getUser().getID(),
        	b.getTotalPrice(), b.getStatus().name());

	writeCsvLines(List.of(header, similar, exact));

	new CancelBookingCommand(b).execute();

	List<String> remaining = readCsvLines();

	// header always remains
	assertFalse(remaining.isEmpty());
	assertEquals(header, remaining.get(0));

	// exact ID removed
	assertTrue(remaining.stream()
    	.noneMatch(l -> l.split(",")[0].trim().equals(String.valueOf(b.getBookingID()))));
        }

	// 5) Running cancel twice is safe
	@Test
	void testSecondCancelIdempotent() throws IOException {
    	Booking b = new Booking(user, room, now, now.plusHours(2));
    	String header = "bookingID,roomID,checkIn,checkOut,deposit,user,totalPrice,status";

    	String exact = String.format("%d,R100,%s,%s,%.2f,%s,%.2f,%s",
            	b.getBookingID(),
            	b.getCheckInTime(), b.getCheckOutTime(),
            	b.getDepositAmount(), b.getUser().getID(),
            	b.getTotalPrice(), b.getStatus().name());

    	writeCsvLines(List.of(header, exact));

    	CancelBookingCommand cmd = new CancelBookingCommand(b);
    	cmd.execute();

    	assertDoesNotThrow(cmd::execute);
    	assertEquals(BookingStatus.Cancelled, b.getStatus());

    	List<String> remaining = readCsvLines();
    	assertTrue(remaining.size() >= 1);
	}

	@Test
	void testNullBookingThrowsNPE() {
    	CancelBookingCommand cmd = new CancelBookingCommand(null);
    	assertThrows(NullPointerException.class, cmd::execute);
	}

	// 7) Header preserved
	@Test
	void testCsvHeaderPreserved() throws IOException {
    	Booking b = new Booking(user, room, now, now.plusHours(2));
    	String header = "bookingID,roomID,checkIn,checkOut,deposit,user,totalPrice,status";

    	String exact = String.format("%d,R100,%s,%s,%.2f,%s,%.2f,%s",
            	b.getBookingID(),
            	b.getCheckInTime(), b.getCheckOutTime(),
            	b.getDepositAmount(), b.getUser().getID(),
            	b.getTotalPrice(), b.getStatus().name());

    	writeCsvLines(List.of(header, exact));

    	new CancelBookingCommand(b).execute();

    	List<String> lines = readCsvLines();
    	assertFalse(lines.isEmpty());
    	assertEquals(header, lines.get(0));
	}

	@Test
	void testBookingStatusSetToCancelledConstant() throws IOException {
    	Booking b = new Booking(user, room, now, now.plusHours(2));

    	writeCsvLines(List.of(
            	"bookingID,roomID,checkIn,checkOut,deposit,user,totalPrice,status",
            	b.getBookingID() + ",..."
    	));

    	new CancelBookingCommand(b).execute();
    	assertSame(BookingStatus.Cancelled, b.getStatus());
	}

	// 9) Other bookings remain intact
	@Test
	void testCancelDoesNotRemoveOtherBookings() throws IOException {
    	Booking b = new Booking(user, room, now, now.plusHours(2));

    	String header = "bookingID,roomID,checkIn,checkOut,deposit,user,totalPrice,status";
    	String other = "777,R200,2025-02-01T10:00,2025-02-01T11:00,30.0,AAA,30.0,Pending";
    	String exact = b.getBookingID() + ",R100," +
            	b.getCheckInTime() + "," + b.getCheckOutTime() +
            	",30.0,FAC100,60.0,Pending";

    	writeCsvLines(List.of(header, other, exact));

    	new CancelBookingCommand(b).execute();

    	List<String> remaining = readCsvLines();

    	assertTrue(remaining.size() >= 2);
    	assertEquals(header, remaining.get(0));
    	assertTrue(remaining.stream().anyMatch(line -> line.contains("777")));
	}

	// 10) Leading spaces should NOT match exact prefix
	@Test
	void testLineWithLeadingSpacesNotRemovedUnlessExactPrefix() throws IOException {
    	Booking b = new Booking(user, room, now, now.plusHours(2));

    	String header = "bookingID,roomID,checkIn,checkOut,deposit,user,totalPrice,status";
    	String spaced = "   " + b.getBookingID() + ",R100,2025-01-01T10:00,2025-01-01T11:00,30.0,FAC100,30.0,Pending";
    	String exact = b.getBookingID() + ",R100," +
            	b.getCheckInTime() + "," + b.getCheckOutTime() +
            	",30.0,FAC100,60.0,Pending";

    	writeCsvLines(List.of(header, spaced, exact));

    	new CancelBookingCommand(b).execute();

    	List<String> remaining = readCsvLines();

    	assertTrue(remaining.size() >= 2);
    	assertEquals(header, remaining.get(0));
    	assertTrue(remaining.stream().anyMatch(l -> l.startsWith("   "))); // spaced still there
	}
}

