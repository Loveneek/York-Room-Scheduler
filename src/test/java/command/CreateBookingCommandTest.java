package command;

import model.*;
import room.Room;
import org.junit.jupiter.api.*;

import java.io.File;
import java.lang.reflect.Method;
import java.lang.reflect.Field;
import java.time.LocalDateTime;
import java.nio.file.Files;
import java.nio.file.Paths;

import static org.junit.jupiter.api.Assertions.*;

public class CreateBookingCommandTest {

    private User user;
    private Room room;
    private LocalDateTime now;
    private LocalDateTime later;

    @BeforeEach
    void setup() {
        user = new Faculty("test@example.com", "123", "FAC001");
        room = new Room("R101", 20, "Engineering", "E201");
        now = LocalDateTime.now().plusHours(1);
        later = now.plusHours(3);
    }

    private static void overrideCsvPath(String newPath) {
	try {
    	Field field = CreateBookingCommand.class.getDeclaredField("csvPath");
    	field.setAccessible(true);

    	// Remove final modifier
    	Field modifiers = Field.class.getDeclaredField("modifiers");
    	modifiers.setAccessible(true);
    	modifiers.setInt(field, field.getModifiers() & ~java.lang.reflect.Modifier.FINAL);

    	// Set new value
    	field.set(null, Paths.get(newPath)); // << important: field is a Path now
	} catch (Exception e) {
    	throw new RuntimeException("Failed to override csvPath", e);
	}
     }


    // 1. Successful booking creation
    @Test
    void testCreateBookingSuccess() {
        CreateBookingCommand cmd = new CreateBookingCommand(user, room, now, later);

        Booking b = cmd.execute();
        assertNotNull(b);
        assertEquals(BookingStatus.Pending, b.getStatus());
    }

    // 2. Room becomes occupied after booking
    @Test
    void testRoomBecomesOccupied() {
        CreateBookingCommand cmd = new CreateBookingCommand(user, room, now, later);

        cmd.execute();
        assertTrue(room.isOccupied());
    }

    // 3. Booking stores correct user
    @Test
    void testUserStoredCorrectly() {
        CreateBookingCommand cmd = new CreateBookingCommand(user, room, now, later);

        Booking b = cmd.execute();
        assertEquals("FAC001", b.getUser().getID());
    }

    // 4. Booking stores correct room
    @Test
    void testRoomStoredCorrectly() {
        CreateBookingCommand cmd = new CreateBookingCommand(user, room, now, later);

        Booking b = cmd.execute();
        assertEquals("R101", b.getRoom().getRoomID());
    }

    // 5. Check-in time stored correctly
    @Test
    void testCheckInStored() {
        CreateBookingCommand cmd = new CreateBookingCommand(user, room, now, later);

        Booking b = cmd.execute();
        assertEquals(now, b.getCheckInTime());
    }

    // 6. Check-out time stored correctly
    @Test
    void testCheckOutStored() {
        CreateBookingCommand cmd = new CreateBookingCommand(user, room, now, later);

        Booking b = cmd.execute();
        assertEquals(later, b.getCheckOutTime());
    }

    // 7. Total price equals rate * hours
    @Test
    void testTotalPrice() {
        CreateBookingCommand cmd = new CreateBookingCommand(user, room, now, later);

        Booking b = cmd.execute();
        assertEquals(30.0 * 3, b.getTotalPrice()); // 3 hours difference
    }

    // 8. Deposit equals hourly rate
    @Test
    void testDepositAmount() {
        CreateBookingCommand cmd = new CreateBookingCommand(user, room, now, later);

        Booking b = cmd.execute();
        assertEquals(30.0, b.getDepositAmount());
    }

    // 9. Null user should cause exception
    @Test
    void testNullUserThrows() {
        assertThrows(NullPointerException.class, () -> {
            new CreateBookingCommand(null, room, now, later).execute();
        });
    }

    // 10. Null room should cause exception
    @Test
    void testNullRoomThrows() {
        assertThrows(NullPointerException.class, () -> {
            new CreateBookingCommand(user, null, now, later).execute();
        });
    }

@Test
void testCsvWritingIsCovered() throws Exception {

    // Create temp file
    File temp = File.createTempFile("booking_test", ".csv");
    temp.deleteOnExit();
    
    // Override the path
    overrideCsvPath(temp.getAbsolutePath());

    // Execute booking command
    CreateBookingCommand cmd = new CreateBookingCommand(user, room, now, later);
    Booking booking = cmd.execute();

    // Read CSV content
    String content = Files.readString(temp.toPath());

    // Validate CSV was written
    assertTrue(content.contains("bookingID"));
    assertTrue(content.contains(booking.getRoom().getRoomID()));
    assertTrue(content.contains(booking.getUser().getID()));
    assertTrue(content.contains(booking.getStatus().toString()));
}
}
