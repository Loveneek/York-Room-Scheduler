import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest53 {

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
    public void test26501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26501");
        room.Room room4 = new room.Room("Room Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 100", (int) (short) -1, "Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - hi! | Capacity: 1", "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10");
        java.lang.String str5 = room4.getBuildingName();
        boolean boolean6 = room4.isOccupied();
        room.SensorObserver sensorObserver7 = null;
        room4.addObserver(sensorObserver7);
        // The following exception was thrown during execution in test generation
        try {
            room4.setOccupied(false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - hi! | Capacity: 1" + "'", str5, "Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - hi! | Capacity: 1");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test26502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26502");
        room.Room room4 = new room.Room("Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 1 - Room hi! | hi! - hi! | Capacity: 0 - hi!", 100, "Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 | hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 0 - hi! - hi! - Room hi! | hi! - hi! | Capacity: 0", "Room Room  | Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! | Capacity: 1 | Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 - Room Room hi! | hi! - hi! | Capacity: 0 | hi! - hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 97 | Capacity: 100");
        int int5 = room4.getCapacity();
        java.lang.String str6 = room4.getRoomNumber();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Room Room  | Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! | Capacity: 1 | Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 - Room Room hi! | hi! - hi! | Capacity: 0 | hi! - hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 97 | Capacity: 100" + "'", str6, "Room Room  | Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! | Capacity: 1 | Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 - Room Room hi! | hi! - hi! | Capacity: 0 | hi! - hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 97 | Capacity: 100");
    }

    @Test
    public void test26503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26503");
        room.Room room4 = new room.Room("hi! - ", (int) (byte) 10, "Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10", "Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10");
        room4.notifyObservers();
        room4.setScannedID("Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10");
        java.lang.String str8 = room4.getRoomID();
        room4.setScannedID("Room Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! - hi! - hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: -1");
        boolean boolean11 = room4.isEnabled();
        room4.setScannedID("Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! -  - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10");
        room4.setUnderMaintenance(true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi! - " + "'", str8, "hi! - ");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test26504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26504");
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
        java.lang.String str20 = room4.getRoomNumber();
        room4.setUnderMaintenance(false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str11, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test26505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26505");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        java.lang.String str5 = room4.getBuildingName();
        java.lang.String str6 = room4.getRoomID();
        boolean boolean7 = room4.isOccupied();
        room4.setUnderMaintenance(false);
        room4.notifyObservers();
        java.lang.String str11 = room4.getRoomNumber();
        int int12 = room4.getCapacity();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test26506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26506");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        java.lang.String str5 = room4.getScannedID();
        room4.setScannedID("hi!");
        java.lang.String str8 = room4.getScannedID();
        room4.setScannedID("Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100");
        room.SensorObserver sensorObserver11 = null;
        room4.removeObserver(sensorObserver11);
        boolean boolean13 = room4.isOccupied();
        room.SensorObserver sensorObserver14 = null;
        room4.removeObserver(sensorObserver14);
        boolean boolean16 = room4.isEnabled();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test26507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26507");
        room.Room room4 = new room.Room("hi!", 1, "Room hi! | hi! - hi! | Capacity: 0 - hi!", "Room hi! | hi! - hi! | Capacity: 0 - hi!");
        int int5 = room4.getCapacity();
        room4.setUnderMaintenance(false);
        java.lang.String str8 = room4.toString();
        int int9 = room4.getCapacity();
        room4.setScannedID("hi!");
        room4.setEnabled(true);
        room4.setOccupied(false);
        java.lang.String str16 = room4.getScannedID();
        room4.setOccupied(false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Room hi! | Room hi! | hi! - hi! | Capacity: 0 - hi! - Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 1" + "'", str8, "Room hi! | Room hi! | hi! - hi! | Capacity: 0 - hi! - Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 1");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test26508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26508");
        room.Room room4 = new room.Room("Room hi! | hi! - hi! | Capacity: 0", (int) (byte) 100, "Room hi! | hi! - hi! | Capacity: 0 - hi!", "hi!");
        java.lang.String str5 = room4.getRoomID();
        room.SensorObserver sensorObserver6 = null;
        room4.addObserver(sensorObserver6);
        java.lang.String str8 = room4.toString();
        boolean boolean9 = room4.isUnderMaintenance();
        boolean boolean10 = room4.isEnabled();
        room.SensorObserver sensorObserver11 = null;
        room4.addObserver(sensorObserver11);
        room.SensorObserver sensorObserver13 = null;
        room4.removeObserver(sensorObserver13);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str5, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Room Room hi! | hi! - hi! | Capacity: 0 | Room hi! | hi! - hi! | Capacity: 0 - hi! - hi! | Capacity: 100" + "'", str8, "Room Room hi! | hi! - hi! | Capacity: 0 | Room hi! | hi! - hi! | Capacity: 0 - hi! - hi! | Capacity: 100");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test26509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26509");
        room.Room room4 = new room.Room("Room hi! | hi! - hi! | Capacity: 0", (int) (byte) 100, "Room hi! | hi! - hi! | Capacity: 0 - hi!", "hi!");
        java.lang.String str5 = room4.getRoomID();
        room4.setScannedID("hi! - hi!");
        java.lang.String str8 = room4.toString();
        room4.setOccupied(true);
        java.lang.String str11 = room4.getFullLocation();
        room4.setEnabled(false);
        java.lang.String str14 = room4.getRoomNumber();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str5, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Room Room hi! | hi! - hi! | Capacity: 0 | Room hi! | hi! - hi! | Capacity: 0 - hi! - hi! | Capacity: 100" + "'", str8, "Room Room hi! | hi! - hi! | Capacity: 0 | Room hi! | hi! - hi! | Capacity: 0 - hi! - hi! | Capacity: 100");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0 - hi! - hi!" + "'", str11, "Room hi! | hi! - hi! | Capacity: 0 - hi! - hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test26510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26510");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        java.lang.String str5 = room4.getScannedID();
        room4.setScannedID("hi!");
        boolean boolean8 = room4.isEnabled();
        room4.setEnabled(false);
        room4.setScannedID("Room hi! | hi! - hi! | Capacity: 0 - hi! - ");
        java.lang.String str13 = room4.getBuildingName();
        java.lang.String str14 = room4.getRoomID();
        room4.setEnabled(true);
        java.lang.String str17 = room4.getRoomID();
        int int18 = room4.getCapacity();
        room4.setScannedID("Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 100 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 -  - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! | Capacity: 0 - Room Room hi! | hi! - hi! | Capacity: 0 - hi! - hi! | Room Room hi! | hi! - hi! | Capacity: 0 | Room hi! | hi! - hi! | Capacity: 0 - hi! - hi! | Capacity: 100 - Room  - Room hi! | hi! - hi! | Capacity: 0 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 0 | Capacity: 10 - Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 1");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test26511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26511");
        room.Room room4 = new room.Room("Room  | Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! | Capacity: 1", 52, "Room hi! -  | Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 10", "hi! - hi! - Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100");
        java.lang.String str5 = room4.getFullLocation();
        java.lang.String str6 = room4.getRoomNumber();
        room4.setOccupied(true);
        boolean boolean9 = room4.isUnderMaintenance();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Room hi! -  | Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 10 - hi! - hi! - Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100" + "'", str5, "Room hi! -  | Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 10 - hi! - hi! - Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi! - hi! - Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100" + "'", str6, "hi! - hi! - Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test26512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26512");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        java.lang.String str5 = room4.getScannedID();
        room4.setScannedID("hi!");
        boolean boolean8 = room4.isEnabled();
        int int9 = room4.getCapacity();
        boolean boolean10 = room4.isOccupied();
        java.lang.String str11 = room4.getFullLocation();
        boolean boolean12 = room4.isOccupied();
        java.lang.String str13 = room4.getRoomNumber();
        room.SensorObserver sensorObserver14 = null;
        room4.addObserver(sensorObserver14);
        // The following exception was thrown during execution in test generation
        try {
            room4.setScannedID("Room Room  - Room hi! | hi! - hi! | Capacity: 0 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 0 | hi! - hi! - Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 -  - hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 0 - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi! - hi!" + "'", str11, "hi! - hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test26513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26513");
        room.Room room4 = new room.Room(" - Room hi! | hi! - hi! | Capacity: 0", (int) (byte) 100, "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi!", "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10");
        int int5 = room4.getCapacity();
        room4.setScannedID("Room  - Room hi! | hi! - hi! | Capacity: 0 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 0");
        room.SensorObserver sensorObserver8 = null;
        room4.removeObserver(sensorObserver8);
        int int10 = room4.getCapacity();
        boolean boolean11 = room4.isOccupied();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test26514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26514");
        room.Room room4 = new room.Room("hi! - hi! - hi!", (int) (byte) 0, "Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | hi! - hi! - hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 0", "Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10");
        room4.setOccupied(true);
        java.lang.String str7 = room4.getRoomNumber();
        java.lang.String str8 = room4.getFullLocation();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10" + "'", str7, "Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | hi! - hi! - hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 0 - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10" + "'", str8, "Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | hi! - hi! - hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 0 - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10");
    }

    @Test
    public void test26515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26515");
        room.Room room4 = new room.Room("Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi!", (int) (byte) -1, "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 1", "hi! - hi!");
        room4.setUnderMaintenance(true);
    }

    @Test
    public void test26516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26516");
        room.Room room4 = new room.Room("hi!", (int) (byte) 100, "", "Room hi! | hi! - hi! | Capacity: 0");
        room4.setScannedID("");
        boolean boolean7 = room4.isOccupied();
        room4.setOccupied(true);
        boolean boolean10 = room4.isEnabled();
        boolean boolean11 = room4.isEnabled();
        room.SensorObserver sensorObserver12 = null;
        room4.removeObserver(sensorObserver12);
        room4.setUnderMaintenance(true);
        room.SensorObserver sensorObserver16 = null;
        room4.removeObserver(sensorObserver16);
        room4.notifyObservers();
        java.lang.String str19 = room4.getBuildingName();
        boolean boolean20 = room4.isUnderMaintenance();
        room4.setOccupied(true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test26517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26517");
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
        int int16 = room4.getCapacity();
        room4.notifyObservers();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + " - Room hi! | hi! - hi! | Capacity: 0" + "'", str15, " - Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
    }

    @Test
    public void test26518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26518");
        room.Room room4 = new room.Room("Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi!", (int) (short) 0, "hi! - hi! - hi!", "Room hi! | hi! - hi! | Capacity: 0");
        room4.setOccupied(false);
        java.lang.String str7 = room4.getBuildingName();
        room4.notifyObservers();
        boolean boolean9 = room4.isOccupied();
        boolean boolean10 = room4.isEnabled();
        java.lang.String str11 = room4.getRoomNumber();
        room4.setScannedID("Room hi! | hi! - hi! | Capacity: 0 - hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 100 - Room hi! | hi! - hi! | Capacity: 0 - hi! - ");
        java.lang.String str14 = room4.getRoomNumber();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi! - hi! - hi!" + "'", str7, "hi! - hi! - hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str11, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str14, "Room hi! | hi! - hi! | Capacity: 0");
    }

    @Test
    public void test26519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26519");
        room.Room room4 = new room.Room("Room  - Room hi! | hi! - hi! | Capacity: 0 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 0", (-1), "Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100", "Room hi! | Room hi! | hi! - hi! | Capacity: 0 - hi! - Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 1");
        java.lang.String str5 = room4.getRoomNumber();
        room4.setEnabled(false);
        java.lang.String str8 = room4.getBuildingName();
        java.lang.String str9 = room4.toString();
        int int10 = room4.getCapacity();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Room hi! | Room hi! | hi! - hi! | Capacity: 0 - hi! - Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 1" + "'", str5, "Room hi! | Room hi! | hi! - hi! | Capacity: 0 - hi! - Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 1");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100" + "'", str8, "Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Room Room  - Room hi! | hi! - hi! | Capacity: 0 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 0 | Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 - Room hi! | Room hi! | hi! - hi! | Capacity: 0 - hi! - Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 1 | Capacity: -1" + "'", str9, "Room Room  - Room hi! | hi! - hi! | Capacity: 0 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 0 | Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 - Room hi! | Room hi! | hi! - hi! | Capacity: 0 - hi! - Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 1 | Capacity: -1");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test26520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26520");
        room.Room room4 = new room.Room("Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 1", 10, "hi! - hi! - Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 97", "Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100");
        room4.notifyObservers();
        room.SensorObserver sensorObserver6 = null;
        room4.addObserver(sensorObserver6);
        // The following exception was thrown during execution in test generation
        try {
            room4.setEnabled(false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test26521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26521");
        room.Room room4 = new room.Room("", (int) (short) 10, "Room hi! | hi! - hi! | Capacity: 0", "hi!");
        java.lang.String str5 = room4.toString();
        boolean boolean6 = room4.isUnderMaintenance();
        java.lang.String str7 = room4.getRoomID();
        java.lang.String str8 = room4.getBuildingName();
        int int9 = room4.getCapacity();
        room4.setScannedID("Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! - Room hi! | hi! - hi! | Capacity: 0 - hi! - hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10" + "'", str5, "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str8, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
    }

    @Test
    public void test26522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26522");
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
        java.lang.String str16 = room4.getRoomID();
        java.lang.String str17 = room4.getScannedID();
        boolean boolean18 = room4.isOccupied();
        java.lang.String str19 = room4.getRoomID();
        room4.setEnabled(true);
        java.lang.String str22 = room4.getFullLocation();
        java.lang.String str23 = room4.getBuildingName();
        room.SensorObserver sensorObserver24 = null;
        room4.addObserver(sensorObserver24);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str7, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str10, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str14, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi! - hi!" + "'", str22, "hi! - hi!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
    }

    @Test
    public void test26523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26523");
        room.Room room4 = new room.Room(" - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 35", 100, "Room Room hi! - hi! - Room hi! | hi! - hi! | Capacity: 0 | hi! - hi! - Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 97 | Capacity: 10 | Room hi! - hi! - hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 -  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 - Room Room hi! | hi! - hi! | Capacity: 0 - hi! |  - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 | Capacity: 1 -  - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 | Capacity: 52", "Room Room Room hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 1 | Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! - Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: -1 | Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | hi! - hi! - hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 0 - Room Room  - Room hi! | hi! - hi! | Capacity: 0 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 0 | hi! - hi! - Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 -  - hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 0 | Capacity: 32");
        room.SensorObserver sensorObserver5 = null;
        room4.removeObserver(sensorObserver5);
    }

    @Test
    public void test26524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26524");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        java.lang.String str5 = room4.getScannedID();
        room4.setScannedID("hi!");
        java.lang.String str8 = room4.getBuildingName();
        room4.setEnabled(false);
        room4.notifyObservers();
        java.lang.String str12 = room4.getRoomID();
        boolean boolean13 = room4.isUnderMaintenance();
        boolean boolean14 = room4.isEnabled();
        java.lang.String str15 = room4.getRoomNumber();
        room4.setOccupied(false);
        room4.setOccupied(false);
        int int20 = room4.getCapacity();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test26525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26525");
        room.Room room4 = new room.Room("hi!", (int) (byte) 100, "", "Room hi! | hi! - hi! | Capacity: 0");
        java.lang.String str5 = room4.getRoomNumber();
        room4.notifyObservers();
        room.SensorObserver sensorObserver7 = null;
        room4.addObserver(sensorObserver7);
        java.lang.String str9 = room4.toString();
        int int10 = room4.getCapacity();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str5, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100" + "'", str9, "Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
    }

    @Test
    public void test26526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26526");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        room.SensorObserver sensorObserver5 = null;
        room4.addObserver(sensorObserver5);
        java.lang.String str7 = room4.getScannedID();
        java.lang.String str8 = room4.getFullLocation();
        boolean boolean9 = room4.isOccupied();
        boolean boolean10 = room4.isOccupied();
        room.SensorObserver sensorObserver11 = null;
        room4.removeObserver(sensorObserver11);
        int int13 = room4.getCapacity();
        room4.setScannedID("Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | hi! -  - Room  - Room hi! | hi! - hi! | Capacity: 0 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 0 | Capacity: 10");
        room4.setOccupied(true);
        boolean boolean18 = room4.isOccupied();
        room.SensorObserver sensorObserver19 = null;
        room4.addObserver(sensorObserver19);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi! - hi!" + "'", str8, "hi! - hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test26527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26527");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        java.lang.String str5 = room4.getScannedID();
        room4.setScannedID("hi!");
        java.lang.String str8 = room4.getBuildingName();
        java.lang.String str9 = room4.getFullLocation();
        java.lang.String str10 = room4.getRoomNumber();
        java.lang.String str11 = room4.toString();
        java.lang.String str12 = room4.getRoomNumber();
        room4.setUnderMaintenance(false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi! - hi!" + "'", str9, "hi! - hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str11, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test26528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26528");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        java.lang.String str5 = room4.getScannedID();
        room4.setScannedID("hi!");
        boolean boolean8 = room4.isEnabled();
        room4.setEnabled(false);
        room4.setScannedID("Room hi! | hi! - hi! | Capacity: 0 - hi! - ");
        int int13 = room4.getCapacity();
        room4.notifyObservers();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test26529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26529");
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
        room4.notifyObservers();
        java.lang.String str18 = room4.getRoomID();
        java.lang.String str19 = room4.getBuildingName();
        room.SensorObserver sensorObserver20 = null;
        room4.addObserver(sensorObserver20);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str11, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi! - hi!" + "'", str14, "hi! - hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str15, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test26530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26530");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        boolean boolean5 = room4.isOccupied();
        boolean boolean6 = room4.isEnabled();
        java.lang.String str7 = room4.getFullLocation();
        room.SensorObserver sensorObserver8 = null;
        room4.addObserver(sensorObserver8);
        room.SensorObserver sensorObserver10 = null;
        room4.removeObserver(sensorObserver10);
        java.lang.String str12 = room4.getScannedID();
        room4.setEnabled(true);
        java.lang.String str15 = room4.toString();
        boolean boolean16 = room4.isEnabled();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi! - hi!" + "'", str7, "hi! - hi!");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str15, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test26531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26531");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        java.lang.String str5 = room4.getScannedID();
        room4.setScannedID("hi!");
        room4.setUnderMaintenance(true);
        java.lang.String str10 = room4.getScannedID();
        java.lang.String str11 = room4.getFullLocation();
        boolean boolean12 = room4.isOccupied();
        boolean boolean13 = room4.isOccupied();
        java.lang.String str14 = room4.getFullLocation();
        java.lang.String str15 = room4.getBuildingName();
        boolean boolean16 = room4.isEnabled();
        room4.setEnabled(false);
        room4.setEnabled(false);
        java.lang.String str21 = room4.getBuildingName();
        java.lang.String str22 = room4.getRoomNumber();
        room4.setScannedID("Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 100 - Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 97");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi! - hi!" + "'", str11, "hi! - hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi! - hi!" + "'", str14, "hi! - hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
    }

    @Test
    public void test26532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26532");
        room.Room room4 = new room.Room(" - Room hi! | hi! - hi! | Capacity: 0 - hi! - ", (int) (short) 100, "hi! -  - Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100", "Room hi! | hi! - hi! | Capacity: 0 - hi! - Room hi! | hi! - hi! | Capacity: 0 - hi! - Room Room Room hi! | hi! - hi! | Capacity: 0 | Room hi! | hi! - hi! | Capacity: 0 - hi! - hi! | Capacity: 100 - Room  - Room hi! | hi! - hi! | Capacity: 0 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 0 | Room hi! | hi! - hi! - Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | Capacity: 0 - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! | Capacity: 52");
    }

    @Test
    public void test26533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26533");
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
        java.lang.String str14 = room4.getBuildingName();
        room4.setScannedID("Room hi! | hi! - hi! | Capacity: 0 - hi! - ");
        java.lang.String str17 = room4.getFullLocation();
        boolean boolean18 = room4.isUnderMaintenance();
        room.SensorObserver sensorObserver19 = null;
        room4.addObserver(sensorObserver19);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str11, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi! - hi!" + "'", str17, "hi! - hi!");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test26534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26534");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        java.lang.String str5 = room4.getScannedID();
        room4.setScannedID("hi!");
        room4.setUnderMaintenance(true);
        boolean boolean10 = room4.isOccupied();
        boolean boolean11 = room4.isOccupied();
        java.lang.String str12 = room4.getFullLocation();
        java.lang.String str13 = room4.getBuildingName();
        boolean boolean14 = room4.isUnderMaintenance();
        java.lang.String str15 = room4.getRoomID();
        java.lang.String str16 = room4.getRoomNumber();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi! - hi!" + "'", str12, "hi! - hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test26535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26535");
        room.Room room4 = new room.Room("Room hi! | hi! - hi! | Capacity: 0", (int) (byte) 10, "hi!", "");
        room4.setUnderMaintenance(true);
        int int7 = room4.getCapacity();
        java.lang.String str8 = room4.getRoomNumber();
        room4.setEnabled(true);
        room4.setEnabled(false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test26536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26536");
        room.Room room4 = new room.Room("Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100", 100, "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | hi! - hi! | Capacity: 0", "Room Room  - Room hi! | hi! - hi! | Capacity: 0 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 0 | Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 | Capacity: 97");
    }

    @Test
    public void test26537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26537");
        room.Room room4 = new room.Room("Room hi! | hi! - hi! | Capacity: 0", (int) (byte) 10, "hi!", "");
        room4.setUnderMaintenance(true);
        java.lang.String str7 = room4.toString();
        room4.notifyObservers();
        room4.setScannedID("hi! - hi!");
        room4.setOccupied(false);
        room4.setOccupied(true);
        boolean boolean15 = room4.isOccupied();
        room4.notifyObservers();
        boolean boolean17 = room4.isEnabled();
        room4.setOccupied(false);
        java.lang.String str20 = room4.getScannedID();
        room4.setScannedID("Room  - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 100 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 | Capacity: 1");
        java.lang.String str23 = room4.getScannedID();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10" + "'", str7, "Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi! - hi!" + "'", str20, "hi! - hi!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Room  - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 100 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 | Capacity: 1" + "'", str23, "Room  - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 100 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 | Capacity: 1");
    }

    @Test
    public void test26538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26538");
        room.Room room4 = new room.Room("Room hi! | hi! - hi! | Capacity: 0", (int) (byte) 10, "hi!", "");
        int int5 = room4.getCapacity();
        room4.setOccupied(false);
        room4.setOccupied(false);
        java.lang.String str10 = room4.toString();
        room4.notifyObservers();
        java.lang.String str12 = room4.getRoomID();
        room4.notifyObservers();
        room.SensorObserver sensorObserver14 = null;
        room4.removeObserver(sensorObserver14);
        room4.setEnabled(false);
        int int18 = room4.getCapacity();
        java.lang.Class<?> wildcardClass19 = room4.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10" + "'", str10, "Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str12, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test26539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26539");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        boolean boolean5 = room4.isOccupied();
        java.lang.String str6 = room4.toString();
        java.lang.String str7 = room4.toString();
        java.lang.String str8 = room4.toString();
        java.lang.String str9 = room4.toString();
        room4.setEnabled(false);
        room.SensorObserver sensorObserver12 = null;
        room4.removeObserver(sensorObserver12);
        room4.setEnabled(false);
        java.lang.String str16 = room4.getFullLocation();
        java.lang.String str17 = room4.getFullLocation();
        java.lang.String str18 = room4.getScannedID();
        java.lang.String str19 = room4.getBuildingName();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str6, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str7, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str8, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str9, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi! - hi!" + "'", str16, "hi! - hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi! - hi!" + "'", str17, "hi! - hi!");
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test26540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26540");
        room.Room room4 = new room.Room("Room Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 | Room Room hi! | hi! - hi! | Capacity: 0 | Room hi! | hi! - hi! | Capacity: 0 - hi! - hi! | Capacity: 100 - hi! - hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 0 | Room  - Room hi! | hi! - hi! | Capacity: 0 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 0 - Room Room  - Room hi! | hi! - hi! | Capacity: 0 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 0 - hi! |  - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! - Room  - Room hi! | hi! - hi! | Capacity: 0 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 0 | Capacity: 10 | Capacity: 0", (int) '4', "Room hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 1 - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room hi! | hi! - hi! | Capacity: 0", " - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10");
    }

    @Test
    public void test26541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26541");
        room.Room room4 = new room.Room("hi!", 1, "Room hi! | hi! - hi! | Capacity: 0 - hi!", "Room hi! | hi! - hi! | Capacity: 0 - hi!");
        int int5 = room4.getCapacity();
        room4.setUnderMaintenance(false);
        java.lang.String str8 = room4.toString();
        int int9 = room4.getCapacity();
        room4.setScannedID("hi!");
        room4.setEnabled(true);
        room4.setOccupied(false);
        room4.setEnabled(false);
        room.SensorObserver sensorObserver18 = null;
        room4.removeObserver(sensorObserver18);
        room4.setOccupied(false);
        int int22 = room4.getCapacity();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Room hi! | Room hi! | hi! - hi! | Capacity: 0 - hi! - Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 1" + "'", str8, "Room hi! | Room hi! | hi! - hi! | Capacity: 0 - hi! - Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 1");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
    }

    @Test
    public void test26542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26542");
        room.Room room4 = new room.Room("Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi!", (int) (short) 0, "hi! - hi! - hi!", "Room hi! | hi! - hi! | Capacity: 0");
        room4.setOccupied(false);
        room4.setUnderMaintenance(false);
        java.lang.String str9 = room4.getRoomID();
        room4.notifyObservers();
        room4.setEnabled(false);
        boolean boolean13 = room4.isUnderMaintenance();
        room4.setOccupied(false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi!" + "'", str9, "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test26543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26543");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        room.SensorObserver sensorObserver5 = null;
        room4.addObserver(sensorObserver5);
        room.SensorObserver sensorObserver7 = null;
        room4.addObserver(sensorObserver7);
        java.lang.String str9 = room4.getBuildingName();
        java.lang.String str10 = room4.getRoomID();
        int int11 = room4.getCapacity();
        room.SensorObserver sensorObserver12 = null;
        room4.removeObserver(sensorObserver12);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test26544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26544");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        java.lang.String str5 = room4.getScannedID();
        room4.setScannedID("hi!");
        room4.setUnderMaintenance(true);
        room4.setOccupied(true);
        room4.setOccupied(false);
        java.lang.String str14 = room4.getRoomNumber();
        boolean boolean15 = room4.isOccupied();
        java.lang.String str16 = room4.getScannedID();
        java.lang.String str17 = room4.getRoomID();
        java.lang.String str18 = room4.toString();
        java.lang.String str19 = room4.getScannedID();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str18, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test26545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26545");
        room.Room room4 = new room.Room("hi! - hi! - Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100", (-1), "Room hi! | hi! - hi! | Capacity: 0 - hi!", " - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi!");
        java.lang.String str5 = room4.getBuildingName();
        room4.setScannedID("Room Room hi! | hi! - hi! | Capacity: 0 |  - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 0");
        java.lang.String str8 = room4.getFullLocation();
        boolean boolean9 = room4.isOccupied();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0 - hi!" + "'", str5, "Room hi! | hi! - hi! | Capacity: 0 - hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0 - hi! -  - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi!" + "'", str8, "Room hi! | hi! - hi! | Capacity: 0 - hi! -  - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test26546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26546");
        room.Room room4 = new room.Room("hi!", (int) (byte) 100, "", "Room hi! | hi! - hi! | Capacity: 0");
        room4.setScannedID("");
        boolean boolean7 = room4.isOccupied();
        room4.setEnabled(true);
        boolean boolean10 = room4.isOccupied();
        java.lang.String str11 = room4.getRoomNumber();
        java.lang.String str12 = room4.getFullLocation();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str11, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + " - Room hi! | hi! - hi! | Capacity: 0" + "'", str12, " - Room hi! | hi! - hi! | Capacity: 0");
    }

    @Test
    public void test26547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26547");
        room.Room room4 = new room.Room("hi! -  - Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 1", 52, "", "Room hi! - hi! - hi! | hi! - hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 1");
        java.lang.String str5 = room4.toString();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Room hi! -  - Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 1 |  - Room hi! - hi! - hi! | hi! - hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 1 | Capacity: 52" + "'", str5, "Room hi! -  - Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 1 |  - Room hi! - hi! - hi! | hi! - hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 1 | Capacity: 52");
    }

    @Test
    public void test26548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26548");
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
        boolean boolean19 = room4.isOccupied();
        java.lang.String str20 = room4.getRoomID();
        room4.notifyObservers();
        room4.notifyObservers();
        java.lang.String str23 = room4.getFullLocation();
        boolean boolean24 = room4.isUnderMaintenance();
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str11, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi! - hi!" + "'", str23, "hi! - hi!");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test26549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26549");
        room.Room room4 = new room.Room("Room hi! | hi! - hi! | Capacity: 0", (int) (short) 0, "hi! - ", "Room hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 1");
        boolean boolean5 = room4.isEnabled();
        java.lang.Class<?> wildcardClass6 = room4.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test26550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26550");
        room.Room room4 = new room.Room("Room  - Room hi! | hi! - hi! | Capacity: 0 |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 0", 1, "", "Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 1");
        room4.setScannedID("Room hi! | Room hi! | hi! - hi! | Capacity: 0 - hi! - Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 1");
        room4.notifyObservers();
        room4.setEnabled(true);
    }

    @Test
    public void test26551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26551");
        room.Room room4 = new room.Room("hi!", (int) (byte) 100, "", "Room hi! | hi! - hi! | Capacity: 0");
        java.lang.String str5 = room4.getRoomNumber();
        java.lang.String str6 = room4.getBuildingName();
        boolean boolean7 = room4.isEnabled();
        int int8 = room4.getCapacity();
        java.lang.String str9 = room4.getScannedID();
        java.lang.String str10 = room4.getRoomID();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str5, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test26552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26552");
        room.Room room4 = new room.Room("Room hi! - hi! - hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 1 | Capacity: 0 - Room hi! - hi! | Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 10", (-1), "hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10", "Room hi! | hi! - hi! | Capacity: 0 - hi! -  - Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | Room hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 1 - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! | Capacity: 97");
    }

    @Test
    public void test26553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26553");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        java.lang.String str5 = room4.getScannedID();
        room4.setScannedID("hi!");
        boolean boolean8 = room4.isEnabled();
        room4.setEnabled(false);
        room4.setScannedID("Room hi! | hi! - hi! | Capacity: 0 - hi! - ");
        int int13 = room4.getCapacity();
        java.lang.String str14 = room4.getBuildingName();
        boolean boolean15 = room4.isUnderMaintenance();
        room4.notifyObservers();
        room4.setUnderMaintenance(true);
        boolean boolean19 = room4.isEnabled();
        java.lang.String str20 = room4.getBuildingName();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test26554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26554");
        room.Room room4 = new room.Room("Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10", 0, "hi!", "Room hi! | hi! - hi! | Capacity: 0");
        java.lang.String str5 = room4.getBuildingName();
        room4.notifyObservers();
        room4.setUnderMaintenance(true);
        java.lang.String str9 = room4.getRoomID();
        java.lang.String str10 = room4.toString();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10" + "'", str9, "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 | hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 0" + "'", str10, "Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 | hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 0");
    }

    @Test
    public void test26555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26555");
        room.Room room4 = new room.Room("Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10", (int) (short) 10, "hi! - ", "Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 1");
        room4.setUnderMaintenance(true);
        java.lang.String str7 = room4.getBuildingName();
        java.lang.String str8 = room4.getFullLocation();
        java.lang.String str9 = room4.getScannedID();
        room4.setUnderMaintenance(true);
        java.lang.String str12 = room4.getFullLocation();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi! - " + "'", str7, "hi! - ");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi! -  - Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 1" + "'", str8, "hi! -  - Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 1");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi! -  - Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 1" + "'", str12, "hi! -  - Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 1");
    }

    @Test
    public void test26556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26556");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        java.lang.String str5 = room4.getScannedID();
        room4.setScannedID("hi!");
        room4.setUnderMaintenance(true);
        room4.setOccupied(true);
        room4.setOccupied(false);
        java.lang.String str14 = room4.getRoomNumber();
        room4.notifyObservers();
        room4.notifyObservers();
        room4.setUnderMaintenance(false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test26557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26557");
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
        java.lang.String str14 = room4.getBuildingName();
        room4.setScannedID("Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 100 - Room hi! | hi! - hi! | Capacity: 0 - hi! - ");
        java.lang.String str17 = room4.getScannedID();
        boolean boolean18 = room4.isOccupied();
        room4.setEnabled(false);
        room.SensorObserver sensorObserver21 = null;
        room4.removeObserver(sensorObserver21);
        java.lang.String str23 = room4.toString();
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str11, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 100 - Room hi! | hi! - hi! | Capacity: 0 - hi! - " + "'", str17, "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 100 - Room hi! | hi! - hi! | Capacity: 0 - hi! - ");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str23, "Room hi! | hi! - hi! | Capacity: 0");
    }

    @Test
    public void test26558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26558");
        room.Room room4 = new room.Room("Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 97", (int) (short) 1, "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 -  - Room hi! | hi! - hi! | Capacity: 0", "Room hi! | hi! - hi! | Capacity: 0 - hi! - ");
        java.lang.String str5 = room4.getScannedID();
        room4.setOccupied(false);
        java.lang.String str8 = room4.getRoomID();
        java.lang.String str9 = room4.getRoomNumber();
        java.lang.Class<?> wildcardClass10 = room4.getClass();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 97" + "'", str8, "Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 97");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0 - hi! - " + "'", str9, "Room hi! | hi! - hi! | Capacity: 0 - hi! - ");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test26559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26559");
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
        room4.setScannedID("Room hi! | hi! - hi! - Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | Capacity: 0");
        room4.setUnderMaintenance(false);
        java.lang.String str23 = room4.getScannedID();
        room4.setScannedID("hi! - hi! - hi! - Room hi! | hi! - hi! | Capacity: 0");
        room4.setUnderMaintenance(false);
        boolean boolean28 = room4.isUnderMaintenance();
        boolean boolean29 = room4.isUnderMaintenance();
        room4.notifyObservers();
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str11, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Room hi! | hi! - hi! - Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | Capacity: 0" + "'", str23, "Room hi! | hi! - hi! - Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | Capacity: 0");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test26560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26560");
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
        java.lang.String str17 = room4.toString();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str17, "Room hi! | hi! - hi! | Capacity: 0");
    }

    @Test
    public void test26561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26561");
        room.Room room4 = new room.Room("Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi!", (-1), " - Room hi! | hi! - hi! | Capacity: 0", "Room hi! | hi! - hi! | Capacity: 0 - hi!");
        int int5 = room4.getCapacity();
        room4.setScannedID("Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 97");
        room.SensorObserver sensorObserver8 = null;
        room4.removeObserver(sensorObserver8);
        room4.notifyObservers();
        java.lang.String str11 = room4.getScannedID();
        java.lang.String str12 = room4.getFullLocation();
        java.lang.Class<?> wildcardClass13 = room4.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 97" + "'", str11, "Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 97");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + " - Room hi! | hi! - hi! | Capacity: 0 - Room hi! | hi! - hi! | Capacity: 0 - hi!" + "'", str12, " - Room hi! | hi! - hi! | Capacity: 0 - Room hi! | hi! - hi! | Capacity: 0 - hi!");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test26562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26562");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        java.lang.String str5 = room4.getScannedID();
        room4.setScannedID("hi!");
        java.lang.String str8 = room4.getBuildingName();
        java.lang.String str9 = room4.getFullLocation();
        java.lang.String str10 = room4.getRoomNumber();
        int int11 = room4.getCapacity();
        java.lang.String str12 = room4.getScannedID();
        java.lang.String str13 = room4.getRoomNumber();
        room4.setOccupied(false);
        room4.setScannedID("Room hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 1 - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi!");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi! - hi!" + "'", str9, "hi! - hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test26563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26563");
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
        boolean boolean15 = room4.isOccupied();
        room4.notifyObservers();
        room4.notifyObservers();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str7, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str10, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test26564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26564");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        java.lang.String str5 = room4.getScannedID();
        room4.setScannedID("hi!");
        boolean boolean8 = room4.isEnabled();
        int int9 = room4.getCapacity();
        boolean boolean10 = room4.isOccupied();
        java.lang.String str11 = room4.getRoomNumber();
        boolean boolean12 = room4.isOccupied();
        room4.setOccupied(true);
        room.SensorObserver sensorObserver15 = null;
        room4.removeObserver(sensorObserver15);
        room.SensorObserver sensorObserver17 = null;
        room4.removeObserver(sensorObserver17);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test26565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26565");
        room.Room room4 = new room.Room("Room Room Room hi! | hi! - hi! | Capacity: 0 | Room hi! | hi! - hi! | Capacity: 0 - hi! - hi! | Capacity: 100 - Room  - Room hi! | hi! - hi! | Capacity: 0 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 0 | Room hi! | hi! - hi! - Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | Capacity: 0 - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! | Capacity: 52", (int) (byte) -1, "hi! - hi! - hi! - Room hi! | hi! - hi! | Capacity: 0", "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 -  - Room hi! | hi! - hi! | Capacity: 0 - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! - ");
        boolean boolean5 = room4.isEnabled();
        room4.setEnabled(true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test26566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26566");
        room.Room room4 = new room.Room("Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100", (int) 'a', "hi! - hi!", "Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10");
        java.lang.String str5 = room4.toString();
        java.lang.String str6 = room4.getScannedID();
        java.lang.String str7 = room4.toString();
        java.lang.String str8 = room4.getBuildingName();
        boolean boolean9 = room4.isUnderMaintenance();
        java.lang.String str10 = room4.getFullLocation();
        room4.setScannedID("Room  - Room hi! | hi! - hi! | Capacity: 0 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 0 - hi! - Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 100 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 -  - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! | Capacity: 0");
        room4.notifyObservers();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 97" + "'", str5, "Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 97");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 97" + "'", str7, "Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 97");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi! - hi!" + "'", str8, "hi! - hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10" + "'", str10, "hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10");
    }

    @Test
    public void test26567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26567");
        room.Room room4 = new room.Room("hi!", (int) (byte) 100, "", "Room hi! | hi! - hi! | Capacity: 0");
        room4.setScannedID("");
        boolean boolean7 = room4.isOccupied();
        room.SensorObserver sensorObserver8 = null;
        room4.removeObserver(sensorObserver8);
        boolean boolean10 = room4.isEnabled();
        java.lang.String str11 = room4.getBuildingName();
        room4.setScannedID("Room Room  - Room hi! | hi! - hi! | Capacity: 0 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 0 | hi! - hi! - Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 -  - hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 0");
        boolean boolean14 = room4.isOccupied();
        room4.setOccupied(false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test26568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26568");
        room.Room room4 = new room.Room("hi!", (int) (byte) 100, "", "Room hi! | hi! - hi! | Capacity: 0");
        java.lang.String str5 = room4.getScannedID();
        boolean boolean6 = room4.isEnabled();
        boolean boolean7 = room4.isUnderMaintenance();
        room4.notifyObservers();
        room4.setEnabled(false);
        java.lang.String str11 = room4.getRoomNumber();
        boolean boolean12 = room4.isOccupied();
        java.lang.Class<?> wildcardClass13 = room4.getClass();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str11, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test26569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26569");
        room.Room room4 = new room.Room("Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi!", 10, "Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10", "hi!");
        java.lang.String str5 = room4.getScannedID();
        room.SensorObserver sensorObserver6 = null;
        room4.removeObserver(sensorObserver6);
        java.lang.String str8 = room4.getRoomID();
        boolean boolean9 = room4.isUnderMaintenance();
        room4.setUnderMaintenance(false);
        java.lang.Class<?> wildcardClass12 = room4.getClass();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi!" + "'", str8, "Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test26570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26570");
        room.Room room4 = new room.Room("", 10, "Room hi! | hi! - hi! | Capacity: 0 - hi!", "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 100 - Room hi! | hi! - hi! | Capacity: 0 - hi! - ");
        boolean boolean5 = room4.isEnabled();
        int int6 = room4.getCapacity();
        room.SensorObserver sensorObserver7 = null;
        room4.removeObserver(sensorObserver7);
        java.lang.String str9 = room4.getScannedID();
        java.lang.String str10 = room4.toString();
        boolean boolean11 = room4.isOccupied();
        java.lang.String str12 = room4.toString();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 100 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 10" + "'", str10, "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 100 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 10");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 100 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 10" + "'", str12, "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 100 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 10");
    }

    @Test
    public void test26571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26571");
        room.Room room4 = new room.Room("", (int) 'a', " - hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi!", "Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 100 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 -  - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! | Capacity: 0 - Room Room hi! | hi! - hi! | Capacity: 0 - hi! - hi! | Room Room hi! | hi! - hi! | Capacity: 0 | Room hi! | hi! - hi! | Capacity: 0 - hi! - hi! | Capacity: 100 - Room  - Room hi! | hi! - hi! | Capacity: 0 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 0 | Capacity: 10");
        int int5 = room4.getCapacity();
        boolean boolean6 = room4.isEnabled();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test26572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26572");
        room.Room room4 = new room.Room("hi!", (int) (byte) 1, "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10", "hi!");
        room4.notifyObservers();
        room4.setOccupied(false);
        room4.setUnderMaintenance(false);
        room4.setEnabled(false);
        java.lang.String str12 = room4.getBuildingName();
        room.SensorObserver sensorObserver13 = null;
        room4.removeObserver(sensorObserver13);
        room4.setUnderMaintenance(false);
        room.SensorObserver sensorObserver17 = null;
        room4.addObserver(sensorObserver17);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10" + "'", str12, "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10");
    }

    @Test
    public void test26573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26573");
        room.Room room4 = new room.Room(" - ", 10, "Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - hi! | Capacity: 1", "Room hi! | hi! - hi! | Capacity: 0 - hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 100 - Room hi! | hi! - hi! | Capacity: 0 - hi! - ");
        room4.setOccupied(true);
        room4.setEnabled(false);
        room4.setUnderMaintenance(true);
        int int11 = room4.getCapacity();
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
    }

    @Test
    public void test26574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26574");
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
        boolean boolean19 = room4.isUnderMaintenance();
        room4.notifyObservers();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test26575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26575");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        room.SensorObserver sensorObserver5 = null;
        room4.addObserver(sensorObserver5);
        java.lang.String str7 = room4.getScannedID();
        room.SensorObserver sensorObserver8 = null;
        room4.removeObserver(sensorObserver8);
        java.lang.String str10 = room4.getRoomNumber();
        java.lang.String str11 = room4.toString();
        room4.setUnderMaintenance(true);
        java.lang.String str14 = room4.toString();
        java.lang.String str15 = room4.toString();
        java.lang.String str16 = room4.getScannedID();
        room4.setUnderMaintenance(false);
        room4.setOccupied(false);
        room4.notifyObservers();
        java.lang.String str22 = room4.getRoomID();
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str11, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str14, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str15, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
    }

    @Test
    public void test26576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26576");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        room.SensorObserver sensorObserver5 = null;
        room4.addObserver(sensorObserver5);
        java.lang.String str7 = room4.getScannedID();
        room.SensorObserver sensorObserver8 = null;
        room4.removeObserver(sensorObserver8);
        java.lang.String str10 = room4.getRoomNumber();
        java.lang.String str11 = room4.toString();
        boolean boolean12 = room4.isEnabled();
        java.lang.String str13 = room4.getRoomNumber();
        room.SensorObserver sensorObserver14 = null;
        room4.removeObserver(sensorObserver14);
        int int16 = room4.getCapacity();
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str11, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test26577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26577");
        room.Room room4 = new room.Room("Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 100", (int) (short) -1, "Room hi! | Room hi! | hi! - hi! | Capacity: 0 - hi! - Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 1", "Room hi! | hi! - hi! | Capacity: 0 - hi! - ");
        room4.notifyObservers();
        room4.setOccupied(true);
    }

    @Test
    public void test26578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26578");
        room.Room room4 = new room.Room(" - ", (int) (short) 100, "Room Room Room hi! | hi! - hi! | Capacity: 0 |  - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 0 |  - Room Room hi! - hi! - Room hi! | hi! - hi! | Capacity: 0 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 100 | Capacity: 10 | Room hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 1 - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | Capacity: 0", "Room hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 1 - ");
    }

    @Test
    public void test26579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26579");
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
        java.lang.Class<?> wildcardClass18 = room4.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str7, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str10, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi! - hi!" + "'", str16, "hi! - hi!");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test26580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26580");
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
        java.lang.String str15 = room4.getRoomNumber();
        java.lang.String str16 = room4.toString();
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi! - hi!" + "'", str12, "hi! - hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str16, "Room hi! | hi! - hi! | Capacity: 0");
    }

    @Test
    public void test26581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26581");
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
        boolean boolean17 = room4.isEnabled();
        java.lang.String str18 = room4.getRoomNumber();
        boolean boolean19 = room4.isOccupied();
        java.lang.String str20 = room4.getRoomID();
        java.lang.String str21 = room4.getRoomNumber();
        boolean boolean22 = room4.isEnabled();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str7, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str10, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi! - hi!" + "'", str16, "hi! - hi!");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test26582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26582");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        boolean boolean5 = room4.isEnabled();
        java.lang.String str6 = room4.getBuildingName();
        room.SensorObserver sensorObserver7 = null;
        room4.removeObserver(sensorObserver7);
        room4.notifyObservers();
        room4.setUnderMaintenance(false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test26583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26583");
        room.Room room4 = new room.Room("Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi!", (int) (short) 100, "Room  - Room hi! | hi! - hi! | Capacity: 0 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 0 - hi! -  - hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10", "Room Room  - Room hi! | hi! - hi! | Capacity: 0 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 0 | Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 - Room hi! | Room hi! | hi! - hi! | Capacity: 0 - hi! - Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 1 | Capacity: -1");
        java.lang.String str5 = room4.getBuildingName();
        room4.setOccupied(false);
        java.lang.String str8 = room4.toString();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Room  - Room hi! | hi! - hi! | Capacity: 0 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 0 - hi! -  - hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10" + "'", str5, "Room  - Room hi! | hi! - hi! | Capacity: 0 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 0 - hi! -  - hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Room  - Room hi! | hi! - hi! | Capacity: 0 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 0 - hi! -  - hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - Room Room  - Room hi! | hi! - hi! | Capacity: 0 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 0 | Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 - Room hi! | Room hi! | hi! - hi! | Capacity: 0 - hi! - Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 1 | Capacity: -1 | Capacity: 100" + "'", str8, "Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Room  - Room hi! | hi! - hi! | Capacity: 0 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 0 - hi! -  - hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - Room Room  - Room hi! | hi! - hi! | Capacity: 0 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 0 | Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 - Room hi! | Room hi! | hi! - hi! | Capacity: 0 - hi! - Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 1 | Capacity: -1 | Capacity: 100");
    }

    @Test
    public void test26584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26584");
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
        room4.setOccupied(true);
        int int20 = room4.getCapacity();
        java.lang.String str21 = room4.getRoomNumber();
        java.lang.String str22 = room4.getScannedID();
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str11, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0 - hi!" + "'", str22, "Room hi! | hi! - hi! | Capacity: 0 - hi!");
    }

    @Test
    public void test26585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26585");
        room.Room room4 = new room.Room("Room Room  - Room hi! | hi! - hi! | Capacity: 0 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 0 | Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 - Room hi! | Room hi! | hi! - hi! | Capacity: 0 - hi! - Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 1 | Capacity: -1", (int) (short) 100, "Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 100 | hi! - hi! - hi! - hi! | Capacity: 0", "hi! - Room hi! | hi! - hi! | Capacity: 0");
        java.lang.String str5 = room4.getScannedID();
        boolean boolean6 = room4.isOccupied();
        java.lang.String str7 = room4.getBuildingName();
        boolean boolean8 = room4.isEnabled();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 100 | hi! - hi! - hi! - hi! | Capacity: 0" + "'", str7, "Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 100 | hi! - hi! - hi! - hi! | Capacity: 0");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test26586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26586");
        room.Room room4 = new room.Room("hi!", (int) (byte) 100, "", "Room hi! | hi! - hi! | Capacity: 0");
        java.lang.String str5 = room4.getScannedID();
        java.lang.String str6 = room4.getBuildingName();
        room4.setUnderMaintenance(false);
        room4.setEnabled(false);
        room4.notifyObservers();
        room4.setUnderMaintenance(true);
        java.lang.String str14 = room4.getRoomID();
        room4.setScannedID("Room hi! | hi! - hi! | Capacity: 0");
        room4.setScannedID("Room hi! | hi! - hi! | Capacity: 0");
        int int19 = room4.getCapacity();
        java.lang.String str20 = room4.toString();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100" + "'", str20, "Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100");
    }

    @Test
    public void test26587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26587");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        room.SensorObserver sensorObserver5 = null;
        room4.addObserver(sensorObserver5);
        java.lang.String str7 = room4.getScannedID();
        java.lang.String str8 = room4.getRoomNumber();
        java.lang.String str9 = room4.getRoomNumber();
        room.SensorObserver sensorObserver10 = null;
        room4.removeObserver(sensorObserver10);
        room.SensorObserver sensorObserver12 = null;
        room4.addObserver(sensorObserver12);
        java.lang.String str14 = room4.getBuildingName();
        // The following exception was thrown during execution in test generation
        try {
            room4.setUnderMaintenance(false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test26588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26588");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        java.lang.String str5 = room4.getScannedID();
        room4.setScannedID("hi!");
        room4.setUnderMaintenance(true);
        room.SensorObserver sensorObserver10 = null;
        room4.removeObserver(sensorObserver10);
        java.lang.String str12 = room4.getScannedID();
        int int13 = room4.getCapacity();
        boolean boolean14 = room4.isEnabled();
        room4.notifyObservers();
        java.lang.String str16 = room4.getScannedID();
        java.lang.String str17 = room4.getFullLocation();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi! - hi!" + "'", str17, "hi! - hi!");
    }

    @Test
    public void test26589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26589");
        room.Room room4 = new room.Room("Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 | hi! - Room hi! | hi! - hi! | Capacity: 0 - Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 97 | Capacity: 35", (int) (short) 1, "Room hi! | hi! - hi! | Capacity: 0 - hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10", "Room Room hi! | hi! - hi! | Capacity: 0 - hi! - Room hi! | hi! - hi! | Capacity: 0 - hi! | Room hi! | Room hi! | hi! - hi! | Capacity: 0 - hi! - Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 1 - Room hi! | hi! - hi! | Capacity: 0 | Capacity: -1");
        room4.setScannedID("Room hi! | hi! - hi! | Capacity: 0 - Room hi! | hi! - hi! | Capacity: 0");
    }

    @Test
    public void test26590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26590");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        room.SensorObserver sensorObserver5 = null;
        room4.addObserver(sensorObserver5);
        java.lang.String str7 = room4.getScannedID();
        room.SensorObserver sensorObserver8 = null;
        room4.removeObserver(sensorObserver8);
        java.lang.String str10 = room4.getRoomNumber();
        java.lang.String str11 = room4.toString();
        java.lang.String str12 = room4.getRoomID();
        java.lang.String str13 = room4.toString();
        room4.notifyObservers();
        boolean boolean15 = room4.isOccupied();
        java.lang.String str16 = room4.getBuildingName();
        int int17 = room4.getCapacity();
        java.lang.Class<?> wildcardClass18 = room4.getClass();
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str11, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str13, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test26591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26591");
        room.Room room4 = new room.Room("Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi!", (int) (short) 0, "hi! - hi! - hi!", "Room hi! | hi! - hi! | Capacity: 0");
        room4.setOccupied(false);
        java.lang.String str7 = room4.getBuildingName();
        room4.notifyObservers();
        int int9 = room4.getCapacity();
        java.lang.String str10 = room4.getRoomNumber();
        java.lang.String str11 = room4.getRoomID();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi! - hi! - hi!" + "'", str7, "hi! - hi! - hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str10, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi!" + "'", str11, "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi!");
    }

    @Test
    public void test26592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26592");
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
        java.lang.String str15 = room4.getBuildingName();
        java.lang.String str16 = room4.getScannedID();
        room4.setScannedID("Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | Room hi! | hi! - hi! | Capacity: 0 - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! - hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 97 - Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 97");
        boolean boolean19 = room4.isEnabled();
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str11, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test26593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26593");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        java.lang.String str5 = room4.getScannedID();
        room4.setScannedID("hi!");
        room4.setUnderMaintenance(true);
        room4.setOccupied(true);
        room4.setOccupied(false);
        room.SensorObserver sensorObserver14 = null;
        room4.removeObserver(sensorObserver14);
        boolean boolean16 = room4.isEnabled();
        java.lang.String str17 = room4.getRoomNumber();
        room.SensorObserver sensorObserver18 = null;
        room4.removeObserver(sensorObserver18);
        room4.setEnabled(false);
        java.lang.String str22 = room4.getScannedID();
        java.lang.String str23 = room4.getScannedID();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
    }

    @Test
    public void test26594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26594");
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
        java.lang.String str15 = room4.toString();
        java.lang.String str16 = room4.getBuildingName();
        java.lang.String str17 = room4.getScannedID();
        room.SensorObserver sensorObserver18 = null;
        room4.addObserver(sensorObserver18);
        java.lang.String str20 = room4.getRoomID();
        boolean boolean21 = room4.isUnderMaintenance();
        boolean boolean22 = room4.isEnabled();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str7, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str14, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str15, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test26595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26595");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        java.lang.String str5 = room4.getScannedID();
        room4.setScannedID("hi!");
        java.lang.String str8 = room4.getRoomID();
        room4.setUnderMaintenance(false);
        java.lang.String str11 = room4.getFullLocation();
        room.SensorObserver sensorObserver12 = null;
        room4.removeObserver(sensorObserver12);
        java.lang.String str14 = room4.getRoomID();
        boolean boolean15 = room4.isOccupied();
        java.lang.String str16 = room4.getBuildingName();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi! - hi!" + "'", str11, "hi! - hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test26596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26596");
        room.Room room4 = new room.Room("Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 1", 52, "hi! -  - Room  - Room hi! | hi! - hi! | Capacity: 0 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 0", "hi! - hi! - Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 97");
        room4.setEnabled(true);
        room4.setEnabled(false);
    }

    @Test
    public void test26597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26597");
        room.Room room4 = new room.Room("Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi!", 100, "Room Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! - hi! - hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: -1", "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi!");
        room.SensorObserver sensorObserver5 = null;
        room4.addObserver(sensorObserver5);
        boolean boolean7 = room4.isEnabled();
        boolean boolean8 = room4.isEnabled();
        // The following exception was thrown during execution in test generation
        try {
            room4.setUnderMaintenance(false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test26598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26598");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        java.lang.String str5 = room4.getBuildingName();
        java.lang.String str6 = room4.getRoomID();
        java.lang.String str7 = room4.getScannedID();
        room4.setEnabled(false);
        room4.setOccupied(true);
        java.lang.String str12 = room4.toString();
        java.lang.String str13 = room4.getRoomID();
        int int14 = room4.getCapacity();
        room.SensorObserver sensorObserver15 = null;
        room4.addObserver(sensorObserver15);
        int int17 = room4.getCapacity();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str12, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test26599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26599");
        room.Room room4 = new room.Room("Room hi! | hi! - hi! | Capacity: 0 - hi! - ", (int) '4', "hi! - ", "Room  - Room hi! | hi! - hi! | Capacity: 0 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 0");
        java.lang.String str5 = room4.getBuildingName();
        room.SensorObserver sensorObserver6 = null;
        room4.removeObserver(sensorObserver6);
        boolean boolean8 = room4.isUnderMaintenance();
        java.lang.String str9 = room4.getRoomNumber();
        room4.setUnderMaintenance(true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi! - " + "'", str5, "hi! - ");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Room  - Room hi! | hi! - hi! | Capacity: 0 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 0" + "'", str9, "Room  - Room hi! | hi! - hi! | Capacity: 0 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 0");
    }

    @Test
    public void test26600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26600");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        room.SensorObserver sensorObserver5 = null;
        room4.addObserver(sensorObserver5);
        java.lang.String str7 = room4.toString();
        room.SensorObserver sensorObserver8 = null;
        room4.removeObserver(sensorObserver8);
        int int10 = room4.getCapacity();
        java.lang.String str11 = room4.getRoomID();
        java.lang.String str12 = room4.getScannedID();
        boolean boolean13 = room4.isUnderMaintenance();
        java.lang.String str14 = room4.getFullLocation();
        room4.notifyObservers();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str7, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi! - hi!" + "'", str14, "hi! - hi!");
    }

    @Test
    public void test26601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26601");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        java.lang.String str5 = room4.getScannedID();
        room4.setScannedID("hi!");
        java.lang.String str8 = room4.getBuildingName();
        room4.setEnabled(false);
        room4.notifyObservers();
        java.lang.String str12 = room4.toString();
        room.SensorObserver sensorObserver13 = null;
        room4.addObserver(sensorObserver13);
        int int15 = room4.getCapacity();
        boolean boolean16 = room4.isUnderMaintenance();
        java.lang.String str17 = room4.getFullLocation();
        room.SensorObserver sensorObserver18 = null;
        room4.removeObserver(sensorObserver18);
        boolean boolean20 = room4.isEnabled();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str12, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi! - hi!" + "'", str17, "hi! - hi!");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test26602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26602");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        java.lang.String str5 = room4.getScannedID();
        room4.setScannedID("hi!");
        room4.setUnderMaintenance(true);
        room.SensorObserver sensorObserver10 = null;
        room4.addObserver(sensorObserver10);
        java.lang.String str12 = room4.getScannedID();
        room.SensorObserver sensorObserver13 = null;
        room4.removeObserver(sensorObserver13);
        boolean boolean15 = room4.isOccupied();
        room.SensorObserver sensorObserver16 = null;
        room4.removeObserver(sensorObserver16);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test26603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26603");
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
        int int19 = room4.getCapacity();
        boolean boolean20 = room4.isEnabled();
        boolean boolean21 = room4.isEnabled();
        java.lang.String str22 = room4.getRoomID();
        java.lang.Class<?> wildcardClass23 = room4.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi!" + "'", str6, "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi!");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Room hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 1" + "'", str12, "Room hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 1");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test26604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26604");
        room.Room room4 = new room.Room("Room hi! | hi! - hi! | Capacity: 0 - hi!", (int) (short) 10, "Room hi! | hi! - hi! | Capacity: 0", "Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10");
        room4.notifyObservers();
        boolean boolean6 = room4.isEnabled();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test26605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26605");
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
        room4.setUnderMaintenance(false);
        room4.setEnabled(true);
        room4.setEnabled(true);
        room4.setEnabled(false);
        java.lang.String str24 = room4.getBuildingName();
        room4.setScannedID("");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str11, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
    }

    @Test
    public void test26606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26606");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        room.SensorObserver sensorObserver5 = null;
        room4.addObserver(sensorObserver5);
        java.lang.String str7 = room4.getScannedID();
        java.lang.String str8 = room4.getRoomNumber();
        java.lang.String str9 = room4.getRoomNumber();
        room.SensorObserver sensorObserver10 = null;
        room4.removeObserver(sensorObserver10);
        room4.setEnabled(false);
        java.lang.String str14 = room4.getBuildingName();
        boolean boolean15 = room4.isOccupied();
        room4.setEnabled(false);
        room4.setUnderMaintenance(true);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test26607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26607");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        java.lang.String str5 = room4.getScannedID();
        room4.setScannedID("hi!");
        room4.setUnderMaintenance(true);
        room4.setOccupied(true);
        boolean boolean12 = room4.isUnderMaintenance();
        int int13 = room4.getCapacity();
        boolean boolean14 = room4.isUnderMaintenance();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test26608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26608");
        room.Room room4 = new room.Room("hi!", (int) (byte) 100, "", "Room hi! | hi! - hi! | Capacity: 0");
        java.lang.String str5 = room4.getScannedID();
        java.lang.String str6 = room4.getBuildingName();
        room4.setUnderMaintenance(false);
        room4.setScannedID("Room hi! | hi! - hi! | Capacity: 0 - hi! - ");
        java.lang.String str11 = room4.toString();
        java.lang.String str12 = room4.getRoomNumber();
        room4.setOccupied(true);
        boolean boolean15 = room4.isOccupied();
        room4.setScannedID("Room Room Room hi! | hi! - hi! | Capacity: 0 |  - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 0 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 1");
        java.lang.Class<?> wildcardClass18 = room4.getClass();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100" + "'", str11, "Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str12, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test26609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26609");
        room.Room room4 = new room.Room("", (int) (short) 10, "Room hi! | hi! - hi! | Capacity: 0", "hi!");
        java.lang.String str5 = room4.toString();
        java.lang.String str6 = room4.getBuildingName();
        boolean boolean7 = room4.isOccupied();
        java.lang.String str8 = room4.getFullLocation();
        java.lang.String str9 = room4.toString();
        java.lang.String str10 = room4.getScannedID();
        java.lang.String str11 = room4.getRoomID();
        java.lang.String str12 = room4.getScannedID();
        int int13 = room4.getCapacity();
        boolean boolean14 = room4.isEnabled();
        java.lang.String str15 = room4.getScannedID();
        java.lang.String str16 = room4.getFullLocation();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10" + "'", str5, "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str6, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0 - hi!" + "'", str8, "Room hi! | hi! - hi! | Capacity: 0 - hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10" + "'", str9, "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0 - hi!" + "'", str16, "Room hi! | hi! - hi! | Capacity: 0 - hi!");
    }

    @Test
    public void test26610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26610");
        room.Room room4 = new room.Room("Room Room hi! | hi! - hi! | Capacity: 0 | Room hi! | hi! - hi! | Capacity: 0 - hi! - hi! | Capacity: 100", (int) (byte) 10, "", "hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10");
        room4.setEnabled(false);
        room4.setOccupied(false);
        java.lang.String str9 = room4.getBuildingName();
        java.lang.String str10 = room4.getRoomID();
        int int11 = room4.getCapacity();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Room Room hi! | hi! - hi! | Capacity: 0 | Room hi! | hi! - hi! | Capacity: 0 - hi! - hi! | Capacity: 100" + "'", str10, "Room Room hi! | hi! - hi! | Capacity: 0 | Room hi! | hi! - hi! | Capacity: 0 - hi! - hi! | Capacity: 100");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
    }

    @Test
    public void test26611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26611");
        room.Room room4 = new room.Room("hi!", (int) (byte) 100, "", "Room hi! | hi! - hi! | Capacity: 0");
        java.lang.String str5 = room4.getScannedID();
        java.lang.String str6 = room4.getBuildingName();
        room4.setUnderMaintenance(false);
        room4.setEnabled(false);
        java.lang.String str11 = room4.getRoomNumber();
        boolean boolean12 = room4.isUnderMaintenance();
        room.SensorObserver sensorObserver13 = null;
        room4.removeObserver(sensorObserver13);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str11, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test26612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26612");
        room.Room room4 = new room.Room("Room Room hi! | hi! - hi! | Capacity: 0 | Room hi! | hi! - hi! | Capacity: 0 - hi! - hi! | Capacity: 100", (-1), "", "hi! - hi! - Room hi! | hi! - hi! | Capacity: 0");
        room4.setUnderMaintenance(true);
        java.lang.String str7 = room4.toString();
        boolean boolean8 = room4.isEnabled();
        int int9 = room4.getCapacity();
        room.SensorObserver sensorObserver10 = null;
        room4.addObserver(sensorObserver10);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Room Room Room hi! | hi! - hi! | Capacity: 0 | Room hi! | hi! - hi! | Capacity: 0 - hi! - hi! | Capacity: 100 |  - hi! - hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: -1" + "'", str7, "Room Room Room hi! | hi! - hi! | Capacity: 0 | Room hi! | hi! - hi! | Capacity: 0 - hi! - hi! | Capacity: 100 |  - hi! - hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: -1");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test26613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26613");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        java.lang.String str5 = room4.getScannedID();
        room4.setScannedID("hi!");
        room4.setEnabled(true);
        room4.notifyObservers();
        java.lang.String str11 = room4.getScannedID();
        java.lang.String str12 = room4.getBuildingName();
        room4.setScannedID("Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 100 - Room hi! | hi! - hi! | Capacity: 0 - hi! - ");
        java.lang.String str15 = room4.toString();
        room4.setOccupied(false);
        int int18 = room4.getCapacity();
        room4.notifyObservers();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str15, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test26614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26614");
        room.Room room4 = new room.Room("Room hi! | hi! - hi! | Capacity: 0", (int) 'a', "Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10", "");
        boolean boolean5 = room4.isUnderMaintenance();
        boolean boolean6 = room4.isEnabled();
        room4.setOccupied(false);
        boolean boolean9 = room4.isOccupied();
        java.lang.String str10 = room4.toString();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Room Room hi! | hi! - hi! | Capacity: 0 | Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 -  | Capacity: 97" + "'", str10, "Room Room hi! | hi! - hi! | Capacity: 0 | Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 -  | Capacity: 97");
    }

    @Test
    public void test26615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26615");
        room.Room room4 = new room.Room("hi!", (int) (byte) 100, "", "Room hi! | hi! - hi! | Capacity: 0");
        java.lang.String str5 = room4.toString();
        room4.setOccupied(false);
        room4.setUnderMaintenance(true);
        boolean boolean10 = room4.isOccupied();
        java.lang.String str11 = room4.getScannedID();
        boolean boolean12 = room4.isUnderMaintenance();
        java.lang.String str13 = room4.toString();
        java.lang.String str14 = room4.toString();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100" + "'", str5, "Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100" + "'", str13, "Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100" + "'", str14, "Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100");
    }

    @Test
    public void test26616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26616");
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
        java.lang.String str22 = room4.getRoomID();
        int int23 = room4.getCapacity();
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str11, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str17, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test26617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26617");
        room.Room room4 = new room.Room("hi!", (int) (byte) 1, "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10", "hi!");
        room4.notifyObservers();
        room4.setOccupied(false);
        room4.setUnderMaintenance(true);
        room4.setEnabled(true);
        room.SensorObserver sensorObserver12 = null;
        room4.addObserver(sensorObserver12);
        boolean boolean14 = room4.isEnabled();
        java.lang.String str15 = room4.getRoomNumber();
        int int16 = room4.getCapacity();
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test26618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26618");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        room.SensorObserver sensorObserver5 = null;
        room4.addObserver(sensorObserver5);
        java.lang.String str7 = room4.getScannedID();
        boolean boolean8 = room4.isEnabled();
        java.lang.String str9 = room4.getScannedID();
        boolean boolean10 = room4.isUnderMaintenance();
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test26619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26619");
        room.Room room4 = new room.Room("hi!", (int) (byte) 100, "", "Room hi! | hi! - hi! | Capacity: 0");
        room4.setScannedID("");
        boolean boolean7 = room4.isOccupied();
        room4.setOccupied(true);
        boolean boolean10 = room4.isEnabled();
        boolean boolean11 = room4.isEnabled();
        int int12 = room4.getCapacity();
        room4.setUnderMaintenance(true);
        java.lang.String str15 = room4.getBuildingName();
        java.lang.String str16 = room4.getScannedID();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test26620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26620");
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
        java.lang.String str16 = room4.getRoomID();
        java.lang.String str17 = room4.getScannedID();
        boolean boolean18 = room4.isOccupied();
        room4.setEnabled(true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str7, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str10, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str14, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test26621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26621");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        room.SensorObserver sensorObserver5 = null;
        room4.removeObserver(sensorObserver5);
        java.lang.String str7 = room4.getScannedID();
        boolean boolean8 = room4.isUnderMaintenance();
        java.lang.String str9 = room4.getRoomNumber();
        room.SensorObserver sensorObserver10 = null;
        room4.addObserver(sensorObserver10);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test26622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26622");
        room.Room room4 = new room.Room("", (int) (short) 1, "hi! - hi! - hi!", "");
        java.lang.String str5 = room4.getScannedID();
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test26623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26623");
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
        java.lang.String str16 = room4.getRoomID();
        room.SensorObserver sensorObserver17 = null;
        room4.removeObserver(sensorObserver17);
        boolean boolean19 = room4.isUnderMaintenance();
        java.lang.String str20 = room4.getRoomID();
        room4.setUnderMaintenance(false);
        int int23 = room4.getCapacity();
        java.lang.String str24 = room4.getFullLocation();
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str11, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi! - hi!" + "'", str24, "hi! - hi!");
    }

    @Test
    public void test26624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26624");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        java.lang.String str5 = room4.getScannedID();
        room4.setScannedID("hi!");
        room4.setUnderMaintenance(true);
        boolean boolean10 = room4.isOccupied();
        boolean boolean11 = room4.isOccupied();
        java.lang.String str12 = room4.getFullLocation();
        java.lang.String str13 = room4.getBuildingName();
        boolean boolean14 = room4.isUnderMaintenance();
        java.lang.String str15 = room4.getFullLocation();
        java.lang.String str16 = room4.getFullLocation();
        java.lang.String str17 = room4.getFullLocation();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi! - hi!" + "'", str12, "hi! - hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi! - hi!" + "'", str15, "hi! - hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi! - hi!" + "'", str16, "hi! - hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi! - hi!" + "'", str17, "hi! - hi!");
    }

    @Test
    public void test26625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26625");
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
        room4.setScannedID("Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 1 - Room hi! | hi! - hi! | Capacity: 0 - hi!");
        java.lang.String str21 = room4.getScannedID();
        java.lang.String str22 = room4.getScannedID();
        room4.setUnderMaintenance(false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str11, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 1 - Room hi! | hi! - hi! | Capacity: 0 - hi!" + "'", str21, "Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 1 - Room hi! | hi! - hi! | Capacity: 0 - hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 1 - Room hi! | hi! - hi! | Capacity: 0 - hi!" + "'", str22, "Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 1 - Room hi! | hi! - hi! | Capacity: 0 - hi!");
    }

    @Test
    public void test26626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26626");
        room.Room room4 = new room.Room("Room Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 97 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - hi! - Room Room hi! - hi! - hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 1 | Capacity: 0 | Room hi! -  | Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 10 -  | Capacity: 52 | Capacity: 32", (int) '4', "", "Room Room Room  - Room hi! | hi! - hi! | Capacity: 0 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 0 | Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 - Room hi! | Room hi! | hi! - hi! | Capacity: 0 - hi! - Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 1 | Capacity: -1 | Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 100 | hi! - hi! - hi! - hi! | Capacity: 0 - hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100");
        java.lang.String str5 = room4.getBuildingName();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test26627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26627");
        room.Room room4 = new room.Room("Room hi! - hi! - hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 1 | Capacity: 0", 52, "Room hi! -  | Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 10", "");
        room4.setScannedID("hi! - hi! - Room hi! | hi! - hi! | Capacity: 0");
        room4.setEnabled(false);
        java.lang.String str9 = room4.getRoomNumber();
        room4.setUnderMaintenance(true);
        java.lang.String str12 = room4.toString();
        room.SensorObserver sensorObserver13 = null;
        room4.removeObserver(sensorObserver13);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Room Room hi! - hi! - hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 1 | Capacity: 0 | Room hi! -  | Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 10 -  | Capacity: 52" + "'", str12, "Room Room hi! - hi! - hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 1 | Capacity: 0 | Room hi! -  | Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 10 -  | Capacity: 52");
    }

    @Test
    public void test26628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26628");
        room.Room room4 = new room.Room("Room Room Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! - hi! - hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: -1 | Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 1 - Room hi! | hi! - hi! | Capacity: 0 - hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! - hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 97 | Capacity: 0", (-1), "Room hi! | Room hi! | hi! - hi! | Capacity: 0 - hi! - Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 1", "Room Room hi! | hi! - hi! | Capacity: 0 - hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! - hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 97 | Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 100 | hi! - hi! - hi! - hi! | Capacity: 0 - Room Room hi! | hi! - hi! | Capacity: 0 - hi! |  - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 | Capacity: 1 | Capacity: -1");
    }

    @Test
    public void test26629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26629");
        room.Room room4 = new room.Room("Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100", 0, "hi! - hi!", "hi!");
        java.lang.String str5 = room4.getFullLocation();
        boolean boolean6 = room4.isUnderMaintenance();
        room4.setUnderMaintenance(true);
        java.lang.String str9 = room4.toString();
        java.lang.String str10 = room4.getBuildingName();
        room4.setEnabled(false);
        room4.setEnabled(false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi! - hi! - hi!" + "'", str5, "hi! - hi! - hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | hi! - hi! - hi! | Capacity: 0" + "'", str9, "Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | hi! - hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi! - hi!" + "'", str10, "hi! - hi!");
    }

    @Test
    public void test26630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26630");
        room.Room room4 = new room.Room(" - Room hi! | hi! - hi! | Capacity: 0", (int) '#', "Room hi! | hi! - hi! | Capacity: 0", "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10");
        boolean boolean5 = room4.isUnderMaintenance();
        room4.setScannedID("Room  | Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 100 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 -  - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! | Capacity: 0 - Room Room hi! | hi! - hi! | Capacity: 0 - hi! - hi! | Room Room hi! | hi! - hi! | Capacity: 0 | Room hi! | hi! - hi! | Capacity: 0 - hi! - hi! | Capacity: 100 - Room  - Room hi! | hi! - hi! | Capacity: 0 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 0 | Capacity: 10 | Capacity: 0");
        java.lang.Class<?> wildcardClass8 = room4.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test26631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26631");
        room.Room room4 = new room.Room("Room Room hi! | hi! - hi! | Capacity: 0 - hi! |  - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 | Capacity: 1", (int) (byte) 0, "Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 100 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: -1", "Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 97");
        room4.setUnderMaintenance(false);
        room.SensorObserver sensorObserver7 = null;
        room4.addObserver(sensorObserver7);
    }

    @Test
    public void test26632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26632");
        room.Room room4 = new room.Room("Room Room hi! | hi! - hi! | Capacity: 0 - hi! | Room hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 1 -  | Capacity: 1", 1, "Room Room hi! | hi! - hi! | Capacity: 0 - hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 100 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Room hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 1 - Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | hi! -  - Room  - Room hi! | hi! - hi! | Capacity: 0 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 0 | Capacity: 10 - Room  - Room hi! | hi! - hi! | Capacity: 0 |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 0 | Capacity: 100", "Room Room hi! | hi! - hi! | Capacity: 0 | Room hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 1 - Room hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 1 | Capacity: 1");
        boolean boolean5 = room4.isOccupied();
        java.lang.String str6 = room4.getScannedID();
        room4.setScannedID("Room Room Room hi! | hi! - hi! | Capacity: 0 - hi! | Room hi! | Room hi! | hi! - hi! | Capacity: 0 - hi! - Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 1 - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 32 | Room Room hi! | hi! - hi! | Capacity: 0 - hi! - hi! | Room Room hi! | hi! - hi! | Capacity: 0 | Room hi! | hi! - hi! | Capacity: 0 - hi! - hi! | Capacity: 100 - Room  - Room hi! | hi! - hi! | Capacity: 0 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 0 | Capacity: 10 - Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 97 | Capacity: 52 - Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 - ");
        java.lang.String str9 = room4.getScannedID();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Room Room Room hi! | hi! - hi! | Capacity: 0 - hi! | Room hi! | Room hi! | hi! - hi! | Capacity: 0 - hi! - Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 1 - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 32 | Room Room hi! | hi! - hi! | Capacity: 0 - hi! - hi! | Room Room hi! | hi! - hi! | Capacity: 0 | Room hi! | hi! - hi! | Capacity: 0 - hi! - hi! | Capacity: 100 - Room  - Room hi! | hi! - hi! | Capacity: 0 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 0 | Capacity: 10 - Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 97 | Capacity: 52 - Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 - " + "'", str9, "Room Room Room hi! | hi! - hi! | Capacity: 0 - hi! | Room hi! | Room hi! | hi! - hi! | Capacity: 0 - hi! - Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 1 - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 32 | Room Room hi! | hi! - hi! | Capacity: 0 - hi! - hi! | Room Room hi! | hi! - hi! | Capacity: 0 | Room hi! | hi! - hi! | Capacity: 0 - hi! - hi! | Capacity: 100 - Room  - Room hi! | hi! - hi! | Capacity: 0 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 0 | Capacity: 10 - Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 97 | Capacity: 52 - Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 - ");
    }

    @Test
    public void test26633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26633");
        room.Room room4 = new room.Room("Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10", 0, "hi!", "Room hi! | hi! - hi! | Capacity: 0");
        room4.setScannedID("Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100");
        room4.notifyObservers();
        int int8 = room4.getCapacity();
        java.lang.String str9 = room4.getBuildingName();
        boolean boolean10 = room4.isOccupied();
        room4.setUnderMaintenance(false);
        java.lang.String str13 = room4.toString();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 | hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 0" + "'", str13, "Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 | hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 0");
    }

    @Test
    public void test26634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26634");
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
        java.lang.String str18 = room4.toString();
        java.lang.String str19 = room4.toString();
        room4.setOccupied(true);
        room4.setScannedID("Room Room Room hi! | hi! - hi! | Capacity: 0 | Room hi! | hi! - hi! | Capacity: 0 - hi! - hi! | Capacity: 100 |  - hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 10");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str7, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str10, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str14, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi! - hi!" + "'", str17, "hi! - hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str18, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str19, "Room hi! | hi! - hi! | Capacity: 0");
    }

    @Test
    public void test26635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26635");
        room.Room room4 = new room.Room("Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100", (int) (short) 1, "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi!", "Room hi! | hi! - hi! | Capacity: 0");
        java.lang.String str5 = room4.toString();
        boolean boolean6 = room4.isUnderMaintenance();
        java.lang.String str7 = room4.getRoomID();
        java.lang.String str8 = room4.getFullLocation();
        boolean boolean9 = room4.isUnderMaintenance();
        java.lang.String str10 = room4.toString();
        java.lang.String str11 = room4.toString();
        room4.notifyObservers();
        java.lang.String str13 = room4.getRoomNumber();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 1" + "'", str5, "Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 1");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100" + "'", str7, "Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room hi! | hi! - hi! | Capacity: 0" + "'", str8, "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 1" + "'", str10, "Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 1");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 1" + "'", str11, "Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 1");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str13, "Room hi! | hi! - hi! | Capacity: 0");
    }

    @Test
    public void test26636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26636");
        room.Room room4 = new room.Room("", (int) (byte) 100, "Room hi! | hi! - hi! | Capacity: 0 - hi!", "");
        room4.setUnderMaintenance(true);
        room4.setScannedID("Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 100");
        room4.setUnderMaintenance(true);
        room4.setUnderMaintenance(false);
        java.lang.String str13 = room4.getBuildingName();
        boolean boolean14 = room4.isUnderMaintenance();
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0 - hi!" + "'", str13, "Room hi! | hi! - hi! | Capacity: 0 - hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test26637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26637");
        room.Room room4 = new room.Room("hi! - hi! - hi!", 1, "hi! - hi!", "Room hi! | hi! - hi! | Capacity: 0");
        room.SensorObserver sensorObserver5 = null;
        room4.addObserver(sensorObserver5);
        int int7 = room4.getCapacity();
        // The following exception was thrown during execution in test generation
        try {
            room4.setOccupied(true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test26638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26638");
        room.Room room4 = new room.Room("hi!", (int) (byte) 1, "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10", "hi!");
        room4.notifyObservers();
        java.lang.String str6 = room4.getFullLocation();
        java.lang.String str7 = room4.getScannedID();
        java.lang.String str8 = room4.getFullLocation();
        java.lang.String str9 = room4.getFullLocation();
        java.lang.String str10 = room4.getRoomNumber();
        room4.setOccupied(false);
        java.lang.String str13 = room4.getBuildingName();
        java.lang.String str14 = room4.getFullLocation();
        room.SensorObserver sensorObserver15 = null;
        room4.addObserver(sensorObserver15);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi!" + "'", str6, "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi!");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi!" + "'", str8, "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi!" + "'", str9, "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10" + "'", str13, "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi!" + "'", str14, "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi!");
    }

    @Test
    public void test26639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26639");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        room.SensorObserver sensorObserver5 = null;
        room4.addObserver(sensorObserver5);
        java.lang.String str7 = room4.toString();
        room.SensorObserver sensorObserver8 = null;
        room4.removeObserver(sensorObserver8);
        java.lang.String str10 = room4.toString();
        java.lang.String str11 = room4.getRoomID();
        boolean boolean12 = room4.isOccupied();
        room4.setUnderMaintenance(false);
        room4.setEnabled(true);
        int int17 = room4.getCapacity();
        java.lang.String str18 = room4.getFullLocation();
        java.lang.String str19 = room4.getRoomID();
        room4.notifyObservers();
        room4.notifyObservers();
        java.lang.String str22 = room4.getRoomNumber();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str7, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str10, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi! - hi!" + "'", str18, "hi! - hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
    }

    @Test
    public void test26640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26640");
        room.Room room4 = new room.Room("Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100", (int) 'a', "hi! - hi!", "Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10");
        java.lang.String str5 = room4.toString();
        room4.setScannedID("Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi!");
        room4.setOccupied(true);
        java.lang.String str10 = room4.getBuildingName();
        java.lang.String str11 = room4.getRoomID();
        java.lang.String str12 = room4.getRoomNumber();
        room.SensorObserver sensorObserver13 = null;
        room4.addObserver(sensorObserver13);
        boolean boolean15 = room4.isUnderMaintenance();
        // The following exception was thrown during execution in test generation
        try {
            room4.notifyObservers();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 97" + "'", str5, "Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 97");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi! - hi!" + "'", str10, "hi! - hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100" + "'", str11, "Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10" + "'", str12, "Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test26641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26641");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        java.lang.String str5 = room4.getScannedID();
        room4.setScannedID("hi!");
        room4.setUnderMaintenance(true);
        room4.setOccupied(true);
        room4.setOccupied(false);
        java.lang.String str14 = room4.getRoomNumber();
        boolean boolean15 = room4.isOccupied();
        room4.setScannedID("Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | hi! - hi! - hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 0 - Room Room  - Room hi! | hi! - hi! | Capacity: 0 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 0 | hi! - hi! - Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 -  - hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 0");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test26642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26642");
        room.Room room4 = new room.Room("Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100", 1, "Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 100 | hi! - hi! - hi! - hi! | Capacity: 0", "");
        room.SensorObserver sensorObserver5 = null;
        room4.removeObserver(sensorObserver5);
        boolean boolean7 = room4.isUnderMaintenance();
        room4.setUnderMaintenance(true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test26643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26643");
        room.Room room4 = new room.Room("Room  | Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 1", (int) (short) 0, "Room Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 97 | Room hi! | hi! - hi! | Capacity: 0 - hi! -  - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 | Capacity: 100", "Room hi! - hi! |  - Room hi! | hi! - hi! | Capacity: 0 - Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 97 | Capacity: -1");
    }

    @Test
    public void test26644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26644");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        java.lang.String str5 = room4.getScannedID();
        room4.setScannedID("hi!");
        java.lang.String str8 = room4.getBuildingName();
        java.lang.String str9 = room4.getFullLocation();
        java.lang.String str10 = room4.getRoomNumber();
        int int11 = room4.getCapacity();
        java.lang.String str12 = room4.getScannedID();
        boolean boolean13 = room4.isUnderMaintenance();
        room4.setEnabled(true);
        room.SensorObserver sensorObserver16 = null;
        room4.addObserver(sensorObserver16);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi! - hi!" + "'", str9, "hi! - hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test26645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26645");
        room.Room room4 = new room.Room("hi!", (int) '#', "Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10", "Room hi! | hi! - hi! | Capacity: 0 - hi!");
        boolean boolean5 = room4.isOccupied();
        int int6 = room4.getCapacity();
        java.lang.String str7 = room4.getRoomID();
        room4.setUnderMaintenance(true);
        java.lang.Class<?> wildcardClass10 = room4.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test26646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26646");
        room.Room room4 = new room.Room("hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10", (-1), "Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 | hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 0", "Room hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 1");
        room4.setOccupied(false);
        java.lang.String str7 = room4.getRoomNumber();
        room4.setScannedID("Room Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! - hi! - hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: -1");
        java.lang.String str10 = room4.getRoomNumber();
        room4.setScannedID("Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! - ");
        java.lang.Class<?> wildcardClass13 = room4.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Room hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 1" + "'", str7, "Room hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 1");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Room hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 1" + "'", str10, "Room hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 1");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test26647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26647");
        room.Room room4 = new room.Room("Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi!", (int) (short) 0, "hi! - hi! - hi!", "Room hi! | hi! - hi! | Capacity: 0");
        room4.setOccupied(false);
        room.SensorObserver sensorObserver7 = null;
        room4.addObserver(sensorObserver7);
        java.lang.String str9 = room4.getScannedID();
        java.lang.String str10 = room4.getRoomID();
        java.lang.String str11 = room4.getRoomID();
        room.SensorObserver sensorObserver12 = null;
        room4.removeObserver(sensorObserver12);
        room4.setUnderMaintenance(true);
        room4.notifyObservers();
        java.lang.String str17 = room4.toString();
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi!" + "'", str10, "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi!" + "'", str11, "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | hi! - hi! - hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 0" + "'", str17, "Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | hi! - hi! - hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 0");
    }

    @Test
    public void test26648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26648");
        room.Room room4 = new room.Room("hi!", 1, "Room hi! | hi! - hi! | Capacity: 0 - hi!", "Room hi! | hi! - hi! | Capacity: 0 - hi!");
        java.lang.String str5 = room4.getBuildingName();
        room4.setEnabled(false);
        boolean boolean8 = room4.isOccupied();
        int int9 = room4.getCapacity();
        room4.setUnderMaintenance(false);
        java.lang.String str12 = room4.getScannedID();
        room4.setScannedID("Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 1 - hi! - hi! - Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0 - hi!" + "'", str5, "Room hi! | hi! - hi! | Capacity: 0 - hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test26649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26649");
        room.Room room4 = new room.Room("Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100", 0, "hi! - hi!", "hi!");
        java.lang.String str5 = room4.getFullLocation();
        boolean boolean6 = room4.isUnderMaintenance();
        room4.setUnderMaintenance(true);
        java.lang.String str9 = room4.toString();
        room4.setOccupied(false);
        java.lang.String str12 = room4.getScannedID();
        java.lang.String str13 = room4.getFullLocation();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi! - hi! - hi!" + "'", str5, "hi! - hi! - hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | hi! - hi! - hi! | Capacity: 0" + "'", str9, "Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | hi! - hi! - hi! | Capacity: 0");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi! - hi! - hi!" + "'", str13, "hi! - hi! - hi!");
    }

    @Test
    public void test26650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26650");
        room.Room room4 = new room.Room("Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 - Room Room hi! | hi! - hi! | Capacity: 0 | hi! - hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 97", 52, "", "Room Room Room hi! | hi! - hi! | Capacity: 0 | Room hi! | hi! - hi! | Capacity: 0 - hi! - hi! | Capacity: 100 | Room hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 1 - Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | hi! -  - Room  - Room hi! | hi! - hi! | Capacity: 0 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 0 | Capacity: 10 | Capacity: 52");
    }

    @Test
    public void test26651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26651");
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
        java.lang.String str18 = room4.getScannedID();
        java.lang.String str19 = room4.getBuildingName();
        java.lang.String str20 = room4.getFullLocation();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi! - hi!" + "'", str20, "hi! - hi!");
    }

    @Test
    public void test26652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26652");
        room.Room room4 = new room.Room("Room hi! | hi! - hi! | Capacity: 0", (int) (byte) 10, "hi!", "");
        int int5 = room4.getCapacity();
        java.lang.String str6 = room4.getScannedID();
        java.lang.String str7 = room4.getBuildingName();
        boolean boolean8 = room4.isUnderMaintenance();
        room.SensorObserver sensorObserver9 = null;
        room4.addObserver(sensorObserver9);
        room.SensorObserver sensorObserver11 = null;
        room4.removeObserver(sensorObserver11);
        room4.setEnabled(false);
        java.lang.String str15 = room4.getFullLocation();
        java.lang.String str16 = room4.getRoomID();
        room.SensorObserver sensorObserver17 = null;
        room4.removeObserver(sensorObserver17);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi! - " + "'", str15, "hi! - ");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str16, "Room hi! | hi! - hi! | Capacity: 0");
    }

    @Test
    public void test26653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26653");
        room.Room room4 = new room.Room("Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100", (int) 'a', "hi! - hi!", "Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10");
        java.lang.String str5 = room4.toString();
        room4.setScannedID("Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi!");
        room4.setUnderMaintenance(true);
        room4.notifyObservers();
        room4.setScannedID("");
        boolean boolean13 = room4.isEnabled();
        room4.notifyObservers();
        java.lang.String str15 = room4.getScannedID();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 97" + "'", str5, "Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 97");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test26654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26654");
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
        boolean boolean22 = room4.isUnderMaintenance();
        room4.setUnderMaintenance(true);
        room4.setEnabled(false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str11, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi! - hi!" + "'", str14, "hi! - hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test26655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26655");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        boolean boolean5 = room4.isOccupied();
        boolean boolean6 = room4.isEnabled();
        java.lang.String str7 = room4.getRoomID();
        room4.setScannedID("");
        java.lang.String str10 = room4.getFullLocation();
        java.lang.String str11 = room4.getFullLocation();
        room4.setUnderMaintenance(true);
        int int14 = room4.getCapacity();
        boolean boolean15 = room4.isUnderMaintenance();
        boolean boolean16 = room4.isOccupied();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi! - hi!" + "'", str10, "hi! - hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi! - hi!" + "'", str11, "hi! - hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test26656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26656");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        java.lang.String str5 = room4.getBuildingName();
        java.lang.String str6 = room4.getBuildingName();
        boolean boolean7 = room4.isEnabled();
        room.SensorObserver sensorObserver8 = null;
        room4.addObserver(sensorObserver8);
        int int10 = room4.getCapacity();
        java.lang.String str11 = room4.getScannedID();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test26657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26657");
        room.Room room4 = new room.Room("Room hi! | hi! - hi! | Capacity: 0 - hi! - hi! - Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | hi! -  - Room  - Room hi! | hi! - hi! | Capacity: 0 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 0 | Capacity: 10", 10, "Room hi! - hi! - Room hi! | hi! - hi! | Capacity: 0 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 100 | Capacity: 10", "Room hi! | hi! - hi! | Capacity: 0 - hi! - hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10");
        java.lang.String str5 = room4.getRoomID();
        int int6 = room4.getCapacity();
        room.SensorObserver sensorObserver7 = null;
        room4.addObserver(sensorObserver7);
        boolean boolean9 = room4.isEnabled();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0 - hi! - hi! - Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | hi! -  - Room  - Room hi! | hi! - hi! | Capacity: 0 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 0 | Capacity: 10" + "'", str5, "Room hi! | hi! - hi! | Capacity: 0 - hi! - hi! - Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | hi! -  - Room  - Room hi! | hi! - hi! | Capacity: 0 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 0 | Capacity: 10");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test26658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26658");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        java.lang.String str5 = room4.getScannedID();
        room4.setScannedID("hi!");
        boolean boolean8 = room4.isEnabled();
        int int9 = room4.getCapacity();
        int int10 = room4.getCapacity();
        boolean boolean11 = room4.isOccupied();
        room4.setEnabled(false);
        boolean boolean14 = room4.isOccupied();
        room.SensorObserver sensorObserver15 = null;
        room4.addObserver(sensorObserver15);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test26659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26659");
        room.Room room4 = new room.Room("Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! -  - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10", 0, "", "Room Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 | hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 0 - hi! - hi! - Room hi! | hi! - hi! | Capacity: 0 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 -  - Room hi! | hi! - hi! | Capacity: 0 - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! -  | Capacity: 10");
        java.lang.Class<?> wildcardClass5 = room4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test26660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26660");
        room.Room room4 = new room.Room("", (int) 'a', "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi!", "Room  - Room hi! | hi! - hi! | Capacity: 0 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 0");
        room4.setEnabled(false);
        java.lang.String str7 = room4.getRoomID();
        room4.setOccupied(true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test26661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26661");
        room.Room room4 = new room.Room("hi!", (int) (byte) 100, "", "Room hi! | hi! - hi! | Capacity: 0");
        java.lang.String str5 = room4.getScannedID();
        java.lang.String str6 = room4.getBuildingName();
        room4.setUnderMaintenance(false);
        room4.setScannedID("Room hi! | hi! - hi! | Capacity: 0 - hi! - ");
        room4.setScannedID("");
        java.lang.String str13 = room4.toString();
        boolean boolean14 = room4.isOccupied();
        room.SensorObserver sensorObserver15 = null;
        room4.removeObserver(sensorObserver15);
        java.lang.String str17 = room4.getBuildingName();
        java.lang.String str18 = room4.toString();
        java.lang.String str19 = room4.getRoomNumber();
        int int20 = room4.getCapacity();
        java.lang.String str21 = room4.getRoomNumber();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100" + "'", str13, "Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100" + "'", str18, "Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str19, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str21, "Room hi! | hi! - hi! | Capacity: 0");
    }

    @Test
    public void test26662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26662");
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
        java.lang.String str17 = room4.getScannedID();
        boolean boolean18 = room4.isEnabled();
        room4.setUnderMaintenance(true);
        java.lang.String str21 = room4.getBuildingName();
        room4.setScannedID("Room Room Room hi! - hi! - Room hi! | hi! - hi! | Capacity: 0 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 100 | Capacity: 10 | Room hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 1 - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | Room  - Room hi! | hi! - hi! | Capacity: 0 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 0 - hi! -  - hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 -  | Capacity: 1");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str11, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
    }

    @Test
    public void test26663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26663");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        java.lang.String str5 = room4.getScannedID();
        room4.setScannedID("hi!");
        java.lang.String str8 = room4.getBuildingName();
        java.lang.String str9 = room4.getRoomNumber();
        int int10 = room4.getCapacity();
        boolean boolean11 = room4.isEnabled();
        java.lang.String str12 = room4.getFullLocation();
        java.lang.String str13 = room4.getRoomID();
        java.lang.String str14 = room4.getFullLocation();
        boolean boolean15 = room4.isEnabled();
        boolean boolean16 = room4.isEnabled();
        room.SensorObserver sensorObserver17 = null;
        room4.addObserver(sensorObserver17);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi! - hi!" + "'", str12, "hi! - hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi! - hi!" + "'", str14, "hi! - hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test26664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26664");
        room.Room room4 = new room.Room("Room Room hi! | hi! - hi! | Capacity: 0 - hi! - Room hi! | hi! - hi! | Capacity: 0 - hi! | Room hi! | Room hi! | hi! - hi! | Capacity: 0 - hi! - Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 1 - Room hi! | hi! - hi! | Capacity: 0 | Capacity: -1", (int) (byte) 100, "Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 100 | hi! - hi! - hi! - hi! | Capacity: 0 - Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 1", "Room hi! | hi! - hi! | Capacity: 0 - hi! - Room hi! | hi! - hi! | Capacity: 0 - hi! - hi! - hi! - Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100");
        java.lang.String str5 = room4.getRoomNumber();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0 - hi! - Room hi! | hi! - hi! | Capacity: 0 - hi! - hi! - hi! - Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100" + "'", str5, "Room hi! | hi! - hi! | Capacity: 0 - hi! - Room hi! | hi! - hi! | Capacity: 0 - hi! - hi! - hi! - Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100");
    }

    @Test
    public void test26665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26665");
        room.Room room4 = new room.Room("hi! - Room Room hi! | hi! - hi! | Capacity: 0 | Room hi! | hi! - hi! | Capacity: 0 - hi! - hi! | Capacity: 100", (int) (short) 0, "Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | Room hi! | hi! - hi! | Capacity: 0 - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! - hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 97 - Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 97", "Room hi! - hi! - hi! | hi! - hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 1 - Room hi! - hi! - hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 1 | Capacity: 0");
    }

    @Test
    public void test26666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26666");
        room.Room room4 = new room.Room("Room Room hi! | hi! - hi! | Capacity: 0 - hi! | Room hi! | hi! - hi! | Capacity: 0 - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 10", 0, "Room Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 | Room Room hi! | hi! - hi! | Capacity: 0 | Room hi! | hi! - hi! | Capacity: 0 - hi! - hi! | Capacity: 100 - hi! - hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 0 | Room  - Room hi! | hi! - hi! | Capacity: 0 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 0 - Room Room  - Room hi! | hi! - hi! | Capacity: 0 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 0 - hi! |  - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! - Room  - Room hi! | hi! - hi! | Capacity: 0 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 0 | Capacity: 10 | Capacity: 0", "Room hi! | hi! - hi! | Capacity: 0 - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! - hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 97");
    }

    @Test
    public void test26667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26667");
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
        java.lang.String str16 = room4.getRoomID();
        java.lang.String str17 = room4.getScannedID();
        boolean boolean18 = room4.isOccupied();
        java.lang.String str19 = room4.getRoomID();
        int int20 = room4.getCapacity();
        boolean boolean21 = room4.isOccupied();
        room.SensorObserver sensorObserver22 = null;
        room4.removeObserver(sensorObserver22);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str7, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str10, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str14, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test26668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26668");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        java.lang.String str5 = room4.getScannedID();
        room4.setUnderMaintenance(false);
        room4.setUnderMaintenance(true);
        boolean boolean10 = room4.isEnabled();
        boolean boolean11 = room4.isEnabled();
        java.lang.String str12 = room4.getBuildingName();
        boolean boolean13 = room4.isUnderMaintenance();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test26669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26669");
        room.Room room4 = new room.Room("Room Room  | hi! - hi! - Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 97 - Room  | Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! | Capacity: 1 | Capacity: 35 | Room Room hi! | hi! - hi! | Capacity: 0 | Room hi! | hi! - hi! | Capacity: 0 - hi! - hi! | Capacity: 100 - Room hi! -  | Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 10 - hi! - hi! - Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | Capacity: -1", (int) (byte) 100, "Room hi! | hi! - hi! | Capacity: 0 - hi!", "Room Room hi! | hi! - hi! | Capacity: 0 - hi! | Room Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! - hi! - hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: -1 - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 | Capacity: 10 - Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | hi! - hi! - hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 0");
        java.lang.String str5 = room4.getBuildingName();
        boolean boolean6 = room4.isOccupied();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0 - hi!" + "'", str5, "Room hi! | hi! - hi! | Capacity: 0 - hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test26670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26670");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        room.SensorObserver sensorObserver5 = null;
        room4.addObserver(sensorObserver5);
        room.SensorObserver sensorObserver7 = null;
        room4.addObserver(sensorObserver7);
        java.lang.String str9 = room4.getBuildingName();
        java.lang.String str10 = room4.getRoomNumber();
        boolean boolean11 = room4.isEnabled();
        room.SensorObserver sensorObserver12 = null;
        room4.removeObserver(sensorObserver12);
        int int14 = room4.getCapacity();
        java.lang.String str15 = room4.getBuildingName();
        int int16 = room4.getCapacity();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test26671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26671");
        room.Room room4 = new room.Room("Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | Room hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 1 - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! | Capacity: 97", 97, "Room  - Room hi! | hi! - hi! | Capacity: 0 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 0", "");
        boolean boolean5 = room4.isUnderMaintenance();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test26672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26672");
        room.Room room4 = new room.Room("Room hi! | hi! - hi! | Capacity: 0", (int) (byte) 10, "hi!", "");
        room4.setUnderMaintenance(true);
        java.lang.String str7 = room4.toString();
        room4.notifyObservers();
        room4.setScannedID("hi! - hi!");
        java.lang.String str11 = room4.getRoomID();
        int int12 = room4.getCapacity();
        room4.setScannedID("hi! - hi!");
        boolean boolean15 = room4.isUnderMaintenance();
        room4.setUnderMaintenance(true);
        room4.setScannedID("Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 | hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 0");
        room4.notifyObservers();
        java.lang.String str21 = room4.getFullLocation();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10" + "'", str7, "Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str11, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi! - " + "'", str21, "hi! - ");
    }

    @Test
    public void test26673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26673");
        room.Room room4 = new room.Room("Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi!", 100, "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10", "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi!");
        java.lang.String str5 = room4.getFullLocation();
        room4.setScannedID("Room Room hi! | hi! - hi! | Capacity: 0 - hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 100 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  |  - Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 1 - Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | Capacity: 35");
        room4.setUnderMaintenance(false);
        java.lang.String str10 = room4.getScannedID();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi!" + "'", str5, "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Room Room hi! | hi! - hi! | Capacity: 0 - hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 100 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  |  - Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 1 - Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | Capacity: 35" + "'", str10, "Room Room hi! | hi! - hi! | Capacity: 0 - hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 100 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  |  - Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 1 - Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | Capacity: 35");
    }

    @Test
    public void test26674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26674");
        room.Room room4 = new room.Room("Room hi! | hi! - hi! - Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | Capacity: 0", (int) (short) 1, "Room  - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 100 | hi! - hi! - hi! - hi! | Capacity: 0 | Capacity: 0", "Room Room  - Room hi! | hi! - hi! | Capacity: 0 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 0 | hi! - hi! - Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 -  - hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 0");
        room.SensorObserver sensorObserver5 = null;
        room4.addObserver(sensorObserver5);
        room.SensorObserver sensorObserver7 = null;
        room4.removeObserver(sensorObserver7);
    }

    @Test
    public void test26675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26675");
        room.Room room4 = new room.Room("Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 100", (int) (short) 100, "Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100", "Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi!");
        boolean boolean5 = room4.isEnabled();
        room4.setOccupied(true);
        room4.setOccupied(true);
        boolean boolean10 = room4.isUnderMaintenance();
        boolean boolean11 = room4.isEnabled();
        room.SensorObserver sensorObserver12 = null;
        room4.removeObserver(sensorObserver12);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test26676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26676");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        java.lang.String str5 = room4.toString();
        room4.setUnderMaintenance(false);
        room.SensorObserver sensorObserver8 = null;
        room4.addObserver(sensorObserver8);
        java.lang.String str10 = room4.getFullLocation();
        room.SensorObserver sensorObserver11 = null;
        room4.removeObserver(sensorObserver11);
        room.SensorObserver sensorObserver13 = null;
        room4.removeObserver(sensorObserver13);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str5, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi! - hi!" + "'", str10, "hi! - hi!");
    }

    @Test
    public void test26677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26677");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        java.lang.String str5 = room4.getScannedID();
        room4.setScannedID("hi!");
        room4.setUnderMaintenance(true);
        room4.setOccupied(true);
        room4.setScannedID("Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100");
        boolean boolean14 = room4.isOccupied();
        room4.setScannedID("hi! - Room hi! | hi! - hi! | Capacity: 0");
        boolean boolean17 = room4.isOccupied();
        java.lang.Class<?> wildcardClass18 = room4.getClass();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test26678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26678");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        java.lang.String str5 = room4.getScannedID();
        room4.setScannedID("hi!");
        boolean boolean8 = room4.isEnabled();
        room4.setEnabled(false);
        room4.setScannedID("Room hi! | hi! - hi! | Capacity: 0 - hi! - ");
        room4.setOccupied(false);
        room4.notifyObservers();
        java.lang.String str16 = room4.getFullLocation();
        room4.setUnderMaintenance(false);
        room4.setEnabled(true);
        java.lang.String str21 = room4.getRoomID();
        room.SensorObserver sensorObserver22 = null;
        room4.removeObserver(sensorObserver22);
        room4.setEnabled(false);
        java.lang.String str26 = room4.getRoomID();
        room.SensorObserver sensorObserver27 = null;
        room4.addObserver(sensorObserver27);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi! - hi!" + "'", str16, "hi! - hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
    }

    @Test
    public void test26679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26679");
        room.Room room4 = new room.Room("Room hi! | hi! - hi! | Capacity: 0", (int) (byte) 10, "hi!", "");
        room4.setUnderMaintenance(true);
        java.lang.String str7 = room4.toString();
        room4.notifyObservers();
        room4.setScannedID("hi! - hi!");
        java.lang.String str11 = room4.getRoomID();
        java.lang.String str12 = room4.getFullLocation();
        boolean boolean13 = room4.isUnderMaintenance();
        room4.setUnderMaintenance(false);
        boolean boolean16 = room4.isUnderMaintenance();
        java.lang.String str17 = room4.toString();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10" + "'", str7, "Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str11, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi! - " + "'", str12, "hi! - ");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10" + "'", str17, "Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10");
    }

    @Test
    public void test26680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26680");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        room.SensorObserver sensorObserver5 = null;
        room4.addObserver(sensorObserver5);
        java.lang.String str7 = room4.getScannedID();
        int int8 = room4.getCapacity();
        java.lang.String str9 = room4.getBuildingName();
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test26681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26681");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        room.SensorObserver sensorObserver5 = null;
        room4.addObserver(sensorObserver5);
        java.lang.String str7 = room4.getScannedID();
        room.SensorObserver sensorObserver8 = null;
        room4.removeObserver(sensorObserver8);
        java.lang.String str10 = room4.getRoomNumber();
        java.lang.String str11 = room4.toString();
        room4.setScannedID("Room hi! | hi! - hi! | Capacity: 0");
        java.lang.String str14 = room4.getBuildingName();
        room4.setEnabled(true);
        int int17 = room4.getCapacity();
        room4.setOccupied(false);
        boolean boolean20 = room4.isOccupied();
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str11, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test26682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26682");
        room.Room room4 = new room.Room("hi! - hi!", 100, "", "");
        room.SensorObserver sensorObserver5 = null;
        room4.removeObserver(sensorObserver5);
        room4.setOccupied(true);
        boolean boolean9 = room4.isUnderMaintenance();
        java.lang.String str10 = room4.toString();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Room hi! - hi! |  -  | Capacity: 100" + "'", str10, "Room hi! - hi! |  -  | Capacity: 100");
    }

    @Test
    public void test26683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26683");
        room.Room room4 = new room.Room("Room hi! - hi! - hi! | Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | hi! - hi! - hi! | Capacity: 0 - Room hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 1 - Room hi! | hi! - hi! - Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | Capacity: 0 | Capacity: 0", 32, "Room Room hi! | hi! - hi! - Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | Capacity: 0 | hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - Room  - Room hi! | hi! - hi! | Capacity: 0 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 0 | Capacity: 1", "Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 100 | hi! - hi! - hi! - hi! | Capacity: 0 -  - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi!");
    }

    @Test
    public void test26684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26684");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        room.SensorObserver sensorObserver5 = null;
        room4.addObserver(sensorObserver5);
        java.lang.String str7 = room4.toString();
        room.SensorObserver sensorObserver8 = null;
        room4.removeObserver(sensorObserver8);
        int int10 = room4.getCapacity();
        java.lang.String str11 = room4.getBuildingName();
        room4.setEnabled(true);
        boolean boolean14 = room4.isUnderMaintenance();
        room.SensorObserver sensorObserver15 = null;
        room4.removeObserver(sensorObserver15);
        java.lang.String str17 = room4.getBuildingName();
        room.SensorObserver sensorObserver18 = null;
        room4.removeObserver(sensorObserver18);
        room4.setOccupied(false);
        room4.notifyObservers();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str7, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test26685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26685");
        room.Room room4 = new room.Room("", (int) (byte) 1, "Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10", "hi!");
        java.lang.String str5 = room4.getFullLocation();
        java.lang.String str6 = room4.getRoomNumber();
        room4.setOccupied(false);
        java.lang.String str9 = room4.getBuildingName();
        room4.setUnderMaintenance(true);
        room.SensorObserver sensorObserver12 = null;
        room4.removeObserver(sensorObserver12);
        room4.setOccupied(false);
        java.lang.String str16 = room4.toString();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi!" + "'", str5, "Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10" + "'", str9, "Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Room  | Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! | Capacity: 1" + "'", str16, "Room  | Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! | Capacity: 1");
    }

    @Test
    public void test26686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26686");
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
        room4.setUnderMaintenance(false);
        java.lang.String str16 = room4.toString();
        room4.setUnderMaintenance(true);
        room4.setEnabled(false);
        java.lang.String str21 = room4.getScannedID();
        room.SensorObserver sensorObserver22 = null;
        room4.addObserver(sensorObserver22);
        // The following exception was thrown during execution in test generation
        try {
            room4.setOccupied(true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str11, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str16, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test26687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26687");
        room.Room room4 = new room.Room("Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi!", 10, "Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10", "hi!");
        java.lang.String str5 = room4.getScannedID();
        room4.setEnabled(false);
        room4.setEnabled(true);
        room4.setOccupied(false);
        room4.setScannedID("Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 | hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 0 - hi! - hi! - Room hi! | hi! - hi! | Capacity: 0 -  - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi!");
        room.SensorObserver sensorObserver14 = null;
        room4.removeObserver(sensorObserver14);
        java.lang.String str16 = room4.getFullLocation();
        java.lang.String str17 = room4.getFullLocation();
        boolean boolean18 = room4.isOccupied();
        java.lang.String str19 = room4.getRoomNumber();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi!" + "'", str16, "Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi!" + "'", str17, "Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi!");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test26688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26688");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        java.lang.String str5 = room4.getScannedID();
        room.SensorObserver sensorObserver6 = null;
        room4.removeObserver(sensorObserver6);
        boolean boolean8 = room4.isUnderMaintenance();
        java.lang.String str9 = room4.getRoomID();
        room4.setUnderMaintenance(true);
        boolean boolean12 = room4.isUnderMaintenance();
        boolean boolean13 = room4.isEnabled();
        boolean boolean14 = room4.isEnabled();
        room4.setOccupied(false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test26689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26689");
        room.Room room4 = new room.Room("Room hi! -  | Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 | hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 0 - Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10", (int) (short) 1, "Room Room Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! |  - Room hi! | hi! - hi! | Capacity: 0 - Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: -1 | Room  - Room hi! | hi! - hi! | Capacity: 0 |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 0 - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! | Capacity: 97", "Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | hi! - hi! - hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 0 - Room Room  - Room hi! | hi! - hi! | Capacity: 0 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 0 | hi! - hi! - Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 -  - hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 0 - Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100");
        boolean boolean5 = room4.isOccupied();
        boolean boolean6 = room4.isUnderMaintenance();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test26690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26690");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        java.lang.String str5 = room4.getScannedID();
        room.SensorObserver sensorObserver6 = null;
        room4.removeObserver(sensorObserver6);
        boolean boolean8 = room4.isUnderMaintenance();
        room.SensorObserver sensorObserver9 = null;
        room4.removeObserver(sensorObserver9);
        room4.setScannedID("hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 100 - Room hi! | hi! - hi! | Capacity: 0 - hi! - ");
        room4.setUnderMaintenance(true);
        room4.setUnderMaintenance(true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test26691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26691");
        room.Room room4 = new room.Room("Room Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! - hi! - hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: -1 - Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 | Room Room hi! | hi! - hi! | Capacity: 0 | Room hi! | hi! - hi! | Capacity: 0 - hi! - hi! | Capacity: 100 - hi! - hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 0 - Room  - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 100 | hi! - hi! - hi! - hi! | Capacity: 0 | Capacity: 0", (int) (short) 100, "Room hi! - hi! - Room hi! | hi! - hi! | Capacity: 0 | Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 97 - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 100 | Capacity: 0", "Room hi! - hi! | Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 10 - Room Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 | Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 - hi! -  | Capacity: 10 | Room hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 1 - Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | hi! -  - Room  - Room hi! | hi! - hi! | Capacity: 0 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 0 | Capacity: 10 - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 -  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 1");
    }

    @Test
    public void test26692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26692");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        java.lang.String str5 = room4.getScannedID();
        room4.setScannedID("hi!");
        room4.setUnderMaintenance(true);
        room4.setOccupied(true);
        room4.setScannedID("Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100");
        boolean boolean14 = room4.isUnderMaintenance();
        boolean boolean15 = room4.isUnderMaintenance();
        java.lang.String str16 = room4.getBuildingName();
        java.lang.String str17 = room4.getRoomNumber();
        int int18 = room4.getCapacity();
        java.lang.String str19 = room4.getRoomID();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test26693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26693");
        room.Room room4 = new room.Room("Room Room hi! | Room hi! | hi! - hi! | Capacity: 0 - hi! - Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 1 | Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 97 - Room  - Room hi! | hi! - hi! | Capacity: 0 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 0 | Capacity: 10", 1, "Room Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 | hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 0 - hi! - hi! - Room hi! | hi! - hi! | Capacity: 0 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 -  - Room hi! | hi! - hi! | Capacity: 0 - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! -  | Capacity: 10", "Room Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 97 | Room hi! | hi! - hi! | Capacity: 0 - hi! -  - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 | Capacity: 100");
    }

    @Test
    public void test26694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26694");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        java.lang.String str5 = room4.getScannedID();
        room4.setScannedID("hi!");
        boolean boolean8 = room4.isEnabled();
        int int9 = room4.getCapacity();
        boolean boolean10 = room4.isOccupied();
        java.lang.String str11 = room4.getRoomNumber();
        room4.setEnabled(false);
        java.lang.String str14 = room4.getRoomNumber();
        room4.setOccupied(false);
        java.lang.String str17 = room4.getRoomID();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test26695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26695");
        room.Room room4 = new room.Room("Room hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 1 - Room hi! | hi! - hi! - Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | Capacity: 0", (int) (short) 100, "Room  - Room hi! | hi! - hi! | Capacity: 0 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 0 - hi!", "hi! - hi!");
        room4.setScannedID("Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | hi! - hi! - hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 0");
        java.lang.String str7 = room4.getScannedID();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | hi! - hi! - hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 0" + "'", str7, "Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | hi! - hi! - hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 0");
    }

    @Test
    public void test26696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26696");
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
        boolean boolean15 = room4.isEnabled();
        java.lang.String str16 = room4.getScannedID();
        java.lang.String str17 = room4.getScannedID();
        java.lang.Class<?> wildcardClass18 = room4.getClass();
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi! - hi!" + "'", str8, "hi! - hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test26697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26697");
        room.Room room4 = new room.Room("Room Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! - hi! - hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: -1", 0, "Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 1", "Room hi! | hi! - hi! | Capacity: 0 - hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! - hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 97");
        java.lang.String str5 = room4.toString();
        room4.setEnabled(false);
        room4.setUnderMaintenance(false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Room Room Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! - hi! - hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: -1 | Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 1 - Room hi! | hi! - hi! | Capacity: 0 - hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! - hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 97 | Capacity: 0" + "'", str5, "Room Room Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! - hi! - hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: -1 | Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 1 - Room hi! | hi! - hi! | Capacity: 0 - hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! - hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 97 | Capacity: 0");
    }

    @Test
    public void test26698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26698");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        room.SensorObserver sensorObserver5 = null;
        room4.addObserver(sensorObserver5);
        java.lang.String str7 = room4.toString();
        java.lang.String str8 = room4.toString();
        java.lang.String str9 = room4.getBuildingName();
        int int10 = room4.getCapacity();
        boolean boolean11 = room4.isOccupied();
        java.lang.Class<?> wildcardClass12 = room4.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str7, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str8, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test26699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26699");
        room.Room room4 = new room.Room("Room hi! | hi! - hi! | Capacity: 0", (int) (byte) 100, "Room hi! | hi! - hi! | Capacity: 0 - hi!", "hi!");
        room4.setScannedID("Room hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 1");
        boolean boolean7 = room4.isEnabled();
        room4.setUnderMaintenance(false);
        boolean boolean10 = room4.isUnderMaintenance();
        room.SensorObserver sensorObserver11 = null;
        room4.addObserver(sensorObserver11);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test26700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26700");
        room.Room room4 = new room.Room("Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100", (int) 'a', "hi! - hi!", "Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10");
        java.lang.String str5 = room4.toString();
        room4.setScannedID("Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi!");
        room4.setUnderMaintenance(true);
        room.SensorObserver sensorObserver10 = null;
        room4.addObserver(sensorObserver10);
        java.lang.String str12 = room4.getRoomNumber();
        boolean boolean13 = room4.isUnderMaintenance();
        java.lang.String str14 = room4.getFullLocation();
        boolean boolean15 = room4.isUnderMaintenance();
        // The following exception was thrown during execution in test generation
        try {
            room4.notifyObservers();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 97" + "'", str5, "Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 97");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10" + "'", str12, "Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10" + "'", str14, "hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test26701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26701");
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
        room4.setOccupied(false);
        java.lang.String str19 = room4.getScannedID();
        boolean boolean20 = room4.isUnderMaintenance();
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str11, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test26702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26702");
        room.Room room4 = new room.Room("hi!", (int) (byte) 1, "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10", "hi!");
        java.lang.String str5 = room4.getRoomNumber();
        room4.notifyObservers();
        java.lang.String str7 = room4.getScannedID();
        java.lang.String str8 = room4.toString();
        room4.setScannedID("Room Room Room hi! | hi! - hi! | Capacity: 0 | Room hi! | hi! - hi! | Capacity: 0 - hi! - hi! | Capacity: 100 |  - hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 10");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Room hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 1" + "'", str8, "Room hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 1");
    }

    @Test
    public void test26703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26703");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        java.lang.String str5 = room4.getBuildingName();
        java.lang.String str6 = room4.getRoomID();
        boolean boolean7 = room4.isOccupied();
        room4.setEnabled(false);
        java.lang.String str10 = room4.getRoomID();
        java.lang.String str11 = room4.getRoomID();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test26704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26704");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        boolean boolean5 = room4.isOccupied();
        boolean boolean6 = room4.isEnabled();
        java.lang.String str7 = room4.getRoomID();
        room4.setScannedID(" - Room hi! | hi! - hi! | Capacity: 0");
        room4.setOccupied(false);
        int int12 = room4.getCapacity();
        room4.notifyObservers();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test26705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26705");
        room.Room room4 = new room.Room(" - Room hi! | hi! - hi! | Capacity: 0", (int) (byte) 100, "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi!", "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10");
        room.SensorObserver sensorObserver5 = null;
        room4.removeObserver(sensorObserver5);
        room4.setEnabled(true);
        room.SensorObserver sensorObserver9 = null;
        room4.removeObserver(sensorObserver9);
        room4.setUnderMaintenance(true);
        java.lang.String str13 = room4.getBuildingName();
        java.lang.String str14 = room4.getRoomID();
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi!" + "'", str13, "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + " - Room hi! | hi! - hi! | Capacity: 0" + "'", str14, " - Room hi! | hi! - hi! | Capacity: 0");
    }

    @Test
    public void test26706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26706");
        room.Room room4 = new room.Room("hi!", (int) (byte) 100, "", "Room hi! | hi! - hi! | Capacity: 0");
        room4.setScannedID("");
        boolean boolean7 = room4.isUnderMaintenance();
        room4.setUnderMaintenance(false);
        room4.notifyObservers();
        room4.notifyObservers();
        room.SensorObserver sensorObserver12 = null;
        room4.removeObserver(sensorObserver12);
        java.lang.String str14 = room4.toString();
        java.lang.String str15 = room4.getBuildingName();
        boolean boolean16 = room4.isOccupied();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100" + "'", str14, "Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test26707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26707");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        java.lang.String str5 = room4.getScannedID();
        room4.setScannedID("hi!");
        room4.setUnderMaintenance(true);
        boolean boolean10 = room4.isOccupied();
        java.lang.String str11 = room4.toString();
        boolean boolean12 = room4.isEnabled();
        room4.setEnabled(true);
        java.lang.String str15 = room4.getRoomID();
        java.lang.String str16 = room4.getRoomID();
        java.lang.String str17 = room4.getRoomID();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str11, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test26708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26708");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        java.lang.String str5 = room4.getScannedID();
        room4.setScannedID("hi!");
        room4.setUnderMaintenance(true);
        room.SensorObserver sensorObserver10 = null;
        room4.removeObserver(sensorObserver10);
        boolean boolean12 = room4.isOccupied();
        int int13 = room4.getCapacity();
        room4.setEnabled(false);
        room.SensorObserver sensorObserver16 = null;
        room4.removeObserver(sensorObserver16);
        room4.setUnderMaintenance(true);
        java.lang.String str20 = room4.getBuildingName();
        room4.setScannedID("Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 | Room Room hi! | hi! - hi! | Capacity: 0 | Room hi! | hi! - hi! | Capacity: 0 - hi! - hi! | Capacity: 100 - hi! - hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 0");
        boolean boolean23 = room4.isUnderMaintenance();
        boolean boolean24 = room4.isUnderMaintenance();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test26709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26709");
        room.Room room4 = new room.Room("hi!", (int) (byte) 100, "", "Room hi! | hi! - hi! | Capacity: 0");
        java.lang.String str5 = room4.getRoomNumber();
        room4.notifyObservers();
        room.SensorObserver sensorObserver7 = null;
        room4.addObserver(sensorObserver7);
        room.SensorObserver sensorObserver9 = null;
        room4.removeObserver(sensorObserver9);
        boolean boolean11 = room4.isEnabled();
        java.lang.String str12 = room4.getFullLocation();
        room.SensorObserver sensorObserver13 = null;
        room4.addObserver(sensorObserver13);
        java.lang.String str15 = room4.toString();
        // The following exception was thrown during execution in test generation
        try {
            room4.setOccupied(false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str5, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + " - Room hi! | hi! - hi! | Capacity: 0" + "'", str12, " - Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100" + "'", str15, "Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100");
    }

    @Test
    public void test26710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26710");
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
        boolean boolean16 = room4.isUnderMaintenance();
        boolean boolean17 = room4.isUnderMaintenance();
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi! - hi!" + "'", str12, "hi! - hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test26711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26711");
        room.Room room4 = new room.Room("hi!", (int) (byte) 1, "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10", "hi!");
        room4.notifyObservers();
        room4.setUnderMaintenance(false);
        java.lang.String str8 = room4.getRoomID();
        boolean boolean9 = room4.isOccupied();
        boolean boolean10 = room4.isEnabled();
        room.SensorObserver sensorObserver11 = null;
        room4.removeObserver(sensorObserver11);
        java.lang.String str13 = room4.getRoomID();
        room4.setUnderMaintenance(true);
        java.lang.String str16 = room4.toString();
        java.lang.String str17 = room4.getRoomNumber();
        room.SensorObserver sensorObserver18 = null;
        room4.addObserver(sensorObserver18);
        java.lang.String str20 = room4.getRoomID();
        java.lang.String str21 = room4.getRoomNumber();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Room hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 1" + "'", str16, "Room hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 1");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
    }

    @Test
    public void test26712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26712");
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
        room4.setOccupied(true);
        room.SensorObserver sensorObserver26 = null;
        room4.addObserver(sensorObserver26);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str11, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test26713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26713");
        room.Room room4 = new room.Room("Room Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 100 - Room Room hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 1 | Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! - Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: -1", 1, "Room Room hi! - hi! - Room hi! | hi! - hi! | Capacity: 0 | hi! - hi! - Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 97 | Capacity: 10 | Room hi! - hi! - hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 -  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 - Room Room hi! | hi! - hi! | Capacity: 0 - hi! |  - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 | Capacity: 1 -  - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 | Capacity: 52", "Room Room Room Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 100 | Room Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 100 - Room Room hi! | hi! - hi! | Capacity: 0 |  - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 0 | Capacity: 32 |  - hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 -  - hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! | Capacity: 1");
    }

    @Test
    public void test26714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26714");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        java.lang.String str5 = room4.getScannedID();
        room4.setScannedID("hi!");
        room4.setUnderMaintenance(true);
        room.SensorObserver sensorObserver10 = null;
        room4.removeObserver(sensorObserver10);
        java.lang.String str12 = room4.getScannedID();
        room4.setScannedID("");
        room4.notifyObservers();
        java.lang.String str16 = room4.toString();
        java.lang.String str17 = room4.getFullLocation();
        java.lang.String str18 = room4.getRoomNumber();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str16, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi! - hi!" + "'", str17, "hi! - hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test26715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26715");
        room.Room room4 = new room.Room("hi!", (int) (byte) 100, "", "Room hi! | hi! - hi! | Capacity: 0");
        java.lang.String str5 = room4.getScannedID();
        java.lang.String str6 = room4.getBuildingName();
        room4.setScannedID("Room hi! | hi! - hi! | Capacity: 0");
        java.lang.String str9 = room4.getRoomID();
        boolean boolean10 = room4.isUnderMaintenance();
        java.lang.String str11 = room4.getRoomID();
        java.lang.String str12 = room4.getRoomNumber();
        java.lang.String str13 = room4.getScannedID();
        int int14 = room4.getCapacity();
        int int15 = room4.getCapacity();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str12, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str13, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
    }

    @Test
    public void test26716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26716");
        room.Room room4 = new room.Room("Room Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 1 | hi! - hi! - Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 97 - Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | Capacity: 10", (int) ' ', "Room Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 1 | Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 97 - Room Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! | Room Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! - hi! - hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: -1 - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 100 | Capacity: 0", "Room hi! | hi! - Room hi! | hi! - hi! | Capacity: 0 - Room hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 1 - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! | Capacity: 1");
        java.lang.String str5 = room4.getRoomID();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Room Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 1 | hi! - hi! - Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 97 - Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | Capacity: 10" + "'", str5, "Room Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 1 | hi! - hi! - Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 97 - Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | Capacity: 10");
    }

    @Test
    public void test26717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26717");
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
        java.lang.String str19 = room4.getBuildingName();
        room4.setEnabled(false);
        java.lang.String str22 = room4.getBuildingName();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi! - hi!" + "'", str18, "hi! - hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
    }

    @Test
    public void test26718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26718");
        room.Room room4 = new room.Room("hi!", (int) (byte) 1, "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10", "hi!");
        room4.notifyObservers();
        java.lang.String str6 = room4.getFullLocation();
        java.lang.String str7 = room4.getScannedID();
        boolean boolean8 = room4.isUnderMaintenance();
        java.lang.String str9 = room4.getRoomID();
        room4.setEnabled(true);
        java.lang.String str12 = room4.toString();
        room.SensorObserver sensorObserver13 = null;
        room4.removeObserver(sensorObserver13);
        room4.setOccupied(false);
        boolean boolean17 = room4.isOccupied();
        java.lang.String str18 = room4.getRoomID();
        java.lang.Class<?> wildcardClass19 = room4.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi!" + "'", str6, "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi!");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Room hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 1" + "'", str12, "Room hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 1");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test26719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26719");
        room.Room room4 = new room.Room("Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100", 97, "Room hi! | hi! - hi! | Capacity: 0 - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! - hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 97", "Room hi! | hi! - hi! | Capacity: 0 - hi!");
        java.lang.String str5 = room4.getRoomNumber();
        boolean boolean6 = room4.isOccupied();
        room4.setEnabled(false);
        room4.setEnabled(false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0 - hi!" + "'", str5, "Room hi! | hi! - hi! | Capacity: 0 - hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test26720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26720");
        room.Room room4 = new room.Room("hi!", (int) (byte) 100, "", "Room hi! | hi! - hi! | Capacity: 0");
        room4.setScannedID("");
        boolean boolean7 = room4.isOccupied();
        room4.setOccupied(true);
        boolean boolean10 = room4.isEnabled();
        boolean boolean11 = room4.isEnabled();
        java.lang.String str12 = room4.getScannedID();
        boolean boolean13 = room4.isOccupied();
        room.SensorObserver sensorObserver14 = null;
        room4.removeObserver(sensorObserver14);
        int int16 = room4.getCapacity();
        java.lang.String str17 = room4.toString();
        java.lang.String str18 = room4.toString();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100" + "'", str17, "Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100" + "'", str18, "Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100");
    }

    @Test
    public void test26721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26721");
        room.Room room4 = new room.Room("Room hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 1 - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room hi! | hi! - hi! | Capacity: 0", (int) (byte) 100, "Room Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Room Room hi! - hi! - hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 1 | Capacity: 0 | Room hi! -  | Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 10 -  | Capacity: 52 -  | Capacity: -1", "Room Room Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! |  - hi! -  | Capacity: 100 |  - hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - Room Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Room  - Room hi! | hi! - hi! | Capacity: 0 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 0 - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 1 | Capacity: 0");
    }

    @Test
    public void test26722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26722");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        java.lang.String str5 = room4.getScannedID();
        room4.setScannedID("hi!");
        room4.setScannedID("hi! - hi!");
        room4.setOccupied(true);
        room.SensorObserver sensorObserver12 = null;
        room4.removeObserver(sensorObserver12);
        boolean boolean14 = room4.isOccupied();
        room4.setScannedID("Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | hi! - hi! | Capacity: 0 - hi! - ");
        boolean boolean17 = room4.isOccupied();
        boolean boolean18 = room4.isOccupied();
        java.lang.String str19 = room4.getRoomID();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test26723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26723");
        room.Room room4 = new room.Room("Room hi! | hi! - hi! | Capacity: 0 - hi! - hi! - Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | hi! -  - Room  - Room hi! | hi! - hi! | Capacity: 0 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 0 | Capacity: 10", 100, "hi! -  - Room  - Room hi! | hi! - hi! | Capacity: 0 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 0", "hi! -  - Room  - Room hi! | hi! - hi! | Capacity: 0 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 0");
        room4.setUnderMaintenance(false);
        boolean boolean7 = room4.isOccupied();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test26724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26724");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        room.SensorObserver sensorObserver5 = null;
        room4.addObserver(sensorObserver5);
        java.lang.String str7 = room4.getScannedID();
        room.SensorObserver sensorObserver8 = null;
        room4.removeObserver(sensorObserver8);
        java.lang.String str10 = room4.getRoomNumber();
        java.lang.String str11 = room4.toString();
        java.lang.String str12 = room4.getRoomNumber();
        java.lang.String str13 = room4.toString();
        boolean boolean14 = room4.isUnderMaintenance();
        java.lang.String str15 = room4.getRoomNumber();
        room.SensorObserver sensorObserver16 = null;
        room4.removeObserver(sensorObserver16);
        room4.setScannedID("Room hi! - hi! - Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | Room hi! | hi! - hi! | Capacity: 0 - hi! -  - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! | Capacity: -1");
        boolean boolean20 = room4.isUnderMaintenance();
        room4.setEnabled(false);
        java.lang.String str23 = room4.getRoomNumber();
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str11, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str13, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
    }

    @Test
    public void test26725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26725");
        room.Room room4 = new room.Room(" - Room hi! | hi! - hi! | Capacity: 0", (int) 'a', "Room Room Room Room hi! | hi! - hi! | Capacity: 0 | Room hi! | hi! - hi! | Capacity: 0 - hi! - hi! | Capacity: 100 |  - hi! - hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: -1 | Room Room hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 1 | Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! - Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: -1 - Room Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! | Room Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! - hi! - hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: -1 - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 100 | Capacity: 0", "Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi!");
        int int5 = room4.getCapacity();
        room4.setEnabled(true);
        boolean boolean8 = room4.isEnabled();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test26726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26726");
        room.Room room4 = new room.Room("Room hi! - hi! - Room hi! | hi! - hi! | Capacity: 0 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 100 | Capacity: 10", 100, "Room hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 1 - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi!", "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room hi! | hi! - hi! | Capacity: 0");
        room4.setScannedID(" - Room hi! | hi! - hi! | Capacity: 0");
        java.lang.String str7 = room4.getBuildingName();
        room4.setOccupied(true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Room hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 1 - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi!" + "'", str7, "Room hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 1 - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi!");
    }

    @Test
    public void test26727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26727");
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
        room.SensorObserver sensorObserver19 = null;
        room4.removeObserver(sensorObserver19);
        java.lang.String str21 = room4.toString();
        int int22 = room4.getCapacity();
        boolean boolean23 = room4.isUnderMaintenance();
        room4.setOccupied(false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str11, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str21, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test26728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26728");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        room.SensorObserver sensorObserver5 = null;
        room4.addObserver(sensorObserver5);
        java.lang.String str7 = room4.getScannedID();
        room.SensorObserver sensorObserver8 = null;
        room4.removeObserver(sensorObserver8);
        java.lang.String str10 = room4.getRoomNumber();
        java.lang.String str11 = room4.toString();
        room4.setScannedID("Room hi! | hi! - hi! | Capacity: 0 - hi!");
        boolean boolean14 = room4.isEnabled();
        int int15 = room4.getCapacity();
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str11, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test26729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26729");
        room.Room room4 = new room.Room("hi!", (int) (byte) 100, "", "Room hi! | hi! - hi! | Capacity: 0");
        java.lang.String str5 = room4.toString();
        room4.setScannedID("Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 100");
        java.lang.String str8 = room4.getRoomNumber();
        java.lang.String str9 = room4.getBuildingName();
        java.lang.String str10 = room4.getRoomID();
        java.lang.String str11 = room4.getRoomNumber();
        java.lang.String str12 = room4.getFullLocation();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100" + "'", str5, "Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str8, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str11, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + " - Room hi! | hi! - hi! | Capacity: 0" + "'", str12, " - Room hi! | hi! - hi! | Capacity: 0");
    }

    @Test
    public void test26730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26730");
        room.Room room4 = new room.Room("Room hi! -  | Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 | hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 0 - Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10", 0, "Room hi! - hi! - hi! | hi! - hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 1", "Room Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! - hi! - hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: -1 - Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 | hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 0");
        java.lang.String str5 = room4.getFullLocation();
        int int6 = room4.getCapacity();
        boolean boolean7 = room4.isEnabled();
        java.lang.String str8 = room4.getFullLocation();
        java.lang.String str9 = room4.toString();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Room hi! - hi! - hi! | hi! - hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 1 - Room Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! - hi! - hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: -1 - Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 | hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 0" + "'", str5, "Room hi! - hi! - hi! | hi! - hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 1 - Room Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! - hi! - hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: -1 - Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 | hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 0");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Room hi! - hi! - hi! | hi! - hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 1 - Room Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! - hi! - hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: -1 - Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 | hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 0" + "'", str8, "Room hi! - hi! - hi! | hi! - hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 1 - Room Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! - hi! - hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: -1 - Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 | hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Room Room hi! -  | Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 | hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 0 - Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 | Room hi! - hi! - hi! | hi! - hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 1 - Room Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! - hi! - hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: -1 - Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 | hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 0 | Capacity: 0" + "'", str9, "Room Room hi! -  | Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 | hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 0 - Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 | Room hi! - hi! - hi! | hi! - hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 1 - Room Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! - hi! - hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: -1 - Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 | hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 0 | Capacity: 0");
    }

    @Test
    public void test26731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26731");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        room.SensorObserver sensorObserver5 = null;
        room4.addObserver(sensorObserver5);
        java.lang.String str7 = room4.getScannedID();
        java.lang.String str8 = room4.getFullLocation();
        boolean boolean9 = room4.isEnabled();
        java.lang.String str10 = room4.getBuildingName();
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi! - hi!" + "'", str8, "hi! - hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test26732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26732");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        java.lang.String str5 = room4.getScannedID();
        room4.setScannedID("hi!");
        room4.setUnderMaintenance(true);
        java.lang.String str10 = room4.getScannedID();
        java.lang.String str11 = room4.getFullLocation();
        boolean boolean12 = room4.isOccupied();
        boolean boolean13 = room4.isOccupied();
        java.lang.String str14 = room4.getFullLocation();
        java.lang.String str15 = room4.getBuildingName();
        java.lang.String str16 = room4.getFullLocation();
        java.lang.String str17 = room4.getFullLocation();
        int int18 = room4.getCapacity();
        java.lang.String str19 = room4.getRoomNumber();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi! - hi!" + "'", str11, "hi! - hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi! - hi!" + "'", str14, "hi! - hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi! - hi!" + "'", str16, "hi! - hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi! - hi!" + "'", str17, "hi! - hi!");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test26733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26733");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        java.lang.String str5 = room4.toString();
        java.lang.String str6 = room4.getRoomID();
        room4.setUnderMaintenance(true);
        boolean boolean9 = room4.isUnderMaintenance();
        int int10 = room4.getCapacity();
        java.lang.String str11 = room4.getRoomID();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str5, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test26734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26734");
        room.Room room4 = new room.Room("Room hi! - hi! - Room hi! | hi! - hi! | Capacity: 0 | hi! - hi! - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 1 - Room hi! | hi! - hi! | Capacity: 0 - hi! - Room hi! | hi! - hi! | Capacity: 0 - hi!", (int) (byte) 100, "", "hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 100 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  - Room Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! | Room  - Room hi! | hi! - hi! | Capacity: 0 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 0 - Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 97 | Capacity: 0");
        room.SensorObserver sensorObserver5 = null;
        room4.addObserver(sensorObserver5);
    }

    @Test
    public void test26735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26735");
        room.Room room4 = new room.Room("Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100", (int) 'a', "hi! - hi!", "Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10");
        java.lang.String str5 = room4.toString();
        room4.setScannedID("Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi!");
        room4.setUnderMaintenance(false);
        java.lang.String str10 = room4.getRoomNumber();
        int int11 = room4.getCapacity();
        java.lang.String str12 = room4.getScannedID();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 97" + "'", str5, "Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 97");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10" + "'", str10, "Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi!" + "'", str12, "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi!");
    }

    @Test
    public void test26736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26736");
        room.Room room4 = new room.Room("Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 |  - hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 32", (int) (short) 10, "Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10", "Room Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | hi! - hi! - hi! | Capacity: 0");
    }

    @Test
    public void test26737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26737");
        room.Room room4 = new room.Room("hi!", (int) (byte) 1, "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10", "hi!");
        room4.notifyObservers();
        java.lang.String str6 = room4.getFullLocation();
        java.lang.String str7 = room4.getScannedID();
        java.lang.String str8 = room4.getFullLocation();
        java.lang.String str9 = room4.getFullLocation();
        room4.setOccupied(false);
        room.SensorObserver sensorObserver12 = null;
        room4.removeObserver(sensorObserver12);
        java.lang.String str14 = room4.getRoomNumber();
        room4.setUnderMaintenance(false);
        boolean boolean17 = room4.isEnabled();
        int int18 = room4.getCapacity();
        room4.setEnabled(true);
        room4.setScannedID("Room  | Room Room hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 1 | Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! - Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: -1 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 100");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi!" + "'", str6, "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi!");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi!" + "'", str8, "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi!" + "'", str9, "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test26738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26738");
        room.Room room4 = new room.Room("Room hi! | hi! - hi! | Capacity: 0", (int) (byte) 100, "Room hi! | hi! - hi! | Capacity: 0 - hi!", "hi!");
        room4.setScannedID("Room hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 1");
        java.lang.String str7 = room4.getFullLocation();
        java.lang.String str8 = room4.getScannedID();
        room.SensorObserver sensorObserver9 = null;
        room4.removeObserver(sensorObserver9);
        room4.setScannedID("Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10");
        room.SensorObserver sensorObserver13 = null;
        room4.addObserver(sensorObserver13);
        boolean boolean15 = room4.isEnabled();
        java.lang.String str16 = room4.toString();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0 - hi! - hi!" + "'", str7, "Room hi! | hi! - hi! | Capacity: 0 - hi! - hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Room hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 1" + "'", str8, "Room hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 1");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Room Room hi! | hi! - hi! | Capacity: 0 | Room hi! | hi! - hi! | Capacity: 0 - hi! - hi! | Capacity: 100" + "'", str16, "Room Room hi! | hi! - hi! | Capacity: 0 | Room hi! | hi! - hi! | Capacity: 0 - hi! - hi! | Capacity: 100");
    }

    @Test
    public void test26739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26739");
        room.Room room4 = new room.Room("Room hi! - hi! | Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 10", (int) (short) 100, "Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100", "");
        room4.setOccupied(false);
        room.SensorObserver sensorObserver7 = null;
        room4.removeObserver(sensorObserver7);
        room4.notifyObservers();
        room4.notifyObservers();
        java.lang.String str11 = room4.getFullLocation();
        java.lang.String str12 = room4.getFullLocation();
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 - " + "'", str11, "Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 - ");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 - " + "'", str12, "Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 - ");
    }

    @Test
    public void test26740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26740");
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
        room4.setOccupied(true);
        room.SensorObserver sensorObserver21 = null;
        room4.addObserver(sensorObserver21);
        java.lang.String str23 = room4.getRoomNumber();
        java.lang.String str24 = room4.getRoomNumber();
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
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
    }

    @Test
    public void test26741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26741");
        room.Room room4 = new room.Room("Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10", (-1), "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 100", "Room hi! | hi! - hi! | Capacity: 0 - hi! - ");
        room4.setUnderMaintenance(true);
        room4.setOccupied(true);
        room4.setEnabled(true);
        java.lang.String str11 = room4.getFullLocation();
        java.lang.String str12 = room4.getFullLocation();
        room4.setOccupied(true);
        java.lang.String str15 = room4.getScannedID();
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 100 - Room hi! | hi! - hi! | Capacity: 0 - hi! - " + "'", str11, "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 100 - Room hi! | hi! - hi! | Capacity: 0 - hi! - ");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 100 - Room hi! | hi! - hi! | Capacity: 0 - hi! - " + "'", str12, "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 100 - Room hi! | hi! - hi! | Capacity: 0 - hi! - ");
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test26742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26742");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        boolean boolean5 = room4.isOccupied();
        room4.setEnabled(false);
        boolean boolean8 = room4.isUnderMaintenance();
        java.lang.String str9 = room4.getFullLocation();
        boolean boolean10 = room4.isOccupied();
        java.lang.String str11 = room4.toString();
        java.lang.String str12 = room4.getFullLocation();
        java.lang.String str13 = room4.getFullLocation();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi! - hi!" + "'", str9, "hi! - hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str11, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi! - hi!" + "'", str12, "hi! - hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi! - hi!" + "'", str13, "hi! - hi!");
    }

    @Test
    public void test26743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26743");
        room.Room room4 = new room.Room("Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10", 1, "Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 1", "Room hi! | hi! - hi! | Capacity: 0 - hi!");
        boolean boolean5 = room4.isOccupied();
        java.lang.String str6 = room4.toString();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 | Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 1 - Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 1" + "'", str6, "Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 | Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 1 - Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 1");
    }

    @Test
    public void test26744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26744");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        java.lang.String str5 = room4.getBuildingName();
        java.lang.String str6 = room4.getRoomID();
        boolean boolean7 = room4.isOccupied();
        room4.setEnabled(false);
        boolean boolean10 = room4.isUnderMaintenance();
        room4.setScannedID("Room Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! - hi! - hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: -1");
        boolean boolean13 = room4.isUnderMaintenance();
        java.lang.String str14 = room4.getRoomNumber();
        java.lang.String str15 = room4.getFullLocation();
        java.lang.String str16 = room4.getRoomNumber();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi! - hi!" + "'", str15, "hi! - hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test26745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26745");
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
        boolean boolean25 = room4.isUnderMaintenance();
        java.lang.String str26 = room4.getBuildingName();
        java.lang.String str27 = room4.getFullLocation();
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str11, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi! - hi!" + "'", str27, "hi! - hi!");
    }

    @Test
    public void test26746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26746");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        room.SensorObserver sensorObserver5 = null;
        room4.addObserver(sensorObserver5);
        java.lang.String str7 = room4.getScannedID();
        room.SensorObserver sensorObserver8 = null;
        room4.removeObserver(sensorObserver8);
        java.lang.String str10 = room4.getRoomNumber();
        java.lang.String str11 = room4.toString();
        java.lang.String str12 = room4.getRoomID();
        java.lang.String str13 = room4.toString();
        java.lang.String str14 = room4.toString();
        room4.setUnderMaintenance(true);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str11, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str13, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str14, "Room hi! | hi! - hi! | Capacity: 0");
    }

    @Test
    public void test26747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26747");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        java.lang.String str5 = room4.getScannedID();
        room4.setScannedID("hi!");
        room4.setUnderMaintenance(true);
        java.lang.String str10 = room4.getScannedID();
        java.lang.String str11 = room4.getFullLocation();
        boolean boolean12 = room4.isOccupied();
        boolean boolean13 = room4.isOccupied();
        java.lang.String str14 = room4.getFullLocation();
        java.lang.String str15 = room4.getRoomID();
        java.lang.String str16 = room4.getScannedID();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi! - hi!" + "'", str11, "hi! - hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi! - hi!" + "'", str14, "hi! - hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test26748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26748");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        room.SensorObserver sensorObserver5 = null;
        room4.addObserver(sensorObserver5);
        java.lang.String str7 = room4.toString();
        room.SensorObserver sensorObserver8 = null;
        room4.removeObserver(sensorObserver8);
        java.lang.String str10 = room4.toString();
        java.lang.String str11 = room4.getRoomID();
        room4.setEnabled(true);
        room4.notifyObservers();
        java.lang.String str15 = room4.getScannedID();
        java.lang.String str16 = room4.getRoomID();
        java.lang.String str17 = room4.getScannedID();
        room4.setEnabled(false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str7, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str10, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test26749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26749");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        room.SensorObserver sensorObserver5 = null;
        room4.addObserver(sensorObserver5);
        java.lang.String str7 = room4.getScannedID();
        java.lang.String str8 = room4.getFullLocation();
        int int9 = room4.getCapacity();
        room.SensorObserver sensorObserver10 = null;
        room4.removeObserver(sensorObserver10);
        room4.setEnabled(true);
        java.lang.String str14 = room4.getBuildingName();
        boolean boolean15 = room4.isEnabled();
        java.lang.String str16 = room4.getScannedID();
        room.SensorObserver sensorObserver17 = null;
        room4.removeObserver(sensorObserver17);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi! - hi!" + "'", str8, "hi! - hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test26750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26750");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        java.lang.String str5 = room4.getBuildingName();
        java.lang.String str6 = room4.getRoomID();
        java.lang.String str7 = room4.getScannedID();
        room4.setEnabled(false);
        room4.setOccupied(true);
        room4.setScannedID("Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 97");
        room4.notifyObservers();
        boolean boolean15 = room4.isOccupied();
        boolean boolean16 = room4.isUnderMaintenance();
        room4.setOccupied(true);
        java.lang.Class<?> wildcardClass19 = room4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test26751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26751");
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
        boolean boolean19 = room4.isOccupied();
        room.SensorObserver sensorObserver20 = null;
        room4.addObserver(sensorObserver20);
        room.SensorObserver sensorObserver22 = null;
        room4.removeObserver(sensorObserver22);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str11, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test26752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26752");
        room.Room room4 = new room.Room("hi!", (int) (short) 0, "hi! - hi!", "Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100");
        java.lang.String str5 = room4.getScannedID();
        java.lang.String str6 = room4.toString();
        room4.setUnderMaintenance(false);
        java.lang.String str9 = room4.getBuildingName();
        boolean boolean10 = room4.isUnderMaintenance();
        java.lang.String str11 = room4.getFullLocation();
        java.lang.String str12 = room4.getBuildingName();
        java.lang.String str13 = room4.getBuildingName();
        java.lang.String str14 = room4.getBuildingName();
        boolean boolean15 = room4.isUnderMaintenance();
        int int16 = room4.getCapacity();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Room hi! | hi! - hi! - Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | Capacity: 0" + "'", str6, "Room hi! | hi! - hi! - Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi! - hi!" + "'", str9, "hi! - hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi! - hi! - Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100" + "'", str11, "hi! - hi! - Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi! - hi!" + "'", str12, "hi! - hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi! - hi!" + "'", str13, "hi! - hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi! - hi!" + "'", str14, "hi! - hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test26753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26753");
        room.Room room4 = new room.Room("hi!", (int) (byte) 100, "", "Room hi! | hi! - hi! | Capacity: 0");
        java.lang.String str5 = room4.getScannedID();
        java.lang.String str6 = room4.getBuildingName();
        room4.setScannedID(" - Room hi! | hi! - hi! | Capacity: 0");
        room4.setOccupied(false);
        room4.setScannedID("Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 | hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 0 - Room hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 1");
        java.lang.String str13 = room4.getScannedID();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 | hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 0 - Room hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 1" + "'", str13, "Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 | hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 0 - Room hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 1");
    }

    @Test
    public void test26754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26754");
        room.Room room4 = new room.Room("Room hi! | hi! - hi! | Capacity: 0 - Room Room hi! - hi! - hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 1 | Capacity: 0 | Room hi! -  | Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 10 -  | Capacity: 52", 0, "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10", "Room Room  | Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! | Capacity: 1 | Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 - Room Room hi! | hi! - hi! | Capacity: 0 | hi! - hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 97 | Capacity: 100");
        room.SensorObserver sensorObserver5 = null;
        room4.removeObserver(sensorObserver5);
        boolean boolean7 = room4.isUnderMaintenance();
        java.lang.String str8 = room4.toString();
        boolean boolean9 = room4.isUnderMaintenance();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Room Room hi! | hi! - hi! | Capacity: 0 - Room Room hi! - hi! - hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 1 | Capacity: 0 | Room hi! -  | Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 10 -  | Capacity: 52 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room Room  | Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! | Capacity: 1 | Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 - Room Room hi! | hi! - hi! | Capacity: 0 | hi! - hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 97 | Capacity: 100 | Capacity: 0" + "'", str8, "Room Room hi! | hi! - hi! | Capacity: 0 - Room Room hi! - hi! - hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 1 | Capacity: 0 | Room hi! -  | Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 10 -  | Capacity: 52 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room Room  | Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! | Capacity: 1 | Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 - Room Room hi! | hi! - hi! | Capacity: 0 | hi! - hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 97 | Capacity: 100 | Capacity: 0");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test26755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26755");
        room.Room room4 = new room.Room("Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 | hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 0", 100, "hi! - hi! - Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 97", "hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10");
        room4.setEnabled(true);
        java.lang.String str7 = room4.getScannedID();
        java.lang.String str8 = room4.getRoomID();
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 | hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 0" + "'", str8, "Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 | hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 0");
    }

    @Test
    public void test26756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26756");
        room.Room room4 = new room.Room(" - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi!", (int) (short) 100, "Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10", "");
        java.lang.String str5 = room4.toString();
        java.lang.Class<?> wildcardClass6 = room4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Room  - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! | Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 -  | Capacity: 100" + "'", str5, "Room  - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! | Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 -  | Capacity: 100");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test26757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26757");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        java.lang.String str5 = room4.getScannedID();
        room4.setScannedID("hi!");
        room4.setUnderMaintenance(true);
        java.lang.String str10 = room4.getScannedID();
        java.lang.String str11 = room4.getFullLocation();
        room4.setUnderMaintenance(true);
        java.lang.String str14 = room4.getFullLocation();
        java.lang.String str15 = room4.getRoomID();
        java.lang.String str16 = room4.getBuildingName();
        boolean boolean17 = room4.isOccupied();
        java.lang.String str18 = room4.getRoomNumber();
        int int19 = room4.getCapacity();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi! - hi!" + "'", str11, "hi! - hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi! - hi!" + "'", str14, "hi! - hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test26758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26758");
        room.Room room4 = new room.Room("Room hi! | hi! - hi! | Capacity: 0", (int) (byte) 10, "hi!", "");
        room4.setUnderMaintenance(true);
        java.lang.String str7 = room4.toString();
        room4.notifyObservers();
        room4.setScannedID("hi! - hi!");
        java.lang.String str11 = room4.getRoomID();
        room4.setEnabled(true);
        java.lang.String str14 = room4.getRoomNumber();
        java.lang.String str15 = room4.toString();
        int int16 = room4.getCapacity();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10" + "'", str7, "Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str11, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10" + "'", str15, "Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
    }

    @Test
    public void test26759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26759");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        java.lang.String str5 = room4.getScannedID();
        room4.setScannedID("hi!");
        room4.setUnderMaintenance(true);
        room4.setOccupied(true);
        room4.setOccupied(false);
        room.SensorObserver sensorObserver14 = null;
        room4.removeObserver(sensorObserver14);
        boolean boolean16 = room4.isUnderMaintenance();
        room.SensorObserver sensorObserver17 = null;
        room4.addObserver(sensorObserver17);
        java.lang.String str19 = room4.getFullLocation();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi! - hi!" + "'", str19, "hi! - hi!");
    }

    @Test
    public void test26760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26760");
        room.Room room4 = new room.Room("Room hi! | hi! - hi! | Capacity: 0", (int) (byte) 10, "hi!", "");
        room4.setUnderMaintenance(true);
        java.lang.String str7 = room4.toString();
        room4.notifyObservers();
        room4.setScannedID("hi! - hi!");
        java.lang.String str11 = room4.getRoomID();
        room.SensorObserver sensorObserver12 = null;
        room4.addObserver(sensorObserver12);
        boolean boolean14 = room4.isUnderMaintenance();
        java.lang.String str15 = room4.getRoomID();
        java.lang.String str16 = room4.getRoomID();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10" + "'", str7, "Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str11, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str15, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str16, "Room hi! | hi! - hi! | Capacity: 0");
    }

    @Test
    public void test26761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26761");
        room.Room room4 = new room.Room("Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100", 0, "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi!", "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10");
        java.lang.String str5 = room4.getBuildingName();
        boolean boolean6 = room4.isEnabled();
        int int7 = room4.getCapacity();
        boolean boolean8 = room4.isUnderMaintenance();
        java.lang.String str9 = room4.getRoomID();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi!" + "'", str5, "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100" + "'", str9, "Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100");
    }

    @Test
    public void test26762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26762");
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
        room4.setUnderMaintenance(false);
        java.lang.String str16 = room4.getScannedID();
        room.SensorObserver sensorObserver17 = null;
        room4.removeObserver(sensorObserver17);
        java.lang.String str19 = room4.getBuildingName();
        java.lang.String str20 = room4.getScannedID();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str7, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test26763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26763");
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
        boolean boolean16 = room4.isOccupied();
        java.lang.String str17 = room4.getRoomNumber();
        room4.setEnabled(false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str11, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test26764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26764");
        room.Room room4 = new room.Room("Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10", 0, "hi!", "Room hi! | hi! - hi! | Capacity: 0");
        room4.setScannedID("Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100");
        room4.notifyObservers();
        int int8 = room4.getCapacity();
        room4.setEnabled(true);
        java.lang.String str11 = room4.getFullLocation();
        room4.setScannedID("Room Room hi! | hi! - hi! | Capacity: 0 | Room hi! | hi! - hi! | Capacity: 0 - hi! - hi! | Capacity: 100");
        boolean boolean14 = room4.isOccupied();
        room4.setScannedID("");
        java.lang.String str17 = room4.getRoomID();
        room4.setScannedID("hi! -  - Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 1");
        java.lang.String str20 = room4.getRoomID();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi! - Room hi! | hi! - hi! | Capacity: 0" + "'", str11, "hi! - Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10" + "'", str17, "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10" + "'", str20, "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10");
    }

    @Test
    public void test26765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26765");
        room.Room room4 = new room.Room("hi!", (int) (byte) 100, "", "Room hi! | hi! - hi! | Capacity: 0");
        room4.setScannedID("");
        boolean boolean7 = room4.isUnderMaintenance();
        room4.setUnderMaintenance(false);
        java.lang.String str10 = room4.getBuildingName();
        java.lang.String str11 = room4.getBuildingName();
        room4.setUnderMaintenance(true);
        int int14 = room4.getCapacity();
        java.lang.String str15 = room4.getFullLocation();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + " - Room hi! | hi! - hi! | Capacity: 0" + "'", str15, " - Room hi! | hi! - hi! | Capacity: 0");
    }

    @Test
    public void test26766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26766");
        room.Room room4 = new room.Room("hi!", 1, "Room hi! | hi! - hi! | Capacity: 0 - hi!", "Room hi! | hi! - hi! | Capacity: 0 - hi!");
        int int5 = room4.getCapacity();
        room4.setUnderMaintenance(false);
        room.SensorObserver sensorObserver8 = null;
        room4.addObserver(sensorObserver8);
        room.SensorObserver sensorObserver10 = null;
        room4.removeObserver(sensorObserver10);
        room4.setEnabled(true);
        java.lang.String str14 = room4.getFullLocation();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0 - hi! - Room hi! | hi! - hi! | Capacity: 0 - hi!" + "'", str14, "Room hi! | hi! - hi! | Capacity: 0 - hi! - Room hi! | hi! - hi! | Capacity: 0 - hi!");
    }

    @Test
    public void test26767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26767");
        room.Room room4 = new room.Room("Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100", 0, "hi! - hi!", "hi!");
        java.lang.String str5 = room4.getFullLocation();
        boolean boolean6 = room4.isUnderMaintenance();
        boolean boolean7 = room4.isOccupied();
        boolean boolean8 = room4.isEnabled();
        room.SensorObserver sensorObserver9 = null;
        room4.addObserver(sensorObserver9);
        // The following exception was thrown during execution in test generation
        try {
            room4.setEnabled(true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi! - hi! - hi!" + "'", str5, "hi! - hi! - hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test26768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26768");
        room.Room room4 = new room.Room("Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100", 10, "hi! - ", "Room  - Room hi! | hi! - hi! | Capacity: 0 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 0");
        room4.setOccupied(false);
        room4.setEnabled(false);
        room4.notifyObservers();
        room.SensorObserver sensorObserver10 = null;
        room4.addObserver(sensorObserver10);
        java.lang.String str12 = room4.getBuildingName();
        boolean boolean13 = room4.isOccupied();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi! - " + "'", str12, "hi! - ");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test26769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26769");
        room.Room room4 = new room.Room("hi!", (int) (byte) 0, "hi!", "hi! - hi!");
        java.lang.String str5 = room4.getBuildingName();
        boolean boolean6 = room4.isEnabled();
        boolean boolean7 = room4.isEnabled();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test26770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26770");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        room.SensorObserver sensorObserver5 = null;
        room4.addObserver(sensorObserver5);
        room.SensorObserver sensorObserver7 = null;
        room4.addObserver(sensorObserver7);
        java.lang.String str9 = room4.getBuildingName();
        java.lang.String str10 = room4.getRoomNumber();
        boolean boolean11 = room4.isEnabled();
        room.SensorObserver sensorObserver12 = null;
        room4.removeObserver(sensorObserver12);
        boolean boolean14 = room4.isUnderMaintenance();
        java.lang.String str15 = room4.getFullLocation();
        java.lang.String str16 = room4.getRoomNumber();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi! - hi!" + "'", str15, "hi! - hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test26771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26771");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        java.lang.String str5 = room4.getScannedID();
        room4.setScannedID("hi!");
        boolean boolean8 = room4.isEnabled();
        int int9 = room4.getCapacity();
        int int10 = room4.getCapacity();
        boolean boolean11 = room4.isOccupied();
        room4.setEnabled(false);
        room4.setEnabled(false);
        room4.setUnderMaintenance(true);
        java.lang.String str18 = room4.getBuildingName();
        boolean boolean19 = room4.isUnderMaintenance();
        room4.notifyObservers();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test26772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26772");
        room.Room room4 = new room.Room("", (-1), "", "");
        java.lang.String str5 = room4.getRoomID();
        boolean boolean6 = room4.isEnabled();
        room4.setScannedID("Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! -  -  - Room hi! | hi! - hi! | Capacity: 0");
        room.SensorObserver sensorObserver9 = null;
        room4.addObserver(sensorObserver9);
        // The following exception was thrown during execution in test generation
        try {
            room4.setOccupied(false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test26773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26773");
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
        boolean boolean15 = room4.isUnderMaintenance();
        boolean boolean16 = room4.isUnderMaintenance();
        room.SensorObserver sensorObserver17 = null;
        room4.removeObserver(sensorObserver17);
        boolean boolean19 = room4.isUnderMaintenance();
        room4.setScannedID("");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str11, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test26774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26774");
        room.Room room4 = new room.Room("Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room hi! | hi! - hi! | Capacity: 0", (int) (byte) 0, "Room Room  | Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! | Capacity: 1 |  - Room hi! | hi! - hi! | Capacity: 0 - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! | Capacity: 1", "Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! - hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 97 | Capacity: 32 | Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 100 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: -1 - Room hi! | hi! - hi! | Capacity: 0 - hi! - Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10");
        room4.notifyObservers();
    }

    @Test
    public void test26775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26775");
        room.Room room4 = new room.Room(" - Room hi! | hi! - hi! | Capacity: 0", 0, "", "Room hi! | hi! - hi! | Capacity: 0");
        room4.setOccupied(false);
        room.SensorObserver sensorObserver7 = null;
        room4.removeObserver(sensorObserver7);
        room4.setScannedID("");
        boolean boolean11 = room4.isUnderMaintenance();
        room.SensorObserver sensorObserver12 = null;
        room4.addObserver(sensorObserver12);
        java.lang.String str14 = room4.getScannedID();
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test26776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26776");
        room.Room room4 = new room.Room(" - Room hi! | hi! - hi! | Capacity: 0", (int) (byte) 100, "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi!", "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10");
        int int5 = room4.getCapacity();
        room4.setScannedID("Room  - Room hi! | hi! - hi! | Capacity: 0 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 0");
        room.SensorObserver sensorObserver8 = null;
        room4.removeObserver(sensorObserver8);
        room4.setOccupied(true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
    }

    @Test
    public void test26777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26777");
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
        int int20 = room4.getCapacity();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str7, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str10, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi! - hi!" + "'", str16, "hi! - hi!");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test26778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26778");
        room.Room room4 = new room.Room("Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 | hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 0 - hi! - hi! - Room hi! | hi! - hi! | Capacity: 0", 0, "Room Room hi! | hi! - hi! | Capacity: 0 |  - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 0", " - Room hi! | hi! - hi! | Capacity: 0");
        room.SensorObserver sensorObserver5 = null;
        room4.addObserver(sensorObserver5);
        boolean boolean7 = room4.isEnabled();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test26779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26779");
        room.Room room4 = new room.Room("", (int) ' ', "Room hi! | hi! - hi! | Capacity: 0 - hi! - hi!", "Room Room hi! | hi! - hi! | Capacity: 0 | hi! - hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 97");
        int int5 = room4.getCapacity();
        int int6 = room4.getCapacity();
        java.lang.String str7 = room4.getScannedID();
        java.lang.String str8 = room4.toString();
        room4.setOccupied(false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! - hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 97 | Capacity: 32" + "'", str8, "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! - hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 97 | Capacity: 32");
    }

    @Test
    public void test26780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26780");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        java.lang.String str5 = room4.getScannedID();
        room4.setScannedID("hi!");
        java.lang.String str8 = room4.getBuildingName();
        int int9 = room4.getCapacity();
        room4.setOccupied(false);
        room.SensorObserver sensorObserver12 = null;
        room4.removeObserver(sensorObserver12);
        java.lang.String str14 = room4.getBuildingName();
        room4.setUnderMaintenance(false);
        room4.setOccupied(true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test26781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26781");
        room.Room room4 = new room.Room("", (int) (byte) 100, "Room hi! | hi! - hi! | Capacity: 0 - hi!", "");
        boolean boolean5 = room4.isEnabled();
        java.lang.String str6 = room4.getFullLocation();
        room4.setEnabled(false);
        room4.setOccupied(false);
        java.lang.String str11 = room4.getRoomNumber();
        java.lang.String str12 = room4.toString();
        boolean boolean13 = room4.isEnabled();
        room4.setOccupied(true);
        boolean boolean16 = room4.isUnderMaintenance();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0 - hi! - " + "'", str6, "Room hi! | hi! - hi! | Capacity: 0 - hi! - ");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 100" + "'", str12, "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 100");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test26782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26782");
        room.Room room4 = new room.Room("Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10", (int) (short) 10, "Room  - Room hi! | hi! - hi! | Capacity: 0 |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 0", "Room Room hi! | hi! - hi! | Capacity: 0 | hi! - hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 97");
        room4.setScannedID(" - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi!");
        int int7 = room4.getCapacity();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
    }

    @Test
    public void test26783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26783");
        room.Room room4 = new room.Room("", (int) (short) 10, "Room hi! | hi! - hi! | Capacity: 0", "hi!");
        java.lang.String str5 = room4.toString();
        java.lang.String str6 = room4.getBuildingName();
        boolean boolean7 = room4.isOccupied();
        room.SensorObserver sensorObserver8 = null;
        room4.removeObserver(sensorObserver8);
        room.SensorObserver sensorObserver10 = null;
        room4.removeObserver(sensorObserver10);
        java.lang.String str12 = room4.getScannedID();
        java.lang.String str13 = room4.getScannedID();
        java.lang.String str14 = room4.getRoomNumber();
        java.lang.String str15 = room4.getFullLocation();
        int int16 = room4.getCapacity();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10" + "'", str5, "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str6, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0 - hi!" + "'", str15, "Room hi! | hi! - hi! | Capacity: 0 - hi!");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
    }

    @Test
    public void test26784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26784");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        room.SensorObserver sensorObserver5 = null;
        room4.addObserver(sensorObserver5);
        java.lang.String str7 = room4.toString();
        room.SensorObserver sensorObserver8 = null;
        room4.removeObserver(sensorObserver8);
        int int10 = room4.getCapacity();
        java.lang.String str11 = room4.getRoomID();
        boolean boolean12 = room4.isEnabled();
        room.SensorObserver sensorObserver13 = null;
        room4.removeObserver(sensorObserver13);
        room.SensorObserver sensorObserver15 = null;
        room4.addObserver(sensorObserver15);
        int int17 = room4.getCapacity();
        java.lang.String str18 = room4.toString();
        room.SensorObserver sensorObserver19 = null;
        room4.removeObserver(sensorObserver19);
        room.SensorObserver sensorObserver21 = null;
        room4.addObserver(sensorObserver21);
        boolean boolean23 = room4.isUnderMaintenance();
        // The following exception was thrown during execution in test generation
        try {
            room4.setScannedID("Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 |  - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 35");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str7, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str18, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test26785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26785");
        room.Room room4 = new room.Room("Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100", 52, "Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - hi! | Capacity: 1", "Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 100 | hi! - hi! - hi! - hi! | Capacity: 0");
        room.SensorObserver sensorObserver5 = null;
        room4.removeObserver(sensorObserver5);
        java.lang.String str7 = room4.getRoomNumber();
        java.lang.String str8 = room4.getRoomNumber();
        java.lang.String str9 = room4.getBuildingName();
        boolean boolean10 = room4.isOccupied();
        java.lang.String str11 = room4.getScannedID();
        boolean boolean12 = room4.isOccupied();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 100 | hi! - hi! - hi! - hi! | Capacity: 0" + "'", str7, "Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 100 | hi! - hi! - hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 100 | hi! - hi! - hi! - hi! | Capacity: 0" + "'", str8, "Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 100 | hi! - hi! - hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - hi! | Capacity: 1" + "'", str9, "Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - hi! | Capacity: 1");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test26786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26786");
        room.Room room4 = new room.Room("Room Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 97 | Room hi! | hi! - hi! | Capacity: 0 - hi! - hi! - Room hi! | Room hi! | hi! - hi! | Capacity: 0 - hi! - Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 1 | Capacity: 1", (int) '#', "Room Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 | hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 0 - hi! - hi! - Room hi! | hi! - hi! | Capacity: 0 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 -  - Room hi! | hi! - hi! | Capacity: 0 - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! -  | Capacity: 10", "Room Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! -  | Room  | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 100 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 1 - Room Room hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 1 | Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! - Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: -1 | Capacity: -1");
    }

    @Test
    public void test26787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26787");
        room.Room room4 = new room.Room("hi!", (int) (byte) 1, "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10", "hi!");
        room4.notifyObservers();
        room4.setUnderMaintenance(false);
        java.lang.String str8 = room4.getFullLocation();
        java.lang.Class<?> wildcardClass9 = room4.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi!" + "'", str8, "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi!");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test26788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26788");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        room.SensorObserver sensorObserver5 = null;
        room4.addObserver(sensorObserver5);
        java.lang.String str7 = room4.getScannedID();
        room.SensorObserver sensorObserver8 = null;
        room4.removeObserver(sensorObserver8);
        room.SensorObserver sensorObserver10 = null;
        room4.addObserver(sensorObserver10);
        java.lang.String str12 = room4.getFullLocation();
        room.SensorObserver sensorObserver13 = null;
        room4.removeObserver(sensorObserver13);
        java.lang.String str15 = room4.getScannedID();
        room4.setEnabled(false);
        room4.setScannedID("Room Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | hi! - Room hi! | hi! - hi! | Capacity: 0 - Room  - Room hi! | hi! - hi! | Capacity: 0 |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 0 | Capacity: 52");
        boolean boolean20 = room4.isOccupied();
        java.lang.String str21 = room4.getScannedID();
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi! - hi!" + "'", str12, "hi! - hi!");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Room Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | hi! - Room hi! | hi! - hi! | Capacity: 0 - Room  - Room hi! | hi! - hi! | Capacity: 0 |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 0 | Capacity: 52" + "'", str21, "Room Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | hi! - Room hi! | hi! - hi! | Capacity: 0 - Room  - Room hi! | hi! - hi! | Capacity: 0 |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 0 | Capacity: 52");
    }

    @Test
    public void test26789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26789");
        room.Room room4 = new room.Room("", (int) '4', "Room Room hi! | hi! - hi! | Capacity: 0 - hi! | Room Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! - hi! - hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: -1 - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 | Capacity: 10 - Room Room  - Room hi! | hi! - hi! | Capacity: 0 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 0 | Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 - Room hi! | Room hi! | hi! - hi! | Capacity: 0 - hi! - Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 1 | Capacity: -1", "Room Room hi! - hi! - hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 1 | Capacity: 0 | Room hi! | hi! - hi! | Capacity: 0 - hi! - hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 | Capacity: -1");
        room.SensorObserver sensorObserver5 = null;
        room4.addObserver(sensorObserver5);
    }

    @Test
    public void test26790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26790");
        room.Room room4 = new room.Room("", (int) (byte) 1, "Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10", "hi!");
        java.lang.String str5 = room4.getFullLocation();
        room4.setScannedID("Room hi! | hi! - hi! | Capacity: 0");
        java.lang.String str8 = room4.getFullLocation();
        room4.setUnderMaintenance(false);
        room4.setScannedID("Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 1 - Room hi! | hi! - hi! | Capacity: 0 - hi!");
        room.SensorObserver sensorObserver13 = null;
        room4.addObserver(sensorObserver13);
        // The following exception was thrown during execution in test generation
        try {
            room4.setScannedID("Room Room Room hi! | hi! - hi! | Capacity: 0 - hi! | Room hi! | Room hi! | hi! - hi! | Capacity: 0 - hi! - Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 1 - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 32 |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 35");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi!" + "'", str5, "Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi!" + "'", str8, "Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi!");
    }

    @Test
    public void test26791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26791");
        room.Room room4 = new room.Room("Room hi! | hi! - hi! | Capacity: 0 - hi!", (int) (short) 10, "Room hi! | hi! - hi! | Capacity: 0", "Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10");
        room4.setUnderMaintenance(false);
        room4.setEnabled(true);
        boolean boolean9 = room4.isOccupied();
        room4.setScannedID("");
        room.SensorObserver sensorObserver12 = null;
        room4.addObserver(sensorObserver12);
        room.SensorObserver sensorObserver14 = null;
        room4.removeObserver(sensorObserver14);
        boolean boolean16 = room4.isUnderMaintenance();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test26792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26792");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        java.lang.String str5 = room4.getBuildingName();
        java.lang.String str6 = room4.getRoomID();
        boolean boolean7 = room4.isOccupied();
        room4.setEnabled(false);
        boolean boolean10 = room4.isUnderMaintenance();
        java.lang.String str11 = room4.getRoomID();
        room4.setEnabled(true);
        java.lang.String str14 = room4.getScannedID();
        java.lang.String str15 = room4.getRoomID();
        room4.setEnabled(false);
        java.lang.String str18 = room4.getRoomID();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test26793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26793");
        room.Room room4 = new room.Room("Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100", (int) (short) 1, "", "Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi!");
        java.lang.String str5 = room4.getBuildingName();
        java.lang.String str6 = room4.getFullLocation();
        boolean boolean7 = room4.isEnabled();
        java.lang.String str8 = room4.getBuildingName();
        boolean boolean9 = room4.isUnderMaintenance();
        java.lang.Class<?> wildcardClass10 = room4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + " - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi!" + "'", str6, " - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test26794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26794");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        room.SensorObserver sensorObserver5 = null;
        room4.addObserver(sensorObserver5);
        java.lang.String str7 = room4.getScannedID();
        room.SensorObserver sensorObserver8 = null;
        room4.removeObserver(sensorObserver8);
        java.lang.String str10 = room4.getRoomNumber();
        boolean boolean11 = room4.isOccupied();
        int int12 = room4.getCapacity();
        java.lang.String str13 = room4.getBuildingName();
        java.lang.String str14 = room4.getRoomNumber();
        int int15 = room4.getCapacity();
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test26795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26795");
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
        java.lang.String str19 = room4.getScannedID();
        room4.setOccupied(true);
        room4.setUnderMaintenance(true);
        room4.setScannedID("Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str11, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi! - hi!" + "'", str14, "hi! - hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str15, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi! - " + "'", str19, "hi! - ");
    }

    @Test
    public void test26796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26796");
        room.Room room4 = new room.Room("", (int) (short) 10, "Room hi! | hi! - hi! | Capacity: 0", "hi!");
        java.lang.String str5 = room4.getFullLocation();
        boolean boolean6 = room4.isEnabled();
        java.lang.String str7 = room4.getRoomNumber();
        room4.setOccupied(true);
        java.lang.String str10 = room4.getFullLocation();
        room.SensorObserver sensorObserver11 = null;
        room4.addObserver(sensorObserver11);
        boolean boolean13 = room4.isOccupied();
        // The following exception was thrown during execution in test generation
        try {
            room4.notifyObservers();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0 - hi!" + "'", str5, "Room hi! | hi! - hi! | Capacity: 0 - hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0 - hi!" + "'", str10, "Room hi! | hi! - hi! | Capacity: 0 - hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test26797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26797");
        room.Room room4 = new room.Room("Room Room hi! | hi! - hi! | Capacity: 0 | Room hi! | hi! - hi! | Capacity: 0 - hi! - hi! | Capacity: 100", (-1), "", "hi! - hi! - Room hi! | hi! - hi! | Capacity: 0");
        java.lang.String str5 = room4.getRoomID();
        boolean boolean6 = room4.isOccupied();
        boolean boolean7 = room4.isUnderMaintenance();
        java.lang.String str8 = room4.getScannedID();
        room4.setUnderMaintenance(false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Room Room hi! | hi! - hi! | Capacity: 0 | Room hi! | hi! - hi! | Capacity: 0 - hi! - hi! | Capacity: 100" + "'", str5, "Room Room hi! | hi! - hi! | Capacity: 0 | Room hi! | hi! - hi! | Capacity: 0 - hi! - hi! | Capacity: 100");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test26798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26798");
        room.Room room4 = new room.Room("", 0, "", "Room hi! | hi! - hi! | Capacity: 0");
        java.lang.String str5 = room4.getScannedID();
        room4.setScannedID("Room hi! -  | Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 | hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 0 - Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10");
        boolean boolean8 = room4.isEnabled();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test26799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26799");
        room.Room room4 = new room.Room("Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10", 32, "Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 1 - Room hi! | hi! - hi! | Capacity: 0 - hi!", "Room Room hi! | hi! - hi! | Capacity: 0 |  - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 0");
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
    public void test26800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26800");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        room.SensorObserver sensorObserver5 = null;
        room4.addObserver(sensorObserver5);
        java.lang.String str7 = room4.getScannedID();
        java.lang.String str8 = room4.getFullLocation();
        int int9 = room4.getCapacity();
        java.lang.String str10 = room4.getScannedID();
        boolean boolean11 = room4.isOccupied();
        java.lang.String str12 = room4.getRoomNumber();
        // The following exception was thrown during execution in test generation
        try {
            room4.setScannedID("hi! - Room hi! | hi! - hi! | Capacity: 0 - Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 97");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi! - hi!" + "'", str8, "hi! - hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test26801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26801");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        java.lang.String str5 = room4.getScannedID();
        room4.setScannedID("hi!");
        room4.setUnderMaintenance(true);
        java.lang.String str10 = room4.getScannedID();
        java.lang.String str11 = room4.getFullLocation();
        boolean boolean12 = room4.isOccupied();
        room4.setEnabled(false);
        java.lang.String str15 = room4.getBuildingName();
        java.lang.String str16 = room4.getBuildingName();
        room4.setUnderMaintenance(false);
        java.lang.String str19 = room4.toString();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi! - hi!" + "'", str11, "hi! - hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str19, "Room hi! | hi! - hi! | Capacity: 0");
    }

    @Test
    public void test26802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26802");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        room.SensorObserver sensorObserver5 = null;
        room4.addObserver(sensorObserver5);
        java.lang.String str7 = room4.getFullLocation();
        boolean boolean8 = room4.isUnderMaintenance();
        java.lang.String str9 = room4.getRoomID();
        java.lang.String str10 = room4.getBuildingName();
        java.lang.String str11 = room4.getRoomID();
        java.lang.String str12 = room4.toString();
        java.lang.String str13 = room4.getScannedID();
        room.SensorObserver sensorObserver14 = null;
        room4.removeObserver(sensorObserver14);
        room4.setEnabled(false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi! - hi!" + "'", str7, "hi! - hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str12, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test26803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26803");
        room.Room room4 = new room.Room("hi!", (int) (byte) 1, "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10", "hi!");
        java.lang.String str5 = room4.getBuildingName();
        java.lang.String str6 = room4.toString();
        room.SensorObserver sensorObserver7 = null;
        room4.removeObserver(sensorObserver7);
        room4.setScannedID("Room  - Room hi! | hi! - hi! | Capacity: 0 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 0 -  - Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | Room hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 1 - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! | Capacity: 97");
        int int11 = room4.getCapacity();
        boolean boolean12 = room4.isUnderMaintenance();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10" + "'", str5, "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Room hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 1" + "'", str6, "Room hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 1");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test26804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26804");
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
        boolean boolean18 = room4.isUnderMaintenance();
        java.lang.String str19 = room4.toString();
        room4.setScannedID("Room  - Room hi! | hi! - hi! | Capacity: 0 | Room hi! | hi! - hi! | Capacity: 0 - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 | Capacity: 35");
        java.lang.Class<?> wildcardClass22 = room4.getClass();
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str11, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str19, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test26805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26805");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        java.lang.String str5 = room4.getBuildingName();
        java.lang.String str6 = room4.getRoomID();
        boolean boolean7 = room4.isOccupied();
        room4.setEnabled(false);
        boolean boolean10 = room4.isUnderMaintenance();
        java.lang.String str11 = room4.getRoomID();
        java.lang.Class<?> wildcardClass12 = room4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test26806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26806");
        room.Room room4 = new room.Room("", 1, "Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi!", "Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10");
        java.lang.String str5 = room4.getRoomID();
        int int6 = room4.getCapacity();
        java.lang.String str7 = room4.getFullLocation();
        room4.setOccupied(false);
        java.lang.String str10 = room4.getRoomID();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10" + "'", str7, "Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test26807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26807");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        java.lang.String str5 = room4.getScannedID();
        room4.setScannedID("hi!");
        java.lang.String str8 = room4.getBuildingName();
        room4.setEnabled(false);
        room4.setUnderMaintenance(false);
        boolean boolean13 = room4.isOccupied();
        java.lang.String str14 = room4.toString();
        java.lang.String str15 = room4.getRoomID();
        room4.setEnabled(true);
        java.lang.String str18 = room4.getRoomID();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str14, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test26808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26808");
        room.Room room4 = new room.Room("hi! - hi! - Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 -  - hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10", (int) ' ', "Room Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! -  | Room  | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 100 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 1 - Room Room hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 1 | Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! - Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: -1 | Capacity: -1", "Room Room Room hi! | hi! - hi! | Capacity: 0 | Room hi! | hi! - hi! | Capacity: 0 - hi! - hi! | Capacity: 100 - Room  - Room hi! | hi! - hi! | Capacity: 0 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 0 | Room hi! | hi! - hi! - Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | Capacity: 0 - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! | Capacity: 52 - Room hi! | hi! - hi! | Capacity: 0 - hi! - Room hi! | hi! - hi! | Capacity: 0 - hi! - hi! - hi! - Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100");
        boolean boolean5 = room4.isEnabled();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test26809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26809");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        boolean boolean5 = room4.isOccupied();
        java.lang.String str6 = room4.toString();
        java.lang.String str7 = room4.toString();
        java.lang.String str8 = room4.toString();
        boolean boolean9 = room4.isUnderMaintenance();
        room4.setEnabled(false);
        room4.setScannedID("Room  - hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Room Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! - hi! - hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: -1 - Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 | hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 0 - hi! - hi! - Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 97 - Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 100 | hi! - hi! - hi! - hi! | Capacity: 0 -  - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! | Capacity: 1 - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - Room hi! | hi! - hi! | Capacity: 0 - hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str6, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str7, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str8, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test26810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26810");
        room.Room room4 = new room.Room("Room hi! - hi! - Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | Room hi! | hi! - hi! | Capacity: 0 - hi! -  - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! | Capacity: -1", (int) (byte) 100, "Room hi! | hi! - hi! | Capacity: 0 - hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! - hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 97", "Room Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - hi! | Capacity: 1 | Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 | hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 0 - hi! - hi! - Room hi! | hi! - hi! | Capacity: 0 -  - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! | Capacity: 35");
        java.lang.String str5 = room4.toString();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Room Room hi! - hi! - Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | Room hi! | hi! - hi! | Capacity: 0 - hi! -  - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! | Capacity: -1 | Room hi! | hi! - hi! | Capacity: 0 - hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! - hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 97 - Room Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - hi! | Capacity: 1 | Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 | hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 0 - hi! - hi! - Room hi! | hi! - hi! | Capacity: 0 -  - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! | Capacity: 35 | Capacity: 100" + "'", str5, "Room Room hi! - hi! - Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | Room hi! | hi! - hi! | Capacity: 0 - hi! -  - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! | Capacity: -1 | Room hi! | hi! - hi! | Capacity: 0 - hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! - hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 97 - Room Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - hi! | Capacity: 1 | Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 | hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 0 - hi! - hi! - Room hi! | hi! - hi! | Capacity: 0 -  - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! | Capacity: 35 | Capacity: 100");
    }

    @Test
    public void test26811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26811");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        java.lang.String str5 = room4.getBuildingName();
        java.lang.String str6 = room4.getRoomID();
        java.lang.String str7 = room4.getScannedID();
        room4.setEnabled(false);
        room4.setOccupied(true);
        java.lang.String str12 = room4.getFullLocation();
        java.lang.String str13 = room4.getBuildingName();
        boolean boolean14 = room4.isOccupied();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi! - hi!" + "'", str12, "hi! - hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test26812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26812");
        room.Room room4 = new room.Room("Room Room hi! | hi! - hi! | Capacity: 0 - hi! | Room Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! - hi! - hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: -1 - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 | Capacity: 10 - Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | hi! - hi! - hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 0", (int) (byte) 10, "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10", "Room hi! | hi! - hi! | Capacity: 0 - hi! - hi! - Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | hi! -  - Room  - Room hi! | hi! - hi! | Capacity: 0 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 0 | Capacity: 10");
        boolean boolean5 = room4.isEnabled();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test26813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26813");
        room.Room room4 = new room.Room("Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi!", (-1), " - Room hi! | hi! - hi! | Capacity: 0", "Room hi! | hi! - hi! | Capacity: 0 - hi!");
        int int5 = room4.getCapacity();
        room4.notifyObservers();
        room4.setUnderMaintenance(false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test26814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26814");
        room.Room room4 = new room.Room("Room hi! | hi! - hi! | Capacity: 0 - hi! - Room hi! | hi! - hi! | Capacity: 0 - hi!", 32, "Room  | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 100 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  - Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 | hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 0 - hi! - hi! - Room hi! | hi! - hi! | Capacity: 0 - Room hi! - hi! - hi! | hi! - hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 1 | Capacity: 100", "Room Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! | Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 97 - hi! - hi! - hi! | Capacity: 0");
        room.SensorObserver sensorObserver5 = null;
        room4.addObserver(sensorObserver5);
    }

    @Test
    public void test26815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26815");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        room.SensorObserver sensorObserver5 = null;
        room4.addObserver(sensorObserver5);
        java.lang.String str7 = room4.getScannedID();
        room.SensorObserver sensorObserver8 = null;
        room4.removeObserver(sensorObserver8);
        java.lang.String str10 = room4.getRoomNumber();
        java.lang.String str11 = room4.toString();
        room4.setScannedID("Room hi! | hi! - hi! | Capacity: 0");
        java.lang.String str14 = room4.getBuildingName();
        int int15 = room4.getCapacity();
        boolean boolean16 = room4.isUnderMaintenance();
        boolean boolean17 = room4.isEnabled();
        room4.setEnabled(true);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str11, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test26816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26816");
        room.Room room4 = new room.Room("hi! - hi!", 100, "", "");
        room.SensorObserver sensorObserver5 = null;
        room4.removeObserver(sensorObserver5);
        java.lang.String str7 = room4.getFullLocation();
        int int8 = room4.getCapacity();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + " - " + "'", str7, " - ");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
    }

    @Test
    public void test26817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26817");
        room.Room room4 = new room.Room("Room hi! | hi! - hi! | Capacity: 0 - hi! - ", (int) (short) -1, "Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 100 | hi! - hi! - hi! - hi! | Capacity: 0", "Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 1");
        room4.setEnabled(true);
        room4.setScannedID("Room hi! | hi! - hi! | Capacity: 0 - hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 100 - Room hi! | hi! - hi! | Capacity: 0 - hi! - ");
        java.lang.String str9 = room4.getRoomNumber();
        room4.setEnabled(false);
        room4.setScannedID("Room hi! | Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 97 - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 100 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 100");
        room.SensorObserver sensorObserver14 = null;
        room4.addObserver(sensorObserver14);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 1" + "'", str9, "Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 1");
    }

    @Test
    public void test26818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26818");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        java.lang.String str5 = room4.getScannedID();
        room4.setScannedID("hi!");
        room4.setUnderMaintenance(true);
        room.SensorObserver sensorObserver10 = null;
        room4.addObserver(sensorObserver10);
        room.SensorObserver sensorObserver12 = null;
        room4.addObserver(sensorObserver12);
        int int14 = room4.getCapacity();
        room.SensorObserver sensorObserver15 = null;
        room4.addObserver(sensorObserver15);
        boolean boolean17 = room4.isEnabled();
        java.lang.String str18 = room4.getRoomNumber();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test26819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26819");
        room.Room room4 = new room.Room("Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 | Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 - hi! -  | Capacity: 10", 10, "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 -  - Room hi! | hi! - hi! | Capacity: 0", "Room  | Room hi! | hi! - hi! | Capacity: 0 -  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 32");
        java.lang.String str5 = room4.getScannedID();
        boolean boolean6 = room4.isUnderMaintenance();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test26820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26820");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        room.SensorObserver sensorObserver5 = null;
        room4.addObserver(sensorObserver5);
        java.lang.String str7 = room4.getScannedID();
        room.SensorObserver sensorObserver8 = null;
        room4.removeObserver(sensorObserver8);
        java.lang.String str10 = room4.getRoomNumber();
        java.lang.String str11 = room4.toString();
        boolean boolean12 = room4.isEnabled();
        boolean boolean13 = room4.isOccupied();
        room.SensorObserver sensorObserver14 = null;
        room4.removeObserver(sensorObserver14);
        java.lang.String str16 = room4.getBuildingName();
        boolean boolean17 = room4.isEnabled();
        room4.setUnderMaintenance(true);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str11, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test26821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26821");
        room.Room room4 = new room.Room("Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 100 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 10", (int) (byte) 1, "Room  - Room hi! | hi! - hi! | Capacity: 0 |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 0 - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi!", "Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 | hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 0 - hi! - hi! - Room hi! | hi! - hi! | Capacity: 0 - Room hi! - hi! - hi! | hi! - hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 1");
    }

    @Test
    public void test26822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26822");
        room.Room room4 = new room.Room("hi! - ", (int) (byte) 10, "Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10", "Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10");
        room.SensorObserver sensorObserver5 = null;
        room4.addObserver(sensorObserver5);
        int int7 = room4.getCapacity();
        java.lang.String str8 = room4.getRoomNumber();
        java.lang.String str9 = room4.getScannedID();
        java.lang.String str10 = room4.getBuildingName();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10" + "'", str8, "Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10" + "'", str10, "Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10");
    }

    @Test
    public void test26823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26823");
        room.Room room4 = new room.Room("", (int) (byte) 1, "Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10", "hi!");
        java.lang.String str5 = room4.getBuildingName();
        room.SensorObserver sensorObserver6 = null;
        room4.addObserver(sensorObserver6);
        java.lang.String str8 = room4.getScannedID();
        java.lang.String str9 = room4.getBuildingName();
        java.lang.String str10 = room4.getFullLocation();
        java.lang.String str11 = room4.toString();
        java.lang.String str12 = room4.getScannedID();
        boolean boolean13 = room4.isOccupied();
        // The following exception was thrown during execution in test generation
        try {
            room4.setEnabled(true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10" + "'", str5, "Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10" + "'", str9, "Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi!" + "'", str10, "Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Room  | Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! | Capacity: 1" + "'", str11, "Room  | Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! | Capacity: 1");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test26824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26824");
        room.Room room4 = new room.Room("Room  - Room hi! | hi! - hi! | Capacity: 0 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 0", (int) (short) 0, "hi! - hi! - Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100", " - hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10");
        java.lang.String str5 = room4.getScannedID();
        boolean boolean6 = room4.isEnabled();
        java.lang.String str7 = room4.getScannedID();
        java.lang.String str8 = room4.getBuildingName();
        boolean boolean9 = room4.isOccupied();
        java.lang.String str10 = room4.getScannedID();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi! - hi! - Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100" + "'", str8, "hi! - hi! - Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test26825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26825");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        java.lang.String str5 = room4.getScannedID();
        room4.setScannedID("hi!");
        boolean boolean8 = room4.isEnabled();
        room.SensorObserver sensorObserver9 = null;
        room4.removeObserver(sensorObserver9);
        boolean boolean11 = room4.isEnabled();
        room4.setOccupied(true);
        boolean boolean14 = room4.isOccupied();
        java.lang.String str15 = room4.toString();
        java.lang.String str16 = room4.getRoomNumber();
        boolean boolean17 = room4.isUnderMaintenance();
        java.lang.String str18 = room4.toString();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str15, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str18, "Room hi! | hi! - hi! | Capacity: 0");
    }

    @Test
    public void test26826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26826");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        room.SensorObserver sensorObserver5 = null;
        room4.addObserver(sensorObserver5);
        java.lang.String str7 = room4.getFullLocation();
        boolean boolean8 = room4.isEnabled();
        boolean boolean9 = room4.isOccupied();
        boolean boolean10 = room4.isEnabled();
        java.lang.String str11 = room4.getScannedID();
        java.lang.String str12 = room4.getBuildingName();
        boolean boolean13 = room4.isUnderMaintenance();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi! - hi!" + "'", str7, "hi! - hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test26827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26827");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        java.lang.String str5 = room4.getScannedID();
        room4.setScannedID("hi!");
        java.lang.String str8 = room4.getBuildingName();
        java.lang.String str9 = room4.getRoomNumber();
        int int10 = room4.getCapacity();
        room4.notifyObservers();
        java.lang.String str12 = room4.getScannedID();
        room.SensorObserver sensorObserver13 = null;
        room4.removeObserver(sensorObserver13);
        int int15 = room4.getCapacity();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test26828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26828");
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
        boolean boolean17 = room4.isUnderMaintenance();
        room4.setUnderMaintenance(false);
        room4.setOccupied(false);
        java.lang.String str22 = room4.getRoomID();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str6, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str7, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str8, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str9, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
    }

    @Test
    public void test26829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26829");
        room.Room room4 = new room.Room("hi!", (int) (byte) 1, "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10", "hi!");
        java.lang.String str5 = room4.getRoomNumber();
        java.lang.String str6 = room4.getRoomID();
        room4.setEnabled(false);
        room4.setUnderMaintenance(false);
        boolean boolean11 = room4.isUnderMaintenance();
        room4.setUnderMaintenance(true);
        room.SensorObserver sensorObserver14 = null;
        room4.removeObserver(sensorObserver14);
        room4.setUnderMaintenance(false);
        room4.setOccupied(true);
        boolean boolean20 = room4.isOccupied();
        room4.setUnderMaintenance(false);
        room4.notifyObservers();
        boolean boolean24 = room4.isUnderMaintenance();
        java.lang.Class<?> wildcardClass25 = room4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test26830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26830");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        boolean boolean5 = room4.isEnabled();
        java.lang.String str6 = room4.getBuildingName();
        room.SensorObserver sensorObserver7 = null;
        room4.removeObserver(sensorObserver7);
        java.lang.String str9 = room4.getBuildingName();
        room4.setScannedID("hi! - hi!");
        java.lang.String str12 = room4.toString();
        java.lang.String str13 = room4.getScannedID();
        boolean boolean14 = room4.isEnabled();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str12, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi! - hi!" + "'", str13, "hi! - hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test26831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26831");
        room.Room room4 = new room.Room(" - Room hi! | hi! - hi! | Capacity: 0", 0, "", "Room hi! | hi! - hi! | Capacity: 0");
        room4.setScannedID("hi! - hi!");
        boolean boolean7 = room4.isUnderMaintenance();
        int int8 = room4.getCapacity();
        java.lang.String str9 = room4.getBuildingName();
        room.SensorObserver sensorObserver10 = null;
        room4.addObserver(sensorObserver10);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test26832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26832");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        java.lang.String str5 = room4.getScannedID();
        room4.setScannedID("hi!");
        boolean boolean8 = room4.isEnabled();
        room4.setEnabled(false);
        room4.setOccupied(true);
        java.lang.String str13 = room4.getBuildingName();
        room.SensorObserver sensorObserver14 = null;
        room4.removeObserver(sensorObserver14);
        boolean boolean16 = room4.isOccupied();
        room4.notifyObservers();
        room4.setUnderMaintenance(false);
        boolean boolean20 = room4.isEnabled();
        java.lang.String str21 = room4.getRoomID();
        java.lang.String str22 = room4.getBuildingName();
        room4.notifyObservers();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
    }

    @Test
    public void test26833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26833");
        room.Room room4 = new room.Room(" - Room hi! | hi! - hi! | Capacity: 0", 0, "", "Room hi! | hi! - hi! | Capacity: 0");
        room4.setScannedID("hi! - hi!");
        java.lang.String str7 = room4.getRoomID();
        java.lang.String str8 = room4.getScannedID();
        room4.setScannedID("Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 100 | hi! - hi! - hi! - hi! | Capacity: 0");
        room4.setUnderMaintenance(true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + " - Room hi! | hi! - hi! | Capacity: 0" + "'", str7, " - Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi! - hi!" + "'", str8, "hi! - hi!");
    }

    @Test
    public void test26834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26834");
        room.Room room4 = new room.Room("Room hi! | hi! - hi! | Capacity: 0 - hi! - hi!", 52, "", "Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | hi! - hi! - hi! | Capacity: 0");
        room4.setUnderMaintenance(false);
        room4.setEnabled(true);
        java.lang.String str9 = room4.toString();
        boolean boolean10 = room4.isUnderMaintenance();
        java.lang.String str11 = room4.getRoomID();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Room Room hi! | hi! - hi! | Capacity: 0 - hi! - hi! |  - Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | hi! - hi! - hi! | Capacity: 0 | Capacity: 52" + "'", str9, "Room Room hi! | hi! - hi! | Capacity: 0 - hi! - hi! |  - Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | hi! - hi! - hi! | Capacity: 0 | Capacity: 52");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0 - hi! - hi!" + "'", str11, "Room hi! | hi! - hi! | Capacity: 0 - hi! - hi!");
    }

    @Test
    public void test26835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26835");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        boolean boolean5 = room4.isOccupied();
        room4.setEnabled(false);
        boolean boolean8 = room4.isUnderMaintenance();
        int int9 = room4.getCapacity();
        room4.setUnderMaintenance(false);
        boolean boolean12 = room4.isEnabled();
        boolean boolean13 = room4.isUnderMaintenance();
        room.SensorObserver sensorObserver14 = null;
        room4.addObserver(sensorObserver14);
        // The following exception was thrown during execution in test generation
        try {
            room4.setUnderMaintenance(false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test26836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26836");
        room.Room room4 = new room.Room("Room hi! - hi! - hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 1 | Capacity: 0", 52, "Room hi! -  | Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 10", "");
        java.lang.String str5 = room4.getRoomID();
        room.SensorObserver sensorObserver6 = null;
        room4.addObserver(sensorObserver6);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Room hi! - hi! - hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 1 | Capacity: 0" + "'", str5, "Room hi! - hi! - hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 1 | Capacity: 0");
    }

    @Test
    public void test26837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26837");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        java.lang.String str5 = room4.getScannedID();
        room4.setScannedID("hi!");
        java.lang.String str8 = room4.getBuildingName();
        room4.setEnabled(false);
        java.lang.String str11 = room4.toString();
        boolean boolean12 = room4.isUnderMaintenance();
        java.lang.String str13 = room4.getScannedID();
        java.lang.Class<?> wildcardClass14 = room4.getClass();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str11, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test26838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26838");
        room.Room room4 = new room.Room("Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10", 0, "hi!", "Room hi! | hi! - hi! | Capacity: 0");
        java.lang.String str5 = room4.getBuildingName();
        room.SensorObserver sensorObserver6 = null;
        room4.addObserver(sensorObserver6);
        boolean boolean8 = room4.isEnabled();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test26839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26839");
        room.Room room4 = new room.Room("Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! -  -  - Room hi! | hi! - hi! | Capacity: 0", 10, "Room  - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 100 | hi! - hi! - hi! - hi! | Capacity: 0 | Capacity: 0", "Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 1");
        java.lang.String str5 = room4.getRoomID();
        room4.notifyObservers();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! -  -  - Room hi! | hi! - hi! | Capacity: 0" + "'", str5, "Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! -  -  - Room hi! | hi! - hi! | Capacity: 0");
    }

    @Test
    public void test26840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26840");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        java.lang.String str5 = room4.getScannedID();
        room4.setScannedID("hi!");
        room4.setUnderMaintenance(true);
        boolean boolean10 = room4.isOccupied();
        java.lang.String str11 = room4.toString();
        java.lang.String str12 = room4.getRoomID();
        java.lang.String str13 = room4.getRoomID();
        boolean boolean14 = room4.isEnabled();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str11, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test26841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26841");
        room.Room room4 = new room.Room("hi!", 1, "Room hi! | hi! - hi! | Capacity: 0 - hi!", "Room hi! | hi! - hi! | Capacity: 0 - hi!");
        int int5 = room4.getCapacity();
        boolean boolean6 = room4.isUnderMaintenance();
        room4.setUnderMaintenance(false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test26842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26842");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        java.lang.String str5 = room4.getBuildingName();
        java.lang.String str6 = room4.getRoomID();
        boolean boolean7 = room4.isOccupied();
        room4.notifyObservers();
        room4.setOccupied(true);
        boolean boolean11 = room4.isEnabled();
        boolean boolean12 = room4.isUnderMaintenance();
        java.lang.String str13 = room4.getFullLocation();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi! - hi!" + "'", str13, "hi! - hi!");
    }

    @Test
    public void test26843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26843");
        room.Room room4 = new room.Room("hi! - ", 10, "Room Room hi! | hi! - hi! | Capacity: 0 | Room hi! | hi! - hi! | Capacity: 0 - hi! - hi! | Capacity: 100", "");
        java.lang.String str5 = room4.getRoomNumber();
        boolean boolean6 = room4.isOccupied();
        room4.setEnabled(false);
        boolean boolean9 = room4.isEnabled();
        java.lang.String str10 = room4.getRoomNumber();
        room4.setOccupied(true);
        java.lang.String str13 = room4.getBuildingName();
        room4.setUnderMaintenance(false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Room Room hi! | hi! - hi! | Capacity: 0 | Room hi! | hi! - hi! | Capacity: 0 - hi! - hi! | Capacity: 100" + "'", str13, "Room Room hi! | hi! - hi! | Capacity: 0 | Room hi! | hi! - hi! | Capacity: 0 - hi! - hi! | Capacity: 100");
    }

    @Test
    public void test26844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26844");
        room.Room room4 = new room.Room("Room hi! | hi! - hi! | Capacity: 0", (int) (short) 0, "", "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi!");
        room.SensorObserver sensorObserver5 = null;
        room4.removeObserver(sensorObserver5);
        boolean boolean7 = room4.isOccupied();
        java.lang.String str8 = room4.getBuildingName();
        boolean boolean9 = room4.isOccupied();
        java.lang.String str10 = room4.toString();
        room4.setEnabled(true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Room Room hi! | hi! - hi! | Capacity: 0 |  - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 0" + "'", str10, "Room Room hi! | hi! - hi! | Capacity: 0 |  - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 0");
    }

    @Test
    public void test26845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26845");
        room.Room room4 = new room.Room("hi! - hi! - hi!", 1, "hi! - hi!", "Room hi! | hi! - hi! | Capacity: 0");
        java.lang.String str5 = room4.toString();
        room4.setOccupied(false);
        boolean boolean8 = room4.isUnderMaintenance();
        room4.setOccupied(false);
        java.lang.String str11 = room4.toString();
        room.SensorObserver sensorObserver12 = null;
        room4.addObserver(sensorObserver12);
        // The following exception was thrown during execution in test generation
        try {
            room4.notifyObservers();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Room hi! - hi! - hi! | hi! - hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 1" + "'", str5, "Room hi! - hi! - hi! | hi! - hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 1");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Room hi! - hi! - hi! | hi! - hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 1" + "'", str11, "Room hi! - hi! - hi! | hi! - hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 1");
    }

    @Test
    public void test26846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26846");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        room.SensorObserver sensorObserver5 = null;
        room4.addObserver(sensorObserver5);
        java.lang.String str7 = room4.getScannedID();
        java.lang.String str8 = room4.getFullLocation();
        boolean boolean9 = room4.isOccupied();
        boolean boolean10 = room4.isUnderMaintenance();
        java.lang.String str11 = room4.getRoomID();
        boolean boolean12 = room4.isOccupied();
        room.SensorObserver sensorObserver13 = null;
        room4.removeObserver(sensorObserver13);
        boolean boolean15 = room4.isEnabled();
        java.lang.String str16 = room4.getScannedID();
        room4.setOccupied(true);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi! - hi!" + "'", str8, "hi! - hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test26847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26847");
        room.Room room4 = new room.Room("Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 | hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 0 - hi! - hi! - Room hi! | hi! - hi! | Capacity: 0", 100, "Room Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 97 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - hi! - Room Room hi! - hi! - hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 1 | Capacity: 0 | Room hi! -  | Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 10 -  | Capacity: 52 | Capacity: 32", "Room Room hi! | hi! - hi! | Capacity: 0 - hi! - hi! - Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | hi! -  - Room  - Room hi! | hi! - hi! | Capacity: 0 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 0 | Capacity: 10 | hi! -  - Room  - Room hi! | hi! - hi! | Capacity: 0 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 0 - hi! -  - Room  - Room hi! | hi! - hi! | Capacity: 0 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 0 | Capacity: 100");
    }

    @Test
    public void test26848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26848");
        room.Room room4 = new room.Room("hi!", (int) (byte) 1, "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10", "hi!");
        room4.notifyObservers();
        room4.setUnderMaintenance(false);
        room4.notifyObservers();
        java.lang.String str9 = room4.getRoomID();
        room4.setScannedID("Room  - Room hi! | hi! - hi! | Capacity: 0 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 0 - ");
        java.lang.String str12 = room4.getRoomID();
        boolean boolean13 = room4.isEnabled();
        boolean boolean14 = room4.isOccupied();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test26849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26849");
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
        room4.setScannedID("Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi!");
        java.lang.String str19 = room4.getRoomNumber();
        room4.setOccupied(true);
        int int22 = room4.getCapacity();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str7, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi! - hi!" + "'", str12, "hi! - hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test26850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26850");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        room.SensorObserver sensorObserver5 = null;
        room4.addObserver(sensorObserver5);
        java.lang.String str7 = room4.getScannedID();
        java.lang.String str8 = room4.getFullLocation();
        int int9 = room4.getCapacity();
        java.lang.String str10 = room4.getScannedID();
        room.SensorObserver sensorObserver11 = null;
        room4.removeObserver(sensorObserver11);
        java.lang.String str13 = room4.getFullLocation();
        room.SensorObserver sensorObserver14 = null;
        room4.removeObserver(sensorObserver14);
        room.SensorObserver sensorObserver16 = null;
        room4.removeObserver(sensorObserver16);
        java.lang.String str18 = room4.getScannedID();
        room4.setEnabled(false);
        int int21 = room4.getCapacity();
        room4.setEnabled(true);
        room4.setOccupied(true);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi! - hi!" + "'", str8, "hi! - hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi! - hi!" + "'", str13, "hi! - hi!");
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test26851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26851");
        room.Room room4 = new room.Room("Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10", 0, "hi!", "Room hi! | hi! - hi! | Capacity: 0");
        room4.setUnderMaintenance(false);
        room4.notifyObservers();
        boolean boolean8 = room4.isUnderMaintenance();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test26852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26852");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        room.SensorObserver sensorObserver5 = null;
        room4.addObserver(sensorObserver5);
        java.lang.String str7 = room4.getFullLocation();
        boolean boolean8 = room4.isUnderMaintenance();
        boolean boolean9 = room4.isUnderMaintenance();
        room.SensorObserver sensorObserver10 = null;
        room4.removeObserver(sensorObserver10);
        java.lang.String str12 = room4.getScannedID();
        boolean boolean13 = room4.isUnderMaintenance();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi! - hi!" + "'", str7, "hi! - hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test26853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26853");
        room.Room room4 = new room.Room("Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi!", 97, "Room hi! - hi! | Room hi! | hi! - hi! | Capacity: 0 - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! - hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 97 | Capacity: 35 - ", "Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 100 | hi! - hi! - hi! - hi! | Capacity: 0 -  - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi!");
    }

    @Test
    public void test26854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26854");
        room.Room room4 = new room.Room("", (int) (short) 10, "Room hi! | hi! - hi! | Capacity: 0", "hi!");
        java.lang.String str5 = room4.toString();
        java.lang.String str6 = room4.getBuildingName();
        room.SensorObserver sensorObserver7 = null;
        room4.removeObserver(sensorObserver7);
        boolean boolean9 = room4.isEnabled();
        java.lang.String str10 = room4.getBuildingName();
        room4.notifyObservers();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10" + "'", str5, "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str6, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str10, "Room hi! | hi! - hi! | Capacity: 0");
    }

    @Test
    public void test26855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26855");
        room.Room room4 = new room.Room("Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi!", (-1), " - Room hi! | hi! - hi! | Capacity: 0", "Room hi! | hi! - hi! | Capacity: 0 - hi!");
        room4.setScannedID("Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10");
        java.lang.String str7 = room4.toString();
        java.lang.String str8 = room4.getRoomID();
        boolean boolean9 = room4.isUnderMaintenance();
        room.SensorObserver sensorObserver10 = null;
        room4.addObserver(sensorObserver10);
        int int12 = room4.getCapacity();
        java.lang.String str13 = room4.getBuildingName();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Room Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! |  - Room hi! | hi! - hi! | Capacity: 0 - Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: -1" + "'", str7, "Room Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! |  - Room hi! | hi! - hi! | Capacity: 0 - Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: -1");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi!" + "'", str8, "Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + " - Room hi! | hi! - hi! | Capacity: 0" + "'", str13, " - Room hi! | hi! - hi! | Capacity: 0");
    }

    @Test
    public void test26856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26856");
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
        room4.setOccupied(false);
        boolean boolean19 = room4.isOccupied();
        int int20 = room4.getCapacity();
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str11, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test26857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26857");
        room.Room room4 = new room.Room("Room Room Room hi! | hi! - hi! | Capacity: 0 | hi! - hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 97 | Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 97 - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 100 - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 10", 35, "Room Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! -  | Room  | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 100 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 1 - Room Room hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 1 | Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! - Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: -1 | Capacity: -1", "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 100 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 10");
    }

    @Test
    public void test26858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26858");
        room.Room room4 = new room.Room("hi!", (int) (byte) 100, "", "Room hi! | hi! - hi! | Capacity: 0");
        room4.notifyObservers();
        room.SensorObserver sensorObserver6 = null;
        room4.removeObserver(sensorObserver6);
        java.lang.String str8 = room4.getRoomNumber();
        int int9 = room4.getCapacity();
        room4.notifyObservers();
        java.lang.String str11 = room4.getRoomID();
        java.lang.String str12 = room4.getScannedID();
        room4.setUnderMaintenance(false);
        boolean boolean15 = room4.isUnderMaintenance();
        java.lang.String str16 = room4.toString();
        room4.notifyObservers();
        java.lang.String str18 = room4.getRoomNumber();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str8, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100" + "'", str16, "Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str18, "Room hi! | hi! - hi! | Capacity: 0");
    }

    @Test
    public void test26859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26859");
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
        boolean boolean17 = room4.isEnabled();
        java.lang.String str18 = room4.getScannedID();
        java.lang.String str19 = room4.getBuildingName();
        java.lang.String str20 = room4.getBuildingName();
        java.lang.String str21 = room4.toString();
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi! - hi!" + "'", str8, "hi! - hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi! - hi!" + "'", str11, "hi! - hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str21, "Room hi! | hi! - hi! | Capacity: 0");
    }

    @Test
    public void test26860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26860");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        room.SensorObserver sensorObserver5 = null;
        room4.addObserver(sensorObserver5);
        java.lang.String str7 = room4.getScannedID();
        java.lang.String str8 = room4.getFullLocation();
        boolean boolean9 = room4.isOccupied();
        boolean boolean10 = room4.isOccupied();
        java.lang.String str11 = room4.getBuildingName();
        java.lang.String str12 = room4.getRoomID();
        room.SensorObserver sensorObserver13 = null;
        room4.removeObserver(sensorObserver13);
        room.SensorObserver sensorObserver15 = null;
        room4.removeObserver(sensorObserver15);
        room4.setScannedID("Room Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 97 | Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 100 | hi! - hi! - hi! - hi! | Capacity: 0 -  - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! | Capacity: 0");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi! - hi!" + "'", str8, "hi! - hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test26861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26861");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        room.SensorObserver sensorObserver5 = null;
        room4.addObserver(sensorObserver5);
        java.lang.String str7 = room4.toString();
        room.SensorObserver sensorObserver8 = null;
        room4.removeObserver(sensorObserver8);
        java.lang.String str10 = room4.toString();
        java.lang.String str11 = room4.getRoomNumber();
        java.lang.String str12 = room4.toString();
        boolean boolean13 = room4.isUnderMaintenance();
        room4.notifyObservers();
        java.lang.String str15 = room4.getFullLocation();
        java.lang.String str16 = room4.getRoomID();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str7, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str10, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str12, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi! - hi!" + "'", str15, "hi! - hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test26862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26862");
        room.Room room4 = new room.Room("Room  - hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Room Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! - hi! - hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: -1 - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! | Capacity: 100", (int) (short) 1, "Room hi! - hi! - Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | Room hi! | hi! - hi! | Capacity: 0 - hi! -  - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! | Capacity: -1", "Room  - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 100 | hi! - hi! - hi! - hi! | Capacity: 0 | Capacity: 0");
        java.lang.String str5 = room4.getBuildingName();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Room hi! - hi! - Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | Room hi! | hi! - hi! | Capacity: 0 - hi! -  - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! | Capacity: -1" + "'", str5, "Room hi! - hi! - Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | Room hi! | hi! - hi! | Capacity: 0 - hi! -  - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! | Capacity: -1");
    }

    @Test
    public void test26863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26863");
        room.Room room4 = new room.Room("", (int) (short) 10, "Room hi! | hi! - hi! | Capacity: 0", "hi!");
        java.lang.String str5 = room4.toString();
        java.lang.String str6 = room4.getBuildingName();
        boolean boolean7 = room4.isOccupied();
        room.SensorObserver sensorObserver8 = null;
        room4.removeObserver(sensorObserver8);
        java.lang.String str10 = room4.getScannedID();
        java.lang.String str11 = room4.getScannedID();
        room4.setScannedID("Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 | Room Room hi! | hi! - hi! | Capacity: 0 | Room hi! | hi! - hi! | Capacity: 0 - hi! - hi! | Capacity: 100 - hi! - hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 0");
        java.lang.String str14 = room4.getBuildingName();
        int int15 = room4.getCapacity();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10" + "'", str5, "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str6, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str14, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
    }

    @Test
    public void test26864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26864");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        room.SensorObserver sensorObserver5 = null;
        room4.addObserver(sensorObserver5);
        java.lang.String str7 = room4.getScannedID();
        java.lang.String str8 = room4.getRoomNumber();
        java.lang.String str9 = room4.getRoomNumber();
        room.SensorObserver sensorObserver10 = null;
        room4.removeObserver(sensorObserver10);
        room4.setOccupied(false);
        room4.setScannedID("Room  - Room hi! | hi! - hi! | Capacity: 0 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 0");
        room4.setOccupied(true);
        java.lang.String str18 = room4.getRoomID();
        java.lang.String str19 = room4.getRoomNumber();
        room4.setScannedID("Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! |  - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 100 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 52");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test26865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26865");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        java.lang.String str5 = room4.getScannedID();
        room4.setScannedID("hi!");
        room4.setUnderMaintenance(true);
        room4.setOccupied(true);
        java.lang.String str12 = room4.getRoomNumber();
        java.lang.String str13 = room4.getScannedID();
        int int14 = room4.getCapacity();
        room.SensorObserver sensorObserver15 = null;
        room4.removeObserver(sensorObserver15);
        java.lang.String str17 = room4.getScannedID();
        java.lang.String str18 = room4.getBuildingName();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test26866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26866");
        room.Room room4 = new room.Room("Room hi! | hi! - hi! | Capacity: 0 - hi! - hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10", (int) (short) 0, "Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 97 - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 100 - Room hi! | hi! - hi! | Capacity: 0 - hi! - ", "Room Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! |  - Room hi! | hi! - hi! | Capacity: 0 - Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: -1");
        java.lang.String str5 = room4.getScannedID();
        room4.setScannedID("Room Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Room Room hi! - hi! - hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 1 | Capacity: 0 | Room hi! -  | Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 10 -  | Capacity: 52 -  | Capacity: -1");
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test26867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26867");
        room.Room room4 = new room.Room("Room hi! - hi! |  - Room hi! | hi! - hi! | Capacity: 0 - Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 97 | Capacity: -1", (int) '4', "Room Room  - Room hi! | hi! - hi! | Capacity: 0 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 0 - hi! |  - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! - Room  - Room hi! | hi! - hi! | Capacity: 0 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 0 | Capacity: 10", "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 1 - Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100");
        boolean boolean5 = room4.isOccupied();
        room4.setEnabled(true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test26868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26868");
        room.Room room4 = new room.Room("hi!", (int) (byte) 100, "", "Room hi! | hi! - hi! | Capacity: 0");
        room4.setScannedID("");
        boolean boolean7 = room4.isOccupied();
        room4.setOccupied(true);
        boolean boolean10 = room4.isEnabled();
        boolean boolean11 = room4.isEnabled();
        java.lang.String str12 = room4.getBuildingName();
        room.SensorObserver sensorObserver13 = null;
        room4.removeObserver(sensorObserver13);
        room4.setEnabled(true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test26869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26869");
        room.Room room4 = new room.Room("Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 100 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: -1", (int) (byte) 0, "Room Room hi! | hi! - hi! | Capacity: 0 | Room hi! | hi! - hi! | Capacity: 0 - hi! - hi! | Capacity: 100", "");
        room4.setScannedID("Room hi! - hi! - Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | Room hi! | hi! - hi! | Capacity: 0 - hi! -  - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! | Capacity: -1");
        boolean boolean7 = room4.isOccupied();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test26870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26870");
        room.Room room4 = new room.Room("Room Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 97 | Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 100 | hi! - hi! - hi! - hi! | Capacity: 0 -  - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! | Capacity: 0", (int) (short) 1, "Room hi! | hi! - hi! | Capacity: 0", "Room hi! | hi! - hi! | Capacity: 0 - hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10");
        boolean boolean5 = room4.isOccupied();
        boolean boolean6 = room4.isOccupied();
        java.lang.String str7 = room4.getBuildingName();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str7, "Room hi! | hi! - hi! | Capacity: 0");
    }

    @Test
    public void test26871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26871");
        room.Room room4 = new room.Room("Room hi! | hi! - hi! | Capacity: 0", (int) (byte) 10, "hi!", "");
        int int5 = room4.getCapacity();
        java.lang.String str6 = room4.getScannedID();
        java.lang.String str7 = room4.getScannedID();
        room4.setEnabled(false);
        java.lang.String str10 = room4.getBuildingName();
        room.SensorObserver sensorObserver11 = null;
        room4.removeObserver(sensorObserver11);
        java.lang.String str13 = room4.toString();
        boolean boolean14 = room4.isEnabled();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10" + "'", str13, "Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test26872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26872");
        room.Room room4 = new room.Room("Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 | hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 0 - ", (-1), "Room Room hi! | hi! - hi! | Capacity: 0 | Room hi! | hi! - hi! | Capacity: 0 - hi! - hi! | Capacity: 100 - Room  - Room hi! | hi! - hi! | Capacity: 0 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 0", "");
    }

    @Test
    public void test26873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26873");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        java.lang.String str5 = room4.getBuildingName();
        java.lang.String str6 = room4.getRoomID();
        boolean boolean7 = room4.isOccupied();
        room4.setUnderMaintenance(false);
        room4.notifyObservers();
        java.lang.String str11 = room4.getRoomNumber();
        java.lang.String str12 = room4.getFullLocation();
        room.SensorObserver sensorObserver13 = null;
        room4.addObserver(sensorObserver13);
        java.lang.String str15 = room4.getBuildingName();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi! - hi!" + "'", str12, "hi! - hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test26874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26874");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        java.lang.String str5 = room4.getScannedID();
        room4.setScannedID("hi!");
        room4.setUnderMaintenance(true);
        boolean boolean10 = room4.isOccupied();
        java.lang.String str11 = room4.toString();
        boolean boolean12 = room4.isEnabled();
        room4.notifyObservers();
        room4.notifyObservers();
        room4.notifyObservers();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str11, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test26875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26875");
        room.Room room4 = new room.Room("Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 100", (int) (byte) 0, "Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100", "Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 100 | hi! - hi! - hi! - hi! | Capacity: 0");
        room4.setScannedID("Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! - hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 97 | Capacity: 32");
        room.SensorObserver sensorObserver7 = null;
        room4.removeObserver(sensorObserver7);
        room4.setEnabled(false);
        java.lang.String str11 = room4.getFullLocation();
        room4.setOccupied(false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 - Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 100 | hi! - hi! - hi! - hi! | Capacity: 0" + "'", str11, "Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 - Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 100 | hi! - hi! - hi! - hi! | Capacity: 0");
    }

    @Test
    public void test26876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26876");
        room.Room room4 = new room.Room("Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10", 0, "hi!", "Room hi! | hi! - hi! | Capacity: 0");
        room4.setScannedID("Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100");
        room4.notifyObservers();
        int int8 = room4.getCapacity();
        room4.setEnabled(true);
        java.lang.String str11 = room4.getFullLocation();
        room.SensorObserver sensorObserver12 = null;
        room4.addObserver(sensorObserver12);
        java.lang.String str14 = room4.getBuildingName();
        boolean boolean15 = room4.isEnabled();
        room.SensorObserver sensorObserver16 = null;
        room4.removeObserver(sensorObserver16);
        room4.setEnabled(false);
        boolean boolean20 = room4.isEnabled();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi! - Room hi! | hi! - hi! | Capacity: 0" + "'", str11, "hi! - Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test26877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26877");
        room.Room room4 = new room.Room("Room hi! | hi! - hi! | Capacity: 0", (int) (byte) 10, "hi!", "");
        int int5 = room4.getCapacity();
        room4.setOccupied(false);
        room4.setOccupied(false);
        boolean boolean10 = room4.isUnderMaintenance();
        room4.setOccupied(true);
        java.lang.String str13 = room4.getFullLocation();
        java.lang.String str14 = room4.getRoomNumber();
        boolean boolean15 = room4.isEnabled();
        java.lang.String str16 = room4.getFullLocation();
        room4.setScannedID("");
        java.lang.String str19 = room4.getScannedID();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi! - " + "'", str13, "hi! - ");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi! - " + "'", str16, "hi! - ");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test26878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26878");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        room.SensorObserver sensorObserver5 = null;
        room4.addObserver(sensorObserver5);
        java.lang.String str7 = room4.toString();
        room.SensorObserver sensorObserver8 = null;
        room4.removeObserver(sensorObserver8);
        int int10 = room4.getCapacity();
        java.lang.String str11 = room4.getRoomID();
        boolean boolean12 = room4.isEnabled();
        room4.setOccupied(false);
        boolean boolean15 = room4.isOccupied();
        boolean boolean16 = room4.isUnderMaintenance();
        room4.setScannedID("Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10");
        java.lang.String str19 = room4.toString();
        boolean boolean20 = room4.isOccupied();
        room4.setEnabled(true);
        java.lang.String str23 = room4.toString();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str7, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str19, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str23, "Room hi! | hi! - hi! | Capacity: 0");
    }

    @Test
    public void test26879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26879");
        room.Room room4 = new room.Room("Room hi! - hi! - hi! | hi! - hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 1 - Room Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! - hi! - hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: -1 - Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 | hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 0", (int) (short) 0, "Room  - Room hi! | hi! - hi! | Capacity: 0 |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 0 - Room Room hi! | hi! - hi! | Capacity: 0 | hi! - hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 97", "Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 | Room hi! | Room hi! | hi! - hi! | Capacity: 0 - hi! - Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 1 - Room  - Room hi! | hi! - hi! | Capacity: 0 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 0 | Capacity: 32");
        java.lang.String str5 = room4.getRoomNumber();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 | Room hi! | Room hi! | hi! - hi! | Capacity: 0 - hi! - Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 1 - Room  - Room hi! | hi! - hi! | Capacity: 0 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 0 | Capacity: 32" + "'", str5, "Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 | Room hi! | Room hi! | hi! - hi! | Capacity: 0 - hi! - Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 1 - Room  - Room hi! | hi! - hi! | Capacity: 0 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 0 | Capacity: 32");
    }

    @Test
    public void test26880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26880");
        room.Room room4 = new room.Room("hi!", (int) (byte) 100, "", "Room hi! | hi! - hi! | Capacity: 0");
        java.lang.String str5 = room4.getRoomNumber();
        boolean boolean6 = room4.isEnabled();
        boolean boolean7 = room4.isEnabled();
        room.SensorObserver sensorObserver8 = null;
        room4.addObserver(sensorObserver8);
        java.lang.String str10 = room4.getScannedID();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str5, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test26881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26881");
        room.Room room4 = new room.Room("Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 97", (int) ' ', "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - hi!", "Room Room hi! - hi! - hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 1 | Capacity: 0 | Room hi! -  | Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 10 -  | Capacity: 52");
        java.lang.String str5 = room4.getBuildingName();
        java.lang.String str6 = room4.getRoomNumber();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - hi!" + "'", str5, "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Room Room hi! - hi! - hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 1 | Capacity: 0 | Room hi! -  | Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 10 -  | Capacity: 52" + "'", str6, "Room Room hi! - hi! - hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 1 | Capacity: 0 | Room hi! -  | Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 10 -  | Capacity: 52");
    }

    @Test
    public void test26882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26882");
        room.Room room4 = new room.Room("Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi!", 10, "Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10", "hi!");
        java.lang.String str5 = room4.getScannedID();
        room4.setEnabled(false);
        java.lang.String str8 = room4.getFullLocation();
        int int9 = room4.getCapacity();
        java.lang.String str10 = room4.getRoomID();
        java.lang.String str11 = room4.toString();
        room4.notifyObservers();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi!" + "'", str8, "Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi!" + "'", str10, "Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Room Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! | Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! | Capacity: 10" + "'", str11, "Room Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! | Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! | Capacity: 10");
    }

    @Test
    public void test26883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26883");
        room.Room room4 = new room.Room(" - hi! - hi! - Room hi! | hi! - hi! | Capacity: 0", (int) (byte) -1, "Room  - Room hi! | hi! - hi! | Capacity: 0 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 0 - ", " - hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10");
        room.SensorObserver sensorObserver5 = null;
        room4.removeObserver(sensorObserver5);
    }

    @Test
    public void test26884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26884");
        room.Room room4 = new room.Room("Room Room Room hi! | hi! - hi! | Capacity: 0 | hi! - hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 97 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room  - Room hi! | hi! - hi! | Capacity: 0 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 0 | Capacity: 32", 0, "Room hi! - hi! | Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 10", "Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! -  - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10");
    }

    @Test
    public void test26885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26885");
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
        int int22 = room4.getCapacity();
        room4.setUnderMaintenance(false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str11, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi! - hi!" + "'", str14, "hi! - hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test26886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26886");
        room.Room room4 = new room.Room(" - Room hi! | hi! - hi! | Capacity: 0", 0, "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10", "Room hi! | hi! - hi! | Capacity: 0 - hi! - ");
        room4.setScannedID("Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 100 | hi! - hi! - hi! - hi! | Capacity: 0");
        boolean boolean7 = room4.isOccupied();
        room4.setScannedID("Room Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | Room hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 1 - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! | Capacity: 97 - Room Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! |  - Room hi! | hi! - hi! | Capacity: 0 - Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: -1 | Capacity: 100");
        room4.setOccupied(false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test26887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26887");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        java.lang.String str5 = room4.getScannedID();
        room4.setScannedID("hi!");
        boolean boolean8 = room4.isEnabled();
        int int9 = room4.getCapacity();
        int int10 = room4.getCapacity();
        boolean boolean11 = room4.isOccupied();
        boolean boolean12 = room4.isUnderMaintenance();
        int int13 = room4.getCapacity();
        int int14 = room4.getCapacity();
        java.lang.String str15 = room4.getBuildingName();
        boolean boolean16 = room4.isOccupied();
        room4.setUnderMaintenance(false);
        boolean boolean19 = room4.isOccupied();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test26888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26888");
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
        java.lang.String str16 = room4.getRoomNumber();
        room4.notifyObservers();
        java.lang.String str18 = room4.getFullLocation();
        room4.setUnderMaintenance(true);
        boolean boolean21 = room4.isEnabled();
        java.lang.String str22 = room4.toString();
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str11, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi! - hi!" + "'", str14, "hi! - hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi! - hi!" + "'", str18, "hi! - hi!");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str22, "Room hi! | hi! - hi! | Capacity: 0");
    }

    @Test
    public void test26889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26889");
        room.Room room4 = new room.Room("Room hi! - hi! - hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 1 | Capacity: 0 - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10", (int) (byte) 10, "hi! - hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10", "Room hi! - hi! - Room hi! | hi! - hi! | Capacity: 0 | Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 97 - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 100 | Capacity: 0");
        int int5 = room4.getCapacity();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
    }

    @Test
    public void test26890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26890");
        room.Room room4 = new room.Room("hi!", (int) (byte) 100, "", "Room hi! | hi! - hi! | Capacity: 0");
        room4.setScannedID("");
        boolean boolean7 = room4.isOccupied();
        room4.setOccupied(true);
        boolean boolean10 = room4.isEnabled();
        boolean boolean11 = room4.isEnabled();
        java.lang.String str12 = room4.getScannedID();
        java.lang.String str13 = room4.getFullLocation();
        room.SensorObserver sensorObserver14 = null;
        room4.removeObserver(sensorObserver14);
        java.lang.String str16 = room4.toString();
        room.SensorObserver sensorObserver17 = null;
        room4.addObserver(sensorObserver17);
        boolean boolean19 = room4.isEnabled();
        java.lang.String str20 = room4.getRoomNumber();
        java.lang.String str21 = room4.getRoomNumber();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + " - Room hi! | hi! - hi! | Capacity: 0" + "'", str13, " - Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100" + "'", str16, "Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str20, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str21, "Room hi! | hi! - hi! | Capacity: 0");
    }

    @Test
    public void test26891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26891");
        room.Room room4 = new room.Room("hi!", (int) (byte) 100, "", "Room hi! | hi! - hi! | Capacity: 0");
        room4.setScannedID("");
        boolean boolean7 = room4.isUnderMaintenance();
        room4.setUnderMaintenance(false);
        java.lang.String str10 = room4.getBuildingName();
        java.lang.String str11 = room4.toString();
        int int12 = room4.getCapacity();
        java.lang.String str13 = room4.getRoomID();
        room4.setScannedID("Room Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 97 | Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 100 | hi! - hi! - hi! - hi! | Capacity: 0 -  - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! | Capacity: 0");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100" + "'", str11, "Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test26892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26892");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        java.lang.String str5 = room4.getScannedID();
        room4.setScannedID("hi!");
        boolean boolean8 = room4.isEnabled();
        room.SensorObserver sensorObserver9 = null;
        room4.removeObserver(sensorObserver9);
        room.SensorObserver sensorObserver11 = null;
        room4.addObserver(sensorObserver11);
        int int13 = room4.getCapacity();
        room.SensorObserver sensorObserver14 = null;
        room4.removeObserver(sensorObserver14);
        room4.setScannedID("Room hi! | hi! - hi! - Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | Capacity: 0");
        java.lang.String str18 = room4.getBuildingName();
        java.lang.String str19 = room4.getScannedID();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Room hi! | hi! - hi! - Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | Capacity: 0" + "'", str19, "Room hi! | hi! - hi! - Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | Capacity: 0");
    }

    @Test
    public void test26893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26893");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        boolean boolean5 = room4.isOccupied();
        room4.setEnabled(false);
        java.lang.String str8 = room4.getFullLocation();
        room4.setOccupied(false);
        room4.setEnabled(true);
        room.SensorObserver sensorObserver13 = null;
        room4.addObserver(sensorObserver13);
        java.lang.String str15 = room4.getBuildingName();
        java.lang.String str16 = room4.getScannedID();
        java.lang.String str17 = room4.getScannedID();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi! - hi!" + "'", str8, "hi! - hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test26894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26894");
        room.Room room4 = new room.Room("", (int) (byte) 100, "Room hi! | hi! - hi! | Capacity: 0 - hi!", "");
        boolean boolean5 = room4.isEnabled();
        room4.setScannedID("hi! - hi!");
        boolean boolean8 = room4.isOccupied();
        boolean boolean9 = room4.isUnderMaintenance();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test26895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26895");
        room.Room room4 = new room.Room("Room Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - hi! | Capacity: 1 | Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 | hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 0 - hi! - hi! - Room hi! | hi! - hi! | Capacity: 0 -  - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! | Capacity: 35", 35, "Room Room hi! | hi! - hi! | Capacity: 0 | hi! - hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 97", "Room hi! | hi! - hi! | Capacity: 0 - hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10");
        room4.setEnabled(true);
    }

    @Test
    public void test26896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26896");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        java.lang.String str5 = room4.getScannedID();
        room4.setScannedID("hi!");
        boolean boolean8 = room4.isEnabled();
        room4.setEnabled(false);
        room4.setScannedID("Room hi! | hi! - hi! | Capacity: 0 - hi! - ");
        java.lang.String str13 = room4.getBuildingName();
        java.lang.String str14 = room4.getRoomID();
        java.lang.String str15 = room4.getRoomID();
        java.lang.String str16 = room4.getScannedID();
        room4.setOccupied(false);
        boolean boolean19 = room4.isEnabled();
        int int20 = room4.getCapacity();
        java.lang.String str21 = room4.toString();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0 - hi! - " + "'", str16, "Room hi! | hi! - hi! | Capacity: 0 - hi! - ");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str21, "Room hi! | hi! - hi! | Capacity: 0");
    }

    @Test
    public void test26897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26897");
        room.Room room4 = new room.Room("Room  - Room hi! | hi! - hi! | Capacity: 0 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 0 - ", 32, "Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10", "hi!");
        java.lang.String str5 = room4.getFullLocation();
        java.lang.String str6 = room4.toString();
        room.SensorObserver sensorObserver7 = null;
        room4.addObserver(sensorObserver7);
        boolean boolean9 = room4.isUnderMaintenance();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi!" + "'", str5, "Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Room Room  - Room hi! | hi! - hi! | Capacity: 0 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 0 -  | Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! | Capacity: 32" + "'", str6, "Room Room  - Room hi! | hi! - hi! | Capacity: 0 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 0 -  | Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! | Capacity: 32");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test26898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26898");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        java.lang.String str5 = room4.getScannedID();
        room4.setScannedID("hi!");
        room4.setUnderMaintenance(true);
        java.lang.String str10 = room4.getScannedID();
        java.lang.String str11 = room4.getBuildingName();
        java.lang.String str12 = room4.toString();
        java.lang.String str13 = room4.getRoomNumber();
        room.SensorObserver sensorObserver14 = null;
        room4.addObserver(sensorObserver14);
        java.lang.String str16 = room4.toString();
        // The following exception was thrown during execution in test generation
        try {
            room4.setOccupied(true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str12, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str16, "Room hi! | hi! - hi! | Capacity: 0");
    }

    @Test
    public void test26899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26899");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        java.lang.String str5 = room4.getScannedID();
        room4.setScannedID("hi!");
        boolean boolean8 = room4.isEnabled();
        int int9 = room4.getCapacity();
        boolean boolean10 = room4.isOccupied();
        java.lang.String str11 = room4.getFullLocation();
        room4.setScannedID("Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi!");
        boolean boolean14 = room4.isEnabled();
        boolean boolean15 = room4.isOccupied();
        room4.setOccupied(false);
        java.lang.String str18 = room4.toString();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi! - hi!" + "'", str11, "hi! - hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str18, "Room hi! | hi! - hi! | Capacity: 0");
    }

    @Test
    public void test26900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26900");
        room.Room room4 = new room.Room("hi!", (-1), "Room Room hi! | hi! - hi! | Capacity: 0 | Room hi! | hi! - hi! | Capacity: 0 - hi! - hi! | Capacity: 100 - Room  - Room hi! | hi! - hi! | Capacity: 0 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 0", "");
        room4.setEnabled(true);
        room4.setEnabled(false);
        java.lang.Class<?> wildcardClass9 = room4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test26901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26901");
        room.Room room4 = new room.Room("", 10, "Room hi! | hi! - hi! | Capacity: 0 - hi!", "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 100 - Room hi! | hi! - hi! | Capacity: 0 - hi! - ");
        boolean boolean5 = room4.isEnabled();
        boolean boolean6 = room4.isEnabled();
        room4.setUnderMaintenance(false);
        room4.notifyObservers();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test26902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26902");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        java.lang.String str5 = room4.getScannedID();
        room4.setScannedID("hi!");
        boolean boolean8 = room4.isEnabled();
        int int9 = room4.getCapacity();
        boolean boolean10 = room4.isOccupied();
        room4.notifyObservers();
        int int12 = room4.getCapacity();
        int int13 = room4.getCapacity();
        boolean boolean14 = room4.isUnderMaintenance();
        java.lang.String str15 = room4.getFullLocation();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi! - hi!" + "'", str15, "hi! - hi!");
    }

    @Test
    public void test26903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26903");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        room.SensorObserver sensorObserver5 = null;
        room4.addObserver(sensorObserver5);
        java.lang.String str7 = room4.getScannedID();
        java.lang.String str8 = room4.getFullLocation();
        boolean boolean9 = room4.isOccupied();
        boolean boolean10 = room4.isOccupied();
        java.lang.String str11 = room4.getBuildingName();
        java.lang.String str12 = room4.getRoomID();
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
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test26904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26904");
        room.Room room4 = new room.Room("Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10", (int) '4', "hi! - Room hi! | hi! - hi! | Capacity: 0", "Room  - Room hi! | hi! - hi! | Capacity: 0 |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 0");
        java.lang.String str5 = room4.getBuildingName();
        boolean boolean6 = room4.isEnabled();
        room.SensorObserver sensorObserver7 = null;
        room4.removeObserver(sensorObserver7);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi! - Room hi! | hi! - hi! | Capacity: 0" + "'", str5, "hi! - Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test26905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26905");
        room.Room room4 = new room.Room("hi! - hi! - hi!", (int) (short) 0, "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10", "Room hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 1");
        java.lang.String str5 = room4.toString();
        java.lang.String str6 = room4.getBuildingName();
        java.lang.String str7 = room4.getRoomNumber();
        room4.setUnderMaintenance(false);
        room.SensorObserver sensorObserver10 = null;
        room4.addObserver(sensorObserver10);
        // The following exception was thrown during execution in test generation
        try {
            room4.setUnderMaintenance(false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Room hi! - hi! - hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 1 | Capacity: 0" + "'", str5, "Room hi! - hi! - hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 1 | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10" + "'", str6, "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Room hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 1" + "'", str7, "Room hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 1");
    }

    @Test
    public void test26906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26906");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        room.SensorObserver sensorObserver5 = null;
        room4.addObserver(sensorObserver5);
        java.lang.String str7 = room4.toString();
        room.SensorObserver sensorObserver8 = null;
        room4.removeObserver(sensorObserver8);
        java.lang.String str10 = room4.toString();
        java.lang.String str11 = room4.getBuildingName();
        room4.setUnderMaintenance(false);
        java.lang.String str14 = room4.getFullLocation();
        java.lang.String str15 = room4.toString();
        java.lang.String str16 = room4.toString();
        java.lang.String str17 = room4.getRoomID();
        java.lang.String str18 = room4.getRoomNumber();
        boolean boolean19 = room4.isEnabled();
        room4.setOccupied(false);
        java.lang.String str22 = room4.getScannedID();
        java.lang.String str23 = room4.getScannedID();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str7, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str10, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi! - hi!" + "'", str14, "hi! - hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str15, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str16, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(str23);
    }

    @Test
    public void test26907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26907");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        java.lang.String str5 = room4.toString();
        java.lang.String str6 = room4.getScannedID();
        room4.notifyObservers();
        room4.notifyObservers();
        boolean boolean9 = room4.isOccupied();
        room4.setEnabled(true);
        room4.setEnabled(false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str5, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test26908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26908");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        java.lang.String str5 = room4.getScannedID();
        room4.setScannedID("hi!");
        room4.setUnderMaintenance(true);
        java.lang.String str10 = room4.getScannedID();
        int int11 = room4.getCapacity();
        java.lang.String str12 = room4.getBuildingName();
        room4.setEnabled(false);
        java.lang.String str15 = room4.getRoomID();
        java.lang.Class<?> wildcardClass16 = room4.getClass();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test26909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26909");
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
        room4.setOccupied(false);
        room4.notifyObservers();
        room.SensorObserver sensorObserver18 = null;
        room4.removeObserver(sensorObserver18);
        room4.setOccupied(false);
        java.lang.String str22 = room4.getRoomNumber();
        boolean boolean23 = room4.isUnderMaintenance();
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str11, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test26910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26910");
        room.Room room4 = new room.Room("", (int) (short) 10, "Room hi! | hi! - hi! | Capacity: 0", "hi!");
        java.lang.String str5 = room4.toString();
        room4.setUnderMaintenance(true);
        room4.setScannedID("");
        room4.setEnabled(true);
        java.lang.String str12 = room4.getRoomID();
        java.lang.String str13 = room4.getScannedID();
        room.SensorObserver sensorObserver14 = null;
        room4.removeObserver(sensorObserver14);
        boolean boolean16 = room4.isOccupied();
        boolean boolean17 = room4.isOccupied();
        java.lang.String str18 = room4.getScannedID();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10" + "'", str5, "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test26911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26911");
        room.Room room4 = new room.Room("hi! - hi! - Room hi! | hi! - hi! | Capacity: 0", 10, "hi! - hi!", "Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 97");
        room4.setScannedID("Room hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 1");
        boolean boolean7 = room4.isUnderMaintenance();
        room.SensorObserver sensorObserver8 = null;
        room4.removeObserver(sensorObserver8);
        room4.setOccupied(true);
        java.lang.String str12 = room4.toString();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Room hi! - hi! - Room hi! | hi! - hi! | Capacity: 0 | hi! - hi! - Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 97 | Capacity: 10" + "'", str12, "Room hi! - hi! - Room hi! | hi! - hi! | Capacity: 0 | hi! - hi! - Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 97 | Capacity: 10");
    }

    @Test
    public void test26912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26912");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        java.lang.String str5 = room4.getScannedID();
        room4.setScannedID("hi!");
        room4.setUnderMaintenance(true);
        java.lang.String str10 = room4.getFullLocation();
        java.lang.String str11 = room4.getScannedID();
        java.lang.String str12 = room4.getScannedID();
        room4.setEnabled(false);
        java.lang.String str15 = room4.getScannedID();
        java.lang.String str16 = room4.getRoomNumber();
        boolean boolean17 = room4.isEnabled();
        room4.setUnderMaintenance(false);
        int int20 = room4.getCapacity();
        java.lang.Class<?> wildcardClass21 = room4.getClass();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi! - hi!" + "'", str10, "hi! - hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test26913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26913");
        room.Room room4 = new room.Room("hi!", (int) (byte) 100, "", "Room hi! | hi! - hi! | Capacity: 0");
        java.lang.String str5 = room4.getScannedID();
        java.lang.String str6 = room4.toString();
        boolean boolean7 = room4.isEnabled();
        java.lang.String str8 = room4.getRoomID();
        java.lang.String str9 = room4.getScannedID();
        room4.setUnderMaintenance(true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100" + "'", str6, "Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test26914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26914");
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
        room4.removeObserver(sensorObserver18);
        java.lang.String str20 = room4.getBuildingName();
        room4.setEnabled(true);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str11, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str17, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test26915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26915");
        room.Room room4 = new room.Room("Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10", (int) (short) 100, "Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 | Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 - hi! -  | Capacity: 10", "hi! - hi! - hi!");
        java.lang.String str5 = room4.getScannedID();
        room4.setOccupied(true);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test26916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26916");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        java.lang.String str5 = room4.getScannedID();
        room4.setScannedID("hi!");
        room4.setUnderMaintenance(true);
        room4.setOccupied(true);
        boolean boolean12 = room4.isEnabled();
        java.lang.String str13 = room4.toString();
        room4.notifyObservers();
        room4.setEnabled(false);
        room4.setOccupied(false);
        java.lang.String str19 = room4.getBuildingName();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str13, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test26917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26917");
        room.Room room4 = new room.Room("hi!", (int) (byte) 1, "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10", "hi!");
        room4.notifyObservers();
        room4.setUnderMaintenance(false);
        java.lang.String str8 = room4.toString();
        room4.notifyObservers();
        boolean boolean10 = room4.isUnderMaintenance();
        room4.setEnabled(true);
        java.lang.String str13 = room4.getFullLocation();
        java.lang.String str14 = room4.getRoomNumber();
        java.lang.String str15 = room4.getScannedID();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Room hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 1" + "'", str8, "Room hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 1");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi!" + "'", str13, "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test26918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26918");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        boolean boolean5 = room4.isOccupied();
        room4.setEnabled(false);
        java.lang.String str8 = room4.getFullLocation();
        room4.setOccupied(false);
        java.lang.String str11 = room4.getFullLocation();
        int int12 = room4.getCapacity();
        room4.setOccupied(true);
        java.lang.String str15 = room4.getScannedID();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi! - hi!" + "'", str8, "hi! - hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi! - hi!" + "'", str11, "hi! - hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test26919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26919");
        room.Room room4 = new room.Room("hi! - hi! - Room hi! | hi! - hi! | Capacity: 0", 0, "Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 97", "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 100");
        java.lang.String str5 = room4.getScannedID();
        boolean boolean6 = room4.isOccupied();
        room4.notifyObservers();
        int int8 = room4.getCapacity();
        java.lang.Class<?> wildcardClass9 = room4.getClass();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test26920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26920");
        room.Room room4 = new room.Room("Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100", (int) 'a', "hi! - hi!", "Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10");
        java.lang.String str5 = room4.toString();
        room4.setScannedID("Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi!");
        room4.setUnderMaintenance(true);
        room4.notifyObservers();
        room4.setScannedID("");
        boolean boolean13 = room4.isEnabled();
        room.SensorObserver sensorObserver14 = null;
        room4.removeObserver(sensorObserver14);
        room4.setOccupied(true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 97" + "'", str5, "Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 97");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test26921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26921");
        room.Room room4 = new room.Room("Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100", (int) 'a', "hi! - hi!", "Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10");
        int int5 = room4.getCapacity();
        room4.setScannedID("");
        java.lang.String str8 = room4.toString();
        room4.setEnabled(false);
        boolean boolean11 = room4.isUnderMaintenance();
        java.lang.Class<?> wildcardClass12 = room4.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 97" + "'", str8, "Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 97");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test26922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26922");
        room.Room room4 = new room.Room("Room hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 100 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Room Room hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 1 | Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! - Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: -1 - Room  - Room hi! | hi! - hi! | Capacity: 0 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 0 -  | Capacity: 35", (int) (byte) 1, "Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! - hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 97 | Capacity: 32 |  - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! - Room hi! | Room hi! | hi! - hi! | Capacity: 0 - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 32 | Capacity: -1", " - Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | hi! - hi! - hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 0");
        int int5 = room4.getCapacity();
        java.lang.String str6 = room4.getFullLocation();
        int int7 = room4.getCapacity();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! - hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 97 | Capacity: 32 |  - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! - Room hi! | Room hi! | hi! - hi! | Capacity: 0 - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 32 | Capacity: -1 -  - Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | hi! - hi! - hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 0" + "'", str6, "Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! - hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 97 | Capacity: 32 |  - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! - Room hi! | Room hi! | hi! - hi! | Capacity: 0 - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 32 | Capacity: -1 -  - Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | hi! - hi! - hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 0");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test26923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26923");
        room.Room room4 = new room.Room("hi!", (int) (byte) 100, "", "Room hi! | hi! - hi! | Capacity: 0");
        java.lang.String str5 = room4.toString();
        java.lang.String str6 = room4.getScannedID();
        room4.notifyObservers();
        room.SensorObserver sensorObserver8 = null;
        room4.removeObserver(sensorObserver8);
        boolean boolean10 = room4.isOccupied();
        boolean boolean11 = room4.isUnderMaintenance();
        java.lang.String str12 = room4.getRoomID();
        room4.setEnabled(false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100" + "'", str5, "Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test26924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26924");
        room.Room room4 = new room.Room("Room  - Room hi! | hi! - hi! | Capacity: 0 | Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 97 - hi! - hi! | Capacity: 32", 1, "Room hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 32", "Room Room hi! | Room hi! | hi! - hi! | Capacity: 0 - hi! - Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 1 | Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 97 - Room  - Room hi! | hi! - hi! | Capacity: 0 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 0 | Capacity: 10");
    }

    @Test
    public void test26925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26925");
        room.Room room4 = new room.Room("", 35, "hi! - hi! - Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 97 - Room Room hi! | hi! - hi! | Capacity: 0 - hi! - hi! |  - Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | hi! - hi! - hi! | Capacity: 0 | Capacity: 52", "Room Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 | Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 - hi! -  | Capacity: 10 |  - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! - Room hi! | hi! - hi! | Capacity: 0 - hi! - Room hi! | hi! - hi! | Capacity: 0 - hi! - hi! - hi! - Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | Capacity: 97");
        room4.notifyObservers();
    }

    @Test
    public void test26926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26926");
        room.Room room4 = new room.Room("", (int) (byte) 1, "Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10", "hi!");
        java.lang.String str5 = room4.getFullLocation();
        java.lang.String str6 = room4.getRoomNumber();
        room4.setEnabled(true);
        java.lang.String str9 = room4.getScannedID();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi!" + "'", str5, "Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test26927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26927");
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
        room.SensorObserver sensorObserver17 = null;
        room4.addObserver(sensorObserver17);
        java.lang.String str19 = room4.getRoomID();
        room.SensorObserver sensorObserver20 = null;
        room4.removeObserver(sensorObserver20);
        boolean boolean22 = room4.isOccupied();
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str11, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test26928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26928");
        room.Room room4 = new room.Room("Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! - ", (-1), "Room  | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 100 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 1", "Room Room hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 1 | Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! - Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: -1");
        room4.notifyObservers();
        boolean boolean6 = room4.isUnderMaintenance();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test26929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26929");
        room.Room room4 = new room.Room("hi! - hi! - Room hi! | hi! - hi! | Capacity: 0", (int) (short) 1, "hi! - hi! - Room hi! | hi! - hi! | Capacity: 0", "hi! - ");
        java.lang.String str5 = room4.getRoomNumber();
        room4.notifyObservers();
        room4.setScannedID("Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi! - " + "'", str5, "hi! - ");
    }

    @Test
    public void test26930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26930");
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
        room.SensorObserver sensorObserver19 = null;
        room4.addObserver(sensorObserver19);
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
    public void test26931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26931");
        room.Room room4 = new room.Room("Room hi! | hi! - hi! | Capacity: 0", (int) (byte) 10, "hi!", "");
        java.lang.String str5 = room4.getRoomNumber();
        int int6 = room4.getCapacity();
        room.SensorObserver sensorObserver7 = null;
        room4.removeObserver(sensorObserver7);
        room.SensorObserver sensorObserver9 = null;
        room4.addObserver(sensorObserver9);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
    }

    @Test
    public void test26932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26932");
        room.Room room4 = new room.Room("", (int) (byte) 100, "Room hi! | hi! - hi! | Capacity: 0 - hi!", "");
        boolean boolean5 = room4.isEnabled();
        java.lang.String str6 = room4.getScannedID();
        room4.setEnabled(false);
        java.lang.String str9 = room4.getRoomNumber();
        java.lang.String str10 = room4.toString();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 100" + "'", str10, "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 100");
    }

    @Test
    public void test26933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26933");
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
        boolean boolean16 = room4.isEnabled();
        room4.notifyObservers();
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str11, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test26934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26934");
        room.Room room4 = new room.Room("Room Room  - Room hi! | hi! - hi! | Capacity: 0 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 0 | Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 - Room hi! | Room hi! | hi! - hi! | Capacity: 0 - hi! - Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 1 | Capacity: -1", (int) (short) 100, "Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 100 | hi! - hi! - hi! - hi! | Capacity: 0", "hi! - Room hi! | hi! - hi! | Capacity: 0");
        java.lang.String str5 = room4.getRoomNumber();
        int int6 = room4.getCapacity();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi! - Room hi! | hi! - hi! | Capacity: 0" + "'", str5, "hi! - Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
    }

    @Test
    public void test26935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26935");
        room.Room room4 = new room.Room("Room hi! | hi! - hi! | Capacity: 0", (int) (short) 0, "hi! - ", "Room hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 1");
        java.lang.String str5 = room4.getScannedID();
        room4.notifyObservers();
        room4.notifyObservers();
        java.lang.String str8 = room4.getBuildingName();
        boolean boolean9 = room4.isEnabled();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi! - " + "'", str8, "hi! - ");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test26936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26936");
        room.Room room4 = new room.Room("Room Room  - Room hi! | hi! - hi! | Capacity: 0 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 0 | hi! - hi! - Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 -  - hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 0", 0, "hi! -  - Room  - Room hi! | hi! - hi! | Capacity: 0 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 0", "Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi!");
        room4.setUnderMaintenance(false);
    }

    @Test
    public void test26937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26937");
        room.Room room4 = new room.Room("Room  - Room hi! | hi! - hi! | Capacity: 0 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 0", (-1), "Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100", "Room hi! | Room hi! | hi! - hi! | Capacity: 0 - hi! - Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 1");
        room4.notifyObservers();
        int int6 = room4.getCapacity();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test26938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26938");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        java.lang.String str5 = room4.getScannedID();
        room4.setScannedID("hi!");
        room4.setUnderMaintenance(true);
        java.lang.String str10 = room4.getScannedID();
        room4.setEnabled(false);
        boolean boolean13 = room4.isUnderMaintenance();
        boolean boolean14 = room4.isUnderMaintenance();
        int int15 = room4.getCapacity();
        boolean boolean16 = room4.isEnabled();
        room4.setScannedID("Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 1");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test26939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26939");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        java.lang.String str5 = room4.getScannedID();
        room4.setScannedID("hi!");
        java.lang.String str8 = room4.getRoomID();
        room4.setUnderMaintenance(false);
        int int11 = room4.getCapacity();
        java.lang.String str12 = room4.getRoomNumber();
        int int13 = room4.getCapacity();
        boolean boolean14 = room4.isOccupied();
        java.lang.String str15 = room4.getFullLocation();
        room4.setScannedID("Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 |  - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 35");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi! - hi!" + "'", str15, "hi! - hi!");
    }

    @Test
    public void test26940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26940");
        room.Room room4 = new room.Room(" - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10", (int) 'a', "Room Room  - Room hi! | hi! - hi! | Capacity: 0 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 0 -  | Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! | Capacity: 32", "Room Room hi! | hi! - hi! | Capacity: 0 - hi! | Room Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! - hi! - hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: -1 - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 | Capacity: 10 - Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | hi! - hi! - hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 0");
        room4.setOccupied(false);
    }

    @Test
    public void test26941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26941");
        room.Room room4 = new room.Room(" - Room hi! | hi! - hi! | Capacity: 0", 0, "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10", "Room hi! | hi! - hi! | Capacity: 0 - hi! - ");
        java.lang.String str5 = room4.toString();
        boolean boolean6 = room4.isOccupied();
        java.lang.String str7 = room4.getScannedID();
        java.lang.String str8 = room4.getFullLocation();
        room.SensorObserver sensorObserver9 = null;
        room4.addObserver(sensorObserver9);
        // The following exception was thrown during execution in test generation
        try {
            room4.setEnabled(false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Room  - Room hi! | hi! - hi! | Capacity: 0 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 0" + "'", str5, "Room  - Room hi! | hi! - hi! | Capacity: 0 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 0");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | hi! - hi! | Capacity: 0 - hi! - " + "'", str8, "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | hi! - hi! | Capacity: 0 - hi! - ");
    }

    @Test
    public void test26942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26942");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        java.lang.String str5 = room4.getBuildingName();
        java.lang.String str6 = room4.getRoomID();
        room4.setUnderMaintenance(false);
        int int9 = room4.getCapacity();
        room.SensorObserver sensorObserver10 = null;
        room4.removeObserver(sensorObserver10);
        boolean boolean12 = room4.isOccupied();
        java.lang.String str13 = room4.getBuildingName();
        room4.notifyObservers();
        room4.setUnderMaintenance(false);
        java.lang.String str17 = room4.getRoomID();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test26943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26943");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        java.lang.String str5 = room4.getScannedID();
        room4.setScannedID("hi!");
        room4.setScannedID("hi! - hi!");
        int int10 = room4.getCapacity();
        boolean boolean11 = room4.isOccupied();
        java.lang.String str12 = room4.toString();
        room4.setUnderMaintenance(false);
        boolean boolean15 = room4.isEnabled();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str12, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test26944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26944");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        java.lang.String str5 = room4.getScannedID();
        room4.setScannedID("hi!");
        boolean boolean8 = room4.isEnabled();
        int int9 = room4.getCapacity();
        int int10 = room4.getCapacity();
        room.SensorObserver sensorObserver11 = null;
        room4.addObserver(sensorObserver11);
        room.SensorObserver sensorObserver13 = null;
        room4.removeObserver(sensorObserver13);
        java.lang.String str15 = room4.getFullLocation();
        room4.setUnderMaintenance(false);
        java.lang.String str18 = room4.getBuildingName();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi! - hi!" + "'", str15, "hi! - hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test26945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26945");
        room.Room room4 = new room.Room("hi!", (int) (byte) 100, "", "Room hi! | hi! - hi! | Capacity: 0");
        java.lang.String str5 = room4.getRoomNumber();
        room4.notifyObservers();
        java.lang.String str7 = room4.getBuildingName();
        boolean boolean8 = room4.isEnabled();
        room4.setEnabled(false);
        boolean boolean11 = room4.isOccupied();
        room4.setOccupied(true);
        java.lang.String str14 = room4.getScannedID();
        int int15 = room4.getCapacity();
        room4.setOccupied(true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str5, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
    }

    @Test
    public void test26946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26946");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        java.lang.String str5 = room4.getBuildingName();
        java.lang.String str6 = room4.getRoomID();
        java.lang.String str7 = room4.getScannedID();
        room4.setEnabled(false);
        room4.setOccupied(true);
        room4.setScannedID("Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 97");
        room4.notifyObservers();
        boolean boolean15 = room4.isOccupied();
        room4.setEnabled(true);
        java.lang.String str18 = room4.toString();
        java.lang.String str19 = room4.getBuildingName();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str18, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test26947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26947");
        room.Room room4 = new room.Room("Room hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 1 - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room hi! | hi! - hi! | Capacity: 0", (int) (byte) -1, "Room hi! | Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 35", "Room Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 | hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 0 - hi! - hi! - Room hi! | hi! - hi! | Capacity: 0 -  - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! | Room Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 1 - Room hi! | hi! - hi! | Capacity: 0 - hi! |  -  | Capacity: 35 - Room Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 100 | Capacity: 32");
        java.lang.String str5 = room4.getScannedID();
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test26948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26948");
        room.Room room4 = new room.Room("Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100", (int) '#', "", "Room hi! | hi! - hi! | Capacity: 0 - hi! - ");
        int int5 = room4.getCapacity();
        java.lang.String str6 = room4.getRoomNumber();
        room4.setOccupied(true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0 - hi! - " + "'", str6, "Room hi! | hi! - hi! | Capacity: 0 - hi! - ");
    }

    @Test
    public void test26949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26949");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        java.lang.String str5 = room4.getScannedID();
        room4.setScannedID("hi!");
        room4.setUnderMaintenance(true);
        room4.setOccupied(true);
        room4.setOccupied(false);
        room4.notifyObservers();
        boolean boolean15 = room4.isUnderMaintenance();
        boolean boolean16 = room4.isUnderMaintenance();
        room4.setEnabled(false);
        boolean boolean19 = room4.isEnabled();
        java.lang.String str20 = room4.toString();
        room4.setOccupied(true);
        java.lang.String str23 = room4.getRoomNumber();
        java.lang.String str24 = room4.getRoomNumber();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str20, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
    }

    @Test
    public void test26950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26950");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        java.lang.String str5 = room4.getScannedID();
        room4.setScannedID("hi!");
        java.lang.String str8 = room4.getBuildingName();
        room4.setEnabled(false);
        room4.setUnderMaintenance(false);
        boolean boolean13 = room4.isOccupied();
        java.lang.String str14 = room4.toString();
        java.lang.String str15 = room4.getRoomID();
        room4.setEnabled(true);
        room4.setScannedID("Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 100 - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi!");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str14, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test26951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26951");
        room.Room room4 = new room.Room("Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | Room hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 1 - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! | Capacity: 97", 97, "Room  - Room hi! | hi! - hi! | Capacity: 0 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 0", "");
        java.lang.String str5 = room4.getFullLocation();
        room4.setScannedID("Room Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 1 - Room hi! | hi! - hi! | Capacity: 0 - hi! |  -  | Capacity: 35");
        int int8 = room4.getCapacity();
        boolean boolean9 = room4.isEnabled();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Room  - Room hi! | hi! - hi! | Capacity: 0 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 0 - " + "'", str5, "Room  - Room hi! | hi! - hi! | Capacity: 0 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 0 - ");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test26952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26952");
        room.Room room4 = new room.Room("Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 100 - Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - hi! | Capacity: 1", 0, "Room Room  - Room hi! | hi! - hi! | Capacity: 0 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 0 | Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 | Capacity: 97", "Room Room Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 97 | Room hi! | hi! - hi! | Capacity: 0 - hi! - hi! - Room hi! | Room hi! | hi! - hi! | Capacity: 0 - hi! - Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 1 | Capacity: 1 | Room hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 1 -  | Capacity: 52");
    }

    @Test
    public void test26953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26953");
        room.Room room4 = new room.Room("hi!", (int) (byte) 100, "", "Room hi! | hi! - hi! | Capacity: 0");
        room4.setScannedID("");
        boolean boolean7 = room4.isOccupied();
        room4.setOccupied(true);
        room.SensorObserver sensorObserver10 = null;
        room4.removeObserver(sensorObserver10);
        room4.setEnabled(false);
        room4.setUnderMaintenance(false);
        java.lang.String str16 = room4.getRoomID();
        java.lang.String str17 = room4.getRoomNumber();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str17, "Room hi! | hi! - hi! | Capacity: 0");
    }

    @Test
    public void test26954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26954");
        room.Room room4 = new room.Room("", (int) (short) 10, "Room hi! | hi! - hi! | Capacity: 0", "hi!");
        java.lang.String str5 = room4.toString();
        boolean boolean6 = room4.isEnabled();
        java.lang.String str7 = room4.toString();
        room4.setOccupied(true);
        room.SensorObserver sensorObserver10 = null;
        room4.addObserver(sensorObserver10);
        java.lang.String str12 = room4.getScannedID();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10" + "'", str5, "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10" + "'", str7, "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10");
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test26955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26955");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        room.SensorObserver sensorObserver5 = null;
        room4.addObserver(sensorObserver5);
        java.lang.String str7 = room4.getFullLocation();
        boolean boolean8 = room4.isUnderMaintenance();
        java.lang.String str9 = room4.getRoomID();
        boolean boolean10 = room4.isOccupied();
        room.SensorObserver sensorObserver11 = null;
        room4.addObserver(sensorObserver11);
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
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test26956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26956");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        boolean boolean5 = room4.isOccupied();
        java.lang.String str6 = room4.toString();
        java.lang.String str7 = room4.toString();
        java.lang.String str8 = room4.toString();
        boolean boolean9 = room4.isUnderMaintenance();
        room4.setEnabled(false);
        java.lang.String str12 = room4.getFullLocation();
        room.SensorObserver sensorObserver13 = null;
        room4.addObserver(sensorObserver13);
        java.lang.String str15 = room4.getRoomID();
        room.SensorObserver sensorObserver16 = null;
        room4.addObserver(sensorObserver16);
        // The following exception was thrown during execution in test generation
        try {
            room4.setUnderMaintenance(true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str6, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str7, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str8, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi! - hi!" + "'", str12, "hi! - hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test26957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26957");
        room.Room room4 = new room.Room("Room hi! | hi! - hi! | Capacity: 0", (int) (byte) 100, "Room hi! | hi! - hi! | Capacity: 0 - hi!", "hi!");
        java.lang.String str5 = room4.getRoomID();
        room4.setScannedID("hi! - hi!");
        java.lang.String str8 = room4.toString();
        room4.setOccupied(true);
        boolean boolean11 = room4.isUnderMaintenance();
        java.lang.String str12 = room4.toString();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str5, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Room Room hi! | hi! - hi! | Capacity: 0 | Room hi! | hi! - hi! | Capacity: 0 - hi! - hi! | Capacity: 100" + "'", str8, "Room Room hi! | hi! - hi! | Capacity: 0 | Room hi! | hi! - hi! | Capacity: 0 - hi! - hi! | Capacity: 100");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Room Room hi! | hi! - hi! | Capacity: 0 | Room hi! | hi! - hi! | Capacity: 0 - hi! - hi! | Capacity: 100" + "'", str12, "Room Room hi! | hi! - hi! | Capacity: 0 | Room hi! | hi! - hi! | Capacity: 0 - hi! - hi! | Capacity: 100");
    }

    @Test
    public void test26958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26958");
        room.Room room4 = new room.Room("Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 100 - Room hi! | hi! - hi! | Capacity: 0 - hi! - ", (int) (short) 0, "Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi!", "hi! - hi! - Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100");
        boolean boolean5 = room4.isUnderMaintenance();
        boolean boolean6 = room4.isOccupied();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test26959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26959");
        room.Room room4 = new room.Room("Room Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 97 | Room hi! | hi! - hi! | Capacity: 0 - hi! - hi! - Room hi! | Room hi! | hi! - hi! | Capacity: 0 - hi! - Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 1 | Capacity: 1", (int) (byte) 100, "Room hi! | hi! - hi! | Capacity: 0 - hi! - hi! - Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | hi! -  - Room  - Room hi! | hi! - hi! | Capacity: 0 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 0 | Capacity: 10", "Room hi! | hi! - Room hi! | hi! - hi! | Capacity: 0 - Room hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 1 - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! | Capacity: 1");
        java.lang.String str5 = room4.getRoomID();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Room Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 97 | Room hi! | hi! - hi! | Capacity: 0 - hi! - hi! - Room hi! | Room hi! | hi! - hi! | Capacity: 0 - hi! - Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 1 | Capacity: 1" + "'", str5, "Room Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 97 | Room hi! | hi! - hi! | Capacity: 0 - hi! - hi! - Room hi! | Room hi! | hi! - hi! | Capacity: 0 - hi! - Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 1 | Capacity: 1");
    }

    @Test
    public void test26960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26960");
        room.Room room4 = new room.Room("hi!", (int) (byte) 100, "", "Room hi! | hi! - hi! | Capacity: 0");
        java.lang.String str5 = room4.getScannedID();
        java.lang.String str6 = room4.getBuildingName();
        room4.setUnderMaintenance(false);
        room4.setScannedID("Room hi! | hi! - hi! | Capacity: 0 - hi! - ");
        room4.setScannedID("");
        java.lang.String str13 = room4.toString();
        boolean boolean14 = room4.isOccupied();
        room.SensorObserver sensorObserver15 = null;
        room4.addObserver(sensorObserver15);
        java.lang.String str17 = room4.toString();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100" + "'", str13, "Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100" + "'", str17, "Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100");
    }

    @Test
    public void test26961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26961");
        room.Room room4 = new room.Room("Room hi! | hi! - hi! | Capacity: 0", (int) (byte) 10, "hi!", "");
        room.SensorObserver sensorObserver5 = null;
        room4.removeObserver(sensorObserver5);
        boolean boolean7 = room4.isOccupied();
        boolean boolean8 = room4.isUnderMaintenance();
        java.lang.String str9 = room4.getRoomNumber();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test26962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26962");
        room.Room room4 = new room.Room("", (int) (short) 10, "Room hi! | hi! - hi! | Capacity: 0", "hi!");
        java.lang.String str5 = room4.getFullLocation();
        boolean boolean6 = room4.isEnabled();
        java.lang.String str7 = room4.getBuildingName();
        room4.setOccupied(false);
        room4.setEnabled(false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0 - hi!" + "'", str5, "Room hi! | hi! - hi! | Capacity: 0 - hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str7, "Room hi! | hi! - hi! | Capacity: 0");
    }

    @Test
    public void test26963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26963");
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
        java.lang.String str20 = room4.toString();
        room4.setUnderMaintenance(false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str20, "Room hi! | hi! - hi! | Capacity: 0");
    }

    @Test
    public void test26964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26964");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        java.lang.String str5 = room4.getScannedID();
        room4.setScannedID("hi!");
        boolean boolean8 = room4.isEnabled();
        int int9 = room4.getCapacity();
        java.lang.String str10 = room4.getRoomID();
        java.lang.String str11 = room4.toString();
        room4.notifyObservers();
        room.SensorObserver sensorObserver13 = null;
        room4.addObserver(sensorObserver13);
        int int15 = room4.getCapacity();
        boolean boolean16 = room4.isUnderMaintenance();
        // The following exception was thrown during execution in test generation
        try {
            room4.setUnderMaintenance(false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str11, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test26965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26965");
        room.Room room4 = new room.Room("Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100", 0, "hi! - hi!", "hi!");
        java.lang.String str5 = room4.getFullLocation();
        boolean boolean6 = room4.isUnderMaintenance();
        room4.setEnabled(true);
        java.lang.String str9 = room4.toString();
        room4.setUnderMaintenance(false);
        int int12 = room4.getCapacity();
        room4.notifyObservers();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi! - hi! - hi!" + "'", str5, "hi! - hi! - hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | hi! - hi! - hi! | Capacity: 0" + "'", str9, "Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | hi! - hi! - hi! | Capacity: 0");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test26966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26966");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        boolean boolean5 = room4.isOccupied();
        room4.setEnabled(false);
        java.lang.String str8 = room4.toString();
        room4.setUnderMaintenance(true);
        room4.setEnabled(true);
        room4.setScannedID("Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10");
        java.lang.String str15 = room4.getScannedID();
        java.lang.String str16 = room4.getBuildingName();
        java.lang.String str17 = room4.getRoomNumber();
        java.lang.String str18 = room4.getBuildingName();
        room4.setUnderMaintenance(false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str8, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10" + "'", str15, "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test26967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26967");
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
        java.lang.String str18 = room4.toString();
        room4.setOccupied(true);
        room.SensorObserver sensorObserver21 = null;
        room4.removeObserver(sensorObserver21);
        room4.setScannedID("Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 | Room hi! | Room hi! | hi! - hi! | Capacity: 0 - hi! - Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 1 - Room  - Room hi! | hi! - hi! | Capacity: 0 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 0 | Capacity: 32");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str7, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str10, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str14, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi! - hi!" + "'", str16, "hi! - hi!");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str18, "Room hi! | hi! - hi! | Capacity: 0");
    }

    @Test
    public void test26968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26968");
        room.Room room4 = new room.Room("Room hi! | hi! - hi! | Capacity: 0", (int) (byte) 10, "hi!", "");
        int int5 = room4.getCapacity();
        java.lang.String str6 = room4.getScannedID();
        room4.notifyObservers();
        java.lang.String str8 = room4.toString();
        room.SensorObserver sensorObserver9 = null;
        room4.removeObserver(sensorObserver9);
        boolean boolean11 = room4.isUnderMaintenance();
        boolean boolean12 = room4.isEnabled();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10" + "'", str8, "Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test26969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26969");
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
        room4.notifyObservers();
        java.lang.String str19 = room4.getFullLocation();
        room.SensorObserver sensorObserver20 = null;
        room4.addObserver(sensorObserver20);
        boolean boolean22 = room4.isUnderMaintenance();
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str11, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi! - hi!" + "'", str19, "hi! - hi!");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test26970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26970");
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
        boolean boolean20 = room4.isEnabled();
        boolean boolean21 = room4.isOccupied();
        boolean boolean22 = room4.isEnabled();
        room4.setScannedID("");
        room4.setOccupied(true);
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
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test26971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26971");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        room.SensorObserver sensorObserver5 = null;
        room4.addObserver(sensorObserver5);
        room.SensorObserver sensorObserver7 = null;
        room4.addObserver(sensorObserver7);
        java.lang.String str9 = room4.getBuildingName();
        java.lang.String str10 = room4.getRoomNumber();
        boolean boolean11 = room4.isOccupied();
        java.lang.String str12 = room4.getBuildingName();
        room.SensorObserver sensorObserver13 = null;
        room4.removeObserver(sensorObserver13);
        // The following exception was thrown during execution in test generation
        try {
            room4.setUnderMaintenance(true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test26972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26972");
        room.Room room4 = new room.Room("hi!", (int) (byte) 100, "", "Room hi! | hi! - hi! | Capacity: 0");
        room4.setScannedID("");
        boolean boolean7 = room4.isOccupied();
        room4.setOccupied(true);
        boolean boolean10 = room4.isEnabled();
        boolean boolean11 = room4.isEnabled();
        java.lang.String str12 = room4.getBuildingName();
        room.SensorObserver sensorObserver13 = null;
        room4.removeObserver(sensorObserver13);
        boolean boolean15 = room4.isOccupied();
        java.lang.String str16 = room4.getBuildingName();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test26973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26973");
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
        room.SensorObserver sensorObserver19 = null;
        room4.removeObserver(sensorObserver19);
        room4.notifyObservers();
        room.SensorObserver sensorObserver22 = null;
        room4.removeObserver(sensorObserver22);
        java.lang.String str24 = room4.getBuildingName();
        room4.setOccupied(false);
        java.lang.String str27 = room4.toString();
        java.lang.String str28 = room4.getRoomID();
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str11, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str27, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
    }

    @Test
    public void test26974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26974");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        java.lang.String str5 = room4.getScannedID();
        room4.setScannedID("hi!");
        room4.setEnabled(true);
        room4.notifyObservers();
        java.lang.String str11 = room4.getScannedID();
        java.lang.String str12 = room4.getBuildingName();
        room4.setScannedID("Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 100 - Room hi! | hi! - hi! | Capacity: 0 - hi! - ");
        java.lang.String str15 = room4.toString();
        room4.setScannedID("hi! -  - Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 1");
        boolean boolean18 = room4.isUnderMaintenance();
        java.lang.String str19 = room4.getRoomID();
        room4.setEnabled(false);
        boolean boolean22 = room4.isUnderMaintenance();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str15, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test26975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26975");
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
        room4.setScannedID("Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 | hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 0 - hi! - hi! - Room hi! | hi! - hi! | Capacity: 0");
        boolean boolean20 = room4.isEnabled();
        room4.setEnabled(false);
        room.SensorObserver sensorObserver23 = null;
        room4.addObserver(sensorObserver23);
        // The following exception was thrown during execution in test generation
        try {
            room4.setOccupied(false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str7, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str10, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str14, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi! - hi!" + "'", str16, "hi! - hi!");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test26976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26976");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        room.SensorObserver sensorObserver5 = null;
        room4.addObserver(sensorObserver5);
        java.lang.String str7 = room4.toString();
        room.SensorObserver sensorObserver8 = null;
        room4.addObserver(sensorObserver8);
        room.SensorObserver sensorObserver10 = null;
        room4.removeObserver(sensorObserver10);
        room.SensorObserver sensorObserver12 = null;
        room4.addObserver(sensorObserver12);
        java.lang.String str14 = room4.toString();
        java.lang.String str15 = room4.getScannedID();
        boolean boolean16 = room4.isUnderMaintenance();
        java.lang.Class<?> wildcardClass17 = room4.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str7, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str14, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test26977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26977");
        room.Room room4 = new room.Room("Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10", (-1), "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 100", "Room hi! | hi! - hi! | Capacity: 0 - hi! - ");
        room4.setUnderMaintenance(true);
        room4.setScannedID("Room hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 1 - Room hi! | hi! - hi! - Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | Capacity: 0");
        boolean boolean9 = room4.isOccupied();
        room.SensorObserver sensorObserver10 = null;
        room4.removeObserver(sensorObserver10);
        room4.setScannedID("Room Room Room hi! | hi! - hi! | Capacity: 0 | hi! - hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 97 | Room hi! | hi! - hi! | Capacity: 0 - hi! - hi! - Room hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 1 - Room hi! | hi! - hi! - Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | Capacity: 0 | Capacity: 100");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test26978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26978");
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
        java.lang.String str18 = room4.getFullLocation();
        boolean boolean19 = room4.isUnderMaintenance();
        boolean boolean20 = room4.isEnabled();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi! - hi!" + "'", str18, "hi! - hi!");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test26979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26979");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        boolean boolean5 = room4.isOccupied();
        room4.setEnabled(false);
        java.lang.String str8 = room4.toString();
        room4.setOccupied(true);
        boolean boolean11 = room4.isOccupied();
        java.lang.String str12 = room4.getRoomID();
        java.lang.String str13 = room4.getBuildingName();
        java.lang.String str14 = room4.toString();
        room4.setScannedID("Room Room hi! - hi! | Room hi! | hi! - hi! | Capacity: 0 - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! - hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 97 | Capacity: 35 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | hi! - hi! | Capacity: 0 -  - Room hi! | hi! - hi! | Capacity: 0 - Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 0");
        java.lang.String str17 = room4.getFullLocation();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str8, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str14, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi! - hi!" + "'", str17, "hi! - hi!");
    }

    @Test
    public void test26980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26980");
        room.Room room4 = new room.Room(" - Room hi! | hi! - hi! | Capacity: 0", 0, "", "Room hi! | hi! - hi! | Capacity: 0");
        room4.setOccupied(false);
        room.SensorObserver sensorObserver7 = null;
        room4.removeObserver(sensorObserver7);
        room4.setScannedID("");
        java.lang.String str11 = room4.getRoomNumber();
        java.lang.String str12 = room4.getRoomNumber();
        java.lang.String str13 = room4.getRoomNumber();
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str11, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str12, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str13, "Room hi! | hi! - hi! | Capacity: 0");
    }

    @Test
    public void test26981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26981");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        java.lang.String str5 = room4.getScannedID();
        room4.setScannedID("hi!");
        java.lang.String str8 = room4.getBuildingName();
        java.lang.String str9 = room4.getRoomNumber();
        boolean boolean10 = room4.isOccupied();
        boolean boolean11 = room4.isUnderMaintenance();
        room4.notifyObservers();
        room4.notifyObservers();
        room.SensorObserver sensorObserver14 = null;
        room4.removeObserver(sensorObserver14);
        int int16 = room4.getCapacity();
        room4.setOccupied(false);
        room4.setOccupied(false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test26982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26982");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        java.lang.String str5 = room4.getBuildingName();
        java.lang.String str6 = room4.getRoomID();
        java.lang.String str7 = room4.getScannedID();
        room4.setEnabled(false);
        room4.setOccupied(true);
        room4.setScannedID("Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 97");
        room4.notifyObservers();
        boolean boolean15 = room4.isEnabled();
        java.lang.String str16 = room4.getBuildingName();
        java.lang.String str17 = room4.getRoomID();
        boolean boolean18 = room4.isOccupied();
        java.lang.String str19 = room4.getRoomNumber();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test26983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26983");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        java.lang.String str5 = room4.getScannedID();
        room4.setScannedID("hi!");
        java.lang.String str8 = room4.getBuildingName();
        java.lang.String str9 = room4.getRoomNumber();
        java.lang.String str10 = room4.getFullLocation();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi! - hi!" + "'", str10, "hi! - hi!");
    }

    @Test
    public void test26984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26984");
        room.Room room4 = new room.Room("", 10, "Room hi! | hi! - hi! | Capacity: 0 - hi!", "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 100 - Room hi! | hi! - hi! | Capacity: 0 - hi! - ");
        boolean boolean5 = room4.isEnabled();
        boolean boolean6 = room4.isEnabled();
        room4.setUnderMaintenance(false);
        java.lang.String str9 = room4.getRoomNumber();
        boolean boolean10 = room4.isEnabled();
        boolean boolean11 = room4.isOccupied();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 100 - Room hi! | hi! - hi! | Capacity: 0 - hi! - " + "'", str9, "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 100 - Room hi! | hi! - hi! | Capacity: 0 - hi! - ");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test26985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26985");
        room.Room room4 = new room.Room("", (int) (short) 1, "Room Room Room hi! | hi! - hi! | Capacity: 0 | hi! - hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 97 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room  - Room hi! | hi! - hi! | Capacity: 0 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 0 | Capacity: 32", "Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 | Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 - hi! -  | Capacity: 10");
    }

    @Test
    public void test26986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26986");
        room.Room room4 = new room.Room("hi!", (int) (byte) 1, "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10", "hi!");
        room4.notifyObservers();
        room4.setUnderMaintenance(false);
        java.lang.String str8 = room4.getBuildingName();
        java.lang.String str9 = room4.getScannedID();
        room4.setUnderMaintenance(true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10" + "'", str8, "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10");
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test26987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26987");
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
        java.lang.String str15 = room4.getFullLocation();
        java.lang.String str16 = room4.getFullLocation();
        room4.setUnderMaintenance(true);
        boolean boolean19 = room4.isUnderMaintenance();
        java.lang.String str20 = room4.getRoomID();
        java.lang.String str21 = room4.getRoomNumber();
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str11, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi! - hi!" + "'", str15, "hi! - hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi! - hi!" + "'", str16, "hi! - hi!");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
    }

    @Test
    public void test26988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26988");
        room.Room room4 = new room.Room("Room hi! | hi! - hi! | Capacity: 0 - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! - hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 97 - Room hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 1 - Room hi! | hi! - hi! - Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | Capacity: 0", (int) (byte) -1, "Room hi! | hi! - hi! | Capacity: 0", "");
        room4.notifyObservers();
        java.lang.String str6 = room4.getScannedID();
        boolean boolean7 = room4.isUnderMaintenance();
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test26989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26989");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        room.SensorObserver sensorObserver5 = null;
        room4.addObserver(sensorObserver5);
        java.lang.String str7 = room4.getScannedID();
        room.SensorObserver sensorObserver8 = null;
        room4.removeObserver(sensorObserver8);
        java.lang.String str10 = room4.getRoomNumber();
        java.lang.String str11 = room4.toString();
        java.lang.String str12 = room4.getRoomID();
        java.lang.String str13 = room4.toString();
        room4.notifyObservers();
        boolean boolean15 = room4.isOccupied();
        java.lang.String str16 = room4.getBuildingName();
        room.SensorObserver sensorObserver17 = null;
        room4.addObserver(sensorObserver17);
        // The following exception was thrown during execution in test generation
        try {
            room4.setEnabled(true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str11, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str13, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test26990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26990");
        room.Room room4 = new room.Room("Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi!", (int) (byte) 100, "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10", "hi! - hi! - hi!");
        boolean boolean5 = room4.isUnderMaintenance();
        java.lang.String str6 = room4.getBuildingName();
        java.lang.String str7 = room4.getBuildingName();
        boolean boolean8 = room4.isUnderMaintenance();
        boolean boolean9 = room4.isEnabled();
        room4.setScannedID("");
        room4.setOccupied(true);
        room.SensorObserver sensorObserver14 = null;
        room4.addObserver(sensorObserver14);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10" + "'", str6, "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10" + "'", str7, "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test26991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26991");
        room.Room room4 = new room.Room("Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100", 10, "hi! - ", "Room  - Room hi! | hi! - hi! | Capacity: 0 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 0");
        room4.setOccupied(false);
        boolean boolean7 = room4.isEnabled();
        boolean boolean8 = room4.isUnderMaintenance();
        room4.setScannedID("Room Room  - Room hi! | hi! - hi! | Capacity: 0 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 0 -  | Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! | Capacity: 32");
        room.SensorObserver sensorObserver11 = null;
        room4.addObserver(sensorObserver11);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test26992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26992");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        java.lang.String str5 = room4.getScannedID();
        room4.setScannedID("hi!");
        room4.setUnderMaintenance(true);
        room4.setOccupied(true);
        java.lang.String str12 = room4.getRoomNumber();
        room4.setEnabled(true);
        java.lang.String str15 = room4.getBuildingName();
        room4.setEnabled(true);
        java.lang.Class<?> wildcardClass18 = room4.getClass();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test26993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26993");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        boolean boolean5 = room4.isOccupied();
        java.lang.String str6 = room4.toString();
        java.lang.String str7 = room4.toString();
        room4.setScannedID("Room hi! | hi! - hi! | Capacity: 0");
        boolean boolean10 = room4.isOccupied();
        room.SensorObserver sensorObserver11 = null;
        room4.addObserver(sensorObserver11);
        room.SensorObserver sensorObserver13 = null;
        room4.removeObserver(sensorObserver13);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str6, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str7, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test26994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26994");
        room.Room room4 = new room.Room("Room Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | hi! -  - Room  - Room hi! | hi! - hi! | Capacity: 0 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 0 | Capacity: 10 | Room Room  | Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! | Capacity: 1 | Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 - Room Room hi! | hi! - hi! | Capacity: 0 | hi! - hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 97 | Capacity: 100 - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! -  | Capacity: 1", (-1), "hi! - Room hi! | hi! - hi! | Capacity: 0 - Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 97", "Room hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 | hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 0 - Room hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 1 | Capacity: -1");
    }

    @Test
    public void test26995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26995");
        room.Room room4 = new room.Room("hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10", (int) (short) 0, "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi!", " - Room hi! | hi! - hi! | Capacity: 0");
        room4.notifyObservers();
    }

    @Test
    public void test26996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26996");
        room.Room room4 = new room.Room("Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10", (int) 'a', "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 100 - Room hi! | hi! - hi! | Capacity: 0 - hi! - ", "Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | hi! -  - Room  - Room hi! | hi! - hi! | Capacity: 0 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 0 | Capacity: 10");
        room4.setUnderMaintenance(true);
    }

    @Test
    public void test26997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26997");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        java.lang.String str5 = room4.getScannedID();
        room4.setScannedID("hi!");
        room4.setUnderMaintenance(true);
        java.lang.String str10 = room4.getScannedID();
        int int11 = room4.getCapacity();
        boolean boolean12 = room4.isEnabled();
        java.lang.String str13 = room4.getBuildingName();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test26998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26998");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        java.lang.String str5 = room4.getScannedID();
        room4.setScannedID("hi!");
        room4.setUnderMaintenance(true);
        boolean boolean10 = room4.isOccupied();
        java.lang.String str11 = room4.toString();
        java.lang.String str12 = room4.getRoomID();
        boolean boolean13 = room4.isUnderMaintenance();
        java.lang.String str14 = room4.toString();
        room4.setUnderMaintenance(true);
        room.SensorObserver sensorObserver17 = null;
        room4.removeObserver(sensorObserver17);
        room4.setOccupied(false);
        java.lang.String str21 = room4.getRoomNumber();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str11, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str14, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
    }

    @Test
    public void test26999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26999");
        room.Room room4 = new room.Room("hi!", (int) (byte) 100, "", "Room hi! | hi! - hi! | Capacity: 0");
        room4.setScannedID("");
        boolean boolean7 = room4.isUnderMaintenance();
        room4.setUnderMaintenance(false);
        room4.notifyObservers();
        java.lang.String str11 = room4.getRoomID();
        room.SensorObserver sensorObserver12 = null;
        room4.addObserver(sensorObserver12);
        java.lang.String str14 = room4.getBuildingName();
        java.lang.String str15 = room4.getScannedID();
        boolean boolean16 = room4.isOccupied();
        java.lang.String str17 = room4.getFullLocation();
        // The following exception was thrown during execution in test generation
        try {
            room4.setScannedID("Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 100 | hi! - hi! - hi! - hi! | Capacity: 0 - ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + " - Room hi! | hi! - hi! | Capacity: 0" + "'", str17, " - Room hi! | hi! - hi! | Capacity: 0");
    }

    @Test
    public void test27000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test27000");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        java.lang.String str5 = room4.getScannedID();
        room4.setScannedID("hi!");
        room4.setUnderMaintenance(true);
        java.lang.String str10 = room4.getScannedID();
        java.lang.String str11 = room4.getFullLocation();
        boolean boolean12 = room4.isUnderMaintenance();
        room4.setEnabled(true);
        boolean boolean15 = room4.isOccupied();
        boolean boolean16 = room4.isEnabled();
        boolean boolean17 = room4.isEnabled();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi! - hi!" + "'", str11, "hi! - hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }
}

