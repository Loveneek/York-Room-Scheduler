import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest38 {

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
    public void test19001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19001");
        room.Room room4 = new room.Room("hi!", (int) ' ', "Room hi! | hi! - hi! | Capacity: 0", "Room hi! | hi! - hi! | Capacity: 0");
        boolean boolean5 = room4.isOccupied();
        java.lang.String str6 = room4.getRoomNumber();
        room4.notifyObservers();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str6, "Room hi! | hi! - hi! | Capacity: 0");
    }

    @Test
    public void test19002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19002");
        room.Room room4 = new room.Room("Room hi! | hi! - hi! | Capacity: 0", (int) (byte) 10, "hi!", "");
        room4.setUnderMaintenance(true);
        boolean boolean7 = room4.isOccupied();
        boolean boolean8 = room4.isEnabled();
        room4.notifyObservers();
        java.lang.String str10 = room4.getRoomID();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str10, "Room hi! | hi! - hi! | Capacity: 0");
    }

    @Test
    public void test19003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19003");
        room.Room room4 = new room.Room("Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 | hi! - Room hi! | hi! - hi! | Capacity: 0 - Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 97 | Capacity: 35", 52, "", "hi! - ");
        room4.setEnabled(true);
    }

    @Test
    public void test19004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19004");
        room.Room room4 = new room.Room("", (-1), "", "");
        room.SensorObserver sensorObserver5 = null;
        room4.removeObserver(sensorObserver5);
        java.lang.String str7 = room4.getRoomID();
        java.lang.String str8 = room4.getFullLocation();
        java.lang.String str9 = room4.getScannedID();
        room4.setEnabled(true);
        room4.setUnderMaintenance(false);
        room4.notifyObservers();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + " - " + "'", str8, " - ");
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test19005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19005");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        room.SensorObserver sensorObserver5 = null;
        room4.addObserver(sensorObserver5);
        java.lang.String str7 = room4.toString();
        boolean boolean8 = room4.isUnderMaintenance();
        java.lang.String str9 = room4.toString();
        java.lang.String str10 = room4.getBuildingName();
        // The following exception was thrown during execution in test generation
        try {
            room4.setEnabled(true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str7, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str9, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test19006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19006");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        boolean boolean5 = room4.isOccupied();
        room4.setEnabled(false);
        java.lang.String str8 = room4.getFullLocation();
        java.lang.String str9 = room4.getRoomID();
        int int10 = room4.getCapacity();
        room4.setEnabled(false);
        room4.setUnderMaintenance(true);
        java.lang.String str15 = room4.getBuildingName();
        java.lang.String str16 = room4.getRoomNumber();
        room.SensorObserver sensorObserver17 = null;
        room4.removeObserver(sensorObserver17);
        int int19 = room4.getCapacity();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi! - hi!" + "'", str8, "hi! - hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test19007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19007");
        room.Room room4 = new room.Room("Room hi! | hi! - hi! | Capacity: 0 - hi! - ", (int) (short) -1, "Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 100 | hi! - hi! - hi! - hi! | Capacity: 0", "Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 1");
        room4.setEnabled(true);
        boolean boolean7 = room4.isUnderMaintenance();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test19008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19008");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        room.SensorObserver sensorObserver5 = null;
        room4.addObserver(sensorObserver5);
        room.SensorObserver sensorObserver7 = null;
        room4.addObserver(sensorObserver7);
        java.lang.String str9 = room4.getBuildingName();
        java.lang.String str10 = room4.getRoomID();
        java.lang.String str11 = room4.getRoomNumber();
        room.SensorObserver sensorObserver12 = null;
        room4.removeObserver(sensorObserver12);
        java.lang.String str14 = room4.getFullLocation();
        boolean boolean15 = room4.isEnabled();
        java.lang.String str16 = room4.getBuildingName();
        boolean boolean17 = room4.isOccupied();
        room.SensorObserver sensorObserver18 = null;
        room4.removeObserver(sensorObserver18);
        boolean boolean20 = room4.isOccupied();
        java.lang.String str21 = room4.getScannedID();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi! - hi!" + "'", str14, "hi! - hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test19009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19009");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        room.SensorObserver sensorObserver5 = null;
        room4.addObserver(sensorObserver5);
        java.lang.String str7 = room4.getScannedID();
        java.lang.String str8 = room4.getFullLocation();
        boolean boolean9 = room4.isOccupied();
        boolean boolean10 = room4.isUnderMaintenance();
        int int11 = room4.getCapacity();
        java.lang.String str12 = room4.getRoomNumber();
        room.SensorObserver sensorObserver13 = null;
        room4.addObserver(sensorObserver13);
        room.SensorObserver sensorObserver15 = null;
        room4.removeObserver(sensorObserver15);
        boolean boolean17 = room4.isOccupied();
        java.lang.String str18 = room4.getBuildingName();
        // The following exception was thrown during execution in test generation
        try {
            room4.setEnabled(true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi! - hi!" + "'", str8, "hi! - hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test19010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19010");
        room.Room room4 = new room.Room("hi!", (int) (byte) 100, "", "Room hi! | hi! - hi! | Capacity: 0");
        room4.notifyObservers();
        room.SensorObserver sensorObserver6 = null;
        room4.removeObserver(sensorObserver6);
        java.lang.String str8 = room4.getRoomNumber();
        int int9 = room4.getCapacity();
        room4.notifyObservers();
        java.lang.String str11 = room4.getRoomID();
        boolean boolean12 = room4.isOccupied();
        room4.setOccupied(false);
        java.lang.String str15 = room4.getRoomID();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str8, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test19011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19011");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        boolean boolean5 = room4.isOccupied();
        room4.setEnabled(false);
        boolean boolean8 = room4.isUnderMaintenance();
        int int9 = room4.getCapacity();
        room4.setUnderMaintenance(false);
        java.lang.String str12 = room4.getRoomNumber();
        java.lang.String str13 = room4.toString();
        room4.setScannedID("hi! - hi! - Room hi! | hi! - hi! | Capacity: 0 - hi! - ");
        room4.setUnderMaintenance(true);
        boolean boolean18 = room4.isOccupied();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str13, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test19012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19012");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        java.lang.String str5 = room4.getScannedID();
        room4.setScannedID("hi!");
        boolean boolean8 = room4.isEnabled();
        int int9 = room4.getCapacity();
        int int10 = room4.getCapacity();
        room4.setEnabled(true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test19013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19013");
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
        java.lang.String str20 = room4.getScannedID();
        room4.notifyObservers();
        room4.setOccupied(true);
        room4.setOccupied(false);
        room.SensorObserver sensorObserver26 = null;
        room4.removeObserver(sensorObserver26);
        int int28 = room4.getCapacity();
        room4.setOccupied(false);
        boolean boolean31 = room4.isOccupied();
        boolean boolean32 = room4.isUnderMaintenance();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str20, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 100 + "'", int28 == 100);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
    }

    @Test
    public void test19014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19014");
        room.Room room4 = new room.Room("Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 97", (int) '#', " - Room hi! | hi! - hi! | Capacity: 0 - Room hi! | hi! - hi! | Capacity: 0 - hi!", "Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10");
        java.lang.String str5 = room4.toString();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Room Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 97 |  - Room hi! | hi! - hi! | Capacity: 0 - Room hi! | hi! - hi! | Capacity: 0 - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 35" + "'", str5, "Room Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 97 |  - Room hi! | hi! - hi! | Capacity: 0 - Room hi! | hi! - hi! | Capacity: 0 - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 35");
    }

    @Test
    public void test19015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19015");
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
        java.lang.String str18 = room4.getFullLocation();
        java.lang.String str19 = room4.getScannedID();
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str11, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi! - hi!" + "'", str14, "hi! - hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str15, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi! - hi!" + "'", str18, "hi! - hi!");
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test19016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19016");
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
        boolean boolean18 = room4.isOccupied();
        java.lang.String str19 = room4.getFullLocation();
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str11, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str13, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi! - hi!" + "'", str19, "hi! - hi!");
    }

    @Test
    public void test19017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19017");
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
        boolean boolean20 = room4.isEnabled();
        room4.setOccupied(true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test19018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19018");
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
        boolean boolean14 = room4.isUnderMaintenance();
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test19019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19019");
        room.Room room4 = new room.Room("hi! - hi!", (int) (byte) -1, " - Room hi! | hi! - hi! | Capacity: 0", "Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 97");
        room4.setScannedID("Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10");
        boolean boolean7 = room4.isOccupied();
        room.SensorObserver sensorObserver8 = null;
        room4.removeObserver(sensorObserver8);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test19020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19020");
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
        room.SensorObserver sensorObserver17 = null;
        room4.removeObserver(sensorObserver17);
        int int19 = room4.getCapacity();
        room.SensorObserver sensorObserver20 = null;
        room4.addObserver(sensorObserver20);
        room.SensorObserver sensorObserver22 = null;
        room4.addObserver(sensorObserver22);
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
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test19021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19021");
        room.Room room4 = new room.Room("", (int) (short) 10, "Room hi! | hi! - hi! | Capacity: 0", "hi!");
        java.lang.String str5 = room4.toString();
        java.lang.String str6 = room4.getBuildingName();
        room.SensorObserver sensorObserver7 = null;
        room4.removeObserver(sensorObserver7);
        boolean boolean9 = room4.isEnabled();
        room4.setEnabled(true);
        room.SensorObserver sensorObserver12 = null;
        room4.addObserver(sensorObserver12);
        int int14 = room4.getCapacity();
        java.lang.String str15 = room4.getScannedID();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10" + "'", str5, "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str6, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test19022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19022");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        java.lang.String str5 = room4.getScannedID();
        room4.setScannedID("hi!");
        boolean boolean8 = room4.isEnabled();
        room4.setEnabled(false);
        room.SensorObserver sensorObserver11 = null;
        room4.removeObserver(sensorObserver11);
        java.lang.String str13 = room4.getScannedID();
        room4.setScannedID(" - hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10");
        room4.notifyObservers();
        room4.setUnderMaintenance(false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test19023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19023");
        room.Room room4 = new room.Room("hi!", 100, "Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 97", "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 100 - Room hi! | hi! - hi! | Capacity: 0 - hi! - ");
        room4.setOccupied(true);
        room4.setEnabled(false);
        room.SensorObserver sensorObserver9 = null;
        room4.removeObserver(sensorObserver9);
    }

    @Test
    public void test19024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19024");
        room.Room room4 = new room.Room(" - hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10", (int) (byte) 100, "Room Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! - hi! - hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: -1", "Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi!");
        int int5 = room4.getCapacity();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
    }

    @Test
    public void test19025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19025");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        java.lang.String str5 = room4.toString();
        java.lang.String str6 = room4.getScannedID();
        java.lang.String str7 = room4.getScannedID();
        java.lang.String str8 = room4.toString();
        boolean boolean9 = room4.isUnderMaintenance();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str5, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str8, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test19026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19026");
        room.Room room4 = new room.Room("Room hi! | hi! - hi! | Capacity: 0 - hi! - hi!", 52, "", "Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | hi! - hi! - hi! | Capacity: 0");
        room4.setUnderMaintenance(false);
        room4.setEnabled(true);
        java.lang.String str9 = room4.toString();
        boolean boolean10 = room4.isUnderMaintenance();
        room4.notifyObservers();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Room Room hi! | hi! - hi! | Capacity: 0 - hi! - hi! |  - Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | hi! - hi! - hi! | Capacity: 0 | Capacity: 52" + "'", str9, "Room Room hi! | hi! - hi! | Capacity: 0 - hi! - hi! |  - Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | hi! - hi! - hi! | Capacity: 0 | Capacity: 52");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test19027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19027");
        room.Room room4 = new room.Room("Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10", (int) (short) 10, "hi! - ", "Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 1");
        room4.setUnderMaintenance(true);
        java.lang.String str7 = room4.getScannedID();
        room4.setEnabled(false);
        java.lang.String str10 = room4.getRoomID();
        java.lang.String str11 = room4.getFullLocation();
        room4.setUnderMaintenance(false);
        boolean boolean14 = room4.isOccupied();
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10" + "'", str10, "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi! -  - Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 1" + "'", str11, "hi! -  - Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 1");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test19028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19028");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        java.lang.String str5 = room4.getScannedID();
        room4.setScannedID("hi!");
        boolean boolean8 = room4.isEnabled();
        int int9 = room4.getCapacity();
        java.lang.String str10 = room4.getRoomID();
        java.lang.String str11 = room4.toString();
        room4.setScannedID(" - Room hi! | hi! - hi! | Capacity: 0");
        java.lang.String str14 = room4.getRoomID();
        java.lang.String str15 = room4.getRoomNumber();
        java.lang.String str16 = room4.getFullLocation();
        room4.setUnderMaintenance(true);
        room4.setOccupied(false);
        boolean boolean21 = room4.isOccupied();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str11, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi! - hi!" + "'", str16, "hi! - hi!");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test19029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19029");
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
        boolean boolean24 = room4.isUnderMaintenance();
        room4.setEnabled(true);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi! - hi!" + "'", str8, "hi! - hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi!" + "'", str15, "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi!" + "'", str16, "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str23, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test19030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19030");
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
        room4.setEnabled(false);
        java.lang.String str28 = room4.getRoomID();
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str11, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
    }

    @Test
    public void test19031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19031");
        room.Room room4 = new room.Room("Room  | Room hi! | hi! - hi! | Capacity: 0 -  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 32", (int) (short) 10, "Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 | hi! - Room hi! | hi! - hi! | Capacity: 0 -  | Capacity: 52", "Room hi! - hi! | Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 10");
        room.SensorObserver sensorObserver5 = null;
        room4.removeObserver(sensorObserver5);
        room.SensorObserver sensorObserver7 = null;
        room4.addObserver(sensorObserver7);
    }

    @Test
    public void test19032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19032");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        room.SensorObserver sensorObserver5 = null;
        room4.addObserver(sensorObserver5);
        java.lang.String str7 = room4.getFullLocation();
        boolean boolean8 = room4.isOccupied();
        java.lang.String str9 = room4.toString();
        java.lang.String str10 = room4.getScannedID();
        // The following exception was thrown during execution in test generation
        try {
            room4.setScannedID("Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 100 - Room hi! | hi! - hi! | Capacity: 0 - hi! - ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi! - hi!" + "'", str7, "hi! - hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str9, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test19033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19033");
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
        room4.setScannedID("Room hi! | hi! - hi! | Capacity: 0 - hi!");
        room.SensorObserver sensorObserver18 = null;
        room4.removeObserver(sensorObserver18);
        boolean boolean20 = room4.isEnabled();
        room.SensorObserver sensorObserver21 = null;
        room4.removeObserver(sensorObserver21);
        boolean boolean23 = room4.isUnderMaintenance();
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi! - hi!" + "'", str12, "hi! - hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test19034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19034");
        room.Room room4 = new room.Room("hi!", (int) (byte) 100, "", "Room hi! | hi! - hi! | Capacity: 0");
        java.lang.String str5 = room4.getRoomNumber();
        room4.notifyObservers();
        room.SensorObserver sensorObserver7 = null;
        room4.addObserver(sensorObserver7);
        room.SensorObserver sensorObserver9 = null;
        room4.removeObserver(sensorObserver9);
        room4.setEnabled(false);
        java.lang.String str13 = room4.getFullLocation();
        boolean boolean14 = room4.isEnabled();
        boolean boolean15 = room4.isEnabled();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str5, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + " - Room hi! | hi! - hi! | Capacity: 0" + "'", str13, " - Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test19035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19035");
        room.Room room4 = new room.Room("Room Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 100 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 -  - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! | Capacity: 0 | Room  - Room hi! | hi! - hi! | Capacity: 0 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 0 -  | Capacity: -1", (int) ' ', "", "Room Room hi! - hi! - hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 1 | Capacity: 0 | Room hi! | hi! - hi! | Capacity: 0 - hi! - hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 | Capacity: -1");
        room4.setUnderMaintenance(true);
    }

    @Test
    public void test19036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19036");
        room.Room room4 = new room.Room(" - Room hi! | hi! - hi! | Capacity: 0", (int) '4', "Room Room hi! | hi! - hi! | Capacity: 0 | hi! - hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 97", "Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi!");
        int int5 = room4.getCapacity();
        room.SensorObserver sensorObserver6 = null;
        room4.addObserver(sensorObserver6);
        java.lang.String str8 = room4.getBuildingName();
        java.lang.String str9 = room4.getScannedID();
        boolean boolean10 = room4.isOccupied();
        java.lang.Class<?> wildcardClass11 = room4.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Room Room hi! | hi! - hi! | Capacity: 0 | hi! - hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 97" + "'", str8, "Room Room hi! | hi! - hi! | Capacity: 0 | hi! - hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 97");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test19037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19037");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        boolean boolean5 = room4.isOccupied();
        room4.setEnabled(false);
        java.lang.String str8 = room4.getFullLocation();
        java.lang.String str9 = room4.getRoomID();
        java.lang.String str10 = room4.getRoomID();
        room.SensorObserver sensorObserver11 = null;
        room4.removeObserver(sensorObserver11);
        room4.setScannedID("Room  - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 100 | hi! - hi! - hi! - hi! | Capacity: 0 | Capacity: 0");
        room4.setOccupied(true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi! - hi!" + "'", str8, "hi! - hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test19038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19038");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        java.lang.String str5 = room4.getScannedID();
        room4.setScannedID("hi!");
        room4.setUnderMaintenance(true);
        java.lang.String str10 = room4.getFullLocation();
        java.lang.String str11 = room4.getScannedID();
        java.lang.String str12 = room4.getScannedID();
        room.SensorObserver sensorObserver13 = null;
        room4.removeObserver(sensorObserver13);
        java.lang.String str15 = room4.getBuildingName();
        java.lang.Class<?> wildcardClass16 = room4.getClass();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi! - hi!" + "'", str10, "hi! - hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test19039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19039");
        room.Room room4 = new room.Room("hi!", 1, "Room hi! | hi! - hi! | Capacity: 0 - hi!", "Room hi! | hi! - hi! | Capacity: 0 - hi!");
        int int5 = room4.getCapacity();
        room4.setUnderMaintenance(false);
        java.lang.String str8 = room4.toString();
        int int9 = room4.getCapacity();
        room.SensorObserver sensorObserver10 = null;
        room4.addObserver(sensorObserver10);
        boolean boolean12 = room4.isOccupied();
        // The following exception was thrown during execution in test generation
        try {
            room4.setScannedID("Room Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 | hi! - hi! - Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 - Room hi! | hi! - hi! | Capacity: 0 - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 0 | Room hi! | hi! - hi! | Capacity: 0 - hi! -  - Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | Room hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 1 - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! | Capacity: 97 - Room Room Room hi! | hi! - hi! | Capacity: 0 - hi! | Room hi! | Room hi! | hi! - hi! | Capacity: 0 - hi! - Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 1 - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 32 |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 35 | Capacity: 32");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Room hi! | Room hi! | hi! - hi! | Capacity: 0 - hi! - Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 1" + "'", str8, "Room hi! | Room hi! | hi! - hi! | Capacity: 0 - hi! - Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 1");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test19040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19040");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        boolean boolean5 = room4.isOccupied();
        room4.setEnabled(false);
        boolean boolean8 = room4.isUnderMaintenance();
        java.lang.String str9 = room4.getFullLocation();
        java.lang.String str10 = room4.toString();
        java.lang.String str11 = room4.getRoomID();
        room4.setScannedID("Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 100 - Room hi! | hi! - hi! | Capacity: 0 - hi! - ");
        room4.setUnderMaintenance(true);
        room4.setEnabled(true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi! - hi!" + "'", str9, "hi! - hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str10, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test19041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19041");
        room.Room room4 = new room.Room("hi!", 100, "Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 97", "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 100 - Room hi! | hi! - hi! | Capacity: 0 - hi! - ");
        room.SensorObserver sensorObserver5 = null;
        room4.removeObserver(sensorObserver5);
        room.SensorObserver sensorObserver7 = null;
        room4.addObserver(sensorObserver7);
        // The following exception was thrown during execution in test generation
        try {
            room4.notifyObservers();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test19042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19042");
        room.Room room4 = new room.Room("", (int) (short) -1, "Room  - Room hi! | hi! - hi! | Capacity: 0 |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 0", " - Room hi! | hi! - hi! | Capacity: 0 - Room hi! | hi! - hi! | Capacity: 0 - hi!");
        room4.setEnabled(true);
        room4.setUnderMaintenance(false);
    }

    @Test
    public void test19043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19043");
        room.Room room4 = new room.Room("Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10", 0, "Room Room hi! | hi! - hi! | Capacity: 0 | Room hi! | hi! - hi! | Capacity: 0 - hi! - hi! | Capacity: 100", "hi! - hi! - Room hi! | hi! - hi! | Capacity: 0");
        boolean boolean5 = room4.isUnderMaintenance();
        boolean boolean6 = room4.isUnderMaintenance();
        java.lang.String str7 = room4.toString();
        boolean boolean8 = room4.isUnderMaintenance();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 | Room Room hi! | hi! - hi! | Capacity: 0 | Room hi! | hi! - hi! | Capacity: 0 - hi! - hi! | Capacity: 100 - hi! - hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 0" + "'", str7, "Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 | Room Room hi! | hi! - hi! | Capacity: 0 | Room hi! | hi! - hi! | Capacity: 0 - hi! - hi! | Capacity: 100 - hi! - hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 0");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test19044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19044");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        boolean boolean5 = room4.isOccupied();
        room4.setEnabled(false);
        java.lang.String str8 = room4.getFullLocation();
        java.lang.String str9 = room4.getScannedID();
        room4.setOccupied(true);
        room4.notifyObservers();
        boolean boolean13 = room4.isUnderMaintenance();
        room4.setOccupied(true);
        java.lang.String str16 = room4.getFullLocation();
        java.lang.String str17 = room4.getRoomNumber();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi! - hi!" + "'", str8, "hi! - hi!");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi! - hi!" + "'", str16, "hi! - hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test19045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19045");
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
        room.SensorObserver sensorObserver14 = null;
        room4.removeObserver(sensorObserver14);
        java.lang.String str16 = room4.getBuildingName();
        room.SensorObserver sensorObserver17 = null;
        room4.addObserver(sensorObserver17);
        room.SensorObserver sensorObserver19 = null;
        room4.addObserver(sensorObserver19);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test19046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19046");
        room.Room room4 = new room.Room("Room hi! | hi! - hi! | Capacity: 0", (int) (byte) 100, "Room hi! | hi! - hi! | Capacity: 0 - hi!", "hi!");
        java.lang.String str5 = room4.getRoomID();
        room4.setScannedID("hi! - hi!");
        java.lang.String str8 = room4.toString();
        room4.setOccupied(true);
        java.lang.String str11 = room4.getFullLocation();
        room4.notifyObservers();
        room4.setEnabled(true);
        room4.setScannedID("Room Room  - Room hi! | hi! - hi! | Capacity: 0 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 0 -  | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room hi! | hi! - hi! | Capacity: 0 - Room Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 97 | Room hi! | hi! - hi! | Capacity: 0 - hi! -  - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 | Capacity: 100 | Capacity: 1");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str5, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Room Room hi! | hi! - hi! | Capacity: 0 | Room hi! | hi! - hi! | Capacity: 0 - hi! - hi! | Capacity: 100" + "'", str8, "Room Room hi! | hi! - hi! | Capacity: 0 | Room hi! | hi! - hi! | Capacity: 0 - hi! - hi! | Capacity: 100");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0 - hi! - hi!" + "'", str11, "Room hi! | hi! - hi! | Capacity: 0 - hi! - hi!");
    }

    @Test
    public void test19047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19047");
        room.Room room4 = new room.Room("hi!", (int) (byte) 100, "", "Room hi! | hi! - hi! | Capacity: 0");
        java.lang.String str5 = room4.getRoomNumber();
        room4.setScannedID("Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi!");
        java.lang.String str8 = room4.getBuildingName();
        java.lang.String str9 = room4.getFullLocation();
        room4.setScannedID("Room Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! - hi! - hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: -1 - Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 | Room Room hi! | hi! - hi! | Capacity: 0 | Room hi! | hi! - hi! | Capacity: 0 - hi! - hi! | Capacity: 100 - hi! - hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str5, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + " - Room hi! | hi! - hi! | Capacity: 0" + "'", str9, " - Room hi! | hi! - hi! | Capacity: 0");
    }

    @Test
    public void test19048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19048");
        room.Room room4 = new room.Room("hi!", (int) (byte) 100, "", "Room hi! | hi! - hi! | Capacity: 0");
        java.lang.String str5 = room4.getRoomNumber();
        room4.setScannedID("Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi!");
        java.lang.String str8 = room4.getRoomNumber();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str5, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str8, "Room hi! | hi! - hi! | Capacity: 0");
    }

    @Test
    public void test19049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19049");
        room.Room room4 = new room.Room("Room Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 97 | Room hi! | hi! - hi! | Capacity: 0 - hi! - hi! - Room hi! | Room hi! | hi! - hi! | Capacity: 0 - hi! - Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 1 | Capacity: 1", (int) (byte) 100, "Room hi! | hi! - hi! | Capacity: 0 - hi! - hi! - Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | hi! -  - Room  - Room hi! | hi! - hi! | Capacity: 0 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 0 | Capacity: 10", "Room hi! | hi! - Room hi! | hi! - hi! | Capacity: 0 - Room hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 1 - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! | Capacity: 1");
        room.SensorObserver sensorObserver5 = null;
        room4.removeObserver(sensorObserver5);
    }

    @Test
    public void test19050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19050");
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
        java.lang.String str16 = room4.getFullLocation();
        java.lang.String str17 = room4.getRoomNumber();
        java.lang.String str18 = room4.getRoomNumber();
        room4.notifyObservers();
        int int20 = room4.getCapacity();
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str11, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi! - hi!" + "'", str16, "hi! - hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test19051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19051");
        room.Room room4 = new room.Room("Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10", (int) (byte) 0, "Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 1", "hi! - hi! - Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100");
        boolean boolean5 = room4.isUnderMaintenance();
        int int6 = room4.getCapacity();
        boolean boolean7 = room4.isOccupied();
        java.lang.String str8 = room4.getFullLocation();
        room.SensorObserver sensorObserver9 = null;
        room4.removeObserver(sensorObserver9);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 1 - hi! - hi! - Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100" + "'", str8, "Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 1 - hi! - hi! - Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100");
    }

    @Test
    public void test19052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19052");
        room.Room room4 = new room.Room("Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 1 - Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100", (int) '#', "", "Room Room hi! | hi! - hi! | Capacity: 0 - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 100 - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! | Capacity: 1");
        java.lang.String str5 = room4.getRoomNumber();
        room4.setUnderMaintenance(true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Room Room hi! | hi! - hi! | Capacity: 0 - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 100 - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! | Capacity: 1" + "'", str5, "Room Room hi! | hi! - hi! | Capacity: 0 - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 100 - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! | Capacity: 1");
    }

    @Test
    public void test19053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19053");
        room.Room room4 = new room.Room("Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 97 - Room  - Room hi! | hi! - hi! | Capacity: 0 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 0", 0, "Room Room hi! | hi! - hi! | Capacity: 0 - hi! | Room Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! - hi! - hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: -1 - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 | Capacity: 10", "Room hi! - hi! - hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 0");
        room.SensorObserver sensorObserver5 = null;
        room4.removeObserver(sensorObserver5);
        boolean boolean7 = room4.isUnderMaintenance();
        java.lang.Class<?> wildcardClass8 = room4.getClass();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test19054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19054");
        room.Room room4 = new room.Room("Room hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 1 - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi!", 97, "Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 | Capacity: 0", "Room hi! | hi! - hi! | Capacity: 0 - hi! - hi!");
        java.lang.String str5 = room4.getBuildingName();
        room4.notifyObservers();
        boolean boolean7 = room4.isUnderMaintenance();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 | Capacity: 0" + "'", str5, "Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 | Capacity: 0");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test19055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19055");
        room.Room room4 = new room.Room("Room hi! - hi! - Room hi! | hi! - hi! | Capacity: 0 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 100 | Capacity: 10", 100, "Room hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 1 - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi!", "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room hi! | hi! - hi! | Capacity: 0");
        java.lang.String str5 = room4.toString();
        java.lang.String str6 = room4.toString();
        room.SensorObserver sensorObserver7 = null;
        room4.removeObserver(sensorObserver7);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Room Room hi! - hi! - Room hi! | hi! - hi! | Capacity: 0 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 100 | Capacity: 10 | Room hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 1 - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100" + "'", str5, "Room Room hi! - hi! - Room hi! | hi! - hi! | Capacity: 0 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 100 | Capacity: 10 | Room hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 1 - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Room Room hi! - hi! - Room hi! | hi! - hi! | Capacity: 0 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 100 | Capacity: 10 | Room hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 1 - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100" + "'", str6, "Room Room hi! - hi! - Room hi! | hi! - hi! | Capacity: 0 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 100 | Capacity: 10 | Room hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 1 - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100");
    }

    @Test
    public void test19056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19056");
        room.Room room4 = new room.Room("hi!", (int) (byte) 100, "", "Room hi! | hi! - hi! | Capacity: 0");
        room4.setScannedID("");
        boolean boolean7 = room4.isOccupied();
        room.SensorObserver sensorObserver8 = null;
        room4.removeObserver(sensorObserver8);
        boolean boolean10 = room4.isOccupied();
        java.lang.String str11 = room4.getScannedID();
        room4.setScannedID("Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - hi! | Capacity: 1");
        room4.setEnabled(true);
        room.SensorObserver sensorObserver16 = null;
        room4.addObserver(sensorObserver16);
        java.lang.String str18 = room4.getBuildingName();
        java.lang.String str19 = room4.getRoomNumber();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str19, "Room hi! | hi! - hi! | Capacity: 0");
    }

    @Test
    public void test19057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19057");
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
        java.lang.String str15 = room4.getScannedID();
        boolean boolean16 = room4.isEnabled();
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
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi! - hi!" + "'", str13, "hi! - hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test19058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19058");
        room.Room room4 = new room.Room("hi!", (int) (byte) 1, "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10", "hi!");
        room4.notifyObservers();
        java.lang.String str6 = room4.getFullLocation();
        java.lang.String str7 = room4.getScannedID();
        boolean boolean8 = room4.isUnderMaintenance();
        java.lang.String str9 = room4.getRoomID();
        boolean boolean10 = room4.isUnderMaintenance();
        java.lang.String str11 = room4.toString();
        int int12 = room4.getCapacity();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi!" + "'", str6, "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi!");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Room hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 1" + "'", str11, "Room hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 1");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test19059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19059");
        room.Room room4 = new room.Room("Room Room hi! | hi! - hi! | Capacity: 0 - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 100 - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! | Capacity: 1", 52, "Room hi! | hi! - hi! | Capacity: 0", "Room Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 | Capacity: 35");
    }

    @Test
    public void test19060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19060");
        room.Room room4 = new room.Room("", (int) (short) 10, "Room hi! | hi! - hi! | Capacity: 0", "hi!");
        java.lang.String str5 = room4.toString();
        java.lang.String str6 = room4.getBuildingName();
        boolean boolean7 = room4.isOccupied();
        java.lang.String str8 = room4.getFullLocation();
        room4.setOccupied(false);
        java.lang.String str11 = room4.getRoomID();
        java.lang.String str12 = room4.getRoomID();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10" + "'", str5, "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str6, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0 - hi!" + "'", str8, "Room hi! | hi! - hi! | Capacity: 0 - hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test19061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19061");
        room.Room room4 = new room.Room("Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room hi! | hi! - hi! | Capacity: 0", (int) (short) 10, "Room hi! - hi! | Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 10", "Room Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 | Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 - hi! -  | Capacity: 10 | Room hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 1 - Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | hi! -  - Room  - Room hi! | hi! - hi! | Capacity: 0 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 0 | Capacity: 10 - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 -  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 1");
        java.lang.String str5 = room4.getBuildingName();
        java.lang.String str6 = room4.getFullLocation();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Room hi! - hi! | Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 10" + "'", str5, "Room hi! - hi! | Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 10");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Room hi! - hi! | Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 10 - Room Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 | Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 - hi! -  | Capacity: 10 | Room hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 1 - Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | hi! -  - Room  - Room hi! | hi! - hi! | Capacity: 0 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 0 | Capacity: 10 - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 -  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 1" + "'", str6, "Room hi! - hi! | Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 10 - Room Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 | Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 - hi! -  | Capacity: 10 | Room hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 1 - Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | hi! -  - Room  - Room hi! | hi! - hi! | Capacity: 0 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 0 | Capacity: 10 - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 -  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 1");
    }

    @Test
    public void test19062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19062");
        room.Room room4 = new room.Room("Room  - Room hi! | hi! - hi! | Capacity: 0 | Room Room hi! | hi! - hi! | Capacity: 0 | hi! - hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 97 - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! | Capacity: 52", 100, "Room Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 97 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - hi! - Room Room hi! - hi! - hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 1 | Capacity: 0 | Room hi! -  | Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 10 -  | Capacity: 52 | Capacity: 32", "");
        java.lang.String str5 = room4.toString();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Room Room  - Room hi! | hi! - hi! | Capacity: 0 | Room Room hi! | hi! - hi! | Capacity: 0 | hi! - hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 97 - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! | Capacity: 52 | Room Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 97 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - hi! - Room Room hi! - hi! - hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 1 | Capacity: 0 | Room hi! -  | Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 10 -  | Capacity: 52 | Capacity: 32 -  | Capacity: 100" + "'", str5, "Room Room  - Room hi! | hi! - hi! | Capacity: 0 | Room Room hi! | hi! - hi! | Capacity: 0 | hi! - hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 97 - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! | Capacity: 52 | Room Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 97 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - hi! - Room Room hi! - hi! - hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 1 | Capacity: 0 | Room hi! -  | Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 10 -  | Capacity: 52 | Capacity: 32 -  | Capacity: 100");
    }

    @Test
    public void test19063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19063");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        java.lang.String str5 = room4.getScannedID();
        room4.setScannedID("hi!");
        room4.setUnderMaintenance(true);
        java.lang.String str10 = room4.getFullLocation();
        java.lang.String str11 = room4.getScannedID();
        room4.setOccupied(true);
        java.lang.String str14 = room4.getFullLocation();
        room4.setUnderMaintenance(false);
        int int17 = room4.getCapacity();
        java.lang.String str18 = room4.getScannedID();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi! - hi!" + "'", str10, "hi! - hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi! - hi!" + "'", str14, "hi! - hi!");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test19064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19064");
        room.Room room4 = new room.Room("Room hi! | hi! - hi! | Capacity: 0", (int) (byte) 10, "hi!", "");
        int int5 = room4.getCapacity();
        room4.setOccupied(false);
        room4.setOccupied(false);
        java.lang.String str10 = room4.toString();
        room4.notifyObservers();
        room.SensorObserver sensorObserver12 = null;
        room4.removeObserver(sensorObserver12);
        int int14 = room4.getCapacity();
        room4.setScannedID(" - Room hi! | hi! - hi! | Capacity: 0 - Room hi! | hi! - hi! | Capacity: 0 - hi!");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10" + "'", str10, "Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
    }

    @Test
    public void test19065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19065");
        room.Room room4 = new room.Room("Room  |  -  | Capacity: -1", (int) 'a', "Room Room Room Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 100 | Room Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 100 - Room Room hi! | hi! - hi! | Capacity: 0 |  - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 0 | Capacity: 32 |  - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! | Capacity: 97", "Room hi! | hi! - hi! | Capacity: 0 - hi! -  - Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | Room hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 1 - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! | Capacity: 97");
        boolean boolean5 = room4.isEnabled();
        room.SensorObserver sensorObserver6 = null;
        room4.addObserver(sensorObserver6);
        java.lang.String str8 = room4.getBuildingName();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Room Room Room Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 100 | Room Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 100 - Room Room hi! | hi! - hi! | Capacity: 0 |  - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 0 | Capacity: 32 |  - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! | Capacity: 97" + "'", str8, "Room Room Room Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 100 | Room Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 100 - Room Room hi! | hi! - hi! | Capacity: 0 |  - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 0 | Capacity: 32 |  - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! | Capacity: 97");
    }

    @Test
    public void test19066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19066");
        room.Room room4 = new room.Room("Room Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Room hi! | hi! - hi! | Capacity: 0 - hi! -  - hi! - hi! - Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | Capacity: 1", 32, "Room hi! - hi! - Room hi! | hi! - hi! | Capacity: 0 | Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 97 - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 100 | Capacity: 0", " - Room hi! | hi! - hi! | Capacity: 0 - Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 97");
    }

    @Test
    public void test19067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19067");
        room.Room room4 = new room.Room("Room  |  -  | Capacity: -1", (int) 'a', "Room Room Room Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 100 | Room Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 100 - Room Room hi! | hi! - hi! | Capacity: 0 |  - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 0 | Capacity: 32 |  - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! | Capacity: 97", "Room hi! | hi! - hi! | Capacity: 0 - hi! -  - Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | Room hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 1 - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! | Capacity: 97");
        boolean boolean5 = room4.isEnabled();
        room4.setUnderMaintenance(true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test19068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19068");
        room.Room room4 = new room.Room("hi!", (int) (byte) 1, "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10", "hi!");
        room4.notifyObservers();
        java.lang.String str6 = room4.getFullLocation();
        java.lang.String str7 = room4.getScannedID();
        boolean boolean8 = room4.isUnderMaintenance();
        java.lang.String str9 = room4.getFullLocation();
        room4.setScannedID("Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! - Room hi! | hi! - hi! | Capacity: 0 - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! - hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 97 - Room hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 1 - Room hi! | hi! - hi! - Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | Capacity: 0");
        java.lang.Class<?> wildcardClass12 = room4.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi!" + "'", str6, "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi!");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi!" + "'", str9, "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi!");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test19069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19069");
        room.Room room4 = new room.Room("hi!", (int) (byte) 100, "", "Room hi! | hi! - hi! | Capacity: 0");
        java.lang.String str5 = room4.getScannedID();
        java.lang.String str6 = room4.getBuildingName();
        room4.setScannedID("Room hi! | hi! - hi! | Capacity: 0");
        java.lang.String str9 = room4.getRoomID();
        java.lang.String str10 = room4.getScannedID();
        room.SensorObserver sensorObserver11 = null;
        room4.removeObserver(sensorObserver11);
        room4.notifyObservers();
        java.lang.String str14 = room4.toString();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str10, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100" + "'", str14, "Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100");
    }

    @Test
    public void test19070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19070");
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
        room4.setScannedID("");
        room.SensorObserver sensorObserver17 = null;
        room4.addObserver(sensorObserver17);
        // The following exception was thrown during execution in test generation
        try {
            room4.setScannedID("Room Room Room  - Room hi! | hi! - hi! | Capacity: 0 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 0 | hi! - hi! - Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 -  - hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 0 | hi! -  - Room  - Room hi! | hi! - hi! | Capacity: 0 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 0 - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! | Capacity: 0");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str7, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str10, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test19071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19071");
        room.Room room4 = new room.Room("hi!", (int) (byte) 100, "", "Room hi! | hi! - hi! | Capacity: 0");
        java.lang.String str5 = room4.getRoomNumber();
        room4.notifyObservers();
        room4.setOccupied(true);
        java.lang.String str9 = room4.getBuildingName();
        java.lang.Class<?> wildcardClass10 = room4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str5, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test19072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19072");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        java.lang.String str5 = room4.getBuildingName();
        java.lang.String str6 = room4.getRoomID();
        boolean boolean7 = room4.isOccupied();
        room4.setEnabled(false);
        room4.setEnabled(true);
        room4.setOccupied(true);
        java.lang.String str14 = room4.getBuildingName();
        boolean boolean15 = room4.isEnabled();
        room4.setOccupied(false);
        room4.setScannedID(" - Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test19073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19073");
        room.Room room4 = new room.Room("hi!", (int) (byte) 100, "", "Room hi! | hi! - hi! | Capacity: 0");
        room4.setScannedID("");
        room4.setOccupied(true);
        room4.setScannedID("Room hi! | hi! - hi! - Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | Capacity: 0");
        boolean boolean11 = room4.isEnabled();
        boolean boolean12 = room4.isOccupied();
        java.lang.String str13 = room4.getFullLocation();
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + " - Room hi! | hi! - hi! | Capacity: 0" + "'", str13, " - Room hi! | hi! - hi! | Capacity: 0");
    }

    @Test
    public void test19074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19074");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        room.SensorObserver sensorObserver5 = null;
        room4.addObserver(sensorObserver5);
        room.SensorObserver sensorObserver7 = null;
        room4.addObserver(sensorObserver7);
        java.lang.String str9 = room4.getBuildingName();
        java.lang.String str10 = room4.getRoomNumber();
        room.SensorObserver sensorObserver11 = null;
        room4.removeObserver(sensorObserver11);
        room.SensorObserver sensorObserver13 = null;
        room4.removeObserver(sensorObserver13);
        room.SensorObserver sensorObserver15 = null;
        room4.addObserver(sensorObserver15);
        room.SensorObserver sensorObserver17 = null;
        room4.addObserver(sensorObserver17);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test19075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19075");
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
        java.lang.String str23 = room4.getRoomID();
        java.lang.String str24 = room4.getScannedID();
        room4.setOccupied(true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi! - hi!" + "'", str11, "hi! - hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Room Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! - hi! - hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: -1" + "'", str24, "Room Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! - hi! - hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: -1");
    }

    @Test
    public void test19076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19076");
        room.Room room4 = new room.Room("hi!", 1, "Room hi! | hi! - hi! | Capacity: 0 - hi!", "Room hi! | hi! - hi! | Capacity: 0 - hi!");
        int int5 = room4.getCapacity();
        room4.setUnderMaintenance(false);
        java.lang.String str8 = room4.toString();
        int int9 = room4.getCapacity();
        room4.setScannedID("hi!");
        java.lang.String str12 = room4.getScannedID();
        room4.setOccupied(true);
        boolean boolean15 = room4.isOccupied();
        room4.setScannedID("Room Room Room hi! | hi! - hi! | Capacity: 0 |  - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 0 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 1");
        room4.setUnderMaintenance(false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Room hi! | Room hi! | hi! - hi! | Capacity: 0 - hi! - Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 1" + "'", str8, "Room hi! | Room hi! | hi! - hi! | Capacity: 0 - hi! - Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 1");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test19077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19077");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        java.lang.String str5 = room4.getScannedID();
        room4.setScannedID("hi!");
        room4.setUnderMaintenance(true);
        java.lang.String str10 = room4.getScannedID();
        java.lang.String str11 = room4.getFullLocation();
        boolean boolean12 = room4.isOccupied();
        room4.setEnabled(false);
        java.lang.String str15 = room4.getBuildingName();
        java.lang.String str16 = room4.getRoomID();
        java.lang.String str17 = room4.getRoomID();
        java.lang.String str18 = room4.toString();
        java.lang.String str19 = room4.getScannedID();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi! - hi!" + "'", str11, "hi! - hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str18, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test19078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19078");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        java.lang.String str5 = room4.getBuildingName();
        java.lang.String str6 = room4.getBuildingName();
        boolean boolean7 = room4.isEnabled();
        room.SensorObserver sensorObserver8 = null;
        room4.addObserver(sensorObserver8);
        java.lang.String str10 = room4.toString();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str10, "Room hi! | hi! - hi! | Capacity: 0");
    }

    @Test
    public void test19079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19079");
        room.Room room4 = new room.Room("hi!", (int) (byte) 100, "", "Room hi! | hi! - hi! | Capacity: 0");
        java.lang.String str5 = room4.getRoomNumber();
        room4.notifyObservers();
        boolean boolean7 = room4.isUnderMaintenance();
        room.SensorObserver sensorObserver8 = null;
        room4.addObserver(sensorObserver8);
        java.lang.String str10 = room4.getScannedID();
        boolean boolean11 = room4.isOccupied();
        java.lang.String str12 = room4.toString();
        java.lang.String str13 = room4.getBuildingName();
        // The following exception was thrown during execution in test generation
        try {
            room4.notifyObservers();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str5, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100" + "'", str12, "Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test19080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19080");
        room.Room room4 = new room.Room("Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 97 - Room  - Room hi! | hi! - hi! | Capacity: 0 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 0", 10, "Room hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 1 - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi!", "Room Room hi! | hi! - hi! | Capacity: 0 | Room hi! | hi! - hi! | Capacity: 0 - hi! - hi! | Capacity: 100 - hi! - hi! - Room hi! | hi! - hi! | Capacity: 0");
        int int5 = room4.getCapacity();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
    }

    @Test
    public void test19081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19081");
        room.Room room4 = new room.Room("Room hi! | hi! - hi! | Capacity: 0", (int) (byte) 10, "hi!", "");
        room4.setUnderMaintenance(true);
        java.lang.String str7 = room4.toString();
        room4.notifyObservers();
        room4.setScannedID("hi! - hi!");
        room4.setOccupied(false);
        room4.setOccupied(true);
        boolean boolean15 = room4.isEnabled();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10" + "'", str7, "Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test19082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19082");
        room.Room room4 = new room.Room("Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10", 0, "hi!", "hi! - hi!");
        int int5 = room4.getCapacity();
        room4.notifyObservers();
        room.SensorObserver sensorObserver7 = null;
        room4.addObserver(sensorObserver7);
        // The following exception was thrown during execution in test generation
        try {
            room4.setOccupied(true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test19083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19083");
        room.Room room4 = new room.Room("Room hi! | hi! - hi! | Capacity: 0 - hi! - ", (int) (short) -1, "Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 100 | hi! - hi! - hi! - hi! | Capacity: 0", "Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 1");
        int int5 = room4.getCapacity();
        room4.setUnderMaintenance(true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test19084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19084");
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
        java.lang.String str19 = room4.getScannedID();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str6, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str7, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str8, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str9, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi! - hi!" + "'", str16, "hi! - hi!");
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test19085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19085");
        room.Room room4 = new room.Room("hi!", (int) (byte) 100, "", "Room hi! | hi! - hi! | Capacity: 0");
        room4.setScannedID("");
        boolean boolean7 = room4.isOccupied();
        room4.setOccupied(true);
        room.SensorObserver sensorObserver10 = null;
        room4.removeObserver(sensorObserver10);
        room4.setScannedID("Room Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! - hi! - hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: -1");
        java.lang.String str14 = room4.getBuildingName();
        room4.setEnabled(false);
        java.lang.String str17 = room4.getRoomID();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test19086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19086");
        room.Room room4 = new room.Room("Room hi! -  | Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 10 - ", (int) '#', "Room Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! - hi! - hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: -1 - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 97 - Room  - Room hi! | hi! - hi! | Capacity: 0 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 0", "Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 | hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 0 - hi! - hi! - Room hi! | hi! - hi! | Capacity: 0 - Room hi! - hi! - hi! | hi! - hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 1");
    }

    @Test
    public void test19087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19087");
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
        java.lang.String str17 = room4.getRoomNumber();
        java.lang.Class<?> wildcardClass18 = room4.getClass();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi! - hi!" + "'", str11, "hi! - hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test19088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19088");
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
        boolean boolean20 = room4.isUnderMaintenance();
        room4.setScannedID("");
        java.lang.String str23 = room4.getScannedID();
        room4.setUnderMaintenance(false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi! - hi!" + "'", str8, "hi! - hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str17, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test19089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19089");
        room.Room room4 = new room.Room("Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi!", (int) (byte) 1, "Room Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 1 - Room hi! | hi! - hi! | Capacity: 0 - hi! |  -  | Capacity: 35", "Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100");
        room.SensorObserver sensorObserver5 = null;
        room4.addObserver(sensorObserver5);
        java.lang.String str7 = room4.getFullLocation();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Room Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 1 - Room hi! | hi! - hi! | Capacity: 0 - hi! |  -  | Capacity: 35 - Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100" + "'", str7, "Room Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 1 - Room hi! | hi! - hi! | Capacity: 0 - hi! |  -  | Capacity: 35 - Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100");
    }

    @Test
    public void test19090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19090");
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
        room.SensorObserver sensorObserver15 = null;
        room4.removeObserver(sensorObserver15);
        boolean boolean17 = room4.isOccupied();
        java.lang.String str18 = room4.getFullLocation();
        room4.notifyObservers();
        java.lang.String str20 = room4.getRoomID();
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str11, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi! - hi!" + "'", str14, "hi! - hi!");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi! - hi!" + "'", str18, "hi! - hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test19091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19091");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        room.SensorObserver sensorObserver5 = null;
        room4.addObserver(sensorObserver5);
        room.SensorObserver sensorObserver7 = null;
        room4.addObserver(sensorObserver7);
        boolean boolean9 = room4.isUnderMaintenance();
        java.lang.String str10 = room4.getBuildingName();
        java.lang.String str11 = room4.getFullLocation();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi! - hi!" + "'", str11, "hi! - hi!");
    }

    @Test
    public void test19092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19092");
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
        room4.setUnderMaintenance(false);
        java.lang.String str22 = room4.getScannedID();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
    }

    @Test
    public void test19093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19093");
        room.Room room4 = new room.Room("", (int) (byte) 1, "Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10", "hi!");
        int int5 = room4.getCapacity();
        java.lang.String str6 = room4.getScannedID();
        room4.setScannedID("Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room hi! | hi! - hi! | Capacity: 0");
        room.SensorObserver sensorObserver9 = null;
        room4.addObserver(sensorObserver9);
        java.lang.String str11 = room4.getBuildingName();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10" + "'", str11, "Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10");
    }

    @Test
    public void test19094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19094");
        room.Room room4 = new room.Room("Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100", (int) 'a', "hi! - hi!", "Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10");
        room.SensorObserver sensorObserver5 = null;
        room4.removeObserver(sensorObserver5);
        java.lang.String str7 = room4.getRoomID();
        java.lang.String str8 = room4.getRoomID();
        java.lang.String str9 = room4.toString();
        java.lang.Class<?> wildcardClass10 = room4.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100" + "'", str7, "Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100" + "'", str8, "Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 97" + "'", str9, "Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 97");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test19095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19095");
        room.Room room4 = new room.Room("Room  | Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | hi! - hi! - hi! | Capacity: 0 - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! - hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 97 | Capacity: 32 | Capacity: 32", 35, "Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - Room hi! | hi! - hi! | Capacity: 0 - hi!", "Room Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Room hi! | hi! - hi! | Capacity: 0 - hi! -  - hi! - hi! - Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | Capacity: 1");
        java.lang.String str5 = room4.getScannedID();
        boolean boolean6 = room4.isEnabled();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test19096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19096");
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
        room4.notifyObservers();
        room4.setEnabled(true);
        room4.setOccupied(false);
        room4.setOccupied(false);
        java.lang.String str22 = room4.getRoomNumber();
        boolean boolean23 = room4.isEnabled();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str13, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test19097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19097");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        boolean boolean5 = room4.isOccupied();
        room4.setEnabled(false);
        java.lang.String str8 = room4.toString();
        room4.setScannedID("");
        java.lang.String str11 = room4.getRoomNumber();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str8, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test19098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19098");
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
        room4.setScannedID("Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 100 | hi! - hi! - hi! - hi! | Capacity: 0");
        room4.setUnderMaintenance(false);
        room4.setOccupied(true);
        room.SensorObserver sensorObserver20 = null;
        room4.removeObserver(sensorObserver20);
        java.lang.Class<?> wildcardClass22 = room4.getClass();
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str11, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test19099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19099");
        room.Room room4 = new room.Room("Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10", 52, "Room Room Room hi! | hi! - hi! | Capacity: 0 | Room hi! | hi! - hi! | Capacity: 0 - hi! - hi! | Capacity: 100 |  - hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 10", "Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 100 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: -1");
        java.lang.String str5 = room4.toString();
        room4.setOccupied(true);
        boolean boolean8 = room4.isUnderMaintenance();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Room Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 | Room Room Room hi! | hi! - hi! | Capacity: 0 | Room hi! | hi! - hi! | Capacity: 0 - hi! - hi! | Capacity: 100 |  - hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 10 - Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 100 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: -1 | Capacity: 52" + "'", str5, "Room Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 | Room Room Room hi! | hi! - hi! | Capacity: 0 | Room hi! | hi! - hi! | Capacity: 0 - hi! - hi! | Capacity: 100 |  - hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 10 - Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 100 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: -1 | Capacity: 52");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test19100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19100");
        room.Room room4 = new room.Room("hi!", 1, "Room hi! | hi! - hi! | Capacity: 0 - hi!", "Room hi! | hi! - hi! | Capacity: 0 - hi!");
        int int5 = room4.getCapacity();
        room4.setUnderMaintenance(false);
        room.SensorObserver sensorObserver8 = null;
        room4.addObserver(sensorObserver8);
        room.SensorObserver sensorObserver10 = null;
        room4.removeObserver(sensorObserver10);
        room.SensorObserver sensorObserver12 = null;
        room4.addObserver(sensorObserver12);
        boolean boolean14 = room4.isUnderMaintenance();
        java.lang.Class<?> wildcardClass15 = room4.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test19101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19101");
        room.Room room4 = new room.Room("Room hi! | hi! - hi! | Capacity: 0 - hi! -  - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room hi! | hi! - hi! | Capacity: 0", (-1), "Room hi! - hi! - hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 -  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100", "Room Room hi! | hi! - hi! | Capacity: 0 |  - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 0");
        java.lang.String str5 = room4.getScannedID();
        java.lang.String str6 = room4.getRoomID();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0 - hi! -  - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room hi! | hi! - hi! | Capacity: 0" + "'", str6, "Room hi! | hi! - hi! | Capacity: 0 - hi! -  - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room hi! | hi! - hi! | Capacity: 0");
    }

    @Test
    public void test19102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19102");
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
        room4.setScannedID("Room Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 1 | hi! - hi! - Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 97 - Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | Capacity: 10");
        room4.setScannedID("Room hi! -  | Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 10 - hi! - hi! - Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100");
        java.lang.String str28 = room4.getRoomID();
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str11, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
    }

    @Test
    public void test19103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19103");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        room.SensorObserver sensorObserver5 = null;
        room4.addObserver(sensorObserver5);
        java.lang.String str7 = room4.getScannedID();
        room.SensorObserver sensorObserver8 = null;
        room4.removeObserver(sensorObserver8);
        java.lang.String str10 = room4.getRoomNumber();
        boolean boolean11 = room4.isOccupied();
        int int12 = room4.getCapacity();
        boolean boolean13 = room4.isOccupied();
        boolean boolean14 = room4.isEnabled();
        room4.setUnderMaintenance(false);
        boolean boolean17 = room4.isUnderMaintenance();
        java.lang.String str18 = room4.getRoomID();
        room4.setUnderMaintenance(false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test19104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19104");
        room.Room room4 = new room.Room(" - Room hi! | hi! - hi! | Capacity: 0", 0, "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10", "Room hi! | hi! - hi! | Capacity: 0 - hi! - ");
        java.lang.String str5 = room4.toString();
        boolean boolean6 = room4.isOccupied();
        room4.setOccupied(false);
        room.SensorObserver sensorObserver9 = null;
        room4.addObserver(sensorObserver9);
        java.lang.String str11 = room4.getRoomID();
        java.lang.String str12 = room4.getFullLocation();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Room  - Room hi! | hi! - hi! | Capacity: 0 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 0" + "'", str5, "Room  - Room hi! | hi! - hi! | Capacity: 0 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 0");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + " - Room hi! | hi! - hi! | Capacity: 0" + "'", str11, " - Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | hi! - hi! | Capacity: 0 - hi! - " + "'", str12, "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | hi! - hi! | Capacity: 0 - hi! - ");
    }

    @Test
    public void test19105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19105");
        room.Room room4 = new room.Room("", (int) (byte) 10, "Room hi! -  | Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 10 - hi! - hi! - Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100", "hi! -  - Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 1");
    }

    @Test
    public void test19106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19106");
        room.Room room4 = new room.Room("hi!", (int) (byte) 1, "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10", "hi!");
        room4.notifyObservers();
        java.lang.String str6 = room4.getFullLocation();
        java.lang.String str7 = room4.getScannedID();
        java.lang.String str8 = room4.getFullLocation();
        java.lang.String str9 = room4.getFullLocation();
        java.lang.String str10 = room4.getRoomNumber();
        room4.setScannedID("hi! - hi! - hi! - hi!");
        room.SensorObserver sensorObserver13 = null;
        room4.addObserver(sensorObserver13);
        room.SensorObserver sensorObserver15 = null;
        room4.addObserver(sensorObserver15);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi!" + "'", str6, "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi!");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi!" + "'", str8, "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi!" + "'", str9, "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test19107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19107");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        java.lang.String str5 = room4.getScannedID();
        room4.setScannedID("hi!");
        room4.setUnderMaintenance(true);
        room4.setOccupied(true);
        java.lang.String str12 = room4.getRoomNumber();
        java.lang.String str13 = room4.getScannedID();
        java.lang.String str14 = room4.getRoomID();
        java.lang.String str15 = room4.getRoomID();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test19108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19108");
        room.Room room4 = new room.Room("Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 1", (int) (byte) 10, "Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 97 - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 100 - Room hi! | hi! - hi! | Capacity: 0 - hi! - ", "Room Room hi! - hi! - hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 1 | Capacity: 0 | Room hi! -  | Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 10 -  | Capacity: 52");
        room4.setScannedID(" - hi! - hi! - Room hi! | hi! - hi! | Capacity: 0");
        room4.setEnabled(true);
    }

    @Test
    public void test19109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19109");
        room.Room room4 = new room.Room("Room Room  - Room hi! | hi! - hi! | Capacity: 0 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 0 | Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 - Room hi! | Room hi! | hi! - hi! | Capacity: 0 - hi! - Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 1 | Capacity: -1", 35, "", "Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10");
        java.lang.String str5 = room4.getRoomID();
        java.lang.String str6 = room4.getRoomID();
        java.lang.String str7 = room4.getBuildingName();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Room Room  - Room hi! | hi! - hi! | Capacity: 0 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 0 | Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 - Room hi! | Room hi! | hi! - hi! | Capacity: 0 - hi! - Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 1 | Capacity: -1" + "'", str5, "Room Room  - Room hi! | hi! - hi! | Capacity: 0 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 0 | Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 - Room hi! | Room hi! | hi! - hi! | Capacity: 0 - hi! - Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 1 | Capacity: -1");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Room Room  - Room hi! | hi! - hi! | Capacity: 0 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 0 | Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 - Room hi! | Room hi! | hi! - hi! | Capacity: 0 - hi! - Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 1 | Capacity: -1" + "'", str6, "Room Room  - Room hi! | hi! - hi! | Capacity: 0 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 0 | Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 - Room hi! | Room hi! | hi! - hi! | Capacity: 0 - hi! - Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 1 | Capacity: -1");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test19110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19110");
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
        room4.setOccupied(false);
        java.lang.String str25 = room4.getRoomNumber();
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str11, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
    }

    @Test
    public void test19111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19111");
        room.Room room4 = new room.Room("Room hi! - hi! - Room hi! | hi! - hi! | Capacity: 0 | hi! - hi! - Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 97 | Capacity: 10", (int) (short) 100, "Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 100 | hi! - hi! - hi! - hi! | Capacity: 0 - Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 1", "Room Room hi! | hi! - hi! | Capacity: 0 - hi! | Room Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! - hi! - hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: -1 - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 | Capacity: 10");
    }

    @Test
    public void test19112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19112");
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
        room.SensorObserver sensorObserver15 = null;
        room4.removeObserver(sensorObserver15);
        room4.setUnderMaintenance(true);
        room4.setEnabled(false);
        java.lang.String str21 = room4.toString();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str7, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str10, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str21, "Room hi! | hi! - hi! | Capacity: 0");
    }

    @Test
    public void test19113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19113");
        room.Room room4 = new room.Room("", (int) (short) 10, "Room hi! | hi! - hi! | Capacity: 0", "hi!");
        java.lang.String str5 = room4.toString();
        room4.setUnderMaintenance(true);
        room4.setScannedID("");
        java.lang.String str10 = room4.getRoomNumber();
        room4.setScannedID("Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 |  - hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 32");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10" + "'", str5, "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test19114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19114");
        room.Room room4 = new room.Room("hi!", (int) (byte) 100, "", "Room hi! | hi! - hi! | Capacity: 0");
        java.lang.String str5 = room4.toString();
        java.lang.String str6 = room4.getRoomNumber();
        room4.setOccupied(false);
        room4.setEnabled(true);
        boolean boolean11 = room4.isEnabled();
        boolean boolean12 = room4.isEnabled();
        java.lang.Class<?> wildcardClass13 = room4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100" + "'", str5, "Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str6, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test19115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19115");
        room.Room room4 = new room.Room("hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 100 - Room hi! | hi! - hi! | Capacity: 0 - hi! - ", 35, "Room hi! | hi! - hi! | Capacity: 0 - hi!", "hi!");
        room4.setOccupied(false);
        java.lang.String str7 = room4.toString();
        java.lang.String str8 = room4.toString();
        room4.setScannedID("Room Room  - Room hi! | hi! - hi! | Capacity: 0 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 0 - hi! | Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 | hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 0 - hi! - hi! - Room hi! | hi! - hi! | Capacity: 0 - Room hi! - hi! - hi! | hi! - hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 1 | Capacity: -1");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Room hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 100 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Room hi! | hi! - hi! | Capacity: 0 - hi! - hi! | Capacity: 35" + "'", str7, "Room hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 100 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Room hi! | hi! - hi! | Capacity: 0 - hi! - hi! | Capacity: 35");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Room hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 100 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Room hi! | hi! - hi! | Capacity: 0 - hi! - hi! | Capacity: 35" + "'", str8, "Room hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 100 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Room hi! | hi! - hi! | Capacity: 0 - hi! - hi! | Capacity: 35");
    }

    @Test
    public void test19116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19116");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        boolean boolean5 = room4.isOccupied();
        room4.setEnabled(false);
        room4.setUnderMaintenance(false);
        java.lang.String str10 = room4.getScannedID();
        java.lang.String str11 = room4.getBuildingName();
        room4.setOccupied(true);
        java.lang.String str14 = room4.getRoomID();
        java.lang.String str15 = room4.getRoomID();
        room.SensorObserver sensorObserver16 = null;
        room4.addObserver(sensorObserver16);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test19117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19117");
        room.Room room4 = new room.Room("Room Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! - hi! - hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: -1 - Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 | Room Room hi! | hi! - hi! | Capacity: 0 | Room hi! | hi! - hi! | Capacity: 0 - hi! - hi! | Capacity: 100 - hi! - hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 0", (int) (byte) 1, "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 -  - Room hi! | hi! - hi! | Capacity: 0", "Room hi! | hi! - hi! | Capacity: 0 - hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 100 - Room hi! | hi! - hi! | Capacity: 0 - hi! - ");
        boolean boolean5 = room4.isUnderMaintenance();
        int int6 = room4.getCapacity();
        java.lang.String str7 = room4.getRoomNumber();
        java.lang.Class<?> wildcardClass8 = room4.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0 - hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 100 - Room hi! | hi! - hi! | Capacity: 0 - hi! - " + "'", str7, "Room hi! | hi! - hi! | Capacity: 0 - hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 100 - Room hi! | hi! - hi! | Capacity: 0 - hi! - ");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test19118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19118");
        room.Room room4 = new room.Room("Room hi! | hi! - hi! | Capacity: 0 - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10", 35, "Room Room hi! | hi! - hi! | Capacity: 0 - hi! | Room hi! | Room hi! | hi! - hi! | Capacity: 0 - hi! - Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 1 - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 32 - Room Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! - hi! - hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: -1", "Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 | hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 0");
    }

    @Test
    public void test19119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19119");
        room.Room room4 = new room.Room("hi!", (int) (byte) 100, "", "Room hi! | hi! - hi! | Capacity: 0");
        java.lang.String str5 = room4.toString();
        room4.setOccupied(false);
        boolean boolean8 = room4.isUnderMaintenance();
        room4.setOccupied(false);
        room4.notifyObservers();
        room.SensorObserver sensorObserver12 = null;
        room4.removeObserver(sensorObserver12);
        room4.notifyObservers();
        java.lang.String str15 = room4.toString();
        java.lang.String str16 = room4.getBuildingName();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100" + "'", str5, "Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100" + "'", str15, "Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test19120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19120");
        room.Room room4 = new room.Room("Room hi! | hi! - hi! | Capacity: 0 - hi!", (int) (short) -1, "Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 100 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: -1", "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room hi! | hi! - hi! | Capacity: 0");
        boolean boolean5 = room4.isUnderMaintenance();
        boolean boolean6 = room4.isOccupied();
        java.lang.String str7 = room4.getBuildingName();
        room4.notifyObservers();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 100 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: -1" + "'", str7, "Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 100 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: -1");
    }

    @Test
    public void test19121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19121");
        room.Room room4 = new room.Room("", (int) (short) 10, "Room hi! | hi! - hi! | Capacity: 0", "hi!");
        java.lang.String str5 = room4.getFullLocation();
        boolean boolean6 = room4.isEnabled();
        java.lang.String str7 = room4.getRoomNumber();
        boolean boolean8 = room4.isOccupied();
        boolean boolean9 = room4.isUnderMaintenance();
        room4.setUnderMaintenance(true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0 - hi!" + "'", str5, "Room hi! | hi! - hi! | Capacity: 0 - hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test19122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19122");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        java.lang.String str5 = room4.getScannedID();
        room4.setScannedID("hi!");
        java.lang.String str8 = room4.getBuildingName();
        int int9 = room4.getCapacity();
        room.SensorObserver sensorObserver10 = null;
        room4.addObserver(sensorObserver10);
        java.lang.String str12 = room4.getScannedID();
        int int13 = room4.getCapacity();
        room.SensorObserver sensorObserver14 = null;
        room4.removeObserver(sensorObserver14);
        room4.setScannedID("Room hi! | hi! - hi! | Capacity: 0 - hi! - hi!");
        java.lang.String str18 = room4.getScannedID();
        java.lang.String str19 = room4.getFullLocation();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0 - hi! - hi!" + "'", str18, "Room hi! | hi! - hi! | Capacity: 0 - hi! - hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi! - hi!" + "'", str19, "hi! - hi!");
    }

    @Test
    public void test19123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19123");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        java.lang.String str5 = room4.getScannedID();
        room4.setScannedID("hi!");
        java.lang.String str8 = room4.getBuildingName();
        java.lang.String str9 = room4.getFullLocation();
        java.lang.String str10 = room4.getRoomNumber();
        int int11 = room4.getCapacity();
        java.lang.String str12 = room4.getScannedID();
        java.lang.String str13 = room4.getBuildingName();
        java.lang.String str14 = room4.toString();
        room4.notifyObservers();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi! - hi!" + "'", str9, "hi! - hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str14, "Room hi! | hi! - hi! | Capacity: 0");
    }

    @Test
    public void test19124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19124");
        room.Room room4 = new room.Room("hi!", (int) (byte) 100, "", "Room hi! | hi! - hi! | Capacity: 0");
        java.lang.String str5 = room4.toString();
        java.lang.String str6 = room4.getScannedID();
        room4.notifyObservers();
        room4.setEnabled(true);
        java.lang.String str10 = room4.getRoomID();
        java.lang.String str11 = room4.getRoomNumber();
        room4.setScannedID("Room Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 97 | Room hi! - hi! - hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 1 | Capacity: 0 - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 | Capacity: 35");
        room4.setEnabled(false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100" + "'", str5, "Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str11, "Room hi! | hi! - hi! | Capacity: 0");
    }

    @Test
    public void test19125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19125");
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
        room4.setUnderMaintenance(false);
        room.SensorObserver sensorObserver22 = null;
        room4.addObserver(sensorObserver22);
        // The following exception was thrown during execution in test generation
        try {
            room4.setScannedID("Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! - hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 97 | Capacity: 32 | Room Room hi! | hi! - hi! | Capacity: 0 | Room hi! | hi! - hi! | Capacity: 0 - hi! - hi! | Capacity: 100 - hi! - hi! - Room hi! | hi! - hi! | Capacity: 0 - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 1 - Room Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! | Room  - Room hi! | hi! - hi! | Capacity: 0 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 0 - Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 97 | Capacity: 0 | Capacity: 0");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test19126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19126");
        room.Room room4 = new room.Room("Room hi! | hi! - hi! | Capacity: 0", (int) (byte) 10, "hi!", "");
        room4.setUnderMaintenance(true);
        java.lang.String str7 = room4.toString();
        room4.notifyObservers();
        room4.setScannedID("hi! - hi!");
        room4.setOccupied(false);
        room4.setOccupied(true);
        boolean boolean15 = room4.isOccupied();
        java.lang.String str16 = room4.toString();
        java.lang.String str17 = room4.getFullLocation();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10" + "'", str7, "Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10" + "'", str16, "Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi! - " + "'", str17, "hi! - ");
    }

    @Test
    public void test19127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19127");
        room.Room room4 = new room.Room("Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100", 0, "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi!", "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10");
        java.lang.String str5 = room4.getBuildingName();
        boolean boolean6 = room4.isEnabled();
        room4.setOccupied(true);
        room4.setUnderMaintenance(false);
        boolean boolean11 = room4.isEnabled();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi!" + "'", str5, "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test19128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19128");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        boolean boolean5 = room4.isOccupied();
        room4.setEnabled(false);
        java.lang.String str8 = room4.toString();
        room4.setOccupied(true);
        room4.setOccupied(false);
        java.lang.String str13 = room4.getRoomID();
        room4.notifyObservers();
        room4.setOccupied(true);
        java.lang.String str17 = room4.getRoomNumber();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str8, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test19129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19129");
        room.Room room4 = new room.Room("hi!", (int) '#', "Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10", "Room hi! | hi! - hi! | Capacity: 0 - hi!");
        java.lang.String str5 = room4.getRoomID();
        room4.setEnabled(false);
        java.lang.String str8 = room4.toString();
        boolean boolean9 = room4.isEnabled();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Room hi! | Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 35" + "'", str8, "Room hi! | Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 35");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test19130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19130");
        room.Room room4 = new room.Room("Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10", 0, "hi!", "Room hi! | hi! - hi! | Capacity: 0");
        room4.setScannedID("Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100");
        int int7 = room4.getCapacity();
        java.lang.String str8 = room4.getBuildingName();
        int int9 = room4.getCapacity();
        room.SensorObserver sensorObserver10 = null;
        room4.removeObserver(sensorObserver10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test19131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19131");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        room.SensorObserver sensorObserver5 = null;
        room4.addObserver(sensorObserver5);
        java.lang.String str7 = room4.getScannedID();
        room.SensorObserver sensorObserver8 = null;
        room4.removeObserver(sensorObserver8);
        java.lang.String str10 = room4.getRoomNumber();
        java.lang.String str11 = room4.toString();
        room4.setUnderMaintenance(true);
        java.lang.String str14 = room4.getFullLocation();
        int int15 = room4.getCapacity();
        room.SensorObserver sensorObserver16 = null;
        room4.removeObserver(sensorObserver16);
        room4.setEnabled(true);
        room4.setUnderMaintenance(true);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str11, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi! - hi!" + "'", str14, "hi! - hi!");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test19132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19132");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        java.lang.String str5 = room4.toString();
        java.lang.String str6 = room4.getScannedID();
        room4.setOccupied(true);
        room4.setUnderMaintenance(true);
        boolean boolean11 = room4.isEnabled();
        java.lang.String str12 = room4.getBuildingName();
        int int13 = room4.getCapacity();
        room4.setEnabled(false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str5, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test19133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19133");
        room.Room room4 = new room.Room("", (int) (short) 10, "Room hi! | hi! - hi! | Capacity: 0", "hi!");
        java.lang.String str5 = room4.getFullLocation();
        boolean boolean6 = room4.isEnabled();
        java.lang.String str7 = room4.getBuildingName();
        room4.setOccupied(false);
        room4.setUnderMaintenance(true);
        boolean boolean12 = room4.isEnabled();
        room.SensorObserver sensorObserver13 = null;
        room4.addObserver(sensorObserver13);
        // The following exception was thrown during execution in test generation
        try {
            room4.setUnderMaintenance(false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0 - hi!" + "'", str5, "Room hi! | hi! - hi! | Capacity: 0 - hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str7, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test19134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19134");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        java.lang.String str5 = room4.getScannedID();
        room4.setScannedID("hi!");
        room4.setUnderMaintenance(true);
        java.lang.String str10 = room4.getScannedID();
        java.lang.String str11 = room4.getBuildingName();
        room4.setOccupied(false);
        room4.setOccupied(true);
        int int16 = room4.getCapacity();
        boolean boolean17 = room4.isUnderMaintenance();
        room4.notifyObservers();
        java.lang.String str19 = room4.getScannedID();
        int int20 = room4.getCapacity();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test19135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19135");
        room.Room room4 = new room.Room("hi!", (int) (byte) 100, "", "Room hi! | hi! - hi! | Capacity: 0");
        java.lang.String str5 = room4.getRoomNumber();
        room4.setEnabled(false);
        java.lang.String str8 = room4.getRoomID();
        room4.setScannedID("Room Room Room hi! | hi! - hi! | Capacity: 0 | Room hi! | hi! - hi! | Capacity: 0 - hi! - hi! | Capacity: 100 |  - hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 10 - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10");
        java.lang.String str11 = room4.getRoomID();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str5, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test19136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19136");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        room.SensorObserver sensorObserver5 = null;
        room4.addObserver(sensorObserver5);
        java.lang.String str7 = room4.toString();
        room.SensorObserver sensorObserver8 = null;
        room4.removeObserver(sensorObserver8);
        java.lang.String str10 = room4.toString();
        java.lang.String str11 = room4.getRoomNumber();
        java.lang.String str12 = room4.toString();
        room4.setScannedID("Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 | hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 0");
        java.lang.String str15 = room4.getRoomID();
        java.lang.String str16 = room4.getRoomID();
        room4.notifyObservers();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str7, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str10, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str12, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test19137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19137");
        room.Room room4 = new room.Room("Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! - Room Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 97 | Room hi! | hi! - hi! | Capacity: 0 - hi! -  - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 | Capacity: 100", (-1), "Room  -  | Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - hi! | Capacity: 1 - Room hi! | hi! - hi! | Capacity: 0 - hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 100 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 10", "Room hi! | hi! - hi! | Capacity: 0 - hi! - hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10");
        java.lang.String str5 = room4.getFullLocation();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Room  -  | Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - hi! | Capacity: 1 - Room hi! | hi! - hi! | Capacity: 0 - hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 100 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 10 - Room hi! | hi! - hi! | Capacity: 0 - hi! - hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10" + "'", str5, "Room  -  | Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - hi! | Capacity: 1 - Room hi! | hi! - hi! | Capacity: 0 - hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 100 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 10 - Room hi! | hi! - hi! | Capacity: 0 - hi! - hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10");
    }

    @Test
    public void test19138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19138");
        room.Room room4 = new room.Room("Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10", 0, "hi!", "Room hi! | hi! - hi! | Capacity: 0");
        room4.notifyObservers();
        room4.notifyObservers();
        boolean boolean7 = room4.isOccupied();
        room4.setScannedID("");
        boolean boolean10 = room4.isEnabled();
        room4.setScannedID("Room hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Room Room hi! | hi! - hi! | Capacity: 0 - hi! |  - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 | Capacity: 1 - Room hi! - hi! - Room hi! | hi! - hi! | Capacity: 0 | hi! - hi! - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 1 | Capacity: 52");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test19139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19139");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        java.lang.String str5 = room4.getScannedID();
        room4.setScannedID("hi!");
        boolean boolean8 = room4.isEnabled();
        int int9 = room4.getCapacity();
        int int10 = room4.getCapacity();
        boolean boolean11 = room4.isOccupied();
        room4.setEnabled(false);
        java.lang.String str14 = room4.getRoomNumber();
        room4.setOccupied(true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test19140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19140");
        room.Room room4 = new room.Room("", (int) (short) 10, "Room hi! | hi! - hi! | Capacity: 0", "hi!");
        int int5 = room4.getCapacity();
        java.lang.String str6 = room4.getFullLocation();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0 - hi!" + "'", str6, "Room hi! | hi! - hi! | Capacity: 0 - hi!");
    }

    @Test
    public void test19141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19141");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        java.lang.String str5 = room4.getScannedID();
        room4.setScannedID("hi!");
        boolean boolean8 = room4.isEnabled();
        int int9 = room4.getCapacity();
        boolean boolean10 = room4.isOccupied();
        java.lang.String str11 = room4.getRoomNumber();
        room4.setEnabled(false);
        room4.setUnderMaintenance(false);
        boolean boolean16 = room4.isUnderMaintenance();
        java.lang.String str17 = room4.getScannedID();
        room.SensorObserver sensorObserver18 = null;
        room4.addObserver(sensorObserver18);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test19142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19142");
        room.Room room4 = new room.Room("Room  - Room hi! | hi! - hi! | Capacity: 0 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 0 - hi!", (int) (short) 10, " - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi!", "Room  - Room hi! | hi! - hi! | Capacity: 0 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 0");
        java.lang.String str5 = room4.toString();
        java.lang.String str6 = room4.getRoomID();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Room Room  - Room hi! | hi! - hi! | Capacity: 0 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 0 - hi! |  - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! - Room  - Room hi! | hi! - hi! | Capacity: 0 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 0 | Capacity: 10" + "'", str5, "Room Room  - Room hi! | hi! - hi! | Capacity: 0 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 0 - hi! |  - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! - Room  - Room hi! | hi! - hi! | Capacity: 0 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 0 | Capacity: 10");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Room  - Room hi! | hi! - hi! | Capacity: 0 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 0 - hi!" + "'", str6, "Room  - Room hi! | hi! - hi! | Capacity: 0 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 0 - hi!");
    }

    @Test
    public void test19143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19143");
        room.Room room4 = new room.Room("Room hi! | hi! - hi! | Capacity: 0", (int) (byte) 100, "Room hi! | hi! - hi! | Capacity: 0 - hi!", "hi!");
        room4.setScannedID("Room hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 1");
        java.lang.String str7 = room4.getFullLocation();
        java.lang.String str8 = room4.toString();
        java.lang.String str9 = room4.getRoomID();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0 - hi! - hi!" + "'", str7, "Room hi! | hi! - hi! | Capacity: 0 - hi! - hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Room Room hi! | hi! - hi! | Capacity: 0 | Room hi! | hi! - hi! | Capacity: 0 - hi! - hi! | Capacity: 100" + "'", str8, "Room Room hi! | hi! - hi! | Capacity: 0 | Room hi! | hi! - hi! | Capacity: 0 - hi! - hi! | Capacity: 100");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str9, "Room hi! | hi! - hi! | Capacity: 0");
    }

    @Test
    public void test19144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19144");
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
        java.lang.String str19 = room4.getScannedID();
        room4.setScannedID("Room hi! | hi! - hi! | Capacity: 0 - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! - hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 97 - Room hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 1 - Room hi! | hi! - hi! - Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | Capacity: 0 - Room  - Room hi! | hi! - hi! | Capacity: 0 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 0 - hi! -  - hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10");
        java.lang.String str22 = room4.getFullLocation();
        room4.setEnabled(true);
        boolean boolean25 = room4.isUnderMaintenance();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi! - hi!" + "'", str22, "hi! - hi!");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test19145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19145");
        room.Room room4 = new room.Room("", (int) (byte) 1, "Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10", "hi!");
        java.lang.String str5 = room4.getFullLocation();
        room4.setScannedID("Room hi! | hi! - hi! | Capacity: 0");
        java.lang.String str8 = room4.getFullLocation();
        boolean boolean9 = room4.isOccupied();
        room4.setEnabled(false);
        java.lang.String str12 = room4.getRoomNumber();
        int int13 = room4.getCapacity();
        java.lang.String str14 = room4.getBuildingName();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi!" + "'", str5, "Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi!" + "'", str8, "Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10" + "'", str14, "Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10");
    }

    @Test
    public void test19146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19146");
        room.Room room4 = new room.Room("Room hi! | hi! - hi! | Capacity: 0 - hi!", 10, "Room Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! - hi! - hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: -1", "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10");
        room4.setEnabled(true);
        boolean boolean7 = room4.isUnderMaintenance();
        java.lang.String str8 = room4.getRoomID();
        boolean boolean9 = room4.isEnabled();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0 - hi!" + "'", str8, "Room hi! | hi! - hi! | Capacity: 0 - hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test19147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19147");
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
        java.lang.String str17 = room4.getScannedID();
        java.lang.String str18 = room4.getFullLocation();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str11, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi! - hi!" + "'", str18, "hi! - hi!");
    }

    @Test
    public void test19148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19148");
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
        room.SensorObserver sensorObserver21 = null;
        room4.addObserver(sensorObserver21);
        room.SensorObserver sensorObserver23 = null;
        room4.addObserver(sensorObserver23);
        // The following exception was thrown during execution in test generation
        try {
            room4.notifyObservers();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi! - hi!" + "'", str8, "hi! - hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi! - hi!" + "'", str13, "hi! - hi!");
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test19149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19149");
        room.Room room4 = new room.Room("Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100", 0, "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi!", "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10");
        java.lang.String str5 = room4.getFullLocation();
        java.lang.String str6 = room4.toString();
        java.lang.String str7 = room4.getBuildingName();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10" + "'", str5, "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 | Capacity: 0" + "'", str6, "Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi!" + "'", str7, "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi!");
    }

    @Test
    public void test19150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19150");
        room.Room room4 = new room.Room("hi! - hi! - Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 -  - hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10", 100, "", "Room Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! | Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 97 - hi! - hi! - hi! | Capacity: 0");
    }

    @Test
    public void test19151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19151");
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
        java.lang.String str19 = room4.getScannedID();
        room.SensorObserver sensorObserver20 = null;
        room4.addObserver(sensorObserver20);
        java.lang.String str22 = room4.getFullLocation();
        room.SensorObserver sensorObserver23 = null;
        room4.addObserver(sensorObserver23);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str11, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0 - hi! - " + "'", str19, "Room hi! | hi! - hi! | Capacity: 0 - hi! - ");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi! - hi!" + "'", str22, "hi! - hi!");
    }

    @Test
    public void test19152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19152");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        java.lang.String str5 = room4.getScannedID();
        room4.setScannedID("hi!");
        boolean boolean8 = room4.isEnabled();
        int int9 = room4.getCapacity();
        int int10 = room4.getCapacity();
        java.lang.String str11 = room4.getFullLocation();
        int int12 = room4.getCapacity();
        int int13 = room4.getCapacity();
        room.SensorObserver sensorObserver14 = null;
        room4.removeObserver(sensorObserver14);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi! - hi!" + "'", str11, "hi! - hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test19153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19153");
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
        boolean boolean16 = room4.isEnabled();
        room4.setUnderMaintenance(true);
        room4.notifyObservers();
        int int20 = room4.getCapacity();
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str11, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test19154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19154");
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
        java.lang.String str14 = room4.getFullLocation();
        java.lang.String str15 = room4.getRoomID();
        room4.notifyObservers();
        room4.setEnabled(true);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str11, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi! - hi!" + "'", str14, "hi! - hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test19155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19155");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        room.SensorObserver sensorObserver5 = null;
        room4.addObserver(sensorObserver5);
        room.SensorObserver sensorObserver7 = null;
        room4.addObserver(sensorObserver7);
        java.lang.String str9 = room4.getFullLocation();
        java.lang.String str10 = room4.getRoomNumber();
        boolean boolean11 = room4.isUnderMaintenance();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi! - hi!" + "'", str9, "hi! - hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test19156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19156");
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
        java.lang.String str26 = room4.getFullLocation();
        boolean boolean27 = room4.isOccupied();
        boolean boolean28 = room4.isOccupied();
        java.lang.String str29 = room4.getRoomID();
        boolean boolean30 = room4.isEnabled();
        java.lang.String str31 = room4.getRoomID();
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str11, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi! - hi!" + "'", str26, "hi! - hi!");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
    }

    @Test
    public void test19157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19157");
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
        java.lang.String str16 = room4.getScannedID();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Room hi! | hi! - hi! - Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | Capacity: 0" + "'", str6, "Room hi! | hi! - hi! - Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi! - hi!" + "'", str9, "hi! - hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100" + "'", str10, "Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test19158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19158");
        room.Room room4 = new room.Room("Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi!", (int) (byte) 1, "Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 | Room Room hi! | hi! - hi! | Capacity: 0 | Room hi! | hi! - hi! | Capacity: 0 - hi! - hi! | Capacity: 100 - hi! - hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 0", "Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi!");
        java.lang.String str5 = room4.getBuildingName();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 | Room Room hi! | hi! - hi! | Capacity: 0 | Room hi! | hi! - hi! | Capacity: 0 - hi! - hi! | Capacity: 100 - hi! - hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 0" + "'", str5, "Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 | Room Room hi! | hi! - hi! | Capacity: 0 | Room hi! | hi! - hi! | Capacity: 0 - hi! - hi! | Capacity: 100 - hi! - hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 0");
    }

    @Test
    public void test19159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19159");
        room.Room room4 = new room.Room("Room hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 1", (int) (short) -1, "Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi!", "Room hi! | hi! - hi! | Capacity: 0 - hi!");
        room4.setOccupied(true);
        boolean boolean7 = room4.isEnabled();
        java.lang.String str8 = room4.getRoomNumber();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0 - hi!" + "'", str8, "Room hi! | hi! - hi! | Capacity: 0 - hi!");
    }

    @Test
    public void test19160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19160");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        java.lang.String str5 = room4.getScannedID();
        room4.setScannedID("hi!");
        room4.setUnderMaintenance(true);
        room4.setOccupied(true);
        room4.setOccupied(false);
        java.lang.String str14 = room4.getRoomNumber();
        boolean boolean15 = room4.isOccupied();
        boolean boolean16 = room4.isOccupied();
        boolean boolean17 = room4.isEnabled();
        java.lang.String str18 = room4.toString();
        room.SensorObserver sensorObserver19 = null;
        room4.removeObserver(sensorObserver19);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str18, "Room hi! | hi! - hi! | Capacity: 0");
    }

    @Test
    public void test19161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19161");
        room.Room room4 = new room.Room("Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | hi! - hi! | Capacity: 0 - hi! - ", 1, "Room hi! - hi! - hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 1 | Capacity: 0 - hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10", " - Room hi! | hi! - hi! | Capacity: 0");
        room4.setOccupied(false);
        java.lang.String str7 = room4.toString();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Room hi! - hi! - hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 1 | Capacity: 0 - hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 -  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 1" + "'", str7, "Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Room hi! - hi! - hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 1 | Capacity: 0 - hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 -  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 1");
    }

    @Test
    public void test19162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19162");
        room.Room room4 = new room.Room("Room hi! | hi! - hi! | Capacity: 0", (int) (byte) 10, "hi!", "");
        room4.setUnderMaintenance(true);
        java.lang.String str7 = room4.toString();
        room4.notifyObservers();
        boolean boolean9 = room4.isEnabled();
        java.lang.String str10 = room4.getRoomID();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10" + "'", str7, "Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str10, "Room hi! | hi! - hi! | Capacity: 0");
    }

    @Test
    public void test19163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19163");
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
        room4.notifyObservers();
        java.lang.String str18 = room4.getBuildingName();
        java.lang.String str19 = room4.getRoomID();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str7, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi! - hi!" + "'", str14, "hi! - hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test19164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19164");
        room.Room room4 = new room.Room("", (int) (short) 10, "Room hi! | hi! - hi! | Capacity: 0", "hi!");
        java.lang.String str5 = room4.toString();
        java.lang.String str6 = room4.getBuildingName();
        boolean boolean7 = room4.isOccupied();
        java.lang.String str8 = room4.getFullLocation();
        java.lang.String str9 = room4.toString();
        java.lang.String str10 = room4.getRoomNumber();
        java.lang.String str11 = room4.getFullLocation();
        java.lang.String str12 = room4.getRoomNumber();
        java.lang.String str13 = room4.getRoomNumber();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10" + "'", str5, "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str6, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0 - hi!" + "'", str8, "Room hi! | hi! - hi! | Capacity: 0 - hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10" + "'", str9, "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0 - hi!" + "'", str11, "Room hi! | hi! - hi! | Capacity: 0 - hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test19165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19165");
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
        room4.setUnderMaintenance(false);
        java.lang.String str19 = room4.getBuildingName();
        room4.notifyObservers();
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str11, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str16, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test19166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19166");
        room.Room room4 = new room.Room(" - ", 10, "Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - hi! | Capacity: 1", "Room hi! | hi! - hi! | Capacity: 0 - hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 100 - Room hi! | hi! - hi! | Capacity: 0 - hi! - ");
        room4.setOccupied(true);
        room.SensorObserver sensorObserver7 = null;
        room4.removeObserver(sensorObserver7);
    }

    @Test
    public void test19167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19167");
        room.Room room4 = new room.Room("Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! - hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 97 | Capacity: 32", (int) (short) -1, "hi!", "Room  - Room hi! | hi! - hi! | Capacity: 0 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 0 - ");
        boolean boolean5 = room4.isUnderMaintenance();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test19168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19168");
        room.Room room4 = new room.Room("Room Room hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 1 | Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! - Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: -1", (int) (byte) 10, "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 100 | hi! - hi! - hi! - hi! | Capacity: 0", "Room  - Room hi! | hi! - hi! | Capacity: 0 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 0 - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10");
        java.lang.String str5 = room4.getBuildingName();
        java.lang.String str6 = room4.getRoomID();
        room.SensorObserver sensorObserver7 = null;
        room4.addObserver(sensorObserver7);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 100 | hi! - hi! - hi! - hi! | Capacity: 0" + "'", str5, "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 100 | hi! - hi! - hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Room Room hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 1 | Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! - Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: -1" + "'", str6, "Room Room hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 1 | Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! - Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: -1");
    }

    @Test
    public void test19169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19169");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        java.lang.String str5 = room4.getScannedID();
        room4.setScannedID("hi!");
        room4.setUnderMaintenance(true);
        java.lang.String str10 = room4.getScannedID();
        room4.setScannedID("Room hi! | hi! - hi! | Capacity: 0 - hi! - ");
        boolean boolean13 = room4.isEnabled();
        java.lang.String str14 = room4.getFullLocation();
        room4.notifyObservers();
        room4.setUnderMaintenance(true);
        room4.setEnabled(false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi! - hi!" + "'", str14, "hi! - hi!");
    }

    @Test
    public void test19170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19170");
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
        java.lang.String str18 = room4.getRoomNumber();
        room.SensorObserver sensorObserver19 = null;
        room4.addObserver(sensorObserver19);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test19171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19171");
        room.Room room4 = new room.Room("hi!", (int) (byte) 100, "", "Room hi! | hi! - hi! | Capacity: 0");
        java.lang.String str5 = room4.getRoomNumber();
        room4.notifyObservers();
        java.lang.String str7 = room4.getFullLocation();
        java.lang.String str8 = room4.toString();
        room4.setScannedID("hi! - Room hi! | hi! - hi! | Capacity: 0 - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi!");
        java.lang.String str11 = room4.getFullLocation();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str5, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + " - Room hi! | hi! - hi! | Capacity: 0" + "'", str7, " - Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100" + "'", str8, "Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + " - Room hi! | hi! - hi! | Capacity: 0" + "'", str11, " - Room hi! | hi! - hi! | Capacity: 0");
    }

    @Test
    public void test19172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19172");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        java.lang.String str5 = room4.getScannedID();
        room4.setScannedID("hi!");
        room4.setUnderMaintenance(true);
        room4.setOccupied(true);
        room4.setOccupied(false);
        room.SensorObserver sensorObserver14 = null;
        room4.removeObserver(sensorObserver14);
        java.lang.String str16 = room4.toString();
        room4.notifyObservers();
        room4.setEnabled(false);
        boolean boolean20 = room4.isEnabled();
        room4.setUnderMaintenance(true);
        room4.setScannedID("hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - ");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str16, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test19173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19173");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        java.lang.String str5 = room4.getScannedID();
        room4.setScannedID("hi!");
        boolean boolean8 = room4.isEnabled();
        room4.setEnabled(false);
        room.SensorObserver sensorObserver11 = null;
        room4.removeObserver(sensorObserver11);
        boolean boolean13 = room4.isEnabled();
        room4.setOccupied(true);
        room4.setEnabled(false);
        java.lang.String str18 = room4.getRoomNumber();
        room.SensorObserver sensorObserver19 = null;
        room4.addObserver(sensorObserver19);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test19174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19174");
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
        room.SensorObserver sensorObserver22 = null;
        room4.removeObserver(sensorObserver22);
        room4.setOccupied(true);
        room.SensorObserver sensorObserver26 = null;
        room4.removeObserver(sensorObserver26);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str11, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test19175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19175");
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
        room4.setEnabled(true);
        int int23 = room4.getCapacity();
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
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test19176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19176");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        boolean boolean5 = room4.isOccupied();
        room4.setEnabled(false);
        java.lang.String str8 = room4.toString();
        room4.setUnderMaintenance(true);
        room4.setEnabled(true);
        boolean boolean13 = room4.isEnabled();
        java.lang.String str14 = room4.getRoomNumber();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str8, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test19177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19177");
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
        java.lang.String str16 = room4.getBuildingName();
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi! - hi!" + "'", str8, "hi! - hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi! - hi!" + "'", str13, "hi! - hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test19178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19178");
        room.Room room4 = new room.Room("Room hi! | hi! - hi! | Capacity: 0", (int) 'a', "hi!", "hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10");
        java.lang.String str5 = room4.toString();
        java.lang.String str6 = room4.toString();
        boolean boolean7 = room4.isOccupied();
        java.lang.String str8 = room4.getRoomNumber();
        java.lang.String str9 = room4.getFullLocation();
        java.lang.String str10 = room4.getFullLocation();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Room Room hi! | hi! - hi! | Capacity: 0 | hi! - hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 97" + "'", str5, "Room Room hi! | hi! - hi! | Capacity: 0 | hi! - hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 97");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Room Room hi! | hi! - hi! | Capacity: 0 | hi! - hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 97" + "'", str6, "Room Room hi! | hi! - hi! | Capacity: 0 | hi! - hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 97");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10" + "'", str8, "hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi! - hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10" + "'", str9, "hi! - hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi! - hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10" + "'", str10, "hi! - hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10");
    }

    @Test
    public void test19179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19179");
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
        java.lang.String str16 = room4.getFullLocation();
        boolean boolean17 = room4.isEnabled();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi! - hi!" + "'", str16, "hi! - hi!");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test19180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19180");
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
        boolean boolean17 = room4.isEnabled();
        int int18 = room4.getCapacity();
        int int19 = room4.getCapacity();
        room4.notifyObservers();
        java.lang.String str21 = room4.toString();
        room.SensorObserver sensorObserver22 = null;
        room4.addObserver(sensorObserver22);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100" + "'", str13, "Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str15, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100" + "'", str21, "Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100");
    }

    @Test
    public void test19181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19181");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        java.lang.String str5 = room4.getScannedID();
        room4.setScannedID("hi!");
        boolean boolean8 = room4.isEnabled();
        int int9 = room4.getCapacity();
        int int10 = room4.getCapacity();
        boolean boolean11 = room4.isOccupied();
        room4.notifyObservers();
        int int13 = room4.getCapacity();
        room4.setOccupied(true);
        java.lang.String str16 = room4.getRoomID();
        room4.setOccupied(true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test19182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19182");
        room.Room room4 = new room.Room("Room Room hi! - hi! - Room hi! | hi! - hi! | Capacity: 0 | hi! - hi! - Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 97 | Capacity: 10 | Room hi! - hi! - hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 -  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 - Room Room hi! | hi! - hi! | Capacity: 0 - hi! |  - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 | Capacity: 1 -  - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 | Capacity: 52", 0, "Room Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! - hi! - hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: -1 - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10", "Room Room Room hi! | hi! - hi! | Capacity: 0 | Room hi! | hi! - hi! | Capacity: 0 - hi! - hi! | Capacity: 100 |  - hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 10 - Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | hi! - hi! - hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 0");
    }

    @Test
    public void test19183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19183");
        room.Room room4 = new room.Room("Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10", 0, "hi!", "Room hi! | hi! - hi! | Capacity: 0");
        room4.setScannedID("Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100");
        room4.notifyObservers();
        int int8 = room4.getCapacity();
        room4.setEnabled(true);
        java.lang.String str11 = room4.getRoomID();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10" + "'", str11, "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10");
    }

    @Test
    public void test19184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19184");
        room.Room room4 = new room.Room("Room hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 1 - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi!", 97, "Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 | Capacity: 0", "Room hi! | hi! - hi! | Capacity: 0 - hi! - hi!");
        java.lang.String str5 = room4.getBuildingName();
        room4.notifyObservers();
        room.SensorObserver sensorObserver7 = null;
        room4.addObserver(sensorObserver7);
        // The following exception was thrown during execution in test generation
        try {
            room4.setScannedID("Room Room Room hi! | hi! - hi! | Capacity: 0 | Room hi! | hi! - hi! | Capacity: 0 - hi! - hi! | Capacity: 100 - hi! - hi! - Room hi! | hi! - hi! | Capacity: 0 | Room Room hi! | hi! - hi! | Capacity: 0 - hi! | Room Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! - hi! - hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: -1 - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 | Capacity: 10 - Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | hi! - hi! - hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 0 - Room hi! | hi! - hi! | Capacity: 0 - hi! - hi! - Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | hi! -  - Room  - Room hi! | hi! - hi! | Capacity: 0 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 0 | Capacity: 10 | Capacity: 10");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 | Capacity: 0" + "'", str5, "Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 | Capacity: 0");
    }

    @Test
    public void test19185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19185");
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
        boolean boolean18 = room4.isOccupied();
        room.SensorObserver sensorObserver19 = null;
        room4.removeObserver(sensorObserver19);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10" + "'", str5, "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str13, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test19186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19186");
        room.Room room4 = new room.Room("Room hi! - hi! - hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 -  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 - Room hi! | hi! - hi! | Capacity: 0", (int) (short) 100, "Room Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 100 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  - Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | hi! -  - Room  - Room hi! | hi! - hi! | Capacity: 0 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 0 | Capacity: 10 | Capacity: 97", "Room Room Room Room hi! | hi! - hi! | Capacity: 0 | Room hi! | hi! - hi! | Capacity: 0 - hi! - hi! | Capacity: 100 |  - hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 10 | Room Room hi! | hi! - hi! | Capacity: 0 |  - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 0 - hi! - hi! - Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | Capacity: 32");
        java.lang.String str5 = room4.getScannedID();
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test19187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19187");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        room.SensorObserver sensorObserver5 = null;
        room4.addObserver(sensorObserver5);
        java.lang.String str7 = room4.getFullLocation();
        boolean boolean8 = room4.isOccupied();
        java.lang.String str9 = room4.toString();
        java.lang.String str10 = room4.getScannedID();
        int int11 = room4.getCapacity();
        boolean boolean12 = room4.isUnderMaintenance();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi! - hi!" + "'", str7, "hi! - hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str9, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test19188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19188");
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
        room4.setScannedID("Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10");
        int int19 = room4.getCapacity();
        java.lang.String str20 = room4.getScannedID();
        room.SensorObserver sensorObserver21 = null;
        room4.removeObserver(sensorObserver21);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi! - hi!" + "'", str8, "hi! - hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10" + "'", str20, "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10");
    }

    @Test
    public void test19189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19189");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        java.lang.String str5 = room4.getScannedID();
        room4.setScannedID("hi!");
        java.lang.String str8 = room4.getBuildingName();
        room4.setEnabled(false);
        room4.setUnderMaintenance(false);
        boolean boolean13 = room4.isOccupied();
        java.lang.String str14 = room4.getScannedID();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test19190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19190");
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
        java.lang.String str21 = room4.getBuildingName();
        int int22 = room4.getCapacity();
        room4.setOccupied(false);
        java.lang.String str25 = room4.getScannedID();
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
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
    }

    @Test
    public void test19191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19191");
        room.Room room4 = new room.Room("Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10", 0, "hi!", "Room hi! | hi! - hi! | Capacity: 0");
        int int5 = room4.getCapacity();
        java.lang.String str6 = room4.toString();
        room4.setScannedID("Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100");
        room4.notifyObservers();
        boolean boolean10 = room4.isOccupied();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 | hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 0" + "'", str6, "Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 | hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 0");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test19192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19192");
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
        room4.removeObserver(sensorObserver16);
        java.lang.Class<?> wildcardClass18 = room4.getClass();
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str11, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str15, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test19193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19193");
        room.Room room4 = new room.Room("Room Room hi! | hi! - hi! | Capacity: 0 - hi! | Room hi! | Room hi! | hi! - hi! | Capacity: 0 - hi! - Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 1 - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 32", (int) (byte) 10, "Room Room Room hi! | hi! - hi! | Capacity: 0 | Room hi! | hi! - hi! | Capacity: 0 - hi! - hi! | Capacity: 100 |  - hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 10", "Room Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 100");
        java.lang.String str5 = room4.toString();
        room4.setOccupied(false);
        java.lang.String str8 = room4.getRoomID();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Room Room Room hi! | hi! - hi! | Capacity: 0 - hi! | Room hi! | Room hi! | hi! - hi! | Capacity: 0 - hi! - Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 1 - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 32 | Room Room Room hi! | hi! - hi! | Capacity: 0 | Room hi! | hi! - hi! | Capacity: 0 - hi! - hi! | Capacity: 100 |  - hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 10 - Room Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 100 | Capacity: 10" + "'", str5, "Room Room Room hi! | hi! - hi! | Capacity: 0 - hi! | Room hi! | Room hi! | hi! - hi! | Capacity: 0 - hi! - Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 1 - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 32 | Room Room Room hi! | hi! - hi! | Capacity: 0 | Room hi! | hi! - hi! | Capacity: 0 - hi! - hi! | Capacity: 100 |  - hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 10 - Room Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 100 | Capacity: 10");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Room Room hi! | hi! - hi! | Capacity: 0 - hi! | Room hi! | Room hi! | hi! - hi! | Capacity: 0 - hi! - Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 1 - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 32" + "'", str8, "Room Room hi! | hi! - hi! | Capacity: 0 - hi! | Room hi! | Room hi! | hi! - hi! | Capacity: 0 - hi! - Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 1 - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 32");
    }

    @Test
    public void test19194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19194");
        room.Room room4 = new room.Room("", 10, "Room hi! | hi! - hi! | Capacity: 0 - hi!", "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 100 - Room hi! | hi! - hi! | Capacity: 0 - hi! - ");
        boolean boolean5 = room4.isEnabled();
        int int6 = room4.getCapacity();
        room4.setScannedID("Room  | Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! | Capacity: 1");
        java.lang.String str9 = room4.getScannedID();
        int int10 = room4.getCapacity();
        java.lang.String str11 = room4.toString();
        java.lang.String str12 = room4.getRoomNumber();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Room  | Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! | Capacity: 1" + "'", str9, "Room  | Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! | Capacity: 1");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 100 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 10" + "'", str11, "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 100 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 10");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 100 - Room hi! | hi! - hi! | Capacity: 0 - hi! - " + "'", str12, "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 100 - Room hi! | hi! - hi! | Capacity: 0 - hi! - ");
    }

    @Test
    public void test19195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19195");
        room.Room room4 = new room.Room(" - Room hi! | hi! - hi! | Capacity: 0", 0, "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10", "Room hi! | hi! - hi! | Capacity: 0 - hi! - ");
        room4.setScannedID("Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 100 | hi! - hi! - hi! - hi! | Capacity: 0");
        int int7 = room4.getCapacity();
        room.SensorObserver sensorObserver8 = null;
        room4.removeObserver(sensorObserver8);
        java.lang.String str10 = room4.getScannedID();
        java.lang.String str11 = room4.getRoomNumber();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 100 | hi! - hi! - hi! - hi! | Capacity: 0" + "'", str10, "Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 100 | hi! - hi! - hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0 - hi! - " + "'", str11, "Room hi! | hi! - hi! | Capacity: 0 - hi! - ");
    }

    @Test
    public void test19196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19196");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        java.lang.String str5 = room4.getScannedID();
        room4.setScannedID("hi!");
        room4.setScannedID("hi! - hi!");
        room4.setOccupied(true);
        java.lang.String str12 = room4.getFullLocation();
        boolean boolean13 = room4.isOccupied();
        room.SensorObserver sensorObserver14 = null;
        room4.removeObserver(sensorObserver14);
        boolean boolean16 = room4.isOccupied();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi! - hi!" + "'", str12, "hi! - hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test19197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19197");
        room.Room room4 = new room.Room("hi!", (int) (byte) 100, "", "Room hi! | hi! - hi! | Capacity: 0");
        room4.setScannedID("");
        boolean boolean7 = room4.isOccupied();
        room4.setOccupied(true);
        boolean boolean10 = room4.isEnabled();
        boolean boolean11 = room4.isEnabled();
        room.SensorObserver sensorObserver12 = null;
        room4.removeObserver(sensorObserver12);
        room4.setUnderMaintenance(true);
        room4.setScannedID("Room Room hi! | hi! - hi! | Capacity: 0 | hi! - hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 97");
        room4.setUnderMaintenance(true);
        room4.setScannedID("Room  |  - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: -1");
        int int22 = room4.getCapacity();
        java.lang.Class<?> wildcardClass23 = room4.getClass();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 100 + "'", int22 == 100);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test19198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19198");
        room.Room room4 = new room.Room("Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10", 1, "Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 1", "Room hi! | hi! - hi! | Capacity: 0 - hi!");
        boolean boolean5 = room4.isOccupied();
        java.lang.String str6 = room4.getRoomNumber();
        int int7 = room4.getCapacity();
        room4.setEnabled(false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0 - hi!" + "'", str6, "Room hi! | hi! - hi! | Capacity: 0 - hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test19199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19199");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        boolean boolean5 = room4.isOccupied();
        room4.setEnabled(false);
        java.lang.String str8 = room4.toString();
        boolean boolean9 = room4.isEnabled();
        boolean boolean10 = room4.isUnderMaintenance();
        room4.setOccupied(true);
        room.SensorObserver sensorObserver13 = null;
        room4.addObserver(sensorObserver13);
        java.lang.String str15 = room4.getRoomID();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str8, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test19200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19200");
        room.Room room4 = new room.Room("hi!", (int) (byte) 1, "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10", "hi!");
        room4.notifyObservers();
        java.lang.String str6 = room4.getFullLocation();
        java.lang.String str7 = room4.getScannedID();
        boolean boolean8 = room4.isUnderMaintenance();
        java.lang.String str9 = room4.getRoomID();
        boolean boolean10 = room4.isUnderMaintenance();
        java.lang.String str11 = room4.toString();
        room4.notifyObservers();
        room4.notifyObservers();
        boolean boolean14 = room4.isOccupied();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi!" + "'", str6, "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi!");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Room hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 1" + "'", str11, "Room hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 1");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test19201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19201");
        room.Room room4 = new room.Room("Room Room  - Room hi! | hi! - hi! | Capacity: 0 | Room Room hi! | hi! - hi! | Capacity: 0 | hi! - hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 97 - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! | Capacity: 52 | Room Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 97 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - hi! - Room Room hi! - hi! - hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 1 | Capacity: 0 | Room hi! -  | Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 10 -  | Capacity: 52 | Capacity: 32 -  | Capacity: 100", (int) (short) 1, "Room Room  - Room hi! | hi! - hi! | Capacity: 0 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 0 -  | Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! | Capacity: 32", "Room Room Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! |  - Room hi! | hi! - hi! | Capacity: 0 - Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: -1 | Room  - Room hi! | hi! - hi! | Capacity: 0 |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 0 - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! | Capacity: 97");
    }

    @Test
    public void test19202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19202");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        java.lang.String str5 = room4.getScannedID();
        room4.setScannedID("hi!");
        room4.setUnderMaintenance(true);
        room4.setOccupied(true);
        room4.setOccupied(false);
        java.lang.String str14 = room4.getRoomNumber();
        boolean boolean15 = room4.isOccupied();
        java.lang.String str16 = room4.getScannedID();
        room4.setUnderMaintenance(true);
        java.lang.String str19 = room4.toString();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str19, "Room hi! | hi! - hi! | Capacity: 0");
    }

    @Test
    public void test19203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19203");
        room.Room room4 = new room.Room("Room Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 100 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: -1 | Room Room hi! | hi! - hi! | Capacity: 0 | Room hi! | hi! - hi! | Capacity: 0 - hi! - hi! | Capacity: 100 -  | Capacity: 0", 35, "", "hi! - hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! - hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 97 | Capacity: 32");
    }

    @Test
    public void test19204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19204");
        room.Room room4 = new room.Room("Room Room hi! | hi! - hi! | Capacity: 0 | Room hi! | hi! - hi! | Capacity: 0 - hi! - hi! | Capacity: 100", (int) (byte) 10, "", "hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10");
        room4.setScannedID("Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 100 - Room hi! | hi! - hi! | Capacity: 0 - hi! - ");
        boolean boolean7 = room4.isOccupied();
        java.lang.String str8 = room4.toString();
        boolean boolean9 = room4.isOccupied();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Room Room Room hi! | hi! - hi! | Capacity: 0 | Room hi! | hi! - hi! | Capacity: 0 - hi! - hi! | Capacity: 100 |  - hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 10" + "'", str8, "Room Room Room hi! | hi! - hi! | Capacity: 0 | Room hi! | hi! - hi! | Capacity: 0 - hi! - hi! | Capacity: 100 |  - hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 10");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test19205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19205");
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
        room4.setUnderMaintenance(false);
        java.lang.String str23 = room4.getRoomNumber();
        int int24 = room4.getCapacity();
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
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test19206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19206");
        room.Room room4 = new room.Room("Room Room hi! | hi! - hi! | Capacity: 0 - hi! | Room Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! - hi! - hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: -1 - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 | Capacity: 10", (int) (short) 1, "Room Room Room hi! | hi! - hi! | Capacity: 0 | Room hi! | hi! - hi! | Capacity: 0 - hi! - hi! | Capacity: 100 |  - hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 10", "Room Room  - Room hi! | hi! - hi! | Capacity: 0 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 0 | Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 - Room hi! | Room hi! | hi! - hi! | Capacity: 0 - hi! - Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 1 | Capacity: -1");
        room4.setScannedID("Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 100 | hi! - hi! - hi! - hi! | Capacity: 0");
        boolean boolean7 = room4.isUnderMaintenance();
        boolean boolean8 = room4.isEnabled();
        room4.setOccupied(true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test19207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19207");
        room.Room room4 = new room.Room("", (int) (byte) 1, "Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10", "hi!");
        java.lang.String str5 = room4.getFullLocation();
        room4.setScannedID("Room hi! | hi! - hi! | Capacity: 0");
        java.lang.String str8 = room4.getFullLocation();
        boolean boolean9 = room4.isOccupied();
        room4.setScannedID("Room hi! | hi! - hi! | Capacity: 0 - hi!");
        room4.setOccupied(false);
        room4.setUnderMaintenance(true);
        room.SensorObserver sensorObserver16 = null;
        room4.removeObserver(sensorObserver16);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi!" + "'", str5, "Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi!" + "'", str8, "Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test19208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19208");
        room.Room room4 = new room.Room("Room hi! | hi! - hi! | Capacity: 0", (int) (byte) 10, "hi!", "");
        room4.setUnderMaintenance(true);
        java.lang.String str7 = room4.toString();
        room4.notifyObservers();
        room4.setScannedID("hi! - hi!");
        boolean boolean11 = room4.isOccupied();
        room4.setUnderMaintenance(true);
        room4.notifyObservers();
        room4.setOccupied(false);
        java.lang.String str17 = room4.getBuildingName();
        boolean boolean18 = room4.isOccupied();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10" + "'", str7, "Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test19209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19209");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        boolean boolean5 = room4.isOccupied();
        java.lang.String str6 = room4.toString();
        java.lang.String str7 = room4.toString();
        java.lang.String str8 = room4.toString();
        java.lang.String str9 = room4.toString();
        room4.setEnabled(false);
        room.SensorObserver sensorObserver12 = null;
        room4.removeObserver(sensorObserver12);
        room.SensorObserver sensorObserver14 = null;
        room4.addObserver(sensorObserver14);
        java.lang.String str16 = room4.getFullLocation();
        // The following exception was thrown during execution in test generation
        try {
            room4.notifyObservers();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str6, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str7, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str8, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str9, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi! - hi!" + "'", str16, "hi! - hi!");
    }

    @Test
    public void test19210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19210");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        boolean boolean5 = room4.isOccupied();
        boolean boolean6 = room4.isEnabled();
        int int7 = room4.getCapacity();
        int int8 = room4.getCapacity();
        java.lang.String str9 = room4.getRoomNumber();
        room4.setOccupied(false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test19211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19211");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        java.lang.String str5 = room4.getScannedID();
        room4.setScannedID("hi!");
        room4.setUnderMaintenance(true);
        java.lang.String str10 = room4.getScannedID();
        int int11 = room4.getCapacity();
        boolean boolean12 = room4.isEnabled();
        java.lang.String str13 = room4.getRoomNumber();
        java.lang.String str14 = room4.getFullLocation();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi! - hi!" + "'", str14, "hi! - hi!");
    }

    @Test
    public void test19212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19212");
        room.Room room4 = new room.Room("Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi!", 10, "Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10", "hi!");
        java.lang.String str5 = room4.getScannedID();
        room4.setUnderMaintenance(false);
        room.SensorObserver sensorObserver8 = null;
        room4.removeObserver(sensorObserver8);
        boolean boolean10 = room4.isEnabled();
        room4.setOccupied(false);
        java.lang.String str13 = room4.getScannedID();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test19213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19213");
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
        // The following exception was thrown during execution in test generation
        try {
            room4.setOccupied(true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str7, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str14, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str15, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test19214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19214");
        room.Room room4 = new room.Room("Room hi! | hi! - hi! | Capacity: 0", (int) (byte) 10, "hi!", "");
        room4.setUnderMaintenance(true);
        java.lang.String str7 = room4.toString();
        room4.notifyObservers();
        room4.setScannedID("hi! - hi!");
        room4.notifyObservers();
        java.lang.String str12 = room4.getRoomNumber();
        java.lang.String str13 = room4.getRoomNumber();
        boolean boolean14 = room4.isUnderMaintenance();
        room4.notifyObservers();
        room.SensorObserver sensorObserver16 = null;
        room4.addObserver(sensorObserver16);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10" + "'", str7, "Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test19215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19215");
        room.Room room4 = new room.Room("hi!", (int) (byte) 100, "", "Room hi! | hi! - hi! | Capacity: 0");
        java.lang.String str5 = room4.getRoomNumber();
        room4.notifyObservers();
        java.lang.String str7 = room4.getBuildingName();
        boolean boolean8 = room4.isEnabled();
        room4.setEnabled(false);
        boolean boolean11 = room4.isOccupied();
        room4.setOccupied(true);
        java.lang.String str14 = room4.getScannedID();
        java.lang.String str15 = room4.getBuildingName();
        java.lang.String str16 = room4.getBuildingName();
        room4.setScannedID("Room Room Room hi! | hi! - hi! | Capacity: 0 | Room hi! | hi! - hi! | Capacity: 0 - hi! - hi! | Capacity: 100 | hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 100 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str5, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test19216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19216");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        java.lang.String str5 = room4.getScannedID();
        room4.setScannedID("hi!");
        room4.setUnderMaintenance(true);
        java.lang.String str10 = room4.getScannedID();
        java.lang.String str11 = room4.getBuildingName();
        room4.setOccupied(false);
        java.lang.String str14 = room4.getScannedID();
        java.lang.String str15 = room4.getBuildingName();
        room4.setUnderMaintenance(true);
        java.lang.String str18 = room4.getFullLocation();
        java.lang.String str19 = room4.getFullLocation();
        room4.setOccupied(false);
        boolean boolean22 = room4.isOccupied();
        java.lang.String str23 = room4.getRoomID();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi! - hi!" + "'", str18, "hi! - hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi! - hi!" + "'", str19, "hi! - hi!");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
    }

    @Test
    public void test19217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19217");
        room.Room room4 = new room.Room("hi!", 1, "Room hi! | hi! - hi! | Capacity: 0 - hi!", "Room hi! | hi! - hi! | Capacity: 0 - hi!");
        room4.setScannedID("Room Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! |  - Room hi! | hi! - hi! | Capacity: 0 - Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: -1");
        room4.notifyObservers();
        room.SensorObserver sensorObserver8 = null;
        room4.removeObserver(sensorObserver8);
        room4.setEnabled(true);
        boolean boolean12 = room4.isOccupied();
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test19218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19218");
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
        java.lang.String str20 = room4.getScannedID();
        room4.setEnabled(true);
        room.SensorObserver sensorObserver23 = null;
        room4.removeObserver(sensorObserver23);
        room4.setUnderMaintenance(false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str11, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test19219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19219");
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
        boolean boolean15 = room4.isEnabled();
        boolean boolean16 = room4.isEnabled();
        java.lang.String str17 = room4.getFullLocation();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str7, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi! - hi!" + "'", str17, "hi! - hi!");
    }

    @Test
    public void test19220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19220");
        room.Room room4 = new room.Room("", (int) (short) 10, "Room hi! | hi! - hi! | Capacity: 0", "hi!");
        java.lang.String str5 = room4.toString();
        java.lang.String str6 = room4.getBuildingName();
        room4.notifyObservers();
        java.lang.String str8 = room4.getRoomID();
        java.lang.String str9 = room4.getRoomID();
        boolean boolean10 = room4.isUnderMaintenance();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10" + "'", str5, "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str6, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test19221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19221");
        room.Room room4 = new room.Room("hi!", (int) (byte) 100, "", "Room hi! | hi! - hi! | Capacity: 0");
        java.lang.String str5 = room4.getRoomNumber();
        boolean boolean6 = room4.isEnabled();
        java.lang.String str7 = room4.getRoomNumber();
        java.lang.String str8 = room4.getRoomID();
        boolean boolean9 = room4.isEnabled();
        java.lang.String str10 = room4.getRoomID();
        int int11 = room4.getCapacity();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str5, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str7, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
    }

    @Test
    public void test19222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19222");
        room.Room room4 = new room.Room("Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100", (int) '#', "", "Room hi! | hi! - hi! | Capacity: 0 - hi! - ");
        int int5 = room4.getCapacity();
        room4.setUnderMaintenance(false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
    }

    @Test
    public void test19223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19223");
        room.Room room4 = new room.Room("hi! - ", 10, "Room Room hi! | hi! - hi! | Capacity: 0 | Room hi! | hi! - hi! | Capacity: 0 - hi! - hi! | Capacity: 100", "");
        java.lang.String str5 = room4.getRoomNumber();
        boolean boolean6 = room4.isOccupied();
        int int7 = room4.getCapacity();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
    }

    @Test
    public void test19224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19224");
        room.Room room4 = new room.Room("Room Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 100", (int) (short) 100, "", "Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 97");
        boolean boolean5 = room4.isUnderMaintenance();
        java.lang.String str6 = room4.getRoomID();
        boolean boolean7 = room4.isOccupied();
        boolean boolean8 = room4.isOccupied();
        int int9 = room4.getCapacity();
        java.lang.String str10 = room4.getRoomNumber();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Room Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 100" + "'", str6, "Room Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 100");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 97" + "'", str10, "Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 97");
    }

    @Test
    public void test19225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19225");
        room.Room room4 = new room.Room("hi! - hi! - Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100", (int) ' ', "hi! - ", "Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 97");
        boolean boolean5 = room4.isOccupied();
        int int6 = room4.getCapacity();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
    }

    @Test
    public void test19226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19226");
        room.Room room4 = new room.Room("Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room  - Room hi! | hi! - hi! | Capacity: 0 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 0", (int) '#', " - Room Room Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! |  - Room hi! | hi! - hi! | Capacity: 0 - Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: -1 | Room  - Room hi! | hi! - hi! | Capacity: 0 |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 0 - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! | Capacity: 97", "Room Room hi! | hi! - hi! | Capacity: 0 |  - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 0 - Room hi! | Room hi! | hi! - hi! | Capacity: 0 - hi! - Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 1");
        room4.setOccupied(false);
    }

    @Test
    public void test19227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19227");
        room.Room room4 = new room.Room("", (int) (short) -1, "", "Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10");
        boolean boolean5 = room4.isOccupied();
        room.SensorObserver sensorObserver6 = null;
        room4.addObserver(sensorObserver6);
        int int8 = room4.getCapacity();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test19228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19228");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        room.SensorObserver sensorObserver5 = null;
        room4.addObserver(sensorObserver5);
        java.lang.String str7 = room4.toString();
        room.SensorObserver sensorObserver8 = null;
        room4.removeObserver(sensorObserver8);
        java.lang.String str10 = room4.toString();
        java.lang.String str11 = room4.getRoomID();
        boolean boolean12 = room4.isUnderMaintenance();
        java.lang.String str13 = room4.getFullLocation();
        boolean boolean14 = room4.isEnabled();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str7, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str10, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi! - hi!" + "'", str13, "hi! - hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test19229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19229");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        java.lang.String str5 = room4.getScannedID();
        room4.setScannedID("hi!");
        java.lang.String str8 = room4.getBuildingName();
        room4.setEnabled(false);
        room.SensorObserver sensorObserver11 = null;
        room4.addObserver(sensorObserver11);
        // The following exception was thrown during execution in test generation
        try {
            room4.setOccupied(true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test19230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19230");
        room.Room room4 = new room.Room("Room hi! - hi! - hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 1 | Capacity: 0", 52, "Room hi! -  | Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 10", "");
        java.lang.String str5 = room4.toString();
        java.lang.String str6 = room4.getFullLocation();
        room.SensorObserver sensorObserver7 = null;
        room4.removeObserver(sensorObserver7);
        boolean boolean9 = room4.isEnabled();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Room Room hi! - hi! - hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 1 | Capacity: 0 | Room hi! -  | Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 10 -  | Capacity: 52" + "'", str5, "Room Room hi! - hi! - hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 1 | Capacity: 0 | Room hi! -  | Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 10 -  | Capacity: 52");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Room hi! -  | Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 10 - " + "'", str6, "Room hi! -  | Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 10 - ");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test19231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19231");
        room.Room room4 = new room.Room("Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10", (int) '4', "hi! - Room hi! | hi! - hi! | Capacity: 0", "");
        java.lang.String str5 = room4.toString();
        int int6 = room4.getCapacity();
        java.lang.String str7 = room4.getBuildingName();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 | hi! - Room hi! | hi! - hi! | Capacity: 0 -  | Capacity: 52" + "'", str5, "Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 | hi! - Room hi! | hi! - hi! | Capacity: 0 -  | Capacity: 52");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi! - Room hi! | hi! - hi! | Capacity: 0" + "'", str7, "hi! - Room hi! | hi! - hi! | Capacity: 0");
    }

    @Test
    public void test19232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19232");
        room.Room room4 = new room.Room("Room Room hi! - hi! - hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 1 | Capacity: 0 | Room hi! | hi! - hi! | Capacity: 0 - hi! - hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 | Capacity: -1", 35, "Room hi! -  - Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 1 |  - Room Room hi! - hi! - hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 1 | Capacity: 0 | Room hi! -  | Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 10 -  | Capacity: 52 | Capacity: 35", "Room hi! | hi! - hi! | Capacity: 0 - hi! - Room hi! | hi! - hi! | Capacity: 0 - hi! - hi! - hi! - Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100");
    }

    @Test
    public void test19233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19233");
        room.Room room4 = new room.Room("Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 97", (int) '#', "Room hi! - hi! - hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 1 | Capacity: 0", "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10");
        boolean boolean5 = room4.isUnderMaintenance();
        room4.setScannedID("Room Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 | Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 - hi! -  | Capacity: 10 | Room hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 1 - Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | hi! -  - Room  - Room hi! | hi! - hi! | Capacity: 0 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 0 | Capacity: 10 - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 -  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 1");
        boolean boolean8 = room4.isOccupied();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test19234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19234");
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
        java.lang.String str17 = room4.getScannedID();
        room4.setEnabled(false);
        java.lang.String str20 = room4.getRoomNumber();
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
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test19235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19235");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        boolean boolean5 = room4.isOccupied();
        room4.setEnabled(false);
        boolean boolean8 = room4.isUnderMaintenance();
        java.lang.String str9 = room4.getFullLocation();
        room4.setEnabled(true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi! - hi!" + "'", str9, "hi! - hi!");
    }

    @Test
    public void test19236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19236");
        room.Room room4 = new room.Room("hi!", (int) (byte) 100, "", "Room hi! | hi! - hi! | Capacity: 0");
        java.lang.String str5 = room4.getRoomNumber();
        room4.notifyObservers();
        boolean boolean7 = room4.isUnderMaintenance();
        java.lang.String str8 = room4.getScannedID();
        room4.setEnabled(false);
        java.lang.String str11 = room4.getScannedID();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str5, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test19237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19237");
        room.Room room4 = new room.Room("", (int) 'a', " - hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi!", "Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 100 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 -  - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! | Capacity: 0 - Room Room hi! | hi! - hi! | Capacity: 0 - hi! - hi! | Room Room hi! | hi! - hi! | Capacity: 0 | Room hi! | hi! - hi! | Capacity: 0 - hi! - hi! | Capacity: 100 - Room  - Room hi! | hi! - hi! | Capacity: 0 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 0 | Capacity: 10");
        boolean boolean5 = room4.isOccupied();
        java.lang.String str6 = room4.toString();
        room4.setOccupied(true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Room  |  - hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! - Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 100 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 -  - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! | Capacity: 0 - Room Room hi! | hi! - hi! | Capacity: 0 - hi! - hi! | Room Room hi! | hi! - hi! | Capacity: 0 | Room hi! | hi! - hi! | Capacity: 0 - hi! - hi! | Capacity: 100 - Room  - Room hi! | hi! - hi! | Capacity: 0 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 0 | Capacity: 10 | Capacity: 97" + "'", str6, "Room  |  - hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! - Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 100 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 -  - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! | Capacity: 0 - Room Room hi! | hi! - hi! | Capacity: 0 - hi! - hi! | Room Room hi! | hi! - hi! | Capacity: 0 | Room hi! | hi! - hi! | Capacity: 0 - hi! - hi! | Capacity: 100 - Room  - Room hi! | hi! - hi! | Capacity: 0 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 0 | Capacity: 10 | Capacity: 97");
    }

    @Test
    public void test19238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19238");
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
        room.SensorObserver sensorObserver20 = null;
        room4.removeObserver(sensorObserver20);
        boolean boolean22 = room4.isEnabled();
        java.lang.String str23 = room4.getFullLocation();
        boolean boolean24 = room4.isEnabled();
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str11, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi! - hi!" + "'", str23, "hi! - hi!");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test19239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19239");
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
        java.lang.String str20 = room4.getRoomNumber();
        room4.setEnabled(true);
        room4.setUnderMaintenance(true);
        room.SensorObserver sensorObserver25 = null;
        room4.removeObserver(sensorObserver25);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str7, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str10, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi! - hi!" + "'", str18, "hi! - hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test19240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19240");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        java.lang.String str5 = room4.getScannedID();
        room4.setScannedID("hi!");
        room4.setUnderMaintenance(true);
        room.SensorObserver sensorObserver10 = null;
        room4.removeObserver(sensorObserver10);
        boolean boolean12 = room4.isOccupied();
        int int13 = room4.getCapacity();
        java.lang.String str14 = room4.getBuildingName();
        room4.setScannedID("");
        java.lang.String str17 = room4.getBuildingName();
        boolean boolean18 = room4.isOccupied();
        room4.setOccupied(true);
        java.lang.String str21 = room4.getRoomID();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
    }

    @Test
    public void test19241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19241");
        room.Room room4 = new room.Room("hi!", (int) (byte) 100, "", "Room hi! | hi! - hi! | Capacity: 0");
        room4.setScannedID("");
        boolean boolean7 = room4.isOccupied();
        room.SensorObserver sensorObserver8 = null;
        room4.removeObserver(sensorObserver8);
        boolean boolean10 = room4.isOccupied();
        java.lang.String str11 = room4.getScannedID();
        java.lang.String str12 = room4.getRoomNumber();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str12, "Room hi! | hi! - hi! | Capacity: 0");
    }

    @Test
    public void test19242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19242");
        room.Room room4 = new room.Room("Room hi! | hi! - hi! | Capacity: 0", (int) (short) 0, "", "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi!");
        int int5 = room4.getCapacity();
        room.SensorObserver sensorObserver6 = null;
        room4.addObserver(sensorObserver6);
        java.lang.Class<?> wildcardClass8 = room4.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test19243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19243");
        room.Room room4 = new room.Room(" - Room hi! | hi! - hi! | Capacity: 0", 0, "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10", "Room hi! | hi! - hi! | Capacity: 0 - hi! - ");
        java.lang.String str5 = room4.getBuildingName();
        java.lang.String str6 = room4.getFullLocation();
        room4.setUnderMaintenance(true);
        room4.setOccupied(true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10" + "'", str5, "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | hi! - hi! | Capacity: 0 - hi! - " + "'", str6, "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | hi! - hi! | Capacity: 0 - hi! - ");
    }

    @Test
    public void test19244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19244");
        room.Room room4 = new room.Room(" - hi! - hi! - Room hi! | hi! - hi! | Capacity: 0", (int) '4', "hi! -  - Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 1 - hi!", "Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 | hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 0 - hi! - hi! - hi!");
    }

    @Test
    public void test19245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19245");
        room.Room room4 = new room.Room("hi! - hi! - hi!", (int) 'a', "Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 | hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 0", "Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi!");
        room4.setScannedID("Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100");
        room4.setEnabled(false);
        room4.setUnderMaintenance(true);
    }

    @Test
    public void test19246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19246");
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
        boolean boolean23 = room4.isEnabled();
        room4.setEnabled(false);
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
    public void test19247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19247");
        room.Room room4 = new room.Room("hi!", (int) '#', "Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10", "Room hi! | hi! - hi! | Capacity: 0 - hi!");
        boolean boolean5 = room4.isOccupied();
        int int6 = room4.getCapacity();
        java.lang.String str7 = room4.getBuildingName();
        room.SensorObserver sensorObserver8 = null;
        room4.removeObserver(sensorObserver8);
        java.lang.String str10 = room4.getScannedID();
        int int11 = room4.getCapacity();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10" + "'", str7, "Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 35 + "'", int11 == 35);
    }

    @Test
    public void test19248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19248");
        room.Room room4 = new room.Room("Room Room hi! | hi! - hi! | Capacity: 0 | hi! - hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 97", 10, "Room Room hi! | hi! - hi! | Capacity: 0 - hi! | Room hi! | hi! - hi! | Capacity: 0 - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 10", "Room hi! - hi! - hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 1 | Capacity: 0 - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10");
        room4.setEnabled(true);
    }

    @Test
    public void test19249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19249");
        room.Room room4 = new room.Room("", (int) (byte) 1, "Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10", "hi!");
        java.lang.String str5 = room4.getFullLocation();
        room4.setScannedID("Room hi! | hi! - hi! | Capacity: 0");
        java.lang.String str8 = room4.getBuildingName();
        int int9 = room4.getCapacity();
        int int10 = room4.getCapacity();
        room4.setScannedID("Room Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 97 | Room hi! - hi! |  - Room hi! | hi! - hi! | Capacity: 0 - Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 97 | Capacity: -1 -  | Capacity: 10");
        room4.setOccupied(true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi!" + "'", str5, "Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10" + "'", str8, "Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test19250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19250");
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
        boolean boolean22 = room4.isOccupied();
        room4.setOccupied(true);
        boolean boolean25 = room4.isUnderMaintenance();
        java.lang.String str26 = room4.getBuildingName();
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str11, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi! - hi!" + "'", str14, "hi! - hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
    }

    @Test
    public void test19251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19251");
        room.Room room4 = new room.Room("hi!", (int) (byte) 100, "", "Room hi! | hi! - hi! | Capacity: 0");
        java.lang.String str5 = room4.getRoomNumber();
        room4.notifyObservers();
        room4.setOccupied(true);
        java.lang.String str9 = room4.getScannedID();
        boolean boolean10 = room4.isEnabled();
        java.lang.String str11 = room4.getRoomNumber();
        room4.setOccupied(true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str5, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str11, "Room hi! | hi! - hi! | Capacity: 0");
    }

    @Test
    public void test19252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19252");
        room.Room room4 = new room.Room("Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10", 0, "hi!", "Room hi! | hi! - hi! | Capacity: 0");
        java.lang.String str5 = room4.getBuildingName();
        room.SensorObserver sensorObserver6 = null;
        room4.removeObserver(sensorObserver6);
        java.lang.String str8 = room4.getRoomNumber();
        boolean boolean9 = room4.isOccupied();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str8, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test19253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19253");
        room.Room room4 = new room.Room("Room hi! | hi! - hi! | Capacity: 0", (int) (byte) 100, "Room hi! | hi! - hi! | Capacity: 0 - hi!", "hi!");
        java.lang.String str5 = room4.getRoomID();
        room4.setScannedID("hi! - hi!");
        boolean boolean8 = room4.isUnderMaintenance();
        room4.setScannedID("Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 100 | hi! - hi! - hi! - hi! | Capacity: 0");
        java.lang.String str11 = room4.getRoomID();
        room.SensorObserver sensorObserver12 = null;
        room4.removeObserver(sensorObserver12);
        room4.setUnderMaintenance(false);
        java.lang.String str16 = room4.toString();
        java.lang.String str17 = room4.getRoomNumber();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str5, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str11, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Room Room hi! | hi! - hi! | Capacity: 0 | Room hi! | hi! - hi! | Capacity: 0 - hi! - hi! | Capacity: 100" + "'", str16, "Room Room hi! | hi! - hi! | Capacity: 0 | Room hi! | hi! - hi! | Capacity: 0 - hi! - hi! | Capacity: 100");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test19254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19254");
        room.Room room4 = new room.Room("Room hi! | hi! - hi! | Capacity: 0 - hi! - hi!", (int) '4', "Room hi! | hi! - hi! | Capacity: 0 - hi!", "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10");
        boolean boolean5 = room4.isEnabled();
        java.lang.String str6 = room4.getBuildingName();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0 - hi!" + "'", str6, "Room hi! | hi! - hi! | Capacity: 0 - hi!");
    }

    @Test
    public void test19255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19255");
        room.Room room4 = new room.Room("hi!", (int) (byte) 100, "", "Room hi! | hi! - hi! | Capacity: 0");
        java.lang.String str5 = room4.getScannedID();
        java.lang.String str6 = room4.getBuildingName();
        room4.setUnderMaintenance(false);
        boolean boolean9 = room4.isOccupied();
        int int10 = room4.getCapacity();
        java.lang.String str11 = room4.getRoomNumber();
        java.lang.String str12 = room4.getRoomNumber();
        room4.notifyObservers();
        java.lang.String str14 = room4.toString();
        boolean boolean15 = room4.isUnderMaintenance();
        room4.notifyObservers();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str11, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str12, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100" + "'", str14, "Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test19256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19256");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        java.lang.String str5 = room4.getScannedID();
        room4.setScannedID("hi!");
        room4.setUnderMaintenance(true);
        java.lang.String str10 = room4.getScannedID();
        room4.setScannedID("Room hi! | hi! - hi! | Capacity: 0 - hi! - ");
        boolean boolean13 = room4.isEnabled();
        room4.setScannedID("Room hi! | hi! - hi! | Capacity: 0 - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! - hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 97");
        room4.notifyObservers();
        java.lang.Class<?> wildcardClass17 = room4.getClass();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test19257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19257");
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
        room4.setUnderMaintenance(false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str11, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str14, "Room hi! | hi! - hi! | Capacity: 0");
    }

    @Test
    public void test19258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19258");
        room.Room room4 = new room.Room("Room hi! | hi! - hi! | Capacity: 0", (int) (byte) 100, "Room hi! | hi! - hi! | Capacity: 0 - hi!", "hi!");
        java.lang.String str5 = room4.getRoomID();
        room.SensorObserver sensorObserver6 = null;
        room4.addObserver(sensorObserver6);
        java.lang.String str8 = room4.getFullLocation();
        boolean boolean9 = room4.isOccupied();
        java.lang.String str10 = room4.getRoomID();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str5, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0 - hi! - hi!" + "'", str8, "Room hi! | hi! - hi! | Capacity: 0 - hi! - hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str10, "Room hi! | hi! - hi! | Capacity: 0");
    }

    @Test
    public void test19259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19259");
        room.Room room4 = new room.Room("hi! - hi! - hi! - Room hi! | hi! - hi! | Capacity: 0 - Room Room hi! | hi! - hi! | Capacity: 0 - hi! - hi! - Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | hi! -  - Room  - Room hi! | hi! - hi! | Capacity: 0 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 0 | Capacity: 10 | hi! -  - Room  - Room hi! | hi! - hi! | Capacity: 0 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 0 - hi! -  - Room  - Room hi! | hi! - hi! | Capacity: 0 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 0 | Capacity: 100", 0, "", "Room Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 | Capacity: 35");
        room4.setOccupied(false);
        boolean boolean7 = room4.isOccupied();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test19260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19260");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        java.lang.String str5 = room4.getScannedID();
        room4.setScannedID("hi!");
        boolean boolean8 = room4.isEnabled();
        int int9 = room4.getCapacity();
        int int10 = room4.getCapacity();
        boolean boolean11 = room4.isOccupied();
        room4.setEnabled(false);
        java.lang.String str14 = room4.getScannedID();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test19261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19261");
        room.Room room4 = new room.Room("hi! -  - Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 1", (int) (short) -1, "Room Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 97 | Room hi! | hi! - hi! | Capacity: 0 - hi! - hi! - Room hi! | Room hi! | hi! - hi! | Capacity: 0 - hi! - Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 1 | Capacity: 1", "Room hi! -  | Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 10 - ");
        java.lang.String str5 = room4.getRoomNumber();
        boolean boolean6 = room4.isEnabled();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Room hi! -  | Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 10 - " + "'", str5, "Room hi! -  | Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 10 - ");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test19262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19262");
        room.Room room4 = new room.Room("", (-1), "", "");
        java.lang.String str5 = room4.getRoomNumber();
        boolean boolean6 = room4.isOccupied();
        java.lang.String str7 = room4.getRoomNumber();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test19263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19263");
        room.Room room4 = new room.Room("Room hi! | hi! - hi! | Capacity: 0", (int) (byte) 100, "Room hi! | hi! - hi! | Capacity: 0 - hi!", "hi!");
        java.lang.String str5 = room4.getRoomID();
        room.SensorObserver sensorObserver6 = null;
        room4.addObserver(sensorObserver6);
        room.SensorObserver sensorObserver8 = null;
        room4.removeObserver(sensorObserver8);
        room4.setUnderMaintenance(true);
        room4.setScannedID("Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10");
        room.SensorObserver sensorObserver14 = null;
        room4.removeObserver(sensorObserver14);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str5, "Room hi! | hi! - hi! | Capacity: 0");
    }

    @Test
    public void test19264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19264");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        java.lang.String str5 = room4.getScannedID();
        room4.setScannedID("hi!");
        room4.setUnderMaintenance(true);
        java.lang.String str10 = room4.getScannedID();
        int int11 = room4.getCapacity();
        java.lang.String str12 = room4.getBuildingName();
        room4.setEnabled(false);
        java.lang.String str15 = room4.getRoomID();
        java.lang.String str16 = room4.toString();
        java.lang.Class<?> wildcardClass17 = room4.getClass();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str16, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test19265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19265");
        room.Room room4 = new room.Room("hi!", (int) (byte) 100, "", "Room hi! | hi! - hi! | Capacity: 0");
        java.lang.String str5 = room4.getScannedID();
        java.lang.String str6 = room4.getBuildingName();
        room4.setUnderMaintenance(false);
        room4.setScannedID("Room hi! | hi! - hi! | Capacity: 0 - hi! - ");
        java.lang.String str11 = room4.toString();
        java.lang.String str12 = room4.getRoomNumber();
        java.lang.String str13 = room4.getScannedID();
        java.lang.String str14 = room4.getBuildingName();
        room4.setUnderMaintenance(false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100" + "'", str11, "Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str12, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0 - hi! - " + "'", str13, "Room hi! | hi! - hi! | Capacity: 0 - hi! - ");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test19266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19266");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        boolean boolean5 = room4.isOccupied();
        room4.setEnabled(false);
        java.lang.String str8 = room4.toString();
        room4.setOccupied(true);
        room4.setOccupied(false);
        java.lang.String str13 = room4.getRoomID();
        boolean boolean14 = room4.isOccupied();
        room4.setEnabled(true);
        boolean boolean17 = room4.isEnabled();
        room4.setUnderMaintenance(true);
        java.lang.String str20 = room4.toString();
        java.lang.String str21 = room4.getRoomNumber();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str8, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str20, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
    }

    @Test
    public void test19267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19267");
        room.Room room4 = new room.Room("Room Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! - hi! - hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: -1 - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 97 - Room  - Room hi! | hi! - hi! | Capacity: 0 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 0", (int) (short) 10, "Room Room hi! - hi! - Room hi! | hi! - hi! | Capacity: 0 | hi! - hi! - Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 97 | Capacity: 10 | Room hi! - hi! - hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 -  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 - Room Room hi! | hi! - hi! | Capacity: 0 - hi! |  - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 | Capacity: 1 -  - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 | Capacity: 52", "Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - hi! - hi! - hi!");
    }

    @Test
    public void test19268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19268");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        boolean boolean5 = room4.isOccupied();
        room4.setEnabled(false);
        java.lang.String str8 = room4.getFullLocation();
        room4.setOccupied(false);
        java.lang.String str11 = room4.getFullLocation();
        java.lang.String str12 = room4.getFullLocation();
        java.lang.String str13 = room4.getFullLocation();
        java.lang.String str14 = room4.getBuildingName();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi! - hi!" + "'", str8, "hi! - hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi! - hi!" + "'", str11, "hi! - hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi! - hi!" + "'", str12, "hi! - hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi! - hi!" + "'", str13, "hi! - hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test19269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19269");
        room.Room room4 = new room.Room("Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10", (int) (short) 10, "hi! - ", "Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 1");
        room4.setUnderMaintenance(true);
        java.lang.String str7 = room4.getBuildingName();
        room4.setScannedID("Room hi! | hi! - hi! | Capacity: 0 - hi!");
        room4.setScannedID("Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 - ");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi! - " + "'", str7, "hi! - ");
    }

    @Test
    public void test19270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19270");
        room.Room room4 = new room.Room("Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi!", 100, "Room Room hi! | hi! - hi! | Capacity: 0 - hi! | Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! -  -  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 0", "Room Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 | Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 - hi! -  | Capacity: 10 - hi! - hi! - hi! | Capacity: 100");
    }

    @Test
    public void test19271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19271");
        room.Room room4 = new room.Room("hi!", (int) (byte) 1, "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10", "hi!");
        room4.setEnabled(false);
        java.lang.String str7 = room4.getScannedID();
        room4.notifyObservers();
        room4.notifyObservers();
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test19272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19272");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        java.lang.String str5 = room4.getScannedID();
        room4.setScannedID("hi!");
        java.lang.String str8 = room4.getBuildingName();
        java.lang.String str9 = room4.getScannedID();
        room4.setOccupied(true);
        room4.setScannedID("Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test19273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19273");
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
        java.lang.String str19 = room4.getBuildingName();
        java.lang.String str20 = room4.getFullLocation();
        java.lang.String str21 = room4.getFullLocation();
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
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi! - hi!" + "'", str20, "hi! - hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi! - hi!" + "'", str21, "hi! - hi!");
    }

    @Test
    public void test19274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19274");
        room.Room room4 = new room.Room("Room Room hi! | hi! - hi! | Capacity: 0 - hi! | Room hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 1 -  | Capacity: 1", (int) '#', "Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 97", "Room  - Room hi! | hi! - hi! | Capacity: 0 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 0 - ");
        int int5 = room4.getCapacity();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
    }

    @Test
    public void test19275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19275");
        room.Room room4 = new room.Room("Room Room hi! - hi! - Room hi! | hi! - hi! | Capacity: 0 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 100 | Capacity: 10 | Room hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 1 - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100", (-1), "Room Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 100 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 -  - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! | Capacity: 0 | Room  - Room hi! | hi! - hi! | Capacity: 0 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 0 -  | Capacity: -1", "Room hi! | hi! - hi! - Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | Capacity: 0 -  - hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10");
        room4.setEnabled(false);
    }

    @Test
    public void test19276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19276");
        room.Room room4 = new room.Room("hi! - hi! - Room hi! | hi! - hi! | Capacity: 0", (int) (short) 1, "hi! - hi! - Room hi! | hi! - hi! | Capacity: 0", "hi! - ");
        java.lang.String str5 = room4.getRoomNumber();
        java.lang.Class<?> wildcardClass6 = room4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi! - " + "'", str5, "hi! - ");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test19277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19277");
        room.Room room4 = new room.Room("Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | Room hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 1 - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! | Capacity: 97", (int) (byte) 1, "Room hi! | hi! - hi! - Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | Capacity: 0", " - hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10");
        int int5 = room4.getCapacity();
        room4.setEnabled(false);
        java.lang.String str8 = room4.getRoomID();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | Room hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 1 - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! | Capacity: 97" + "'", str8, "Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | Room hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 1 - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! | Capacity: 97");
    }

    @Test
    public void test19278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19278");
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
        room4.setScannedID("Room  - Room hi! | hi! - hi! | Capacity: 0 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 0 - hi!");
        room.SensorObserver sensorObserver18 = null;
        room4.removeObserver(sensorObserver18);
        java.lang.String str20 = room4.toString();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str7, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str20, "Room hi! | hi! - hi! | Capacity: 0");
    }

    @Test
    public void test19279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19279");
        room.Room room4 = new room.Room("Room  - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! | Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 100 | hi! - hi! - hi! - hi! | Capacity: 0 - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 0", (int) ' ', "", "Room hi! | hi! - hi! | Capacity: 0 - hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 100 - Room hi! | hi! - hi! | Capacity: 0 - hi! - ");
        room4.setScannedID("hi! - hi! - Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100");
        room4.notifyObservers();
        room4.setScannedID("Room hi! - hi! - Room hi! | hi! - hi! | Capacity: 0 | hi! - hi! - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 1 - Room hi! | hi! - hi! | Capacity: 0 - hi! - Room hi! | hi! - hi! | Capacity: 0 - hi!");
    }

    @Test
    public void test19280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19280");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        boolean boolean5 = room4.isOccupied();
        room4.setEnabled(false);
        java.lang.String str8 = room4.toString();
        room4.setOccupied(true);
        boolean boolean11 = room4.isOccupied();
        java.lang.String str12 = room4.getScannedID();
        boolean boolean13 = room4.isUnderMaintenance();
        java.lang.String str14 = room4.getRoomID();
        room4.notifyObservers();
        boolean boolean16 = room4.isUnderMaintenance();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str8, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test19281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19281");
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
        java.lang.String str17 = room4.getRoomID();
        java.lang.String str18 = room4.getBuildingName();
        java.lang.Class<?> wildcardClass19 = room4.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str7, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str14, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str15, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test19282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19282");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        room.SensorObserver sensorObserver5 = null;
        room4.addObserver(sensorObserver5);
        java.lang.String str7 = room4.toString();
        room.SensorObserver sensorObserver8 = null;
        room4.removeObserver(sensorObserver8);
        int int10 = room4.getCapacity();
        java.lang.String str11 = room4.getBuildingName();
        room4.setEnabled(true);
        java.lang.String str14 = room4.getRoomNumber();
        java.lang.String str15 = room4.getScannedID();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str7, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test19283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19283");
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
        room4.setScannedID("Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10");
        room4.setScannedID("Room Room hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 1 - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! | Room Room hi! | hi! - hi! | Capacity: 0 - hi! | Room Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! - hi! - hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: -1 - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 | Capacity: 10 - Room Room  - Room hi! | hi! - hi! | Capacity: 0 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 0 | Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 - Room hi! | Room hi! | hi! - hi! | Capacity: 0 - hi! - Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 1 | Capacity: -1 | Capacity: 97");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str11, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str15, "Room hi! | hi! - hi! | Capacity: 0");
    }

    @Test
    public void test19284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19284");
        room.Room room4 = new room.Room("", (int) (short) 10, "Room hi! | hi! - hi! | Capacity: 0", "hi!");
        java.lang.String str5 = room4.toString();
        java.lang.String str6 = room4.getBuildingName();
        boolean boolean7 = room4.isOccupied();
        java.lang.String str8 = room4.getFullLocation();
        room.SensorObserver sensorObserver9 = null;
        room4.removeObserver(sensorObserver9);
        java.lang.String str11 = room4.getBuildingName();
        java.lang.String str12 = room4.getScannedID();
        boolean boolean13 = room4.isUnderMaintenance();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10" + "'", str5, "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str6, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0 - hi!" + "'", str8, "Room hi! | hi! - hi! | Capacity: 0 - hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str11, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test19285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19285");
        room.Room room4 = new room.Room("Room hi! | hi! - hi! | Capacity: 0 - hi! - hi!", 52, " - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi!", "Room Room hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 1 | Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! - Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: -1");
        room.SensorObserver sensorObserver5 = null;
        room4.addObserver(sensorObserver5);
    }

    @Test
    public void test19286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19286");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        java.lang.String str5 = room4.getScannedID();
        room4.setScannedID("hi!");
        java.lang.String str8 = room4.getBuildingName();
        int int9 = room4.getCapacity();
        room.SensorObserver sensorObserver10 = null;
        room4.addObserver(sensorObserver10);
        java.lang.String str12 = room4.getScannedID();
        int int13 = room4.getCapacity();
        boolean boolean14 = room4.isEnabled();
        java.lang.String str15 = room4.toString();
        java.lang.String str16 = room4.getScannedID();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str15, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test19287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19287");
        room.Room room4 = new room.Room("Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100", (int) 'a', "hi! - hi!", "Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10");
        boolean boolean5 = room4.isOccupied();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test19288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19288");
        room.Room room4 = new room.Room("hi! - hi! - Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 -  - hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10", 97, "hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - ", "Room hi! -  | Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 10 - hi! - hi! - Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100");
    }

    @Test
    public void test19289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19289");
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
        java.lang.String str17 = room4.getRoomNumber();
        room.SensorObserver sensorObserver18 = null;
        room4.removeObserver(sensorObserver18);
        boolean boolean20 = room4.isEnabled();
        java.lang.Class<?> wildcardClass21 = room4.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str7, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str10, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str14, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test19290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19290");
        room.Room room4 = new room.Room("hi!", (int) (byte) 100, "", "Room hi! | hi! - hi! | Capacity: 0");
        java.lang.String str5 = room4.getScannedID();
        java.lang.String str6 = room4.getBuildingName();
        room4.setScannedID("Room hi! | hi! - hi! | Capacity: 0");
        java.lang.String str9 = room4.getRoomID();
        boolean boolean10 = room4.isUnderMaintenance();
        room4.notifyObservers();
        room4.setOccupied(false);
        java.lang.String str14 = room4.getRoomNumber();
        java.lang.String str15 = room4.getRoomNumber();
        boolean boolean16 = room4.isOccupied();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str14, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str15, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test19291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19291");
        room.Room room4 = new room.Room("Room Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! - hi! - hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: -1 - Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 | hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 0 - hi! - hi! - Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 97 - Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 100 | hi! - hi! - hi! - hi! | Capacity: 0 -  - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi!", (int) (short) 10, "Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 | hi! - hi! - Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 - Room hi! | hi! - hi! | Capacity: 0 - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 0", " - Room hi! -  | Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 10 - ");
    }

    @Test
    public void test19292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19292");
        room.Room room4 = new room.Room("Room hi! | hi! - hi! | Capacity: 0", (int) (byte) 10, "hi!", "");
        room4.setUnderMaintenance(true);
        room4.setEnabled(false);
        boolean boolean9 = room4.isUnderMaintenance();
        room4.setUnderMaintenance(true);
        room4.setUnderMaintenance(true);
        java.lang.String str14 = room4.toString();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10" + "'", str14, "Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10");
    }

    @Test
    public void test19293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19293");
        room.Room room4 = new room.Room("Room Room hi! | hi! - hi! | Capacity: 0 |  - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 0 - Room hi! | Room hi! | hi! - hi! | Capacity: 0 - hi! - Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 1", (int) (byte) -1, "", " - Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 1 - Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100");
        java.lang.String str5 = room4.getBuildingName();
        room4.setEnabled(false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test19294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19294");
        room.Room room4 = new room.Room("Room hi! | hi! - hi! | Capacity: 0", (int) (byte) 10, "hi!", "");
        room4.setUnderMaintenance(true);
        room4.setEnabled(false);
        room4.setOccupied(false);
        int int11 = room4.getCapacity();
        java.lang.String str12 = room4.getRoomID();
        boolean boolean13 = room4.isUnderMaintenance();
        boolean boolean14 = room4.isEnabled();
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str12, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test19295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19295");
        room.Room room4 = new room.Room("Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100", 0, "hi! - hi!", "hi!");
        java.lang.String str5 = room4.getFullLocation();
        boolean boolean6 = room4.isUnderMaintenance();
        boolean boolean7 = room4.isOccupied();
        boolean boolean8 = room4.isEnabled();
        room.SensorObserver sensorObserver9 = null;
        room4.addObserver(sensorObserver9);
        // The following exception was thrown during execution in test generation
        try {
            room4.setUnderMaintenance(false);
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
    public void test19296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19296");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        boolean boolean5 = room4.isOccupied();
        room4.setEnabled(false);
        java.lang.String str8 = room4.toString();
        room4.setOccupied(true);
        room4.setOccupied(false);
        java.lang.String str13 = room4.getRoomID();
        boolean boolean14 = room4.isEnabled();
        java.lang.String str15 = room4.getFullLocation();
        java.lang.String str16 = room4.getBuildingName();
        java.lang.String str17 = room4.getFullLocation();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str8, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi! - hi!" + "'", str15, "hi! - hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi! - hi!" + "'", str17, "hi! - hi!");
    }

    @Test
    public void test19297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19297");
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
        java.lang.String str20 = room4.getRoomID();
        boolean boolean21 = room4.isUnderMaintenance();
        boolean boolean22 = room4.isOccupied();
        java.lang.String str23 = room4.toString();
        java.lang.String str24 = room4.getBuildingName();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str23, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
    }

    @Test
    public void test19298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19298");
        room.Room room4 = new room.Room("hi!", (int) (byte) 100, "", "Room hi! | hi! - hi! | Capacity: 0");
        java.lang.String str5 = room4.getRoomNumber();
        java.lang.String str6 = room4.getBuildingName();
        boolean boolean7 = room4.isEnabled();
        int int8 = room4.getCapacity();
        int int9 = room4.getCapacity();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str5, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
    }

    @Test
    public void test19299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19299");
        room.Room room4 = new room.Room("hi!", (int) (byte) 100, "", "Room hi! | hi! - hi! | Capacity: 0");
        java.lang.String str5 = room4.getScannedID();
        java.lang.String str6 = room4.getBuildingName();
        room4.setUnderMaintenance(false);
        boolean boolean9 = room4.isOccupied();
        int int10 = room4.getCapacity();
        java.lang.String str11 = room4.getBuildingName();
        int int12 = room4.getCapacity();
        room.SensorObserver sensorObserver13 = null;
        room4.removeObserver(sensorObserver13);
        boolean boolean15 = room4.isOccupied();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test19300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19300");
        room.Room room4 = new room.Room("hi!", (int) (byte) 100, "", "Room hi! | hi! - hi! | Capacity: 0");
        java.lang.String str5 = room4.getScannedID();
        java.lang.String str6 = room4.getBuildingName();
        room4.setScannedID("Room Room hi! | hi! - hi! | Capacity: 0 | Room hi! | hi! - hi! | Capacity: 0 - hi! - hi! | Capacity: 100");
        room4.setOccupied(false);
        java.lang.String str11 = room4.getBuildingName();
        room4.setUnderMaintenance(false);
        java.lang.String str14 = room4.getRoomID();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test19301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19301");
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
        room4.setOccupied(false);
        java.lang.String str19 = room4.getBuildingName();
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str11, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str13, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str16, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test19302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19302");
        room.Room room4 = new room.Room("hi!", (int) (byte) 100, "", "Room hi! | hi! - hi! | Capacity: 0");
        java.lang.String str5 = room4.getRoomNumber();
        room4.notifyObservers();
        room.SensorObserver sensorObserver7 = null;
        room4.addObserver(sensorObserver7);
        room.SensorObserver sensorObserver9 = null;
        room4.removeObserver(sensorObserver9);
        boolean boolean11 = room4.isEnabled();
        java.lang.String str12 = room4.toString();
        java.lang.String str13 = room4.getBuildingName();
        room4.setUnderMaintenance(false);
        boolean boolean16 = room4.isUnderMaintenance();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str5, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100" + "'", str12, "Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test19303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19303");
        room.Room room4 = new room.Room(" - Room hi! - hi! - hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 1 | Capacity: 0", 0, "hi! - hi! - Room hi! | hi! - hi! | Capacity: 0 - Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - hi! | Capacity: 1", "Room hi! | hi! - hi! | Capacity: 0 - hi! - Room hi! | hi! - hi! | Capacity: 0 - hi! - hi! - hi! - Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100");
    }

    @Test
    public void test19304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19304");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        room.SensorObserver sensorObserver5 = null;
        room4.addObserver(sensorObserver5);
        java.lang.String str7 = room4.getScannedID();
        java.lang.String str8 = room4.getBuildingName();
        java.lang.String str9 = room4.getBuildingName();
        java.lang.String str10 = room4.toString();
        java.lang.String str11 = room4.getFullLocation();
        int int12 = room4.getCapacity();
        java.lang.String str13 = room4.getRoomNumber();
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str10, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi! - hi!" + "'", str11, "hi! - hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test19305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19305");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        room.SensorObserver sensorObserver5 = null;
        room4.addObserver(sensorObserver5);
        java.lang.String str7 = room4.getScannedID();
        java.lang.String str8 = room4.getFullLocation();
        boolean boolean9 = room4.isOccupied();
        boolean boolean10 = room4.isOccupied();
        room.SensorObserver sensorObserver11 = null;
        room4.removeObserver(sensorObserver11);
        java.lang.String str13 = room4.getRoomID();
        boolean boolean14 = room4.isOccupied();
        java.lang.String str15 = room4.getFullLocation();
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi! - hi!" + "'", str8, "hi! - hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi! - hi!" + "'", str15, "hi! - hi!");
    }

    @Test
    public void test19306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19306");
        room.Room room4 = new room.Room("Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 100", (int) (short) 10, "Room hi! -  | Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 0 - Room  - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 100 | hi! - hi! - hi! - hi! | Capacity: 0 | Capacity: 0", "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 1");
        java.lang.String str5 = room4.getFullLocation();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Room hi! -  | Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 0 - Room  - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 100 | hi! - hi! - hi! - hi! | Capacity: 0 | Capacity: 0 - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 1" + "'", str5, "Room hi! -  | Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 0 - Room  - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 100 | hi! - hi! - hi! - hi! | Capacity: 0 | Capacity: 0 - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 1");
    }

    @Test
    public void test19307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19307");
        room.Room room4 = new room.Room("Room hi! | hi! - hi! | Capacity: 0", (int) (byte) 10, "hi!", "");
        int int5 = room4.getCapacity();
        java.lang.String str6 = room4.getRoomID();
        room4.setScannedID("Room Room hi! | hi! - hi! | Capacity: 0 |  - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 0");
        boolean boolean9 = room4.isEnabled();
        room4.setOccupied(false);
        java.lang.String str12 = room4.getRoomNumber();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str6, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test19308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19308");
        room.Room room4 = new room.Room(" - Room hi! | hi! - hi! | Capacity: 0", 32, "Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 97", "hi!");
        boolean boolean5 = room4.isOccupied();
        room4.setScannedID("Room Room hi! - hi! - hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 1 | Capacity: 0 | Room hi! | hi! - hi! | Capacity: 0 - hi! - hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 | Capacity: -1");
        room.SensorObserver sensorObserver8 = null;
        room4.addObserver(sensorObserver8);
        java.lang.Class<?> wildcardClass10 = room4.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test19309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19309");
        room.Room room4 = new room.Room("Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10", 0, "hi!", "Room hi! | hi! - hi! | Capacity: 0");
        int int5 = room4.getCapacity();
        java.lang.String str6 = room4.getBuildingName();
        room4.setScannedID("Room  - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! | Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 100 | hi! - hi! - hi! - hi! | Capacity: 0 - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 0");
        room.SensorObserver sensorObserver9 = null;
        room4.addObserver(sensorObserver9);
        java.lang.String str11 = room4.getRoomID();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10" + "'", str11, "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10");
    }

    @Test
    public void test19310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19310");
        room.Room room4 = new room.Room("Room hi! - hi! | Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 10", (int) (short) 10, "Room Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! |  - Room hi! | hi! - hi! | Capacity: 0 - Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: -1", "Room  - Room hi! | hi! - hi! | Capacity: 0 |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 0");
        room.SensorObserver sensorObserver5 = null;
        room4.removeObserver(sensorObserver5);
        java.lang.String str7 = room4.getFullLocation();
        java.lang.String str8 = room4.getScannedID();
        boolean boolean9 = room4.isUnderMaintenance();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Room Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! |  - Room hi! | hi! - hi! | Capacity: 0 - Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: -1 - Room  - Room hi! | hi! - hi! | Capacity: 0 |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 0" + "'", str7, "Room Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! |  - Room hi! | hi! - hi! | Capacity: 0 - Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: -1 - Room  - Room hi! | hi! - hi! | Capacity: 0 |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 0");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test19311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19311");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        room.SensorObserver sensorObserver5 = null;
        room4.addObserver(sensorObserver5);
        java.lang.String str7 = room4.getScannedID();
        java.lang.String str8 = room4.getFullLocation();
        int int9 = room4.getCapacity();
        java.lang.String str10 = room4.getScannedID();
        room.SensorObserver sensorObserver11 = null;
        room4.removeObserver(sensorObserver11);
        boolean boolean13 = room4.isUnderMaintenance();
        boolean boolean14 = room4.isEnabled();
        boolean boolean15 = room4.isUnderMaintenance();
        int int16 = room4.getCapacity();
        room.SensorObserver sensorObserver17 = null;
        room4.removeObserver(sensorObserver17);
        java.lang.Class<?> wildcardClass19 = room4.getClass();
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi! - hi!" + "'", str8, "hi! - hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test19312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19312");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        java.lang.String str5 = room4.getScannedID();
        room4.setScannedID("hi!");
        java.lang.String str8 = room4.getBuildingName();
        java.lang.String str9 = room4.getFullLocation();
        java.lang.String str10 = room4.getRoomNumber();
        int int11 = room4.getCapacity();
        java.lang.String str12 = room4.getScannedID();
        boolean boolean13 = room4.isUnderMaintenance();
        room4.setScannedID("Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 | hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 0 - hi! - hi! - Room hi! | hi! - hi! | Capacity: 0");
        java.lang.String str16 = room4.getBuildingName();
        boolean boolean17 = room4.isEnabled();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi! - hi!" + "'", str9, "hi! - hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test19313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19313");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        boolean boolean5 = room4.isOccupied();
        room4.setEnabled(false);
        room4.setUnderMaintenance(false);
        java.lang.String str10 = room4.getScannedID();
        java.lang.String str11 = room4.getBuildingName();
        room4.setOccupied(true);
        boolean boolean14 = room4.isUnderMaintenance();
        boolean boolean15 = room4.isUnderMaintenance();
        boolean boolean16 = room4.isOccupied();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test19314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19314");
        room.Room room4 = new room.Room("Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 | hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 0 - hi! - hi! - Room hi! | hi! - hi! | Capacity: 0 -  - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi!", (-1), "Room hi! | hi! - hi! | Capacity: 0 - hi! -  - Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | Room hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 1 - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! | Capacity: 97", "Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 100 | Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 - Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 100 | hi! - hi! - hi! - hi! | Capacity: 0 | Capacity: 0");
    }

    @Test
    public void test19315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19315");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        boolean boolean5 = room4.isOccupied();
        boolean boolean6 = room4.isEnabled();
        java.lang.String str7 = room4.getFullLocation();
        room.SensorObserver sensorObserver8 = null;
        room4.addObserver(sensorObserver8);
        boolean boolean10 = room4.isOccupied();
        boolean boolean11 = room4.isUnderMaintenance();
        java.lang.String str12 = room4.getFullLocation();
        java.lang.String str13 = room4.getFullLocation();
        room.SensorObserver sensorObserver14 = null;
        room4.removeObserver(sensorObserver14);
        java.lang.String str16 = room4.toString();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi! - hi!" + "'", str7, "hi! - hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi! - hi!" + "'", str12, "hi! - hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi! - hi!" + "'", str13, "hi! - hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str16, "Room hi! | hi! - hi! | Capacity: 0");
    }

    @Test
    public void test19316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19316");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        java.lang.String str5 = room4.getScannedID();
        room4.setScannedID("hi!");
        java.lang.String str8 = room4.getScannedID();
        room4.setScannedID("Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100");
        room.SensorObserver sensorObserver11 = null;
        room4.removeObserver(sensorObserver11);
        boolean boolean13 = room4.isOccupied();
        boolean boolean14 = room4.isOccupied();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test19317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19317");
        room.Room room4 = new room.Room("Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 1", (int) (byte) 100, "Room Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 | hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 0 - hi! - hi! - Room hi! | hi! - hi! | Capacity: 0 -  - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! | hi! - hi! - Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 97 - Room Room hi! | hi! - hi! | Capacity: 0 - hi! - hi! |  - Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | hi! - hi! - hi! | Capacity: 0 | Capacity: 52 | Capacity: 100", "Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 1 - hi! - hi! - Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100");
    }

    @Test
    public void test19318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19318");
        room.Room room4 = new room.Room("Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 1", (int) (short) -1, "hi! - hi! - hi! - hi!", "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! - hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 97 | Capacity: 32");
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
    public void test19319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19319");
        room.Room room4 = new room.Room("", (int) '#', "Room hi! | hi! - hi! | Capacity: 0 - hi! - ", "Room hi! | hi! - hi! | Capacity: 0 - hi! - ");
        java.lang.String str5 = room4.getRoomNumber();
        java.lang.String str6 = room4.getRoomID();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0 - hi! - " + "'", str5, "Room hi! | hi! - hi! | Capacity: 0 - hi! - ");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test19320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19320");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        java.lang.String str5 = room4.getScannedID();
        room4.setScannedID("hi!");
        room4.setUnderMaintenance(true);
        boolean boolean10 = room4.isOccupied();
        boolean boolean11 = room4.isOccupied();
        java.lang.String str12 = room4.getFullLocation();
        java.lang.String str13 = room4.getBuildingName();
        room4.setEnabled(false);
        boolean boolean16 = room4.isEnabled();
        room4.setOccupied(false);
        java.lang.String str19 = room4.getRoomID();
        room4.setEnabled(false);
        boolean boolean22 = room4.isOccupied();
        boolean boolean23 = room4.isUnderMaintenance();
        java.lang.String str24 = room4.getBuildingName();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi! - hi!" + "'", str12, "hi! - hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
    }

    @Test
    public void test19321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19321");
        room.Room room4 = new room.Room("Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 100 | hi! - hi! - hi! - hi! | Capacity: 0", (int) (short) 1, "Room hi! | hi! - hi! | Capacity: 0 - hi! - Room hi! | hi! - hi! | Capacity: 0 - hi!", "Room hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 1");
        boolean boolean5 = room4.isUnderMaintenance();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test19322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19322");
        room.Room room4 = new room.Room("", (int) (byte) 100, "Room hi! | hi! - hi! | Capacity: 0 - hi!", "");
        java.lang.String str5 = room4.getBuildingName();
        java.lang.String str6 = room4.getRoomNumber();
        room.SensorObserver sensorObserver7 = null;
        room4.removeObserver(sensorObserver7);
        java.lang.String str9 = room4.getFullLocation();
        java.lang.String str10 = room4.getFullLocation();
        java.lang.String str11 = room4.toString();
        boolean boolean12 = room4.isEnabled();
        room4.setUnderMaintenance(false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0 - hi!" + "'", str5, "Room hi! | hi! - hi! | Capacity: 0 - hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0 - hi! - " + "'", str9, "Room hi! | hi! - hi! | Capacity: 0 - hi! - ");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0 - hi! - " + "'", str10, "Room hi! | hi! - hi! | Capacity: 0 - hi! - ");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 100" + "'", str11, "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 100");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test19323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19323");
        room.Room room4 = new room.Room("", (int) (byte) 10, "Room  - Room hi! | hi! - hi! | Capacity: 0 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 0 - ", "");
        room4.setOccupied(true);
    }

    @Test
    public void test19324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19324");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        room.SensorObserver sensorObserver5 = null;
        room4.addObserver(sensorObserver5);
        boolean boolean7 = room4.isUnderMaintenance();
        java.lang.String str8 = room4.getRoomNumber();
        // The following exception was thrown during execution in test generation
        try {
            room4.setOccupied(true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test19325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19325");
        room.Room room4 = new room.Room("hi! - hi! - Room hi! | hi! - hi! | Capacity: 0", (int) (byte) 100, "Room Room hi! | hi! - hi! | Capacity: 0 - hi! |  - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 | Capacity: 1", " - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10");
        room.SensorObserver sensorObserver5 = null;
        room4.removeObserver(sensorObserver5);
        room4.setOccupied(true);
    }

    @Test
    public void test19326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19326");
        room.Room room4 = new room.Room("Room Room Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 100 | Room Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 100 - Room Room hi! | hi! - hi! | Capacity: 0 |  - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 0 | Capacity: 32", (int) (short) 10, "", "Room Room  - Room hi! | hi! - hi! | Capacity: 0 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 0 -  | hi! - hi! - hi! - hi! - Room hi! | hi! - hi! | Capacity: 0 - hi! - hi! - Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | hi! -  - Room  - Room hi! | hi! - hi! | Capacity: 0 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 0 | Capacity: 10 | Capacity: 97");
    }

    @Test
    public void test19327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19327");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        java.lang.String str5 = room4.getScannedID();
        room4.setScannedID("hi!");
        room4.setUnderMaintenance(true);
        room4.setOccupied(true);
        java.lang.String str12 = room4.getRoomID();
        room4.setEnabled(false);
        java.lang.String str15 = room4.getFullLocation();
        java.lang.String str16 = room4.getScannedID();
        java.lang.String str17 = room4.getRoomID();
        java.lang.String str18 = room4.getScannedID();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi! - hi!" + "'", str15, "hi! - hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test19328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19328");
        room.Room room4 = new room.Room("Room  | Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! | Capacity: 1", (int) 'a', "", "Room hi! - hi! - hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 1 | Capacity: 0");
        boolean boolean5 = room4.isEnabled();
        java.lang.String str6 = room4.getRoomID();
        room.SensorObserver sensorObserver7 = null;
        room4.addObserver(sensorObserver7);
        boolean boolean9 = room4.isUnderMaintenance();
        // The following exception was thrown during execution in test generation
        try {
            room4.setEnabled(false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Room  | Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! | Capacity: 1" + "'", str6, "Room  | Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! | Capacity: 1");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test19329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19329");
        room.Room room4 = new room.Room("Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10", 0, "hi!", "hi! - hi!");
        int int5 = room4.getCapacity();
        java.lang.String str6 = room4.getScannedID();
        java.lang.String str7 = room4.toString();
        java.lang.String str8 = room4.getFullLocation();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Room Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | hi! - hi! - hi! | Capacity: 0" + "'", str7, "Room Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | hi! - hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi! - hi! - hi!" + "'", str8, "hi! - hi! - hi!");
    }

    @Test
    public void test19330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19330");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        room.SensorObserver sensorObserver5 = null;
        room4.addObserver(sensorObserver5);
        room.SensorObserver sensorObserver7 = null;
        room4.addObserver(sensorObserver7);
        java.lang.String str9 = room4.getScannedID();
        java.lang.Class<?> wildcardClass10 = room4.getClass();
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test19331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19331");
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
        boolean boolean17 = room4.isEnabled();
        room.SensorObserver sensorObserver18 = null;
        room4.removeObserver(sensorObserver18);
        java.lang.String str20 = room4.getScannedID();
        java.lang.String str21 = room4.toString();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str21, "Room hi! | hi! - hi! | Capacity: 0");
    }

    @Test
    public void test19332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19332");
        room.Room room4 = new room.Room("hi!", (int) (byte) 1, "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10", "hi!");
        room4.notifyObservers();
        room4.setUnderMaintenance(false);
        room4.notifyObservers();
        java.lang.String str9 = room4.getRoomID();
        room4.setScannedID("Room  - Room hi! | hi! - hi! | Capacity: 0 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 0 - ");
        java.lang.String str12 = room4.getRoomID();
        boolean boolean13 = room4.isEnabled();
        java.lang.String str14 = room4.getBuildingName();
        room.SensorObserver sensorObserver15 = null;
        room4.addObserver(sensorObserver15);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10" + "'", str14, "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10");
    }

    @Test
    public void test19333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19333");
        room.Room room4 = new room.Room("Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  - Room hi! | hi! - hi! | Capacity: 0", 0, "Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 100 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: -1", "");
        int int5 = room4.getCapacity();
        java.lang.String str6 = room4.getScannedID();
        java.lang.String str7 = room4.getBuildingName();
        room4.setEnabled(false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 100 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: -1" + "'", str7, "Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 100 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: -1");
    }

    @Test
    public void test19334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19334");
        room.Room room4 = new room.Room("Room Room hi! | hi! - hi! | Capacity: 0 | Room hi! | hi! - hi! | Capacity: 0 - hi! - hi! | Capacity: 100", 52, "Room hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 1", "Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | hi! -  - Room  - Room hi! | hi! - hi! | Capacity: 0 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 0 | Capacity: 10");
        room4.setOccupied(false);
        boolean boolean7 = room4.isUnderMaintenance();
        boolean boolean8 = room4.isUnderMaintenance();
        room.SensorObserver sensorObserver9 = null;
        room4.removeObserver(sensorObserver9);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test19335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19335");
        room.Room room4 = new room.Room("hi!", 1, "Room hi! | hi! - hi! | Capacity: 0 - hi!", "Room hi! | hi! - hi! | Capacity: 0 - hi!");
        int int5 = room4.getCapacity();
        room4.setUnderMaintenance(false);
        java.lang.String str8 = room4.toString();
        int int9 = room4.getCapacity();
        room4.setScannedID("hi!");
        room4.setEnabled(true);
        room4.setOccupied(false);
        java.lang.String str16 = room4.toString();
        room.SensorObserver sensorObserver17 = null;
        room4.removeObserver(sensorObserver17);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Room hi! | Room hi! | hi! - hi! | Capacity: 0 - hi! - Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 1" + "'", str8, "Room hi! | Room hi! | hi! - hi! | Capacity: 0 - hi! - Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 1");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Room hi! | Room hi! | hi! - hi! | Capacity: 0 - hi! - Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 1" + "'", str16, "Room hi! | Room hi! | hi! - hi! | Capacity: 0 - hi! - Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 1");
    }

    @Test
    public void test19336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19336");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        room.SensorObserver sensorObserver5 = null;
        room4.addObserver(sensorObserver5);
        java.lang.String str7 = room4.getScannedID();
        boolean boolean8 = room4.isOccupied();
        java.lang.String str9 = room4.getScannedID();
        java.lang.String str10 = room4.getRoomID();
        room.SensorObserver sensorObserver11 = null;
        room4.removeObserver(sensorObserver11);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test19337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19337");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        java.lang.String str5 = room4.getScannedID();
        room4.setScannedID("hi!");
        boolean boolean8 = room4.isEnabled();
        int int9 = room4.getCapacity();
        boolean boolean10 = room4.isOccupied();
        java.lang.String str11 = room4.getRoomNumber();
        boolean boolean12 = room4.isOccupied();
        room4.setOccupied(true);
        room4.setEnabled(false);
        int int17 = room4.getCapacity();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test19338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19338");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        room.SensorObserver sensorObserver5 = null;
        room4.addObserver(sensorObserver5);
        java.lang.String str7 = room4.getScannedID();
        java.lang.String str8 = room4.getFullLocation();
        boolean boolean9 = room4.isOccupied();
        boolean boolean10 = room4.isUnderMaintenance();
        room.SensorObserver sensorObserver11 = null;
        room4.addObserver(sensorObserver11);
        java.lang.String str13 = room4.getBuildingName();
        java.lang.String str14 = room4.getRoomID();
        boolean boolean15 = room4.isEnabled();
        java.lang.String str16 = room4.getRoomID();
        boolean boolean17 = room4.isUnderMaintenance();
        java.lang.String str18 = room4.getRoomID();
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
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test19339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19339");
        room.Room room4 = new room.Room("Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 | Capacity: 0", 1, "Room hi! - hi! - hi! | hi! - hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 1", "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi!");
        java.lang.String str5 = room4.getBuildingName();
        room4.setScannedID("Room Room hi! | hi! - hi! | Capacity: 0 - hi! | Room  - Room hi! | hi! - hi! | Capacity: 0 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 0 - hi! | Capacity: 52");
        room4.setScannedID("hi! - Room  - Room hi! | hi! - hi! | Capacity: 0 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 0 - ");
        boolean boolean10 = room4.isUnderMaintenance();
        java.lang.String str11 = room4.getBuildingName();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Room hi! - hi! - hi! | hi! - hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 1" + "'", str5, "Room hi! - hi! - hi! | hi! - hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 1");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Room hi! - hi! - hi! | hi! - hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 1" + "'", str11, "Room hi! - hi! - hi! | hi! - hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 1");
    }

    @Test
    public void test19340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19340");
        room.Room room4 = new room.Room("Room Room hi! | hi! - hi! | Capacity: 0 | Room hi! | hi! - hi! | Capacity: 0 - hi! - hi! | Capacity: 100 - Room hi! | hi! - hi! | Capacity: 0 - hi! - ", 32, "Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! - Room Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 97 | Room hi! | hi! - hi! | Capacity: 0 - hi! -  - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 | Capacity: 100", "Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 | Room Room hi! | hi! - hi! | Capacity: 0 | Room hi! | hi! - hi! | Capacity: 0 - hi! - hi! | Capacity: 100 - hi! - hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 0");
    }

    @Test
    public void test19341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19341");
        room.Room room4 = new room.Room("hi!", (int) (byte) 100, "", "Room hi! | hi! - hi! | Capacity: 0");
        java.lang.String str5 = room4.toString();
        java.lang.String str6 = room4.getFullLocation();
        room4.setOccupied(false);
        room4.setEnabled(true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100" + "'", str5, "Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + " - Room hi! | hi! - hi! | Capacity: 0" + "'", str6, " - Room hi! | hi! - hi! | Capacity: 0");
    }

    @Test
    public void test19342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19342");
        room.Room room4 = new room.Room("Room hi! -  | Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 10 - hi! - hi! - hi! - hi!", 0, "Room Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | Room hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 1 - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! | Capacity: 97 - Room Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! |  - Room hi! | hi! - hi! | Capacity: 0 - Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: -1 | Capacity: 100", "Room  | Room Room hi! | hi! - hi! | Capacity: 0 - hi! | Room Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! - hi! - hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: -1 - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 | Capacity: 10 - Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | hi! - hi! - hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 0 - Room Room Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! |  - Room hi! | hi! - hi! | Capacity: 0 - Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: -1 | Room  - Room hi! | hi! - hi! | Capacity: 0 |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 0 - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! | Capacity: 97 | Capacity: 10");
        java.lang.String str5 = room4.getRoomNumber();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Room  | Room Room hi! | hi! - hi! | Capacity: 0 - hi! | Room Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! - hi! - hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: -1 - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 | Capacity: 10 - Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | hi! - hi! - hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 0 - Room Room Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! |  - Room hi! | hi! - hi! | Capacity: 0 - Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: -1 | Room  - Room hi! | hi! - hi! | Capacity: 0 |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 0 - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! | Capacity: 97 | Capacity: 10" + "'", str5, "Room  | Room Room hi! | hi! - hi! | Capacity: 0 - hi! | Room Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! - hi! - hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: -1 - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 | Capacity: 10 - Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | hi! - hi! - hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 0 - Room Room Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! |  - Room hi! | hi! - hi! | Capacity: 0 - Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: -1 | Room  - Room hi! | hi! - hi! | Capacity: 0 |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 0 - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! | Capacity: 97 | Capacity: 10");
    }

    @Test
    public void test19343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19343");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        boolean boolean5 = room4.isOccupied();
        room4.setEnabled(false);
        boolean boolean8 = room4.isUnderMaintenance();
        java.lang.String str9 = room4.getFullLocation();
        java.lang.String str10 = room4.getRoomNumber();
        room4.setUnderMaintenance(true);
        int int13 = room4.getCapacity();
        java.lang.Class<?> wildcardClass14 = room4.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi! - hi!" + "'", str9, "hi! - hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test19344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19344");
        room.Room room4 = new room.Room("Room Room hi! | hi! - hi! | Capacity: 0 | hi! - hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 97", 100, "hi! -  - Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 1", "Room Room hi! | hi! - hi! | Capacity: 0 - hi! | Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 100 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: -1 - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: -1");
        java.lang.String str5 = room4.toString();
        room4.setUnderMaintenance(false);
        java.lang.String str8 = room4.getFullLocation();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Room Room Room hi! | hi! - hi! | Capacity: 0 | hi! - hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 97 | hi! -  - Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 1 - Room Room hi! | hi! - hi! | Capacity: 0 - hi! | Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 100 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: -1 - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: -1 | Capacity: 100" + "'", str5, "Room Room Room hi! | hi! - hi! | Capacity: 0 | hi! - hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 97 | hi! -  - Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 1 - Room Room hi! | hi! - hi! | Capacity: 0 - hi! | Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 100 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: -1 - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: -1 | Capacity: 100");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi! -  - Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 1 - Room Room hi! | hi! - hi! | Capacity: 0 - hi! | Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 100 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: -1 - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: -1" + "'", str8, "hi! -  - Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 1 - Room Room hi! | hi! - hi! | Capacity: 0 - hi! | Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 100 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: -1 - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: -1");
    }

    @Test
    public void test19345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19345");
        room.Room room4 = new room.Room("hi! - hi! - Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100", (int) (short) 0, "Room hi! | hi! - hi! | Capacity: 0 - hi! - hi! - ", "Room hi! | Room hi! | hi! - hi! | Capacity: 0 - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 32");
        room4.setOccupied(true);
    }

    @Test
    public void test19346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19346");
        room.Room room4 = new room.Room("Room Room Room hi! | hi! - hi! | Capacity: 0 | Room hi! | hi! - hi! | Capacity: 0 - hi! - hi! | Capacity: 100 - hi! - hi! - Room hi! | hi! - hi! | Capacity: 0 | Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 | hi! - Room hi! | hi! - hi! | Capacity: 0 -  | Capacity: 52 - Room Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 97 | Room hi! | hi! - hi! | Capacity: 0 - hi! - hi! - Room hi! | Room hi! | hi! - hi! | Capacity: 0 - hi! - Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 1 | Capacity: 1 | Capacity: 0", (int) (byte) 0, "Room hi! - hi! - Room hi! | hi! - hi! | Capacity: 0 | hi! - hi! - Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 97 | Capacity: 10", "Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi!");
    }

    @Test
    public void test19347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19347");
        room.Room room4 = new room.Room("", (int) (short) 10, "Room hi! | hi! - hi! | Capacity: 0", "hi!");
        room.SensorObserver sensorObserver5 = null;
        room4.removeObserver(sensorObserver5);
        room.SensorObserver sensorObserver7 = null;
        room4.addObserver(sensorObserver7);
        java.lang.String str9 = room4.getScannedID();
        java.lang.String str10 = room4.toString();
        java.lang.String str11 = room4.getRoomNumber();
        java.lang.String str12 = room4.getRoomID();
        room.SensorObserver sensorObserver13 = null;
        room4.removeObserver(sensorObserver13);
        java.lang.String str15 = room4.toString();
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10" + "'", str10, "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10" + "'", str15, "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10");
    }

    @Test
    public void test19348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19348");
        room.Room room4 = new room.Room("Room Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 97 | Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 100 | hi! - hi! - hi! - hi! | Capacity: 0 -  - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! | Capacity: 0", (int) (short) 100, "Room hi! - hi! - Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | Room hi! | hi! - hi! | Capacity: 0 - hi! -  - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! | Capacity: -1", "hi! - hi! - Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 | Capacity: 0");
        boolean boolean5 = room4.isOccupied();
        room4.setUnderMaintenance(true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test19349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19349");
        room.Room room4 = new room.Room("hi!", (int) (short) 0, "hi! - hi!", "Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100");
        java.lang.String str5 = room4.getScannedID();
        java.lang.String str6 = room4.toString();
        room4.setUnderMaintenance(false);
        java.lang.String str9 = room4.getBuildingName();
        java.lang.String str10 = room4.getRoomNumber();
        room4.setUnderMaintenance(true);
        boolean boolean13 = room4.isOccupied();
        room4.setEnabled(true);
        room4.setEnabled(true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Room hi! | hi! - hi! - Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | Capacity: 0" + "'", str6, "Room hi! | hi! - hi! - Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi! - hi!" + "'", str9, "hi! - hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100" + "'", str10, "Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test19350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19350");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        java.lang.String str5 = room4.getScannedID();
        room4.setScannedID("hi!");
        room4.setScannedID("hi! - hi!");
        room4.setOccupied(true);
        room.SensorObserver sensorObserver12 = null;
        room4.removeObserver(sensorObserver12);
        room.SensorObserver sensorObserver14 = null;
        room4.addObserver(sensorObserver14);
        java.lang.String str16 = room4.getBuildingName();
        java.lang.String str17 = room4.getScannedID();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi! - hi!" + "'", str17, "hi! - hi!");
    }

    @Test
    public void test19351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19351");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        boolean boolean5 = room4.isEnabled();
        java.lang.String str6 = room4.getBuildingName();
        room.SensorObserver sensorObserver7 = null;
        room4.removeObserver(sensorObserver7);
        java.lang.String str9 = room4.getBuildingName();
        room4.setScannedID("hi! - hi!");
        room4.setEnabled(false);
        boolean boolean14 = room4.isOccupied();
        room4.setScannedID("Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 | hi! - hi! - Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 - Room hi! | hi! - hi! | Capacity: 0 - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 0");
        int int17 = room4.getCapacity();
        room.SensorObserver sensorObserver18 = null;
        room4.removeObserver(sensorObserver18);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test19352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19352");
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
        java.lang.String str15 = room4.getBuildingName();
        boolean boolean16 = room4.isUnderMaintenance();
        room.SensorObserver sensorObserver17 = null;
        room4.addObserver(sensorObserver17);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str7, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi! - hi!" + "'", str12, "hi! - hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str14, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test19353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19353");
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
        room.SensorObserver sensorObserver17 = null;
        room4.removeObserver(sensorObserver17);
        room4.setOccupied(true);
        java.lang.String str21 = room4.getRoomNumber();
        room4.setOccupied(false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi! - hi!" + "'", str12, "hi! - hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
    }

    @Test
    public void test19354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19354");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        java.lang.String str5 = room4.getScannedID();
        room4.setScannedID("hi!");
        room4.setUnderMaintenance(true);
        room.SensorObserver sensorObserver10 = null;
        room4.removeObserver(sensorObserver10);
        java.lang.String str12 = room4.getScannedID();
        room4.setScannedID("");
        room4.notifyObservers();
        int int16 = room4.getCapacity();
        java.lang.String str17 = room4.getRoomID();
        room4.setUnderMaintenance(false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test19355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19355");
        room.Room room4 = new room.Room("hi!", (int) (byte) 100, "", "Room hi! | hi! - hi! | Capacity: 0");
        room4.notifyObservers();
        room.SensorObserver sensorObserver6 = null;
        room4.removeObserver(sensorObserver6);
        java.lang.String str8 = room4.toString();
        room4.setUnderMaintenance(true);
        boolean boolean11 = room4.isUnderMaintenance();
        room4.setOccupied(false);
        java.lang.String str14 = room4.getScannedID();
        boolean boolean15 = room4.isEnabled();
        room4.setUnderMaintenance(false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100" + "'", str8, "Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test19356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19356");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        java.lang.String str5 = room4.getScannedID();
        room4.setScannedID("hi!");
        boolean boolean8 = room4.isEnabled();
        room4.setEnabled(false);
        room4.setScannedID("Room hi! | hi! - hi! | Capacity: 0 - hi! - ");
        java.lang.String str13 = room4.getRoomID();
        room4.setOccupied(false);
        java.lang.String str16 = room4.getBuildingName();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test19357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19357");
        room.Room room4 = new room.Room("Room  - hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Room Room  - Room hi! | hi! - hi! | Capacity: 0 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 0 | Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 - Room hi! | Room hi! | hi! - hi! | Capacity: 0 - hi! - Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 1 | Capacity: -1 - Room Room hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 1 | Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! - Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: -1 | Capacity: -1", 0, "Room Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 1 | Room hi! - hi! - Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | Room hi! | hi! - hi! | Capacity: 0 - hi! -  - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! | Capacity: -1 - hi! -  | Capacity: 0", "Room Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! -  | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | hi! - hi! | Capacity: 0 - Room Room hi! | hi! - hi! | Capacity: 0 | Room hi! | hi! - hi! | Capacity: 0 - hi! - hi! | Capacity: 100 - hi! - hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 52");
        room.SensorObserver sensorObserver5 = null;
        room4.removeObserver(sensorObserver5);
    }

    @Test
    public void test19358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19358");
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
        room4.setEnabled(true);
        room4.setUnderMaintenance(true);
        java.lang.Class<?> wildcardClass25 = room4.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test19359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19359");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        boolean boolean5 = room4.isOccupied();
        room4.setEnabled(false);
        java.lang.String str8 = room4.toString();
        boolean boolean9 = room4.isEnabled();
        boolean boolean10 = room4.isUnderMaintenance();
        room4.setUnderMaintenance(false);
        java.lang.String str13 = room4.toString();
        java.lang.String str14 = room4.getRoomID();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str8, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str13, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test19360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19360");
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
        room4.removeObserver(sensorObserver14);
        room4.setUnderMaintenance(false);
        room4.notifyObservers();
        boolean boolean19 = room4.isOccupied();
        boolean boolean20 = room4.isUnderMaintenance();
        room.SensorObserver sensorObserver21 = null;
        room4.removeObserver(sensorObserver21);
        java.lang.String str23 = room4.toString();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str7, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str23, "Room hi! | hi! - hi! | Capacity: 0");
    }

    @Test
    public void test19361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19361");
        room.Room room4 = new room.Room("Room hi! | Room hi! | hi! - hi! | Capacity: 0 - hi! - Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 1", (int) (byte) 10, "Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 97", "Room  - Room hi! | hi! - hi! | Capacity: 0 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 0");
        room.SensorObserver sensorObserver5 = null;
        room4.removeObserver(sensorObserver5);
        room4.setUnderMaintenance(true);
        room4.setUnderMaintenance(true);
        room.SensorObserver sensorObserver11 = null;
        room4.removeObserver(sensorObserver11);
    }

    @Test
    public void test19362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19362");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        room.SensorObserver sensorObserver5 = null;
        room4.addObserver(sensorObserver5);
        room.SensorObserver sensorObserver7 = null;
        room4.addObserver(sensorObserver7);
        java.lang.String str9 = room4.getFullLocation();
        int int10 = room4.getCapacity();
        room.SensorObserver sensorObserver11 = null;
        room4.addObserver(sensorObserver11);
        java.lang.String str13 = room4.getRoomID();
        room.SensorObserver sensorObserver14 = null;
        room4.addObserver(sensorObserver14);
        java.lang.String str16 = room4.getRoomID();
        boolean boolean17 = room4.isUnderMaintenance();
        java.lang.String str18 = room4.getRoomNumber();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi! - hi!" + "'", str9, "hi! - hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test19363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19363");
        room.Room room4 = new room.Room("Room Room Room hi! | hi! - hi! | Capacity: 0 | Room hi! | hi! - hi! | Capacity: 0 - hi! - hi! | Capacity: 100 |  - hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 10 - Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | hi! - hi! - hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 0", (int) (byte) -1, "Room hi! - hi! - hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 1 | Capacity: 0 - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10", "Room Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 97 | hi! -  - Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 1 - hi! | Capacity: 100");
    }

    @Test
    public void test19364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19364");
        room.Room room4 = new room.Room("Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 1", (int) ' ', "Room Room  - Room hi! | hi! - hi! | Capacity: 0 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 0 -  | Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! | Capacity: 32", "Room Room hi! | hi! - hi! | Capacity: 0 - hi! - hi! |  - Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | hi! - hi! - hi! | Capacity: 0 | Capacity: 52");
        boolean boolean5 = room4.isEnabled();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test19365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19365");
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
        java.lang.String str18 = room4.getRoomID();
        java.lang.String str19 = room4.toString();
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
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str14, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str19, "Room hi! | hi! - hi! | Capacity: 0");
    }

    @Test
    public void test19366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19366");
        room.Room room4 = new room.Room("hi!", (int) (byte) 100, "", "Room hi! | hi! - hi! | Capacity: 0");
        room4.setScannedID("");
        boolean boolean7 = room4.isOccupied();
        java.lang.String str8 = room4.getRoomID();
        room4.setOccupied(false);
        java.lang.String str11 = room4.getRoomID();
        boolean boolean12 = room4.isEnabled();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test19367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19367");
        room.Room room4 = new room.Room("Room hi! | hi! - hi! | Capacity: 0 - Room Room hi! - hi! - hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 1 | Capacity: 0 | Room hi! -  | Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 10 -  | Capacity: 52", (int) 'a', "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room hi! | hi! - hi! | Capacity: 0", "Room Room hi! | hi! - hi! - Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | Capacity: 0 | hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - Room  - Room hi! | hi! - hi! | Capacity: 0 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 0 | Capacity: 1");
    }

    @Test
    public void test19368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19368");
        room.Room room4 = new room.Room("Room hi! | hi! - hi! | Capacity: 0", (int) (byte) 100, "Room hi! | hi! - hi! | Capacity: 0 - hi!", "hi!");
        java.lang.String str5 = room4.getRoomID();
        room4.setEnabled(false);
        room.SensorObserver sensorObserver8 = null;
        room4.removeObserver(sensorObserver8);
        room.SensorObserver sensorObserver10 = null;
        room4.removeObserver(sensorObserver10);
        java.lang.String str12 = room4.getScannedID();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str5, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test19369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19369");
        room.Room room4 = new room.Room("", (int) (byte) 1, "Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10", "hi!");
        java.lang.String str5 = room4.getFullLocation();
        room4.setScannedID("Room hi! | hi! - hi! | Capacity: 0");
        room4.setEnabled(true);
        room.SensorObserver sensorObserver10 = null;
        room4.removeObserver(sensorObserver10);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi!" + "'", str5, "Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi!");
    }

    @Test
    public void test19370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19370");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        java.lang.String str5 = room4.getScannedID();
        room4.setScannedID("hi!");
        room4.setUnderMaintenance(true);
        room4.setOccupied(true);
        java.lang.String str12 = room4.getRoomID();
        java.lang.String str13 = room4.toString();
        java.lang.String str14 = room4.getBuildingName();
        java.lang.String str15 = room4.getRoomNumber();
        boolean boolean16 = room4.isOccupied();
        java.lang.String str17 = room4.getRoomID();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str13, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test19371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19371");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        java.lang.String str5 = room4.getScannedID();
        room4.setScannedID("hi!");
        boolean boolean8 = room4.isEnabled();
        int int9 = room4.getCapacity();
        boolean boolean10 = room4.isOccupied();
        java.lang.String str11 = room4.getRoomNumber();
        room4.setEnabled(false);
        java.lang.String str14 = room4.getRoomNumber();
        boolean boolean15 = room4.isUnderMaintenance();
        java.lang.String str16 = room4.toString();
        java.lang.String str17 = room4.getBuildingName();
        room4.setEnabled(true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str16, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test19372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19372");
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
        room4.removeObserver(sensorObserver17);
        room.SensorObserver sensorObserver19 = null;
        room4.removeObserver(sensorObserver19);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test19373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19373");
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
        room4.setScannedID("Room hi! - hi! - hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 1 | Capacity: 0");
        room4.setOccupied(true);
        boolean boolean20 = room4.isUnderMaintenance();
        java.lang.String str21 = room4.toString();
        room4.setEnabled(true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi! - hi!" + "'", str7, "hi! - hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str21, "Room hi! | hi! - hi! | Capacity: 0");
    }

    @Test
    public void test19374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19374");
        room.Room room4 = new room.Room("", (int) ' ', "Room hi! | hi! - hi! | Capacity: 0 - hi! - hi!", "Room Room hi! | hi! - hi! | Capacity: 0 | hi! - hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 97");
        room4.setScannedID("Room hi! | hi! - hi! | Capacity: 0 - hi!");
        java.lang.String str7 = room4.getRoomID();
        room4.setScannedID("Room  | Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! | Capacity: 1");
        java.lang.String str10 = room4.getRoomID();
        room4.setEnabled(false);
        room4.setEnabled(false);
        room4.setEnabled(false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test19375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19375");
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
        java.lang.String str15 = room4.getFullLocation();
        java.lang.String str16 = room4.getBuildingName();
        room4.setScannedID("Room hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 1");
        room.SensorObserver sensorObserver19 = null;
        room4.removeObserver(sensorObserver19);
        java.lang.Class<?> wildcardClass21 = room4.getClass();
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str11, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi! - hi!" + "'", str15, "hi! - hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test19376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19376");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        java.lang.String str5 = room4.getScannedID();
        room4.setScannedID("hi!");
        room4.setUnderMaintenance(true);
        boolean boolean10 = room4.isOccupied();
        java.lang.String str11 = room4.toString();
        java.lang.String str12 = room4.getRoomID();
        boolean boolean13 = room4.isUnderMaintenance();
        java.lang.String str14 = room4.toString();
        boolean boolean15 = room4.isOccupied();
        java.lang.String str16 = room4.toString();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str11, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str14, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str16, "Room hi! | hi! - hi! | Capacity: 0");
    }

    @Test
    public void test19377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19377");
        room.Room room4 = new room.Room("Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10", (-1), "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 100", "Room hi! | hi! - hi! | Capacity: 0 - hi! - ");
        room4.setUnderMaintenance(true);
        boolean boolean7 = room4.isUnderMaintenance();
        room.SensorObserver sensorObserver8 = null;
        room4.addObserver(sensorObserver8);
        java.lang.String str10 = room4.getRoomNumber();
        // The following exception was thrown during execution in test generation
        try {
            room4.notifyObservers();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0 - hi! - " + "'", str10, "Room hi! | hi! - hi! | Capacity: 0 - hi! - ");
    }

    @Test
    public void test19378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19378");
        room.Room room4 = new room.Room("hi!", (int) (byte) 100, "", "Room hi! | hi! - hi! | Capacity: 0");
        java.lang.String str5 = room4.getBuildingName();
        java.lang.String str6 = room4.toString();
        java.lang.String str7 = room4.getRoomNumber();
        java.lang.String str8 = room4.getFullLocation();
        java.lang.String str9 = room4.getRoomID();
        room.SensorObserver sensorObserver10 = null;
        room4.removeObserver(sensorObserver10);
        room4.setEnabled(true);
        java.lang.String str14 = room4.toString();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100" + "'", str6, "Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str7, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + " - Room hi! | hi! - hi! | Capacity: 0" + "'", str8, " - Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100" + "'", str14, "Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100");
    }

    @Test
    public void test19379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19379");
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
        int int21 = room4.getCapacity();
        room4.setScannedID("Room  - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! | Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 -  | Capacity: 100 - Room hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 1 - Room hi! | hi! - hi! - Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | Capacity: 0");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str15, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str18, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test19380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19380");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        java.lang.String str5 = room4.getScannedID();
        room4.setScannedID("hi!");
        java.lang.String str8 = room4.getScannedID();
        room4.setScannedID("Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100");
        room.SensorObserver sensorObserver11 = null;
        room4.removeObserver(sensorObserver11);
        java.lang.String str13 = room4.getRoomID();
        room.SensorObserver sensorObserver14 = null;
        room4.removeObserver(sensorObserver14);
        room4.notifyObservers();
        boolean boolean17 = room4.isEnabled();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test19381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19381");
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
        room4.setScannedID("Room hi! | hi! - hi! | Capacity: 0");
        boolean boolean22 = room4.isUnderMaintenance();
        room.SensorObserver sensorObserver23 = null;
        room4.removeObserver(sensorObserver23);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi! - hi!" + "'", str11, "hi! - hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str17, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str19, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test19382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19382");
        room.Room room4 = new room.Room("hi! - hi! - hi!", (int) (short) 0, "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10", "Room hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 1");
        java.lang.String str5 = room4.toString();
        java.lang.String str6 = room4.getBuildingName();
        java.lang.String str7 = room4.getRoomNumber();
        java.lang.String str8 = room4.getRoomID();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Room hi! - hi! - hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 1 | Capacity: 0" + "'", str5, "Room hi! - hi! - hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 1 | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10" + "'", str6, "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Room hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 1" + "'", str7, "Room hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 1");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi! - hi! - hi!" + "'", str8, "hi! - hi! - hi!");
    }

    @Test
    public void test19383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19383");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        java.lang.String str5 = room4.getScannedID();
        room4.setScannedID("hi!");
        java.lang.String str8 = room4.getBuildingName();
        room4.setEnabled(false);
        room4.notifyObservers();
        java.lang.String str12 = room4.getRoomID();
        boolean boolean13 = room4.isOccupied();
        java.lang.String str14 = room4.getScannedID();
        boolean boolean15 = room4.isEnabled();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test19384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19384");
        room.Room room4 = new room.Room("Room Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! - hi! - hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: -1", 100, "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10", "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10");
        java.lang.String str5 = room4.getBuildingName();
        boolean boolean6 = room4.isUnderMaintenance();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10" + "'", str5, "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test19385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19385");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        java.lang.String str5 = room4.getScannedID();
        room4.setScannedID("hi!");
        room4.setUnderMaintenance(true);
        room4.setOccupied(true);
        java.lang.String str12 = room4.getRoomID();
        java.lang.String str13 = room4.getBuildingName();
        boolean boolean14 = room4.isOccupied();
        room4.setEnabled(false);
        boolean boolean17 = room4.isUnderMaintenance();
        java.lang.Class<?> wildcardClass18 = room4.getClass();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test19386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19386");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        room.SensorObserver sensorObserver5 = null;
        room4.addObserver(sensorObserver5);
        java.lang.String str7 = room4.toString();
        room.SensorObserver sensorObserver8 = null;
        room4.addObserver(sensorObserver8);
        boolean boolean10 = room4.isOccupied();
        room.SensorObserver sensorObserver11 = null;
        room4.removeObserver(sensorObserver11);
        boolean boolean13 = room4.isEnabled();
        java.lang.String str14 = room4.getRoomID();
        // The following exception was thrown during execution in test generation
        try {
            room4.setUnderMaintenance(false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str7, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test19387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19387");
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
        java.lang.String str19 = room4.getFullLocation();
        int int20 = room4.getCapacity();
        java.lang.String str21 = room4.getRoomNumber();
        java.lang.String str22 = room4.getBuildingName();
        boolean boolean23 = room4.isEnabled();
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
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi! - hi!" + "'", str19, "hi! - hi!");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test19388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19388");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        room.SensorObserver sensorObserver5 = null;
        room4.addObserver(sensorObserver5);
        java.lang.String str7 = room4.getScannedID();
        java.lang.String str8 = room4.getFullLocation();
        boolean boolean9 = room4.isOccupied();
        boolean boolean10 = room4.isUnderMaintenance();
        int int11 = room4.getCapacity();
        java.lang.String str12 = room4.getRoomNumber();
        room.SensorObserver sensorObserver13 = null;
        room4.removeObserver(sensorObserver13);
        boolean boolean15 = room4.isUnderMaintenance();
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi! - hi!" + "'", str8, "hi! - hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test19389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19389");
        room.Room room4 = new room.Room("Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100", (int) (short) 1, "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi!", "Room hi! | hi! - hi! | Capacity: 0");
        int int5 = room4.getCapacity();
        room4.setUnderMaintenance(true);
        boolean boolean8 = room4.isOccupied();
        room.SensorObserver sensorObserver9 = null;
        room4.addObserver(sensorObserver9);
        java.lang.String str11 = room4.getScannedID();
        java.lang.String str12 = room4.getRoomID();
        // The following exception was thrown during execution in test generation
        try {
            room4.setEnabled(true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100" + "'", str12, "Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100");
    }

    @Test
    public void test19390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19390");
        room.Room room4 = new room.Room("hi!", (int) (byte) 100, "", "Room hi! | hi! - hi! | Capacity: 0");
        room4.notifyObservers();
        room.SensorObserver sensorObserver6 = null;
        room4.removeObserver(sensorObserver6);
        java.lang.String str8 = room4.getRoomNumber();
        room.SensorObserver sensorObserver9 = null;
        room4.removeObserver(sensorObserver9);
        boolean boolean11 = room4.isEnabled();
        java.lang.String str12 = room4.getRoomNumber();
        java.lang.String str13 = room4.toString();
        java.lang.String str14 = room4.getScannedID();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str8, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str12, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100" + "'", str13, "Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100");
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test19391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19391");
        room.Room room4 = new room.Room("", (int) (short) 10, "Room hi! | hi! - hi! | Capacity: 0", "hi!");
        room.SensorObserver sensorObserver5 = null;
        room4.removeObserver(sensorObserver5);
        room.SensorObserver sensorObserver7 = null;
        room4.addObserver(sensorObserver7);
        java.lang.String str9 = room4.getBuildingName();
        room.SensorObserver sensorObserver10 = null;
        room4.addObserver(sensorObserver10);
        boolean boolean12 = room4.isUnderMaintenance();
        java.lang.String str13 = room4.getScannedID();
        // The following exception was thrown during execution in test generation
        try {
            room4.setScannedID("Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str9, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test19392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19392");
        room.Room room4 = new room.Room("Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 | hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 0 - hi! - hi! - Room hi! | hi! - hi! | Capacity: 0 -  - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi!", 1, "Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 97 - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 100 - Room hi! | hi! - hi! | Capacity: 0 - hi! - ", "Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10");
        room.SensorObserver sensorObserver5 = null;
        room4.addObserver(sensorObserver5);
        java.lang.String str7 = room4.getScannedID();
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test19393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19393");
        room.Room room4 = new room.Room("Room Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 97 |  - Room hi! | hi! - hi! | Capacity: 0 - Room hi! | hi! - hi! | Capacity: 0 - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 35", (int) (short) 0, "Room Room hi! | hi! - hi! | Capacity: 0 - hi! |  - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 | Capacity: 1", "Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | hi! - hi! - hi! | Capacity: 0");
    }

    @Test
    public void test19394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19394");
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
        room.SensorObserver sensorObserver16 = null;
        room4.removeObserver(sensorObserver16);
        java.lang.String str18 = room4.getRoomID();
        java.lang.String str19 = room4.getFullLocation();
        boolean boolean20 = room4.isEnabled();
        room.SensorObserver sensorObserver21 = null;
        room4.removeObserver(sensorObserver21);
        java.lang.String str23 = room4.getFullLocation();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str7, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi! - hi!" + "'", str19, "hi! - hi!");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi! - hi!" + "'", str23, "hi! - hi!");
    }

    @Test
    public void test19395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19395");
        room.Room room4 = new room.Room("Room  - Room hi! | hi! - hi! | Capacity: 0 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 0 - hi!", (int) (short) 10, " - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi!", "Room  - Room hi! | hi! - hi! | Capacity: 0 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 0");
        room.SensorObserver sensorObserver5 = null;
        room4.removeObserver(sensorObserver5);
        room.SensorObserver sensorObserver7 = null;
        room4.addObserver(sensorObserver7);
    }

    @Test
    public void test19396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19396");
        room.Room room4 = new room.Room(" - Room hi! | hi! - hi! | Capacity: 0", 0, "", "Room hi! | hi! - hi! | Capacity: 0");
        room4.setOccupied(false);
        room.SensorObserver sensorObserver7 = null;
        room4.removeObserver(sensorObserver7);
        room4.setScannedID("");
        boolean boolean11 = room4.isUnderMaintenance();
        java.lang.String str12 = room4.getRoomNumber();
        java.lang.String str13 = room4.getRoomNumber();
        java.lang.String str14 = room4.getRoomNumber();
        java.lang.Class<?> wildcardClass15 = room4.getClass();
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str12, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str13, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str14, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test19397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19397");
        room.Room room4 = new room.Room("hi!", (int) (byte) 100, "", "Room hi! | hi! - hi! | Capacity: 0");
        java.lang.String str5 = room4.getScannedID();
        java.lang.String str6 = room4.getBuildingName();
        room4.setUnderMaintenance(false);
        room4.setEnabled(false);
        room4.notifyObservers();
        java.lang.String str12 = room4.getRoomID();
        room4.setScannedID("Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! - hi! - hi! - Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test19398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19398");
        room.Room room4 = new room.Room("hi! - hi! - Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100", (-1), "Room hi! | hi! - hi! | Capacity: 0 - hi!", " - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi!");
        java.lang.String str5 = room4.getBuildingName();
        boolean boolean6 = room4.isOccupied();
        boolean boolean7 = room4.isOccupied();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0 - hi!" + "'", str5, "Room hi! | hi! - hi! | Capacity: 0 - hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test19399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19399");
        room.Room room4 = new room.Room(" - Room hi! | hi! - hi! | Capacity: 0", 0, "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10", "Room hi! | hi! - hi! | Capacity: 0 - hi! - ");
        room4.setScannedID("Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 100 | hi! - hi! - hi! - hi! | Capacity: 0");
        java.lang.String str7 = room4.toString();
        boolean boolean8 = room4.isUnderMaintenance();
        boolean boolean9 = room4.isOccupied();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Room  - Room hi! | hi! - hi! | Capacity: 0 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 0" + "'", str7, "Room  - Room hi! | hi! - hi! | Capacity: 0 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 0");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test19400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19400");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        boolean boolean5 = room4.isOccupied();
        room4.setEnabled(false);
        java.lang.String str8 = room4.getFullLocation();
        java.lang.String str9 = room4.getScannedID();
        room4.setOccupied(true);
        room4.notifyObservers();
        boolean boolean13 = room4.isUnderMaintenance();
        boolean boolean14 = room4.isEnabled();
        room4.setScannedID("Room hi! | Room hi! | hi! - hi! | Capacity: 0 - hi! - Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 1 - Room hi! | hi! - hi! | Capacity: 0 - hi! - ");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi! - hi!" + "'", str8, "hi! - hi!");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test19401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19401");
        room.Room room4 = new room.Room("Room  | Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! | Capacity: 1", (int) 'a', "", "Room hi! - hi! - hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 1 | Capacity: 0");
        java.lang.String str5 = room4.getFullLocation();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + " - Room hi! - hi! - hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 1 | Capacity: 0" + "'", str5, " - Room hi! - hi! - hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 1 | Capacity: 0");
    }

    @Test
    public void test19402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19402");
        room.Room room4 = new room.Room("", (int) ' ', "Room Room Room hi! | hi! - hi! | Capacity: 0 | Room hi! | hi! - hi! | Capacity: 0 - hi! - hi! | Capacity: 100 |  - hi! - hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: -1", "Room hi! | hi! - hi! | Capacity: 0 - hi! -  - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room hi! | hi! - hi! | Capacity: 0");
        room4.setEnabled(true);
    }

    @Test
    public void test19403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19403");
        room.Room room4 = new room.Room("hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 100 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  - Room Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! | Room  - Room hi! | hi! - hi! | Capacity: 0 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 0 - Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 97 | Capacity: 0", 32, "Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 | hi! - Room hi! | hi! - hi! | Capacity: 0 -  | Capacity: 52", "Room hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 32");
    }

    @Test
    public void test19404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19404");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        room.SensorObserver sensorObserver5 = null;
        room4.addObserver(sensorObserver5);
        java.lang.String str7 = room4.getScannedID();
        room.SensorObserver sensorObserver8 = null;
        room4.removeObserver(sensorObserver8);
        java.lang.String str10 = room4.getRoomNumber();
        java.lang.String str11 = room4.getBuildingName();
        boolean boolean12 = room4.isOccupied();
        java.lang.String str13 = room4.getBuildingName();
        boolean boolean14 = room4.isEnabled();
        room4.setScannedID("Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 97");
        int int17 = room4.getCapacity();
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test19405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19405");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        java.lang.String str5 = room4.getScannedID();
        room4.setScannedID("hi!");
        boolean boolean8 = room4.isEnabled();
        room4.setEnabled(false);
        room4.setScannedID("Room hi! | hi! - hi! | Capacity: 0 - hi! - ");
        int int13 = room4.getCapacity();
        boolean boolean14 = room4.isEnabled();
        room4.setScannedID("Room Room hi! | hi! - hi! | Capacity: 0 - hi! - hi! | Room Room hi! | hi! - hi! | Capacity: 0 | Room hi! | hi! - hi! | Capacity: 0 - hi! - hi! | Capacity: 100 - Room  - Room hi! | hi! - hi! | Capacity: 0 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 0 | Capacity: 10");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test19406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19406");
        room.Room room4 = new room.Room("hi! - ", 10, "Room Room hi! | hi! - hi! | Capacity: 0 | Room hi! | hi! - hi! | Capacity: 0 - hi! - hi! | Capacity: 100", "");
        java.lang.String str5 = room4.getRoomNumber();
        boolean boolean6 = room4.isOccupied();
        boolean boolean7 = room4.isUnderMaintenance();
        java.lang.String str8 = room4.toString();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Room hi! -  | Room Room hi! | hi! - hi! | Capacity: 0 | Room hi! | hi! - hi! | Capacity: 0 - hi! - hi! | Capacity: 100 -  | Capacity: 10" + "'", str8, "Room hi! -  | Room Room hi! | hi! - hi! | Capacity: 0 | Room hi! | hi! - hi! | Capacity: 0 - hi! - hi! | Capacity: 100 -  | Capacity: 10");
    }

    @Test
    public void test19407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19407");
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
        java.lang.String str18 = room4.getFullLocation();
        java.lang.String str19 = room4.getFullLocation();
        java.lang.String str20 = room4.getFullLocation();
        boolean boolean21 = room4.isEnabled();
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str11, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi! - hi!" + "'", str18, "hi! - hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi! - hi!" + "'", str19, "hi! - hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi! - hi!" + "'", str20, "hi! - hi!");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test19408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19408");
        room.Room room4 = new room.Room("hi!", (int) (byte) 100, "", "Room hi! | hi! - hi! | Capacity: 0");
        room4.setScannedID("");
        java.lang.String str7 = room4.getFullLocation();
        room.SensorObserver sensorObserver8 = null;
        room4.addObserver(sensorObserver8);
        boolean boolean10 = room4.isEnabled();
        java.lang.String str11 = room4.getFullLocation();
        java.lang.Class<?> wildcardClass12 = room4.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + " - Room hi! | hi! - hi! | Capacity: 0" + "'", str7, " - Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + " - Room hi! | hi! - hi! | Capacity: 0" + "'", str11, " - Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test19409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19409");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        java.lang.String str5 = room4.getScannedID();
        room4.setScannedID("hi!");
        room4.setUnderMaintenance(true);
        room.SensorObserver sensorObserver10 = null;
        room4.removeObserver(sensorObserver10);
        java.lang.String str12 = room4.getScannedID();
        int int13 = room4.getCapacity();
        boolean boolean14 = room4.isEnabled();
        java.lang.String str15 = room4.getRoomNumber();
        room.SensorObserver sensorObserver16 = null;
        room4.addObserver(sensorObserver16);
        java.lang.String str18 = room4.getRoomID();
        room.SensorObserver sensorObserver19 = null;
        room4.removeObserver(sensorObserver19);
        room.SensorObserver sensorObserver21 = null;
        room4.removeObserver(sensorObserver21);
        boolean boolean23 = room4.isEnabled();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test19410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19410");
        room.Room room4 = new room.Room("Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100", (int) (short) 1, "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi!", "Room hi! | hi! - hi! | Capacity: 0");
        room4.notifyObservers();
        room4.setEnabled(false);
        room4.setOccupied(false);
        room4.setOccupied(false);
        java.lang.String str12 = room4.getRoomID();
        int int13 = room4.getCapacity();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100" + "'", str12, "Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test19411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19411");
        room.Room room4 = new room.Room("Room hi! | hi! - hi! | Capacity: 0 - hi!", (int) (short) 100, "hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10", "hi! - hi!");
        room.SensorObserver sensorObserver5 = null;
        room4.removeObserver(sensorObserver5);
        room.SensorObserver sensorObserver7 = null;
        room4.addObserver(sensorObserver7);
    }

    @Test
    public void test19412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19412");
        room.Room room4 = new room.Room("hi!", (int) (byte) 100, "", "Room hi! | hi! - hi! | Capacity: 0");
        java.lang.String str5 = room4.getScannedID();
        java.lang.String str6 = room4.getBuildingName();
        boolean boolean7 = room4.isOccupied();
        java.lang.String str8 = room4.getFullLocation();
        java.lang.String str9 = room4.getScannedID();
        room4.setScannedID("Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! - hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 97 | Capacity: 32 |  - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! - Room hi! | Room hi! | hi! - hi! | Capacity: 0 - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 32 | Capacity: -1");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + " - Room hi! | hi! - hi! | Capacity: 0" + "'", str8, " - Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test19413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19413");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        java.lang.String str5 = room4.getScannedID();
        room4.setScannedID("hi!");
        boolean boolean8 = room4.isEnabled();
        int int9 = room4.getCapacity();
        boolean boolean10 = room4.isOccupied();
        java.lang.String str11 = room4.getRoomNumber();
        boolean boolean12 = room4.isOccupied();
        java.lang.String str13 = room4.toString();
        java.lang.String str14 = room4.getBuildingName();
        room4.setEnabled(true);
        boolean boolean17 = room4.isUnderMaintenance();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str13, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test19414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19414");
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
        room4.notifyObservers();
        boolean boolean20 = room4.isUnderMaintenance();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10" + "'", str5, "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test19415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19415");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        java.lang.String str5 = room4.getScannedID();
        room4.setScannedID("hi!");
        room4.setUnderMaintenance(true);
        java.lang.String str10 = room4.getFullLocation();
        java.lang.String str11 = room4.getScannedID();
        room4.setOccupied(true);
        room4.setUnderMaintenance(false);
        java.lang.String str16 = room4.toString();
        java.lang.String str17 = room4.getFullLocation();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi! - hi!" + "'", str10, "hi! - hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str16, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi! - hi!" + "'", str17, "hi! - hi!");
    }

    @Test
    public void test19416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19416");
        room.Room room4 = new room.Room("Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 97 - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 100 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  - hi! - hi! - ", (int) '4', "Room  |  - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: -1", "Room Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! - hi! - hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: -1 - Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 | Room Room hi! | hi! - hi! | Capacity: 0 | Room hi! | hi! - hi! | Capacity: 0 - hi! - hi! | Capacity: 100 - hi! - hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 0");
        boolean boolean5 = room4.isOccupied();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test19417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19417");
        room.Room room4 = new room.Room("Room hi! - hi! - hi! | hi! - hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 1 - Room hi! - hi! - hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 1 | Capacity: 0", 0, "Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! -  - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10", "Room  - Room hi! | hi! - hi! | Capacity: 0 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 0 - ");
    }

    @Test
    public void test19418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19418");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        room.SensorObserver sensorObserver5 = null;
        room4.addObserver(sensorObserver5);
        java.lang.String str7 = room4.getFullLocation();
        boolean boolean8 = room4.isUnderMaintenance();
        boolean boolean9 = room4.isUnderMaintenance();
        room.SensorObserver sensorObserver10 = null;
        room4.removeObserver(sensorObserver10);
        java.lang.String str12 = room4.getScannedID();
        java.lang.String str13 = room4.getBuildingName();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi! - hi!" + "'", str7, "hi! - hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test19419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19419");
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
        room4.setUnderMaintenance(false);
        room4.setOccupied(true);
        room.SensorObserver sensorObserver19 = null;
        room4.removeObserver(sensorObserver19);
        room4.setEnabled(false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi!" + "'", str6, "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi!");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Room hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 1" + "'", str12, "Room hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 1");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test19420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19420");
        room.Room room4 = new room.Room("hi! - hi! - hi!", 1, "hi! - hi!", "Room hi! | hi! - hi! | Capacity: 0");
        room4.setScannedID("hi!");
        room.SensorObserver sensorObserver7 = null;
        room4.addObserver(sensorObserver7);
        boolean boolean9 = room4.isUnderMaintenance();
        boolean boolean10 = room4.isUnderMaintenance();
        // The following exception was thrown during execution in test generation
        try {
            room4.setScannedID("hi! - hi! - Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 97");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test19421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19421");
        room.Room room4 = new room.Room("hi!", (int) (byte) 100, "", "Room hi! | hi! - hi! | Capacity: 0");
        room4.notifyObservers();
        room.SensorObserver sensorObserver6 = null;
        room4.removeObserver(sensorObserver6);
        int int8 = room4.getCapacity();
        room4.setOccupied(true);
        boolean boolean11 = room4.isOccupied();
        boolean boolean12 = room4.isOccupied();
        room4.setScannedID("Room Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | hi! -  - Room  - Room hi! | hi! - hi! | Capacity: 0 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 0 - Room  - Room hi! | hi! - hi! | Capacity: 0 | Room Room hi! | hi! - hi! | Capacity: 0 | hi! - hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 97 - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! | Capacity: 52 | Capacity: 100");
        room4.setScannedID("Room hi! | hi! - Room hi! | hi! - hi! | Capacity: 0 - Room hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 1 - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! | Capacity: 1");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test19422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19422");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        java.lang.String str5 = room4.getBuildingName();
        java.lang.String str6 = room4.getRoomID();
        room4.setUnderMaintenance(false);
        int int9 = room4.getCapacity();
        room.SensorObserver sensorObserver10 = null;
        room4.removeObserver(sensorObserver10);
        boolean boolean12 = room4.isOccupied();
        room4.setUnderMaintenance(false);
        java.lang.String str15 = room4.getRoomID();
        java.lang.String str16 = room4.getRoomID();
        room4.setUnderMaintenance(true);
        room.SensorObserver sensorObserver19 = null;
        room4.removeObserver(sensorObserver19);
        room4.setEnabled(true);
        room4.notifyObservers();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test19423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19423");
        room.Room room4 = new room.Room("", (int) (byte) -1, "Room Room  - Room hi! | hi! - hi! | Capacity: 0 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 0 | hi! - hi! - Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 -  - hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 0", "");
        int int5 = room4.getCapacity();
        room.SensorObserver sensorObserver6 = null;
        room4.addObserver(sensorObserver6);
        java.lang.String str8 = room4.getRoomID();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test19424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19424");
        room.Room room4 = new room.Room("Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10", 0, "hi!", "Room hi! | hi! - hi! | Capacity: 0");
        int int5 = room4.getCapacity();
        java.lang.String str6 = room4.getBuildingName();
        room4.setScannedID("Room  - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! | Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 100 | hi! - hi! - hi! - hi! | Capacity: 0 - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 0");
        room.SensorObserver sensorObserver9 = null;
        room4.addObserver(sensorObserver9);
        java.lang.String str11 = room4.getScannedID();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Room  - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! | Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 100 | hi! - hi! - hi! - hi! | Capacity: 0 - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 0" + "'", str11, "Room  - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! | Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 100 | hi! - hi! - hi! - hi! | Capacity: 0 - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 0");
    }

    @Test
    public void test19425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19425");
        room.Room room4 = new room.Room("Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - hi! - hi!", 0, "Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 | hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 0 - Room hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 1 - Room Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! | Room  - Room hi! | hi! - hi! | Capacity: 0 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 0 - Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 97 | Capacity: 0", "Room  | Room Room Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! - hi! - hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: -1 | Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 1 - Room hi! | hi! - hi! | Capacity: 0 - hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! - hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 97 | Capacity: 0 - hi! - hi! | Capacity: -1");
    }

    @Test
    public void test19426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19426");
        room.Room room4 = new room.Room("Room Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! - hi! - hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: -1 - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10", (int) (byte) 10, "Room  - Room hi! | hi! - hi! | Capacity: 0 |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 0", "Room Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 97 | Room hi! | hi! - hi! | Capacity: 0 - hi! - hi! - Room hi! | Room hi! | hi! - hi! | Capacity: 0 - hi! - Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 1 | Capacity: 1");
        boolean boolean5 = room4.isEnabled();
        boolean boolean6 = room4.isEnabled();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test19427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19427");
        room.Room room4 = new room.Room("Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10", 0, "Room Room hi! | hi! - hi! | Capacity: 0 | Room hi! | hi! - hi! | Capacity: 0 - hi! - hi! | Capacity: 100", "hi! - hi! - Room hi! | hi! - hi! | Capacity: 0");
        room.SensorObserver sensorObserver5 = null;
        room4.addObserver(sensorObserver5);
        java.lang.String str7 = room4.getScannedID();
        room.SensorObserver sensorObserver8 = null;
        room4.addObserver(sensorObserver8);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test19428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19428");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        java.lang.String str5 = room4.getBuildingName();
        java.lang.String str6 = room4.getRoomID();
        java.lang.String str7 = room4.getScannedID();
        room4.setEnabled(false);
        room4.notifyObservers();
        room.SensorObserver sensorObserver11 = null;
        room4.removeObserver(sensorObserver11);
        boolean boolean13 = room4.isUnderMaintenance();
        room4.notifyObservers();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test19429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19429");
        room.Room room4 = new room.Room("Room hi! | hi! - hi! | Capacity: 0 - hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 |  - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 0", 0, "Room Room hi! | hi! - hi! - Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | Capacity: 0 | hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - Room  - Room hi! | hi! - hi! | Capacity: 0 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 0 | Capacity: 1", "Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 100 | hi! - hi! - hi! - hi! | Capacity: 0 - Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 1");
        java.lang.String str5 = room4.getRoomNumber();
        boolean boolean6 = room4.isEnabled();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 100 | hi! - hi! - hi! - hi! | Capacity: 0 - Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 1" + "'", str5, "Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 100 | hi! - hi! - hi! - hi! | Capacity: 0 - Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 1");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test19430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19430");
        room.Room room4 = new room.Room("Room hi! | Room hi! | hi! - hi! | Capacity: 0 - hi! - Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 1", 100, "Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 | hi! - Room hi! | hi! - hi! | Capacity: 0 - Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 97 | Capacity: 35", "Room Room hi! | hi! - hi! | Capacity: 0 - hi! | Room  - Room hi! | hi! - hi! | Capacity: 0 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 0 - hi! | Capacity: 52");
        boolean boolean5 = room4.isOccupied();
        java.lang.String str6 = room4.getRoomID();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Room hi! | Room hi! | hi! - hi! | Capacity: 0 - hi! - Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 1" + "'", str6, "Room hi! | Room hi! | hi! - hi! | Capacity: 0 - hi! - Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 1");
    }

    @Test
    public void test19431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19431");
        room.Room room4 = new room.Room("hi!", (int) (byte) 100, "", "Room hi! | hi! - hi! | Capacity: 0");
        java.lang.String str5 = room4.getScannedID();
        boolean boolean6 = room4.isEnabled();
        java.lang.String str7 = room4.getRoomID();
        room4.setScannedID("Room hi! | hi! - hi! | Capacity: 0 - hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 100 - Room hi! | hi! - hi! | Capacity: 0 - hi! - ");
        java.lang.String str10 = room4.getFullLocation();
        java.lang.String str11 = room4.getScannedID();
        room4.setOccupied(true);
        room.SensorObserver sensorObserver14 = null;
        room4.addObserver(sensorObserver14);
        java.lang.Class<?> wildcardClass16 = room4.getClass();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + " - Room hi! | hi! - hi! | Capacity: 0" + "'", str10, " - Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0 - hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 100 - Room hi! | hi! - hi! | Capacity: 0 - hi! - " + "'", str11, "Room hi! | hi! - hi! | Capacity: 0 - hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 100 - Room hi! | hi! - hi! | Capacity: 0 - hi! - ");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test19432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19432");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        room.SensorObserver sensorObserver5 = null;
        room4.addObserver(sensorObserver5);
        java.lang.String str7 = room4.toString();
        room.SensorObserver sensorObserver8 = null;
        room4.removeObserver(sensorObserver8);
        java.lang.String str10 = room4.toString();
        java.lang.String str11 = room4.getRoomID();
        room4.setUnderMaintenance(false);
        room.SensorObserver sensorObserver14 = null;
        room4.addObserver(sensorObserver14);
        java.lang.String str16 = room4.getBuildingName();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str7, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str10, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test19433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19433");
        room.Room room4 = new room.Room("Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 100", 0, "hi! - hi! - hi!", "hi!");
        room4.setEnabled(true);
        boolean boolean7 = room4.isUnderMaintenance();
        java.lang.String str8 = room4.getRoomNumber();
        room4.setUnderMaintenance(false);
        java.lang.String str11 = room4.getRoomNumber();
        room.SensorObserver sensorObserver12 = null;
        room4.removeObserver(sensorObserver12);
        room4.setUnderMaintenance(false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test19434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19434");
        room.Room room4 = new room.Room("", (int) ' ', "Room hi! | hi! - hi! | Capacity: 0 - hi! - hi!", "Room Room hi! | hi! - hi! | Capacity: 0 | hi! - hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 97");
        room4.setScannedID("Room hi! | hi! - hi! | Capacity: 0 - hi!");
        java.lang.String str7 = room4.getRoomID();
        boolean boolean8 = room4.isOccupied();
        java.lang.String str9 = room4.getScannedID();
        java.lang.String str10 = room4.getScannedID();
        java.lang.String str11 = room4.getFullLocation();
        room4.setEnabled(false);
        java.lang.Class<?> wildcardClass14 = room4.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0 - hi!" + "'", str9, "Room hi! | hi! - hi! | Capacity: 0 - hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0 - hi!" + "'", str10, "Room hi! | hi! - hi! | Capacity: 0 - hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0 - hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! - hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 97" + "'", str11, "Room hi! | hi! - hi! | Capacity: 0 - hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! - hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 97");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test19435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19435");
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
        java.lang.String str20 = room4.getScannedID();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test19436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19436");
        room.Room room4 = new room.Room("Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 100 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10", (int) (byte) 100, "Room hi! - hi! - Room hi! | hi! - hi! | Capacity: 0 | hi! - hi! - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 1 - Room hi! | hi! - hi! | Capacity: 0 - hi! - Room hi! | hi! - hi! | Capacity: 0 - hi!", "hi! - hi! - Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 97 - Room Room hi! | hi! - hi! | Capacity: 0 - hi! - hi! |  - Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | hi! - hi! - hi! | Capacity: 0 | Capacity: 52");
    }

    @Test
    public void test19437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19437");
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
        java.lang.String str15 = room4.getScannedID();
        room4.setUnderMaintenance(false);
        java.lang.String str18 = room4.getFullLocation();
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi! - hi!" + "'", str18, "hi! - hi!");
    }

    @Test
    public void test19438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19438");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        room.SensorObserver sensorObserver5 = null;
        room4.addObserver(sensorObserver5);
        java.lang.String str7 = room4.getScannedID();
        java.lang.String str8 = room4.getRoomNumber();
        java.lang.String str9 = room4.getRoomNumber();
        room.SensorObserver sensorObserver10 = null;
        room4.removeObserver(sensorObserver10);
        room4.setOccupied(false);
        room4.setUnderMaintenance(false);
        room4.setOccupied(true);
        room4.setUnderMaintenance(true);
        java.lang.String str20 = room4.getBuildingName();
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test19439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19439");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        java.lang.String str5 = room4.getScannedID();
        room4.setScannedID("hi!");
        boolean boolean8 = room4.isEnabled();
        room4.setEnabled(false);
        room.SensorObserver sensorObserver11 = null;
        room4.removeObserver(sensorObserver11);
        java.lang.String str13 = room4.getScannedID();
        room4.setScannedID(" - hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10");
        java.lang.String str16 = room4.getScannedID();
        boolean boolean17 = room4.isEnabled();
        room4.setEnabled(true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + " - hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10" + "'", str16, " - hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test19440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19440");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        java.lang.String str5 = room4.getScannedID();
        room4.setScannedID("hi!");
        room4.setUnderMaintenance(true);
        java.lang.String str10 = room4.getScannedID();
        java.lang.String str11 = room4.getScannedID();
        room4.setOccupied(true);
        java.lang.String str14 = room4.getFullLocation();
        java.lang.String str15 = room4.getRoomID();
        room4.setOccupied(true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi! - hi!" + "'", str14, "hi! - hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test19441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19441");
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
        java.lang.String str19 = room4.getScannedID();
        room4.setEnabled(false);
        java.lang.String str22 = room4.getFullLocation();
        java.lang.String str23 = room4.getRoomNumber();
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str11, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0 - hi!" + "'", str19, "Room hi! | hi! - hi! | Capacity: 0 - hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi! - hi!" + "'", str22, "hi! - hi!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
    }

    @Test
    public void test19442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19442");
        room.Room room4 = new room.Room("", (int) (byte) 1, "Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10", "hi!");
        java.lang.String str5 = room4.getFullLocation();
        room4.setScannedID("Room hi! | hi! - hi! | Capacity: 0");
        java.lang.String str8 = room4.getFullLocation();
        java.lang.String str9 = room4.getRoomID();
        java.lang.String str10 = room4.getScannedID();
        room.SensorObserver sensorObserver11 = null;
        room4.removeObserver(sensorObserver11);
        java.lang.String str13 = room4.getScannedID();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi!" + "'", str5, "Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi!" + "'", str8, "Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str10, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str13, "Room hi! | hi! - hi! | Capacity: 0");
    }

    @Test
    public void test19443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19443");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        room.SensorObserver sensorObserver5 = null;
        room4.addObserver(sensorObserver5);
        java.lang.String str7 = room4.toString();
        room.SensorObserver sensorObserver8 = null;
        room4.removeObserver(sensorObserver8);
        java.lang.String str10 = room4.toString();
        java.lang.String str11 = room4.getBuildingName();
        room4.setUnderMaintenance(false);
        room4.setOccupied(true);
        java.lang.String str16 = room4.getRoomNumber();
        boolean boolean17 = room4.isOccupied();
        room4.setUnderMaintenance(true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str7, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str10, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test19444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19444");
        room.Room room4 = new room.Room("", (int) (short) 10, "Room hi! | hi! - hi! | Capacity: 0", "hi!");
        room.SensorObserver sensorObserver5 = null;
        room4.removeObserver(sensorObserver5);
        room.SensorObserver sensorObserver7 = null;
        room4.addObserver(sensorObserver7);
        java.lang.String str9 = room4.getScannedID();
        java.lang.String str10 = room4.toString();
        // The following exception was thrown during execution in test generation
        try {
            room4.setEnabled(true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10" + "'", str10, "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10");
    }

    @Test
    public void test19445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19445");
        room.Room room4 = new room.Room("hi! - hi! - Room hi! | hi! - hi! | Capacity: 0", 10, "hi! - hi!", "Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 97");
        room4.setScannedID("Room hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 1");
        boolean boolean7 = room4.isOccupied();
        java.lang.String str8 = room4.getFullLocation();
        room4.setEnabled(true);
        java.lang.String str11 = room4.toString();
        boolean boolean12 = room4.isUnderMaintenance();
        boolean boolean13 = room4.isUnderMaintenance();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi! - hi! - Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 97" + "'", str8, "hi! - hi! - Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 97");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Room hi! - hi! - Room hi! | hi! - hi! | Capacity: 0 | hi! - hi! - Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 97 | Capacity: 10" + "'", str11, "Room hi! - hi! - Room hi! | hi! - hi! | Capacity: 0 | hi! - hi! - Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 97 | Capacity: 10");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test19446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19446");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        boolean boolean5 = room4.isOccupied();
        room4.setEnabled(false);
        room4.setUnderMaintenance(false);
        java.lang.String str10 = room4.getScannedID();
        java.lang.String str11 = room4.getBuildingName();
        room4.setOccupied(true);
        java.lang.String str14 = room4.getRoomID();
        room4.notifyObservers();
        room4.setEnabled(true);
        java.lang.String str18 = room4.getFullLocation();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi! - hi!" + "'", str18, "hi! - hi!");
    }

    @Test
    public void test19447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19447");
        room.Room room4 = new room.Room("Room Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 1 - Room hi! | hi! - hi! | Capacity: 0 - hi! |  -  | Capacity: 35", 35, "Room Room Room hi! | hi! - hi! | Capacity: 0 | Room hi! | hi! - hi! | Capacity: 0 - hi! - hi! | Capacity: 100 - Room  - Room hi! | hi! - hi! | Capacity: 0 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 0 | Room hi! | hi! - hi! - Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | Capacity: 0 - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! | Capacity: 52", "Room Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 1 | Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 0");
    }

    @Test
    public void test19448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19448");
        room.Room room4 = new room.Room("Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 | hi! - Room hi! | hi! - hi! | Capacity: 0 -  | Capacity: 52", 52, "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10", "Room Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 97 | Room hi! | hi! - hi! | Capacity: 0 - hi! - hi! - Room hi! | Room hi! | hi! - hi! | Capacity: 0 - hi! - Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 1 | Capacity: 1");
        boolean boolean5 = room4.isUnderMaintenance();
        java.lang.Class<?> wildcardClass6 = room4.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test19449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19449");
        room.Room room4 = new room.Room("Room hi! | hi! - hi! | Capacity: 0 - hi! - Room hi! | hi! - hi! | Capacity: 0 - hi!", (int) (byte) -1, "Room hi! | Room hi! | hi! - hi! | Capacity: 0 - hi! - Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 1", "Room hi! | hi! - hi! | Capacity: 0");
        java.lang.String str5 = room4.getRoomID();
        room4.setEnabled(true);
        java.lang.String str8 = room4.getScannedID();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0 - hi! - Room hi! | hi! - hi! | Capacity: 0 - hi!" + "'", str5, "Room hi! | hi! - hi! | Capacity: 0 - hi! - Room hi! | hi! - hi! | Capacity: 0 - hi!");
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test19450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19450");
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
        room4.setScannedID("");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi! - hi!" + "'", str15, "hi! - hi!");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test19451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19451");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        java.lang.String str5 = room4.getScannedID();
        room4.setScannedID("hi!");
        java.lang.String str8 = room4.getBuildingName();
        int int9 = room4.getCapacity();
        room.SensorObserver sensorObserver10 = null;
        room4.addObserver(sensorObserver10);
        java.lang.String str12 = room4.getScannedID();
        int int13 = room4.getCapacity();
        boolean boolean14 = room4.isEnabled();
        java.lang.String str15 = room4.toString();
        java.lang.String str16 = room4.toString();
        java.lang.String str17 = room4.getFullLocation();
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
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str15, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str16, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi! - hi!" + "'", str17, "hi! - hi!");
    }

    @Test
    public void test19452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19452");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        boolean boolean5 = room4.isOccupied();
        boolean boolean6 = room4.isEnabled();
        java.lang.String str7 = room4.getRoomNumber();
        room4.setEnabled(false);
        java.lang.String str10 = room4.getFullLocation();
        room.SensorObserver sensorObserver11 = null;
        room4.removeObserver(sensorObserver11);
        java.lang.String str13 = room4.toString();
        boolean boolean14 = room4.isOccupied();
        java.lang.String str15 = room4.toString();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi! - hi!" + "'", str10, "hi! - hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str13, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str15, "Room hi! | hi! - hi! | Capacity: 0");
    }

    @Test
    public void test19453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19453");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        boolean boolean5 = room4.isOccupied();
        room4.setEnabled(false);
        java.lang.String str8 = room4.getRoomID();
        room4.notifyObservers();
        room4.setUnderMaintenance(false);
        java.lang.String str12 = room4.getRoomID();
        java.lang.String str13 = room4.toString();
        boolean boolean14 = room4.isEnabled();
        room4.setOccupied(true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str13, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test19454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19454");
        room.Room room4 = new room.Room("", (int) (short) 10, "Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 1", "Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100");
        int int5 = room4.getCapacity();
        room4.setEnabled(true);
        room4.setUnderMaintenance(true);
        java.lang.String str10 = room4.getRoomNumber();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100" + "'", str10, "Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100");
    }

    @Test
    public void test19455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19455");
        room.Room room4 = new room.Room("hi!", (int) (byte) 1, "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10", "hi!");
        java.lang.String str5 = room4.getRoomNumber();
        java.lang.String str6 = room4.getRoomID();
        room4.setEnabled(false);
        room4.setUnderMaintenance(false);
        boolean boolean11 = room4.isUnderMaintenance();
        java.lang.String str12 = room4.getRoomID();
        boolean boolean13 = room4.isUnderMaintenance();
        room4.setOccupied(false);
        room.SensorObserver sensorObserver16 = null;
        room4.addObserver(sensorObserver16);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test19456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19456");
        room.Room room4 = new room.Room("hi!", 1, "Room hi! | hi! - hi! | Capacity: 0 - hi!", "Room hi! | hi! - hi! | Capacity: 0 - hi!");
        int int5 = room4.getCapacity();
        room4.setUnderMaintenance(false);
        room4.setEnabled(true);
        room4.setUnderMaintenance(true);
        boolean boolean12 = room4.isUnderMaintenance();
        java.lang.String str13 = room4.toString();
        java.lang.String str14 = room4.getBuildingName();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Room hi! | Room hi! | hi! - hi! | Capacity: 0 - hi! - Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 1" + "'", str13, "Room hi! | Room hi! | hi! - hi! | Capacity: 0 - hi! - Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 1");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0 - hi!" + "'", str14, "Room hi! | hi! - hi! | Capacity: 0 - hi!");
    }

    @Test
    public void test19457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19457");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        java.lang.String str5 = room4.getScannedID();
        room4.setScannedID("hi!");
        java.lang.String str8 = room4.getBuildingName();
        room4.setEnabled(false);
        room4.notifyObservers();
        java.lang.String str12 = room4.toString();
        room.SensorObserver sensorObserver13 = null;
        room4.removeObserver(sensorObserver13);
        room.SensorObserver sensorObserver15 = null;
        room4.removeObserver(sensorObserver15);
        java.lang.String str17 = room4.getBuildingName();
        java.lang.String str18 = room4.getRoomID();
        room4.setScannedID("Room hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 1 - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi!");
        boolean boolean21 = room4.isEnabled();
        java.lang.String str22 = room4.getFullLocation();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str12, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi! - hi!" + "'", str22, "hi! - hi!");
    }

    @Test
    public void test19458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19458");
        room.Room room4 = new room.Room("Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10", 0, "hi!", "Room hi! | hi! - hi! | Capacity: 0");
        room4.setScannedID("Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100");
        room4.notifyObservers();
        int int8 = room4.getCapacity();
        room4.setEnabled(true);
        java.lang.String str11 = room4.getFullLocation();
        room4.setUnderMaintenance(false);
        room4.setUnderMaintenance(true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi! - Room hi! | hi! - hi! | Capacity: 0" + "'", str11, "hi! - Room hi! | hi! - hi! | Capacity: 0");
    }

    @Test
    public void test19459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19459");
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
        java.lang.String str15 = room4.getRoomID();
        room4.setEnabled(false);
        java.lang.String str18 = room4.getScannedID();
        room4.notifyObservers();
        boolean boolean20 = room4.isUnderMaintenance();
        java.lang.String str21 = room4.getBuildingName();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str7, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str10, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str14, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
    }

    @Test
    public void test19460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19460");
        room.Room room4 = new room.Room("hi!", (int) (byte) 100, "", "Room hi! | hi! - hi! | Capacity: 0");
        room4.setScannedID("");
        boolean boolean7 = room4.isOccupied();
        room4.setOccupied(true);
        boolean boolean10 = room4.isEnabled();
        java.lang.String str11 = room4.getRoomID();
        int int12 = room4.getCapacity();
        int int13 = room4.getCapacity();
        java.lang.String str14 = room4.toString();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100" + "'", str14, "Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100");
    }

    @Test
    public void test19461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19461");
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
        java.lang.String str16 = room4.getFullLocation();
        boolean boolean17 = room4.isOccupied();
        room4.notifyObservers();
        java.lang.String str19 = room4.getRoomNumber();
        room4.setOccupied(false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str11, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi! - hi!" + "'", str16, "hi! - hi!");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test19462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19462");
        room.Room room4 = new room.Room("", (int) (short) 10, "Room hi! | hi! - hi! | Capacity: 0", "hi!");
        room.SensorObserver sensorObserver5 = null;
        room4.removeObserver(sensorObserver5);
        room.SensorObserver sensorObserver7 = null;
        room4.removeObserver(sensorObserver7);
        int int9 = room4.getCapacity();
        java.lang.String str10 = room4.getScannedID();
        boolean boolean11 = room4.isEnabled();
        java.lang.String str12 = room4.getRoomID();
        room4.notifyObservers();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test19463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19463");
        room.Room room4 = new room.Room("Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10", (int) (short) 10, "hi! - ", "Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 1");
        room4.setUnderMaintenance(true);
        java.lang.String str7 = room4.getScannedID();
        java.lang.String str8 = room4.getScannedID();
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test19464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19464");
        room.Room room4 = new room.Room("Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 1 - Room Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! | Room  - Room hi! | hi! - hi! | Capacity: 0 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 0 - Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 97 | Capacity: 0", (int) ' ', "Room Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 97 | Room hi! - hi! |  - Room hi! | hi! - hi! | Capacity: 0 - Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 97 | Capacity: -1 -  | Capacity: 10", "hi! - hi! - hi! - hi! - Room hi! | hi! - hi! | Capacity: 0 - hi! - hi! - Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | hi! -  - Room  - Room hi! | hi! - hi! | Capacity: 0 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 0 | Capacity: 10");
    }

    @Test
    public void test19465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19465");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        boolean boolean5 = room4.isOccupied();
        room4.setEnabled(false);
        boolean boolean8 = room4.isUnderMaintenance();
        java.lang.String str9 = room4.getFullLocation();
        boolean boolean10 = room4.isOccupied();
        boolean boolean11 = room4.isOccupied();
        int int12 = room4.getCapacity();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi! - hi!" + "'", str9, "hi! - hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test19466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19466");
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
        boolean boolean17 = room4.isUnderMaintenance();
        room.SensorObserver sensorObserver18 = null;
        room4.removeObserver(sensorObserver18);
        room4.setScannedID("Room  | Room Room hi! | hi! - hi! | Capacity: 0 - hi! | Room Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! - hi! - hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: -1 - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 | Capacity: 10 - Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | hi! - hi! - hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 0 - Room Room Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! |  - Room hi! | hi! - hi! | Capacity: 0 - Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: -1 | Room  - Room hi! | hi! - hi! | Capacity: 0 |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 0 - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! | Capacity: 97 | Capacity: 10");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str11, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test19467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19467");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        room.SensorObserver sensorObserver5 = null;
        room4.addObserver(sensorObserver5);
        java.lang.String str7 = room4.toString();
        room.SensorObserver sensorObserver8 = null;
        room4.removeObserver(sensorObserver8);
        java.lang.String str10 = room4.getRoomNumber();
        int int11 = room4.getCapacity();
        java.lang.String str12 = room4.getRoomID();
        java.lang.String str13 = room4.toString();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str7, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str13, "Room hi! | hi! - hi! | Capacity: 0");
    }

    @Test
    public void test19468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19468");
        room.Room room4 = new room.Room("Room hi! | hi! - hi! | Capacity: 0", (int) (byte) 100, "Room hi! | hi! - hi! | Capacity: 0 - hi!", "hi!");
        java.lang.String str5 = room4.getRoomID();
        room4.setScannedID("hi! - hi!");
        boolean boolean8 = room4.isUnderMaintenance();
        java.lang.String str9 = room4.getScannedID();
        int int10 = room4.getCapacity();
        room4.setUnderMaintenance(false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str5, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi! - hi!" + "'", str9, "hi! - hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
    }

    @Test
    public void test19469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19469");
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
        room.SensorObserver sensorObserver21 = null;
        room4.addObserver(sensorObserver21);
        boolean boolean23 = room4.isEnabled();
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str11, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str16, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test19470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19470");
        room.Room room4 = new room.Room("Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 100", 0, "hi! - hi! - hi!", "hi!");
        java.lang.String str5 = room4.toString();
        java.lang.String str6 = room4.toString();
        java.lang.String str7 = room4.getFullLocation();
        boolean boolean8 = room4.isEnabled();
        java.lang.String str9 = room4.toString();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 100 | hi! - hi! - hi! - hi! | Capacity: 0" + "'", str5, "Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 100 | hi! - hi! - hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 100 | hi! - hi! - hi! - hi! | Capacity: 0" + "'", str6, "Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 100 | hi! - hi! - hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi! - hi! - hi! - hi!" + "'", str7, "hi! - hi! - hi! - hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 100 | hi! - hi! - hi! - hi! | Capacity: 0" + "'", str9, "Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 100 | hi! - hi! - hi! - hi! | Capacity: 0");
    }

    @Test
    public void test19471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19471");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        room.SensorObserver sensorObserver5 = null;
        room4.addObserver(sensorObserver5);
        java.lang.String str7 = room4.toString();
        java.lang.String str8 = room4.toString();
        java.lang.String str9 = room4.getBuildingName();
        int int10 = room4.getCapacity();
        java.lang.String str11 = room4.getFullLocation();
        java.lang.String str12 = room4.getRoomNumber();
        // The following exception was thrown during execution in test generation
        try {
            room4.setScannedID("Room  - Room hi! | hi! - hi! | Capacity: 0 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 0 -  - Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | Room hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 1 - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! | Capacity: 97");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str7, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str8, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi! - hi!" + "'", str11, "hi! - hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test19472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19472");
        room.Room room4 = new room.Room("hi!", (int) (byte) 100, "", "Room hi! | hi! - hi! | Capacity: 0");
        java.lang.String str5 = room4.getScannedID();
        java.lang.String str6 = room4.getBuildingName();
        room4.setUnderMaintenance(false);
        boolean boolean9 = room4.isOccupied();
        room4.setScannedID("hi!");
        java.lang.String str12 = room4.getFullLocation();
        java.lang.String str13 = room4.getFullLocation();
        boolean boolean14 = room4.isOccupied();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + " - Room hi! | hi! - hi! | Capacity: 0" + "'", str12, " - Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + " - Room hi! | hi! - hi! | Capacity: 0" + "'", str13, " - Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test19473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19473");
        room.Room room4 = new room.Room("Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 | Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 - hi! -  | Capacity: 10", (int) (byte) 100, "Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 | hi! - hi! - Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 - Room hi! | hi! - hi! | Capacity: 0 - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 0", "Room Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! - hi! - hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: -1 - ");
    }

    @Test
    public void test19474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19474");
        room.Room room4 = new room.Room("", (int) (short) 10, "Room hi! | hi! - hi! | Capacity: 0", "hi!");
        java.lang.String str5 = room4.toString();
        java.lang.String str6 = room4.getBuildingName();
        room.SensorObserver sensorObserver7 = null;
        room4.removeObserver(sensorObserver7);
        boolean boolean9 = room4.isEnabled();
        room.SensorObserver sensorObserver10 = null;
        room4.addObserver(sensorObserver10);
        boolean boolean12 = room4.isEnabled();
        boolean boolean13 = room4.isOccupied();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10" + "'", str5, "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str6, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test19475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19475");
        room.Room room4 = new room.Room("Room Room hi! | hi! - hi! | Capacity: 0 - hi! - hi! |  - Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | hi! - hi! - hi! | Capacity: 0 | Capacity: 52", (int) (short) 0, "Room Room Room Room hi! | hi! - hi! | Capacity: 0 | Room hi! | hi! - hi! | Capacity: 0 - hi! - hi! | Capacity: 100 |  - hi! - hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: -1 | Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - Room hi! | hi! - hi! | Capacity: 0 - hi! - Room hi! | hi! - hi! | Capacity: 0 - hi! - Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 0", "Room Room  - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 100 | hi! - hi! - hi! - hi! | Capacity: 0 | Capacity: 0 |  - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! - Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | Capacity: 10");
    }

    @Test
    public void test19476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19476");
        room.Room room4 = new room.Room("Room hi! | hi! - hi! | Capacity: 0 - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10", 100, "Room Room Room Room hi! | hi! - hi! | Capacity: 0 | Room hi! | hi! - hi! | Capacity: 0 - hi! - hi! | Capacity: 100 |  - hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 10 | Room Room hi! | hi! - hi! | Capacity: 0 |  - Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 0 - hi! - hi! - Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | Capacity: 32", "Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 100 | hi! - hi! - hi! - hi! | Capacity: 0 - Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 1");
    }

    @Test
    public void test19477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19477");
        room.Room room4 = new room.Room("", 35, "hi! - hi! - Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 97", "Room  | Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! | Capacity: 1");
        boolean boolean5 = room4.isUnderMaintenance();
        java.lang.String str6 = room4.toString();
        room4.setScannedID("");
        room.SensorObserver sensorObserver9 = null;
        room4.addObserver(sensorObserver9);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Room  | hi! - hi! - Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 97 - Room  | Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! | Capacity: 1 | Capacity: 35" + "'", str6, "Room  | hi! - hi! - Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 97 - Room  | Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - hi! | Capacity: 1 | Capacity: 35");
    }

    @Test
    public void test19478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19478");
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
        java.lang.String str15 = room4.getRoomID();
        room4.setOccupied(true);
        boolean boolean18 = room4.isOccupied();
        boolean boolean19 = room4.isUnderMaintenance();
        room4.setOccupied(true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str7, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str10, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test19479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19479");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        java.lang.String str5 = room4.getScannedID();
        room4.setScannedID("hi!");
        boolean boolean8 = room4.isEnabled();
        int int9 = room4.getCapacity();
        int int10 = room4.getCapacity();
        boolean boolean11 = room4.isOccupied();
        room4.setEnabled(false);
        room4.setUnderMaintenance(true);
        boolean boolean16 = room4.isEnabled();
        java.lang.Class<?> wildcardClass17 = room4.getClass();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test19480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19480");
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
        room4.setScannedID("Room hi! | hi! - hi! | Capacity: 0 - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! - hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 97 - Room hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 1 - Room hi! | hi! - hi! - Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | Capacity: 0");
        room4.setEnabled(true);
        boolean boolean18 = room4.isUnderMaintenance();
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test19481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19481");
        room.Room room4 = new room.Room("hi! - hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10", (int) (short) -1, "Room Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 1 | hi! - hi! - Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 97 - Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | Capacity: 10", " - Room hi! | hi! - hi! | Capacity: 0");
        room.SensorObserver sensorObserver5 = null;
        room4.addObserver(sensorObserver5);
    }

    @Test
    public void test19482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19482");
        room.Room room4 = new room.Room("Room hi! | hi! - hi! | Capacity: 0", (int) (byte) 10, "hi!", "");
        room4.setUnderMaintenance(true);
        int int7 = room4.getCapacity();
        java.lang.String str8 = room4.getRoomNumber();
        java.lang.String str9 = room4.getScannedID();
        java.lang.String str10 = room4.getRoomNumber();
        java.lang.String str11 = room4.getBuildingName();
        room.SensorObserver sensorObserver12 = null;
        room4.removeObserver(sensorObserver12);
        java.lang.String str14 = room4.getScannedID();
        java.lang.String str15 = room4.getBuildingName();
        room4.notifyObservers();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test19483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19483");
        room.Room room4 = new room.Room("hi!", (int) (byte) 1, "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10", "hi!");
        room4.notifyObservers();
        java.lang.String str6 = room4.getFullLocation();
        room.SensorObserver sensorObserver7 = null;
        room4.removeObserver(sensorObserver7);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi!" + "'", str6, "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi!");
    }

    @Test
    public void test19484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19484");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        boolean boolean5 = room4.isOccupied();
        room4.setEnabled(false);
        room4.setUnderMaintenance(false);
        java.lang.String str10 = room4.getScannedID();
        java.lang.String str11 = room4.getBuildingName();
        room4.setOccupied(true);
        room4.notifyObservers();
        int int15 = room4.getCapacity();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test19485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19485");
        room.Room room4 = new room.Room("Room hi! | hi! - hi! - Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | Capacity: 0", (int) (short) 1, "hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10", "Room  - Room hi! | hi! - hi! | Capacity: 0 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 0");
        room4.notifyObservers();
        room4.setEnabled(false);
        java.lang.String str8 = room4.getScannedID();
        room4.setUnderMaintenance(true);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test19486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19486");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        java.lang.String str5 = room4.getScannedID();
        room4.setScannedID("hi!");
        boolean boolean8 = room4.isEnabled();
        room.SensorObserver sensorObserver9 = null;
        room4.removeObserver(sensorObserver9);
        boolean boolean11 = room4.isUnderMaintenance();
        room4.notifyObservers();
        room4.setScannedID("Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 - Room Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 | Room Room hi! | hi! - hi! | Capacity: 0 | Room hi! | hi! - hi! | Capacity: 0 - hi! - hi! | Capacity: 100 - hi! - hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 0");
        java.lang.String str15 = room4.getFullLocation();
        java.lang.String str16 = room4.getFullLocation();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi! - hi!" + "'", str15, "hi! - hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi! - hi!" + "'", str16, "hi! - hi!");
    }

    @Test
    public void test19487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19487");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        java.lang.String str5 = room4.getScannedID();
        room.SensorObserver sensorObserver6 = null;
        room4.removeObserver(sensorObserver6);
        boolean boolean8 = room4.isUnderMaintenance();
        room.SensorObserver sensorObserver9 = null;
        room4.removeObserver(sensorObserver9);
        java.lang.String str11 = room4.getRoomNumber();
        java.lang.String str12 = room4.getBuildingName();
        room.SensorObserver sensorObserver13 = null;
        room4.removeObserver(sensorObserver13);
        boolean boolean15 = room4.isOccupied();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test19488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19488");
        room.Room room4 = new room.Room("", (int) (byte) 100, "Room hi! | hi! - hi! - Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | Capacity: 0 -  - hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10", "Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 1 - Room hi! | hi! - hi! | Capacity: 0 - hi!");
        java.lang.String str5 = room4.getRoomNumber();
        java.lang.String str6 = room4.getRoomNumber();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 1 - Room hi! | hi! - hi! | Capacity: 0 - hi!" + "'", str5, "Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 1 - Room hi! | hi! - hi! | Capacity: 0 - hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 1 - Room hi! | hi! - hi! | Capacity: 0 - hi!" + "'", str6, "Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 1 - Room hi! | hi! - hi! | Capacity: 0 - hi!");
    }

    @Test
    public void test19489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19489");
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
        int int21 = room4.getCapacity();
        boolean boolean22 = room4.isEnabled();
        java.lang.String str23 = room4.getRoomNumber();
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str11, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
    }

    @Test
    public void test19490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19490");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        java.lang.String str5 = room4.getScannedID();
        room4.setScannedID("hi!");
        boolean boolean8 = room4.isEnabled();
        int int9 = room4.getCapacity();
        boolean boolean10 = room4.isOccupied();
        boolean boolean11 = room4.isUnderMaintenance();
        java.lang.String str12 = room4.getBuildingName();
        room4.setEnabled(true);
        int int15 = room4.getCapacity();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test19491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19491");
        room.Room room4 = new room.Room("Room hi! - hi! - hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 1 | Capacity: 0 - hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10", 32, "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! - hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 97 | Capacity: 32", "Room hi! | hi! - hi! | Capacity: 0 - hi! - Room hi! | hi! - hi! | Capacity: 0 - hi! - hi! - hi! - Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100");
        boolean boolean5 = room4.isEnabled();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test19492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19492");
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
        java.lang.String str17 = room4.getFullLocation();
        room4.setOccupied(false);
        boolean boolean20 = room4.isUnderMaintenance();
        room4.setEnabled(true);
        room.SensorObserver sensorObserver23 = null;
        room4.removeObserver(sensorObserver23);
        java.lang.String str25 = room4.getScannedID();
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str11, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi! - hi!" + "'", str17, "hi! - hi!");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(str25);
    }

    @Test
    public void test19493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19493");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        java.lang.String str5 = room4.getScannedID();
        room4.setScannedID("hi!");
        room4.setEnabled(true);
        room4.notifyObservers();
        java.lang.String str11 = room4.getScannedID();
        room.SensorObserver sensorObserver12 = null;
        room4.removeObserver(sensorObserver12);
        boolean boolean14 = room4.isOccupied();
        room4.setScannedID("Room hi! | hi! - hi! | Capacity: 0 - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! - hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 97 - Room hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 1 - Room hi! | hi! - hi! - Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | Capacity: 0 - Room  - Room hi! | hi! - hi! | Capacity: 0 | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - Room hi! | hi! - hi! | Capacity: 0 - hi! -  | Capacity: 0 - hi! -  - hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10");
        java.lang.String str17 = room4.getFullLocation();
        java.lang.String str18 = room4.getBuildingName();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi! - hi!" + "'", str17, "hi! - hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test19494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19494");
        room.Room room4 = new room.Room("Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100", (int) 'a', "hi! - hi!", "Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10");
        java.lang.String str5 = room4.toString();
        java.lang.String str6 = room4.getScannedID();
        java.lang.String str7 = room4.toString();
        java.lang.String str8 = room4.getBuildingName();
        room4.setOccupied(true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 97" + "'", str5, "Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 97");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 97" + "'", str7, "Room Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | hi! - hi! - Room Room hi! | hi! - hi! | Capacity: 0 | hi! -  | Capacity: 10 | Capacity: 97");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi! - hi!" + "'", str8, "hi! - hi!");
    }

    @Test
    public void test19495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19495");
        room.Room room4 = new room.Room("Room hi! | Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi! | Capacity: 1 - Room hi! | hi! - hi! - Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100 | Capacity: 0", 0, "Room hi! | hi! - hi! | Capacity: 0 - hi! - hi!", "Room hi! | hi! - hi! | Capacity: 0");
        room4.setUnderMaintenance(false);
        room4.setEnabled(false);
        java.lang.Class<?> wildcardClass9 = room4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test19496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19496");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        boolean boolean5 = room4.isOccupied();
        boolean boolean6 = room4.isEnabled();
        java.lang.String str7 = room4.getFullLocation();
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
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi! - hi!" + "'", str7, "hi! - hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test19497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19497");
        room.Room room4 = new room.Room("hi!", 0, "hi!", "hi!");
        java.lang.String str5 = room4.getScannedID();
        room4.setScannedID("hi!");
        room4.setUnderMaintenance(true);
        boolean boolean10 = room4.isOccupied();
        boolean boolean11 = room4.isOccupied();
        java.lang.String str12 = room4.getFullLocation();
        java.lang.String str13 = room4.getBuildingName();
        room4.setScannedID("hi!");
        room4.setEnabled(false);
        int int18 = room4.getCapacity();
        java.lang.String str19 = room4.getBuildingName();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi! - hi!" + "'", str12, "hi! - hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test19498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19498");
        room.Room room4 = new room.Room("Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100", (int) (short) 1, "Room  | Room hi! | hi! - hi! | Capacity: 0 - hi! | Capacity: 10 - hi!", "Room hi! | hi! - hi! | Capacity: 0");
        java.lang.String str5 = room4.getScannedID();
        room4.setOccupied(true);
        int int8 = room4.getCapacity();
        room.SensorObserver sensorObserver9 = null;
        room4.removeObserver(sensorObserver9);
        room4.notifyObservers();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test19499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19499");
        room.Room room4 = new room.Room("Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100", 0, "hi! - hi!", "hi!");
        java.lang.String str5 = room4.getFullLocation();
        boolean boolean6 = room4.isUnderMaintenance();
        room4.setEnabled(true);
        room4.notifyObservers();
        java.lang.String str10 = room4.getRoomNumber();
        room4.setEnabled(true);
        java.lang.String str13 = room4.getRoomID();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi! - hi! - hi!" + "'", str5, "hi! - hi! - hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100" + "'", str13, "Room hi! |  - Room hi! | hi! - hi! | Capacity: 0 | Capacity: 100");
    }

    @Test
    public void test19500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19500");
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
        java.lang.String str18 = room4.getBuildingName();
        java.lang.String str19 = room4.getScannedID();
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Room hi! | hi! - hi! | Capacity: 0" + "'", str11, "Room hi! | hi! - hi! | Capacity: 0");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNull(str19);
    }
}

