import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest7 {

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
    public void test03501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03501");
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
        java.lang.Class<?> wildcardClass14 = room4.getClass();
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str11, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test03502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03502");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        boolean boolean5 = room4.isOccupied();
        java.lang.String str6 = room4.getFullLocation();
        java.lang.String str7 = room4.getRoomID();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi! - hi!" + "'", str6, "hi! - hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test03503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03503");
        room.Room room4 = new room.Room("Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10", 0, "hi!", "Room hi! | hi! - hi! | Capacity: 0");
        room4.setScannedID("Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100");
        room4.notifyObservers();
        int int8 = room4.getCapacity();
        room4.setEnabled(true);
        boolean boolean11 = room4.isUnderMaintenance();
        room4.setEnabled(false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test03504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03504");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        room.SensorObserver sensorObserver5 = null;
        room4.addObserver(sensorObserver5);
        java.lang.String str7 = room4.toString();
        java.lang.String str8 = room4.toString();
        room.SensorObserver sensorObserver9 = null;
        room4.addObserver(sensorObserver9);
        java.lang.String str11 = room4.getBuildingName();
        java.lang.String str12 = room4.getFullLocation();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str7, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str8, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi! - hi!" + "'", str12, "hi! - hi!");
    }

    @Test
    public void test03505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03505");
        room.Room room4 = new room.Room("Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10", 0, "hi!", "Room hi! | hi! - hi! | Capacity: 0");
        java.lang.String str5 = room4.getBuildingName();
        boolean boolean6 = room4.isEnabled();
        room.SensorObserver sensorObserver7 = null;
        room4.removeObserver(sensorObserver7);
        room.SensorObserver sensorObserver9 = null;
        room4.addObserver(sensorObserver9);
        java.lang.String str11 = room4.getRoomID();
        java.lang.String str12 = room4.getRoomID();
        // The following exception was thrown during execution in test generation
        try {
            room4.setOccupied(false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10" + "'", str11, "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10" + "'", str12, "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10");
    }

    @Test
    public void test03506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03506");
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
        java.lang.String str15 = room4.toString();
        int int16 = room4.getCapacity();
        room4.setEnabled(false);
        boolean boolean19 = room4.isEnabled();
        room4.setScannedID("Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 97");
        java.lang.Class<?> wildcardClass22 = room4.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str7, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi! - hi!" + "'", str14, "hi! - hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str15, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test03507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03507");
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
        boolean boolean15 = room4.isEnabled();
        java.lang.String str16 = room4.getScannedID();
        room.SensorObserver sensorObserver17 = null;
        room4.addObserver(sensorObserver17);
        // The following exception was thrown during execution in test generation
        try {
            room4.setEnabled(true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test03508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03508");
        room.Room room4 = new room.Room("Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100", (int) (short) 1, "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi!", "Room hi! | hi! - hi! | Capacity: 0");
        room4.notifyObservers();
        room4.setEnabled(false);
        room4.setEnabled(true);
        boolean boolean10 = room4.isEnabled();
        java.lang.String str11 = room4.getBuildingName();
        java.lang.String str12 = room4.getScannedID();
        java.lang.String str13 = room4.toString();
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi!" + "'", str11, "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi!");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 1" + "'", str13, "Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 1");
    }

    @Test
    public void test03509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03509");
        room.Room room4 = new room.Room("hi!", (int) (byte) 100, "", "Room hi! | hi! - hi! | Capacity: 0");
        java.lang.String str5 = room4.getRoomNumber();
        boolean boolean6 = room4.isEnabled();
        room.SensorObserver sensorObserver7 = null;
        room4.removeObserver(sensorObserver7);
        room.SensorObserver sensorObserver9 = null;
        room4.addObserver(sensorObserver9);
        // The following exception was thrown during execution in test generation
        try {
            room4.setEnabled(true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str5, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test03510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03510");
        room.Room room4 = new room.Room("Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi!", 100, "Room Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! - hi! - hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: -1", "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi!");
        room.SensorObserver sensorObserver5 = null;
        room4.addObserver(sensorObserver5);
        boolean boolean7 = room4.isEnabled();
        // The following exception was thrown during execution in test generation
        try {
            room4.setOccupied(false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test03511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03511");
        room.Room room4 = new room.Room("Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 100", (int) (short) 100, "Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100", "Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi!");
        boolean boolean5 = room4.isEnabled();
        room4.setOccupied(true);
        java.lang.Class<?> wildcardClass8 = room4.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test03512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03512");
        room.Room room4 = new room.Room("hi!", (int) (byte) 100, "", "Room hi! | hi! - hi! | Capacity: 0");
        java.lang.String str5 = room4.getRoomNumber();
        room4.notifyObservers();
        java.lang.String str7 = room4.getBuildingName();
        room4.setOccupied(false);
        room4.setOccupied(true);
        room4.setEnabled(true);
        room4.notifyObservers();
        java.lang.String str15 = room4.getRoomNumber();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str5, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str15, "Room hi! | hi! - hi! | Capacity: 0");
    }

    @Test
    public void test03513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03513");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        java.lang.String str5 = room4.getScannedID();
        room4.setScannedID("hi!");
        room4.setUnderMaintenance(true);
        room.SensorObserver sensorObserver10 = null;
        room4.removeObserver(sensorObserver10);
        java.lang.String str12 = room4.getScannedID();
        int int13 = room4.getCapacity();
        boolean boolean14 = room4.isEnabled();
        room.SensorObserver sensorObserver15 = null;
        room4.removeObserver(sensorObserver15);
        room4.setUnderMaintenance(true);
        boolean boolean19 = room4.isUnderMaintenance();
        java.lang.Class<?> wildcardClass20 = room4.getClass();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test03514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03514");
        room.Room room4 = new room.Room("hi!", (int) (byte) 1, "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10", "hi!");
        room4.notifyObservers();
        room4.setOccupied(false);
        room4.setUnderMaintenance(false);
        room4.setEnabled(false);
        java.lang.String str12 = room4.getBuildingName();
        room.SensorObserver sensorObserver13 = null;
        room4.removeObserver(sensorObserver13);
        java.lang.String str15 = room4.getScannedID();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10" + "'", str12, "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10");
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test03515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03515");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        java.lang.String str5 = room4.getScannedID();
        room4.setScannedID("hi!");
        room4.setUnderMaintenance(true);
        room4.setOccupied(true);
        room4.setScannedID("Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100");
        boolean boolean14 = room4.isUnderMaintenance();
        room4.setScannedID("Room  - Room hi! | hi! - hi! | Capacity: 0 |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 0");
        boolean boolean17 = room4.isOccupied();
        java.lang.Class<?> wildcardClass18 = room4.getClass();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test03516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03516");
        room.Room room4 = new room.Room("Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi!", (int) (short) 0, "hi! - hi! - hi!", "Room hi! | hi! - hi! | Capacity: 0");
        room4.setOccupied(false);
        room4.setUnderMaintenance(false);
        room4.setEnabled(false);
        java.lang.String str11 = room4.toString();
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | hi! - hi! - hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 0" + "'", str11, "Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | hi! - hi! - hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 0");
    }

    @Test
    public void test03517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03517");
        room.Room room4 = new room.Room("Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 | hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 0 - Room hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 1 - Room Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! | Room  - Room hi! | hi! - hi! | Capacity: 0 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 0 - Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 97 | Capacity: 0", (int) (byte) 100, "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 1", "Room hi! - hi! | Room hi! | hi! - hi! | Capacity: 0 - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! - hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 97 | Capacity: 35");
    }

    @Test
    public void test03518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03518");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        boolean boolean5 = room4.isOccupied();
        room4.setEnabled(false);
        java.lang.String str8 = room4.getFullLocation();
        java.lang.String str9 = room4.getRoomID();
        boolean boolean10 = room4.isUnderMaintenance();
        boolean boolean11 = room4.isOccupied();
        int int12 = room4.getCapacity();
        boolean boolean13 = room4.isEnabled();
        boolean boolean14 = room4.isOccupied();
        java.lang.String str15 = room4.getRoomNumber();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi! - hi!" + "'", str8, "hi! - hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test03519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03519");
        room.Room room4 = new room.Room("", (int) (byte) 1, "Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10", "hi!");
        java.lang.String str5 = room4.getFullLocation();
        room4.setScannedID("Room hi! | hi! - hi! | Capacity: 0");
        java.lang.String str8 = room4.getFullLocation();
        java.lang.String str9 = room4.getRoomID();
        java.lang.String str10 = room4.toString();
        java.lang.String str11 = room4.getBuildingName();
        room4.setOccupied(false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi!" + "'", str5, "Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi!" + "'", str8, "Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Room  | Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! | Capacity: 1" + "'", str10, "Room  | Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! | Capacity: 1");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10" + "'", str11, "Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10");
    }

    @Test
    public void test03520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03520");
        room.Room room4 = new room.Room("Room hi! | hi! - hi! | Capacity: 0 - hi!", (int) '4', "Room  - Room hi! | hi! - hi! | Capacity: 0 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 0", "hi!");
        boolean boolean5 = room4.isUnderMaintenance();
        java.lang.String str6 = room4.getScannedID();
        boolean boolean7 = room4.isUnderMaintenance();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test03521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03521");
        room.Room room4 = new room.Room("hi! - ", (int) '#', "hi! - ", "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10");
        room4.setScannedID("Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 | hi! - hi! - Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 - Room hi! | hi! - hi! | Capacity: 0 - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 0");
    }

    @Test
    public void test03522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03522");
        room.Room room4 = new room.Room("Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10", 32, "", "hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10");
        java.lang.String str5 = room4.getFullLocation();
        room4.setOccupied(false);
        java.lang.String str8 = room4.getRoomID();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + " - hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10" + "'", str5, " - hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10" + "'", str8, "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10");
    }

    @Test
    public void test03523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03523");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        java.lang.String str5 = room4.getBuildingName();
        java.lang.String str6 = room4.getRoomID();
        java.lang.String str7 = room4.getScannedID();
        java.lang.String str8 = room4.getScannedID();
        room4.setOccupied(true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test03524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03524");
        room.Room room4 = new room.Room("", (int) (byte) 100, "Room hi! | hi! - hi! | Capacity: 0 - hi!", "");
        boolean boolean5 = room4.isEnabled();
        java.lang.String str6 = room4.getFullLocation();
        room4.notifyObservers();
        java.lang.String str8 = room4.getRoomNumber();
        boolean boolean9 = room4.isEnabled();
        java.lang.String str10 = room4.getFullLocation();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0 - hi! - " + "'", str6, "Room hi! | hi! - hi! | Capacity: 0 - hi! - ");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0 - hi! - " + "'", str10, "Room hi! | hi! - hi! | Capacity: 0 - hi! - ");
    }

    @Test
    public void test03525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03525");
        room.Room room4 = new room.Room("hi!", 1, "Room hi! | hi! - hi! | Capacity: 0 - hi!", "Room hi! | hi! - hi! | Capacity: 0 - hi!");
        int int5 = room4.getCapacity();
        room4.setUnderMaintenance(false);
        java.lang.String str8 = room4.toString();
        int int9 = room4.getCapacity();
        room4.setScannedID("hi!");
        room4.setEnabled(true);
        room4.setOccupied(false);
        room4.setEnabled(false);
        java.lang.String str18 = room4.getFullLocation();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Room hi! | Room hi! | hi! - hi! | Capacity: 0 - hi! - Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 1" + "'", str8, "Room hi! | Room hi! | hi! - hi! | Capacity: 0 - hi! - Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 1");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0 - hi! - Room hi! | hi! - hi! | Capacity: 0 - hi!" + "'", str18, "Room hi! | hi! - hi! | Capacity: 0 - hi! - Room hi! | hi! - hi! | Capacity: 0 - hi!");
    }

    @Test
    public void test03526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03526");
        room.Room room4 = new room.Room("hi!", (int) (byte) 100, "", "Room hi! | hi! - hi! | Capacity: 0");
        java.lang.String str5 = room4.getRoomNumber();
        boolean boolean6 = room4.isEnabled();
        java.lang.String str7 = room4.getRoomNumber();
        boolean boolean8 = room4.isOccupied();
        boolean boolean9 = room4.isUnderMaintenance();
        java.lang.String str10 = room4.getFullLocation();
        boolean boolean11 = room4.isEnabled();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str5, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str7, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + " - Room hi! | hi! - hi! | Capacity: 0" + "'", str10, " - Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test03527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03527");
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
        java.lang.String str17 = room4.getRoomNumber();
        java.lang.Class<?> wildcardClass18 = room4.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str7, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str10, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test03528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03528");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        java.lang.String str5 = room4.getScannedID();
        room4.setScannedID("hi!");
        room4.setUnderMaintenance(true);
        room.SensorObserver sensorObserver10 = null;
        room4.addObserver(sensorObserver10);
        room.SensorObserver sensorObserver12 = null;
        room4.addObserver(sensorObserver12);
        java.lang.String str14 = room4.toString();
        java.lang.String str15 = room4.getFullLocation();
        java.lang.String str16 = room4.toString();
        // The following exception was thrown during execution in test generation
        try {
            room4.setScannedID("Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 1 - Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str14, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi! - hi!" + "'", str15, "hi! - hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str16, "Room hi! | hi! - hi! | Capacity: 0");
    }

    @Test
    public void test03529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03529");
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
        room.SensorObserver sensorObserver14 = null;
        room4.removeObserver(sensorObserver14);
        boolean boolean16 = room4.isEnabled();
        room.SensorObserver sensorObserver17 = null;
        room4.removeObserver(sensorObserver17);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi! - hi!" + "'", str7, "hi! - hi!");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str13, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test03530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03530");
        room.Room room4 = new room.Room("", (int) (byte) 0, "Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | hi! - hi! - hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 0", "Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 | hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 0 - Room hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 1");
    }

    @Test
    public void test03531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03531");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        java.lang.String str5 = room4.getScannedID();
        room4.setScannedID("hi!");
        room4.setUnderMaintenance(true);
        room.SensorObserver sensorObserver10 = null;
        room4.addObserver(sensorObserver10);
        room.SensorObserver sensorObserver12 = null;
        room4.addObserver(sensorObserver12);
        // The following exception was thrown during execution in test generation
        try {
            room4.setScannedID("Room  | Room hi! | hi! - hi! | Capacity: 0 -  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 32");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test03532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03532");
        room.Room room4 = new room.Room("Room hi! | hi! - hi! - Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | Capacity: 0 -  - hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10", 0, "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room hi! | hi! - hi! | Capacity: 0", "Room hi! - hi! | Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 10");
        room4.setEnabled(false);
        room4.notifyObservers();
    }

    @Test
    public void test03533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03533");
        room.Room room4 = new room.Room("Room Room hi! | hi! - hi! | Capacity: 0 | Room hi! | hi! - hi! | Capacity: 0 - hi! - hi! | Capacity: 100", (-1), "", "hi! - hi! - Room hi! | hi! - hi! | Capacity: 0");
        room4.setOccupied(false);
        room4.setScannedID("Room Room  - Room hi! | hi! - hi! | Capacity: 0 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 0 | hi! - hi! - Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 -  - hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 0");
        java.lang.String str9 = room4.getRoomID();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Room Room hi! | hi! - hi! | Capacity: 0 | Room hi! | hi! - hi! | Capacity: 0 - hi! - hi! | Capacity: 100" + "'", str9, "Room Room hi! | hi! - hi! | Capacity: 0 | Room hi! | hi! - hi! | Capacity: 0 - hi! - hi! | Capacity: 100");
    }

    @Test
    public void test03534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03534");
        room.Room room4 = new room.Room("Room hi! | hi! - hi! | Capacity: 0 - hi!", (int) (short) 10, "Room hi! | hi! - hi! | Capacity: 0", "Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10");
        int int5 = room4.getCapacity();
        java.lang.String str6 = room4.getRoomNumber();
        room4.notifyObservers();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10" + "'", str6, "Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10");
    }

    @Test
    public void test03535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03535");
        room.Room room4 = new room.Room("hi!", (int) (byte) 100, "", "Room hi! | hi! - hi! | Capacity: 0");
        room4.setScannedID("");
        boolean boolean7 = room4.isOccupied();
        int int8 = room4.getCapacity();
        boolean boolean9 = room4.isEnabled();
        java.lang.String str10 = room4.getRoomID();
        java.lang.String str11 = room4.getScannedID();
        java.lang.String str12 = room4.getRoomNumber();
        boolean boolean13 = room4.isOccupied();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str12, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test03536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03536");
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
        java.lang.String str17 = room4.getRoomNumber();
        java.lang.String str18 = room4.getScannedID();
        room.SensorObserver sensorObserver19 = null;
        room4.removeObserver(sensorObserver19);
        room4.setEnabled(true);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str11, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str16, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test03537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03537");
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
        room4.setUnderMaintenance(true);
        room4.setUnderMaintenance(false);
        room4.notifyObservers();
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str11, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test03538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03538");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        java.lang.String str5 = room4.getScannedID();
        room4.setScannedID("hi!");
        boolean boolean8 = room4.isEnabled();
        int int9 = room4.getCapacity();
        int int10 = room4.getCapacity();
        boolean boolean11 = room4.isOccupied();
        boolean boolean12 = room4.isUnderMaintenance();
        room4.setOccupied(true);
        room.SensorObserver sensorObserver15 = null;
        room4.removeObserver(sensorObserver15);
        java.lang.String str17 = room4.getScannedID();
        room4.setScannedID("Room hi! - hi! - hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 -  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test03539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03539");
        room.Room room4 = new room.Room("Room hi! | hi! - hi! | Capacity: 0 - hi! - ", (int) (short) -1, "Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 100 | hi! - hi! - hi! - hi! | Capacity: 0", "Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 1");
        room.SensorObserver sensorObserver5 = null;
        room4.addObserver(sensorObserver5);
        int int7 = room4.getCapacity();
        // The following exception was thrown during execution in test generation
        try {
            room4.setEnabled(false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test03540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03540");
        room.Room room4 = new room.Room("Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 | hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 0 - hi! - hi! - Room hi! | hi! - hi! | Capacity: 0", 35, "Room hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 1 - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi!", "Room Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! |  - Room hi! | hi! - hi! | Capacity: 0 - Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: -1");
        boolean boolean5 = room4.isOccupied();
        room4.notifyObservers();
        room.SensorObserver sensorObserver7 = null;
        room4.removeObserver(sensorObserver7);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test03541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03541");
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
        int int16 = room4.getCapacity();
        java.lang.String str17 = room4.getFullLocation();
        java.lang.String str18 = room4.toString();
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str11, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str15, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi! - hi!" + "'", str17, "hi! - hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str18, "Room hi! | hi! - hi! | Capacity: 0");
    }

    @Test
    public void test03542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03542");
        room.Room room4 = new room.Room("Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100", (int) (short) 1, "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi!", "Room hi! | hi! - hi! | Capacity: 0");
        room4.notifyObservers();
        room4.setEnabled(false);
        room4.setEnabled(true);
        boolean boolean10 = room4.isEnabled();
        room.SensorObserver sensorObserver11 = null;
        room4.addObserver(sensorObserver11);
        java.lang.String str13 = room4.getRoomNumber();
        // The following exception was thrown during execution in test generation
        try {
            room4.setUnderMaintenance(false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str13, "Room hi! | hi! - hi! | Capacity: 0");
    }

    @Test
    public void test03543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03543");
        room.Room room4 = new room.Room("hi!", 1, "Room hi! | hi! - hi! | Capacity: 0 - hi!", "Room hi! | hi! - hi! | Capacity: 0 - hi!");
        int int5 = room4.getCapacity();
        room4.setUnderMaintenance(false);
        room.SensorObserver sensorObserver8 = null;
        room4.addObserver(sensorObserver8);
        room.SensorObserver sensorObserver10 = null;
        room4.removeObserver(sensorObserver10);
        int int12 = room4.getCapacity();
        java.lang.String str13 = room4.getBuildingName();
        boolean boolean14 = room4.isOccupied();
        int int15 = room4.getCapacity();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0 - hi!" + "'", str13, "Room hi! | hi! - hi! | Capacity: 0 - hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test03544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03544");
        room.Room room4 = new room.Room("Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100", (int) (short) 1, "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi!", "Room hi! | hi! - hi! | Capacity: 0");
        int int5 = room4.getCapacity();
        room4.setUnderMaintenance(true);
        boolean boolean8 = room4.isOccupied();
        room.SensorObserver sensorObserver9 = null;
        room4.addObserver(sensorObserver9);
        boolean boolean11 = room4.isOccupied();
        boolean boolean12 = room4.isUnderMaintenance();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test03545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03545");
        room.Room room4 = new room.Room("Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 100 - Room hi! | hi! - hi! | Capacity: 0 - hi! - ", 0, "Room hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 1", "Room hi! | hi! - hi! - Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | Capacity: 0");
        java.lang.String str5 = room4.getFullLocation();
        java.lang.String str6 = room4.getRoomID();
        java.lang.String str7 = room4.getRoomNumber();
        boolean boolean8 = room4.isOccupied();
        java.lang.Class<?> wildcardClass9 = room4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Room hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 1 - Room hi! | hi! - hi! - Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | Capacity: 0" + "'", str5, "Room hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 1 - Room hi! | hi! - hi! - Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 100 - Room hi! | hi! - hi! | Capacity: 0 - hi! - " + "'", str6, "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 100 - Room hi! | hi! - hi! | Capacity: 0 - hi! - ");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Room hi! | hi! - hi! - Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | Capacity: 0" + "'", str7, "Room hi! | hi! - hi! - Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | Capacity: 0");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test03546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03546");
        room.Room room4 = new room.Room("hi!", (int) (byte) 1, "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10", "hi!");
        room4.notifyObservers();
        room4.setUnderMaintenance(false);
        room.SensorObserver sensorObserver8 = null;
        room4.removeObserver(sensorObserver8);
        java.lang.String str10 = room4.toString();
        boolean boolean11 = room4.isUnderMaintenance();
        java.lang.String str12 = room4.toString();
        java.lang.String str13 = room4.getScannedID();
        room4.notifyObservers();
        room4.setUnderMaintenance(false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Room hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 1" + "'", str10, "Room hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 1");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Room hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 1" + "'", str12, "Room hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 1");
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test03547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03547");
        room.Room room4 = new room.Room("Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10", 0, "hi!", "Room hi! | hi! - hi! | Capacity: 0");
        room4.setScannedID("Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100");
        room4.notifyObservers();
        int int8 = room4.getCapacity();
        java.lang.String str9 = room4.getBuildingName();
        room4.setUnderMaintenance(false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test03548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03548");
        room.Room room4 = new room.Room("", (int) (byte) 100, "Room hi! | hi! - hi! | Capacity: 0 - hi!", "");
        boolean boolean5 = room4.isEnabled();
        int int6 = room4.getCapacity();
        java.lang.String str7 = room4.getScannedID();
        room4.setOccupied(false);
        java.lang.String str10 = room4.getScannedID();
        room.SensorObserver sensorObserver11 = null;
        room4.addObserver(sensorObserver11);
        java.lang.String str13 = room4.getScannedID();
        java.lang.Class<?> wildcardClass14 = room4.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test03549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03549");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        room.SensorObserver sensorObserver5 = null;
        room4.addObserver(sensorObserver5);
        java.lang.String str7 = room4.getFullLocation();
        boolean boolean8 = room4.isEnabled();
        room.SensorObserver sensorObserver9 = null;
        room4.addObserver(sensorObserver9);
        room.SensorObserver sensorObserver11 = null;
        room4.addObserver(sensorObserver11);
        boolean boolean13 = room4.isEnabled();
        java.lang.String str14 = room4.getRoomID();
        boolean boolean15 = room4.isOccupied();
        int int16 = room4.getCapacity();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi! - hi!" + "'", str7, "hi! - hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test03550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03550");
        room.Room room4 = new room.Room("hi!", (int) (byte) 1, "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10", "hi!");
        room4.notifyObservers();
        room4.setUnderMaintenance(false);
        room.SensorObserver sensorObserver8 = null;
        room4.removeObserver(sensorObserver8);
        java.lang.String str10 = room4.toString();
        room4.setEnabled(false);
        room4.setOccupied(true);
        room.SensorObserver sensorObserver15 = null;
        room4.addObserver(sensorObserver15);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Room hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 1" + "'", str10, "Room hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 1");
    }

    @Test
    public void test03551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03551");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        java.lang.String str5 = room4.getScannedID();
        room4.setScannedID("hi!");
        java.lang.String str8 = room4.getBuildingName();
        room4.setEnabled(false);
        room.SensorObserver sensorObserver11 = null;
        room4.removeObserver(sensorObserver11);
        java.lang.String str13 = room4.getBuildingName();
        java.lang.String str14 = room4.getRoomID();
        java.lang.String str15 = room4.toString();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str15, "Room hi! | hi! - hi! | Capacity: 0");
    }

    @Test
    public void test03552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03552");
        room.Room room4 = new room.Room("hi!", (int) (byte) 100, "", "Room hi! | hi! - hi! | Capacity: 0");
        java.lang.String str5 = room4.getScannedID();
        java.lang.String str6 = room4.getBuildingName();
        room4.setUnderMaintenance(false);
        room4.setScannedID("Room hi! | hi! - hi! | Capacity: 0 - hi! - ");
        java.lang.String str11 = room4.toString();
        room.SensorObserver sensorObserver12 = null;
        room4.removeObserver(sensorObserver12);
        boolean boolean14 = room4.isUnderMaintenance();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100" + "'", str11, "Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test03553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03553");
        room.Room room4 = new room.Room("Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100", (int) 'a', "hi! - hi!", "Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10");
        java.lang.String str5 = room4.toString();
        room4.setScannedID("Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi!");
        room4.setUnderMaintenance(true);
        boolean boolean10 = room4.isOccupied();
        java.lang.Class<?> wildcardClass11 = room4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 97" + "'", str5, "Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 97");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test03554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03554");
        room.Room room4 = new room.Room("", (int) (byte) 1, "Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10", "hi!");
        java.lang.String str5 = room4.getFullLocation();
        room4.setScannedID("Room hi! | hi! - hi! | Capacity: 0");
        java.lang.String str8 = room4.getBuildingName();
        int int9 = room4.getCapacity();
        java.lang.Class<?> wildcardClass10 = room4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi!" + "'", str5, "Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10" + "'", str8, "Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test03555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03555");
        room.Room room4 = new room.Room("", (int) (byte) 100, "Room hi! | hi! - hi! | Capacity: 0 - hi!", "");
        boolean boolean5 = room4.isEnabled();
        int int6 = room4.getCapacity();
        java.lang.String str7 = room4.getScannedID();
        room.SensorObserver sensorObserver8 = null;
        room4.addObserver(sensorObserver8);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test03556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03556");
        room.Room room4 = new room.Room("Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100", 0, "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi!", "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10");
        java.lang.String str5 = room4.getBuildingName();
        java.lang.String str6 = room4.getScannedID();
        java.lang.String str7 = room4.getRoomID();
        room4.setUnderMaintenance(false);
        java.lang.String str10 = room4.getRoomID();
        room4.notifyObservers();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi!" + "'", str5, "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi!");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100" + "'", str7, "Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100" + "'", str10, "Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100");
    }

    @Test
    public void test03557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03557");
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
            room4.setEnabled(false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi! - hi!" + "'", str7, "hi! - hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test03558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03558");
        room.Room room4 = new room.Room("hi!", 1, "Room hi! | hi! - hi! | Capacity: 0 - hi!", "Room hi! | hi! - hi! | Capacity: 0 - hi!");
        int int5 = room4.getCapacity();
        room4.setUnderMaintenance(false);
        java.lang.String str8 = room4.toString();
        int int9 = room4.getCapacity();
        room4.setOccupied(false);
        java.lang.Class<?> wildcardClass12 = room4.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Room hi! | Room hi! | hi! - hi! | Capacity: 0 - hi! - Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 1" + "'", str8, "Room hi! | Room hi! | hi! - hi! | Capacity: 0 - hi! - Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 1");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test03559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03559");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        boolean boolean5 = room4.isOccupied();
        room4.setEnabled(false);
        java.lang.String str8 = room4.toString();
        room4.setOccupied(true);
        room.SensorObserver sensorObserver11 = null;
        room4.removeObserver(sensorObserver11);
        java.lang.String str13 = room4.getBuildingName();
        room4.setScannedID("Room hi! | hi! - hi! | Capacity: 0 - hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 |  - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 0");
        room.SensorObserver sensorObserver16 = null;
        room4.removeObserver(sensorObserver16);
        room4.setOccupied(true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str8, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test03560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03560");
        room.Room room4 = new room.Room("Room hi! | hi! - hi! | Capacity: 0", (int) (byte) 10, "hi!", "");
        room4.setUnderMaintenance(true);
        java.lang.String str7 = room4.toString();
        java.lang.String str8 = room4.getBuildingName();
        java.lang.String str9 = room4.getRoomNumber();
        room.SensorObserver sensorObserver10 = null;
        room4.addObserver(sensorObserver10);
        java.lang.String str12 = room4.getRoomID();
        // The following exception was thrown during execution in test generation
        try {
            room4.notifyObservers();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10" + "'", str7, "Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str12, "Room hi! | hi! - hi! | Capacity: 0");
    }

    @Test
    public void test03561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03561");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        room.SensorObserver sensorObserver5 = null;
        room4.addObserver(sensorObserver5);
        java.lang.String str7 = room4.toString();
        room.SensorObserver sensorObserver8 = null;
        room4.removeObserver(sensorObserver8);
        int int10 = room4.getCapacity();
        java.lang.String str11 = room4.getRoomID();
        java.lang.String str12 = room4.getFullLocation();
        java.lang.String str13 = room4.getRoomNumber();
        room4.notifyObservers();
        java.lang.String str15 = room4.getBuildingName();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str7, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi! - hi!" + "'", str12, "hi! - hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test03562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03562");
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
        room4.notifyObservers();
        java.lang.String str16 = room4.getScannedID();
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str11, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test03563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03563");
        room.Room room4 = new room.Room("Room hi! | hi! - hi! | Capacity: 0", (int) 'a', "hi!", "hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10");
        java.lang.String str5 = room4.toString();
        room4.notifyObservers();
        boolean boolean7 = room4.isEnabled();
        room.SensorObserver sensorObserver8 = null;
        room4.addObserver(sensorObserver8);
        // The following exception was thrown during execution in test generation
        try {
            room4.setEnabled(false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Room Room hi! | hi! - hi! | Capacity: 0 | hi! - hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 97" + "'", str5, "Room Room hi! | hi! - hi! | Capacity: 0 | hi! - hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 97");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test03564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03564");
        room.Room room4 = new room.Room("hi!", (int) (byte) 100, "", "Room hi! | hi! - hi! | Capacity: 0");
        room4.setScannedID("");
        boolean boolean7 = room4.isOccupied();
        java.lang.String str8 = room4.getScannedID();
        room4.setUnderMaintenance(false);
        room4.setScannedID("Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10");
        java.lang.Class<?> wildcardClass13 = room4.getClass();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test03565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03565");
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
        java.lang.String str23 = room4.toString();
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
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str17, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str23, "Room hi! | hi! - hi! | Capacity: 0");
    }

    @Test
    public void test03566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03566");
        room.Room room4 = new room.Room("Room hi! | hi! - hi! | Capacity: 0", (int) '#', "", "Room  - Room hi! | hi! - hi! | Capacity: 0 |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 0");
        room4.setScannedID("Room hi! | hi! - hi! | Capacity: 0 - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! - hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 97 - Room hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 1 - Room hi! | hi! - hi! - Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | Capacity: 0");
    }

    @Test
    public void test03567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03567");
        room.Room room4 = new room.Room("Room  | Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! | Capacity: 1", 100, "Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100", "Room Room hi! | hi! - hi! | Capacity: 0 | hi! - hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 97");
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
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Room Room  | Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! | Capacity: 1 | Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 - Room Room hi! | hi! - hi! | Capacity: 0 | hi! - hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 97 | Capacity: 100" + "'", str5, "Room Room  | Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! | Capacity: 1 | Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 - Room Room hi! | hi! - hi! | Capacity: 0 | hi! - hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 97 | Capacity: 100");
    }

    @Test
    public void test03568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03568");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        room.SensorObserver sensorObserver5 = null;
        room4.addObserver(sensorObserver5);
        java.lang.String str7 = room4.toString();
        room.SensorObserver sensorObserver8 = null;
        room4.removeObserver(sensorObserver8);
        java.lang.String str10 = room4.getRoomNumber();
        int int11 = room4.getCapacity();
        java.lang.String str12 = room4.getRoomID();
        java.lang.Class<?> wildcardClass13 = room4.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str7, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test03569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03569");
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
        // The following exception was thrown during execution in test generation
        try {
            room4.notifyObservers();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi! - hi!" + "'", str12, "hi! - hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test03570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03570");
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
        room4.setUnderMaintenance(true);
        room4.setOccupied(false);
        room4.setUnderMaintenance(true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test03571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03571");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        java.lang.String str5 = room4.getScannedID();
        room4.setScannedID("hi!");
        room4.setUnderMaintenance(true);
        room4.notifyObservers();
        java.lang.String str11 = room4.toString();
        room4.setUnderMaintenance(true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str11, "Room hi! | hi! - hi! | Capacity: 0");
    }

    @Test
    public void test03572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03572");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        java.lang.String str5 = room4.getScannedID();
        room4.setScannedID("hi!");
        room4.setUnderMaintenance(true);
        java.lang.String str10 = room4.getScannedID();
        room4.setScannedID("Room hi! | hi! - hi! | Capacity: 0");
        boolean boolean13 = room4.isOccupied();
        room.SensorObserver sensorObserver14 = null;
        room4.removeObserver(sensorObserver14);
        room4.setOccupied(false);
        boolean boolean18 = room4.isOccupied();
        room4.setUnderMaintenance(false);
        room4.setScannedID("Room hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 1 - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi!");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test03573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03573");
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
        java.lang.String str15 = room4.getRoomID();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str7, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi! - hi!" + "'", str14, "hi! - hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test03574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03574");
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
        room.SensorObserver sensorObserver16 = null;
        room4.addObserver(sensorObserver16);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str11, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str13, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test03575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03575");
        room.Room room4 = new room.Room("Room hi! | hi! - hi! | Capacity: 0", (int) (byte) 10, "hi!", "");
        room.SensorObserver sensorObserver5 = null;
        room4.removeObserver(sensorObserver5);
        boolean boolean7 = room4.isOccupied();
        java.lang.String str8 = room4.toString();
        room.SensorObserver sensorObserver9 = null;
        room4.removeObserver(sensorObserver9);
        java.lang.String str11 = room4.getScannedID();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10" + "'", str8, "Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10");
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test03576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03576");
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
        boolean boolean15 = room4.isUnderMaintenance();
        java.lang.String str16 = room4.getScannedID();
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi! - hi!" + "'", str8, "hi! - hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi!" + "'", str16, "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi!");
    }

    @Test
    public void test03577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03577");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        java.lang.String str5 = room4.getScannedID();
        room4.setScannedID("hi!");
        room4.setUnderMaintenance(true);
        room4.setOccupied(true);
        room4.setOccupied(false);
        room.SensorObserver sensorObserver14 = null;
        room4.addObserver(sensorObserver14);
        java.lang.String str16 = room4.getRoomID();
        java.lang.String str17 = room4.getRoomNumber();
        boolean boolean18 = room4.isOccupied();
        // The following exception was thrown during execution in test generation
        try {
            room4.setUnderMaintenance(true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test03578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03578");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        java.lang.String str5 = room4.getScannedID();
        room4.setScannedID("hi!");
        room4.setUnderMaintenance(true);
        room4.setOccupied(true);
        java.lang.String str12 = room4.getRoomID();
        room4.setScannedID("Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 100");
        room4.notifyObservers();
        java.lang.String str16 = room4.getBuildingName();
        room4.setScannedID("Room  - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 100 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 | Capacity: 1");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test03579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03579");
        room.Room room4 = new room.Room("Room hi! -  | Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 10", (int) (byte) 100, "Room  - Room hi! | hi! - hi! | Capacity: 0 |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 0", "Room  - Room hi! | hi! - hi! | Capacity: 0 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 0 - ");
        java.lang.Class<?> wildcardClass5 = room4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test03580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03580");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        java.lang.String str5 = room4.getScannedID();
        room4.setScannedID("hi!");
        boolean boolean8 = room4.isEnabled();
        int int9 = room4.getCapacity();
        boolean boolean10 = room4.isOccupied();
        java.lang.String str11 = room4.getRoomNumber();
        boolean boolean12 = room4.isOccupied();
        room4.setOccupied(true);
        room4.setOccupied(true);
        java.lang.String str17 = room4.getRoomID();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test03581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03581");
        room.Room room4 = new room.Room("Room  | Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! | Capacity: 1", (int) (short) 1, " - Room hi! | hi! - hi! | Capacity: 0", "Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi!");
        room.SensorObserver sensorObserver5 = null;
        room4.addObserver(sensorObserver5);
        // The following exception was thrown during execution in test generation
        try {
            room4.setEnabled(false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03582");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        room.SensorObserver sensorObserver5 = null;
        room4.addObserver(sensorObserver5);
        java.lang.String str7 = room4.getScannedID();
        java.lang.String str8 = room4.getFullLocation();
        boolean boolean9 = room4.isOccupied();
        room.SensorObserver sensorObserver10 = null;
        room4.addObserver(sensorObserver10);
        java.lang.String str12 = room4.getBuildingName();
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi! - hi!" + "'", str8, "hi! - hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test03583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03583");
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
        room.SensorObserver sensorObserver17 = null;
        room4.addObserver(sensorObserver17);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str11, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test03584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03584");
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
        java.lang.String str19 = room4.getRoomNumber();
        java.lang.String str20 = room4.getBuildingName();
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str11, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi! - hi!" + "'", str14, "hi! - hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str15, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test03585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03585");
        room.Room room4 = new room.Room("hi!", (int) (byte) 100, "", "Room hi! | hi! - hi! | Capacity: 0");
        java.lang.String str5 = room4.getRoomNumber();
        room4.notifyObservers();
        boolean boolean7 = room4.isUnderMaintenance();
        room.SensorObserver sensorObserver8 = null;
        room4.addObserver(sensorObserver8);
        java.lang.String str10 = room4.getScannedID();
        // The following exception was thrown during execution in test generation
        try {
            room4.setUnderMaintenance(true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str5, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test03586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03586");
        room.Room room4 = new room.Room("hi!", (int) (byte) 100, "", "Room hi! | hi! - hi! | Capacity: 0");
        room4.setScannedID("");
        boolean boolean7 = room4.isOccupied();
        int int8 = room4.getCapacity();
        java.lang.String str9 = room4.getRoomNumber();
        java.lang.String str10 = room4.getFullLocation();
        java.lang.String str11 = room4.getRoomNumber();
        boolean boolean12 = room4.isEnabled();
        java.lang.Class<?> wildcardClass13 = room4.getClass();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str9, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + " - Room hi! | hi! - hi! | Capacity: 0" + "'", str10, " - Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str11, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test03587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03587");
        room.Room room4 = new room.Room("", (int) (short) 10, "Room hi! | hi! - hi! | Capacity: 0", "hi!");
        java.lang.String str5 = room4.toString();
        java.lang.String str6 = room4.getBuildingName();
        room.SensorObserver sensorObserver7 = null;
        room4.removeObserver(sensorObserver7);
        boolean boolean9 = room4.isEnabled();
        room.SensorObserver sensorObserver10 = null;
        room4.addObserver(sensorObserver10);
        java.lang.String str12 = room4.getRoomNumber();
        java.lang.String str13 = room4.toString();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10" + "'", str5, "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str6, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10" + "'", str13, "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10");
    }

    @Test
    public void test03588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03588");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        java.lang.String str5 = room4.getScannedID();
        room4.setScannedID("hi!");
        java.lang.String str8 = room4.getBuildingName();
        int int9 = room4.getCapacity();
        room.SensorObserver sensorObserver10 = null;
        room4.addObserver(sensorObserver10);
        java.lang.String str12 = room4.getScannedID();
        java.lang.String str13 = room4.getBuildingName();
        boolean boolean14 = room4.isUnderMaintenance();
        room.SensorObserver sensorObserver15 = null;
        room4.addObserver(sensorObserver15);
        java.lang.String str17 = room4.toString();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str17, "Room hi! | hi! - hi! | Capacity: 0");
    }

    @Test
    public void test03589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03589");
        room.Room room4 = new room.Room("Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100", (int) 'a', "hi! - hi!", "Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10");
        room.SensorObserver sensorObserver5 = null;
        room4.removeObserver(sensorObserver5);
        java.lang.String str7 = room4.getBuildingName();
        room4.notifyObservers();
        room4.notifyObservers();
        java.lang.String str10 = room4.toString();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi! - hi!" + "'", str7, "hi! - hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 97" + "'", str10, "Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 97");
    }

    @Test
    public void test03590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03590");
        room.Room room4 = new room.Room("Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 100 | hi! - hi! - hi! - hi! | Capacity: 0", 1, "", "Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi!");
        java.lang.String str5 = room4.getScannedID();
        boolean boolean6 = room4.isEnabled();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test03591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03591");
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
        room4.setScannedID(" - hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi!");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi! - hi!" + "'", str11, "hi! - hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi! - hi!" + "'", str14, "hi! - hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test03592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03592");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        room.SensorObserver sensorObserver5 = null;
        room4.addObserver(sensorObserver5);
        java.lang.String str7 = room4.getScannedID();
        room.SensorObserver sensorObserver8 = null;
        room4.removeObserver(sensorObserver8);
        java.lang.String str10 = room4.getRoomNumber();
        java.lang.String str11 = room4.getBuildingName();
        java.lang.String str12 = room4.getRoomNumber();
        room4.setOccupied(false);
        java.lang.String str15 = room4.getScannedID();
        room.SensorObserver sensorObserver16 = null;
        room4.addObserver(sensorObserver16);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test03593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03593");
        room.Room room4 = new room.Room("hi!", (int) (byte) 100, "", "Room hi! | hi! - hi! | Capacity: 0");
        room4.setScannedID("");
        boolean boolean7 = room4.isOccupied();
        int int8 = room4.getCapacity();
        boolean boolean9 = room4.isEnabled();
        java.lang.String str10 = room4.getRoomID();
        boolean boolean11 = room4.isUnderMaintenance();
        java.lang.String str12 = room4.getScannedID();
        boolean boolean13 = room4.isOccupied();
        java.lang.String str14 = room4.getRoomID();
        java.lang.String str15 = room4.toString();
        room4.setScannedID("Room hi! | Room hi! | hi! - hi! | Capacity: 0 - hi! - Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 1");
        java.lang.String str18 = room4.getBuildingName();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100" + "'", str15, "Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test03594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03594");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        java.lang.String str5 = room4.getScannedID();
        room4.setScannedID("hi!");
        room4.setUnderMaintenance(true);
        room4.setOccupied(true);
        room4.setScannedID("Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100");
        room4.setEnabled(false);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test03595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03595");
        room.Room room4 = new room.Room("hi!", (int) (byte) 100, "", "Room hi! | hi! - hi! | Capacity: 0");
        java.lang.String str5 = room4.getScannedID();
        java.lang.String str6 = room4.getBuildingName();
        room4.setScannedID(" - Room hi! | hi! - hi! | Capacity: 0");
        java.lang.Class<?> wildcardClass9 = room4.getClass();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test03596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03596");
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
        room.SensorObserver sensorObserver17 = null;
        room4.addObserver(sensorObserver17);
        java.lang.String str19 = room4.getBuildingName();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str7, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi! - hi!" + "'", str12, "hi! - hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test03597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03597");
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
        room4.notifyObservers();
        room.SensorObserver sensorObserver22 = null;
        room4.removeObserver(sensorObserver22);
        java.lang.Class<?> wildcardClass24 = room4.getClass();
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str11, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test03598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03598");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        java.lang.String str5 = room4.getScannedID();
        room4.setScannedID("hi!");
        room4.setUnderMaintenance(true);
        room4.setOccupied(true);
        boolean boolean12 = room4.isEnabled();
        java.lang.String str13 = room4.getRoomID();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test03599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03599");
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
        java.lang.String str16 = room4.toString();
        java.lang.String str17 = room4.getScannedID();
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str11, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str13, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str16, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test03600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03600");
        room.Room room4 = new room.Room("Room hi! - hi! - hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 1 | Capacity: 0", (-1), "Room hi! | hi! - hi! | Capacity: 0 - hi! - hi!", "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10");
        java.lang.String str5 = room4.getScannedID();
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test03601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03601");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        room.SensorObserver sensorObserver5 = null;
        room4.addObserver(sensorObserver5);
        java.lang.String str7 = room4.toString();
        java.lang.String str8 = room4.toString();
        boolean boolean9 = room4.isOccupied();
        boolean boolean10 = room4.isOccupied();
        // The following exception was thrown during execution in test generation
        try {
            room4.setEnabled(true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str7, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str8, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test03602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03602");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        java.lang.String str5 = room4.getScannedID();
        room4.setScannedID("hi!");
        boolean boolean8 = room4.isEnabled();
        int int9 = room4.getCapacity();
        boolean boolean10 = room4.isOccupied();
        room4.notifyObservers();
        boolean boolean12 = room4.isEnabled();
        java.lang.String str13 = room4.toString();
        room4.setOccupied(false);
        boolean boolean16 = room4.isOccupied();
        room4.setUnderMaintenance(false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str13, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test03603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03603");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        java.lang.String str5 = room4.getScannedID();
        room4.setScannedID("hi!");
        room4.setUnderMaintenance(true);
        java.lang.String str10 = room4.getScannedID();
        room4.setScannedID("Room hi! | hi! - hi! | Capacity: 0");
        boolean boolean13 = room4.isOccupied();
        java.lang.String str14 = room4.getRoomID();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test03604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03604");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        room.SensorObserver sensorObserver5 = null;
        room4.addObserver(sensorObserver5);
        java.lang.String str7 = room4.getScannedID();
        java.lang.String str8 = room4.getFullLocation();
        boolean boolean9 = room4.isOccupied();
        boolean boolean10 = room4.isUnderMaintenance();
        java.lang.String str11 = room4.getRoomID();
        boolean boolean12 = room4.isOccupied();
        boolean boolean13 = room4.isUnderMaintenance();
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi! - hi!" + "'", str8, "hi! - hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test03605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03605");
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
        java.lang.Class<?> wildcardClass14 = room4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10" + "'", str5, "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str6, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test03606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03606");
        room.Room room4 = new room.Room("Room hi! | hi! - hi! | Capacity: 0", (int) (byte) 100, "Room hi! | hi! - hi! | Capacity: 0 - hi!", "hi!");
        java.lang.String str5 = room4.getRoomID();
        int int6 = room4.getCapacity();
        room.SensorObserver sensorObserver7 = null;
        room4.addObserver(sensorObserver7);
        // The following exception was thrown during execution in test generation
        try {
            room4.setScannedID("Room Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 | hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 0 - hi! - hi! - Room hi! | hi! - hi! | Capacity: 0 -  - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! | Room Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 1 - Room hi! | hi! - hi! | Capacity: 0 - hi! |  -  | Capacity: 35 - Room Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 100 | Capacity: 32");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str5, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
    }

    @Test
    public void test03607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03607");
        room.Room room4 = new room.Room("hi!", (int) (byte) 100, "", "Room hi! | hi! - hi! | Capacity: 0");
        java.lang.String str5 = room4.getScannedID();
        java.lang.String str6 = room4.getBuildingName();
        room4.setUnderMaintenance(false);
        room4.setScannedID("Room hi! | hi! - hi! | Capacity: 0 - hi! - ");
        room4.setScannedID("");
        java.lang.String str13 = room4.toString();
        boolean boolean14 = room4.isOccupied();
        java.lang.String str15 = room4.getRoomNumber();
        boolean boolean16 = room4.isEnabled();
        java.lang.String str17 = room4.getRoomNumber();
        boolean boolean18 = room4.isOccupied();
        room4.setScannedID("Room Room  - Room hi! | hi! - hi! | Capacity: 0 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 0 | Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 - Room hi! | Room hi! | hi! - hi! | Capacity: 0 - hi! - Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 1 | Capacity: -1");
        java.lang.Class<?> wildcardClass21 = room4.getClass();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100" + "'", str13, "Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str15, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str17, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test03608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03608");
        room.Room room4 = new room.Room("Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10", 1, "Room  - Room hi! | hi! - hi! | Capacity: 0 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 0 - hi!", "Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10");
        room.SensorObserver sensorObserver5 = null;
        room4.addObserver(sensorObserver5);
        java.lang.String str7 = room4.toString();
        // The following exception was thrown during execution in test generation
        try {
            room4.setUnderMaintenance(false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Room Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Room  - Room hi! | hi! - hi! | Capacity: 0 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 0 - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 1" + "'", str7, "Room Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Room  - Room hi! | hi! - hi! | Capacity: 0 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 0 - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 1");
    }

    @Test
    public void test03609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03609");
        room.Room room4 = new room.Room("Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - hi! | Capacity: 1", 52, "hi! - Room hi! | hi! - hi! | Capacity: 0", "Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi!");
        java.lang.String str5 = room4.getFullLocation();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi! - Room hi! | hi! - hi! | Capacity: 0 - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi!" + "'", str5, "hi! - Room hi! | hi! - hi! | Capacity: 0 - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi!");
    }

    @Test
    public void test03610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03610");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        java.lang.String str5 = room4.getScannedID();
        room4.setScannedID("hi!");
        java.lang.String str8 = room4.getBuildingName();
        java.lang.String str9 = room4.getFullLocation();
        java.lang.String str10 = room4.getRoomNumber();
        int int11 = room4.getCapacity();
        java.lang.String str12 = room4.getScannedID();
        boolean boolean13 = room4.isUnderMaintenance();
        java.lang.String str14 = room4.getScannedID();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi! - hi!" + "'", str9, "hi! - hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test03611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03611");
        room.Room room4 = new room.Room("hi!", (int) (byte) 100, "", "Room hi! | hi! - hi! | Capacity: 0");
        java.lang.String str5 = room4.getScannedID();
        java.lang.String str6 = room4.getBuildingName();
        room4.setUnderMaintenance(false);
        room4.setScannedID("Room hi! | hi! - hi! | Capacity: 0 - hi! - ");
        room4.setScannedID("");
        room4.setEnabled(false);
        boolean boolean15 = room4.isOccupied();
        java.lang.String str16 = room4.getRoomID();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test03612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03612");
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
            room4.setScannedID("Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! - Room hi! | hi! - hi! | Capacity: 0 - hi!");
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
    public void test03613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03613");
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
        room4.setEnabled(false);
        boolean boolean19 = room4.isEnabled();
        room.SensorObserver sensorObserver20 = null;
        room4.removeObserver(sensorObserver20);
        room.SensorObserver sensorObserver22 = null;
        room4.removeObserver(sensorObserver22);
        room4.setScannedID("Room hi! | hi! - hi! | Capacity: 0 - hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 100 - Room hi! | hi! - hi! | Capacity: 0 - hi! - ");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str7, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str10, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str14, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi! - hi!" + "'", str16, "hi! - hi!");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test03614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03614");
        room.Room room4 = new room.Room("hi!", (int) '#', "Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10", "Room hi! | hi! - hi! | Capacity: 0 - hi!");
        boolean boolean5 = room4.isOccupied();
        java.lang.String str6 = room4.getFullLocation();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - Room hi! | hi! - hi! | Capacity: 0 - hi!" + "'", str6, "Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - Room hi! | hi! - hi! | Capacity: 0 - hi!");
    }

    @Test
    public void test03615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03615");
        room.Room room4 = new room.Room("hi!", (int) (byte) 1, "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10", "hi!");
        java.lang.String str5 = room4.getBuildingName();
        java.lang.String str6 = room4.toString();
        boolean boolean7 = room4.isUnderMaintenance();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10" + "'", str5, "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Room hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 1" + "'", str6, "Room hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 1");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test03616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03616");
        room.Room room4 = new room.Room("Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 100", 0, "hi! - hi! - hi!", "hi!");
        room4.setEnabled(true);
        boolean boolean7 = room4.isUnderMaintenance();
        java.lang.String str8 = room4.getRoomNumber();
        java.lang.String str9 = room4.getScannedID();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test03617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03617");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        java.lang.String str5 = room4.getScannedID();
        room4.setScannedID("hi!");
        boolean boolean8 = room4.isEnabled();
        int int9 = room4.getCapacity();
        int int10 = room4.getCapacity();
        boolean boolean11 = room4.isOccupied();
        room4.setEnabled(false);
        room4.notifyObservers();
        java.lang.String str15 = room4.getScannedID();
        java.lang.String str16 = room4.getRoomID();
        room4.notifyObservers();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test03618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03618");
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
        java.lang.Class<?> wildcardClass18 = room4.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str7, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test03619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03619");
        room.Room room4 = new room.Room(" - Room hi! | hi! - hi! | Capacity: 0", 0, "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10", "Room hi! | hi! - hi! | Capacity: 0 - hi! - ");
        java.lang.String str5 = room4.toString();
        room.SensorObserver sensorObserver6 = null;
        room4.addObserver(sensorObserver6);
        boolean boolean8 = room4.isEnabled();
        java.lang.String str9 = room4.getRoomID();
        // The following exception was thrown during execution in test generation
        try {
            room4.setEnabled(true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Room  - Room hi! | hi! - hi! | Capacity: 0 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 0" + "'", str5, "Room  - Room hi! | hi! - hi! | Capacity: 0 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 0");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + " - Room hi! | hi! - hi! | Capacity: 0" + "'", str9, " - Room hi! | hi! - hi! | Capacity: 0");
    }

    @Test
    public void test03620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03620");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        boolean boolean5 = room4.isOccupied();
        room4.setEnabled(false);
        java.lang.String str8 = room4.toString();
        room4.setOccupied(true);
        room4.setOccupied(false);
        java.lang.String str13 = room4.getRoomID();
        boolean boolean14 = room4.isOccupied();
        room4.setEnabled(true);
        room4.setEnabled(false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str8, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test03621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03621");
        room.Room room4 = new room.Room("Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi!", 10, "Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10", "hi!");
        java.lang.String str5 = room4.getScannedID();
        room4.setEnabled(false);
        room4.notifyObservers();
        java.lang.String str9 = room4.toString();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Room Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! | Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! | Capacity: 10" + "'", str9, "Room Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! | Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! | Capacity: 10");
    }

    @Test
    public void test03622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03622");
        room.Room room4 = new room.Room("", (int) (short) 10, "Room hi! | hi! - hi! | Capacity: 0", "hi!");
        java.lang.String str5 = room4.toString();
        room4.setUnderMaintenance(true);
        room4.setScannedID("");
        java.lang.Class<?> wildcardClass10 = room4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10" + "'", str5, "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test03623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03623");
        room.Room room4 = new room.Room("", (int) (short) 10, "Room hi! | hi! - hi! | Capacity: 0", "hi!");
        java.lang.String str5 = room4.toString();
        java.lang.String str6 = room4.getBuildingName();
        java.lang.String str7 = room4.getFullLocation();
        boolean boolean8 = room4.isEnabled();
        boolean boolean9 = room4.isOccupied();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10" + "'", str5, "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str6, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0 - hi!" + "'", str7, "Room hi! | hi! - hi! | Capacity: 0 - hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test03624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03624");
        room.Room room4 = new room.Room("hi!", (int) (short) 0, "hi! - hi!", "Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100");
        java.lang.String str5 = room4.getScannedID();
        java.lang.String str6 = room4.toString();
        room4.setUnderMaintenance(false);
        java.lang.String str9 = room4.getBuildingName();
        java.lang.String str10 = room4.getRoomNumber();
        java.lang.String str11 = room4.getFullLocation();
        room.SensorObserver sensorObserver12 = null;
        room4.addObserver(sensorObserver12);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Room hi! | hi! - hi! - Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | Capacity: 0" + "'", str6, "Room hi! | hi! - hi! - Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi! - hi!" + "'", str9, "hi! - hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100" + "'", str10, "Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi! - hi! - Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100" + "'", str11, "hi! - hi! - Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100");
    }

    @Test
    public void test03625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03625");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        room.SensorObserver sensorObserver5 = null;
        room4.addObserver(sensorObserver5);
        java.lang.String str7 = room4.toString();
        room.SensorObserver sensorObserver8 = null;
        room4.removeObserver(sensorObserver8);
        java.lang.String str10 = room4.toString();
        java.lang.String str11 = room4.getRoomID();
        room4.setEnabled(true);
        boolean boolean14 = room4.isOccupied();
        room4.setEnabled(false);
        boolean boolean17 = room4.isOccupied();
        java.lang.Class<?> wildcardClass18 = room4.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str7, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str10, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test03626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03626");
        room.Room room4 = new room.Room("", (int) ' ', "Room hi! | hi! - hi! | Capacity: 0 - hi! - hi!", "Room Room hi! | hi! - hi! | Capacity: 0 | hi! - hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 97");
        java.lang.String str5 = room4.getScannedID();
        room.SensorObserver sensorObserver6 = null;
        room4.addObserver(sensorObserver6);
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
    public void test03627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03627");
        room.Room room4 = new room.Room("Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10", 32, "", "hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10");
        room4.setEnabled(true);
        java.lang.Class<?> wildcardClass7 = room4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test03628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03628");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        java.lang.String str5 = room4.getScannedID();
        room4.setScannedID("hi!");
        room4.setUnderMaintenance(true);
        java.lang.String str10 = room4.getScannedID();
        java.lang.String str11 = room4.getFullLocation();
        room4.setScannedID("Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi!");
        room.SensorObserver sensorObserver14 = null;
        room4.removeObserver(sensorObserver14);
        boolean boolean16 = room4.isUnderMaintenance();
        java.lang.String str17 = room4.getFullLocation();
        java.lang.String str18 = room4.getRoomID();
        java.lang.String str19 = room4.getScannedID();
        java.lang.String str20 = room4.getScannedID();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi! - hi!" + "'", str11, "hi! - hi!");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi! - hi!" + "'", str17, "hi! - hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi!" + "'", str19, "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi!" + "'", str20, "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi!");
    }

    @Test
    public void test03629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03629");
        room.Room room4 = new room.Room("Room Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! - hi! - hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: -1", 35, "Room hi! - hi! - hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 0", "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room hi! | hi! - hi! | Capacity: 0");
    }

    @Test
    public void test03630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03630");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        java.lang.String str5 = room4.getScannedID();
        room4.setScannedID("hi!");
        room4.setUnderMaintenance(true);
        java.lang.String str10 = room4.getScannedID();
        java.lang.String str11 = room4.getFullLocation();
        room4.setUnderMaintenance(true);
        java.lang.String str14 = room4.getFullLocation();
        java.lang.String str15 = room4.getRoomID();
        room4.setScannedID("Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10");
        room4.setScannedID("");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi! - hi!" + "'", str11, "hi! - hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi! - hi!" + "'", str14, "hi! - hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test03631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03631");
        room.Room room4 = new room.Room("Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100", 0, "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi!", "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10");
        java.lang.String str5 = room4.getBuildingName();
        boolean boolean6 = room4.isEnabled();
        room4.setEnabled(false);
        boolean boolean9 = room4.isOccupied();
        room.SensorObserver sensorObserver10 = null;
        room4.removeObserver(sensorObserver10);
        java.lang.String str12 = room4.getScannedID();
        java.lang.Class<?> wildcardClass13 = room4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi!" + "'", str5, "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test03632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03632");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        room.SensorObserver sensorObserver5 = null;
        room4.addObserver(sensorObserver5);
        java.lang.String str7 = room4.getScannedID();
        java.lang.String str8 = room4.getRoomNumber();
        java.lang.String str9 = room4.getRoomNumber();
        room.SensorObserver sensorObserver10 = null;
        room4.removeObserver(sensorObserver10);
        java.lang.String str12 = room4.getRoomNumber();
        boolean boolean13 = room4.isUnderMaintenance();
        room4.setUnderMaintenance(true);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test03633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03633");
        room.Room room4 = new room.Room("Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100", (int) (short) 1, "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi!", "Room hi! | hi! - hi! | Capacity: 0");
        room4.notifyObservers();
        room4.setEnabled(false);
        room4.setOccupied(false);
        room4.setOccupied(false);
        int int12 = room4.getCapacity();
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test03634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03634");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        boolean boolean5 = room4.isOccupied();
        java.lang.String str6 = room4.toString();
        java.lang.String str7 = room4.toString();
        java.lang.String str8 = room4.toString();
        java.lang.String str9 = room4.toString();
        room4.setScannedID("Room hi! | hi! - hi! | Capacity: 0 - hi! - hi!");
        java.lang.String str12 = room4.getFullLocation();
        java.lang.String str13 = room4.getRoomID();
        java.lang.String str14 = room4.getScannedID();
        room4.notifyObservers();
        room4.setScannedID("Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | hi! - hi! | Capacity: 0 - hi! - ");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str6, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str7, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str8, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str9, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi! - hi!" + "'", str12, "hi! - hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0 - hi! - hi!" + "'", str14, "Room hi! | hi! - hi! | Capacity: 0 - hi! - hi!");
    }

    @Test
    public void test03635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03635");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        java.lang.String str5 = room4.getScannedID();
        room4.setScannedID("hi!");
        room4.setUnderMaintenance(true);
        java.lang.String str10 = room4.getScannedID();
        java.lang.String str11 = room4.getFullLocation();
        room4.setEnabled(true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi! - hi!" + "'", str11, "hi! - hi!");
    }

    @Test
    public void test03636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03636");
        room.Room room4 = new room.Room("hi! - hi! - hi!", (int) 'a', "Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 | hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 0", "Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi!");
        room4.setScannedID("Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100");
        room4.setOccupied(false);
    }

    @Test
    public void test03637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03637");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        boolean boolean5 = room4.isOccupied();
        java.lang.String str6 = room4.toString();
        java.lang.String str7 = room4.toString();
        room4.setScannedID("Room hi! | hi! - hi! | Capacity: 0");
        boolean boolean10 = room4.isOccupied();
        java.lang.String str11 = room4.getRoomID();
        java.lang.String str12 = room4.getScannedID();
        room4.notifyObservers();
        room4.setEnabled(false);
        java.lang.String str16 = room4.getBuildingName();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str6, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str7, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str12, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test03638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03638");
        room.Room room4 = new room.Room("Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 100 - Room hi! | hi! - hi! | Capacity: 0 - hi! - ", 0, "Room hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 1", "Room hi! | hi! - hi! - Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | Capacity: 0");
        java.lang.String str5 = room4.getFullLocation();
        boolean boolean6 = room4.isEnabled();
        boolean boolean7 = room4.isEnabled();
        room4.setUnderMaintenance(false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Room hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 1 - Room hi! | hi! - hi! - Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | Capacity: 0" + "'", str5, "Room hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 1 - Room hi! | hi! - hi! - Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | Capacity: 0");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test03639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03639");
        room.Room room4 = new room.Room("hi!", (int) (short) 1, "hi! - Room hi! | hi! - hi! | Capacity: 0", "Room hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 1 - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi!");
        java.lang.String str5 = room4.toString();
        int int6 = room4.getCapacity();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Room hi! | hi! - Room hi! | hi! - hi! | Capacity: 0 - Room hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 1 - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! | Capacity: 1" + "'", str5, "Room hi! | hi! - Room hi! | hi! - hi! | Capacity: 0 - Room hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 1 - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! | Capacity: 1");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test03640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03640");
        room.Room room4 = new room.Room("Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100", (int) 'a', "hi! - hi!", "Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10");
        int int5 = room4.getCapacity();
        room4.setScannedID("");
        java.lang.String str8 = room4.toString();
        boolean boolean9 = room4.isUnderMaintenance();
        room.SensorObserver sensorObserver10 = null;
        room4.addObserver(sensorObserver10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 97" + "'", str8, "Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 97");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test03641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03641");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        java.lang.String str5 = room4.getScannedID();
        room4.setScannedID("hi!");
        room4.setUnderMaintenance(true);
        java.lang.String str10 = room4.getScannedID();
        int int11 = room4.getCapacity();
        java.lang.String str12 = room4.getBuildingName();
        java.lang.String str13 = room4.getRoomNumber();
        room4.setOccupied(true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test03642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03642");
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
        boolean boolean18 = room4.isEnabled();
        java.lang.String str19 = room4.getBuildingName();
        java.lang.Class<?> wildcardClass20 = room4.getClass();
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
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test03643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03643");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        java.lang.String str5 = room4.getScannedID();
        room4.setScannedID("hi!");
        room4.setUnderMaintenance(true);
        boolean boolean10 = room4.isOccupied();
        boolean boolean11 = room4.isOccupied();
        java.lang.String str12 = room4.getFullLocation();
        java.lang.String str13 = room4.getScannedID();
        boolean boolean14 = room4.isEnabled();
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
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi! - hi!" + "'", str12, "hi! - hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test03644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03644");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        boolean boolean5 = room4.isOccupied();
        room4.setEnabled(false);
        java.lang.String str8 = room4.toString();
        room4.setUnderMaintenance(true);
        room4.setEnabled(true);
        room4.setScannedID("Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10");
        java.lang.String str15 = room4.getScannedID();
        boolean boolean16 = room4.isEnabled();
        java.lang.String str17 = room4.getFullLocation();
        room.SensorObserver sensorObserver18 = null;
        room4.removeObserver(sensorObserver18);
        room4.setEnabled(true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str8, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10" + "'", str15, "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi! - hi!" + "'", str17, "hi! - hi!");
    }

    @Test
    public void test03645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03645");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        room.SensorObserver sensorObserver5 = null;
        room4.addObserver(sensorObserver5);
        room.SensorObserver sensorObserver7 = null;
        room4.addObserver(sensorObserver7);
        java.lang.String str9 = room4.getBuildingName();
        java.lang.String str10 = room4.getRoomNumber();
        boolean boolean11 = room4.isEnabled();
        java.lang.String str12 = room4.getScannedID();
        // The following exception was thrown during execution in test generation
        try {
            room4.setEnabled(false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test03646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03646");
        room.Room room4 = new room.Room("Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10", (-1), "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 100", "Room hi! | hi! - hi! | Capacity: 0 - hi! - ");
        room4.setUnderMaintenance(true);
        room4.setScannedID("Room hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 1 - Room hi! | hi! - hi! - Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | Capacity: 0");
        room4.setScannedID("Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 100 | hi! - hi! - hi! - hi! | Capacity: 0 -  | Capacity: 1");
    }

    @Test
    public void test03647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03647");
        room.Room room4 = new room.Room("", (int) (short) 10, "Room hi! | hi! - hi! | Capacity: 0", "hi!");
        room4.setEnabled(false);
        java.lang.String str7 = room4.toString();
        java.lang.String str8 = room4.getBuildingName();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10" + "'", str7, "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str8, "Room hi! | hi! - hi! | Capacity: 0");
    }

    @Test
    public void test03648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03648");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        room.SensorObserver sensorObserver5 = null;
        room4.addObserver(sensorObserver5);
        room.SensorObserver sensorObserver7 = null;
        room4.addObserver(sensorObserver7);
        java.lang.String str9 = room4.getFullLocation();
        java.lang.String str10 = room4.getRoomNumber();
        int int11 = room4.getCapacity();
        // The following exception was thrown during execution in test generation
        try {
            room4.setEnabled(true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi! - hi!" + "'", str9, "hi! - hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test03649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03649");
        room.Room room4 = new room.Room("Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 97", (int) (byte) 1, "Room hi! | hi! - hi! | Capacity: 0 - hi! - hi!", "Room hi! | Room hi! | hi! - hi! | Capacity: 0 - hi! - Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 1");
        int int5 = room4.getCapacity();
        boolean boolean6 = room4.isOccupied();
        room4.notifyObservers();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test03650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03650");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        room.SensorObserver sensorObserver5 = null;
        room4.addObserver(sensorObserver5);
        java.lang.String str7 = room4.toString();
        java.lang.String str8 = room4.toString();
        java.lang.String str9 = room4.getBuildingName();
        boolean boolean10 = room4.isUnderMaintenance();
        java.lang.String str11 = room4.getRoomID();
        java.lang.String str12 = room4.getRoomID();
        java.lang.String str13 = room4.getFullLocation();
        int int14 = room4.getCapacity();
        // The following exception was thrown during execution in test generation
        try {
            room4.setScannedID("hi! -  - Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 1");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str7, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str8, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi! - hi!" + "'", str13, "hi! - hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test03651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03651");
        room.Room room4 = new room.Room("Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 100", 0, "hi! - hi! - hi!", "hi!");
        room4.setEnabled(true);
        java.lang.String str7 = room4.getRoomNumber();
        room.SensorObserver sensorObserver8 = null;
        room4.addObserver(sensorObserver8);
        java.lang.String str10 = room4.getRoomNumber();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test03652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03652");
        room.Room room4 = new room.Room("Room Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! - hi! - hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: -1 - Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 | hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 0", (int) (byte) 10, "Room Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 1 - Room hi! | hi! - hi! | Capacity: 0 - hi! |  -  | Capacity: 35", "Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 100 | hi! - hi! - hi! - hi! | Capacity: 0");
    }

    @Test
    public void test03653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03653");
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
        boolean boolean17 = room4.isOccupied();
        int int18 = room4.getCapacity();
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
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test03654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03654");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        java.lang.String str5 = room4.getScannedID();
        room4.setScannedID("hi!");
        room4.setUnderMaintenance(true);
        java.lang.String str10 = room4.getScannedID();
        room4.setScannedID("Room hi! | hi! - hi! | Capacity: 0");
        boolean boolean13 = room4.isOccupied();
        room.SensorObserver sensorObserver14 = null;
        room4.removeObserver(sensorObserver14);
        java.lang.String str16 = room4.toString();
        room4.setScannedID("Room Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 97 | Room hi! | hi! - hi! | Capacity: 0 - hi! - hi! - Room hi! | Room hi! | hi! - hi! | Capacity: 0 - hi! - Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 1 | Capacity: 1");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str16, "Room hi! | hi! - hi! | Capacity: 0");
    }

    @Test
    public void test03655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03655");
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
        room.SensorObserver sensorObserver16 = null;
        room4.removeObserver(sensorObserver16);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100" + "'", str8, "Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test03656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03656");
        room.Room room4 = new room.Room("Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | hi! - hi! - hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 0", (int) (short) 1, "Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi!", "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi!");
        room4.setOccupied(true);
    }

    @Test
    public void test03657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03657");
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
        room4.setEnabled(true);
        room4.setOccupied(false);
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
    public void test03658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03658");
        room.Room room4 = new room.Room("hi!", (int) (byte) 100, "", "Room hi! | hi! - hi! | Capacity: 0");
        java.lang.String str5 = room4.getBuildingName();
        java.lang.String str6 = room4.toString();
        java.lang.String str7 = room4.getRoomNumber();
        java.lang.String str8 = room4.getFullLocation();
        boolean boolean9 = room4.isEnabled();
        java.lang.String str10 = room4.getScannedID();
        java.lang.String str11 = room4.getRoomID();
        java.lang.String str12 = room4.getRoomNumber();
        room4.setOccupied(true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100" + "'", str6, "Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str7, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + " - Room hi! | hi! - hi! | Capacity: 0" + "'", str8, " - Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str12, "Room hi! | hi! - hi! | Capacity: 0");
    }

    @Test
    public void test03659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03659");
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
        java.lang.String str15 = room4.getScannedID();
        room.SensorObserver sensorObserver16 = null;
        room4.addObserver(sensorObserver16);
        room.SensorObserver sensorObserver18 = null;
        room4.addObserver(sensorObserver18);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str11, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str15, "Room hi! | hi! - hi! | Capacity: 0");
    }

    @Test
    public void test03660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03660");
        room.Room room4 = new room.Room("Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100", 97, "Room hi! | hi! - hi! | Capacity: 0 - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! - hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 97", "Room hi! | hi! - hi! | Capacity: 0 - hi!");
        java.lang.String str5 = room4.getRoomNumber();
        java.lang.String str6 = room4.getRoomID();
        java.lang.String str7 = room4.getScannedID();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0 - hi!" + "'", str5, "Room hi! | hi! - hi! | Capacity: 0 - hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100" + "'", str6, "Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100");
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test03661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03661");
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
        boolean boolean18 = room4.isUnderMaintenance();
        java.lang.String str19 = room4.getRoomNumber();
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi! - hi!" + "'", str12, "hi! - hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str16, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test03662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03662");
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
        // The following exception was thrown during execution in test generation
        try {
            room4.setEnabled(true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test03663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03663");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        room.SensorObserver sensorObserver5 = null;
        room4.addObserver(sensorObserver5);
        java.lang.String str7 = room4.toString();
        java.lang.String str8 = room4.toString();
        java.lang.String str9 = room4.getBuildingName();
        int int10 = room4.getCapacity();
        boolean boolean11 = room4.isOccupied();
        java.lang.String str12 = room4.getScannedID();
        java.lang.String str13 = room4.getFullLocation();
        java.lang.String str14 = room4.getScannedID();
        java.lang.String str15 = room4.getBuildingName();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str7, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str8, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi! - hi!" + "'", str13, "hi! - hi!");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test03664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03664");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        boolean boolean5 = room4.isOccupied();
        room4.setEnabled(false);
        java.lang.String str8 = room4.getFullLocation();
        java.lang.String str9 = room4.getRoomID();
        boolean boolean10 = room4.isUnderMaintenance();
        boolean boolean11 = room4.isOccupied();
        int int12 = room4.getCapacity();
        boolean boolean13 = room4.isEnabled();
        boolean boolean14 = room4.isOccupied();
        room4.setScannedID("");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi! - hi!" + "'", str8, "hi! - hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test03665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03665");
        room.Room room4 = new room.Room("Room hi! | hi! - hi! | Capacity: 0 - hi! - ", (int) '4', "hi! - ", "Room  - Room hi! | hi! - hi! | Capacity: 0 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 0");
        room4.setEnabled(false);
        int int7 = room4.getCapacity();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
    }

    @Test
    public void test03666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03666");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        java.lang.String str5 = room4.getScannedID();
        room4.setScannedID("hi!");
        room4.setUnderMaintenance(true);
        room.SensorObserver sensorObserver10 = null;
        room4.addObserver(sensorObserver10);
        room.SensorObserver sensorObserver12 = null;
        room4.addObserver(sensorObserver12);
        java.lang.String str14 = room4.toString();
        java.lang.String str15 = room4.getFullLocation();
        room.SensorObserver sensorObserver16 = null;
        room4.removeObserver(sensorObserver16);
        // The following exception was thrown during execution in test generation
        try {
            room4.setEnabled(false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str14, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi! - hi!" + "'", str15, "hi! - hi!");
    }

    @Test
    public void test03667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03667");
        room.Room room4 = new room.Room("Room Room hi! | hi! - hi! | Capacity: 0 | Room hi! | hi! - hi! | Capacity: 0 - hi! - hi! | Capacity: 100", (int) '4', "Room hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 1", "hi! - hi! - Room hi! | hi! - hi! | Capacity: 0");
        room.SensorObserver sensorObserver5 = null;
        room4.removeObserver(sensorObserver5);
        boolean boolean7 = room4.isEnabled();
        java.lang.Class<?> wildcardClass8 = room4.getClass();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test03668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03668");
        room.Room room4 = new room.Room("hi! - hi!", 100, "", "");
        java.lang.Class<?> wildcardClass5 = room4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test03669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03669");
        room.Room room4 = new room.Room("Room Room hi! | hi! - hi! | Capacity: 0 - hi! | Room  - Room hi! | hi! - hi! | Capacity: 0 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 0 - hi! | Capacity: 52", (int) (byte) -1, "hi! - ", "Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 97");
    }

    @Test
    public void test03670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03670");
        room.Room room4 = new room.Room("Room hi! | hi! - hi! | Capacity: 0 - hi!", (int) '4', "Room  - Room hi! | hi! - hi! | Capacity: 0 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 0", "hi!");
        boolean boolean5 = room4.isUnderMaintenance();
        boolean boolean6 = room4.isOccupied();
        room4.setOccupied(false);
        room.SensorObserver sensorObserver9 = null;
        room4.removeObserver(sensorObserver9);
        java.lang.String str11 = room4.toString();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Room Room hi! | hi! - hi! | Capacity: 0 - hi! | Room  - Room hi! | hi! - hi! | Capacity: 0 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 0 - hi! | Capacity: 52" + "'", str11, "Room Room hi! | hi! - hi! | Capacity: 0 - hi! | Room  - Room hi! | hi! - hi! | Capacity: 0 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 0 - hi! | Capacity: 52");
    }

    @Test
    public void test03671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03671");
        room.Room room4 = new room.Room("Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi!", 100, "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10", "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi!");
        room4.setUnderMaintenance(true);
        boolean boolean7 = room4.isEnabled();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test03672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03672");
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
        java.lang.String str22 = room4.getScannedID();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + " - Room hi! | hi! - hi! | Capacity: 0" + "'", str21, " - Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str22, "Room hi! | hi! - hi! | Capacity: 0");
    }

    @Test
    public void test03673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03673");
        room.Room room4 = new room.Room("Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100", (int) (short) 1, "", "Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi!");
        java.lang.String str5 = room4.getBuildingName();
        java.lang.String str6 = room4.getFullLocation();
        boolean boolean7 = room4.isEnabled();
        java.lang.String str8 = room4.getBuildingName();
        room4.setEnabled(true);
        room4.notifyObservers();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + " - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi!" + "'", str6, " - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test03674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03674");
        room.Room room4 = new room.Room("hi!", (int) (byte) 1, "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10", "hi!");
        room4.setEnabled(false);
        room.SensorObserver sensorObserver7 = null;
        room4.addObserver(sensorObserver7);
        boolean boolean9 = room4.isOccupied();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test03675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03675");
        room.Room room4 = new room.Room("hi! - hi!", 1, "Room  - Room hi! | hi! - hi! | Capacity: 0 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 0 - hi!", "Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10");
    }

    @Test
    public void test03676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03676");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        java.lang.String str5 = room4.getScannedID();
        room4.setScannedID("hi!");
        room4.setUnderMaintenance(true);
        java.lang.String str10 = room4.getScannedID();
        java.lang.String str11 = room4.getFullLocation();
        boolean boolean12 = room4.isOccupied();
        room4.setEnabled(false);
        room4.setScannedID("Room Room  - Room hi! | hi! - hi! | Capacity: 0 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 0 - hi! |  - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! - Room  - Room hi! | hi! - hi! | Capacity: 0 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 0 | Capacity: 10");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi! - hi!" + "'", str11, "hi! - hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test03677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03677");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        java.lang.String str5 = room4.getScannedID();
        room4.setScannedID("hi!");
        boolean boolean8 = room4.isEnabled();
        int int9 = room4.getCapacity();
        int int10 = room4.getCapacity();
        room4.notifyObservers();
        room.SensorObserver sensorObserver12 = null;
        room4.addObserver(sensorObserver12);
        room.SensorObserver sensorObserver14 = null;
        room4.addObserver(sensorObserver14);
        java.lang.String str16 = room4.getRoomID();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test03678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03678");
        room.Room room4 = new room.Room("hi! - hi! - Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100", (-1), "Room hi! | hi! - hi! | Capacity: 0 - hi!", " - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi!");
        java.lang.String str5 = room4.getBuildingName();
        room4.setScannedID("Room Room hi! | hi! - hi! | Capacity: 0 |  - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 0");
        room4.setOccupied(false);
        boolean boolean10 = room4.isUnderMaintenance();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0 - hi!" + "'", str5, "Room hi! | hi! - hi! | Capacity: 0 - hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test03679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03679");
        room.Room room4 = new room.Room("Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 | hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 0 - hi! - hi! - Room hi! | hi! - hi! | Capacity: 0", (-1), "Room Room hi! | hi! - hi! | Capacity: 0 - hi! - hi! |  - Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | hi! - hi! - hi! | Capacity: 0 | Capacity: 52", "");
        int int5 = room4.getCapacity();
        room4.setOccupied(false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test03680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03680");
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
        java.lang.String str14 = room4.toString();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi! - hi!" + "'", str7, "hi! - hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str14, "Room hi! | hi! - hi! | Capacity: 0");
    }

    @Test
    public void test03681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03681");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        java.lang.String str5 = room4.getScannedID();
        room4.setScannedID("hi!");
        room4.setUnderMaintenance(true);
        room4.setOccupied(true);
        java.lang.String str12 = room4.getRoomID();
        java.lang.String str13 = room4.toString();
        java.lang.String str14 = room4.getBuildingName();
        java.lang.String str15 = room4.getRoomNumber();
        room.SensorObserver sensorObserver16 = null;
        room4.addObserver(sensorObserver16);
        // The following exception was thrown during execution in test generation
        try {
            room4.notifyObservers();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str13, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test03682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03682");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        boolean boolean5 = room4.isOccupied();
        room4.setEnabled(false);
        java.lang.String str8 = room4.toString();
        room4.setOccupied(true);
        room4.setOccupied(false);
        room4.setOccupied(false);
        room.SensorObserver sensorObserver15 = null;
        room4.addObserver(sensorObserver15);
        room.SensorObserver sensorObserver17 = null;
        room4.addObserver(sensorObserver17);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str8, "Room hi! | hi! - hi! | Capacity: 0");
    }

    @Test
    public void test03683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03683");
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
            room4.notifyObservers();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test03684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03684");
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
        room.SensorObserver sensorObserver17 = null;
        room4.removeObserver(sensorObserver17);
        room4.setOccupied(true);
        room4.setScannedID("Room Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! - hi! - hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: -1");
        room4.setEnabled(true);
        room4.setUnderMaintenance(false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi! - hi!" + "'", str11, "hi! - hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test03685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03685");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        java.lang.String str5 = room4.getBuildingName();
        java.lang.String str6 = room4.getRoomID();
        boolean boolean7 = room4.isOccupied();
        room4.notifyObservers();
        java.lang.String str9 = room4.getBuildingName();
        room.SensorObserver sensorObserver10 = null;
        room4.removeObserver(sensorObserver10);
        room4.setScannedID("Room Room Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 100 | Room Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 100 - Room Room hi! | hi! - hi! | Capacity: 0 |  - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 0 | Capacity: 32");
        room.SensorObserver sensorObserver14 = null;
        room4.addObserver(sensorObserver14);
        java.lang.Class<?> wildcardClass16 = room4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test03686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03686");
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
        java.lang.String str16 = room4.getRoomID();
        java.lang.String str17 = room4.getScannedID();
        java.lang.String str18 = room4.getRoomNumber();
        boolean boolean19 = room4.isEnabled();
        boolean boolean20 = room4.isOccupied();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test03687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03687");
        room.Room room4 = new room.Room("Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 100 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: -1", (int) (short) 10, "Room hi! | hi! - hi! | Capacity: 0 - hi! - ", "Room Room hi! | hi! - hi! | Capacity: 0 | Room hi! | hi! - hi! | Capacity: 0 - hi! - hi! | Capacity: 100 - Room  - Room hi! | hi! - hi! | Capacity: 0 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 0");
        int int5 = room4.getCapacity();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
    }

    @Test
    public void test03688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03688");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        room.SensorObserver sensorObserver5 = null;
        room4.addObserver(sensorObserver5);
        java.lang.String str7 = room4.toString();
        room.SensorObserver sensorObserver8 = null;
        room4.removeObserver(sensorObserver8);
        java.lang.String str10 = room4.toString();
        java.lang.String str11 = room4.getRoomID();
        boolean boolean12 = room4.isEnabled();
        java.lang.String str13 = room4.getRoomNumber();
        int int14 = room4.getCapacity();
        java.lang.String str15 = room4.getScannedID();
        room.SensorObserver sensorObserver16 = null;
        room4.removeObserver(sensorObserver16);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str7, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str10, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test03689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03689");
        room.Room room4 = new room.Room("Room hi! - hi! - hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 -  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100", (int) (byte) 1, "Room Room Room hi! | hi! - hi! | Capacity: 0 - hi! | Room hi! | Room hi! | hi! - hi! | Capacity: 0 - hi! - Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 1 - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 32 |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 35", "Room hi! | hi! - hi! | Capacity: 0 - hi! - hi! - ");
    }

    @Test
    public void test03690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03690");
        room.Room room4 = new room.Room("Room Room hi! | hi! - hi! | Capacity: 0 - hi! | Room hi! | Room hi! | hi! - hi! | Capacity: 0 - hi! - Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 1 - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 32", (int) '4', "Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 | Room Room hi! | hi! - hi! | Capacity: 0 | Room hi! | hi! - hi! | Capacity: 0 - hi! - hi! | Capacity: 100 - hi! - hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 0", "Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 1 - Room hi! | hi! - hi! | Capacity: 0 - hi!");
    }

    @Test
    public void test03691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03691");
        room.Room room4 = new room.Room("hi!", (int) (byte) 100, "", "Room hi! | hi! - hi! | Capacity: 0");
        java.lang.String str5 = room4.getScannedID();
        java.lang.String str6 = room4.getBuildingName();
        room4.setUnderMaintenance(false);
        room4.setScannedID("Room hi! | hi! - hi! | Capacity: 0 - hi! - ");
        room.SensorObserver sensorObserver11 = null;
        room4.removeObserver(sensorObserver11);
        java.lang.String str13 = room4.getFullLocation();
        java.lang.String str14 = room4.getRoomID();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + " - Room hi! | hi! - hi! | Capacity: 0" + "'", str13, " - Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test03692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03692");
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
        boolean boolean17 = room4.isUnderMaintenance();
        java.lang.String str18 = room4.getRoomNumber();
        java.lang.String str19 = room4.getScannedID();
        java.lang.String str20 = room4.getFullLocation();
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str11, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi! - hi!" + "'", str20, "hi! - hi!");
    }

    @Test
    public void test03693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03693");
        room.Room room4 = new room.Room("Room hi! | hi! - hi! | Capacity: 0", (int) 'a', "hi!", "hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10");
        java.lang.String str5 = room4.toString();
        java.lang.String str6 = room4.toString();
        room4.setEnabled(false);
        room4.notifyObservers();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Room Room hi! | hi! - hi! | Capacity: 0 | hi! - hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 97" + "'", str5, "Room Room hi! | hi! - hi! | Capacity: 0 | hi! - hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 97");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Room Room hi! | hi! - hi! | Capacity: 0 | hi! - hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 97" + "'", str6, "Room Room hi! | hi! - hi! | Capacity: 0 | hi! - hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 97");
    }

    @Test
    public void test03694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03694");
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
        java.lang.String str20 = room4.getRoomNumber();
        room4.setOccupied(true);
        int int23 = room4.getCapacity();
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str11, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test03695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03695");
        room.Room room4 = new room.Room("Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 97", (int) (short) 100, "Room  - Room hi! | hi! - hi! | Capacity: 0 |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 0", "Room hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 1");
        java.lang.String str5 = room4.getBuildingName();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Room  - Room hi! | hi! - hi! | Capacity: 0 |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 0" + "'", str5, "Room  - Room hi! | hi! - hi! | Capacity: 0 |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 0");
    }

    @Test
    public void test03696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03696");
        room.Room room4 = new room.Room("Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100", (int) 'a', "hi! - hi!", "Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10");
        java.lang.String str5 = room4.toString();
        room4.setScannedID("Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi!");
        room4.setUnderMaintenance(true);
        room.SensorObserver sensorObserver10 = null;
        room4.addObserver(sensorObserver10);
        int int12 = room4.getCapacity();
        room.SensorObserver sensorObserver13 = null;
        room4.removeObserver(sensorObserver13);
        room4.setEnabled(true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 97" + "'", str5, "Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 97");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
    }

    @Test
    public void test03697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03697");
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
        int int21 = room4.getCapacity();
        boolean boolean22 = room4.isUnderMaintenance();
        room.SensorObserver sensorObserver23 = null;
        room4.removeObserver(sensorObserver23);
        int int25 = room4.getCapacity();
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str11, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
    }

    @Test
    public void test03698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03698");
        room.Room room4 = new room.Room(" - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi!", 97, "Room hi! | hi! - hi! - Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | Capacity: 0 -  - hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10", "Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10");
    }

    @Test
    public void test03699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03699");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        room.SensorObserver sensorObserver5 = null;
        room4.addObserver(sensorObserver5);
        room.SensorObserver sensorObserver7 = null;
        room4.addObserver(sensorObserver7);
        java.lang.String str9 = room4.getBuildingName();
        java.lang.String str10 = room4.getRoomNumber();
        boolean boolean11 = room4.isOccupied();
        boolean boolean12 = room4.isOccupied();
        java.lang.Class<?> wildcardClass13 = room4.getClass();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test03700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03700");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        java.lang.String str5 = room4.getScannedID();
        room4.setScannedID("hi!");
        room4.setUnderMaintenance(true);
        room4.setOccupied(true);
        boolean boolean12 = room4.isEnabled();
        java.lang.String str13 = room4.toString();
        java.lang.String str14 = room4.toString();
        room4.setOccupied(false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str13, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str14, "Room hi! | hi! - hi! | Capacity: 0");
    }

    @Test
    public void test03701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03701");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        room.SensorObserver sensorObserver5 = null;
        room4.addObserver(sensorObserver5);
        java.lang.String str7 = room4.toString();
        java.lang.String str8 = room4.toString();
        java.lang.String str9 = room4.getBuildingName();
        boolean boolean10 = room4.isUnderMaintenance();
        java.lang.String str11 = room4.getRoomNumber();
        int int12 = room4.getCapacity();
        java.lang.String str13 = room4.getBuildingName();
        // The following exception was thrown during execution in test generation
        try {
            room4.setOccupied(false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str7, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str8, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test03702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03702");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        java.lang.String str5 = room4.getScannedID();
        room4.setScannedID("hi!");
        room4.setUnderMaintenance(true);
        room4.setOccupied(true);
        room4.setOccupied(false);
        room4.notifyObservers();
        room4.notifyObservers();
        room.SensorObserver sensorObserver16 = null;
        room4.addObserver(sensorObserver16);
        java.lang.String str18 = room4.toString();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str18, "Room hi! | hi! - hi! | Capacity: 0");
    }

    @Test
    public void test03703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03703");
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
        boolean boolean18 = room4.isUnderMaintenance();
        // The following exception was thrown during execution in test generation
        try {
            room4.setOccupied(false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str16, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test03704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03704");
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
        java.lang.String str19 = room4.getBuildingName();
        boolean boolean20 = room4.isOccupied();
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str11, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test03705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03705");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        room.SensorObserver sensorObserver5 = null;
        room4.addObserver(sensorObserver5);
        java.lang.String str7 = room4.toString();
        room.SensorObserver sensorObserver8 = null;
        room4.removeObserver(sensorObserver8);
        java.lang.String str10 = room4.toString();
        java.lang.String str11 = room4.getRoomID();
        boolean boolean12 = room4.isUnderMaintenance();
        room4.setEnabled(false);
        room.SensorObserver sensorObserver15 = null;
        room4.addObserver(sensorObserver15);
        java.lang.String str17 = room4.getFullLocation();
        java.lang.String str18 = room4.getScannedID();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str7, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str10, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi! - hi!" + "'", str17, "hi! - hi!");
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test03706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03706");
        room.Room room4 = new room.Room("hi!", (int) (byte) 1, "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10", "hi!");
        room4.notifyObservers();
        room4.setUnderMaintenance(false);
        java.lang.String str8 = room4.getRoomID();
        room.SensorObserver sensorObserver9 = null;
        room4.removeObserver(sensorObserver9);
        java.lang.String str11 = room4.getRoomNumber();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test03707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03707");
        room.Room room4 = new room.Room("", (int) (short) 10, "Room hi! | hi! - hi! | Capacity: 0", "hi!");
        room.SensorObserver sensorObserver5 = null;
        room4.removeObserver(sensorObserver5);
        room.SensorObserver sensorObserver7 = null;
        room4.addObserver(sensorObserver7);
        java.lang.String str9 = room4.getBuildingName();
        // The following exception was thrown during execution in test generation
        try {
            room4.setScannedID("Room  - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! | Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 100 | hi! - hi! - hi! - hi! | Capacity: 0 - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 0");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str9, "Room hi! | hi! - hi! | Capacity: 0");
    }

    @Test
    public void test03708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03708");
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
        room4.setScannedID("Room  - Room hi! | hi! - hi! | Capacity: 0 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 0 - hi!");
        java.lang.String str20 = room4.getFullLocation();
        int int21 = room4.getCapacity();
        java.lang.String str22 = room4.getRoomID();
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str11, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi! - hi!" + "'", str20, "hi! - hi!");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
    }

    @Test
    public void test03709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03709");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        java.lang.String str5 = room4.getScannedID();
        room4.setScannedID("hi!");
        java.lang.String str8 = room4.getBuildingName();
        room4.setEnabled(false);
        room.SensorObserver sensorObserver11 = null;
        room4.addObserver(sensorObserver11);
        java.lang.String str13 = room4.getBuildingName();
        boolean boolean14 = room4.isEnabled();
        boolean boolean15 = room4.isEnabled();
        // The following exception was thrown during execution in test generation
        try {
            room4.notifyObservers();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test03710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03710");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        java.lang.String str5 = room4.getBuildingName();
        java.lang.String str6 = room4.getRoomID();
        room4.setUnderMaintenance(false);
        int int9 = room4.getCapacity();
        room.SensorObserver sensorObserver10 = null;
        room4.removeObserver(sensorObserver10);
        boolean boolean12 = room4.isEnabled();
        java.lang.String str13 = room4.getRoomNumber();
        room4.setScannedID("Room Room hi! | hi! - hi! | Capacity: 0 | hi! - hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 97");
        java.lang.String str16 = room4.toString();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str16, "Room hi! | hi! - hi! | Capacity: 0");
    }

    @Test
    public void test03711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03711");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        room.SensorObserver sensorObserver5 = null;
        room4.addObserver(sensorObserver5);
        java.lang.String str7 = room4.getScannedID();
        room.SensorObserver sensorObserver8 = null;
        room4.removeObserver(sensorObserver8);
        java.lang.String str10 = room4.getRoomNumber();
        boolean boolean11 = room4.isOccupied();
        java.lang.String str12 = room4.getRoomNumber();
        boolean boolean13 = room4.isOccupied();
        room4.notifyObservers();
        java.lang.Class<?> wildcardClass15 = room4.getClass();
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test03712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03712");
        room.Room room4 = new room.Room("Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 1", 97, "Room Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! - hi! - hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: -1 - Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 | hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 0", "hi! - hi! - Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 97");
        java.lang.String str5 = room4.getFullLocation();
        boolean boolean6 = room4.isOccupied();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Room Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! - hi! - hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: -1 - Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 | hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 0 - hi! - hi! - Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 97" + "'", str5, "Room Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! - hi! - hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: -1 - Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 | hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 0 - hi! - hi! - Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 97");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test03713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03713");
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
        java.lang.String str16 = room4.toString();
        java.lang.String str17 = room4.getScannedID();
        room4.notifyObservers();
        room.SensorObserver sensorObserver19 = null;
        room4.removeObserver(sensorObserver19);
        room4.setUnderMaintenance(false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str7, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str10, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str16, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test03714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03714");
        room.Room room4 = new room.Room("hi!", (int) (byte) 100, "", "Room hi! | hi! - hi! | Capacity: 0");
        room4.setScannedID("");
        room4.notifyObservers();
        boolean boolean8 = room4.isUnderMaintenance();
        room4.notifyObservers();
        java.lang.Class<?> wildcardClass10 = room4.getClass();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test03715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03715");
        room.Room room4 = new room.Room("Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100", (int) 'a', "hi! - hi!", "Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10");
        int int5 = room4.getCapacity();
        room4.setScannedID("");
        java.lang.String str8 = room4.toString();
        boolean boolean9 = room4.isUnderMaintenance();
        java.lang.Class<?> wildcardClass10 = room4.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 97" + "'", str8, "Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 97");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test03716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03716");
        room.Room room4 = new room.Room("hi! - ", (int) (short) 10, "Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 | hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 0", "Room hi! | hi! - hi! | Capacity: 0 - hi!");
        room4.notifyObservers();
        java.lang.String str6 = room4.toString();
        room4.notifyObservers();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Room hi! -  | Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 | hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 0 - Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10" + "'", str6, "Room hi! -  | Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 | hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 0 - Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10");
    }

    @Test
    public void test03717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03717");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        java.lang.String str5 = room4.getScannedID();
        room4.setScannedID("hi!");
        room4.setScannedID("hi! - hi!");
        boolean boolean10 = room4.isEnabled();
        java.lang.String str11 = room4.getRoomNumber();
        room.SensorObserver sensorObserver12 = null;
        room4.addObserver(sensorObserver12);
        // The following exception was thrown during execution in test generation
        try {
            room4.setUnderMaintenance(true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test03718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03718");
        room.Room room4 = new room.Room("Room hi! -  | Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 | hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 0 - Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10", (int) (short) 0, "Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - hi! | Capacity: 1", "Room Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - hi! | Capacity: 1 | Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 | hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 0 - hi! - hi! - Room hi! | hi! - hi! | Capacity: 0 -  - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! | Capacity: 35");
        java.lang.String str5 = room4.getRoomNumber();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Room Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - hi! | Capacity: 1 | Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 | hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 0 - hi! - hi! - Room hi! | hi! - hi! | Capacity: 0 -  - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! | Capacity: 35" + "'", str5, "Room Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - hi! | Capacity: 1 | Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 | hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 0 - hi! - hi! - Room hi! | hi! - hi! | Capacity: 0 -  - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! | Capacity: 35");
    }

    @Test
    public void test03719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03719");
        room.Room room4 = new room.Room("hi! - hi!", (int) (short) 1, "hi! - hi!", "");
        java.lang.String str5 = room4.getScannedID();
        room.SensorObserver sensorObserver6 = null;
        room4.removeObserver(sensorObserver6);
        room4.setScannedID("hi! - ");
        java.lang.String str10 = room4.getScannedID();
        java.lang.String str11 = room4.getBuildingName();
        java.lang.String str12 = room4.getFullLocation();
        room4.setEnabled(true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi! - " + "'", str10, "hi! - ");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi! - hi!" + "'", str11, "hi! - hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi! - hi! - " + "'", str12, "hi! - hi! - ");
    }

    @Test
    public void test03720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03720");
        room.Room room4 = new room.Room("Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 1", (int) (byte) 10, "Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 97 - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 100 - Room hi! | hi! - hi! | Capacity: 0 - hi! - ", "Room Room hi! - hi! - hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 1 | Capacity: 0 | Room hi! -  | Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 10 -  | Capacity: 52");
        room.SensorObserver sensorObserver5 = null;
        room4.removeObserver(sensorObserver5);
    }

    @Test
    public void test03721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03721");
        room.Room room4 = new room.Room("Room  - Room hi! | hi! - hi! | Capacity: 0 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 0", (-1), "Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100", "Room hi! | Room hi! | hi! - hi! | Capacity: 0 - hi! - Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 1");
        java.lang.String str5 = room4.getRoomNumber();
        room4.setEnabled(false);
        room4.setOccupied(false);
        java.lang.String str10 = room4.getRoomID();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Room hi! | Room hi! | hi! - hi! | Capacity: 0 - hi! - Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 1" + "'", str5, "Room hi! | Room hi! | hi! - hi! | Capacity: 0 - hi! - Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 1");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Room  - Room hi! | hi! - hi! | Capacity: 0 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 0" + "'", str10, "Room  - Room hi! | hi! - hi! | Capacity: 0 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 0");
    }

    @Test
    public void test03722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03722");
        room.Room room4 = new room.Room("hi! - hi! - hi!", (int) 'a', "Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 | hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 0", "Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi!");
        room4.setScannedID("Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100");
        room4.setUnderMaintenance(false);
        java.lang.String str9 = room4.toString();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Room hi! - hi! - hi! | Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 | hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 0 - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! | Capacity: 97" + "'", str9, "Room hi! - hi! - hi! | Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 | hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 0 - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! | Capacity: 97");
    }

    @Test
    public void test03723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03723");
        room.Room room4 = new room.Room("Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10", 0, "hi!", "Room hi! | hi! - hi! | Capacity: 0");
        java.lang.String str5 = room4.getBuildingName();
        boolean boolean6 = room4.isEnabled();
        room.SensorObserver sensorObserver7 = null;
        room4.removeObserver(sensorObserver7);
        room.SensorObserver sensorObserver9 = null;
        room4.removeObserver(sensorObserver9);
        room.SensorObserver sensorObserver11 = null;
        room4.addObserver(sensorObserver11);
        java.lang.String str13 = room4.getRoomNumber();
        int int14 = room4.getCapacity();
        // The following exception was thrown during execution in test generation
        try {
            room4.setEnabled(true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str13, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test03724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03724");
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
        room4.setUnderMaintenance(true);
        room4.setOccupied(false);
        java.lang.String str23 = room4.getScannedID();
        java.lang.Class<?> wildcardClass24 = room4.getClass();
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi! - hi!" + "'", str8, "hi! - hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test03725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03725");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        boolean boolean5 = room4.isOccupied();
        java.lang.String str6 = room4.getBuildingName();
        java.lang.String str7 = room4.toString();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str7, "Room hi! | hi! - hi! | Capacity: 0");
    }

    @Test
    public void test03726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03726");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        boolean boolean5 = room4.isOccupied();
        room4.setEnabled(false);
        java.lang.String str8 = room4.getRoomID();
        room4.notifyObservers();
        int int10 = room4.getCapacity();
        room4.setScannedID("Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10");
        int int13 = room4.getCapacity();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test03727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03727");
        room.Room room4 = new room.Room("Room Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 100", 32, "Room Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 100", "Room Room hi! | hi! - hi! | Capacity: 0 |  - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 0");
        java.lang.String str5 = room4.toString();
        int int6 = room4.getCapacity();
        java.lang.String str7 = room4.getScannedID();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Room Room Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 100 | Room Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 100 - Room Room hi! | hi! - hi! | Capacity: 0 |  - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 0 | Capacity: 32" + "'", str5, "Room Room Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 100 | Room Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 100 - Room Room hi! | hi! - hi! | Capacity: 0 |  - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 0 | Capacity: 32");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test03728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03728");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        java.lang.String str5 = room4.getBuildingName();
        java.lang.String str6 = room4.getRoomID();
        room4.setUnderMaintenance(false);
        int int9 = room4.getCapacity();
        java.lang.String str10 = room4.getScannedID();
        room4.setEnabled(true);
        room4.setOccupied(true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test03729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03729");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        java.lang.String str5 = room4.getScannedID();
        room4.setScannedID("hi!");
        boolean boolean8 = room4.isEnabled();
        room4.setEnabled(false);
        room4.setScannedID("Room hi! | hi! - hi! | Capacity: 0 - hi! - ");
        java.lang.String str13 = room4.getRoomID();
        room4.setOccupied(true);
        java.lang.String str16 = room4.getFullLocation();
        java.lang.String str17 = room4.getRoomID();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi! - hi!" + "'", str16, "hi! - hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test03730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03730");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        boolean boolean5 = room4.isOccupied();
        room4.setEnabled(false);
        java.lang.String str8 = room4.toString();
        room4.setOccupied(true);
        boolean boolean11 = room4.isOccupied();
        java.lang.String str12 = room4.getRoomID();
        boolean boolean13 = room4.isOccupied();
        java.lang.String str14 = room4.toString();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str8, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str14, "Room hi! | hi! - hi! | Capacity: 0");
    }

    @Test
    public void test03731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03731");
        room.Room room4 = new room.Room("Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100", (int) 'a', "hi! - hi!", "Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10");
        room.SensorObserver sensorObserver5 = null;
        room4.removeObserver(sensorObserver5);
        java.lang.String str7 = room4.getBuildingName();
        room4.notifyObservers();
        java.lang.String str9 = room4.getRoomID();
        room4.setScannedID("Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 1");
        java.lang.String str12 = room4.getRoomID();
        room4.setUnderMaintenance(true);
        java.lang.String str15 = room4.getRoomNumber();
        java.lang.String str16 = room4.getFullLocation();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi! - hi!" + "'", str7, "hi! - hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100" + "'", str9, "Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100" + "'", str12, "Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10" + "'", str15, "Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10" + "'", str16, "hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10");
    }

    @Test
    public void test03732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03732");
        room.Room room4 = new room.Room("Room hi! | hi! - hi! | Capacity: 0 - hi!", (int) '4', "Room  - Room hi! | hi! - hi! | Capacity: 0 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 0", "hi!");
        boolean boolean5 = room4.isUnderMaintenance();
        java.lang.String str6 = room4.getScannedID();
        java.lang.String str7 = room4.toString();
        room4.setScannedID("Room Room hi! - hi! - hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 1 | Capacity: 0 | Room hi! -  | Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 10 -  | Capacity: 52");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Room Room hi! | hi! - hi! | Capacity: 0 - hi! | Room  - Room hi! | hi! - hi! | Capacity: 0 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 0 - hi! | Capacity: 52" + "'", str7, "Room Room hi! | hi! - hi! | Capacity: 0 - hi! | Room  - Room hi! | hi! - hi! | Capacity: 0 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 0 - hi! | Capacity: 52");
    }

    @Test
    public void test03733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03733");
        room.Room room4 = new room.Room("hi!", (int) (short) 0, "hi! - hi!", "Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100");
        java.lang.String str5 = room4.getScannedID();
        room4.setOccupied(false);
        room4.setUnderMaintenance(true);
        java.lang.String str10 = room4.toString();
        room4.setScannedID("Room Room Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! |  - hi! -  | Capacity: 100 | Room hi! | hi! - hi! | Capacity: 0 - hi! - hi! - Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | hi! -  - Room  - Room hi! | hi! - hi! | Capacity: 0 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 0 | Capacity: 10 - Room Room hi! | hi! - hi! | Capacity: 0 - hi! - hi! | Room Room hi! | hi! - hi! | Capacity: 0 | Room hi! | hi! - hi! | Capacity: 0 - hi! - hi! | Capacity: 100 - Room  - Room hi! | hi! - hi! | Capacity: 0 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 0 | Capacity: 10 | Capacity: -1");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Room hi! | hi! - hi! - Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | Capacity: 0" + "'", str10, "Room hi! | hi! - hi! - Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | Capacity: 0");
    }

    @Test
    public void test03734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03734");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        java.lang.String str5 = room4.getScannedID();
        room4.setScannedID("hi!");
        java.lang.String str8 = room4.getBuildingName();
        java.lang.String str9 = room4.getRoomNumber();
        boolean boolean10 = room4.isOccupied();
        boolean boolean11 = room4.isUnderMaintenance();
        room4.notifyObservers();
        room4.setOccupied(true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test03735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03735");
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
        boolean boolean14 = room4.isUnderMaintenance();
        boolean boolean15 = room4.isEnabled();
        // The following exception was thrown during execution in test generation
        try {
            room4.setOccupied(false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi! - hi!" + "'", str12, "hi! - hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test03736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03736");
        room.Room room4 = new room.Room("", (int) (short) 10, "Room hi! | hi! - hi! | Capacity: 0", "hi!");
        java.lang.String str5 = room4.toString();
        java.lang.String str6 = room4.getBuildingName();
        room.SensorObserver sensorObserver7 = null;
        room4.removeObserver(sensorObserver7);
        boolean boolean9 = room4.isEnabled();
        room.SensorObserver sensorObserver10 = null;
        room4.addObserver(sensorObserver10);
        int int12 = room4.getCapacity();
        boolean boolean13 = room4.isOccupied();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10" + "'", str5, "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str6, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test03737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03737");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        java.lang.String str5 = room4.getBuildingName();
        java.lang.String str6 = room4.getRoomID();
        java.lang.String str7 = room4.getScannedID();
        room4.setEnabled(false);
        room4.setOccupied(true);
        java.lang.String str12 = room4.toString();
        java.lang.String str13 = room4.getRoomID();
        room4.setOccupied(false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str12, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test03738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03738");
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
        boolean boolean14 = room4.isUnderMaintenance();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str7, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test03739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03739");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        room.SensorObserver sensorObserver5 = null;
        room4.addObserver(sensorObserver5);
        java.lang.String str7 = room4.getScannedID();
        java.lang.String str8 = room4.getFullLocation();
        boolean boolean9 = room4.isOccupied();
        boolean boolean10 = room4.isOccupied();
        java.lang.String str11 = room4.getFullLocation();
        java.lang.String str12 = room4.getRoomID();
        java.lang.String str13 = room4.getBuildingName();
        room.SensorObserver sensorObserver14 = null;
        room4.removeObserver(sensorObserver14);
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
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi! - hi!" + "'", str8, "hi! - hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi! - hi!" + "'", str11, "hi! - hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test03740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03740");
        room.Room room4 = new room.Room("hi! - hi! - Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100", 0, "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi!", "Room  - Room hi! | hi! - hi! | Capacity: 0 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 0 - hi!");
        boolean boolean5 = room4.isEnabled();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test03741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03741");
        room.Room room4 = new room.Room("Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 97", 100, "hi! -  - Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 1", "hi!");
        java.lang.String str5 = room4.getScannedID();
        room4.setUnderMaintenance(false);
        room4.setUnderMaintenance(true);
        boolean boolean10 = room4.isUnderMaintenance();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test03742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03742");
        room.Room room4 = new room.Room("", (int) (short) 10, "Room hi! | hi! - hi! | Capacity: 0", "hi!");
        java.lang.String str5 = room4.toString();
        boolean boolean6 = room4.isEnabled();
        java.lang.String str7 = room4.toString();
        boolean boolean8 = room4.isOccupied();
        boolean boolean9 = room4.isEnabled();
        java.lang.String str10 = room4.getBuildingName();
        java.lang.String str11 = room4.getBuildingName();
        java.lang.String str12 = room4.toString();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10" + "'", str5, "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10" + "'", str7, "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str10, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str11, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10" + "'", str12, "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10");
    }

    @Test
    public void test03743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03743");
        room.Room room4 = new room.Room("Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10", 0, "hi!", "Room hi! | hi! - hi! | Capacity: 0");
        room4.setUnderMaintenance(false);
        room4.setOccupied(true);
        java.lang.String str9 = room4.getRoomID();
        boolean boolean10 = room4.isOccupied();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10" + "'", str9, "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test03744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03744");
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
        boolean boolean21 = room4.isOccupied();
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str11, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi! - hi!" + "'", str14, "hi! - hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test03745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03745");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        room.SensorObserver sensorObserver5 = null;
        room4.addObserver(sensorObserver5);
        java.lang.String str7 = room4.getScannedID();
        room.SensorObserver sensorObserver8 = null;
        room4.removeObserver(sensorObserver8);
        java.lang.String str10 = room4.getRoomNumber();
        java.lang.String str11 = room4.toString();
        java.lang.String str12 = room4.getRoomID();
        room4.setEnabled(false);
        room4.notifyObservers();
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str11, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test03746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03746");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        java.lang.String str5 = room4.getScannedID();
        room4.setScannedID("hi!");
        boolean boolean8 = room4.isEnabled();
        int int9 = room4.getCapacity();
        int int10 = room4.getCapacity();
        boolean boolean11 = room4.isOccupied();
        room4.setEnabled(false);
        room4.notifyObservers();
        boolean boolean15 = room4.isOccupied();
        room.SensorObserver sensorObserver16 = null;
        room4.addObserver(sensorObserver16);
        java.lang.Class<?> wildcardClass18 = room4.getClass();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test03747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03747");
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
        java.lang.String str15 = room4.getRoomID();
        boolean boolean16 = room4.isOccupied();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str10, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test03748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03748");
        room.Room room4 = new room.Room("", (int) (byte) 1, "Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10", "hi!");
        int int5 = room4.getCapacity();
        room4.notifyObservers();
        room.SensorObserver sensorObserver7 = null;
        room4.removeObserver(sensorObserver7);
        room.SensorObserver sensorObserver9 = null;
        room4.removeObserver(sensorObserver9);
        boolean boolean11 = room4.isUnderMaintenance();
        java.lang.String str12 = room4.getBuildingName();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10" + "'", str12, "Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10");
    }

    @Test
    public void test03749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03749");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        java.lang.String str5 = room4.getScannedID();
        room4.setScannedID("hi!");
        java.lang.String str8 = room4.getBuildingName();
        int int9 = room4.getCapacity();
        room4.setOccupied(false);
        room4.setScannedID("Room hi! | hi! - hi! | Capacity: 0");
        boolean boolean14 = room4.isOccupied();
        boolean boolean15 = room4.isEnabled();
        java.lang.String str16 = room4.getRoomID();
        room4.setScannedID("Room Room hi! | hi! - hi! | Capacity: 0 - hi! - hi! | Room Room hi! | hi! - hi! | Capacity: 0 | Room hi! | hi! - hi! | Capacity: 0 - hi! - hi! | Capacity: 100 - Room  - Room hi! | hi! - hi! | Capacity: 0 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 0 | Capacity: 10");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test03750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03750");
        room.Room room4 = new room.Room("Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 | hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 0", 0, "Room hi! | hi! - hi! | Capacity: 0", "Room Room hi! - hi! - hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 1 | Capacity: 0 | Room hi! -  | Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 10 -  | Capacity: 52");
        room4.notifyObservers();
        java.lang.String str6 = room4.getRoomID();
        room4.notifyObservers();
        java.lang.String str8 = room4.getRoomID();
        int int9 = room4.getCapacity();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 | hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 0" + "'", str6, "Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 | hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 | hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 0" + "'", str8, "Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 | hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 0");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test03751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03751");
        room.Room room4 = new room.Room("hi!", (int) (byte) 100, "", "Room hi! | hi! - hi! | Capacity: 0");
        java.lang.String str5 = room4.getRoomNumber();
        room4.notifyObservers();
        boolean boolean7 = room4.isUnderMaintenance();
        java.lang.String str8 = room4.toString();
        java.lang.String str9 = room4.toString();
        java.lang.Class<?> wildcardClass10 = room4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str5, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100" + "'", str8, "Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100" + "'", str9, "Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test03752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03752");
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
        room.SensorObserver sensorObserver15 = null;
        room4.removeObserver(sensorObserver15);
        // The following exception was thrown during execution in test generation
        try {
            room4.notifyObservers();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str7, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str14, "Room hi! | hi! - hi! | Capacity: 0");
    }

    @Test
    public void test03753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03753");
        room.Room room4 = new room.Room("Room hi! | hi! - hi! | Capacity: 0", (int) (byte) 10, "hi!", "");
        room4.setUnderMaintenance(true);
        java.lang.String str7 = room4.toString();
        room.SensorObserver sensorObserver8 = null;
        room4.addObserver(sensorObserver8);
        boolean boolean10 = room4.isUnderMaintenance();
        int int11 = room4.getCapacity();
        java.lang.String str12 = room4.getScannedID();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10" + "'", str7, "Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test03754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03754");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        java.lang.String str5 = room4.toString();
        java.lang.String str6 = room4.getRoomID();
        room4.setUnderMaintenance(true);
        boolean boolean9 = room4.isUnderMaintenance();
        java.lang.String str10 = room4.getRoomID();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str5, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test03755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03755");
        room.Room room4 = new room.Room("Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 100 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 -  - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! | Capacity: 0", (int) (short) 10, "hi! -  - Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 1", "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room hi! | hi! - hi! | Capacity: 0");
        java.lang.String str5 = room4.getBuildingName();
        boolean boolean6 = room4.isEnabled();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi! -  - Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 1" + "'", str5, "hi! -  - Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 1");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test03756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03756");
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
        room4.notifyObservers();
        java.lang.String str18 = room4.getRoomNumber();
        room4.setUnderMaintenance(true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test03757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03757");
        room.Room room4 = new room.Room("hi!", (int) (byte) 1, "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10", "hi!");
        room4.notifyObservers();
        room4.setOccupied(false);
        room4.setUnderMaintenance(false);
        room4.setEnabled(false);
        java.lang.String str12 = room4.getBuildingName();
        room.SensorObserver sensorObserver13 = null;
        room4.removeObserver(sensorObserver13);
        room4.notifyObservers();
        java.lang.Class<?> wildcardClass16 = room4.getClass();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10" + "'", str12, "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test03758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03758");
        room.Room room4 = new room.Room("Room Room hi! - hi! - hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 1 | Capacity: 0 | Room hi! -  | Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 10 -  | Capacity: 52", 100, "Room  - hi! - hi! - Room hi! | hi! - hi! | Capacity: 0 | Room hi! -  | Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 10 - hi! - hi! - Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 - Room Room hi! - hi! - Room hi! | hi! - hi! | Capacity: 0 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 100 | Capacity: 10 | Room hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 1 - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | Capacity: 97", "Room  | hi! - hi! - Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 97 - Room  | Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! | Capacity: 1 | Capacity: 35");
        room.SensorObserver sensorObserver5 = null;
        room4.addObserver(sensorObserver5);
    }

    @Test
    public void test03759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03759");
        room.Room room4 = new room.Room("Room hi! | hi! - hi! | Capacity: 0 - hi! -  - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room hi! | hi! - hi! | Capacity: 0", (int) (short) 10, " - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi!", "Room hi! - hi! - hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 -  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100");
        java.lang.Class<?> wildcardClass5 = room4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test03760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03760");
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
        room4.setEnabled(true);
        room4.setOccupied(false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str11, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test03761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03761");
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
            room4.setUnderMaintenance(true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test03762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03762");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        java.lang.String str5 = room4.toString();
        java.lang.String str6 = room4.getScannedID();
        room4.setOccupied(true);
        java.lang.String str9 = room4.getFullLocation();
        java.lang.String str10 = room4.getRoomNumber();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str5, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi! - hi!" + "'", str9, "hi! - hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test03763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03763");
        room.Room room4 = new room.Room("", (int) (short) 10, "Room hi! | hi! - hi! | Capacity: 0", "hi!");
        java.lang.String str5 = room4.toString();
        java.lang.String str6 = room4.getBuildingName();
        boolean boolean7 = room4.isOccupied();
        room.SensorObserver sensorObserver8 = null;
        room4.removeObserver(sensorObserver8);
        room.SensorObserver sensorObserver10 = null;
        room4.removeObserver(sensorObserver10);
        java.lang.String str12 = room4.getScannedID();
        room4.setEnabled(true);
        room.SensorObserver sensorObserver15 = null;
        room4.addObserver(sensorObserver15);
        // The following exception was thrown during execution in test generation
        try {
            room4.setScannedID("Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! - hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 97 | Capacity: 32 | Room hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 1 - Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | Room hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 1 - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! | Capacity: 97 | Capacity: 52");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10" + "'", str5, "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str6, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test03764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03764");
        room.Room room4 = new room.Room("hi!", (int) (byte) 100, "", "Room hi! | hi! - hi! | Capacity: 0");
        room4.notifyObservers();
        room.SensorObserver sensorObserver6 = null;
        room4.removeObserver(sensorObserver6);
        java.lang.String str8 = room4.getRoomNumber();
        boolean boolean9 = room4.isUnderMaintenance();
        room4.setScannedID(" - Room hi! | hi! - hi! | Capacity: 0");
        room4.setScannedID("Room hi! | hi! - hi! | Capacity: 0 - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! - hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 97");
        boolean boolean14 = room4.isEnabled();
        room.SensorObserver sensorObserver15 = null;
        room4.removeObserver(sensorObserver15);
        room.SensorObserver sensorObserver17 = null;
        room4.addObserver(sensorObserver17);
        // The following exception was thrown during execution in test generation
        try {
            room4.setScannedID("Room hi! -  | Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 0 - Room  - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 100 | hi! - hi! - hi! - hi! | Capacity: 0 | Capacity: 0");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str8, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test03765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03765");
        room.Room room4 = new room.Room("Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 97", (int) '#', "Room hi! - hi! - hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 1 | Capacity: 0", "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10");
        room4.setEnabled(false);
        boolean boolean7 = room4.isUnderMaintenance();
        java.lang.String str8 = room4.toString();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Room Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 97 | Room hi! - hi! - hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 1 | Capacity: 0 - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 | Capacity: 35" + "'", str8, "Room Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 97 | Room hi! - hi! - hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 1 | Capacity: 0 - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 | Capacity: 35");
    }

    @Test
    public void test03766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03766");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        java.lang.String str5 = room4.getScannedID();
        room4.setScannedID("hi!");
        boolean boolean8 = room4.isEnabled();
        int int9 = room4.getCapacity();
        boolean boolean10 = room4.isOccupied();
        java.lang.String str11 = room4.getRoomNumber();
        java.lang.String str12 = room4.getRoomID();
        room4.setScannedID("Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi!");
        int int15 = room4.getCapacity();
        java.lang.String str16 = room4.getScannedID();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi!" + "'", str16, "Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi!");
    }

    @Test
    public void test03767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03767");
        room.Room room4 = new room.Room("Room hi! | hi! - hi! | Capacity: 0 - hi!", (int) (short) 10, "Room hi! | hi! - hi! | Capacity: 0", "Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10");
        boolean boolean5 = room4.isEnabled();
        room4.setScannedID("Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 100 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 -  - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! | Capacity: 0");
        int int8 = room4.getCapacity();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
    }

    @Test
    public void test03768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03768");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        java.lang.String str5 = room4.getScannedID();
        room4.setScannedID("hi!");
        java.lang.String str8 = room4.getBuildingName();
        java.lang.String str9 = room4.getScannedID();
        room4.setOccupied(false);
        boolean boolean12 = room4.isOccupied();
        java.lang.String str13 = room4.getBuildingName();
        boolean boolean14 = room4.isOccupied();
        boolean boolean15 = room4.isOccupied();
        java.lang.String str16 = room4.getFullLocation();
        java.lang.String str17 = room4.toString();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi! - hi!" + "'", str16, "hi! - hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str17, "Room hi! | hi! - hi! | Capacity: 0");
    }

    @Test
    public void test03769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03769");
        room.Room room4 = new room.Room("Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100", (int) 'a', "hi! - hi!", "Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10");
        java.lang.String str5 = room4.toString();
        room4.setScannedID("Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi!");
        room4.setOccupied(true);
        room4.setScannedID("Room hi! - hi! - hi! | hi! - hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 1");
        room4.setEnabled(false);
        java.lang.String str14 = room4.getRoomNumber();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 97" + "'", str5, "Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 97");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10" + "'", str14, "Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10");
    }

    @Test
    public void test03770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03770");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        java.lang.String str5 = room4.getScannedID();
        room4.setScannedID("hi!");
        java.lang.String str8 = room4.getRoomID();
        room4.setScannedID("hi! - hi!");
        int int11 = room4.getCapacity();
        java.lang.String str12 = room4.getFullLocation();
        java.lang.String str13 = room4.getRoomNumber();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi! - hi!" + "'", str12, "hi! - hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test03771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03771");
        room.Room room4 = new room.Room("hi!", (int) (byte) 100, "", "Room hi! | hi! - hi! | Capacity: 0");
        java.lang.String str5 = room4.toString();
        room4.setOccupied(false);
        room.SensorObserver sensorObserver8 = null;
        room4.removeObserver(sensorObserver8);
        room4.setScannedID("Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100");
        int int12 = room4.getCapacity();
        room4.setScannedID("Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 | Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 - hi! -  | Capacity: 10");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100" + "'", str5, "Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
    }

    @Test
    public void test03772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03772");
        room.Room room4 = new room.Room("hi!", (int) (byte) 100, "", "Room hi! | hi! - hi! | Capacity: 0");
        java.lang.String str5 = room4.toString();
        room4.setOccupied(false);
        boolean boolean8 = room4.isUnderMaintenance();
        room4.setOccupied(false);
        room4.notifyObservers();
        room.SensorObserver sensorObserver12 = null;
        room4.removeObserver(sensorObserver12);
        room4.notifyObservers();
        java.lang.String str15 = room4.getFullLocation();
        room4.setOccupied(false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100" + "'", str5, "Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + " - Room hi! | hi! - hi! | Capacity: 0" + "'", str15, " - Room hi! | hi! - hi! | Capacity: 0");
    }

    @Test
    public void test03773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03773");
        room.Room room4 = new room.Room("Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 1", 0, "Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi!", "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi!");
        java.lang.String str5 = room4.getScannedID();
        room4.notifyObservers();
        java.lang.Class<?> wildcardClass7 = room4.getClass();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test03774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03774");
        room.Room room4 = new room.Room("hi! - hi!", (int) '#', "Room hi! | hi! - hi! | Capacity: 0 - hi!", "Room Room hi! | hi! - hi! | Capacity: 0 | hi! - hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 97");
        java.lang.String str5 = room4.getFullLocation();
        room.SensorObserver sensorObserver6 = null;
        room4.removeObserver(sensorObserver6);
        room4.setUnderMaintenance(true);
        java.lang.String str10 = room4.getRoomID();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0 - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! - hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 97" + "'", str5, "Room hi! | hi! - hi! | Capacity: 0 - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! - hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 97");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi! - hi!" + "'", str10, "hi! - hi!");
    }

    @Test
    public void test03775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03775");
        room.Room room4 = new room.Room("Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10", 0, "hi!", "Room hi! | hi! - hi! | Capacity: 0");
        room4.setEnabled(false);
    }

    @Test
    public void test03776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03776");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        room.SensorObserver sensorObserver5 = null;
        room4.addObserver(sensorObserver5);
        java.lang.String str7 = room4.toString();
        room.SensorObserver sensorObserver8 = null;
        room4.removeObserver(sensorObserver8);
        java.lang.String str10 = room4.toString();
        java.lang.String str11 = room4.getBuildingName();
        room4.setUnderMaintenance(false);
        java.lang.String str14 = room4.toString();
        int int15 = room4.getCapacity();
        room.SensorObserver sensorObserver16 = null;
        room4.addObserver(sensorObserver16);
        // The following exception was thrown during execution in test generation
        try {
            room4.setEnabled(true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str7, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str10, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str14, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test03777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03777");
        room.Room room4 = new room.Room("hi!", (int) (byte) 100, "", "Room hi! | hi! - hi! | Capacity: 0");
        java.lang.String str5 = room4.toString();
        java.lang.String str6 = room4.getScannedID();
        room4.notifyObservers();
        room.SensorObserver sensorObserver8 = null;
        room4.removeObserver(sensorObserver8);
        int int10 = room4.getCapacity();
        java.lang.String str11 = room4.getFullLocation();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100" + "'", str5, "Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + " - Room hi! | hi! - hi! | Capacity: 0" + "'", str11, " - Room hi! | hi! - hi! | Capacity: 0");
    }

    @Test
    public void test03778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03778");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        java.lang.String str5 = room4.getScannedID();
        room4.setScannedID("hi!");
        boolean boolean8 = room4.isEnabled();
        room.SensorObserver sensorObserver9 = null;
        room4.removeObserver(sensorObserver9);
        boolean boolean11 = room4.isEnabled();
        java.lang.Class<?> wildcardClass12 = room4.getClass();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test03779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03779");
        room.Room room4 = new room.Room("Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 100 | Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 - Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 100 | hi! - hi! - hi! - hi! | Capacity: 0 | Capacity: 0", (int) (short) 1, "Room Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 97 | Room hi! | hi! - hi! | Capacity: 0 - hi! - hi! - Room hi! | Room hi! | hi! - hi! | Capacity: 0 - hi! - Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 1 | Capacity: 1", "Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi!");
    }

    @Test
    public void test03780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03780");
        room.Room room4 = new room.Room("Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 | hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 0", 0, "Room hi! | hi! - hi! | Capacity: 0", "Room Room hi! - hi! - hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 1 | Capacity: 0 | Room hi! -  | Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 10 -  | Capacity: 52");
        java.lang.String str5 = room4.getFullLocation();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0 - Room Room hi! - hi! - hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 1 | Capacity: 0 | Room hi! -  | Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 10 -  | Capacity: 52" + "'", str5, "Room hi! | hi! - hi! | Capacity: 0 - Room Room hi! - hi! - hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 1 | Capacity: 0 | Room hi! -  | Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 10 -  | Capacity: 52");
    }

    @Test
    public void test03781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03781");
        room.Room room4 = new room.Room("Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100", 0, "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi!", "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10");
        java.lang.String str5 = room4.getBuildingName();
        java.lang.String str6 = room4.getScannedID();
        java.lang.String str7 = room4.getRoomID();
        room4.setUnderMaintenance(false);
        java.lang.String str10 = room4.toString();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi!" + "'", str5, "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi!");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100" + "'", str7, "Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 | Capacity: 0" + "'", str10, "Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 | Capacity: 0");
    }

    @Test
    public void test03782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03782");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        boolean boolean5 = room4.isOccupied();
        room4.setEnabled(false);
        boolean boolean8 = room4.isUnderMaintenance();
        java.lang.String str9 = room4.getFullLocation();
        room4.setUnderMaintenance(false);
        java.lang.String str12 = room4.getBuildingName();
        java.lang.String str13 = room4.getScannedID();
        java.lang.String str14 = room4.toString();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi! - hi!" + "'", str9, "hi! - hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str14, "Room hi! | hi! - hi! | Capacity: 0");
    }

    @Test
    public void test03783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03783");
        room.Room room4 = new room.Room(" - Room hi! | hi! - hi! | Capacity: 0", 0, "", "Room hi! | hi! - hi! | Capacity: 0");
        room.SensorObserver sensorObserver5 = null;
        room4.addObserver(sensorObserver5);
    }

    @Test
    public void test03784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03784");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        room.SensorObserver sensorObserver5 = null;
        room4.addObserver(sensorObserver5);
        java.lang.String str7 = room4.toString();
        java.lang.String str8 = room4.toString();
        java.lang.String str9 = room4.getBuildingName();
        java.lang.String str10 = room4.getFullLocation();
        java.lang.String str11 = room4.getRoomNumber();
        java.lang.Class<?> wildcardClass12 = room4.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str7, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str8, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi! - hi!" + "'", str10, "hi! - hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test03785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03785");
        room.Room room4 = new room.Room("hi! - hi! - hi!", 1, "hi! - hi!", "Room hi! | hi! - hi! | Capacity: 0");
        room.SensorObserver sensorObserver5 = null;
        room4.addObserver(sensorObserver5);
        java.lang.String str7 = room4.getRoomNumber();
        java.lang.String str8 = room4.getFullLocation();
        // The following exception was thrown during execution in test generation
        try {
            room4.setOccupied(true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str7, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi! - hi! - Room hi! | hi! - hi! | Capacity: 0" + "'", str8, "hi! - hi! - Room hi! | hi! - hi! | Capacity: 0");
    }

    @Test
    public void test03786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03786");
        room.Room room4 = new room.Room("hi!", (int) (byte) 1, "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10", "hi!");
        room4.notifyObservers();
        room4.setUnderMaintenance(false);
        java.lang.String str8 = room4.getRoomID();
        room4.setUnderMaintenance(false);
        room4.setUnderMaintenance(false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test03787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03787");
        room.Room room4 = new room.Room(" - Room hi! | hi! - hi! | Capacity: 0", 0, "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 -  - Room hi! | hi! - hi! | Capacity: 0 - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! - ", "Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 1 - Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100");
        java.lang.Class<?> wildcardClass5 = room4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test03788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03788");
        room.Room room4 = new room.Room("hi! - ", (int) (byte) 10, "Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10", "Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10");
        room4.setEnabled(false);
        java.lang.String str7 = room4.getBuildingName();
        java.lang.String str8 = room4.getFullLocation();
        room4.setOccupied(true);
        java.lang.String str11 = room4.getRoomID();
        boolean boolean12 = room4.isOccupied();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10" + "'", str7, "Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10" + "'", str8, "Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi! - " + "'", str11, "hi! - ");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test03789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03789");
        room.Room room4 = new room.Room("hi!", (int) (byte) 100, "", "Room hi! | hi! - hi! | Capacity: 0");
        java.lang.String str5 = room4.getScannedID();
        room4.setOccupied(false);
        room4.setUnderMaintenance(true);
        room.SensorObserver sensorObserver10 = null;
        room4.addObserver(sensorObserver10);
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
    public void test03790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03790");
        room.Room room4 = new room.Room("", (int) 'a', "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi!", "Room  - Room hi! | hi! - hi! | Capacity: 0 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 0");
        room.SensorObserver sensorObserver5 = null;
        room4.removeObserver(sensorObserver5);
    }

    @Test
    public void test03791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03791");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        room.SensorObserver sensorObserver5 = null;
        room4.addObserver(sensorObserver5);
        java.lang.String str7 = room4.getScannedID();
        java.lang.String str8 = room4.getScannedID();
        int int9 = room4.getCapacity();
        boolean boolean10 = room4.isUnderMaintenance();
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test03792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03792");
        room.Room room4 = new room.Room("", 0, "", "Room hi! | hi! - hi! | Capacity: 0");
        room4.setScannedID("Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 -  - Room hi! | hi! - hi! | Capacity: 0");
        java.lang.String str7 = room4.getRoomID();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test03793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03793");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        java.lang.String str5 = room4.getScannedID();
        room4.setScannedID("hi!");
        room4.setUnderMaintenance(true);
        room.SensorObserver sensorObserver10 = null;
        room4.removeObserver(sensorObserver10);
        java.lang.String str12 = room4.getScannedID();
        int int13 = room4.getCapacity();
        boolean boolean14 = room4.isEnabled();
        room.SensorObserver sensorObserver15 = null;
        room4.removeObserver(sensorObserver15);
        int int17 = room4.getCapacity();
        java.lang.String str18 = room4.getBuildingName();
        room4.notifyObservers();
        java.lang.String str20 = room4.getFullLocation();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi! - hi!" + "'", str20, "hi! - hi!");
    }

    @Test
    public void test03794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03794");
        room.Room room4 = new room.Room("hi!", (int) (byte) 1, "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10", "hi!");
        java.lang.String str5 = room4.getRoomNumber();
        java.lang.String str6 = room4.getRoomID();
        java.lang.String str7 = room4.toString();
        java.lang.String str8 = room4.getRoomID();
        room.SensorObserver sensorObserver9 = null;
        room4.removeObserver(sensorObserver9);
        java.lang.String str11 = room4.getFullLocation();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Room hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 1" + "'", str7, "Room hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 1");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi!" + "'", str11, "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi!");
    }

    @Test
    public void test03795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03795");
        room.Room room4 = new room.Room("hi!", (int) (byte) 100, "", "Room hi! | hi! - hi! | Capacity: 0");
        java.lang.String str5 = room4.getScannedID();
        java.lang.String str6 = room4.getBuildingName();
        room4.setScannedID("Room hi! | hi! - hi! | Capacity: 0");
        java.lang.String str9 = room4.getRoomID();
        boolean boolean10 = room4.isOccupied();
        room4.setOccupied(false);
        room.SensorObserver sensorObserver13 = null;
        room4.removeObserver(sensorObserver13);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test03796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03796");
        room.Room room4 = new room.Room("hi! - hi!", (int) (short) 10, "Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi!", "Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10");
        boolean boolean5 = room4.isUnderMaintenance();
        room.SensorObserver sensorObserver6 = null;
        room4.addObserver(sensorObserver6);
        java.lang.String str8 = room4.getScannedID();
        // The following exception was thrown during execution in test generation
        try {
            room4.notifyObservers();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test03797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03797");
        room.Room room4 = new room.Room("", (int) ' ', "Room hi! | hi! - hi! | Capacity: 0 - hi! - hi!", "Room Room hi! | hi! - hi! | Capacity: 0 | hi! - hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 97");
        room4.setScannedID("Room hi! | hi! - hi! | Capacity: 0 - hi!");
        java.lang.String str7 = room4.getRoomID();
        boolean boolean8 = room4.isOccupied();
        int int9 = room4.getCapacity();
        java.lang.String str10 = room4.getBuildingName();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0 - hi! - hi!" + "'", str10, "Room hi! | hi! - hi! | Capacity: 0 - hi! - hi!");
    }

    @Test
    public void test03798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03798");
        room.Room room4 = new room.Room("Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi!", (int) (byte) 100, "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10", "hi! - hi! - hi!");
        boolean boolean5 = room4.isUnderMaintenance();
        boolean boolean6 = room4.isOccupied();
        boolean boolean7 = room4.isEnabled();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test03799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03799");
        room.Room room4 = new room.Room("Room hi! - hi! |  - Room hi! | hi! - hi! | Capacity: 0 - Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 97 | Capacity: -1", (int) '4', "Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 | hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 0 - hi! - hi! - Room hi! | hi! - hi! | Capacity: 0 - Room hi! - hi! - hi! | hi! - hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 1", " - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10");
    }

    @Test
    public void test03800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03800");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        room.SensorObserver sensorObserver5 = null;
        room4.addObserver(sensorObserver5);
        int int7 = room4.getCapacity();
        java.lang.String str8 = room4.getBuildingName();
        room.SensorObserver sensorObserver9 = null;
        room4.addObserver(sensorObserver9);
        room.SensorObserver sensorObserver11 = null;
        room4.removeObserver(sensorObserver11);
        java.lang.String str13 = room4.getScannedID();
        boolean boolean14 = room4.isOccupied();
        java.lang.String str15 = room4.getBuildingName();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test03801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03801");
        room.Room room4 = new room.Room("hi!", (int) (byte) 100, "", "Room hi! | hi! - hi! | Capacity: 0");
        java.lang.String str5 = room4.getScannedID();
        java.lang.String str6 = room4.getBuildingName();
        room4.setUnderMaintenance(false);
        java.lang.String str9 = room4.getScannedID();
        int int10 = room4.getCapacity();
        room4.notifyObservers();
        boolean boolean12 = room4.isUnderMaintenance();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test03802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03802");
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
        boolean boolean19 = room4.isUnderMaintenance();
        room.SensorObserver sensorObserver20 = null;
        room4.addObserver(sensorObserver20);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str16, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test03803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03803");
        room.Room room4 = new room.Room("", (int) (short) 1, "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10", "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 100 - Room hi! | hi! - hi! | Capacity: 0 - hi! - ");
        room4.setUnderMaintenance(true);
        java.lang.String str7 = room4.getRoomNumber();
        java.lang.String str8 = room4.getRoomNumber();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 100 - Room hi! | hi! - hi! | Capacity: 0 - hi! - " + "'", str7, "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 100 - Room hi! | hi! - hi! | Capacity: 0 - hi! - ");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 100 - Room hi! | hi! - hi! | Capacity: 0 - hi! - " + "'", str8, "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 100 - Room hi! | hi! - hi! | Capacity: 0 - hi! - ");
    }

    @Test
    public void test03804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03804");
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
        java.lang.String str15 = room4.getRoomNumber();
        java.lang.String str16 = room4.toString();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str7, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str16, "Room hi! | hi! - hi! | Capacity: 0");
    }

    @Test
    public void test03805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03805");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        room.SensorObserver sensorObserver5 = null;
        room4.addObserver(sensorObserver5);
        java.lang.String str7 = room4.getFullLocation();
        boolean boolean8 = room4.isUnderMaintenance();
        java.lang.String str9 = room4.getRoomID();
        boolean boolean10 = room4.isOccupied();
        java.lang.String str11 = room4.toString();
        java.lang.String str12 = room4.getFullLocation();
        room.SensorObserver sensorObserver13 = null;
        room4.addObserver(sensorObserver13);
        java.lang.String str15 = room4.getFullLocation();
        java.lang.String str16 = room4.getScannedID();
        java.lang.String str17 = room4.toString();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi! - hi!" + "'", str7, "hi! - hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str11, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi! - hi!" + "'", str12, "hi! - hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi! - hi!" + "'", str15, "hi! - hi!");
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str17, "Room hi! | hi! - hi! | Capacity: 0");
    }

    @Test
    public void test03806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03806");
        room.Room room4 = new room.Room("Room Room hi! | hi! - hi! | Capacity: 0 | Room hi! | hi! - hi! | Capacity: 0 - hi! - hi! | Capacity: 100", (-1), "", "hi! - hi! - Room hi! | hi! - hi! | Capacity: 0");
        java.lang.String str5 = room4.getRoomID();
        boolean boolean6 = room4.isOccupied();
        java.lang.String str7 = room4.getRoomNumber();
        boolean boolean8 = room4.isEnabled();
        java.lang.Class<?> wildcardClass9 = room4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Room Room hi! | hi! - hi! | Capacity: 0 | Room hi! | hi! - hi! | Capacity: 0 - hi! - hi! | Capacity: 100" + "'", str5, "Room Room hi! | hi! - hi! | Capacity: 0 | Room hi! | hi! - hi! | Capacity: 0 - hi! - hi! | Capacity: 100");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi! - hi! - Room hi! | hi! - hi! | Capacity: 0" + "'", str7, "hi! - hi! - Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test03807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03807");
        room.Room room4 = new room.Room("hi!", (int) (byte) 100, "", "Room hi! | hi! - hi! | Capacity: 0");
        room4.setScannedID("");
        room4.notifyObservers();
        java.lang.String str8 = room4.getBuildingName();
        boolean boolean9 = room4.isUnderMaintenance();
        java.lang.String str10 = room4.toString();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100" + "'", str10, "Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100");
    }

    @Test
    public void test03808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03808");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        java.lang.String str5 = room4.getScannedID();
        room4.setScannedID("hi!");
        boolean boolean8 = room4.isEnabled();
        int int9 = room4.getCapacity();
        boolean boolean10 = room4.isOccupied();
        java.lang.String str11 = room4.getRoomNumber();
        room4.setEnabled(false);
        java.lang.String str14 = room4.toString();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str14, "Room hi! | hi! - hi! | Capacity: 0");
    }

    @Test
    public void test03809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03809");
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
        boolean boolean20 = room4.isUnderMaintenance();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str7, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str10, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str14, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi! - hi!" + "'", str16, "hi! - hi!");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test03810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03810");
        room.Room room4 = new room.Room("hi!", (int) (byte) 100, "", "Room hi! | hi! - hi! | Capacity: 0");
        room4.setScannedID("");
        boolean boolean7 = room4.isOccupied();
        room4.setOccupied(true);
        boolean boolean10 = room4.isEnabled();
        boolean boolean11 = room4.isEnabled();
        java.lang.String str12 = room4.getBuildingName();
        boolean boolean13 = room4.isEnabled();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test03811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03811");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        java.lang.String str5 = room4.getScannedID();
        room4.setScannedID("hi!");
        room4.setUnderMaintenance(true);
        room.SensorObserver sensorObserver10 = null;
        room4.removeObserver(sensorObserver10);
        java.lang.String str12 = room4.getScannedID();
        int int13 = room4.getCapacity();
        java.lang.String str14 = room4.toString();
        boolean boolean15 = room4.isUnderMaintenance();
        java.lang.String str16 = room4.getFullLocation();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str14, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi! - hi!" + "'", str16, "hi! - hi!");
    }

    @Test
    public void test03812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03812");
        room.Room room4 = new room.Room("hi!", (int) (byte) 1, "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10", "hi!");
        room4.notifyObservers();
        room4.setOccupied(false);
        room4.setUnderMaintenance(true);
        room4.setEnabled(true);
        room.SensorObserver sensorObserver12 = null;
        room4.addObserver(sensorObserver12);
        boolean boolean14 = room4.isOccupied();
        // The following exception was thrown during execution in test generation
        try {
            room4.setOccupied(false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test03813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03813");
        room.Room room4 = new room.Room("hi!", (int) (byte) 1, "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10", "hi!");
        room4.notifyObservers();
        room4.setUnderMaintenance(false);
        room.SensorObserver sensorObserver8 = null;
        room4.removeObserver(sensorObserver8);
        java.lang.String str10 = room4.toString();
        boolean boolean11 = room4.isUnderMaintenance();
        room.SensorObserver sensorObserver12 = null;
        room4.addObserver(sensorObserver12);
        java.lang.String str14 = room4.getRoomNumber();
        // The following exception was thrown during execution in test generation
        try {
            room4.setOccupied(true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Room hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 1" + "'", str10, "Room hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 1");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test03814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03814");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        java.lang.String str5 = room4.getScannedID();
        room4.setScannedID("hi!");
        java.lang.String str8 = room4.getBuildingName();
        room4.setEnabled(false);
        room.SensorObserver sensorObserver11 = null;
        room4.removeObserver(sensorObserver11);
        java.lang.String str13 = room4.getBuildingName();
        java.lang.String str14 = room4.getRoomID();
        java.lang.String str15 = room4.getFullLocation();
        room4.setScannedID("Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 -  - Room hi! | hi! - hi! | Capacity: 0 - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! - ");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi! - hi!" + "'", str15, "hi! - hi!");
    }

    @Test
    public void test03815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03815");
        room.Room room4 = new room.Room("Room Room hi! | hi! - hi! | Capacity: 0 | Room hi! | hi! - hi! | Capacity: 0 - hi! - hi! | Capacity: 100", (int) (byte) 10, "", "hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10");
        room4.setEnabled(false);
        room.SensorObserver sensorObserver7 = null;
        room4.removeObserver(sensorObserver7);
        room4.notifyObservers();
    }

    @Test
    public void test03816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03816");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        boolean boolean5 = room4.isOccupied();
        room4.setEnabled(false);
        boolean boolean8 = room4.isUnderMaintenance();
        java.lang.String str9 = room4.getFullLocation();
        room4.setUnderMaintenance(false);
        room4.notifyObservers();
        java.lang.String str13 = room4.toString();
        room4.setScannedID("Room hi! | hi! - hi! - Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | Capacity: 0");
        java.lang.String str16 = room4.getBuildingName();
        boolean boolean17 = room4.isOccupied();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi! - hi!" + "'", str9, "hi! - hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str13, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test03817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03817");
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
        boolean boolean19 = room4.isEnabled();
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str11, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test03818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03818");
        room.Room room4 = new room.Room("Room Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! | Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! | Capacity: 10", (int) (short) 0, "", "Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi!");
        java.lang.String str5 = room4.getFullLocation();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + " - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi!" + "'", str5, " - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi!");
    }

    @Test
    public void test03819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03819");
        room.Room room4 = new room.Room("Room  - Room hi! | hi! - hi! | Capacity: 0 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 0 - hi!", (int) (short) 10, " - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi!", "Room  - Room hi! | hi! - hi! | Capacity: 0 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 0");
        java.lang.String str5 = room4.toString();
        int int6 = room4.getCapacity();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Room Room  - Room hi! | hi! - hi! | Capacity: 0 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 0 - hi! |  - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! - Room  - Room hi! | hi! - hi! | Capacity: 0 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 0 | Capacity: 10" + "'", str5, "Room Room  - Room hi! | hi! - hi! | Capacity: 0 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 0 - hi! |  - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! - Room  - Room hi! | hi! - hi! | Capacity: 0 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 0 | Capacity: 10");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
    }

    @Test
    public void test03820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03820");
        room.Room room4 = new room.Room("Room Room Room hi! | hi! - hi! | Capacity: 0 - hi! | Room hi! | Room hi! | hi! - hi! | Capacity: 0 - hi! - Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 1 - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 32 |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 35", (int) ' ', "Room Room  - Room hi! | hi! - hi! | Capacity: 0 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 0 -  | Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! | Capacity: 32", "Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - Room hi! | hi! - hi! | Capacity: 0 - hi!");
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
    public void test03821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03821");
        room.Room room4 = new room.Room("hi!", (int) (byte) 100, "", "Room hi! | hi! - hi! | Capacity: 0");
        java.lang.String str5 = room4.getScannedID();
        java.lang.String str6 = room4.getBuildingName();
        room4.setUnderMaintenance(false);
        java.lang.String str9 = room4.getScannedID();
        int int10 = room4.getCapacity();
        boolean boolean11 = room4.isOccupied();
        room4.setScannedID("Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  - Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test03822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03822");
        room.Room room4 = new room.Room("", 1, "Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi!", "Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10");
        room.SensorObserver sensorObserver5 = null;
        room4.addObserver(sensorObserver5);
        boolean boolean7 = room4.isEnabled();
        int int8 = room4.getCapacity();
        java.lang.Class<?> wildcardClass9 = room4.getClass();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test03823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03823");
        room.Room room4 = new room.Room("", (int) (byte) 100, "Room hi! | hi! - hi! | Capacity: 0 - hi!", "");
        java.lang.String str5 = room4.getBuildingName();
        java.lang.String str6 = room4.getRoomNumber();
        room.SensorObserver sensorObserver7 = null;
        room4.removeObserver(sensorObserver7);
        room4.setOccupied(false);
        room4.setUnderMaintenance(false);
        room4.setScannedID("Room Room hi! | hi! - hi! | Capacity: 0 | Room hi! | hi! - hi! | Capacity: 0 - hi! - hi! | Capacity: 100 - Room  - Room hi! | hi! - hi! | Capacity: 0 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0 - hi!" + "'", str5, "Room hi! | hi! - hi! | Capacity: 0 - hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test03824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03824");
        room.Room room4 = new room.Room("Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100", (int) 'a', "hi! - hi!", "Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10");
        java.lang.String str5 = room4.toString();
        room4.setScannedID("Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi!");
        room4.setUnderMaintenance(true);
        room.SensorObserver sensorObserver10 = null;
        room4.addObserver(sensorObserver10);
        java.lang.String str12 = room4.getRoomNumber();
        // The following exception was thrown during execution in test generation
        try {
            room4.notifyObservers();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 97" + "'", str5, "Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 97");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10" + "'", str12, "Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10");
    }

    @Test
    public void test03825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03825");
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
        java.lang.String str14 = room4.getRoomNumber();
        boolean boolean15 = room4.isOccupied();
        java.lang.Class<?> wildcardClass16 = room4.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi! - hi!" + "'", str7, "hi! - hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test03826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03826");
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
        room4.setUnderMaintenance(false);
        room4.setScannedID("Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | hi! - hi! | Capacity: 0 - hi! - ");
        java.lang.String str23 = room4.getScannedID();
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str11, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str16, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | hi! - hi! | Capacity: 0 - hi! - " + "'", str23, "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | hi! - hi! | Capacity: 0 - hi! - ");
    }

    @Test
    public void test03827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03827");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        room.SensorObserver sensorObserver5 = null;
        room4.addObserver(sensorObserver5);
        java.lang.String str7 = room4.getScannedID();
        room.SensorObserver sensorObserver8 = null;
        room4.removeObserver(sensorObserver8);
        java.lang.String str10 = room4.getRoomNumber();
        java.lang.String str11 = room4.toString();
        java.lang.String str12 = room4.getRoomID();
        int int13 = room4.getCapacity();
        java.lang.String str14 = room4.toString();
        room.SensorObserver sensorObserver15 = null;
        room4.addObserver(sensorObserver15);
        java.lang.String str17 = room4.getRoomID();
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str11, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str14, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test03828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03828");
        room.Room room4 = new room.Room("", (int) (byte) 1, "Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10", "hi!");
        java.lang.String str5 = room4.getFullLocation();
        room4.setScannedID("Room hi! | hi! - hi! | Capacity: 0");
        java.lang.String str8 = room4.getFullLocation();
        boolean boolean9 = room4.isOccupied();
        room4.setEnabled(false);
        java.lang.String str12 = room4.getRoomNumber();
        java.lang.String str13 = room4.toString();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi!" + "'", str5, "Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi!" + "'", str8, "Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Room  | Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! | Capacity: 1" + "'", str13, "Room  | Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! | Capacity: 1");
    }

    @Test
    public void test03829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03829");
        room.Room room4 = new room.Room("hi!", (int) (byte) 100, "", "Room hi! | hi! - hi! | Capacity: 0");
        room4.notifyObservers();
        room.SensorObserver sensorObserver6 = null;
        room4.removeObserver(sensorObserver6);
        java.lang.String str8 = room4.getRoomNumber();
        int int9 = room4.getCapacity();
        room4.notifyObservers();
        java.lang.String str11 = room4.getBuildingName();
        room4.setUnderMaintenance(true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str8, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test03830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03830");
        room.Room room4 = new room.Room("hi!", (int) (byte) 100, "", "Room hi! | hi! - hi! | Capacity: 0");
        room4.setScannedID("");
        boolean boolean7 = room4.isOccupied();
        java.lang.String str8 = room4.getRoomID();
        java.lang.String str9 = room4.toString();
        boolean boolean10 = room4.isOccupied();
        java.lang.String str11 = room4.getRoomNumber();
        java.lang.Class<?> wildcardClass12 = room4.getClass();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100" + "'", str9, "Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str11, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test03831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03831");
        room.Room room4 = new room.Room("Room  - Room hi! | hi! - hi! | Capacity: 0 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 0", (int) 'a', "Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10", "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10");
        java.lang.String str5 = room4.getRoomID();
        room.SensorObserver sensorObserver6 = null;
        room4.removeObserver(sensorObserver6);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Room  - Room hi! | hi! - hi! | Capacity: 0 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 0" + "'", str5, "Room  - Room hi! | hi! - hi! | Capacity: 0 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 0");
    }

    @Test
    public void test03832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03832");
        room.Room room4 = new room.Room("Room Room hi! - hi! - Room hi! | hi! - hi! | Capacity: 0 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 100 | Capacity: 10 | Room hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 1 - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100", (int) (short) 1, "Room  - Room hi! | hi! - hi! | Capacity: 0 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 0 - hi! -  - hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10", "");
        java.lang.String str5 = room4.toString();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Room Room Room hi! - hi! - Room hi! | hi! - hi! | Capacity: 0 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 100 | Capacity: 10 | Room hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 1 - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | Room  - Room hi! | hi! - hi! | Capacity: 0 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 0 - hi! -  - hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 -  | Capacity: 1" + "'", str5, "Room Room Room hi! - hi! - Room hi! | hi! - hi! | Capacity: 0 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 100 | Capacity: 10 | Room hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 1 - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | Room  - Room hi! | hi! - hi! | Capacity: 0 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 0 - hi! -  - hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 -  | Capacity: 1");
    }

    @Test
    public void test03833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03833");
        room.Room room4 = new room.Room(" - Room hi! | hi! - hi! | Capacity: 0", (int) (byte) 100, "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi!", "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10");
        room.SensorObserver sensorObserver5 = null;
        room4.removeObserver(sensorObserver5);
        java.lang.String str7 = room4.getBuildingName();
        java.lang.String str8 = room4.getBuildingName();
        java.lang.Class<?> wildcardClass9 = room4.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi!" + "'", str7, "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi!" + "'", str8, "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi!");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test03834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03834");
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
        java.lang.String str16 = room4.getRoomID();
        room4.setEnabled(false);
        java.lang.String str19 = room4.getBuildingName();
        room4.setScannedID("Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! - hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 97 | Capacity: 32");
        java.lang.String str22 = room4.getRoomID();
        java.lang.String str23 = room4.getScannedID();
        java.lang.String str24 = room4.getRoomID();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! - hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 97 | Capacity: 32" + "'", str23, "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! - hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 97 | Capacity: 32");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
    }

    @Test
    public void test03835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03835");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        java.lang.String str5 = room4.getScannedID();
        room4.setScannedID("hi!");
        java.lang.String str8 = room4.getBuildingName();
        java.lang.String str9 = room4.getFullLocation();
        java.lang.String str10 = room4.getRoomNumber();
        int int11 = room4.getCapacity();
        boolean boolean12 = room4.isOccupied();
        int int13 = room4.getCapacity();
        room.SensorObserver sensorObserver14 = null;
        room4.addObserver(sensorObserver14);
        // The following exception was thrown during execution in test generation
        try {
            room4.setEnabled(false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi! - hi!" + "'", str9, "hi! - hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test03836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03836");
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
        boolean boolean17 = room4.isEnabled();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str7, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test03837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03837");
        room.Room room4 = new room.Room("Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 | hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 0", 0, "Room hi! | hi! - hi! | Capacity: 0", "Room Room hi! - hi! - hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 1 | Capacity: 0 | Room hi! -  | Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 10 -  | Capacity: 52");
        room4.notifyObservers();
        java.lang.String str6 = room4.getRoomID();
        room4.notifyObservers();
        java.lang.Class<?> wildcardClass8 = room4.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 | hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 0" + "'", str6, "Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 | hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 0");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test03838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03838");
        room.Room room4 = new room.Room("hi!", (int) '#', "Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10", "Room hi! | hi! - hi! | Capacity: 0 - hi!");
        room.SensorObserver sensorObserver5 = null;
        room4.addObserver(sensorObserver5);
        java.lang.String str7 = room4.getRoomNumber();
        java.lang.Class<?> wildcardClass8 = room4.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0 - hi!" + "'", str7, "Room hi! | hi! - hi! | Capacity: 0 - hi!");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test03839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03839");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        java.lang.String str5 = room4.getScannedID();
        room4.setScannedID("hi!");
        room4.setUnderMaintenance(true);
        room4.setOccupied(true);
        java.lang.String str12 = room4.getRoomID();
        room4.setScannedID("Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 100");
        java.lang.Class<?> wildcardClass15 = room4.getClass();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test03840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03840");
        room.Room room4 = new room.Room("Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi!", (int) (byte) 100, "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10", "hi! - hi! - hi!");
        boolean boolean5 = room4.isUnderMaintenance();
        java.lang.String str6 = room4.getBuildingName();
        room.SensorObserver sensorObserver7 = null;
        room4.addObserver(sensorObserver7);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10" + "'", str6, "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10");
    }

    @Test
    public void test03841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03841");
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
        room4.setOccupied(false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str11, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test03842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03842");
        room.Room room4 = new room.Room("Room hi! | hi! - hi! | Capacity: 0", (int) (byte) 10, "hi!", "");
        room4.setUnderMaintenance(true);
        java.lang.String str7 = room4.toString();
        java.lang.String str8 = room4.getBuildingName();
        java.lang.String str9 = room4.toString();
        java.lang.String str10 = room4.getScannedID();
        boolean boolean11 = room4.isOccupied();
        java.lang.String str12 = room4.getBuildingName();
        java.lang.String str13 = room4.getScannedID();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10" + "'", str7, "Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10" + "'", str9, "Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test03843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03843");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        java.lang.String str5 = room4.getScannedID();
        room4.setScannedID("hi!");
        java.lang.String str8 = room4.getBuildingName();
        java.lang.String str9 = room4.getFullLocation();
        java.lang.String str10 = room4.getRoomNumber();
        int int11 = room4.getCapacity();
        java.lang.String str12 = room4.getScannedID();
        java.lang.String str13 = room4.getFullLocation();
        room.SensorObserver sensorObserver14 = null;
        room4.addObserver(sensorObserver14);
        room.SensorObserver sensorObserver16 = null;
        room4.addObserver(sensorObserver16);
        boolean boolean18 = room4.isOccupied();
        java.lang.String str19 = room4.getScannedID();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi! - hi!" + "'", str9, "hi! - hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi! - hi!" + "'", str13, "hi! - hi!");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test03844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03844");
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
        java.lang.String str16 = room4.toString();
        room.SensorObserver sensorObserver17 = null;
        room4.removeObserver(sensorObserver17);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi! - hi!" + "'", str7, "hi! - hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str16, "Room hi! | hi! - hi! | Capacity: 0");
    }

    @Test
    public void test03845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03845");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        java.lang.String str5 = room4.getScannedID();
        room4.setScannedID("hi!");
        room4.setUnderMaintenance(true);
        java.lang.String str10 = room4.getScannedID();
        java.lang.String str11 = room4.getFullLocation();
        boolean boolean12 = room4.isUnderMaintenance();
        room.SensorObserver sensorObserver13 = null;
        room4.addObserver(sensorObserver13);
        // The following exception was thrown during execution in test generation
        try {
            room4.notifyObservers();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi! - hi!" + "'", str11, "hi! - hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test03846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03846");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        java.lang.String str5 = room4.getScannedID();
        room4.setScannedID("hi!");
        room4.setUnderMaintenance(true);
        room.SensorObserver sensorObserver10 = null;
        room4.removeObserver(sensorObserver10);
        java.lang.String str12 = room4.getScannedID();
        int int13 = room4.getCapacity();
        boolean boolean14 = room4.isEnabled();
        room4.setUnderMaintenance(false);
        room4.setOccupied(false);
        room.SensorObserver sensorObserver19 = null;
        room4.addObserver(sensorObserver19);
        // The following exception was thrown during execution in test generation
        try {
            room4.setScannedID("Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! - ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test03847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03847");
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
        room4.notifyObservers();
        room4.setEnabled(true);
        int int17 = room4.getCapacity();
        room4.notifyObservers();
        java.lang.String str19 = room4.getFullLocation();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str7, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi! - hi!" + "'", str19, "hi! - hi!");
    }

    @Test
    public void test03848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03848");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        java.lang.String str5 = room4.getScannedID();
        room4.setScannedID("hi!");
        java.lang.String str8 = room4.getRoomNumber();
        java.lang.String str9 = room4.getFullLocation();
        room4.setScannedID("hi! - hi! - hi!");
        int int12 = room4.getCapacity();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi! - hi!" + "'", str9, "hi! - hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test03849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03849");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        boolean boolean5 = room4.isOccupied();
        room4.setEnabled(false);
        boolean boolean8 = room4.isUnderMaintenance();
        boolean boolean9 = room4.isUnderMaintenance();
        boolean boolean10 = room4.isOccupied();
        java.lang.String str11 = room4.getBuildingName();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test03850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03850");
        room.Room room4 = new room.Room("Room hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 1", (int) (short) -1, "Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi!", "Room hi! | hi! - hi! | Capacity: 0 - hi!");
        room4.setOccupied(true);
        java.lang.String str7 = room4.getScannedID();
        java.lang.String str8 = room4.getScannedID();
        java.lang.String str9 = room4.toString();
        java.lang.String str10 = room4.getFullLocation();
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Room Room hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 1 | Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! - Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: -1" + "'", str9, "Room Room hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 1 | Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! - Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: -1");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! - Room hi! | hi! - hi! | Capacity: 0 - hi!" + "'", str10, "Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! - Room hi! | hi! - hi! | Capacity: 0 - hi!");
    }

    @Test
    public void test03851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03851");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        java.lang.String str5 = room4.getScannedID();
        room.SensorObserver sensorObserver6 = null;
        room4.removeObserver(sensorObserver6);
        boolean boolean8 = room4.isUnderMaintenance();
        java.lang.String str9 = room4.getRoomID();
        room4.setUnderMaintenance(true);
        boolean boolean12 = room4.isOccupied();
        java.lang.String str13 = room4.toString();
        boolean boolean14 = room4.isUnderMaintenance();
        int int15 = room4.getCapacity();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str13, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test03852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03852");
        room.Room room4 = new room.Room("hi!", (int) (byte) 100, "", "Room hi! | hi! - hi! | Capacity: 0");
        java.lang.String str5 = room4.toString();
        java.lang.String str6 = room4.getFullLocation();
        room.SensorObserver sensorObserver7 = null;
        room4.removeObserver(sensorObserver7);
        room.SensorObserver sensorObserver9 = null;
        room4.addObserver(sensorObserver9);
        room.SensorObserver sensorObserver11 = null;
        room4.removeObserver(sensorObserver11);
        room4.setEnabled(true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100" + "'", str5, "Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + " - Room hi! | hi! - hi! | Capacity: 0" + "'", str6, " - Room hi! | hi! - hi! | Capacity: 0");
    }

    @Test
    public void test03853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03853");
        room.Room room4 = new room.Room("", (int) (byte) 1, "Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10", "hi!");
        java.lang.String str5 = room4.getFullLocation();
        room4.setScannedID("Room hi! | hi! - hi! | Capacity: 0");
        java.lang.String str8 = room4.getFullLocation();
        boolean boolean9 = room4.isOccupied();
        room4.setScannedID("Room hi! | hi! - hi! | Capacity: 0 - hi!");
        room4.setOccupied(false);
        room4.setUnderMaintenance(true);
        java.lang.Class<?> wildcardClass16 = room4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi!" + "'", str5, "Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi!" + "'", str8, "Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test03854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03854");
        room.Room room4 = new room.Room("Room hi! | hi! - hi! | Capacity: 0", (int) (byte) 10, "hi!", "");
        room4.setUnderMaintenance(true);
        java.lang.String str7 = room4.toString();
        room4.notifyObservers();
        room4.setScannedID("hi! - hi!");
        room4.setOccupied(false);
        int int13 = room4.getCapacity();
        java.lang.String str14 = room4.getScannedID();
        room4.setOccupied(false);
        room4.setScannedID("Room Room hi! | hi! - hi! | Capacity: 0 | hi! - hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 97");
        java.lang.String str19 = room4.getScannedID();
        int int20 = room4.getCapacity();
        room4.notifyObservers();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10" + "'", str7, "Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi! - hi!" + "'", str14, "hi! - hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Room Room hi! | hi! - hi! | Capacity: 0 | hi! - hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 97" + "'", str19, "Room Room hi! | hi! - hi! | Capacity: 0 | hi! - hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 97");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
    }

    @Test
    public void test03855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03855");
        room.Room room4 = new room.Room("Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi!", (-1), " - Room hi! | hi! - hi! | Capacity: 0", "Room hi! | hi! - hi! | Capacity: 0 - hi!");
        java.lang.String str5 = room4.getRoomID();
        java.lang.String str6 = room4.getScannedID();
        java.lang.String str7 = room4.getScannedID();
        boolean boolean8 = room4.isOccupied();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi!" + "'", str5, "Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi!");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test03856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03856");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        boolean boolean5 = room4.isOccupied();
        room4.setEnabled(false);
        boolean boolean8 = room4.isUnderMaintenance();
        java.lang.String str9 = room4.getFullLocation();
        boolean boolean10 = room4.isOccupied();
        java.lang.String str11 = room4.toString();
        boolean boolean12 = room4.isEnabled();
        java.lang.String str13 = room4.getBuildingName();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi! - hi!" + "'", str9, "hi! - hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str11, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test03857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03857");
        room.Room room4 = new room.Room("Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - hi! | Capacity: 1", 0, "Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 100 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 -  - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! | Capacity: 0", "Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 | hi! - hi! - Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 - Room hi! | hi! - hi! | Capacity: 0 - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 0");
    }

    @Test
    public void test03858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03858");
        room.Room room4 = new room.Room("", 0, "Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100", "Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi!");
        boolean boolean5 = room4.isOccupied();
        room4.notifyObservers();
        java.lang.String str7 = room4.getBuildingName();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100" + "'", str7, "Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100");
    }

    @Test
    public void test03859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03859");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        java.lang.String str5 = room4.getScannedID();
        room4.setScannedID("hi!");
        java.lang.String str8 = room4.getRoomID();
        room4.setScannedID("hi! - hi!");
        int int11 = room4.getCapacity();
        java.lang.String str12 = room4.getFullLocation();
        java.lang.String str13 = room4.getScannedID();
        room4.setOccupied(false);
        java.lang.Class<?> wildcardClass16 = room4.getClass();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi! - hi!" + "'", str12, "hi! - hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi! - hi!" + "'", str13, "hi! - hi!");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test03860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03860");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        room.SensorObserver sensorObserver5 = null;
        room4.addObserver(sensorObserver5);
        java.lang.String str7 = room4.getScannedID();
        room.SensorObserver sensorObserver8 = null;
        room4.removeObserver(sensorObserver8);
        java.lang.String str10 = room4.getRoomNumber();
        java.lang.String str11 = room4.toString();
        room4.setUnderMaintenance(true);
        room4.setUnderMaintenance(false);
        room4.setEnabled(false);
        room.SensorObserver sensorObserver18 = null;
        room4.removeObserver(sensorObserver18);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str11, "Room hi! | hi! - hi! | Capacity: 0");
    }

    @Test
    public void test03861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03861");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        boolean boolean5 = room4.isOccupied();
        boolean boolean6 = room4.isEnabled();
        java.lang.String str7 = room4.getRoomID();
        room4.setScannedID("");
        java.lang.String str10 = room4.getFullLocation();
        java.lang.String str11 = room4.getFullLocation();
        room.SensorObserver sensorObserver12 = null;
        room4.addObserver(sensorObserver12);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi! - hi!" + "'", str10, "hi! - hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi! - hi!" + "'", str11, "hi! - hi!");
    }

    @Test
    public void test03862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03862");
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
        boolean boolean17 = room4.isEnabled();
        room4.setOccupied(false);
        boolean boolean20 = room4.isOccupied();
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi! - hi!" + "'", str8, "hi! - hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test03863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03863");
        room.Room room4 = new room.Room("Room Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! |  - hi! -  | Capacity: 100", (int) (short) 0, " - hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10", "Room Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Room  - Room hi! | hi! - hi! | Capacity: 0 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 0 - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 1");
        boolean boolean5 = room4.isOccupied();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test03864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03864");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        java.lang.String str5 = room4.getBuildingName();
        java.lang.String str6 = room4.getRoomID();
        room4.setUnderMaintenance(false);
        int int9 = room4.getCapacity();
        room.SensorObserver sensorObserver10 = null;
        room4.removeObserver(sensorObserver10);
        boolean boolean12 = room4.isOccupied();
        java.lang.String str13 = room4.getRoomNumber();
        boolean boolean14 = room4.isEnabled();
        java.lang.String str15 = room4.getBuildingName();
        boolean boolean16 = room4.isUnderMaintenance();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test03865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03865");
        room.Room room4 = new room.Room("Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10", 0, "hi!", "Room hi! | hi! - hi! | Capacity: 0");
        java.lang.String str5 = room4.getBuildingName();
        boolean boolean6 = room4.isEnabled();
        room.SensorObserver sensorObserver7 = null;
        room4.removeObserver(sensorObserver7);
        room4.setUnderMaintenance(true);
        java.lang.String str11 = room4.getBuildingName();
        java.lang.String str12 = room4.getRoomNumber();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str12, "Room hi! | hi! - hi! | Capacity: 0");
    }

    @Test
    public void test03866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03866");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        boolean boolean5 = room4.isOccupied();
        room4.setEnabled(false);
        room4.setUnderMaintenance(false);
        room4.setScannedID("Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | hi! - hi! - hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 0");
        java.lang.String str12 = room4.toString();
        room4.setOccupied(false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str12, "Room hi! | hi! - hi! | Capacity: 0");
    }

    @Test
    public void test03867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03867");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        java.lang.String str5 = room4.getScannedID();
        room4.setScannedID("hi!");
        room4.setUnderMaintenance(true);
        room4.setOccupied(true);
        room4.setScannedID("Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100");
        boolean boolean14 = room4.isOccupied();
        room.SensorObserver sensorObserver15 = null;
        room4.addObserver(sensorObserver15);
        java.lang.String str17 = room4.getRoomID();
        java.lang.String str18 = room4.getRoomID();
        // The following exception was thrown during execution in test generation
        try {
            room4.setEnabled(true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test03868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03868");
        room.Room room4 = new room.Room("Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100", (int) 'a', "hi! - hi!", "Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10");
        java.lang.String str5 = room4.toString();
        java.lang.String str6 = room4.getScannedID();
        java.lang.String str7 = room4.toString();
        boolean boolean8 = room4.isOccupied();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 97" + "'", str5, "Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 97");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 97" + "'", str7, "Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 97");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test03869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03869");
        room.Room room4 = new room.Room("Room hi! | hi! - hi! | Capacity: 0", (int) (byte) 10, "hi!", "");
        room4.setUnderMaintenance(true);
        java.lang.String str7 = room4.toString();
        java.lang.String str8 = room4.getBuildingName();
        java.lang.String str9 = room4.toString();
        java.lang.String str10 = room4.getScannedID();
        boolean boolean11 = room4.isOccupied();
        java.lang.String str12 = room4.getBuildingName();
        room4.setUnderMaintenance(true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10" + "'", str7, "Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10" + "'", str9, "Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test03870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03870");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        java.lang.String str5 = room4.getScannedID();
        room4.setScannedID("hi!");
        boolean boolean8 = room4.isEnabled();
        int int9 = room4.getCapacity();
        boolean boolean10 = room4.isOccupied();
        boolean boolean11 = room4.isUnderMaintenance();
        java.lang.String str12 = room4.getBuildingName();
        boolean boolean13 = room4.isEnabled();
        java.lang.String str14 = room4.getScannedID();
        java.lang.String str15 = room4.getScannedID();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test03871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03871");
        room.Room room4 = new room.Room("Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100", 32, "Room Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! - hi! - hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: -1 - Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 | Room Room hi! | hi! - hi! | Capacity: 0 | Room hi! | hi! - hi! | Capacity: 0 - hi! - hi! | Capacity: 100 - hi! - hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 0", "Room  - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 100 | hi! - hi! - hi! - hi! | Capacity: 0 | Capacity: 0");
        boolean boolean5 = room4.isEnabled();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test03872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03872");
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
        boolean boolean17 = room4.isUnderMaintenance();
        boolean boolean18 = room4.isUnderMaintenance();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test03873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03873");
        room.Room room4 = new room.Room("Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100", (int) 'a', "hi! - hi!", "Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10");
        java.lang.String str5 = room4.toString();
        room4.setScannedID("Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi!");
        room4.setOccupied(true);
        java.lang.String str10 = room4.toString();
        java.lang.Class<?> wildcardClass11 = room4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 97" + "'", str5, "Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 97");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 97" + "'", str10, "Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 97");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test03874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03874");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        room.SensorObserver sensorObserver5 = null;
        room4.addObserver(sensorObserver5);
        java.lang.String str7 = room4.getFullLocation();
        // The following exception was thrown during execution in test generation
        try {
            room4.setUnderMaintenance(false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi! - hi!" + "'", str7, "hi! - hi!");
    }

    @Test
    public void test03875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03875");
        room.Room room4 = new room.Room("Room hi! | hi! - hi! | Capacity: 0", (int) (byte) 100, "Room hi! | hi! - hi! | Capacity: 0 - hi!", "hi!");
        java.lang.String str5 = room4.getRoomID();
        room4.setEnabled(false);
        room.SensorObserver sensorObserver8 = null;
        room4.removeObserver(sensorObserver8);
        java.lang.String str10 = room4.getRoomID();
        room4.setEnabled(false);
        room4.setEnabled(false);
        boolean boolean15 = room4.isEnabled();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str5, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str10, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test03876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03876");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        java.lang.String str5 = room4.getScannedID();
        room4.setScannedID("hi!");
        java.lang.String str8 = room4.getBuildingName();
        room4.setEnabled(false);
        room4.notifyObservers();
        java.lang.String str12 = room4.toString();
        int int13 = room4.getCapacity();
        java.lang.String str14 = room4.getFullLocation();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str12, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi! - hi!" + "'", str14, "hi! - hi!");
    }

    @Test
    public void test03877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03877");
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
        java.lang.String str16 = room4.getFullLocation();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi! - " + "'", str15, "hi! - ");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi! - " + "'", str16, "hi! - ");
    }

    @Test
    public void test03878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03878");
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
        boolean boolean18 = room4.isUnderMaintenance();
        boolean boolean19 = room4.isOccupied();
        boolean boolean20 = room4.isUnderMaintenance();
        java.lang.String str21 = room4.getBuildingName();
        java.lang.String str22 = room4.getBuildingName();
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str11, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str17, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
    }

    @Test
    public void test03879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03879");
        room.Room room4 = new room.Room("", 0, "Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100", "Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi!");
        java.lang.String str5 = room4.getBuildingName();
        room4.setScannedID("Room hi! - hi! - hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 1 | Capacity: 0 - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100" + "'", str5, "Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100");
    }

    @Test
    public void test03880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03880");
        room.Room room4 = new room.Room("Room  - Room hi! | hi! - hi! | Capacity: 0 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 0 - ", 97, "hi! - hi! - hi! - hi!", "Room hi! | hi! - hi! | Capacity: 0 - hi! - hi! - Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | hi! -  - Room  - Room hi! | hi! - hi! | Capacity: 0 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 0 | Capacity: 10");
        boolean boolean5 = room4.isEnabled();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test03881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03881");
        room.Room room4 = new room.Room("hi!", (int) (byte) 100, "", "Room hi! | hi! - hi! | Capacity: 0");
        java.lang.String str5 = room4.getRoomNumber();
        room4.notifyObservers();
        room.SensorObserver sensorObserver7 = null;
        room4.addObserver(sensorObserver7);
        room.SensorObserver sensorObserver9 = null;
        room4.removeObserver(sensorObserver9);
        room4.setEnabled(false);
        room4.notifyObservers();
        int int14 = room4.getCapacity();
        java.lang.String str15 = room4.getScannedID();
        java.lang.String str16 = room4.getRoomID();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str5, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test03882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03882");
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
        room4.setUnderMaintenance(true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi! - hi!" + "'", str8, "hi! - hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test03883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03883");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        java.lang.String str5 = room4.getScannedID();
        room4.setScannedID("hi!");
        room4.setUnderMaintenance(true);
        room4.setOccupied(true);
        java.lang.String str12 = room4.getRoomNumber();
        int int13 = room4.getCapacity();
        java.lang.String str14 = room4.getScannedID();
        int int15 = room4.getCapacity();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test03884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03884");
        room.Room room4 = new room.Room("", (-1), "", "");
        room.SensorObserver sensorObserver5 = null;
        room4.removeObserver(sensorObserver5);
        java.lang.String str7 = room4.getRoomID();
        java.lang.String str8 = room4.getFullLocation();
        java.lang.String str9 = room4.getScannedID();
        boolean boolean10 = room4.isEnabled();
        java.lang.String str11 = room4.getFullLocation();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + " - " + "'", str8, " - ");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + " - " + "'", str11, " - ");
    }

    @Test
    public void test03885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03885");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        room.SensorObserver sensorObserver5 = null;
        room4.addObserver(sensorObserver5);
        java.lang.String str7 = room4.toString();
        room.SensorObserver sensorObserver8 = null;
        room4.removeObserver(sensorObserver8);
        java.lang.String str10 = room4.toString();
        java.lang.String str11 = room4.getRoomID();
        boolean boolean12 = room4.isEnabled();
        boolean boolean13 = room4.isOccupied();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str7, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str10, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test03886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03886");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        java.lang.String str5 = room4.getScannedID();
        room4.setScannedID("hi!");
        boolean boolean8 = room4.isEnabled();
        room.SensorObserver sensorObserver9 = null;
        room4.removeObserver(sensorObserver9);
        boolean boolean11 = room4.isEnabled();
        room4.setOccupied(true);
        boolean boolean14 = room4.isOccupied();
        room4.setOccupied(true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test03887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03887");
        room.Room room4 = new room.Room("Room Room hi! | hi! - hi! | Capacity: 0 | Room hi! | hi! - hi! | Capacity: 0 - hi! - hi! | Capacity: 100", 32, "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | hi! - hi! | Capacity: 0 - hi! - ", "hi! - Room hi! | hi! - hi! | Capacity: 0 - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi!");
    }

    @Test
    public void test03888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03888");
        room.Room room4 = new room.Room("hi! - hi! - Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100", (-1), "Room hi! | hi! - hi! | Capacity: 0 - hi!", " - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi!");
        java.lang.String str5 = room4.getBuildingName();
        room.SensorObserver sensorObserver6 = null;
        room4.addObserver(sensorObserver6);
        // The following exception was thrown during execution in test generation
        try {
            room4.setScannedID("Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | hi! - hi! | Capacity: 0 - hi! - ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0 - hi!" + "'", str5, "Room hi! | hi! - hi! | Capacity: 0 - hi!");
    }

    @Test
    public void test03889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03889");
        room.Room room4 = new room.Room("", (int) (short) 10, "Room hi! | hi! - hi! | Capacity: 0", "hi!");
        java.lang.String str5 = room4.toString();
        java.lang.String str6 = room4.getBuildingName();
        boolean boolean7 = room4.isOccupied();
        room.SensorObserver sensorObserver8 = null;
        room4.removeObserver(sensorObserver8);
        java.lang.String str10 = room4.getScannedID();
        room4.setUnderMaintenance(false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10" + "'", str5, "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str6, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test03890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03890");
        room.Room room4 = new room.Room("Room Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! | Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! | Capacity: 10", 35, "Room Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! - hi! - hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: -1 - ", "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi!");
        int int5 = room4.getCapacity();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
    }

    @Test
    public void test03891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03891");
        room.Room room4 = new room.Room("Room hi! | hi! - hi! | Capacity: 0 - hi!", (int) '4', "Room  - Room hi! | hi! - hi! | Capacity: 0 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 0", "hi!");
        boolean boolean5 = room4.isUnderMaintenance();
        java.lang.String str6 = room4.getScannedID();
        java.lang.String str7 = room4.getScannedID();
        java.lang.Class<?> wildcardClass8 = room4.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test03892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03892");
        room.Room room4 = new room.Room("", (int) (byte) 1, "Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10", "hi!");
        java.lang.String str5 = room4.getFullLocation();
        room4.setScannedID("Room hi! | hi! - hi! | Capacity: 0");
        room4.setEnabled(true);
        room.SensorObserver sensorObserver10 = null;
        room4.addObserver(sensorObserver10);
        // The following exception was thrown during execution in test generation
        try {
            room4.setScannedID("hi! - Room  - Room hi! | hi! - hi! | Capacity: 0 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 0 - ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi!" + "'", str5, "Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi!");
    }

    @Test
    public void test03893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03893");
        room.Room room4 = new room.Room("hi! - ", (int) (byte) 10, "Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10", "Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10");
        room4.setEnabled(false);
        room4.notifyObservers();
        java.lang.String str8 = room4.getRoomNumber();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10" + "'", str8, "Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10");
    }

    @Test
    public void test03894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03894");
        room.Room room4 = new room.Room(" - Room hi! | hi! - hi! | Capacity: 0", (int) (byte) 100, "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi!", "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10");
        room.SensorObserver sensorObserver5 = null;
        room4.removeObserver(sensorObserver5);
        int int7 = room4.getCapacity();
        room4.setEnabled(true);
        room.SensorObserver sensorObserver10 = null;
        room4.addObserver(sensorObserver10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
    }

    @Test
    public void test03895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03895");
        room.Room room4 = new room.Room("hi!", (int) (byte) 100, "", "Room hi! | hi! - hi! | Capacity: 0");
        java.lang.String str5 = room4.getScannedID();
        java.lang.String str6 = room4.getBuildingName();
        room4.setScannedID("Room hi! | hi! - hi! | Capacity: 0");
        java.lang.String str9 = room4.getRoomID();
        boolean boolean10 = room4.isOccupied();
        room.SensorObserver sensorObserver11 = null;
        room4.addObserver(sensorObserver11);
        boolean boolean13 = room4.isEnabled();
        boolean boolean14 = room4.isOccupied();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test03896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03896");
        room.Room room4 = new room.Room("Room Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | Room hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 1 - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! | Capacity: 97 | Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 | hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 0 - hi! - hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 10", (int) (byte) 0, "Room Room  - Room hi! | hi! - hi! | Capacity: 0 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 0 - hi! |  - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! - Room  - Room hi! | hi! - hi! | Capacity: 0 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 0 | Capacity: 10", "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10");
        int int5 = room4.getCapacity();
        boolean boolean6 = room4.isOccupied();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test03897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03897");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        java.lang.String str5 = room4.getScannedID();
        room.SensorObserver sensorObserver6 = null;
        room4.removeObserver(sensorObserver6);
        boolean boolean8 = room4.isUnderMaintenance();
        java.lang.String str9 = room4.getRoomID();
        java.lang.String str10 = room4.getFullLocation();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi! - hi!" + "'", str10, "hi! - hi!");
    }

    @Test
    public void test03898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03898");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        boolean boolean5 = room4.isOccupied();
        room4.setEnabled(false);
        java.lang.String str8 = room4.getFullLocation();
        boolean boolean9 = room4.isUnderMaintenance();
        room4.setUnderMaintenance(false);
        room4.setUnderMaintenance(true);
        boolean boolean14 = room4.isEnabled();
        room.SensorObserver sensorObserver15 = null;
        room4.addObserver(sensorObserver15);
        // The following exception was thrown during execution in test generation
        try {
            room4.setOccupied(true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi! - hi!" + "'", str8, "hi! - hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test03899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03899");
        room.Room room4 = new room.Room("hi!", (int) (byte) 1, "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10", "hi!");
        room4.notifyObservers();
        java.lang.String str6 = room4.getFullLocation();
        java.lang.String str7 = room4.getScannedID();
        boolean boolean8 = room4.isUnderMaintenance();
        java.lang.String str9 = room4.getRoomID();
        room4.setEnabled(true);
        room4.setEnabled(true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi!" + "'", str6, "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi!");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test03900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03900");
        room.Room room4 = new room.Room("", (int) ' ', "Room hi! | hi! - hi! | Capacity: 0", " - Room hi! | hi! - hi! | Capacity: 0");
        room4.setScannedID("hi! - Room hi! | hi! - hi! | Capacity: 0");
        room.SensorObserver sensorObserver7 = null;
        room4.addObserver(sensorObserver7);
        java.lang.String str9 = room4.getBuildingName();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str9, "Room hi! | hi! - hi! | Capacity: 0");
    }

    @Test
    public void test03901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03901");
        room.Room room4 = new room.Room("Room hi! | hi! - hi! | Capacity: 0 - hi! - ", 1, "hi! - hi!", "Room hi! | hi! - hi! | Capacity: 0 - hi! - ");
        java.lang.String str5 = room4.getScannedID();
        java.lang.String str6 = room4.getRoomID();
        java.lang.Class<?> wildcardClass7 = room4.getClass();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0 - hi! - " + "'", str6, "Room hi! | hi! - hi! | Capacity: 0 - hi! - ");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test03902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03902");
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
        boolean boolean18 = room4.isUnderMaintenance();
        java.lang.String str19 = room4.getRoomID();
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
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test03903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03903");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        boolean boolean5 = room4.isOccupied();
        room4.setEnabled(false);
        java.lang.String str8 = room4.getRoomID();
        room4.notifyObservers();
        room4.setUnderMaintenance(false);
        java.lang.String str12 = room4.getRoomID();
        java.lang.String str13 = room4.toString();
        boolean boolean14 = room4.isEnabled();
        java.lang.String str15 = room4.getRoomNumber();
        java.lang.Class<?> wildcardClass16 = room4.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str13, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test03904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03904");
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
        java.lang.String str17 = room4.getScannedID();
        java.lang.String str18 = room4.getBuildingName();
        room4.notifyObservers();
        room4.setOccupied(false);
        boolean boolean22 = room4.isUnderMaintenance();
        room4.setUnderMaintenance(true);
        java.lang.Class<?> wildcardClass25 = room4.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str7, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test03905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03905");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        java.lang.String str5 = room4.getScannedID();
        room4.setScannedID("hi!");
        boolean boolean8 = room4.isEnabled();
        int int9 = room4.getCapacity();
        boolean boolean10 = room4.isOccupied();
        java.lang.String str11 = room4.getFullLocation();
        boolean boolean12 = room4.isOccupied();
        room4.setUnderMaintenance(true);
        room4.notifyObservers();
        java.lang.Class<?> wildcardClass16 = room4.getClass();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi! - hi!" + "'", str11, "hi! - hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test03906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03906");
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
        java.lang.Class<?> wildcardClass17 = room4.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi! - hi!" + "'", str8, "hi! - hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test03907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03907");
        room.Room room4 = new room.Room("Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 100", (int) '4', "hi! - hi! - Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100", "hi!");
        room.SensorObserver sensorObserver5 = null;
        room4.addObserver(sensorObserver5);
        // The following exception was thrown during execution in test generation
        try {
            room4.notifyObservers();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03908");
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
        boolean boolean15 = room4.isEnabled();
        int int16 = room4.getCapacity();
        java.lang.String str17 = room4.getRoomID();
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
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test03909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03909");
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
        java.lang.String str15 = room4.getBuildingName();
        java.lang.String str16 = room4.getFullLocation();
        java.lang.Class<?> wildcardClass17 = room4.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str7, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi! - hi!" + "'", str16, "hi! - hi!");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test03910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03910");
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
        java.lang.String str14 = room4.toString();
        java.lang.String str15 = room4.getScannedID();
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi! - hi!" + "'", str8, "hi! - hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi! - hi!" + "'", str13, "hi! - hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str14, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test03911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03911");
        room.Room room4 = new room.Room("hi! - hi! - hi!", (int) (byte) 10, "hi! - hi!", "Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 | Capacity: 0");
        boolean boolean5 = room4.isEnabled();
        room.SensorObserver sensorObserver6 = null;
        room4.removeObserver(sensorObserver6);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test03912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03912");
        room.Room room4 = new room.Room("hi! - hi! - hi!", (int) (byte) 100, "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10", " - Room hi! | hi! - hi! | Capacity: 0");
        room4.setUnderMaintenance(false);
        java.lang.String str7 = room4.toString();
        room.SensorObserver sensorObserver8 = null;
        room4.addObserver(sensorObserver8);
        java.lang.String str10 = room4.getBuildingName();
        // The following exception was thrown during execution in test generation
        try {
            room4.setUnderMaintenance(false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Room hi! - hi! - hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 -  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100" + "'", str7, "Room hi! - hi! - hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 -  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10" + "'", str10, "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10");
    }

    @Test
    public void test03913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03913");
        room.Room room4 = new room.Room("Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 1", 0, "Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi!", "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi!");
        java.lang.String str5 = room4.getScannedID();
        boolean boolean6 = room4.isEnabled();
        room4.setEnabled(false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test03914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03914");
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
        java.lang.String str16 = room4.toString();
        boolean boolean17 = room4.isOccupied();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str7, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str10, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str16, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test03915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03915");
        room.Room room4 = new room.Room("Room hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 1 - Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | hi! -  - Room  - Room hi! | hi! - hi! | Capacity: 0 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 0 | Capacity: 10", 1, "Room Room  - Room hi! | hi! - hi! | Capacity: 0 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 0 -  | Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! | Capacity: 32", "hi! - hi! - hi! - Room hi! | hi! - hi! | Capacity: 0");
        int int5 = room4.getCapacity();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test03916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03916");
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
        room4.setScannedID("Room hi! | hi! - hi! | Capacity: 0 - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! - hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 97");
        room.SensorObserver sensorObserver18 = null;
        room4.removeObserver(sensorObserver18);
        room4.notifyObservers();
        boolean boolean21 = room4.isOccupied();
        java.lang.Class<?> wildcardClass22 = room4.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str7, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str10, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test03917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03917");
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
        java.lang.String str17 = room4.getRoomNumber();
        boolean boolean18 = room4.isUnderMaintenance();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi! - hi!" + "'", str12, "hi! - hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test03918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03918");
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
        java.lang.String str20 = room4.getRoomNumber();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str7, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str10, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi! - hi!" + "'", str16, "hi! - hi!");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test03919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03919");
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
        room.SensorObserver sensorObserver22 = null;
        room4.removeObserver(sensorObserver22);
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
    public void test03920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03920");
        room.Room room4 = new room.Room("hi! - ", (int) (byte) 10, "Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10", "Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10");
        room4.setEnabled(false);
        room4.notifyObservers();
        room4.setScannedID("Room Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! |  - Room hi! | hi! - hi! | Capacity: 0 - Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: -1");
        java.lang.String str10 = room4.getScannedID();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Room Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! |  - Room hi! | hi! - hi! | Capacity: 0 - Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: -1" + "'", str10, "Room Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! |  - Room hi! | hi! - hi! | Capacity: 0 - Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: -1");
    }

    @Test
    public void test03921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03921");
        room.Room room4 = new room.Room("Room Room Room hi! - hi! - Room hi! | hi! - hi! | Capacity: 0 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 100 | Capacity: 10 | Room hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 1 - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | Room  - Room hi! | hi! - hi! | Capacity: 0 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 0 - hi! -  - hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 -  | Capacity: 1", (int) (byte) 100, "Room Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Room hi! | hi! - hi! | Capacity: 0 - hi! -  - hi! - hi! - Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | Capacity: 1", "");
    }

    @Test
    public void test03922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03922");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        room.SensorObserver sensorObserver5 = null;
        room4.addObserver(sensorObserver5);
        room.SensorObserver sensorObserver7 = null;
        room4.addObserver(sensorObserver7);
        java.lang.String str9 = room4.getBuildingName();
        java.lang.String str10 = room4.getRoomNumber();
        // The following exception was thrown during execution in test generation
        try {
            room4.setScannedID("Room hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 1 - Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | hi! -  - Room  - Room hi! | hi! - hi! | Capacity: 0 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 0 | Capacity: 10");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test03923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03923");
        room.Room room4 = new room.Room("Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10", (int) (short) 10, "hi! - ", "Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 1");
        java.lang.String str5 = room4.getBuildingName();
        java.lang.String str6 = room4.getBuildingName();
        java.lang.String str7 = room4.getRoomNumber();
        room4.setScannedID("Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | hi! -  - Room  - Room hi! | hi! - hi! | Capacity: 0 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 0 | Capacity: 10");
        room4.setOccupied(false);
        java.lang.String str12 = room4.getScannedID();
        java.lang.String str13 = room4.toString();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi! - " + "'", str5, "hi! - ");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi! - " + "'", str6, "hi! - ");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 1" + "'", str7, "Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 1");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | hi! -  - Room  - Room hi! | hi! - hi! | Capacity: 0 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 0 | Capacity: 10" + "'", str12, "Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | hi! -  - Room  - Room hi! | hi! - hi! | Capacity: 0 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 0 | Capacity: 10");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 | hi! -  - Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 1 | Capacity: 10" + "'", str13, "Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 | hi! -  - Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 1 | Capacity: 10");
    }

    @Test
    public void test03924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03924");
        room.Room room4 = new room.Room("Room hi! | hi! - hi! | Capacity: 0", (int) (byte) 10, "hi!", "");
        room4.setUnderMaintenance(true);
        java.lang.String str7 = room4.toString();
        room4.notifyObservers();
        java.lang.String str9 = room4.getScannedID();
        room.SensorObserver sensorObserver10 = null;
        room4.addObserver(sensorObserver10);
        room.SensorObserver sensorObserver12 = null;
        room4.removeObserver(sensorObserver12);
        boolean boolean14 = room4.isEnabled();
        java.lang.String str15 = room4.getScannedID();
        boolean boolean16 = room4.isUnderMaintenance();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10" + "'", str7, "Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test03925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03925");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        java.lang.String str5 = room4.getScannedID();
        room4.setScannedID("hi!");
        boolean boolean8 = room4.isEnabled();
        room4.setEnabled(false);
        room4.setScannedID("Room hi! | hi! - hi! | Capacity: 0 - hi! - ");
        int int13 = room4.getCapacity();
        java.lang.String str14 = room4.getRoomID();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test03926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03926");
        room.Room room4 = new room.Room(" - Room hi! | hi! - hi! | Capacity: 0", (int) (byte) 100, "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi!", "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10");
        java.lang.String str5 = room4.getFullLocation();
        room4.setOccupied(true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10" + "'", str5, "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10");
    }

    @Test
    public void test03927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03927");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        java.lang.String str5 = room4.getScannedID();
        room4.setScannedID("hi!");
        room4.setUnderMaintenance(true);
        java.lang.String str10 = room4.getScannedID();
        java.lang.String str11 = room4.getFullLocation();
        boolean boolean12 = room4.isOccupied();
        java.lang.Class<?> wildcardClass13 = room4.getClass();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi! - hi!" + "'", str11, "hi! - hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test03928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03928");
        room.Room room4 = new room.Room("Room hi! | hi! - hi! | Capacity: 0", (int) (byte) 10, "hi!", "");
        room4.setUnderMaintenance(true);
        java.lang.String str7 = room4.toString();
        room4.notifyObservers();
        room4.setScannedID("hi! - hi!");
        room4.setOccupied(false);
        int int13 = room4.getCapacity();
        java.lang.String str14 = room4.getScannedID();
        room4.setOccupied(false);
        room4.setUnderMaintenance(false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10" + "'", str7, "Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi! - hi!" + "'", str14, "hi! - hi!");
    }

    @Test
    public void test03929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03929");
        room.Room room4 = new room.Room("hi! - hi! - Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100", (int) ' ', "hi! - ", "Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 97");
        room4.notifyObservers();
    }

    @Test
    public void test03930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03930");
        room.Room room4 = new room.Room("hi! - hi!", (int) (short) 10, "Room hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 1", "");
        int int5 = room4.getCapacity();
        room.SensorObserver sensorObserver6 = null;
        room4.addObserver(sensorObserver6);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
    }

    @Test
    public void test03931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03931");
        room.Room room4 = new room.Room("Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi!", (int) (short) 0, "hi! - hi! - hi!", "Room hi! | hi! - hi! | Capacity: 0");
        room4.setOccupied(false);
        room.SensorObserver sensorObserver7 = null;
        room4.addObserver(sensorObserver7);
        java.lang.String str9 = room4.getScannedID();
        java.lang.String str10 = room4.getRoomID();
        boolean boolean11 = room4.isEnabled();
        java.lang.String str12 = room4.getRoomNumber();
        room.SensorObserver sensorObserver13 = null;
        room4.addObserver(sensorObserver13);
        java.lang.String str15 = room4.getScannedID();
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi!" + "'", str10, "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str12, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test03932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03932");
        room.Room room4 = new room.Room("hi!", (int) (byte) 1, "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10", "hi!");
        room4.notifyObservers();
        room4.setUnderMaintenance(false);
        room4.setOccupied(true);
        boolean boolean10 = room4.isEnabled();
        boolean boolean11 = room4.isOccupied();
        java.lang.String str12 = room4.getFullLocation();
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi!" + "'", str12, "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi!");
    }

    @Test
    public void test03933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03933");
        room.Room room4 = new room.Room("hi!", (int) (byte) 1, "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10", "hi!");
        room4.notifyObservers();
        room4.setUnderMaintenance(false);
        room4.setOccupied(true);
        boolean boolean10 = room4.isEnabled();
        java.lang.Class<?> wildcardClass11 = room4.getClass();
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test03934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03934");
        room.Room room4 = new room.Room("hi!", 1, "Room hi! | hi! - hi! | Capacity: 0 - hi!", "Room hi! | hi! - hi! | Capacity: 0 - hi!");
        int int5 = room4.getCapacity();
        java.lang.String str6 = room4.toString();
        room4.setEnabled(false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Room hi! | Room hi! | hi! - hi! | Capacity: 0 - hi! - Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 1" + "'", str6, "Room hi! | Room hi! | hi! - hi! | Capacity: 0 - hi! - Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 1");
    }

    @Test
    public void test03935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03935");
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
        java.lang.String str16 = room4.getRoomNumber();
        java.lang.String str17 = room4.getScannedID();
        java.lang.String str18 = room4.getFullLocation();
        java.lang.String str19 = room4.getRoomID();
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi! - hi!" + "'", str12, "hi! - hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi! - hi!" + "'", str18, "hi! - hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test03936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03936");
        room.Room room4 = new room.Room("Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 100", (int) (byte) 1, "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10", "Room hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 1");
        int int5 = room4.getCapacity();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test03937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03937");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        room.SensorObserver sensorObserver5 = null;
        room4.addObserver(sensorObserver5);
        java.lang.String str7 = room4.getScannedID();
        java.lang.String str8 = room4.getFullLocation();
        boolean boolean9 = room4.isOccupied();
        boolean boolean10 = room4.isOccupied();
        java.lang.String str11 = room4.getFullLocation();
        boolean boolean12 = room4.isUnderMaintenance();
        int int13 = room4.getCapacity();
        java.lang.String str14 = room4.toString();
        java.lang.String str15 = room4.getBuildingName();
        boolean boolean16 = room4.isUnderMaintenance();
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi! - hi!" + "'", str8, "hi! - hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi! - hi!" + "'", str11, "hi! - hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str14, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test03938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03938");
        room.Room room4 = new room.Room("Room Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 100", (int) '4', " - Room hi! | hi! - hi! | Capacity: 0 - Room hi! | hi! - hi! | Capacity: 0 - hi!", "Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! -  -  - Room hi! | hi! - hi! | Capacity: 0");
    }

    @Test
    public void test03939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03939");
        room.Room room4 = new room.Room("Room hi! - hi! |  - Room hi! | hi! - hi! | Capacity: 0 - Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 97 | Capacity: -1", (int) (byte) 100, "Room Room Room hi! | hi! - hi! | Capacity: 0 | Room hi! | hi! - hi! | Capacity: 0 - hi! - hi! | Capacity: 100 - Room  - Room hi! | hi! - hi! | Capacity: 0 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 0 | Room hi! | hi! - hi! - Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | Capacity: 0 - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! | Capacity: 52", "Room Room Room hi! - hi! - Room hi! | hi! - hi! | Capacity: 0 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 100 | Capacity: 10 | Room hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 1 - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | Room  - Room hi! | hi! - hi! | Capacity: 0 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 0 - hi! -  - hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 -  | Capacity: 1");
    }

    @Test
    public void test03940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03940");
        room.Room room4 = new room.Room("Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 100", 0, "hi! - hi! - hi!", "hi!");
        java.lang.String str5 = room4.getScannedID();
        boolean boolean6 = room4.isEnabled();
        java.lang.String str7 = room4.getFullLocation();
        java.lang.String str8 = room4.getRoomNumber();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi! - hi! - hi! - hi!" + "'", str7, "hi! - hi! - hi! - hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test03941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03941");
        room.Room room4 = new room.Room("hi!", 1, "Room hi! | hi! - hi! | Capacity: 0 - hi!", "Room hi! | hi! - hi! | Capacity: 0 - hi!");
        int int5 = room4.getCapacity();
        boolean boolean6 = room4.isUnderMaintenance();
        room.SensorObserver sensorObserver7 = null;
        room4.addObserver(sensorObserver7);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test03942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03942");
        room.Room room4 = new room.Room("Room Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! - hi! - hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: -1 - Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 | hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 0", (int) (short) 0, "Room hi! | hi! - hi! | Capacity: 0 - hi! -  - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi!", "Room Room  - Room hi! | hi! - hi! | Capacity: 0 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 0 | Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 - Room hi! | Room hi! | hi! - hi! | Capacity: 0 - hi! - Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 1 | Capacity: -1");
        room.SensorObserver sensorObserver5 = null;
        room4.addObserver(sensorObserver5);
    }

    @Test
    public void test03943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03943");
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
        boolean boolean14 = room4.isOccupied();
        java.lang.String str15 = room4.toString();
        boolean boolean16 = room4.isEnabled();
        room.SensorObserver sensorObserver17 = null;
        room4.removeObserver(sensorObserver17);
        boolean boolean19 = room4.isOccupied();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str7, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str8, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str15, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test03944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03944");
        room.Room room4 = new room.Room("Room hi! | hi! - hi! | Capacity: 0 - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10", (int) (short) 1, "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 100", "Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi!");
        java.lang.Class<?> wildcardClass5 = room4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test03945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03945");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        room.SensorObserver sensorObserver5 = null;
        room4.addObserver(sensorObserver5);
        java.lang.String str7 = room4.toString();
        java.lang.String str8 = room4.toString();
        boolean boolean9 = room4.isOccupied();
        java.lang.String str10 = room4.getBuildingName();
        boolean boolean11 = room4.isEnabled();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str7, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str8, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test03946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03946");
        room.Room room4 = new room.Room("hi!", (int) (byte) 100, "", "Room hi! | hi! - hi! | Capacity: 0");
        java.lang.String str5 = room4.getScannedID();
        java.lang.String str6 = room4.getBuildingName();
        room4.setUnderMaintenance(false);
        room4.setScannedID("Room hi! | hi! - hi! | Capacity: 0 - hi! - ");
        room4.setScannedID("");
        room4.setEnabled(false);
        boolean boolean15 = room4.isOccupied();
        java.lang.String str16 = room4.getBuildingName();
        room4.setEnabled(true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test03947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03947");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        room.SensorObserver sensorObserver5 = null;
        room4.addObserver(sensorObserver5);
        java.lang.String str7 = room4.toString();
        room.SensorObserver sensorObserver8 = null;
        room4.addObserver(sensorObserver8);
        java.lang.String str10 = room4.toString();
        boolean boolean11 = room4.isUnderMaintenance();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str7, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str10, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test03948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03948");
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
        room4.setEnabled(false);
        java.lang.String str21 = room4.getRoomID();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi! - hi!" + "'", str11, "hi! - hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi! - hi!" + "'", str14, "hi! - hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str15, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
    }

    @Test
    public void test03949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03949");
        room.Room room4 = new room.Room("hi!", (int) (byte) 100, "", "Room hi! | hi! - hi! | Capacity: 0");
        room4.notifyObservers();
        room.SensorObserver sensorObserver6 = null;
        room4.removeObserver(sensorObserver6);
        java.lang.String str8 = room4.toString();
        room4.setUnderMaintenance(true);
        boolean boolean11 = room4.isUnderMaintenance();
        int int12 = room4.getCapacity();
        room4.notifyObservers();
        java.lang.String str14 = room4.getRoomNumber();
        boolean boolean15 = room4.isOccupied();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100" + "'", str8, "Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str14, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test03950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03950");
        room.Room room4 = new room.Room("Room  - Room hi! | hi! - hi! | Capacity: 0 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 0 - hi!", (int) (short) -1, "Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 | hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 0 - hi! - hi! - Room hi! | hi! - hi! | Capacity: 0", "Room hi! - hi! - hi! | hi! - hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 1");
        java.lang.String str5 = room4.toString();
        room.SensorObserver sensorObserver6 = null;
        room4.removeObserver(sensorObserver6);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Room Room  - Room hi! | hi! - hi! | Capacity: 0 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 0 - hi! | Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 | hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 0 - hi! - hi! - Room hi! | hi! - hi! | Capacity: 0 - Room hi! - hi! - hi! | hi! - hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 1 | Capacity: -1" + "'", str5, "Room Room  - Room hi! | hi! - hi! | Capacity: 0 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 0 - hi! | Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 | hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 0 - hi! - hi! - Room hi! | hi! - hi! | Capacity: 0 - Room hi! - hi! - hi! | hi! - hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 1 | Capacity: -1");
    }

    @Test
    public void test03951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03951");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        java.lang.String str5 = room4.getScannedID();
        room4.setScannedID("hi!");
        room4.setUnderMaintenance(true);
        java.lang.String str10 = room4.getScannedID();
        java.lang.String str11 = room4.getScannedID();
        int int12 = room4.getCapacity();
        java.lang.String str13 = room4.getRoomID();
        java.lang.String str14 = room4.getScannedID();
        room4.setScannedID("Room  - Room hi! | hi! - hi! | Capacity: 0 |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 0");
        java.lang.Class<?> wildcardClass17 = room4.getClass();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test03952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03952");
        room.Room room4 = new room.Room("Room hi! | hi! - hi! | Capacity: 0 - hi!", (int) ' ', "Room hi! | Room hi! | hi! - hi! | Capacity: 0 - hi! - Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 1", "Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10");
        boolean boolean5 = room4.isEnabled();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test03953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03953");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        java.lang.String str5 = room4.getScannedID();
        room4.setScannedID("hi!");
        room4.setUnderMaintenance(true);
        java.lang.String str10 = room4.getScannedID();
        room4.setScannedID("Room hi! | hi! - hi! | Capacity: 0 - hi! - ");
        boolean boolean13 = room4.isEnabled();
        java.lang.String str14 = room4.getBuildingName();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test03954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03954");
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
        boolean boolean16 = room4.isUnderMaintenance();
        java.lang.Class<?> wildcardClass17 = room4.getClass();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test03955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03955");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        java.lang.String str5 = room4.getBuildingName();
        java.lang.String str6 = room4.getRoomID();
        boolean boolean7 = room4.isOccupied();
        room4.setUnderMaintenance(false);
        boolean boolean10 = room4.isUnderMaintenance();
        java.lang.String str11 = room4.getRoomNumber();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test03956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03956");
        room.Room room4 = new room.Room("hi! - Room hi! | hi! - hi! | Capacity: 0", 32, "", "Room Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! - hi! - hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: -1 - Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 | hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 0");
        room4.notifyObservers();
    }

    @Test
    public void test03957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03957");
        room.Room room4 = new room.Room("Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! - hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 97 | Capacity: 32", (int) (short) 0, "Room Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! - hi! - hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: -1", "Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 | Room Room hi! | hi! - hi! | Capacity: 0 | Room hi! | hi! - hi! | Capacity: 0 - hi! - hi! | Capacity: 100 - hi! - hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 0");
        boolean boolean5 = room4.isOccupied();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test03958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03958");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        room.SensorObserver sensorObserver5 = null;
        room4.addObserver(sensorObserver5);
        java.lang.String str7 = room4.getScannedID();
        room.SensorObserver sensorObserver8 = null;
        room4.removeObserver(sensorObserver8);
        java.lang.String str10 = room4.getRoomNumber();
        java.lang.String str11 = room4.toString();
        room4.notifyObservers();
        java.lang.String str13 = room4.toString();
        int int14 = room4.getCapacity();
        java.lang.String str15 = room4.getFullLocation();
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str11, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str13, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi! - hi!" + "'", str15, "hi! - hi!");
    }

    @Test
    public void test03959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03959");
        room.Room room4 = new room.Room("Room hi! | hi! - hi! | Capacity: 0 - hi!", (int) (short) 10, "Room hi! | hi! - hi! | Capacity: 0", "Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10");
        int int5 = room4.getCapacity();
        java.lang.String str6 = room4.getRoomNumber();
        room4.setEnabled(true);
        int int9 = room4.getCapacity();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10" + "'", str6, "Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
    }

    @Test
    public void test03960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03960");
        room.Room room4 = new room.Room("Room Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 100 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 -  - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! | Capacity: 0 | hi! - hi! - hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 | Capacity: 0", 1, "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! - hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 97 | Capacity: 32", "Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 100 | hi! - hi! - hi! - hi! | Capacity: 0 -  | Capacity: 1");
    }

    @Test
    public void test03961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03961");
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
        java.lang.String str18 = room4.getBuildingName();
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str11, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str17, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test03962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03962");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        java.lang.String str5 = room4.getScannedID();
        room4.setScannedID("hi!");
        room4.setUnderMaintenance(true);
        room4.setOccupied(true);
        boolean boolean12 = room4.isEnabled();
        java.lang.String str13 = room4.toString();
        java.lang.String str14 = room4.toString();
        java.lang.String str15 = room4.getRoomID();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str13, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str14, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test03963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03963");
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
        java.lang.String str17 = room4.getScannedID();
        room.SensorObserver sensorObserver18 = null;
        room4.addObserver(sensorObserver18);
        java.lang.String str20 = room4.getRoomID();
        java.lang.String str21 = room4.getBuildingName();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str7, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str10, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
    }

    @Test
    public void test03964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03964");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        java.lang.String str5 = room4.getScannedID();
        room4.setScannedID("hi!");
        java.lang.String str8 = room4.getBuildingName();
        room4.setEnabled(false);
        room4.notifyObservers();
        boolean boolean12 = room4.isOccupied();
        java.lang.String str13 = room4.getBuildingName();
        java.lang.String str14 = room4.toString();
        java.lang.String str15 = room4.getRoomNumber();
        java.lang.String str16 = room4.getRoomNumber();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str14, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test03965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03965");
        room.Room room4 = new room.Room("Room hi! | hi! - hi! | Capacity: 0 - hi!", (int) (short) 10, "Room hi! | hi! - hi! | Capacity: 0", "Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10");
        boolean boolean5 = room4.isEnabled();
        boolean boolean6 = room4.isEnabled();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test03966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03966");
        room.Room room4 = new room.Room("Room Room hi! | hi! - hi! | Capacity: 0 | hi! - hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 97", (int) ' ', "Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 | hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 0", "Room Room hi! | hi! - hi! | Capacity: 0 | Room hi! | hi! - hi! | Capacity: 0 - hi! - hi! | Capacity: 100");
        java.lang.Class<?> wildcardClass5 = room4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test03967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03967");
        room.Room room4 = new room.Room("hi!", (int) '#', "Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10", "Room hi! | hi! - hi! | Capacity: 0 - hi!");
        boolean boolean5 = room4.isOccupied();
        int int6 = room4.getCapacity();
        java.lang.String str7 = room4.getRoomID();
        room4.setOccupied(true);
        room4.setUnderMaintenance(true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test03968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03968");
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
        int int17 = room4.getCapacity();
        room4.setUnderMaintenance(false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str11, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test03969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03969");
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
        room4.setOccupied(true);
        room4.setScannedID("Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 -  - Room hi! | hi! - hi! | Capacity: 0 - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! - ");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str11, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test03970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03970");
        room.Room room4 = new room.Room(" - Room hi! | hi! - hi! | Capacity: 0", 0, "", "Room hi! | hi! - hi! | Capacity: 0");
        room4.setOccupied(false);
        boolean boolean7 = room4.isUnderMaintenance();
        room.SensorObserver sensorObserver8 = null;
        room4.addObserver(sensorObserver8);
        boolean boolean10 = room4.isOccupied();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test03971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03971");
        room.Room room4 = new room.Room("Room  | Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! | Capacity: 1", (int) (short) 1, " - Room hi! | hi! - hi! | Capacity: 0", "Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi!");
        room.SensorObserver sensorObserver5 = null;
        room4.addObserver(sensorObserver5);
        boolean boolean7 = room4.isUnderMaintenance();
        // The following exception was thrown during execution in test generation
        try {
            room4.setScannedID("Room Room hi! | hi! - hi! | Capacity: 0 |  - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 0");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test03972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03972");
        room.Room room4 = new room.Room("Room hi! | hi! - hi! | Capacity: 0", (int) (byte) 10, "hi!", "");
        room4.setUnderMaintenance(true);
        java.lang.String str7 = room4.toString();
        java.lang.String str8 = room4.getBuildingName();
        java.lang.String str9 = room4.getRoomNumber();
        room.SensorObserver sensorObserver10 = null;
        room4.addObserver(sensorObserver10);
        int int12 = room4.getCapacity();
        // The following exception was thrown during execution in test generation
        try {
            room4.notifyObservers();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10" + "'", str7, "Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
    }

    @Test
    public void test03973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03973");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        java.lang.String str5 = room4.getScannedID();
        room4.setScannedID("hi!");
        java.lang.String str8 = room4.getBuildingName();
        java.lang.String str9 = room4.getRoomNumber();
        java.lang.String str10 = room4.getRoomID();
        java.lang.String str11 = room4.getRoomNumber();
        room4.setScannedID("hi! - hi!");
        int int14 = room4.getCapacity();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test03974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03974");
        room.Room room4 = new room.Room("hi!", 1, "Room hi! | hi! - hi! | Capacity: 0 - hi!", "Room hi! | hi! - hi! | Capacity: 0 - hi!");
        int int5 = room4.getCapacity();
        room4.setUnderMaintenance(false);
        java.lang.String str8 = room4.toString();
        int int9 = room4.getCapacity();
        room.SensorObserver sensorObserver10 = null;
        room4.addObserver(sensorObserver10);
        java.lang.String str12 = room4.getScannedID();
        room.SensorObserver sensorObserver13 = null;
        room4.addObserver(sensorObserver13);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Room hi! | Room hi! | hi! - hi! | Capacity: 0 - hi! - Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 1" + "'", str8, "Room hi! | Room hi! | hi! - hi! | Capacity: 0 - hi! - Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 1");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test03975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03975");
        room.Room room4 = new room.Room(" - Room hi! | hi! - hi! | Capacity: 0", 0, "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10", "Room hi! | hi! - hi! | Capacity: 0 - hi! - ");
        java.lang.String str5 = room4.toString();
        boolean boolean6 = room4.isOccupied();
        room4.setOccupied(false);
        int int9 = room4.getCapacity();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Room  - Room hi! | hi! - hi! | Capacity: 0 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 0" + "'", str5, "Room  - Room hi! | hi! - hi! | Capacity: 0 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 0");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test03976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03976");
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
        room4.setScannedID("Room hi! | hi! - hi! | Capacity: 0 - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! - hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 97");
        room.SensorObserver sensorObserver18 = null;
        room4.removeObserver(sensorObserver18);
        boolean boolean20 = room4.isOccupied();
        java.lang.String str21 = room4.toString();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str7, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str10, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str21, "Room hi! | hi! - hi! | Capacity: 0");
    }

    @Test
    public void test03977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03977");
        room.Room room4 = new room.Room("Room hi! | hi! - hi! | Capacity: 0", (int) (byte) 10, "hi!", "");
        room4.setUnderMaintenance(true);
        room4.setEnabled(false);
        room4.setOccupied(false);
        int int11 = room4.getCapacity();
        room4.setScannedID("Room  | hi! - hi! - Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 97 - Room  | Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! | Capacity: 1 | Capacity: 35");
        boolean boolean14 = room4.isUnderMaintenance();
        int int15 = room4.getCapacity();
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
    }

    @Test
    public void test03978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03978");
        room.Room room4 = new room.Room(" - Room hi! | hi! - hi! | Capacity: 0", 0, "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10", "Room hi! | hi! - hi! | Capacity: 0 - hi! - ");
        room4.setScannedID("Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 100 | hi! - hi! - hi! - hi! | Capacity: 0");
        java.lang.String str7 = room4.toString();
        boolean boolean8 = room4.isOccupied();
        java.lang.String str9 = room4.getRoomID();
        boolean boolean10 = room4.isUnderMaintenance();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Room  - Room hi! | hi! - hi! | Capacity: 0 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 0" + "'", str7, "Room  - Room hi! | hi! - hi! | Capacity: 0 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 0");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + " - Room hi! | hi! - hi! | Capacity: 0" + "'", str9, " - Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test03979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03979");
        room.Room room4 = new room.Room("", (int) (short) 10, "Room hi! | hi! - hi! | Capacity: 0", "hi!");
        java.lang.String str5 = room4.toString();
        java.lang.String str6 = room4.getBuildingName();
        room.SensorObserver sensorObserver7 = null;
        room4.removeObserver(sensorObserver7);
        boolean boolean9 = room4.isEnabled();
        room4.setEnabled(true);
        room4.setEnabled(false);
        boolean boolean14 = room4.isOccupied();
        java.lang.String str15 = room4.getScannedID();
        boolean boolean16 = room4.isUnderMaintenance();
        room4.setOccupied(false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10" + "'", str5, "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str6, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test03980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03980");
        room.Room room4 = new room.Room("Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi!", 10, "Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10", "hi!");
        room4.setUnderMaintenance(false);
    }

    @Test
    public void test03981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03981");
        room.Room room4 = new room.Room("Room hi! | hi! - hi! | Capacity: 0 - hi! - hi!", (int) (short) 100, "Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 | hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 0", "Room hi! | hi! - hi! - Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | Capacity: 0");
        room4.setEnabled(false);
    }

    @Test
    public void test03982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03982");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        boolean boolean5 = room4.isOccupied();
        room4.setEnabled(false);
        boolean boolean8 = room4.isUnderMaintenance();
        java.lang.String str9 = room4.getFullLocation();
        room4.setUnderMaintenance(false);
        java.lang.String str12 = room4.getBuildingName();
        java.lang.String str13 = room4.getBuildingName();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi! - hi!" + "'", str9, "hi! - hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test03983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03983");
        room.Room room4 = new room.Room("hi!", (int) (byte) 1, "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10", "hi!");
        java.lang.String str5 = room4.getRoomNumber();
        java.lang.String str6 = room4.getRoomID();
        room4.setEnabled(false);
        room4.setUnderMaintenance(false);
        boolean boolean11 = room4.isUnderMaintenance();
        room4.setOccupied(true);
        room4.setUnderMaintenance(true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test03984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03984");
        room.Room room4 = new room.Room("", (int) (short) 10, "Room hi! | hi! - hi! | Capacity: 0", "hi!");
        room4.setScannedID("");
        java.lang.String str7 = room4.getRoomNumber();
        room4.notifyObservers();
        java.lang.String str9 = room4.getBuildingName();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str9, "Room hi! | hi! - hi! | Capacity: 0");
    }

    @Test
    public void test03985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03985");
        room.Room room4 = new room.Room("hi!", (int) (byte) 1, "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10", "hi!");
        room4.notifyObservers();
        room4.setUnderMaintenance(false);
        java.lang.String str8 = room4.getFullLocation();
        java.lang.String str9 = room4.getScannedID();
        boolean boolean10 = room4.isEnabled();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi!" + "'", str8, "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi!");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test03986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03986");
        room.Room room4 = new room.Room("hi!", (int) (byte) 100, "", "Room hi! | hi! - hi! | Capacity: 0");
        java.lang.String str5 = room4.getScannedID();
        java.lang.String str6 = room4.getBuildingName();
        room4.setUnderMaintenance(false);
        boolean boolean9 = room4.isOccupied();
        int int10 = room4.getCapacity();
        java.lang.String str11 = room4.getBuildingName();
        int int12 = room4.getCapacity();
        java.lang.String str13 = room4.getScannedID();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test03987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03987");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        room.SensorObserver sensorObserver5 = null;
        room4.addObserver(sensorObserver5);
        room.SensorObserver sensorObserver7 = null;
        room4.addObserver(sensorObserver7);
        java.lang.String str9 = room4.getBuildingName();
        boolean boolean10 = room4.isOccupied();
        java.lang.String str11 = room4.getRoomNumber();
        boolean boolean12 = room4.isUnderMaintenance();
        java.lang.String str13 = room4.getFullLocation();
        boolean boolean14 = room4.isEnabled();
        java.lang.Class<?> wildcardClass15 = room4.getClass();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi! - hi!" + "'", str13, "hi! - hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test03988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03988");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        room.SensorObserver sensorObserver5 = null;
        room4.addObserver(sensorObserver5);
        room.SensorObserver sensorObserver7 = null;
        room4.addObserver(sensorObserver7);
        boolean boolean9 = room4.isUnderMaintenance();
        java.lang.String str10 = room4.getScannedID();
        java.lang.String str11 = room4.getBuildingName();
        java.lang.String str12 = room4.getBuildingName();
        // The following exception was thrown during execution in test generation
        try {
            room4.setOccupied(false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test03989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03989");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        boolean boolean5 = room4.isOccupied();
        room4.setEnabled(false);
        java.lang.String str8 = room4.getRoomID();
        room4.notifyObservers();
        room4.setUnderMaintenance(false);
        java.lang.String str12 = room4.getRoomID();
        java.lang.String str13 = room4.toString();
        boolean boolean14 = room4.isEnabled();
        java.lang.String str15 = room4.getRoomNumber();
        java.lang.String str16 = room4.getRoomID();
        boolean boolean17 = room4.isUnderMaintenance();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str13, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test03990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03990");
        room.Room room4 = new room.Room("hi! -  - Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 1", 32, "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 1", "Room Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 97 | Room hi! | hi! - hi! | Capacity: 0 - hi! - hi! - Room hi! | Room hi! | hi! - hi! | Capacity: 0 - hi! - Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 1 | Capacity: 1");
        room4.setOccupied(true);
        java.lang.String str7 = room4.getBuildingName();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 1" + "'", str7, "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 1");
    }

    @Test
    public void test03991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03991");
        room.Room room4 = new room.Room("Room Room Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! - hi! - hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: -1 | Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 1 - Room hi! | hi! - hi! | Capacity: 0 - hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! - hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 97 | Capacity: 0", (int) (short) 10, "Room hi! | hi! - hi! | Capacity: 0 - Room Room hi! - hi! - hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 1 | Capacity: 0 | Room hi! -  | Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 10 -  | Capacity: 52", "Room hi! -  | Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 0");
    }

    @Test
    public void test03992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03992");
        room.Room room4 = new room.Room("Room hi! | hi! - hi! | Capacity: 0 - Room Room hi! - hi! - hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 1 | Capacity: 0 | Room hi! -  | Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 10 -  | Capacity: 52", 0, "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10", "Room Room  | Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! | Capacity: 1 | Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 - Room Room hi! | hi! - hi! | Capacity: 0 | hi! - hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 97 | Capacity: 100");
        room.SensorObserver sensorObserver5 = null;
        room4.addObserver(sensorObserver5);
    }

    @Test
    public void test03993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03993");
        room.Room room4 = new room.Room("Room hi! | hi! - hi! | Capacity: 0", (int) (byte) 10, "hi!", "");
        room4.setUnderMaintenance(true);
        java.lang.String str7 = room4.toString();
        room4.notifyObservers();
        int int9 = room4.getCapacity();
        java.lang.String str10 = room4.getScannedID();
        java.lang.String str11 = room4.getFullLocation();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10" + "'", str7, "Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi! - " + "'", str11, "hi! - ");
    }

    @Test
    public void test03994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03994");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        boolean boolean5 = room4.isOccupied();
        room4.setEnabled(false);
        java.lang.String str8 = room4.toString();
        room4.setOccupied(true);
        boolean boolean11 = room4.isOccupied();
        java.lang.String str12 = room4.getRoomID();
        java.lang.String str13 = room4.getRoomNumber();
        room4.setOccupied(true);
        java.lang.String str16 = room4.getScannedID();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str8, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test03995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03995");
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
        boolean boolean16 = room4.isUnderMaintenance();
        room.SensorObserver sensorObserver17 = null;
        room4.removeObserver(sensorObserver17);
        java.lang.String str19 = room4.getRoomNumber();
        java.lang.Class<?> wildcardClass20 = room4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test03996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03996");
        room.Room room4 = new room.Room("Room hi! | hi! - hi! | Capacity: 0 - hi!", (int) (short) 10, "Room hi! | hi! - hi! | Capacity: 0", "Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10");
        room.SensorObserver sensorObserver5 = null;
        room4.addObserver(sensorObserver5);
        int int7 = room4.getCapacity();
        // The following exception was thrown during execution in test generation
        try {
            room4.setUnderMaintenance(true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
    }

    @Test
    public void test03997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03997");
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
        java.lang.String str17 = room4.getBuildingName();
        room4.setScannedID(" - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi!");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str11, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi! - hi!" + "'", str14, "hi! - hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str15, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test03998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03998");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        java.lang.String str5 = room4.getScannedID();
        room4.setScannedID("hi!");
        java.lang.String str8 = room4.getBuildingName();
        room4.setEnabled(false);
        room4.notifyObservers();
        java.lang.String str12 = room4.toString();
        boolean boolean13 = room4.isUnderMaintenance();
        room.SensorObserver sensorObserver14 = null;
        room4.removeObserver(sensorObserver14);
        java.lang.String str16 = room4.toString();
        java.lang.String str17 = room4.getFullLocation();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str12, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str16, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi! - hi!" + "'", str17, "hi! - hi!");
    }

    @Test
    public void test03999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03999");
        room.Room room4 = new room.Room("hi!", (int) (short) 0, "hi! - hi!", "Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100");
        java.lang.String str5 = room4.getScannedID();
        java.lang.String str6 = room4.toString();
        room4.setUnderMaintenance(false);
        room.SensorObserver sensorObserver9 = null;
        room4.removeObserver(sensorObserver9);
        java.lang.String str11 = room4.getScannedID();
        java.lang.String str12 = room4.getScannedID();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Room hi! | hi! - hi! - Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | Capacity: 0" + "'", str6, "Room hi! | hi! - hi! - Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | Capacity: 0");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test04000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test04000");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        java.lang.String str5 = room4.getScannedID();
        room4.setScannedID("hi!");
        room4.setUnderMaintenance(true);
        boolean boolean10 = room4.isOccupied();
        boolean boolean11 = room4.isOccupied();
        java.lang.String str12 = room4.getRoomNumber();
        room.SensorObserver sensorObserver13 = null;
        room4.addObserver(sensorObserver13);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }
}

