import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest44 {

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
    public void test22001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22001");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        boolean boolean5 = room4.isOccupied();
        boolean boolean6 = room4.isEnabled();
        java.lang.String str7 = room4.getRoomNumber();
        room4.setEnabled(false);
        java.lang.String str10 = room4.getFullLocation();
        java.lang.String str11 = room4.getFullLocation();
        boolean boolean12 = room4.isUnderMaintenance();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi! - hi!" + "'", str10, "hi! - hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi! - hi!" + "'", str11, "hi! - hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test22002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22002");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        boolean boolean5 = room4.isOccupied();
        room.SensorObserver sensorObserver6 = null;
        room4.removeObserver(sensorObserver6);
        java.lang.String str8 = room4.getRoomNumber();
        java.lang.String str9 = room4.toString();
        room4.setScannedID("Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10");
        java.lang.String str12 = room4.getRoomNumber();
        java.lang.String str13 = room4.getRoomNumber();
        room4.setUnderMaintenance(false);
        java.lang.String str16 = room4.getBuildingName();
        boolean boolean17 = room4.isOccupied();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str9, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test22003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22003");
        room.Room room4 = new room.Room("Room Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 100 | hi! - hi! - hi! - hi! | Capacity: 0 | Room hi! - hi! | Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 10 -  | Capacity: 35", 0, "Room Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Room Room hi! - hi! - hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 1 | Capacity: 0 | Room hi! -  | Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 10 -  | Capacity: 52 -  | Capacity: -1", "Room Room hi! | hi! - hi! | Capacity: 0 | Room hi! | hi! - hi! | Capacity: 0 - hi! - hi! | Capacity: 100 - Room  - Room hi! | hi! - hi! | Capacity: 0 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 0");
    }

    @Test
    public void test22004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22004");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        boolean boolean5 = room4.isEnabled();
        java.lang.String str6 = room4.getBuildingName();
        room.SensorObserver sensorObserver7 = null;
        room4.removeObserver(sensorObserver7);
        java.lang.String str9 = room4.getBuildingName();
        room4.setScannedID("hi! - hi!");
        java.lang.String str12 = room4.getRoomID();
        java.lang.String str13 = room4.toString();
        java.lang.String str14 = room4.getBuildingName();
        room4.setEnabled(true);
        room4.setEnabled(false);
        java.lang.String str19 = room4.getScannedID();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str13, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi! - hi!" + "'", str19, "hi! - hi!");
    }

    @Test
    public void test22005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22005");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        java.lang.String str5 = room4.getScannedID();
        room4.setScannedID("hi!");
        boolean boolean8 = room4.isEnabled();
        int int9 = room4.getCapacity();
        int int10 = room4.getCapacity();
        boolean boolean11 = room4.isOccupied();
        room4.setEnabled(false);
        room4.notifyObservers();
        boolean boolean15 = room4.isUnderMaintenance();
        room4.setEnabled(true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test22006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22006");
        room.Room room4 = new room.Room("Room  - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 100 | hi! - hi! - hi! - hi! | Capacity: 0 | Capacity: 0", 35, "Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 | hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 0 - hi! - hi! - Room hi! | hi! - hi! | Capacity: 0", "Room Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! | Room Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! - hi! - hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: -1 - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 100");
        boolean boolean5 = room4.isEnabled();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test22007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22007");
        room.Room room4 = new room.Room("hi!", (int) (byte) 1, "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10", "hi!");
        java.lang.String str5 = room4.getRoomNumber();
        room4.notifyObservers();
        room4.setEnabled(false);
        room4.setOccupied(true);
        java.lang.String str11 = room4.getRoomNumber();
        java.lang.String str12 = room4.getBuildingName();
        java.lang.String str13 = room4.getRoomNumber();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10" + "'", str12, "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test22008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22008");
        room.Room room4 = new room.Room("hi!", (int) (byte) 100, "", "Room hi! | hi! - hi! | Capacity: 0");
        java.lang.String str5 = room4.getScannedID();
        java.lang.String str6 = room4.getBuildingName();
        room4.setScannedID("Room hi! | hi! - hi! | Capacity: 0");
        boolean boolean9 = room4.isOccupied();
        java.lang.String str10 = room4.toString();
        room.SensorObserver sensorObserver11 = null;
        room4.addObserver(sensorObserver11);
        java.lang.String str13 = room4.toString();
        java.lang.String str14 = room4.getFullLocation();
        boolean boolean15 = room4.isUnderMaintenance();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100" + "'", str10, "Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100" + "'", str13, "Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + " - Room hi! | hi! - hi! | Capacity: 0" + "'", str14, " - Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test22009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22009");
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
        room4.setEnabled(false);
        java.lang.String str19 = room4.toString();
        java.lang.String str20 = room4.getRoomID();
        room4.setOccupied(false);
        boolean boolean23 = room4.isOccupied();
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi! - hi!" + "'", str8, "hi! - hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi!" + "'", str15, "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi!" + "'", str16, "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str19, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test22010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22010");
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
        boolean boolean21 = room4.isEnabled();
        java.lang.String str22 = room4.getBuildingName();
        room.SensorObserver sensorObserver23 = null;
        room4.removeObserver(sensorObserver23);
        java.lang.String str25 = room4.getFullLocation();
        room.SensorObserver sensorObserver26 = null;
        room4.addObserver(sensorObserver26);
        java.lang.String str28 = room4.getRoomNumber();
        // The following exception was thrown during execution in test generation
        try {
            room4.setOccupied(true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi! - hi!" + "'", str11, "hi! - hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi! - hi!" + "'", str25, "hi! - hi!");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
    }

    @Test
    public void test22011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22011");
        room.Room room4 = new room.Room("hi!", (int) (byte) 100, "", "Room hi! | hi! - hi! | Capacity: 0");
        java.lang.String str5 = room4.getRoomNumber();
        room4.notifyObservers();
        room4.setOccupied(true);
        java.lang.String str9 = room4.getScannedID();
        java.lang.String str10 = room4.getBuildingName();
        java.lang.String str11 = room4.getFullLocation();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str5, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + " - Room hi! | hi! - hi! | Capacity: 0" + "'", str11, " - Room hi! | hi! - hi! | Capacity: 0");
    }

    @Test
    public void test22012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22012");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        boolean boolean5 = room4.isOccupied();
        boolean boolean6 = room4.isEnabled();
        java.lang.String str7 = room4.getFullLocation();
        java.lang.String str8 = room4.getRoomID();
        java.lang.String str9 = room4.getBuildingName();
        java.lang.String str10 = room4.getRoomNumber();
        java.lang.String str11 = room4.getRoomID();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi! - hi!" + "'", str7, "hi! - hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test22013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22013");
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
        boolean boolean16 = room4.isOccupied();
        int int17 = room4.getCapacity();
        java.lang.String str18 = room4.getRoomID();
        room.SensorObserver sensorObserver19 = null;
        room4.addObserver(sensorObserver19);
        java.lang.String str21 = room4.getBuildingName();
        java.lang.Class<?> wildcardClass22 = room4.getClass();
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str11, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test22014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22014");
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
        java.lang.String str14 = room4.toString();
        room4.notifyObservers();
        room.SensorObserver sensorObserver16 = null;
        room4.removeObserver(sensorObserver16);
        java.lang.String str18 = room4.getFullLocation();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str7, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi! - hi!" + "'", str12, "hi! - hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str14, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi! - hi!" + "'", str18, "hi! - hi!");
    }

    @Test
    public void test22015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22015");
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
        java.lang.String str16 = room4.getFullLocation();
        java.lang.String str17 = room4.getRoomID();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10" + "'", str5, "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str6, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0 - hi!" + "'", str15, "Room hi! | hi! - hi! | Capacity: 0 - hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0 - hi!" + "'", str16, "Room hi! | hi! - hi! | Capacity: 0 - hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test22016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22016");
        room.Room room4 = new room.Room("hi! - hi!", (int) (byte) -1, " - Room hi! | hi! - hi! | Capacity: 0", "Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 97");
        room4.setScannedID("Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10");
        boolean boolean7 = room4.isOccupied();
        java.lang.String str8 = room4.toString();
        room4.setScannedID("Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 100 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  - Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | hi! -  - Room  - Room hi! | hi! - hi! | Capacity: 0 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 0 | Capacity: 10");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Room hi! - hi! |  - Room hi! | hi! - hi! | Capacity: 0 - Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 97 | Capacity: -1" + "'", str8, "Room hi! - hi! |  - Room hi! | hi! - hi! | Capacity: 0 - Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 97 | Capacity: -1");
    }

    @Test
    public void test22017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22017");
        room.Room room4 = new room.Room("Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10", (int) '4', "hi! - Room hi! | hi! - hi! | Capacity: 0", "");
        java.lang.String str5 = room4.getScannedID();
        room4.setOccupied(true);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test22018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22018");
        room.Room room4 = new room.Room("Room Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | hi! - hi! - hi! | Capacity: 0 | Room Room hi! - hi! - hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 1 | Capacity: 0 | Room hi! -  | Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 10 -  | Capacity: 52 - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 100 | hi! - hi! - hi! - hi! | Capacity: 0 | Capacity: 10", (int) (short) 10, "Room Room hi! -  | Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 10 | Room  - Room hi! | hi! - hi! | Capacity: 0 |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 0 - Room  - Room hi! | hi! - hi! | Capacity: 0 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 0 -  | Capacity: 100", "Room Room Room hi! | hi! - hi! | Capacity: 0 | hi! - hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 97 | Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 97 - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 100 - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 10");
    }

    @Test
    public void test22019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22019");
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
        room.SensorObserver sensorObserver15 = null;
        room4.removeObserver(sensorObserver15);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi! - hi!" + "'", str12, "hi! - hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi! - hi!" + "'", str14, "hi! - hi!");
    }

    @Test
    public void test22020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22020");
        room.Room room4 = new room.Room("Room Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 1 - Room hi! | hi! - hi! | Capacity: 0 - hi! |  -  | Capacity: 35", (-1), "Room  | Room Room hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 1 | Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! - Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: -1 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 100", "Room Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! - hi! - hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: -1 - Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 | hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 0");
    }

    @Test
    public void test22021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22021");
        room.Room room4 = new room.Room("Room  | Room Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! - hi! - hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: -1 - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 | Capacity: 97", (int) (byte) -1, "Room hi! | hi! - hi! | Capacity: 0 - hi! - ", " - hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi!");
        java.lang.String str5 = room4.getRoomNumber();
        boolean boolean6 = room4.isEnabled();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + " - hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi!" + "'", str5, " - hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test22022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22022");
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
        java.lang.String str18 = room4.toString();
        room4.setOccupied(false);
        room4.setEnabled(false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str11, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str17, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str18, "Room hi! | hi! - hi! | Capacity: 0");
    }

    @Test
    public void test22023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22023");
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
        java.lang.String str16 = room4.getBuildingName();
        java.lang.String str17 = room4.getScannedID();
        int int18 = room4.getCapacity();
        room4.setEnabled(true);
        java.lang.String str21 = room4.getRoomNumber();
        int int22 = room4.getCapacity();
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str11, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test22024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22024");
        room.Room room4 = new room.Room("hi!", (int) (byte) 100, "", "Room hi! | hi! - hi! | Capacity: 0");
        java.lang.String str5 = room4.getScannedID();
        java.lang.String str6 = room4.getBuildingName();
        room4.setUnderMaintenance(false);
        boolean boolean9 = room4.isOccupied();
        java.lang.String str10 = room4.getRoomID();
        java.lang.String str11 = room4.toString();
        java.lang.String str12 = room4.toString();
        boolean boolean13 = room4.isOccupied();
        java.lang.String str14 = room4.getRoomNumber();
        java.lang.String str15 = room4.toString();
        java.lang.String str16 = room4.getFullLocation();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100" + "'", str11, "Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100" + "'", str12, "Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str14, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100" + "'", str15, "Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + " - Room hi! | hi! - hi! | Capacity: 0" + "'", str16, " - Room hi! | hi! - hi! | Capacity: 0");
    }

    @Test
    public void test22025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22025");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        room.SensorObserver sensorObserver5 = null;
        room4.addObserver(sensorObserver5);
        java.lang.String str7 = room4.getScannedID();
        room.SensorObserver sensorObserver8 = null;
        room4.removeObserver(sensorObserver8);
        java.lang.String str10 = room4.getRoomNumber();
        java.lang.String str11 = room4.toString();
        java.lang.String str12 = room4.getRoomNumber();
        java.lang.String str13 = room4.getBuildingName();
        room4.notifyObservers();
        room4.setOccupied(false);
        boolean boolean17 = room4.isOccupied();
        room4.setUnderMaintenance(true);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str11, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test22026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22026");
        room.Room room4 = new room.Room("Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10", 0, "hi!", "Room hi! | hi! - hi! | Capacity: 0");
        java.lang.String str5 = room4.getBuildingName();
        boolean boolean6 = room4.isEnabled();
        java.lang.String str7 = room4.getScannedID();
        java.lang.String str8 = room4.getRoomID();
        java.lang.String str9 = room4.getScannedID();
        room4.setEnabled(true);
        java.lang.String str12 = room4.toString();
        room4.setUnderMaintenance(false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10" + "'", str8, "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 | hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 0" + "'", str12, "Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 | hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 0");
    }

    @Test
    public void test22027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22027");
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
        java.lang.String str19 = room4.getScannedID();
        boolean boolean20 = room4.isOccupied();
        java.lang.String str21 = room4.getBuildingName();
        java.lang.String str22 = room4.getBuildingName();
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str11, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str16, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi! - hi! - Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100" + "'", str19, "hi! - hi! - Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
    }

    @Test
    public void test22028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22028");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        java.lang.String str5 = room4.getScannedID();
        room4.setScannedID("hi!");
        java.lang.String str8 = room4.getBuildingName();
        int int9 = room4.getCapacity();
        room4.setOccupied(true);
        java.lang.String str12 = room4.getBuildingName();
        boolean boolean13 = room4.isOccupied();
        java.lang.String str14 = room4.getFullLocation();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi! - hi!" + "'", str14, "hi! - hi!");
    }

    @Test
    public void test22029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22029");
        room.Room room4 = new room.Room("Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100", 10, "hi! - ", "Room  - Room hi! | hi! - hi! | Capacity: 0 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 0");
        java.lang.String str5 = room4.toString();
        java.lang.String str6 = room4.getRoomID();
        room.SensorObserver sensorObserver7 = null;
        room4.addObserver(sensorObserver7);
        java.lang.String str9 = room4.getRoomNumber();
        // The following exception was thrown during execution in test generation
        try {
            room4.setScannedID("Room  - Room hi! | hi! - hi! | Capacity: 0 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 0 - Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 97");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | hi! -  - Room  - Room hi! | hi! - hi! | Capacity: 0 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 0 | Capacity: 10" + "'", str5, "Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | hi! -  - Room  - Room hi! | hi! - hi! | Capacity: 0 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 0 | Capacity: 10");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100" + "'", str6, "Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Room  - Room hi! | hi! - hi! | Capacity: 0 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 0" + "'", str9, "Room  - Room hi! | hi! - hi! | Capacity: 0 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 0");
    }

    @Test
    public void test22030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22030");
        room.Room room4 = new room.Room("Room hi! | hi! - hi! | Capacity: 0 - hi!", (int) (short) 10, "Room hi! | hi! - hi! | Capacity: 0", "Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10");
        boolean boolean5 = room4.isEnabled();
        room4.setEnabled(false);
        room4.setScannedID("Room hi! | hi! - hi! | Capacity: 0 - hi!");
        java.lang.String str10 = room4.getScannedID();
        room.SensorObserver sensorObserver11 = null;
        room4.addObserver(sensorObserver11);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0 - hi!" + "'", str10, "Room hi! | hi! - hi! | Capacity: 0 - hi!");
    }

    @Test
    public void test22031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22031");
        room.Room room4 = new room.Room("Room hi! | hi! - hi! | Capacity: 0", (int) (byte) 10, "hi!", "");
        room4.setUnderMaintenance(true);
        java.lang.String str7 = room4.toString();
        room4.notifyObservers();
        room4.setScannedID("hi! - hi!");
        room4.setOccupied(false);
        int int13 = room4.getCapacity();
        int int14 = room4.getCapacity();
        java.lang.String str15 = room4.getBuildingName();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10" + "'", str7, "Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test22032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22032");
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
        room4.setEnabled(true);
        java.lang.String str18 = room4.getRoomID();
        java.lang.String str19 = room4.getScannedID();
        java.lang.String str20 = room4.getBuildingName();
        java.lang.String str21 = room4.toString();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + " - Room hi! | hi! - hi! | Capacity: 0" + "'", str15, " - Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100" + "'", str21, "Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100");
    }

    @Test
    public void test22033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22033");
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
        java.lang.String str20 = room4.getScannedID();
        boolean boolean21 = room4.isUnderMaintenance();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str8, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10" + "'", str15, "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi! - hi!" + "'", str17, "hi! - hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10" + "'", str20, "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test22034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22034");
        room.Room room4 = new room.Room("Room Room hi! | hi! - hi! | Capacity: 0 | Room hi! | hi! - hi! | Capacity: 0 - hi! - hi! | Capacity: 100", (int) '4', "Room hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 1", "hi! - hi! - Room hi! | hi! - hi! | Capacity: 0");
        java.lang.String str5 = room4.getScannedID();
        java.lang.String str6 = room4.getScannedID();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test22035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22035");
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
        java.lang.String str15 = room4.getRoomID();
        java.lang.String str16 = room4.getBuildingName();
        room4.setEnabled(true);
        boolean boolean19 = room4.isUnderMaintenance();
        java.lang.String str20 = room4.getRoomNumber();
        room4.setScannedID("hi! -  - Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str6, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str7, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str8, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str9, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test22036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22036");
        room.Room room4 = new room.Room(" - hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10", (int) (byte) 1, "Room Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! - hi! - hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: -1 - Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 | hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 0 - hi! - hi! - Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 97", "Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 100 | hi! - hi! - hi! - hi! | Capacity: 0 -  - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi!");
        room4.setEnabled(true);
        room4.setEnabled(false);
    }

    @Test
    public void test22037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22037");
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
        java.lang.String str20 = room4.toString();
        room4.notifyObservers();
        java.lang.String str22 = room4.getRoomNumber();
        boolean boolean23 = room4.isOccupied();
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str11, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi! - hi!" + "'", str14, "hi! - hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str15, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str20, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test22038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22038");
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
        boolean boolean18 = room4.isEnabled();
        boolean boolean19 = room4.isEnabled();
        java.lang.Class<?> wildcardClass20 = room4.getClass();
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str11, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test22039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22039");
        room.Room room4 = new room.Room("Room hi! | hi! - hi! | Capacity: 0", (int) 'a', "Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi!", "Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi!");
        boolean boolean5 = room4.isEnabled();
        java.lang.String str6 = room4.getRoomID();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str6, "Room hi! | hi! - hi! | Capacity: 0");
    }

    @Test
    public void test22040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22040");
        room.Room room4 = new room.Room(" - Room hi! | hi! - hi! | Capacity: 0", 0, "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10", "Room hi! | hi! - hi! | Capacity: 0 - hi! - ");
        room4.setScannedID("Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 100 | hi! - hi! - hi! - hi! | Capacity: 0");
        boolean boolean7 = room4.isOccupied();
        java.lang.String str8 = room4.getRoomID();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + " - Room hi! | hi! - hi! | Capacity: 0" + "'", str8, " - Room hi! | hi! - hi! | Capacity: 0");
    }

    @Test
    public void test22041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22041");
        room.Room room4 = new room.Room("Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10", 0, "hi!", "Room hi! | hi! - hi! | Capacity: 0");
        java.lang.String str5 = room4.getBuildingName();
        room.SensorObserver sensorObserver6 = null;
        room4.removeObserver(sensorObserver6);
        room.SensorObserver sensorObserver8 = null;
        room4.addObserver(sensorObserver8);
        room.SensorObserver sensorObserver10 = null;
        room4.removeObserver(sensorObserver10);
        java.lang.String str12 = room4.getBuildingName();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test22042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22042");
        room.Room room4 = new room.Room("hi!", (int) (byte) 1, "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10", "hi!");
        room4.notifyObservers();
        java.lang.String str6 = room4.getFullLocation();
        java.lang.String str7 = room4.getScannedID();
        boolean boolean8 = room4.isUnderMaintenance();
        java.lang.String str9 = room4.getFullLocation();
        java.lang.String str10 = room4.getFullLocation();
        boolean boolean11 = room4.isOccupied();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi!" + "'", str6, "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi!");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi!" + "'", str9, "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi!" + "'", str10, "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test22043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22043");
        room.Room room4 = new room.Room("Room hi! | hi! - hi! | Capacity: 0", (int) (byte) 100, "Room hi! | hi! - hi! | Capacity: 0 - hi!", "hi!");
        java.lang.String str5 = room4.getRoomID();
        java.lang.String str6 = room4.getFullLocation();
        room4.setEnabled(false);
        room4.notifyObservers();
        room4.setOccupied(true);
        java.lang.String str12 = room4.getRoomNumber();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str5, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0 - hi! - hi!" + "'", str6, "Room hi! | hi! - hi! | Capacity: 0 - hi! - hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test22044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22044");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        boolean boolean5 = room4.isOccupied();
        java.lang.String str6 = room4.toString();
        java.lang.String str7 = room4.toString();
        java.lang.String str8 = room4.toString();
        java.lang.String str9 = room4.toString();
        boolean boolean10 = room4.isUnderMaintenance();
        int int11 = room4.getCapacity();
        room4.setOccupied(true);
        room.SensorObserver sensorObserver14 = null;
        room4.removeObserver(sensorObserver14);
        boolean boolean16 = room4.isUnderMaintenance();
        boolean boolean17 = room4.isUnderMaintenance();
        room4.setScannedID("Room Room hi! - hi! - Room hi! | hi! - hi! | Capacity: 0 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 100 | Capacity: 10 | Room hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 1 - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str6, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str7, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str8, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str9, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test22045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22045");
        room.Room room4 = new room.Room("hi!", (int) (short) 0, "hi! - hi!", "Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100");
        java.lang.String str5 = room4.getScannedID();
        java.lang.String str6 = room4.toString();
        room4.setUnderMaintenance(false);
        java.lang.String str9 = room4.getBuildingName();
        boolean boolean10 = room4.isUnderMaintenance();
        java.lang.String str11 = room4.getFullLocation();
        java.lang.String str12 = room4.getFullLocation();
        java.lang.String str13 = room4.getRoomNumber();
        room4.notifyObservers();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Room hi! | hi! - hi! - Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | Capacity: 0" + "'", str6, "Room hi! | hi! - hi! - Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi! - hi!" + "'", str9, "hi! - hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi! - hi! - Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100" + "'", str11, "hi! - hi! - Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi! - hi! - Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100" + "'", str12, "hi! - hi! - Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100" + "'", str13, "Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100");
    }

    @Test
    public void test22046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22046");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        room.SensorObserver sensorObserver5 = null;
        room4.addObserver(sensorObserver5);
        java.lang.String str7 = room4.getScannedID();
        java.lang.String str8 = room4.getFullLocation();
        boolean boolean9 = room4.isOccupied();
        boolean boolean10 = room4.isOccupied();
        room.SensorObserver sensorObserver11 = null;
        room4.removeObserver(sensorObserver11);
        room4.notifyObservers();
        boolean boolean14 = room4.isOccupied();
        room4.setEnabled(true);
        java.lang.String str17 = room4.toString();
        int int18 = room4.getCapacity();
        int int19 = room4.getCapacity();
        java.lang.String str20 = room4.getRoomNumber();
        room4.notifyObservers();
        room4.setScannedID("Room hi! | hi! - hi! | Capacity: 0 - hi! - hi! - Room hi! | hi! - hi! | Capacity: 0 - hi! - hi!");
        java.lang.String str24 = room4.getScannedID();
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi! - hi!" + "'", str8, "hi! - hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str17, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0 - hi! - hi! - Room hi! | hi! - hi! | Capacity: 0 - hi! - hi!" + "'", str24, "Room hi! | hi! - hi! | Capacity: 0 - hi! - hi! - Room hi! | hi! - hi! | Capacity: 0 - hi! - hi!");
    }

    @Test
    public void test22047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22047");
        room.Room room4 = new room.Room("hi! - ", (int) (byte) -1, "hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10", "Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 100 | hi! - hi! - hi! - hi! | Capacity: 0 -  | Capacity: 1");
        java.lang.String str5 = room4.getFullLocation();
        room4.notifyObservers();
        boolean boolean7 = room4.isEnabled();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 100 | hi! - hi! - hi! - hi! | Capacity: 0 -  | Capacity: 1" + "'", str5, "hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 100 | hi! - hi! - hi! - hi! | Capacity: 0 -  | Capacity: 1");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test22048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22048");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        java.lang.String str5 = room4.getBuildingName();
        java.lang.String str6 = room4.getRoomID();
        room4.setUnderMaintenance(false);
        boolean boolean9 = room4.isOccupied();
        room4.setEnabled(true);
        java.lang.Class<?> wildcardClass12 = room4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test22049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22049");
        room.Room room4 = new room.Room("hi!", (int) (byte) 100, "", "Room hi! | hi! - hi! | Capacity: 0");
        room4.notifyObservers();
        room.SensorObserver sensorObserver6 = null;
        room4.removeObserver(sensorObserver6);
        java.lang.String str8 = room4.toString();
        room4.setUnderMaintenance(true);
        boolean boolean11 = room4.isUnderMaintenance();
        room.SensorObserver sensorObserver12 = null;
        room4.removeObserver(sensorObserver12);
        java.lang.String str14 = room4.getBuildingName();
        int int15 = room4.getCapacity();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100" + "'", str8, "Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
    }

    @Test
    public void test22050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22050");
        room.Room room4 = new room.Room("", (int) (short) 10, "Room hi! | hi! - hi! | Capacity: 0", "hi!");
        java.lang.String str5 = room4.getFullLocation();
        boolean boolean6 = room4.isEnabled();
        int int7 = room4.getCapacity();
        boolean boolean8 = room4.isOccupied();
        room4.setOccupied(true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0 - hi!" + "'", str5, "Room hi! | hi! - hi! | Capacity: 0 - hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test22051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22051");
        room.Room room4 = new room.Room(" - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi!", 1, "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 100 - Room hi! | hi! - hi! | Capacity: 0 - hi! - ", "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10");
        boolean boolean5 = room4.isOccupied();
        boolean boolean6 = room4.isEnabled();
        room4.setScannedID("hi! - hi! - ");
        java.lang.String str9 = room4.getRoomID();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + " - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi!" + "'", str9, " - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi!");
    }

    @Test
    public void test22052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22052");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        room.SensorObserver sensorObserver5 = null;
        room4.addObserver(sensorObserver5);
        java.lang.String str7 = room4.getScannedID();
        java.lang.String str8 = room4.getBuildingName();
        java.lang.String str9 = room4.getBuildingName();
        boolean boolean10 = room4.isEnabled();
        java.lang.String str11 = room4.getRoomNumber();
        java.lang.String str12 = room4.getScannedID();
        java.lang.String str13 = room4.getRoomID();
        java.lang.String str14 = room4.getBuildingName();
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test22053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22053");
        room.Room room4 = new room.Room("Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room hi! | hi! - hi! | Capacity: 0", (int) (short) 10, "Room hi! - hi! | Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 10", "Room Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 | Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 - hi! -  | Capacity: 10 | Room hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 1 - Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | hi! -  - Room  - Room hi! | hi! - hi! | Capacity: 0 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 0 | Capacity: 10 - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 -  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 1");
        boolean boolean5 = room4.isOccupied();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test22054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22054");
        room.Room room4 = new room.Room("Room Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 97 - hi! - hi! - hi! | Room  - hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Room Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! - hi! - hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: -1 - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! | Capacity: 100 -  - Room hi! - hi! - hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 1 | Capacity: 0 | Capacity: -1", (int) (short) 100, "Room Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 1 - Room hi! | hi! - hi! | Capacity: 0 - hi! |  -  | Capacity: 35", "Room  - Room hi! | hi! - hi! | Capacity: 0 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 0 - hi! - Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 100 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 -  - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! | Capacity: 0");
        int int5 = room4.getCapacity();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
    }

    @Test
    public void test22055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22055");
        room.Room room4 = new room.Room("hi!", (int) (byte) 100, "", "Room hi! | hi! - hi! | Capacity: 0");
        java.lang.String str5 = room4.toString();
        java.lang.String str6 = room4.getScannedID();
        room4.notifyObservers();
        room4.setEnabled(true);
        java.lang.String str10 = room4.getRoomID();
        java.lang.String str11 = room4.getRoomNumber();
        room4.setScannedID("Room Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 97 | Room hi! - hi! - hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 1 | Capacity: 0 - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 | Capacity: 35");
        int int14 = room4.getCapacity();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100" + "'", str5, "Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str11, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
    }

    @Test
    public void test22056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22056");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        java.lang.String str5 = room4.getScannedID();
        room4.setScannedID("hi!");
        room4.setUnderMaintenance(true);
        java.lang.String str10 = room4.getFullLocation();
        java.lang.String str11 = room4.getScannedID();
        room4.setEnabled(true);
        java.lang.String str14 = room4.getFullLocation();
        boolean boolean15 = room4.isUnderMaintenance();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi! - hi!" + "'", str10, "hi! - hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi! - hi!" + "'", str14, "hi! - hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test22057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22057");
        room.Room room4 = new room.Room("Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10", 1, "Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 1", "Room hi! | hi! - hi! | Capacity: 0 - hi!");
        boolean boolean5 = room4.isOccupied();
        int int6 = room4.getCapacity();
        boolean boolean7 = room4.isEnabled();
        java.lang.String str8 = room4.getScannedID();
        java.lang.String str9 = room4.getBuildingName();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 1" + "'", str9, "Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 1");
    }

    @Test
    public void test22058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22058");
        room.Room room4 = new room.Room("hi!", (int) (byte) 100, "", "Room hi! | hi! - hi! | Capacity: 0");
        java.lang.String str5 = room4.getRoomNumber();
        room4.notifyObservers();
        java.lang.String str7 = room4.getBuildingName();
        room4.setOccupied(false);
        room4.setOccupied(true);
        room.SensorObserver sensorObserver12 = null;
        room4.removeObserver(sensorObserver12);
        boolean boolean14 = room4.isUnderMaintenance();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str5, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test22059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22059");
        room.Room room4 = new room.Room("hi!", 1, "Room hi! | hi! - hi! | Capacity: 0 - hi!", "Room hi! | hi! - hi! | Capacity: 0 - hi!");
        int int5 = room4.getCapacity();
        java.lang.String str6 = room4.toString();
        room4.setScannedID("Room hi! | hi! - hi! | Capacity: 0 - hi! - ");
        room.SensorObserver sensorObserver9 = null;
        room4.removeObserver(sensorObserver9);
        boolean boolean11 = room4.isEnabled();
        boolean boolean12 = room4.isEnabled();
        room4.setUnderMaintenance(false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Room hi! | Room hi! | hi! - hi! | Capacity: 0 - hi! - Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 1" + "'", str6, "Room hi! | Room hi! | hi! - hi! | Capacity: 0 - hi! - Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 1");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test22060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22060");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        java.lang.String str5 = room4.toString();
        java.lang.String str6 = room4.getRoomID();
        boolean boolean7 = room4.isUnderMaintenance();
        boolean boolean8 = room4.isEnabled();
        boolean boolean9 = room4.isOccupied();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str5, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test22061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22061");
        room.Room room4 = new room.Room(" - hi! - hi! - Room hi! | hi! - hi! | Capacity: 0 - Room  - Room hi! | hi! - hi! | Capacity: 0 |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 0", (int) '4', "Room Room hi! | hi! - hi! | Capacity: 0 - hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! - hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 97 | Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 100 | hi! - hi! - hi! - hi! | Capacity: 0 - Room Room hi! | hi! - hi! | Capacity: 0 - hi! |  - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 | Capacity: 1 | Capacity: -1", "Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! -  - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10");
    }

    @Test
    public void test22062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22062");
        room.Room room4 = new room.Room("Room hi! | Room hi! | hi! - hi! | Capacity: 0 - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 32", (int) (byte) -1, "Room Room hi! | hi! - hi! | Capacity: 0 | Room Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! - hi! - hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: -1 -  - Room Room Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 100 | Room Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 100 - Room Room hi! | hi! - hi! | Capacity: 0 |  - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 0 | Capacity: 32 | Capacity: 1", "Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! - hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 97 | Capacity: 32 | Room Room hi! | hi! - hi! | Capacity: 0 | Room hi! | hi! - hi! | Capacity: 0 - hi! - hi! | Capacity: 100 - hi! - hi! - Room hi! | hi! - hi! | Capacity: 0 - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 1 - Room Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! | Room  - Room hi! | hi! - hi! | Capacity: 0 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 0 - Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 97 | Capacity: 0 | Capacity: 0");
    }

    @Test
    public void test22063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22063");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        room.SensorObserver sensorObserver5 = null;
        room4.addObserver(sensorObserver5);
        java.lang.String str7 = room4.getScannedID();
        room.SensorObserver sensorObserver8 = null;
        room4.removeObserver(sensorObserver8);
        boolean boolean10 = room4.isUnderMaintenance();
        room4.setEnabled(true);
        room.SensorObserver sensorObserver13 = null;
        room4.removeObserver(sensorObserver13);
        room4.notifyObservers();
        room4.setOccupied(false);
        java.lang.String str18 = room4.getBuildingName();
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test22064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22064");
        room.Room room4 = new room.Room("", (int) (byte) 1, "Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10", "hi!");
        java.lang.String str5 = room4.getBuildingName();
        room.SensorObserver sensorObserver6 = null;
        room4.addObserver(sensorObserver6);
        room.SensorObserver sensorObserver8 = null;
        room4.addObserver(sensorObserver8);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10" + "'", str5, "Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10");
    }

    @Test
    public void test22065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22065");
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
        room4.setOccupied(true);
        java.lang.String str18 = room4.getRoomID();
        room4.setOccupied(true);
        room4.notifyObservers();
        java.lang.String str22 = room4.getBuildingName();
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str11, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
    }

    @Test
    public void test22066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22066");
        room.Room room4 = new room.Room("Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi!", (int) (short) 0, "hi! - hi! - hi!", "Room hi! | hi! - hi! | Capacity: 0");
        room4.setOccupied(false);
        room4.setUnderMaintenance(false);
        room4.setEnabled(false);
        room.SensorObserver sensorObserver11 = null;
        room4.removeObserver(sensorObserver11);
        room4.notifyObservers();
    }

    @Test
    public void test22067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22067");
        room.Room room4 = new room.Room("Room hi! | hi! - hi! | Capacity: 0", (int) (byte) 10, "hi!", "");
        room4.setUnderMaintenance(true);
        java.lang.String str7 = room4.toString();
        java.lang.String str8 = room4.getBuildingName();
        java.lang.String str9 = room4.toString();
        java.lang.String str10 = room4.getScannedID();
        room4.setEnabled(false);
        java.lang.String str13 = room4.getRoomNumber();
        room4.setOccupied(true);
        room.SensorObserver sensorObserver16 = null;
        room4.addObserver(sensorObserver16);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10" + "'", str7, "Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10" + "'", str9, "Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test22068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22068");
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
        room4.setUnderMaintenance(true);
        java.lang.String str21 = room4.toString();
        java.lang.String str22 = room4.getBuildingName();
        java.lang.String str23 = room4.toString();
        java.lang.String str24 = room4.getFullLocation();
        java.lang.String str25 = room4.getRoomNumber();
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
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str21, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str23, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi! - hi!" + "'", str24, "hi! - hi!");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
    }

    @Test
    public void test22069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22069");
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
        java.lang.String str16 = room4.getRoomID();
        boolean boolean17 = room4.isEnabled();
        boolean boolean18 = room4.isEnabled();
        java.lang.Class<?> wildcardClass19 = room4.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str7, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test22070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22070");
        room.Room room4 = new room.Room("hi!", (int) (byte) 1, "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10", "hi!");
        room4.notifyObservers();
        room4.setUnderMaintenance(false);
        java.lang.String str8 = room4.getRoomID();
        boolean boolean9 = room4.isOccupied();
        boolean boolean10 = room4.isEnabled();
        boolean boolean11 = room4.isUnderMaintenance();
        room.SensorObserver sensorObserver12 = null;
        room4.removeObserver(sensorObserver12);
        java.lang.String str14 = room4.getFullLocation();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi!" + "'", str14, "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi!");
    }

    @Test
    public void test22071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22071");
        room.Room room4 = new room.Room("Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 |  - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! | Capacity: 1", (int) (byte) 1, "Room  - Room hi! | hi! - hi! | Capacity: 0 | Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! -  | Capacity: 10", "Room Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! -  -  - Room hi! | hi! - hi! | Capacity: 0 | Room  - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 100 | hi! - hi! - hi! - hi! | Capacity: 0 | Capacity: 0 - Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 1 | Capacity: 10");
    }

    @Test
    public void test22072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22072");
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
        boolean boolean22 = room4.isOccupied();
        java.lang.String str23 = room4.getScannedID();
        room4.setUnderMaintenance(true);
        room4.notifyObservers();
        java.lang.String str27 = room4.getRoomNumber();
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str11, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
    }

    @Test
    public void test22073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22073");
        room.Room room4 = new room.Room("Room Room Room hi! - hi! - Room hi! | hi! - hi! | Capacity: 0 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 100 | Capacity: 10 | Room hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 1 - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | Room  - Room hi! | hi! - hi! | Capacity: 0 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 0 - hi! -  - hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 -  | Capacity: 1", 10, "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room  - Room hi! | hi! - hi! | Capacity: 0 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 0 - hi!", " - Room hi! | hi! - hi! | Capacity: 0 - Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 97");
        boolean boolean5 = room4.isEnabled();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test22074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22074");
        room.Room room4 = new room.Room("", (int) (short) 0, "hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10", "Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10");
        boolean boolean5 = room4.isOccupied();
        room.SensorObserver sensorObserver6 = null;
        room4.removeObserver(sensorObserver6);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test22075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22075");
        room.Room room4 = new room.Room("Room hi! | hi! - hi! | Capacity: 0 - hi! - hi!", (int) (short) -1, "Room Room hi! | hi! - hi! | Capacity: 0 - hi! - hi! |  - Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | hi! - hi! - hi! | Capacity: 0 | Capacity: 52 - ", "hi! - hi! - hi! - hi!");
        java.lang.String str5 = room4.getFullLocation();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Room Room hi! | hi! - hi! | Capacity: 0 - hi! - hi! |  - Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | hi! - hi! - hi! | Capacity: 0 | Capacity: 52 -  - hi! - hi! - hi! - hi!" + "'", str5, "Room Room hi! | hi! - hi! | Capacity: 0 - hi! - hi! |  - Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | hi! - hi! - hi! | Capacity: 0 | Capacity: 52 -  - hi! - hi! - hi! - hi!");
    }

    @Test
    public void test22076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22076");
        room.Room room4 = new room.Room("", (int) ' ', "Room hi! | hi! - hi! | Capacity: 0", " - Room hi! | hi! - hi! | Capacity: 0");
        room4.setEnabled(false);
        room.SensorObserver sensorObserver7 = null;
        room4.addObserver(sensorObserver7);
    }

    @Test
    public void test22077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22077");
        room.Room room4 = new room.Room("Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100", (int) (short) 1, "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi!", "Room hi! | hi! - hi! | Capacity: 0");
        int int5 = room4.getCapacity();
        room4.setUnderMaintenance(true);
        java.lang.String str8 = room4.getScannedID();
        java.lang.String str9 = room4.getRoomNumber();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str9, "Room hi! | hi! - hi! | Capacity: 0");
    }

    @Test
    public void test22078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22078");
        room.Room room4 = new room.Room("Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi!", (int) (byte) 1, "Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 | Room Room hi! | hi! - hi! | Capacity: 0 | Room hi! | hi! - hi! | Capacity: 0 - hi! - hi! | Capacity: 100 - hi! - hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 0", "Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi!");
        int int5 = room4.getCapacity();
        room4.setOccupied(false);
        boolean boolean8 = room4.isOccupied();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test22079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22079");
        room.Room room4 = new room.Room("Room hi! - hi! - Room hi! | hi! - hi! | Capacity: 0 | hi! - hi! - Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 97 | Capacity: 10", (int) (byte) -1, "Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | hi! -  - Room  - Room hi! | hi! - hi! | Capacity: 0 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 0 | Capacity: 10", "");
        java.lang.String str5 = room4.getRoomNumber();
        room4.notifyObservers();
        java.lang.String str7 = room4.getRoomID();
        boolean boolean8 = room4.isUnderMaintenance();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Room hi! - hi! - Room hi! | hi! - hi! | Capacity: 0 | hi! - hi! - Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 97 | Capacity: 10" + "'", str7, "Room hi! - hi! - Room hi! | hi! - hi! | Capacity: 0 | hi! - hi! - Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 97 | Capacity: 10");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test22080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22080");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        java.lang.String str5 = room4.getScannedID();
        room4.setScannedID("hi!");
        boolean boolean8 = room4.isEnabled();
        int int9 = room4.getCapacity();
        boolean boolean10 = room4.isOccupied();
        java.lang.String str11 = room4.getRoomNumber();
        boolean boolean12 = room4.isOccupied();
        room4.setOccupied(true);
        java.lang.String str15 = room4.toString();
        java.lang.String str16 = room4.getScannedID();
        boolean boolean17 = room4.isOccupied();
        room4.setUnderMaintenance(false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str15, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test22081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22081");
        room.Room room4 = new room.Room("Room Room hi! | hi! - hi! | Capacity: 0 |  - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 0 - Room hi! | Room hi! | hi! - hi! | Capacity: 0 - hi! - Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 1", 10, "hi! -  - Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 1 - hi!", "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 100 - Room hi! | hi! - hi! | Capacity: 0 - hi! - ");
        java.lang.String str5 = room4.getFullLocation();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi! -  - Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 1 - hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 100 - Room hi! | hi! - hi! | Capacity: 0 - hi! - " + "'", str5, "hi! -  - Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 1 - hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 100 - Room hi! | hi! - hi! | Capacity: 0 - hi! - ");
    }

    @Test
    public void test22082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22082");
        room.Room room4 = new room.Room("Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100", (int) 'a', "hi! - hi!", "Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10");
        java.lang.String str5 = room4.toString();
        java.lang.String str6 = room4.getScannedID();
        java.lang.String str7 = room4.getFullLocation();
        boolean boolean8 = room4.isEnabled();
        int int9 = room4.getCapacity();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 97" + "'", str5, "Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 97");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10" + "'", str7, "hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
    }

    @Test
    public void test22083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22083");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        boolean boolean5 = room4.isOccupied();
        room4.setEnabled(false);
        boolean boolean8 = room4.isUnderMaintenance();
        java.lang.String str9 = room4.getFullLocation();
        boolean boolean10 = room4.isOccupied();
        java.lang.String str11 = room4.toString();
        java.lang.String str12 = room4.getBuildingName();
        java.lang.String str13 = room4.getRoomID();
        java.lang.String str14 = room4.getRoomNumber();
        boolean boolean15 = room4.isEnabled();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi! - hi!" + "'", str9, "hi! - hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str11, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test22084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22084");
        room.Room room4 = new room.Room("hi!", (int) (byte) 100, "", "Room hi! | hi! - hi! | Capacity: 0");
        java.lang.String str5 = room4.getRoomNumber();
        room4.notifyObservers();
        room4.setOccupied(true);
        java.lang.String str9 = room4.getScannedID();
        java.lang.String str10 = room4.getBuildingName();
        room4.setUnderMaintenance(false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str5, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test22085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22085");
        room.Room room4 = new room.Room("Room Room hi! | hi! - hi! | Capacity: 0 | Room hi! | hi! - hi! | Capacity: 0 - hi! - hi! | Capacity: 100", (-1), "", "hi! - hi! - Room hi! | hi! - hi! | Capacity: 0");
        room4.setUnderMaintenance(true);
        java.lang.String str7 = room4.toString();
        boolean boolean8 = room4.isEnabled();
        int int9 = room4.getCapacity();
        room4.setOccupied(false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Room Room Room hi! | hi! - hi! | Capacity: 0 | Room hi! | hi! - hi! | Capacity: 0 - hi! - hi! | Capacity: 100 |  - hi! - hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: -1" + "'", str7, "Room Room Room hi! | hi! - hi! | Capacity: 0 | Room hi! | hi! - hi! | Capacity: 0 - hi! - hi! | Capacity: 100 |  - hi! - hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: -1");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test22086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22086");
        room.Room room4 = new room.Room("Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10", (int) 'a', "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10", "Room hi! | hi! - hi! | Capacity: 0");
        int int5 = room4.getCapacity();
        room.SensorObserver sensorObserver6 = null;
        room4.removeObserver(sensorObserver6);
        room.SensorObserver sensorObserver8 = null;
        room4.removeObserver(sensorObserver8);
        boolean boolean10 = room4.isOccupied();
        java.lang.String str11 = room4.getScannedID();
        boolean boolean12 = room4.isUnderMaintenance();
        boolean boolean13 = room4.isEnabled();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test22087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22087");
        room.Room room4 = new room.Room(" - Room hi! | hi! - hi! | Capacity: 0", 0, "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10", "Room hi! | hi! - hi! | Capacity: 0 - hi! - ");
        java.lang.String str5 = room4.toString();
        boolean boolean6 = room4.isEnabled();
        java.lang.String str7 = room4.getRoomID();
        room4.setEnabled(true);
        boolean boolean10 = room4.isUnderMaintenance();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Room  - Room hi! | hi! - hi! | Capacity: 0 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 0" + "'", str5, "Room  - Room hi! | hi! - hi! | Capacity: 0 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 0");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + " - Room hi! | hi! - hi! | Capacity: 0" + "'", str7, " - Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test22088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22088");
        room.Room room4 = new room.Room("Room hi! - hi! - hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 1 | Capacity: 0", 52, "Room  | Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! | Capacity: 1", "Room Room hi! | hi! - hi! | Capacity: 0 | Room hi! | hi! - hi! | Capacity: 0 - hi! - hi! | Capacity: 100");
        boolean boolean5 = room4.isUnderMaintenance();
        boolean boolean6 = room4.isUnderMaintenance();
        java.lang.String str7 = room4.getRoomNumber();
        java.lang.String str8 = room4.getRoomID();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Room Room hi! | hi! - hi! | Capacity: 0 | Room hi! | hi! - hi! | Capacity: 0 - hi! - hi! | Capacity: 100" + "'", str7, "Room Room hi! | hi! - hi! | Capacity: 0 | Room hi! | hi! - hi! | Capacity: 0 - hi! - hi! | Capacity: 100");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Room hi! - hi! - hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 1 | Capacity: 0" + "'", str8, "Room hi! - hi! - hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 1 | Capacity: 0");
    }

    @Test
    public void test22089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22089");
        room.Room room4 = new room.Room("hi! - hi! - Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100", (-1), "Room hi! | hi! - hi! | Capacity: 0 - hi!", " - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi!");
        java.lang.String str5 = room4.getBuildingName();
        java.lang.String str6 = room4.toString();
        room.SensorObserver sensorObserver7 = null;
        room4.removeObserver(sensorObserver7);
        room.SensorObserver sensorObserver9 = null;
        room4.removeObserver(sensorObserver9);
        room4.setEnabled(true);
        boolean boolean13 = room4.isOccupied();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0 - hi!" + "'", str5, "Room hi! | hi! - hi! | Capacity: 0 - hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Room hi! - hi! - Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | Room hi! | hi! - hi! | Capacity: 0 - hi! -  - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! | Capacity: -1" + "'", str6, "Room hi! - hi! - Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | Room hi! | hi! - hi! | Capacity: 0 - hi! -  - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! | Capacity: -1");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test22090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22090");
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
        room4.setOccupied(false);
        room.SensorObserver sensorObserver19 = null;
        room4.removeObserver(sensorObserver19);
        java.lang.String str21 = room4.getScannedID();
        java.lang.String str22 = room4.getScannedID();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str6, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str7, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str8, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str9, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi! - hi!" + "'", str16, "hi! - hi!");
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test22091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22091");
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
        boolean boolean20 = room4.isOccupied();
        java.lang.String str21 = room4.getScannedID();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi! - hi!" + "'", str15, "hi! - hi!");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
    }

    @Test
    public void test22092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22092");
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
        boolean boolean22 = room4.isOccupied();
        java.lang.String str23 = room4.getRoomID();
        room4.notifyObservers();
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str11, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
    }

    @Test
    public void test22093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22093");
        room.Room room4 = new room.Room("", 1, "Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi!", "Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10");
        java.lang.String str5 = room4.getRoomID();
        int int6 = room4.getCapacity();
        java.lang.String str7 = room4.getFullLocation();
        boolean boolean8 = room4.isOccupied();
        room.SensorObserver sensorObserver9 = null;
        room4.removeObserver(sensorObserver9);
        room4.notifyObservers();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10" + "'", str7, "Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test22094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22094");
        room.Room room4 = new room.Room("hi!", (int) (short) 0, "hi! - hi!", "Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100");
        java.lang.String str5 = room4.getScannedID();
        java.lang.String str6 = room4.toString();
        room4.setUnderMaintenance(false);
        java.lang.String str9 = room4.getBuildingName();
        java.lang.String str10 = room4.getRoomNumber();
        room4.setUnderMaintenance(true);
        boolean boolean13 = room4.isOccupied();
        room4.setEnabled(true);
        boolean boolean16 = room4.isOccupied();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Room hi! | hi! - hi! - Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | Capacity: 0" + "'", str6, "Room hi! | hi! - hi! - Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi! - hi!" + "'", str9, "hi! - hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100" + "'", str10, "Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test22095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22095");
        room.Room room4 = new room.Room("Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10", 1, "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10", "hi! - hi!");
        java.lang.String str5 = room4.getRoomNumber();
        java.lang.String str6 = room4.getRoomID();
        room4.notifyObservers();
        room.SensorObserver sensorObserver8 = null;
        room4.addObserver(sensorObserver8);
        java.lang.String str10 = room4.getScannedID();
        boolean boolean11 = room4.isEnabled();
        boolean boolean12 = room4.isEnabled();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi! - hi!" + "'", str5, "hi! - hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10" + "'", str6, "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test22096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22096");
        room.Room room4 = new room.Room("", (int) (short) 10, "Room hi! | hi! - hi! | Capacity: 0", "hi!");
        java.lang.String str5 = room4.toString();
        room4.setUnderMaintenance(true);
        room4.setScannedID("");
        room4.setEnabled(true);
        java.lang.String str12 = room4.getRoomID();
        java.lang.String str13 = room4.getBuildingName();
        java.lang.String str14 = room4.getFullLocation();
        room.SensorObserver sensorObserver15 = null;
        room4.addObserver(sensorObserver15);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10" + "'", str5, "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str13, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0 - hi!" + "'", str14, "Room hi! | hi! - hi! | Capacity: 0 - hi!");
    }

    @Test
    public void test22097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22097");
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
        int int14 = room4.getCapacity();
        int int15 = room4.getCapacity();
        java.lang.String str16 = room4.getRoomID();
        java.lang.String str17 = room4.getBuildingName();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi! - hi!" + "'", str7, "hi! - hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test22098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22098");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        boolean boolean5 = room4.isOccupied();
        java.lang.String str6 = room4.toString();
        java.lang.String str7 = room4.toString();
        room4.setOccupied(false);
        room.SensorObserver sensorObserver10 = null;
        room4.removeObserver(sensorObserver10);
        room4.setUnderMaintenance(true);
        java.lang.String str14 = room4.getRoomNumber();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str6, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str7, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test22099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22099");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        java.lang.String str5 = room4.getScannedID();
        room4.setScannedID("hi!");
        java.lang.String str8 = room4.getBuildingName();
        int int9 = room4.getCapacity();
        room4.setOccupied(false);
        java.lang.String str12 = room4.getRoomID();
        java.lang.String str13 = room4.getFullLocation();
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
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi! - hi!" + "'", str13, "hi! - hi!");
    }

    @Test
    public void test22100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22100");
        room.Room room4 = new room.Room("hi!", (int) (byte) 100, "", "Room hi! | hi! - hi! | Capacity: 0");
        java.lang.String str5 = room4.getRoomNumber();
        room4.notifyObservers();
        room4.setOccupied(true);
        room4.notifyObservers();
        room4.setScannedID("Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi!");
        java.lang.String str12 = room4.getRoomID();
        java.lang.String str13 = room4.getScannedID();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str5, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi!" + "'", str13, "Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi!");
    }

    @Test
    public void test22101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22101");
        room.Room room4 = new room.Room("hi! - hi! - Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 97 - Room Room hi! | hi! - hi! | Capacity: 0 - hi! - hi! |  - Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | hi! - hi! - hi! | Capacity: 0 | Capacity: 52", (int) '#', "Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 100 | hi! - hi! - hi! - hi! | Capacity: 0 - ", "Room hi! | Room hi! | hi! - hi! | Capacity: 0 - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 32");
        boolean boolean5 = room4.isOccupied();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test22102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22102");
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
        room4.setScannedID("Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 | hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 0");
        room4.setOccupied(false);
        java.lang.String str20 = room4.toString();
        java.lang.Class<?> wildcardClass21 = room4.getClass();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + " - Room hi! | hi! - hi! | Capacity: 0" + "'", str13, " - Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100" + "'", str20, "Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test22103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22103");
        room.Room room4 = new room.Room("Room Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 100", 32, "Room Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 100", "Room Room hi! | hi! - hi! | Capacity: 0 |  - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 0");
        java.lang.String str5 = room4.toString();
        java.lang.String str6 = room4.toString();
        java.lang.String str7 = room4.getBuildingName();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Room Room Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 100 | Room Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 100 - Room Room hi! | hi! - hi! | Capacity: 0 |  - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 0 | Capacity: 32" + "'", str5, "Room Room Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 100 | Room Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 100 - Room Room hi! | hi! - hi! | Capacity: 0 |  - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 0 | Capacity: 32");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Room Room Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 100 | Room Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 100 - Room Room hi! | hi! - hi! | Capacity: 0 |  - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 0 | Capacity: 32" + "'", str6, "Room Room Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 100 | Room Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 100 - Room Room hi! | hi! - hi! | Capacity: 0 |  - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 0 | Capacity: 32");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Room Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 100" + "'", str7, "Room Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 100");
    }

    @Test
    public void test22104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22104");
        room.Room room4 = new room.Room("", (int) (byte) 1, "Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10", "hi!");
        boolean boolean5 = room4.isEnabled();
        java.lang.String str6 = room4.getFullLocation();
        room4.setOccupied(false);
        java.lang.String str9 = room4.toString();
        java.lang.String str10 = room4.getFullLocation();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi!" + "'", str6, "Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Room  | Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! | Capacity: 1" + "'", str9, "Room  | Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! | Capacity: 1");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi!" + "'", str10, "Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi!");
    }

    @Test
    public void test22105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22105");
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
        int int19 = room4.getCapacity();
        boolean boolean20 = room4.isEnabled();
        boolean boolean21 = room4.isUnderMaintenance();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str7, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test22106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22106");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        java.lang.String str5 = room4.getScannedID();
        room4.setScannedID("hi!");
        java.lang.String str8 = room4.getRoomID();
        room4.setScannedID("hi! - hi!");
        java.lang.String str11 = room4.getScannedID();
        int int12 = room4.getCapacity();
        room4.setScannedID("Room hi! | hi! - hi! | Capacity: 0");
        boolean boolean15 = room4.isOccupied();
        java.lang.String str16 = room4.getRoomID();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi! - hi!" + "'", str11, "hi! - hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test22107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22107");
        room.Room room4 = new room.Room("hi!", (int) (byte) 100, "", "Room hi! | hi! - hi! | Capacity: 0");
        java.lang.String str5 = room4.getScannedID();
        java.lang.String str6 = room4.getBuildingName();
        room4.setUnderMaintenance(false);
        room4.setEnabled(false);
        java.lang.String str11 = room4.getRoomNumber();
        boolean boolean12 = room4.isUnderMaintenance();
        room4.setEnabled(true);
        room4.setOccupied(false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str11, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test22108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22108");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        java.lang.String str5 = room4.getScannedID();
        room4.setScannedID("hi!");
        room4.setUnderMaintenance(true);
        java.lang.String str10 = room4.getScannedID();
        boolean boolean11 = room4.isOccupied();
        room4.notifyObservers();
        room4.setScannedID("Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 | hi! - Room hi! | hi! - hi! | Capacity: 0 -  | Capacity: 52");
        room.SensorObserver sensorObserver15 = null;
        room4.addObserver(sensorObserver15);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test22109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22109");
        room.Room room4 = new room.Room("Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10", (int) 'a', "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10", "Room hi! | hi! - hi! | Capacity: 0");
        boolean boolean5 = room4.isOccupied();
        room4.setUnderMaintenance(false);
        room.SensorObserver sensorObserver8 = null;
        room4.addObserver(sensorObserver8);
        boolean boolean10 = room4.isEnabled();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test22110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22110");
        room.Room room4 = new room.Room("Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100", 0, "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi!", "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10");
        java.lang.String str5 = room4.getBuildingName();
        boolean boolean6 = room4.isEnabled();
        room4.setEnabled(false);
        room.SensorObserver sensorObserver9 = null;
        room4.removeObserver(sensorObserver9);
        boolean boolean11 = room4.isEnabled();
        java.lang.String str12 = room4.getRoomID();
        java.lang.String str13 = room4.getFullLocation();
        boolean boolean14 = room4.isUnderMaintenance();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi!" + "'", str5, "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100" + "'", str12, "Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10" + "'", str13, "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test22111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22111");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        room.SensorObserver sensorObserver5 = null;
        room4.addObserver(sensorObserver5);
        java.lang.String str7 = room4.toString();
        room.SensorObserver sensorObserver8 = null;
        room4.removeObserver(sensorObserver8);
        java.lang.String str10 = room4.toString();
        java.lang.String str11 = room4.getRoomNumber();
        room4.setUnderMaintenance(true);
        java.lang.String str14 = room4.getScannedID();
        boolean boolean15 = room4.isUnderMaintenance();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str7, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str10, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test22112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22112");
        room.Room room4 = new room.Room("Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100", (int) (short) 1, "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi!", "Room hi! | hi! - hi! | Capacity: 0");
        room4.notifyObservers();
        room4.setEnabled(false);
        room4.setOccupied(false);
        room4.setOccupied(false);
        java.lang.String str12 = room4.getRoomID();
        boolean boolean13 = room4.isOccupied();
        java.lang.String str14 = room4.getBuildingName();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100" + "'", str12, "Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi!" + "'", str14, "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi!");
    }

    @Test
    public void test22113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22113");
        room.Room room4 = new room.Room("", (int) (short) 10, "Room hi! | hi! - hi! | Capacity: 0", "hi!");
        java.lang.String str5 = room4.toString();
        java.lang.String str6 = room4.getBuildingName();
        room.SensorObserver sensorObserver7 = null;
        room4.removeObserver(sensorObserver7);
        boolean boolean9 = room4.isEnabled();
        java.lang.String str10 = room4.getBuildingName();
        java.lang.String str11 = room4.getFullLocation();
        java.lang.String str12 = room4.getRoomID();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10" + "'", str5, "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str6, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str10, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0 - hi!" + "'", str11, "Room hi! | hi! - hi! | Capacity: 0 - hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test22114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22114");
        room.Room room4 = new room.Room("hi!", (int) (byte) 100, "", "Room hi! | hi! - hi! | Capacity: 0");
        room4.setScannedID("");
        boolean boolean7 = room4.isOccupied();
        room4.setOccupied(true);
        boolean boolean10 = room4.isEnabled();
        boolean boolean11 = room4.isEnabled();
        java.lang.String str12 = room4.getScannedID();
        boolean boolean13 = room4.isOccupied();
        boolean boolean14 = room4.isUnderMaintenance();
        java.lang.String str15 = room4.getBuildingName();
        room4.setScannedID(" - Room hi! | hi! - hi! | Capacity: 0 - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test22115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22115");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        boolean boolean5 = room4.isOccupied();
        room4.setEnabled(false);
        java.lang.String str8 = room4.getFullLocation();
        room4.setOccupied(false);
        java.lang.String str11 = room4.getFullLocation();
        int int12 = room4.getCapacity();
        int int13 = room4.getCapacity();
        java.lang.String str14 = room4.toString();
        room4.setOccupied(false);
        java.lang.String str17 = room4.getBuildingName();
        java.lang.String str18 = room4.getBuildingName();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi! - hi!" + "'", str8, "hi! - hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi! - hi!" + "'", str11, "hi! - hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str14, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test22116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22116");
        room.Room room4 = new room.Room("", (int) (byte) 1, "Room hi! | hi! - hi! | Capacity: 0 - hi! - hi!", "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10");
        boolean boolean5 = room4.isUnderMaintenance();
        java.lang.String str6 = room4.getRoomNumber();
        java.lang.String str7 = room4.getRoomID();
        java.lang.String str8 = room4.getBuildingName();
        java.lang.Class<?> wildcardClass9 = room4.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10" + "'", str6, "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0 - hi! - hi!" + "'", str8, "Room hi! | hi! - hi! | Capacity: 0 - hi! - hi!");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test22117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22117");
        room.Room room4 = new room.Room("hi! - hi! - Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100", (int) '4', "Room  - Room hi! | hi! - hi! | Capacity: 0 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 0 - hi!", "Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | Room hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 1 - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! | Capacity: 97");
        java.lang.String str5 = room4.getRoomID();
        room.SensorObserver sensorObserver6 = null;
        room4.addObserver(sensorObserver6);
        boolean boolean8 = room4.isEnabled();
        java.lang.String str9 = room4.getScannedID();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi! - hi! - Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100" + "'", str5, "hi! - hi! - Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test22118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22118");
        room.Room room4 = new room.Room("", (int) (short) 10, "Room hi! | hi! - hi! | Capacity: 0", "hi!");
        java.lang.String str5 = room4.toString();
        room4.setUnderMaintenance(true);
        room4.setScannedID("");
        room4.setEnabled(true);
        java.lang.String str12 = room4.getRoomID();
        java.lang.String str13 = room4.getScannedID();
        boolean boolean14 = room4.isEnabled();
        room4.setUnderMaintenance(false);
        int int17 = room4.getCapacity();
        room4.notifyObservers();
        boolean boolean19 = room4.isEnabled();
        room4.setUnderMaintenance(false);
        java.lang.String str22 = room4.getScannedID();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10" + "'", str5, "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test22119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22119");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        java.lang.String str5 = room4.getScannedID();
        room4.setScannedID("hi!");
        room4.setUnderMaintenance(true);
        room4.setOccupied(true);
        room4.setOccupied(false);
        room.SensorObserver sensorObserver14 = null;
        room4.addObserver(sensorObserver14);
        java.lang.String str16 = room4.toString();
        room.SensorObserver sensorObserver17 = null;
        room4.addObserver(sensorObserver17);
        boolean boolean19 = room4.isUnderMaintenance();
        java.lang.String str20 = room4.toString();
        java.lang.String str21 = room4.getBuildingName();
        // The following exception was thrown during execution in test generation
        try {
            room4.notifyObservers();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str16, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str20, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
    }

    @Test
    public void test22120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22120");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        java.lang.String str5 = room4.getScannedID();
        room4.setScannedID("hi!");
        boolean boolean8 = room4.isEnabled();
        java.lang.String str9 = room4.getBuildingName();
        room4.setEnabled(false);
        room4.setUnderMaintenance(true);
        java.lang.String str14 = room4.getFullLocation();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi! - hi!" + "'", str14, "hi! - hi!");
    }

    @Test
    public void test22121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22121");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        boolean boolean5 = room4.isOccupied();
        java.lang.String str6 = room4.toString();
        java.lang.String str7 = room4.toString();
        java.lang.String str8 = room4.toString();
        boolean boolean9 = room4.isUnderMaintenance();
        room4.notifyObservers();
        room4.setEnabled(false);
        java.lang.String str13 = room4.getFullLocation();
        java.lang.String str14 = room4.getScannedID();
        java.lang.String str15 = room4.getBuildingName();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str6, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str7, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str8, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi! - hi!" + "'", str13, "hi! - hi!");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test22122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22122");
        room.Room room4 = new room.Room("hi!", (int) (byte) 100, "", "Room hi! | hi! - hi! | Capacity: 0");
        java.lang.String str5 = room4.getScannedID();
        java.lang.String str6 = room4.getBuildingName();
        room4.setScannedID("Room hi! | hi! - hi! | Capacity: 0");
        java.lang.String str9 = room4.getRoomID();
        java.lang.String str10 = room4.getScannedID();
        room.SensorObserver sensorObserver11 = null;
        room4.removeObserver(sensorObserver11);
        java.lang.Class<?> wildcardClass13 = room4.getClass();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str10, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test22123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22123");
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
        java.lang.String str16 = room4.getFullLocation();
        room4.setScannedID("Room  - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! | Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 -  | Capacity: 100");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str11, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi! - hi!" + "'", str16, "hi! - hi!");
    }

    @Test
    public void test22124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22124");
        room.Room room4 = new room.Room("hi!", (int) (byte) 100, "", "Room hi! | hi! - hi! | Capacity: 0");
        java.lang.String str5 = room4.getBuildingName();
        java.lang.String str6 = room4.toString();
        java.lang.String str7 = room4.getRoomNumber();
        java.lang.String str8 = room4.getFullLocation();
        java.lang.String str9 = room4.getBuildingName();
        boolean boolean10 = room4.isOccupied();
        int int11 = room4.getCapacity();
        java.lang.String str12 = room4.toString();
        boolean boolean13 = room4.isEnabled();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100" + "'", str6, "Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str7, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + " - Room hi! | hi! - hi! | Capacity: 0" + "'", str8, " - Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100" + "'", str12, "Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test22125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22125");
        room.Room room4 = new room.Room("Room hi! | hi! - hi! | Capacity: 0", (int) (byte) 10, "hi!", "");
        room4.setUnderMaintenance(true);
        java.lang.String str7 = room4.toString();
        room4.notifyObservers();
        room4.setScannedID("hi! - hi!");
        room4.setOccupied(false);
        int int13 = room4.getCapacity();
        java.lang.String str14 = room4.getScannedID();
        boolean boolean15 = room4.isUnderMaintenance();
        room4.setUnderMaintenance(true);
        int int18 = room4.getCapacity();
        int int19 = room4.getCapacity();
        java.lang.String str20 = room4.getRoomID();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10" + "'", str7, "Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi! - hi!" + "'", str14, "hi! - hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str20, "Room hi! | hi! - hi! | Capacity: 0");
    }

    @Test
    public void test22126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22126");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        java.lang.String str5 = room4.getScannedID();
        room4.setScannedID("hi!");
        room4.setUnderMaintenance(true);
        room4.setOccupied(true);
        java.lang.String str12 = room4.getRoomID();
        room4.setScannedID("Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 100");
        java.lang.String str15 = room4.getRoomID();
        room.SensorObserver sensorObserver16 = null;
        room4.removeObserver(sensorObserver16);
        java.lang.String str18 = room4.getRoomNumber();
        int int19 = room4.getCapacity();
        boolean boolean20 = room4.isOccupied();
        room4.setUnderMaintenance(false);
        room.SensorObserver sensorObserver23 = null;
        room4.removeObserver(sensorObserver23);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test22127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22127");
        room.Room room4 = new room.Room("hi! - hi! - hi! - Room hi! | hi! - hi! | Capacity: 0 - Room Room hi! | hi! - hi! | Capacity: 0 |  - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 0", 35, "Room Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 100 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 -  - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! | Capacity: 0 | Room  - Room hi! | hi! - hi! | Capacity: 0 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 0 -  | Capacity: -1", "Room Room  - Room hi! | hi! - hi! | Capacity: 0 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 0 -  | Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! | Capacity: 32");
        room4.setEnabled(true);
    }

    @Test
    public void test22128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22128");
        room.Room room4 = new room.Room("hi! - hi! - Room hi! | hi! - hi! | Capacity: 0", 10, "hi! - hi!", "Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 97");
        room4.setScannedID("Room hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 1");
        boolean boolean7 = room4.isOccupied();
        room4.setEnabled(false);
        room4.notifyObservers();
        room4.setScannedID("Room Room hi! | hi! - hi! | Capacity: 0 - hi! |  - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 | Capacity: 1");
        boolean boolean13 = room4.isOccupied();
        room4.setScannedID("Room Room hi! - hi! - Room hi! | hi! - hi! | Capacity: 0 | hi! - hi! - Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 97 | Capacity: 10 | Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - Room Room hi! | hi! - hi! | Capacity: 0 | Room hi! | hi! - hi! | Capacity: 0 - hi! - hi! | Capacity: 100 | Capacity: 52 - Room hi! | hi! - hi! | Capacity: 0 - hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 |  - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 0");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test22129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22129");
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
        java.lang.Class<?> wildcardClass15 = room4.getClass();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str11, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test22130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22130");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        java.lang.String str5 = room4.getScannedID();
        room4.setScannedID("hi!");
        room4.setUnderMaintenance(true);
        room4.setOccupied(true);
        room4.setScannedID("Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100");
        boolean boolean14 = room4.isUnderMaintenance();
        boolean boolean15 = room4.isUnderMaintenance();
        java.lang.String str16 = room4.getFullLocation();
        java.lang.String str17 = room4.getFullLocation();
        java.lang.String str18 = room4.toString();
        room.SensorObserver sensorObserver19 = null;
        room4.removeObserver(sensorObserver19);
        java.lang.String str21 = room4.getRoomNumber();
        room4.setEnabled(false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi! - hi!" + "'", str16, "hi! - hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi! - hi!" + "'", str17, "hi! - hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str18, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
    }

    @Test
    public void test22131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22131");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        room.SensorObserver sensorObserver5 = null;
        room4.addObserver(sensorObserver5);
        java.lang.String str7 = room4.toString();
        java.lang.String str8 = room4.toString();
        java.lang.String str9 = room4.getBuildingName();
        java.lang.String str10 = room4.getFullLocation();
        room.SensorObserver sensorObserver11 = null;
        room4.removeObserver(sensorObserver11);
        boolean boolean13 = room4.isEnabled();
        room4.setUnderMaintenance(false);
        room4.setUnderMaintenance(true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str7, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str8, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi! - hi!" + "'", str10, "hi! - hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test22132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22132");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        boolean boolean5 = room4.isOccupied();
        room4.setEnabled(false);
        boolean boolean8 = room4.isUnderMaintenance();
        java.lang.String str9 = room4.getFullLocation();
        room4.setUnderMaintenance(false);
        java.lang.String str12 = room4.toString();
        room4.setOccupied(false);
        room.SensorObserver sensorObserver15 = null;
        room4.addObserver(sensorObserver15);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi! - hi!" + "'", str9, "hi! - hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str12, "Room hi! | hi! - hi! | Capacity: 0");
    }

    @Test
    public void test22133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22133");
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
        boolean boolean17 = room4.isUnderMaintenance();
        boolean boolean18 = room4.isEnabled();
        boolean boolean19 = room4.isEnabled();
        boolean boolean20 = room4.isUnderMaintenance();
        java.lang.String str21 = room4.toString();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi! - hi!" + "'", str11, "hi! - hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str21, "Room hi! | hi! - hi! | Capacity: 0");
    }

    @Test
    public void test22134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22134");
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
        room.SensorObserver sensorObserver17 = null;
        room4.addObserver(sensorObserver17);
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
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test22135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22135");
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
        room4.setUnderMaintenance(true);
        java.lang.String str21 = room4.toString();
        java.lang.String str22 = room4.toString();
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
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str21, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str22, "Room hi! | hi! - hi! | Capacity: 0");
    }

    @Test
    public void test22136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22136");
        room.Room room4 = new room.Room("Room hi! - hi! - hi! | hi! - hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 1 - Room Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! - hi! - hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: -1 - Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 | hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 0", 0, "Room hi! | hi! - hi! | Capacity: 0", "");
        java.lang.String str5 = room4.toString();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Room Room hi! - hi! - hi! | hi! - hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 1 - Room Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! - hi! - hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: -1 - Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 | hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 0 | Room hi! | hi! - hi! | Capacity: 0 -  | Capacity: 0" + "'", str5, "Room Room hi! - hi! - hi! | hi! - hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 1 - Room Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! - hi! - hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: -1 - Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 | hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 0 | Room hi! | hi! - hi! | Capacity: 0 -  | Capacity: 0");
    }

    @Test
    public void test22137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22137");
        room.Room room4 = new room.Room("Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100", (int) 'a', "hi! - hi!", "Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10");
        int int5 = room4.getCapacity();
        room4.setScannedID("");
        java.lang.String str8 = room4.getScannedID();
        java.lang.String str9 = room4.getFullLocation();
        java.lang.String str10 = room4.getFullLocation();
        java.lang.String str11 = room4.getRoomID();
        int int12 = room4.getCapacity();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10" + "'", str9, "hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10" + "'", str10, "hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100" + "'", str11, "Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
    }

    @Test
    public void test22138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22138");
        room.Room room4 = new room.Room("Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 100 - Room hi! | hi! - hi! | Capacity: 0 - hi! - ", (int) (byte) 100, "Room Room Room hi! | hi! - hi! | Capacity: 0 |  - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 0 |  - Room Room hi! - hi! - Room hi! | hi! - hi! | Capacity: 0 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 100 | Capacity: 10 | Room hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 1 - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | Capacity: 0", "Room  |  - hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! - Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 100 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 -  - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! | Capacity: 0 - Room Room hi! | hi! - hi! | Capacity: 0 - hi! - hi! | Room Room hi! | hi! - hi! | Capacity: 0 | Room hi! | hi! - hi! | Capacity: 0 - hi! - hi! | Capacity: 100 - Room  - Room hi! | hi! - hi! | Capacity: 0 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 0 | Capacity: 10 | Capacity: 97");
    }

    @Test
    public void test22139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22139");
        room.Room room4 = new room.Room(" - Room hi! | hi! - hi! | Capacity: 0", 10, "Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi!", "");
        java.lang.String str5 = room4.getFullLocation();
        java.lang.String str6 = room4.toString();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! - " + "'", str5, "Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! - ");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Room  - Room hi! | hi! - hi! | Capacity: 0 | Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! -  | Capacity: 10" + "'", str6, "Room  - Room hi! | hi! - hi! | Capacity: 0 | Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! -  | Capacity: 10");
    }

    @Test
    public void test22140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22140");
        room.Room room4 = new room.Room("Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100", 10, "hi! - ", "Room  - Room hi! | hi! - hi! | Capacity: 0 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 0");
        java.lang.String str5 = room4.toString();
        java.lang.String str6 = room4.getRoomID();
        java.lang.String str7 = room4.getRoomID();
        java.lang.String str8 = room4.toString();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | hi! -  - Room  - Room hi! | hi! - hi! | Capacity: 0 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 0 | Capacity: 10" + "'", str5, "Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | hi! -  - Room  - Room hi! | hi! - hi! | Capacity: 0 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 0 | Capacity: 10");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100" + "'", str6, "Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100" + "'", str7, "Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | hi! -  - Room  - Room hi! | hi! - hi! | Capacity: 0 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 0 | Capacity: 10" + "'", str8, "Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | hi! -  - Room  - Room hi! | hi! - hi! | Capacity: 0 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 0 | Capacity: 10");
    }

    @Test
    public void test22141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22141");
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
        java.lang.String str21 = room4.getScannedID();
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
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test22142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22142");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        boolean boolean5 = room4.isOccupied();
        room4.setEnabled(false);
        java.lang.String str8 = room4.getFullLocation();
        room4.setOccupied(false);
        java.lang.String str11 = room4.getFullLocation();
        room4.notifyObservers();
        java.lang.String str13 = room4.getBuildingName();
        java.lang.String str14 = room4.getFullLocation();
        java.lang.Class<?> wildcardClass15 = room4.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi! - hi!" + "'", str8, "hi! - hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi! - hi!" + "'", str11, "hi! - hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi! - hi!" + "'", str14, "hi! - hi!");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test22143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22143");
        room.Room room4 = new room.Room("Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10", 1, "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10", "hi! - hi!");
        java.lang.String str5 = room4.getRoomNumber();
        java.lang.String str6 = room4.getRoomID();
        room4.setEnabled(true);
        room4.notifyObservers();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi! - hi!" + "'", str5, "hi! - hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10" + "'", str6, "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10");
    }

    @Test
    public void test22144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22144");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        room.SensorObserver sensorObserver5 = null;
        room4.addObserver(sensorObserver5);
        java.lang.String str7 = room4.toString();
        room.SensorObserver sensorObserver8 = null;
        room4.removeObserver(sensorObserver8);
        java.lang.String str10 = room4.toString();
        java.lang.String str11 = room4.getRoomNumber();
        room.SensorObserver sensorObserver12 = null;
        room4.addObserver(sensorObserver12);
        java.lang.String str14 = room4.toString();
        int int15 = room4.getCapacity();
        java.lang.String str16 = room4.toString();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str7, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str10, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str14, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str16, "Room hi! | hi! - hi! | Capacity: 0");
    }

    @Test
    public void test22145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22145");
        room.Room room4 = new room.Room("hi! - hi!", (int) (short) 1, "hi! - hi!", "");
        java.lang.String str5 = room4.getScannedID();
        boolean boolean6 = room4.isUnderMaintenance();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test22146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22146");
        room.Room room4 = new room.Room("Room  - Room hi! | hi! - hi! | Capacity: 0 | Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 97 - hi! - hi! | Capacity: 32", (int) (short) 1, "Room Room hi! | hi! - hi! | Capacity: 0 - hi! | Room hi! | Room hi! | hi! - hi! | Capacity: 0 - hi! - Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 1 - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 32", "Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 |  - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! | Capacity: 1");
        room.SensorObserver sensorObserver5 = null;
        room4.removeObserver(sensorObserver5);
    }

    @Test
    public void test22147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22147");
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
        room4.setOccupied(true);
        room4.notifyObservers();
        room4.setEnabled(true);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str11, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str13, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test22148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22148");
        room.Room room4 = new room.Room(" - Room hi! | hi! - hi! | Capacity: 0", 0, "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10", "Room hi! | hi! - hi! | Capacity: 0 - hi! - ");
        java.lang.String str5 = room4.toString();
        boolean boolean6 = room4.isEnabled();
        java.lang.String str7 = room4.getRoomID();
        java.lang.String str8 = room4.getRoomNumber();
        boolean boolean9 = room4.isUnderMaintenance();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Room  - Room hi! | hi! - hi! | Capacity: 0 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 0" + "'", str5, "Room  - Room hi! | hi! - hi! | Capacity: 0 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 0");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + " - Room hi! | hi! - hi! | Capacity: 0" + "'", str7, " - Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0 - hi! - " + "'", str8, "Room hi! | hi! - hi! | Capacity: 0 - hi! - ");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test22149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22149");
        room.Room room4 = new room.Room("", (int) (short) 100, "Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! - hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 97 | Capacity: 32 | Room Room hi! | hi! - hi! | Capacity: 0 | Room hi! | hi! - hi! | Capacity: 0 - hi! - hi! | Capacity: 100 - hi! - hi! - Room hi! | hi! - hi! | Capacity: 0 - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 1 - Room Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! | Room  - Room hi! | hi! - hi! | Capacity: 0 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 0 - Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 97 | Capacity: 0 | Capacity: 0", "");
        java.lang.String str5 = room4.getBuildingName();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! - hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 97 | Capacity: 32 | Room Room hi! | hi! - hi! | Capacity: 0 | Room hi! | hi! - hi! | Capacity: 0 - hi! - hi! | Capacity: 100 - hi! - hi! - Room hi! | hi! - hi! | Capacity: 0 - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 1 - Room Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! | Room  - Room hi! | hi! - hi! | Capacity: 0 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 0 - Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 97 | Capacity: 0 | Capacity: 0" + "'", str5, "Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! - hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 97 | Capacity: 32 | Room Room hi! | hi! - hi! | Capacity: 0 | Room hi! | hi! - hi! | Capacity: 0 - hi! - hi! | Capacity: 100 - hi! - hi! - Room hi! | hi! - hi! | Capacity: 0 - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 1 - Room Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! | Room  - Room hi! | hi! - hi! | Capacity: 0 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 0 - Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 97 | Capacity: 0 | Capacity: 0");
    }

    @Test
    public void test22150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22150");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        java.lang.String str5 = room4.getScannedID();
        room4.setScannedID("hi!");
        room4.setScannedID("hi! - hi!");
        int int10 = room4.getCapacity();
        boolean boolean11 = room4.isOccupied();
        room4.notifyObservers();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test22151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22151");
        room.Room room4 = new room.Room("Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi!", (int) (byte) 100, "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10", "hi! - hi! - hi!");
        boolean boolean5 = room4.isUnderMaintenance();
        room4.setUnderMaintenance(false);
        room4.notifyObservers();
        boolean boolean9 = room4.isUnderMaintenance();
        java.lang.String str10 = room4.toString();
        room.SensorObserver sensorObserver11 = null;
        room4.removeObserver(sensorObserver11);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Room Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - hi! - hi! | Capacity: 100" + "'", str10, "Room Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - hi! - hi! | Capacity: 100");
    }

    @Test
    public void test22152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22152");
        room.Room room4 = new room.Room("Room Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! -  -  - Room hi! | hi! - hi! | Capacity: 0 | Room  - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 100 | hi! - hi! - hi! - hi! | Capacity: 0 | Capacity: 0 - Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 1 | Capacity: 10", 52, "Room Room  - Room hi! | hi! - hi! | Capacity: 0 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 0 - hi! | Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 | hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 0 - hi! - hi! - Room hi! | hi! - hi! | Capacity: 0 - Room hi! - hi! - hi! | hi! - hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 1 | Capacity: -1", "Room hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 1 - Room hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 1");
    }

    @Test
    public void test22153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22153");
        room.Room room4 = new room.Room("Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 | hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 0 - Room hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 1", (int) (byte) 10, "Room Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! - hi! - hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: -1 - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10", "Room Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! -  | hi! - Room hi! | hi! - hi! | Capacity: 0 - Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 100 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: -1 | Capacity: 100");
        java.lang.Class<?> wildcardClass5 = room4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test22154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22154");
        room.Room room4 = new room.Room("Room hi! - Room hi! | hi! - hi! | Capacity: 0 | Room Room hi! | hi! - hi! | Capacity: 0 - hi! | Room Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! - hi! - hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: -1 - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 | Capacity: 10 - Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | hi! - hi! - hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 0 | Capacity: -1", (int) (byte) 10, "Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 1 - Room hi! | hi! - hi! | Capacity: 0 - hi!", "Room Room Room hi! | hi! - hi! | Capacity: 0 | hi! - hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 97 | hi! -  - Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 1 - Room Room hi! | hi! - hi! | Capacity: 0 - hi! | Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 100 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: -1 - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: -1 | Capacity: 100");
    }

    @Test
    public void test22155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22155");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        boolean boolean5 = room4.isOccupied();
        boolean boolean6 = room4.isEnabled();
        java.lang.String str7 = room4.getRoomID();
        java.lang.String str8 = room4.getBuildingName();
        boolean boolean9 = room4.isEnabled();
        java.lang.String str10 = room4.getRoomNumber();
        room4.setUnderMaintenance(false);
        java.lang.String str13 = room4.getBuildingName();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test22156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22156");
        room.Room room4 = new room.Room("hi! - hi! - Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100", (-1), "Room hi! | hi! - hi! | Capacity: 0 - hi!", " - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi!");
        java.lang.String str5 = room4.getBuildingName();
        room4.setScannedID("Room hi! - hi! | Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 10");
        room4.setUnderMaintenance(true);
        java.lang.String str10 = room4.getScannedID();
        room4.setEnabled(true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0 - hi!" + "'", str5, "Room hi! | hi! - hi! | Capacity: 0 - hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Room hi! - hi! | Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 10" + "'", str10, "Room hi! - hi! | Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 10");
    }

    @Test
    public void test22157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22157");
        room.Room room4 = new room.Room("Room hi! | hi! - hi! | Capacity: 0 - hi! -  - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10", 97, " - Room hi! | hi! - hi! - Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | Capacity: 0 -  - hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10", "Room hi! | hi! - hi! | Capacity: 0 - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! - hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 97 - Room hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 1 - Room hi! | hi! - hi! - Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | Capacity: 0");
    }

    @Test
    public void test22158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22158");
        room.Room room4 = new room.Room("Room  - Room hi! | hi! - hi! | Capacity: 0 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 0", (int) (short) 0, "hi! - hi! - Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100", " - hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10");
        java.lang.String str5 = room4.getBuildingName();
        room4.setUnderMaintenance(true);
        room4.setUnderMaintenance(false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi! - hi! - Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100" + "'", str5, "hi! - hi! - Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100");
    }

    @Test
    public void test22159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22159");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        java.lang.String str5 = room4.getScannedID();
        room4.setScannedID("hi!");
        boolean boolean8 = room4.isEnabled();
        int int9 = room4.getCapacity();
        java.lang.String str10 = room4.getRoomID();
        java.lang.String str11 = room4.toString();
        room4.setScannedID(" - Room hi! | hi! - hi! | Capacity: 0");
        java.lang.String str14 = room4.toString();
        int int15 = room4.getCapacity();
        room.SensorObserver sensorObserver16 = null;
        room4.removeObserver(sensorObserver16);
        room.SensorObserver sensorObserver18 = null;
        room4.removeObserver(sensorObserver18);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str11, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str14, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test22160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22160");
        room.Room room4 = new room.Room("hi!", (int) (byte) 100, "", "Room hi! | hi! - hi! | Capacity: 0");
        java.lang.String str5 = room4.getScannedID();
        java.lang.String str6 = room4.toString();
        boolean boolean7 = room4.isEnabled();
        room4.setUnderMaintenance(false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100" + "'", str6, "Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test22161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22161");
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
        java.lang.String str16 = room4.getScannedID();
        java.lang.String str17 = room4.getScannedID();
        room4.setOccupied(false);
        java.lang.String str20 = room4.getFullLocation();
        room4.setScannedID("Room hi! - hi! - hi! | Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | hi! - hi! - hi! | Capacity: 0 - Room hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 1 - Room hi! | hi! - hi! - Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | Capacity: 0 | Capacity: 0");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str11, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi! - hi!" + "'", str14, "hi! - hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str15, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi! - hi!" + "'", str20, "hi! - hi!");
    }

    @Test
    public void test22162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22162");
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
        boolean boolean14 = room4.isOccupied();
        room.SensorObserver sensorObserver15 = null;
        room4.removeObserver(sensorObserver15);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str7, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test22163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22163");
        room.Room room4 = new room.Room("", 1, "Room  - Room hi! | hi! - hi! | Capacity: 0 |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 0", "hi! - hi! - Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100");
        int int5 = room4.getCapacity();
        room4.notifyObservers();
        room.SensorObserver sensorObserver7 = null;
        room4.addObserver(sensorObserver7);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test22164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22164");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        room.SensorObserver sensorObserver5 = null;
        room4.addObserver(sensorObserver5);
        java.lang.String str7 = room4.toString();
        java.lang.String str8 = room4.toString();
        java.lang.String str9 = room4.getBuildingName();
        int int10 = room4.getCapacity();
        java.lang.String str11 = room4.getFullLocation();
        java.lang.String str12 = room4.getRoomNumber();
        boolean boolean13 = room4.isEnabled();
        boolean boolean14 = room4.isUnderMaintenance();
        room.SensorObserver sensorObserver15 = null;
        room4.removeObserver(sensorObserver15);
        room4.setUnderMaintenance(false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str7, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str8, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi! - hi!" + "'", str11, "hi! - hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test22165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22165");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        java.lang.String str5 = room4.toString();
        java.lang.String str6 = room4.getScannedID();
        room4.setOccupied(true);
        room4.setEnabled(false);
        room4.setScannedID("Room Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! |  - Room hi! | hi! - hi! | Capacity: 0 - Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: -1");
        room4.setScannedID("Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 1");
        int int15 = room4.getCapacity();
        java.lang.String str16 = room4.getFullLocation();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str5, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi! - hi!" + "'", str16, "hi! - hi!");
    }

    @Test
    public void test22166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22166");
        room.Room room4 = new room.Room("hi!", (int) (byte) 100, "", "Room hi! | hi! - hi! | Capacity: 0");
        room4.setScannedID("");
        boolean boolean7 = room4.isOccupied();
        room4.setOccupied(true);
        boolean boolean10 = room4.isEnabled();
        boolean boolean11 = room4.isEnabled();
        java.lang.String str12 = room4.getScannedID();
        java.lang.String str13 = room4.getFullLocation();
        room4.notifyObservers();
        room4.setUnderMaintenance(true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + " - Room hi! | hi! - hi! | Capacity: 0" + "'", str13, " - Room hi! | hi! - hi! | Capacity: 0");
    }

    @Test
    public void test22167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22167");
        room.Room room4 = new room.Room("Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 97", 0, "Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 100 | hi! - hi! - hi! - hi! | Capacity: 0", " - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi!");
        boolean boolean5 = room4.isUnderMaintenance();
        room4.notifyObservers();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test22168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22168");
        room.Room room4 = new room.Room("hi! - hi! - hi!", (int) (short) 0, "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10", "Room hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 1");
        java.lang.String str5 = room4.toString();
        room4.notifyObservers();
        java.lang.String str7 = room4.getRoomNumber();
        boolean boolean8 = room4.isOccupied();
        java.lang.Class<?> wildcardClass9 = room4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Room hi! - hi! - hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 1 | Capacity: 0" + "'", str5, "Room hi! - hi! - hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 1 | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Room hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 1" + "'", str7, "Room hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 1");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test22169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22169");
        room.Room room4 = new room.Room("Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 100", (int) (short) 100, "Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100", "Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi!");
        boolean boolean5 = room4.isUnderMaintenance();
        java.lang.String str6 = room4.getRoomNumber();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi!" + "'", str6, "Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi!");
    }

    @Test
    public void test22170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22170");
        room.Room room4 = new room.Room("Room Room Room hi! | hi! - hi! | Capacity: 0 |  - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 0 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 1", 10, "hi! - Room  - Room hi! | hi! - hi! | Capacity: 0 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 0 - ", "Room hi! | hi! - hi! - hi! | Capacity: 0");
    }

    @Test
    public void test22171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22171");
        room.Room room4 = new room.Room("Room Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! |  - Room hi! | hi! - hi! | Capacity: 0 - Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: -1 - Room  - Room hi! | hi! - hi! | Capacity: 0 |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 0", 32, "Room hi! | hi! - hi! | Capacity: 0 - hi! -  - Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | Room hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 1 - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! | Capacity: 97", "Room Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 100 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: -1 | Room Room hi! | hi! - hi! | Capacity: 0 | Room hi! | hi! - hi! | Capacity: 0 - hi! - hi! | Capacity: 100 -  | Capacity: 0");
        java.lang.String str5 = room4.getScannedID();
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test22172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22172");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        java.lang.String str5 = room4.getScannedID();
        room4.setScannedID("hi!");
        room4.setUnderMaintenance(true);
        java.lang.String str10 = room4.getScannedID();
        java.lang.String str11 = room4.getFullLocation();
        boolean boolean12 = room4.isUnderMaintenance();
        room4.setEnabled(true);
        java.lang.String str15 = room4.getBuildingName();
        java.lang.String str16 = room4.getFullLocation();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi! - hi!" + "'", str11, "hi! - hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi! - hi!" + "'", str16, "hi! - hi!");
    }

    @Test
    public void test22173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22173");
        room.Room room4 = new room.Room("Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! - Room hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 1", (-1), "Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! - Room Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 97 | Room hi! | hi! - hi! | Capacity: 0 - hi! -  - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 | Capacity: 100", "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 100 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 10");
    }

    @Test
    public void test22174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22174");
        room.Room room4 = new room.Room("Room hi! | hi! - hi! | Capacity: 0", 1, "Room hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 1", "Room hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 1");
        boolean boolean5 = room4.isEnabled();
        java.lang.String str6 = room4.toString();
        boolean boolean7 = room4.isEnabled();
        room.SensorObserver sensorObserver8 = null;
        room4.addObserver(sensorObserver8);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Room Room hi! | hi! - hi! | Capacity: 0 | Room hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 1 - Room hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 1 | Capacity: 1" + "'", str6, "Room Room hi! | hi! - hi! | Capacity: 0 | Room hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 1 - Room hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 1 | Capacity: 1");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test22175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22175");
        room.Room room4 = new room.Room("hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10", (int) (short) 100, "Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi!", "");
        room4.notifyObservers();
    }

    @Test
    public void test22176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22176");
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
        boolean boolean16 = room4.isEnabled();
        java.lang.String str17 = room4.getRoomNumber();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi! - hi!" + "'", str11, "hi! - hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test22177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22177");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        room.SensorObserver sensorObserver5 = null;
        room4.addObserver(sensorObserver5);
        java.lang.String str7 = room4.getScannedID();
        java.lang.String str8 = room4.getFullLocation();
        boolean boolean9 = room4.isOccupied();
        boolean boolean10 = room4.isOccupied();
        room.SensorObserver sensorObserver11 = null;
        room4.removeObserver(sensorObserver11);
        room4.notifyObservers();
        boolean boolean14 = room4.isOccupied();
        room4.setEnabled(true);
        java.lang.String str17 = room4.toString();
        int int18 = room4.getCapacity();
        java.lang.String str19 = room4.getScannedID();
        room4.setOccupied(true);
        java.lang.String str22 = room4.getBuildingName();
        boolean boolean23 = room4.isOccupied();
        room4.setOccupied(true);
        java.lang.String str26 = room4.getRoomNumber();
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi! - hi!" + "'", str8, "hi! - hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str17, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
    }

    @Test
    public void test22178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22178");
        room.Room room4 = new room.Room("Room hi! | hi! - hi! | Capacity: 0", (int) (byte) 10, "hi!", "");
        room4.setUnderMaintenance(true);
        java.lang.String str7 = room4.toString();
        room4.notifyObservers();
        room4.setScannedID("hi! - hi!");
        boolean boolean11 = room4.isOccupied();
        room4.setUnderMaintenance(true);
        java.lang.String str14 = room4.getRoomNumber();
        java.lang.String str15 = room4.getRoomNumber();
        room4.setUnderMaintenance(true);
        room4.setEnabled(false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10" + "'", str7, "Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test22179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22179");
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
        room.SensorObserver sensorObserver21 = null;
        room4.removeObserver(sensorObserver21);
        room.SensorObserver sensorObserver23 = null;
        room4.removeObserver(sensorObserver23);
        room4.setOccupied(true);
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
    }

    @Test
    public void test22180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22180");
        room.Room room4 = new room.Room("Room  - Room hi! | hi! - hi! | Capacity: 0 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 0 - hi!", (int) (short) 10, " - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi!", "Room  - Room hi! | hi! - hi! | Capacity: 0 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 0");
        java.lang.String str5 = room4.toString();
        java.lang.String str6 = room4.getScannedID();
        java.lang.String str7 = room4.getFullLocation();
        boolean boolean8 = room4.isOccupied();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Room Room  - Room hi! | hi! - hi! | Capacity: 0 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 0 - hi! |  - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! - Room  - Room hi! | hi! - hi! | Capacity: 0 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 0 | Capacity: 10" + "'", str5, "Room Room  - Room hi! | hi! - hi! | Capacity: 0 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 0 - hi! |  - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! - Room  - Room hi! | hi! - hi! | Capacity: 0 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 0 | Capacity: 10");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + " - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! - Room  - Room hi! | hi! - hi! | Capacity: 0 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 0" + "'", str7, " - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! - Room  - Room hi! | hi! - hi! | Capacity: 0 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 0");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test22181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22181");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        java.lang.String str5 = room4.getScannedID();
        room4.setScannedID("hi!");
        room4.setUnderMaintenance(true);
        java.lang.String str10 = room4.getScannedID();
        room4.setScannedID("Room hi! | hi! - hi! | Capacity: 0 - hi! - ");
        java.lang.String str13 = room4.toString();
        java.lang.String str14 = room4.getRoomID();
        boolean boolean15 = room4.isEnabled();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str13, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test22182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22182");
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
        room4.setUnderMaintenance(false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0 - hi! - " + "'", str16, "Room hi! | hi! - hi! | Capacity: 0 - hi! - ");
    }

    @Test
    public void test22183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22183");
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
        java.lang.String str15 = room4.getFullLocation();
        java.lang.String str16 = room4.toString();
        java.lang.String str17 = room4.getRoomNumber();
        int int18 = room4.getCapacity();
        java.lang.Class<?> wildcardClass19 = room4.getClass();
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str11, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi! - hi!" + "'", str14, "hi! - hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi! - hi!" + "'", str15, "hi! - hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str16, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test22184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22184");
        room.Room room4 = new room.Room("hi!", (int) (byte) 100, "", "Room hi! | hi! - hi! | Capacity: 0");
        java.lang.String str5 = room4.getRoomNumber();
        room4.notifyObservers();
        java.lang.String str7 = room4.getFullLocation();
        java.lang.String str8 = room4.toString();
        boolean boolean9 = room4.isEnabled();
        int int10 = room4.getCapacity();
        room.SensorObserver sensorObserver11 = null;
        room4.removeObserver(sensorObserver11);
        java.lang.String str13 = room4.getBuildingName();
        room4.notifyObservers();
        java.lang.String str15 = room4.getRoomNumber();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str5, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + " - Room hi! | hi! - hi! | Capacity: 0" + "'", str7, " - Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100" + "'", str8, "Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str15, "Room hi! | hi! - hi! | Capacity: 0");
    }

    @Test
    public void test22185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22185");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        java.lang.String str5 = room4.getScannedID();
        room4.setScannedID("hi!");
        boolean boolean8 = room4.isEnabled();
        room4.setEnabled(false);
        room4.setOccupied(true);
        boolean boolean13 = room4.isEnabled();
        java.lang.String str14 = room4.getRoomID();
        room4.setOccupied(false);
        int int17 = room4.getCapacity();
        room4.setEnabled(true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test22186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22186");
        room.Room room4 = new room.Room("Room Room  | Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! | Capacity: 1 |  - Room hi! | hi! - hi! | Capacity: 0 - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! | Capacity: 1", (int) (byte) 100, "Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 100 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: -1 - ", "Room Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! -  | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | hi! - hi! | Capacity: 0 - Room Room hi! | hi! - hi! | Capacity: 0 | Room hi! | hi! - hi! | Capacity: 0 - hi! - hi! | Capacity: 100 - hi! - hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 52");
        java.lang.String str5 = room4.getRoomID();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Room Room  | Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! | Capacity: 1 |  - Room hi! | hi! - hi! | Capacity: 0 - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! | Capacity: 1" + "'", str5, "Room Room  | Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! | Capacity: 1 |  - Room hi! | hi! - hi! | Capacity: 0 - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! | Capacity: 1");
    }

    @Test
    public void test22187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22187");
        room.Room room4 = new room.Room("Room Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 97 | Room hi! - hi! - hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 1 | Capacity: 0 - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 | Capacity: 35", 0, "Room Room Room hi! | hi! - hi! | Capacity: 0 | Room hi! | hi! - hi! | Capacity: 0 - hi! - hi! | Capacity: 100 - Room  - Room hi! | hi! - hi! | Capacity: 0 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 0 | Room hi! | hi! - hi! - Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | Capacity: 0 - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! | Capacity: 52", "Room  - Room hi! | hi! - hi! | Capacity: 0 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 0 - ");
        boolean boolean5 = room4.isOccupied();
        java.lang.String str6 = room4.getBuildingName();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Room Room Room hi! | hi! - hi! | Capacity: 0 | Room hi! | hi! - hi! | Capacity: 0 - hi! - hi! | Capacity: 100 - Room  - Room hi! | hi! - hi! | Capacity: 0 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 0 | Room hi! | hi! - hi! - Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | Capacity: 0 - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! | Capacity: 52" + "'", str6, "Room Room Room hi! | hi! - hi! | Capacity: 0 | Room hi! | hi! - hi! | Capacity: 0 - hi! - hi! | Capacity: 100 - Room  - Room hi! | hi! - hi! | Capacity: 0 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 0 | Room hi! | hi! - hi! - Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | Capacity: 0 - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! | Capacity: 52");
    }

    @Test
    public void test22188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22188");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        boolean boolean5 = room4.isOccupied();
        room4.setEnabled(false);
        java.lang.String str8 = room4.getFullLocation();
        room4.setOccupied(false);
        room4.setEnabled(true);
        boolean boolean13 = room4.isUnderMaintenance();
        java.lang.String str14 = room4.getBuildingName();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi! - hi!" + "'", str8, "hi! - hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test22189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22189");
        room.Room room4 = new room.Room("Room hi! - hi! - hi! | hi! - hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 1", 35, "hi! - hi! - hi! - Room hi! | hi! - hi! | Capacity: 0 - Room Room hi! | hi! - hi! | Capacity: 0 |  - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 0", "Room  - Room hi! | hi! - hi! | Capacity: 0 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 0 - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10");
    }

    @Test
    public void test22190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22190");
        room.Room room4 = new room.Room("Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi!", 0, "Room  - Room hi! | hi! - hi! | Capacity: 0 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 0", "Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 97");
        room.SensorObserver sensorObserver5 = null;
        room4.removeObserver(sensorObserver5);
        boolean boolean7 = room4.isOccupied();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test22191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22191");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        room.SensorObserver sensorObserver5 = null;
        room4.addObserver(sensorObserver5);
        room.SensorObserver sensorObserver7 = null;
        room4.addObserver(sensorObserver7);
        java.lang.String str9 = room4.getBuildingName();
        java.lang.String str10 = room4.getRoomNumber();
        java.lang.String str11 = room4.getBuildingName();
        java.lang.String str12 = room4.toString();
        java.lang.String str13 = room4.getFullLocation();
        boolean boolean14 = room4.isEnabled();
        java.lang.String str15 = room4.getRoomID();
        java.lang.String str16 = room4.getScannedID();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str12, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi! - hi!" + "'", str13, "hi! - hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test22192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22192");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        java.lang.String str5 = room4.getBuildingName();
        java.lang.String str6 = room4.getRoomID();
        boolean boolean7 = room4.isOccupied();
        room4.setUnderMaintenance(false);
        room4.notifyObservers();
        java.lang.String str11 = room4.getRoomNumber();
        room.SensorObserver sensorObserver12 = null;
        room4.removeObserver(sensorObserver12);
        room4.setUnderMaintenance(false);
        room.SensorObserver sensorObserver16 = null;
        room4.removeObserver(sensorObserver16);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test22193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22193");
        room.Room room4 = new room.Room("hi!", (int) (byte) 1, "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10", "hi!");
        room4.notifyObservers();
        java.lang.String str6 = room4.getFullLocation();
        java.lang.String str7 = room4.getScannedID();
        boolean boolean8 = room4.isUnderMaintenance();
        java.lang.String str9 = room4.getRoomID();
        java.lang.String str10 = room4.getBuildingName();
        room4.setEnabled(false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi!" + "'", str6, "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi!");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10" + "'", str10, "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10");
    }

    @Test
    public void test22194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22194");
        room.Room room4 = new room.Room("Room hi! | hi! - hi! | Capacity: 0", (int) 'a', "hi!", "hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10");
        java.lang.String str5 = room4.getScannedID();
        int int6 = room4.getCapacity();
        room.SensorObserver sensorObserver7 = null;
        room4.addObserver(sensorObserver7);
        boolean boolean9 = room4.isOccupied();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test22195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22195");
        room.Room room4 = new room.Room("Room hi! | hi! - hi! | Capacity: 0 - hi! - hi! - Room hi! | hi! - hi! | Capacity: 0 - hi! - hi!", (-1), "hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! - hi!", "Room hi! - hi! - Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | Room hi! | hi! - hi! | Capacity: 0 - hi! -  - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! | Capacity: -1 - Room Room Room hi! | hi! - hi! | Capacity: 0 | Room hi! | hi! - hi! | Capacity: 0 - hi! - hi! | Capacity: 100 - Room  - Room hi! | hi! - hi! | Capacity: 0 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 0 | Room hi! | hi! - hi! - Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | Capacity: 0 - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! | Capacity: 52");
    }

    @Test
    public void test22196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22196");
        room.Room room4 = new room.Room("", (int) (short) 10, "Room hi! | hi! - hi! | Capacity: 0", "hi!");
        java.lang.String str5 = room4.toString();
        java.lang.String str6 = room4.getBuildingName();
        room.SensorObserver sensorObserver7 = null;
        room4.removeObserver(sensorObserver7);
        boolean boolean9 = room4.isEnabled();
        java.lang.String str10 = room4.getFullLocation();
        boolean boolean11 = room4.isUnderMaintenance();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10" + "'", str5, "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str6, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0 - hi!" + "'", str10, "Room hi! | hi! - hi! | Capacity: 0 - hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test22197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22197");
        room.Room room4 = new room.Room("Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - Room hi! | hi! - hi! | Capacity: 0 - hi!", (-1), "Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 | hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 0", "");
        room4.setEnabled(false);
        room.SensorObserver sensorObserver7 = null;
        room4.removeObserver(sensorObserver7);
    }

    @Test
    public void test22198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22198");
        room.Room room4 = new room.Room("hi!", (int) (byte) 100, "", "Room hi! | hi! - hi! | Capacity: 0");
        java.lang.String str5 = room4.getScannedID();
        java.lang.String str6 = room4.getBuildingName();
        room4.setUnderMaintenance(false);
        room4.setScannedID("Room hi! | hi! - hi! | Capacity: 0 - hi! - ");
        room4.setScannedID("");
        room4.setOccupied(false);
        room.SensorObserver sensorObserver15 = null;
        room4.removeObserver(sensorObserver15);
        java.lang.String str17 = room4.getBuildingName();
        room4.setEnabled(false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test22199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22199");
        room.Room room4 = new room.Room("", (int) (short) 10, "Room hi! | hi! - hi! | Capacity: 0", "hi!");
        java.lang.String str5 = room4.toString();
        room4.setUnderMaintenance(true);
        java.lang.String str8 = room4.getFullLocation();
        room4.setOccupied(false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10" + "'", str5, "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0 - hi!" + "'", str8, "Room hi! | hi! - hi! | Capacity: 0 - hi!");
    }

    @Test
    public void test22200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22200");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        room.SensorObserver sensorObserver5 = null;
        room4.addObserver(sensorObserver5);
        java.lang.String str7 = room4.getScannedID();
        java.lang.String str8 = room4.getRoomNumber();
        java.lang.String str9 = room4.getRoomNumber();
        room.SensorObserver sensorObserver10 = null;
        room4.removeObserver(sensorObserver10);
        room4.setEnabled(false);
        boolean boolean14 = room4.isEnabled();
        boolean boolean15 = room4.isOccupied();
        room4.setScannedID("hi! - hi! - hi! - Room hi! | hi! - hi! | Capacity: 0 - Room Room hi! | hi! - hi! | Capacity: 0 |  - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 0");
        room.SensorObserver sensorObserver18 = null;
        room4.removeObserver(sensorObserver18);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test22201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22201");
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
        java.lang.String str20 = room4.toString();
        room4.notifyObservers();
        java.lang.String str22 = room4.getRoomNumber();
        room4.setScannedID("");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str11, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi! - hi!" + "'", str14, "hi! - hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str15, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str20, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
    }

    @Test
    public void test22202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22202");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        java.lang.String str5 = room4.getBuildingName();
        java.lang.String str6 = room4.getRoomID();
        boolean boolean7 = room4.isOccupied();
        room4.setEnabled(false);
        boolean boolean10 = room4.isUnderMaintenance();
        boolean boolean11 = room4.isUnderMaintenance();
        room.SensorObserver sensorObserver12 = null;
        room4.addObserver(sensorObserver12);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test22203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22203");
        room.Room room4 = new room.Room("hi!", (int) (byte) 100, "", "Room hi! | hi! - hi! | Capacity: 0");
        java.lang.String str5 = room4.toString();
        java.lang.String str6 = room4.getRoomNumber();
        room4.setOccupied(false);
        boolean boolean9 = room4.isOccupied();
        boolean boolean10 = room4.isUnderMaintenance();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100" + "'", str5, "Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str6, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test22204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22204");
        room.Room room4 = new room.Room("Room hi! | hi! - hi! | Capacity: 0", (int) 'a', "hi!", "hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10");
        java.lang.String str5 = room4.toString();
        room4.setOccupied(true);
        boolean boolean8 = room4.isUnderMaintenance();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Room Room hi! | hi! - hi! | Capacity: 0 | hi! - hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 97" + "'", str5, "Room Room hi! | hi! - hi! | Capacity: 0 | hi! - hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 97");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test22205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22205");
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
        room4.setEnabled(false);
        java.lang.String str19 = room4.getScannedID();
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str11, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | hi! -  - Room  - Room hi! | hi! - hi! | Capacity: 0 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 0 | Capacity: 10" + "'", str19, "Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | hi! -  - Room  - Room hi! | hi! - hi! | Capacity: 0 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 0 | Capacity: 10");
    }

    @Test
    public void test22206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22206");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        java.lang.String str5 = room4.getScannedID();
        room4.setScannedID("hi!");
        java.lang.String str8 = room4.getBuildingName();
        room4.setEnabled(false);
        room4.setUnderMaintenance(false);
        boolean boolean13 = room4.isOccupied();
        java.lang.String str14 = room4.getRoomNumber();
        java.lang.String str15 = room4.getScannedID();
        room.SensorObserver sensorObserver16 = null;
        room4.addObserver(sensorObserver16);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test22207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22207");
        room.Room room4 = new room.Room("Room Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 100", 0, "hi! - hi! - hi!", "Room  | Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! | Capacity: 1");
        java.lang.String str5 = room4.getBuildingName();
        room4.notifyObservers();
        room4.setScannedID("Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 | hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 0 - hi! - hi! - Room hi! | hi! - hi! | Capacity: 0");
        boolean boolean9 = room4.isEnabled();
        boolean boolean10 = room4.isOccupied();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi! - hi! - hi!" + "'", str5, "hi! - hi! - hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test22208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22208");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        java.lang.String str5 = room4.getScannedID();
        room4.setScannedID("hi!");
        boolean boolean8 = room4.isEnabled();
        room.SensorObserver sensorObserver9 = null;
        room4.removeObserver(sensorObserver9);
        int int11 = room4.getCapacity();
        java.lang.String str12 = room4.getRoomID();
        java.lang.String str13 = room4.toString();
        java.lang.String str14 = room4.getRoomNumber();
        room4.setEnabled(true);
        java.lang.String str17 = room4.getBuildingName();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str13, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test22209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22209");
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
        java.lang.String str17 = room4.getFullLocation();
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str11, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi! - hi!" + "'", str17, "hi! - hi!");
    }

    @Test
    public void test22210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22210");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        boolean boolean5 = room4.isOccupied();
        room4.setEnabled(false);
        java.lang.String str8 = room4.getFullLocation();
        java.lang.String str9 = room4.getRoomID();
        boolean boolean10 = room4.isUnderMaintenance();
        boolean boolean11 = room4.isOccupied();
        java.lang.String str12 = room4.getScannedID();
        java.lang.String str13 = room4.getRoomNumber();
        room.SensorObserver sensorObserver14 = null;
        room4.removeObserver(sensorObserver14);
        int int16 = room4.getCapacity();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi! - hi!" + "'", str8, "hi! - hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test22211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22211");
        room.Room room4 = new room.Room("Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! - hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 97 | Capacity: 32", (int) (byte) 10, "Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi!", " - hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi!");
        java.lang.Class<?> wildcardClass5 = room4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test22212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22212");
        room.Room room4 = new room.Room("", (int) (byte) 100, "Room hi! | hi! - hi! | Capacity: 0 - hi!", "");
        boolean boolean5 = room4.isEnabled();
        room4.notifyObservers();
        java.lang.String str7 = room4.getBuildingName();
        boolean boolean8 = room4.isEnabled();
        room4.notifyObservers();
        int int10 = room4.getCapacity();
        java.lang.String str11 = room4.getRoomID();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0 - hi!" + "'", str7, "Room hi! | hi! - hi! | Capacity: 0 - hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test22213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22213");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        room.SensorObserver sensorObserver5 = null;
        room4.addObserver(sensorObserver5);
        room.SensorObserver sensorObserver7 = null;
        room4.addObserver(sensorObserver7);
        java.lang.String str9 = room4.getBuildingName();
        java.lang.String str10 = room4.getRoomNumber();
        java.lang.String str11 = room4.getBuildingName();
        room.SensorObserver sensorObserver12 = null;
        room4.addObserver(sensorObserver12);
        boolean boolean14 = room4.isEnabled();
        boolean boolean15 = room4.isOccupied();
        // The following exception was thrown during execution in test generation
        try {
            room4.setScannedID("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test22214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22214");
        room.Room room4 = new room.Room(" - Room hi! | hi! - hi! | Capacity: 0", (int) (byte) 100, "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi!", "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10");
        room.SensorObserver sensorObserver5 = null;
        room4.removeObserver(sensorObserver5);
        room4.setEnabled(true);
        room.SensorObserver sensorObserver9 = null;
        room4.removeObserver(sensorObserver9);
        java.lang.String str11 = room4.getBuildingName();
        java.lang.String str12 = room4.getRoomID();
        room4.notifyObservers();
        java.lang.String str14 = room4.toString();
        java.lang.String str15 = room4.getRoomID();
        boolean boolean16 = room4.isOccupied();
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi!" + "'", str11, "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + " - Room hi! | hi! - hi! | Capacity: 0" + "'", str12, " - Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Room  - Room hi! | hi! - hi! | Capacity: 0 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 | Capacity: 100" + "'", str14, "Room  - Room hi! | hi! - hi! | Capacity: 0 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 | Capacity: 100");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + " - Room hi! | hi! - hi! | Capacity: 0" + "'", str15, " - Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test22215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22215");
        room.Room room4 = new room.Room("hi!", (int) (byte) 100, "", "Room hi! | hi! - hi! | Capacity: 0");
        java.lang.String str5 = room4.toString();
        room4.setOccupied(false);
        boolean boolean8 = room4.isUnderMaintenance();
        room4.setOccupied(false);
        java.lang.String str11 = room4.getFullLocation();
        room4.setUnderMaintenance(true);
        boolean boolean14 = room4.isEnabled();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100" + "'", str5, "Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + " - Room hi! | hi! - hi! | Capacity: 0" + "'", str11, " - Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test22216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22216");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        boolean boolean5 = room4.isOccupied();
        room4.setEnabled(false);
        java.lang.String str8 = room4.toString();
        room4.setOccupied(true);
        java.lang.String str11 = room4.getRoomNumber();
        room4.setEnabled(false);
        java.lang.String str14 = room4.toString();
        java.lang.String str15 = room4.getRoomNumber();
        java.lang.String str16 = room4.getFullLocation();
        room4.setEnabled(true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str8, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str14, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi! - hi!" + "'", str16, "hi! - hi!");
    }

    @Test
    public void test22217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22217");
        room.Room room4 = new room.Room("hi!", 100, "Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 97", "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 100 - Room hi! | hi! - hi! | Capacity: 0 - hi! - ");
        room.SensorObserver sensorObserver5 = null;
        room4.removeObserver(sensorObserver5);
        int int7 = room4.getCapacity();
        int int8 = room4.getCapacity();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
    }

    @Test
    public void test22218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22218");
        room.Room room4 = new room.Room("Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10", (int) 'a', "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 100 - Room hi! | hi! - hi! | Capacity: 0 - hi! - ", "Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | hi! -  - Room  - Room hi! | hi! - hi! | Capacity: 0 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 0 | Capacity: 10");
        room.SensorObserver sensorObserver5 = null;
        room4.addObserver(sensorObserver5);
        boolean boolean7 = room4.isOccupied();
        room.SensorObserver sensorObserver8 = null;
        room4.removeObserver(sensorObserver8);
        int int10 = room4.getCapacity();
        java.lang.String str11 = room4.getRoomNumber();
        room.SensorObserver sensorObserver12 = null;
        room4.addObserver(sensorObserver12);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | hi! -  - Room  - Room hi! | hi! - hi! | Capacity: 0 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 0 | Capacity: 10" + "'", str11, "Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | hi! -  - Room  - Room hi! | hi! - hi! | Capacity: 0 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 0 | Capacity: 10");
    }

    @Test
    public void test22219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22219");
        room.Room room4 = new room.Room("Room Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 100 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 -  - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! | Capacity: 0 | hi! - hi! - hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 | Capacity: 0", (int) (short) 10, "Room Room hi! | hi! - hi! | Capacity: 0 | Room hi! | hi! - hi! | Capacity: 0 - hi! - hi! | Capacity: 100 - hi! - hi! - Room hi! | hi! - hi! | Capacity: 0", "Room Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! -  -  - Room hi! | hi! - hi! | Capacity: 0 | Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - Room Room hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 1 | Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! - Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: -1 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 32");
        boolean boolean5 = room4.isOccupied();
        room4.setUnderMaintenance(false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test22220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22220");
        room.Room room4 = new room.Room("Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! - hi! - hi! - Room hi! | hi! - hi! | Capacity: 0", 0, "Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | hi! - hi! - hi! | Capacity: 0 - Room hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 1 - Room hi! | hi! - hi! - Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | Capacity: 0", "Room  | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 100 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 1");
        java.lang.String str5 = room4.getRoomID();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! - hi! - hi! - Room hi! | hi! - hi! | Capacity: 0" + "'", str5, "Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! - hi! - hi! - Room hi! | hi! - hi! | Capacity: 0");
    }

    @Test
    public void test22221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22221");
        room.Room room4 = new room.Room("Room hi! | hi! - hi! | Capacity: 0", (int) (byte) 10, "hi!", "");
        room4.setUnderMaintenance(true);
        java.lang.String str7 = room4.toString();
        room4.notifyObservers();
        java.lang.String str9 = room4.getRoomNumber();
        int int10 = room4.getCapacity();
        room4.setUnderMaintenance(false);
        java.lang.String str13 = room4.toString();
        java.lang.String str14 = room4.getFullLocation();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10" + "'", str7, "Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10" + "'", str13, "Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi! - " + "'", str14, "hi! - ");
    }

    @Test
    public void test22222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22222");
        room.Room room4 = new room.Room(" - Room hi! | hi! - hi! | Capacity: 0", 0, "", "Room hi! | hi! - hi! | Capacity: 0");
        room4.setOccupied(false);
        room.SensorObserver sensorObserver7 = null;
        room4.removeObserver(sensorObserver7);
        room4.setScannedID("");
        java.lang.String str11 = room4.getScannedID();
        room4.setScannedID("Room Room hi! | hi! - hi! | Capacity: 0 | Room hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 1 - Room hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 1 | Capacity: 1");
        room4.setScannedID("Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 | Room Room hi! | hi! - hi! | Capacity: 0 | Room hi! | hi! - hi! | Capacity: 0 - hi! - hi! | Capacity: 100 - hi! - hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test22223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22223");
        room.Room room4 = new room.Room("", 35, "hi! - hi! - Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 97", "Room  | Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! | Capacity: 1");
        boolean boolean5 = room4.isUnderMaintenance();
        room4.setOccupied(false);
        room4.setOccupied(true);
        room.SensorObserver sensorObserver10 = null;
        room4.removeObserver(sensorObserver10);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test22224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22224");
        room.Room room4 = new room.Room("hi! - ", (int) (byte) 10, "", "Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 100 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 -  - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! | Capacity: 0 - Room Room hi! | hi! - hi! | Capacity: 0 - hi! - hi! | Room Room hi! | hi! - hi! | Capacity: 0 | Room hi! | hi! - hi! | Capacity: 0 - hi! - hi! | Capacity: 100 - Room  - Room hi! | hi! - hi! | Capacity: 0 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 0 | Capacity: 10 - Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 1");
    }

    @Test
    public void test22225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22225");
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
        java.lang.String str15 = room4.getFullLocation();
        java.lang.String str16 = room4.getBuildingName();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi! - hi!" + "'", str15, "hi! - hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test22226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22226");
        room.Room room4 = new room.Room("hi! - ", (int) (byte) 100, "Room hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 100 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Room hi! | hi! - hi! | Capacity: 0 - hi! - hi! | Capacity: 35", "hi! - hi! - ");
        boolean boolean5 = room4.isOccupied();
        room4.notifyObservers();
        room4.setScannedID(" - Room hi! - hi! - hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 1 | Capacity: 0");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test22227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22227");
        room.Room room4 = new room.Room("Room hi! | hi! - hi! | Capacity: 0 - Room hi! | hi! - hi! | Capacity: 0", 1, "Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 | Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 1 - Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 1", "Room Room hi! - hi! - Room hi! | hi! - hi! | Capacity: 0 | hi! - hi! - Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 97 | Capacity: 10 | Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - Room Room hi! | hi! - hi! | Capacity: 0 | Room hi! | hi! - hi! | Capacity: 0 - hi! - hi! | Capacity: 100 | Capacity: 52");
    }

    @Test
    public void test22228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22228");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        boolean boolean5 = room4.isOccupied();
        boolean boolean6 = room4.isEnabled();
        int int7 = room4.getCapacity();
        room4.setOccupied(false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test22229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22229");
        room.Room room4 = new room.Room("Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10", 0, "hi!", "Room hi! | hi! - hi! | Capacity: 0");
        java.lang.String str5 = room4.getBuildingName();
        boolean boolean6 = room4.isEnabled();
        room.SensorObserver sensorObserver7 = null;
        room4.removeObserver(sensorObserver7);
        room.SensorObserver sensorObserver9 = null;
        room4.removeObserver(sensorObserver9);
        room.SensorObserver sensorObserver11 = null;
        room4.addObserver(sensorObserver11);
        java.lang.String str13 = room4.getBuildingName();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test22230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22230");
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
        int int14 = room4.getCapacity();
        room4.setUnderMaintenance(false);
        room4.setScannedID("Room hi! | hi! - hi! - Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | Capacity: 0");
        room4.setOccupied(false);
        room4.notifyObservers();
        boolean boolean22 = room4.isUnderMaintenance();
        room4.setUnderMaintenance(true);
        java.lang.String str25 = room4.toString();
        int int26 = room4.getCapacity();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str7, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str8, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str25, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
    }

    @Test
    public void test22231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22231");
        room.Room room4 = new room.Room("Room Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 100", (int) 'a', "Room Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 1 - Room hi! | hi! - hi! | Capacity: 0 - hi! |  -  | Capacity: 35", "Room Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! - hi! - hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: -1 - Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 | hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 0 - hi! - hi! - Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 97");
        boolean boolean5 = room4.isEnabled();
        room4.setOccupied(true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test22232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22232");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        java.lang.String str5 = room4.getScannedID();
        room4.setScannedID("hi!");
        boolean boolean8 = room4.isEnabled();
        int int9 = room4.getCapacity();
        boolean boolean10 = room4.isOccupied();
        java.lang.String str11 = room4.getFullLocation();
        room4.setScannedID("Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi!");
        boolean boolean14 = room4.isEnabled();
        room4.setUnderMaintenance(true);
        room4.setEnabled(false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi! - hi!" + "'", str11, "hi! - hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test22233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22233");
        room.Room room4 = new room.Room("Room  - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 100 | hi! - hi! - hi! - hi! | Capacity: 0 | Capacity: 0", (int) (byte) 1, "Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 97", "Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | hi! -  - Room  - Room hi! | hi! - hi! | Capacity: 0 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 0 | Capacity: 10");
        int int5 = room4.getCapacity();
        room4.setUnderMaintenance(false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test22234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22234");
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
        java.lang.String str15 = room4.getBuildingName();
        room4.setUnderMaintenance(false);
        room.SensorObserver sensorObserver18 = null;
        room4.addObserver(sensorObserver18);
        room.SensorObserver sensorObserver20 = null;
        room4.addObserver(sensorObserver20);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10" + "'", str5, "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str6, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str15, "Room hi! | hi! - hi! | Capacity: 0");
    }

    @Test
    public void test22235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22235");
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
        java.lang.String str22 = room4.getFullLocation();
        int int23 = room4.getCapacity();
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str11, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi! - hi!" + "'", str14, "hi! - hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi! - hi!" + "'", str22, "hi! - hi!");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test22236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22236");
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
        boolean boolean14 = room4.isEnabled();
        boolean boolean15 = room4.isUnderMaintenance();
        // The following exception was thrown during execution in test generation
        try {
            room4.notifyObservers();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str7, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str8, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi! - hi!" + "'", str13, "hi! - hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test22237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22237");
        room.Room room4 = new room.Room("Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100", 0, "hi! - hi!", "hi!");
        java.lang.String str5 = room4.getFullLocation();
        boolean boolean6 = room4.isUnderMaintenance();
        boolean boolean7 = room4.isOccupied();
        java.lang.String str8 = room4.getRoomID();
        java.lang.String str9 = room4.getBuildingName();
        java.lang.String str10 = room4.getBuildingName();
        java.lang.Class<?> wildcardClass11 = room4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi! - hi! - hi!" + "'", str5, "hi! - hi! - hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100" + "'", str8, "Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi! - hi!" + "'", str9, "hi! - hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi! - hi!" + "'", str10, "hi! - hi!");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test22238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22238");
        room.Room room4 = new room.Room("", (int) (short) 10, "Room hi! | hi! - hi! | Capacity: 0", "hi!");
        java.lang.String str5 = room4.toString();
        java.lang.String str6 = room4.getBuildingName();
        boolean boolean7 = room4.isOccupied();
        java.lang.String str8 = room4.getFullLocation();
        room.SensorObserver sensorObserver9 = null;
        room4.removeObserver(sensorObserver9);
        java.lang.String str11 = room4.getFullLocation();
        java.lang.String str12 = room4.getRoomID();
        boolean boolean13 = room4.isEnabled();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10" + "'", str5, "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str6, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0 - hi!" + "'", str8, "Room hi! | hi! - hi! | Capacity: 0 - hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0 - hi!" + "'", str11, "Room hi! | hi! - hi! | Capacity: 0 - hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test22239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22239");
        room.Room room4 = new room.Room("hi!", (int) '#', "Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10", "Room hi! | hi! - hi! | Capacity: 0 - hi!");
        boolean boolean5 = room4.isOccupied();
        int int6 = room4.getCapacity();
        room4.setEnabled(false);
        room4.setUnderMaintenance(true);
        java.lang.String str11 = room4.getRoomNumber();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0 - hi!" + "'", str11, "Room hi! | hi! - hi! | Capacity: 0 - hi!");
    }

    @Test
    public void test22240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22240");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        room.SensorObserver sensorObserver5 = null;
        room4.addObserver(sensorObserver5);
        java.lang.String str7 = room4.toString();
        java.lang.String str8 = room4.toString();
        room.SensorObserver sensorObserver9 = null;
        room4.addObserver(sensorObserver9);
        boolean boolean11 = room4.isOccupied();
        java.lang.String str12 = room4.toString();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str7, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str8, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str12, "Room hi! | hi! - hi! | Capacity: 0");
    }

    @Test
    public void test22241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22241");
        room.Room room4 = new room.Room("hi!", 1, "Room hi! | hi! - hi! | Capacity: 0 - hi!", "Room hi! | hi! - hi! | Capacity: 0 - hi!");
        int int5 = room4.getCapacity();
        room4.setUnderMaintenance(false);
        java.lang.String str8 = room4.toString();
        int int9 = room4.getCapacity();
        room4.setScannedID("hi!");
        room4.setEnabled(true);
        room4.setOccupied(false);
        java.lang.String str16 = room4.getScannedID();
        java.lang.String str17 = room4.getBuildingName();
        room.SensorObserver sensorObserver18 = null;
        room4.removeObserver(sensorObserver18);
        java.lang.Class<?> wildcardClass20 = room4.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Room hi! | Room hi! | hi! - hi! | Capacity: 0 - hi! - Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 1" + "'", str8, "Room hi! | Room hi! | hi! - hi! | Capacity: 0 - hi! - Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 1");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0 - hi!" + "'", str17, "Room hi! | hi! - hi! | Capacity: 0 - hi!");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test22242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22242");
        room.Room room4 = new room.Room("hi!", (int) (byte) 100, "", "Room hi! | hi! - hi! | Capacity: 0");
        java.lang.String str5 = room4.getScannedID();
        room4.setUnderMaintenance(true);
        room4.notifyObservers();
        room4.setUnderMaintenance(false);
        room4.setEnabled(true);
        java.lang.String str13 = room4.getRoomNumber();
        java.lang.String str14 = room4.getBuildingName();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str13, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test22243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22243");
        room.Room room4 = new room.Room("hi!", (int) (byte) 100, "", "Room hi! | hi! - hi! | Capacity: 0");
        room4.setScannedID("");
        boolean boolean7 = room4.isOccupied();
        int int8 = room4.getCapacity();
        java.lang.String str9 = room4.getRoomNumber();
        java.lang.String str10 = room4.getBuildingName();
        java.lang.String str11 = room4.getRoomNumber();
        room4.setUnderMaintenance(false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str9, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str11, "Room hi! | hi! - hi! | Capacity: 0");
    }

    @Test
    public void test22244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22244");
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
        boolean boolean15 = room4.isOccupied();
        boolean boolean16 = room4.isEnabled();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str11, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test22245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22245");
        room.Room room4 = new room.Room("Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! - hi! - hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: -1 - ", (int) (short) 1, "Room Room hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 1 - Room hi! | hi! - hi! - Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | Capacity: 0 | Room  - Room hi! | hi! - hi! | Capacity: 0 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 0 - hi! - hi! - hi! | Capacity: 100", "Room Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 | Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 - hi! -  | Capacity: 10 - hi! - hi! - hi! | Capacity: 100");
        room4.setOccupied(true);
    }

    @Test
    public void test22246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22246");
        room.Room room4 = new room.Room("", (int) (short) 10, "Room hi! | hi! - hi! | Capacity: 0", "hi!");
        java.lang.String str5 = room4.getFullLocation();
        boolean boolean6 = room4.isEnabled();
        int int7 = room4.getCapacity();
        room4.notifyObservers();
        room4.setScannedID("Room hi! - hi! | Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 10");
        java.lang.String str11 = room4.getRoomID();
        java.lang.String str12 = room4.getFullLocation();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0 - hi!" + "'", str5, "Room hi! | hi! - hi! | Capacity: 0 - hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0 - hi!" + "'", str12, "Room hi! | hi! - hi! | Capacity: 0 - hi!");
    }

    @Test
    public void test22247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22247");
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
        room.SensorObserver sensorObserver17 = null;
        room4.removeObserver(sensorObserver17);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test22248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22248");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        java.lang.String str5 = room4.getBuildingName();
        java.lang.String str6 = room4.getRoomID();
        java.lang.String str7 = room4.getScannedID();
        boolean boolean8 = room4.isUnderMaintenance();
        room4.setEnabled(false);
        boolean boolean11 = room4.isOccupied();
        room.SensorObserver sensorObserver12 = null;
        room4.addObserver(sensorObserver12);
        java.lang.String str14 = room4.toString();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str14, "Room hi! | hi! - hi! | Capacity: 0");
    }

    @Test
    public void test22249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22249");
        room.Room room4 = new room.Room("Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 97", (int) (byte) 100, "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 100", "hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10");
        room4.notifyObservers();
        java.lang.String str6 = room4.toString();
        java.lang.String str7 = room4.toString();
        room4.setScannedID("Room hi! -  | Room Room hi! | hi! - hi! | Capacity: 0 | Room hi! | hi! - hi! | Capacity: 0 - hi! - hi! | Capacity: 100 -  | Capacity: 10");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Room Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 97 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 100 - hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 100" + "'", str6, "Room Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 97 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 100 - hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 100");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Room Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 97 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 100 - hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 100" + "'", str7, "Room Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 97 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 100 - hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 100");
    }

    @Test
    public void test22250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22250");
        room.Room room4 = new room.Room("Room Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! |  - Room hi! | hi! - hi! | Capacity: 0 - Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: -1", (int) (short) -1, "", "");
        int int5 = room4.getCapacity();
        room4.setEnabled(false);
        room4.notifyObservers();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test22251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22251");
        room.Room room4 = new room.Room("Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! - hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 97 | Capacity: 32", 10, "Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 97", "hi! - hi! - hi!");
        room4.setScannedID("Room Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! |  - hi! -  | Capacity: 100");
        java.lang.String str7 = room4.toString();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! - hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 97 | Capacity: 32 | Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 97 - hi! - hi! - hi! | Capacity: 10" + "'", str7, "Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! - hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 97 | Capacity: 32 | Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 97 - hi! - hi! - hi! | Capacity: 10");
    }

    @Test
    public void test22252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22252");
        room.Room room4 = new room.Room("hi! - hi! - Room hi! | hi! - hi! | Capacity: 0", 10, "hi! - hi!", "Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 97");
        room4.setScannedID("Room hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 1");
        java.lang.String str7 = room4.toString();
        room4.setEnabled(true);
        room4.setScannedID("Room Room hi! | hi! - hi! | Capacity: 0 - hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 100 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Room hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 1 - Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | hi! -  - Room  - Room hi! | hi! - hi! | Capacity: 0 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 0 | Capacity: 10 - Room  - Room hi! | hi! - hi! | Capacity: 0 |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 0 | Capacity: 100");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Room hi! - hi! - Room hi! | hi! - hi! | Capacity: 0 | hi! - hi! - Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 97 | Capacity: 10" + "'", str7, "Room hi! - hi! - Room hi! | hi! - hi! | Capacity: 0 | hi! - hi! - Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 97 | Capacity: 10");
    }

    @Test
    public void test22253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22253");
        room.Room room4 = new room.Room("Room Room hi! | hi! - hi! | Capacity: 0 | Room hi! | hi! - hi! | Capacity: 0 - hi! - hi! | Capacity: 100", (int) (byte) 10, "", "hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10");
        java.lang.String str5 = room4.toString();
        room4.setEnabled(false);
        java.lang.String str8 = room4.toString();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Room Room Room hi! | hi! - hi! | Capacity: 0 | Room hi! | hi! - hi! | Capacity: 0 - hi! - hi! | Capacity: 100 |  - hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 10" + "'", str5, "Room Room Room hi! | hi! - hi! | Capacity: 0 | Room hi! | hi! - hi! | Capacity: 0 - hi! - hi! | Capacity: 100 |  - hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 10");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Room Room Room hi! | hi! - hi! | Capacity: 0 | Room hi! | hi! - hi! | Capacity: 0 - hi! - hi! | Capacity: 100 |  - hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 10" + "'", str8, "Room Room Room hi! | hi! - hi! | Capacity: 0 | Room hi! | hi! - hi! | Capacity: 0 - hi! - hi! | Capacity: 100 |  - hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 10");
    }

    @Test
    public void test22254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22254");
        room.Room room4 = new room.Room("Room hi! | hi! - hi! | Capacity: 0", (int) (byte) 10, "hi!", "");
        room4.setUnderMaintenance(true);
        int int7 = room4.getCapacity();
        java.lang.String str8 = room4.getRoomNumber();
        java.lang.String str9 = room4.getScannedID();
        java.lang.String str10 = room4.getRoomNumber();
        java.lang.String str11 = room4.getBuildingName();
        java.lang.String str12 = room4.getFullLocation();
        java.lang.String str13 = room4.getRoomNumber();
        room4.notifyObservers();
        boolean boolean15 = room4.isEnabled();
        boolean boolean16 = room4.isUnderMaintenance();
        java.lang.Class<?> wildcardClass17 = room4.getClass();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi! - " + "'", str12, "hi! - ");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test22255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22255");
        room.Room room4 = new room.Room("Room hi! | hi! - hi! - Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | Capacity: 0", (int) (short) 0, "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi!", "hi! - hi! - hi!");
        java.lang.String str5 = room4.getRoomID();
        java.lang.Class<?> wildcardClass6 = room4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Room hi! | hi! - hi! - Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | Capacity: 0" + "'", str5, "Room hi! | hi! - hi! - Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | Capacity: 0");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test22256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22256");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        boolean boolean5 = room4.isOccupied();
        room4.setEnabled(false);
        boolean boolean8 = room4.isUnderMaintenance();
        java.lang.String str9 = room4.getFullLocation();
        boolean boolean10 = room4.isOccupied();
        room.SensorObserver sensorObserver11 = null;
        room4.addObserver(sensorObserver11);
        boolean boolean13 = room4.isUnderMaintenance();
        // The following exception was thrown during execution in test generation
        try {
            room4.setScannedID("Room  - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 100 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 | Capacity: 1");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi! - hi!" + "'", str9, "hi! - hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test22257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22257");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        java.lang.String str5 = room4.getBuildingName();
        java.lang.String str6 = room4.getRoomID();
        room4.setUnderMaintenance(false);
        int int9 = room4.getCapacity();
        java.lang.String str10 = room4.getRoomID();
        java.lang.String str11 = room4.toString();
        boolean boolean12 = room4.isEnabled();
        room4.setScannedID("Room hi! | hi! - hi! | Capacity: 0 - hi! - Room hi! | hi! - hi! | Capacity: 0 - hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str11, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test22258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22258");
        room.Room room4 = new room.Room("hi!", (int) (byte) 100, "", "Room hi! | hi! - hi! | Capacity: 0");
        room4.setScannedID("");
        boolean boolean7 = room4.isOccupied();
        java.lang.String str8 = room4.getRoomID();
        room4.setOccupied(false);
        int int11 = room4.getCapacity();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
    }

    @Test
    public void test22259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22259");
        room.Room room4 = new room.Room("Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100", 0, "hi! - hi!", "hi!");
        java.lang.String str5 = room4.getFullLocation();
        boolean boolean6 = room4.isUnderMaintenance();
        room4.setEnabled(true);
        room4.notifyObservers();
        java.lang.String str10 = room4.getRoomID();
        room.SensorObserver sensorObserver11 = null;
        room4.addObserver(sensorObserver11);
        java.lang.Class<?> wildcardClass13 = room4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi! - hi! - hi!" + "'", str5, "hi! - hi! - hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100" + "'", str10, "Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test22260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22260");
        room.Room room4 = new room.Room("hi! - hi! - Room hi! | hi! - hi! | Capacity: 0", 10, "hi! - hi!", "Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 97");
        room4.setScannedID("Room hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 1");
        boolean boolean7 = room4.isOccupied();
        room4.setEnabled(false);
        java.lang.String str10 = room4.getFullLocation();
        java.lang.String str11 = room4.getBuildingName();
        int int12 = room4.getCapacity();
        room4.setUnderMaintenance(false);
        room4.setScannedID("Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 | hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 0 - Room hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 1");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi! - hi! - Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 97" + "'", str10, "hi! - hi! - Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 97");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi! - hi!" + "'", str11, "hi! - hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
    }

    @Test
    public void test22261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22261");
        room.Room room4 = new room.Room("hi!", (int) (byte) 1, "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10", "hi!");
        room4.notifyObservers();
        room4.setOccupied(false);
        room4.setUnderMaintenance(false);
        room4.setEnabled(false);
        java.lang.String str12 = room4.getBuildingName();
        room.SensorObserver sensorObserver13 = null;
        room4.removeObserver(sensorObserver13);
        boolean boolean15 = room4.isOccupied();
        room4.setScannedID("Room Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 100");
        java.lang.String str18 = room4.getRoomID();
        boolean boolean19 = room4.isUnderMaintenance();
        room4.setUnderMaintenance(true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10" + "'", str12, "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test22262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22262");
        room.Room room4 = new room.Room("Room hi! - hi! - hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 -  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100", 0, "Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 1 - Room hi! | hi! - hi! | Capacity: 0 - hi!", "");
        room4.notifyObservers();
    }

    @Test
    public void test22263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22263");
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
        java.lang.String str20 = room4.getFullLocation();
        boolean boolean21 = room4.isEnabled();
        room4.setScannedID("Room hi! | hi! - hi! | Capacity: 0 - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! - hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 97 - Room hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 1 - Room hi! | hi! - hi! - Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | Capacity: 0");
        java.lang.String str24 = room4.getBuildingName();
        room4.notifyObservers();
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
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi! - hi!" + "'", str20, "hi! - hi!");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
    }

    @Test
    public void test22264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22264");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        java.lang.String str5 = room4.getScannedID();
        room4.setScannedID("hi!");
        room4.setUnderMaintenance(true);
        room4.setOccupied(true);
        java.lang.String str12 = room4.getRoomID();
        java.lang.String str13 = room4.getBuildingName();
        java.lang.String str14 = room4.getScannedID();
        java.lang.String str15 = room4.getRoomID();
        boolean boolean16 = room4.isOccupied();
        boolean boolean17 = room4.isUnderMaintenance();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test22265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22265");
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
        java.lang.String str18 = room4.getScannedID();
        java.lang.String str19 = room4.getScannedID();
        room.SensorObserver sensorObserver20 = null;
        room4.addObserver(sensorObserver20);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str11, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi! - hi!" + "'", str14, "hi! - hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str15, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test22266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22266");
        room.Room room4 = new room.Room("Room hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 1 - Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 100 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 -  - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! | Capacity: 0", 1, "Room hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 1 - Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | Room hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 1 - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! | Capacity: 97", "Room Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! - hi! - hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: -1 - Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 | hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 0 - hi! - hi! - Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 97 - Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 100 | hi! - hi! - hi! - hi! | Capacity: 0 -  - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi!");
    }

    @Test
    public void test22267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22267");
        room.Room room4 = new room.Room("", (int) (short) 10, "Room hi! | hi! - hi! | Capacity: 0", "hi!");
        java.lang.String str5 = room4.toString();
        java.lang.String str6 = room4.getBuildingName();
        room.SensorObserver sensorObserver7 = null;
        room4.removeObserver(sensorObserver7);
        boolean boolean9 = room4.isEnabled();
        room4.setEnabled(true);
        java.lang.String str12 = room4.getScannedID();
        room4.notifyObservers();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10" + "'", str5, "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str6, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test22268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22268");
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
        room4.setEnabled(false);
        int int23 = room4.getCapacity();
        java.lang.String str24 = room4.getRoomID();
        boolean boolean25 = room4.isUnderMaintenance();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test22269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22269");
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
        java.lang.String str14 = room4.toString();
        room4.notifyObservers();
        boolean boolean16 = room4.isEnabled();
        room.SensorObserver sensorObserver17 = null;
        room4.addObserver(sensorObserver17);
        java.lang.String str19 = room4.toString();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str7, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi! - hi!" + "'", str12, "hi! - hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str14, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str19, "Room hi! | hi! - hi! | Capacity: 0");
    }

    @Test
    public void test22270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22270");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        boolean boolean5 = room4.isOccupied();
        room4.setEnabled(false);
        java.lang.String str8 = room4.toString();
        room4.setUnderMaintenance(true);
        room4.setEnabled(true);
        room4.setScannedID("Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10");
        java.lang.String str15 = room4.getScannedID();
        java.lang.String str16 = room4.getScannedID();
        int int17 = room4.getCapacity();
        room.SensorObserver sensorObserver18 = null;
        room4.addObserver(sensorObserver18);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str8, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10" + "'", str15, "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10" + "'", str16, "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test22271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22271");
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
        room.SensorObserver sensorObserver17 = null;
        room4.addObserver(sensorObserver17);
        room.SensorObserver sensorObserver19 = null;
        room4.addObserver(sensorObserver19);
        java.lang.String str21 = room4.getRoomID();
        java.lang.String str22 = room4.getFullLocation();
        int int23 = room4.getCapacity();
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi! - hi!" + "'", str8, "hi! - hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi! - hi!" + "'", str22, "hi! - hi!");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test22272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22272");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        boolean boolean5 = room4.isOccupied();
        java.lang.String str6 = room4.toString();
        java.lang.String str7 = room4.toString();
        room4.setOccupied(false);
        int int10 = room4.getCapacity();
        room4.setOccupied(true);
        room4.setUnderMaintenance(false);
        java.lang.String str15 = room4.getRoomNumber();
        room4.notifyObservers();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str6, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str7, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test22273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22273");
        room.Room room4 = new room.Room("Room hi! - hi! | Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 10", (int) (short) 10, "Room Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! |  - Room hi! | hi! - hi! | Capacity: 0 - Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: -1", "Room  - Room hi! | hi! - hi! | Capacity: 0 |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 0");
        room.SensorObserver sensorObserver5 = null;
        room4.removeObserver(sensorObserver5);
        room4.setScannedID("Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10");
        room4.setEnabled(false);
    }

    @Test
    public void test22274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22274");
        room.Room room4 = new room.Room("Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10", 1, "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10", "hi! - hi!");
        java.lang.String str5 = room4.getRoomNumber();
        java.lang.String str6 = room4.getRoomID();
        room.SensorObserver sensorObserver7 = null;
        room4.removeObserver(sensorObserver7);
        java.lang.String str9 = room4.getFullLocation();
        room.SensorObserver sensorObserver10 = null;
        room4.addObserver(sensorObserver10);
        room.SensorObserver sensorObserver12 = null;
        room4.addObserver(sensorObserver12);
        java.lang.String str14 = room4.toString();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi! - hi!" + "'", str5, "hi! - hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10" + "'", str6, "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - hi!" + "'", str9, "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - hi! | Capacity: 1" + "'", str14, "Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - hi! | Capacity: 1");
    }

    @Test
    public void test22275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22275");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        java.lang.String str5 = room4.toString();
        room.SensorObserver sensorObserver6 = null;
        room4.addObserver(sensorObserver6);
        room.SensorObserver sensorObserver8 = null;
        room4.addObserver(sensorObserver8);
        int int10 = room4.getCapacity();
        // The following exception was thrown during execution in test generation
        try {
            room4.setScannedID("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str5, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test22276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22276");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        java.lang.String str5 = room4.getBuildingName();
        java.lang.String str6 = room4.getRoomID();
        room4.setUnderMaintenance(false);
        int int9 = room4.getCapacity();
        java.lang.String str10 = room4.getRoomID();
        room.SensorObserver sensorObserver11 = null;
        room4.removeObserver(sensorObserver11);
        int int13 = room4.getCapacity();
        room4.notifyObservers();
        java.lang.String str15 = room4.getFullLocation();
        boolean boolean16 = room4.isEnabled();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi! - hi!" + "'", str15, "hi! - hi!");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test22277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22277");
        room.Room room4 = new room.Room("Room hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 1 - Room hi! | hi! - hi! - Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | Capacity: 0", (int) (short) 100, "Room  - Room hi! | hi! - hi! | Capacity: 0 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 0 - hi!", "hi! - hi!");
        java.lang.String str5 = room4.getBuildingName();
        boolean boolean6 = room4.isOccupied();
        room.SensorObserver sensorObserver7 = null;
        room4.addObserver(sensorObserver7);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Room  - Room hi! | hi! - hi! | Capacity: 0 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 0 - hi!" + "'", str5, "Room  - Room hi! | hi! - hi! | Capacity: 0 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 0 - hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test22278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22278");
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
        room4.setScannedID("Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 | Capacity: 0");
        room4.setScannedID("Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | hi! -  - Room  - Room hi! | hi! - hi! | Capacity: 0 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 0 | Capacity: 10");
        int int24 = room4.getCapacity();
        java.lang.String str25 = room4.getScannedID();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi! - hi!" + "'", str15, "hi! - hi!");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | hi! -  - Room  - Room hi! | hi! - hi! | Capacity: 0 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 0 | Capacity: 10" + "'", str25, "Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | hi! -  - Room  - Room hi! | hi! - hi! | Capacity: 0 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 0 | Capacity: 10");
    }

    @Test
    public void test22279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22279");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        java.lang.String str5 = room4.getScannedID();
        room4.setScannedID("hi!");
        boolean boolean8 = room4.isEnabled();
        room4.setEnabled(false);
        room4.setScannedID("Room hi! | hi! - hi! | Capacity: 0 - hi! - ");
        room4.setOccupied(false);
        room4.notifyObservers();
        java.lang.String str16 = room4.getRoomID();
        room4.setScannedID("Room hi! - hi! | Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 10");
        java.lang.String str19 = room4.getRoomID();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test22280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22280");
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
        boolean boolean16 = room4.isOccupied();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test22281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22281");
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
        room4.setEnabled(false);
        boolean boolean18 = room4.isOccupied();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test22282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22282");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        java.lang.String str5 = room4.getScannedID();
        room4.setScannedID("hi!");
        java.lang.String str8 = room4.getBuildingName();
        room4.setEnabled(false);
        room4.notifyObservers();
        java.lang.String str12 = room4.getBuildingName();
        int int13 = room4.getCapacity();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test22283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22283");
        room.Room room4 = new room.Room("hi!", (int) (byte) 1, "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10", "hi!");
        room4.notifyObservers();
        java.lang.String str6 = room4.getScannedID();
        room4.setOccupied(false);
        boolean boolean9 = room4.isEnabled();
        room4.setUnderMaintenance(true);
        java.lang.String str12 = room4.getBuildingName();
        boolean boolean13 = room4.isOccupied();
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10" + "'", str12, "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test22284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22284");
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
        boolean boolean22 = room4.isOccupied();
        java.lang.String str23 = room4.getRoomID();
        java.lang.Class<?> wildcardClass24 = room4.getClass();
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str11, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test22285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22285");
        room.Room room4 = new room.Room(" - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi!", (int) (short) 100, "Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10", "");
        boolean boolean5 = room4.isUnderMaintenance();
        java.lang.String str6 = room4.getBuildingName();
        java.lang.String str7 = room4.getBuildingName();
        room4.setEnabled(false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10" + "'", str6, "Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10" + "'", str7, "Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10");
    }

    @Test
    public void test22286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22286");
        room.Room room4 = new room.Room("hi! - hi!", 0, "Room hi! | hi! - hi! | Capacity: 0 - hi! - hi!", "");
        room4.notifyObservers();
    }

    @Test
    public void test22287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22287");
        room.Room room4 = new room.Room("hi!", (int) (byte) 1, "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10", "hi!");
        java.lang.String str5 = room4.getRoomNumber();
        java.lang.String str6 = room4.getRoomID();
        room4.setEnabled(false);
        room4.setUnderMaintenance(false);
        boolean boolean11 = room4.isUnderMaintenance();
        room4.setUnderMaintenance(true);
        room.SensorObserver sensorObserver14 = null;
        room4.removeObserver(sensorObserver14);
        java.lang.String str16 = room4.getBuildingName();
        room.SensorObserver sensorObserver17 = null;
        room4.addObserver(sensorObserver17);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10" + "'", str16, "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10");
    }

    @Test
    public void test22288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22288");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        java.lang.String str5 = room4.getScannedID();
        room4.setScannedID("hi!");
        room4.setUnderMaintenance(true);
        java.lang.String str10 = room4.getScannedID();
        room4.setScannedID("Room hi! | hi! - hi! | Capacity: 0 - hi! - ");
        boolean boolean13 = room4.isEnabled();
        java.lang.String str14 = room4.getFullLocation();
        room4.notifyObservers();
        room4.setScannedID("Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 -  - Room hi! | hi! - hi! | Capacity: 0");
        room4.setUnderMaintenance(true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi! - hi!" + "'", str14, "hi! - hi!");
    }

    @Test
    public void test22289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22289");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        java.lang.String str5 = room4.getScannedID();
        room4.setScannedID("hi!");
        java.lang.String str8 = room4.getRoomNumber();
        java.lang.String str9 = room4.getFullLocation();
        room4.setOccupied(false);
        java.lang.String str12 = room4.getFullLocation();
        boolean boolean13 = room4.isEnabled();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi! - hi!" + "'", str9, "hi! - hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi! - hi!" + "'", str12, "hi! - hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test22290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22290");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        java.lang.String str5 = room4.getScannedID();
        room4.setScannedID("hi!");
        boolean boolean8 = room4.isEnabled();
        room.SensorObserver sensorObserver9 = null;
        room4.removeObserver(sensorObserver9);
        room.SensorObserver sensorObserver11 = null;
        room4.addObserver(sensorObserver11);
        int int13 = room4.getCapacity();
        java.lang.String str14 = room4.getFullLocation();
        boolean boolean15 = room4.isEnabled();
        java.lang.String str16 = room4.getBuildingName();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi! - hi!" + "'", str14, "hi! - hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test22291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22291");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        java.lang.String str5 = room4.getScannedID();
        room4.setScannedID("hi!");
        room4.setUnderMaintenance(true);
        boolean boolean10 = room4.isOccupied();
        boolean boolean11 = room4.isOccupied();
        java.lang.String str12 = room4.getFullLocation();
        java.lang.String str13 = room4.getBuildingName();
        int int14 = room4.getCapacity();
        room4.notifyObservers();
        java.lang.String str16 = room4.getRoomID();
        java.lang.String str17 = room4.getBuildingName();
        room4.notifyObservers();
        room4.setEnabled(false);
        room4.setEnabled(true);
        java.lang.String str23 = room4.getRoomNumber();
        room4.setScannedID("Room Room  | Room Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! - hi! - hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: -1 - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 | Capacity: 97 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 1 - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! | Capacity: 1");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi! - hi!" + "'", str12, "hi! - hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
    }

    @Test
    public void test22292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22292");
        room.Room room4 = new room.Room("hi! - hi! - hi!", (int) (byte) 0, "Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | hi! - hi! - hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 0", "Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10");
        room4.setOccupied(true);
        java.lang.String str7 = room4.getRoomNumber();
        room4.setOccupied(true);
        java.lang.String str10 = room4.getBuildingName();
        java.lang.String str11 = room4.getScannedID();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10" + "'", str7, "Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | hi! - hi! - hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 0" + "'", str10, "Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | hi! - hi! - hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 0");
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test22293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22293");
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
        java.lang.Class<?> wildcardClass16 = room4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str5, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test22294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22294");
        room.Room room4 = new room.Room("", (int) (byte) 100, "Room hi! | hi! - hi! | Capacity: 0 - hi!", "");
        boolean boolean5 = room4.isEnabled();
        java.lang.String str6 = room4.getFullLocation();
        room4.setEnabled(false);
        java.lang.String str9 = room4.toString();
        room.SensorObserver sensorObserver10 = null;
        room4.addObserver(sensorObserver10);
        boolean boolean12 = room4.isUnderMaintenance();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0 - hi! - " + "'", str6, "Room hi! | hi! - hi! | Capacity: 0 - hi! - ");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 100" + "'", str9, "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 100");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test22295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22295");
        room.Room room4 = new room.Room("hi!", 1, "Room hi! | hi! - hi! | Capacity: 0 - hi!", "Room hi! | hi! - hi! | Capacity: 0 - hi!");
        int int5 = room4.getCapacity();
        room4.setUnderMaintenance(false);
        java.lang.String str8 = room4.toString();
        int int9 = room4.getCapacity();
        room4.setScannedID("hi!");
        room4.setEnabled(true);
        room4.setOccupied(false);
        room4.setEnabled(false);
        room4.setScannedID("");
        java.lang.String str20 = room4.getFullLocation();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Room hi! | Room hi! | hi! - hi! | Capacity: 0 - hi! - Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 1" + "'", str8, "Room hi! | Room hi! | hi! - hi! | Capacity: 0 - hi! - Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 1");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0 - hi! - Room hi! | hi! - hi! | Capacity: 0 - hi!" + "'", str20, "Room hi! | hi! - hi! | Capacity: 0 - hi! - Room hi! | hi! - hi! | Capacity: 0 - hi!");
    }

    @Test
    public void test22296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22296");
        room.Room room4 = new room.Room("Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10", (int) ' ', "Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi!", "Room hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 1");
        java.lang.Class<?> wildcardClass5 = room4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test22297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22297");
        room.Room room4 = new room.Room("hi!", (int) (byte) 100, "", "Room hi! | hi! - hi! | Capacity: 0");
        room4.setScannedID("");
        boolean boolean7 = room4.isUnderMaintenance();
        java.lang.String str8 = room4.getScannedID();
        boolean boolean9 = room4.isUnderMaintenance();
        room4.setUnderMaintenance(false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test22298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22298");
        room.Room room4 = new room.Room("Room  - Room hi! | hi! - hi! | Capacity: 0 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 0", (int) (short) 0, "hi! - hi! - Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100", " - hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10");
        java.lang.String str5 = room4.getScannedID();
        boolean boolean6 = room4.isEnabled();
        java.lang.String str7 = room4.getScannedID();
        int int8 = room4.getCapacity();
        boolean boolean9 = room4.isOccupied();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test22299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22299");
        room.Room room4 = new room.Room("Room  - hi! - hi! - Room hi! | hi! - hi! | Capacity: 0 | Room hi! -  | Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 10 - hi! - hi! - Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 - Room Room hi! - hi! - Room hi! | hi! - hi! | Capacity: 0 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 100 | Capacity: 10 | Room hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 1 - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | Capacity: 97", 100, "Room  | Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 1", "Room hi! | hi! - hi! | Capacity: 0 - hi! - hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10");
        room.SensorObserver sensorObserver5 = null;
        room4.removeObserver(sensorObserver5);
        int int7 = room4.getCapacity();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
    }

    @Test
    public void test22300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22300");
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
        room4.setOccupied(true);
        java.lang.String str20 = room4.getBuildingName();
        boolean boolean21 = room4.isEnabled();
        java.lang.String str22 = room4.getScannedID();
        boolean boolean23 = room4.isEnabled();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str15, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 100 - Room hi! | hi! - hi! | Capacity: 0 - hi! - " + "'", str22, "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 100 - Room hi! | hi! - hi! | Capacity: 0 - hi! - ");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test22301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22301");
        room.Room room4 = new room.Room("Room hi! | hi! - hi! - Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | Capacity: 0", 97, "Room Room hi! | hi! - hi! | Capacity: 0 | hi! - hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 97", "Room hi! | Room hi! | hi! - hi! | Capacity: 0 - hi! - Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 1");
        boolean boolean5 = room4.isEnabled();
        java.lang.String str6 = room4.getScannedID();
        java.lang.String str7 = room4.getFullLocation();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Room Room hi! | hi! - hi! | Capacity: 0 | hi! - hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 97 - Room hi! | Room hi! | hi! - hi! | Capacity: 0 - hi! - Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 1" + "'", str7, "Room Room hi! | hi! - hi! | Capacity: 0 | hi! - hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 97 - Room hi! | Room hi! | hi! - hi! | Capacity: 0 - hi! - Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 1");
    }

    @Test
    public void test22302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22302");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        room.SensorObserver sensorObserver5 = null;
        room4.addObserver(sensorObserver5);
        java.lang.String str7 = room4.toString();
        java.lang.String str8 = room4.toString();
        room.SensorObserver sensorObserver9 = null;
        room4.addObserver(sensorObserver9);
        room.SensorObserver sensorObserver11 = null;
        room4.removeObserver(sensorObserver11);
        room.SensorObserver sensorObserver13 = null;
        room4.removeObserver(sensorObserver13);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str7, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str8, "Room hi! | hi! - hi! | Capacity: 0");
    }

    @Test
    public void test22303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22303");
        room.Room room4 = new room.Room("Room Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 100", 32, "Room Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 100", "Room Room hi! | hi! - hi! | Capacity: 0 |  - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 0");
        java.lang.String str5 = room4.toString();
        int int6 = room4.getCapacity();
        room4.setScannedID("Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10");
        java.lang.String str9 = room4.getScannedID();
        room4.setUnderMaintenance(true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Room Room Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 100 | Room Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 100 - Room Room hi! | hi! - hi! | Capacity: 0 |  - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 0 | Capacity: 32" + "'", str5, "Room Room Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 100 | Room Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 100 - Room Room hi! | hi! - hi! | Capacity: 0 |  - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 0 | Capacity: 32");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10" + "'", str9, "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10");
    }

    @Test
    public void test22304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22304");
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
        java.lang.String str18 = room4.getBuildingName();
        java.lang.String str19 = room4.getScannedID();
        java.lang.String str20 = room4.getRoomID();
        room.SensorObserver sensorObserver21 = null;
        room4.addObserver(sensorObserver21);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi! - hi!" + "'", str11, "hi! - hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi!" + "'", str19, "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test22305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22305");
        room.Room room4 = new room.Room("", 97, "Room hi! | hi! - hi! | Capacity: 0 - hi! - hi! - Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | hi! -  - Room  - Room hi! | hi! - hi! | Capacity: 0 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 0 | Capacity: 10", "Room Room  - Room hi! | hi! - hi! | Capacity: 0 | Room Room hi! | hi! - hi! | Capacity: 0 | hi! - hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 97 - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! | Capacity: 52 | Room hi! -  | Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 10 -  - Room Room hi! | hi! - hi! | Capacity: 0 | Room hi! | hi! - hi! | Capacity: 0 - hi! - hi! | Capacity: 100 - hi! - hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 1");
    }

    @Test
    public void test22306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22306");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        java.lang.String str5 = room4.getScannedID();
        room4.setScannedID("hi!");
        boolean boolean8 = room4.isEnabled();
        room4.setEnabled(false);
        room4.setOccupied(true);
        boolean boolean13 = room4.isEnabled();
        boolean boolean14 = room4.isUnderMaintenance();
        room4.setOccupied(true);
        room4.setEnabled(false);
        room4.setScannedID("Room hi! | hi! - hi! | Capacity: 0 - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test22307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22307");
        room.Room room4 = new room.Room("Room  | Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! | Capacity: 1", 97, "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 100 - Room hi! | hi! - hi! | Capacity: 0 - hi! - ", "Room hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 1");
        java.lang.String str5 = room4.getRoomNumber();
        room4.setScannedID("Room Room hi! | hi! - hi! | Capacity: 0 - hi! | Room hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 1 -  | Capacity: 1");
        room4.setUnderMaintenance(true);
        room4.setScannedID("Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | hi! - hi! | Capacity: 0 - hi! - ");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Room hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 1" + "'", str5, "Room hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 1");
    }

    @Test
    public void test22308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22308");
        room.Room room4 = new room.Room(" - Room hi! | hi! - hi! - Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | Capacity: 0 -  - hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10", 0, "Room Room  | Room Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! - hi! - hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: -1 - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 | Capacity: 97 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 1 - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! | Capacity: 1", "Room Room Room Room hi! | hi! - hi! | Capacity: 0 | Room hi! | hi! - hi! | Capacity: 0 - hi! - hi! | Capacity: 100 | hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 100 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 0 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! -  | hi! - Room hi! | hi! - hi! | Capacity: 0 - Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 100 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: -1 | Capacity: 100 | Capacity: 1");
    }

    @Test
    public void test22309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22309");
        room.Room room4 = new room.Room(" - Room hi! | hi! - hi! | Capacity: 0 - Room hi! -  | Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 10 - hi! - hi! - Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100", (int) (short) 100, "Room  - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! | Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 -  | Capacity: 100", "Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 | Room Room hi! | hi! - hi! | Capacity: 0 | Room hi! | hi! - hi! | Capacity: 0 - hi! - hi! | Capacity: 100 - hi! - hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 0");
        room4.setScannedID("Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10");
    }

    @Test
    public void test22310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22310");
        room.Room room4 = new room.Room("", 0, "Room Room Room  - Room hi! | hi! - hi! | Capacity: 0 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 0 | hi! - hi! - Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 -  - hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 0 | hi! -  - Room  - Room hi! | hi! - hi! | Capacity: 0 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 0 - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! | Capacity: 0", "Room Room hi! | hi! - hi! | Capacity: 0 - hi! - hi! - Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | hi! -  - Room  - Room hi! | hi! - hi! | Capacity: 0 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 0 | Capacity: 10 | hi! -  - Room  - Room hi! | hi! - hi! | Capacity: 0 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 0 - hi! -  - Room  - Room hi! | hi! - hi! | Capacity: 0 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 0 | Capacity: 100");
        boolean boolean5 = room4.isEnabled();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test22311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22311");
        room.Room room4 = new room.Room("", (int) (short) 10, "Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 1", "Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100");
        room4.setUnderMaintenance(true);
        room4.setUnderMaintenance(true);
    }

    @Test
    public void test22312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22312");
        room.Room room4 = new room.Room("Room Room Room hi! | hi! - hi! | Capacity: 0 | Room hi! | hi! - hi! | Capacity: 0 - hi! - hi! | Capacity: 100 |  - hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 10", (int) (short) 10, "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi!", "Room  - Room hi! | hi! - hi! | Capacity: 0 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 0 - hi!");
        java.lang.String str5 = room4.getScannedID();
        room4.notifyObservers();
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test22313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22313");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        room.SensorObserver sensorObserver5 = null;
        room4.addObserver(sensorObserver5);
        java.lang.String str7 = room4.getFullLocation();
        boolean boolean8 = room4.isUnderMaintenance();
        java.lang.String str9 = room4.getRoomID();
        boolean boolean10 = room4.isOccupied();
        room.SensorObserver sensorObserver11 = null;
        room4.removeObserver(sensorObserver11);
        java.lang.String str13 = room4.getBuildingName();
        room4.setOccupied(true);
        java.lang.String str16 = room4.getBuildingName();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi! - hi!" + "'", str7, "hi! - hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test22314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22314");
        room.Room room4 = new room.Room("Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi!", (int) (byte) 100, "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10", "hi! - hi! - hi!");
        boolean boolean5 = room4.isUnderMaintenance();
        java.lang.String str6 = room4.getBuildingName();
        java.lang.String str7 = room4.getBuildingName();
        boolean boolean8 = room4.isUnderMaintenance();
        java.lang.String str9 = room4.getRoomNumber();
        java.lang.String str10 = room4.getFullLocation();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10" + "'", str6, "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10" + "'", str7, "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi! - hi! - hi!" + "'", str9, "hi! - hi! - hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - hi! - hi!" + "'", str10, "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - hi! - hi!");
    }

    @Test
    public void test22315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22315");
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
        room4.setUnderMaintenance(false);
        java.lang.String str16 = room4.getRoomID();
        room4.setEnabled(false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test22316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22316");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        room.SensorObserver sensorObserver5 = null;
        room4.addObserver(sensorObserver5);
        java.lang.String str7 = room4.toString();
        room.SensorObserver sensorObserver8 = null;
        room4.removeObserver(sensorObserver8);
        int int10 = room4.getCapacity();
        java.lang.String str11 = room4.getRoomID();
        java.lang.String str12 = room4.toString();
        room4.setEnabled(false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str7, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str12, "Room hi! | hi! - hi! | Capacity: 0");
    }

    @Test
    public void test22317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22317");
        room.Room room4 = new room.Room("Room Room hi! | hi! - hi! | Capacity: 0 | Room hi! | hi! - hi! | Capacity: 0 - hi! - hi! | Capacity: 100", (int) (byte) 10, "", "hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10");
        room4.setEnabled(false);
        java.lang.String str7 = room4.getFullLocation();
        java.lang.String str8 = room4.getRoomNumber();
        java.lang.String str9 = room4.getRoomID();
        int int10 = room4.getCapacity();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + " - hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10" + "'", str7, " - hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10" + "'", str8, "hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Room Room hi! | hi! - hi! | Capacity: 0 | Room hi! | hi! - hi! | Capacity: 0 - hi! - hi! | Capacity: 100" + "'", str9, "Room Room hi! | hi! - hi! | Capacity: 0 | Room hi! | hi! - hi! | Capacity: 0 - hi! - hi! | Capacity: 100");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
    }

    @Test
    public void test22318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22318");
        room.Room room4 = new room.Room("Room hi! - hi! - hi! | Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | hi! - hi! - hi! | Capacity: 0 - Room hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 1 - Room hi! | hi! - hi! - Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | Capacity: 0 | Capacity: 0", (int) (short) -1, "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 1", "Room Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 97 | Room hi! | hi! - hi! | Capacity: 0 - hi! -  - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 | Capacity: 100 - Room Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! |  - Room hi! | hi! - hi! | Capacity: 0 - Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: -1 - Room  - Room hi! | hi! - hi! | Capacity: 0 |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 0");
    }

    @Test
    public void test22319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22319");
        room.Room room4 = new room.Room("Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100", (int) (short) 1, "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi!", "Room hi! | hi! - hi! | Capacity: 0");
        room4.notifyObservers();
        room4.setEnabled(false);
        room4.setEnabled(true);
        boolean boolean10 = room4.isEnabled();
        java.lang.String str11 = room4.getRoomID();
        room4.setUnderMaintenance(false);
        java.lang.String str14 = room4.toString();
        java.lang.Class<?> wildcardClass15 = room4.getClass();
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100" + "'", str11, "Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 1" + "'", str14, "Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 1");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test22320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22320");
        room.Room room4 = new room.Room("Room hi! | hi! - hi! | Capacity: 0", (int) (byte) 100, "Room hi! | hi! - hi! | Capacity: 0 - hi!", "hi!");
        java.lang.String str5 = room4.getRoomID();
        int int6 = room4.getCapacity();
        room.SensorObserver sensorObserver7 = null;
        room4.addObserver(sensorObserver7);
        boolean boolean9 = room4.isUnderMaintenance();
        boolean boolean10 = room4.isEnabled();
        boolean boolean11 = room4.isOccupied();
        java.lang.String str12 = room4.getRoomNumber();
        boolean boolean13 = room4.isUnderMaintenance();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str5, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test22321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22321");
        room.Room room4 = new room.Room("Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 | hi! - Room hi! | hi! - hi! | Capacity: 0 - Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 97 | Capacity: 35", (int) (short) 1, "Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 1", "Room  - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 100 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 | Capacity: 1");
        room4.notifyObservers();
    }

    @Test
    public void test22322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22322");
        room.Room room4 = new room.Room("", (int) (short) 10, "Room hi! | hi! - hi! | Capacity: 0", "hi!");
        java.lang.String str5 = room4.toString();
        room4.setUnderMaintenance(true);
        room4.setScannedID("");
        room4.setEnabled(true);
        java.lang.String str12 = room4.getRoomID();
        java.lang.String str13 = room4.getBuildingName();
        java.lang.String str14 = room4.getBuildingName();
        java.lang.String str15 = room4.getBuildingName();
        int int16 = room4.getCapacity();
        java.lang.String str17 = room4.getBuildingName();
        java.lang.String str18 = room4.getRoomNumber();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10" + "'", str5, "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str13, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str14, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str15, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str17, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test22323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22323");
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
        room4.setUnderMaintenance(true);
        java.lang.String str20 = room4.getFullLocation();
        java.lang.String str21 = room4.getRoomID();
        room.SensorObserver sensorObserver22 = null;
        room4.addObserver(sensorObserver22);
        java.lang.String str24 = room4.getFullLocation();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str7, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str10, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi! - hi!" + "'", str20, "hi! - hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi! - hi!" + "'", str24, "hi! - hi!");
    }

    @Test
    public void test22324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22324");
        room.Room room4 = new room.Room("Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10", 0, "hi!", "Room hi! | hi! - hi! | Capacity: 0");
        room4.setUnderMaintenance(false);
        room4.setOccupied(true);
        room.SensorObserver sensorObserver9 = null;
        room4.addObserver(sensorObserver9);
        java.lang.String str11 = room4.getFullLocation();
        java.lang.String str12 = room4.toString();
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi! - Room hi! | hi! - hi! | Capacity: 0" + "'", str11, "hi! - Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 | hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 0" + "'", str12, "Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 | hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 0");
    }

    @Test
    public void test22325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22325");
        room.Room room4 = new room.Room("Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10", (int) (byte) -1, "hi!", "Room Room hi! | hi! - hi! | Capacity: 0 | Room hi! | hi! - hi! | Capacity: 0 - hi! - hi! | Capacity: 100");
        room.SensorObserver sensorObserver5 = null;
        room4.addObserver(sensorObserver5);
        int int7 = room4.getCapacity();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test22326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22326");
        room.Room room4 = new room.Room("Room Room Room hi! | hi! - hi! | Capacity: 0 | Room hi! | hi! - hi! | Capacity: 0 - hi! - hi! | Capacity: 100 |  - hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 10", (int) (byte) 100, "Room Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! - hi! - hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: -1 - Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 | hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 0 - hi! - hi! - Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 97", "Room  - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 100 | hi! - hi! - hi! - hi! | Capacity: 0 | Capacity: 0");
        room4.notifyObservers();
        java.lang.String str6 = room4.getBuildingName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Room Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! - hi! - hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: -1 - Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 | hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 0 - hi! - hi! - Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 97" + "'", str6, "Room Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! - hi! - hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: -1 - Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 | hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 0 - hi! - hi! - Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 97");
    }

    @Test
    public void test22327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22327");
        room.Room room4 = new room.Room("Room hi! | hi! - hi! | Capacity: 0", (int) (byte) 10, "hi!", "");
        int int5 = room4.getCapacity();
        java.lang.String str6 = room4.getScannedID();
        java.lang.String str7 = room4.getBuildingName();
        boolean boolean8 = room4.isUnderMaintenance();
        room.SensorObserver sensorObserver9 = null;
        room4.addObserver(sensorObserver9);
        room.SensorObserver sensorObserver11 = null;
        room4.removeObserver(sensorObserver11);
        room.SensorObserver sensorObserver13 = null;
        room4.addObserver(sensorObserver13);
        java.lang.String str15 = room4.getRoomID();
        int int16 = room4.getCapacity();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str15, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
    }

    @Test
    public void test22328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22328");
        room.Room room4 = new room.Room("Room Room hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 1 | Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! - Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: -1", 10, "Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10", "hi! - hi! - hi! - hi!");
        java.lang.String str5 = room4.getScannedID();
        java.lang.String str6 = room4.getScannedID();
        int int7 = room4.getCapacity();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
    }

    @Test
    public void test22329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22329");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        boolean boolean5 = room4.isOccupied();
        room4.setEnabled(false);
        java.lang.String str8 = room4.getFullLocation();
        room4.setOccupied(false);
        java.lang.String str11 = room4.getFullLocation();
        int int12 = room4.getCapacity();
        int int13 = room4.getCapacity();
        java.lang.String str14 = room4.toString();
        room4.setOccupied(false);
        java.lang.String str17 = room4.getRoomNumber();
        room4.setEnabled(false);
        room4.setEnabled(true);
        int int22 = room4.getCapacity();
        boolean boolean23 = room4.isOccupied();
        boolean boolean24 = room4.isUnderMaintenance();
        room.SensorObserver sensorObserver25 = null;
        room4.addObserver(sensorObserver25);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi! - hi!" + "'", str8, "hi! - hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi! - hi!" + "'", str11, "hi! - hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str14, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test22330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22330");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        java.lang.String str5 = room4.getScannedID();
        room4.setScannedID("hi!");
        room4.setUnderMaintenance(true);
        boolean boolean10 = room4.isOccupied();
        java.lang.String str11 = room4.toString();
        boolean boolean12 = room4.isEnabled();
        room.SensorObserver sensorObserver13 = null;
        room4.removeObserver(sensorObserver13);
        java.lang.String str15 = room4.getRoomNumber();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str11, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test22331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22331");
        room.Room room4 = new room.Room("hi!", (int) (byte) 100, "", "Room hi! | hi! - hi! | Capacity: 0");
        java.lang.String str5 = room4.getScannedID();
        java.lang.String str6 = room4.getBuildingName();
        room4.setScannedID("Room hi! | hi! - hi! | Capacity: 0");
        java.lang.String str9 = room4.getBuildingName();
        room4.setEnabled(false);
        java.lang.String str12 = room4.toString();
        room.SensorObserver sensorObserver13 = null;
        room4.addObserver(sensorObserver13);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100" + "'", str12, "Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100");
    }

    @Test
    public void test22332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22332");
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
        java.lang.String str16 = room4.getRoomID();
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str11, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test22333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22333");
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
        boolean boolean19 = room4.isUnderMaintenance();
        // The following exception was thrown during execution in test generation
        try {
            room4.notifyObservers();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test22334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22334");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        boolean boolean5 = room4.isOccupied();
        java.lang.String str6 = room4.toString();
        java.lang.String str7 = room4.toString();
        java.lang.String str8 = room4.toString();
        java.lang.String str9 = room4.toString();
        room4.setScannedID("Room hi! | hi! - hi! | Capacity: 0 - hi! - hi!");
        java.lang.String str12 = room4.getFullLocation();
        java.lang.String str13 = room4.getRoomID();
        java.lang.String str14 = room4.getFullLocation();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str6, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str7, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str8, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str9, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi! - hi!" + "'", str12, "hi! - hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi! - hi!" + "'", str14, "hi! - hi!");
    }

    @Test
    public void test22335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22335");
        room.Room room4 = new room.Room("Room hi! | hi! - hi! | Capacity: 0 - hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! - hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 97", (int) (short) 100, "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room hi! | hi! - hi! | Capacity: 0", "hi!");
        room4.setEnabled(true);
        java.lang.String str7 = room4.getRoomNumber();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test22336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22336");
        room.Room room4 = new room.Room("Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10", 0, "hi!", "Room hi! | hi! - hi! | Capacity: 0");
        room4.setScannedID("Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100");
        room4.notifyObservers();
        int int8 = room4.getCapacity();
        room4.setEnabled(true);
        room4.notifyObservers();
        int int12 = room4.getCapacity();
        java.lang.String str13 = room4.getScannedID();
        boolean boolean14 = room4.isOccupied();
        room4.notifyObservers();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100" + "'", str13, "Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test22337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22337");
        room.Room room4 = new room.Room("hi!", (int) (byte) 100, "", "Room hi! | hi! - hi! | Capacity: 0");
        java.lang.String str5 = room4.getRoomNumber();
        boolean boolean6 = room4.isEnabled();
        room.SensorObserver sensorObserver7 = null;
        room4.removeObserver(sensorObserver7);
        java.lang.String str9 = room4.getRoomID();
        java.lang.String str10 = room4.getFullLocation();
        room4.setEnabled(false);
        room.SensorObserver sensorObserver13 = null;
        room4.addObserver(sensorObserver13);
        room.SensorObserver sensorObserver15 = null;
        room4.addObserver(sensorObserver15);
        room.SensorObserver sensorObserver17 = null;
        room4.addObserver(sensorObserver17);
        // The following exception was thrown during execution in test generation
        try {
            room4.setEnabled(false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str5, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + " - Room hi! | hi! - hi! | Capacity: 0" + "'", str10, " - Room hi! | hi! - hi! | Capacity: 0");
    }

    @Test
    public void test22338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22338");
        room.Room room4 = new room.Room("", (int) (short) 10, "Room hi! | hi! - hi! | Capacity: 0", "hi!");
        room4.setScannedID("");
        room4.setScannedID("Room  - hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Room Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! - hi! - hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: -1 - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! | Capacity: 100 - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 -  - Room hi! | hi! - hi! | Capacity: 0 - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! - ");
        boolean boolean9 = room4.isEnabled();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test22339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22339");
        room.Room room4 = new room.Room("hi!", (int) (byte) 100, "", "Room hi! | hi! - hi! | Capacity: 0");
        java.lang.String str5 = room4.toString();
        java.lang.String str6 = room4.getFullLocation();
        room.SensorObserver sensorObserver7 = null;
        room4.removeObserver(sensorObserver7);
        room.SensorObserver sensorObserver9 = null;
        room4.addObserver(sensorObserver9);
        java.lang.String str11 = room4.getBuildingName();
        java.lang.String str12 = room4.getScannedID();
        boolean boolean13 = room4.isEnabled();
        java.lang.String str14 = room4.getRoomNumber();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100" + "'", str5, "Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + " - Room hi! | hi! - hi! | Capacity: 0" + "'", str6, " - Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str14, "Room hi! | hi! - hi! | Capacity: 0");
    }

    @Test
    public void test22340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22340");
        room.Room room4 = new room.Room("Room hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 1 - Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | hi! -  - Room  - Room hi! | hi! - hi! | Capacity: 0 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 0 | Capacity: 10", (int) (short) 0, "hi! - hi!", "Room Room hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 1 | Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! - Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: -1 - Room hi! | hi! - hi! | Capacity: 0 - hi! - ");
        room.SensorObserver sensorObserver5 = null;
        room4.removeObserver(sensorObserver5);
        room4.setScannedID("Room Room hi! | hi! - hi! | Capacity: 0 - hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! - hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 97 | Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 100 | hi! - hi! - hi! - hi! | Capacity: 0 - Room Room hi! | hi! - hi! | Capacity: 0 - hi! |  - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 | Capacity: 1 | Capacity: -1");
        room.SensorObserver sensorObserver9 = null;
        room4.addObserver(sensorObserver9);
    }

    @Test
    public void test22341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22341");
        room.Room room4 = new room.Room("hi! - ", (int) (byte) 10, "Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10", "Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10");
        room4.notifyObservers();
        room4.setScannedID("Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10");
        java.lang.String str8 = room4.getRoomID();
        boolean boolean9 = room4.isUnderMaintenance();
        java.lang.String str10 = room4.getBuildingName();
        boolean boolean11 = room4.isOccupied();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi! - " + "'", str8, "hi! - ");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10" + "'", str10, "Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test22342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22342");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        room.SensorObserver sensorObserver5 = null;
        room4.addObserver(sensorObserver5);
        java.lang.String str7 = room4.getScannedID();
        room.SensorObserver sensorObserver8 = null;
        room4.removeObserver(sensorObserver8);
        java.lang.String str10 = room4.getRoomNumber();
        java.lang.String str11 = room4.toString();
        room4.setEnabled(false);
        java.lang.String str14 = room4.getRoomID();
        java.lang.String str15 = room4.toString();
        java.lang.String str16 = room4.toString();
        boolean boolean17 = room4.isOccupied();
        java.lang.String str18 = room4.getRoomID();
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str11, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str15, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str16, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test22343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22343");
        room.Room room4 = new room.Room("hi!", (int) (byte) 100, "", "Room hi! | hi! - hi! | Capacity: 0");
        room4.setScannedID("");
        boolean boolean7 = room4.isUnderMaintenance();
        room4.setUnderMaintenance(false);
        boolean boolean10 = room4.isUnderMaintenance();
        int int11 = room4.getCapacity();
        boolean boolean12 = room4.isEnabled();
        int int13 = room4.getCapacity();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
    }

    @Test
    public void test22344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22344");
        room.Room room4 = new room.Room("Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 | hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 0 - hi! - hi! - Room hi! | hi! - hi! | Capacity: 0 - Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 1", (-1), "Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! - Room hi! | hi! - hi! | Capacity: 0 - hi!", "hi! - hi! - Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | hi! - hi! | Capacity: 0 - hi! - ");
        room.SensorObserver sensorObserver5 = null;
        room4.removeObserver(sensorObserver5);
    }

    @Test
    public void test22345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22345");
        room.Room room4 = new room.Room("hi!", (int) '#', "Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10", "Room hi! | hi! - hi! | Capacity: 0 - hi!");
        room4.setUnderMaintenance(false);
        room4.notifyObservers();
        room4.setOccupied(false);
        room4.notifyObservers();
    }

    @Test
    public void test22346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22346");
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
        room.SensorObserver sensorObserver19 = null;
        room4.removeObserver(sensorObserver19);
        java.lang.String str21 = room4.getScannedID();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str7, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi! - hi!" + "'", str12, "hi! - hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi!" + "'", str21, "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi!");
    }

    @Test
    public void test22347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22347");
        room.Room room4 = new room.Room("Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10", (-1), "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi!", "Room Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 100 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 -  - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! | Capacity: 0 | hi! -  - Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 1 - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 10");
    }

    @Test
    public void test22348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22348");
        room.Room room4 = new room.Room("Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi!", (int) (byte) 100, "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10", "hi! - hi! - hi!");
        boolean boolean5 = room4.isUnderMaintenance();
        boolean boolean6 = room4.isOccupied();
        room4.setOccupied(false);
        java.lang.Class<?> wildcardClass9 = room4.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test22349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22349");
        room.Room room4 = new room.Room("Room hi! | hi! - hi! | Capacity: 0", (int) 'a', "hi!", "hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10");
        java.lang.String str5 = room4.toString();
        room4.notifyObservers();
        java.lang.String str7 = room4.getFullLocation();
        room4.setScannedID("Room Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 97 | Room hi! | hi! - hi! | Capacity: 0 - hi! -  - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 | Capacity: 100 - Room Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! |  - Room hi! | hi! - hi! | Capacity: 0 - Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: -1 - Room  - Room hi! | hi! - hi! | Capacity: 0 |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Room Room hi! | hi! - hi! | Capacity: 0 | hi! - hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 97" + "'", str5, "Room Room hi! | hi! - hi! | Capacity: 0 | hi! - hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 97");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi! - hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10" + "'", str7, "hi! - hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10");
    }

    @Test
    public void test22350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22350");
        room.Room room4 = new room.Room("Room Room Room hi! | hi! - hi! | Capacity: 0 - hi! | Room hi! | Room hi! | hi! - hi! | Capacity: 0 - hi! - Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 1 - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 32 | Room Room Room hi! | hi! - hi! | Capacity: 0 | Room hi! | hi! - hi! | Capacity: 0 - hi! - hi! | Capacity: 100 |  - hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 10 - Room Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 100 | Capacity: 10", (int) (byte) 0, "Room hi! | Room hi! | hi! - hi! | Capacity: 0 - hi! - Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 1 - Room hi! | hi! - hi! | Capacity: 0 - hi! - ", "Room hi! - hi! - hi! | hi! - hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 1 - Room Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! - hi! - hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: -1 - Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 | hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 0");
    }

    @Test
    public void test22351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22351");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        boolean boolean5 = room4.isOccupied();
        room4.setEnabled(false);
        java.lang.String str8 = room4.toString();
        java.lang.String str9 = room4.getFullLocation();
        room.SensorObserver sensorObserver10 = null;
        room4.addObserver(sensorObserver10);
        boolean boolean12 = room4.isOccupied();
        boolean boolean13 = room4.isEnabled();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str8, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi! - hi!" + "'", str9, "hi! - hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test22352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22352");
        room.Room room4 = new room.Room("", (int) (short) 10, "Room hi! | hi! - hi! | Capacity: 0", "hi!");
        java.lang.String str5 = room4.toString();
        java.lang.String str6 = room4.getBuildingName();
        room.SensorObserver sensorObserver7 = null;
        room4.removeObserver(sensorObserver7);
        boolean boolean9 = room4.isEnabled();
        java.lang.Class<?> wildcardClass10 = room4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10" + "'", str5, "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str6, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test22353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22353");
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
        boolean boolean22 = room4.isEnabled();
        boolean boolean23 = room4.isOccupied();
        room.SensorObserver sensorObserver24 = null;
        room4.removeObserver(sensorObserver24);
        java.lang.String str26 = room4.getRoomID();
        java.lang.String str27 = room4.getScannedID();
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
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertNull(str27);
    }

    @Test
    public void test22354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22354");
        room.Room room4 = new room.Room("hi!", (int) (byte) 1, "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10", "hi!");
        room4.notifyObservers();
        room4.setOccupied(false);
        room4.notifyObservers();
        room4.setEnabled(true);
        java.lang.String str11 = room4.getRoomID();
        room4.setScannedID("hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10");
        boolean boolean14 = room4.isUnderMaintenance();
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test22355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22355");
        room.Room room4 = new room.Room("hi!", (int) (short) 0, "hi! - hi!", "Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100");
        java.lang.String str5 = room4.getScannedID();
        java.lang.String str6 = room4.toString();
        room4.setUnderMaintenance(false);
        java.lang.String str9 = room4.getBuildingName();
        java.lang.String str10 = room4.getRoomNumber();
        room4.setUnderMaintenance(true);
        room.SensorObserver sensorObserver13 = null;
        room4.removeObserver(sensorObserver13);
        boolean boolean15 = room4.isUnderMaintenance();
        boolean boolean16 = room4.isEnabled();
        room4.notifyObservers();
        int int18 = room4.getCapacity();
        boolean boolean19 = room4.isOccupied();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Room hi! | hi! - hi! - Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | Capacity: 0" + "'", str6, "Room hi! | hi! - hi! - Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi! - hi!" + "'", str9, "hi! - hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100" + "'", str10, "Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test22356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22356");
        room.Room room4 = new room.Room("hi!", (int) (byte) 1, "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10", "hi!");
        room4.notifyObservers();
        java.lang.String str6 = room4.getScannedID();
        boolean boolean7 = room4.isOccupied();
        room.SensorObserver sensorObserver8 = null;
        room4.addObserver(sensorObserver8);
        // The following exception was thrown during execution in test generation
        try {
            room4.setUnderMaintenance(true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test22357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22357");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        java.lang.String str5 = room4.getScannedID();
        room4.setScannedID("hi!");
        boolean boolean8 = room4.isEnabled();
        int int9 = room4.getCapacity();
        boolean boolean10 = room4.isOccupied();
        room4.notifyObservers();
        boolean boolean12 = room4.isEnabled();
        java.lang.String str13 = room4.toString();
        boolean boolean14 = room4.isEnabled();
        room4.setScannedID("Room  | Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 100 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 -  - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! | Capacity: 0 - Room Room hi! | hi! - hi! | Capacity: 0 - hi! - hi! | Room Room hi! | hi! - hi! | Capacity: 0 | Room hi! | hi! - hi! | Capacity: 0 - hi! - hi! | Capacity: 100 - Room  - Room hi! | hi! - hi! | Capacity: 0 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 0 | Capacity: 10 | Capacity: 0");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str13, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test22358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22358");
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
        room4.setOccupied(false);
        boolean boolean20 = room4.isUnderMaintenance();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi! - hi!" + "'", str11, "hi! - hi!");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi! - hi!" + "'", str17, "hi! - hi!");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test22359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22359");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        java.lang.String str5 = room4.getBuildingName();
        java.lang.String str6 = room4.getRoomID();
        room4.setUnderMaintenance(false);
        int int9 = room4.getCapacity();
        room.SensorObserver sensorObserver10 = null;
        room4.removeObserver(sensorObserver10);
        boolean boolean12 = room4.isOccupied();
        room4.setScannedID("Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | Room hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 1 - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! | Capacity: 97");
        room4.setUnderMaintenance(true);
        room4.setEnabled(true);
        room4.setOccupied(false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test22360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22360");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        room.SensorObserver sensorObserver5 = null;
        room4.addObserver(sensorObserver5);
        boolean boolean7 = room4.isUnderMaintenance();
        java.lang.String str8 = room4.getFullLocation();
        // The following exception was thrown during execution in test generation
        try {
            room4.setEnabled(false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi! - hi!" + "'", str8, "hi! - hi!");
    }

    @Test
    public void test22361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22361");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        java.lang.String str5 = room4.getBuildingName();
        java.lang.String str6 = room4.getRoomID();
        java.lang.String str7 = room4.getScannedID();
        room4.setEnabled(false);
        room4.setOccupied(true);
        room4.setScannedID("Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 97");
        room4.notifyObservers();
        boolean boolean15 = room4.isEnabled();
        room4.setScannedID("Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 100");
        room4.setUnderMaintenance(true);
        boolean boolean20 = room4.isEnabled();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test22362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22362");
        room.Room room4 = new room.Room("hi!", (int) (byte) 100, "", "Room hi! | hi! - hi! | Capacity: 0");
        java.lang.String str5 = room4.getRoomNumber();
        room4.notifyObservers();
        room.SensorObserver sensorObserver7 = null;
        room4.addObserver(sensorObserver7);
        room.SensorObserver sensorObserver9 = null;
        room4.removeObserver(sensorObserver9);
        room4.setEnabled(false);
        room4.notifyObservers();
        boolean boolean14 = room4.isUnderMaintenance();
        boolean boolean15 = room4.isOccupied();
        room4.setScannedID("hi! - hi! - hi!");
        java.lang.String str18 = room4.getFullLocation();
        boolean boolean19 = room4.isUnderMaintenance();
        java.lang.String str20 = room4.toString();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str5, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + " - Room hi! | hi! - hi! | Capacity: 0" + "'", str18, " - Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100" + "'", str20, "Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100");
    }

    @Test
    public void test22363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22363");
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
        java.lang.String str14 = room4.getBuildingName();
        // The following exception was thrown during execution in test generation
        try {
            room4.notifyObservers();
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
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test22364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22364");
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
        room4.setScannedID("Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10");
        java.lang.String str22 = room4.getBuildingName();
        java.lang.String str23 = room4.getRoomNumber();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str7, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi! - hi!" + "'", str12, "hi! - hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
    }

    @Test
    public void test22365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22365");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        boolean boolean5 = room4.isOccupied();
        room.SensorObserver sensorObserver6 = null;
        room4.removeObserver(sensorObserver6);
        java.lang.String str8 = room4.getRoomNumber();
        java.lang.String str9 = room4.getScannedID();
        room4.setUnderMaintenance(true);
        room4.setScannedID("Room Room Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 100 | Room Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 100 - Room Room hi! | hi! - hi! | Capacity: 0 |  - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 0 | Capacity: 32");
        room.SensorObserver sensorObserver14 = null;
        room4.removeObserver(sensorObserver14);
        room.SensorObserver sensorObserver16 = null;
        room4.addObserver(sensorObserver16);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test22366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22366");
        room.Room room4 = new room.Room("hi!", (int) (byte) 1, "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10", "hi!");
        java.lang.String str5 = room4.getRoomNumber();
        room4.notifyObservers();
        java.lang.String str7 = room4.getScannedID();
        java.lang.String str8 = room4.getScannedID();
        room4.setEnabled(false);
        java.lang.String str11 = room4.getFullLocation();
        room4.setUnderMaintenance(false);
        java.lang.String str14 = room4.getFullLocation();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi!" + "'", str11, "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi!" + "'", str14, "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi!");
    }

    @Test
    public void test22367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22367");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        room.SensorObserver sensorObserver5 = null;
        room4.addObserver(sensorObserver5);
        java.lang.String str7 = room4.toString();
        room.SensorObserver sensorObserver8 = null;
        room4.removeObserver(sensorObserver8);
        java.lang.String str10 = room4.toString();
        java.lang.String str11 = room4.getRoomNumber();
        java.lang.String str12 = room4.toString();
        java.lang.String str13 = room4.getScannedID();
        room4.notifyObservers();
        room4.setEnabled(true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str7, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str10, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str12, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test22368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22368");
        room.Room room4 = new room.Room("Room hi! | hi! - hi! | Capacity: 0", (int) (byte) 10, "hi!", "");
        room4.setUnderMaintenance(true);
        int int7 = room4.getCapacity();
        java.lang.String str8 = room4.getRoomNumber();
        java.lang.String str9 = room4.getScannedID();
        java.lang.String str10 = room4.getRoomNumber();
        boolean boolean11 = room4.isUnderMaintenance();
        boolean boolean12 = room4.isUnderMaintenance();
        java.lang.String str13 = room4.toString();
        room.SensorObserver sensorObserver14 = null;
        room4.removeObserver(sensorObserver14);
        java.lang.String str16 = room4.getRoomID();
        java.lang.String str17 = room4.getBuildingName();
        boolean boolean18 = room4.isEnabled();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10" + "'", str13, "Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str16, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test22369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22369");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        boolean boolean5 = room4.isOccupied();
        boolean boolean6 = room4.isEnabled();
        java.lang.String str7 = room4.getBuildingName();
        room4.setUnderMaintenance(false);
        java.lang.String str10 = room4.getBuildingName();
        boolean boolean11 = room4.isEnabled();
        room4.setOccupied(true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test22370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22370");
        room.Room room4 = new room.Room("Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100", 97, "Room hi! | hi! - hi! | Capacity: 0 - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! - hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 97", "Room hi! | hi! - hi! | Capacity: 0 - hi!");
        java.lang.String str5 = room4.getRoomNumber();
        java.lang.String str6 = room4.getRoomID();
        java.lang.String str7 = room4.getBuildingName();
        room4.notifyObservers();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0 - hi!" + "'", str5, "Room hi! | hi! - hi! | Capacity: 0 - hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100" + "'", str6, "Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0 - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! - hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 97" + "'", str7, "Room hi! | hi! - hi! | Capacity: 0 - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! - hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 97");
    }

    @Test
    public void test22371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22371");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        boolean boolean5 = room4.isOccupied();
        room4.setEnabled(false);
        boolean boolean8 = room4.isUnderMaintenance();
        java.lang.String str9 = room4.getFullLocation();
        java.lang.String str10 = room4.toString();
        java.lang.String str11 = room4.toString();
        boolean boolean12 = room4.isOccupied();
        java.lang.String str13 = room4.getScannedID();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi! - hi!" + "'", str9, "hi! - hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str10, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str11, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test22372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22372");
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
        room4.setScannedID("Room Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! |  - Room hi! | hi! - hi! | Capacity: 0 - Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: -1");
        java.lang.String str21 = room4.getScannedID();
        room4.setUnderMaintenance(false);
        java.lang.String str24 = room4.getRoomNumber();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str7, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Room Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! |  - Room hi! | hi! - hi! | Capacity: 0 - Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: -1" + "'", str21, "Room Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! |  - Room hi! | hi! - hi! | Capacity: 0 - Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: -1");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
    }

    @Test
    public void test22373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22373");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        boolean boolean5 = room4.isOccupied();
        room4.setEnabled(false);
        java.lang.String str8 = room4.getRoomID();
        room4.notifyObservers();
        room4.setUnderMaintenance(false);
        java.lang.String str12 = room4.getRoomID();
        java.lang.String str13 = room4.toString();
        boolean boolean14 = room4.isEnabled();
        room4.setUnderMaintenance(false);
        java.lang.String str17 = room4.getBuildingName();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str13, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test22374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22374");
        room.Room room4 = new room.Room("", 35, "Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi!", "Room hi! | hi! - hi! | Capacity: 0 - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! - hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 97 - Room hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 1 - Room hi! | hi! - hi! - Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | Capacity: 0");
        boolean boolean5 = room4.isUnderMaintenance();
        room4.setScannedID("Room Room Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 100 | Room Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 100 - Room Room hi! | hi! - hi! | Capacity: 0 |  - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 0 | Capacity: 32");
        java.lang.String str8 = room4.getRoomID();
        java.lang.String str9 = room4.getRoomNumber();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0 - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! - hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 97 - Room hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 1 - Room hi! | hi! - hi! - Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | Capacity: 0" + "'", str9, "Room hi! | hi! - hi! | Capacity: 0 - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! - hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 97 - Room hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 1 - Room hi! | hi! - hi! - Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | Capacity: 0");
    }

    @Test
    public void test22375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22375");
        room.Room room4 = new room.Room("hi! - hi! - hi!", 100, "Room  - Room hi! | hi! - hi! | Capacity: 0 |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 0 - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi!", "Room hi! | Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 35 - Room Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 | hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 0 - hi! - hi! - Room hi! | hi! - hi! | Capacity: 0 -  - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! | Room Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 1 - Room hi! | hi! - hi! | Capacity: 0 - hi! |  -  | Capacity: 35 - Room Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 100 | Capacity: 32");
        room4.notifyObservers();
    }

    @Test
    public void test22376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22376");
        room.Room room4 = new room.Room("hi!", (int) (byte) 100, "", "Room hi! | hi! - hi! | Capacity: 0");
        java.lang.String str5 = room4.toString();
        java.lang.String str6 = room4.getRoomNumber();
        room4.notifyObservers();
        room4.setOccupied(true);
        room.SensorObserver sensorObserver10 = null;
        room4.removeObserver(sensorObserver10);
        java.lang.String str12 = room4.getRoomID();
        room4.setUnderMaintenance(false);
        room4.setScannedID("hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! - hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100" + "'", str5, "Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str6, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test22377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22377");
        room.Room room4 = new room.Room("", (int) (byte) 100, "Room hi! | hi! - hi! | Capacity: 0 - hi!", "");
        room4.setUnderMaintenance(true);
        room4.setScannedID("Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 100");
        int int9 = room4.getCapacity();
        java.lang.String str10 = room4.getRoomNumber();
        java.lang.String str11 = room4.getRoomID();
        room4.setScannedID("Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi!");
        room.SensorObserver sensorObserver14 = null;
        room4.removeObserver(sensorObserver14);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test22378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22378");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        boolean boolean5 = room4.isOccupied();
        boolean boolean6 = room4.isEnabled();
        java.lang.String str7 = room4.getRoomNumber();
        room4.setEnabled(false);
        java.lang.String str10 = room4.getFullLocation();
        room.SensorObserver sensorObserver11 = null;
        room4.removeObserver(sensorObserver11);
        java.lang.String str13 = room4.getRoomID();
        java.lang.String str14 = room4.getScannedID();
        room4.setUnderMaintenance(true);
        room4.setOccupied(false);
        int int19 = room4.getCapacity();
        room4.setScannedID("Room Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! | Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 97 - hi! - hi! - hi! | Capacity: 0");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi! - hi!" + "'", str10, "hi! - hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test22379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22379");
        room.Room room4 = new room.Room("Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi!", (int) (short) 0, "hi! - hi! - hi!", "Room hi! | hi! - hi! | Capacity: 0");
        room4.setOccupied(false);
        room4.setUnderMaintenance(false);
        room4.setScannedID("Room hi! | hi! - hi! | Capacity: 0 - hi! - ");
        room4.setOccupied(false);
        java.lang.String str13 = room4.getBuildingName();
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi! - hi! - hi!" + "'", str13, "hi! - hi! - hi!");
    }

    @Test
    public void test22380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22380");
        room.Room room4 = new room.Room("", (int) (short) 10, "Room hi! | hi! - hi! | Capacity: 0", "hi!");
        java.lang.String str5 = room4.toString();
        java.lang.String str6 = room4.getBuildingName();
        room.SensorObserver sensorObserver7 = null;
        room4.removeObserver(sensorObserver7);
        boolean boolean9 = room4.isEnabled();
        java.lang.String str10 = room4.getRoomID();
        int int11 = room4.getCapacity();
        room.SensorObserver sensorObserver12 = null;
        room4.removeObserver(sensorObserver12);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10" + "'", str5, "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str6, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
    }

    @Test
    public void test22381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22381");
        room.Room room4 = new room.Room("Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi!", (int) (short) 0, "hi! - hi! - hi!", "Room hi! | hi! - hi! | Capacity: 0");
        room4.setOccupied(false);
        room.SensorObserver sensorObserver7 = null;
        room4.addObserver(sensorObserver7);
        room.SensorObserver sensorObserver9 = null;
        room4.removeObserver(sensorObserver9);
        boolean boolean11 = room4.isEnabled();
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test22382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22382");
        room.Room room4 = new room.Room("", (int) (short) 100, "Room Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 100 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 -  - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! | Capacity: 0 | hi! - hi! - hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 | Capacity: 0", "Room hi! - hi! - hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 1 | Capacity: 0 - hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10");
        room4.setScannedID("Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 | Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 1 - Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 1");
        boolean boolean7 = room4.isEnabled();
        room4.setOccupied(false);
        room.SensorObserver sensorObserver10 = null;
        room4.addObserver(sensorObserver10);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test22383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22383");
        room.Room room4 = new room.Room("Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10", (int) '#', "hi! - Room hi! | hi! - hi! | Capacity: 0", "Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 97");
        room4.setUnderMaintenance(true);
        room4.setEnabled(false);
        int int9 = room4.getCapacity();
        java.lang.String str10 = room4.getScannedID();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test22384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22384");
        room.Room room4 = new room.Room("Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10", 0, "hi!", "Room hi! | hi! - hi! | Capacity: 0");
        room4.setScannedID("Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100");
        room4.notifyObservers();
        room4.setScannedID("Room hi! -  | Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 10 - ");
        room4.setUnderMaintenance(true);
    }

    @Test
    public void test22385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22385");
        room.Room room4 = new room.Room("hi! - hi!", (int) (byte) -1, " - Room hi! | hi! - hi! | Capacity: 0", "Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 97");
        room4.setScannedID("Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10");
        java.lang.String str7 = room4.getRoomID();
        room4.setOccupied(true);
        boolean boolean10 = room4.isEnabled();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi! - hi!" + "'", str7, "hi! - hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test22386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22386");
        room.Room room4 = new room.Room("hi! - hi! - hi! - hi!", (int) (short) 100, "", "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10");
        room4.setEnabled(true);
    }

    @Test
    public void test22387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22387");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        java.lang.String str5 = room4.getScannedID();
        room4.setScannedID("hi!");
        boolean boolean8 = room4.isEnabled();
        int int9 = room4.getCapacity();
        boolean boolean10 = room4.isOccupied();
        java.lang.String str11 = room4.getRoomNumber();
        java.lang.String str12 = room4.getRoomID();
        room4.setScannedID("Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi!");
        room4.setUnderMaintenance(true);
        java.lang.String str17 = room4.toString();
        int int18 = room4.getCapacity();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str17, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test22388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22388");
        room.Room room4 = new room.Room("hi!", (int) (byte) 100, "", "Room hi! | hi! - hi! | Capacity: 0");
        java.lang.String str5 = room4.toString();
        java.lang.String str6 = room4.getRoomNumber();
        room4.notifyObservers();
        room4.setEnabled(false);
        room4.setOccupied(true);
        java.lang.Class<?> wildcardClass12 = room4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100" + "'", str5, "Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str6, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test22389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22389");
        room.Room room4 = new room.Room("hi!", (int) (byte) 100, "", "Room hi! | hi! - hi! | Capacity: 0");
        java.lang.String str5 = room4.toString();
        java.lang.String str6 = room4.getFullLocation();
        room.SensorObserver sensorObserver7 = null;
        room4.removeObserver(sensorObserver7);
        java.lang.String str9 = room4.getScannedID();
        int int10 = room4.getCapacity();
        int int11 = room4.getCapacity();
        java.lang.String str12 = room4.getFullLocation();
        room4.notifyObservers();
        room.SensorObserver sensorObserver14 = null;
        room4.removeObserver(sensorObserver14);
        boolean boolean16 = room4.isOccupied();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100" + "'", str5, "Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + " - Room hi! | hi! - hi! | Capacity: 0" + "'", str6, " - Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + " - Room hi! | hi! - hi! | Capacity: 0" + "'", str12, " - Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test22390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22390");
        room.Room room4 = new room.Room("Room Room hi! | hi! - hi! | Capacity: 0 | hi! - hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 97", 1, "hi! - hi! - Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100", "Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 97");
        room4.setScannedID("Room Room hi! | hi! - hi! | Capacity: 0 |  - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 0 - Room Room hi! | hi! - hi! | Capacity: 0 | Room hi! | hi! - hi! | Capacity: 0 - hi! - hi! | Capacity: 100 - Room  - Room hi! | hi! - hi! | Capacity: 0 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 0");
        java.lang.String str7 = room4.getRoomNumber();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 97" + "'", str7, "Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 97");
    }

    @Test
    public void test22391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22391");
        room.Room room4 = new room.Room("Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi!", 10, "Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10", "hi!");
        java.lang.String str5 = room4.getScannedID();
        room.SensorObserver sensorObserver6 = null;
        room4.removeObserver(sensorObserver6);
        java.lang.String str8 = room4.getRoomID();
        java.lang.String str9 = room4.getBuildingName();
        room4.notifyObservers();
        boolean boolean11 = room4.isOccupied();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi!" + "'", str8, "Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10" + "'", str9, "Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test22392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22392");
        room.Room room4 = new room.Room(" - hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 1", (int) (byte) 10, "Room Room hi! | hi! - hi! | Capacity: 0 - hi! | Room hi! | Room hi! | hi! - hi! | Capacity: 0 - hi! - Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 1 - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 32 - Room Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! - hi! - hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: -1", "hi! -  - Room  - Room hi! | hi! - hi! | Capacity: 0 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 0 - hi! - hi! - Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 97");
        room.SensorObserver sensorObserver5 = null;
        room4.addObserver(sensorObserver5);
    }

    @Test
    public void test22393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22393");
        room.Room room4 = new room.Room("hi!", (int) (byte) 100, "", "Room hi! | hi! - hi! | Capacity: 0");
        java.lang.String str5 = room4.toString();
        java.lang.String str6 = room4.getRoomNumber();
        boolean boolean7 = room4.isEnabled();
        java.lang.String str8 = room4.getRoomID();
        room4.setUnderMaintenance(true);
        boolean boolean11 = room4.isOccupied();
        room4.setOccupied(false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100" + "'", str5, "Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str6, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test22394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22394");
        room.Room room4 = new room.Room("Room  | Room hi! | hi! - hi! | Capacity: 0 -  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 32", 1, "Room Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! |  - Room hi! | hi! - hi! | Capacity: 0 - Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: -1", "Room  - Room hi! | hi! - hi! | Capacity: 0 | Room Room hi! | hi! - hi! | Capacity: 0 | hi! - hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 97 - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! | Capacity: 52");
        room4.setOccupied(false);
    }

    @Test
    public void test22395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22395");
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
        java.lang.String str16 = room4.getRoomID();
        java.lang.String str17 = room4.getRoomNumber();
        room4.setUnderMaintenance(true);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str11, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test22396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22396");
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
        boolean boolean17 = room4.isEnabled();
        java.lang.String str18 = room4.toString();
        boolean boolean19 = room4.isUnderMaintenance();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str7, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str18, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test22397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22397");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        room.SensorObserver sensorObserver5 = null;
        room4.addObserver(sensorObserver5);
        java.lang.String str7 = room4.getScannedID();
        room.SensorObserver sensorObserver8 = null;
        room4.removeObserver(sensorObserver8);
        java.lang.String str10 = room4.getRoomNumber();
        java.lang.String str11 = room4.getBuildingName();
        java.lang.String str12 = room4.getRoomNumber();
        java.lang.String str13 = room4.getRoomNumber();
        java.lang.String str14 = room4.toString();
        room4.setOccupied(true);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str14, "Room hi! | hi! - hi! | Capacity: 0");
    }

    @Test
    public void test22398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22398");
        room.Room room4 = new room.Room("hi!", (int) (byte) 100, "", "Room hi! | hi! - hi! | Capacity: 0");
        room4.setScannedID("");
        room4.notifyObservers();
        boolean boolean8 = room4.isUnderMaintenance();
        room4.notifyObservers();
        room4.setScannedID("Room Room hi! | hi! - hi! | Capacity: 0 |  - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 0");
        boolean boolean12 = room4.isUnderMaintenance();
        java.lang.String str13 = room4.toString();
        java.lang.String str14 = room4.getScannedID();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100" + "'", str13, "Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Room Room hi! | hi! - hi! | Capacity: 0 |  - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 0" + "'", str14, "Room Room hi! | hi! - hi! | Capacity: 0 |  - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 0");
    }

    @Test
    public void test22399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22399");
        room.Room room4 = new room.Room(" - hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10", (int) (byte) 100, "Room Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! - hi! - hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: -1", "Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi!");
        java.lang.String str5 = room4.toString();
        boolean boolean6 = room4.isOccupied();
        boolean boolean7 = room4.isUnderMaintenance();
        java.lang.String str8 = room4.getBuildingName();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Room  - hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Room Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! - hi! - hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: -1 - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! | Capacity: 100" + "'", str5, "Room  - hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Room Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! - hi! - hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: -1 - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! | Capacity: 100");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Room Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! - hi! - hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: -1" + "'", str8, "Room Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! - hi! - hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: -1");
    }

    @Test
    public void test22400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22400");
        room.Room room4 = new room.Room("Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi!", (-1), " - Room hi! | hi! - hi! | Capacity: 0", "Room hi! | hi! - hi! | Capacity: 0 - hi!");
        java.lang.String str5 = room4.getRoomID();
        room4.notifyObservers();
        boolean boolean7 = room4.isUnderMaintenance();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi!" + "'", str5, "Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test22401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22401");
        room.Room room4 = new room.Room("", (int) (short) 10, "Room hi! | hi! - hi! | Capacity: 0", "hi!");
        java.lang.String str5 = room4.toString();
        room4.setUnderMaintenance(true);
        room4.setScannedID("");
        room.SensorObserver sensorObserver10 = null;
        room4.removeObserver(sensorObserver10);
        java.lang.String str12 = room4.toString();
        room4.setUnderMaintenance(false);
        java.lang.String str15 = room4.getScannedID();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10" + "'", str5, "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10" + "'", str12, "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test22402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22402");
        room.Room room4 = new room.Room(" - Room hi! | hi! - hi! | Capacity: 0 - hi! - ", (int) (byte) 1, "Room Room Room Room hi! | hi! - hi! | Capacity: 0 | Room hi! | hi! - hi! | Capacity: 0 - hi! - hi! | Capacity: 100 |  - hi! - hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: -1 | Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - Room hi! | hi! - hi! | Capacity: 0 - hi! - Room hi! | hi! - hi! | Capacity: 0 - hi! - Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 0", "Room hi! | hi! - hi! | Capacity: 0 - hi! -  - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10");
    }

    @Test
    public void test22403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22403");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        java.lang.String str5 = room4.getScannedID();
        room4.setScannedID("hi!");
        room4.setUnderMaintenance(true);
        java.lang.String str10 = room4.getScannedID();
        room4.setScannedID("Room hi! | hi! - hi! | Capacity: 0");
        boolean boolean13 = room4.isEnabled();
        java.lang.String str14 = room4.getRoomID();
        java.lang.Class<?> wildcardClass15 = room4.getClass();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test22404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22404");
        room.Room room4 = new room.Room("hi!", (int) (byte) 100, "", "Room hi! | hi! - hi! | Capacity: 0");
        java.lang.String str5 = room4.getBuildingName();
        java.lang.String str6 = room4.toString();
        java.lang.String str7 = room4.getRoomNumber();
        boolean boolean8 = room4.isUnderMaintenance();
        room4.setEnabled(true);
        room4.setUnderMaintenance(true);
        room4.setEnabled(true);
        java.lang.String str15 = room4.toString();
        boolean boolean16 = room4.isEnabled();
        java.lang.String str17 = room4.getRoomNumber();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100" + "'", str6, "Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str7, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100" + "'", str15, "Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str17, "Room hi! | hi! - hi! | Capacity: 0");
    }

    @Test
    public void test22405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22405");
        room.Room room4 = new room.Room("", (int) (short) 10, "Room hi! | hi! - hi! | Capacity: 0", "hi!");
        java.lang.String str5 = room4.getFullLocation();
        boolean boolean6 = room4.isEnabled();
        int int7 = room4.getCapacity();
        boolean boolean8 = room4.isUnderMaintenance();
        room4.setScannedID("hi! - hi! - hi!");
        room4.setScannedID("Room hi! -  | Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 0 - Room  - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 100 | hi! - hi! - hi! - hi! | Capacity: 0 | Capacity: 0");
        boolean boolean13 = room4.isUnderMaintenance();
        room4.setUnderMaintenance(true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0 - hi!" + "'", str5, "Room hi! | hi! - hi! | Capacity: 0 - hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test22406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22406");
        room.Room room4 = new room.Room("Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! - Room hi! | hi! - hi! | Capacity: 0 - hi!", 10, "hi! - Room hi! | hi! - hi! | Capacity: 0", "Room Room hi! | hi! - hi! | Capacity: 0 - hi! - hi! - Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | hi! -  - Room  - Room hi! | hi! - hi! | Capacity: 0 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 0 | Capacity: 10 | hi! -  - Room  - Room hi! | hi! - hi! | Capacity: 0 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 0 - hi! -  - Room  - Room hi! | hi! - hi! | Capacity: 0 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 0 | Capacity: 100");
        room4.setOccupied(false);
        room4.notifyObservers();
        room4.setScannedID("Room Room hi! | hi! - hi! | Capacity: 0 | Room hi! | hi! - hi! | Capacity: 0 - hi! - hi! | Capacity: 100 - Room  - Room hi! | hi! - hi! | Capacity: 0 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 0 - ");
        room4.setScannedID("Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 100 | Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! | Capacity: 100");
    }

    @Test
    public void test22407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22407");
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
        java.lang.String str16 = room4.getScannedID();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str7, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test22408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22408");
        room.Room room4 = new room.Room(" - Room hi! | hi! - hi! | Capacity: 0", (int) (byte) 100, "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi!", "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10");
        room.SensorObserver sensorObserver5 = null;
        room4.removeObserver(sensorObserver5);
        room4.setEnabled(true);
        room.SensorObserver sensorObserver9 = null;
        room4.removeObserver(sensorObserver9);
        java.lang.String str11 = room4.getBuildingName();
        java.lang.String str12 = room4.getRoomID();
        room4.notifyObservers();
        room.SensorObserver sensorObserver14 = null;
        room4.addObserver(sensorObserver14);
        room.SensorObserver sensorObserver16 = null;
        room4.addObserver(sensorObserver16);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi!" + "'", str11, "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + " - Room hi! | hi! - hi! | Capacity: 0" + "'", str12, " - Room hi! | hi! - hi! | Capacity: 0");
    }

    @Test
    public void test22409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22409");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        java.lang.String str5 = room4.getScannedID();
        room4.setScannedID("hi!");
        room4.setUnderMaintenance(true);
        java.lang.String str10 = room4.getFullLocation();
        java.lang.String str11 = room4.getScannedID();
        room4.setOccupied(true);
        int int14 = room4.getCapacity();
        room4.notifyObservers();
        boolean boolean16 = room4.isUnderMaintenance();
        java.lang.String str17 = room4.getFullLocation();
        room4.setScannedID("Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 1 - Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi! - hi!" + "'", str10, "hi! - hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi! - hi!" + "'", str17, "hi! - hi!");
    }

    @Test
    public void test22410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22410");
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
        room4.addObserver(sensorObserver14);
        int int16 = room4.getCapacity();
        room.SensorObserver sensorObserver17 = null;
        room4.addObserver(sensorObserver17);
        boolean boolean19 = room4.isOccupied();
        boolean boolean20 = room4.isOccupied();
        java.lang.String str21 = room4.getBuildingName();
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi! - hi!" + "'", str8, "hi! - hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi! - hi!" + "'", str13, "hi! - hi!");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
    }

    @Test
    public void test22411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22411");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        java.lang.String str5 = room4.getScannedID();
        room4.setScannedID("hi!");
        room4.setUnderMaintenance(true);
        java.lang.String str10 = room4.toString();
        room.SensorObserver sensorObserver11 = null;
        room4.removeObserver(sensorObserver11);
        java.lang.String str13 = room4.getFullLocation();
        java.lang.String str14 = room4.getScannedID();
        room4.notifyObservers();
        java.lang.String str16 = room4.getRoomNumber();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str10, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi! - hi!" + "'", str13, "hi! - hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test22412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22412");
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
        room4.notifyObservers();
        room.SensorObserver sensorObserver17 = null;
        room4.removeObserver(sensorObserver17);
        room.SensorObserver sensorObserver19 = null;
        room4.removeObserver(sensorObserver19);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str11, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test22413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22413");
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
        java.lang.String str18 = room4.getRoomNumber();
        room4.setOccupied(false);
        java.lang.String str21 = room4.toString();
        java.lang.String str22 = room4.getFullLocation();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str7, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi! - hi!" + "'", str12, "hi! - hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str21, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi! - hi!" + "'", str22, "hi! - hi!");
    }

    @Test
    public void test22414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22414");
        room.Room room4 = new room.Room("hi!", (int) (byte) 100, "", "Room hi! | hi! - hi! | Capacity: 0");
        java.lang.String str5 = room4.getRoomNumber();
        boolean boolean6 = room4.isEnabled();
        boolean boolean7 = room4.isEnabled();
        room4.setEnabled(true);
        boolean boolean10 = room4.isUnderMaintenance();
        boolean boolean11 = room4.isOccupied();
        room4.setOccupied(true);
        java.lang.String str14 = room4.getScannedID();
        boolean boolean15 = room4.isOccupied();
        java.lang.String str16 = room4.getFullLocation();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str5, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + " - Room hi! | hi! - hi! | Capacity: 0" + "'", str16, " - Room hi! | hi! - hi! | Capacity: 0");
    }

    @Test
    public void test22415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22415");
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
        room.SensorObserver sensorObserver22 = null;
        room4.addObserver(sensorObserver22);
        int int24 = room4.getCapacity();
        int int25 = room4.getCapacity();
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str11, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
    }

    @Test
    public void test22416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22416");
        room.Room room4 = new room.Room("Room hi! | hi! - hi! | Capacity: 0", (int) (byte) 10, "hi!", "");
        int int5 = room4.getCapacity();
        room4.setOccupied(false);
        boolean boolean8 = room4.isUnderMaintenance();
        boolean boolean9 = room4.isUnderMaintenance();
        room4.notifyObservers();
        room4.setScannedID("Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi!");
        boolean boolean13 = room4.isEnabled();
        room4.setScannedID("Room hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 1 - Room hi! | hi! - hi! - Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | Capacity: 0");
        java.lang.String str16 = room4.getRoomID();
        java.lang.String str17 = room4.getRoomNumber();
        room4.setOccupied(false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str16, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test22417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22417");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        room.SensorObserver sensorObserver5 = null;
        room4.addObserver(sensorObserver5);
        java.lang.String str7 = room4.getScannedID();
        room.SensorObserver sensorObserver8 = null;
        room4.removeObserver(sensorObserver8);
        java.lang.String str10 = room4.getRoomNumber();
        java.lang.String str11 = room4.toString();
        java.lang.String str12 = room4.getRoomID();
        room.SensorObserver sensorObserver13 = null;
        room4.removeObserver(sensorObserver13);
        room4.setEnabled(true);
        boolean boolean17 = room4.isOccupied();
        java.lang.String str18 = room4.getFullLocation();
        int int19 = room4.getCapacity();
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str11, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi! - hi!" + "'", str18, "hi! - hi!");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test22418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22418");
        room.Room room4 = new room.Room("Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10", (int) 'a', "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10", "Room hi! | hi! - hi! | Capacity: 0");
        int int5 = room4.getCapacity();
        room.SensorObserver sensorObserver6 = null;
        room4.removeObserver(sensorObserver6);
        room.SensorObserver sensorObserver8 = null;
        room4.removeObserver(sensorObserver8);
        boolean boolean10 = room4.isOccupied();
        java.lang.String str11 = room4.getBuildingName();
        boolean boolean12 = room4.isUnderMaintenance();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10" + "'", str11, "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test22419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22419");
        room.Room room4 = new room.Room("Room Room hi! | hi! - hi! | Capacity: 0 | Room hi! | hi! - hi! | Capacity: 0 - hi! - hi! | Capacity: 100 - Room  - Room hi! | hi! - hi! | Capacity: 0 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 0", 97, "Room hi! -  | Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 0", "Room Room  - Room hi! | hi! - hi! | Capacity: 0 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 0 - hi! |  - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! - Room  - Room hi! | hi! - hi! | Capacity: 0 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 0 | Capacity: 10");
        room.SensorObserver sensorObserver5 = null;
        room4.addObserver(sensorObserver5);
    }

    @Test
    public void test22420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22420");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        java.lang.String str5 = room4.getScannedID();
        room4.setScannedID("hi!");
        room4.setUnderMaintenance(true);
        room4.setOccupied(true);
        room4.setOccupied(false);
        room.SensorObserver sensorObserver14 = null;
        room4.addObserver(sensorObserver14);
        java.lang.String str16 = room4.getScannedID();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test22421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22421");
        room.Room room4 = new room.Room("Room Room hi! - hi! - hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 1 | Capacity: 0 | Room hi! -  | Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 10 -  | Capacity: 52", 52, " - Room hi! - hi! - hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 1 | Capacity: 0", "Room Room  - Room hi! | hi! - hi! | Capacity: 0 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 0 - hi! |  - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! - Room  - Room hi! | hi! - hi! | Capacity: 0 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 0 | Capacity: 10");
        room4.setEnabled(false);
    }

    @Test
    public void test22422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22422");
        room.Room room4 = new room.Room("hi!", (int) (byte) 100, "", "Room hi! | hi! - hi! | Capacity: 0");
        java.lang.String str5 = room4.getScannedID();
        java.lang.String str6 = room4.getBuildingName();
        room4.setUnderMaintenance(false);
        java.lang.String str9 = room4.getScannedID();
        int int10 = room4.getCapacity();
        boolean boolean11 = room4.isOccupied();
        boolean boolean12 = room4.isOccupied();
        java.lang.String str13 = room4.getFullLocation();
        room4.setEnabled(false);
        room.SensorObserver sensorObserver16 = null;
        room4.removeObserver(sensorObserver16);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + " - Room hi! | hi! - hi! | Capacity: 0" + "'", str13, " - Room hi! | hi! - hi! | Capacity: 0");
    }

    @Test
    public void test22423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22423");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        boolean boolean5 = room4.isOccupied();
        room4.setEnabled(false);
        java.lang.String str8 = room4.getFullLocation();
        java.lang.String str9 = room4.getRoomID();
        int int10 = room4.getCapacity();
        boolean boolean11 = room4.isOccupied();
        java.lang.String str12 = room4.getBuildingName();
        room.SensorObserver sensorObserver13 = null;
        room4.removeObserver(sensorObserver13);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi! - hi!" + "'", str8, "hi! - hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test22424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22424");
        room.Room room4 = new room.Room("Room hi! | Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 35", (int) (byte) 0, "Room Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 97 | Room hi! - hi! - hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 1 | Capacity: 0 - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 | Capacity: 35", "Room Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 1 | Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 | hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 0 - hi! - hi! - hi! | Capacity: 100");
        boolean boolean5 = room4.isUnderMaintenance();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test22425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22425");
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
        int int14 = room4.getCapacity();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str7, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str8, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test22426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22426");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        room.SensorObserver sensorObserver5 = null;
        room4.addObserver(sensorObserver5);
        java.lang.String str7 = room4.getScannedID();
        room.SensorObserver sensorObserver8 = null;
        room4.removeObserver(sensorObserver8);
        java.lang.String str10 = room4.getRoomNumber();
        java.lang.String str11 = room4.toString();
        room4.setScannedID("Room hi! | hi! - hi! | Capacity: 0");
        java.lang.String str14 = room4.toString();
        boolean boolean15 = room4.isEnabled();
        boolean boolean16 = room4.isEnabled();
        room4.setOccupied(true);
        room.SensorObserver sensorObserver19 = null;
        room4.removeObserver(sensorObserver19);
        room.SensorObserver sensorObserver21 = null;
        room4.removeObserver(sensorObserver21);
        boolean boolean23 = room4.isOccupied();
        room4.setOccupied(true);
        room4.setOccupied(true);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str11, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str14, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test22427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22427");
        room.Room room4 = new room.Room("Room hi! | hi! - hi! | Capacity: 0", (int) (byte) 10, "hi!", "");
        room4.setUnderMaintenance(true);
        int int7 = room4.getCapacity();
        java.lang.String str8 = room4.getRoomNumber();
        java.lang.String str9 = room4.getScannedID();
        java.lang.String str10 = room4.getRoomNumber();
        java.lang.String str11 = room4.getBuildingName();
        java.lang.String str12 = room4.getFullLocation();
        java.lang.String str13 = room4.getRoomNumber();
        room4.notifyObservers();
        room4.setUnderMaintenance(true);
        boolean boolean17 = room4.isOccupied();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi! - " + "'", str12, "hi! - ");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test22428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22428");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        room.SensorObserver sensorObserver5 = null;
        room4.addObserver(sensorObserver5);
        java.lang.String str7 = room4.getScannedID();
        room.SensorObserver sensorObserver8 = null;
        room4.removeObserver(sensorObserver8);
        java.lang.String str10 = room4.getRoomNumber();
        boolean boolean11 = room4.isOccupied();
        java.lang.String str12 = room4.toString();
        java.lang.String str13 = room4.getFullLocation();
        room4.notifyObservers();
        java.lang.String str15 = room4.getScannedID();
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str12, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi! - hi!" + "'", str13, "hi! - hi!");
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test22429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22429");
        room.Room room4 = new room.Room("", 0, "", "Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 | hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 0 - Room hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 1 - Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 | hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 0 - ");
    }

    @Test
    public void test22430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22430");
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
        java.lang.String str19 = room4.getRoomNumber();
        java.lang.String str20 = room4.getBuildingName();
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
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test22431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22431");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        java.lang.String str5 = room4.getScannedID();
        room.SensorObserver sensorObserver6 = null;
        room4.removeObserver(sensorObserver6);
        boolean boolean8 = room4.isUnderMaintenance();
        room.SensorObserver sensorObserver9 = null;
        room4.removeObserver(sensorObserver9);
        java.lang.String str11 = room4.getRoomNumber();
        java.lang.String str12 = room4.getBuildingName();
        java.lang.String str13 = room4.getRoomID();
        room4.setEnabled(false);
        room.SensorObserver sensorObserver16 = null;
        room4.removeObserver(sensorObserver16);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test22432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22432");
        room.Room room4 = new room.Room("Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10", 0, "hi!", "Room hi! | hi! - hi! | Capacity: 0");
        room4.setScannedID("Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100");
        room4.notifyObservers();
        java.lang.String str8 = room4.getFullLocation();
        room4.setOccupied(false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi! - Room hi! | hi! - hi! | Capacity: 0" + "'", str8, "hi! - Room hi! | hi! - hi! | Capacity: 0");
    }

    @Test
    public void test22433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22433");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        room.SensorObserver sensorObserver5 = null;
        room4.addObserver(sensorObserver5);
        java.lang.String str7 = room4.getFullLocation();
        room.SensorObserver sensorObserver8 = null;
        room4.addObserver(sensorObserver8);
        boolean boolean10 = room4.isOccupied();
        int int11 = room4.getCapacity();
        java.lang.String str12 = room4.getBuildingName();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi! - hi!" + "'", str7, "hi! - hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test22434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22434");
        room.Room room4 = new room.Room("Room hi! - hi! - Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | Room hi! | hi! - hi! | Capacity: 0 - hi! -  - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! | Capacity: -1", 1, "Room hi! - hi! - hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 0", "");
    }

    @Test
    public void test22435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22435");
        room.Room room4 = new room.Room("Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! - hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 97 | Capacity: 32", 0, "Room Room hi! | hi! - hi! | Capacity: 0 | Room hi! | hi! - hi! | Capacity: 0 - hi! - hi! | Capacity: 100 - hi! - hi! - Room hi! | hi! - hi! | Capacity: 0", "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 1 - Room Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! | Room  - Room hi! | hi! - hi! | Capacity: 0 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 0 - Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 97 | Capacity: 0");
        java.lang.String str5 = room4.getBuildingName();
        boolean boolean6 = room4.isUnderMaintenance();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Room Room hi! | hi! - hi! | Capacity: 0 | Room hi! | hi! - hi! | Capacity: 0 - hi! - hi! | Capacity: 100 - hi! - hi! - Room hi! | hi! - hi! | Capacity: 0" + "'", str5, "Room Room hi! | hi! - hi! | Capacity: 0 | Room hi! | hi! - hi! | Capacity: 0 - hi! - hi! | Capacity: 100 - hi! - hi! - Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test22436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22436");
        room.Room room4 = new room.Room("Room  - Room hi! | hi! - hi! | Capacity: 0 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 0", (-1), "Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100", "Room hi! | Room hi! | hi! - hi! | Capacity: 0 - hi! - Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 1");
        room.SensorObserver sensorObserver5 = null;
        room4.removeObserver(sensorObserver5);
        java.lang.String str7 = room4.toString();
        room4.setUnderMaintenance(false);
        java.lang.String str10 = room4.toString();
        java.lang.String str11 = room4.toString();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Room Room  - Room hi! | hi! - hi! | Capacity: 0 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 0 | Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 - Room hi! | Room hi! | hi! - hi! | Capacity: 0 - hi! - Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 1 | Capacity: -1" + "'", str7, "Room Room  - Room hi! | hi! - hi! | Capacity: 0 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 0 | Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 - Room hi! | Room hi! | hi! - hi! | Capacity: 0 - hi! - Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 1 | Capacity: -1");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Room Room  - Room hi! | hi! - hi! | Capacity: 0 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 0 | Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 - Room hi! | Room hi! | hi! - hi! | Capacity: 0 - hi! - Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 1 | Capacity: -1" + "'", str10, "Room Room  - Room hi! | hi! - hi! | Capacity: 0 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 0 | Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 - Room hi! | Room hi! | hi! - hi! | Capacity: 0 - hi! - Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 1 | Capacity: -1");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Room Room  - Room hi! | hi! - hi! | Capacity: 0 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 0 | Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 - Room hi! | Room hi! | hi! - hi! | Capacity: 0 - hi! - Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 1 | Capacity: -1" + "'", str11, "Room Room  - Room hi! | hi! - hi! | Capacity: 0 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 0 | Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 - Room hi! | Room hi! | hi! - hi! | Capacity: 0 - hi! - Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 1 | Capacity: -1");
    }

    @Test
    public void test22437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22437");
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
        room4.setOccupied(false);
        room4.setScannedID("Room hi! - hi! - hi! | Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 | hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 0 - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! | Capacity: 97");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test22438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22438");
        room.Room room4 = new room.Room("hi!", (int) (byte) 1, "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10", "hi!");
        room4.notifyObservers();
        room4.setOccupied(false);
        room4.notifyObservers();
        room4.setEnabled(true);
        boolean boolean11 = room4.isOccupied();
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test22439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22439");
        room.Room room4 = new room.Room("hi!", (int) '#', "Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10", "Room hi! | hi! - hi! | Capacity: 0 - hi!");
        room4.setUnderMaintenance(false);
        room4.notifyObservers();
        java.lang.String str8 = room4.getRoomNumber();
        room4.setEnabled(true);
        room4.setOccupied(true);
        java.lang.String str13 = room4.getRoomNumber();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0 - hi!" + "'", str8, "Room hi! | hi! - hi! | Capacity: 0 - hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0 - hi!" + "'", str13, "Room hi! | hi! - hi! | Capacity: 0 - hi!");
    }

    @Test
    public void test22440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22440");
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
        room4.setUnderMaintenance(true);
        java.lang.String str17 = room4.toString();
        boolean boolean18 = room4.isEnabled();
        java.lang.String str19 = room4.getBuildingName();
        java.lang.String str20 = room4.getRoomNumber();
        java.lang.String str21 = room4.getRoomID();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi! - hi!" + "'", str7, "hi! - hi!");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str17, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
    }

    @Test
    public void test22441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22441");
        room.Room room4 = new room.Room("hi!", (int) (byte) 100, "", "Room hi! | hi! - hi! | Capacity: 0");
        java.lang.String str5 = room4.getScannedID();
        java.lang.String str6 = room4.getBuildingName();
        room4.setScannedID("Room hi! | hi! - hi! | Capacity: 0");
        boolean boolean9 = room4.isOccupied();
        room.SensorObserver sensorObserver10 = null;
        room4.addObserver(sensorObserver10);
        // The following exception was thrown during execution in test generation
        try {
            room4.setScannedID("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test22442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22442");
        room.Room room4 = new room.Room("Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 100", (int) (byte) 0, "Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100", "Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 100 | hi! - hi! - hi! - hi! | Capacity: 0");
        room4.setScannedID("Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! - hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 97 | Capacity: 32");
        room.SensorObserver sensorObserver7 = null;
        room4.removeObserver(sensorObserver7);
        room4.setEnabled(false);
        room4.setEnabled(false);
    }

    @Test
    public void test22443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22443");
        room.Room room4 = new room.Room("Room hi! | hi! - hi! | Capacity: 0 - hi! -  - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi!", 32, "Room Room Room hi! | hi! - hi! | Capacity: 0 - hi! | Room  - Room hi! | hi! - hi! | Capacity: 0 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 0 - hi! | Capacity: 52 | Room Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 1 - Room hi! | hi! - hi! | Capacity: 0 - hi! |  -  | Capacity: 35 - Room  - Room hi! | hi! - hi! | Capacity: 0 |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 0 | Capacity: 10", "Room Room hi! - hi! - hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 1 | Capacity: 0 | Room hi! | hi! - hi! | Capacity: 0 - hi! - hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 | Capacity: -1");
        boolean boolean5 = room4.isUnderMaintenance();
        room4.setUnderMaintenance(false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test22444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22444");
        room.Room room4 = new room.Room("Room hi! | hi! - hi! | Capacity: 0", (int) (byte) 10, "hi!", "");
        room4.setUnderMaintenance(true);
        java.lang.String str7 = room4.toString();
        room4.notifyObservers();
        room4.setScannedID("hi! - hi!");
        room4.setOccupied(false);
        int int13 = room4.getCapacity();
        java.lang.String str14 = room4.getScannedID();
        boolean boolean15 = room4.isUnderMaintenance();
        java.lang.String str16 = room4.toString();
        java.lang.String str17 = room4.toString();
        room4.setEnabled(true);
        boolean boolean20 = room4.isEnabled();
        room4.setUnderMaintenance(false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10" + "'", str7, "Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi! - hi!" + "'", str14, "hi! - hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10" + "'", str16, "Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10" + "'", str17, "Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test22445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22445");
        room.Room room4 = new room.Room("hi!", (int) (byte) 100, "", "Room hi! | hi! - hi! | Capacity: 0");
        java.lang.String str5 = room4.getScannedID();
        java.lang.String str6 = room4.getBuildingName();
        room4.setUnderMaintenance(false);
        room4.setScannedID("Room hi! | hi! - hi! | Capacity: 0 - hi! - ");
        room4.setScannedID("");
        java.lang.String str13 = room4.toString();
        boolean boolean14 = room4.isOccupied();
        java.lang.String str15 = room4.getRoomNumber();
        boolean boolean16 = room4.isOccupied();
        room4.setEnabled(false);
        java.lang.String str19 = room4.toString();
        boolean boolean20 = room4.isUnderMaintenance();
        boolean boolean21 = room4.isUnderMaintenance();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100" + "'", str13, "Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str15, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100" + "'", str19, "Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test22446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22446");
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
        room.SensorObserver sensorObserver17 = null;
        room4.addObserver(sensorObserver17);
        room.SensorObserver sensorObserver19 = null;
        room4.addObserver(sensorObserver19);
        boolean boolean21 = room4.isOccupied();
        room.SensorObserver sensorObserver22 = null;
        room4.addObserver(sensorObserver22);
        java.lang.String str24 = room4.getRoomID();
        java.lang.String str25 = room4.getRoomID();
        java.lang.String str26 = room4.getRoomNumber();
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str11, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
    }

    @Test
    public void test22447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22447");
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
        boolean boolean24 = room4.isUnderMaintenance();
        boolean boolean25 = room4.isOccupied();
        room4.setEnabled(true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str7, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi! - hi!" + "'", str18, "hi! - hi!");
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test22448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22448");
        room.Room room4 = new room.Room("Room hi! | hi! - hi! | Capacity: 0", (int) (byte) 10, "hi!", "");
        int int5 = room4.getCapacity();
        java.lang.String str6 = room4.getRoomID();
        room4.setScannedID("Room Room hi! | hi! - hi! | Capacity: 0 |  - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 0");
        java.lang.String str9 = room4.getBuildingName();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str6, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test22449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22449");
        room.Room room4 = new room.Room("hi!", (int) (short) 0, "hi! - hi!", "Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100");
        java.lang.String str5 = room4.getScannedID();
        java.lang.String str6 = room4.toString();
        room4.setUnderMaintenance(false);
        room.SensorObserver sensorObserver9 = null;
        room4.removeObserver(sensorObserver9);
        java.lang.String str11 = room4.getRoomID();
        room4.setScannedID("Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 1");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Room hi! | hi! - hi! - Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | Capacity: 0" + "'", str6, "Room hi! | hi! - hi! - Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test22450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22450");
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
        java.lang.String str17 = room4.getRoomNumber();
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str11, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test22451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22451");
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
        java.lang.String str18 = room4.toString();
        room.SensorObserver sensorObserver19 = null;
        room4.addObserver(sensorObserver19);
        java.lang.String str21 = room4.getScannedID();
        // The following exception was thrown during execution in test generation
        try {
            room4.setUnderMaintenance(true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str7, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str10, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str18, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test22452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22452");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        java.lang.String str5 = room4.toString();
        java.lang.String str6 = room4.getRoomID();
        boolean boolean7 = room4.isUnderMaintenance();
        java.lang.String str8 = room4.getRoomNumber();
        room4.setEnabled(false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str5, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test22453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22453");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        java.lang.String str5 = room4.getScannedID();
        room4.setScannedID("hi!");
        java.lang.String str8 = room4.getRoomNumber();
        java.lang.String str9 = room4.getFullLocation();
        java.lang.String str10 = room4.getBuildingName();
        java.lang.String str11 = room4.toString();
        room4.setOccupied(true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi! - hi!" + "'", str9, "hi! - hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str11, "Room hi! | hi! - hi! | Capacity: 0");
    }

    @Test
    public void test22454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22454");
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
        room.SensorObserver sensorObserver17 = null;
        room4.addObserver(sensorObserver17);
        room.SensorObserver sensorObserver19 = null;
        room4.addObserver(sensorObserver19);
        boolean boolean21 = room4.isOccupied();
        boolean boolean22 = room4.isEnabled();
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str11, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test22455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22455");
        room.Room room4 = new room.Room("Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 | hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 0 - hi! - hi! - Room hi! | hi! - hi! | Capacity: 0", 35, "Room hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 1 - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi!", "Room Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! |  - Room hi! | hi! - hi! | Capacity: 0 - Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: -1");
        java.lang.Class<?> wildcardClass5 = room4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test22456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22456");
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
        room4.setOccupied(false);
        room.SensorObserver sensorObserver19 = null;
        room4.addObserver(sensorObserver19);
        java.lang.String str21 = room4.getBuildingName();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str7, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str10, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str14, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
    }

    @Test
    public void test22457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22457");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        room.SensorObserver sensorObserver5 = null;
        room4.addObserver(sensorObserver5);
        java.lang.String str7 = room4.getScannedID();
        room.SensorObserver sensorObserver8 = null;
        room4.removeObserver(sensorObserver8);
        java.lang.String str10 = room4.getRoomNumber();
        java.lang.String str11 = room4.toString();
        room4.setScannedID("Room hi! | hi! - hi! | Capacity: 0 - hi!");
        room4.setOccupied(false);
        boolean boolean16 = room4.isEnabled();
        room.SensorObserver sensorObserver17 = null;
        room4.removeObserver(sensorObserver17);
        java.lang.String str19 = room4.getBuildingName();
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str11, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test22458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22458");
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
        room4.setOccupied(false);
        room4.setEnabled(false);
        room4.notifyObservers();
        room4.setUnderMaintenance(false);
        java.lang.String str22 = room4.getRoomNumber();
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
    }

    @Test
    public void test22459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22459");
        room.Room room4 = new room.Room("hi!", (int) (byte) 1, "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10", "hi!");
        room4.notifyObservers();
        java.lang.String str6 = room4.getScannedID();
        boolean boolean7 = room4.isOccupied();
        room4.setUnderMaintenance(false);
        boolean boolean10 = room4.isOccupied();
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test22460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22460");
        room.Room room4 = new room.Room("", (int) ' ', "Room hi! | hi! - hi! | Capacity: 0 - hi! - hi!", "Room Room hi! | hi! - hi! | Capacity: 0 | hi! - hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 97");
        room4.setScannedID("Room hi! | hi! - hi! | Capacity: 0 - hi!");
        java.lang.String str7 = room4.getRoomID();
        boolean boolean8 = room4.isOccupied();
        java.lang.String str9 = room4.getScannedID();
        java.lang.String str10 = room4.getScannedID();
        java.lang.String str11 = room4.getFullLocation();
        room4.setEnabled(false);
        room4.setOccupied(false);
        room4.setOccupied(true);
        java.lang.String str18 = room4.getScannedID();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0 - hi!" + "'", str9, "Room hi! | hi! - hi! | Capacity: 0 - hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0 - hi!" + "'", str10, "Room hi! | hi! - hi! | Capacity: 0 - hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0 - hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! - hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 97" + "'", str11, "Room hi! | hi! - hi! | Capacity: 0 - hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! - hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 97");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0 - hi!" + "'", str18, "Room hi! | hi! - hi! | Capacity: 0 - hi!");
    }

    @Test
    public void test22461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22461");
        room.Room room4 = new room.Room("", (int) (byte) 1, "Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10", "hi!");
        room4.setUnderMaintenance(false);
        java.lang.String str7 = room4.getRoomNumber();
        java.lang.String str8 = room4.getRoomID();
        room4.setScannedID("Room Room hi! | hi! - hi! | Capacity: 0 - hi! |  - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 | Capacity: 1");
        java.lang.String str11 = room4.toString();
        int int12 = room4.getCapacity();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Room  | Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! | Capacity: 1" + "'", str11, "Room  | Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! | Capacity: 1");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test22462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22462");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        room.SensorObserver sensorObserver5 = null;
        room4.addObserver(sensorObserver5);
        room.SensorObserver sensorObserver7 = null;
        room4.addObserver(sensorObserver7);
        java.lang.String str9 = room4.getFullLocation();
        int int10 = room4.getCapacity();
        room.SensorObserver sensorObserver11 = null;
        room4.addObserver(sensorObserver11);
        java.lang.String str13 = room4.getRoomNumber();
        java.lang.String str14 = room4.toString();
        boolean boolean15 = room4.isUnderMaintenance();
        boolean boolean16 = room4.isUnderMaintenance();
        boolean boolean17 = room4.isOccupied();
        room.SensorObserver sensorObserver18 = null;
        room4.removeObserver(sensorObserver18);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi! - hi!" + "'", str9, "hi! - hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str14, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test22463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22463");
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
        room4.setEnabled(false);
        room4.setOccupied(false);
        boolean boolean26 = room4.isUnderMaintenance();
        boolean boolean27 = room4.isUnderMaintenance();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    }

    @Test
    public void test22464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22464");
        room.Room room4 = new room.Room("hi!", (int) (byte) 100, "", "Room hi! | hi! - hi! | Capacity: 0");
        room4.setScannedID("");
        boolean boolean7 = room4.isOccupied();
        room4.setEnabled(true);
        int int10 = room4.getCapacity();
        java.lang.String str11 = room4.getScannedID();
        java.lang.String str12 = room4.getRoomID();
        room.SensorObserver sensorObserver13 = null;
        room4.removeObserver(sensorObserver13);
        java.lang.String str15 = room4.toString();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100" + "'", str15, "Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100");
    }

    @Test
    public void test22465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22465");
        room.Room room4 = new room.Room("hi! - ", 10, "Room Room hi! | hi! - hi! | Capacity: 0 | Room hi! | hi! - hi! | Capacity: 0 - hi! - hi! | Capacity: 100", "");
        java.lang.String str5 = room4.getRoomNumber();
        room4.setUnderMaintenance(false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test22466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22466");
        room.Room room4 = new room.Room("", (int) (short) 10, "Room hi! | hi! - hi! | Capacity: 0", "hi!");
        room4.setEnabled(false);
        boolean boolean7 = room4.isEnabled();
        boolean boolean8 = room4.isOccupied();
        room.SensorObserver sensorObserver9 = null;
        room4.removeObserver(sensorObserver9);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test22467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22467");
        room.Room room4 = new room.Room("Room hi! | hi! - hi! | Capacity: 0", (int) (byte) 10, "hi!", "");
        room4.setUnderMaintenance(true);
        int int7 = room4.getCapacity();
        java.lang.String str8 = room4.getScannedID();
        java.lang.String str9 = room4.getFullLocation();
        java.lang.String str10 = room4.getScannedID();
        java.lang.String str11 = room4.getFullLocation();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi! - " + "'", str9, "hi! - ");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi! - " + "'", str11, "hi! - ");
    }

    @Test
    public void test22468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22468");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        room.SensorObserver sensorObserver5 = null;
        room4.addObserver(sensorObserver5);
        java.lang.String str7 = room4.getScannedID();
        java.lang.String str8 = room4.getBuildingName();
        java.lang.String str9 = room4.getBuildingName();
        boolean boolean10 = room4.isEnabled();
        java.lang.String str11 = room4.getRoomNumber();
        java.lang.String str12 = room4.getScannedID();
        java.lang.String str13 = room4.getScannedID();
        // The following exception was thrown during execution in test generation
        try {
            room4.notifyObservers();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test22469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22469");
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
        boolean boolean17 = room4.isUnderMaintenance();
        java.lang.String str18 = room4.getRoomNumber();
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str11, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str16, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test22470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22470");
        room.Room room4 = new room.Room("hi!", (int) (byte) 1, "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10", "hi!");
        room4.notifyObservers();
        java.lang.String str6 = room4.getFullLocation();
        java.lang.String str7 = room4.getScannedID();
        boolean boolean8 = room4.isUnderMaintenance();
        java.lang.String str9 = room4.getRoomID();
        boolean boolean10 = room4.isUnderMaintenance();
        boolean boolean11 = room4.isEnabled();
        room.SensorObserver sensorObserver12 = null;
        room4.addObserver(sensorObserver12);
        // The following exception was thrown during execution in test generation
        try {
            room4.setOccupied(false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi!" + "'", str6, "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi!");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test22471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22471");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        java.lang.String str5 = room4.getScannedID();
        room4.setScannedID("hi!");
        java.lang.String str8 = room4.getBuildingName();
        room4.setEnabled(false);
        room4.notifyObservers();
        java.lang.String str12 = room4.toString();
        room.SensorObserver sensorObserver13 = null;
        room4.removeObserver(sensorObserver13);
        room4.setUnderMaintenance(false);
        room4.setScannedID("Room  | hi! - hi! - Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 97 - Room  | Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! | Capacity: 1 | Capacity: 35");
        room.SensorObserver sensorObserver19 = null;
        room4.removeObserver(sensorObserver19);
        room4.setScannedID("");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str12, "Room hi! | hi! - hi! | Capacity: 0");
    }

    @Test
    public void test22472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22472");
        room.Room room4 = new room.Room("Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 100", 0, "hi! - hi! - hi!", "hi!");
        java.lang.String str5 = room4.getScannedID();
        boolean boolean6 = room4.isEnabled();
        java.lang.String str7 = room4.getFullLocation();
        java.lang.String str8 = room4.getScannedID();
        room4.notifyObservers();
        room4.setEnabled(false);
        java.lang.String str12 = room4.getFullLocation();
        room4.setUnderMaintenance(false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi! - hi! - hi! - hi!" + "'", str7, "hi! - hi! - hi! - hi!");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi! - hi! - hi! - hi!" + "'", str12, "hi! - hi! - hi! - hi!");
    }

    @Test
    public void test22473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22473");
        room.Room room4 = new room.Room("hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 100 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  - Room Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! | Room  - Room hi! | hi! - hi! | Capacity: 0 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 0 - Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 97 | Capacity: 0", 10, "Room hi! | hi! - hi! | Capacity: 0 - hi! -  - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! - Room Room  - Room hi! | hi! - hi! | Capacity: 0 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 0 | Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 - Room hi! | Room hi! | hi! - hi! | Capacity: 0 - hi! - Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 1 | Capacity: -1", "Room Room Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! |  - Room hi! | hi! - hi! | Capacity: 0 - Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: -1 | Room  - Room hi! | hi! - hi! | Capacity: 0 |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 0 - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! | Capacity: 97");
    }

    @Test
    public void test22474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22474");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        boolean boolean5 = room4.isEnabled();
        java.lang.String str6 = room4.getBuildingName();
        java.lang.String str7 = room4.getBuildingName();
        room.SensorObserver sensorObserver8 = null;
        room4.addObserver(sensorObserver8);
        // The following exception was thrown during execution in test generation
        try {
            room4.setScannedID("Room Room Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 100 | hi! - hi! - hi! - Room  | Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! | Capacity: 1 | Capacity: 0");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test22475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22475");
        room.Room room4 = new room.Room("hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10", (-1), "Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 | hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 0", "Room hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 1");
        room4.setOccupied(false);
        boolean boolean7 = room4.isOccupied();
        int int8 = room4.getCapacity();
        boolean boolean9 = room4.isOccupied();
        room4.setScannedID("Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 | hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 0 - Room hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 1");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test22476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22476");
        room.Room room4 = new room.Room("Room  | Room hi! | hi! - hi! | Capacity: 0 -  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 32", (int) (short) -1, "Room hi! -  | Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 10", "Room hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 1 - Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | hi! -  - Room  - Room hi! | hi! - hi! | Capacity: 0 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 0 | Capacity: 10");
        java.lang.String str5 = room4.getBuildingName();
        boolean boolean6 = room4.isOccupied();
        room.SensorObserver sensorObserver7 = null;
        room4.addObserver(sensorObserver7);
        room.SensorObserver sensorObserver9 = null;
        room4.addObserver(sensorObserver9);
        // The following exception was thrown during execution in test generation
        try {
            room4.setEnabled(false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Room hi! -  | Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 10" + "'", str5, "Room hi! -  | Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 10");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test22477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22477");
        room.Room room4 = new room.Room("Room Room hi! | hi! - hi! | Capacity: 0 - hi! | Room Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! - hi! - hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: -1 - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 | Capacity: 10 - Room Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 | Room Room Room hi! | hi! - hi! | Capacity: 0 | Room hi! | hi! - hi! | Capacity: 0 - hi! - hi! | Capacity: 100 |  - hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 10 - Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 100 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: -1 | Capacity: 52", (int) (byte) 100, "hi! - hi! - Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 | Capacity: 0", "Room Room hi! | hi! - hi! | Capacity: 0 - hi! - hi! | Room Room hi! | hi! - hi! | Capacity: 0 | Room hi! | hi! - hi! | Capacity: 0 - hi! - hi! | Capacity: 100 - Room  - Room hi! | hi! - hi! | Capacity: 0 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 0 | Capacity: 10");
    }

    @Test
    public void test22478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22478");
        room.Room room4 = new room.Room("Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 100", 0, "hi! - hi! - hi!", "hi!");
        room4.setEnabled(true);
        java.lang.String str7 = room4.getRoomNumber();
        room4.setScannedID("Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi!");
        java.lang.String str10 = room4.toString();
        java.lang.String str11 = room4.toString();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 100 | hi! - hi! - hi! - hi! | Capacity: 0" + "'", str10, "Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 100 | hi! - hi! - hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 100 | hi! - hi! - hi! - hi! | Capacity: 0" + "'", str11, "Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 100 | hi! - hi! - hi! - hi! | Capacity: 0");
    }

    @Test
    public void test22479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22479");
        room.Room room4 = new room.Room("Room hi! | hi! - hi! | Capacity: 0", (int) (byte) 10, "hi!", "");
        room4.setUnderMaintenance(true);
        boolean boolean7 = room4.isOccupied();
        java.lang.String str8 = room4.getFullLocation();
        boolean boolean9 = room4.isOccupied();
        room4.setUnderMaintenance(false);
        room4.setOccupied(true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi! - " + "'", str8, "hi! - ");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test22480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22480");
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
        java.lang.String str16 = room4.getScannedID();
        java.lang.String str17 = room4.getBuildingName();
        room4.setEnabled(true);
        java.lang.String str20 = room4.getRoomID();
        java.lang.String str21 = room4.getFullLocation();
        room4.setScannedID(" - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi!");
        boolean boolean24 = room4.isUnderMaintenance();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi! - hi!" + "'", str21, "hi! - hi!");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test22481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22481");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        java.lang.String str5 = room4.getScannedID();
        room4.setUnderMaintenance(false);
        room.SensorObserver sensorObserver8 = null;
        room4.addObserver(sensorObserver8);
        room.SensorObserver sensorObserver10 = null;
        room4.removeObserver(sensorObserver10);
        room4.setScannedID("Room hi! | hi! - hi! | Capacity: 0");
        room4.setUnderMaintenance(true);
        boolean boolean16 = room4.isUnderMaintenance();
        java.lang.String str17 = room4.getBuildingName();
        boolean boolean18 = room4.isUnderMaintenance();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test22482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22482");
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
        room4.notifyObservers();
        room4.notifyObservers();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi! - hi!" + "'", str12, "hi! - hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test22483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22483");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        java.lang.String str5 = room4.getScannedID();
        room4.setScannedID("hi!");
        room4.setUnderMaintenance(true);
        java.lang.String str10 = room4.getScannedID();
        java.lang.String str11 = room4.getFullLocation();
        room4.setUnderMaintenance(true);
        java.lang.String str14 = room4.getFullLocation();
        java.lang.String str15 = room4.getRoomID();
        room4.setEnabled(false);
        java.lang.String str18 = room4.getFullLocation();
        room4.setOccupied(true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi! - hi!" + "'", str11, "hi! - hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi! - hi!" + "'", str14, "hi! - hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi! - hi!" + "'", str18, "hi! - hi!");
    }

    @Test
    public void test22484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22484");
        room.Room room4 = new room.Room("Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10", (int) (byte) 1, "", "Room Room hi! | hi! - hi! | Capacity: 0 | Room hi! | hi! - hi! | Capacity: 0 - hi! - hi! | Capacity: 100");
        room4.setScannedID("Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 | hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 0");
        boolean boolean7 = room4.isOccupied();
        room4.setOccupied(true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test22485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22485");
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
        java.lang.String str18 = room4.getFullLocation();
        room4.setOccupied(true);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str11, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str17, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi! - hi!" + "'", str18, "hi! - hi!");
    }

    @Test
    public void test22486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22486");
        room.Room room4 = new room.Room("hi!", (int) (byte) 100, "", "Room hi! | hi! - hi! | Capacity: 0");
        java.lang.String str5 = room4.toString();
        room4.setScannedID("Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 100");
        java.lang.String str8 = room4.getRoomNumber();
        java.lang.String str9 = room4.getBuildingName();
        room.SensorObserver sensorObserver10 = null;
        room4.addObserver(sensorObserver10);
        room.SensorObserver sensorObserver12 = null;
        room4.addObserver(sensorObserver12);
        java.lang.String str14 = room4.toString();
        java.lang.String str15 = room4.getRoomID();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100" + "'", str5, "Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str8, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100" + "'", str14, "Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test22487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22487");
        room.Room room4 = new room.Room("hi!", (int) (byte) 100, "", "Room hi! | hi! - hi! | Capacity: 0");
        room4.setScannedID("");
        boolean boolean7 = room4.isOccupied();
        room4.setOccupied(true);
        boolean boolean10 = room4.isEnabled();
        boolean boolean11 = room4.isEnabled();
        java.lang.String str12 = room4.getScannedID();
        boolean boolean13 = room4.isOccupied();
        room.SensorObserver sensorObserver14 = null;
        room4.addObserver(sensorObserver14);
        java.lang.String str16 = room4.getRoomID();
        java.lang.String str17 = room4.getScannedID();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test22488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22488");
        room.Room room4 = new room.Room("Room hi! | hi! - hi! | Capacity: 0", (int) (byte) 100, "Room hi! | hi! - hi! | Capacity: 0 - hi!", "hi!");
        java.lang.String str5 = room4.getRoomID();
        room4.setScannedID("hi! - hi!");
        java.lang.String str8 = room4.getScannedID();
        boolean boolean9 = room4.isUnderMaintenance();
        java.lang.String str10 = room4.getRoomNumber();
        boolean boolean11 = room4.isOccupied();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str5, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi! - hi!" + "'", str8, "hi! - hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test22489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22489");
        room.Room room4 = new room.Room("Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100", (int) 'a', "hi! - hi!", "Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10");
        room.SensorObserver sensorObserver5 = null;
        room4.removeObserver(sensorObserver5);
        java.lang.String str7 = room4.getBuildingName();
        room4.notifyObservers();
        java.lang.String str9 = room4.getRoomID();
        room4.setScannedID("Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 1");
        boolean boolean12 = room4.isEnabled();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi! - hi!" + "'", str7, "hi! - hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100" + "'", str9, "Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test22490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22490");
        room.Room room4 = new room.Room("hi!", (int) (byte) 100, "", "Room hi! | hi! - hi! | Capacity: 0");
        java.lang.String str5 = room4.getScannedID();
        java.lang.String str6 = room4.getBuildingName();
        room4.setUnderMaintenance(false);
        room4.setScannedID("Room hi! | hi! - hi! | Capacity: 0 - hi! - ");
        java.lang.String str11 = room4.toString();
        java.lang.String str12 = room4.getRoomNumber();
        room4.setOccupied(true);
        room4.notifyObservers();
        boolean boolean16 = room4.isEnabled();
        int int17 = room4.getCapacity();
        java.lang.String str18 = room4.toString();
        int int19 = room4.getCapacity();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100" + "'", str11, "Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str12, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100" + "'", str18, "Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
    }

    @Test
    public void test22491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22491");
        room.Room room4 = new room.Room("Room hi! | hi! - hi! | Capacity: 0", (int) (byte) 100, "Room hi! | hi! - hi! | Capacity: 0 - hi!", "hi!");
        java.lang.String str5 = room4.getRoomID();
        int int6 = room4.getCapacity();
        room4.setScannedID("Room Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! -  | hi! - Room hi! | hi! - hi! | Capacity: 0 - Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 100 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: -1 | Capacity: 100");
        room4.setEnabled(false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str5, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
    }

    @Test
    public void test22492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22492");
        room.Room room4 = new room.Room("", (int) (byte) 100, "Room hi! | hi! - hi! | Capacity: 0 - hi!", "");
        java.lang.String str5 = room4.getBuildingName();
        java.lang.String str6 = room4.getRoomNumber();
        room.SensorObserver sensorObserver7 = null;
        room4.removeObserver(sensorObserver7);
        room.SensorObserver sensorObserver9 = null;
        room4.addObserver(sensorObserver9);
        java.lang.String str11 = room4.getRoomID();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0 - hi!" + "'", str5, "Room hi! | hi! - hi! | Capacity: 0 - hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test22493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22493");
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
        java.lang.String str20 = room4.toString();
        java.lang.String str21 = room4.getBuildingName();
        java.lang.String str22 = room4.getBuildingName();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str7, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str20, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
    }

    @Test
    public void test22494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22494");
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
        java.lang.String str24 = room4.getScannedID();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNull(str24);
    }

    @Test
    public void test22495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22495");
        room.Room room4 = new room.Room("Room hi! | hi! - hi! | Capacity: 0", (int) (byte) 10, "hi!", "");
        room4.setUnderMaintenance(true);
        java.lang.String str7 = room4.toString();
        room4.notifyObservers();
        room4.setScannedID("hi! - hi!");
        java.lang.String str11 = room4.getRoomID();
        room4.setEnabled(true);
        java.lang.String str14 = room4.getScannedID();
        boolean boolean15 = room4.isUnderMaintenance();
        java.lang.String str16 = room4.getRoomNumber();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10" + "'", str7, "Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str11, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi! - hi!" + "'", str14, "hi! - hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test22496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22496");
        room.Room room4 = new room.Room("Room Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 | hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 0 - hi! - hi! - Room hi! | hi! - hi! | Capacity: 0 | Room hi! | hi! - hi! | Capacity: 0 - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! - hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 97 - Room hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 1 - Room hi! | hi! - hi! - Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | Capacity: 0 | Capacity: 10", (int) (short) 100, "Room Room hi! | hi! - hi! | Capacity: 0 - hi! - hi! - Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | hi! -  - Room  - Room hi! | hi! - hi! | Capacity: 0 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 0 | Capacity: 10 | hi! -  - Room  - Room hi! | hi! - hi! | Capacity: 0 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 0 - hi! -  - Room  - Room hi! | hi! - hi! | Capacity: 0 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 0 | Capacity: 100", " - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10");
    }

    @Test
    public void test22497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22497");
        room.Room room4 = new room.Room("hi!", (int) (byte) 100, "", "Room hi! | hi! - hi! | Capacity: 0");
        java.lang.String str5 = room4.getScannedID();
        java.lang.String str6 = room4.getBuildingName();
        room4.setUnderMaintenance(false);
        room4.setEnabled(false);
        room4.notifyObservers();
        room4.setUnderMaintenance(true);
        java.lang.String str14 = room4.getRoomID();
        java.lang.String str15 = room4.getRoomID();
        int int16 = room4.getCapacity();
        java.lang.String str17 = room4.toString();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100" + "'", str17, "Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100");
    }

    @Test
    public void test22498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22498");
        room.Room room4 = new room.Room("Room hi! | hi! - hi! | Capacity: 0 - hi! - hi!", (int) (byte) 10, "Room Room hi! | hi! - hi! | Capacity: 0 | Room hi! | hi! - hi! | Capacity: 0 - hi! - hi! | Capacity: 100", "Room  - Room hi! | hi! - hi! | Capacity: 0 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 0");
        boolean boolean5 = room4.isEnabled();
        java.lang.String str6 = room4.getFullLocation();
        java.lang.String str7 = room4.toString();
        int int8 = room4.getCapacity();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Room Room hi! | hi! - hi! | Capacity: 0 | Room hi! | hi! - hi! | Capacity: 0 - hi! - hi! | Capacity: 100 - Room  - Room hi! | hi! - hi! | Capacity: 0 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 0" + "'", str6, "Room Room hi! | hi! - hi! | Capacity: 0 | Room hi! | hi! - hi! | Capacity: 0 - hi! - hi! | Capacity: 100 - Room  - Room hi! | hi! - hi! | Capacity: 0 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Room Room hi! | hi! - hi! | Capacity: 0 - hi! - hi! | Room Room hi! | hi! - hi! | Capacity: 0 | Room hi! | hi! - hi! | Capacity: 0 - hi! - hi! | Capacity: 100 - Room  - Room hi! | hi! - hi! | Capacity: 0 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 0 | Capacity: 10" + "'", str7, "Room Room hi! | hi! - hi! | Capacity: 0 - hi! - hi! | Room Room hi! | hi! - hi! | Capacity: 0 | Room hi! | hi! - hi! | Capacity: 0 - hi! - hi! | Capacity: 100 - Room  - Room hi! | hi! - hi! | Capacity: 0 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 0 | Capacity: 10");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
    }

    @Test
    public void test22499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22499");
        room.Room room4 = new room.Room("Room hi! | hi! - hi! | Capacity: 0", (int) (byte) 100, "Room hi! | hi! - hi! | Capacity: 0 - hi!", "hi!");
        java.lang.String str5 = room4.getRoomID();
        java.lang.String str6 = room4.getRoomNumber();
        java.lang.String str7 = room4.getRoomID();
        room.SensorObserver sensorObserver8 = null;
        room4.removeObserver(sensorObserver8);
        int int10 = room4.getCapacity();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str5, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str7, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
    }

    @Test
    public void test22500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22500");
        room.Room room4 = new room.Room("hi!", (int) ' ', "Room hi! | hi! - hi! | Capacity: 0", "Room hi! | hi! - hi! | Capacity: 0");
        int int5 = room4.getCapacity();
        room.SensorObserver sensorObserver6 = null;
        room4.addObserver(sensorObserver6);
        java.lang.String str8 = room4.getRoomID();
        // The following exception was thrown during execution in test generation
        try {
            room4.setScannedID("Room hi! | hi! - hi! | Capacity: 0 - hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 100 - Room hi! | hi! - hi! | Capacity: 0 - hi! - ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }
}

