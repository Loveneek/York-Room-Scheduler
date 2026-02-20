import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest4 {

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
    public void test02001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02001");
        model.Admin admin2 = new model.Admin("admin", "admin");
        admin2.viewProfile();
        java.lang.String str4 = admin2.getPassword();
        admin2.login("", "");
        java.lang.String str8 = admin2.getEmail();
        java.lang.String str9 = admin2.getID();
        room.Room room10 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.enableRoom(room10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "admin" + "'", str4, "admin");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "admin" + "'", str8, "admin");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "admin" + "'", str9, "admin");
    }

    @Test
    public void test02002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02002");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        admin2.logout();
        java.lang.String str5 = admin2.getAccountType();
        admin2.viewProfile();
        admin2.login("hi!", "admin");
        double double10 = admin2.getHourlyRate();
        admin2.setVerified(false);
        java.lang.String str13 = admin2.getAccountType();
        java.lang.String str14 = admin2.getPassword();
        double double15 = admin2.getHourlyRate();
        room.Room room16 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.disableRoom(room16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "admin" + "'", str13, "admin");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test02003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02003");
        model.Admin admin2 = new model.Admin("", "hi!");
        java.lang.String str3 = admin2.getPassword();
        admin2.setVerified(false);
        java.lang.String str6 = admin2.getPassword();
        boolean boolean7 = admin2.isVerified();
        admin2.setVerified(true);
        room.Room room10 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.enableRoom(room10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test02004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02004");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        double double5 = admin2.getHourlyRate();
        admin2.setVerified(true);
        double double8 = admin2.getHourlyRate();
        admin2.logout();
        admin2.login("hi!", "");
        admin2.setVerified(false);
        java.lang.String str15 = admin2.getAccountType();
        java.lang.String str16 = admin2.getEmail();
        admin2.login("", "hi!");
        admin2.viewProfile();
        admin2.login("hi!", "hi!");
        java.lang.Class<?> wildcardClass24 = admin2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "admin" + "'", str15, "admin");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test02005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02005");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        double double5 = admin2.getHourlyRate();
        double double6 = admin2.getHourlyRate();
        java.lang.String str7 = admin2.getID();
        admin2.viewProfile();
        admin2.logout();
        java.lang.String str10 = admin2.getEmail();
        boolean boolean11 = admin2.isVerified();
        java.lang.String str12 = admin2.getAccountType();
        admin2.logout();
        java.lang.String str14 = admin2.getID();
        admin2.setVerified(true);
        java.lang.Class<?> wildcardClass17 = admin2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "admin" + "'", str12, "admin");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "admin" + "'", str14, "admin");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test02006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02006");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        double double4 = admin2.getHourlyRate();
        java.lang.String str5 = admin2.getAccountType();
        java.lang.String str6 = admin2.getPassword();
        room.Room room7 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.disableRoom(room7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test02007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02007");
        model.Admin admin2 = new model.Admin("admin", "admin");
        admin2.login("admin", "admin");
        admin2.setVerified(false);
        admin2.login("hi!", "admin");
        admin2.login("admin", "hi!");
        double double14 = admin2.getHourlyRate();
        java.lang.String str15 = admin2.getID();
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "admin" + "'", str15, "admin");
    }

    @Test
    public void test02008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02008");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        double double5 = admin2.getHourlyRate();
        double double6 = admin2.getHourlyRate();
        java.lang.String str7 = admin2.getID();
        boolean boolean8 = admin2.isVerified();
        java.lang.String str9 = admin2.getPassword();
        admin2.logout();
        admin2.setVerified(false);
        admin2.login("admin", "admin");
        double double16 = admin2.getHourlyRate();
        java.lang.String str17 = admin2.getID();
        room.Room room18 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.addRoom(room18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.getRoomID()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "admin" + "'", str17, "admin");
    }

    @Test
    public void test02009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02009");
        model.Admin admin2 = new model.Admin("admin", "");
        admin2.setVerified(true);
        java.lang.String str5 = admin2.getEmail();
        double double6 = admin2.getHourlyRate();
        java.lang.String str7 = admin2.getPassword();
        java.lang.String str8 = admin2.getAccountType();
        java.lang.String str9 = admin2.getAccountType();
        admin2.setVerified(false);
        room.Room room12 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.addRoom(room12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.getRoomID()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "admin" + "'", str8, "admin");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "admin" + "'", str9, "admin");
    }

    @Test
    public void test02010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02010");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        double double5 = admin2.getHourlyRate();
        admin2.setVerified(true);
        double double8 = admin2.getHourlyRate();
        double double9 = admin2.getHourlyRate();
        java.lang.String str10 = admin2.getPassword();
        admin2.login("admin", "");
        room.Room room14 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.enableRoom(room14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test02011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02011");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        double double5 = admin2.getHourlyRate();
        double double6 = admin2.getHourlyRate();
        java.lang.String str7 = admin2.getID();
        admin2.viewProfile();
        admin2.logout();
        java.lang.String str10 = admin2.getEmail();
        boolean boolean11 = admin2.isVerified();
        java.lang.String str12 = admin2.getAccountType();
        admin2.logout();
        java.lang.String str14 = admin2.getPassword();
        boolean boolean15 = admin2.isVerified();
        double double16 = admin2.getHourlyRate();
        double double17 = admin2.getHourlyRate();
        boolean boolean18 = admin2.isVerified();
        double double19 = admin2.getHourlyRate();
        room.Room room20 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.addRoom(room20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.getRoomID()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "admin" + "'", str12, "admin");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
    }

    @Test
    public void test02012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02012");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        double double5 = admin2.getHourlyRate();
        double double6 = admin2.getHourlyRate();
        admin2.setVerified(true);
        java.lang.String str9 = admin2.getEmail();
        java.lang.String str10 = admin2.getEmail();
        boolean boolean11 = admin2.isVerified();
        room.Room room12 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.disableRoom(room12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test02013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02013");
        model.Admin admin2 = new model.Admin("admin", "admin");
        admin2.viewProfile();
        java.lang.String str4 = admin2.getPassword();
        double double5 = admin2.getHourlyRate();
        java.lang.String str6 = admin2.getPassword();
        admin2.viewProfile();
        admin2.viewProfile();
        room.Room room9 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.enableRoom(room9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "admin" + "'", str4, "admin");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "admin" + "'", str6, "admin");
    }

    @Test
    public void test02014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02014");
        model.Admin admin2 = new model.Admin("admin", "");
        admin2.setVerified(true);
        boolean boolean5 = admin2.isVerified();
        java.lang.String str6 = admin2.getAccountType();
        admin2.logout();
        admin2.login("", "");
        room.Room room11 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.disableRoom(room11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "admin" + "'", str6, "admin");
    }

    @Test
    public void test02015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02015");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        double double5 = admin2.getHourlyRate();
        double double6 = admin2.getHourlyRate();
        java.lang.String str7 = admin2.getID();
        boolean boolean8 = admin2.isVerified();
        java.lang.String str9 = admin2.getPassword();
        admin2.logout();
        admin2.login("hi!", "");
        java.lang.String str14 = admin2.getEmail();
        admin2.logout();
        room.Room room16 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.addRoom(room16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.getRoomID()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test02016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02016");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        java.lang.String str5 = admin2.getAccountType();
        double double6 = admin2.getHourlyRate();
        admin2.login("", "");
        java.lang.String str10 = admin2.getEmail();
        room.Room room11 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.enableRoom(room11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test02017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02017");
        model.Admin admin2 = new model.Admin("admin", "admin");
        admin2.login("admin", "admin");
        boolean boolean6 = admin2.isVerified();
        admin2.logout();
        java.lang.String str8 = admin2.getID();
        admin2.viewProfile();
        admin2.login("hi!", "");
        admin2.setVerified(true);
        java.lang.String str15 = admin2.getAccountType();
        room.Room room16 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.enableRoom(room16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "admin" + "'", str8, "admin");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "admin" + "'", str15, "admin");
    }

    @Test
    public void test02018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02018");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        admin2.logout();
        java.lang.String str5 = admin2.getAccountType();
        admin2.login("hi!", "");
        admin2.logout();
        java.lang.String str10 = admin2.getID();
        java.lang.String str11 = admin2.getID();
        admin2.setVerified(false);
        room.Room room14 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.enableRoom(room14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "admin" + "'", str10, "admin");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "admin" + "'", str11, "admin");
    }

    @Test
    public void test02019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02019");
        model.Admin admin2 = new model.Admin("admin", "admin");
        admin2.logout();
        double double4 = admin2.getHourlyRate();
        java.lang.Class<?> wildcardClass5 = admin2.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test02020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02020");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        double double5 = admin2.getHourlyRate();
        double double6 = admin2.getHourlyRate();
        java.lang.String str7 = admin2.getID();
        admin2.viewProfile();
        admin2.logout();
        java.lang.String str10 = admin2.getEmail();
        boolean boolean11 = admin2.isVerified();
        java.lang.String str12 = admin2.getEmail();
        admin2.viewProfile();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test02021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02021");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        double double5 = admin2.getHourlyRate();
        boolean boolean6 = admin2.isVerified();
        admin2.login("hi!", "");
        java.lang.String str10 = admin2.getPassword();
        admin2.viewProfile();
        room.Room room12 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.enableRoom(room12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test02022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02022");
        model.Admin admin2 = new model.Admin("", "");
        java.lang.String str3 = admin2.getAccountType();
        admin2.setVerified(true);
        double double6 = admin2.getHourlyRate();
        admin2.viewProfile();
        boolean boolean8 = admin2.isVerified();
        java.lang.String str9 = admin2.getID();
        admin2.setVerified(false);
        admin2.setVerified(true);
        admin2.setVerified(false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "admin" + "'", str9, "admin");
    }

    @Test
    public void test02023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02023");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        double double5 = admin2.getHourlyRate();
        admin2.setVerified(true);
        double double8 = admin2.getHourlyRate();
        double double9 = admin2.getHourlyRate();
        java.lang.String str10 = admin2.getPassword();
        admin2.logout();
        room.Room room12 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.disableRoom(room12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test02024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02024");
        model.Admin admin2 = new model.Admin("", "");
        java.lang.String str3 = admin2.getAccountType();
        java.lang.String str4 = admin2.getEmail();
        java.lang.String str5 = admin2.getID();
        double double6 = admin2.getHourlyRate();
        java.lang.String str7 = admin2.getAccountType();
        double double8 = admin2.getHourlyRate();
        java.lang.String str9 = admin2.getEmail();
        admin2.logout();
        boolean boolean11 = admin2.isVerified();
        java.lang.Class<?> wildcardClass12 = admin2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test02025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02025");
        model.Admin admin2 = new model.Admin("admin", "admin");
        admin2.login("admin", "admin");
        boolean boolean6 = admin2.isVerified();
        admin2.logout();
        admin2.setVerified(false);
        admin2.setVerified(false);
        admin2.logout();
        java.lang.Class<?> wildcardClass13 = admin2.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test02026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02026");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        double double5 = admin2.getHourlyRate();
        double double6 = admin2.getHourlyRate();
        java.lang.String str7 = admin2.getID();
        admin2.viewProfile();
        double double9 = admin2.getHourlyRate();
        java.lang.String str10 = admin2.getEmail();
        room.Room room11 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.disableRoom(room11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test02027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02027");
        model.Admin admin2 = new model.Admin("admin", "admin");
        admin2.viewProfile();
        java.lang.String str4 = admin2.getPassword();
        admin2.login("", "");
        java.lang.String str8 = admin2.getEmail();
        java.lang.String str9 = admin2.getPassword();
        admin2.login("admin", "admin");
        admin2.viewProfile();
        room.Room room14 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.enableRoom(room14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "admin" + "'", str4, "admin");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "admin" + "'", str8, "admin");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "admin" + "'", str9, "admin");
    }

    @Test
    public void test02028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02028");
        model.Admin admin2 = new model.Admin("admin", "admin");
        boolean boolean3 = admin2.isVerified();
        admin2.login("hi!", "");
        double double7 = admin2.getHourlyRate();
        admin2.viewProfile();
        admin2.setVerified(true);
        java.lang.Class<?> wildcardClass11 = admin2.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test02029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02029");
        model.Admin admin2 = new model.Admin("admin", "admin");
        admin2.viewProfile();
        admin2.viewProfile();
        admin2.viewProfile();
        java.lang.Class<?> wildcardClass6 = admin2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test02030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02030");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        double double5 = admin2.getHourlyRate();
        double double6 = admin2.getHourlyRate();
        java.lang.String str7 = admin2.getID();
        boolean boolean8 = admin2.isVerified();
        java.lang.String str9 = admin2.getPassword();
        java.lang.String str10 = admin2.getAccountType();
        admin2.logout();
        java.lang.String str12 = admin2.getPassword();
        room.Room room13 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.enableRoom(room13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "admin" + "'", str10, "admin");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test02031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02031");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        double double5 = admin2.getHourlyRate();
        double double6 = admin2.getHourlyRate();
        java.lang.String str7 = admin2.getPassword();
        admin2.setVerified(true);
        java.lang.String str10 = admin2.getEmail();
        java.lang.String str11 = admin2.getID();
        boolean boolean12 = admin2.isVerified();
        admin2.login("hi!", "hi!");
        admin2.logout();
        admin2.logout();
        boolean boolean18 = admin2.isVerified();
        admin2.setVerified(true);
        room.Room room21 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.enableRoom(room21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "admin" + "'", str11, "admin");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test02032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02032");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        double double5 = admin2.getHourlyRate();
        double double6 = admin2.getHourlyRate();
        java.lang.String str7 = admin2.getID();
        admin2.viewProfile();
        admin2.logout();
        admin2.setVerified(false);
        java.lang.String str12 = admin2.getEmail();
        boolean boolean13 = admin2.isVerified();
        admin2.setVerified(true);
        double double16 = admin2.getHourlyRate();
        boolean boolean17 = admin2.isVerified();
        room.Room room18 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.addRoom(room18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.getRoomID()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test02033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02033");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        double double5 = admin2.getHourlyRate();
        double double6 = admin2.getHourlyRate();
        admin2.viewProfile();
        room.Room room8 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.disableRoom(room8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test02034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02034");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        admin2.logout();
        java.lang.String str4 = admin2.getAccountType();
        admin2.viewProfile();
        admin2.logout();
        room.Room room7 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.disableRoom(room7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "admin" + "'", str4, "admin");
    }

    @Test
    public void test02035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02035");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        double double5 = admin2.getHourlyRate();
        boolean boolean6 = admin2.isVerified();
        admin2.login("hi!", "");
        java.lang.String str10 = admin2.getPassword();
        admin2.viewProfile();
        admin2.login("admin", "admin");
        room.Room room15 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.disableRoom(room15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test02036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02036");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        admin2.logout();
        java.lang.String str5 = admin2.getAccountType();
        admin2.viewProfile();
        admin2.setVerified(false);
        admin2.login("hi!", "admin");
        admin2.setVerified(false);
        admin2.viewProfile();
        java.lang.String str15 = admin2.getAccountType();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "admin" + "'", str15, "admin");
    }

    @Test
    public void test02037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02037");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        double double5 = admin2.getHourlyRate();
        double double6 = admin2.getHourlyRate();
        java.lang.String str7 = admin2.getID();
        admin2.viewProfile();
        double double9 = admin2.getHourlyRate();
        java.lang.String str10 = admin2.getEmail();
        java.lang.String str11 = admin2.getEmail();
        room.Room room12 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.addRoom(room12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.getRoomID()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test02038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02038");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        java.lang.String str4 = admin2.getAccountType();
        java.lang.String str5 = admin2.getPassword();
        admin2.logout();
        room.Room room7 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.disableRoom(room7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "admin" + "'", str4, "admin");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test02039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02039");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        java.lang.String str5 = admin2.getID();
        admin2.setVerified(false);
        room.Room room8 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.disableRoom(room8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
    }

    @Test
    public void test02040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02040");
        model.Admin admin2 = new model.Admin("admin", "");
        admin2.setVerified(true);
        java.lang.String str5 = admin2.getEmail();
        double double6 = admin2.getHourlyRate();
        java.lang.String str7 = admin2.getPassword();
        admin2.login("", "");
        java.lang.String str11 = admin2.getPassword();
        room.Room room12 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.enableRoom(room12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test02041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02041");
        model.Admin admin2 = new model.Admin("", "");
        java.lang.String str3 = admin2.getAccountType();
        admin2.setVerified(true);
        double double6 = admin2.getHourlyRate();
        admin2.viewProfile();
        boolean boolean8 = admin2.isVerified();
        java.lang.String str9 = admin2.getID();
        admin2.viewProfile();
        java.lang.String str11 = admin2.getPassword();
        admin2.logout();
        admin2.viewProfile();
        admin2.setVerified(false);
        java.lang.String str16 = admin2.getEmail();
        room.Room room17 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.addRoom(room17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.getRoomID()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "admin" + "'", str9, "admin");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test02042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02042");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        admin2.logout();
        java.lang.String str5 = admin2.getAccountType();
        admin2.login("", "");
        java.lang.String str9 = admin2.getEmail();
        java.lang.String str10 = admin2.getAccountType();
        admin2.setVerified(false);
        java.lang.String str13 = admin2.getPassword();
        admin2.login("admin", "");
        room.Room room17 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.addRoom(room17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.getRoomID()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "admin" + "'", str10, "admin");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test02043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02043");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        double double5 = admin2.getHourlyRate();
        double double6 = admin2.getHourlyRate();
        java.lang.String str7 = admin2.getID();
        admin2.viewProfile();
        admin2.logout();
        admin2.setVerified(false);
        java.lang.String str12 = admin2.getEmail();
        boolean boolean13 = admin2.isVerified();
        admin2.setVerified(true);
        room.Room room16 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.enableRoom(room16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test02044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02044");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        java.lang.String str5 = admin2.getEmail();
        double double6 = admin2.getHourlyRate();
        java.lang.String str7 = admin2.getID();
        admin2.logout();
        java.lang.Class<?> wildcardClass9 = admin2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test02045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02045");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        double double5 = admin2.getHourlyRate();
        double double6 = admin2.getHourlyRate();
        java.lang.String str7 = admin2.getID();
        admin2.viewProfile();
        double double9 = admin2.getHourlyRate();
        admin2.setVerified(true);
        admin2.logout();
        boolean boolean13 = admin2.isVerified();
        java.lang.String str14 = admin2.getPassword();
        admin2.logout();
        room.Room room16 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.disableRoom(room16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test02046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02046");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getAccountType();
        boolean boolean4 = admin2.isVerified();
        double double5 = admin2.getHourlyRate();
        double double6 = admin2.getHourlyRate();
        java.lang.Class<?> wildcardClass7 = admin2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test02047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02047");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        double double5 = admin2.getHourlyRate();
        double double6 = admin2.getHourlyRate();
        java.lang.String str7 = admin2.getPassword();
        admin2.logout();
        double double9 = admin2.getHourlyRate();
        boolean boolean10 = admin2.isVerified();
        java.lang.String str11 = admin2.getAccountType();
        java.lang.Class<?> wildcardClass12 = admin2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "admin" + "'", str11, "admin");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test02048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02048");
        model.Admin admin2 = new model.Admin("admin", "");
        admin2.setVerified(true);
        java.lang.String str5 = admin2.getEmail();
        double double6 = admin2.getHourlyRate();
        java.lang.String str7 = admin2.getPassword();
        java.lang.String str8 = admin2.getEmail();
        java.lang.String str9 = admin2.getAccountType();
        java.lang.String str10 = admin2.getAccountType();
        admin2.setVerified(false);
        room.Room room13 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.disableRoom(room13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "admin" + "'", str8, "admin");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "admin" + "'", str9, "admin");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "admin" + "'", str10, "admin");
    }

    @Test
    public void test02049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02049");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        double double5 = admin2.getHourlyRate();
        double double6 = admin2.getHourlyRate();
        java.lang.String str7 = admin2.getID();
        admin2.viewProfile();
        java.lang.String str9 = admin2.getID();
        admin2.logout();
        admin2.viewProfile();
        admin2.login("hi!", "");
        admin2.logout();
        room.Room room16 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.disableRoom(room16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "admin" + "'", str9, "admin");
    }

    @Test
    public void test02050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02050");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        admin2.logout();
        java.lang.String str5 = admin2.getAccountType();
        admin2.login("", "");
        java.lang.String str9 = admin2.getPassword();
        admin2.logout();
        java.lang.String str11 = admin2.getEmail();
        java.lang.String str12 = admin2.getPassword();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test02051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02051");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        admin2.logout();
        java.lang.String str5 = admin2.getAccountType();
        boolean boolean6 = admin2.isVerified();
        admin2.login("hi!", "admin");
        java.lang.String str10 = admin2.getPassword();
        room.Room room11 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.addRoom(room11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.getRoomID()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test02052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02052");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        double double5 = admin2.getHourlyRate();
        double double6 = admin2.getHourlyRate();
        admin2.setVerified(true);
        java.lang.String str9 = admin2.getID();
        java.lang.String str10 = admin2.getEmail();
        java.lang.Class<?> wildcardClass11 = admin2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "admin" + "'", str9, "admin");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test02053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02053");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        double double5 = admin2.getHourlyRate();
        double double6 = admin2.getHourlyRate();
        java.lang.String str7 = admin2.getPassword();
        double double8 = admin2.getHourlyRate();
        admin2.logout();
        double double10 = admin2.getHourlyRate();
        java.lang.String str11 = admin2.getID();
        admin2.login("admin", "admin");
        java.lang.String str15 = admin2.getPassword();
        java.lang.Class<?> wildcardClass16 = admin2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "admin" + "'", str11, "admin");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test02054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02054");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        admin2.logout();
        java.lang.String str5 = admin2.getAccountType();
        java.lang.String str6 = admin2.getEmail();
        java.lang.String str7 = admin2.getID();
        admin2.login("admin", "admin");
        admin2.viewProfile();
        room.Room room12 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.enableRoom(room12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
    }

    @Test
    public void test02055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02055");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        double double5 = admin2.getHourlyRate();
        double double6 = admin2.getHourlyRate();
        java.lang.String str7 = admin2.getPassword();
        admin2.setVerified(true);
        boolean boolean10 = admin2.isVerified();
        java.lang.String str11 = admin2.getEmail();
        admin2.setVerified(false);
        java.lang.String str14 = admin2.getPassword();
        java.lang.String str15 = admin2.getPassword();
        boolean boolean16 = admin2.isVerified();
        java.lang.String str17 = admin2.getPassword();
        java.lang.String str18 = admin2.getEmail();
        java.lang.String str19 = admin2.getAccountType();
        room.Room room20 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.addRoom(room20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.getRoomID()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "admin" + "'", str19, "admin");
    }

    @Test
    public void test02056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02056");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        admin2.logout();
        java.lang.String str5 = admin2.getAccountType();
        boolean boolean6 = admin2.isVerified();
        admin2.login("hi!", "admin");
        admin2.setVerified(true);
        admin2.viewProfile();
        java.lang.String str13 = admin2.getAccountType();
        double double14 = admin2.getHourlyRate();
        room.Room room15 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.enableRoom(room15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "admin" + "'", str13, "admin");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test02057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02057");
        model.Admin admin2 = new model.Admin("admin", "");
        admin2.setVerified(true);
        java.lang.String str5 = admin2.getAccountType();
        admin2.viewProfile();
        admin2.setVerified(false);
        java.lang.String str9 = admin2.getAccountType();
        room.Room room10 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.disableRoom(room10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "admin" + "'", str9, "admin");
    }

    @Test
    public void test02058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02058");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        admin2.logout();
        java.lang.String str5 = admin2.getAccountType();
        admin2.login("", "");
        java.lang.String str9 = admin2.getPassword();
        admin2.setVerified(false);
        java.lang.String str12 = admin2.getID();
        admin2.logout();
        java.lang.String str14 = admin2.getAccountType();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "admin" + "'", str12, "admin");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "admin" + "'", str14, "admin");
    }

    @Test
    public void test02059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02059");
        model.Admin admin2 = new model.Admin("admin", "admin");
        admin2.login("admin", "admin");
        boolean boolean6 = admin2.isVerified();
        admin2.logout();
        java.lang.String str8 = admin2.getID();
        admin2.logout();
        java.lang.String str10 = admin2.getID();
        admin2.login("hi!", "");
        admin2.login("admin", "hi!");
        java.lang.Class<?> wildcardClass17 = admin2.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "admin" + "'", str8, "admin");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "admin" + "'", str10, "admin");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test02060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02060");
        model.Admin admin2 = new model.Admin("admin", "admin");
        admin2.viewProfile();
        java.lang.String str4 = admin2.getPassword();
        admin2.login("", "");
        boolean boolean8 = admin2.isVerified();
        admin2.login("admin", "hi!");
        admin2.logout();
        admin2.login("hi!", "hi!");
        java.lang.String str16 = admin2.getAccountType();
        double double17 = admin2.getHourlyRate();
        java.lang.String str18 = admin2.getID();
        room.Room room19 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.addRoom(room19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.getRoomID()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "admin" + "'", str4, "admin");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "admin" + "'", str16, "admin");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "admin" + "'", str18, "admin");
    }

    @Test
    public void test02061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02061");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        double double5 = admin2.getHourlyRate();
        double double6 = admin2.getHourlyRate();
        java.lang.String str7 = admin2.getPassword();
        admin2.setVerified(true);
        java.lang.String str10 = admin2.getEmail();
        java.lang.String str11 = admin2.getID();
        java.lang.String str12 = admin2.getID();
        admin2.viewProfile();
        java.lang.String str14 = admin2.getID();
        admin2.viewProfile();
        room.Room room16 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.addRoom(room16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.getRoomID()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "admin" + "'", str11, "admin");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "admin" + "'", str12, "admin");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "admin" + "'", str14, "admin");
    }

    @Test
    public void test02062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02062");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        java.lang.String str5 = admin2.getAccountType();
        double double6 = admin2.getHourlyRate();
        admin2.viewProfile();
        java.lang.String str8 = admin2.getAccountType();
        admin2.logout();
        room.Room room10 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.disableRoom(room10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "admin" + "'", str8, "admin");
    }

    @Test
    public void test02063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02063");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        admin2.logout();
        java.lang.String str5 = admin2.getAccountType();
        boolean boolean6 = admin2.isVerified();
        java.lang.String str7 = admin2.getAccountType();
        admin2.login("", "hi!");
        admin2.login("hi!", "hi!");
        admin2.setVerified(true);
        admin2.setVerified(false);
        admin2.viewProfile();
        room.Room room19 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.addRoom(room19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.getRoomID()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
    }

    @Test
    public void test02064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02064");
        model.Admin admin2 = new model.Admin("admin", "");
        admin2.logout();
        admin2.viewProfile();
        boolean boolean5 = admin2.isVerified();
        admin2.logout();
        java.lang.String str7 = admin2.getID();
        java.lang.String str8 = admin2.getAccountType();
        admin2.login("hi!", "hi!");
        room.Room room12 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.disableRoom(room12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "admin" + "'", str8, "admin");
    }

    @Test
    public void test02065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02065");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getAccountType();
        boolean boolean4 = admin2.isVerified();
        java.lang.String str5 = admin2.getPassword();
        admin2.logout();
        admin2.viewProfile();
        admin2.setVerified(false);
        java.lang.String str10 = admin2.getEmail();
        java.lang.String str11 = admin2.getAccountType();
        admin2.viewProfile();
        room.Room room13 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.addRoom(room13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.getRoomID()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "admin" + "'", str11, "admin");
    }

    @Test
    public void test02066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02066");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        admin2.logout();
        java.lang.String str5 = admin2.getAccountType();
        boolean boolean6 = admin2.isVerified();
        admin2.login("hi!", "admin");
        java.lang.String str10 = admin2.getAccountType();
        admin2.viewProfile();
        double double12 = admin2.getHourlyRate();
        room.Room room13 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.enableRoom(room13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "admin" + "'", str10, "admin");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test02067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02067");
        model.Admin admin2 = new model.Admin("", "");
        java.lang.String str3 = admin2.getAccountType();
        admin2.setVerified(true);
        double double6 = admin2.getHourlyRate();
        admin2.setVerified(false);
        admin2.logout();
        admin2.login("hi!", "");
        admin2.setVerified(true);
        admin2.logout();
        room.Room room16 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.enableRoom(room16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test02068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02068");
        model.Admin admin2 = new model.Admin("admin", "admin");
        admin2.viewProfile();
        java.lang.String str4 = admin2.getID();
        java.lang.String str5 = admin2.getAccountType();
        java.lang.String str6 = admin2.getEmail();
        room.Room room7 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.addRoom(room7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.getRoomID()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "admin" + "'", str4, "admin");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "admin" + "'", str6, "admin");
    }

    @Test
    public void test02069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02069");
        model.Admin admin2 = new model.Admin("admin", "admin");
        admin2.login("admin", "admin");
        admin2.logout();
        java.lang.Class<?> wildcardClass7 = admin2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test02070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02070");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        double double5 = admin2.getHourlyRate();
        double double6 = admin2.getHourlyRate();
        java.lang.String str7 = admin2.getID();
        admin2.viewProfile();
        admin2.logout();
        java.lang.String str10 = admin2.getEmail();
        boolean boolean11 = admin2.isVerified();
        java.lang.String str12 = admin2.getAccountType();
        admin2.login("", "");
        admin2.logout();
        java.lang.String str17 = admin2.getEmail();
        java.lang.Class<?> wildcardClass18 = admin2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "admin" + "'", str12, "admin");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test02071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02071");
        model.Admin admin2 = new model.Admin("admin", "admin");
        admin2.login("admin", "admin");
        boolean boolean6 = admin2.isVerified();
        admin2.logout();
        java.lang.String str8 = admin2.getID();
        admin2.viewProfile();
        admin2.setVerified(false);
        java.lang.String str12 = admin2.getAccountType();
        room.Room room13 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.disableRoom(room13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "admin" + "'", str8, "admin");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "admin" + "'", str12, "admin");
    }

    @Test
    public void test02072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02072");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        double double5 = admin2.getHourlyRate();
        double double6 = admin2.getHourlyRate();
        java.lang.String str7 = admin2.getID();
        boolean boolean8 = admin2.isVerified();
        admin2.login("", "");
        java.lang.String str12 = admin2.getID();
        double double13 = admin2.getHourlyRate();
        room.Room room14 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.disableRoom(room14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "admin" + "'", str12, "admin");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test02073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02073");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        double double5 = admin2.getHourlyRate();
        admin2.setVerified(false);
        java.lang.String str8 = admin2.getID();
        java.lang.String str9 = admin2.getPassword();
        java.lang.Class<?> wildcardClass10 = admin2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "admin" + "'", str8, "admin");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test02074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02074");
        model.Admin admin2 = new model.Admin("", "");
        java.lang.String str3 = admin2.getAccountType();
        java.lang.String str4 = admin2.getEmail();
        double double5 = admin2.getHourlyRate();
        java.lang.String str6 = admin2.getAccountType();
        java.lang.String str7 = admin2.getEmail();
        room.Room room8 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.disableRoom(room8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "admin" + "'", str6, "admin");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test02075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02075");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        double double5 = admin2.getHourlyRate();
        double double6 = admin2.getHourlyRate();
        java.lang.String str7 = admin2.getPassword();
        admin2.setVerified(true);
        boolean boolean10 = admin2.isVerified();
        java.lang.String str11 = admin2.getPassword();
        double double12 = admin2.getHourlyRate();
        admin2.logout();
        double double14 = admin2.getHourlyRate();
        admin2.setVerified(true);
        room.Room room17 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.disableRoom(room17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test02076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02076");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        double double5 = admin2.getHourlyRate();
        double double6 = admin2.getHourlyRate();
        java.lang.String str7 = admin2.getID();
        admin2.viewProfile();
        admin2.logout();
        java.lang.String str10 = admin2.getEmail();
        boolean boolean11 = admin2.isVerified();
        java.lang.String str12 = admin2.getAccountType();
        admin2.login("hi!", "hi!");
        admin2.viewProfile();
        java.lang.String str17 = admin2.getAccountType();
        room.Room room18 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.addRoom(room18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.getRoomID()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "admin" + "'", str12, "admin");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "admin" + "'", str17, "admin");
    }

    @Test
    public void test02077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02077");
        model.Admin admin2 = new model.Admin("admin", "admin");
        admin2.login("admin", "admin");
        boolean boolean6 = admin2.isVerified();
        admin2.viewProfile();
        java.lang.String str8 = admin2.getID();
        java.lang.String str9 = admin2.getPassword();
        double double10 = admin2.getHourlyRate();
        room.Room room11 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.enableRoom(room11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "admin" + "'", str8, "admin");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "admin" + "'", str9, "admin");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test02078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02078");
        model.Admin admin2 = new model.Admin("", "");
        java.lang.String str3 = admin2.getAccountType();
        admin2.setVerified(true);
        double double6 = admin2.getHourlyRate();
        admin2.viewProfile();
        boolean boolean8 = admin2.isVerified();
        java.lang.String str9 = admin2.getID();
        java.lang.String str10 = admin2.getID();
        double double11 = admin2.getHourlyRate();
        boolean boolean12 = admin2.isVerified();
        admin2.logout();
        boolean boolean14 = admin2.isVerified();
        java.lang.String str15 = admin2.getAccountType();
        admin2.logout();
        room.Room room17 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.addRoom(room17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.getRoomID()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "admin" + "'", str9, "admin");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "admin" + "'", str10, "admin");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "admin" + "'", str15, "admin");
    }

    @Test
    public void test02079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02079");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getAccountType();
        boolean boolean4 = admin2.isVerified();
        boolean boolean5 = admin2.isVerified();
        admin2.viewProfile();
        admin2.login("admin", "hi!");
        java.lang.String str10 = admin2.getPassword();
        admin2.login("", "hi!");
        double double14 = admin2.getHourlyRate();
        admin2.viewProfile();
        admin2.viewProfile();
        admin2.logout();
        room.Room room18 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.enableRoom(room18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test02080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02080");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        java.lang.String str5 = admin2.getID();
        java.lang.String str6 = admin2.getID();
        java.lang.String str7 = admin2.getAccountType();
        admin2.viewProfile();
        admin2.viewProfile();
        admin2.viewProfile();
        admin2.login("", "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "admin" + "'", str6, "admin");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
    }

    @Test
    public void test02081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02081");
        model.Admin admin2 = new model.Admin("", "");
        java.lang.String str3 = admin2.getAccountType();
        admin2.setVerified(true);
        double double6 = admin2.getHourlyRate();
        java.lang.String str7 = admin2.getPassword();
        boolean boolean8 = admin2.isVerified();
        java.lang.Class<?> wildcardClass9 = admin2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test02082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02082");
        model.Admin admin2 = new model.Admin("admin", "admin");
        admin2.login("admin", "admin");
        boolean boolean6 = admin2.isVerified();
        admin2.logout();
        admin2.setVerified(false);
        admin2.setVerified(false);
        boolean boolean12 = admin2.isVerified();
        boolean boolean13 = admin2.isVerified();
        room.Room room14 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.enableRoom(room14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test02083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02083");
        model.Admin admin2 = new model.Admin("admin", "");
        admin2.setVerified(true);
        java.lang.String str5 = admin2.getEmail();
        double double6 = admin2.getHourlyRate();
        java.lang.String str7 = admin2.getPassword();
        admin2.viewProfile();
        admin2.login("admin", "");
        java.lang.String str12 = admin2.getID();
        room.Room room13 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.addRoom(room13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.getRoomID()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "admin" + "'", str12, "admin");
    }

    @Test
    public void test02084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02084");
        model.Admin admin2 = new model.Admin("admin", "");
        admin2.setVerified(true);
        boolean boolean5 = admin2.isVerified();
        admin2.logout();
        java.lang.String str7 = admin2.getEmail();
        room.Room room8 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.addRoom(room8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.getRoomID()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
    }

    @Test
    public void test02085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02085");
        model.Admin admin2 = new model.Admin("", "");
        java.lang.String str3 = admin2.getAccountType();
        java.lang.String str4 = admin2.getEmail();
        boolean boolean5 = admin2.isVerified();
        room.Room room6 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.enableRoom(room6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test02086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02086");
        model.Admin admin2 = new model.Admin("admin", "admin");
        admin2.viewProfile();
        java.lang.String str4 = admin2.getID();
        java.lang.String str5 = admin2.getPassword();
        double double6 = admin2.getHourlyRate();
        admin2.setVerified(true);
        admin2.logout();
        admin2.login("hi!", "");
        java.lang.String str13 = admin2.getEmail();
        room.Room room14 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.disableRoom(room14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "admin" + "'", str4, "admin");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "admin" + "'", str13, "admin");
    }

    @Test
    public void test02087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02087");
        model.Admin admin2 = new model.Admin("admin", "admin");
        admin2.viewProfile();
        java.lang.String str4 = admin2.getID();
        java.lang.String str5 = admin2.getAccountType();
        java.lang.Class<?> wildcardClass6 = admin2.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "admin" + "'", str4, "admin");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test02088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02088");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        java.lang.String str4 = admin2.getAccountType();
        java.lang.String str5 = admin2.getID();
        java.lang.String str6 = admin2.getEmail();
        java.lang.String str7 = admin2.getPassword();
        admin2.setVerified(false);
        java.lang.String str10 = admin2.getID();
        java.lang.String str11 = admin2.getID();
        java.lang.String str12 = admin2.getAccountType();
        admin2.setVerified(false);
        room.Room room15 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.disableRoom(room15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "admin" + "'", str4, "admin");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "admin" + "'", str10, "admin");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "admin" + "'", str11, "admin");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "admin" + "'", str12, "admin");
    }

    @Test
    public void test02089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02089");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        admin2.logout();
        java.lang.String str5 = admin2.getAccountType();
        boolean boolean6 = admin2.isVerified();
        admin2.login("hi!", "admin");
        admin2.logout();
        java.lang.String str11 = admin2.getPassword();
        java.lang.String str12 = admin2.getPassword();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test02090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02090");
        model.Admin admin2 = new model.Admin("admin", "");
        admin2.login("hi!", "admin");
        admin2.login("", "");
        java.lang.String str9 = admin2.getEmail();
        admin2.viewProfile();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "admin" + "'", str9, "admin");
    }

    @Test
    public void test02091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02091");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getAccountType();
        boolean boolean4 = admin2.isVerified();
        boolean boolean5 = admin2.isVerified();
        admin2.logout();
        java.lang.String str7 = admin2.getPassword();
        java.lang.Class<?> wildcardClass8 = admin2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test02092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02092");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        double double5 = admin2.getHourlyRate();
        double double6 = admin2.getHourlyRate();
        java.lang.String str7 = admin2.getPassword();
        double double8 = admin2.getHourlyRate();
        admin2.logout();
        java.lang.String str10 = admin2.getPassword();
        java.lang.String str11 = admin2.getEmail();
        admin2.login("hi!", "admin");
        java.lang.String str15 = admin2.getID();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "admin" + "'", str15, "admin");
    }

    @Test
    public void test02093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02093");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getAccountType();
        boolean boolean4 = admin2.isVerified();
        boolean boolean5 = admin2.isVerified();
        java.lang.String str6 = admin2.getID();
        admin2.viewProfile();
        boolean boolean8 = admin2.isVerified();
        double double9 = admin2.getHourlyRate();
        boolean boolean10 = admin2.isVerified();
        room.Room room11 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.enableRoom(room11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "admin" + "'", str6, "admin");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test02094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02094");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getAccountType();
        boolean boolean4 = admin2.isVerified();
        java.lang.String str5 = admin2.getPassword();
        java.lang.String str6 = admin2.getEmail();
        admin2.login("", "");
        double double10 = admin2.getHourlyRate();
        java.lang.Class<?> wildcardClass11 = admin2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test02095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02095");
        model.Admin admin2 = new model.Admin("admin", "admin");
        admin2.viewProfile();
        java.lang.String str4 = admin2.getPassword();
        admin2.login("", "");
        java.lang.String str8 = admin2.getEmail();
        java.lang.String str9 = admin2.getAccountType();
        java.lang.String str10 = admin2.getPassword();
        java.lang.String str11 = admin2.getID();
        admin2.viewProfile();
        java.lang.Class<?> wildcardClass13 = admin2.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "admin" + "'", str4, "admin");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "admin" + "'", str8, "admin");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "admin" + "'", str9, "admin");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "admin" + "'", str10, "admin");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "admin" + "'", str11, "admin");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test02096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02096");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getPassword();
        boolean boolean4 = admin2.isVerified();
        java.lang.String str5 = admin2.getID();
        java.lang.String str6 = admin2.getEmail();
        java.lang.String str7 = admin2.getAccountType();
        java.lang.String str8 = admin2.getEmail();
        room.Room room9 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.disableRoom(room9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test02097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02097");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        java.lang.String str4 = admin2.getAccountType();
        java.lang.String str5 = admin2.getPassword();
        admin2.logout();
        boolean boolean7 = admin2.isVerified();
        admin2.setVerified(true);
        java.lang.String str10 = admin2.getEmail();
        java.lang.String str11 = admin2.getAccountType();
        java.lang.String str12 = admin2.getID();
        java.lang.String str13 = admin2.getAccountType();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "admin" + "'", str4, "admin");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "admin" + "'", str11, "admin");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "admin" + "'", str12, "admin");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "admin" + "'", str13, "admin");
    }

    @Test
    public void test02098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02098");
        model.Admin admin2 = new model.Admin("admin", "admin");
        admin2.login("admin", "admin");
        boolean boolean6 = admin2.isVerified();
        admin2.logout();
        java.lang.String str8 = admin2.getID();
        admin2.viewProfile();
        admin2.setVerified(false);
        admin2.login("", "admin");
        java.lang.Class<?> wildcardClass15 = admin2.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "admin" + "'", str8, "admin");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test02099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02099");
        model.Admin admin2 = new model.Admin("admin", "");
        admin2.logout();
        double double4 = admin2.getHourlyRate();
        admin2.setVerified(false);
        double double7 = admin2.getHourlyRate();
        java.lang.String str8 = admin2.getID();
        admin2.logout();
        admin2.viewProfile();
        java.lang.String str11 = admin2.getAccountType();
        admin2.setVerified(true);
        room.Room room14 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.addRoom(room14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.getRoomID()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "admin" + "'", str8, "admin");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "admin" + "'", str11, "admin");
    }

    @Test
    public void test02100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02100");
        model.Admin admin2 = new model.Admin("admin", "admin");
        admin2.viewProfile();
        java.lang.String str4 = admin2.getPassword();
        admin2.login("", "");
        boolean boolean8 = admin2.isVerified();
        admin2.setVerified(true);
        admin2.setVerified(false);
        admin2.setVerified(false);
        admin2.viewProfile();
        admin2.login("hi!", "");
        admin2.logout();
        java.lang.String str20 = admin2.getPassword();
        room.Room room21 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.enableRoom(room21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "admin" + "'", str4, "admin");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "admin" + "'", str20, "admin");
    }

    @Test
    public void test02101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02101");
        model.Admin admin2 = new model.Admin("", "");
        java.lang.String str3 = admin2.getAccountType();
        admin2.setVerified(true);
        double double6 = admin2.getHourlyRate();
        admin2.viewProfile();
        boolean boolean8 = admin2.isVerified();
        java.lang.String str9 = admin2.getID();
        java.lang.String str10 = admin2.getID();
        double double11 = admin2.getHourlyRate();
        boolean boolean12 = admin2.isVerified();
        admin2.logout();
        boolean boolean14 = admin2.isVerified();
        java.lang.String str15 = admin2.getPassword();
        java.lang.Class<?> wildcardClass16 = admin2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "admin" + "'", str9, "admin");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "admin" + "'", str10, "admin");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test02102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02102");
        model.Admin admin2 = new model.Admin("admin", "admin");
        admin2.viewProfile();
        java.lang.String str4 = admin2.getPassword();
        java.lang.String str5 = admin2.getID();
        double double6 = admin2.getHourlyRate();
        admin2.setVerified(false);
        java.lang.Class<?> wildcardClass9 = admin2.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "admin" + "'", str4, "admin");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test02103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02103");
        model.Admin admin2 = new model.Admin("admin", "");
        admin2.setVerified(true);
        java.lang.String str5 = admin2.getAccountType();
        java.lang.String str6 = admin2.getAccountType();
        java.lang.String str7 = admin2.getEmail();
        java.lang.String str8 = admin2.getPassword();
        room.Room room9 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.addRoom(room9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.getRoomID()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "admin" + "'", str6, "admin");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test02104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02104");
        model.Admin admin2 = new model.Admin("admin", "");
        admin2.setVerified(true);
        java.lang.String str5 = admin2.getEmail();
        double double6 = admin2.getHourlyRate();
        java.lang.String str7 = admin2.getPassword();
        java.lang.String str8 = admin2.getEmail();
        admin2.viewProfile();
        java.lang.String str10 = admin2.getPassword();
        java.lang.String str11 = admin2.getPassword();
        java.lang.Class<?> wildcardClass12 = admin2.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "admin" + "'", str8, "admin");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test02105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02105");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        double double5 = admin2.getHourlyRate();
        double double6 = admin2.getHourlyRate();
        java.lang.String str7 = admin2.getID();
        boolean boolean8 = admin2.isVerified();
        admin2.login("", "");
        admin2.viewProfile();
        boolean boolean13 = admin2.isVerified();
        boolean boolean14 = admin2.isVerified();
        java.lang.String str15 = admin2.getAccountType();
        double double16 = admin2.getHourlyRate();
        java.lang.String str17 = admin2.getID();
        room.Room room18 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.addRoom(room18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.getRoomID()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "admin" + "'", str15, "admin");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "admin" + "'", str17, "admin");
    }

    @Test
    public void test02106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02106");
        model.Admin admin2 = new model.Admin("", "");
        java.lang.String str3 = admin2.getAccountType();
        boolean boolean4 = admin2.isVerified();
        admin2.setVerified(false);
        boolean boolean7 = admin2.isVerified();
        double double8 = admin2.getHourlyRate();
        java.lang.String str9 = admin2.getPassword();
        room.Room room10 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.enableRoom(room10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test02107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02107");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        admin2.logout();
        admin2.setVerified(false);
        java.lang.String str6 = admin2.getEmail();
        admin2.viewProfile();
        admin2.viewProfile();
        double double9 = admin2.getHourlyRate();
        admin2.setVerified(false);
        java.lang.String str12 = admin2.getEmail();
        admin2.login("", "hi!");
        room.Room room16 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.enableRoom(room16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test02108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02108");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        double double5 = admin2.getHourlyRate();
        double double6 = admin2.getHourlyRate();
        admin2.setVerified(true);
        java.lang.String str9 = admin2.getEmail();
        admin2.login("hi!", "");
        admin2.login("admin", "");
        java.lang.String str16 = admin2.getPassword();
        admin2.viewProfile();
        room.Room room18 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.disableRoom(room18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test02109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02109");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        double double5 = admin2.getHourlyRate();
        double double6 = admin2.getHourlyRate();
        java.lang.String str7 = admin2.getID();
        admin2.login("", "admin");
        admin2.viewProfile();
        admin2.setVerified(true);
        room.Room room14 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.disableRoom(room14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
    }

    @Test
    public void test02110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02110");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        double double5 = admin2.getHourlyRate();
        double double6 = admin2.getHourlyRate();
        java.lang.String str7 = admin2.getPassword();
        admin2.setVerified(true);
        java.lang.String str10 = admin2.getEmail();
        java.lang.String str11 = admin2.getID();
        boolean boolean12 = admin2.isVerified();
        admin2.login("hi!", "hi!");
        admin2.setVerified(false);
        admin2.login("", "hi!");
        java.lang.String str21 = admin2.getEmail();
        room.Room room22 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.disableRoom(room22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "admin" + "'", str11, "admin");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
    }

    @Test
    public void test02111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02111");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        double double5 = admin2.getHourlyRate();
        double double6 = admin2.getHourlyRate();
        java.lang.String str7 = admin2.getID();
        admin2.viewProfile();
        admin2.logout();
        admin2.setVerified(false);
        java.lang.String str12 = admin2.getEmail();
        admin2.login("", "");
        java.lang.String str16 = admin2.getPassword();
        admin2.setVerified(false);
        room.Room room19 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.addRoom(room19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.getRoomID()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test02112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02112");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        java.lang.String str5 = admin2.getID();
        admin2.setVerified(false);
        double double8 = admin2.getHourlyRate();
        double double9 = admin2.getHourlyRate();
        admin2.setVerified(false);
        boolean boolean12 = admin2.isVerified();
        java.lang.String str13 = admin2.getPassword();
        room.Room room14 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.addRoom(room14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.getRoomID()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test02113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02113");
        model.Admin admin2 = new model.Admin("hi!", "");
        java.lang.String str3 = admin2.getEmail();
        admin2.login("", "admin");
        boolean boolean7 = admin2.isVerified();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test02114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02114");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        admin2.logout();
        java.lang.String str5 = admin2.getAccountType();
        java.lang.String str6 = admin2.getEmail();
        java.lang.String str7 = admin2.getPassword();
        admin2.logout();
        java.lang.String str9 = admin2.getAccountType();
        admin2.login("admin", "admin");
        room.Room room13 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.disableRoom(room13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "admin" + "'", str9, "admin");
    }

    @Test
    public void test02115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02115");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        admin2.logout();
        java.lang.String str5 = admin2.getAccountType();
        admin2.viewProfile();
        admin2.setVerified(false);
        double double9 = admin2.getHourlyRate();
        java.lang.String str10 = admin2.getAccountType();
        java.lang.String str11 = admin2.getPassword();
        boolean boolean12 = admin2.isVerified();
        java.lang.Class<?> wildcardClass13 = admin2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "admin" + "'", str10, "admin");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test02116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02116");
        model.Admin admin2 = new model.Admin("admin", "admin");
        admin2.login("admin", "admin");
        boolean boolean6 = admin2.isVerified();
        admin2.logout();
        java.lang.String str8 = admin2.getID();
        admin2.setVerified(true);
        java.lang.String str11 = admin2.getEmail();
        boolean boolean12 = admin2.isVerified();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "admin" + "'", str8, "admin");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "admin" + "'", str11, "admin");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test02117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02117");
        model.Admin admin2 = new model.Admin("", "");
        java.lang.String str3 = admin2.getAccountType();
        java.lang.String str4 = admin2.getEmail();
        double double5 = admin2.getHourlyRate();
        admin2.viewProfile();
        boolean boolean7 = admin2.isVerified();
        admin2.logout();
        boolean boolean9 = admin2.isVerified();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test02118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02118");
        model.Admin admin2 = new model.Admin("hi!", "admin");
        java.lang.String str3 = admin2.getID();
        admin2.setVerified(true);
        admin2.setVerified(false);
        room.Room room8 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.enableRoom(room8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
    }

    @Test
    public void test02119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02119");
        model.Admin admin2 = new model.Admin("", "");
        java.lang.String str3 = admin2.getAccountType();
        admin2.setVerified(true);
        double double6 = admin2.getHourlyRate();
        admin2.viewProfile();
        boolean boolean8 = admin2.isVerified();
        java.lang.String str9 = admin2.getID();
        admin2.login("admin", "");
        admin2.viewProfile();
        java.lang.String str14 = admin2.getEmail();
        java.lang.String str15 = admin2.getPassword();
        room.Room room16 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.enableRoom(room16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "admin" + "'", str9, "admin");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test02120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02120");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        admin2.logout();
        java.lang.String str4 = admin2.getAccountType();
        admin2.logout();
        admin2.login("hi!", "admin");
        admin2.viewProfile();
        room.Room room10 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.enableRoom(room10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "admin" + "'", str4, "admin");
    }

    @Test
    public void test02121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02121");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getAccountType();
        java.lang.String str4 = admin2.getPassword();
        admin2.setVerified(true);
        java.lang.String str7 = admin2.getEmail();
        admin2.viewProfile();
        admin2.logout();
        room.Room room10 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.addRoom(room10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.getRoomID()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test02122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02122");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        admin2.logout();
        java.lang.String str5 = admin2.getAccountType();
        admin2.viewProfile();
        admin2.login("hi!", "admin");
        java.lang.String str10 = admin2.getAccountType();
        java.lang.String str11 = admin2.getID();
        java.lang.Class<?> wildcardClass12 = admin2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "admin" + "'", str10, "admin");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "admin" + "'", str11, "admin");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test02123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02123");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        java.lang.String str4 = admin2.getPassword();
        java.lang.String str5 = admin2.getAccountType();
        admin2.viewProfile();
        double double7 = admin2.getHourlyRate();
        java.lang.String str8 = admin2.getID();
        java.lang.String str9 = admin2.getAccountType();
        java.lang.String str10 = admin2.getPassword();
        admin2.logout();
        java.lang.String str12 = admin2.getAccountType();
        boolean boolean13 = admin2.isVerified();
        admin2.logout();
        room.Room room15 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.enableRoom(room15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "admin" + "'", str8, "admin");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "admin" + "'", str9, "admin");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "admin" + "'", str12, "admin");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test02124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02124");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        java.lang.String str4 = admin2.getAccountType();
        java.lang.String str5 = admin2.getPassword();
        admin2.setVerified(true);
        admin2.login("", "");
        java.lang.String str11 = admin2.getID();
        java.lang.String str12 = admin2.getID();
        room.Room room13 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.addRoom(room13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.getRoomID()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "admin" + "'", str4, "admin");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "admin" + "'", str11, "admin");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "admin" + "'", str12, "admin");
    }

    @Test
    public void test02125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02125");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        admin2.setVerified(true);
        java.lang.String str5 = admin2.getPassword();
        room.Room room6 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.addRoom(room6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.getRoomID()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test02126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02126");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        double double5 = admin2.getHourlyRate();
        double double6 = admin2.getHourlyRate();
        java.lang.String str7 = admin2.getID();
        admin2.viewProfile();
        double double9 = admin2.getHourlyRate();
        java.lang.String str10 = admin2.getAccountType();
        double double11 = admin2.getHourlyRate();
        java.lang.Class<?> wildcardClass12 = admin2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "admin" + "'", str10, "admin");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test02127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02127");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        double double5 = admin2.getHourlyRate();
        double double6 = admin2.getHourlyRate();
        java.lang.String str7 = admin2.getID();
        admin2.viewProfile();
        admin2.logout();
        java.lang.String str10 = admin2.getEmail();
        boolean boolean11 = admin2.isVerified();
        java.lang.String str12 = admin2.getAccountType();
        admin2.login("", "");
        admin2.setVerified(false);
        admin2.viewProfile();
        room.Room room19 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.addRoom(room19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.getRoomID()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "admin" + "'", str12, "admin");
    }

    @Test
    public void test02128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02128");
        model.Admin admin2 = new model.Admin("admin", "admin");
        admin2.login("admin", "admin");
        boolean boolean6 = admin2.isVerified();
        admin2.logout();
        java.lang.String str8 = admin2.getID();
        admin2.logout();
        admin2.viewProfile();
        java.lang.String str11 = admin2.getPassword();
        admin2.logout();
        java.lang.Class<?> wildcardClass13 = admin2.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "admin" + "'", str8, "admin");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "admin" + "'", str11, "admin");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test02129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02129");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getAccountType();
        boolean boolean4 = admin2.isVerified();
        boolean boolean5 = admin2.isVerified();
        admin2.viewProfile();
        admin2.login("admin", "hi!");
        java.lang.String str10 = admin2.getPassword();
        admin2.login("", "hi!");
        double double14 = admin2.getHourlyRate();
        java.lang.String str15 = admin2.getID();
        java.lang.String str16 = admin2.getID();
        admin2.logout();
        java.lang.Class<?> wildcardClass18 = admin2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "admin" + "'", str15, "admin");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "admin" + "'", str16, "admin");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test02130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02130");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        double double5 = admin2.getHourlyRate();
        double double6 = admin2.getHourlyRate();
        java.lang.String str7 = admin2.getID();
        boolean boolean8 = admin2.isVerified();
        admin2.login("", "");
        admin2.login("", "hi!");
        admin2.setVerified(true);
        java.lang.String str17 = admin2.getAccountType();
        room.Room room18 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.enableRoom(room18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "admin" + "'", str17, "admin");
    }

    @Test
    public void test02131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02131");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        double double5 = admin2.getHourlyRate();
        double double6 = admin2.getHourlyRate();
        java.lang.String str7 = admin2.getID();
        boolean boolean8 = admin2.isVerified();
        admin2.login("", "");
        admin2.login("", "hi!");
        admin2.setVerified(true);
        java.lang.String str17 = admin2.getAccountType();
        room.Room room18 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.disableRoom(room18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "admin" + "'", str17, "admin");
    }

    @Test
    public void test02132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02132");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        double double5 = admin2.getHourlyRate();
        double double6 = admin2.getHourlyRate();
        java.lang.String str7 = admin2.getPassword();
        admin2.logout();
        admin2.setVerified(true);
        admin2.logout();
        room.Room room12 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.disableRoom(room12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test02133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02133");
        model.Admin admin2 = new model.Admin("", "");
        java.lang.String str3 = admin2.getAccountType();
        admin2.setVerified(true);
        double double6 = admin2.getHourlyRate();
        admin2.viewProfile();
        boolean boolean8 = admin2.isVerified();
        java.lang.String str9 = admin2.getID();
        java.lang.String str10 = admin2.getID();
        double double11 = admin2.getHourlyRate();
        boolean boolean12 = admin2.isVerified();
        admin2.logout();
        boolean boolean14 = admin2.isVerified();
        java.lang.String str15 = admin2.getAccountType();
        admin2.logout();
        admin2.logout();
        room.Room room18 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.addRoom(room18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.getRoomID()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "admin" + "'", str9, "admin");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "admin" + "'", str10, "admin");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "admin" + "'", str15, "admin");
    }

    @Test
    public void test02134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02134");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        double double5 = admin2.getHourlyRate();
        double double6 = admin2.getHourlyRate();
        admin2.setVerified(true);
        java.lang.String str9 = admin2.getID();
        java.lang.String str10 = admin2.getEmail();
        admin2.logout();
        boolean boolean12 = admin2.isVerified();
        java.lang.String str13 = admin2.getEmail();
        java.lang.Class<?> wildcardClass14 = admin2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "admin" + "'", str9, "admin");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test02135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02135");
        model.Admin admin2 = new model.Admin("admin", "admin");
        boolean boolean3 = admin2.isVerified();
        admin2.login("hi!", "");
        java.lang.String str7 = admin2.getEmail();
        admin2.setVerified(false);
        admin2.login("", "");
        room.Room room13 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.addRoom(room13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.getRoomID()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
    }

    @Test
    public void test02136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02136");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        double double5 = admin2.getHourlyRate();
        double double6 = admin2.getHourlyRate();
        admin2.setVerified(true);
        java.lang.String str9 = admin2.getEmail();
        java.lang.String str10 = admin2.getEmail();
        boolean boolean11 = admin2.isVerified();
        java.lang.String str12 = admin2.getEmail();
        double double13 = admin2.getHourlyRate();
        double double14 = admin2.getHourlyRate();
        room.Room room15 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.addRoom(room15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.getRoomID()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test02137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02137");
        model.Admin admin2 = new model.Admin("", "");
        java.lang.String str3 = admin2.getAccountType();
        java.lang.String str4 = admin2.getEmail();
        boolean boolean5 = admin2.isVerified();
        room.Room room6 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.addRoom(room6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.getRoomID()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test02138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02138");
        model.Admin admin2 = new model.Admin("admin", "admin");
        admin2.login("admin", "admin");
        boolean boolean6 = admin2.isVerified();
        admin2.logout();
        java.lang.String str8 = admin2.getPassword();
        java.lang.String str9 = admin2.getID();
        boolean boolean10 = admin2.isVerified();
        java.lang.String str11 = admin2.getID();
        room.Room room12 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.addRoom(room12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.getRoomID()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "admin" + "'", str8, "admin");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "admin" + "'", str9, "admin");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "admin" + "'", str11, "admin");
    }

    @Test
    public void test02139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02139");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        admin2.logout();
        java.lang.String str5 = admin2.getAccountType();
        admin2.login("", "");
        java.lang.String str9 = admin2.getPassword();
        admin2.setVerified(false);
        admin2.login("", "");
        java.lang.String str15 = admin2.getAccountType();
        java.lang.String str16 = admin2.getEmail();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "admin" + "'", str15, "admin");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test02140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02140");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getAccountType();
        java.lang.String str4 = admin2.getPassword();
        admin2.setVerified(true);
        double double7 = admin2.getHourlyRate();
        admin2.viewProfile();
        java.lang.Class<?> wildcardClass9 = admin2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test02141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02141");
        model.Admin admin2 = new model.Admin("admin", "");
        admin2.setVerified(true);
        java.lang.String str5 = admin2.getEmail();
        double double6 = admin2.getHourlyRate();
        admin2.viewProfile();
        admin2.viewProfile();
        java.lang.String str9 = admin2.getEmail();
        java.lang.String str10 = admin2.getPassword();
        admin2.logout();
        java.lang.String str12 = admin2.getPassword();
        admin2.setVerified(false);
        room.Room room15 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.disableRoom(room15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "admin" + "'", str9, "admin");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test02142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02142");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        admin2.logout();
        java.lang.String str4 = admin2.getAccountType();
        java.lang.String str5 = admin2.getEmail();
        java.lang.Class<?> wildcardClass6 = admin2.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "admin" + "'", str4, "admin");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test02143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02143");
        model.Admin admin2 = new model.Admin("admin", "admin");
        boolean boolean3 = admin2.isVerified();
        java.lang.String str4 = admin2.getPassword();
        java.lang.String str5 = admin2.getPassword();
        admin2.setVerified(true);
        room.Room room8 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.enableRoom(room8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "admin" + "'", str4, "admin");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
    }

    @Test
    public void test02144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02144");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        admin2.logout();
        java.lang.String str5 = admin2.getAccountType();
        boolean boolean6 = admin2.isVerified();
        admin2.login("hi!", "admin");
        java.lang.String str10 = admin2.getAccountType();
        java.lang.String str11 = admin2.getEmail();
        admin2.logout();
        admin2.login("", "");
        admin2.viewProfile();
        boolean boolean17 = admin2.isVerified();
        room.Room room18 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.enableRoom(room18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "admin" + "'", str10, "admin");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test02145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02145");
        model.Admin admin2 = new model.Admin("admin", "");
        admin2.setVerified(true);
        java.lang.String str5 = admin2.getEmail();
        double double6 = admin2.getHourlyRate();
        admin2.viewProfile();
        admin2.viewProfile();
        admin2.viewProfile();
        java.lang.String str10 = admin2.getEmail();
        room.Room room11 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.disableRoom(room11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "admin" + "'", str10, "admin");
    }

    @Test
    public void test02146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02146");
        model.Admin admin2 = new model.Admin("admin", "admin");
        admin2.logout();
        double double4 = admin2.getHourlyRate();
        admin2.logout();
        admin2.setVerified(false);
        double double8 = admin2.getHourlyRate();
        room.Room room9 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.addRoom(room9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.getRoomID()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test02147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02147");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        admin2.logout();
        java.lang.String str5 = admin2.getAccountType();
        admin2.login("", "");
        java.lang.String str9 = admin2.getID();
        java.lang.String str10 = admin2.getEmail();
        java.lang.String str11 = admin2.getAccountType();
        admin2.logout();
        admin2.setVerified(false);
        java.lang.String str15 = admin2.getEmail();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "admin" + "'", str9, "admin");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "admin" + "'", str11, "admin");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test02148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02148");
        model.Admin admin2 = new model.Admin("admin", "admin");
        admin2.viewProfile();
        java.lang.String str4 = admin2.getPassword();
        admin2.login("", "");
        java.lang.String str8 = admin2.getEmail();
        java.lang.String str9 = admin2.getAccountType();
        admin2.login("", "");
        admin2.setVerified(false);
        double double15 = admin2.getHourlyRate();
        room.Room room16 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.enableRoom(room16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "admin" + "'", str4, "admin");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "admin" + "'", str8, "admin");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "admin" + "'", str9, "admin");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test02149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02149");
        model.Admin admin2 = new model.Admin("admin", "admin");
        admin2.login("admin", "admin");
        boolean boolean6 = admin2.isVerified();
        admin2.logout();
        java.lang.String str8 = admin2.getID();
        admin2.viewProfile();
        java.lang.String str10 = admin2.getID();
        admin2.login("", "admin");
        java.lang.String str14 = admin2.getEmail();
        room.Room room15 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.addRoom(room15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.getRoomID()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "admin" + "'", str8, "admin");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "admin" + "'", str10, "admin");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "admin" + "'", str14, "admin");
    }

    @Test
    public void test02150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02150");
        model.Admin admin2 = new model.Admin("admin", "admin");
        boolean boolean3 = admin2.isVerified();
        admin2.login("hi!", "");
        double double7 = admin2.getHourlyRate();
        admin2.viewProfile();
        java.lang.String str9 = admin2.getPassword();
        admin2.logout();
        admin2.login("admin", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "admin" + "'", str9, "admin");
    }

    @Test
    public void test02151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02151");
        model.Admin admin2 = new model.Admin("admin", "");
        admin2.logout();
        double double4 = admin2.getHourlyRate();
        admin2.setVerified(false);
        double double7 = admin2.getHourlyRate();
        boolean boolean8 = admin2.isVerified();
        boolean boolean9 = admin2.isVerified();
        java.lang.Class<?> wildcardClass10 = admin2.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test02152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02152");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getPassword();
        java.lang.String str4 = admin2.getID();
        room.Room room5 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.disableRoom(room5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "admin" + "'", str4, "admin");
    }

    @Test
    public void test02153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02153");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        admin2.logout();
        java.lang.String str5 = admin2.getAccountType();
        boolean boolean6 = admin2.isVerified();
        admin2.login("hi!", "");
        java.lang.String str10 = admin2.getEmail();
        java.lang.String str11 = admin2.getAccountType();
        java.lang.String str12 = admin2.getAccountType();
        double double13 = admin2.getHourlyRate();
        java.lang.String str14 = admin2.getPassword();
        java.lang.Class<?> wildcardClass15 = admin2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "admin" + "'", str11, "admin");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "admin" + "'", str12, "admin");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test02154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02154");
        model.Admin admin2 = new model.Admin("admin", "admin");
        admin2.viewProfile();
        java.lang.String str4 = admin2.getPassword();
        double double5 = admin2.getHourlyRate();
        java.lang.String str6 = admin2.getAccountType();
        admin2.login("hi!", "admin");
        admin2.login("admin", "hi!");
        admin2.logout();
        java.lang.String str14 = admin2.getEmail();
        java.lang.Class<?> wildcardClass15 = admin2.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "admin" + "'", str4, "admin");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "admin" + "'", str6, "admin");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "admin" + "'", str14, "admin");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test02155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02155");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        admin2.logout();
        java.lang.String str5 = admin2.getAccountType();
        boolean boolean6 = admin2.isVerified();
        admin2.login("hi!", "");
        java.lang.String str10 = admin2.getEmail();
        admin2.login("hi!", "hi!");
        admin2.logout();
        admin2.viewProfile();
        admin2.setVerified(true);
        java.lang.String str18 = admin2.getAccountType();
        java.lang.Class<?> wildcardClass19 = admin2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "admin" + "'", str18, "admin");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test02156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02156");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        double double5 = admin2.getHourlyRate();
        double double6 = admin2.getHourlyRate();
        java.lang.String str7 = admin2.getID();
        admin2.viewProfile();
        double double9 = admin2.getHourlyRate();
        admin2.viewProfile();
        admin2.logout();
        room.Room room12 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.addRoom(room12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.getRoomID()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test02157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02157");
        model.Admin admin2 = new model.Admin("", "");
        java.lang.String str3 = admin2.getAccountType();
        admin2.setVerified(true);
        double double6 = admin2.getHourlyRate();
        admin2.setVerified(false);
        java.lang.String str9 = admin2.getEmail();
        java.lang.String str10 = admin2.getPassword();
        java.lang.String str11 = admin2.getPassword();
        admin2.logout();
        admin2.setVerified(false);
        room.Room room15 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.disableRoom(room15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test02158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02158");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        java.lang.String str4 = admin2.getEmail();
        admin2.logout();
        admin2.logout();
        java.lang.String str7 = admin2.getPassword();
        java.lang.String str8 = admin2.getAccountType();
        java.lang.String str9 = admin2.getEmail();
        room.Room room10 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.enableRoom(room10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "admin" + "'", str8, "admin");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test02159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02159");
        model.Admin admin2 = new model.Admin("admin", "admin");
        admin2.login("admin", "admin");
        boolean boolean6 = admin2.isVerified();
        admin2.logout();
        java.lang.String str8 = admin2.getID();
        admin2.logout();
        java.lang.String str10 = admin2.getID();
        boolean boolean11 = admin2.isVerified();
        java.lang.String str12 = admin2.getEmail();
        room.Room room13 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.addRoom(room13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.getRoomID()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "admin" + "'", str8, "admin");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "admin" + "'", str10, "admin");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "admin" + "'", str12, "admin");
    }

    @Test
    public void test02160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02160");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        admin2.logout();
        java.lang.String str5 = admin2.getAccountType();
        java.lang.String str6 = admin2.getEmail();
        java.lang.String str7 = admin2.getID();
        admin2.login("admin", "admin");
        room.Room room11 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.enableRoom(room11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
    }

    @Test
    public void test02161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02161");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        java.lang.String str5 = admin2.getID();
        java.lang.String str6 = admin2.getID();
        java.lang.String str7 = admin2.getAccountType();
        admin2.viewProfile();
        java.lang.String str9 = admin2.getEmail();
        java.lang.String str10 = admin2.getPassword();
        java.lang.String str11 = admin2.getEmail();
        admin2.setVerified(true);
        java.lang.String str14 = admin2.getAccountType();
        admin2.setVerified(false);
        java.lang.String str17 = admin2.getID();
        admin2.setVerified(true);
        room.Room room20 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.addRoom(room20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.getRoomID()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "admin" + "'", str6, "admin");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "admin" + "'", str14, "admin");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "admin" + "'", str17, "admin");
    }

    @Test
    public void test02162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02162");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        admin2.logout();
        java.lang.String str5 = admin2.getAccountType();
        admin2.viewProfile();
        admin2.setVerified(false);
        java.lang.String str9 = admin2.getEmail();
        admin2.setVerified(false);
        java.lang.String str12 = admin2.getID();
        admin2.login("admin", "admin");
        java.lang.Class<?> wildcardClass16 = admin2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "admin" + "'", str12, "admin");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test02163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02163");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        double double5 = admin2.getHourlyRate();
        double double6 = admin2.getHourlyRate();
        java.lang.String str7 = admin2.getID();
        admin2.viewProfile();
        admin2.logout();
        admin2.setVerified(false);
        java.lang.String str12 = admin2.getEmail();
        boolean boolean13 = admin2.isVerified();
        admin2.setVerified(true);
        double double16 = admin2.getHourlyRate();
        double double17 = admin2.getHourlyRate();
        room.Room room18 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.enableRoom(room18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
    }

    @Test
    public void test02164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02164");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        double double5 = admin2.getHourlyRate();
        double double6 = admin2.getHourlyRate();
        java.lang.String str7 = admin2.getPassword();
        admin2.setVerified(true);
        java.lang.String str10 = admin2.getEmail();
        java.lang.String str11 = admin2.getID();
        boolean boolean12 = admin2.isVerified();
        admin2.login("hi!", "hi!");
        double double16 = admin2.getHourlyRate();
        admin2.login("", "admin");
        room.Room room20 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.enableRoom(room20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "admin" + "'", str11, "admin");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
    }

    @Test
    public void test02165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02165");
        model.Admin admin2 = new model.Admin("admin", "admin");
        admin2.login("admin", "admin");
        boolean boolean6 = admin2.isVerified();
        admin2.logout();
        java.lang.String str8 = admin2.getID();
        admin2.viewProfile();
        admin2.logout();
        double double11 = admin2.getHourlyRate();
        admin2.setVerified(false);
        admin2.setVerified(false);
        room.Room room16 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.enableRoom(room16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "admin" + "'", str8, "admin");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test02166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02166");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        double double5 = admin2.getHourlyRate();
        admin2.setVerified(true);
        admin2.logout();
        admin2.setVerified(false);
        admin2.viewProfile();
        admin2.logout();
        admin2.login("hi!", "");
        room.Room room16 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.disableRoom(room16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test02167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02167");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        admin2.logout();
        java.lang.String str5 = admin2.getAccountType();
        boolean boolean6 = admin2.isVerified();
        admin2.login("hi!", "");
        java.lang.String str10 = admin2.getID();
        room.Room room11 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.addRoom(room11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.getRoomID()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "admin" + "'", str10, "admin");
    }

    @Test
    public void test02168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02168");
        model.Admin admin2 = new model.Admin("admin", "");
        admin2.setVerified(true);
        java.lang.String str5 = admin2.getEmail();
        double double6 = admin2.getHourlyRate();
        java.lang.String str7 = admin2.getPassword();
        java.lang.String str8 = admin2.getEmail();
        admin2.viewProfile();
        admin2.setVerified(false);
        room.Room room12 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.disableRoom(room12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "admin" + "'", str8, "admin");
    }

    @Test
    public void test02169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02169");
        model.Admin admin2 = new model.Admin("admin", "admin");
        admin2.viewProfile();
        java.lang.String str4 = admin2.getPassword();
        admin2.login("", "");
        java.lang.String str8 = admin2.getEmail();
        java.lang.String str9 = admin2.getAccountType();
        java.lang.String str10 = admin2.getPassword();
        admin2.logout();
        java.lang.String str12 = admin2.getID();
        room.Room room13 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.addRoom(room13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.getRoomID()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "admin" + "'", str4, "admin");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "admin" + "'", str8, "admin");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "admin" + "'", str9, "admin");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "admin" + "'", str10, "admin");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "admin" + "'", str12, "admin");
    }

    @Test
    public void test02170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02170");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        double double5 = admin2.getHourlyRate();
        double double6 = admin2.getHourlyRate();
        java.lang.String str7 = admin2.getID();
        admin2.viewProfile();
        admin2.logout();
        admin2.setVerified(false);
        java.lang.String str12 = admin2.getEmail();
        boolean boolean13 = admin2.isVerified();
        admin2.viewProfile();
        admin2.setVerified(true);
        room.Room room17 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.enableRoom(room17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test02171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02171");
        model.Admin admin2 = new model.Admin("admin", "admin");
        admin2.viewProfile();
        java.lang.String str4 = admin2.getPassword();
        admin2.login("", "");
        admin2.viewProfile();
        admin2.login("", "admin");
        java.lang.String str12 = admin2.getEmail();
        admin2.login("hi!", "hi!");
        admin2.setVerified(true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "admin" + "'", str4, "admin");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "admin" + "'", str12, "admin");
    }

    @Test
    public void test02172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02172");
        model.Admin admin2 = new model.Admin("", "admin");
        java.lang.String str3 = admin2.getEmail();
        java.lang.String str4 = admin2.getPassword();
        java.lang.String str5 = admin2.getID();
        room.Room room6 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.enableRoom(room6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "admin" + "'", str4, "admin");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
    }

    @Test
    public void test02173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02173");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        double double5 = admin2.getHourlyRate();
        double double6 = admin2.getHourlyRate();
        java.lang.String str7 = admin2.getPassword();
        admin2.setVerified(true);
        boolean boolean10 = admin2.isVerified();
        java.lang.String str11 = admin2.getEmail();
        admin2.setVerified(false);
        java.lang.String str14 = admin2.getPassword();
        java.lang.String str15 = admin2.getAccountType();
        room.Room room16 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.enableRoom(room16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "admin" + "'", str15, "admin");
    }

    @Test
    public void test02174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02174");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        double double5 = admin2.getHourlyRate();
        double double6 = admin2.getHourlyRate();
        java.lang.String str7 = admin2.getID();
        admin2.viewProfile();
        admin2.logout();
        java.lang.String str10 = admin2.getEmail();
        boolean boolean11 = admin2.isVerified();
        java.lang.String str12 = admin2.getAccountType();
        admin2.logout();
        java.lang.String str14 = admin2.getID();
        admin2.setVerified(true);
        room.Room room17 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.addRoom(room17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.getRoomID()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "admin" + "'", str12, "admin");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "admin" + "'", str14, "admin");
    }

    @Test
    public void test02175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02175");
        model.Admin admin2 = new model.Admin("admin", "");
        admin2.viewProfile();
        java.lang.String str4 = admin2.getPassword();
        java.lang.String str5 = admin2.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
    }

    @Test
    public void test02176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02176");
        model.Admin admin2 = new model.Admin("admin", "admin");
        admin2.viewProfile();
        admin2.viewProfile();
        admin2.login("hi!", "admin");
        java.lang.String str8 = admin2.getID();
        admin2.viewProfile();
        admin2.viewProfile();
        admin2.viewProfile();
        room.Room room12 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.enableRoom(room12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "admin" + "'", str8, "admin");
    }

    @Test
    public void test02177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02177");
        model.Admin admin2 = new model.Admin("", "");
        java.lang.String str3 = admin2.getAccountType();
        admin2.setVerified(true);
        double double6 = admin2.getHourlyRate();
        java.lang.String str7 = admin2.getPassword();
        admin2.logout();
        admin2.viewProfile();
        java.lang.String str10 = admin2.getAccountType();
        java.lang.String str11 = admin2.getAccountType();
        room.Room room12 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.enableRoom(room12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "admin" + "'", str10, "admin");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "admin" + "'", str11, "admin");
    }

    @Test
    public void test02178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02178");
        model.Admin admin2 = new model.Admin("", "");
        java.lang.String str3 = admin2.getAccountType();
        admin2.setVerified(true);
        double double6 = admin2.getHourlyRate();
        admin2.viewProfile();
        boolean boolean8 = admin2.isVerified();
        java.lang.String str9 = admin2.getID();
        java.lang.String str10 = admin2.getID();
        double double11 = admin2.getHourlyRate();
        java.lang.String str12 = admin2.getPassword();
        boolean boolean13 = admin2.isVerified();
        java.lang.String str14 = admin2.getPassword();
        java.lang.String str15 = admin2.getID();
        room.Room room16 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.enableRoom(room16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "admin" + "'", str9, "admin");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "admin" + "'", str10, "admin");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "admin" + "'", str15, "admin");
    }

    @Test
    public void test02179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02179");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        double double5 = admin2.getHourlyRate();
        double double6 = admin2.getHourlyRate();
        java.lang.String str7 = admin2.getID();
        admin2.viewProfile();
        admin2.logout();
        admin2.setVerified(false);
        java.lang.String str12 = admin2.getEmail();
        boolean boolean13 = admin2.isVerified();
        admin2.setVerified(true);
        double double16 = admin2.getHourlyRate();
        room.Room room17 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.disableRoom(room17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
    }

    @Test
    public void test02180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02180");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        double double5 = admin2.getHourlyRate();
        admin2.setVerified(true);
        admin2.viewProfile();
        java.lang.String str9 = admin2.getID();
        room.Room room10 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.disableRoom(room10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "admin" + "'", str9, "admin");
    }

    @Test
    public void test02181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02181");
        model.Admin admin2 = new model.Admin("admin", "admin");
        boolean boolean3 = admin2.isVerified();
        admin2.login("hi!", "");
        admin2.viewProfile();
        boolean boolean8 = admin2.isVerified();
        room.Room room9 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.disableRoom(room9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test02182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02182");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        double double5 = admin2.getHourlyRate();
        double double6 = admin2.getHourlyRate();
        java.lang.String str7 = admin2.getID();
        boolean boolean8 = admin2.isVerified();
        java.lang.String str9 = admin2.getPassword();
        java.lang.Class<?> wildcardClass10 = admin2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test02183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02183");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        admin2.logout();
        java.lang.String str5 = admin2.getAccountType();
        admin2.viewProfile();
        admin2.setVerified(false);
        java.lang.String str9 = admin2.getEmail();
        admin2.setVerified(false);
        java.lang.String str12 = admin2.getID();
        admin2.login("admin", "admin");
        room.Room room16 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.disableRoom(room16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "admin" + "'", str12, "admin");
    }

    @Test
    public void test02184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02184");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getAccountType();
        boolean boolean4 = admin2.isVerified();
        double double5 = admin2.getHourlyRate();
        java.lang.Class<?> wildcardClass6 = admin2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test02185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02185");
        model.Admin admin2 = new model.Admin("hi!", "admin");
        java.lang.String str3 = admin2.getID();
        admin2.setVerified(true);
        admin2.logout();
        java.lang.Class<?> wildcardClass7 = admin2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test02186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02186");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        java.lang.String str4 = admin2.getEmail();
        admin2.logout();
        double double6 = admin2.getHourlyRate();
        java.lang.String str7 = admin2.getAccountType();
        admin2.setVerified(true);
        java.lang.Class<?> wildcardClass10 = admin2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test02187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02187");
        model.Admin admin2 = new model.Admin("", "");
        java.lang.String str3 = admin2.getAccountType();
        java.lang.String str4 = admin2.getPassword();
        java.lang.Class<?> wildcardClass5 = admin2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test02188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02188");
        model.Admin admin2 = new model.Admin("hi!", "admin");
        java.lang.String str3 = admin2.getID();
        admin2.setVerified(false);
        admin2.viewProfile();
        admin2.viewProfile();
        admin2.setVerified(true);
        java.lang.String str10 = admin2.getAccountType();
        admin2.login("", "");
        double double14 = admin2.getHourlyRate();
        java.lang.String str15 = admin2.getPassword();
        room.Room room16 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.enableRoom(room16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "admin" + "'", str10, "admin");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "admin" + "'", str15, "admin");
    }

    @Test
    public void test02189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02189");
        model.Admin admin2 = new model.Admin("", "");
        java.lang.String str3 = admin2.getAccountType();
        admin2.setVerified(true);
        java.lang.String str6 = admin2.getID();
        java.lang.String str7 = admin2.getEmail();
        java.lang.Class<?> wildcardClass8 = admin2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "admin" + "'", str6, "admin");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test02190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02190");
        model.Admin admin2 = new model.Admin("admin", "admin");
        admin2.viewProfile();
        java.lang.String str4 = admin2.getID();
        java.lang.String str5 = admin2.getAccountType();
        java.lang.String str6 = admin2.getEmail();
        boolean boolean7 = admin2.isVerified();
        room.Room room8 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.disableRoom(room8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "admin" + "'", str4, "admin");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "admin" + "'", str6, "admin");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test02191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02191");
        model.Admin admin2 = new model.Admin("admin", "admin");
        admin2.login("admin", "admin");
        admin2.setVerified(false);
        boolean boolean8 = admin2.isVerified();
        room.Room room9 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.disableRoom(room9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test02192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02192");
        model.Admin admin2 = new model.Admin("admin", "");
        admin2.setVerified(true);
        java.lang.String str5 = admin2.getAccountType();
        admin2.setVerified(false);
        java.lang.String str8 = admin2.getID();
        admin2.viewProfile();
        admin2.login("", "");
        java.lang.Class<?> wildcardClass13 = admin2.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "admin" + "'", str8, "admin");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test02193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02193");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        admin2.logout();
        java.lang.String str5 = admin2.getAccountType();
        admin2.login("", "");
        java.lang.String str9 = admin2.getPassword();
        java.lang.String str10 = admin2.getID();
        admin2.login("hi!", "");
        admin2.viewProfile();
        boolean boolean15 = admin2.isVerified();
        room.Room room16 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.disableRoom(room16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "admin" + "'", str10, "admin");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test02194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02194");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        admin2.logout();
        java.lang.String str5 = admin2.getAccountType();
        boolean boolean6 = admin2.isVerified();
        admin2.login("hi!", "");
        java.lang.String str10 = admin2.getEmail();
        admin2.setVerified(false);
        room.Room room13 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.disableRoom(room13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test02195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02195");
        model.Admin admin2 = new model.Admin("admin", "admin");
        admin2.login("admin", "admin");
        boolean boolean6 = admin2.isVerified();
        admin2.logout();
        java.lang.String str8 = admin2.getID();
        admin2.logout();
        java.lang.String str10 = admin2.getEmail();
        java.lang.String str11 = admin2.getEmail();
        java.lang.String str12 = admin2.getID();
        room.Room room13 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.enableRoom(room13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "admin" + "'", str8, "admin");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "admin" + "'", str10, "admin");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "admin" + "'", str11, "admin");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "admin" + "'", str12, "admin");
    }

    @Test
    public void test02196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02196");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        admin2.logout();
        java.lang.String str4 = admin2.getAccountType();
        java.lang.String str5 = admin2.getAccountType();
        java.lang.String str6 = admin2.getPassword();
        java.lang.String str7 = admin2.getAccountType();
        admin2.login("hi!", "");
        java.lang.String str11 = admin2.getPassword();
        java.lang.Class<?> wildcardClass12 = admin2.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "admin" + "'", str4, "admin");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test02197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02197");
        model.Admin admin2 = new model.Admin("admin", "admin");
        admin2.login("admin", "admin");
        boolean boolean6 = admin2.isVerified();
        admin2.logout();
        java.lang.String str8 = admin2.getID();
        admin2.logout();
        admin2.viewProfile();
        admin2.viewProfile();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "admin" + "'", str8, "admin");
    }

    @Test
    public void test02198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02198");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        double double5 = admin2.getHourlyRate();
        double double6 = admin2.getHourlyRate();
        java.lang.String str7 = admin2.getID();
        admin2.viewProfile();
        admin2.logout();
        java.lang.String str10 = admin2.getEmail();
        boolean boolean11 = admin2.isVerified();
        java.lang.String str12 = admin2.getAccountType();
        boolean boolean13 = admin2.isVerified();
        boolean boolean14 = admin2.isVerified();
        admin2.setVerified(true);
        boolean boolean17 = admin2.isVerified();
        room.Room room18 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.addRoom(room18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.getRoomID()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "admin" + "'", str12, "admin");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test02199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02199");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        double double5 = admin2.getHourlyRate();
        double double6 = admin2.getHourlyRate();
        java.lang.String str7 = admin2.getID();
        admin2.viewProfile();
        admin2.logout();
        admin2.setVerified(false);
        java.lang.String str12 = admin2.getEmail();
        admin2.login("", "");
        java.lang.String str16 = admin2.getAccountType();
        java.lang.String str17 = admin2.getID();
        admin2.logout();
        admin2.login("hi!", "hi!");
        room.Room room22 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.addRoom(room22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.getRoomID()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "admin" + "'", str16, "admin");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "admin" + "'", str17, "admin");
    }

    @Test
    public void test02200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02200");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        admin2.logout();
        java.lang.String str5 = admin2.getAccountType();
        boolean boolean6 = admin2.isVerified();
        java.lang.String str7 = admin2.getAccountType();
        java.lang.String str8 = admin2.getAccountType();
        admin2.setVerified(false);
        room.Room room11 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.enableRoom(room11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "admin" + "'", str8, "admin");
    }

    @Test
    public void test02201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02201");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getAccountType();
        boolean boolean4 = admin2.isVerified();
        boolean boolean5 = admin2.isVerified();
        java.lang.String str6 = admin2.getID();
        admin2.viewProfile();
        boolean boolean8 = admin2.isVerified();
        double double9 = admin2.getHourlyRate();
        boolean boolean10 = admin2.isVerified();
        room.Room room11 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.addRoom(room11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.getRoomID()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "admin" + "'", str6, "admin");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test02202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02202");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        admin2.logout();
        java.lang.String str5 = admin2.getAccountType();
        boolean boolean6 = admin2.isVerified();
        java.lang.String str7 = admin2.getPassword();
        double double8 = admin2.getHourlyRate();
        double double9 = admin2.getHourlyRate();
        admin2.viewProfile();
        admin2.viewProfile();
        admin2.viewProfile();
        java.lang.Class<?> wildcardClass13 = admin2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test02203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02203");
        model.Admin admin2 = new model.Admin("", "");
        java.lang.String str3 = admin2.getAccountType();
        admin2.setVerified(true);
        double double6 = admin2.getHourlyRate();
        admin2.viewProfile();
        boolean boolean8 = admin2.isVerified();
        java.lang.String str9 = admin2.getID();
        java.lang.String str10 = admin2.getID();
        double double11 = admin2.getHourlyRate();
        boolean boolean12 = admin2.isVerified();
        admin2.login("hi!", "hi!");
        room.Room room16 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.enableRoom(room16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "admin" + "'", str9, "admin");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "admin" + "'", str10, "admin");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test02204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02204");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        admin2.logout();
        java.lang.String str5 = admin2.getAccountType();
        admin2.login("", "");
        java.lang.String str9 = admin2.getPassword();
        admin2.logout();
        admin2.login("", "");
        java.lang.String str14 = admin2.getPassword();
        boolean boolean15 = admin2.isVerified();
        room.Room room16 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.disableRoom(room16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test02205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02205");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        double double5 = admin2.getHourlyRate();
        double double6 = admin2.getHourlyRate();
        java.lang.String str7 = admin2.getID();
        admin2.viewProfile();
        admin2.logout();
        admin2.setVerified(false);
        java.lang.String str12 = admin2.getEmail();
        boolean boolean13 = admin2.isVerified();
        admin2.login("", "");
        room.Room room17 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.disableRoom(room17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test02206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02206");
        model.Admin admin2 = new model.Admin("admin", "");
        admin2.setVerified(true);
        admin2.logout();
        admin2.logout();
        double double7 = admin2.getHourlyRate();
        java.lang.String str8 = admin2.getPassword();
        room.Room room9 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.enableRoom(room9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test02207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02207");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        java.lang.String str5 = admin2.getID();
        java.lang.String str6 = admin2.getID();
        java.lang.String str7 = admin2.getAccountType();
        admin2.setVerified(true);
        java.lang.String str10 = admin2.getAccountType();
        java.lang.Class<?> wildcardClass11 = admin2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "admin" + "'", str6, "admin");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "admin" + "'", str10, "admin");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test02208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02208");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        double double5 = admin2.getHourlyRate();
        double double6 = admin2.getHourlyRate();
        java.lang.String str7 = admin2.getID();
        admin2.login("", "admin");
        admin2.viewProfile();
        boolean boolean12 = admin2.isVerified();
        admin2.setVerified(true);
        java.lang.Class<?> wildcardClass15 = admin2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test02209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02209");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getAccountType();
        boolean boolean4 = admin2.isVerified();
        java.lang.String str5 = admin2.getEmail();
        java.lang.String str6 = admin2.getAccountType();
        java.lang.String str7 = admin2.getAccountType();
        admin2.viewProfile();
        java.lang.String str9 = admin2.getAccountType();
        admin2.logout();
        room.Room room11 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.disableRoom(room11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "admin" + "'", str6, "admin");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "admin" + "'", str9, "admin");
    }

    @Test
    public void test02210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02210");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        admin2.logout();
        java.lang.String str5 = admin2.getAccountType();
        admin2.viewProfile();
        admin2.login("hi!", "admin");
        room.Room room10 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.disableRoom(room10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
    }

    @Test
    public void test02211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02211");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        double double5 = admin2.getHourlyRate();
        boolean boolean6 = admin2.isVerified();
        admin2.login("hi!", "");
        java.lang.String str10 = admin2.getPassword();
        admin2.viewProfile();
        java.lang.String str12 = admin2.getPassword();
        java.lang.String str13 = admin2.getPassword();
        room.Room room14 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.disableRoom(room14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test02212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02212");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        java.lang.String str5 = admin2.getID();
        java.lang.String str6 = admin2.getID();
        java.lang.String str7 = admin2.getAccountType();
        admin2.viewProfile();
        admin2.viewProfile();
        java.lang.Class<?> wildcardClass10 = admin2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "admin" + "'", str6, "admin");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test02213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02213");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        admin2.logout();
        java.lang.String str5 = admin2.getAccountType();
        admin2.login("", "");
        java.lang.String str9 = admin2.getID();
        java.lang.String str10 = admin2.getEmail();
        java.lang.String str11 = admin2.getAccountType();
        java.lang.String str12 = admin2.getEmail();
        java.lang.String str13 = admin2.getID();
        admin2.setVerified(true);
        room.Room room16 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.addRoom(room16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.getRoomID()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "admin" + "'", str9, "admin");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "admin" + "'", str11, "admin");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "admin" + "'", str13, "admin");
    }

    @Test
    public void test02214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02214");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        double double5 = admin2.getHourlyRate();
        admin2.setVerified(true);
        double double8 = admin2.getHourlyRate();
        double double9 = admin2.getHourlyRate();
        java.lang.String str10 = admin2.getPassword();
        admin2.logout();
        java.lang.String str12 = admin2.getAccountType();
        room.Room room13 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.enableRoom(room13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "admin" + "'", str12, "admin");
    }

    @Test
    public void test02215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02215");
        model.Admin admin2 = new model.Admin("admin", "");
        admin2.setVerified(true);
        admin2.logout();
        admin2.logout();
        double double7 = admin2.getHourlyRate();
        room.Room room8 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.disableRoom(room8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test02216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02216");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        java.lang.String str5 = admin2.getID();
        admin2.setVerified(false);
        double double8 = admin2.getHourlyRate();
        double double9 = admin2.getHourlyRate();
        room.Room room10 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.addRoom(room10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.getRoomID()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test02217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02217");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        double double5 = admin2.getHourlyRate();
        admin2.setVerified(true);
        double double8 = admin2.getHourlyRate();
        double double9 = admin2.getHourlyRate();
        admin2.login("", "admin");
        admin2.setVerified(false);
        java.lang.String str15 = admin2.getAccountType();
        java.lang.Class<?> wildcardClass16 = admin2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "admin" + "'", str15, "admin");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test02218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02218");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        admin2.logout();
        java.lang.String str5 = admin2.getAccountType();
        admin2.viewProfile();
        admin2.setVerified(false);
        double double9 = admin2.getHourlyRate();
        java.lang.String str10 = admin2.getEmail();
        room.Room room11 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.disableRoom(room11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test02219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02219");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        admin2.logout();
        admin2.setVerified(false);
        java.lang.String str6 = admin2.getEmail();
        admin2.setVerified(false);
        room.Room room9 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.disableRoom(room9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test02220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02220");
        model.Admin admin2 = new model.Admin("admin", "admin");
        admin2.login("admin", "admin");
        boolean boolean6 = admin2.isVerified();
        admin2.logout();
        admin2.setVerified(false);
        java.lang.String str10 = admin2.getPassword();
        room.Room room11 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.disableRoom(room11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "admin" + "'", str10, "admin");
    }

    @Test
    public void test02221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02221");
        model.Admin admin2 = new model.Admin("admin", "");
        admin2.logout();
        double double4 = admin2.getHourlyRate();
        java.lang.String str5 = admin2.getEmail();
        room.Room room6 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.addRoom(room6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.getRoomID()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
    }

    @Test
    public void test02222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02222");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        double double5 = admin2.getHourlyRate();
        double double6 = admin2.getHourlyRate();
        java.lang.String str7 = admin2.getID();
        boolean boolean8 = admin2.isVerified();
        admin2.login("", "");
        admin2.login("", "hi!");
        admin2.setVerified(true);
        room.Room room17 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.enableRoom(room17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test02223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02223");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        admin2.logout();
        java.lang.String str5 = admin2.getAccountType();
        boolean boolean6 = admin2.isVerified();
        java.lang.String str7 = admin2.getAccountType();
        java.lang.String str8 = admin2.getEmail();
        admin2.logout();
        room.Room room10 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.addRoom(room10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.getRoomID()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test02224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02224");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        double double5 = admin2.getHourlyRate();
        java.lang.String str6 = admin2.getPassword();
        boolean boolean7 = admin2.isVerified();
        java.lang.String str8 = admin2.getEmail();
        java.lang.String str9 = admin2.getID();
        room.Room room10 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.addRoom(room10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.getRoomID()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "admin" + "'", str9, "admin");
    }

    @Test
    public void test02225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02225");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        admin2.logout();
        java.lang.String str5 = admin2.getAccountType();
        boolean boolean6 = admin2.isVerified();
        admin2.login("hi!", "admin");
        admin2.setVerified(true);
        admin2.viewProfile();
        java.lang.String str13 = admin2.getAccountType();
        double double14 = admin2.getHourlyRate();
        double double15 = admin2.getHourlyRate();
        admin2.viewProfile();
        room.Room room17 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.addRoom(room17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.getRoomID()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "admin" + "'", str13, "admin");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test02226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02226");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        double double5 = admin2.getHourlyRate();
        double double6 = admin2.getHourlyRate();
        java.lang.String str7 = admin2.getID();
        admin2.viewProfile();
        admin2.logout();
        admin2.setVerified(false);
        java.lang.String str12 = admin2.getEmail();
        java.lang.String str13 = admin2.getID();
        admin2.viewProfile();
        java.lang.String str15 = admin2.getID();
        admin2.viewProfile();
        room.Room room17 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.addRoom(room17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.getRoomID()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "admin" + "'", str13, "admin");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "admin" + "'", str15, "admin");
    }

    @Test
    public void test02227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02227");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        java.lang.String str5 = admin2.getAccountType();
        double double6 = admin2.getHourlyRate();
        admin2.viewProfile();
        java.lang.String str8 = admin2.getAccountType();
        admin2.logout();
        java.lang.String str10 = admin2.getEmail();
        java.lang.Class<?> wildcardClass11 = admin2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "admin" + "'", str8, "admin");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test02228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02228");
        model.Admin admin2 = new model.Admin("admin", "admin");
        admin2.login("admin", "admin");
        boolean boolean6 = admin2.isVerified();
        admin2.logout();
        java.lang.String str8 = admin2.getPassword();
        admin2.viewProfile();
        admin2.login("", "hi!");
        boolean boolean13 = admin2.isVerified();
        room.Room room14 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.enableRoom(room14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "admin" + "'", str8, "admin");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test02229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02229");
        model.Admin admin2 = new model.Admin("admin", "admin");
        boolean boolean3 = admin2.isVerified();
        java.lang.String str4 = admin2.getPassword();
        java.lang.String str5 = admin2.getPassword();
        boolean boolean6 = admin2.isVerified();
        room.Room room7 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.addRoom(room7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.getRoomID()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "admin" + "'", str4, "admin");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test02230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02230");
        model.Admin admin2 = new model.Admin("admin", "");
        admin2.logout();
        admin2.viewProfile();
        boolean boolean5 = admin2.isVerified();
        room.Room room6 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.disableRoom(room6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test02231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02231");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        admin2.logout();
        admin2.setVerified(false);
        java.lang.String str6 = admin2.getEmail();
        admin2.viewProfile();
        admin2.viewProfile();
        double double9 = admin2.getHourlyRate();
        admin2.setVerified(true);
        admin2.viewProfile();
        admin2.viewProfile();
        admin2.setVerified(true);
        java.lang.String str16 = admin2.getPassword();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test02232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02232");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        double double5 = admin2.getHourlyRate();
        double double6 = admin2.getHourlyRate();
        java.lang.String str7 = admin2.getPassword();
        admin2.logout();
        admin2.setVerified(true);
        admin2.setVerified(true);
        java.lang.Class<?> wildcardClass13 = admin2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test02233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02233");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        java.lang.String str4 = admin2.getPassword();
        java.lang.String str5 = admin2.getAccountType();
        admin2.viewProfile();
        double double7 = admin2.getHourlyRate();
        java.lang.String str8 = admin2.getEmail();
        boolean boolean9 = admin2.isVerified();
        java.lang.String str10 = admin2.getAccountType();
        room.Room room11 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.addRoom(room11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.getRoomID()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "admin" + "'", str10, "admin");
    }

    @Test
    public void test02234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02234");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        java.lang.String str4 = admin2.getAccountType();
        java.lang.String str5 = admin2.getID();
        java.lang.String str6 = admin2.getEmail();
        java.lang.String str7 = admin2.getPassword();
        admin2.login("hi!", "hi!");
        boolean boolean11 = admin2.isVerified();
        room.Room room12 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.addRoom(room12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.getRoomID()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "admin" + "'", str4, "admin");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test02235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02235");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        java.lang.String str5 = admin2.getID();
        java.lang.String str6 = admin2.getID();
        java.lang.String str7 = admin2.getAccountType();
        admin2.logout();
        java.lang.String str9 = admin2.getEmail();
        java.lang.String str10 = admin2.getPassword();
        java.lang.String str11 = admin2.getAccountType();
        admin2.viewProfile();
        java.lang.String str13 = admin2.getPassword();
        boolean boolean14 = admin2.isVerified();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "admin" + "'", str6, "admin");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "admin" + "'", str11, "admin");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test02236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02236");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        double double5 = admin2.getHourlyRate();
        double double6 = admin2.getHourlyRate();
        java.lang.String str7 = admin2.getID();
        boolean boolean8 = admin2.isVerified();
        java.lang.String str9 = admin2.getPassword();
        java.lang.String str10 = admin2.getAccountType();
        java.lang.String str11 = admin2.getPassword();
        admin2.logout();
        admin2.login("", "hi!");
        admin2.setVerified(false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "admin" + "'", str10, "admin");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test02237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02237");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        double double5 = admin2.getHourlyRate();
        double double6 = admin2.getHourlyRate();
        java.lang.String str7 = admin2.getID();
        boolean boolean8 = admin2.isVerified();
        admin2.login("", "");
        admin2.viewProfile();
        boolean boolean13 = admin2.isVerified();
        boolean boolean14 = admin2.isVerified();
        admin2.logout();
        room.Room room16 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.addRoom(room16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.getRoomID()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test02238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02238");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        double double5 = admin2.getHourlyRate();
        double double6 = admin2.getHourlyRate();
        java.lang.String str7 = admin2.getID();
        admin2.login("", "admin");
        admin2.viewProfile();
        boolean boolean12 = admin2.isVerified();
        admin2.setVerified(true);
        java.lang.String str15 = admin2.getEmail();
        java.lang.String str16 = admin2.getPassword();
        java.lang.String str17 = admin2.getID();
        admin2.login("", "hi!");
        room.Room room21 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.disableRoom(room21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "admin" + "'", str17, "admin");
    }

    @Test
    public void test02239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02239");
        model.Admin admin2 = new model.Admin("admin", "");
        admin2.setVerified(true);
        admin2.logout();
        admin2.login("admin", "hi!");
        admin2.setVerified(false);
        room.Room room11 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.enableRoom(room11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02240");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        java.lang.String str5 = admin2.getID();
        admin2.setVerified(false);
        java.lang.String str8 = admin2.getPassword();
        admin2.logout();
        admin2.setVerified(true);
        admin2.setVerified(true);
        admin2.setVerified(true);
        admin2.viewProfile();
        room.Room room17 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.addRoom(room17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.getRoomID()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test02241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02241");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        double double5 = admin2.getHourlyRate();
        double double6 = admin2.getHourlyRate();
        java.lang.String str7 = admin2.getPassword();
        admin2.setVerified(true);
        java.lang.String str10 = admin2.getEmail();
        java.lang.String str11 = admin2.getID();
        boolean boolean12 = admin2.isVerified();
        admin2.login("hi!", "hi!");
        admin2.logout();
        java.lang.String str17 = admin2.getEmail();
        admin2.logout();
        room.Room room19 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.addRoom(room19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.getRoomID()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "admin" + "'", str11, "admin");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test02242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02242");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        admin2.logout();
        java.lang.String str5 = admin2.getAccountType();
        admin2.viewProfile();
        admin2.login("hi!", "admin");
        admin2.viewProfile();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
    }

    @Test
    public void test02243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02243");
        model.Admin admin2 = new model.Admin("", "");
        java.lang.String str3 = admin2.getAccountType();
        admin2.setVerified(true);
        double double6 = admin2.getHourlyRate();
        admin2.viewProfile();
        boolean boolean8 = admin2.isVerified();
        java.lang.String str9 = admin2.getID();
        admin2.login("admin", "");
        admin2.viewProfile();
        java.lang.String str14 = admin2.getPassword();
        java.lang.String str15 = admin2.getEmail();
        java.lang.String str16 = admin2.getPassword();
        room.Room room17 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.addRoom(room17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.getRoomID()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "admin" + "'", str9, "admin");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test02244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02244");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        double double5 = admin2.getHourlyRate();
        double double6 = admin2.getHourlyRate();
        java.lang.String str7 = admin2.getID();
        boolean boolean8 = admin2.isVerified();
        java.lang.String str9 = admin2.getPassword();
        admin2.setVerified(false);
        java.lang.String str12 = admin2.getAccountType();
        java.lang.Class<?> wildcardClass13 = admin2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "admin" + "'", str12, "admin");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test02245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02245");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        admin2.logout();
        java.lang.String str5 = admin2.getAccountType();
        boolean boolean6 = admin2.isVerified();
        java.lang.String str7 = admin2.getAccountType();
        java.lang.String str8 = admin2.getAccountType();
        admin2.setVerified(false);
        java.lang.String str11 = admin2.getID();
        java.lang.String str12 = admin2.getEmail();
        admin2.viewProfile();
        boolean boolean14 = admin2.isVerified();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "admin" + "'", str8, "admin");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "admin" + "'", str11, "admin");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test02246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02246");
        model.Admin admin2 = new model.Admin("admin", "");
        admin2.setVerified(true);
        java.lang.String str5 = admin2.getEmail();
        double double6 = admin2.getHourlyRate();
        double double7 = admin2.getHourlyRate();
        room.Room room8 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.addRoom(room8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.getRoomID()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test02247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02247");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        double double5 = admin2.getHourlyRate();
        double double6 = admin2.getHourlyRate();
        java.lang.String str7 = admin2.getID();
        admin2.viewProfile();
        admin2.logout();
        java.lang.String str10 = admin2.getEmail();
        boolean boolean11 = admin2.isVerified();
        java.lang.String str12 = admin2.getAccountType();
        admin2.logout();
        java.lang.String str14 = admin2.getPassword();
        boolean boolean15 = admin2.isVerified();
        double double16 = admin2.getHourlyRate();
        double double17 = admin2.getHourlyRate();
        boolean boolean18 = admin2.isVerified();
        double double19 = admin2.getHourlyRate();
        room.Room room20 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.disableRoom(room20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "admin" + "'", str12, "admin");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
    }

    @Test
    public void test02248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02248");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getAccountType();
        admin2.setVerified(false);
        admin2.login("hi!", "hi!");
        java.lang.String str9 = admin2.getID();
        room.Room room10 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.enableRoom(room10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "admin" + "'", str9, "admin");
    }

    @Test
    public void test02249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02249");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getAccountType();
        boolean boolean4 = admin2.isVerified();
        java.lang.String str5 = admin2.getPassword();
        admin2.logout();
        admin2.logout();
        double double8 = admin2.getHourlyRate();
        java.lang.String str9 = admin2.getPassword();
        boolean boolean10 = admin2.isVerified();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test02250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02250");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        java.lang.String str4 = admin2.getPassword();
        java.lang.String str5 = admin2.getAccountType();
        admin2.viewProfile();
        admin2.logout();
        admin2.viewProfile();
        java.lang.Class<?> wildcardClass9 = admin2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test02251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02251");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        double double5 = admin2.getHourlyRate();
        double double6 = admin2.getHourlyRate();
        java.lang.String str7 = admin2.getID();
        boolean boolean8 = admin2.isVerified();
        admin2.login("", "");
        admin2.viewProfile();
        java.lang.String str13 = admin2.getPassword();
        admin2.logout();
        java.lang.String str15 = admin2.getAccountType();
        room.Room room16 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.disableRoom(room16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "admin" + "'", str15, "admin");
    }

    @Test
    public void test02252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02252");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getAccountType();
        boolean boolean4 = admin2.isVerified();
        java.lang.String str5 = admin2.getPassword();
        java.lang.String str6 = admin2.getEmail();
        java.lang.String str7 = admin2.getAccountType();
        java.lang.String str8 = admin2.getAccountType();
        room.Room room9 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.enableRoom(room9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "admin" + "'", str8, "admin");
    }

    @Test
    public void test02253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02253");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        admin2.logout();
        java.lang.String str5 = admin2.getAccountType();
        admin2.viewProfile();
        admin2.setVerified(false);
        java.lang.String str9 = admin2.getEmail();
        admin2.setVerified(false);
        java.lang.String str12 = admin2.getID();
        admin2.login("admin", "admin");
        boolean boolean16 = admin2.isVerified();
        admin2.login("hi!", "");
        room.Room room20 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.enableRoom(room20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "admin" + "'", str12, "admin");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test02254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02254");
        model.Admin admin2 = new model.Admin("", "");
        java.lang.String str3 = admin2.getAccountType();
        admin2.setVerified(true);
        double double6 = admin2.getHourlyRate();
        admin2.login("", "admin");
        java.lang.String str10 = admin2.getPassword();
        java.lang.Class<?> wildcardClass11 = admin2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test02255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02255");
        model.Admin admin2 = new model.Admin("", "");
        java.lang.String str3 = admin2.getAccountType();
        java.lang.String str4 = admin2.getEmail();
        java.lang.String str5 = admin2.getID();
        double double6 = admin2.getHourlyRate();
        java.lang.String str7 = admin2.getAccountType();
        admin2.login("admin", "");
        java.lang.String str11 = admin2.getAccountType();
        boolean boolean12 = admin2.isVerified();
        room.Room room13 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.addRoom(room13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.getRoomID()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "admin" + "'", str11, "admin");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test02256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02256");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        double double5 = admin2.getHourlyRate();
        double double6 = admin2.getHourlyRate();
        admin2.setVerified(true);
        java.lang.String str9 = admin2.getPassword();
        double double10 = admin2.getHourlyRate();
        java.lang.Class<?> wildcardClass11 = admin2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test02257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02257");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getAccountType();
        boolean boolean4 = admin2.isVerified();
        java.lang.String str5 = admin2.getPassword();
        admin2.logout();
        admin2.viewProfile();
        java.lang.String str8 = admin2.getEmail();
        boolean boolean9 = admin2.isVerified();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test02258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02258");
        model.Admin admin2 = new model.Admin("admin", "admin");
        admin2.login("admin", "admin");
        boolean boolean6 = admin2.isVerified();
        admin2.logout();
        java.lang.String str8 = admin2.getID();
        admin2.logout();
        double double10 = admin2.getHourlyRate();
        boolean boolean11 = admin2.isVerified();
        java.lang.String str12 = admin2.getID();
        admin2.setVerified(false);
        java.lang.Class<?> wildcardClass15 = admin2.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "admin" + "'", str8, "admin");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "admin" + "'", str12, "admin");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test02259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02259");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        java.lang.String str5 = admin2.getID();
        java.lang.String str6 = admin2.getID();
        java.lang.String str7 = admin2.getAccountType();
        admin2.setVerified(true);
        java.lang.String str10 = admin2.getAccountType();
        admin2.setVerified(true);
        java.lang.String str13 = admin2.getPassword();
        room.Room room14 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.enableRoom(room14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "admin" + "'", str6, "admin");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "admin" + "'", str10, "admin");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test02260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02260");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        admin2.logout();
        java.lang.String str5 = admin2.getAccountType();
        admin2.login("", "");
        java.lang.String str9 = admin2.getID();
        java.lang.String str10 = admin2.getEmail();
        admin2.logout();
        admin2.viewProfile();
        room.Room room13 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.disableRoom(room13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "admin" + "'", str9, "admin");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test02261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02261");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getPassword();
        boolean boolean4 = admin2.isVerified();
        java.lang.String str5 = admin2.getID();
        java.lang.String str6 = admin2.getEmail();
        java.lang.String str7 = admin2.getAccountType();
        admin2.setVerified(false);
        admin2.viewProfile();
        admin2.viewProfile();
        room.Room room12 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.enableRoom(room12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
    }

    @Test
    public void test02262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02262");
        model.Admin admin2 = new model.Admin("", "");
        admin2.login("admin", "");
        admin2.viewProfile();
        admin2.logout();
        room.Room room8 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.disableRoom(room8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02263");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getAccountType();
        boolean boolean4 = admin2.isVerified();
        boolean boolean5 = admin2.isVerified();
        admin2.viewProfile();
        admin2.login("admin", "hi!");
        java.lang.String str10 = admin2.getPassword();
        admin2.login("", "hi!");
        double double14 = admin2.getHourlyRate();
        admin2.viewProfile();
        admin2.viewProfile();
        admin2.logout();
        room.Room room18 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.disableRoom(room18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test02264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02264");
        model.Admin admin2 = new model.Admin("admin", "admin");
        admin2.login("admin", "admin");
        admin2.setVerified(false);
        boolean boolean8 = admin2.isVerified();
        boolean boolean9 = admin2.isVerified();
        admin2.login("hi!", "hi!");
        java.lang.Class<?> wildcardClass13 = admin2.getClass();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test02265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02265");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        java.lang.String str4 = admin2.getPassword();
        java.lang.String str5 = admin2.getAccountType();
        admin2.viewProfile();
        double double7 = admin2.getHourlyRate();
        java.lang.String str8 = admin2.getID();
        java.lang.String str9 = admin2.getAccountType();
        java.lang.String str10 = admin2.getPassword();
        admin2.logout();
        java.lang.String str12 = admin2.getAccountType();
        boolean boolean13 = admin2.isVerified();
        admin2.logout();
        java.lang.String str15 = admin2.getEmail();
        admin2.viewProfile();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "admin" + "'", str8, "admin");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "admin" + "'", str9, "admin");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "admin" + "'", str12, "admin");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test02266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02266");
        model.Admin admin2 = new model.Admin("admin", "admin");
        admin2.viewProfile();
        java.lang.String str4 = admin2.getPassword();
        boolean boolean5 = admin2.isVerified();
        java.lang.String str6 = admin2.getPassword();
        admin2.login("", "");
        java.lang.String str10 = admin2.getPassword();
        java.lang.String str11 = admin2.getAccountType();
        room.Room room12 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.enableRoom(room12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "admin" + "'", str4, "admin");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "admin" + "'", str6, "admin");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "admin" + "'", str10, "admin");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "admin" + "'", str11, "admin");
    }

    @Test
    public void test02267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02267");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        double double5 = admin2.getHourlyRate();
        double double6 = admin2.getHourlyRate();
        admin2.setVerified(true);
        java.lang.String str9 = admin2.getEmail();
        java.lang.String str10 = admin2.getEmail();
        boolean boolean11 = admin2.isVerified();
        java.lang.String str12 = admin2.getEmail();
        double double13 = admin2.getHourlyRate();
        double double14 = admin2.getHourlyRate();
        java.lang.String str15 = admin2.getPassword();
        admin2.viewProfile();
        room.Room room17 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.disableRoom(room17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test02268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02268");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        double double5 = admin2.getHourlyRate();
        double double6 = admin2.getHourlyRate();
        java.lang.String str7 = admin2.getID();
        boolean boolean8 = admin2.isVerified();
        admin2.login("", "");
        admin2.viewProfile();
        boolean boolean13 = admin2.isVerified();
        boolean boolean14 = admin2.isVerified();
        admin2.viewProfile();
        java.lang.Class<?> wildcardClass16 = admin2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test02269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02269");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        java.lang.String str4 = admin2.getPassword();
        java.lang.String str5 = admin2.getAccountType();
        java.lang.String str6 = admin2.getID();
        admin2.login("admin", "admin");
        java.lang.String str10 = admin2.getAccountType();
        java.lang.String str11 = admin2.getPassword();
        room.Room room12 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.enableRoom(room12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "admin" + "'", str6, "admin");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "admin" + "'", str10, "admin");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test02270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02270");
        model.Admin admin2 = new model.Admin("admin", "admin");
        admin2.viewProfile();
        admin2.viewProfile();
        admin2.login("hi!", "admin");
        room.Room room8 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.disableRoom(room8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02271");
        model.Admin admin2 = new model.Admin("admin", "admin");
        admin2.login("admin", "admin");
        double double6 = admin2.getHourlyRate();
        java.lang.String str7 = admin2.getAccountType();
        admin2.login("", "hi!");
        room.Room room11 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.enableRoom(room11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
    }

    @Test
    public void test02272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02272");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        admin2.logout();
        java.lang.String str5 = admin2.getAccountType();
        java.lang.String str6 = admin2.getEmail();
        java.lang.String str7 = admin2.getPassword();
        java.lang.String str8 = admin2.getAccountType();
        admin2.login("admin", "admin");
        java.lang.String str12 = admin2.getID();
        admin2.login("", "hi!");
        java.lang.Class<?> wildcardClass16 = admin2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "admin" + "'", str8, "admin");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "admin" + "'", str12, "admin");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test02273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02273");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        double double5 = admin2.getHourlyRate();
        double double6 = admin2.getHourlyRate();
        admin2.setVerified(true);
        java.lang.String str9 = admin2.getPassword();
        admin2.login("hi!", "admin");
        double double13 = admin2.getHourlyRate();
        java.lang.String str14 = admin2.getPassword();
        java.lang.String str15 = admin2.getID();
        room.Room room16 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.enableRoom(room16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "admin" + "'", str15, "admin");
    }

    @Test
    public void test02274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02274");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        double double5 = admin2.getHourlyRate();
        double double6 = admin2.getHourlyRate();
        java.lang.String str7 = admin2.getPassword();
        double double8 = admin2.getHourlyRate();
        admin2.logout();
        java.lang.String str10 = admin2.getPassword();
        java.lang.String str11 = admin2.getPassword();
        admin2.logout();
        room.Room room13 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.disableRoom(room13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test02275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02275");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        admin2.logout();
        java.lang.String str5 = admin2.getAccountType();
        admin2.login("", "");
        java.lang.String str9 = admin2.getEmail();
        java.lang.String str10 = admin2.getID();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "admin" + "'", str10, "admin");
    }

    @Test
    public void test02276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02276");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        double double5 = admin2.getHourlyRate();
        double double6 = admin2.getHourlyRate();
        java.lang.String str7 = admin2.getID();
        admin2.viewProfile();
        admin2.logout();
        java.lang.String str10 = admin2.getEmail();
        boolean boolean11 = admin2.isVerified();
        java.lang.String str12 = admin2.getAccountType();
        admin2.setVerified(false);
        java.lang.String str15 = admin2.getPassword();
        java.lang.String str16 = admin2.getEmail();
        java.lang.String str17 = admin2.getID();
        admin2.logout();
        boolean boolean19 = admin2.isVerified();
        room.Room room20 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.disableRoom(room20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "admin" + "'", str12, "admin");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "admin" + "'", str17, "admin");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test02277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02277");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        admin2.logout();
        java.lang.String str5 = admin2.getAccountType();
        boolean boolean6 = admin2.isVerified();
        admin2.login("hi!", "");
        java.lang.String str10 = admin2.getEmail();
        admin2.login("hi!", "hi!");
        java.lang.String str14 = admin2.getID();
        java.lang.String str15 = admin2.getPassword();
        room.Room room16 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.addRoom(room16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.getRoomID()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "admin" + "'", str14, "admin");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test02278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02278");
        model.Admin admin2 = new model.Admin("hi!", "admin");
        java.lang.String str3 = admin2.getID();
        admin2.setVerified(true);
        java.lang.String str6 = admin2.getAccountType();
        admin2.login("hi!", "admin");
        java.lang.Class<?> wildcardClass10 = admin2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "admin" + "'", str6, "admin");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test02279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02279");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        double double5 = admin2.getHourlyRate();
        double double6 = admin2.getHourlyRate();
        java.lang.String str7 = admin2.getPassword();
        java.lang.String str8 = admin2.getEmail();
        boolean boolean9 = admin2.isVerified();
        double double10 = admin2.getHourlyRate();
        double double11 = admin2.getHourlyRate();
        admin2.setVerified(true);
        java.lang.String str14 = admin2.getEmail();
        java.lang.Class<?> wildcardClass15 = admin2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test02280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02280");
        model.Admin admin2 = new model.Admin("admin", "");
        admin2.setVerified(true);
        java.lang.String str5 = admin2.getEmail();
        double double6 = admin2.getHourlyRate();
        admin2.viewProfile();
        admin2.viewProfile();
        java.lang.String str9 = admin2.getEmail();
        java.lang.String str10 = admin2.getPassword();
        double double11 = admin2.getHourlyRate();
        double double12 = admin2.getHourlyRate();
        admin2.setVerified(true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "admin" + "'", str9, "admin");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test02281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02281");
        model.Admin admin2 = new model.Admin("admin", "admin");
        admin2.login("admin", "admin");
        boolean boolean6 = admin2.isVerified();
        admin2.logout();
        java.lang.String str8 = admin2.getID();
        admin2.logout();
        java.lang.String str10 = admin2.getID();
        admin2.login("hi!", "");
        admin2.login("admin", "hi!");
        admin2.logout();
        admin2.setVerified(false);
        room.Room room20 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.disableRoom(room20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "admin" + "'", str8, "admin");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "admin" + "'", str10, "admin");
    }

    @Test
    public void test02282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02282");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        double double5 = admin2.getHourlyRate();
        double double6 = admin2.getHourlyRate();
        java.lang.String str7 = admin2.getID();
        admin2.viewProfile();
        java.lang.String str9 = admin2.getID();
        admin2.logout();
        admin2.viewProfile();
        admin2.login("", "admin");
        boolean boolean15 = admin2.isVerified();
        java.lang.String str16 = admin2.getPassword();
        room.Room room17 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.addRoom(room17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.getRoomID()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "admin" + "'", str9, "admin");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test02283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02283");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        java.lang.String str5 = admin2.getEmail();
        admin2.logout();
        java.lang.String str7 = admin2.getPassword();
        boolean boolean8 = admin2.isVerified();
        java.lang.String str9 = admin2.getPassword();
        boolean boolean10 = admin2.isVerified();
        room.Room room11 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.addRoom(room11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.getRoomID()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test02284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02284");
        model.Admin admin2 = new model.Admin("admin", "admin");
        admin2.login("admin", "admin");
        boolean boolean6 = admin2.isVerified();
        admin2.logout();
        admin2.setVerified(false);
        java.lang.String str10 = admin2.getID();
        java.lang.String str11 = admin2.getAccountType();
        double double12 = admin2.getHourlyRate();
        java.lang.String str13 = admin2.getAccountType();
        admin2.login("hi!", "hi!");
        java.lang.Class<?> wildcardClass17 = admin2.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "admin" + "'", str10, "admin");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "admin" + "'", str11, "admin");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "admin" + "'", str13, "admin");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test02285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02285");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getAccountType();
        boolean boolean4 = admin2.isVerified();
        boolean boolean5 = admin2.isVerified();
        admin2.logout();
        admin2.login("admin", "hi!");
        admin2.logout();
        room.Room room11 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.addRoom(room11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.getRoomID()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test02286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02286");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        double double5 = admin2.getHourlyRate();
        double double6 = admin2.getHourlyRate();
        java.lang.String str7 = admin2.getID();
        boolean boolean8 = admin2.isVerified();
        admin2.login("", "");
        admin2.viewProfile();
        boolean boolean13 = admin2.isVerified();
        boolean boolean14 = admin2.isVerified();
        admin2.logout();
        admin2.setVerified(false);
        java.lang.String str18 = admin2.getEmail();
        double double19 = admin2.getHourlyRate();
        boolean boolean20 = admin2.isVerified();
        room.Room room21 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.enableRoom(room21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test02287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02287");
        model.Admin admin2 = new model.Admin("admin", "admin");
        admin2.viewProfile();
        java.lang.String str4 = admin2.getPassword();
        admin2.login("", "");
        java.lang.String str8 = admin2.getEmail();
        java.lang.String str9 = admin2.getAccountType();
        admin2.viewProfile();
        java.lang.String str11 = admin2.getPassword();
        room.Room room12 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.addRoom(room12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.getRoomID()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "admin" + "'", str4, "admin");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "admin" + "'", str8, "admin");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "admin" + "'", str9, "admin");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "admin" + "'", str11, "admin");
    }

    @Test
    public void test02288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02288");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        double double5 = admin2.getHourlyRate();
        double double6 = admin2.getHourlyRate();
        java.lang.String str7 = admin2.getPassword();
        java.lang.String str8 = admin2.getEmail();
        boolean boolean9 = admin2.isVerified();
        double double10 = admin2.getHourlyRate();
        double double11 = admin2.getHourlyRate();
        java.lang.String str12 = admin2.getPassword();
        room.Room room13 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.addRoom(room13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.getRoomID()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test02289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02289");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getAccountType();
        boolean boolean4 = admin2.isVerified();
        boolean boolean5 = admin2.isVerified();
        admin2.viewProfile();
        java.lang.String str7 = admin2.getID();
        java.lang.String str8 = admin2.getAccountType();
        java.lang.String str9 = admin2.getEmail();
        java.lang.String str10 = admin2.getAccountType();
        room.Room room11 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.disableRoom(room11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "admin" + "'", str8, "admin");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "admin" + "'", str10, "admin");
    }

    @Test
    public void test02290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02290");
        model.Admin admin2 = new model.Admin("admin", "admin");
        admin2.viewProfile();
        java.lang.String str4 = admin2.getPassword();
        double double5 = admin2.getHourlyRate();
        java.lang.String str6 = admin2.getAccountType();
        boolean boolean7 = admin2.isVerified();
        admin2.viewProfile();
        admin2.setVerified(false);
        java.lang.Class<?> wildcardClass11 = admin2.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "admin" + "'", str4, "admin");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "admin" + "'", str6, "admin");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test02291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02291");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        admin2.logout();
        java.lang.String str5 = admin2.getAccountType();
        boolean boolean6 = admin2.isVerified();
        admin2.login("hi!", "admin");
        java.lang.String str10 = admin2.getPassword();
        java.lang.Class<?> wildcardClass11 = admin2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test02292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02292");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        admin2.logout();
        java.lang.String str5 = admin2.getAccountType();
        admin2.login("", "");
        java.lang.String str9 = admin2.getEmail();
        admin2.login("", "");
        admin2.setVerified(false);
        admin2.logout();
        boolean boolean16 = admin2.isVerified();
        double double17 = admin2.getHourlyRate();
        room.Room room18 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.enableRoom(room18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
    }

    @Test
    public void test02293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02293");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        admin2.logout();
        java.lang.String str5 = admin2.getAccountType();
        admin2.login("hi!", "");
        admin2.logout();
        java.lang.String str10 = admin2.getID();
        java.lang.String str11 = admin2.getID();
        admin2.setVerified(false);
        java.lang.String str14 = admin2.getPassword();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "admin" + "'", str10, "admin");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "admin" + "'", str11, "admin");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test02294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02294");
        model.Admin admin2 = new model.Admin("", "");
        java.lang.String str3 = admin2.getAccountType();
        admin2.setVerified(true);
        double double6 = admin2.getHourlyRate();
        admin2.viewProfile();
        boolean boolean8 = admin2.isVerified();
        java.lang.String str9 = admin2.getID();
        admin2.viewProfile();
        java.lang.String str11 = admin2.getPassword();
        admin2.logout();
        admin2.viewProfile();
        java.lang.Class<?> wildcardClass14 = admin2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "admin" + "'", str9, "admin");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test02295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02295");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        admin2.logout();
        java.lang.String str5 = admin2.getAccountType();
        boolean boolean6 = admin2.isVerified();
        admin2.login("hi!", "");
        java.lang.String str10 = admin2.getEmail();
        admin2.setVerified(false);
        admin2.login("hi!", "");
        boolean boolean16 = admin2.isVerified();
        double double17 = admin2.getHourlyRate();
        java.lang.Class<?> wildcardClass18 = admin2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test02296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02296");
        model.Admin admin2 = new model.Admin("admin", "");
        admin2.setVerified(true);
        java.lang.String str5 = admin2.getEmail();
        double double6 = admin2.getHourlyRate();
        java.lang.String str7 = admin2.getPassword();
        java.lang.String str8 = admin2.getEmail();
        java.lang.String str9 = admin2.getAccountType();
        room.Room room10 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.addRoom(room10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.getRoomID()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "admin" + "'", str8, "admin");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "admin" + "'", str9, "admin");
    }

    @Test
    public void test02297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02297");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        admin2.logout();
        java.lang.String str5 = admin2.getAccountType();
        admin2.login("", "");
        java.lang.String str9 = admin2.getID();
        java.lang.String str10 = admin2.getEmail();
        java.lang.String str11 = admin2.getAccountType();
        admin2.logout();
        double double13 = admin2.getHourlyRate();
        boolean boolean14 = admin2.isVerified();
        room.Room room15 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.addRoom(room15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.getRoomID()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "admin" + "'", str9, "admin");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "admin" + "'", str11, "admin");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test02298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02298");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        admin2.logout();
        java.lang.String str5 = admin2.getAccountType();
        admin2.login("hi!", "");
        double double9 = admin2.getHourlyRate();
        java.lang.String str10 = admin2.getEmail();
        room.Room room11 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.disableRoom(room11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test02299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02299");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        java.lang.String str5 = admin2.getEmail();
        admin2.logout();
        java.lang.String str7 = admin2.getPassword();
        java.lang.String str8 = admin2.getAccountType();
        admin2.viewProfile();
        room.Room room10 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.addRoom(room10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.getRoomID()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "admin" + "'", str8, "admin");
    }

    @Test
    public void test02300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02300");
        model.Admin admin2 = new model.Admin("admin", "");
        admin2.setVerified(true);
        java.lang.String str5 = admin2.getEmail();
        admin2.viewProfile();
        java.lang.Class<?> wildcardClass7 = admin2.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test02301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02301");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        java.lang.String str4 = admin2.getPassword();
        java.lang.String str5 = admin2.getAccountType();
        admin2.viewProfile();
        double double7 = admin2.getHourlyRate();
        java.lang.String str8 = admin2.getID();
        java.lang.String str9 = admin2.getAccountType();
        java.lang.String str10 = admin2.getPassword();
        admin2.logout();
        java.lang.String str12 = admin2.getPassword();
        admin2.login("admin", "hi!");
        java.lang.String str16 = admin2.getAccountType();
        room.Room room17 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.addRoom(room17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.getRoomID()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "admin" + "'", str8, "admin");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "admin" + "'", str9, "admin");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "admin" + "'", str16, "admin");
    }

    @Test
    public void test02302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02302");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        double double5 = admin2.getHourlyRate();
        double double6 = admin2.getHourlyRate();
        java.lang.String str7 = admin2.getPassword();
        admin2.setVerified(true);
        java.lang.String str10 = admin2.getEmail();
        java.lang.String str11 = admin2.getID();
        java.lang.String str12 = admin2.getID();
        admin2.viewProfile();
        java.lang.String str14 = admin2.getID();
        room.Room room15 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.addRoom(room15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.getRoomID()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "admin" + "'", str11, "admin");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "admin" + "'", str12, "admin");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "admin" + "'", str14, "admin");
    }

    @Test
    public void test02303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02303");
        model.Admin admin2 = new model.Admin("admin", "");
        admin2.setVerified(true);
        java.lang.String str5 = admin2.getEmail();
        double double6 = admin2.getHourlyRate();
        admin2.viewProfile();
        boolean boolean8 = admin2.isVerified();
        java.lang.String str9 = admin2.getPassword();
        room.Room room10 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.addRoom(room10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.getRoomID()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test02304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02304");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getAccountType();
        java.lang.String str4 = admin2.getPassword();
        admin2.setVerified(true);
        java.lang.String str7 = admin2.getID();
        java.lang.String str8 = admin2.getEmail();
        java.lang.String str9 = admin2.getPassword();
        java.lang.String str10 = admin2.getEmail();
        boolean boolean11 = admin2.isVerified();
        java.lang.Class<?> wildcardClass12 = admin2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test02305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02305");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        java.lang.String str5 = admin2.getID();
        java.lang.String str6 = admin2.getID();
        java.lang.String str7 = admin2.getAccountType();
        admin2.viewProfile();
        java.lang.String str9 = admin2.getEmail();
        java.lang.String str10 = admin2.getPassword();
        java.lang.String str11 = admin2.getID();
        admin2.login("", "");
        room.Room room15 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.enableRoom(room15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "admin" + "'", str6, "admin");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "admin" + "'", str11, "admin");
    }

    @Test
    public void test02306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02306");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        admin2.logout();
        java.lang.String str5 = admin2.getID();
        admin2.logout();
        room.Room room7 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.disableRoom(room7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
    }

    @Test
    public void test02307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02307");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        admin2.logout();
        java.lang.String str5 = admin2.getAccountType();
        admin2.login("", "");
        java.lang.String str9 = admin2.getID();
        java.lang.String str10 = admin2.getEmail();
        java.lang.String str11 = admin2.getAccountType();
        admin2.logout();
        double double13 = admin2.getHourlyRate();
        boolean boolean14 = admin2.isVerified();
        java.lang.String str15 = admin2.getEmail();
        room.Room room16 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.disableRoom(room16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "admin" + "'", str9, "admin");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "admin" + "'", str11, "admin");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test02308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02308");
        model.Admin admin2 = new model.Admin("admin", "admin");
        admin2.viewProfile();
        java.lang.String str4 = admin2.getPassword();
        admin2.login("", "");
        boolean boolean8 = admin2.isVerified();
        admin2.login("admin", "hi!");
        admin2.logout();
        admin2.login("hi!", "hi!");
        java.lang.String str16 = admin2.getAccountType();
        boolean boolean17 = admin2.isVerified();
        double double18 = admin2.getHourlyRate();
        java.lang.Class<?> wildcardClass19 = admin2.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "admin" + "'", str4, "admin");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "admin" + "'", str16, "admin");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test02309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02309");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        double double5 = admin2.getHourlyRate();
        double double6 = admin2.getHourlyRate();
        java.lang.String str7 = admin2.getID();
        admin2.viewProfile();
        admin2.logout();
        java.lang.String str10 = admin2.getEmail();
        boolean boolean11 = admin2.isVerified();
        java.lang.String str12 = admin2.getAccountType();
        admin2.login("hi!", "hi!");
        admin2.viewProfile();
        java.lang.String str17 = admin2.getPassword();
        room.Room room18 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.addRoom(room18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.getRoomID()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "admin" + "'", str12, "admin");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test02310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02310");
        model.Admin admin2 = new model.Admin("admin", "admin");
        admin2.viewProfile();
        java.lang.String str4 = admin2.getPassword();
        double double5 = admin2.getHourlyRate();
        java.lang.String str6 = admin2.getAccountType();
        boolean boolean7 = admin2.isVerified();
        admin2.logout();
        java.lang.String str9 = admin2.getID();
        room.Room room10 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.addRoom(room10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.getRoomID()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "admin" + "'", str4, "admin");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "admin" + "'", str6, "admin");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "admin" + "'", str9, "admin");
    }

    @Test
    public void test02311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02311");
        model.Admin admin2 = new model.Admin("admin", "");
        admin2.setVerified(true);
        java.lang.String str5 = admin2.getEmail();
        double double6 = admin2.getHourlyRate();
        admin2.viewProfile();
        admin2.viewProfile();
        admin2.login("", "");
        room.Room room12 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.disableRoom(room12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test02312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02312");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        java.lang.String str4 = admin2.getEmail();
        admin2.setVerified(false);
        admin2.setVerified(false);
        room.Room room9 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.enableRoom(room9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test02313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02313");
        model.Admin admin2 = new model.Admin("hi!", "admin");
        java.lang.String str3 = admin2.getID();
        admin2.setVerified(true);
        java.lang.String str6 = admin2.getAccountType();
        admin2.login("hi!", "admin");
        admin2.logout();
        boolean boolean11 = admin2.isVerified();
        admin2.logout();
        room.Room room13 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.enableRoom(room13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "admin" + "'", str6, "admin");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test02314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02314");
        model.Admin admin2 = new model.Admin("admin", "admin");
        admin2.viewProfile();
        java.lang.String str4 = admin2.getID();
        java.lang.String str5 = admin2.getPassword();
        double double6 = admin2.getHourlyRate();
        admin2.setVerified(true);
        admin2.logout();
        boolean boolean10 = admin2.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "admin" + "'", str4, "admin");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test02315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02315");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        double double5 = admin2.getHourlyRate();
        double double6 = admin2.getHourlyRate();
        java.lang.String str7 = admin2.getPassword();
        admin2.setVerified(true);
        boolean boolean10 = admin2.isVerified();
        java.lang.String str11 = admin2.getEmail();
        admin2.setVerified(false);
        admin2.login("", "admin");
        java.lang.String str17 = admin2.getEmail();
        java.lang.String str18 = admin2.getPassword();
        admin2.setVerified(false);
        boolean boolean21 = admin2.isVerified();
        room.Room room22 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.addRoom(room22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.getRoomID()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test02316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02316");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        java.lang.String str5 = admin2.getID();
        java.lang.String str6 = admin2.getID();
        java.lang.String str7 = admin2.getAccountType();
        admin2.viewProfile();
        java.lang.String str9 = admin2.getEmail();
        java.lang.String str10 = admin2.getPassword();
        java.lang.String str11 = admin2.getEmail();
        java.lang.String str12 = admin2.getAccountType();
        room.Room room13 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.enableRoom(room13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "admin" + "'", str6, "admin");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "admin" + "'", str12, "admin");
    }

    @Test
    public void test02317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02317");
        model.Admin admin2 = new model.Admin("admin", "");
        admin2.logout();
        admin2.viewProfile();
        boolean boolean5 = admin2.isVerified();
        admin2.logout();
        admin2.setVerified(true);
        admin2.viewProfile();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test02318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02318");
        model.Admin admin2 = new model.Admin("admin", "admin");
        admin2.viewProfile();
        java.lang.String str4 = admin2.getPassword();
        admin2.login("", "");
        boolean boolean8 = admin2.isVerified();
        admin2.setVerified(true);
        admin2.setVerified(false);
        admin2.setVerified(false);
        admin2.viewProfile();
        admin2.login("hi!", "");
        java.lang.String str19 = admin2.getEmail();
        java.lang.Class<?> wildcardClass20 = admin2.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "admin" + "'", str4, "admin");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "admin" + "'", str19, "admin");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test02319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02319");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        java.lang.String str5 = admin2.getID();
        admin2.setVerified(false);
        admin2.logout();
        boolean boolean9 = admin2.isVerified();
        boolean boolean10 = admin2.isVerified();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test02320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02320");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        double double5 = admin2.getHourlyRate();
        double double6 = admin2.getHourlyRate();
        java.lang.String str7 = admin2.getID();
        admin2.login("", "admin");
        admin2.viewProfile();
        boolean boolean12 = admin2.isVerified();
        admin2.setVerified(true);
        admin2.logout();
        admin2.setVerified(false);
        java.lang.String str18 = admin2.getAccountType();
        room.Room room19 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.addRoom(room19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.getRoomID()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "admin" + "'", str18, "admin");
    }

    @Test
    public void test02321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02321");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        admin2.logout();
        java.lang.String str5 = admin2.getAccountType();
        boolean boolean6 = admin2.isVerified();
        java.lang.String str7 = admin2.getPassword();
        java.lang.String str8 = admin2.getEmail();
        java.lang.String str9 = admin2.getAccountType();
        room.Room room10 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.enableRoom(room10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "admin" + "'", str9, "admin");
    }

    @Test
    public void test02322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02322");
        model.Admin admin2 = new model.Admin("admin", "");
        admin2.logout();
        double double4 = admin2.getHourlyRate();
        admin2.setVerified(false);
        double double7 = admin2.getHourlyRate();
        java.lang.String str8 = admin2.getID();
        admin2.logout();
        admin2.viewProfile();
        double double11 = admin2.getHourlyRate();
        java.lang.Class<?> wildcardClass12 = admin2.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "admin" + "'", str8, "admin");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test02323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02323");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        admin2.logout();
        java.lang.String str5 = admin2.getAccountType();
        boolean boolean6 = admin2.isVerified();
        admin2.login("hi!", "");
        admin2.login("admin", "hi!");
        java.lang.String str13 = admin2.getAccountType();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "admin" + "'", str13, "admin");
    }

    @Test
    public void test02324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02324");
        model.Admin admin2 = new model.Admin("admin", "");
        admin2.setVerified(true);
        java.lang.String str5 = admin2.getEmail();
        double double6 = admin2.getHourlyRate();
        java.lang.String str7 = admin2.getPassword();
        java.lang.String str8 = admin2.getEmail();
        java.lang.String str9 = admin2.getAccountType();
        java.lang.String str10 = admin2.getAccountType();
        admin2.setVerified(false);
        admin2.logout();
        boolean boolean14 = admin2.isVerified();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "admin" + "'", str8, "admin");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "admin" + "'", str9, "admin");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "admin" + "'", str10, "admin");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test02325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02325");
        model.Admin admin2 = new model.Admin("", "");
        java.lang.String str3 = admin2.getAccountType();
        admin2.logout();
        java.lang.String str5 = admin2.getPassword();
        admin2.viewProfile();
        room.Room room7 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.disableRoom(room7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test02326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02326");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        double double5 = admin2.getHourlyRate();
        double double6 = admin2.getHourlyRate();
        java.lang.String str7 = admin2.getID();
        admin2.viewProfile();
        admin2.logout();
        java.lang.String str10 = admin2.getEmail();
        boolean boolean11 = admin2.isVerified();
        java.lang.String str12 = admin2.getAccountType();
        boolean boolean13 = admin2.isVerified();
        boolean boolean14 = admin2.isVerified();
        java.lang.String str15 = admin2.getID();
        java.lang.Class<?> wildcardClass16 = admin2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "admin" + "'", str12, "admin");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "admin" + "'", str15, "admin");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test02327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02327");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getAccountType();
        java.lang.String str4 = admin2.getAccountType();
        java.lang.String str5 = admin2.getEmail();
        java.lang.Class<?> wildcardClass6 = admin2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "admin" + "'", str4, "admin");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test02328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02328");
        model.Admin admin2 = new model.Admin("admin", "admin");
        admin2.login("admin", "admin");
        admin2.logout();
        java.lang.String str7 = admin2.getPassword();
        java.lang.String str8 = admin2.getEmail();
        java.lang.String str9 = admin2.getID();
        admin2.viewProfile();
        double double11 = admin2.getHourlyRate();
        room.Room room12 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.disableRoom(room12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "admin" + "'", str8, "admin");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "admin" + "'", str9, "admin");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test02329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02329");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        double double5 = admin2.getHourlyRate();
        double double6 = admin2.getHourlyRate();
        java.lang.String str7 = admin2.getPassword();
        admin2.logout();
        double double9 = admin2.getHourlyRate();
        boolean boolean10 = admin2.isVerified();
        java.lang.String str11 = admin2.getAccountType();
        java.lang.String str12 = admin2.getAccountType();
        java.lang.String str13 = admin2.getAccountType();
        java.lang.Class<?> wildcardClass14 = admin2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "admin" + "'", str11, "admin");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "admin" + "'", str12, "admin");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "admin" + "'", str13, "admin");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test02330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02330");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        admin2.logout();
        java.lang.String str5 = admin2.getAccountType();
        admin2.login("", "");
        java.lang.String str9 = admin2.getID();
        java.lang.String str10 = admin2.getEmail();
        admin2.logout();
        room.Room room12 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.disableRoom(room12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "admin" + "'", str9, "admin");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test02331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02331");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getAccountType();
        java.lang.String str4 = admin2.getAccountType();
        boolean boolean5 = admin2.isVerified();
        double double6 = admin2.getHourlyRate();
        java.lang.String str7 = admin2.getPassword();
        java.lang.String str8 = admin2.getPassword();
        java.lang.Class<?> wildcardClass9 = admin2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "admin" + "'", str4, "admin");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test02332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02332");
        model.Admin admin2 = new model.Admin("", "");
        java.lang.String str3 = admin2.getAccountType();
        admin2.setVerified(true);
        java.lang.String str6 = admin2.getID();
        java.lang.String str7 = admin2.getEmail();
        room.Room room8 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.addRoom(room8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.getRoomID()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "admin" + "'", str6, "admin");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test02333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02333");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        java.lang.String str5 = admin2.getID();
        java.lang.String str6 = admin2.getID();
        java.lang.String str7 = admin2.getAccountType();
        admin2.setVerified(true);
        java.lang.String str10 = admin2.getAccountType();
        admin2.setVerified(true);
        java.lang.String str13 = admin2.getAccountType();
        java.lang.Class<?> wildcardClass14 = admin2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "admin" + "'", str6, "admin");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "admin" + "'", str10, "admin");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "admin" + "'", str13, "admin");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test02334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02334");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        double double5 = admin2.getHourlyRate();
        double double6 = admin2.getHourlyRate();
        admin2.viewProfile();
        admin2.viewProfile();
        admin2.setVerified(false);
        java.lang.Class<?> wildcardClass11 = admin2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test02335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02335");
        model.Admin admin2 = new model.Admin("admin", "admin");
        admin2.viewProfile();
        java.lang.String str4 = admin2.getPassword();
        admin2.login("", "");
        java.lang.String str8 = admin2.getEmail();
        java.lang.String str9 = admin2.getAccountType();
        admin2.login("", "");
        java.lang.String str13 = admin2.getAccountType();
        double double14 = admin2.getHourlyRate();
        java.lang.Class<?> wildcardClass15 = admin2.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "admin" + "'", str4, "admin");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "admin" + "'", str8, "admin");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "admin" + "'", str9, "admin");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "admin" + "'", str13, "admin");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test02336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02336");
        model.Admin admin2 = new model.Admin("", "");
        java.lang.String str3 = admin2.getAccountType();
        admin2.setVerified(true);
        double double6 = admin2.getHourlyRate();
        admin2.viewProfile();
        boolean boolean8 = admin2.isVerified();
        java.lang.String str9 = admin2.getID();
        java.lang.String str10 = admin2.getID();
        double double11 = admin2.getHourlyRate();
        boolean boolean12 = admin2.isVerified();
        admin2.logout();
        boolean boolean14 = admin2.isVerified();
        java.lang.String str15 = admin2.getPassword();
        admin2.logout();
        room.Room room17 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.enableRoom(room17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "admin" + "'", str9, "admin");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "admin" + "'", str10, "admin");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test02337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02337");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        double double5 = admin2.getHourlyRate();
        double double6 = admin2.getHourlyRate();
        java.lang.String str7 = admin2.getPassword();
        admin2.setVerified(true);
        java.lang.String str10 = admin2.getEmail();
        java.lang.String str11 = admin2.getID();
        java.lang.Class<?> wildcardClass12 = admin2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "admin" + "'", str11, "admin");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test02338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02338");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        admin2.logout();
        java.lang.String str4 = admin2.getAccountType();
        admin2.logout();
        admin2.login("hi!", "admin");
        room.Room room9 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.addRoom(room9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.getRoomID()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "admin" + "'", str4, "admin");
    }

    @Test
    public void test02339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02339");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        java.lang.String str5 = admin2.getEmail();
        admin2.logout();
        java.lang.String str7 = admin2.getPassword();
        boolean boolean8 = admin2.isVerified();
        java.lang.String str9 = admin2.getEmail();
        java.lang.String str10 = admin2.getID();
        room.Room room11 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.enableRoom(room11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "admin" + "'", str10, "admin");
    }

    @Test
    public void test02340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02340");
        model.Admin admin2 = new model.Admin("admin", "");
        admin2.setVerified(true);
        java.lang.String str5 = admin2.getEmail();
        double double6 = admin2.getHourlyRate();
        java.lang.String str7 = admin2.getPassword();
        admin2.login("", "");
        java.lang.String str11 = admin2.getPassword();
        java.lang.String str12 = admin2.getPassword();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test02341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02341");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        double double5 = admin2.getHourlyRate();
        double double6 = admin2.getHourlyRate();
        java.lang.String str7 = admin2.getID();
        admin2.viewProfile();
        double double9 = admin2.getHourlyRate();
        java.lang.String str10 = admin2.getEmail();
        java.lang.String str11 = admin2.getPassword();
        room.Room room12 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.addRoom(room12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.getRoomID()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test02342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02342");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        admin2.logout();
        java.lang.String str4 = admin2.getEmail();
        java.lang.String str5 = admin2.getPassword();
        boolean boolean6 = admin2.isVerified();
        admin2.login("admin", "");
        java.lang.Class<?> wildcardClass10 = admin2.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test02343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02343");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        double double5 = admin2.getHourlyRate();
        double double6 = admin2.getHourlyRate();
        java.lang.String str7 = admin2.getPassword();
        admin2.setVerified(true);
        boolean boolean10 = admin2.isVerified();
        java.lang.String str11 = admin2.getEmail();
        admin2.setVerified(false);
        java.lang.String str14 = admin2.getPassword();
        java.lang.String str15 = admin2.getPassword();
        boolean boolean16 = admin2.isVerified();
        java.lang.String str17 = admin2.getPassword();
        java.lang.Class<?> wildcardClass18 = admin2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test02344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02344");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        admin2.logout();
        java.lang.String str5 = admin2.getAccountType();
        boolean boolean6 = admin2.isVerified();
        admin2.login("hi!", "admin");
        admin2.setVerified(false);
        boolean boolean12 = admin2.isVerified();
        admin2.setVerified(false);
        boolean boolean15 = admin2.isVerified();
        double double16 = admin2.getHourlyRate();
        room.Room room17 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.enableRoom(room17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
    }

    @Test
    public void test02345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02345");
        model.Admin admin2 = new model.Admin("admin", "admin");
        admin2.viewProfile();
        java.lang.String str4 = admin2.getPassword();
        admin2.login("", "");
        java.lang.String str8 = admin2.getEmail();
        java.lang.String str9 = admin2.getAccountType();
        java.lang.String str10 = admin2.getPassword();
        java.lang.String str11 = admin2.getID();
        admin2.logout();
        room.Room room13 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.addRoom(room13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.getRoomID()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "admin" + "'", str4, "admin");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "admin" + "'", str8, "admin");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "admin" + "'", str9, "admin");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "admin" + "'", str10, "admin");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "admin" + "'", str11, "admin");
    }

    @Test
    public void test02346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02346");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        double double5 = admin2.getHourlyRate();
        double double6 = admin2.getHourlyRate();
        java.lang.String str7 = admin2.getID();
        admin2.viewProfile();
        java.lang.String str9 = admin2.getID();
        admin2.logout();
        admin2.viewProfile();
        admin2.login("", "admin");
        boolean boolean15 = admin2.isVerified();
        boolean boolean16 = admin2.isVerified();
        java.lang.String str17 = admin2.getPassword();
        admin2.viewProfile();
        java.lang.Class<?> wildcardClass19 = admin2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "admin" + "'", str9, "admin");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test02347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02347");
        model.Admin admin2 = new model.Admin("admin", "admin");
        admin2.viewProfile();
        java.lang.String str4 = admin2.getPassword();
        admin2.login("", "");
        java.lang.String str8 = admin2.getEmail();
        java.lang.String str9 = admin2.getAccountType();
        java.lang.String str10 = admin2.getPassword();
        admin2.logout();
        java.lang.String str12 = admin2.getPassword();
        admin2.logout();
        room.Room room14 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.enableRoom(room14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "admin" + "'", str4, "admin");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "admin" + "'", str8, "admin");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "admin" + "'", str9, "admin");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "admin" + "'", str10, "admin");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "admin" + "'", str12, "admin");
    }

    @Test
    public void test02348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02348");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getAccountType();
        boolean boolean4 = admin2.isVerified();
        admin2.setVerified(false);
        java.lang.String str7 = admin2.getPassword();
        double double8 = admin2.getHourlyRate();
        room.Room room9 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.addRoom(room9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.getRoomID()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test02349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02349");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        double double5 = admin2.getHourlyRate();
        double double6 = admin2.getHourlyRate();
        java.lang.String str7 = admin2.getID();
        admin2.viewProfile();
        java.lang.String str9 = admin2.getID();
        admin2.logout();
        java.lang.String str11 = admin2.getAccountType();
        admin2.login("hi!", "");
        room.Room room15 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.enableRoom(room15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "admin" + "'", str9, "admin");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "admin" + "'", str11, "admin");
    }

    @Test
    public void test02350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02350");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        double double5 = admin2.getHourlyRate();
        double double6 = admin2.getHourlyRate();
        java.lang.String str7 = admin2.getID();
        admin2.viewProfile();
        admin2.logout();
        java.lang.String str10 = admin2.getEmail();
        boolean boolean11 = admin2.isVerified();
        java.lang.String str12 = admin2.getAccountType();
        boolean boolean13 = admin2.isVerified();
        boolean boolean14 = admin2.isVerified();
        admin2.setVerified(true);
        boolean boolean17 = admin2.isVerified();
        java.lang.String str18 = admin2.getAccountType();
        admin2.viewProfile();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "admin" + "'", str12, "admin");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "admin" + "'", str18, "admin");
    }

    @Test
    public void test02351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02351");
        model.Admin admin2 = new model.Admin("admin", "");
        admin2.setVerified(true);
        boolean boolean5 = admin2.isVerified();
        java.lang.String str6 = admin2.getAccountType();
        admin2.viewProfile();
        admin2.logout();
        room.Room room9 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.enableRoom(room9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "admin" + "'", str6, "admin");
    }

    @Test
    public void test02352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02352");
        model.Admin admin2 = new model.Admin("", "");
        java.lang.String str3 = admin2.getAccountType();
        admin2.setVerified(true);
        double double6 = admin2.getHourlyRate();
        admin2.setVerified(false);
        admin2.logout();
        admin2.login("hi!", "");
        admin2.setVerified(true);
        admin2.login("", "");
        admin2.logout();
        java.lang.Class<?> wildcardClass19 = admin2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test02353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02353");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        double double5 = admin2.getHourlyRate();
        double double6 = admin2.getHourlyRate();
        java.lang.String str7 = admin2.getID();
        admin2.viewProfile();
        java.lang.String str9 = admin2.getID();
        admin2.logout();
        java.lang.String str11 = admin2.getAccountType();
        admin2.login("hi!", "");
        admin2.setVerified(true);
        java.lang.Class<?> wildcardClass17 = admin2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "admin" + "'", str9, "admin");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "admin" + "'", str11, "admin");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test02354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02354");
        model.Admin admin2 = new model.Admin("admin", "admin");
        admin2.login("admin", "admin");
        boolean boolean6 = admin2.isVerified();
        admin2.logout();
        java.lang.String str8 = admin2.getID();
        admin2.logout();
        java.lang.String str10 = admin2.getID();
        admin2.login("hi!", "");
        admin2.login("admin", "hi!");
        admin2.logout();
        java.lang.String str18 = admin2.getPassword();
        java.lang.String str19 = admin2.getEmail();
        room.Room room20 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.enableRoom(room20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "admin" + "'", str8, "admin");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "admin" + "'", str10, "admin");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "admin" + "'", str18, "admin");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "admin" + "'", str19, "admin");
    }

    @Test
    public void test02355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02355");
        model.Admin admin2 = new model.Admin("admin", "");
        admin2.setVerified(true);
        admin2.logout();
        double double6 = admin2.getHourlyRate();
        double double7 = admin2.getHourlyRate();
        java.lang.Class<?> wildcardClass8 = admin2.getClass();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test02356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02356");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        java.lang.String str5 = admin2.getID();
        java.lang.String str6 = admin2.getID();
        java.lang.String str7 = admin2.getAccountType();
        admin2.viewProfile();
        java.lang.String str9 = admin2.getEmail();
        java.lang.String str10 = admin2.getPassword();
        java.lang.String str11 = admin2.getID();
        java.lang.String str12 = admin2.getEmail();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "admin" + "'", str6, "admin");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "admin" + "'", str11, "admin");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test02357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02357");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        admin2.logout();
        java.lang.String str5 = admin2.getAccountType();
        boolean boolean6 = admin2.isVerified();
        java.lang.String str7 = admin2.getPassword();
        java.lang.String str8 = admin2.getPassword();
        admin2.setVerified(true);
        admin2.login("hi!", "");
        admin2.logout();
        java.lang.String str15 = admin2.getAccountType();
        boolean boolean16 = admin2.isVerified();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "admin" + "'", str15, "admin");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test02358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02358");
        model.Admin admin2 = new model.Admin("", "admin");
        java.lang.String str3 = admin2.getEmail();
        admin2.login("admin", "admin");
        admin2.logout();
        room.Room room8 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.addRoom(room8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.getRoomID()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test02359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02359");
        model.Admin admin2 = new model.Admin("admin", "admin");
        admin2.viewProfile();
        java.lang.String str4 = admin2.getPassword();
        double double5 = admin2.getHourlyRate();
        java.lang.String str6 = admin2.getAccountType();
        boolean boolean7 = admin2.isVerified();
        double double8 = admin2.getHourlyRate();
        room.Room room9 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.addRoom(room9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.getRoomID()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "admin" + "'", str4, "admin");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "admin" + "'", str6, "admin");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test02360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02360");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        java.lang.String str4 = admin2.getPassword();
        java.lang.String str5 = admin2.getAccountType();
        java.lang.String str6 = admin2.getEmail();
        admin2.logout();
        double double8 = admin2.getHourlyRate();
        room.Room room9 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.enableRoom(room9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test02361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02361");
        model.Admin admin2 = new model.Admin("", "");
        java.lang.String str3 = admin2.getAccountType();
        java.lang.String str4 = admin2.getEmail();
        java.lang.String str5 = admin2.getID();
        double double6 = admin2.getHourlyRate();
        java.lang.String str7 = admin2.getAccountType();
        admin2.setVerified(false);
        boolean boolean10 = admin2.isVerified();
        admin2.login("", "hi!");
        java.lang.String str14 = admin2.getAccountType();
        admin2.setVerified(false);
        room.Room room17 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.disableRoom(room17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "admin" + "'", str14, "admin");
    }

    @Test
    public void test02362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02362");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        double double5 = admin2.getHourlyRate();
        double double6 = admin2.getHourlyRate();
        java.lang.String str7 = admin2.getPassword();
        admin2.setVerified(true);
        boolean boolean10 = admin2.isVerified();
        java.lang.String str11 = admin2.getEmail();
        admin2.setVerified(false);
        admin2.login("", "admin");
        java.lang.String str17 = admin2.getEmail();
        boolean boolean18 = admin2.isVerified();
        admin2.viewProfile();
        java.lang.String str20 = admin2.getPassword();
        room.Room room21 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.addRoom(room21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.getRoomID()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test02363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02363");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        double double5 = admin2.getHourlyRate();
        double double6 = admin2.getHourlyRate();
        java.lang.String str7 = admin2.getID();
        admin2.viewProfile();
        admin2.logout();
        java.lang.String str10 = admin2.getEmail();
        boolean boolean11 = admin2.isVerified();
        java.lang.String str12 = admin2.getAccountType();
        admin2.logout();
        java.lang.String str14 = admin2.getPassword();
        admin2.logout();
        room.Room room16 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.addRoom(room16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.getRoomID()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "admin" + "'", str12, "admin");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test02364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02364");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        admin2.logout();
        java.lang.String str5 = admin2.getAccountType();
        admin2.viewProfile();
        admin2.logout();
        admin2.setVerified(false);
        admin2.setVerified(false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
    }

    @Test
    public void test02365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02365");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        admin2.logout();
        java.lang.String str5 = admin2.getAccountType();
        boolean boolean6 = admin2.isVerified();
        admin2.login("hi!", "");
        java.lang.String str10 = admin2.getEmail();
        java.lang.String str11 = admin2.getAccountType();
        java.lang.String str12 = admin2.getAccountType();
        double double13 = admin2.getHourlyRate();
        java.lang.Class<?> wildcardClass14 = admin2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "admin" + "'", str11, "admin");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "admin" + "'", str12, "admin");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test02366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02366");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        admin2.logout();
        java.lang.String str5 = admin2.getAccountType();
        java.lang.String str6 = admin2.getEmail();
        java.lang.String str7 = admin2.getPassword();
        admin2.logout();
        java.lang.String str9 = admin2.getAccountType();
        java.lang.String str10 = admin2.getAccountType();
        room.Room room11 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.enableRoom(room11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "admin" + "'", str9, "admin");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "admin" + "'", str10, "admin");
    }

    @Test
    public void test02367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02367");
        model.Admin admin2 = new model.Admin("", "");
        java.lang.String str3 = admin2.getAccountType();
        admin2.setVerified(true);
        double double6 = admin2.getHourlyRate();
        admin2.setVerified(false);
        java.lang.String str9 = admin2.getEmail();
        java.lang.String str10 = admin2.getPassword();
        java.lang.String str11 = admin2.getPassword();
        admin2.logout();
        admin2.login("hi!", "admin");
        room.Room room16 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.disableRoom(room16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test02368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02368");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        admin2.logout();
        java.lang.String str5 = admin2.getAccountType();
        admin2.viewProfile();
        admin2.logout();
        admin2.login("admin", "");
        admin2.setVerified(false);
        room.Room room13 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.addRoom(room13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.getRoomID()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
    }

    @Test
    public void test02369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02369");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        double double5 = admin2.getHourlyRate();
        double double6 = admin2.getHourlyRate();
        java.lang.String str7 = admin2.getPassword();
        java.lang.String str8 = admin2.getEmail();
        boolean boolean9 = admin2.isVerified();
        double double10 = admin2.getHourlyRate();
        double double11 = admin2.getHourlyRate();
        java.lang.String str12 = admin2.getAccountType();
        room.Room room13 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.enableRoom(room13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "admin" + "'", str12, "admin");
    }

    @Test
    public void test02370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02370");
        model.Admin admin2 = new model.Admin("admin", "admin");
        admin2.viewProfile();
        java.lang.String str4 = admin2.getID();
        java.lang.String str5 = admin2.getAccountType();
        java.lang.String str6 = admin2.getEmail();
        admin2.viewProfile();
        admin2.setVerified(false);
        room.Room room10 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.disableRoom(room10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "admin" + "'", str4, "admin");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "admin" + "'", str6, "admin");
    }

    @Test
    public void test02371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02371");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        double double5 = admin2.getHourlyRate();
        double double6 = admin2.getHourlyRate();
        admin2.setVerified(true);
        java.lang.String str9 = admin2.getID();
        java.lang.String str10 = admin2.getID();
        room.Room room11 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.disableRoom(room11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "admin" + "'", str9, "admin");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "admin" + "'", str10, "admin");
    }

    @Test
    public void test02372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02372");
        model.Admin admin2 = new model.Admin("admin", "");
        admin2.logout();
        double double4 = admin2.getHourlyRate();
        admin2.setVerified(false);
        double double7 = admin2.getHourlyRate();
        room.Room room8 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.enableRoom(room8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test02373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02373");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        double double5 = admin2.getHourlyRate();
        double double6 = admin2.getHourlyRate();
        admin2.setVerified(true);
        java.lang.String str9 = admin2.getPassword();
        admin2.setVerified(false);
        room.Room room12 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.addRoom(room12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.getRoomID()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test02374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02374");
        model.Admin admin2 = new model.Admin("admin", "");
        admin2.logout();
        double double4 = admin2.getHourlyRate();
        admin2.setVerified(false);
        double double7 = admin2.getHourlyRate();
        admin2.logout();
        java.lang.String str9 = admin2.getAccountType();
        admin2.login("hi!", "admin");
        boolean boolean13 = admin2.isVerified();
        room.Room room14 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.addRoom(room14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.getRoomID()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "admin" + "'", str9, "admin");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test02375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02375");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        double double5 = admin2.getHourlyRate();
        double double6 = admin2.getHourlyRate();
        java.lang.String str7 = admin2.getID();
        boolean boolean8 = admin2.isVerified();
        java.lang.String str9 = admin2.getEmail();
        java.lang.String str10 = admin2.getEmail();
        java.lang.Class<?> wildcardClass11 = admin2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test02376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02376");
        model.Admin admin2 = new model.Admin("admin", "admin");
        admin2.login("admin", "admin");
        admin2.setVerified(false);
        java.lang.String str8 = admin2.getPassword();
        double double9 = admin2.getHourlyRate();
        boolean boolean10 = admin2.isVerified();
        java.lang.String str11 = admin2.getEmail();
        java.lang.String str12 = admin2.getID();
        double double13 = admin2.getHourlyRate();
        room.Room room14 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.enableRoom(room14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "admin" + "'", str8, "admin");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "admin" + "'", str11, "admin");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "admin" + "'", str12, "admin");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test02377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02377");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        admin2.logout();
        java.lang.String str5 = admin2.getAccountType();
        boolean boolean6 = admin2.isVerified();
        java.lang.String str7 = admin2.getAccountType();
        admin2.logout();
        java.lang.String str9 = admin2.getID();
        double double10 = admin2.getHourlyRate();
        double double11 = admin2.getHourlyRate();
        java.lang.Class<?> wildcardClass12 = admin2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "admin" + "'", str9, "admin");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test02378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02378");
        model.Admin admin2 = new model.Admin("admin", "admin");
        admin2.viewProfile();
        java.lang.String str4 = admin2.getID();
        java.lang.String str5 = admin2.getAccountType();
        java.lang.String str6 = admin2.getEmail();
        java.lang.String str7 = admin2.getPassword();
        java.lang.String str8 = admin2.getPassword();
        room.Room room9 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.disableRoom(room9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "admin" + "'", str4, "admin");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "admin" + "'", str6, "admin");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "admin" + "'", str8, "admin");
    }

    @Test
    public void test02379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02379");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        admin2.logout();
        java.lang.String str5 = admin2.getAccountType();
        boolean boolean6 = admin2.isVerified();
        java.lang.String str7 = admin2.getID();
        double double8 = admin2.getHourlyRate();
        java.lang.String str9 = admin2.getAccountType();
        java.lang.String str10 = admin2.getPassword();
        admin2.setVerified(true);
        java.lang.String str13 = admin2.getEmail();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "admin" + "'", str9, "admin");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test02380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02380");
        model.Admin admin2 = new model.Admin("", "");
        java.lang.String str3 = admin2.getAccountType();
        boolean boolean4 = admin2.isVerified();
        admin2.setVerified(false);
        boolean boolean7 = admin2.isVerified();
        admin2.setVerified(true);
        java.lang.Class<?> wildcardClass10 = admin2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test02381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02381");
        model.Admin admin2 = new model.Admin("admin", "admin");
        admin2.viewProfile();
        java.lang.String str4 = admin2.getPassword();
        double double5 = admin2.getHourlyRate();
        java.lang.String str6 = admin2.getAccountType();
        admin2.login("hi!", "admin");
        admin2.login("admin", "hi!");
        boolean boolean13 = admin2.isVerified();
        admin2.setVerified(true);
        room.Room room16 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.disableRoom(room16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "admin" + "'", str4, "admin");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "admin" + "'", str6, "admin");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test02382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02382");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        admin2.logout();
        admin2.setVerified(false);
        java.lang.String str6 = admin2.getEmail();
        admin2.viewProfile();
        admin2.viewProfile();
        double double9 = admin2.getHourlyRate();
        admin2.setVerified(false);
        java.lang.String str12 = admin2.getEmail();
        java.lang.String str13 = admin2.getID();
        java.lang.String str14 = admin2.getPassword();
        boolean boolean15 = admin2.isVerified();
        java.lang.Class<?> wildcardClass16 = admin2.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "admin" + "'", str13, "admin");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test02383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02383");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        admin2.logout();
        admin2.login("", "admin");
        double double7 = admin2.getHourlyRate();
        double double8 = admin2.getHourlyRate();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test02384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02384");
        model.Admin admin2 = new model.Admin("admin", "admin");
        admin2.viewProfile();
        java.lang.String str4 = admin2.getPassword();
        admin2.login("", "");
        java.lang.String str8 = admin2.getEmail();
        java.lang.String str9 = admin2.getAccountType();
        admin2.login("", "");
        java.lang.String str13 = admin2.getPassword();
        admin2.login("hi!", "hi!");
        java.lang.String str17 = admin2.getID();
        double double18 = admin2.getHourlyRate();
        room.Room room19 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.enableRoom(room19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "admin" + "'", str4, "admin");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "admin" + "'", str8, "admin");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "admin" + "'", str9, "admin");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "admin" + "'", str13, "admin");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "admin" + "'", str17, "admin");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
    }

    @Test
    public void test02385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02385");
        model.Admin admin2 = new model.Admin("admin", "admin");
        admin2.viewProfile();
        java.lang.String str4 = admin2.getID();
        java.lang.String str5 = admin2.getAccountType();
        java.lang.String str6 = admin2.getEmail();
        admin2.setVerified(true);
        admin2.logout();
        admin2.login("admin", "");
        room.Room room13 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.addRoom(room13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.getRoomID()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "admin" + "'", str4, "admin");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "admin" + "'", str6, "admin");
    }

    @Test
    public void test02386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02386");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        double double5 = admin2.getHourlyRate();
        double double6 = admin2.getHourlyRate();
        java.lang.String str7 = admin2.getID();
        admin2.viewProfile();
        double double9 = admin2.getHourlyRate();
        admin2.setVerified(true);
        admin2.logout();
        boolean boolean13 = admin2.isVerified();
        java.lang.String str14 = admin2.getEmail();
        java.lang.String str15 = admin2.getID();
        double double16 = admin2.getHourlyRate();
        room.Room room17 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.disableRoom(room17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "admin" + "'", str15, "admin");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
    }

    @Test
    public void test02387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02387");
        model.Admin admin2 = new model.Admin("admin", "admin");
        admin2.login("admin", "admin");
        boolean boolean6 = admin2.isVerified();
        admin2.logout();
        java.lang.String str8 = admin2.getID();
        admin2.logout();
        java.lang.String str10 = admin2.getID();
        boolean boolean11 = admin2.isVerified();
        admin2.login("admin", "");
        room.Room room15 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.disableRoom(room15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "admin" + "'", str8, "admin");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "admin" + "'", str10, "admin");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test02388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02388");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getAccountType();
        boolean boolean4 = admin2.isVerified();
        boolean boolean5 = admin2.isVerified();
        admin2.logout();
        double double7 = admin2.getHourlyRate();
        room.Room room8 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.disableRoom(room8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test02389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02389");
        model.Admin admin2 = new model.Admin("admin", "admin");
        admin2.viewProfile();
        java.lang.String str4 = admin2.getID();
        java.lang.String str5 = admin2.getPassword();
        double double6 = admin2.getHourlyRate();
        java.lang.String str7 = admin2.getEmail();
        admin2.setVerified(false);
        room.Room room10 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.addRoom(room10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.getRoomID()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "admin" + "'", str4, "admin");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
    }

    @Test
    public void test02390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02390");
        model.Admin admin2 = new model.Admin("", "");
        java.lang.String str3 = admin2.getAccountType();
        boolean boolean4 = admin2.isVerified();
        java.lang.String str5 = admin2.getAccountType();
        room.Room room6 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.enableRoom(room6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
    }

    @Test
    public void test02391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02391");
        model.Admin admin2 = new model.Admin("", "");
        java.lang.String str3 = admin2.getAccountType();
        java.lang.String str4 = admin2.getEmail();
        admin2.login("hi!", "");
        java.lang.String str8 = admin2.getAccountType();
        java.lang.String str9 = admin2.getAccountType();
        double double10 = admin2.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "admin" + "'", str8, "admin");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "admin" + "'", str9, "admin");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test02392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02392");
        model.Admin admin2 = new model.Admin("admin", "admin");
        admin2.login("admin", "admin");
        boolean boolean6 = admin2.isVerified();
        admin2.logout();
        java.lang.String str8 = admin2.getID();
        admin2.logout();
        java.lang.String str10 = admin2.getID();
        admin2.login("hi!", "");
        admin2.logout();
        java.lang.String str15 = admin2.getPassword();
        java.lang.String str16 = admin2.getAccountType();
        java.lang.Class<?> wildcardClass17 = admin2.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "admin" + "'", str8, "admin");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "admin" + "'", str10, "admin");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "admin" + "'", str15, "admin");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "admin" + "'", str16, "admin");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test02393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02393");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        double double5 = admin2.getHourlyRate();
        double double6 = admin2.getHourlyRate();
        java.lang.String str7 = admin2.getID();
        boolean boolean8 = admin2.isVerified();
        admin2.login("", "");
        admin2.viewProfile();
        java.lang.String str13 = admin2.getPassword();
        admin2.logout();
        java.lang.String str15 = admin2.getPassword();
        java.lang.String str16 = admin2.getEmail();
        admin2.login("", "");
        java.lang.Class<?> wildcardClass20 = admin2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test02394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02394");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        double double5 = admin2.getHourlyRate();
        double double6 = admin2.getHourlyRate();
        java.lang.String str7 = admin2.getID();
        boolean boolean8 = admin2.isVerified();
        java.lang.String str9 = admin2.getEmail();
        room.Room room10 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.addRoom(room10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.getRoomID()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test02395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02395");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        java.lang.String str4 = admin2.getEmail();
        admin2.logout();
        admin2.logout();
        java.lang.String str7 = admin2.getPassword();
        admin2.login("admin", "admin");
        admin2.viewProfile();
        java.lang.String str12 = admin2.getID();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "admin" + "'", str12, "admin");
    }

    @Test
    public void test02396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02396");
        model.Admin admin2 = new model.Admin("admin", "");
        java.lang.Class<?> wildcardClass3 = admin2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test02397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02397");
        model.Admin admin2 = new model.Admin("admin", "admin");
        admin2.login("admin", "admin");
        boolean boolean6 = admin2.isVerified();
        admin2.logout();
        java.lang.String str8 = admin2.getID();
        admin2.setVerified(true);
        java.lang.String str11 = admin2.getAccountType();
        admin2.viewProfile();
        boolean boolean13 = admin2.isVerified();
        room.Room room14 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.enableRoom(room14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "admin" + "'", str8, "admin");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "admin" + "'", str11, "admin");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test02398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02398");
        model.Admin admin2 = new model.Admin("", "hi!");
        java.lang.String str3 = admin2.getID();
        java.lang.String str4 = admin2.getPassword();
        double double5 = admin2.getHourlyRate();
        room.Room room6 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.enableRoom(room6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test02399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02399");
        model.Admin admin2 = new model.Admin("", "");
        java.lang.String str3 = admin2.getAccountType();
        admin2.setVerified(true);
        double double6 = admin2.getHourlyRate();
        admin2.setVerified(false);
        admin2.logout();
        admin2.login("hi!", "");
        admin2.setVerified(true);
        admin2.logout();
        double double16 = admin2.getHourlyRate();
        admin2.setVerified(false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
    }

    @Test
    public void test02400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02400");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        admin2.logout();
        admin2.setVerified(false);
        java.lang.String str6 = admin2.getEmail();
        double double7 = admin2.getHourlyRate();
        java.lang.String str8 = admin2.getPassword();
        java.lang.String str9 = admin2.getPassword();
        java.lang.Class<?> wildcardClass10 = admin2.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test02401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02401");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        admin2.logout();
        java.lang.String str5 = admin2.getAccountType();
        admin2.login("", "");
        java.lang.String str9 = admin2.getID();
        admin2.login("", "");
        room.Room room13 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.enableRoom(room13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "admin" + "'", str9, "admin");
    }

    @Test
    public void test02402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02402");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getAccountType();
        boolean boolean4 = admin2.isVerified();
        boolean boolean5 = admin2.isVerified();
        admin2.viewProfile();
        admin2.login("admin", "hi!");
        java.lang.String str10 = admin2.getPassword();
        admin2.login("", "hi!");
        double double14 = admin2.getHourlyRate();
        admin2.viewProfile();
        admin2.setVerified(true);
        room.Room room18 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.disableRoom(room18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test02403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02403");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        java.lang.String str5 = admin2.getEmail();
        java.lang.String str6 = admin2.getEmail();
        admin2.setVerified(false);
        boolean boolean9 = admin2.isVerified();
        admin2.logout();
        java.lang.Class<?> wildcardClass11 = admin2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test02404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02404");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        double double5 = admin2.getHourlyRate();
        double double6 = admin2.getHourlyRate();
        java.lang.String str7 = admin2.getID();
        boolean boolean8 = admin2.isVerified();
        admin2.viewProfile();
        admin2.setVerified(true);
        java.lang.String str12 = admin2.getEmail();
        double double13 = admin2.getHourlyRate();
        java.lang.String str14 = admin2.getAccountType();
        double double15 = admin2.getHourlyRate();
        room.Room room16 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.enableRoom(room16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "admin" + "'", str14, "admin");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test02405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02405");
        model.Admin admin2 = new model.Admin("admin", "admin");
        admin2.viewProfile();
        java.lang.String str4 = admin2.getPassword();
        admin2.viewProfile();
        room.Room room6 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.enableRoom(room6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "admin" + "'", str4, "admin");
    }

    @Test
    public void test02406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02406");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        double double5 = admin2.getHourlyRate();
        double double6 = admin2.getHourlyRate();
        java.lang.String str7 = admin2.getID();
        boolean boolean8 = admin2.isVerified();
        admin2.login("", "");
        admin2.viewProfile();
        boolean boolean13 = admin2.isVerified();
        boolean boolean14 = admin2.isVerified();
        admin2.viewProfile();
        admin2.login("admin", "");
        java.lang.String str19 = admin2.getID();
        double double20 = admin2.getHourlyRate();
        room.Room room21 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.addRoom(room21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.getRoomID()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "admin" + "'", str19, "admin");
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
    }

    @Test
    public void test02407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02407");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        double double5 = admin2.getHourlyRate();
        double double6 = admin2.getHourlyRate();
        admin2.setVerified(true);
        java.lang.String str9 = admin2.getEmail();
        java.lang.String str10 = admin2.getEmail();
        boolean boolean11 = admin2.isVerified();
        java.lang.String str12 = admin2.getPassword();
        room.Room room13 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.disableRoom(room13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test02408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02408");
        model.Admin admin2 = new model.Admin("admin", "");
        admin2.setVerified(true);
        admin2.logout();
        admin2.login("admin", "hi!");
        admin2.setVerified(false);
        admin2.setVerified(false);
        room.Room room13 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.addRoom(room13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.getRoomID()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02409");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        double double5 = admin2.getHourlyRate();
        double double6 = admin2.getHourlyRate();
        java.lang.String str7 = admin2.getID();
        admin2.viewProfile();
        double double9 = admin2.getHourlyRate();
        admin2.setVerified(true);
        double double12 = admin2.getHourlyRate();
        admin2.setVerified(false);
        room.Room room15 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.disableRoom(room15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test02410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02410");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        double double5 = admin2.getHourlyRate();
        admin2.setVerified(true);
        admin2.viewProfile();
        admin2.login("", "admin");
        admin2.setVerified(false);
        room.Room room14 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.disableRoom(room14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test02411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02411");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        admin2.logout();
        java.lang.String str4 = admin2.getAccountType();
        java.lang.String str5 = admin2.getAccountType();
        java.lang.String str6 = admin2.getPassword();
        java.lang.String str7 = admin2.getAccountType();
        admin2.login("hi!", "");
        java.lang.String str11 = admin2.getPassword();
        room.Room room12 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.addRoom(room12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.getRoomID()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "admin" + "'", str4, "admin");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test02412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02412");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        admin2.logout();
        java.lang.String str5 = admin2.getAccountType();
        java.lang.String str6 = admin2.getEmail();
        java.lang.String str7 = admin2.getID();
        admin2.login("admin", "admin");
        admin2.viewProfile();
        admin2.setVerified(false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
    }

    @Test
    public void test02413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02413");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        java.lang.String str4 = admin2.getAccountType();
        java.lang.String str5 = admin2.getPassword();
        admin2.logout();
        admin2.logout();
        java.lang.String str8 = admin2.getEmail();
        room.Room room9 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.addRoom(room9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.getRoomID()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "admin" + "'", str4, "admin");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test02414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02414");
        model.Admin admin2 = new model.Admin("", "");
        java.lang.String str3 = admin2.getAccountType();
        admin2.setVerified(true);
        double double6 = admin2.getHourlyRate();
        admin2.setVerified(false);
        java.lang.String str9 = admin2.getEmail();
        java.lang.String str10 = admin2.getPassword();
        boolean boolean11 = admin2.isVerified();
        room.Room room12 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.addRoom(room12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.getRoomID()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test02415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02415");
        model.Admin admin2 = new model.Admin("admin", "admin");
        boolean boolean3 = admin2.isVerified();
        admin2.login("hi!", "");
        admin2.setVerified(true);
        admin2.viewProfile();
        admin2.viewProfile();
        java.lang.String str11 = admin2.getID();
        boolean boolean12 = admin2.isVerified();
        room.Room room13 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.addRoom(room13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.getRoomID()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "admin" + "'", str11, "admin");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test02416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02416");
        model.Admin admin2 = new model.Admin("admin", "admin");
        admin2.login("admin", "admin");
        boolean boolean6 = admin2.isVerified();
        admin2.logout();
        java.lang.String str8 = admin2.getID();
        admin2.logout();
        java.lang.String str10 = admin2.getID();
        admin2.login("hi!", "");
        admin2.login("admin", "hi!");
        admin2.logout();
        admin2.logout();
        java.lang.String str19 = admin2.getID();
        room.Room room20 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.disableRoom(room20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "admin" + "'", str8, "admin");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "admin" + "'", str10, "admin");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "admin" + "'", str19, "admin");
    }

    @Test
    public void test02417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02417");
        model.Admin admin2 = new model.Admin("", "admin");
        java.lang.String str3 = admin2.getEmail();
        admin2.viewProfile();
        java.lang.Class<?> wildcardClass5 = admin2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test02418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02418");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        double double5 = admin2.getHourlyRate();
        double double6 = admin2.getHourlyRate();
        java.lang.String str7 = admin2.getID();
        admin2.login("", "admin");
        admin2.viewProfile();
        boolean boolean12 = admin2.isVerified();
        admin2.setVerified(true);
        java.lang.String str15 = admin2.getEmail();
        admin2.viewProfile();
        java.lang.Class<?> wildcardClass17 = admin2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test02419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02419");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        java.lang.String str4 = admin2.getPassword();
        java.lang.String str5 = admin2.getAccountType();
        java.lang.String str6 = admin2.getID();
        admin2.login("admin", "admin");
        java.lang.String str10 = admin2.getAccountType();
        java.lang.String str11 = admin2.getEmail();
        room.Room room12 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.disableRoom(room12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "admin" + "'", str6, "admin");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "admin" + "'", str10, "admin");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test02420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02420");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        admin2.logout();
        java.lang.String str5 = admin2.getAccountType();
        admin2.login("", "");
        java.lang.String str9 = admin2.getPassword();
        java.lang.String str10 = admin2.getID();
        java.lang.String str11 = admin2.getAccountType();
        java.lang.String str12 = admin2.getPassword();
        double double13 = admin2.getHourlyRate();
        java.lang.String str14 = admin2.getID();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "admin" + "'", str10, "admin");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "admin" + "'", str11, "admin");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "admin" + "'", str14, "admin");
    }

    @Test
    public void test02421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02421");
        model.Admin admin2 = new model.Admin("admin", "admin");
        admin2.login("admin", "admin");
        boolean boolean6 = admin2.isVerified();
        admin2.logout();
        admin2.setVerified(false);
        admin2.setVerified(false);
        admin2.logout();
        java.lang.String str13 = admin2.getAccountType();
        admin2.setVerified(false);
        java.lang.Class<?> wildcardClass16 = admin2.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "admin" + "'", str13, "admin");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test02422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02422");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        java.lang.String str4 = admin2.getEmail();
        admin2.logout();
        admin2.logout();
        java.lang.String str7 = admin2.getPassword();
        java.lang.String str8 = admin2.getPassword();
        room.Room room9 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.enableRoom(room9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test02423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02423");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        admin2.logout();
        java.lang.String str4 = admin2.getAccountType();
        admin2.logout();
        java.lang.String str6 = admin2.getPassword();
        java.lang.String str7 = admin2.getAccountType();
        room.Room room8 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.disableRoom(room8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "admin" + "'", str4, "admin");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
    }

    @Test
    public void test02424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02424");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getAccountType();
        boolean boolean4 = admin2.isVerified();
        boolean boolean5 = admin2.isVerified();
        admin2.viewProfile();
        java.lang.String str7 = admin2.getID();
        admin2.login("", "admin");
        room.Room room11 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.enableRoom(room11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
    }

    @Test
    public void test02425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02425");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        double double5 = admin2.getHourlyRate();
        admin2.setVerified(true);
        double double8 = admin2.getHourlyRate();
        admin2.logout();
        admin2.login("hi!", "");
        boolean boolean13 = admin2.isVerified();
        double double14 = admin2.getHourlyRate();
        java.lang.String str15 = admin2.getAccountType();
        double double16 = admin2.getHourlyRate();
        room.Room room17 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.disableRoom(room17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "admin" + "'", str15, "admin");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
    }

    @Test
    public void test02426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02426");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        double double5 = admin2.getHourlyRate();
        double double6 = admin2.getHourlyRate();
        java.lang.String str7 = admin2.getPassword();
        admin2.setVerified(true);
        boolean boolean10 = admin2.isVerified();
        admin2.setVerified(true);
        room.Room room13 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.enableRoom(room13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test02427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02427");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        java.lang.String str5 = admin2.getID();
        java.lang.String str6 = admin2.getID();
        admin2.logout();
        java.lang.String str8 = admin2.getID();
        boolean boolean9 = admin2.isVerified();
        admin2.logout();
        java.lang.Class<?> wildcardClass11 = admin2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "admin" + "'", str6, "admin");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "admin" + "'", str8, "admin");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test02428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02428");
        model.Admin admin2 = new model.Admin("admin", "");
        admin2.setVerified(true);
        admin2.logout();
        admin2.login("admin", "hi!");
        java.lang.String str9 = admin2.getPassword();
        java.lang.String str10 = admin2.getID();
        double double11 = admin2.getHourlyRate();
        java.lang.String str12 = admin2.getEmail();
        admin2.login("hi!", "");
        room.Room room16 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.enableRoom(room16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "admin" + "'", str10, "admin");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "admin" + "'", str12, "admin");
    }

    @Test
    public void test02429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02429");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        double double5 = admin2.getHourlyRate();
        double double6 = admin2.getHourlyRate();
        java.lang.String str7 = admin2.getPassword();
        admin2.logout();
        admin2.setVerified(true);
        admin2.logout();
        admin2.login("", "");
        admin2.login("", "");
        room.Room room18 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.disableRoom(room18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test02430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02430");
        model.Admin admin2 = new model.Admin("admin", "admin");
        admin2.viewProfile();
        java.lang.String str4 = admin2.getID();
        java.lang.String str5 = admin2.getPassword();
        double double6 = admin2.getHourlyRate();
        admin2.setVerified(true);
        admin2.logout();
        java.lang.String str10 = admin2.getEmail();
        room.Room room11 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.disableRoom(room11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "admin" + "'", str4, "admin");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "admin" + "'", str10, "admin");
    }

    @Test
    public void test02431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02431");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        admin2.logout();
        java.lang.String str5 = admin2.getAccountType();
        boolean boolean6 = admin2.isVerified();
        admin2.login("hi!", "admin");
        java.lang.String str10 = admin2.getAccountType();
        java.lang.String str11 = admin2.getEmail();
        admin2.viewProfile();
        double double13 = admin2.getHourlyRate();
        admin2.setVerified(true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "admin" + "'", str10, "admin");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test02432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02432");
        model.Admin admin2 = new model.Admin("admin", "");
        admin2.logout();
        double double4 = admin2.getHourlyRate();
        admin2.setVerified(false);
        double double7 = admin2.getHourlyRate();
        java.lang.String str8 = admin2.getID();
        boolean boolean9 = admin2.isVerified();
        admin2.viewProfile();
        room.Room room11 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.addRoom(room11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.getRoomID()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "admin" + "'", str8, "admin");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test02433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02433");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        java.lang.String str4 = admin2.getPassword();
        java.lang.String str5 = admin2.getAccountType();
        admin2.viewProfile();
        java.lang.Class<?> wildcardClass7 = admin2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test02434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02434");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        admin2.logout();
        admin2.setVerified(false);
        java.lang.String str6 = admin2.getEmail();
        admin2.viewProfile();
        admin2.viewProfile();
        double double9 = admin2.getHourlyRate();
        admin2.setVerified(true);
        admin2.viewProfile();
        double double13 = admin2.getHourlyRate();
        java.lang.String str14 = admin2.getPassword();
        room.Room room15 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.addRoom(room15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.getRoomID()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test02435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02435");
        model.Admin admin2 = new model.Admin("admin", "admin");
        admin2.viewProfile();
        java.lang.String str4 = admin2.getPassword();
        java.lang.String str5 = admin2.getID();
        admin2.logout();
        room.Room room7 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.addRoom(room7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.getRoomID()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "admin" + "'", str4, "admin");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
    }

    @Test
    public void test02436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02436");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        double double5 = admin2.getHourlyRate();
        admin2.login("admin", "hi!");
        admin2.viewProfile();
        admin2.setVerified(true);
        admin2.setVerified(false);
        room.Room room14 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.disableRoom(room14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test02437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02437");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        double double5 = admin2.getHourlyRate();
        double double6 = admin2.getHourlyRate();
        java.lang.String str7 = admin2.getPassword();
        admin2.setVerified(true);
        boolean boolean10 = admin2.isVerified();
        java.lang.String str11 = admin2.getPassword();
        admin2.setVerified(false);
        room.Room room14 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.enableRoom(room14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test02438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02438");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        double double5 = admin2.getHourlyRate();
        double double6 = admin2.getHourlyRate();
        java.lang.String str7 = admin2.getID();
        boolean boolean8 = admin2.isVerified();
        java.lang.String str9 = admin2.getPassword();
        admin2.logout();
        admin2.setVerified(false);
        admin2.login("admin", "admin");
        admin2.login("admin", "hi!");
        java.lang.String str19 = admin2.getPassword();
        admin2.viewProfile();
        room.Room room21 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.addRoom(room21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.getRoomID()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test02439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02439");
        model.Admin admin2 = new model.Admin("admin", "admin");
        admin2.login("admin", "admin");
        boolean boolean6 = admin2.isVerified();
        admin2.logout();
        java.lang.String str8 = admin2.getPassword();
        admin2.viewProfile();
        admin2.logout();
        java.lang.String str11 = admin2.getEmail();
        double double12 = admin2.getHourlyRate();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "admin" + "'", str8, "admin");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "admin" + "'", str11, "admin");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test02440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02440");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        double double5 = admin2.getHourlyRate();
        admin2.setVerified(false);
        admin2.login("hi!", "");
        boolean boolean11 = admin2.isVerified();
        admin2.login("hi!", "");
        room.Room room15 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.enableRoom(room15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test02441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02441");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        double double5 = admin2.getHourlyRate();
        double double6 = admin2.getHourlyRate();
        java.lang.String str7 = admin2.getID();
        boolean boolean8 = admin2.isVerified();
        java.lang.String str9 = admin2.getPassword();
        admin2.logout();
        boolean boolean11 = admin2.isVerified();
        double double12 = admin2.getHourlyRate();
        java.lang.String str13 = admin2.getPassword();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test02442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02442");
        model.Admin admin2 = new model.Admin("admin", "admin");
        admin2.viewProfile();
        java.lang.String str4 = admin2.getID();
        admin2.logout();
        java.lang.String str6 = admin2.getAccountType();
        admin2.viewProfile();
        admin2.setVerified(true);
        java.lang.String str10 = admin2.getAccountType();
        java.lang.String str11 = admin2.getEmail();
        room.Room room12 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.disableRoom(room12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "admin" + "'", str4, "admin");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "admin" + "'", str6, "admin");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "admin" + "'", str10, "admin");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "admin" + "'", str11, "admin");
    }

    @Test
    public void test02443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02443");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getAccountType();
        boolean boolean4 = admin2.isVerified();
        boolean boolean5 = admin2.isVerified();
        admin2.logout();
        admin2.login("admin", "hi!");
        java.lang.String str10 = admin2.getPassword();
        room.Room room11 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.enableRoom(room11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test02444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02444");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        double double5 = admin2.getHourlyRate();
        double double6 = admin2.getHourlyRate();
        java.lang.String str7 = admin2.getID();
        admin2.viewProfile();
        double double9 = admin2.getHourlyRate();
        admin2.setVerified(true);
        admin2.logout();
        boolean boolean13 = admin2.isVerified();
        java.lang.String str14 = admin2.getPassword();
        room.Room room15 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.enableRoom(room15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test02445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02445");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        admin2.logout();
        java.lang.String str5 = admin2.getAccountType();
        boolean boolean6 = admin2.isVerified();
        admin2.login("hi!", "");
        java.lang.String str10 = admin2.getEmail();
        double double11 = admin2.getHourlyRate();
        admin2.viewProfile();
        admin2.logout();
        admin2.login("", "admin");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test02446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02446");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getAccountType();
        boolean boolean4 = admin2.isVerified();
        java.lang.String str5 = admin2.getPassword();
        java.lang.String str6 = admin2.getID();
        java.lang.String str7 = admin2.getID();
        java.lang.String str8 = admin2.getAccountType();
        java.lang.String str9 = admin2.getEmail();
        admin2.login("", "hi!");
        room.Room room13 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.enableRoom(room13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "admin" + "'", str6, "admin");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "admin" + "'", str8, "admin");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test02447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02447");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        double double5 = admin2.getHourlyRate();
        double double6 = admin2.getHourlyRate();
        java.lang.String str7 = admin2.getID();
        admin2.viewProfile();
        admin2.logout();
        admin2.setVerified(false);
        java.lang.String str12 = admin2.getEmail();
        boolean boolean13 = admin2.isVerified();
        admin2.viewProfile();
        admin2.setVerified(true);
        java.lang.Class<?> wildcardClass17 = admin2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test02448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02448");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getAccountType();
        java.lang.String str4 = admin2.getPassword();
        admin2.setVerified(true);
        java.lang.String str7 = admin2.getEmail();
        double double8 = admin2.getHourlyRate();
        admin2.logout();
        room.Room room10 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.enableRoom(room10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test02449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02449");
        model.Admin admin2 = new model.Admin("admin", "");
        admin2.viewProfile();
        admin2.login("admin", "admin");
    }

    @Test
    public void test02450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02450");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        admin2.logout();
        java.lang.String str5 = admin2.getAccountType();
        admin2.logout();
        java.lang.String str7 = admin2.getPassword();
        java.lang.String str8 = admin2.getEmail();
        java.lang.String str9 = admin2.getPassword();
        room.Room room10 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.enableRoom(room10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test02451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02451");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        double double5 = admin2.getHourlyRate();
        double double6 = admin2.getHourlyRate();
        java.lang.String str7 = admin2.getPassword();
        admin2.setVerified(true);
        java.lang.String str10 = admin2.getEmail();
        java.lang.String str11 = admin2.getID();
        java.lang.String str12 = admin2.getID();
        admin2.setVerified(true);
        admin2.login("hi!", "admin");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "admin" + "'", str11, "admin");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "admin" + "'", str12, "admin");
    }

    @Test
    public void test02452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02452");
        model.Admin admin2 = new model.Admin("admin", "");
        admin2.setVerified(true);
        boolean boolean5 = admin2.isVerified();
        java.lang.String str6 = admin2.getAccountType();
        admin2.logout();
        boolean boolean8 = admin2.isVerified();
        java.lang.Class<?> wildcardClass9 = admin2.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "admin" + "'", str6, "admin");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test02453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02453");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        double double5 = admin2.getHourlyRate();
        admin2.login("admin", "hi!");
        admin2.viewProfile();
        admin2.setVerified(true);
        room.Room room12 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.enableRoom(room12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test02454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02454");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        double double5 = admin2.getHourlyRate();
        double double6 = admin2.getHourlyRate();
        java.lang.String str7 = admin2.getID();
        boolean boolean8 = admin2.isVerified();
        admin2.viewProfile();
        room.Room room10 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.disableRoom(room10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test02455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02455");
        model.Admin admin2 = new model.Admin("admin", "admin");
        admin2.viewProfile();
        java.lang.String str4 = admin2.getID();
        java.lang.String str5 = admin2.getAccountType();
        java.lang.String str6 = admin2.getEmail();
        double double7 = admin2.getHourlyRate();
        java.lang.String str8 = admin2.getID();
        room.Room room9 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.addRoom(room9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.getRoomID()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "admin" + "'", str4, "admin");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "admin" + "'", str6, "admin");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "admin" + "'", str8, "admin");
    }

    @Test
    public void test02456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02456");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        admin2.logout();
        admin2.setVerified(false);
        java.lang.String str6 = admin2.getEmail();
        admin2.setVerified(false);
        admin2.setVerified(true);
        java.lang.Class<?> wildcardClass11 = admin2.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test02457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02457");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        double double5 = admin2.getHourlyRate();
        double double6 = admin2.getHourlyRate();
        java.lang.String str7 = admin2.getPassword();
        admin2.setVerified(true);
        java.lang.String str10 = admin2.getEmail();
        java.lang.String str11 = admin2.getEmail();
        room.Room room12 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.disableRoom(room12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test02458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02458");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        double double5 = admin2.getHourlyRate();
        double double6 = admin2.getHourlyRate();
        java.lang.String str7 = admin2.getID();
        boolean boolean8 = admin2.isVerified();
        admin2.login("", "");
        admin2.viewProfile();
        boolean boolean13 = admin2.isVerified();
        boolean boolean14 = admin2.isVerified();
        admin2.logout();
        admin2.setVerified(false);
        java.lang.String str18 = admin2.getEmail();
        room.Room room19 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.disableRoom(room19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test02459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02459");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        admin2.logout();
        java.lang.String str5 = admin2.getAccountType();
        admin2.viewProfile();
        admin2.setVerified(false);
        admin2.login("hi!", "admin");
        admin2.setVerified(false);
        java.lang.String str14 = admin2.getPassword();
        boolean boolean15 = admin2.isVerified();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test02460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02460");
        model.Admin admin2 = new model.Admin("admin", "");
        admin2.setVerified(true);
        java.lang.String str5 = admin2.getID();
        room.Room room6 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.enableRoom(room6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
    }

    @Test
    public void test02461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02461");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        double double5 = admin2.getHourlyRate();
        double double6 = admin2.getHourlyRate();
        java.lang.String str7 = admin2.getID();
        admin2.viewProfile();
        java.lang.String str9 = admin2.getID();
        admin2.logout();
        admin2.viewProfile();
        admin2.login("hi!", "");
        admin2.logout();
        room.Room room16 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.addRoom(room16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.getRoomID()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "admin" + "'", str9, "admin");
    }

    @Test
    public void test02462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02462");
        model.Admin admin2 = new model.Admin("admin", "admin");
        admin2.login("admin", "admin");
        boolean boolean6 = admin2.isVerified();
        admin2.logout();
        java.lang.String str8 = admin2.getID();
        admin2.setVerified(true);
        admin2.setVerified(true);
        boolean boolean13 = admin2.isVerified();
        java.lang.String str14 = admin2.getPassword();
        java.lang.String str15 = admin2.getID();
        java.lang.String str16 = admin2.getPassword();
        java.lang.String str17 = admin2.getEmail();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "admin" + "'", str8, "admin");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "admin" + "'", str14, "admin");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "admin" + "'", str15, "admin");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "admin" + "'", str16, "admin");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "admin" + "'", str17, "admin");
    }

    @Test
    public void test02463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02463");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getAccountType();
        boolean boolean4 = admin2.isVerified();
        java.lang.String str5 = admin2.getPassword();
        admin2.logout();
        admin2.login("", "");
        admin2.logout();
        java.lang.Class<?> wildcardClass11 = admin2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test02464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02464");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getAccountType();
        boolean boolean4 = admin2.isVerified();
        admin2.setVerified(false);
        admin2.setVerified(false);
        admin2.logout();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test02465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02465");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        double double5 = admin2.getHourlyRate();
        double double6 = admin2.getHourlyRate();
        java.lang.String str7 = admin2.getPassword();
        admin2.setVerified(true);
        java.lang.String str10 = admin2.getEmail();
        java.lang.String str11 = admin2.getEmail();
        double double12 = admin2.getHourlyRate();
        java.lang.String str13 = admin2.getPassword();
        room.Room room14 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.addRoom(room14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.getRoomID()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test02466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02466");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        admin2.logout();
        java.lang.String str5 = admin2.getAccountType();
        admin2.viewProfile();
        admin2.setVerified(false);
        java.lang.String str9 = admin2.getEmail();
        java.lang.String str10 = admin2.getPassword();
        java.lang.String str11 = admin2.getAccountType();
        room.Room room12 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.addRoom(room12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.getRoomID()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "admin" + "'", str11, "admin");
    }

    @Test
    public void test02467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02467");
        model.Admin admin2 = new model.Admin("", "");
        java.lang.String str3 = admin2.getAccountType();
        admin2.setVerified(true);
        double double6 = admin2.getHourlyRate();
        admin2.login("", "admin");
        double double10 = admin2.getHourlyRate();
        java.lang.String str11 = admin2.getEmail();
        room.Room room12 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.disableRoom(room12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test02468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02468");
        model.Admin admin2 = new model.Admin("admin", "admin");
        boolean boolean3 = admin2.isVerified();
        admin2.login("hi!", "");
        admin2.setVerified(true);
        java.lang.String str9 = admin2.getAccountType();
        java.lang.String str10 = admin2.getPassword();
        admin2.setVerified(true);
        room.Room room13 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.disableRoom(room13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "admin" + "'", str9, "admin");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "admin" + "'", str10, "admin");
    }

    @Test
    public void test02469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02469");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        double double5 = admin2.getHourlyRate();
        double double6 = admin2.getHourlyRate();
        java.lang.String str7 = admin2.getID();
        boolean boolean8 = admin2.isVerified();
        admin2.login("", "");
        admin2.viewProfile();
        java.lang.String str13 = admin2.getPassword();
        boolean boolean14 = admin2.isVerified();
        admin2.logout();
        room.Room room16 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.disableRoom(room16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test02470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02470");
        model.Admin admin2 = new model.Admin("admin", "");
        admin2.setVerified(true);
        java.lang.String str5 = admin2.getEmail();
        double double6 = admin2.getHourlyRate();
        admin2.viewProfile();
        admin2.viewProfile();
        java.lang.String str9 = admin2.getEmail();
        java.lang.String str10 = admin2.getAccountType();
        admin2.logout();
        java.lang.String str12 = admin2.getPassword();
        admin2.viewProfile();
        boolean boolean14 = admin2.isVerified();
        room.Room room15 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.addRoom(room15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.getRoomID()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "admin" + "'", str9, "admin");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "admin" + "'", str10, "admin");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test02471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02471");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        java.lang.String str5 = admin2.getID();
        java.lang.String str6 = admin2.getID();
        java.lang.String str7 = admin2.getAccountType();
        admin2.logout();
        java.lang.String str9 = admin2.getEmail();
        java.lang.String str10 = admin2.getPassword();
        java.lang.Class<?> wildcardClass11 = admin2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "admin" + "'", str6, "admin");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test02472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02472");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        admin2.logout();
        java.lang.String str5 = admin2.getAccountType();
        admin2.viewProfile();
        admin2.setVerified(false);
        java.lang.String str9 = admin2.getEmail();
        admin2.setVerified(false);
        java.lang.String str12 = admin2.getEmail();
        double double13 = admin2.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test02473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02473");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        double double5 = admin2.getHourlyRate();
        admin2.setVerified(true);
        double double8 = admin2.getHourlyRate();
        admin2.logout();
        admin2.login("hi!", "");
        admin2.setVerified(false);
        java.lang.String str15 = admin2.getAccountType();
        java.lang.String str16 = admin2.getEmail();
        admin2.login("", "hi!");
        admin2.viewProfile();
        admin2.setVerified(true);
        room.Room room23 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.enableRoom(room23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "admin" + "'", str15, "admin");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test02474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02474");
        model.Admin admin2 = new model.Admin("", "");
        java.lang.String str3 = admin2.getAccountType();
        java.lang.String str4 = admin2.getEmail();
        double double5 = admin2.getHourlyRate();
        admin2.setVerified(true);
        admin2.logout();
        admin2.viewProfile();
        admin2.login("", "");
        room.Room room13 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.disableRoom(room13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test02475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02475");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        double double5 = admin2.getHourlyRate();
        double double6 = admin2.getHourlyRate();
        admin2.setVerified(true);
        java.lang.String str9 = admin2.getPassword();
        admin2.login("hi!", "admin");
        java.lang.String str13 = admin2.getID();
        room.Room room14 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.disableRoom(room14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "admin" + "'", str13, "admin");
    }

    @Test
    public void test02476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02476");
        model.Admin admin2 = new model.Admin("", "");
        java.lang.String str3 = admin2.getAccountType();
        admin2.setVerified(true);
        double double6 = admin2.getHourlyRate();
        admin2.setVerified(false);
        admin2.logout();
        admin2.setVerified(true);
        admin2.logout();
        room.Room room13 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.disableRoom(room13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test02477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02477");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        java.lang.String str4 = admin2.getPassword();
        java.lang.String str5 = admin2.getAccountType();
        admin2.viewProfile();
        double double7 = admin2.getHourlyRate();
        java.lang.String str8 = admin2.getID();
        java.lang.String str9 = admin2.getAccountType();
        java.lang.String str10 = admin2.getPassword();
        admin2.logout();
        java.lang.String str12 = admin2.getAccountType();
        java.lang.String str13 = admin2.getAccountType();
        java.lang.String str14 = admin2.getEmail();
        room.Room room15 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.disableRoom(room15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "admin" + "'", str8, "admin");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "admin" + "'", str9, "admin");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "admin" + "'", str12, "admin");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "admin" + "'", str13, "admin");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test02478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02478");
        model.Admin admin2 = new model.Admin("", "");
        java.lang.String str3 = admin2.getAccountType();
        java.lang.String str4 = admin2.getEmail();
        java.lang.String str5 = admin2.getID();
        double double6 = admin2.getHourlyRate();
        java.lang.String str7 = admin2.getAccountType();
        admin2.setVerified(false);
        boolean boolean10 = admin2.isVerified();
        java.lang.String str11 = admin2.getID();
        java.lang.Class<?> wildcardClass12 = admin2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "admin" + "'", str11, "admin");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test02479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02479");
        model.Admin admin2 = new model.Admin("admin", "");
        admin2.setVerified(true);
        java.lang.String str5 = admin2.getEmail();
        double double6 = admin2.getHourlyRate();
        java.lang.String str7 = admin2.getPassword();
        java.lang.String str8 = admin2.getEmail();
        java.lang.String str9 = admin2.getAccountType();
        java.lang.String str10 = admin2.getPassword();
        admin2.viewProfile();
        java.lang.Class<?> wildcardClass12 = admin2.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "admin" + "'", str8, "admin");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "admin" + "'", str9, "admin");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test02480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02480");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getAccountType();
        boolean boolean4 = admin2.isVerified();
        admin2.login("admin", "admin");
        room.Room room8 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.addRoom(room8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.getRoomID()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test02481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02481");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        java.lang.String str4 = admin2.getPassword();
        java.lang.String str5 = admin2.getAccountType();
        admin2.viewProfile();
        double double7 = admin2.getHourlyRate();
        java.lang.String str8 = admin2.getEmail();
        java.lang.String str9 = admin2.getAccountType();
        java.lang.String str10 = admin2.getEmail();
        java.lang.Class<?> wildcardClass11 = admin2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "admin" + "'", str9, "admin");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test02482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02482");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        double double5 = admin2.getHourlyRate();
        java.lang.String str6 = admin2.getPassword();
        admin2.login("", "admin");
        admin2.logout();
        java.lang.String str11 = admin2.getPassword();
        room.Room room12 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.addRoom(room12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.getRoomID()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test02483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02483");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getAccountType();
        boolean boolean4 = admin2.isVerified();
        java.lang.String str5 = admin2.getPassword();
        admin2.logout();
        admin2.viewProfile();
        admin2.setVerified(false);
        java.lang.String str10 = admin2.getEmail();
        java.lang.String str11 = admin2.getAccountType();
        admin2.viewProfile();
        java.lang.String str13 = admin2.getID();
        room.Room room14 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.addRoom(room14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.getRoomID()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "admin" + "'", str11, "admin");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "admin" + "'", str13, "admin");
    }

    @Test
    public void test02484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02484");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        admin2.logout();
        java.lang.String str5 = admin2.getAccountType();
        boolean boolean6 = admin2.isVerified();
        java.lang.String str7 = admin2.getAccountType();
        java.lang.String str8 = admin2.getID();
        room.Room room9 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.disableRoom(room9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "admin" + "'", str8, "admin");
    }

    @Test
    public void test02485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02485");
        model.Admin admin2 = new model.Admin("", "");
        java.lang.String str3 = admin2.getAccountType();
        java.lang.String str4 = admin2.getEmail();
        admin2.login("hi!", "");
        java.lang.String str8 = admin2.getAccountType();
        java.lang.String str9 = admin2.getEmail();
        double double10 = admin2.getHourlyRate();
        room.Room room11 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.disableRoom(room11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "admin" + "'", str8, "admin");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test02486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02486");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getAccountType();
        boolean boolean4 = admin2.isVerified();
        java.lang.String str5 = admin2.getPassword();
        java.lang.String str6 = admin2.getID();
        java.lang.String str7 = admin2.getID();
        boolean boolean8 = admin2.isVerified();
        admin2.setVerified(false);
        java.lang.String str11 = admin2.getEmail();
        double double12 = admin2.getHourlyRate();
        admin2.logout();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "admin" + "'", str6, "admin");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test02487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02487");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        admin2.logout();
        java.lang.String str5 = admin2.getAccountType();
        boolean boolean6 = admin2.isVerified();
        admin2.login("hi!", "");
        java.lang.String str10 = admin2.getEmail();
        admin2.login("hi!", "hi!");
        admin2.logout();
        java.lang.String str15 = admin2.getPassword();
        room.Room room16 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.addRoom(room16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.getRoomID()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test02488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02488");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        double double5 = admin2.getHourlyRate();
        double double6 = admin2.getHourlyRate();
        java.lang.String str7 = admin2.getPassword();
        admin2.setVerified(true);
        java.lang.String str10 = admin2.getEmail();
        java.lang.String str11 = admin2.getID();
        java.lang.String str12 = admin2.getID();
        admin2.viewProfile();
        java.lang.String str14 = admin2.getID();
        java.lang.Class<?> wildcardClass15 = admin2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "admin" + "'", str11, "admin");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "admin" + "'", str12, "admin");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "admin" + "'", str14, "admin");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test02489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02489");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        java.lang.String str5 = admin2.getAccountType();
        double double6 = admin2.getHourlyRate();
        admin2.login("", "");
        java.lang.String str10 = admin2.getEmail();
        room.Room room11 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.addRoom(room11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.getRoomID()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test02490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02490");
        model.Admin admin2 = new model.Admin("", "admin");
        java.lang.String str3 = admin2.getEmail();
        admin2.viewProfile();
        java.lang.String str5 = admin2.getAccountType();
        admin2.viewProfile();
        double double7 = admin2.getHourlyRate();
        room.Room room8 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.enableRoom(room8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test02491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02491");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        java.lang.String str4 = admin2.getEmail();
        admin2.logout();
        admin2.logout();
        admin2.setVerified(true);
        boolean boolean9 = admin2.isVerified();
        room.Room room10 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.addRoom(room10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.getRoomID()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test02492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02492");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        double double5 = admin2.getHourlyRate();
        double double6 = admin2.getHourlyRate();
        java.lang.String str7 = admin2.getID();
        admin2.viewProfile();
        admin2.logout();
        admin2.setVerified(false);
        java.lang.String str12 = admin2.getEmail();
        java.lang.String str13 = admin2.getID();
        admin2.login("", "admin");
        admin2.logout();
        admin2.viewProfile();
        java.lang.Class<?> wildcardClass19 = admin2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "admin" + "'", str13, "admin");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test02493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02493");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        double double5 = admin2.getHourlyRate();
        double double6 = admin2.getHourlyRate();
        java.lang.String str7 = admin2.getID();
        admin2.viewProfile();
        admin2.logout();
        java.lang.String str10 = admin2.getEmail();
        boolean boolean11 = admin2.isVerified();
        java.lang.String str12 = admin2.getAccountType();
        admin2.setVerified(false);
        java.lang.String str15 = admin2.getPassword();
        java.lang.String str16 = admin2.getEmail();
        java.lang.String str17 = admin2.getAccountType();
        admin2.setVerified(true);
        java.lang.String str20 = admin2.getPassword();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "admin" + "'", str12, "admin");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "admin" + "'", str17, "admin");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test02494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02494");
        model.Admin admin2 = new model.Admin("admin", "admin");
        admin2.logout();
        double double4 = admin2.getHourlyRate();
        admin2.logout();
        java.lang.String str6 = admin2.getID();
        room.Room room7 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.enableRoom(room7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "admin" + "'", str6, "admin");
    }

    @Test
    public void test02495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02495");
        model.Admin admin2 = new model.Admin("admin", "admin");
        admin2.logout();
        double double4 = admin2.getHourlyRate();
        admin2.logout();
        admin2.setVerified(false);
        double double8 = admin2.getHourlyRate();
        admin2.setVerified(false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test02496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02496");
        model.Admin admin2 = new model.Admin("", "");
        java.lang.String str3 = admin2.getAccountType();
        admin2.login("", "admin");
        double double7 = admin2.getHourlyRate();
        boolean boolean8 = admin2.isVerified();
        room.Room room9 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.disableRoom(room9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test02497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02497");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getAccountType();
        java.lang.String str4 = admin2.getPassword();
        boolean boolean5 = admin2.isVerified();
        admin2.setVerified(true);
        java.lang.String str8 = admin2.getAccountType();
        java.lang.String str9 = admin2.getEmail();
        room.Room room10 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.addRoom(room10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.getRoomID()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "admin" + "'", str8, "admin");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test02498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02498");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        double double5 = admin2.getHourlyRate();
        double double6 = admin2.getHourlyRate();
        java.lang.String str7 = admin2.getPassword();
        admin2.setVerified(true);
        java.lang.String str10 = admin2.getEmail();
        java.lang.String str11 = admin2.getID();
        boolean boolean12 = admin2.isVerified();
        admin2.login("hi!", "hi!");
        admin2.setVerified(false);
        admin2.login("", "admin");
        boolean boolean21 = admin2.isVerified();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "admin" + "'", str11, "admin");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test02499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02499");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        java.lang.String str4 = admin2.getEmail();
        admin2.logout();
        double double6 = admin2.getHourlyRate();
        java.lang.String str7 = admin2.getAccountType();
        java.lang.String str8 = admin2.getPassword();
        java.lang.Class<?> wildcardClass9 = admin2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test02500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02500");
        model.Admin admin2 = new model.Admin("admin", "admin");
        admin2.viewProfile();
        java.lang.String str4 = admin2.getPassword();
        admin2.login("", "");
        boolean boolean8 = admin2.isVerified();
        admin2.setVerified(true);
        admin2.setVerified(false);
        admin2.setVerified(false);
        java.lang.String str15 = admin2.getAccountType();
        double double16 = admin2.getHourlyRate();
        java.lang.String str17 = admin2.getAccountType();
        admin2.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "admin" + "'", str4, "admin");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "admin" + "'", str15, "admin");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "admin" + "'", str17, "admin");
    }
}

