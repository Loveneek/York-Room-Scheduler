import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest3 {

    public static boolean debug = false;

    public void assertBooleanArrayEquals(boolean[] expectedArray, boolean[] actualArray) {
        if (expectedArray.length != actualArray.length) {
            throw new AssertionError("Array lengths differ: " + expectedArray.length + " != " + actualArray.length);
        }
        for (int i = 0; i < expectedArray.length; i++) {
            if (expectedArray[i] != actualArray[i]) {
                throw new AssertionError("Arrays differ at index " + i + ": " + expectedArray[i] + " != " + actualArray[i]);
            }
        }
    }

    @Test
    public void test01501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01501");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        room.SensorObserver sensorObserver5 = null;
        room4.addObserver(sensorObserver5);
        java.lang.String str7 = room4.getScannedID();
        java.lang.String str8 = room4.getFullLocation();
        boolean boolean9 = room4.isOccupied();
        boolean boolean10 = room4.isOccupied();
        java.lang.String str11 = room4.getFullLocation();
        java.lang.String str12 = room4.getRoomNumber();
        java.lang.String str13 = room4.getFullLocation();
        // The following exception was thrown during execution in test generation
        try {
            room4.notifyObservers();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi! - hi!" + "'", str8, "hi! - hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi! - hi!" + "'", str11, "hi! - hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi! - hi!" + "'", str13, "hi! - hi!");
    }

    @Test
    public void test01502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01502");
        room.Room room4 = new room.Room("Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 100", (int) (short) 100, "Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100", "Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi!");
        java.lang.String str5 = room4.getScannedID();
        boolean boolean6 = room4.isUnderMaintenance();
        room4.notifyObservers();
        room4.setOccupied(false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test01503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01503");
        room.Room room4 = new room.Room("Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi!", (-1), " - Room hi! | hi! - hi! | Capacity: 0", "Room hi! | hi! - hi! | Capacity: 0 - hi!");
        int int5 = room4.getCapacity();
        room4.setScannedID("Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 97");
        boolean boolean8 = room4.isEnabled();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test01504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01504");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        java.lang.String str5 = room4.getScannedID();
        room4.setScannedID("hi!");
        java.lang.String str8 = room4.getBuildingName();
        java.lang.String str9 = room4.getFullLocation();
        java.lang.String str10 = room4.getRoomNumber();
        int int11 = room4.getCapacity();
        java.lang.String str12 = room4.getScannedID();
        java.lang.Class<?> wildcardClass13 = room4.getClass();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi! - hi!" + "'", str9, "hi! - hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test01505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01505");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        room.SensorObserver sensorObserver5 = null;
        room4.addObserver(sensorObserver5);
        java.lang.String str7 = room4.getScannedID();
        room.SensorObserver sensorObserver8 = null;
        room4.removeObserver(sensorObserver8);
        java.lang.String str10 = room4.getRoomNumber();
        java.lang.String str11 = room4.toString();
        room4.setScannedID("Room hi! | hi! - hi! | Capacity: 0 - hi!");
        room.SensorObserver sensorObserver14 = null;
        room4.addObserver(sensorObserver14);
        int int16 = room4.getCapacity();
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str11, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test01506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01506");
        room.Room room4 = new room.Room("", (int) (byte) 100, "Room hi! | hi! - hi! | Capacity: 0 - hi!", "");
        boolean boolean5 = room4.isEnabled();
        java.lang.String str6 = room4.getScannedID();
        java.lang.String str7 = room4.getBuildingName();
        java.lang.String str8 = room4.getBuildingName();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0 - hi!" + "'", str7, "Room hi! | hi! - hi! | Capacity: 0 - hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0 - hi!" + "'", str8, "Room hi! | hi! - hi! | Capacity: 0 - hi!");
    }

    @Test
    public void test01507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01507");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        java.lang.String str5 = room4.getScannedID();
        room4.setScannedID("hi!");
        java.lang.String str8 = room4.getBuildingName();
        int int9 = room4.getCapacity();
        room.SensorObserver sensorObserver10 = null;
        room4.addObserver(sensorObserver10);
        java.lang.String str12 = room4.getRoomNumber();
        room.SensorObserver sensorObserver13 = null;
        room4.removeObserver(sensorObserver13);
        room.SensorObserver sensorObserver15 = null;
        room4.removeObserver(sensorObserver15);
        int int17 = room4.getCapacity();
        room4.setOccupied(false);
        java.lang.String str20 = room4.getScannedID();
        boolean boolean21 = room4.isEnabled();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test01508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01508");
        room.Room room4 = new room.Room("Room  - Room hi! | hi! - hi! | Capacity: 0 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 0 - hi! -  - hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10", (int) (short) -1, "Room Room hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 1 | Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! - Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: -1 - Room hi! | hi! - hi! | Capacity: 0 - hi! - ", "Room Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 97 | Room hi! | hi! - hi! | Capacity: 0 - hi! -  - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 | Capacity: 100");
    }

    @Test
    public void test01509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01509");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        java.lang.String str5 = room4.getScannedID();
        room4.setScannedID("hi!");
        boolean boolean8 = room4.isEnabled();
        int int9 = room4.getCapacity();
        boolean boolean10 = room4.isOccupied();
        java.lang.String str11 = room4.getFullLocation();
        room4.setScannedID("");
        boolean boolean14 = room4.isEnabled();
        java.lang.String str15 = room4.getFullLocation();
        java.lang.String str16 = room4.getRoomNumber();
        java.lang.String str17 = room4.getScannedID();
        java.lang.String str18 = room4.getRoomID();
        java.lang.String str19 = room4.getFullLocation();
        java.lang.String str20 = room4.getScannedID();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi! - hi!" + "'", str11, "hi! - hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi! - hi!" + "'", str15, "hi! - hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi! - hi!" + "'", str19, "hi! - hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test01510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01510");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        java.lang.String str5 = room4.getScannedID();
        room4.setScannedID("hi!");
        room4.setUnderMaintenance(true);
        room.SensorObserver sensorObserver10 = null;
        room4.addObserver(sensorObserver10);
        boolean boolean12 = room4.isUnderMaintenance();
        java.lang.String str13 = room4.getFullLocation();
        java.lang.Class<?> wildcardClass14 = room4.getClass();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi! - hi!" + "'", str13, "hi! - hi!");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test01511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01511");
        room.Room room4 = new room.Room("Room  | Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! | Capacity: 1", (int) (short) 1, " - Room hi! | hi! - hi! | Capacity: 0", "Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi!");
        int int5 = room4.getCapacity();
        java.lang.Class<?> wildcardClass6 = room4.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test01512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01512");
        room.Room room4 = new room.Room("Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10", 0, "hi!", "Room hi! | hi! - hi! | Capacity: 0");
        int int5 = room4.getCapacity();
        java.lang.String str6 = room4.getBuildingName();
        room.SensorObserver sensorObserver7 = null;
        room4.removeObserver(sensorObserver7);
        java.lang.String str9 = room4.getBuildingName();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test01513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01513");
        room.Room room4 = new room.Room("hi!", (int) (byte) 100, "", "Room hi! | hi! - hi! | Capacity: 0");
        java.lang.String str5 = room4.toString();
        java.lang.String str6 = room4.getFullLocation();
        room.SensorObserver sensorObserver7 = null;
        room4.removeObserver(sensorObserver7);
        room.SensorObserver sensorObserver9 = null;
        room4.addObserver(sensorObserver9);
        java.lang.String str11 = room4.getBuildingName();
        java.lang.String str12 = room4.getRoomNumber();
        // The following exception was thrown during execution in test generation
        try {
            room4.setEnabled(true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100" + "'", str5, "Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + " - Room hi! | hi! - hi! | Capacity: 0" + "'", str6, " - Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str12, "Room hi! | hi! - hi! | Capacity: 0");
    }

    @Test
    public void test01514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01514");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        java.lang.String str5 = room4.getScannedID();
        room4.setScannedID("hi!");
        java.lang.String str8 = room4.getRoomID();
        room4.setUnderMaintenance(false);
        java.lang.String str11 = room4.getFullLocation();
        java.lang.String str12 = room4.getFullLocation();
        java.lang.Class<?> wildcardClass13 = room4.getClass();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi! - hi!" + "'", str11, "hi! - hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi! - hi!" + "'", str12, "hi! - hi!");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test01515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01515");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        room.SensorObserver sensorObserver5 = null;
        room4.addObserver(sensorObserver5);
        java.lang.String str7 = room4.getScannedID();
        room.SensorObserver sensorObserver8 = null;
        room4.removeObserver(sensorObserver8);
        java.lang.String str10 = room4.getRoomNumber();
        java.lang.String str11 = room4.toString();
        java.lang.String str12 = room4.getScannedID();
        room4.notifyObservers();
        room4.setScannedID("Room hi! | hi! - hi! | Capacity: 0 - hi!");
        boolean boolean16 = room4.isOccupied();
        java.lang.Class<?> wildcardClass17 = room4.getClass();
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str11, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test01516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01516");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        java.lang.String str5 = room4.getBuildingName();
        java.lang.String str6 = room4.getRoomID();
        room4.setUnderMaintenance(false);
        int int9 = room4.getCapacity();
        room.SensorObserver sensorObserver10 = null;
        room4.removeObserver(sensorObserver10);
        boolean boolean12 = room4.isOccupied();
        java.lang.String str13 = room4.getBuildingName();
        room.SensorObserver sensorObserver14 = null;
        room4.addObserver(sensorObserver14);
        // The following exception was thrown during execution in test generation
        try {
            room4.setOccupied(false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test01517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01517");
        room.Room room4 = new room.Room("hi!", (int) (byte) 100, "", "Room hi! | hi! - hi! | Capacity: 0");
        java.lang.String str5 = room4.getRoomNumber();
        boolean boolean6 = room4.isEnabled();
        java.lang.String str7 = room4.getRoomNumber();
        room.SensorObserver sensorObserver8 = null;
        room4.removeObserver(sensorObserver8);
        java.lang.Class<?> wildcardClass10 = room4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str5, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str7, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test01518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01518");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        room.SensorObserver sensorObserver5 = null;
        room4.addObserver(sensorObserver5);
        java.lang.String str7 = room4.getScannedID();
        room.SensorObserver sensorObserver8 = null;
        room4.removeObserver(sensorObserver8);
        java.lang.String str10 = room4.getRoomNumber();
        java.lang.String str11 = room4.toString();
        java.lang.String str12 = room4.getScannedID();
        room4.notifyObservers();
        room4.setUnderMaintenance(false);
        boolean boolean16 = room4.isEnabled();
        java.lang.String str17 = room4.toString();
        room.SensorObserver sensorObserver18 = null;
        room4.removeObserver(sensorObserver18);
        java.lang.String str20 = room4.getRoomID();
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str11, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str17, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test01519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01519");
        room.Room room4 = new room.Room("Room  - Room hi! | hi! - hi! | Capacity: 0 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 0", (-1), "Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100", "Room hi! | Room hi! | hi! - hi! | Capacity: 0 - hi! - Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 1");
        java.lang.String str5 = room4.getScannedID();
        java.lang.String str6 = room4.getRoomNumber();
        java.lang.Class<?> wildcardClass7 = room4.getClass();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Room hi! | Room hi! | hi! - hi! | Capacity: 0 - hi! - Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 1" + "'", str6, "Room hi! | Room hi! | hi! - hi! | Capacity: 0 - hi! - Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 1");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test01520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01520");
        room.Room room4 = new room.Room("Room hi! | hi! - hi! | Capacity: 0", (int) (byte) 10, "hi!", "");
        room4.setUnderMaintenance(true);
        java.lang.String str7 = room4.toString();
        room.SensorObserver sensorObserver8 = null;
        room4.addObserver(sensorObserver8);
        // The following exception was thrown during execution in test generation
        try {
            room4.setScannedID(" - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10" + "'", str7, "Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10");
    }

    @Test
    public void test01521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01521");
        room.Room room4 = new room.Room("", (int) (short) 10, "Room hi! | hi! - hi! | Capacity: 0", "hi!");
        java.lang.String str5 = room4.toString();
        room.SensorObserver sensorObserver6 = null;
        room4.addObserver(sensorObserver6);
        // The following exception was thrown during execution in test generation
        try {
            room4.setUnderMaintenance(false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10" + "'", str5, "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10");
    }

    @Test
    public void test01522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01522");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        room.SensorObserver sensorObserver5 = null;
        room4.addObserver(sensorObserver5);
        java.lang.String str7 = room4.toString();
        java.lang.String str8 = room4.toString();
        java.lang.String str9 = room4.getBuildingName();
        boolean boolean10 = room4.isUnderMaintenance();
        java.lang.String str11 = room4.getRoomID();
        room.SensorObserver sensorObserver12 = null;
        room4.removeObserver(sensorObserver12);
        boolean boolean14 = room4.isUnderMaintenance();
        int int15 = room4.getCapacity();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str7, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str8, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test01523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01523");
        room.Room room4 = new room.Room("hi!", (int) (byte) 1, "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10", "hi!");
        room4.notifyObservers();
        room4.setOccupied(false);
        room4.notifyObservers();
        room4.setEnabled(true);
        java.lang.String str11 = room4.toString();
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Room hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 1" + "'", str11, "Room hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 1");
    }

    @Test
    public void test01524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01524");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        java.lang.String str5 = room4.getScannedID();
        room4.setScannedID("hi!");
        boolean boolean8 = room4.isEnabled();
        int int9 = room4.getCapacity();
        int int10 = room4.getCapacity();
        java.lang.String str11 = room4.getFullLocation();
        java.lang.String str12 = room4.getFullLocation();
        java.lang.String str13 = room4.toString();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi! - hi!" + "'", str11, "hi! - hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi! - hi!" + "'", str12, "hi! - hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str13, "Room hi! | hi! - hi! | Capacity: 0");
    }

    @Test
    public void test01525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01525");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        java.lang.String str5 = room4.getScannedID();
        room4.setScannedID("hi!");
        java.lang.String str8 = room4.getRoomNumber();
        java.lang.String str9 = room4.getScannedID();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test01526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01526");
        room.Room room4 = new room.Room("", (int) (byte) 1, "Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10", "hi!");
        java.lang.String str5 = room4.getFullLocation();
        room4.setScannedID("Room hi! | hi! - hi! | Capacity: 0");
        room.SensorObserver sensorObserver8 = null;
        room4.addObserver(sensorObserver8);
        int int10 = room4.getCapacity();
        // The following exception was thrown during execution in test generation
        try {
            room4.setUnderMaintenance(false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi!" + "'", str5, "Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test01527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01527");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        room.SensorObserver sensorObserver5 = null;
        room4.addObserver(sensorObserver5);
        java.lang.String str7 = room4.getScannedID();
        room.SensorObserver sensorObserver8 = null;
        room4.removeObserver(sensorObserver8);
        room.SensorObserver sensorObserver10 = null;
        room4.addObserver(sensorObserver10);
        java.lang.String str12 = room4.getFullLocation();
        boolean boolean13 = room4.isEnabled();
        boolean boolean14 = room4.isEnabled();
        int int15 = room4.getCapacity();
        java.lang.String str16 = room4.toString();
        java.lang.String str17 = room4.getRoomNumber();
        // The following exception was thrown during execution in test generation
        try {
            room4.setScannedID("Room hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 1 - Room hi! | hi! - hi! - Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | Capacity: 0");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi! - hi!" + "'", str12, "hi! - hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str16, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test01528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01528");
        room.Room room4 = new room.Room("hi!", (int) (byte) 100, "", "Room hi! | hi! - hi! | Capacity: 0");
        room4.setScannedID("");
        boolean boolean7 = room4.isUnderMaintenance();
        java.lang.String str8 = room4.getScannedID();
        java.lang.Class<?> wildcardClass9 = room4.getClass();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test01529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01529");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        boolean boolean5 = room4.isOccupied();
        java.lang.String str6 = room4.toString();
        boolean boolean7 = room4.isOccupied();
        room4.setEnabled(true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str6, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test01530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01530");
        room.Room room4 = new room.Room("Room hi! | hi! - hi! | Capacity: 0", 32, "hi! - hi!", "hi! - hi!");
        room4.setEnabled(false);
        java.lang.String str7 = room4.getScannedID();
        java.lang.Class<?> wildcardClass8 = room4.getClass();
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test01531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01531");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        room.SensorObserver sensorObserver5 = null;
        room4.addObserver(sensorObserver5);
        java.lang.String str7 = room4.getScannedID();
        room.SensorObserver sensorObserver8 = null;
        room4.removeObserver(sensorObserver8);
        java.lang.String str10 = room4.getRoomNumber();
        java.lang.String str11 = room4.toString();
        java.lang.String str12 = room4.getScannedID();
        room4.notifyObservers();
        room4.setUnderMaintenance(false);
        room4.setOccupied(true);
        boolean boolean18 = room4.isEnabled();
        room.SensorObserver sensorObserver19 = null;
        room4.addObserver(sensorObserver19);
        java.lang.String str21 = room4.getFullLocation();
        // The following exception was thrown during execution in test generation
        try {
            room4.setUnderMaintenance(true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str11, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi! - hi!" + "'", str21, "hi! - hi!");
    }

    @Test
    public void test01532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01532");
        room.Room room4 = new room.Room("Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 97 - Room  - Room hi! | hi! - hi! | Capacity: 0 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 0", (int) '4', "Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10", "");
        java.lang.String str5 = room4.getScannedID();
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test01533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01533");
        room.Room room4 = new room.Room("hi!", (int) (byte) 100, "", "Room hi! | hi! - hi! | Capacity: 0");
        room4.setScannedID("");
        boolean boolean7 = room4.isOccupied();
        room.SensorObserver sensorObserver8 = null;
        room4.removeObserver(sensorObserver8);
        boolean boolean10 = room4.isOccupied();
        java.lang.String str11 = room4.getScannedID();
        java.lang.String str12 = room4.getScannedID();
        room.SensorObserver sensorObserver13 = null;
        room4.removeObserver(sensorObserver13);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test01534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01534");
        room.Room room4 = new room.Room("hi! - hi! - hi!", 1, "hi! - hi!", "Room hi! | hi! - hi! | Capacity: 0");
        java.lang.String str5 = room4.getFullLocation();
        java.lang.Class<?> wildcardClass6 = room4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi! - hi! - Room hi! | hi! - hi! | Capacity: 0" + "'", str5, "hi! - hi! - Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test01535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01535");
        room.Room room4 = new room.Room("Room hi! | hi! - hi! | Capacity: 0", (int) (byte) 10, "hi!", "");
        room4.setUnderMaintenance(true);
        int int7 = room4.getCapacity();
        java.lang.String str8 = room4.getRoomNumber();
        java.lang.String str9 = room4.getScannedID();
        java.lang.String str10 = room4.getRoomID();
        java.lang.String str11 = room4.toString();
        boolean boolean12 = room4.isUnderMaintenance();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str10, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10" + "'", str11, "Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test01536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01536");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        java.lang.String str5 = room4.getScannedID();
        room4.setScannedID("hi!");
        java.lang.String str8 = room4.getBuildingName();
        java.lang.String str9 = room4.getScannedID();
        boolean boolean10 = room4.isOccupied();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test01537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01537");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        boolean boolean5 = room4.isOccupied();
        room4.setEnabled(false);
        java.lang.String str8 = room4.toString();
        room4.setOccupied(true);
        boolean boolean11 = room4.isOccupied();
        java.lang.String str12 = room4.getRoomID();
        java.lang.String str13 = room4.getRoomNumber();
        java.lang.String str14 = room4.getScannedID();
        room.SensorObserver sensorObserver15 = null;
        room4.removeObserver(sensorObserver15);
        java.lang.String str17 = room4.getBuildingName();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str8, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test01538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01538");
        room.Room room4 = new room.Room(" - Room hi! | hi! - hi! | Capacity: 0", 32, "Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 97", "hi!");
        room4.setEnabled(false);
    }

    @Test
    public void test01539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01539");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        java.lang.String str5 = room4.getScannedID();
        room4.setScannedID("hi!");
        java.lang.String str8 = room4.getBuildingName();
        room4.setEnabled(false);
        java.lang.String str11 = room4.toString();
        java.lang.String str12 = room4.getRoomNumber();
        java.lang.Class<?> wildcardClass13 = room4.getClass();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str11, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test01540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01540");
        room.Room room4 = new room.Room("hi!", (int) (byte) 1, "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10", "hi!");
        room4.notifyObservers();
        room4.setOccupied(false);
        room4.setUnderMaintenance(true);
        room4.setEnabled(true);
        room.SensorObserver sensorObserver12 = null;
        room4.addObserver(sensorObserver12);
        // The following exception was thrown during execution in test generation
        try {
            room4.setUnderMaintenance(true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01541");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        room.SensorObserver sensorObserver5 = null;
        room4.addObserver(sensorObserver5);
        java.lang.String str7 = room4.getScannedID();
        java.lang.String str8 = room4.getFullLocation();
        boolean boolean9 = room4.isOccupied();
        boolean boolean10 = room4.isOccupied();
        java.lang.String str11 = room4.getFullLocation();
        boolean boolean12 = room4.isUnderMaintenance();
        java.lang.String str13 = room4.getBuildingName();
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi! - hi!" + "'", str8, "hi! - hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi! - hi!" + "'", str11, "hi! - hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test01542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01542");
        room.Room room4 = new room.Room("", (int) (short) 0, "hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10", "Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10");
        java.lang.Class<?> wildcardClass5 = room4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test01543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01543");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        room.SensorObserver sensorObserver5 = null;
        room4.addObserver(sensorObserver5);
        java.lang.String str7 = room4.getScannedID();
        room.SensorObserver sensorObserver8 = null;
        room4.removeObserver(sensorObserver8);
        java.lang.String str10 = room4.getRoomNumber();
        java.lang.String str11 = room4.toString();
        room4.setScannedID("Room hi! | hi! - hi! | Capacity: 0");
        room.SensorObserver sensorObserver14 = null;
        room4.removeObserver(sensorObserver14);
        java.lang.String str16 = room4.toString();
        java.lang.String str17 = room4.getBuildingName();
        boolean boolean18 = room4.isEnabled();
        java.lang.Class<?> wildcardClass19 = room4.getClass();
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str11, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str16, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test01544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01544");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        room.SensorObserver sensorObserver5 = null;
        room4.addObserver(sensorObserver5);
        java.lang.String str7 = room4.toString();
        java.lang.String str8 = room4.toString();
        java.lang.String str9 = room4.getBuildingName();
        boolean boolean10 = room4.isUnderMaintenance();
        java.lang.String str11 = room4.getRoomNumber();
        room.SensorObserver sensorObserver12 = null;
        room4.removeObserver(sensorObserver12);
        java.lang.String str14 = room4.getRoomID();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str7, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str8, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test01545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01545");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        room.SensorObserver sensorObserver5 = null;
        room4.addObserver(sensorObserver5);
        java.lang.String str7 = room4.toString();
        room.SensorObserver sensorObserver8 = null;
        room4.removeObserver(sensorObserver8);
        java.lang.String str10 = room4.toString();
        java.lang.String str11 = room4.getBuildingName();
        room4.setUnderMaintenance(false);
        boolean boolean14 = room4.isUnderMaintenance();
        room4.setEnabled(true);
        boolean boolean17 = room4.isUnderMaintenance();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str7, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str10, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test01546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01546");
        room.Room room4 = new room.Room("Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 97", (int) (byte) 100, "Room hi! | hi! - hi! | Capacity: 0 - hi! - ", "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10");
        java.lang.String str5 = room4.toString();
        room4.setScannedID("Room hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 1");
        java.lang.Class<?> wildcardClass8 = room4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Room Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 97 | Room hi! | hi! - hi! | Capacity: 0 - hi! -  - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 | Capacity: 100" + "'", str5, "Room Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 97 | Room hi! | hi! - hi! | Capacity: 0 - hi! -  - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 | Capacity: 100");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test01547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01547");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        boolean boolean5 = room4.isOccupied();
        room4.setEnabled(false);
        java.lang.String str8 = room4.getRoomID();
        room4.notifyObservers();
        room4.setUnderMaintenance(false);
        java.lang.String str12 = room4.getRoomID();
        java.lang.String str13 = room4.getRoomNumber();
        boolean boolean14 = room4.isEnabled();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test01548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01548");
        room.Room room4 = new room.Room("hi!", (int) (byte) 100, "", "Room hi! | hi! - hi! | Capacity: 0");
        java.lang.String str5 = room4.getScannedID();
        java.lang.String str6 = room4.getBuildingName();
        room4.setUnderMaintenance(false);
        java.lang.String str9 = room4.getScannedID();
        java.lang.String str10 = room4.toString();
        java.lang.Class<?> wildcardClass11 = room4.getClass();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100" + "'", str10, "Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test01549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01549");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        java.lang.String str5 = room4.getScannedID();
        room4.setScannedID("hi!");
        java.lang.String str8 = room4.getBuildingName();
        int int9 = room4.getCapacity();
        room.SensorObserver sensorObserver10 = null;
        room4.addObserver(sensorObserver10);
        java.lang.String str12 = room4.getRoomNumber();
        // The following exception was thrown during execution in test generation
        try {
            room4.setEnabled(false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test01550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01550");
        room.Room room4 = new room.Room("hi!", (int) (byte) 100, "", "Room hi! | hi! - hi! | Capacity: 0");
        java.lang.String str5 = room4.getScannedID();
        room4.setOccupied(false);
        room4.setUnderMaintenance(true);
        int int10 = room4.getCapacity();
        java.lang.Class<?> wildcardClass11 = room4.getClass();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test01551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01551");
        room.Room room4 = new room.Room("hi!", (int) (byte) 100, "", "Room hi! | hi! - hi! | Capacity: 0");
        java.lang.String str5 = room4.getBuildingName();
        java.lang.String str6 = room4.toString();
        java.lang.String str7 = room4.getRoomNumber();
        java.lang.String str8 = room4.getRoomNumber();
        java.lang.String str9 = room4.getRoomNumber();
        java.lang.String str10 = room4.getBuildingName();
        java.lang.Class<?> wildcardClass11 = room4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100" + "'", str6, "Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str7, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str8, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str9, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test01552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01552");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        room.SensorObserver sensorObserver5 = null;
        room4.addObserver(sensorObserver5);
        java.lang.String str7 = room4.getScannedID();
        java.lang.String str8 = room4.getRoomNumber();
        java.lang.String str9 = room4.getRoomNumber();
        room.SensorObserver sensorObserver10 = null;
        room4.removeObserver(sensorObserver10);
        room4.setEnabled(false);
        java.lang.String str14 = room4.getRoomNumber();
        room4.setUnderMaintenance(true);
        room4.setUnderMaintenance(false);
        java.lang.String str19 = room4.getRoomNumber();
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test01553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01553");
        room.Room room4 = new room.Room("Room hi! | hi! - hi! | Capacity: 0", (int) (byte) 10, "hi!", "");
        int int5 = room4.getCapacity();
        room4.setOccupied(false);
        room4.setOccupied(false);
        java.lang.String str10 = room4.toString();
        int int11 = room4.getCapacity();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10" + "'", str10, "Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
    }

    @Test
    public void test01554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01554");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        room.SensorObserver sensorObserver5 = null;
        room4.addObserver(sensorObserver5);
        java.lang.String str7 = room4.getScannedID();
        java.lang.String str8 = room4.getFullLocation();
        boolean boolean9 = room4.isOccupied();
        boolean boolean10 = room4.isOccupied();
        room.SensorObserver sensorObserver11 = null;
        room4.removeObserver(sensorObserver11);
        room.SensorObserver sensorObserver13 = null;
        room4.removeObserver(sensorObserver13);
        room4.setEnabled(true);
        java.lang.Class<?> wildcardClass17 = room4.getClass();
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi! - hi!" + "'", str8, "hi! - hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test01555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01555");
        room.Room room4 = new room.Room("Room hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 1", (int) (short) 1, "hi! - hi! - hi!", "Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 97");
    }

    @Test
    public void test01556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01556");
        room.Room room4 = new room.Room("Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 100 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 -  - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! | Capacity: 0", (int) (short) 10, "hi! -  - Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 1", "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room hi! | hi! - hi! | Capacity: 0");
        java.lang.Class<?> wildcardClass5 = room4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test01557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01557");
        room.Room room4 = new room.Room("hi!", (int) (byte) 100, "", "Room hi! | hi! - hi! | Capacity: 0");
        java.lang.String str5 = room4.getScannedID();
        java.lang.String str6 = room4.getBuildingName();
        room4.setUnderMaintenance(false);
        java.lang.String str9 = room4.getScannedID();
        room4.setUnderMaintenance(true);
        java.lang.String str12 = room4.getBuildingName();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test01558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01558");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        room.SensorObserver sensorObserver5 = null;
        room4.addObserver(sensorObserver5);
        room.SensorObserver sensorObserver7 = null;
        room4.addObserver(sensorObserver7);
        boolean boolean9 = room4.isUnderMaintenance();
        boolean boolean10 = room4.isEnabled();
        boolean boolean11 = room4.isOccupied();
        boolean boolean12 = room4.isUnderMaintenance();
        // The following exception was thrown during execution in test generation
        try {
            room4.setEnabled(true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test01559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01559");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        room.SensorObserver sensorObserver5 = null;
        room4.addObserver(sensorObserver5);
        java.lang.String str7 = room4.getScannedID();
        room.SensorObserver sensorObserver8 = null;
        room4.removeObserver(sensorObserver8);
        java.lang.String str10 = room4.getRoomNumber();
        java.lang.String str11 = room4.toString();
        java.lang.String str12 = room4.getScannedID();
        room4.notifyObservers();
        room4.setUnderMaintenance(false);
        room4.setOccupied(true);
        java.lang.String str18 = room4.getRoomNumber();
        boolean boolean19 = room4.isOccupied();
        room4.setEnabled(true);
        room4.setScannedID("Room hi! | hi! - hi! | Capacity: 0 - hi! - hi!");
        java.lang.Class<?> wildcardClass24 = room4.getClass();
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str11, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test01560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01560");
        room.Room room4 = new room.Room("hi! - hi! - hi!", 1, "hi! - hi!", "Room hi! | hi! - hi! | Capacity: 0");
        room.SensorObserver sensorObserver5 = null;
        room4.addObserver(sensorObserver5);
        java.lang.String str7 = room4.toString();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Room hi! - hi! - hi! | hi! - hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 1" + "'", str7, "Room hi! - hi! - hi! | hi! - hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 1");
    }

    @Test
    public void test01561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01561");
        room.Room room4 = new room.Room("Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100", 0, "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi!", "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10");
        java.lang.String str5 = room4.getBuildingName();
        boolean boolean6 = room4.isEnabled();
        room4.setEnabled(false);
        boolean boolean9 = room4.isOccupied();
        room4.setOccupied(false);
        boolean boolean12 = room4.isUnderMaintenance();
        room4.notifyObservers();
        int int14 = room4.getCapacity();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi!" + "'", str5, "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test01562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01562");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        java.lang.String str5 = room4.getScannedID();
        room4.setScannedID("hi!");
        room4.setScannedID("hi! - hi!");
        room4.setOccupied(true);
        room.SensorObserver sensorObserver12 = null;
        room4.removeObserver(sensorObserver12);
        room.SensorObserver sensorObserver14 = null;
        room4.addObserver(sensorObserver14);
        // The following exception was thrown during execution in test generation
        try {
            room4.notifyObservers();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test01563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01563");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        room.SensorObserver sensorObserver5 = null;
        room4.addObserver(sensorObserver5);
        java.lang.String str7 = room4.getScannedID();
        room.SensorObserver sensorObserver8 = null;
        room4.removeObserver(sensorObserver8);
        java.lang.String str10 = room4.getRoomNumber();
        java.lang.String str11 = room4.toString();
        java.lang.String str12 = room4.getScannedID();
        room4.notifyObservers();
        room4.setScannedID("Room hi! | hi! - hi! | Capacity: 0 - hi!");
        int int16 = room4.getCapacity();
        room4.setEnabled(false);
        int int19 = room4.getCapacity();
        room4.setScannedID("Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | hi! -  - Room  - Room hi! | hi! - hi! | Capacity: 0 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 0 | Capacity: 10");
        room4.notifyObservers();
        room4.setEnabled(false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str11, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test01564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01564");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        room.SensorObserver sensorObserver5 = null;
        room4.addObserver(sensorObserver5);
        room.SensorObserver sensorObserver7 = null;
        room4.addObserver(sensorObserver7);
        boolean boolean9 = room4.isUnderMaintenance();
        java.lang.String str10 = room4.getScannedID();
        java.lang.String str11 = room4.getBuildingName();
        java.lang.String str12 = room4.getFullLocation();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi! - hi!" + "'", str12, "hi! - hi!");
    }

    @Test
    public void test01565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01565");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        room.SensorObserver sensorObserver5 = null;
        room4.addObserver(sensorObserver5);
        java.lang.String str7 = room4.toString();
        room.SensorObserver sensorObserver8 = null;
        room4.removeObserver(sensorObserver8);
        int int10 = room4.getCapacity();
        java.lang.String str11 = room4.getBuildingName();
        room4.setEnabled(true);
        boolean boolean14 = room4.isEnabled();
        room4.setOccupied(false);
        java.lang.String str17 = room4.getRoomID();
        java.lang.String str18 = room4.getFullLocation();
        java.lang.String str19 = room4.getScannedID();
        room.SensorObserver sensorObserver20 = null;
        room4.removeObserver(sensorObserver20);
        room4.setScannedID("Room hi! | hi! - hi! | Capacity: 0 - hi! - hi!");
        room.SensorObserver sensorObserver24 = null;
        room4.removeObserver(sensorObserver24);
        room.SensorObserver sensorObserver26 = null;
        room4.addObserver(sensorObserver26);
        // The following exception was thrown during execution in test generation
        try {
            room4.setUnderMaintenance(true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str7, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi! - hi!" + "'", str18, "hi! - hi!");
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test01566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01566");
        room.Room room4 = new room.Room("Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 100 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 -  - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! | Capacity: 0", (int) (byte) 0, "hi! - hi! - hi! - hi!", "Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10");
        java.lang.String str5 = room4.toString();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Room Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 100 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 -  - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! | Capacity: 0 | hi! - hi! - hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 | Capacity: 0" + "'", str5, "Room Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 100 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 -  - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! | Capacity: 0 | hi! - hi! - hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 | Capacity: 0");
    }

    @Test
    public void test01567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01567");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        room.SensorObserver sensorObserver5 = null;
        room4.addObserver(sensorObserver5);
        java.lang.String str7 = room4.getFullLocation();
        boolean boolean8 = room4.isUnderMaintenance();
        java.lang.String str9 = room4.getRoomID();
        java.lang.String str10 = room4.getBuildingName();
        java.lang.String str11 = room4.getRoomID();
        java.lang.String str12 = room4.toString();
        java.lang.String str13 = room4.getRoomID();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi! - hi!" + "'", str7, "hi! - hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str12, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test01568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01568");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        java.lang.String str5 = room4.getScannedID();
        room4.setScannedID("hi!");
        boolean boolean8 = room4.isEnabled();
        room4.setEnabled(false);
        room4.setEnabled(true);
        java.lang.String str13 = room4.getBuildingName();
        room.SensorObserver sensorObserver14 = null;
        room4.addObserver(sensorObserver14);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test01569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01569");
        room.Room room4 = new room.Room("hi!", (int) (byte) 100, "", "Room hi! | hi! - hi! | Capacity: 0");
        java.lang.String str5 = room4.toString();
        java.lang.String str6 = room4.getFullLocation();
        room.SensorObserver sensorObserver7 = null;
        room4.removeObserver(sensorObserver7);
        room.SensorObserver sensorObserver9 = null;
        room4.addObserver(sensorObserver9);
        java.lang.String str11 = room4.getBuildingName();
        java.lang.String str12 = room4.getScannedID();
        boolean boolean13 = room4.isOccupied();
        boolean boolean14 = room4.isOccupied();
        java.lang.String str15 = room4.getRoomNumber();
        java.lang.String str16 = room4.getRoomID();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100" + "'", str5, "Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + " - Room hi! | hi! - hi! | Capacity: 0" + "'", str6, " - Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str15, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test01570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01570");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        java.lang.String str5 = room4.toString();
        java.lang.String str6 = room4.getScannedID();
        java.lang.String str7 = room4.getScannedID();
        room4.setUnderMaintenance(false);
        boolean boolean10 = room4.isOccupied();
        boolean boolean11 = room4.isEnabled();
        boolean boolean12 = room4.isEnabled();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str5, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test01571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01571");
        room.Room room4 = new room.Room("Room hi! | hi! - hi! - Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | Capacity: 0", 0, "Room hi! | hi! - hi! - Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | Capacity: 0 -  - hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10", " - Room hi! | hi! - hi! | Capacity: 0");
    }

    @Test
    public void test01572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01572");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        boolean boolean5 = room4.isOccupied();
        room4.setEnabled(false);
        java.lang.String str8 = room4.toString();
        room4.setUnderMaintenance(true);
        room4.setEnabled(true);
        room4.setScannedID("Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10");
        room4.notifyObservers();
        room.SensorObserver sensorObserver16 = null;
        room4.addObserver(sensorObserver16);
        // The following exception was thrown during execution in test generation
        try {
            room4.setScannedID("Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str8, "Room hi! | hi! - hi! | Capacity: 0");
    }

    @Test
    public void test01573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01573");
        room.Room room4 = new room.Room("", (int) (short) 10, "Room hi! | hi! - hi! | Capacity: 0", "hi!");
        java.lang.String str5 = room4.toString();
        boolean boolean6 = room4.isUnderMaintenance();
        java.lang.String str7 = room4.getRoomID();
        boolean boolean8 = room4.isEnabled();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10" + "'", str5, "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test01574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01574");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        java.lang.String str5 = room4.getScannedID();
        room4.setScannedID("hi!");
        java.lang.String str8 = room4.getBuildingName();
        room4.setEnabled(false);
        room.SensorObserver sensorObserver11 = null;
        room4.addObserver(sensorObserver11);
        java.lang.String str13 = room4.getBuildingName();
        // The following exception was thrown during execution in test generation
        try {
            room4.setEnabled(false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test01575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01575");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        room.SensorObserver sensorObserver5 = null;
        room4.addObserver(sensorObserver5);
        java.lang.String str7 = room4.getFullLocation();
        boolean boolean8 = room4.isUnderMaintenance();
        java.lang.String str9 = room4.getRoomID();
        boolean boolean10 = room4.isOccupied();
        room.SensorObserver sensorObserver11 = null;
        room4.removeObserver(sensorObserver11);
        boolean boolean13 = room4.isEnabled();
        room4.notifyObservers();
        java.lang.String str15 = room4.getRoomNumber();
        java.lang.String str16 = room4.getFullLocation();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi! - hi!" + "'", str7, "hi! - hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi! - hi!" + "'", str16, "hi! - hi!");
    }

    @Test
    public void test01576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01576");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        room.SensorObserver sensorObserver5 = null;
        room4.addObserver(sensorObserver5);
        java.lang.String str7 = room4.getScannedID();
        room.SensorObserver sensorObserver8 = null;
        room4.removeObserver(sensorObserver8);
        java.lang.String str10 = room4.getRoomNumber();
        java.lang.String str11 = room4.toString();
        java.lang.String str12 = room4.getScannedID();
        java.lang.String str13 = room4.getBuildingName();
        boolean boolean14 = room4.isUnderMaintenance();
        java.lang.String str15 = room4.getRoomNumber();
        room4.notifyObservers();
        room.SensorObserver sensorObserver17 = null;
        room4.addObserver(sensorObserver17);
        // The following exception was thrown during execution in test generation
        try {
            room4.setScannedID("Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 1");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str11, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test01577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01577");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        room.SensorObserver sensorObserver5 = null;
        room4.addObserver(sensorObserver5);
        java.lang.String str7 = room4.getScannedID();
        room.SensorObserver sensorObserver8 = null;
        room4.removeObserver(sensorObserver8);
        java.lang.String str10 = room4.getRoomNumber();
        java.lang.String str11 = room4.toString();
        java.lang.String str12 = room4.getScannedID();
        room4.notifyObservers();
        java.lang.String str14 = room4.getScannedID();
        java.lang.String str15 = room4.getScannedID();
        room4.setOccupied(true);
        room4.setUnderMaintenance(true);
        boolean boolean20 = room4.isOccupied();
        java.lang.Class<?> wildcardClass21 = room4.getClass();
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str11, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test01578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01578");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        room.SensorObserver sensorObserver5 = null;
        room4.addObserver(sensorObserver5);
        java.lang.String str7 = room4.getFullLocation();
        boolean boolean8 = room4.isEnabled();
        boolean boolean9 = room4.isOccupied();
        java.lang.String str10 = room4.getFullLocation();
        int int11 = room4.getCapacity();
        room.SensorObserver sensorObserver12 = null;
        room4.addObserver(sensorObserver12);
        java.lang.Class<?> wildcardClass14 = room4.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi! - hi!" + "'", str7, "hi! - hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi! - hi!" + "'", str10, "hi! - hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test01579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01579");
        room.Room room4 = new room.Room("", (int) (short) 10, "Room hi! | hi! - hi! | Capacity: 0", "hi!");
        java.lang.String str5 = room4.toString();
        boolean boolean6 = room4.isEnabled();
        java.lang.String str7 = room4.getFullLocation();
        room.SensorObserver sensorObserver8 = null;
        room4.addObserver(sensorObserver8);
        // The following exception was thrown during execution in test generation
        try {
            room4.setEnabled(true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10" + "'", str5, "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0 - hi!" + "'", str7, "Room hi! | hi! - hi! | Capacity: 0 - hi!");
    }

    @Test
    public void test01580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01580");
        room.Room room4 = new room.Room("hi!", (int) (byte) 100, "", "Room hi! | hi! - hi! | Capacity: 0");
        room4.notifyObservers();
        room.SensorObserver sensorObserver6 = null;
        room4.removeObserver(sensorObserver6);
        java.lang.String str8 = room4.getRoomNumber();
        room.SensorObserver sensorObserver9 = null;
        room4.removeObserver(sensorObserver9);
        boolean boolean11 = room4.isUnderMaintenance();
        java.lang.Class<?> wildcardClass12 = room4.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str8, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test01581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01581");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        room.SensorObserver sensorObserver5 = null;
        room4.addObserver(sensorObserver5);
        java.lang.String str7 = room4.toString();
        room.SensorObserver sensorObserver8 = null;
        room4.removeObserver(sensorObserver8);
        int int10 = room4.getCapacity();
        java.lang.String str11 = room4.getRoomID();
        java.lang.String str12 = room4.getFullLocation();
        boolean boolean13 = room4.isUnderMaintenance();
        java.lang.String str14 = room4.getRoomNumber();
        room4.setUnderMaintenance(true);
        room4.setScannedID("Room  - Room hi! | hi! - hi! | Capacity: 0 |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 0");
        java.lang.String str19 = room4.toString();
        int int20 = room4.getCapacity();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str7, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi! - hi!" + "'", str12, "hi! - hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str19, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test01582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01582");
        room.Room room4 = new room.Room("Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10", 0, "hi!", "Room hi! | hi! - hi! | Capacity: 0");
        java.lang.String str5 = room4.getBuildingName();
        boolean boolean6 = room4.isEnabled();
        java.lang.String str7 = room4.getScannedID();
        java.lang.String str8 = room4.getRoomID();
        room4.setEnabled(false);
        java.lang.Class<?> wildcardClass11 = room4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10" + "'", str8, "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test01583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01583");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        java.lang.String str5 = room4.toString();
        room.SensorObserver sensorObserver6 = null;
        room4.addObserver(sensorObserver6);
        java.lang.String str8 = room4.getScannedID();
        boolean boolean9 = room4.isEnabled();
        java.lang.Class<?> wildcardClass10 = room4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str5, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test01584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01584");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        java.lang.String str5 = room4.getScannedID();
        room4.setScannedID("hi!");
        boolean boolean8 = room4.isEnabled();
        int int9 = room4.getCapacity();
        int int10 = room4.getCapacity();
        boolean boolean11 = room4.isOccupied();
        boolean boolean12 = room4.isUnderMaintenance();
        room4.setOccupied(true);
        java.lang.String str15 = room4.getFullLocation();
        boolean boolean16 = room4.isEnabled();
        boolean boolean17 = room4.isUnderMaintenance();
        boolean boolean18 = room4.isOccupied();
        boolean boolean19 = room4.isEnabled();
        boolean boolean20 = room4.isUnderMaintenance();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi! - hi!" + "'", str15, "hi! - hi!");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test01585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01585");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        boolean boolean5 = room4.isOccupied();
        room4.setEnabled(false);
        java.lang.String str8 = room4.toString();
        boolean boolean9 = room4.isEnabled();
        java.lang.String str10 = room4.getFullLocation();
        room.SensorObserver sensorObserver11 = null;
        room4.addObserver(sensorObserver11);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str8, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi! - hi!" + "'", str10, "hi! - hi!");
    }

    @Test
    public void test01586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01586");
        room.Room room4 = new room.Room("hi!", (int) (byte) 0, "hi!", "hi! - hi!");
        room4.setEnabled(true);
        java.lang.String str7 = room4.getRoomNumber();
        java.lang.Class<?> wildcardClass8 = room4.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi! - hi!" + "'", str7, "hi! - hi!");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test01587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01587");
        room.Room room4 = new room.Room("hi!", (int) (byte) 100, "", "Room hi! | hi! - hi! | Capacity: 0");
        java.lang.String str5 = room4.getRoomNumber();
        boolean boolean6 = room4.isEnabled();
        boolean boolean7 = room4.isEnabled();
        room.SensorObserver sensorObserver8 = null;
        room4.removeObserver(sensorObserver8);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str5, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test01588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01588");
        room.Room room4 = new room.Room("Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 -  - Room hi! | hi! - hi! | Capacity: 0", (int) '#', "Room hi! | hi! - hi! | Capacity: 0 - hi! - hi!", "Room Room hi! | hi! - hi! | Capacity: 0 |  - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 0");
        java.lang.Class<?> wildcardClass5 = room4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test01589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01589");
        room.Room room4 = new room.Room("Room  - Room hi! | hi! - hi! | Capacity: 0 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 0", (-1), "Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100", "Room hi! | Room hi! | hi! - hi! | Capacity: 0 - hi! - Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 1");
        java.lang.String str5 = room4.getScannedID();
        room.SensorObserver sensorObserver6 = null;
        room4.removeObserver(sensorObserver6);
        room4.notifyObservers();
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test01590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01590");
        room.Room room4 = new room.Room("Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 97 - Room  - Room hi! | hi! - hi! | Capacity: 0 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 0", (int) (byte) 100, "Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 | hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 0 - hi! - hi! - Room hi! | hi! - hi! | Capacity: 0", "Room Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! |  - Room hi! | hi! - hi! | Capacity: 0 - Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: -1");
    }

    @Test
    public void test01591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01591");
        room.Room room4 = new room.Room("", (int) (byte) 1, "Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10", "hi!");
        java.lang.String str5 = room4.getFullLocation();
        room4.setScannedID("Room hi! | hi! - hi! | Capacity: 0");
        room.SensorObserver sensorObserver8 = null;
        room4.addObserver(sensorObserver8);
        room.SensorObserver sensorObserver10 = null;
        room4.removeObserver(sensorObserver10);
        boolean boolean12 = room4.isUnderMaintenance();
        java.lang.String str13 = room4.getRoomID();
        java.lang.Class<?> wildcardClass14 = room4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi!" + "'", str5, "Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test01592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01592");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        room.SensorObserver sensorObserver5 = null;
        room4.addObserver(sensorObserver5);
        java.lang.String str7 = room4.toString();
        room.SensorObserver sensorObserver8 = null;
        room4.removeObserver(sensorObserver8);
        int int10 = room4.getCapacity();
        java.lang.String str11 = room4.getRoomID();
        java.lang.String str12 = room4.getFullLocation();
        boolean boolean13 = room4.isUnderMaintenance();
        room4.setEnabled(true);
        java.lang.String str16 = room4.getScannedID();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str7, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi! - hi!" + "'", str12, "hi! - hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test01593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01593");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        java.lang.String str5 = room4.getScannedID();
        room4.setScannedID("hi!");
        boolean boolean8 = room4.isEnabled();
        int int9 = room4.getCapacity();
        int int10 = room4.getCapacity();
        room4.setUnderMaintenance(true);
        java.lang.String str13 = room4.toString();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str13, "Room hi! | hi! - hi! | Capacity: 0");
    }

    @Test
    public void test01594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01594");
        room.Room room4 = new room.Room("Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi!", (int) (short) 0, "hi! - hi! - hi!", "Room hi! | hi! - hi! | Capacity: 0");
        room4.setOccupied(false);
        room.SensorObserver sensorObserver7 = null;
        room4.addObserver(sensorObserver7);
        java.lang.String str9 = room4.getScannedID();
        java.lang.String str10 = room4.toString();
        boolean boolean11 = room4.isOccupied();
        // The following exception was thrown during execution in test generation
        try {
            room4.setOccupied(true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | hi! - hi! - hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 0" + "'", str10, "Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | hi! - hi! - hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 0");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test01595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01595");
        room.Room room4 = new room.Room("hi!", (int) (byte) 100, "", "Room hi! | hi! - hi! | Capacity: 0");
        java.lang.String str5 = room4.getRoomNumber();
        boolean boolean6 = room4.isEnabled();
        java.lang.String str7 = room4.getRoomNumber();
        java.lang.String str8 = room4.getRoomID();
        boolean boolean9 = room4.isEnabled();
        java.lang.String str10 = room4.getRoomID();
        boolean boolean11 = room4.isEnabled();
        java.lang.Class<?> wildcardClass12 = room4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str5, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str7, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test01596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01596");
        room.Room room4 = new room.Room("Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100", (int) 'a', "hi! - hi!", "Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10");
        room.SensorObserver sensorObserver5 = null;
        room4.removeObserver(sensorObserver5);
        java.lang.String str7 = room4.getBuildingName();
        room4.notifyObservers();
        java.lang.String str9 = room4.getRoomID();
        room4.setScannedID("Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 1");
        java.lang.Class<?> wildcardClass12 = room4.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi! - hi!" + "'", str7, "hi! - hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100" + "'", str9, "Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test01597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01597");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        room.SensorObserver sensorObserver5 = null;
        room4.addObserver(sensorObserver5);
        java.lang.String str7 = room4.toString();
        room.SensorObserver sensorObserver8 = null;
        room4.removeObserver(sensorObserver8);
        int int10 = room4.getCapacity();
        java.lang.String str11 = room4.getBuildingName();
        room4.setEnabled(true);
        java.lang.String str14 = room4.toString();
        room4.setScannedID("Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 100 - Room hi! | hi! - hi! | Capacity: 0 - hi! - ");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str7, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str14, "Room hi! | hi! - hi! | Capacity: 0");
    }

    @Test
    public void test01598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01598");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        java.lang.String str5 = room4.getScannedID();
        room4.setScannedID("hi!");
        boolean boolean8 = room4.isEnabled();
        room4.setEnabled(false);
        room4.setOccupied(true);
        boolean boolean13 = room4.isEnabled();
        boolean boolean14 = room4.isUnderMaintenance();
        room4.setOccupied(true);
        room4.setEnabled(true);
        boolean boolean19 = room4.isOccupied();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test01599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01599");
        room.Room room4 = new room.Room("hi!", (int) (byte) 1, "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10", "hi!");
        room4.notifyObservers();
        room4.setUnderMaintenance(false);
        room.SensorObserver sensorObserver8 = null;
        room4.removeObserver(sensorObserver8);
        java.lang.String str10 = room4.toString();
        boolean boolean11 = room4.isUnderMaintenance();
        java.lang.String str12 = room4.toString();
        boolean boolean13 = room4.isOccupied();
        room4.notifyObservers();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Room hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 1" + "'", str10, "Room hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 1");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Room hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 1" + "'", str12, "Room hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 1");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test01600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01600");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        java.lang.String str5 = room4.getScannedID();
        room4.setScannedID("hi!");
        boolean boolean8 = room4.isEnabled();
        int int9 = room4.getCapacity();
        int int10 = room4.getCapacity();
        boolean boolean11 = room4.isOccupied();
        room4.setEnabled(false);
        room4.setEnabled(false);
        java.lang.String str16 = room4.toString();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str16, "Room hi! | hi! - hi! | Capacity: 0");
    }

    @Test
    public void test01601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01601");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        java.lang.String str5 = room4.getScannedID();
        room4.setScannedID("hi!");
        java.lang.String str8 = room4.getBuildingName();
        int int9 = room4.getCapacity();
        room.SensorObserver sensorObserver10 = null;
        room4.addObserver(sensorObserver10);
        java.lang.String str12 = room4.getScannedID();
        java.lang.String str13 = room4.getFullLocation();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi! - hi!" + "'", str13, "hi! - hi!");
    }

    @Test
    public void test01602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01602");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        java.lang.String str5 = room4.getScannedID();
        room4.setScannedID("hi!");
        java.lang.String str8 = room4.getRoomID();
        room4.setScannedID("hi! - hi!");
        int int11 = room4.getCapacity();
        room4.setEnabled(false);
        java.lang.String str14 = room4.getScannedID();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi! - hi!" + "'", str14, "hi! - hi!");
    }

    @Test
    public void test01603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01603");
        room.Room room4 = new room.Room("Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100", (int) (short) 1, "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi!", "Room hi! | hi! - hi! | Capacity: 0");
        room4.notifyObservers();
        room4.setEnabled(false);
        room4.setEnabled(true);
        boolean boolean10 = room4.isUnderMaintenance();
        room.SensorObserver sensorObserver11 = null;
        room4.addObserver(sensorObserver11);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test01604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01604");
        room.Room room4 = new room.Room("hi!", (int) (byte) 100, "", "Room hi! | hi! - hi! | Capacity: 0");
        java.lang.String str5 = room4.getScannedID();
        java.lang.String str6 = room4.getBuildingName();
        room4.setUnderMaintenance(false);
        room4.setScannedID("Room hi! | hi! - hi! | Capacity: 0 - hi! - ");
        room4.setScannedID("");
        room4.setOccupied(false);
        java.lang.String str15 = room4.getBuildingName();
        java.lang.String str16 = room4.getBuildingName();
        room4.setEnabled(true);
        room4.setOccupied(false);
        room4.setUnderMaintenance(false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test01605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01605");
        room.Room room4 = new room.Room("hi!", (int) (byte) 1, "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10", "hi!");
        java.lang.String str5 = room4.getRoomNumber();
        room4.setScannedID("hi!");
        java.lang.String str8 = room4.getRoomID();
        room4.setEnabled(true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test01606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01606");
        room.Room room4 = new room.Room("hi!", (int) (byte) 1, "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10", "hi!");
        java.lang.String str5 = room4.getBuildingName();
        java.lang.String str6 = room4.toString();
        room.SensorObserver sensorObserver7 = null;
        room4.removeObserver(sensorObserver7);
        boolean boolean9 = room4.isUnderMaintenance();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10" + "'", str5, "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Room hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 1" + "'", str6, "Room hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 1");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test01607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01607");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        room.SensorObserver sensorObserver5 = null;
        room4.addObserver(sensorObserver5);
        java.lang.String str7 = room4.getScannedID();
        room.SensorObserver sensorObserver8 = null;
        room4.removeObserver(sensorObserver8);
        room.SensorObserver sensorObserver10 = null;
        room4.addObserver(sensorObserver10);
        java.lang.String str12 = room4.getFullLocation();
        int int13 = room4.getCapacity();
        int int14 = room4.getCapacity();
        java.lang.String str15 = room4.getBuildingName();
        boolean boolean16 = room4.isOccupied();
        java.lang.Class<?> wildcardClass17 = room4.getClass();
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi! - hi!" + "'", str12, "hi! - hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test01608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01608");
        room.Room room4 = new room.Room("Room hi! | hi! - hi! | Capacity: 0 - hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 100 - Room hi! | hi! - hi! | Capacity: 0 - hi! - ", 1, "Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 100 | hi! - hi! - hi! - hi! | Capacity: 0", "Room Room hi! | hi! - hi! | Capacity: 0 | Room hi! | hi! - hi! | Capacity: 0 - hi! - hi! | Capacity: 100");
        boolean boolean5 = room4.isEnabled();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test01609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01609");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        room.SensorObserver sensorObserver5 = null;
        room4.addObserver(sensorObserver5);
        java.lang.String str7 = room4.getScannedID();
        int int8 = room4.getCapacity();
        java.lang.String str9 = room4.getRoomID();
        room.SensorObserver sensorObserver10 = null;
        room4.removeObserver(sensorObserver10);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test01610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01610");
        room.Room room4 = new room.Room("hi!", 1, "Room hi! | hi! - hi! | Capacity: 0 - hi!", "Room hi! | hi! - hi! | Capacity: 0 - hi!");
        int int5 = room4.getCapacity();
        java.lang.Class<?> wildcardClass6 = room4.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test01611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01611");
        room.Room room4 = new room.Room("hi!", (int) (byte) 100, "", "Room hi! | hi! - hi! | Capacity: 0");
        room4.notifyObservers();
        room.SensorObserver sensorObserver6 = null;
        room4.removeObserver(sensorObserver6);
        java.lang.String str8 = room4.toString();
        room4.setUnderMaintenance(true);
        java.lang.String str11 = room4.getBuildingName();
        java.lang.String str12 = room4.getFullLocation();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100" + "'", str8, "Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + " - Room hi! | hi! - hi! | Capacity: 0" + "'", str12, " - Room hi! | hi! - hi! | Capacity: 0");
    }

    @Test
    public void test01612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01612");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        room.SensorObserver sensorObserver5 = null;
        room4.addObserver(sensorObserver5);
        java.lang.String str7 = room4.getFullLocation();
        boolean boolean8 = room4.isEnabled();
        room.SensorObserver sensorObserver9 = null;
        room4.addObserver(sensorObserver9);
        room.SensorObserver sensorObserver11 = null;
        room4.addObserver(sensorObserver11);
        // The following exception was thrown during execution in test generation
        try {
            room4.notifyObservers();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi! - hi!" + "'", str7, "hi! - hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test01613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01613");
        room.Room room4 = new room.Room("Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100", 0, "hi! - hi!", "hi!");
        java.lang.String str5 = room4.getFullLocation();
        boolean boolean6 = room4.isUnderMaintenance();
        boolean boolean7 = room4.isOccupied();
        room4.setEnabled(false);
        room.SensorObserver sensorObserver10 = null;
        room4.addObserver(sensorObserver10);
        java.lang.Class<?> wildcardClass12 = room4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi! - hi! - hi!" + "'", str5, "hi! - hi! - hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test01614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01614");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        room.SensorObserver sensorObserver5 = null;
        room4.addObserver(sensorObserver5);
        java.lang.String str7 = room4.getScannedID();
        java.lang.String str8 = room4.getFullLocation();
        int int9 = room4.getCapacity();
        java.lang.String str10 = room4.getRoomID();
        room.SensorObserver sensorObserver11 = null;
        room4.addObserver(sensorObserver11);
        boolean boolean13 = room4.isOccupied();
        boolean boolean14 = room4.isUnderMaintenance();
        java.lang.String str15 = room4.getBuildingName();
        java.lang.String str16 = room4.getFullLocation();
        boolean boolean17 = room4.isUnderMaintenance();
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi! - hi!" + "'", str8, "hi! - hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi! - hi!" + "'", str16, "hi! - hi!");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test01615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01615");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        room.SensorObserver sensorObserver5 = null;
        room4.addObserver(sensorObserver5);
        java.lang.String str7 = room4.getScannedID();
        java.lang.String str8 = room4.getFullLocation();
        boolean boolean9 = room4.isOccupied();
        boolean boolean10 = room4.isOccupied();
        java.lang.String str11 = room4.getBuildingName();
        room.SensorObserver sensorObserver12 = null;
        room4.removeObserver(sensorObserver12);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi! - hi!" + "'", str8, "hi! - hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test01616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01616");
        room.Room room4 = new room.Room(" - Room hi! | hi! - hi! | Capacity: 0", 0, "", "Room hi! | hi! - hi! | Capacity: 0");
        room4.setScannedID("hi! - hi!");
        java.lang.String str7 = room4.getRoomID();
        room4.notifyObservers();
        boolean boolean9 = room4.isUnderMaintenance();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + " - Room hi! | hi! - hi! | Capacity: 0" + "'", str7, " - Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test01617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01617");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        room.SensorObserver sensorObserver5 = null;
        room4.addObserver(sensorObserver5);
        java.lang.String str7 = room4.getScannedID();
        java.lang.String str8 = room4.getScannedID();
        java.lang.String str9 = room4.toString();
        room.SensorObserver sensorObserver10 = null;
        room4.removeObserver(sensorObserver10);
        java.lang.String str12 = room4.getFullLocation();
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str9, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi! - hi!" + "'", str12, "hi! - hi!");
    }

    @Test
    public void test01618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01618");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        java.lang.String str5 = room4.getScannedID();
        room4.setScannedID("hi!");
        boolean boolean8 = room4.isEnabled();
        room4.setEnabled(false);
        room4.setScannedID("Room hi! | hi! - hi! | Capacity: 0 - hi! - ");
        room4.setOccupied(false);
        room4.notifyObservers();
        java.lang.String str16 = room4.getFullLocation();
        boolean boolean17 = room4.isEnabled();
        int int18 = room4.getCapacity();
        java.lang.String str19 = room4.toString();
        java.lang.Class<?> wildcardClass20 = room4.getClass();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi! - hi!" + "'", str16, "hi! - hi!");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str19, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test01619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01619");
        room.Room room4 = new room.Room("hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 100 - Room hi! | hi! - hi! | Capacity: 0 - hi! - ", 0, "Room  | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 100 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 1", "Room hi! | hi! - hi! | Capacity: 0 - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10");
    }

    @Test
    public void test01620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01620");
        room.Room room4 = new room.Room("hi! - hi! - Room hi! | hi! - hi! | Capacity: 0", 97, "Room Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! |  - Room hi! | hi! - hi! | Capacity: 0 - Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: -1", "Room Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! |  - Room hi! | hi! - hi! | Capacity: 0 - Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: -1");
        room.SensorObserver sensorObserver5 = null;
        room4.removeObserver(sensorObserver5);
    }

    @Test
    public void test01621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01621");
        room.Room room4 = new room.Room("hi!", (int) (byte) 100, "", "Room hi! | hi! - hi! | Capacity: 0");
        java.lang.String str5 = room4.getScannedID();
        java.lang.String str6 = room4.getBuildingName();
        room4.setUnderMaintenance(false);
        room4.setEnabled(false);
        room4.notifyObservers();
        room4.setUnderMaintenance(true);
        java.lang.String str14 = room4.getRoomID();
        room4.setScannedID("Room hi! | hi! - hi! | Capacity: 0");
        room.SensorObserver sensorObserver17 = null;
        room4.removeObserver(sensorObserver17);
        boolean boolean19 = room4.isUnderMaintenance();
        room4.notifyObservers();
        java.lang.String str21 = room4.getFullLocation();
        java.lang.String str22 = room4.toString();
        room4.setUnderMaintenance(true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + " - Room hi! | hi! - hi! | Capacity: 0" + "'", str21, " - Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100" + "'", str22, "Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100");
    }

    @Test
    public void test01622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01622");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        room.SensorObserver sensorObserver5 = null;
        room4.addObserver(sensorObserver5);
        java.lang.String str7 = room4.getScannedID();
        room.SensorObserver sensorObserver8 = null;
        room4.removeObserver(sensorObserver8);
        java.lang.String str10 = room4.getRoomNumber();
        java.lang.String str11 = room4.toString();
        java.lang.String str12 = room4.getScannedID();
        room4.notifyObservers();
        room4.setUnderMaintenance(false);
        boolean boolean16 = room4.isEnabled();
        java.lang.String str17 = room4.toString();
        java.lang.Class<?> wildcardClass18 = room4.getClass();
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str11, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str17, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test01623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01623");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        java.lang.String str5 = room4.getScannedID();
        room4.setScannedID("hi!");
        room4.setUnderMaintenance(true);
        room.SensorObserver sensorObserver10 = null;
        room4.removeObserver(sensorObserver10);
        boolean boolean12 = room4.isOccupied();
        int int13 = room4.getCapacity();
        java.lang.String str14 = room4.getBuildingName();
        java.lang.String str15 = room4.getFullLocation();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi! - hi!" + "'", str15, "hi! - hi!");
    }

    @Test
    public void test01624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01624");
        room.Room room4 = new room.Room("Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 97", (int) (byte) 0, "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10", "Room hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 1");
        room.SensorObserver sensorObserver5 = null;
        room4.addObserver(sensorObserver5);
        // The following exception was thrown during execution in test generation
        try {
            room4.setOccupied(false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01625");
        room.Room room4 = new room.Room("hi!", (int) (byte) 1, "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10", "hi!");
        room4.notifyObservers();
        room4.setUnderMaintenance(false);
        java.lang.String str8 = room4.getRoomID();
        boolean boolean9 = room4.isOccupied();
        boolean boolean10 = room4.isEnabled();
        boolean boolean11 = room4.isUnderMaintenance();
        room.SensorObserver sensorObserver12 = null;
        room4.removeObserver(sensorObserver12);
        boolean boolean14 = room4.isEnabled();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test01626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01626");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        java.lang.String str5 = room4.getScannedID();
        room4.setScannedID("hi!");
        room4.setUnderMaintenance(true);
        java.lang.String str10 = room4.getFullLocation();
        java.lang.String str11 = room4.getScannedID();
        room4.setEnabled(true);
        boolean boolean14 = room4.isUnderMaintenance();
        room4.setEnabled(true);
        room4.setOccupied(true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi! - hi!" + "'", str10, "hi! - hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test01627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01627");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        room.SensorObserver sensorObserver5 = null;
        room4.addObserver(sensorObserver5);
        java.lang.String str7 = room4.getScannedID();
        room.SensorObserver sensorObserver8 = null;
        room4.removeObserver(sensorObserver8);
        java.lang.String str10 = room4.getRoomNumber();
        java.lang.String str11 = room4.toString();
        java.lang.String str12 = room4.getScannedID();
        room4.notifyObservers();
        java.lang.String str14 = room4.getScannedID();
        java.lang.String str15 = room4.getScannedID();
        room4.setOccupied(true);
        room4.setEnabled(false);
        room4.setOccupied(false);
        room4.setScannedID("Room Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! |  - hi! -  | Capacity: 100");
        room4.setUnderMaintenance(false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str11, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test01628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01628");
        room.Room room4 = new room.Room("Room  - Room hi! | hi! - hi! | Capacity: 0 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 0", (int) (short) 0, "hi! - hi! - Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100", " - hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10");
        java.lang.String str5 = room4.getScannedID();
        java.lang.String str6 = room4.toString();
        room4.setOccupied(false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Room Room  - Room hi! | hi! - hi! | Capacity: 0 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 0 | hi! - hi! - Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 -  - hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 0" + "'", str6, "Room Room  - Room hi! | hi! - hi! | Capacity: 0 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 0 | hi! - hi! - Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 -  - hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 0");
    }

    @Test
    public void test01629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01629");
        room.Room room4 = new room.Room("Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 100", (int) (short) 100, "Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100", "Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi!");
        boolean boolean5 = room4.isUnderMaintenance();
        java.lang.String str6 = room4.getRoomID();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 100" + "'", str6, "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 100");
    }

    @Test
    public void test01630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01630");
        room.Room room4 = new room.Room("Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100", (int) (short) 1, "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi!", "Room hi! | hi! - hi! | Capacity: 0");
        int int5 = room4.getCapacity();
        java.lang.Class<?> wildcardClass6 = room4.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test01631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01631");
        room.Room room4 = new room.Room("", (int) (short) 10, "Room hi! | hi! - hi! | Capacity: 0", "hi!");
        java.lang.String str5 = room4.toString();
        java.lang.String str6 = room4.getBuildingName();
        room.SensorObserver sensorObserver7 = null;
        room4.removeObserver(sensorObserver7);
        boolean boolean9 = room4.isEnabled();
        java.lang.String str10 = room4.getRoomID();
        boolean boolean11 = room4.isUnderMaintenance();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10" + "'", str5, "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str6, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test01632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01632");
        room.Room room4 = new room.Room("Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10", 0, "hi!", "Room hi! | hi! - hi! | Capacity: 0");
        java.lang.String str5 = room4.getBuildingName();
        boolean boolean6 = room4.isEnabled();
        room.SensorObserver sensorObserver7 = null;
        room4.removeObserver(sensorObserver7);
        room.SensorObserver sensorObserver9 = null;
        room4.addObserver(sensorObserver9);
        java.lang.String str11 = room4.getRoomID();
        java.lang.String str12 = room4.getRoomNumber();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10" + "'", str11, "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str12, "Room hi! | hi! - hi! | Capacity: 0");
    }

    @Test
    public void test01633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01633");
        room.Room room4 = new room.Room("Room hi! | hi! - hi! | Capacity: 0", (int) 'a', "hi!", "hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10");
        java.lang.String str5 = room4.toString();
        room4.setOccupied(true);
        room.SensorObserver sensorObserver8 = null;
        room4.addObserver(sensorObserver8);
        java.lang.String str10 = room4.getScannedID();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Room Room hi! | hi! - hi! | Capacity: 0 | hi! - hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 97" + "'", str5, "Room Room hi! | hi! - hi! | Capacity: 0 | hi! - hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 97");
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test01634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01634");
        room.Room room4 = new room.Room("hi!", (int) (byte) 100, "", "Room hi! | hi! - hi! | Capacity: 0");
        java.lang.String str5 = room4.getScannedID();
        java.lang.String str6 = room4.getBuildingName();
        room4.setUnderMaintenance(false);
        room4.setScannedID("Room hi! | hi! - hi! | Capacity: 0 - hi! - ");
        boolean boolean11 = room4.isUnderMaintenance();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test01635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01635");
        room.Room room4 = new room.Room("Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi!", (int) (byte) 100, "", "Room hi! -  | Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 10 - hi! - hi! - Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100");
    }

    @Test
    public void test01636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01636");
        room.Room room4 = new room.Room("Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi!", 0, "Room  - Room hi! | hi! - hi! | Capacity: 0 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 0", "Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 97");
        room.SensorObserver sensorObserver5 = null;
        room4.addObserver(sensorObserver5);
    }

    @Test
    public void test01637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01637");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        room.SensorObserver sensorObserver5 = null;
        room4.addObserver(sensorObserver5);
        java.lang.String str7 = room4.toString();
        room.SensorObserver sensorObserver8 = null;
        room4.removeObserver(sensorObserver8);
        int int10 = room4.getCapacity();
        room.SensorObserver sensorObserver11 = null;
        room4.addObserver(sensorObserver11);
        int int13 = room4.getCapacity();
        boolean boolean14 = room4.isUnderMaintenance();
        boolean boolean15 = room4.isUnderMaintenance();
        java.lang.String str16 = room4.getRoomNumber();
        // The following exception was thrown during execution in test generation
        try {
            room4.notifyObservers();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str7, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test01638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01638");
        room.Room room4 = new room.Room("hi! - hi! - hi! - hi!", (int) 'a', " - hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10", "Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10");
    }

    @Test
    public void test01639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01639");
        room.Room room4 = new room.Room("hi!", (int) (byte) 100, "", "Room hi! | hi! - hi! | Capacity: 0");
        java.lang.String str5 = room4.getScannedID();
        java.lang.String str6 = room4.getBuildingName();
        room4.setUnderMaintenance(false);
        java.lang.String str9 = room4.getScannedID();
        room4.setScannedID("hi! - hi!");
        java.lang.Class<?> wildcardClass12 = room4.getClass();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test01640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01640");
        room.Room room4 = new room.Room("Room hi! | hi! - hi! | Capacity: 0", (int) 'a', "hi!", "hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10");
        java.lang.String str5 = room4.toString();
        room4.setOccupied(true);
        room.SensorObserver sensorObserver8 = null;
        room4.addObserver(sensorObserver8);
        boolean boolean10 = room4.isEnabled();
        java.lang.String str11 = room4.getRoomID();
        // The following exception was thrown during execution in test generation
        try {
            room4.setOccupied(false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Room Room hi! | hi! - hi! | Capacity: 0 | hi! - hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 97" + "'", str5, "Room Room hi! | hi! - hi! | Capacity: 0 | hi! - hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 97");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str11, "Room hi! | hi! - hi! | Capacity: 0");
    }

    @Test
    public void test01641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01641");
        room.Room room4 = new room.Room("Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10", 0, "hi!", "Room hi! | hi! - hi! | Capacity: 0");
        room4.setUnderMaintenance(false);
        java.lang.String str7 = room4.toString();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 | hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 0" + "'", str7, "Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 | hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 0");
    }

    @Test
    public void test01642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01642");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        java.lang.String str5 = room4.getScannedID();
        room4.setScannedID("hi!");
        java.lang.String str8 = room4.getBuildingName();
        room4.setEnabled(false);
        room.SensorObserver sensorObserver11 = null;
        room4.removeObserver(sensorObserver11);
        java.lang.String str13 = room4.getBuildingName();
        java.lang.String str14 = room4.getFullLocation();
        room4.setScannedID("Room  - Room hi! | hi! - hi! | Capacity: 0 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 0");
        java.lang.String str17 = room4.toString();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi! - hi!" + "'", str14, "hi! - hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str17, "Room hi! | hi! - hi! | Capacity: 0");
    }

    @Test
    public void test01643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01643");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        room.SensorObserver sensorObserver5 = null;
        room4.addObserver(sensorObserver5);
        room.SensorObserver sensorObserver7 = null;
        room4.addObserver(sensorObserver7);
        boolean boolean9 = room4.isUnderMaintenance();
        java.lang.String str10 = room4.getScannedID();
        java.lang.String str11 = room4.getBuildingName();
        java.lang.String str12 = room4.getBuildingName();
        java.lang.String str13 = room4.getBuildingName();
        // The following exception was thrown during execution in test generation
        try {
            room4.setScannedID("Room hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 1");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test01644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01644");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        boolean boolean5 = room4.isOccupied();
        room4.setEnabled(false);
        boolean boolean8 = room4.isUnderMaintenance();
        java.lang.String str9 = room4.getFullLocation();
        room4.setUnderMaintenance(false);
        java.lang.String str12 = room4.getBuildingName();
        room.SensorObserver sensorObserver13 = null;
        room4.addObserver(sensorObserver13);
        // The following exception was thrown during execution in test generation
        try {
            room4.setScannedID("Room Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - hi! | Capacity: 1 | Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 | hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 0 - hi! - hi! - Room hi! | hi! - hi! | Capacity: 0 -  - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! | Capacity: 35");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi! - hi!" + "'", str9, "hi! - hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test01645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01645");
        room.Room room4 = new room.Room(" - Room hi! | hi! - hi! | Capacity: 0", 0, "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10", "Room hi! | hi! - hi! | Capacity: 0 - hi! - ");
        room.SensorObserver sensorObserver5 = null;
        room4.addObserver(sensorObserver5);
        boolean boolean7 = room4.isOccupied();
        java.lang.Class<?> wildcardClass8 = room4.getClass();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test01646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01646");
        room.Room room4 = new room.Room("Room hi! | hi! - hi! | Capacity: 0", (int) (byte) 100, "Room hi! | hi! - hi! | Capacity: 0 - hi!", "hi!");
        java.lang.String str5 = room4.getRoomID();
        java.lang.String str6 = room4.getFullLocation();
        boolean boolean7 = room4.isOccupied();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str5, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0 - hi! - hi!" + "'", str6, "Room hi! | hi! - hi! | Capacity: 0 - hi! - hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test01647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01647");
        room.Room room4 = new room.Room("hi!", (int) (byte) 100, "", "Room hi! | hi! - hi! | Capacity: 0");
        java.lang.String str5 = room4.getRoomNumber();
        room4.notifyObservers();
        room.SensorObserver sensorObserver7 = null;
        room4.addObserver(sensorObserver7);
        room.SensorObserver sensorObserver9 = null;
        room4.removeObserver(sensorObserver9);
        boolean boolean11 = room4.isEnabled();
        room.SensorObserver sensorObserver12 = null;
        room4.removeObserver(sensorObserver12);
        java.lang.Class<?> wildcardClass14 = room4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str5, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test01648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01648");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        room.SensorObserver sensorObserver5 = null;
        room4.addObserver(sensorObserver5);
        java.lang.String str7 = room4.getScannedID();
        room.SensorObserver sensorObserver8 = null;
        room4.removeObserver(sensorObserver8);
        java.lang.String str10 = room4.getRoomNumber();
        java.lang.String str11 = room4.toString();
        java.lang.String str12 = room4.getScannedID();
        java.lang.String str13 = room4.getBuildingName();
        boolean boolean14 = room4.isUnderMaintenance();
        java.lang.String str15 = room4.toString();
        room.SensorObserver sensorObserver16 = null;
        room4.addObserver(sensorObserver16);
        java.lang.String str18 = room4.getScannedID();
        java.lang.String str19 = room4.getRoomNumber();
        // The following exception was thrown during execution in test generation
        try {
            room4.setUnderMaintenance(true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str11, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str15, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test01649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01649");
        room.Room room4 = new room.Room("Room Room  - Room hi! | hi! - hi! | Capacity: 0 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 0 | Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 - Room hi! | Room hi! | hi! - hi! | Capacity: 0 - hi! - Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 1 | Capacity: -1", (int) (byte) 100, "Room Room hi! | hi! - hi! | Capacity: 0 | hi! - hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 97", "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room hi! | hi! - hi! | Capacity: 0");
    }

    @Test
    public void test01650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01650");
        room.Room room4 = new room.Room("Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10", (int) (byte) 100, "Room  | Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! | Capacity: 1", "hi! - hi! - Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100");
    }

    @Test
    public void test01651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01651");
        room.Room room4 = new room.Room("hi!", (int) (byte) 100, "", "Room hi! | hi! - hi! | Capacity: 0");
        java.lang.String str5 = room4.toString();
        java.lang.String str6 = room4.getScannedID();
        room4.notifyObservers();
        room4.setEnabled(true);
        java.lang.String str10 = room4.getRoomID();
        room4.setUnderMaintenance(false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100" + "'", str5, "Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test01652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01652");
        room.Room room4 = new room.Room("Room hi! | hi! - hi! | Capacity: 0", (int) (byte) 100, "Room hi! | hi! - hi! | Capacity: 0 - hi!", "hi!");
        java.lang.String str5 = room4.getRoomID();
        room.SensorObserver sensorObserver6 = null;
        room4.addObserver(sensorObserver6);
        java.lang.String str8 = room4.getFullLocation();
        java.lang.String str9 = room4.toString();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str5, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0 - hi! - hi!" + "'", str8, "Room hi! | hi! - hi! | Capacity: 0 - hi! - hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Room Room hi! | hi! - hi! | Capacity: 0 | Room hi! | hi! - hi! | Capacity: 0 - hi! - hi! | Capacity: 100" + "'", str9, "Room Room hi! | hi! - hi! | Capacity: 0 | Room hi! | hi! - hi! | Capacity: 0 - hi! - hi! | Capacity: 100");
    }

    @Test
    public void test01653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01653");
        room.Room room4 = new room.Room("", (int) (byte) 100, "Room hi! | hi! - hi! | Capacity: 0 - hi!", "");
        boolean boolean5 = room4.isEnabled();
        room4.notifyObservers();
        room4.notifyObservers();
        int int8 = room4.getCapacity();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
    }

    @Test
    public void test01654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01654");
        room.Room room4 = new room.Room("hi!", (int) (byte) 100, "", "Room hi! | hi! - hi! | Capacity: 0");
        java.lang.String str5 = room4.getRoomNumber();
        java.lang.String str6 = room4.getBuildingName();
        boolean boolean7 = room4.isEnabled();
        java.lang.Class<?> wildcardClass8 = room4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str5, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test01655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01655");
        room.Room room4 = new room.Room("hi!", (int) (byte) 100, "", "Room hi! | hi! - hi! | Capacity: 0");
        room4.setScannedID("");
        boolean boolean7 = room4.isUnderMaintenance();
        room4.setUnderMaintenance(false);
        java.lang.String str10 = room4.getBuildingName();
        room.SensorObserver sensorObserver11 = null;
        room4.addObserver(sensorObserver11);
        boolean boolean13 = room4.isEnabled();
        // The following exception was thrown during execution in test generation
        try {
            room4.setScannedID("Room Room  | Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! | Capacity: 1 | Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 - Room Room hi! | hi! - hi! | Capacity: 0 | hi! - hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 97 | Capacity: 100");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test01656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01656");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        java.lang.String str5 = room4.getScannedID();
        room4.setScannedID("hi!");
        room4.setUnderMaintenance(true);
        java.lang.String str10 = room4.getScannedID();
        room4.setScannedID("Room hi! | hi! - hi! | Capacity: 0 - hi! - ");
        room4.setScannedID("Room Room hi! | hi! - hi! | Capacity: 0 | Room hi! | hi! - hi! | Capacity: 0 - hi! - hi! | Capacity: 100");
        room4.setEnabled(false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test01657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01657");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        java.lang.String str5 = room4.getScannedID();
        room4.setScannedID("hi!");
        room4.setUnderMaintenance(true);
        java.lang.String str10 = room4.getScannedID();
        room4.setScannedID("Room hi! | hi! - hi! | Capacity: 0");
        boolean boolean13 = room4.isOccupied();
        java.lang.String str14 = room4.toString();
        java.lang.String str15 = room4.getBuildingName();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str14, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test01658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01658");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        java.lang.String str5 = room4.getScannedID();
        room4.setScannedID("hi!");
        room4.setUnderMaintenance(true);
        java.lang.String str10 = room4.getScannedID();
        java.lang.String str11 = room4.getFullLocation();
        boolean boolean12 = room4.isOccupied();
        boolean boolean13 = room4.isOccupied();
        boolean boolean14 = room4.isEnabled();
        room4.setEnabled(true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi! - hi!" + "'", str11, "hi! - hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test01659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01659");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        java.lang.String str5 = room4.getScannedID();
        room4.setScannedID("hi!");
        room4.setUnderMaintenance(true);
        java.lang.String str10 = room4.getScannedID();
        boolean boolean11 = room4.isEnabled();
        java.lang.String str12 = room4.getRoomNumber();
        java.lang.String str13 = room4.toString();
        java.lang.String str14 = room4.getBuildingName();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str13, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test01660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01660");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        room.SensorObserver sensorObserver5 = null;
        room4.addObserver(sensorObserver5);
        java.lang.String str7 = room4.toString();
        room.SensorObserver sensorObserver8 = null;
        room4.removeObserver(sensorObserver8);
        java.lang.String str10 = room4.toString();
        java.lang.String str11 = room4.getRoomID();
        boolean boolean12 = room4.isUnderMaintenance();
        boolean boolean13 = room4.isOccupied();
        java.lang.String str14 = room4.toString();
        int int15 = room4.getCapacity();
        java.lang.String str16 = room4.getScannedID();
        java.lang.String str17 = room4.getFullLocation();
        room4.notifyObservers();
        room4.notifyObservers();
        room.SensorObserver sensorObserver20 = null;
        room4.removeObserver(sensorObserver20);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str7, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str10, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str14, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi! - hi!" + "'", str17, "hi! - hi!");
    }

    @Test
    public void test01661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01661");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        java.lang.String str5 = room4.getScannedID();
        room4.setScannedID("hi!");
        boolean boolean8 = room4.isEnabled();
        room.SensorObserver sensorObserver9 = null;
        room4.removeObserver(sensorObserver9);
        room.SensorObserver sensorObserver11 = null;
        room4.addObserver(sensorObserver11);
        boolean boolean13 = room4.isEnabled();
        java.lang.String str14 = room4.getBuildingName();
        java.lang.String str15 = room4.toString();
        boolean boolean16 = room4.isOccupied();
        // The following exception was thrown during execution in test generation
        try {
            room4.setOccupied(false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str15, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test01662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01662");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        java.lang.String str5 = room4.getScannedID();
        room4.setScannedID("hi!");
        room4.setUnderMaintenance(true);
        boolean boolean10 = room4.isOccupied();
        boolean boolean11 = room4.isOccupied();
        java.lang.String str12 = room4.getFullLocation();
        java.lang.String str13 = room4.getBuildingName();
        room4.setScannedID("hi!");
        java.lang.String str16 = room4.getScannedID();
        boolean boolean17 = room4.isOccupied();
        java.lang.String str18 = room4.getScannedID();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi! - hi!" + "'", str12, "hi! - hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test01663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01663");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        room.SensorObserver sensorObserver5 = null;
        room4.addObserver(sensorObserver5);
        java.lang.String str7 = room4.getFullLocation();
        boolean boolean8 = room4.isUnderMaintenance();
        java.lang.String str9 = room4.getRoomID();
        boolean boolean10 = room4.isOccupied();
        room.SensorObserver sensorObserver11 = null;
        room4.removeObserver(sensorObserver11);
        java.lang.String str13 = room4.getRoomID();
        room4.setEnabled(true);
        java.lang.Class<?> wildcardClass16 = room4.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi! - hi!" + "'", str7, "hi! - hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test01664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01664");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        java.lang.String str5 = room4.getScannedID();
        room4.setScannedID("hi!");
        boolean boolean8 = room4.isEnabled();
        int int9 = room4.getCapacity();
        int int10 = room4.getCapacity();
        boolean boolean11 = room4.isOccupied();
        room4.notifyObservers();
        java.lang.String str13 = room4.getRoomID();
        room4.setEnabled(false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test01665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01665");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        room.SensorObserver sensorObserver5 = null;
        room4.addObserver(sensorObserver5);
        java.lang.String str7 = room4.toString();
        room.SensorObserver sensorObserver8 = null;
        room4.removeObserver(sensorObserver8);
        int int10 = room4.getCapacity();
        java.lang.String str11 = room4.getRoomID();
        boolean boolean12 = room4.isEnabled();
        java.lang.String str13 = room4.getScannedID();
        java.lang.String str14 = room4.getBuildingName();
        boolean boolean15 = room4.isOccupied();
        room4.notifyObservers();
        room4.setEnabled(false);
        boolean boolean19 = room4.isOccupied();
        java.lang.Class<?> wildcardClass20 = room4.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str7, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test01666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01666");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        room.SensorObserver sensorObserver5 = null;
        room4.addObserver(sensorObserver5);
        java.lang.String str7 = room4.getScannedID();
        room.SensorObserver sensorObserver8 = null;
        room4.removeObserver(sensorObserver8);
        room.SensorObserver sensorObserver10 = null;
        room4.addObserver(sensorObserver10);
        java.lang.String str12 = room4.getFullLocation();
        boolean boolean13 = room4.isEnabled();
        java.lang.String str14 = room4.toString();
        java.lang.String str15 = room4.getRoomID();
        java.lang.String str16 = room4.getRoomNumber();
        // The following exception was thrown during execution in test generation
        try {
            room4.setUnderMaintenance(true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi! - hi!" + "'", str12, "hi! - hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str14, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test01667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01667");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        java.lang.String str5 = room4.getScannedID();
        room4.setScannedID("hi!");
        java.lang.String str8 = room4.getBuildingName();
        java.lang.String str9 = room4.getFullLocation();
        java.lang.String str10 = room4.getRoomNumber();
        int int11 = room4.getCapacity();
        java.lang.String str12 = room4.getScannedID();
        room4.notifyObservers();
        room4.setUnderMaintenance(false);
        java.lang.String str16 = room4.getFullLocation();
        java.lang.String str17 = room4.getBuildingName();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi! - hi!" + "'", str9, "hi! - hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi! - hi!" + "'", str16, "hi! - hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test01668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01668");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        java.lang.String str5 = room4.getScannedID();
        room4.setScannedID("hi!");
        java.lang.String str8 = room4.getBuildingName();
        int int9 = room4.getCapacity();
        room4.setOccupied(true);
        int int12 = room4.getCapacity();
        room4.notifyObservers();
        int int14 = room4.getCapacity();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test01669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01669");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        room.SensorObserver sensorObserver5 = null;
        room4.addObserver(sensorObserver5);
        java.lang.String str7 = room4.getScannedID();
        java.lang.String str8 = room4.getFullLocation();
        boolean boolean9 = room4.isOccupied();
        boolean boolean10 = room4.isOccupied();
        room.SensorObserver sensorObserver11 = null;
        room4.removeObserver(sensorObserver11);
        room4.setScannedID("Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi!");
        java.lang.String str15 = room4.getScannedID();
        java.lang.String str16 = room4.getScannedID();
        room.SensorObserver sensorObserver17 = null;
        room4.removeObserver(sensorObserver17);
        room.SensorObserver sensorObserver19 = null;
        room4.removeObserver(sensorObserver19);
        room4.setEnabled(true);
        room.SensorObserver sensorObserver23 = null;
        room4.removeObserver(sensorObserver23);
        room.SensorObserver sensorObserver25 = null;
        room4.removeObserver(sensorObserver25);
        java.lang.Class<?> wildcardClass27 = room4.getClass();
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi! - hi!" + "'", str8, "hi! - hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi!" + "'", str15, "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi!" + "'", str16, "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi!");
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test01670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01670");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        java.lang.String str5 = room4.getScannedID();
        room4.setScannedID("hi!");
        boolean boolean8 = room4.isEnabled();
        room4.setScannedID("Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | hi! - hi! - hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 0");
        room.SensorObserver sensorObserver11 = null;
        room4.addObserver(sensorObserver11);
        java.lang.Class<?> wildcardClass13 = room4.getClass();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test01671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01671");
        room.Room room4 = new room.Room("Room  - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! | Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 100 | hi! - hi! - hi! - hi! | Capacity: 0 - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 0", 97, "Room hi! | hi! - hi! | Capacity: 0 - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! - hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 97", "hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10");
        boolean boolean5 = room4.isEnabled();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test01672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01672");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        room.SensorObserver sensorObserver5 = null;
        room4.addObserver(sensorObserver5);
        java.lang.String str7 = room4.getFullLocation();
        boolean boolean8 = room4.isUnderMaintenance();
        java.lang.String str9 = room4.getRoomID();
        boolean boolean10 = room4.isOccupied();
        java.lang.String str11 = room4.toString();
        java.lang.String str12 = room4.getFullLocation();
        java.lang.String str13 = room4.getBuildingName();
        // The following exception was thrown during execution in test generation
        try {
            room4.setScannedID("Room hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 1");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi! - hi!" + "'", str7, "hi! - hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str11, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi! - hi!" + "'", str12, "hi! - hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test01673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01673");
        room.Room room4 = new room.Room("hi! - hi!", (int) (short) 1, "hi! - hi!", "");
        java.lang.String str5 = room4.getScannedID();
        room4.setUnderMaintenance(true);
        java.lang.String str8 = room4.getBuildingName();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi! - hi!" + "'", str8, "hi! - hi!");
    }

    @Test
    public void test01674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01674");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        java.lang.String str5 = room4.getScannedID();
        room4.setScannedID("hi!");
        boolean boolean8 = room4.isEnabled();
        int int9 = room4.getCapacity();
        java.lang.String str10 = room4.getRoomID();
        java.lang.String str11 = room4.toString();
        room4.notifyObservers();
        boolean boolean13 = room4.isUnderMaintenance();
        boolean boolean14 = room4.isEnabled();
        room4.setScannedID("Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 97 - Room  - Room hi! | hi! - hi! | Capacity: 0 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 0");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str11, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test01675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01675");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        boolean boolean5 = room4.isOccupied();
        room4.setEnabled(false);
        java.lang.String str8 = room4.getFullLocation();
        room4.setOccupied(false);
        room4.setEnabled(true);
        room.SensorObserver sensorObserver13 = null;
        room4.addObserver(sensorObserver13);
        java.lang.String str15 = room4.toString();
        // The following exception was thrown during execution in test generation
        try {
            room4.setScannedID("Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 1");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi! - hi!" + "'", str8, "hi! - hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str15, "Room hi! | hi! - hi! | Capacity: 0");
    }

    @Test
    public void test01676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01676");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        room.SensorObserver sensorObserver5 = null;
        room4.addObserver(sensorObserver5);
        java.lang.String str7 = room4.getScannedID();
        room.SensorObserver sensorObserver8 = null;
        room4.removeObserver(sensorObserver8);
        room.SensorObserver sensorObserver10 = null;
        room4.addObserver(sensorObserver10);
        java.lang.String str12 = room4.getFullLocation();
        boolean boolean13 = room4.isEnabled();
        java.lang.String str14 = room4.toString();
        java.lang.String str15 = room4.getRoomID();
        java.lang.String str16 = room4.getRoomNumber();
        // The following exception was thrown during execution in test generation
        try {
            room4.setScannedID("Room Room  | Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! | Capacity: 1 | Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 - Room Room hi! | hi! - hi! | Capacity: 0 | hi! - hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 97 | Capacity: 100");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi! - hi!" + "'", str12, "hi! - hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str14, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test01677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01677");
        room.Room room4 = new room.Room("hi!", (int) (byte) 100, "", "Room hi! | hi! - hi! | Capacity: 0");
        room4.setScannedID("");
        boolean boolean7 = room4.isOccupied();
        room4.setOccupied(true);
        room.SensorObserver sensorObserver10 = null;
        room4.removeObserver(sensorObserver10);
        room4.setEnabled(false);
        room4.setUnderMaintenance(false);
        room4.setOccupied(true);
        boolean boolean18 = room4.isUnderMaintenance();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test01678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01678");
        room.Room room4 = new room.Room("Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10", 0, "hi!", "Room hi! | hi! - hi! | Capacity: 0");
        java.lang.String str5 = room4.getBuildingName();
        room.SensorObserver sensorObserver6 = null;
        room4.removeObserver(sensorObserver6);
        room4.notifyObservers();
        java.lang.String str9 = room4.getRoomID();
        int int10 = room4.getCapacity();
        java.lang.Class<?> wildcardClass11 = room4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10" + "'", str9, "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test01679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01679");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        boolean boolean5 = room4.isOccupied();
        room4.setEnabled(false);
        boolean boolean8 = room4.isUnderMaintenance();
        java.lang.String str9 = room4.getFullLocation();
        boolean boolean10 = room4.isOccupied();
        room4.setUnderMaintenance(true);
        boolean boolean13 = room4.isOccupied();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi! - hi!" + "'", str9, "hi! - hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test01680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01680");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        room.SensorObserver sensorObserver5 = null;
        room4.addObserver(sensorObserver5);
        java.lang.String str7 = room4.getScannedID();
        java.lang.String str8 = room4.getFullLocation();
        int int9 = room4.getCapacity();
        java.lang.String str10 = room4.getScannedID();
        boolean boolean11 = room4.isOccupied();
        int int12 = room4.getCapacity();
        boolean boolean13 = room4.isUnderMaintenance();
        // The following exception was thrown during execution in test generation
        try {
            room4.setUnderMaintenance(true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi! - hi!" + "'", str8, "hi! - hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test01681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01681");
        room.Room room4 = new room.Room(" - Room hi! | hi! - hi! | Capacity: 0", 0, "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10", "Room hi! | hi! - hi! | Capacity: 0 - hi! - ");
        java.lang.String str5 = room4.toString();
        boolean boolean6 = room4.isEnabled();
        boolean boolean7 = room4.isEnabled();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Room  - Room hi! | hi! - hi! | Capacity: 0 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 0" + "'", str5, "Room  - Room hi! | hi! - hi! | Capacity: 0 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 0");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test01682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01682");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        room.SensorObserver sensorObserver5 = null;
        room4.addObserver(sensorObserver5);
        java.lang.String str7 = room4.getScannedID();
        java.lang.String str8 = room4.getRoomNumber();
        // The following exception was thrown during execution in test generation
        try {
            room4.setUnderMaintenance(false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test01683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01683");
        room.Room room4 = new room.Room("Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi!", 10, "Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10", "hi!");
        java.lang.String str5 = room4.getScannedID();
        room.SensorObserver sensorObserver6 = null;
        room4.removeObserver(sensorObserver6);
        java.lang.String str8 = room4.getRoomID();
        java.lang.String str9 = room4.getRoomID();
        java.lang.Class<?> wildcardClass10 = room4.getClass();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi!" + "'", str8, "Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi!" + "'", str9, "Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi!");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test01684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01684");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        room.SensorObserver sensorObserver5 = null;
        room4.addObserver(sensorObserver5);
        java.lang.String str7 = room4.getScannedID();
        java.lang.String str8 = room4.getFullLocation();
        int int9 = room4.getCapacity();
        java.lang.String str10 = room4.getRoomID();
        int int11 = room4.getCapacity();
        java.lang.String str12 = room4.getScannedID();
        java.lang.String str13 = room4.getFullLocation();
        boolean boolean14 = room4.isOccupied();
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi! - hi!" + "'", str8, "hi! - hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi! - hi!" + "'", str13, "hi! - hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test01685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01685");
        room.Room room4 = new room.Room("hi!", (int) (byte) 1, "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10", "hi!");
        room4.notifyObservers();
        java.lang.String str6 = room4.getFullLocation();
        java.lang.String str7 = room4.getScannedID();
        boolean boolean8 = room4.isUnderMaintenance();
        java.lang.String str9 = room4.getRoomID();
        room4.setEnabled(true);
        java.lang.String str12 = room4.toString();
        java.lang.String str13 = room4.getRoomNumber();
        boolean boolean14 = room4.isOccupied();
        room4.setOccupied(false);
        room4.setUnderMaintenance(false);
        java.lang.String str19 = room4.toString();
        room4.setUnderMaintenance(false);
        room4.setOccupied(true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi!" + "'", str6, "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi!");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Room hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 1" + "'", str12, "Room hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 1");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Room hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 1" + "'", str19, "Room hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 1");
    }

    @Test
    public void test01686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01686");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        boolean boolean5 = room4.isOccupied();
        room4.setEnabled(false);
        java.lang.String str8 = room4.getFullLocation();
        java.lang.String str9 = room4.getRoomID();
        int int10 = room4.getCapacity();
        boolean boolean11 = room4.isOccupied();
        java.lang.String str12 = room4.toString();
        java.lang.Class<?> wildcardClass13 = room4.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi! - hi!" + "'", str8, "hi! - hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str12, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test01687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01687");
        room.Room room4 = new room.Room("", (int) (byte) 1, "Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10", "hi!");
        int int5 = room4.getCapacity();
        boolean boolean6 = room4.isUnderMaintenance();
        room4.setScannedID("Room Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! - hi! - hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: -1");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test01688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01688");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        boolean boolean5 = room4.isOccupied();
        room4.setEnabled(false);
        java.lang.String str8 = room4.toString();
        room4.setOccupied(true);
        room4.setOccupied(false);
        java.lang.String str13 = room4.getRoomID();
        room4.notifyObservers();
        room.SensorObserver sensorObserver15 = null;
        room4.addObserver(sensorObserver15);
        java.lang.String str17 = room4.getBuildingName();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str8, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test01689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01689");
        room.Room room4 = new room.Room("hi!", (int) (byte) 100, "", "Room hi! | hi! - hi! | Capacity: 0");
        room4.setScannedID("");
        boolean boolean7 = room4.isOccupied();
        room4.setOccupied(true);
        boolean boolean10 = room4.isEnabled();
        boolean boolean11 = room4.isEnabled();
        java.lang.String str12 = room4.getScannedID();
        room.SensorObserver sensorObserver13 = null;
        room4.addObserver(sensorObserver13);
        // The following exception was thrown during execution in test generation
        try {
            room4.setScannedID("Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test01690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01690");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        boolean boolean5 = room4.isOccupied();
        boolean boolean6 = room4.isEnabled();
        int int7 = room4.getCapacity();
        room.SensorObserver sensorObserver8 = null;
        room4.addObserver(sensorObserver8);
        room.SensorObserver sensorObserver10 = null;
        room4.addObserver(sensorObserver10);
        java.lang.Class<?> wildcardClass12 = room4.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test01691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01691");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        java.lang.String str5 = room4.getScannedID();
        room4.setScannedID("hi!");
        boolean boolean8 = room4.isEnabled();
        int int9 = room4.getCapacity();
        int int10 = room4.getCapacity();
        room.SensorObserver sensorObserver11 = null;
        room4.removeObserver(sensorObserver11);
        boolean boolean13 = room4.isUnderMaintenance();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test01692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01692");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        room.SensorObserver sensorObserver5 = null;
        room4.addObserver(sensorObserver5);
        java.lang.String str7 = room4.toString();
        room.SensorObserver sensorObserver8 = null;
        room4.removeObserver(sensorObserver8);
        java.lang.String str10 = room4.toString();
        java.lang.String str11 = room4.getRoomID();
        boolean boolean12 = room4.isUnderMaintenance();
        boolean boolean13 = room4.isOccupied();
        room4.setOccupied(true);
        java.lang.String str16 = room4.getFullLocation();
        boolean boolean17 = room4.isOccupied();
        room4.setUnderMaintenance(false);
        boolean boolean20 = room4.isEnabled();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str7, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str10, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi! - hi!" + "'", str16, "hi! - hi!");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test01693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01693");
        room.Room room4 = new room.Room("hi!", 100, "Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 97", "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 100 - Room hi! | hi! - hi! | Capacity: 0 - hi! - ");
        room.SensorObserver sensorObserver5 = null;
        room4.addObserver(sensorObserver5);
        // The following exception was thrown during execution in test generation
        try {
            room4.setUnderMaintenance(false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01694");
        room.Room room4 = new room.Room("Room hi! | hi! - hi! | Capacity: 0", (int) (byte) 10, "hi!", "");
        room4.setUnderMaintenance(true);
        java.lang.String str7 = room4.toString();
        java.lang.String str8 = room4.getBuildingName();
        java.lang.String str9 = room4.toString();
        java.lang.String str10 = room4.getScannedID();
        boolean boolean11 = room4.isOccupied();
        java.lang.String str12 = room4.getBuildingName();
        room4.setEnabled(true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10" + "'", str7, "Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10" + "'", str9, "Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test01695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01695");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        java.lang.String str5 = room4.getScannedID();
        room4.setScannedID("hi!");
        room4.setUnderMaintenance(true);
        java.lang.String str10 = room4.getScannedID();
        room4.setScannedID("Room hi! | hi! - hi! | Capacity: 0");
        boolean boolean13 = room4.isEnabled();
        room4.setScannedID("Room Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! | Room Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! - hi! - hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: -1 - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 100");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test01696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01696");
        room.Room room4 = new room.Room(" - Room hi! | hi! - hi! | Capacity: 0", 0, "", "Room hi! | hi! - hi! | Capacity: 0");
        room4.setScannedID("hi! - hi!");
        java.lang.String str7 = room4.getRoomID();
        room.SensorObserver sensorObserver8 = null;
        room4.addObserver(sensorObserver8);
        // The following exception was thrown during execution in test generation
        try {
            room4.setOccupied(false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + " - Room hi! | hi! - hi! | Capacity: 0" + "'", str7, " - Room hi! | hi! - hi! | Capacity: 0");
    }

    @Test
    public void test01697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01697");
        room.Room room4 = new room.Room("Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100", (int) 'a', "Room hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 1", "Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi!");
        room4.setEnabled(false);
        room4.setEnabled(false);
    }

    @Test
    public void test01698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01698");
        room.Room room4 = new room.Room("hi!", (int) (byte) 100, "", "Room hi! | hi! - hi! | Capacity: 0");
        java.lang.String str5 = room4.getScannedID();
        java.lang.String str6 = room4.getBuildingName();
        room4.setUnderMaintenance(false);
        room4.setEnabled(false);
        room4.notifyObservers();
        room4.setUnderMaintenance(true);
        java.lang.String str14 = room4.getRoomID();
        room4.setScannedID("Room hi! | hi! - hi! | Capacity: 0");
        java.lang.String str17 = room4.getBuildingName();
        boolean boolean18 = room4.isOccupied();
        room4.setUnderMaintenance(false);
        java.lang.String str21 = room4.getScannedID();
        java.lang.String str22 = room4.getFullLocation();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str21, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + " - Room hi! | hi! - hi! | Capacity: 0" + "'", str22, " - Room hi! | hi! - hi! | Capacity: 0");
    }

    @Test
    public void test01699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01699");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        room.SensorObserver sensorObserver5 = null;
        room4.addObserver(sensorObserver5);
        room.SensorObserver sensorObserver7 = null;
        room4.addObserver(sensorObserver7);
        boolean boolean9 = room4.isUnderMaintenance();
        java.lang.String str10 = room4.getScannedID();
        boolean boolean11 = room4.isOccupied();
        room.SensorObserver sensorObserver12 = null;
        room4.addObserver(sensorObserver12);
        java.lang.String str14 = room4.getRoomID();
        room.SensorObserver sensorObserver15 = null;
        room4.addObserver(sensorObserver15);
        // The following exception was thrown during execution in test generation
        try {
            room4.setUnderMaintenance(false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test01700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01700");
        room.Room room4 = new room.Room("Room hi! | hi! - hi! | Capacity: 0", (int) 'a', "hi!", "hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10");
        boolean boolean5 = room4.isOccupied();
        java.lang.String str6 = room4.getBuildingName();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test01701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01701");
        room.Room room4 = new room.Room("Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10", 0, "hi!", "Room hi! | hi! - hi! | Capacity: 0");
        room4.setScannedID("Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100");
        room4.notifyObservers();
        int int8 = room4.getCapacity();
        room4.setEnabled(true);
        java.lang.String str11 = room4.getFullLocation();
        room.SensorObserver sensorObserver12 = null;
        room4.addObserver(sensorObserver12);
        java.lang.String str14 = room4.getBuildingName();
        room.SensorObserver sensorObserver15 = null;
        room4.addObserver(sensorObserver15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi! - Room hi! | hi! - hi! | Capacity: 0" + "'", str11, "hi! - Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test01702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01702");
        room.Room room4 = new room.Room("hi!", (int) (byte) 100, "", "Room hi! | hi! - hi! | Capacity: 0");
        java.lang.String str5 = room4.getScannedID();
        room4.setOccupied(false);
        room.SensorObserver sensorObserver8 = null;
        room4.addObserver(sensorObserver8);
        // The following exception was thrown during execution in test generation
        try {
            room4.setScannedID("Room  - Room hi! | hi! - hi! | Capacity: 0 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 0 - ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test01703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01703");
        room.Room room4 = new room.Room("", (int) (short) 10, "Room hi! | hi! - hi! | Capacity: 0", "hi!");
        room.SensorObserver sensorObserver5 = null;
        room4.removeObserver(sensorObserver5);
        room.SensorObserver sensorObserver7 = null;
        room4.addObserver(sensorObserver7);
        // The following exception was thrown during execution in test generation
        try {
            room4.setOccupied(false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01704");
        room.Room room4 = new room.Room("hi!", (int) '#', "Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10", "Room hi! | hi! - hi! | Capacity: 0 - hi!");
        room.SensorObserver sensorObserver5 = null;
        room4.addObserver(sensorObserver5);
        java.lang.Class<?> wildcardClass7 = room4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test01705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01705");
        room.Room room4 = new room.Room("Room hi! | hi! - hi! | Capacity: 0", (int) (byte) 100, "Room hi! | hi! - hi! | Capacity: 0 - hi!", "hi!");
        java.lang.String str5 = room4.getRoomID();
        java.lang.String str6 = room4.getFullLocation();
        room4.setScannedID(" - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi!");
        room.SensorObserver sensorObserver9 = null;
        room4.removeObserver(sensorObserver9);
        java.lang.String str11 = room4.getFullLocation();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str5, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0 - hi! - hi!" + "'", str6, "Room hi! | hi! - hi! | Capacity: 0 - hi! - hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0 - hi! - hi!" + "'", str11, "Room hi! | hi! - hi! | Capacity: 0 - hi! - hi!");
    }

    @Test
    public void test01706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01706");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        room.SensorObserver sensorObserver5 = null;
        room4.addObserver(sensorObserver5);
        java.lang.String str7 = room4.getScannedID();
        java.lang.String str8 = room4.getFullLocation();
        int int9 = room4.getCapacity();
        room.SensorObserver sensorObserver10 = null;
        room4.removeObserver(sensorObserver10);
        room4.notifyObservers();
        room4.setUnderMaintenance(false);
        boolean boolean15 = room4.isUnderMaintenance();
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi! - hi!" + "'", str8, "hi! - hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test01707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01707");
        room.Room room4 = new room.Room("", 100, "Room Room Room hi! | hi! - hi! | Capacity: 0 | Room hi! | hi! - hi! | Capacity: 0 - hi! - hi! | Capacity: 100 |  - hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 10", "Room Room  - Room hi! | hi! - hi! | Capacity: 0 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 0 | Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 - Room hi! | Room hi! | hi! - hi! | Capacity: 0 - hi! - Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 1 | Capacity: -1");
    }

    @Test
    public void test01708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01708");
        room.Room room4 = new room.Room("Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10", 0, "hi!", "Room hi! | hi! - hi! | Capacity: 0");
        java.lang.String str5 = room4.getBuildingName();
        room.SensorObserver sensorObserver6 = null;
        room4.removeObserver(sensorObserver6);
        java.lang.String str8 = room4.getRoomID();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10" + "'", str8, "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10");
    }

    @Test
    public void test01709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01709");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        room.SensorObserver sensorObserver5 = null;
        room4.addObserver(sensorObserver5);
        java.lang.String str7 = room4.getScannedID();
        boolean boolean8 = room4.isOccupied();
        java.lang.String str9 = room4.getScannedID();
        java.lang.Class<?> wildcardClass10 = room4.getClass();
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test01710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01710");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        room.SensorObserver sensorObserver5 = null;
        room4.addObserver(sensorObserver5);
        java.lang.String str7 = room4.getScannedID();
        room.SensorObserver sensorObserver8 = null;
        room4.removeObserver(sensorObserver8);
        java.lang.String str10 = room4.getRoomNumber();
        java.lang.String str11 = room4.toString();
        room4.setUnderMaintenance(true);
        room.SensorObserver sensorObserver14 = null;
        room4.removeObserver(sensorObserver14);
        java.lang.String str16 = room4.getRoomID();
        room4.notifyObservers();
        java.lang.String str18 = room4.getRoomID();
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str11, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test01711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01711");
        room.Room room4 = new room.Room("hi!", 100, "Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 97", "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 100 - Room hi! | hi! - hi! | Capacity: 0 - hi! - ");
        room4.setOccupied(true);
        java.lang.String str7 = room4.getScannedID();
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test01712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01712");
        room.Room room4 = new room.Room("Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100", 10, "hi! - ", "Room  - Room hi! | hi! - hi! | Capacity: 0 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 0");
        java.lang.String str5 = room4.toString();
        java.lang.String str6 = room4.getBuildingName();
        boolean boolean7 = room4.isEnabled();
        room4.notifyObservers();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | hi! -  - Room  - Room hi! | hi! - hi! | Capacity: 0 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 0 | Capacity: 10" + "'", str5, "Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | hi! -  - Room  - Room hi! | hi! - hi! | Capacity: 0 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 0 | Capacity: 10");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi! - " + "'", str6, "hi! - ");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test01713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01713");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        room.SensorObserver sensorObserver5 = null;
        room4.addObserver(sensorObserver5);
        room.SensorObserver sensorObserver7 = null;
        room4.addObserver(sensorObserver7);
        java.lang.String str9 = room4.getBuildingName();
        java.lang.String str10 = room4.getRoomNumber();
        java.lang.String str11 = room4.getRoomID();
        java.lang.String str12 = room4.getFullLocation();
        // The following exception was thrown during execution in test generation
        try {
            room4.setOccupied(false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi! - hi!" + "'", str12, "hi! - hi!");
    }

    @Test
    public void test01714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01714");
        room.Room room4 = new room.Room("hi!", (int) (byte) 100, "", "Room hi! | hi! - hi! | Capacity: 0");
        room4.setScannedID("");
        boolean boolean7 = room4.isOccupied();
        int int8 = room4.getCapacity();
        boolean boolean9 = room4.isEnabled();
        java.lang.String str10 = room4.getRoomID();
        boolean boolean11 = room4.isUnderMaintenance();
        java.lang.String str12 = room4.getScannedID();
        boolean boolean13 = room4.isOccupied();
        boolean boolean14 = room4.isUnderMaintenance();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test01715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01715");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        room.SensorObserver sensorObserver5 = null;
        room4.addObserver(sensorObserver5);
        room.SensorObserver sensorObserver7 = null;
        room4.addObserver(sensorObserver7);
        java.lang.String str9 = room4.getFullLocation();
        java.lang.String str10 = room4.getFullLocation();
        java.lang.String str11 = room4.getBuildingName();
        boolean boolean12 = room4.isOccupied();
        // The following exception was thrown during execution in test generation
        try {
            room4.setUnderMaintenance(false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi! - hi!" + "'", str9, "hi! - hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi! - hi!" + "'", str10, "hi! - hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test01716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01716");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        java.lang.String str5 = room4.getScannedID();
        room4.setScannedID("hi!");
        java.lang.String str8 = room4.getRoomID();
        room4.setUnderMaintenance(false);
        room4.setScannedID("Room Room hi! | hi! - hi! | Capacity: 0 | hi! - hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 97");
        room4.notifyObservers();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test01717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01717");
        room.Room room4 = new room.Room("Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 97", (int) (short) 100, "Room  - Room hi! | hi! - hi! | Capacity: 0 |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 0", "Room hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 1");
        room4.setOccupied(true);
    }

    @Test
    public void test01718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01718");
        room.Room room4 = new room.Room("hi!", (int) (byte) 100, "", "Room hi! | hi! - hi! | Capacity: 0");
        room4.notifyObservers();
        room.SensorObserver sensorObserver6 = null;
        room4.removeObserver(sensorObserver6);
        java.lang.String str8 = room4.getRoomNumber();
        int int9 = room4.getCapacity();
        room4.notifyObservers();
        java.lang.String str11 = room4.getRoomID();
        java.lang.String str12 = room4.getScannedID();
        java.lang.String str13 = room4.getScannedID();
        room.SensorObserver sensorObserver14 = null;
        room4.removeObserver(sensorObserver14);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str8, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test01719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01719");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        java.lang.String str5 = room4.getScannedID();
        room4.setScannedID("hi!");
        boolean boolean8 = room4.isEnabled();
        int int9 = room4.getCapacity();
        int int10 = room4.getCapacity();
        room4.setUnderMaintenance(true);
        boolean boolean13 = room4.isUnderMaintenance();
        room4.setUnderMaintenance(true);
        room4.setOccupied(false);
        room4.notifyObservers();
        boolean boolean19 = room4.isUnderMaintenance();
        java.lang.String str20 = room4.getRoomID();
        room4.setEnabled(false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test01720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01720");
        room.Room room4 = new room.Room("", (int) (short) 10, "Room hi! | hi! - hi! | Capacity: 0", "hi!");
        java.lang.String str5 = room4.toString();
        java.lang.String str6 = room4.getBuildingName();
        room.SensorObserver sensorObserver7 = null;
        room4.removeObserver(sensorObserver7);
        boolean boolean9 = room4.isEnabled();
        room.SensorObserver sensorObserver10 = null;
        room4.addObserver(sensorObserver10);
        java.lang.String str12 = room4.getRoomID();
        java.lang.String str13 = room4.getRoomNumber();
        // The following exception was thrown during execution in test generation
        try {
            room4.setEnabled(false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10" + "'", str5, "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str6, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test01721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01721");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        room.SensorObserver sensorObserver5 = null;
        room4.addObserver(sensorObserver5);
        room.SensorObserver sensorObserver7 = null;
        room4.addObserver(sensorObserver7);
        boolean boolean9 = room4.isUnderMaintenance();
        java.lang.String str10 = room4.getScannedID();
        boolean boolean11 = room4.isEnabled();
        java.lang.String str12 = room4.getRoomNumber();
        // The following exception was thrown during execution in test generation
        try {
            room4.notifyObservers();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test01722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01722");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        java.lang.String str5 = room4.getScannedID();
        room4.setScannedID("hi!");
        java.lang.String str8 = room4.getBuildingName();
        java.lang.String str9 = room4.getRoomNumber();
        int int10 = room4.getCapacity();
        room4.notifyObservers();
        java.lang.String str12 = room4.getScannedID();
        room4.notifyObservers();
        room4.notifyObservers();
        java.lang.String str15 = room4.getFullLocation();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi! - hi!" + "'", str15, "hi! - hi!");
    }

    @Test
    public void test01723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01723");
        room.Room room4 = new room.Room("hi!", (int) (byte) 100, "", "Room hi! | hi! - hi! | Capacity: 0");
        room4.setScannedID("");
        boolean boolean7 = room4.isUnderMaintenance();
        room4.setUnderMaintenance(false);
        room4.notifyObservers();
        java.lang.String str11 = room4.getRoomID();
        room.SensorObserver sensorObserver12 = null;
        room4.addObserver(sensorObserver12);
        // The following exception was thrown during execution in test generation
        try {
            room4.notifyObservers();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test01724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01724");
        room.Room room4 = new room.Room("hi!", (int) (byte) 100, "", "Room hi! | hi! - hi! | Capacity: 0");
        java.lang.String str5 = room4.getRoomNumber();
        boolean boolean6 = room4.isEnabled();
        java.lang.String str7 = room4.getRoomNumber();
        java.lang.String str8 = room4.getRoomID();
        java.lang.String str9 = room4.toString();
        java.lang.Class<?> wildcardClass10 = room4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str5, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str7, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100" + "'", str9, "Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test01725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01725");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        room.SensorObserver sensorObserver5 = null;
        room4.addObserver(sensorObserver5);
        java.lang.String str7 = room4.toString();
        java.lang.String str8 = room4.toString();
        java.lang.String str9 = room4.getBuildingName();
        boolean boolean10 = room4.isUnderMaintenance();
        java.lang.String str11 = room4.getRoomID();
        boolean boolean12 = room4.isUnderMaintenance();
        java.lang.String str13 = room4.getFullLocation();
        java.lang.String str14 = room4.toString();
        boolean boolean15 = room4.isUnderMaintenance();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str7, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str8, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi! - hi!" + "'", str13, "hi! - hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str14, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test01726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01726");
        room.Room room4 = new room.Room(" - Room hi! | hi! - hi! | Capacity: 0", 0, "", "Room hi! | hi! - hi! | Capacity: 0");
        room4.setScannedID("hi! - hi!");
        java.lang.String str7 = room4.getRoomID();
        java.lang.String str8 = room4.getScannedID();
        room4.setUnderMaintenance(false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + " - Room hi! | hi! - hi! | Capacity: 0" + "'", str7, " - Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi! - hi!" + "'", str8, "hi! - hi!");
    }

    @Test
    public void test01727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01727");
        room.Room room4 = new room.Room("hi!", (int) (byte) 100, "", "Room hi! | hi! - hi! | Capacity: 0");
        room4.setScannedID("");
        boolean boolean7 = room4.isOccupied();
        room.SensorObserver sensorObserver8 = null;
        room4.removeObserver(sensorObserver8);
        int int10 = room4.getCapacity();
        int int11 = room4.getCapacity();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
    }

    @Test
    public void test01728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01728");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        java.lang.String str5 = room4.getScannedID();
        room4.setScannedID("hi!");
        room4.setUnderMaintenance(true);
        room.SensorObserver sensorObserver10 = null;
        room4.removeObserver(sensorObserver10);
        java.lang.String str12 = room4.getRoomNumber();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test01729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01729");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        room.SensorObserver sensorObserver5 = null;
        room4.addObserver(sensorObserver5);
        java.lang.String str7 = room4.getScannedID();
        java.lang.String str8 = room4.getFullLocation();
        boolean boolean9 = room4.isOccupied();
        boolean boolean10 = room4.isOccupied();
        java.lang.String str11 = room4.getFullLocation();
        java.lang.String str12 = room4.getRoomNumber();
        java.lang.Class<?> wildcardClass13 = room4.getClass();
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi! - hi!" + "'", str8, "hi! - hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi! - hi!" + "'", str11, "hi! - hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test01730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01730");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        room.SensorObserver sensorObserver5 = null;
        room4.addObserver(sensorObserver5);
        java.lang.String str7 = room4.getScannedID();
        room.SensorObserver sensorObserver8 = null;
        room4.removeObserver(sensorObserver8);
        java.lang.String str10 = room4.getRoomNumber();
        java.lang.String str11 = room4.toString();
        java.lang.String str12 = room4.getScannedID();
        room4.notifyObservers();
        room4.setUnderMaintenance(false);
        room4.setOccupied(true);
        java.lang.String str18 = room4.getRoomNumber();
        java.lang.String str19 = room4.getBuildingName();
        boolean boolean20 = room4.isOccupied();
        java.lang.String str21 = room4.getBuildingName();
        boolean boolean22 = room4.isEnabled();
        room4.setOccupied(true);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str11, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test01731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01731");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        java.lang.String str5 = room4.getScannedID();
        room4.setScannedID("hi!");
        room4.setUnderMaintenance(true);
        room.SensorObserver sensorObserver10 = null;
        room4.addObserver(sensorObserver10);
        boolean boolean12 = room4.isUnderMaintenance();
        java.lang.String str13 = room4.getFullLocation();
        java.lang.String str14 = room4.getScannedID();
        java.lang.String str15 = room4.toString();
        // The following exception was thrown during execution in test generation
        try {
            room4.setEnabled(true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi! - hi!" + "'", str13, "hi! - hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str15, "Room hi! | hi! - hi! | Capacity: 0");
    }

    @Test
    public void test01732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01732");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        boolean boolean5 = room4.isOccupied();
        java.lang.String str6 = room4.toString();
        java.lang.String str7 = room4.toString();
        room4.setOccupied(false);
        boolean boolean10 = room4.isUnderMaintenance();
        java.lang.Class<?> wildcardClass11 = room4.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str6, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str7, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test01733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01733");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        java.lang.String str5 = room4.getScannedID();
        room4.setScannedID("hi!");
        room4.setUnderMaintenance(true);
        java.lang.String str10 = room4.getScannedID();
        java.lang.String str11 = room4.getBuildingName();
        room.SensorObserver sensorObserver12 = null;
        room4.addObserver(sensorObserver12);
        // The following exception was thrown during execution in test generation
        try {
            room4.setScannedID("Room  - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 100 | hi! - hi! - hi! - hi! | Capacity: 0 | Capacity: 0");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test01734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01734");
        room.Room room4 = new room.Room("Room  | Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! | Capacity: 1", (int) (short) 1, " - Room hi! | hi! - hi! | Capacity: 0", "Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi!");
        java.lang.String str5 = room4.getFullLocation();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + " - Room hi! | hi! - hi! | Capacity: 0 - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi!" + "'", str5, " - Room hi! | hi! - hi! | Capacity: 0 - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi!");
    }

    @Test
    public void test01735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01735");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        java.lang.String str5 = room4.getScannedID();
        room4.setScannedID("hi!");
        room4.setUnderMaintenance(true);
        java.lang.String str10 = room4.getFullLocation();
        java.lang.String str11 = room4.getScannedID();
        room4.setEnabled(true);
        boolean boolean14 = room4.isUnderMaintenance();
        room.SensorObserver sensorObserver15 = null;
        room4.addObserver(sensorObserver15);
        // The following exception was thrown during execution in test generation
        try {
            room4.setScannedID("Room Room hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 1 | Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! - Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: -1 - Room hi! | hi! - hi! | Capacity: 0 - hi! - ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi! - hi!" + "'", str10, "hi! - hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test01736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01736");
        room.Room room4 = new room.Room("hi!", (int) (byte) 100, "", "Room hi! | hi! - hi! | Capacity: 0");
        java.lang.String str5 = room4.getScannedID();
        java.lang.String str6 = room4.getBuildingName();
        room4.setUnderMaintenance(false);
        room4.setEnabled(false);
        room4.notifyObservers();
        room4.setUnderMaintenance(true);
        java.lang.String str14 = room4.getRoomID();
        room4.setScannedID("Room hi! | hi! - hi! | Capacity: 0");
        room.SensorObserver sensorObserver17 = null;
        room4.removeObserver(sensorObserver17);
        int int19 = room4.getCapacity();
        room.SensorObserver sensorObserver20 = null;
        room4.addObserver(sensorObserver20);
        boolean boolean22 = room4.isEnabled();
        // The following exception was thrown during execution in test generation
        try {
            room4.setUnderMaintenance(false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test01737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01737");
        room.Room room4 = new room.Room(" - Room hi! | hi! - hi! | Capacity: 0", (int) (byte) 100, "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi!", "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10");
        room.SensorObserver sensorObserver5 = null;
        room4.removeObserver(sensorObserver5);
        room4.setEnabled(true);
        room.SensorObserver sensorObserver9 = null;
        room4.removeObserver(sensorObserver9);
        room4.setOccupied(false);
    }

    @Test
    public void test01738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01738");
        room.Room room4 = new room.Room("Room hi! - hi! | Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 10", (int) (short) -1, "Room  - Room hi! | hi! - hi! | Capacity: 0 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 0 - hi! -  - hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10", "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 100");
    }

    @Test
    public void test01739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01739");
        room.Room room4 = new room.Room("hi!", (int) (byte) 100, "", "Room hi! | hi! - hi! | Capacity: 0");
        java.lang.String str5 = room4.getScannedID();
        java.lang.String str6 = room4.getBuildingName();
        room4.setUnderMaintenance(false);
        boolean boolean9 = room4.isOccupied();
        int int10 = room4.getCapacity();
        java.lang.String str11 = room4.getRoomNumber();
        java.lang.String str12 = room4.getRoomNumber();
        room4.notifyObservers();
        java.lang.String str14 = room4.getBuildingName();
        room.SensorObserver sensorObserver15 = null;
        room4.addObserver(sensorObserver15);
        // The following exception was thrown during execution in test generation
        try {
            room4.setScannedID("Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str11, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str12, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test01740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01740");
        room.Room room4 = new room.Room("", (int) (short) 10, "Room hi! | hi! - hi! | Capacity: 0", "hi!");
        java.lang.String str5 = room4.toString();
        java.lang.String str6 = room4.getBuildingName();
        room.SensorObserver sensorObserver7 = null;
        room4.removeObserver(sensorObserver7);
        boolean boolean9 = room4.isEnabled();
        java.lang.String str10 = room4.getRoomID();
        room.SensorObserver sensorObserver11 = null;
        room4.removeObserver(sensorObserver11);
        java.lang.String str13 = room4.getFullLocation();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10" + "'", str5, "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str6, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0 - hi!" + "'", str13, "Room hi! | hi! - hi! | Capacity: 0 - hi!");
    }

    @Test
    public void test01741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01741");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        java.lang.String str5 = room4.getScannedID();
        room4.setScannedID("hi!");
        boolean boolean8 = room4.isEnabled();
        int int9 = room4.getCapacity();
        int int10 = room4.getCapacity();
        boolean boolean11 = room4.isOccupied();
        boolean boolean12 = room4.isUnderMaintenance();
        room4.setOccupied(true);
        java.lang.String str15 = room4.getFullLocation();
        room.SensorObserver sensorObserver16 = null;
        room4.removeObserver(sensorObserver16);
        java.lang.String str18 = room4.getBuildingName();
        java.lang.String str19 = room4.getBuildingName();
        java.lang.String str20 = room4.getRoomID();
        java.lang.Class<?> wildcardClass21 = room4.getClass();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi! - hi!" + "'", str15, "hi! - hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test01742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01742");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        java.lang.String str5 = room4.getScannedID();
        room4.setScannedID("hi!");
        java.lang.String str8 = room4.getBuildingName();
        java.lang.String str9 = room4.getRoomNumber();
        boolean boolean10 = room4.isOccupied();
        java.lang.Class<?> wildcardClass11 = room4.getClass();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test01743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01743");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        java.lang.String str5 = room4.getScannedID();
        room4.setScannedID("hi!");
        boolean boolean8 = room4.isEnabled();
        room4.setEnabled(false);
        room4.setScannedID("Room hi! | hi! - hi! | Capacity: 0 - hi! - ");
        java.lang.String str13 = room4.getBuildingName();
        java.lang.String str14 = room4.getRoomID();
        java.lang.String str15 = room4.getRoomID();
        java.lang.String str16 = room4.getRoomNumber();
        java.lang.Class<?> wildcardClass17 = room4.getClass();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test01744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01744");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        room.SensorObserver sensorObserver5 = null;
        room4.addObserver(sensorObserver5);
        java.lang.String str7 = room4.getFullLocation();
        boolean boolean8 = room4.isEnabled();
        room.SensorObserver sensorObserver9 = null;
        room4.addObserver(sensorObserver9);
        boolean boolean11 = room4.isEnabled();
        // The following exception was thrown during execution in test generation
        try {
            room4.setScannedID("Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi! - hi!" + "'", str7, "hi! - hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test01745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01745");
        room.Room room4 = new room.Room("hi!", (int) ' ', "Room hi! | hi! - hi! | Capacity: 0", "Room hi! | hi! - hi! | Capacity: 0");
        room4.notifyObservers();
        boolean boolean6 = room4.isUnderMaintenance();
        java.lang.Class<?> wildcardClass7 = room4.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test01746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01746");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        java.lang.String str5 = room4.getScannedID();
        room4.setScannedID("hi!");
        room4.setUnderMaintenance(true);
        room4.setOccupied(true);
        room4.setOccupied(false);
        java.lang.String str14 = room4.toString();
        boolean boolean15 = room4.isOccupied();
        boolean boolean16 = room4.isUnderMaintenance();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str14, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test01747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01747");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        boolean boolean5 = room4.isOccupied();
        room4.setEnabled(false);
        java.lang.String str8 = room4.toString();
        room4.setOccupied(true);
        room4.setOccupied(false);
        java.lang.String str13 = room4.getRoomID();
        room4.notifyObservers();
        java.lang.String str15 = room4.toString();
        java.lang.Class<?> wildcardClass16 = room4.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str8, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str15, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test01748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01748");
        room.Room room4 = new room.Room("", (int) (short) 10, "Room hi! | hi! - hi! | Capacity: 0", "hi!");
        java.lang.String str5 = room4.toString();
        java.lang.String str6 = room4.getBuildingName();
        room.SensorObserver sensorObserver7 = null;
        room4.removeObserver(sensorObserver7);
        java.lang.String str9 = room4.getRoomNumber();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10" + "'", str5, "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str6, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test01749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01749");
        room.Room room4 = new room.Room(" - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi!", 0, "Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 100 | hi! - hi! - hi! - hi! | Capacity: 0", "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi!");
        java.lang.String str5 = room4.toString();
        boolean boolean6 = room4.isOccupied();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Room  - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! | Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 100 | hi! - hi! - hi! - hi! | Capacity: 0 - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 0" + "'", str5, "Room  - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! | Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 100 | hi! - hi! - hi! - hi! | Capacity: 0 - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 0");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test01750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01750");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        room.SensorObserver sensorObserver5 = null;
        room4.addObserver(sensorObserver5);
        java.lang.String str7 = room4.getScannedID();
        room.SensorObserver sensorObserver8 = null;
        room4.removeObserver(sensorObserver8);
        room.SensorObserver sensorObserver10 = null;
        room4.addObserver(sensorObserver10);
        java.lang.String str12 = room4.getFullLocation();
        boolean boolean13 = room4.isEnabled();
        java.lang.String str14 = room4.toString();
        java.lang.String str15 = room4.getRoomID();
        boolean boolean16 = room4.isUnderMaintenance();
        // The following exception was thrown during execution in test generation
        try {
            room4.setScannedID("Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 | hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 0");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi! - hi!" + "'", str12, "hi! - hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str14, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test01751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01751");
        room.Room room4 = new room.Room("Room hi! | hi! - hi! | Capacity: 0", (int) (byte) 10, "hi!", "");
        room4.setUnderMaintenance(true);
        java.lang.String str7 = room4.toString();
        room.SensorObserver sensorObserver8 = null;
        room4.addObserver(sensorObserver8);
        boolean boolean10 = room4.isUnderMaintenance();
        boolean boolean11 = room4.isUnderMaintenance();
        // The following exception was thrown during execution in test generation
        try {
            room4.setOccupied(true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10" + "'", str7, "Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test01752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01752");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        java.lang.String str5 = room4.getScannedID();
        room4.setScannedID("hi!");
        java.lang.String str8 = room4.getBuildingName();
        int int9 = room4.getCapacity();
        room.SensorObserver sensorObserver10 = null;
        room4.addObserver(sensorObserver10);
        java.lang.String str12 = room4.getRoomNumber();
        room.SensorObserver sensorObserver13 = null;
        room4.removeObserver(sensorObserver13);
        room4.setOccupied(true);
        room4.setUnderMaintenance(false);
        java.lang.String str19 = room4.getRoomID();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test01753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01753");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        java.lang.String str5 = room4.getScannedID();
        room4.setScannedID("hi!");
        room4.setUnderMaintenance(true);
        room4.setOccupied(true);
        room4.setOccupied(false);
        java.lang.String str14 = room4.toString();
        room.SensorObserver sensorObserver15 = null;
        room4.addObserver(sensorObserver15);
        java.lang.String str17 = room4.getRoomNumber();
        java.lang.Class<?> wildcardClass18 = room4.getClass();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str14, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test01754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01754");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        room.SensorObserver sensorObserver5 = null;
        room4.addObserver(sensorObserver5);
        java.lang.String str7 = room4.getScannedID();
        java.lang.String str8 = room4.getFullLocation();
        int int9 = room4.getCapacity();
        java.lang.String str10 = room4.getRoomID();
        room.SensorObserver sensorObserver11 = null;
        room4.addObserver(sensorObserver11);
        boolean boolean13 = room4.isOccupied();
        boolean boolean14 = room4.isUnderMaintenance();
        java.lang.String str15 = room4.getBuildingName();
        room.SensorObserver sensorObserver16 = null;
        room4.removeObserver(sensorObserver16);
        java.lang.String str18 = room4.getRoomNumber();
        java.lang.String str19 = room4.getBuildingName();
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi! - hi!" + "'", str8, "hi! - hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test01755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01755");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        java.lang.String str5 = room4.getScannedID();
        room4.setScannedID("hi!");
        room4.setUnderMaintenance(true);
        room4.setOccupied(true);
        room4.setOccupied(false);
        java.lang.String str14 = room4.toString();
        room.SensorObserver sensorObserver15 = null;
        room4.addObserver(sensorObserver15);
        java.lang.String str17 = room4.toString();
        // The following exception was thrown during execution in test generation
        try {
            room4.notifyObservers();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str14, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str17, "Room hi! | hi! - hi! | Capacity: 0");
    }

    @Test
    public void test01756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01756");
        room.Room room4 = new room.Room("Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100", (int) (short) 1, "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi!", "Room hi! | hi! - hi! | Capacity: 0");
        room4.notifyObservers();
        java.lang.String str6 = room4.toString();
        room.SensorObserver sensorObserver7 = null;
        room4.removeObserver(sensorObserver7);
        java.lang.Class<?> wildcardClass9 = room4.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 1" + "'", str6, "Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 1");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test01757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01757");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        java.lang.String str5 = room4.getScannedID();
        room4.setScannedID("hi!");
        room4.setUnderMaintenance(true);
        java.lang.String str10 = room4.getScannedID();
        java.lang.String str11 = room4.getFullLocation();
        room4.setScannedID("Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi!");
        room.SensorObserver sensorObserver14 = null;
        room4.removeObserver(sensorObserver14);
        room4.setEnabled(true);
        room.SensorObserver sensorObserver18 = null;
        room4.addObserver(sensorObserver18);
        java.lang.String str20 = room4.getRoomID();
        // The following exception was thrown during execution in test generation
        try {
            room4.setScannedID("Room Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! |  - Room hi! | hi! - hi! | Capacity: 0 - Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: -1");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi! - hi!" + "'", str11, "hi! - hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test01758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01758");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        room.SensorObserver sensorObserver5 = null;
        room4.addObserver(sensorObserver5);
        java.lang.String str7 = room4.toString();
        java.lang.String str8 = room4.toString();
        java.lang.String str9 = room4.getBuildingName();
        int int10 = room4.getCapacity();
        boolean boolean11 = room4.isOccupied();
        java.lang.String str12 = room4.getRoomNumber();
        java.lang.String str13 = room4.getBuildingName();
        // The following exception was thrown during execution in test generation
        try {
            room4.setScannedID("Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | hi! - hi! | Capacity: 0 - hi! - ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str7, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str8, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test01759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01759");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        room.SensorObserver sensorObserver5 = null;
        room4.addObserver(sensorObserver5);
        java.lang.String str7 = room4.getScannedID();
        java.lang.String str8 = room4.getFullLocation();
        boolean boolean9 = room4.isOccupied();
        boolean boolean10 = room4.isOccupied();
        java.lang.String str11 = room4.getFullLocation();
        java.lang.String str12 = room4.getRoomNumber();
        // The following exception was thrown during execution in test generation
        try {
            room4.setUnderMaintenance(false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi! - hi!" + "'", str8, "hi! - hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi! - hi!" + "'", str11, "hi! - hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test01760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01760");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        java.lang.String str5 = room4.getScannedID();
        room4.setScannedID("hi!");
        room4.setUnderMaintenance(true);
        room.SensorObserver sensorObserver10 = null;
        room4.removeObserver(sensorObserver10);
        boolean boolean12 = room4.isOccupied();
        room4.setOccupied(true);
        room.SensorObserver sensorObserver15 = null;
        room4.addObserver(sensorObserver15);
        // The following exception was thrown during execution in test generation
        try {
            room4.setOccupied(false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test01761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01761");
        room.Room room4 = new room.Room("", (int) (short) 10, "Room hi! | hi! - hi! | Capacity: 0", "hi!");
        java.lang.String str5 = room4.toString();
        java.lang.String str6 = room4.getBuildingName();
        java.lang.String str7 = room4.getFullLocation();
        boolean boolean8 = room4.isUnderMaintenance();
        room4.setOccupied(false);
        boolean boolean11 = room4.isUnderMaintenance();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10" + "'", str5, "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str6, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0 - hi!" + "'", str7, "Room hi! | hi! - hi! | Capacity: 0 - hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test01762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01762");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        java.lang.String str5 = room4.getScannedID();
        room4.setScannedID("hi!");
        room4.setUnderMaintenance(true);
        room4.setOccupied(true);
        java.lang.String str12 = room4.getRoomNumber();
        java.lang.String str13 = room4.getScannedID();
        java.lang.String str14 = room4.getRoomID();
        room4.setOccupied(false);
        room4.setEnabled(false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test01763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01763");
        room.Room room4 = new room.Room("Room hi! | hi! - hi! | Capacity: 0", (int) (byte) 100, "Room hi! | hi! - hi! | Capacity: 0 - hi!", "hi!");
        java.lang.String str5 = room4.getRoomID();
        room4.setScannedID("hi! - hi!");
        java.lang.String str8 = room4.toString();
        room4.setOccupied(true);
        java.lang.String str11 = room4.getRoomNumber();
        room4.notifyObservers();
        room4.setUnderMaintenance(false);
        java.lang.Class<?> wildcardClass15 = room4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str5, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Room Room hi! | hi! - hi! | Capacity: 0 | Room hi! | hi! - hi! | Capacity: 0 - hi! - hi! | Capacity: 100" + "'", str8, "Room Room hi! | hi! - hi! | Capacity: 0 | Room hi! | hi! - hi! | Capacity: 0 - hi! - hi! | Capacity: 100");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test01764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01764");
        room.Room room4 = new room.Room("hi!", (int) (byte) 1, "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10", "hi!");
        room4.notifyObservers();
        room4.setUnderMaintenance(false);
        room.SensorObserver sensorObserver8 = null;
        room4.removeObserver(sensorObserver8);
        java.lang.String str10 = room4.toString();
        boolean boolean11 = room4.isUnderMaintenance();
        java.lang.String str12 = room4.toString();
        room.SensorObserver sensorObserver13 = null;
        room4.removeObserver(sensorObserver13);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Room hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 1" + "'", str10, "Room hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 1");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Room hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 1" + "'", str12, "Room hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 1");
    }

    @Test
    public void test01765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01765");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        java.lang.String str5 = room4.getScannedID();
        room4.setScannedID("hi!");
        boolean boolean8 = room4.isEnabled();
        int int9 = room4.getCapacity();
        boolean boolean10 = room4.isOccupied();
        room4.notifyObservers();
        boolean boolean12 = room4.isEnabled();
        room4.setEnabled(true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test01766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01766");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        room.SensorObserver sensorObserver5 = null;
        room4.addObserver(sensorObserver5);
        java.lang.String str7 = room4.getScannedID();
        room.SensorObserver sensorObserver8 = null;
        room4.removeObserver(sensorObserver8);
        java.lang.String str10 = room4.getRoomNumber();
        java.lang.String str11 = room4.toString();
        java.lang.String str12 = room4.getScannedID();
        java.lang.String str13 = room4.getBuildingName();
        boolean boolean14 = room4.isUnderMaintenance();
        java.lang.String str15 = room4.getRoomNumber();
        room4.notifyObservers();
        room.SensorObserver sensorObserver17 = null;
        room4.removeObserver(sensorObserver17);
        java.lang.String str19 = room4.getScannedID();
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str11, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test01767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01767");
        room.Room room4 = new room.Room("", 97, "Room Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! - hi! - hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: -1", "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10");
        room.SensorObserver sensorObserver5 = null;
        room4.addObserver(sensorObserver5);
    }

    @Test
    public void test01768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01768");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        room.SensorObserver sensorObserver5 = null;
        room4.addObserver(sensorObserver5);
        java.lang.String str7 = room4.getScannedID();
        room.SensorObserver sensorObserver8 = null;
        room4.removeObserver(sensorObserver8);
        java.lang.String str10 = room4.getRoomNumber();
        java.lang.String str11 = room4.toString();
        java.lang.String str12 = room4.getScannedID();
        room4.notifyObservers();
        room4.setUnderMaintenance(false);
        boolean boolean16 = room4.isOccupied();
        room4.setOccupied(true);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str11, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test01769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01769");
        room.Room room4 = new room.Room("", (int) (short) 10, "Room hi! | hi! - hi! | Capacity: 0", "hi!");
        java.lang.String str5 = room4.toString();
        room4.setUnderMaintenance(true);
        room4.setScannedID("");
        boolean boolean10 = room4.isEnabled();
        room.SensorObserver sensorObserver11 = null;
        room4.addObserver(sensorObserver11);
        // The following exception was thrown during execution in test generation
        try {
            room4.setUnderMaintenance(true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10" + "'", str5, "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test01770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01770");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        java.lang.String str5 = room4.getScannedID();
        room4.setScannedID("hi!");
        boolean boolean8 = room4.isEnabled();
        room.SensorObserver sensorObserver9 = null;
        room4.removeObserver(sensorObserver9);
        room.SensorObserver sensorObserver11 = null;
        room4.addObserver(sensorObserver11);
        boolean boolean13 = room4.isEnabled();
        java.lang.String str14 = room4.getBuildingName();
        java.lang.String str15 = room4.getFullLocation();
        java.lang.String str16 = room4.getBuildingName();
        boolean boolean17 = room4.isOccupied();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi! - hi!" + "'", str15, "hi! - hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test01771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01771");
        room.Room room4 = new room.Room(" - Room hi! | hi! - hi! | Capacity: 0", (int) (byte) 100, "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi!", "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10");
        boolean boolean5 = room4.isUnderMaintenance();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test01772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01772");
        room.Room room4 = new room.Room("hi!", (int) (byte) 100, "", "Room hi! | hi! - hi! | Capacity: 0");
        java.lang.String str5 = room4.getScannedID();
        java.lang.String str6 = room4.getBuildingName();
        room4.setUnderMaintenance(false);
        boolean boolean9 = room4.isOccupied();
        room4.setScannedID("hi!");
        room.SensorObserver sensorObserver12 = null;
        room4.removeObserver(sensorObserver12);
        room.SensorObserver sensorObserver14 = null;
        room4.addObserver(sensorObserver14);
        java.lang.String str16 = room4.getFullLocation();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + " - Room hi! | hi! - hi! | Capacity: 0" + "'", str16, " - Room hi! | hi! - hi! | Capacity: 0");
    }

    @Test
    public void test01773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01773");
        room.Room room4 = new room.Room("hi!", (int) (byte) 100, "", "Room hi! | hi! - hi! | Capacity: 0");
        room4.setScannedID("");
        room4.setOccupied(true);
        room4.setScannedID("Room hi! | hi! - hi! - Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | Capacity: 0");
        boolean boolean11 = room4.isEnabled();
        room4.setOccupied(true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test01774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01774");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        java.lang.String str5 = room4.getScannedID();
        room4.setScannedID("hi!");
        room4.setUnderMaintenance(true);
        room.SensorObserver sensorObserver10 = null;
        room4.addObserver(sensorObserver10);
        boolean boolean12 = room4.isUnderMaintenance();
        // The following exception was thrown during execution in test generation
        try {
            room4.setOccupied(true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test01775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01775");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        room.SensorObserver sensorObserver5 = null;
        room4.addObserver(sensorObserver5);
        java.lang.String str7 = room4.getScannedID();
        java.lang.String str8 = room4.getFullLocation();
        boolean boolean9 = room4.isOccupied();
        boolean boolean10 = room4.isOccupied();
        room.SensorObserver sensorObserver11 = null;
        room4.removeObserver(sensorObserver11);
        java.lang.String str13 = room4.getRoomNumber();
        java.lang.String str14 = room4.getRoomNumber();
        room4.setUnderMaintenance(false);
        room.SensorObserver sensorObserver17 = null;
        room4.removeObserver(sensorObserver17);
        boolean boolean19 = room4.isOccupied();
        room4.setOccupied(true);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi! - hi!" + "'", str8, "hi! - hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test01776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01776");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        room.SensorObserver sensorObserver5 = null;
        room4.addObserver(sensorObserver5);
        java.lang.String str7 = room4.getScannedID();
        java.lang.String str8 = room4.getFullLocation();
        boolean boolean9 = room4.isOccupied();
        boolean boolean10 = room4.isOccupied();
        java.lang.String str11 = room4.getFullLocation();
        java.lang.String str12 = room4.getRoomID();
        room.SensorObserver sensorObserver13 = null;
        room4.addObserver(sensorObserver13);
        java.lang.String str15 = room4.getScannedID();
        boolean boolean16 = room4.isEnabled();
        // The following exception was thrown during execution in test generation
        try {
            room4.setScannedID("Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi! - hi!" + "'", str8, "hi! - hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi! - hi!" + "'", str11, "hi! - hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test01777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01777");
        room.Room room4 = new room.Room("Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 97", (int) (short) 10, "Room hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 1", "Room hi! | hi! - hi! | Capacity: 0 - hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 100 - Room hi! | hi! - hi! | Capacity: 0 - hi! - ");
        java.lang.Class<?> wildcardClass5 = room4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test01778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01778");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        room.SensorObserver sensorObserver5 = null;
        room4.addObserver(sensorObserver5);
        java.lang.String str7 = room4.getScannedID();
        java.lang.String str8 = room4.getFullLocation();
        boolean boolean9 = room4.isOccupied();
        boolean boolean10 = room4.isOccupied();
        java.lang.String str11 = room4.getFullLocation();
        boolean boolean12 = room4.isUnderMaintenance();
        boolean boolean13 = room4.isUnderMaintenance();
        boolean boolean14 = room4.isEnabled();
        // The following exception was thrown during execution in test generation
        try {
            room4.setOccupied(false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi! - hi!" + "'", str8, "hi! - hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi! - hi!" + "'", str11, "hi! - hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test01779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01779");
        room.Room room4 = new room.Room("Room hi! | hi! - hi! | Capacity: 0 - hi!", (int) (short) 10, "Room hi! | hi! - hi! | Capacity: 0", "Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10");
        int int5 = room4.getCapacity();
        room4.setScannedID("Room hi! | hi! - hi! | Capacity: 0 - hi!");
        java.lang.String str8 = room4.getFullLocation();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0 - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10" + "'", str8, "Room hi! | hi! - hi! | Capacity: 0 - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10");
    }

    @Test
    public void test01780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01780");
        room.Room room4 = new room.Room("hi!", (int) (byte) 100, "", "Room hi! | hi! - hi! | Capacity: 0");
        java.lang.String str5 = room4.getRoomNumber();
        boolean boolean6 = room4.isEnabled();
        room.SensorObserver sensorObserver7 = null;
        room4.removeObserver(sensorObserver7);
        java.lang.String str9 = room4.getRoomID();
        java.lang.String str10 = room4.getFullLocation();
        int int11 = room4.getCapacity();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str5, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + " - Room hi! | hi! - hi! | Capacity: 0" + "'", str10, " - Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
    }

    @Test
    public void test01781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01781");
        room.Room room4 = new room.Room("Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi!", (-1), " - Room hi! | hi! - hi! | Capacity: 0", "Room hi! | hi! - hi! | Capacity: 0 - hi!");
        room4.setScannedID("Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10");
        java.lang.String str7 = room4.toString();
        java.lang.String str8 = room4.getRoomID();
        boolean boolean9 = room4.isEnabled();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Room Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! |  - Room hi! | hi! - hi! | Capacity: 0 - Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: -1" + "'", str7, "Room Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! |  - Room hi! | hi! - hi! | Capacity: 0 - Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: -1");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi!" + "'", str8, "Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test01782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01782");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        java.lang.String str5 = room4.getScannedID();
        room4.setScannedID("hi!");
        room4.setUnderMaintenance(true);
        java.lang.String str10 = room4.getScannedID();
        java.lang.String str11 = room4.getScannedID();
        int int12 = room4.getCapacity();
        boolean boolean13 = room4.isUnderMaintenance();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test01783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01783");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        room.SensorObserver sensorObserver5 = null;
        room4.addObserver(sensorObserver5);
        java.lang.String str7 = room4.getScannedID();
        room.SensorObserver sensorObserver8 = null;
        room4.removeObserver(sensorObserver8);
        room.SensorObserver sensorObserver10 = null;
        room4.addObserver(sensorObserver10);
        java.lang.String str12 = room4.getFullLocation();
        int int13 = room4.getCapacity();
        int int14 = room4.getCapacity();
        java.lang.String str15 = room4.getBuildingName();
        boolean boolean16 = room4.isOccupied();
        // The following exception was thrown during execution in test generation
        try {
            room4.setScannedID("Room hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 1");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi! - hi!" + "'", str12, "hi! - hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test01784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01784");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        room.SensorObserver sensorObserver5 = null;
        room4.addObserver(sensorObserver5);
        java.lang.String str7 = room4.toString();
        room.SensorObserver sensorObserver8 = null;
        room4.addObserver(sensorObserver8);
        room.SensorObserver sensorObserver10 = null;
        room4.removeObserver(sensorObserver10);
        room.SensorObserver sensorObserver12 = null;
        room4.removeObserver(sensorObserver12);
        java.lang.String str14 = room4.getFullLocation();
        room4.setUnderMaintenance(false);
        java.lang.String str17 = room4.getFullLocation();
        room4.setEnabled(true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str7, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi! - hi!" + "'", str14, "hi! - hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi! - hi!" + "'", str17, "hi! - hi!");
    }

    @Test
    public void test01785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01785");
        room.Room room4 = new room.Room("hi!", (int) (byte) 100, "", "Room hi! | hi! - hi! | Capacity: 0");
        room4.notifyObservers();
        room.SensorObserver sensorObserver6 = null;
        room4.removeObserver(sensorObserver6);
        java.lang.String str8 = room4.toString();
        room4.setUnderMaintenance(true);
        boolean boolean11 = room4.isUnderMaintenance();
        int int12 = room4.getCapacity();
        room.SensorObserver sensorObserver13 = null;
        room4.removeObserver(sensorObserver13);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100" + "'", str8, "Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
    }

    @Test
    public void test01786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01786");
        room.Room room4 = new room.Room(" - hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10", (int) (short) 0, "hi! - hi! - Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 97", "Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 100 | hi! - hi! - hi! - hi! | Capacity: 0");
        java.lang.String str5 = room4.getScannedID();
        java.lang.String str6 = room4.getRoomID();
        java.lang.String str7 = room4.getRoomNumber();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + " - hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10" + "'", str6, " - hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 100 | hi! - hi! - hi! - hi! | Capacity: 0" + "'", str7, "Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 100 | hi! - hi! - hi! - hi! | Capacity: 0");
    }

    @Test
    public void test01787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01787");
        room.Room room4 = new room.Room("hi!", (int) (byte) 100, "", "Room hi! | hi! - hi! | Capacity: 0");
        room4.notifyObservers();
        room.SensorObserver sensorObserver6 = null;
        room4.removeObserver(sensorObserver6);
        java.lang.String str8 = room4.toString();
        room.SensorObserver sensorObserver9 = null;
        room4.removeObserver(sensorObserver9);
        room.SensorObserver sensorObserver11 = null;
        room4.addObserver(sensorObserver11);
        boolean boolean13 = room4.isUnderMaintenance();
        // The following exception was thrown during execution in test generation
        try {
            room4.notifyObservers();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100" + "'", str8, "Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test01788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01788");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        java.lang.String str5 = room4.getScannedID();
        room4.setScannedID("hi!");
        java.lang.String str8 = room4.getBuildingName();
        room4.setEnabled(false);
        room4.notifyObservers();
        java.lang.String str12 = room4.getRoomID();
        java.lang.String str13 = room4.toString();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str13, "Room hi! | hi! - hi! | Capacity: 0");
    }

    @Test
    public void test01789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01789");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        java.lang.String str5 = room4.toString();
        room.SensorObserver sensorObserver6 = null;
        room4.addObserver(sensorObserver6);
        // The following exception was thrown during execution in test generation
        try {
            room4.setEnabled(true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str5, "Room hi! | hi! - hi! | Capacity: 0");
    }

    @Test
    public void test01790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01790");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        boolean boolean5 = room4.isEnabled();
        room.SensorObserver sensorObserver6 = null;
        room4.addObserver(sensorObserver6);
        java.lang.String str8 = room4.toString();
        // The following exception was thrown during execution in test generation
        try {
            room4.setOccupied(true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str8, "Room hi! | hi! - hi! | Capacity: 0");
    }

    @Test
    public void test01791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01791");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        room.SensorObserver sensorObserver5 = null;
        room4.addObserver(sensorObserver5);
        java.lang.String str7 = room4.toString();
        room.SensorObserver sensorObserver8 = null;
        room4.removeObserver(sensorObserver8);
        int int10 = room4.getCapacity();
        java.lang.String str11 = room4.getBuildingName();
        room4.setEnabled(true);
        boolean boolean14 = room4.isEnabled();
        room4.setOccupied(false);
        room.SensorObserver sensorObserver17 = null;
        room4.removeObserver(sensorObserver17);
        room4.notifyObservers();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str7, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test01792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01792");
        room.Room room4 = new room.Room("hi!", 1, "Room hi! | hi! - hi! | Capacity: 0 - hi!", "Room hi! | hi! - hi! | Capacity: 0 - hi!");
        int int5 = room4.getCapacity();
        room4.setUnderMaintenance(false);
        room.SensorObserver sensorObserver8 = null;
        room4.addObserver(sensorObserver8);
        boolean boolean10 = room4.isOccupied();
        java.lang.String str11 = room4.getBuildingName();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0 - hi!" + "'", str11, "Room hi! | hi! - hi! | Capacity: 0 - hi!");
    }

    @Test
    public void test01793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01793");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        room.SensorObserver sensorObserver5 = null;
        room4.addObserver(sensorObserver5);
        java.lang.String str7 = room4.getScannedID();
        room.SensorObserver sensorObserver8 = null;
        room4.removeObserver(sensorObserver8);
        java.lang.String str10 = room4.getRoomNumber();
        java.lang.String str11 = room4.toString();
        room4.setUnderMaintenance(true);
        room.SensorObserver sensorObserver14 = null;
        room4.addObserver(sensorObserver14);
        int int16 = room4.getCapacity();
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str11, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test01794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01794");
        room.Room room4 = new room.Room("Room hi! | hi! - hi! | Capacity: 0 - hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 100 - Room hi! | hi! - hi! | Capacity: 0 - hi! - ", 100, "Room hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 1 - Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | hi! -  - Room  - Room hi! | hi! - hi! | Capacity: 0 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 0 | Capacity: 10", "Room  - Room hi! | hi! - hi! | Capacity: 0 |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 0");
        room4.setEnabled(true);
        java.lang.Class<?> wildcardClass7 = room4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test01795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01795");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        java.lang.String str5 = room4.getScannedID();
        room4.setScannedID("hi!");
        room4.setUnderMaintenance(true);
        java.lang.String str10 = room4.getFullLocation();
        java.lang.String str11 = room4.getScannedID();
        room4.setScannedID("Room hi! | hi! - hi! - Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | Capacity: 0");
        int int14 = room4.getCapacity();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi! - hi!" + "'", str10, "hi! - hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test01796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01796");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        room.SensorObserver sensorObserver5 = null;
        room4.addObserver(sensorObserver5);
        java.lang.String str7 = room4.getScannedID();
        room.SensorObserver sensorObserver8 = null;
        room4.removeObserver(sensorObserver8);
        java.lang.String str10 = room4.getRoomNumber();
        java.lang.String str11 = room4.toString();
        java.lang.String str12 = room4.getScannedID();
        room4.notifyObservers();
        room4.setUnderMaintenance(false);
        boolean boolean16 = room4.isEnabled();
        java.lang.String str17 = room4.toString();
        room.SensorObserver sensorObserver18 = null;
        room4.removeObserver(sensorObserver18);
        java.lang.Class<?> wildcardClass20 = room4.getClass();
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str11, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str17, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test01797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01797");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        boolean boolean5 = room4.isOccupied();
        boolean boolean6 = room4.isEnabled();
        java.lang.String str7 = room4.getFullLocation();
        room.SensorObserver sensorObserver8 = null;
        room4.addObserver(sensorObserver8);
        room.SensorObserver sensorObserver10 = null;
        room4.removeObserver(sensorObserver10);
        java.lang.String str12 = room4.getScannedID();
        java.lang.String str13 = room4.toString();
        java.lang.String str14 = room4.toString();
        java.lang.String str15 = room4.getFullLocation();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi! - hi!" + "'", str7, "hi! - hi!");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str13, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str14, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi! - hi!" + "'", str15, "hi! - hi!");
    }

    @Test
    public void test01798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01798");
        room.Room room4 = new room.Room("Room hi! | hi! - hi! | Capacity: 0", (int) 'a', "Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi!", "Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi!");
        room4.notifyObservers();
        int int6 = room4.getCapacity();
        room4.notifyObservers();
        java.lang.Class<?> wildcardClass8 = room4.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test01799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01799");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        room.SensorObserver sensorObserver5 = null;
        room4.addObserver(sensorObserver5);
        java.lang.String str7 = room4.getScannedID();
        room.SensorObserver sensorObserver8 = null;
        room4.removeObserver(sensorObserver8);
        java.lang.String str10 = room4.getRoomNumber();
        java.lang.String str11 = room4.toString();
        java.lang.String str12 = room4.getScannedID();
        room4.setUnderMaintenance(true);
        boolean boolean15 = room4.isOccupied();
        java.lang.String str16 = room4.getRoomNumber();
        java.lang.String str17 = room4.toString();
        room4.setUnderMaintenance(false);
        room.SensorObserver sensorObserver20 = null;
        room4.removeObserver(sensorObserver20);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str11, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str17, "Room hi! | hi! - hi! | Capacity: 0");
    }

    @Test
    public void test01800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01800");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        room.SensorObserver sensorObserver5 = null;
        room4.addObserver(sensorObserver5);
        java.lang.String str7 = room4.toString();
        room.SensorObserver sensorObserver8 = null;
        room4.removeObserver(sensorObserver8);
        java.lang.String str10 = room4.toString();
        java.lang.String str11 = room4.getRoomID();
        boolean boolean12 = room4.isUnderMaintenance();
        boolean boolean13 = room4.isOccupied();
        java.lang.String str14 = room4.toString();
        int int15 = room4.getCapacity();
        java.lang.String str16 = room4.getFullLocation();
        boolean boolean17 = room4.isUnderMaintenance();
        room4.setUnderMaintenance(true);
        java.lang.String str20 = room4.getRoomID();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str7, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str10, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str14, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi! - hi!" + "'", str16, "hi! - hi!");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test01801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01801");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        java.lang.String str5 = room4.getScannedID();
        room4.setScannedID("hi!");
        boolean boolean8 = room4.isEnabled();
        int int9 = room4.getCapacity();
        int int10 = room4.getCapacity();
        boolean boolean11 = room4.isOccupied();
        boolean boolean12 = room4.isUnderMaintenance();
        int int13 = room4.getCapacity();
        boolean boolean14 = room4.isUnderMaintenance();
        room4.notifyObservers();
        int int16 = room4.getCapacity();
        java.lang.Class<?> wildcardClass17 = room4.getClass();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test01802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01802");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        java.lang.String str5 = room4.getScannedID();
        room4.setScannedID("hi!");
        boolean boolean8 = room4.isEnabled();
        int int9 = room4.getCapacity();
        boolean boolean10 = room4.isOccupied();
        java.lang.String str11 = room4.getFullLocation();
        room4.setScannedID("Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi!");
        room4.setUnderMaintenance(true);
        java.lang.String str16 = room4.getRoomNumber();
        java.lang.String str17 = room4.toString();
        java.lang.String str18 = room4.getRoomNumber();
        java.lang.String str19 = room4.toString();
        room.SensorObserver sensorObserver20 = null;
        room4.addObserver(sensorObserver20);
        room.SensorObserver sensorObserver22 = null;
        room4.addObserver(sensorObserver22);
        boolean boolean24 = room4.isOccupied();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi! - hi!" + "'", str11, "hi! - hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str17, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str19, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test01803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01803");
        room.Room room4 = new room.Room("hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10", (-1), "Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 | hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 0", "Room hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 1");
        room4.setOccupied(false);
        boolean boolean7 = room4.isOccupied();
        int int8 = room4.getCapacity();
        java.lang.String str9 = room4.getScannedID();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test01804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01804");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        boolean boolean5 = room4.isOccupied();
        java.lang.String str6 = room4.toString();
        java.lang.String str7 = room4.toString();
        java.lang.String str8 = room4.toString();
        java.lang.String str9 = room4.toString();
        room4.setScannedID("Room hi! | hi! - hi! | Capacity: 0 - hi! - hi!");
        java.lang.String str12 = room4.getFullLocation();
        java.lang.Class<?> wildcardClass13 = room4.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str6, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str7, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str8, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str9, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi! - hi!" + "'", str12, "hi! - hi!");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test01805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01805");
        room.Room room4 = new room.Room("Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10", (int) (byte) 100, "Room Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - hi! | Capacity: 1 | Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 | hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 0 - hi! - hi! - Room hi! | hi! - hi! | Capacity: 0 -  - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! | Capacity: 35", "Room Room  | Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! | Capacity: 1 | Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 - Room Room hi! | hi! - hi! | Capacity: 0 | hi! - hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 97 | Capacity: 100");
    }

    @Test
    public void test01806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01806");
        room.Room room4 = new room.Room("Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100", 52, "Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - hi! | Capacity: 1", "Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 100 | hi! - hi! - hi! - hi! | Capacity: 0");
        room4.setScannedID("hi! - hi! - hi! - Room hi! | hi! - hi! | Capacity: 0");
    }

    @Test
    public void test01807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01807");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        java.lang.String str5 = room4.getScannedID();
        room4.setScannedID("hi!");
        boolean boolean8 = room4.isEnabled();
        room.SensorObserver sensorObserver9 = null;
        room4.removeObserver(sensorObserver9);
        room.SensorObserver sensorObserver11 = null;
        room4.addObserver(sensorObserver11);
        java.lang.String str13 = room4.getFullLocation();
        java.lang.String str14 = room4.toString();
        // The following exception was thrown during execution in test generation
        try {
            room4.notifyObservers();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi! - hi!" + "'", str13, "hi! - hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str14, "Room hi! | hi! - hi! | Capacity: 0");
    }

    @Test
    public void test01808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01808");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        java.lang.String str5 = room4.getScannedID();
        room4.setScannedID("hi!");
        room4.setUnderMaintenance(true);
        room4.setOccupied(true);
        java.lang.String str12 = room4.getRoomID();
        room4.setScannedID("Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 100");
        room4.setScannedID("");
        java.lang.String str17 = room4.getRoomID();
        java.lang.String str18 = room4.getFullLocation();
        room4.setOccupied(false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi! - hi!" + "'", str18, "hi! - hi!");
    }

    @Test
    public void test01809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01809");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        boolean boolean5 = room4.isOccupied();
        boolean boolean6 = room4.isEnabled();
        java.lang.String str7 = room4.getFullLocation();
        room.SensorObserver sensorObserver8 = null;
        room4.addObserver(sensorObserver8);
        room.SensorObserver sensorObserver10 = null;
        room4.removeObserver(sensorObserver10);
        java.lang.String str12 = room4.getScannedID();
        boolean boolean13 = room4.isUnderMaintenance();
        java.lang.String str14 = room4.getScannedID();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi! - hi!" + "'", str7, "hi! - hi!");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test01810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01810");
        room.Room room4 = new room.Room("hi!", (int) (byte) 100, "", "Room hi! | hi! - hi! | Capacity: 0");
        room4.setScannedID("");
        boolean boolean7 = room4.isOccupied();
        room4.setOccupied(true);
        boolean boolean10 = room4.isEnabled();
        boolean boolean11 = room4.isEnabled();
        java.lang.String str12 = room4.getBuildingName();
        java.lang.String str13 = room4.getScannedID();
        room4.setUnderMaintenance(true);
        room.SensorObserver sensorObserver16 = null;
        room4.addObserver(sensorObserver16);
        // The following exception was thrown during execution in test generation
        try {
            room4.setOccupied(true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test01811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01811");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        java.lang.String str5 = room4.getScannedID();
        room4.setScannedID("hi!");
        boolean boolean8 = room4.isEnabled();
        int int9 = room4.getCapacity();
        int int10 = room4.getCapacity();
        boolean boolean11 = room4.isOccupied();
        boolean boolean12 = room4.isUnderMaintenance();
        room4.setOccupied(true);
        java.lang.String str15 = room4.getFullLocation();
        room.SensorObserver sensorObserver16 = null;
        room4.removeObserver(sensorObserver16);
        java.lang.String str18 = room4.getBuildingName();
        room4.setEnabled(true);
        int int21 = room4.getCapacity();
        room.SensorObserver sensorObserver22 = null;
        room4.removeObserver(sensorObserver22);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi! - hi!" + "'", str15, "hi! - hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test01812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01812");
        room.Room room4 = new room.Room("", (int) (short) 10, "Room hi! | hi! - hi! | Capacity: 0", "hi!");
        java.lang.String str5 = room4.getFullLocation();
        int int6 = room4.getCapacity();
        java.lang.String str7 = room4.getFullLocation();
        java.lang.String str8 = room4.getScannedID();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0 - hi!" + "'", str5, "Room hi! | hi! - hi! | Capacity: 0 - hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0 - hi!" + "'", str7, "Room hi! | hi! - hi! | Capacity: 0 - hi!");
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test01813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01813");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        boolean boolean5 = room4.isOccupied();
        room4.setEnabled(false);
        java.lang.String str8 = room4.getRoomID();
        room4.notifyObservers();
        room4.setUnderMaintenance(false);
        boolean boolean12 = room4.isEnabled();
        room4.setEnabled(false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test01814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01814");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        room.SensorObserver sensorObserver5 = null;
        room4.addObserver(sensorObserver5);
        java.lang.String str7 = room4.getScannedID();
        room.SensorObserver sensorObserver8 = null;
        room4.removeObserver(sensorObserver8);
        java.lang.String str10 = room4.getRoomNumber();
        java.lang.String str11 = room4.toString();
        room4.setUnderMaintenance(true);
        boolean boolean14 = room4.isEnabled();
        room4.setScannedID("Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | hi! -  - Room  - Room hi! | hi! - hi! | Capacity: 0 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 0 | Capacity: 10");
        java.lang.String str17 = room4.getScannedID();
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str11, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | hi! -  - Room  - Room hi! | hi! - hi! | Capacity: 0 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 0 | Capacity: 10" + "'", str17, "Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | hi! -  - Room  - Room hi! | hi! - hi! | Capacity: 0 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 0 | Capacity: 10");
    }

    @Test
    public void test01815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01815");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        room.SensorObserver sensorObserver5 = null;
        room4.addObserver(sensorObserver5);
        java.lang.String str7 = room4.getScannedID();
        room.SensorObserver sensorObserver8 = null;
        room4.removeObserver(sensorObserver8);
        java.lang.String str10 = room4.getRoomNumber();
        java.lang.String str11 = room4.toString();
        java.lang.String str12 = room4.getScannedID();
        java.lang.String str13 = room4.getBuildingName();
        java.lang.String str14 = room4.getRoomNumber();
        java.lang.Class<?> wildcardClass15 = room4.getClass();
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str11, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test01816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01816");
        room.Room room4 = new room.Room("", (int) (short) 10, "Room hi! | hi! - hi! | Capacity: 0", "hi!");
        java.lang.String str5 = room4.toString();
        room4.setUnderMaintenance(true);
        room4.setScannedID("");
        room4.setEnabled(true);
        java.lang.String str12 = room4.getRoomID();
        java.lang.String str13 = room4.getBuildingName();
        room4.setUnderMaintenance(false);
        java.lang.String str16 = room4.getRoomNumber();
        boolean boolean17 = room4.isEnabled();
        java.lang.String str18 = room4.getRoomID();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10" + "'", str5, "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str13, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test01817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01817");
        room.Room room4 = new room.Room("hi! - hi! - Room hi! | hi! - hi! | Capacity: 0", 10, "hi! - hi!", "Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 97");
        room4.setScannedID("Room hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 1");
        boolean boolean7 = room4.isOccupied();
        room4.setEnabled(false);
        java.lang.String str10 = room4.getFullLocation();
        java.lang.String str11 = room4.getBuildingName();
        int int12 = room4.getCapacity();
        java.lang.String str13 = room4.getFullLocation();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi! - hi! - Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 97" + "'", str10, "hi! - hi! - Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 97");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi! - hi!" + "'", str11, "hi! - hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi! - hi! - Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 97" + "'", str13, "hi! - hi! - Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 97");
    }

    @Test
    public void test01818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01818");
        room.Room room4 = new room.Room("hi!", 1, "Room hi! | hi! - hi! | Capacity: 0 - hi!", "Room hi! | hi! - hi! | Capacity: 0 - hi!");
        int int5 = room4.getCapacity();
        room4.setUnderMaintenance(false);
        room4.setEnabled(true);
        room.SensorObserver sensorObserver10 = null;
        room4.addObserver(sensorObserver10);
        java.lang.String str12 = room4.getScannedID();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test01819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01819");
        room.Room room4 = new room.Room("Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 100", (int) (short) 100, "Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100", "Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi!");
        java.lang.String str5 = room4.getScannedID();
        boolean boolean6 = room4.isUnderMaintenance();
        boolean boolean7 = room4.isUnderMaintenance();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test01820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01820");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        room.SensorObserver sensorObserver5 = null;
        room4.addObserver(sensorObserver5);
        java.lang.String str7 = room4.getScannedID();
        room.SensorObserver sensorObserver8 = null;
        room4.removeObserver(sensorObserver8);
        java.lang.String str10 = room4.getRoomNumber();
        java.lang.String str11 = room4.toString();
        java.lang.String str12 = room4.getScannedID();
        room4.notifyObservers();
        room4.setScannedID("Room hi! | hi! - hi! | Capacity: 0 - hi!");
        room4.setUnderMaintenance(true);
        java.lang.String str18 = room4.getRoomID();
        room.SensorObserver sensorObserver19 = null;
        room4.removeObserver(sensorObserver19);
        room4.setOccupied(false);
        room4.setOccupied(true);
        java.lang.String str25 = room4.getRoomNumber();
        room4.setEnabled(true);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str11, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
    }

    @Test
    public void test01821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01821");
        room.Room room4 = new room.Room("hi! - hi! - Room hi! | hi! - hi! | Capacity: 0", 10, "hi! - hi!", "Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 97");
        room4.setScannedID("Room hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 1");
        boolean boolean7 = room4.isOccupied();
        java.lang.String str8 = room4.getFullLocation();
        room4.setEnabled(true);
        java.lang.String str11 = room4.getBuildingName();
        room4.notifyObservers();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi! - hi! - Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 97" + "'", str8, "hi! - hi! - Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 97");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi! - hi!" + "'", str11, "hi! - hi!");
    }

    @Test
    public void test01822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01822");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        room.SensorObserver sensorObserver5 = null;
        room4.addObserver(sensorObserver5);
        java.lang.String str7 = room4.getScannedID();
        java.lang.String str8 = room4.getFullLocation();
        int int9 = room4.getCapacity();
        java.lang.String str10 = room4.getScannedID();
        java.lang.String str11 = room4.getScannedID();
        java.lang.String str12 = room4.getFullLocation();
        // The following exception was thrown during execution in test generation
        try {
            room4.setUnderMaintenance(false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi! - hi!" + "'", str8, "hi! - hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi! - hi!" + "'", str12, "hi! - hi!");
    }

    @Test
    public void test01823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01823");
        room.Room room4 = new room.Room("Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100", (int) 'a', "hi! - hi!", "Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10");
        room.SensorObserver sensorObserver5 = null;
        room4.removeObserver(sensorObserver5);
        boolean boolean7 = room4.isOccupied();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test01824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01824");
        room.Room room4 = new room.Room("hi!", (int) (byte) 100, "", "Room hi! | hi! - hi! | Capacity: 0");
        java.lang.String str5 = room4.getScannedID();
        java.lang.String str6 = room4.getBuildingName();
        room4.setUnderMaintenance(false);
        room4.setScannedID("Room hi! | hi! - hi! | Capacity: 0 - hi! - ");
        room4.setEnabled(false);
        room4.notifyObservers();
        java.lang.String str14 = room4.getRoomID();
        java.lang.String str15 = room4.getBuildingName();
        room4.setOccupied(false);
        room.SensorObserver sensorObserver18 = null;
        room4.addObserver(sensorObserver18);
        // The following exception was thrown during execution in test generation
        try {
            room4.setUnderMaintenance(false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test01825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01825");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        boolean boolean5 = room4.isOccupied();
        room4.setEnabled(false);
        java.lang.String str8 = room4.getFullLocation();
        java.lang.String str9 = room4.getRoomID();
        int int10 = room4.getCapacity();
        room4.setEnabled(false);
        room4.setUnderMaintenance(true);
        java.lang.String str15 = room4.getRoomID();
        room4.setScannedID("Room hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 1");
        java.lang.String str18 = room4.getBuildingName();
        java.lang.Class<?> wildcardClass19 = room4.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi! - hi!" + "'", str8, "hi! - hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test01826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01826");
        room.Room room4 = new room.Room("Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | hi! - hi! - hi! | Capacity: 0", (int) (short) -1, "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10", "Room Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 97 | Room hi! | hi! - hi! | Capacity: 0 - hi! - hi! - Room hi! | Room hi! | hi! - hi! | Capacity: 0 - hi! - Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 1 | Capacity: 1");
    }

    @Test
    public void test01827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01827");
        room.Room room4 = new room.Room("hi!", (int) (byte) 100, "", "Room hi! | hi! - hi! | Capacity: 0");
        java.lang.String str5 = room4.getScannedID();
        java.lang.String str6 = room4.getBuildingName();
        room4.setUnderMaintenance(false);
        room4.setScannedID("Room hi! | hi! - hi! | Capacity: 0 - hi! - ");
        room4.setEnabled(false);
        room4.setOccupied(true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test01828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01828");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        java.lang.String str5 = room4.getScannedID();
        room4.setScannedID("hi!");
        boolean boolean8 = room4.isUnderMaintenance();
        java.lang.String str9 = room4.toString();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str9, "Room hi! | hi! - hi! | Capacity: 0");
    }

    @Test
    public void test01829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01829");
        room.Room room4 = new room.Room("hi! - hi! - hi!", 1, "hi! - hi!", "Room hi! | hi! - hi! | Capacity: 0");
        java.lang.String str5 = room4.toString();
        room4.notifyObservers();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Room hi! - hi! - hi! | hi! - hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 1" + "'", str5, "Room hi! - hi! - hi! | hi! - hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 1");
    }

    @Test
    public void test01830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01830");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        boolean boolean5 = room4.isOccupied();
        room4.setEnabled(false);
        boolean boolean8 = room4.isUnderMaintenance();
        java.lang.String str9 = room4.getFullLocation();
        java.lang.String str10 = room4.toString();
        java.lang.String str11 = room4.toString();
        java.lang.String str12 = room4.getScannedID();
        java.lang.String str13 = room4.toString();
        java.lang.String str14 = room4.getBuildingName();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi! - hi!" + "'", str9, "hi! - hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str10, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str11, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str13, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test01831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01831");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        java.lang.String str5 = room4.getScannedID();
        room4.setScannedID("hi!");
        room4.setUnderMaintenance(true);
        boolean boolean10 = room4.isOccupied();
        java.lang.String str11 = room4.toString();
        java.lang.String str12 = room4.getRoomID();
        boolean boolean13 = room4.isUnderMaintenance();
        room4.notifyObservers();
        boolean boolean15 = room4.isEnabled();
        java.lang.Class<?> wildcardClass16 = room4.getClass();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str11, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test01832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01832");
        room.Room room4 = new room.Room("Room hi! | hi! - hi! | Capacity: 0 - hi! - ", (int) (short) -1, "Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 100 | hi! - hi! - hi! - hi! | Capacity: 0", "Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 1");
        room.SensorObserver sensorObserver5 = null;
        room4.addObserver(sensorObserver5);
        room.SensorObserver sensorObserver7 = null;
        room4.addObserver(sensorObserver7);
    }

    @Test
    public void test01833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01833");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        java.lang.String str5 = room4.getScannedID();
        room4.setScannedID("hi!");
        room4.setUnderMaintenance(true);
        room4.setOccupied(true);
        room4.setOccupied(false);
        java.lang.String str14 = room4.toString();
        boolean boolean15 = room4.isOccupied();
        room4.setUnderMaintenance(false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str14, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test01834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01834");
        room.Room room4 = new room.Room("Room hi! | hi! - hi! | Capacity: 0", (int) 'a', "Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi!", "Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi!");
        boolean boolean5 = room4.isEnabled();
        java.lang.Class<?> wildcardClass6 = room4.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test01835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01835");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        boolean boolean5 = room4.isOccupied();
        boolean boolean6 = room4.isEnabled();
        java.lang.String str7 = room4.getRoomID();
        room4.setScannedID("hi!");
        room4.setOccupied(false);
        room4.setScannedID("Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 | Capacity: 0");
        java.lang.String str14 = room4.getFullLocation();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi! - hi!" + "'", str14, "hi! - hi!");
    }

    @Test
    public void test01836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01836");
        room.Room room4 = new room.Room("hi!", (int) (byte) 100, "", "Room hi! | hi! - hi! | Capacity: 0");
        room4.setScannedID("");
        boolean boolean7 = room4.isOccupied();
        room4.setOccupied(true);
        boolean boolean10 = room4.isEnabled();
        boolean boolean11 = room4.isEnabled();
        java.lang.String str12 = room4.getScannedID();
        boolean boolean13 = room4.isOccupied();
        boolean boolean14 = room4.isUnderMaintenance();
        java.lang.String str15 = room4.getFullLocation();
        java.lang.String str16 = room4.getScannedID();
        room.SensorObserver sensorObserver17 = null;
        room4.addObserver(sensorObserver17);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + " - Room hi! | hi! - hi! | Capacity: 0" + "'", str15, " - Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test01837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01837");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        room.SensorObserver sensorObserver5 = null;
        room4.addObserver(sensorObserver5);
        java.lang.String str7 = room4.getScannedID();
        room.SensorObserver sensorObserver8 = null;
        room4.removeObserver(sensorObserver8);
        java.lang.String str10 = room4.getRoomNumber();
        java.lang.String str11 = room4.toString();
        java.lang.String str12 = room4.getScannedID();
        room4.setUnderMaintenance(true);
        boolean boolean15 = room4.isOccupied();
        java.lang.String str16 = room4.getRoomNumber();
        java.lang.String str17 = room4.getBuildingName();
        java.lang.String str18 = room4.toString();
        java.lang.Class<?> wildcardClass19 = room4.getClass();
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str11, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str18, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test01838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01838");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        room.SensorObserver sensorObserver5 = null;
        room4.addObserver(sensorObserver5);
        java.lang.String str7 = room4.getScannedID();
        room.SensorObserver sensorObserver8 = null;
        room4.removeObserver(sensorObserver8);
        java.lang.String str10 = room4.getRoomNumber();
        java.lang.String str11 = room4.toString();
        java.lang.String str12 = room4.getScannedID();
        room4.notifyObservers();
        room4.setScannedID("Room hi! | hi! - hi! | Capacity: 0 - hi!");
        int int16 = room4.getCapacity();
        room4.setEnabled(false);
        int int19 = room4.getCapacity();
        boolean boolean20 = room4.isOccupied();
        java.lang.String str21 = room4.getScannedID();
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str11, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0 - hi!" + "'", str21, "Room hi! | hi! - hi! | Capacity: 0 - hi!");
    }

    @Test
    public void test01839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01839");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        java.lang.String str5 = room4.toString();
        room.SensorObserver sensorObserver6 = null;
        room4.addObserver(sensorObserver6);
        room.SensorObserver sensorObserver8 = null;
        room4.addObserver(sensorObserver8);
        java.lang.String str10 = room4.getScannedID();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str5, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test01840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01840");
        room.Room room4 = new room.Room("hi!", (int) (byte) 100, "", "Room hi! | hi! - hi! | Capacity: 0");
        java.lang.String str5 = room4.getRoomNumber();
        room.SensorObserver sensorObserver6 = null;
        room4.addObserver(sensorObserver6);
        // The following exception was thrown during execution in test generation
        try {
            room4.setScannedID("Room hi! -  | Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 0");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str5, "Room hi! | hi! - hi! | Capacity: 0");
    }

    @Test
    public void test01841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01841");
        room.Room room4 = new room.Room("Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 1", 35, "Room Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Room  - Room hi! | hi! - hi! | Capacity: 0 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 0 - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 1", "Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! - ");
    }

    @Test
    public void test01842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01842");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        java.lang.String str5 = room4.getScannedID();
        room4.setScannedID("hi!");
        boolean boolean8 = room4.isEnabled();
        int int9 = room4.getCapacity();
        boolean boolean10 = room4.isOccupied();
        room4.setUnderMaintenance(true);
        room4.setEnabled(false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test01843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01843");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        room.SensorObserver sensorObserver5 = null;
        room4.addObserver(sensorObserver5);
        java.lang.String str7 = room4.getScannedID();
        room.SensorObserver sensorObserver8 = null;
        room4.removeObserver(sensorObserver8);
        java.lang.String str10 = room4.getRoomNumber();
        java.lang.String str11 = room4.toString();
        java.lang.String str12 = room4.getScannedID();
        java.lang.String str13 = room4.getBuildingName();
        java.lang.String str14 = room4.getFullLocation();
        java.lang.String str15 = room4.getBuildingName();
        boolean boolean16 = room4.isOccupied();
        room4.setUnderMaintenance(true);
        java.lang.String str19 = room4.getFullLocation();
        room4.setEnabled(false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str11, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi! - hi!" + "'", str14, "hi! - hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi! - hi!" + "'", str19, "hi! - hi!");
    }

    @Test
    public void test01844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01844");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        room.SensorObserver sensorObserver5 = null;
        room4.addObserver(sensorObserver5);
        java.lang.String str7 = room4.toString();
        java.lang.String str8 = room4.toString();
        java.lang.String str9 = room4.getBuildingName();
        int int10 = room4.getCapacity();
        boolean boolean11 = room4.isOccupied();
        room.SensorObserver sensorObserver12 = null;
        room4.removeObserver(sensorObserver12);
        java.lang.String str14 = room4.getBuildingName();
        room4.setUnderMaintenance(false);
        room4.setEnabled(true);
        boolean boolean19 = room4.isEnabled();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str7, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str8, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test01845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01845");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        java.lang.String str5 = room4.getScannedID();
        room4.setScannedID("hi!");
        room4.setUnderMaintenance(true);
        room4.setOccupied(true);
        room4.setScannedID("Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100");
        java.lang.Class<?> wildcardClass14 = room4.getClass();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test01846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01846");
        room.Room room4 = new room.Room("hi!", (int) (byte) 100, "", "Room hi! | hi! - hi! | Capacity: 0");
        java.lang.String str5 = room4.getScannedID();
        java.lang.String str6 = room4.getBuildingName();
        room4.setUnderMaintenance(false);
        boolean boolean9 = room4.isOccupied();
        int int10 = room4.getCapacity();
        java.lang.String str11 = room4.getBuildingName();
        java.lang.String str12 = room4.getScannedID();
        boolean boolean13 = room4.isEnabled();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test01847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01847");
        room.Room room4 = new room.Room("hi!", (int) (byte) 100, "", "Room hi! | hi! - hi! | Capacity: 0");
        java.lang.String str5 = room4.toString();
        java.lang.String str6 = room4.getFullLocation();
        room.SensorObserver sensorObserver7 = null;
        room4.removeObserver(sensorObserver7);
        java.lang.String str9 = room4.getScannedID();
        int int10 = room4.getCapacity();
        int int11 = room4.getCapacity();
        java.lang.String str12 = room4.getFullLocation();
        boolean boolean13 = room4.isOccupied();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100" + "'", str5, "Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + " - Room hi! | hi! - hi! | Capacity: 0" + "'", str6, " - Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + " - Room hi! | hi! - hi! | Capacity: 0" + "'", str12, " - Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test01848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01848");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        room.SensorObserver sensorObserver5 = null;
        room4.addObserver(sensorObserver5);
        java.lang.String str7 = room4.toString();
        room.SensorObserver sensorObserver8 = null;
        room4.addObserver(sensorObserver8);
        room.SensorObserver sensorObserver10 = null;
        room4.removeObserver(sensorObserver10);
        room.SensorObserver sensorObserver12 = null;
        room4.removeObserver(sensorObserver12);
        java.lang.String str14 = room4.getFullLocation();
        room4.setUnderMaintenance(false);
        java.lang.Class<?> wildcardClass17 = room4.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str7, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi! - hi!" + "'", str14, "hi! - hi!");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test01849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01849");
        room.Room room4 = new room.Room("Room hi! | hi! - hi! | Capacity: 0", (int) 'a', "hi!", "hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10");
        java.lang.String str5 = room4.toString();
        room4.setOccupied(true);
        room.SensorObserver sensorObserver8 = null;
        room4.addObserver(sensorObserver8);
        boolean boolean10 = room4.isEnabled();
        java.lang.Class<?> wildcardClass11 = room4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Room Room hi! | hi! - hi! | Capacity: 0 | hi! - hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 97" + "'", str5, "Room Room hi! | hi! - hi! | Capacity: 0 | hi! - hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 97");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test01850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01850");
        room.Room room4 = new room.Room("Room hi! | hi! - hi! | Capacity: 0 - hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 100 - Room hi! | hi! - hi! | Capacity: 0 - hi! - ", 100, "Room hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 1 - Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | hi! -  - Room  - Room hi! | hi! - hi! | Capacity: 0 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 0 | Capacity: 10", "Room  - Room hi! | hi! - hi! | Capacity: 0 |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 0");
        java.lang.String str5 = room4.getRoomID();
        room4.setUnderMaintenance(false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0 - hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 100 - Room hi! | hi! - hi! | Capacity: 0 - hi! - " + "'", str5, "Room hi! | hi! - hi! | Capacity: 0 - hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 100 - Room hi! | hi! - hi! | Capacity: 0 - hi! - ");
    }

    @Test
    public void test01851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01851");
        room.Room room4 = new room.Room("Room hi! | hi! - hi! | Capacity: 0", (int) 'a', "hi!", "hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10");
        boolean boolean5 = room4.isOccupied();
        java.lang.String str6 = room4.toString();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Room Room hi! | hi! - hi! | Capacity: 0 | hi! - hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 97" + "'", str6, "Room Room hi! | hi! - hi! | Capacity: 0 | hi! - hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 97");
    }

    @Test
    public void test01852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01852");
        room.Room room4 = new room.Room("Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | Room hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 1 - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! | Capacity: 97", (int) (byte) 1, "Room hi! | hi! - hi! - Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | Capacity: 0", " - hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10");
        java.lang.String str5 = room4.getFullLocation();
        boolean boolean6 = room4.isOccupied();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Room hi! | hi! - hi! - Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | Capacity: 0 -  - hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10" + "'", str5, "Room hi! | hi! - hi! - Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | Capacity: 0 -  - hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test01853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01853");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        room.SensorObserver sensorObserver5 = null;
        room4.addObserver(sensorObserver5);
        java.lang.String str7 = room4.getScannedID();
        java.lang.String str8 = room4.getFullLocation();
        int int9 = room4.getCapacity();
        java.lang.String str10 = room4.getRoomID();
        room.SensorObserver sensorObserver11 = null;
        room4.addObserver(sensorObserver11);
        java.lang.String str13 = room4.getBuildingName();
        java.lang.Class<?> wildcardClass14 = room4.getClass();
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi! - hi!" + "'", str8, "hi! - hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test01854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01854");
        room.Room room4 = new room.Room("Room Room hi! | hi! - hi! | Capacity: 0 | Room hi! | hi! - hi! | Capacity: 0 - hi! - hi! | Capacity: 100", (-1), "", "hi! - hi! - Room hi! | hi! - hi! | Capacity: 0");
        room4.setOccupied(false);
        boolean boolean7 = room4.isOccupied();
        java.lang.String str8 = room4.getRoomID();
        java.lang.String str9 = room4.getBuildingName();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Room Room hi! | hi! - hi! | Capacity: 0 | Room hi! | hi! - hi! | Capacity: 0 - hi! - hi! | Capacity: 100" + "'", str8, "Room Room hi! | hi! - hi! | Capacity: 0 | Room hi! | hi! - hi! | Capacity: 0 - hi! - hi! | Capacity: 100");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test01855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01855");
        room.Room room4 = new room.Room("", (int) (short) 10, "Room hi! | hi! - hi! | Capacity: 0", "hi!");
        java.lang.String str5 = room4.toString();
        java.lang.String str6 = room4.getBuildingName();
        boolean boolean7 = room4.isOccupied();
        java.lang.String str8 = room4.getRoomID();
        java.lang.String str9 = room4.getBuildingName();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10" + "'", str5, "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str6, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str9, "Room hi! | hi! - hi! | Capacity: 0");
    }

    @Test
    public void test01856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01856");
        room.Room room4 = new room.Room("hi!", (int) (byte) 1, "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10", "hi!");
        room4.notifyObservers();
        room4.setUnderMaintenance(false);
        room4.setOccupied(true);
        java.lang.String str10 = room4.getScannedID();
        java.lang.String str11 = room4.getScannedID();
        java.lang.String str12 = room4.getRoomNumber();
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test01857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01857");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        room.SensorObserver sensorObserver5 = null;
        room4.addObserver(sensorObserver5);
        java.lang.String str7 = room4.getScannedID();
        room.SensorObserver sensorObserver8 = null;
        room4.removeObserver(sensorObserver8);
        java.lang.String str10 = room4.getRoomNumber();
        java.lang.String str11 = room4.toString();
        java.lang.String str12 = room4.getScannedID();
        java.lang.String str13 = room4.getBuildingName();
        room4.setUnderMaintenance(true);
        room4.notifyObservers();
        java.lang.Class<?> wildcardClass17 = room4.getClass();
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str11, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test01858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01858");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        room.SensorObserver sensorObserver5 = null;
        room4.addObserver(sensorObserver5);
        java.lang.String str7 = room4.getScannedID();
        java.lang.String str8 = room4.getBuildingName();
        java.lang.String str9 = room4.getBuildingName();
        boolean boolean10 = room4.isEnabled();
        java.lang.String str11 = room4.getRoomNumber();
        java.lang.String str12 = room4.getScannedID();
        java.lang.String str13 = room4.getBuildingName();
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test01859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01859");
        room.Room room4 = new room.Room("hi!", 1, "Room hi! | hi! - hi! | Capacity: 0 - hi!", "Room hi! | hi! - hi! | Capacity: 0 - hi!");
        int int5 = room4.getCapacity();
        room4.setUnderMaintenance(false);
        java.lang.String str8 = room4.getScannedID();
        room4.setScannedID("Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test01860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01860");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        room.SensorObserver sensorObserver5 = null;
        room4.addObserver(sensorObserver5);
        java.lang.String str7 = room4.getScannedID();
        int int8 = room4.getCapacity();
        // The following exception was thrown during execution in test generation
        try {
            room4.setOccupied(false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test01861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01861");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        room.SensorObserver sensorObserver5 = null;
        room4.addObserver(sensorObserver5);
        java.lang.String str7 = room4.toString();
        java.lang.String str8 = room4.toString();
        java.lang.String str9 = room4.getBuildingName();
        java.lang.String str10 = room4.getFullLocation();
        // The following exception was thrown during execution in test generation
        try {
            room4.setOccupied(true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str7, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str8, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi! - hi!" + "'", str10, "hi! - hi!");
    }

    @Test
    public void test01862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01862");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        room.SensorObserver sensorObserver5 = null;
        room4.addObserver(sensorObserver5);
        int int7 = room4.getCapacity();
        java.lang.String str8 = room4.getBuildingName();
        room.SensorObserver sensorObserver9 = null;
        room4.addObserver(sensorObserver9);
        room.SensorObserver sensorObserver11 = null;
        room4.removeObserver(sensorObserver11);
        java.lang.String str13 = room4.getFullLocation();
        int int14 = room4.getCapacity();
        // The following exception was thrown during execution in test generation
        try {
            room4.setScannedID("Room  | Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! | Capacity: 1");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi! - hi!" + "'", str13, "hi! - hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test01863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01863");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        room.SensorObserver sensorObserver5 = null;
        room4.addObserver(sensorObserver5);
        java.lang.String str7 = room4.getFullLocation();
        boolean boolean8 = room4.isUnderMaintenance();
        java.lang.String str9 = room4.toString();
        java.lang.String str10 = room4.getRoomNumber();
        java.lang.String str11 = room4.getFullLocation();
        // The following exception was thrown during execution in test generation
        try {
            room4.setUnderMaintenance(true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi! - hi!" + "'", str7, "hi! - hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str9, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi! - hi!" + "'", str11, "hi! - hi!");
    }

    @Test
    public void test01864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01864");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        java.lang.String str5 = room4.getScannedID();
        room4.setScannedID("hi!");
        java.lang.String str8 = room4.getBuildingName();
        room4.setEnabled(false);
        java.lang.String str11 = room4.getScannedID();
        room4.setOccupied(false);
        java.lang.String str14 = room4.getBuildingName();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test01865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01865");
        room.Room room4 = new room.Room("Room hi! | hi! - hi! | Capacity: 0 - hi! - ", 1, "hi! - hi!", "Room hi! | hi! - hi! | Capacity: 0 - hi! - ");
        java.lang.String str5 = room4.getScannedID();
        boolean boolean6 = room4.isEnabled();
        java.lang.Class<?> wildcardClass7 = room4.getClass();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test01866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01866");
        room.Room room4 = new room.Room("Room hi! | hi! - hi! | Capacity: 0", (int) (byte) 10, "hi!", "");
        java.lang.String str5 = room4.getRoomNumber();
        java.lang.String str6 = room4.toString();
        java.lang.Class<?> wildcardClass7 = room4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10" + "'", str6, "Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test01867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01867");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        boolean boolean5 = room4.isOccupied();
        java.lang.String str6 = room4.toString();
        java.lang.String str7 = room4.toString();
        java.lang.String str8 = room4.toString();
        java.lang.String str9 = room4.toString();
        room4.setEnabled(false);
        room.SensorObserver sensorObserver12 = null;
        room4.removeObserver(sensorObserver12);
        java.lang.String str14 = room4.getRoomNumber();
        room4.setUnderMaintenance(false);
        java.lang.String str17 = room4.getFullLocation();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str6, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str7, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str8, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str9, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi! - hi!" + "'", str17, "hi! - hi!");
    }

    @Test
    public void test01868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01868");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        java.lang.String str5 = room4.getScannedID();
        room4.setScannedID("hi!");
        room4.setUnderMaintenance(true);
        room4.setOccupied(true);
        room4.setOccupied(false);
        java.lang.String str14 = room4.getRoomNumber();
        boolean boolean15 = room4.isEnabled();
        java.lang.String str16 = room4.getBuildingName();
        room.SensorObserver sensorObserver17 = null;
        room4.removeObserver(sensorObserver17);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test01869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01869");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        java.lang.String str5 = room4.getScannedID();
        room4.setScannedID("hi!");
        room4.setUnderMaintenance(true);
        room.SensorObserver sensorObserver10 = null;
        room4.removeObserver(sensorObserver10);
        boolean boolean12 = room4.isOccupied();
        int int13 = room4.getCapacity();
        java.lang.String str14 = room4.getBuildingName();
        java.lang.Class<?> wildcardClass15 = room4.getClass();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test01870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01870");
        room.Room room4 = new room.Room("", (int) (short) 10, "Room hi! | hi! - hi! | Capacity: 0", "hi!");
        room4.setEnabled(false);
        java.lang.String str7 = room4.getRoomNumber();
        java.lang.String str8 = room4.getFullLocation();
        room4.setOccupied(false);
        boolean boolean11 = room4.isUnderMaintenance();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0 - hi!" + "'", str8, "Room hi! | hi! - hi! | Capacity: 0 - hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test01871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01871");
        room.Room room4 = new room.Room("", (int) (byte) -1, "Room Room  - Room hi! | hi! - hi! | Capacity: 0 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 0 | hi! - hi! - Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 -  - hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 0", "");
        room.SensorObserver sensorObserver5 = null;
        room4.addObserver(sensorObserver5);
    }

    @Test
    public void test01872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01872");
        room.Room room4 = new room.Room("hi!", (int) (byte) 100, "", "Room hi! | hi! - hi! | Capacity: 0");
        java.lang.String str5 = room4.getScannedID();
        java.lang.String str6 = room4.getBuildingName();
        room4.setScannedID("Room hi! | hi! - hi! | Capacity: 0");
        java.lang.String str9 = room4.getRoomID();
        boolean boolean10 = room4.isUnderMaintenance();
        room4.setEnabled(true);
        java.lang.String str13 = room4.toString();
        boolean boolean14 = room4.isOccupied();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100" + "'", str13, "Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test01873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01873");
        room.Room room4 = new room.Room("", (int) (byte) 100, "Room hi! | hi! - hi! | Capacity: 0 - hi!", "");
        java.lang.String str5 = room4.getBuildingName();
        boolean boolean6 = room4.isOccupied();
        boolean boolean7 = room4.isOccupied();
        java.lang.String str8 = room4.getBuildingName();
        java.lang.Class<?> wildcardClass9 = room4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0 - hi!" + "'", str5, "Room hi! | hi! - hi! | Capacity: 0 - hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0 - hi!" + "'", str8, "Room hi! | hi! - hi! | Capacity: 0 - hi!");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test01874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01874");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        java.lang.String str5 = room4.getBuildingName();
        java.lang.String str6 = room4.getRoomID();
        room4.setUnderMaintenance(false);
        int int9 = room4.getCapacity();
        room.SensorObserver sensorObserver10 = null;
        room4.removeObserver(sensorObserver10);
        boolean boolean12 = room4.isOccupied();
        java.lang.String str13 = room4.getBuildingName();
        room4.setOccupied(false);
        room4.setUnderMaintenance(false);
        room4.notifyObservers();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test01875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01875");
        room.Room room4 = new room.Room("", 1, "Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi!", "Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10");
        room4.setUnderMaintenance(true);
        room4.setScannedID("Room  | Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! | Capacity: 1");
        room.SensorObserver sensorObserver9 = null;
        room4.addObserver(sensorObserver9);
    }

    @Test
    public void test01876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01876");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        room.SensorObserver sensorObserver5 = null;
        room4.addObserver(sensorObserver5);
        java.lang.String str7 = room4.getScannedID();
        java.lang.String str8 = room4.getFullLocation();
        boolean boolean9 = room4.isOccupied();
        boolean boolean10 = room4.isUnderMaintenance();
        room.SensorObserver sensorObserver11 = null;
        room4.addObserver(sensorObserver11);
        // The following exception was thrown during execution in test generation
        try {
            room4.setEnabled(false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi! - hi!" + "'", str8, "hi! - hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test01877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01877");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        java.lang.String str5 = room4.getScannedID();
        room4.setScannedID("hi!");
        room4.setUnderMaintenance(true);
        java.lang.String str10 = room4.getScannedID();
        java.lang.String str11 = room4.getFullLocation();
        boolean boolean12 = room4.isOccupied();
        boolean boolean13 = room4.isOccupied();
        boolean boolean14 = room4.isOccupied();
        boolean boolean15 = room4.isUnderMaintenance();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi! - hi!" + "'", str11, "hi! - hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test01878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01878");
        room.Room room4 = new room.Room("Room hi! | hi! - hi! | Capacity: 0 - hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 |  - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 0", (int) (short) -1, "Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 | hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 0", "Room Room hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 1 | Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! - Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: -1");
    }

    @Test
    public void test01879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01879");
        room.Room room4 = new room.Room("hi!", (int) (byte) 100, "", "Room hi! | hi! - hi! | Capacity: 0");
        java.lang.String str5 = room4.getRoomNumber();
        room4.notifyObservers();
        room.SensorObserver sensorObserver7 = null;
        room4.addObserver(sensorObserver7);
        room.SensorObserver sensorObserver9 = null;
        room4.removeObserver(sensorObserver9);
        room4.setEnabled(false);
        java.lang.String str13 = room4.getFullLocation();
        java.lang.String str14 = room4.getRoomID();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str5, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + " - Room hi! | hi! - hi! | Capacity: 0" + "'", str13, " - Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test01880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01880");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        boolean boolean5 = room4.isOccupied();
        room4.setEnabled(false);
        room4.setUnderMaintenance(false);
        java.lang.String str10 = room4.getScannedID();
        java.lang.Class<?> wildcardClass11 = room4.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test01881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01881");
        room.Room room4 = new room.Room("hi!", (int) (byte) 100, "", "Room hi! | hi! - hi! | Capacity: 0");
        room4.setScannedID("");
        room4.notifyObservers();
        boolean boolean8 = room4.isUnderMaintenance();
        room4.setUnderMaintenance(false);
        java.lang.String str11 = room4.getRoomID();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test01882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01882");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        room.SensorObserver sensorObserver5 = null;
        room4.addObserver(sensorObserver5);
        java.lang.String str7 = room4.getScannedID();
        room.SensorObserver sensorObserver8 = null;
        room4.removeObserver(sensorObserver8);
        java.lang.String str10 = room4.getRoomNumber();
        java.lang.String str11 = room4.toString();
        java.lang.String str12 = room4.getScannedID();
        java.lang.String str13 = room4.getBuildingName();
        java.lang.String str14 = room4.getFullLocation();
        java.lang.String str15 = room4.toString();
        java.lang.String str16 = room4.getRoomID();
        room4.setScannedID("hi! - ");
        room.SensorObserver sensorObserver19 = null;
        room4.addObserver(sensorObserver19);
        // The following exception was thrown during execution in test generation
        try {
            room4.setEnabled(false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str11, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi! - hi!" + "'", str14, "hi! - hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str15, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test01883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01883");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        java.lang.String str5 = room4.getScannedID();
        room4.setScannedID("hi!");
        room4.setUnderMaintenance(true);
        room4.setOccupied(true);
        room4.setOccupied(false);
        java.lang.String str14 = room4.getRoomNumber();
        boolean boolean15 = room4.isOccupied();
        java.lang.String str16 = room4.getBuildingName();
        java.lang.Class<?> wildcardClass17 = room4.getClass();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test01884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01884");
        room.Room room4 = new room.Room("", (int) (byte) 1, "Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10", "hi!");
        java.lang.String str5 = room4.getFullLocation();
        room4.setScannedID("Room hi! | hi! - hi! | Capacity: 0");
        java.lang.String str8 = room4.getBuildingName();
        java.lang.Class<?> wildcardClass9 = room4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi!" + "'", str5, "Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10" + "'", str8, "Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test01885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01885");
        room.Room room4 = new room.Room("", 10, "Room Room hi! | hi! - hi! | Capacity: 0 - hi! | Room  - Room hi! | hi! - hi! | Capacity: 0 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 0 - hi! | Capacity: 52", "Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 97 - Room  - Room hi! | hi! - hi! | Capacity: 0 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 0");
    }

    @Test
    public void test01886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01886");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        boolean boolean5 = room4.isOccupied();
        room4.setEnabled(false);
        java.lang.String str8 = room4.toString();
        room4.setOccupied(true);
        java.lang.String str11 = room4.getRoomNumber();
        java.lang.String str12 = room4.getFullLocation();
        java.lang.String str13 = room4.toString();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str8, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi! - hi!" + "'", str12, "hi! - hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str13, "Room hi! | hi! - hi! | Capacity: 0");
    }

    @Test
    public void test01887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01887");
        room.Room room4 = new room.Room("hi!", (int) (byte) 100, "", "Room hi! | hi! - hi! | Capacity: 0");
        java.lang.String str5 = room4.getScannedID();
        java.lang.String str6 = room4.getBuildingName();
        room4.setUnderMaintenance(false);
        room4.setScannedID("Room hi! | hi! - hi! | Capacity: 0 - hi! - ");
        room4.setEnabled(false);
        int int13 = room4.getCapacity();
        boolean boolean14 = room4.isUnderMaintenance();
        java.lang.Class<?> wildcardClass15 = room4.getClass();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test01888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01888");
        room.Room room4 = new room.Room("", (int) (short) 10, "Room hi! | hi! - hi! | Capacity: 0", "hi!");
        room.SensorObserver sensorObserver5 = null;
        room4.removeObserver(sensorObserver5);
        room.SensorObserver sensorObserver7 = null;
        room4.addObserver(sensorObserver7);
        java.lang.String str9 = room4.getScannedID();
        java.lang.String str10 = room4.toString();
        java.lang.String str11 = room4.getRoomNumber();
        boolean boolean12 = room4.isEnabled();
        room.SensorObserver sensorObserver13 = null;
        room4.addObserver(sensorObserver13);
        // The following exception was thrown during execution in test generation
        try {
            room4.setEnabled(false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10" + "'", str10, "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test01889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01889");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        java.lang.String str5 = room4.getScannedID();
        room4.setScannedID("hi!");
        java.lang.String str8 = room4.getBuildingName();
        room4.setEnabled(false);
        room4.setUnderMaintenance(false);
        int int13 = room4.getCapacity();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test01890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01890");
        room.Room room4 = new room.Room("Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! - ", (int) (short) 1, "Room hi! | hi! - hi! - Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | Capacity: 0", "Room hi! - hi! - hi! | hi! - hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 1");
        room4.notifyObservers();
    }

    @Test
    public void test01891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01891");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        room.SensorObserver sensorObserver5 = null;
        room4.addObserver(sensorObserver5);
        java.lang.String str7 = room4.toString();
        java.lang.String str8 = room4.toString();
        room.SensorObserver sensorObserver9 = null;
        room4.addObserver(sensorObserver9);
        java.lang.String str11 = room4.getBuildingName();
        java.lang.String str12 = room4.getRoomID();
        java.lang.String str13 = room4.getScannedID();
        boolean boolean14 = room4.isOccupied();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str7, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str8, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test01892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01892");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        room.SensorObserver sensorObserver5 = null;
        room4.addObserver(sensorObserver5);
        java.lang.String str7 = room4.toString();
        room.SensorObserver sensorObserver8 = null;
        room4.addObserver(sensorObserver8);
        room.SensorObserver sensorObserver10 = null;
        room4.removeObserver(sensorObserver10);
        room.SensorObserver sensorObserver12 = null;
        room4.removeObserver(sensorObserver12);
        room4.setUnderMaintenance(true);
        boolean boolean16 = room4.isEnabled();
        room4.setScannedID("Room hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 1 - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi!");
        java.lang.String str19 = room4.getFullLocation();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str7, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi! - hi!" + "'", str19, "hi! - hi!");
    }

    @Test
    public void test01893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01893");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        room.SensorObserver sensorObserver5 = null;
        room4.addObserver(sensorObserver5);
        java.lang.String str7 = room4.getScannedID();
        room.SensorObserver sensorObserver8 = null;
        room4.removeObserver(sensorObserver8);
        java.lang.String str10 = room4.getRoomNumber();
        java.lang.String str11 = room4.toString();
        java.lang.String str12 = room4.getScannedID();
        java.lang.String str13 = room4.getBuildingName();
        java.lang.String str14 = room4.getRoomNumber();
        room.SensorObserver sensorObserver15 = null;
        room4.addObserver(sensorObserver15);
        java.lang.String str17 = room4.toString();
        room.SensorObserver sensorObserver18 = null;
        room4.addObserver(sensorObserver18);
        java.lang.String str20 = room4.getRoomID();
        java.lang.String str21 = room4.getRoomNumber();
        int int22 = room4.getCapacity();
        java.lang.Class<?> wildcardClass23 = room4.getClass();
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str11, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str17, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test01894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01894");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        room.SensorObserver sensorObserver5 = null;
        room4.addObserver(sensorObserver5);
        java.lang.String str7 = room4.getScannedID();
        java.lang.String str8 = room4.getFullLocation();
        boolean boolean9 = room4.isOccupied();
        boolean boolean10 = room4.isOccupied();
        java.lang.String str11 = room4.getFullLocation();
        boolean boolean12 = room4.isUnderMaintenance();
        // The following exception was thrown during execution in test generation
        try {
            room4.setUnderMaintenance(true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi! - hi!" + "'", str8, "hi! - hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi! - hi!" + "'", str11, "hi! - hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test01895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01895");
        room.Room room4 = new room.Room("hi!", (int) (byte) 100, "", "Room hi! | hi! - hi! | Capacity: 0");
        java.lang.String str5 = room4.getScannedID();
        java.lang.String str6 = room4.getBuildingName();
        room4.setScannedID("Room hi! | hi! - hi! | Capacity: 0");
        java.lang.String str9 = room4.getRoomID();
        java.lang.String str10 = room4.getScannedID();
        room.SensorObserver sensorObserver11 = null;
        room4.removeObserver(sensorObserver11);
        room.SensorObserver sensorObserver13 = null;
        room4.addObserver(sensorObserver13);
        java.lang.Class<?> wildcardClass15 = room4.getClass();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str10, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test01896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01896");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        java.lang.String str5 = room4.getScannedID();
        room4.setScannedID("hi!");
        java.lang.String str8 = room4.getBuildingName();
        int int9 = room4.getCapacity();
        room.SensorObserver sensorObserver10 = null;
        room4.addObserver(sensorObserver10);
        java.lang.String str12 = room4.getScannedID();
        java.lang.String str13 = room4.getBuildingName();
        // The following exception was thrown during execution in test generation
        try {
            room4.setOccupied(false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test01897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01897");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        room.SensorObserver sensorObserver5 = null;
        room4.addObserver(sensorObserver5);
        java.lang.String str7 = room4.getScannedID();
        room.SensorObserver sensorObserver8 = null;
        room4.removeObserver(sensorObserver8);
        java.lang.String str10 = room4.getRoomNumber();
        java.lang.String str11 = room4.toString();
        java.lang.String str12 = room4.getScannedID();
        java.lang.String str13 = room4.getBuildingName();
        java.lang.String str14 = room4.getRoomNumber();
        room.SensorObserver sensorObserver15 = null;
        room4.addObserver(sensorObserver15);
        java.lang.String str17 = room4.toString();
        room.SensorObserver sensorObserver18 = null;
        room4.addObserver(sensorObserver18);
        // The following exception was thrown during execution in test generation
        try {
            room4.setUnderMaintenance(true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str11, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str17, "Room hi! | hi! - hi! | Capacity: 0");
    }

    @Test
    public void test01898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01898");
        room.Room room4 = new room.Room("", (int) (short) 10, "Room hi! | hi! - hi! | Capacity: 0", "hi!");
        java.lang.String str5 = room4.toString();
        boolean boolean6 = room4.isEnabled();
        java.lang.String str7 = room4.getFullLocation();
        room4.setScannedID("Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 100");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10" + "'", str5, "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0 - hi!" + "'", str7, "Room hi! | hi! - hi! | Capacity: 0 - hi!");
    }

    @Test
    public void test01899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01899");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        boolean boolean5 = room4.isOccupied();
        room4.setEnabled(false);
        java.lang.String str8 = room4.toString();
        room4.setOccupied(true);
        room4.setOccupied(false);
        java.lang.String str13 = room4.getRoomID();
        boolean boolean14 = room4.isUnderMaintenance();
        boolean boolean15 = room4.isUnderMaintenance();
        room4.setScannedID(" - hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str8, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test01900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01900");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        boolean boolean5 = room4.isOccupied();
        java.lang.String str6 = room4.toString();
        java.lang.String str7 = room4.getScannedID();
        room4.setScannedID("Room Room hi! | hi! - hi! | Capacity: 0 | hi! - hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 97");
        boolean boolean10 = room4.isOccupied();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str6, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test01901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01901");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        java.lang.String str5 = room4.getBuildingName();
        java.lang.String str6 = room4.getRoomID();
        boolean boolean7 = room4.isOccupied();
        room4.notifyObservers();
        java.lang.String str9 = room4.getBuildingName();
        room.SensorObserver sensorObserver10 = null;
        room4.removeObserver(sensorObserver10);
        java.lang.String str12 = room4.getRoomID();
        boolean boolean13 = room4.isEnabled();
        room4.notifyObservers();
        room4.notifyObservers();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test01902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01902");
        room.Room room4 = new room.Room("hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10", (int) (short) 100, "Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi!", "");
        room4.setOccupied(false);
    }

    @Test
    public void test01903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01903");
        room.Room room4 = new room.Room("Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10", 0, "hi!", "Room hi! | hi! - hi! | Capacity: 0");
        room4.setUnderMaintenance(false);
        boolean boolean7 = room4.isOccupied();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test01904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01904");
        room.Room room4 = new room.Room("hi!", (int) (byte) 100, "", "Room hi! | hi! - hi! | Capacity: 0");
        java.lang.String str5 = room4.getScannedID();
        java.lang.String str6 = room4.getBuildingName();
        room4.setUnderMaintenance(false);
        boolean boolean9 = room4.isOccupied();
        room4.setScannedID("Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi!");
        java.lang.String str12 = room4.getBuildingName();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test01905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01905");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        room.SensorObserver sensorObserver5 = null;
        room4.addObserver(sensorObserver5);
        java.lang.String str7 = room4.getScannedID();
        room.SensorObserver sensorObserver8 = null;
        room4.removeObserver(sensorObserver8);
        java.lang.String str10 = room4.getRoomNumber();
        java.lang.String str11 = room4.toString();
        java.lang.String str12 = room4.getScannedID();
        java.lang.String str13 = room4.getBuildingName();
        java.lang.String str14 = room4.getFullLocation();
        java.lang.String str15 = room4.getBuildingName();
        room4.setScannedID("Room hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 1");
        java.lang.String str18 = room4.getBuildingName();
        room4.setOccupied(true);
        java.lang.String str21 = room4.getBuildingName();
        java.lang.String str22 = room4.getScannedID();
        java.lang.String str23 = room4.getRoomNumber();
        java.lang.Class<?> wildcardClass24 = room4.getClass();
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str11, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi! - hi!" + "'", str14, "hi! - hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Room hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 1" + "'", str22, "Room hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 1");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test01906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01906");
        room.Room room4 = new room.Room("hi! - hi! - Room hi! | hi! - hi! | Capacity: 0", (int) (short) 10, "", "");
        java.lang.Class<?> wildcardClass5 = room4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test01907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01907");
        room.Room room4 = new room.Room("Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi!", 0, "Room  - Room hi! | hi! - hi! | Capacity: 0 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 0", "Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 97");
        room.SensorObserver sensorObserver5 = null;
        room4.removeObserver(sensorObserver5);
        room.SensorObserver sensorObserver7 = null;
        room4.addObserver(sensorObserver7);
    }

    @Test
    public void test01908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01908");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        room.SensorObserver sensorObserver5 = null;
        room4.addObserver(sensorObserver5);
        java.lang.String str7 = room4.getScannedID();
        room.SensorObserver sensorObserver8 = null;
        room4.removeObserver(sensorObserver8);
        room.SensorObserver sensorObserver10 = null;
        room4.addObserver(sensorObserver10);
        java.lang.String str12 = room4.getFullLocation();
        boolean boolean13 = room4.isEnabled();
        boolean boolean14 = room4.isEnabled();
        int int15 = room4.getCapacity();
        java.lang.String str16 = room4.toString();
        // The following exception was thrown during execution in test generation
        try {
            room4.setEnabled(true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi! - hi!" + "'", str12, "hi! - hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str16, "Room hi! | hi! - hi! | Capacity: 0");
    }

    @Test
    public void test01909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01909");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        room.SensorObserver sensorObserver5 = null;
        room4.addObserver(sensorObserver5);
        java.lang.String str7 = room4.getScannedID();
        room.SensorObserver sensorObserver8 = null;
        room4.removeObserver(sensorObserver8);
        java.lang.String str10 = room4.getRoomNumber();
        java.lang.String str11 = room4.toString();
        java.lang.String str12 = room4.getScannedID();
        room4.notifyObservers();
        room4.setScannedID("Room hi! | hi! - hi! | Capacity: 0 - hi!");
        java.lang.String str16 = room4.toString();
        room4.setScannedID("hi! - hi! - Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100");
        java.lang.String str19 = room4.getFullLocation();
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str11, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str16, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi! - hi!" + "'", str19, "hi! - hi!");
    }

    @Test
    public void test01910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01910");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        room.SensorObserver sensorObserver5 = null;
        room4.addObserver(sensorObserver5);
        java.lang.String str7 = room4.getScannedID();
        java.lang.String str8 = room4.getFullLocation();
        boolean boolean9 = room4.isOccupied();
        boolean boolean10 = room4.isUnderMaintenance();
        // The following exception was thrown during execution in test generation
        try {
            room4.setUnderMaintenance(true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi! - hi!" + "'", str8, "hi! - hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test01911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01911");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        java.lang.String str5 = room4.getScannedID();
        room4.setScannedID("hi!");
        room4.setUnderMaintenance(true);
        java.lang.String str10 = room4.getScannedID();
        java.lang.String str11 = room4.getFullLocation();
        boolean boolean12 = room4.isOccupied();
        boolean boolean13 = room4.isOccupied();
        java.lang.String str14 = room4.getFullLocation();
        java.lang.String str15 = room4.toString();
        java.lang.String str16 = room4.getBuildingName();
        room4.setScannedID("Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | hi! - hi! - hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 0");
        room4.setUnderMaintenance(false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi! - hi!" + "'", str11, "hi! - hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi! - hi!" + "'", str14, "hi! - hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str15, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test01912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01912");
        room.Room room4 = new room.Room("Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10", 0, "hi!", "Room hi! | hi! - hi! | Capacity: 0");
        java.lang.String str5 = room4.getBuildingName();
        boolean boolean6 = room4.isEnabled();
        java.lang.String str7 = room4.getScannedID();
        java.lang.String str8 = room4.getRoomID();
        java.lang.String str9 = room4.getScannedID();
        java.lang.String str10 = room4.getFullLocation();
        room.SensorObserver sensorObserver11 = null;
        room4.removeObserver(sensorObserver11);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10" + "'", str8, "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi! - Room hi! | hi! - hi! | Capacity: 0" + "'", str10, "hi! - Room hi! | hi! - hi! | Capacity: 0");
    }

    @Test
    public void test01913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01913");
        room.Room room4 = new room.Room("Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100", 0, "hi! - hi!", "hi!");
        java.lang.String str5 = room4.getFullLocation();
        java.lang.String str6 = room4.getScannedID();
        java.lang.String str7 = room4.getRoomNumber();
        java.lang.Class<?> wildcardClass8 = room4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi! - hi! - hi!" + "'", str5, "hi! - hi! - hi!");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test01914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01914");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        java.lang.String str5 = room4.getScannedID();
        room4.setScannedID("hi!");
        room4.setUnderMaintenance(true);
        java.lang.String str10 = room4.getScannedID();
        room4.setScannedID("Room hi! | hi! - hi! | Capacity: 0 - hi! - ");
        room4.setScannedID("Room Room hi! | hi! - hi! | Capacity: 0 | Room hi! | hi! - hi! | Capacity: 0 - hi! - hi! | Capacity: 100");
        room.SensorObserver sensorObserver15 = null;
        room4.addObserver(sensorObserver15);
        // The following exception was thrown during execution in test generation
        try {
            room4.notifyObservers();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test01915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01915");
        room.Room room4 = new room.Room("Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi!", (int) (short) 0, "hi! - hi! - hi!", "Room hi! | hi! - hi! | Capacity: 0");
        room4.setOccupied(false);
        room.SensorObserver sensorObserver7 = null;
        room4.addObserver(sensorObserver7);
        java.lang.String str9 = room4.getScannedID();
        java.lang.String str10 = room4.getRoomID();
        java.lang.String str11 = room4.getRoomID();
        // The following exception was thrown during execution in test generation
        try {
            room4.setUnderMaintenance(false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi!" + "'", str10, "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi!" + "'", str11, "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi!");
    }

    @Test
    public void test01916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01916");
        room.Room room4 = new room.Room("hi!", (int) (byte) 100, "", "Room hi! | hi! - hi! | Capacity: 0");
        room4.notifyObservers();
        room.SensorObserver sensorObserver6 = null;
        room4.removeObserver(sensorObserver6);
        java.lang.String str8 = room4.toString();
        room.SensorObserver sensorObserver9 = null;
        room4.removeObserver(sensorObserver9);
        room4.setScannedID("");
        room.SensorObserver sensorObserver13 = null;
        room4.addObserver(sensorObserver13);
        java.lang.String str15 = room4.getScannedID();
        java.lang.Class<?> wildcardClass16 = room4.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100" + "'", str8, "Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test01917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01917");
        room.Room room4 = new room.Room("hi! - hi!", (int) (short) 10, "Room hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 1", "");
        int int5 = room4.getCapacity();
        boolean boolean6 = room4.isOccupied();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test01918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01918");
        room.Room room4 = new room.Room("hi!", (int) (byte) 100, "", "Room hi! | hi! - hi! | Capacity: 0");
        java.lang.String str5 = room4.getScannedID();
        room4.setUnderMaintenance(true);
        room4.setOccupied(true);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test01919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01919");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        room.SensorObserver sensorObserver5 = null;
        room4.addObserver(sensorObserver5);
        java.lang.String str7 = room4.toString();
        room.SensorObserver sensorObserver8 = null;
        room4.removeObserver(sensorObserver8);
        int int10 = room4.getCapacity();
        java.lang.String str11 = room4.getRoomID();
        boolean boolean12 = room4.isEnabled();
        java.lang.String str13 = room4.getScannedID();
        room.SensorObserver sensorObserver14 = null;
        room4.addObserver(sensorObserver14);
        // The following exception was thrown during execution in test generation
        try {
            room4.notifyObservers();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str7, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test01920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01920");
        room.Room room4 = new room.Room("Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10", (int) (short) 10, "hi! - ", "Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 1");
        room4.setUnderMaintenance(true);
        java.lang.String str7 = room4.getBuildingName();
        java.lang.String str8 = room4.getRoomID();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi! - " + "'", str7, "hi! - ");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10" + "'", str8, "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10");
    }

    @Test
    public void test01921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01921");
        room.Room room4 = new room.Room("hi!", (int) (byte) 100, "", "Room hi! | hi! - hi! | Capacity: 0");
        room4.setScannedID("");
        boolean boolean7 = room4.isOccupied();
        room4.setOccupied(true);
        boolean boolean10 = room4.isEnabled();
        boolean boolean11 = room4.isEnabled();
        int int12 = room4.getCapacity();
        int int13 = room4.getCapacity();
        room4.setUnderMaintenance(true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
    }

    @Test
    public void test01922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01922");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        java.lang.String str5 = room4.getScannedID();
        room4.setScannedID("hi!");
        room4.setUnderMaintenance(true);
        java.lang.String str10 = room4.getScannedID();
        int int11 = room4.getCapacity();
        java.lang.String str12 = room4.getBuildingName();
        java.lang.String str13 = room4.getRoomNumber();
        room.SensorObserver sensorObserver14 = null;
        room4.addObserver(sensorObserver14);
        room.SensorObserver sensorObserver16 = null;
        room4.removeObserver(sensorObserver16);
        room4.setOccupied(false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test01923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01923");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        room.SensorObserver sensorObserver5 = null;
        room4.addObserver(sensorObserver5);
        java.lang.String str7 = room4.toString();
        room.SensorObserver sensorObserver8 = null;
        room4.removeObserver(sensorObserver8);
        java.lang.String str10 = room4.toString();
        java.lang.String str11 = room4.getRoomID();
        boolean boolean12 = room4.isUnderMaintenance();
        boolean boolean13 = room4.isOccupied();
        java.lang.String str14 = room4.toString();
        int int15 = room4.getCapacity();
        java.lang.String str16 = room4.getScannedID();
        java.lang.String str17 = room4.getFullLocation();
        room4.notifyObservers();
        room4.setOccupied(true);
        java.lang.String str21 = room4.toString();
        java.lang.String str22 = room4.getScannedID();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str7, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str10, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str14, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi! - hi!" + "'", str17, "hi! - hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str21, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test01924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01924");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        java.lang.String str5 = room4.getScannedID();
        room4.setScannedID("hi!");
        boolean boolean8 = room4.isEnabled();
        int int9 = room4.getCapacity();
        boolean boolean10 = room4.isOccupied();
        room4.setUnderMaintenance(true);
        boolean boolean13 = room4.isOccupied();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test01925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01925");
        room.Room room4 = new room.Room("Room hi! - hi! - Room hi! | hi! - hi! | Capacity: 0 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 100 | Capacity: 10", 100, "Room hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 1 - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi!", "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room hi! | hi! - hi! | Capacity: 0");
        java.lang.Class<?> wildcardClass5 = room4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test01926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01926");
        room.Room room4 = new room.Room("", (int) (byte) 1, "Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10", "hi!");
        java.lang.String str5 = room4.getFullLocation();
        room4.setScannedID("Room hi! | hi! - hi! | Capacity: 0");
        java.lang.String str8 = room4.getFullLocation();
        boolean boolean9 = room4.isOccupied();
        room4.setScannedID("Room hi! | hi! - hi! | Capacity: 0 - hi!");
        room4.setOccupied(false);
        int int14 = room4.getCapacity();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi!" + "'", str5, "Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi!" + "'", str8, "Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test01927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01927");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        java.lang.String str5 = room4.getScannedID();
        room4.setScannedID("hi!");
        boolean boolean8 = room4.isEnabled();
        room.SensorObserver sensorObserver9 = null;
        room4.removeObserver(sensorObserver9);
        room.SensorObserver sensorObserver11 = null;
        room4.addObserver(sensorObserver11);
        boolean boolean13 = room4.isEnabled();
        java.lang.String str14 = room4.getBuildingName();
        java.lang.String str15 = room4.toString();
        room.SensorObserver sensorObserver16 = null;
        room4.removeObserver(sensorObserver16);
        java.lang.String str18 = room4.toString();
        boolean boolean19 = room4.isUnderMaintenance();
        boolean boolean20 = room4.isOccupied();
        room4.setScannedID("");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str15, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str18, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test01928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01928");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        room.SensorObserver sensorObserver5 = null;
        room4.addObserver(sensorObserver5);
        room.SensorObserver sensorObserver7 = null;
        room4.addObserver(sensorObserver7);
        boolean boolean9 = room4.isUnderMaintenance();
        java.lang.String str10 = room4.getBuildingName();
        room.SensorObserver sensorObserver11 = null;
        room4.addObserver(sensorObserver11);
        java.lang.String str13 = room4.getRoomNumber();
        boolean boolean14 = room4.isUnderMaintenance();
        // The following exception was thrown during execution in test generation
        try {
            room4.setUnderMaintenance(true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test01929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01929");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        java.lang.String str5 = room4.getScannedID();
        room4.setScannedID("hi!");
        boolean boolean8 = room4.isEnabled();
        int int9 = room4.getCapacity();
        int int10 = room4.getCapacity();
        boolean boolean11 = room4.isOccupied();
        room4.notifyObservers();
        boolean boolean13 = room4.isOccupied();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test01930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01930");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        room.SensorObserver sensorObserver5 = null;
        room4.addObserver(sensorObserver5);
        java.lang.String str7 = room4.getScannedID();
        room.SensorObserver sensorObserver8 = null;
        room4.removeObserver(sensorObserver8);
        java.lang.String str10 = room4.getRoomNumber();
        java.lang.String str11 = room4.toString();
        java.lang.String str12 = room4.getScannedID();
        room4.notifyObservers();
        room4.setUnderMaintenance(false);
        room4.setOccupied(true);
        java.lang.String str18 = room4.getScannedID();
        room.SensorObserver sensorObserver19 = null;
        room4.addObserver(sensorObserver19);
        // The following exception was thrown during execution in test generation
        try {
            room4.notifyObservers();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str11, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test01931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01931");
        room.Room room4 = new room.Room("", (int) (byte) 100, "Room hi! | hi! - hi! | Capacity: 0 - hi!", "");
        boolean boolean5 = room4.isEnabled();
        room4.setScannedID("hi! - hi!");
        room4.setOccupied(false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test01932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01932");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        room.SensorObserver sensorObserver5 = null;
        room4.addObserver(sensorObserver5);
        java.lang.String str7 = room4.getScannedID();
        room.SensorObserver sensorObserver8 = null;
        room4.removeObserver(sensorObserver8);
        java.lang.String str10 = room4.getRoomNumber();
        java.lang.String str11 = room4.toString();
        java.lang.String str12 = room4.getRoomID();
        room4.notifyObservers();
        java.lang.String str14 = room4.getRoomID();
        boolean boolean15 = room4.isEnabled();
        room4.setEnabled(true);
        room4.notifyObservers();
        room4.setScannedID("hi! - hi!");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str11, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test01933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01933");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        room.SensorObserver sensorObserver5 = null;
        room4.addObserver(sensorObserver5);
        java.lang.String str7 = room4.toString();
        room.SensorObserver sensorObserver8 = null;
        room4.removeObserver(sensorObserver8);
        java.lang.String str10 = room4.toString();
        java.lang.String str11 = room4.getRoomID();
        boolean boolean12 = room4.isUnderMaintenance();
        boolean boolean13 = room4.isOccupied();
        java.lang.String str14 = room4.toString();
        int int15 = room4.getCapacity();
        room.SensorObserver sensorObserver16 = null;
        room4.removeObserver(sensorObserver16);
        java.lang.String str18 = room4.getBuildingName();
        java.lang.Class<?> wildcardClass19 = room4.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str7, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str10, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str14, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test01934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01934");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        java.lang.String str5 = room4.getBuildingName();
        java.lang.String str6 = room4.getRoomID();
        room4.setUnderMaintenance(false);
        int int9 = room4.getCapacity();
        java.lang.String str10 = room4.getRoomID();
        room.SensorObserver sensorObserver11 = null;
        room4.removeObserver(sensorObserver11);
        int int13 = room4.getCapacity();
        java.lang.Class<?> wildcardClass14 = room4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test01935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01935");
        room.Room room4 = new room.Room("hi!", (int) (byte) 100, "", "Room hi! | hi! - hi! | Capacity: 0");
        java.lang.String str5 = room4.getScannedID();
        java.lang.String str6 = room4.getBuildingName();
        room4.setScannedID("Room hi! | hi! - hi! | Capacity: 0");
        java.lang.String str9 = room4.getRoomID();
        boolean boolean10 = room4.isOccupied();
        room4.setOccupied(false);
        boolean boolean13 = room4.isEnabled();
        java.lang.Class<?> wildcardClass14 = room4.getClass();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test01936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01936");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        java.lang.String str5 = room4.getScannedID();
        room4.setScannedID("hi!");
        boolean boolean8 = room4.isEnabled();
        int int9 = room4.getCapacity();
        boolean boolean10 = room4.isOccupied();
        room4.notifyObservers();
        int int12 = room4.getCapacity();
        room.SensorObserver sensorObserver13 = null;
        room4.removeObserver(sensorObserver13);
        java.lang.String str15 = room4.toString();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str15, "Room hi! | hi! - hi! | Capacity: 0");
    }

    @Test
    public void test01937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01937");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        room.SensorObserver sensorObserver5 = null;
        room4.addObserver(sensorObserver5);
        java.lang.String str7 = room4.toString();
        room.SensorObserver sensorObserver8 = null;
        room4.removeObserver(sensorObserver8);
        int int10 = room4.getCapacity();
        java.lang.String str11 = room4.getRoomID();
        boolean boolean12 = room4.isEnabled();
        java.lang.String str13 = room4.getScannedID();
        java.lang.String str14 = room4.getBuildingName();
        int int15 = room4.getCapacity();
        boolean boolean16 = room4.isEnabled();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str7, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test01938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01938");
        room.Room room4 = new room.Room("Room hi! | hi! - hi! | Capacity: 0 - hi!", 10, "Room Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! - hi! - hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: -1", "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10");
        boolean boolean5 = room4.isUnderMaintenance();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test01939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01939");
        room.Room room4 = new room.Room("", (int) (short) 10, "Room hi! | hi! - hi! | Capacity: 0", "hi!");
        java.lang.String str5 = room4.toString();
        java.lang.String str6 = room4.getBuildingName();
        boolean boolean7 = room4.isOccupied();
        room.SensorObserver sensorObserver8 = null;
        room4.removeObserver(sensorObserver8);
        room.SensorObserver sensorObserver10 = null;
        room4.removeObserver(sensorObserver10);
        java.lang.String str12 = room4.getScannedID();
        room4.setUnderMaintenance(true);
        int int15 = room4.getCapacity();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10" + "'", str5, "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str6, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
    }

    @Test
    public void test01940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01940");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        room.SensorObserver sensorObserver5 = null;
        room4.addObserver(sensorObserver5);
        java.lang.String str7 = room4.toString();
        room.SensorObserver sensorObserver8 = null;
        room4.removeObserver(sensorObserver8);
        java.lang.String str10 = room4.toString();
        java.lang.String str11 = room4.getRoomID();
        boolean boolean12 = room4.isUnderMaintenance();
        boolean boolean13 = room4.isOccupied();
        java.lang.String str14 = room4.getRoomID();
        room4.notifyObservers();
        boolean boolean16 = room4.isEnabled();
        boolean boolean17 = room4.isEnabled();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str7, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str10, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test01941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01941");
        room.Room room4 = new room.Room("Room hi! | hi! - hi! | Capacity: 0", (int) (byte) 10, "hi!", "");
        room4.setUnderMaintenance(true);
        java.lang.String str7 = room4.toString();
        room4.notifyObservers();
        room4.setScannedID("hi! - hi!");
        java.lang.String str11 = room4.getRoomID();
        int int12 = room4.getCapacity();
        room4.setScannedID("hi! - hi!");
        boolean boolean15 = room4.isUnderMaintenance();
        java.lang.Class<?> wildcardClass16 = room4.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10" + "'", str7, "Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str11, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test01942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01942");
        room.Room room4 = new room.Room("hi!", (int) (byte) 100, "", "Room hi! | hi! - hi! | Capacity: 0");
        room4.setScannedID("");
        boolean boolean7 = room4.isOccupied();
        int int8 = room4.getCapacity();
        room4.setOccupied(true);
        java.lang.String str11 = room4.getScannedID();
        java.lang.String str12 = room4.getScannedID();
        room4.notifyObservers();
        room.SensorObserver sensorObserver14 = null;
        room4.addObserver(sensorObserver14);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test01943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01943");
        room.Room room4 = new room.Room("hi!", (int) (byte) 1, "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10", "hi!");
        room4.notifyObservers();
        java.lang.String str6 = room4.getScannedID();
        java.lang.String str7 = room4.getRoomID();
        java.lang.String str8 = room4.getScannedID();
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test01944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01944");
        room.Room room4 = new room.Room("Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100", (int) (short) 1, "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi!", "Room hi! | hi! - hi! | Capacity: 0");
        room4.notifyObservers();
        room4.setEnabled(false);
        room4.setOccupied(false);
        room4.notifyObservers();
        room.SensorObserver sensorObserver11 = null;
        room4.removeObserver(sensorObserver11);
    }

    @Test
    public void test01945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01945");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        room.SensorObserver sensorObserver5 = null;
        room4.addObserver(sensorObserver5);
        java.lang.String str7 = room4.toString();
        java.lang.String str8 = room4.toString();
        room.SensorObserver sensorObserver9 = null;
        room4.addObserver(sensorObserver9);
        boolean boolean11 = room4.isOccupied();
        java.lang.String str12 = room4.getRoomNumber();
        // The following exception was thrown during execution in test generation
        try {
            room4.setScannedID("Room hi! | hi! - hi! | Capacity: 0 - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str7, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str8, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test01946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01946");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        java.lang.String str5 = room4.getScannedID();
        room4.setScannedID("hi!");
        java.lang.String str8 = room4.getBuildingName();
        room4.setEnabled(false);
        room4.notifyObservers();
        int int12 = room4.getCapacity();
        java.lang.String str13 = room4.getBuildingName();
        room4.setEnabled(false);
        java.lang.String str16 = room4.getRoomNumber();
        java.lang.Class<?> wildcardClass17 = room4.getClass();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test01947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01947");
        room.Room room4 = new room.Room("hi! - hi! - Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100", (-1), "Room hi! | hi! - hi! | Capacity: 0 - hi!", " - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi!");
        java.lang.String str5 = room4.getBuildingName();
        room4.setScannedID("Room Room hi! | hi! - hi! | Capacity: 0 |  - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 0");
        java.lang.String str8 = room4.getFullLocation();
        room4.notifyObservers();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0 - hi!" + "'", str5, "Room hi! | hi! - hi! | Capacity: 0 - hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0 - hi! -  - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi!" + "'", str8, "Room hi! | hi! - hi! | Capacity: 0 - hi! -  - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi!");
    }

    @Test
    public void test01948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01948");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        java.lang.String str5 = room4.getScannedID();
        room4.setScannedID("hi!");
        room4.setUnderMaintenance(true);
        room4.setOccupied(true);
        java.lang.String str12 = room4.getRoomID();
        java.lang.String str13 = room4.getBuildingName();
        java.lang.String str14 = room4.getScannedID();
        room4.setUnderMaintenance(true);
        java.lang.Class<?> wildcardClass17 = room4.getClass();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test01949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01949");
        room.Room room4 = new room.Room("hi! - hi! - Room hi! | hi! - hi! | Capacity: 0", (int) (short) 10, "", "");
        java.lang.String str5 = room4.getScannedID();
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test01950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01950");
        room.Room room4 = new room.Room("", (int) (byte) 100, "Room hi! | hi! - hi! | Capacity: 0 - hi!", "");
        boolean boolean5 = room4.isEnabled();
        java.lang.String str6 = room4.getScannedID();
        room4.setEnabled(false);
        room4.setScannedID("Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test01951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01951");
        room.Room room4 = new room.Room("hi!", (int) (byte) 100, "", "Room hi! | hi! - hi! | Capacity: 0");
        java.lang.String str5 = room4.getScannedID();
        java.lang.String str6 = room4.getBuildingName();
        room4.setUnderMaintenance(false);
        boolean boolean9 = room4.isOccupied();
        room4.setScannedID("hi!");
        room.SensorObserver sensorObserver12 = null;
        room4.removeObserver(sensorObserver12);
        room.SensorObserver sensorObserver14 = null;
        room4.addObserver(sensorObserver14);
        // The following exception was thrown during execution in test generation
        try {
            room4.setOccupied(true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test01952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01952");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        room.SensorObserver sensorObserver5 = null;
        room4.addObserver(sensorObserver5);
        java.lang.String str7 = room4.getScannedID();
        java.lang.String str8 = room4.getFullLocation();
        boolean boolean9 = room4.isOccupied();
        boolean boolean10 = room4.isOccupied();
        room.SensorObserver sensorObserver11 = null;
        room4.removeObserver(sensorObserver11);
        room4.setScannedID("Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi!");
        java.lang.String str15 = room4.getScannedID();
        java.lang.String str16 = room4.getScannedID();
        java.lang.String str17 = room4.getBuildingName();
        room.SensorObserver sensorObserver18 = null;
        room4.removeObserver(sensorObserver18);
        room.SensorObserver sensorObserver20 = null;
        room4.removeObserver(sensorObserver20);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi! - hi!" + "'", str8, "hi! - hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi!" + "'", str15, "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi!" + "'", str16, "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test01953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01953");
        room.Room room4 = new room.Room("Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10", (-1), "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 100", "Room hi! | hi! - hi! | Capacity: 0 - hi! - ");
        room4.setUnderMaintenance(true);
        room4.setOccupied(true);
        int int9 = room4.getCapacity();
        java.lang.String str10 = room4.getRoomID();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10" + "'", str10, "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10");
    }

    @Test
    public void test01954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01954");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        java.lang.String str5 = room4.getScannedID();
        room4.setScannedID("hi!");
        boolean boolean8 = room4.isEnabled();
        room4.setEnabled(false);
        room4.setScannedID("Room hi! | hi! - hi! | Capacity: 0 - hi! - ");
        room4.setOccupied(false);
        room4.notifyObservers();
        java.lang.String str16 = room4.getFullLocation();
        boolean boolean17 = room4.isEnabled();
        java.lang.String str18 = room4.toString();
        room.SensorObserver sensorObserver19 = null;
        room4.addObserver(sensorObserver19);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi! - hi!" + "'", str16, "hi! - hi!");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str18, "Room hi! | hi! - hi! | Capacity: 0");
    }

    @Test
    public void test01955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01955");
        room.Room room4 = new room.Room("hi!", (int) (byte) 100, "", "Room hi! | hi! - hi! | Capacity: 0");
        java.lang.String str5 = room4.toString();
        java.lang.String str6 = room4.getFullLocation();
        room.SensorObserver sensorObserver7 = null;
        room4.removeObserver(sensorObserver7);
        room.SensorObserver sensorObserver9 = null;
        room4.addObserver(sensorObserver9);
        java.lang.String str11 = room4.getBuildingName();
        java.lang.String str12 = room4.getScannedID();
        boolean boolean13 = room4.isOccupied();
        boolean boolean14 = room4.isOccupied();
        java.lang.String str15 = room4.getRoomNumber();
        // The following exception was thrown during execution in test generation
        try {
            room4.setEnabled(false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100" + "'", str5, "Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + " - Room hi! | hi! - hi! | Capacity: 0" + "'", str6, " - Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str15, "Room hi! | hi! - hi! | Capacity: 0");
    }

    @Test
    public void test01956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01956");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        room.SensorObserver sensorObserver5 = null;
        room4.addObserver(sensorObserver5);
        room.SensorObserver sensorObserver7 = null;
        room4.addObserver(sensorObserver7);
        java.lang.String str9 = room4.getBuildingName();
        java.lang.String str10 = room4.getRoomID();
        java.lang.String str11 = room4.getRoomNumber();
        java.lang.String str12 = room4.getRoomID();
        java.lang.String str13 = room4.getRoomID();
        java.lang.Class<?> wildcardClass14 = room4.getClass();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test01957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01957");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        room.SensorObserver sensorObserver5 = null;
        room4.addObserver(sensorObserver5);
        java.lang.String str7 = room4.getScannedID();
        room.SensorObserver sensorObserver8 = null;
        room4.removeObserver(sensorObserver8);
        java.lang.String str10 = room4.getRoomNumber();
        java.lang.String str11 = room4.toString();
        java.lang.String str12 = room4.getScannedID();
        java.lang.String str13 = room4.getBuildingName();
        java.lang.String str14 = room4.getFullLocation();
        java.lang.String str15 = room4.toString();
        room.SensorObserver sensorObserver16 = null;
        room4.addObserver(sensorObserver16);
        room.SensorObserver sensorObserver18 = null;
        room4.addObserver(sensorObserver18);
        java.lang.String str20 = room4.getFullLocation();
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str11, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi! - hi!" + "'", str14, "hi! - hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str15, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi! - hi!" + "'", str20, "hi! - hi!");
    }

    @Test
    public void test01958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01958");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        room.SensorObserver sensorObserver5 = null;
        room4.addObserver(sensorObserver5);
        java.lang.String str7 = room4.toString();
        room.SensorObserver sensorObserver8 = null;
        room4.removeObserver(sensorObserver8);
        int int10 = room4.getCapacity();
        java.lang.String str11 = room4.getRoomID();
        java.lang.String str12 = room4.getFullLocation();
        boolean boolean13 = room4.isUnderMaintenance();
        java.lang.String str14 = room4.getRoomNumber();
        room4.setOccupied(false);
        boolean boolean17 = room4.isEnabled();
        room4.setEnabled(false);
        java.lang.String str20 = room4.getRoomNumber();
        boolean boolean21 = room4.isOccupied();
        room.SensorObserver sensorObserver22 = null;
        room4.addObserver(sensorObserver22);
        int int24 = room4.getCapacity();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str7, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi! - hi!" + "'", str12, "hi! - hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test01959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01959");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        room.SensorObserver sensorObserver5 = null;
        room4.addObserver(sensorObserver5);
        int int7 = room4.getCapacity();
        java.lang.String str8 = room4.getRoomNumber();
        // The following exception was thrown during execution in test generation
        try {
            room4.setOccupied(true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test01960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01960");
        room.Room room4 = new room.Room("Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 1 - Room hi! | hi! - hi! | Capacity: 0 - hi!", 100, "Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 | hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 0 - hi! - hi! - Room hi! | hi! - hi! | Capacity: 0", "Room Room  | Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! | Capacity: 1 | Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 - Room Room hi! | hi! - hi! | Capacity: 0 | hi! - hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 97 | Capacity: 100");
        java.lang.String str5 = room4.getRoomNumber();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Room Room  | Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! | Capacity: 1 | Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 - Room Room hi! | hi! - hi! | Capacity: 0 | hi! - hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 97 | Capacity: 100" + "'", str5, "Room Room  | Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! | Capacity: 1 | Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 - Room Room hi! | hi! - hi! | Capacity: 0 | hi! - hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 97 | Capacity: 100");
    }

    @Test
    public void test01961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01961");
        room.Room room4 = new room.Room("hi!", (int) (byte) 100, "", "Room hi! | hi! - hi! | Capacity: 0");
        room4.setScannedID("");
        boolean boolean7 = room4.isOccupied();
        room4.setOccupied(true);
        boolean boolean10 = room4.isEnabled();
        boolean boolean11 = room4.isEnabled();
        room.SensorObserver sensorObserver12 = null;
        room4.removeObserver(sensorObserver12);
        room4.setUnderMaintenance(true);
        java.lang.Class<?> wildcardClass16 = room4.getClass();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test01962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01962");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        room.SensorObserver sensorObserver5 = null;
        room4.addObserver(sensorObserver5);
        java.lang.String str7 = room4.getScannedID();
        room.SensorObserver sensorObserver8 = null;
        room4.removeObserver(sensorObserver8);
        java.lang.String str10 = room4.getRoomNumber();
        java.lang.String str11 = room4.toString();
        room4.setUnderMaintenance(true);
        room.SensorObserver sensorObserver14 = null;
        room4.removeObserver(sensorObserver14);
        boolean boolean16 = room4.isOccupied();
        room4.notifyObservers();
        boolean boolean18 = room4.isEnabled();
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str11, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test01963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01963");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        java.lang.String str5 = room4.getScannedID();
        room4.setScannedID("hi!");
        boolean boolean8 = room4.isEnabled();
        int int9 = room4.getCapacity();
        int int10 = room4.getCapacity();
        boolean boolean11 = room4.isOccupied();
        boolean boolean12 = room4.isUnderMaintenance();
        room4.setOccupied(true);
        java.lang.String str15 = room4.getFullLocation();
        room.SensorObserver sensorObserver16 = null;
        room4.removeObserver(sensorObserver16);
        room.SensorObserver sensorObserver18 = null;
        room4.removeObserver(sensorObserver18);
        java.lang.String str20 = room4.getScannedID();
        java.lang.Class<?> wildcardClass21 = room4.getClass();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi! - hi!" + "'", str15, "hi! - hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test01964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01964");
        room.Room room4 = new room.Room("", (int) (short) 10, "Room hi! | hi! - hi! | Capacity: 0", "hi!");
        java.lang.String str5 = room4.toString();
        room4.setUnderMaintenance(true);
        room4.setScannedID("");
        java.lang.String str10 = room4.getRoomNumber();
        room.SensorObserver sensorObserver11 = null;
        room4.addObserver(sensorObserver11);
        int int13 = room4.getCapacity();
        room.SensorObserver sensorObserver14 = null;
        room4.addObserver(sensorObserver14);
        // The following exception was thrown during execution in test generation
        try {
            room4.setEnabled(true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10" + "'", str5, "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
    }

    @Test
    public void test01965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01965");
        room.Room room4 = new room.Room("hi!", (int) (byte) 100, "", "Room hi! | hi! - hi! | Capacity: 0");
        java.lang.String str5 = room4.toString();
        java.lang.String str6 = room4.getRoomID();
        room.SensorObserver sensorObserver7 = null;
        room4.addObserver(sensorObserver7);
        // The following exception was thrown during execution in test generation
        try {
            room4.setUnderMaintenance(true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100" + "'", str5, "Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test01966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01966");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        boolean boolean5 = room4.isOccupied();
        room.SensorObserver sensorObserver6 = null;
        room4.removeObserver(sensorObserver6);
        java.lang.String str8 = room4.getRoomNumber();
        java.lang.String str9 = room4.toString();
        java.lang.String str10 = room4.toString();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str9, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str10, "Room hi! | hi! - hi! | Capacity: 0");
    }

    @Test
    public void test01967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01967");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        room.SensorObserver sensorObserver5 = null;
        room4.addObserver(sensorObserver5);
        java.lang.String str7 = room4.getFullLocation();
        boolean boolean8 = room4.isUnderMaintenance();
        java.lang.String str9 = room4.getRoomID();
        boolean boolean10 = room4.isOccupied();
        java.lang.String str11 = room4.toString();
        int int12 = room4.getCapacity();
        java.lang.String str13 = room4.getRoomNumber();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi! - hi!" + "'", str7, "hi! - hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str11, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test01968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01968");
        room.Room room4 = new room.Room("hi! - hi! - Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100", (-1), "Room hi! | hi! - hi! | Capacity: 0 - hi!", " - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi!");
        java.lang.String str5 = room4.getBuildingName();
        room4.setScannedID("Room hi! - hi! | Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 10");
        room4.notifyObservers();
        java.lang.Class<?> wildcardClass9 = room4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0 - hi!" + "'", str5, "Room hi! | hi! - hi! | Capacity: 0 - hi!");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test01969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01969");
        room.Room room4 = new room.Room("hi!", (int) (byte) 100, "", "Room hi! | hi! - hi! | Capacity: 0");
        java.lang.String str5 = room4.getBuildingName();
        java.lang.String str6 = room4.toString();
        java.lang.String str7 = room4.getRoomNumber();
        java.lang.String str8 = room4.getFullLocation();
        boolean boolean9 = room4.isUnderMaintenance();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100" + "'", str6, "Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str7, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + " - Room hi! | hi! - hi! | Capacity: 0" + "'", str8, " - Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test01970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01970");
        room.Room room4 = new room.Room("Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 100 - Room hi! | hi! - hi! | Capacity: 0 - hi! - ", 0, "Room hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 1", "Room hi! | hi! - hi! - Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | Capacity: 0");
        java.lang.String str5 = room4.getFullLocation();
        boolean boolean6 = room4.isEnabled();
        boolean boolean7 = room4.isUnderMaintenance();
        boolean boolean8 = room4.isUnderMaintenance();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Room hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 1 - Room hi! | hi! - hi! - Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | Capacity: 0" + "'", str5, "Room hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 1 - Room hi! | hi! - hi! - Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | Capacity: 0");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test01971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01971");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        java.lang.String str5 = room4.getScannedID();
        room4.setScannedID("hi!");
        boolean boolean8 = room4.isEnabled();
        int int9 = room4.getCapacity();
        room4.setOccupied(false);
        room4.setOccupied(true);
        room.SensorObserver sensorObserver14 = null;
        room4.removeObserver(sensorObserver14);
        room4.setScannedID("Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 1");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test01972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01972");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        boolean boolean5 = room4.isOccupied();
        room4.setEnabled(false);
        java.lang.String str8 = room4.toString();
        room4.setUnderMaintenance(true);
        room4.setEnabled(true);
        room4.setScannedID("Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10");
        java.lang.String str15 = room4.getScannedID();
        boolean boolean16 = room4.isEnabled();
        java.lang.String str17 = room4.getRoomNumber();
        room4.setUnderMaintenance(true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str8, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10" + "'", str15, "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test01973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01973");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        java.lang.String str5 = room4.getScannedID();
        room4.setScannedID("hi!");
        room4.setUnderMaintenance(true);
        java.lang.String str10 = room4.getScannedID();
        java.lang.String str11 = room4.getFullLocation();
        boolean boolean12 = room4.isOccupied();
        boolean boolean13 = room4.isOccupied();
        room4.setOccupied(true);
        boolean boolean16 = room4.isUnderMaintenance();
        java.lang.Class<?> wildcardClass17 = room4.getClass();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi! - hi!" + "'", str11, "hi! - hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test01974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01974");
        room.Room room4 = new room.Room("hi!", (int) (short) 0, "hi! - hi!", "Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100");
        java.lang.String str5 = room4.getScannedID();
        java.lang.String str6 = room4.toString();
        room4.setUnderMaintenance(false);
        java.lang.String str9 = room4.getBuildingName();
        int int10 = room4.getCapacity();
        boolean boolean11 = room4.isOccupied();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Room hi! | hi! - hi! - Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | Capacity: 0" + "'", str6, "Room hi! | hi! - hi! - Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi! - hi!" + "'", str9, "hi! - hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test01975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01975");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        java.lang.String str5 = room4.getScannedID();
        room4.setScannedID("hi!");
        java.lang.String str8 = room4.getBuildingName();
        room4.setEnabled(false);
        room.SensorObserver sensorObserver11 = null;
        room4.addObserver(sensorObserver11);
        int int13 = room4.getCapacity();
        java.lang.String str14 = room4.getRoomNumber();
        java.lang.String str15 = room4.getScannedID();
        // The following exception was thrown during execution in test generation
        try {
            room4.setScannedID("Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - hi! | Capacity: 1");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test01976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01976");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        room.SensorObserver sensorObserver5 = null;
        room4.addObserver(sensorObserver5);
        java.lang.String str7 = room4.getScannedID();
        java.lang.String str8 = room4.getFullLocation();
        int int9 = room4.getCapacity();
        java.lang.String str10 = room4.getRoomID();
        room.SensorObserver sensorObserver11 = null;
        room4.addObserver(sensorObserver11);
        java.lang.String str13 = room4.getBuildingName();
        boolean boolean14 = room4.isUnderMaintenance();
        java.lang.String str15 = room4.getRoomNumber();
        boolean boolean16 = room4.isUnderMaintenance();
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi! - hi!" + "'", str8, "hi! - hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test01977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01977");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        java.lang.String str5 = room4.getScannedID();
        room4.setScannedID("hi!");
        room4.setUnderMaintenance(true);
        room4.setOccupied(true);
        room4.setOccupied(false);
        room.SensorObserver sensorObserver14 = null;
        room4.addObserver(sensorObserver14);
        java.lang.String str16 = room4.toString();
        boolean boolean17 = room4.isEnabled();
        int int18 = room4.getCapacity();
        boolean boolean19 = room4.isOccupied();
        // The following exception was thrown during execution in test generation
        try {
            room4.setUnderMaintenance(false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str16, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test01978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01978");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        boolean boolean5 = room4.isOccupied();
        boolean boolean6 = room4.isUnderMaintenance();
        room4.setUnderMaintenance(false);
        room4.setEnabled(true);
        room4.setUnderMaintenance(false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test01979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01979");
        room.Room room4 = new room.Room("hi!", 1, "Room hi! | hi! - hi! | Capacity: 0 - hi!", "Room hi! | hi! - hi! | Capacity: 0 - hi!");
        int int5 = room4.getCapacity();
        room4.setUnderMaintenance(false);
        room.SensorObserver sensorObserver8 = null;
        room4.addObserver(sensorObserver8);
        boolean boolean10 = room4.isOccupied();
        // The following exception was thrown during execution in test generation
        try {
            room4.setUnderMaintenance(false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test01980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01980");
        room.Room room4 = new room.Room("Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi!", 100, "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10", "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi!");
        java.lang.String str5 = room4.toString();
        java.lang.String str6 = room4.getRoomID();
        java.lang.Class<?> wildcardClass7 = room4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Room Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 100" + "'", str5, "Room Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 100");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi!" + "'", str6, "Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi!");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test01981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01981");
        room.Room room4 = new room.Room("Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 97", 0, "Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 100 | hi! - hi! - hi! - hi! | Capacity: 0", " - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi!");
        room4.setOccupied(true);
        java.lang.String str7 = room4.getScannedID();
        java.lang.String str8 = room4.getRoomID();
        java.lang.Class<?> wildcardClass9 = room4.getClass();
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 97" + "'", str8, "Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 97");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test01982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01982");
        room.Room room4 = new room.Room("hi!", (int) (byte) 100, "", "Room hi! | hi! - hi! | Capacity: 0");
        java.lang.String str5 = room4.getBuildingName();
        java.lang.String str6 = room4.toString();
        java.lang.String str7 = room4.getFullLocation();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100" + "'", str6, "Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + " - Room hi! | hi! - hi! | Capacity: 0" + "'", str7, " - Room hi! | hi! - hi! | Capacity: 0");
    }

    @Test
    public void test01983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01983");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        java.lang.String str5 = room4.getScannedID();
        room4.setScannedID("hi!");
        room4.setUnderMaintenance(true);
        java.lang.String str10 = room4.getScannedID();
        int int11 = room4.getCapacity();
        java.lang.String str12 = room4.getRoomNumber();
        java.lang.String str13 = room4.getRoomNumber();
        java.lang.Class<?> wildcardClass14 = room4.getClass();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test01984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01984");
        room.Room room4 = new room.Room("", (int) (short) 1, "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10", "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 100 - Room hi! | hi! - hi! | Capacity: 0 - hi! - ");
        room4.setUnderMaintenance(true);
        room4.notifyObservers();
        room.SensorObserver sensorObserver8 = null;
        room4.removeObserver(sensorObserver8);
    }

    @Test
    public void test01985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01985");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        room.SensorObserver sensorObserver5 = null;
        room4.addObserver(sensorObserver5);
        java.lang.String str7 = room4.getFullLocation();
        boolean boolean8 = room4.isUnderMaintenance();
        java.lang.String str9 = room4.getRoomID();
        java.lang.String str10 = room4.getBuildingName();
        java.lang.String str11 = room4.getRoomID();
        java.lang.String str12 = room4.toString();
        // The following exception was thrown during execution in test generation
        try {
            room4.setUnderMaintenance(false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi! - hi!" + "'", str7, "hi! - hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str12, "Room hi! | hi! - hi! | Capacity: 0");
    }

    @Test
    public void test01986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01986");
        room.Room room4 = new room.Room("hi!", (int) (byte) 100, "", "Room hi! | hi! - hi! | Capacity: 0");
        room4.setScannedID("");
        boolean boolean7 = room4.isOccupied();
        int int8 = room4.getCapacity();
        room4.setOccupied(true);
        java.lang.String str11 = room4.getScannedID();
        java.lang.String str12 = room4.getScannedID();
        room4.notifyObservers();
        room4.setScannedID("Room  - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 100 | hi! - hi! - hi! - hi! | Capacity: 0 | Capacity: 0");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test01987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01987");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        boolean boolean5 = room4.isOccupied();
        boolean boolean6 = room4.isEnabled();
        java.lang.String str7 = room4.getRoomID();
        room4.setScannedID("hi!");
        java.lang.String str10 = room4.getScannedID();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test01988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01988");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        room.SensorObserver sensorObserver5 = null;
        room4.addObserver(sensorObserver5);
        java.lang.String str7 = room4.getScannedID();
        room.SensorObserver sensorObserver8 = null;
        room4.removeObserver(sensorObserver8);
        java.lang.String str10 = room4.getRoomNumber();
        java.lang.String str11 = room4.toString();
        java.lang.String str12 = room4.getScannedID();
        room4.notifyObservers();
        room4.setUnderMaintenance(false);
        room4.setOccupied(true);
        java.lang.String str18 = room4.getRoomNumber();
        boolean boolean19 = room4.isOccupied();
        room4.setEnabled(true);
        room4.setUnderMaintenance(true);
        room4.setScannedID("Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi!");
        java.lang.Class<?> wildcardClass26 = room4.getClass();
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str11, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test01989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01989");
        room.Room room4 = new room.Room("", (int) (byte) 100, "Room hi! | hi! - hi! | Capacity: 0 - hi!", "");
        java.lang.String str5 = room4.getBuildingName();
        java.lang.String str6 = room4.getRoomNumber();
        room.SensorObserver sensorObserver7 = null;
        room4.removeObserver(sensorObserver7);
        java.lang.String str9 = room4.getFullLocation();
        room4.setUnderMaintenance(false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0 - hi!" + "'", str5, "Room hi! | hi! - hi! | Capacity: 0 - hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0 - hi! - " + "'", str9, "Room hi! | hi! - hi! | Capacity: 0 - hi! - ");
    }

    @Test
    public void test01990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01990");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        room.SensorObserver sensorObserver5 = null;
        room4.addObserver(sensorObserver5);
        java.lang.String str7 = room4.toString();
        boolean boolean8 = room4.isUnderMaintenance();
        int int9 = room4.getCapacity();
        int int10 = room4.getCapacity();
        // The following exception was thrown during execution in test generation
        try {
            room4.setEnabled(false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str7, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test01991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01991");
        room.Room room4 = new room.Room("hi!", (int) (byte) 100, "", "Room hi! | hi! - hi! | Capacity: 0");
        java.lang.String str5 = room4.getRoomNumber();
        boolean boolean6 = room4.isEnabled();
        boolean boolean7 = room4.isEnabled();
        java.lang.String str8 = room4.getBuildingName();
        boolean boolean9 = room4.isUnderMaintenance();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str5, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test01992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01992");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        room.SensorObserver sensorObserver5 = null;
        room4.addObserver(sensorObserver5);
        java.lang.String str7 = room4.getScannedID();
        room.SensorObserver sensorObserver8 = null;
        room4.removeObserver(sensorObserver8);
        java.lang.String str10 = room4.getRoomNumber();
        java.lang.String str11 = room4.toString();
        java.lang.String str12 = room4.getScannedID();
        room4.notifyObservers();
        java.lang.String str14 = room4.getScannedID();
        java.lang.String str15 = room4.getScannedID();
        room4.setOccupied(true);
        room4.setEnabled(false);
        room4.setOccupied(false);
        room4.setScannedID("Room Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! |  - hi! -  | Capacity: 100");
        java.lang.String str24 = room4.getBuildingName();
        boolean boolean25 = room4.isEnabled();
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str11, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test01993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01993");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        room.SensorObserver sensorObserver5 = null;
        room4.addObserver(sensorObserver5);
        java.lang.String str7 = room4.getFullLocation();
        boolean boolean8 = room4.isUnderMaintenance();
        java.lang.String str9 = room4.getRoomID();
        room.SensorObserver sensorObserver10 = null;
        room4.addObserver(sensorObserver10);
        room.SensorObserver sensorObserver12 = null;
        room4.removeObserver(sensorObserver12);
        boolean boolean14 = room4.isEnabled();
        // The following exception was thrown during execution in test generation
        try {
            room4.setEnabled(true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi! - hi!" + "'", str7, "hi! - hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test01994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01994");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        room.SensorObserver sensorObserver5 = null;
        room4.addObserver(sensorObserver5);
        room.SensorObserver sensorObserver7 = null;
        room4.addObserver(sensorObserver7);
        boolean boolean9 = room4.isUnderMaintenance();
        room.SensorObserver sensorObserver10 = null;
        room4.removeObserver(sensorObserver10);
        java.lang.String str12 = room4.getScannedID();
        java.lang.String str13 = room4.getBuildingName();
        java.lang.Class<?> wildcardClass14 = room4.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test01995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01995");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        room.SensorObserver sensorObserver5 = null;
        room4.addObserver(sensorObserver5);
        java.lang.String str7 = room4.getScannedID();
        room.SensorObserver sensorObserver8 = null;
        room4.removeObserver(sensorObserver8);
        room.SensorObserver sensorObserver10 = null;
        room4.addObserver(sensorObserver10);
        java.lang.String str12 = room4.getFullLocation();
        boolean boolean13 = room4.isEnabled();
        room.SensorObserver sensorObserver14 = null;
        room4.removeObserver(sensorObserver14);
        java.lang.String str16 = room4.getBuildingName();
        java.lang.Class<?> wildcardClass17 = room4.getClass();
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi! - hi!" + "'", str12, "hi! - hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test01996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01996");
        room.Room room4 = new room.Room("Room hi! | hi! - hi! | Capacity: 0", (int) (byte) 10, "hi!", "");
        room.SensorObserver sensorObserver5 = null;
        room4.removeObserver(sensorObserver5);
        boolean boolean7 = room4.isOccupied();
        java.lang.String str8 = room4.toString();
        room.SensorObserver sensorObserver9 = null;
        room4.removeObserver(sensorObserver9);
        room4.notifyObservers();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10" + "'", str8, "Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10");
    }

    @Test
    public void test01997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01997");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        room.SensorObserver sensorObserver5 = null;
        room4.addObserver(sensorObserver5);
        java.lang.String str7 = room4.toString();
        room.SensorObserver sensorObserver8 = null;
        room4.removeObserver(sensorObserver8);
        java.lang.String str10 = room4.toString();
        java.lang.String str11 = room4.getRoomID();
        boolean boolean12 = room4.isUnderMaintenance();
        boolean boolean13 = room4.isOccupied();
        java.lang.String str14 = room4.getRoomID();
        room4.notifyObservers();
        java.lang.String str16 = room4.getScannedID();
        java.lang.String str17 = room4.toString();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str7, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str10, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str17, "Room hi! | hi! - hi! | Capacity: 0");
    }

    @Test
    public void test01998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01998");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        room.SensorObserver sensorObserver5 = null;
        room4.addObserver(sensorObserver5);
        java.lang.String str7 = room4.getScannedID();
        room.SensorObserver sensorObserver8 = null;
        room4.removeObserver(sensorObserver8);
        java.lang.String str10 = room4.getRoomNumber();
        java.lang.String str11 = room4.toString();
        java.lang.String str12 = room4.getScannedID();
        java.lang.String str13 = room4.getBuildingName();
        java.lang.String str14 = room4.getRoomNumber();
        room4.setEnabled(false);
        java.lang.String str17 = room4.getRoomID();
        java.lang.String str18 = room4.getScannedID();
        java.lang.String str19 = room4.getRoomID();
        room4.setScannedID("hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str11, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test01999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01999");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        room.SensorObserver sensorObserver5 = null;
        room4.addObserver(sensorObserver5);
        java.lang.String str7 = room4.getScannedID();
        java.lang.String str8 = room4.getFullLocation();
        boolean boolean9 = room4.isOccupied();
        boolean boolean10 = room4.isOccupied();
        room.SensorObserver sensorObserver11 = null;
        room4.removeObserver(sensorObserver11);
        room4.setScannedID("Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi!");
        java.lang.String str15 = room4.getScannedID();
        java.lang.String str16 = room4.getScannedID();
        room.SensorObserver sensorObserver17 = null;
        room4.removeObserver(sensorObserver17);
        room.SensorObserver sensorObserver19 = null;
        room4.removeObserver(sensorObserver19);
        room4.setEnabled(true);
        java.lang.String str23 = room4.toString();
        java.lang.Class<?> wildcardClass24 = room4.getClass();
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi! - hi!" + "'", str8, "hi! - hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi!" + "'", str15, "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi!" + "'", str16, "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str23, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test02000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test02000");
        room.Room room4 = new room.Room("hi!", (int) '#', "Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10", "Room hi! | hi! - hi! | Capacity: 0 - hi!");
        room4.setUnderMaintenance(false);
        room4.notifyObservers();
        java.lang.String str8 = room4.getRoomNumber();
        room.SensorObserver sensorObserver9 = null;
        room4.addObserver(sensorObserver9);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0 - hi!" + "'", str8, "Room hi! | hi! - hi! | Capacity: 0 - hi!");
    }
}

