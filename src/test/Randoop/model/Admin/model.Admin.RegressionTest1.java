import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest1 {

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
    public void test00501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00501");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        admin2.logout();
        java.lang.String str5 = admin2.getAccountType();
        admin2.login("", "");
        java.lang.String str9 = admin2.getEmail();
        java.lang.String str10 = admin2.getAccountType();
        admin2.login("", "admin");
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
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "admin" + "'", str10, "admin");
    }

    @Test
    public void test00502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00502");
        model.Admin admin2 = new model.Admin("", "hi!");
        java.lang.String str3 = admin2.getPassword();
        room.Room room4 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.enableRoom(room4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
    }

    @Test
    public void test00503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00503");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        admin2.logout();
        java.lang.String str5 = admin2.getAccountType();
        admin2.viewProfile();
        admin2.login("hi!", "admin");
        boolean boolean10 = admin2.isVerified();
        admin2.logout();
        java.lang.String str12 = admin2.getID();
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
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "admin" + "'", str12, "admin");
    }

    @Test
    public void test00504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00504");
        model.Admin admin2 = new model.Admin("admin", "admin");
        admin2.viewProfile();
        java.lang.String str4 = admin2.getPassword();
        admin2.login("", "");
        admin2.viewProfile();
        admin2.setVerified(true);
        room.Room room11 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.addRoom(room11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.getRoomID()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "admin" + "'", str4, "admin");
    }

    @Test
    public void test00505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00505");
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
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test00506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00506");
        model.Admin admin2 = new model.Admin("admin", "");
        admin2.setVerified(true);
        java.lang.String str5 = admin2.getAccountType();
        admin2.setVerified(false);
        java.lang.String str8 = admin2.getID();
        java.lang.Class<?> wildcardClass9 = admin2.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "admin" + "'", str8, "admin");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test00507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00507");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        admin2.logout();
        java.lang.String str5 = admin2.getAccountType();
        admin2.login("", "");
        java.lang.String str9 = admin2.getPassword();
        java.lang.String str10 = admin2.getID();
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
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "admin" + "'", str10, "admin");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "admin" + "'", str11, "admin");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "admin" + "'", str12, "admin");
    }

    @Test
    public void test00508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00508");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        admin2.logout();
        admin2.setVerified(false);
        java.lang.String str6 = admin2.getEmail();
        admin2.viewProfile();
        admin2.viewProfile();
        double double9 = admin2.getHourlyRate();
        admin2.viewProfile();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test00509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00509");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        admin2.logout();
        java.lang.String str5 = admin2.getAccountType();
        boolean boolean6 = admin2.isVerified();
        admin2.login("hi!", "");
        admin2.viewProfile();
        java.lang.Class<?> wildcardClass11 = admin2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00510");
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
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test00511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00511");
        model.Admin admin2 = new model.Admin("hi!", "admin");
        java.lang.String str3 = admin2.getID();
        admin2.setVerified(false);
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
    }

    @Test
    public void test00512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00512");
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
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "admin" + "'", str11, "admin");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "admin" + "'", str12, "admin");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test00513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00513");
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
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "admin" + "'", str11, "admin");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test00514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00514");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        double double5 = admin2.getHourlyRate();
        double double6 = admin2.getHourlyRate();
        admin2.viewProfile();
        admin2.login("", "");
        admin2.logout();
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
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test00515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00515");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        java.lang.String str5 = admin2.getID();
        admin2.setVerified(false);
        double double8 = admin2.getHourlyRate();
        boolean boolean9 = admin2.isVerified();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test00516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00516");
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
            admin2.enableRoom(room10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
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
    public void test00517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00517");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        double double5 = admin2.getHourlyRate();
        double double6 = admin2.getHourlyRate();
        java.lang.String str7 = admin2.getPassword();
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
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test00518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00518");
        model.Admin admin2 = new model.Admin("admin", "admin");
        boolean boolean3 = admin2.isVerified();
        admin2.login("hi!", "");
        admin2.viewProfile();
        java.lang.String str8 = admin2.getEmail();
        room.Room room9 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.addRoom(room9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.getRoomID()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "admin" + "'", str8, "admin");
    }

    @Test
    public void test00519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00519");
        model.Admin admin2 = new model.Admin("", "admin");
        java.lang.String str3 = admin2.getEmail();
        admin2.login("admin", "admin");
        admin2.logout();
        java.lang.Class<?> wildcardClass8 = admin2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test00520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00520");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        admin2.logout();
        java.lang.String str5 = admin2.getAccountType();
        admin2.login("", "");
        java.lang.String str9 = admin2.getPassword();
        java.lang.String str10 = admin2.getID();
        admin2.login("hi!", "");
        admin2.viewProfile();
        admin2.login("", "");
        java.lang.Class<?> wildcardClass18 = admin2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "admin" + "'", str10, "admin");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test00521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00521");
        model.Admin admin2 = new model.Admin("admin", "admin");
        admin2.viewProfile();
        java.lang.String str4 = admin2.getID();
        admin2.logout();
        java.lang.String str6 = admin2.getAccountType();
        java.lang.Class<?> wildcardClass7 = admin2.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "admin" + "'", str4, "admin");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "admin" + "'", str6, "admin");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test00522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00522");
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
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "admin" + "'", str12, "admin");
    }

    @Test
    public void test00523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00523");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        double double5 = admin2.getHourlyRate();
        double double6 = admin2.getHourlyRate();
        java.lang.String str7 = admin2.getID();
        admin2.setVerified(false);
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
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
    }

    @Test
    public void test00524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00524");
        model.Admin admin2 = new model.Admin("admin", "admin");
        admin2.viewProfile();
        java.lang.String str4 = admin2.getPassword();
        admin2.login("", "");
        admin2.login("hi!", "hi!");
        room.Room room11 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.addRoom(room11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.getRoomID()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "admin" + "'", str4, "admin");
    }

    @Test
    public void test00525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00525");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        admin2.logout();
        java.lang.String str5 = admin2.getAccountType();
        boolean boolean6 = admin2.isVerified();
        java.lang.String str7 = admin2.getAccountType();
        java.lang.String str8 = admin2.getAccountType();
        admin2.setVerified(false);
        java.lang.Class<?> wildcardClass11 = admin2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "admin" + "'", str8, "admin");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00526");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        admin2.logout();
        java.lang.String str5 = admin2.getAccountType();
        admin2.viewProfile();
        admin2.logout();
        double double8 = admin2.getHourlyRate();
        admin2.setVerified(false);
        java.lang.String str11 = admin2.getAccountType();
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
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "admin" + "'", str11, "admin");
    }

    @Test
    public void test00527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00527");
        model.Admin admin2 = new model.Admin("admin", "admin");
        boolean boolean3 = admin2.isVerified();
        admin2.login("hi!", "");
        double double7 = admin2.getHourlyRate();
        admin2.viewProfile();
        room.Room room9 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.disableRoom(room9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test00528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00528");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        java.lang.String str4 = admin2.getPassword();
        java.lang.String str5 = admin2.getAccountType();
        admin2.viewProfile();
        double double7 = admin2.getHourlyRate();
        java.lang.String str8 = admin2.getEmail();
        boolean boolean9 = admin2.isVerified();
        room.Room room10 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.disableRoom(room10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test00529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00529");
        model.Admin admin2 = new model.Admin("admin", "admin");
        boolean boolean3 = admin2.isVerified();
        admin2.login("hi!", "");
        admin2.setVerified(true);
        admin2.viewProfile();
        admin2.viewProfile();
        admin2.setVerified(true);
        java.lang.Class<?> wildcardClass13 = admin2.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00530");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        java.lang.String str4 = admin2.getPassword();
        java.lang.String str5 = admin2.getAccountType();
        admin2.viewProfile();
        double double7 = admin2.getHourlyRate();
        java.lang.String str8 = admin2.getID();
        java.lang.String str9 = admin2.getAccountType();
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
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "admin" + "'", str8, "admin");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "admin" + "'", str9, "admin");
    }

    @Test
    public void test00531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00531");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getAccountType();
        boolean boolean4 = admin2.isVerified();
        java.lang.String str5 = admin2.getEmail();
        java.lang.String str6 = admin2.getAccountType();
        java.lang.String str7 = admin2.getAccountType();
        admin2.viewProfile();
        java.lang.String str9 = admin2.getAccountType();
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
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "admin" + "'", str6, "admin");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "admin" + "'", str9, "admin");
    }

    @Test
    public void test00532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00532");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        java.lang.String str4 = admin2.getAccountType();
        java.lang.String str5 = admin2.getID();
        java.lang.String str6 = admin2.getEmail();
        java.lang.String str7 = admin2.getPassword();
        java.lang.String str8 = admin2.getID();
        java.lang.String str9 = admin2.getAccountType();
        admin2.logout();
        java.lang.String str11 = admin2.getAccountType();
        java.lang.Class<?> wildcardClass12 = admin2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "admin" + "'", str4, "admin");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "admin" + "'", str8, "admin");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "admin" + "'", str9, "admin");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "admin" + "'", str11, "admin");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test00533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00533");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        double double5 = admin2.getHourlyRate();
        double double6 = admin2.getHourlyRate();
        java.lang.String str7 = admin2.getID();
        boolean boolean8 = admin2.isVerified();
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
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test00534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00534");
        model.Admin admin2 = new model.Admin("", "");
        java.lang.String str3 = admin2.getAccountType();
        java.lang.String str4 = admin2.getPassword();
        room.Room room5 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.disableRoom(room5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test00535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00535");
        model.Admin admin2 = new model.Admin("admin", "admin");
        admin2.login("admin", "admin");
        boolean boolean6 = admin2.isVerified();
        admin2.logout();
        java.lang.String str8 = admin2.getPassword();
        room.Room room9 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.addRoom(room9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.getRoomID()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "admin" + "'", str8, "admin");
    }

    @Test
    public void test00536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00536");
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
        java.lang.String str17 = admin2.getPassword();
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
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "admin" + "'", str12, "admin");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test00537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00537");
        model.Admin admin2 = new model.Admin("", "");
        java.lang.String str3 = admin2.getAccountType();
        java.lang.String str4 = admin2.getEmail();
        java.lang.String str5 = admin2.getID();
        double double6 = admin2.getHourlyRate();
        java.lang.String str7 = admin2.getAccountType();
        admin2.setVerified(false);
        admin2.viewProfile();
        admin2.login("hi!", "hi!");
        admin2.login("", "hi!");
        java.lang.Class<?> wildcardClass17 = admin2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test00538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00538");
        model.Admin admin2 = new model.Admin("admin", "admin");
        boolean boolean3 = admin2.isVerified();
        admin2.login("hi!", "");
        double double7 = admin2.getHourlyRate();
        java.lang.String str8 = admin2.getEmail();
        room.Room room9 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.disableRoom(room9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "admin" + "'", str8, "admin");
    }

    @Test
    public void test00539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00539");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        admin2.logout();
        java.lang.String str5 = admin2.getAccountType();
        admin2.login("", "");
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
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "admin" + "'", str10, "admin");
    }

    @Test
    public void test00540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00540");
        model.Admin admin2 = new model.Admin("admin", "admin");
        admin2.viewProfile();
        admin2.viewProfile();
        admin2.login("hi!", "admin");
        java.lang.Class<?> wildcardClass8 = admin2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test00541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00541");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        admin2.logout();
        java.lang.String str5 = admin2.getAccountType();
        boolean boolean6 = admin2.isVerified();
        admin2.login("hi!", "admin");
        admin2.setVerified(false);
        double double12 = admin2.getHourlyRate();
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
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test00542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00542");
        model.Admin admin2 = new model.Admin("admin", "admin");
        admin2.login("admin", "admin");
        boolean boolean6 = admin2.isVerified();
        admin2.logout();
        java.lang.String str8 = admin2.getID();
        admin2.logout();
        double double10 = admin2.getHourlyRate();
        boolean boolean11 = admin2.isVerified();
        java.lang.String str12 = admin2.getPassword();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "admin" + "'", str8, "admin");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "admin" + "'", str12, "admin");
    }

    @Test
    public void test00543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00543");
        model.Admin admin2 = new model.Admin("admin", "admin");
        admin2.viewProfile();
        java.lang.String str4 = admin2.getPassword();
        admin2.login("", "");
        boolean boolean8 = admin2.isVerified();
        admin2.setVerified(true);
        admin2.setVerified(false);
        room.Room room13 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.disableRoom(room13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "admin" + "'", str4, "admin");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test00544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00544");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getPassword();
        boolean boolean4 = admin2.isVerified();
        room.Room room5 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.addRoom(room5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.getRoomID()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test00545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00545");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        java.lang.String str4 = admin2.getEmail();
        admin2.logout();
        admin2.logout();
        double double7 = admin2.getHourlyRate();
        java.lang.Class<?> wildcardClass8 = admin2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test00546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00546");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getAccountType();
        java.lang.String str4 = admin2.getAccountType();
        boolean boolean5 = admin2.isVerified();
        admin2.logout();
        java.lang.Class<?> wildcardClass7 = admin2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "admin" + "'", str4, "admin");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test00547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00547");
        model.Admin admin2 = new model.Admin("admin", "admin");
        admin2.login("admin", "admin");
        boolean boolean6 = admin2.isVerified();
        admin2.logout();
        admin2.logout();
        java.lang.Class<?> wildcardClass9 = admin2.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test00548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00548");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        double double5 = admin2.getHourlyRate();
        admin2.setVerified(true);
        admin2.logout();
        java.lang.String str9 = admin2.getAccountType();
        java.lang.Class<?> wildcardClass10 = admin2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "admin" + "'", str9, "admin");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00549");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        double double5 = admin2.getHourlyRate();
        admin2.setVerified(false);
        admin2.login("hi!", "");
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
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test00550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00550");
        model.Admin admin2 = new model.Admin("admin", "");
        admin2.setVerified(true);
        java.lang.String str5 = admin2.getAccountType();
        admin2.login("hi!", "");
        java.lang.Class<?> wildcardClass9 = admin2.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test00551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00551");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        double double5 = admin2.getHourlyRate();
        admin2.login("admin", "hi!");
        admin2.viewProfile();
        admin2.setVerified(true);
        double double12 = admin2.getHourlyRate();
        admin2.setVerified(true);
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
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test00552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00552");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getAccountType();
        java.lang.String str4 = admin2.getPassword();
        admin2.setVerified(true);
        java.lang.String str7 = admin2.getEmail();
        java.lang.Class<?> wildcardClass8 = admin2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test00553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00553");
        model.Admin admin2 = new model.Admin("", "admin");
        java.lang.String str3 = admin2.getID();
        room.Room room4 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.addRoom(room4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.getRoomID()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
    }

    @Test
    public void test00554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00554");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        double double5 = admin2.getHourlyRate();
        double double6 = admin2.getHourlyRate();
        java.lang.String str7 = admin2.getID();
        boolean boolean8 = admin2.isVerified();
        java.lang.String str9 = admin2.getPassword();
        java.lang.String str10 = admin2.getPassword();
        java.lang.String str11 = admin2.getID();
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
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "admin" + "'", str11, "admin");
    }

    @Test
    public void test00555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00555");
        model.Admin admin2 = new model.Admin("", "");
        java.lang.String str3 = admin2.getAccountType();
        admin2.setVerified(true);
        double double6 = admin2.getHourlyRate();
        admin2.setVerified(false);
        java.lang.String str9 = admin2.getEmail();
        java.lang.String str10 = admin2.getPassword();
        admin2.login("admin", "");
        room.Room room14 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.disableRoom(room14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test00556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00556");
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
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test00557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00557");
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
        admin2.logout();
        java.lang.Class<?> wildcardClass14 = admin2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "admin" + "'", str12, "admin");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test00558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00558");
        model.Admin admin2 = new model.Admin("", "hi!");
        double double3 = admin2.getHourlyRate();
        double double4 = admin2.getHourlyRate();
        java.lang.Class<?> wildcardClass5 = admin2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test00559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00559");
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
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "admin" + "'", str11, "admin");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test00560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00560");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        double double5 = admin2.getHourlyRate();
        double double6 = admin2.getHourlyRate();
        java.lang.String str7 = admin2.getID();
        boolean boolean8 = admin2.isVerified();
        admin2.login("", "");
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
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "admin" + "'", str12, "admin");
    }

    @Test
    public void test00561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00561");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        admin2.logout();
        admin2.setVerified(false);
        java.lang.String str6 = admin2.getEmail();
        admin2.viewProfile();
        admin2.setVerified(true);
        room.Room room10 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.addRoom(room10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.getRoomID()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test00562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00562");
        model.Admin admin2 = new model.Admin("admin", "admin");
        admin2.login("admin", "admin");
        admin2.setVerified(false);
        java.lang.Class<?> wildcardClass8 = admin2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test00563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00563");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getAccountType();
        admin2.setVerified(false);
        admin2.login("hi!", "hi!");
        java.lang.String str9 = admin2.getID();
        java.lang.Class<?> wildcardClass10 = admin2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "admin" + "'", str9, "admin");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00564");
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
        java.lang.Class<?> wildcardClass14 = admin2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test00565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00565");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        admin2.logout();
        java.lang.String str5 = admin2.getAccountType();
        boolean boolean6 = admin2.isVerified();
        java.lang.String str7 = admin2.getID();
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
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test00566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00566");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        admin2.logout();
        java.lang.String str5 = admin2.getAccountType();
        admin2.login("", "");
        boolean boolean9 = admin2.isVerified();
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
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test00567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00567");
        model.Admin admin2 = new model.Admin("admin", "admin");
        admin2.viewProfile();
        java.lang.String str4 = admin2.getID();
        java.lang.String str5 = admin2.getAccountType();
        admin2.viewProfile();
        room.Room room7 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.enableRoom(room7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "admin" + "'", str4, "admin");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
    }

    @Test
    public void test00568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00568");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        java.lang.String str5 = admin2.getID();
        java.lang.String str6 = admin2.getID();
        java.lang.String str7 = admin2.getAccountType();
        admin2.viewProfile();
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
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "admin" + "'", str6, "admin");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test00569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00569");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        admin2.logout();
        java.lang.String str5 = admin2.getAccountType();
        admin2.viewProfile();
        admin2.login("hi!", "admin");
        boolean boolean10 = admin2.isVerified();
        admin2.logout();
        java.lang.Class<?> wildcardClass12 = admin2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test00570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00570");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        double double5 = admin2.getHourlyRate();
        admin2.setVerified(true);
        admin2.logout();
        java.lang.String str9 = admin2.getAccountType();
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
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "admin" + "'", str9, "admin");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "admin" + "'", str10, "admin");
    }

    @Test
    public void test00571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00571");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        java.lang.String str4 = admin2.getEmail();
        admin2.logout();
        admin2.logout();
        java.lang.String str7 = admin2.getPassword();
        admin2.login("hi!", "");
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
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test00572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00572");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        double double5 = admin2.getHourlyRate();
        double double6 = admin2.getHourlyRate();
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
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test00573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00573");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        double double5 = admin2.getHourlyRate();
        double double6 = admin2.getHourlyRate();
        admin2.setVerified(true);
        java.lang.String str9 = admin2.getPassword();
        admin2.login("hi!", "admin");
        double double13 = admin2.getHourlyRate();
        admin2.viewProfile();
        java.lang.Class<?> wildcardClass15 = admin2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test00574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00574");
        model.Admin admin2 = new model.Admin("", "");
        java.lang.String str3 = admin2.getAccountType();
        admin2.setVerified(true);
        java.lang.String str6 = admin2.getAccountType();
        admin2.logout();
        double double8 = admin2.getHourlyRate();
        double double9 = admin2.getHourlyRate();
        java.lang.String str10 = admin2.getID();
        java.lang.Class<?> wildcardClass11 = admin2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "admin" + "'", str6, "admin");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "admin" + "'", str10, "admin");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00575");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        double double5 = admin2.getHourlyRate();
        double double6 = admin2.getHourlyRate();
        java.lang.String str7 = admin2.getID();
        double double8 = admin2.getHourlyRate();
        java.lang.Class<?> wildcardClass9 = admin2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test00576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00576");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        admin2.logout();
        java.lang.String str5 = admin2.getAccountType();
        java.lang.String str6 = admin2.getEmail();
        java.lang.String str7 = admin2.getPassword();
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
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test00577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00577");
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
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test00578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00578");
        model.Admin admin2 = new model.Admin("admin", "");
        admin2.setVerified(true);
        java.lang.String str5 = admin2.getEmail();
        double double6 = admin2.getHourlyRate();
        room.Room room7 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.enableRoom(room7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test00579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00579");
        model.Admin admin2 = new model.Admin("admin", "");
        admin2.setVerified(true);
        boolean boolean5 = admin2.isVerified();
        admin2.logout();
        java.lang.Class<?> wildcardClass7 = admin2.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test00580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00580");
        model.Admin admin2 = new model.Admin("admin", "admin");
        admin2.login("admin", "admin");
        boolean boolean6 = admin2.isVerified();
        admin2.logout();
        java.lang.String str8 = admin2.getID();
        admin2.logout();
        admin2.viewProfile();
        boolean boolean11 = admin2.isVerified();
        java.lang.String str12 = admin2.getEmail();
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
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "admin" + "'", str12, "admin");
    }

    @Test
    public void test00581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00581");
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
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test00582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00582");
        model.Admin admin2 = new model.Admin("admin", "");
        admin2.setVerified(true);
        java.lang.String str5 = admin2.getEmail();
        double double6 = admin2.getHourlyRate();
        java.lang.String str7 = admin2.getPassword();
        admin2.viewProfile();
        admin2.login("admin", "");
        admin2.viewProfile();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test00583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00583");
        model.Admin admin2 = new model.Admin("admin", "");
        admin2.logout();
        double double4 = admin2.getHourlyRate();
        admin2.setVerified(false);
        double double7 = admin2.getHourlyRate();
        boolean boolean8 = admin2.isVerified();
        room.Room room9 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.addRoom(room9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.getRoomID()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test00584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00584");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getAccountType();
        admin2.setVerified(false);
        double double6 = admin2.getHourlyRate();
        room.Room room7 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.addRoom(room7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.getRoomID()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test00585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00585");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        admin2.setVerified(true);
        java.lang.String str5 = admin2.getPassword();
        java.lang.String str6 = admin2.getAccountType();
        room.Room room7 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.disableRoom(room7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "admin" + "'", str6, "admin");
    }

    @Test
    public void test00586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00586");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        java.lang.String str5 = admin2.getID();
        java.lang.String str6 = admin2.getID();
        java.lang.String str7 = admin2.getAccountType();
        admin2.setVerified(true);
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
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "admin" + "'", str6, "admin");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "admin" + "'", str10, "admin");
    }

    @Test
    public void test00587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00587");
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
        admin2.viewProfile();
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
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test00588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00588");
        model.Admin admin2 = new model.Admin("admin", "admin");
        admin2.viewProfile();
        admin2.viewProfile();
        admin2.login("hi!", "admin");
        java.lang.String str8 = admin2.getID();
        admin2.setVerified(false);
        java.lang.Class<?> wildcardClass11 = admin2.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "admin" + "'", str8, "admin");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00589");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getAccountType();
        boolean boolean4 = admin2.isVerified();
        room.Room room5 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.enableRoom(room5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test00590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00590");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        admin2.logout();
        java.lang.String str5 = admin2.getAccountType();
        java.lang.String str6 = admin2.getEmail();
        java.lang.String str7 = admin2.getPassword();
        double double8 = admin2.getHourlyRate();
        admin2.setVerified(true);
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
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test00591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00591");
        model.Admin admin2 = new model.Admin("admin", "admin");
        admin2.viewProfile();
        java.lang.String str4 = admin2.getPassword();
        admin2.login("", "");
        boolean boolean8 = admin2.isVerified();
        boolean boolean9 = admin2.isVerified();
        admin2.setVerified(false);
        java.lang.Class<?> wildcardClass12 = admin2.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "admin" + "'", str4, "admin");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test00592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00592");
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
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test00593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00593");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        admin2.logout();
        admin2.setVerified(false);
        room.Room room6 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.addRoom(room6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.getRoomID()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00594");
        model.Admin admin2 = new model.Admin("admin", "admin");
        admin2.login("admin", "admin");
        room.Room room6 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.enableRoom(room6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00595");
        model.Admin admin2 = new model.Admin("admin", "admin");
        boolean boolean3 = admin2.isVerified();
        admin2.login("hi!", "");
        admin2.setVerified(true);
        java.lang.String str9 = admin2.getAccountType();
        room.Room room10 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.disableRoom(room10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "admin" + "'", str9, "admin");
    }

    @Test
    public void test00596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00596");
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
            admin2.disableRoom(room13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
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
    public void test00597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00597");
        model.Admin admin2 = new model.Admin("hi!", "admin");
        java.lang.String str3 = admin2.getID();
        admin2.setVerified(false);
        admin2.viewProfile();
        admin2.viewProfile();
        java.lang.Class<?> wildcardClass8 = admin2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test00598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00598");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        admin2.logout();
        java.lang.String str5 = admin2.getAccountType();
        admin2.login("", "");
        java.lang.String str9 = admin2.getEmail();
        admin2.login("", "");
        java.lang.Class<?> wildcardClass13 = admin2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00599");
        model.Admin admin2 = new model.Admin("admin", "admin");
        admin2.viewProfile();
        java.lang.String str4 = admin2.getPassword();
        double double5 = admin2.getHourlyRate();
        java.lang.String str6 = admin2.getPassword();
        room.Room room7 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.enableRoom(room7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "admin" + "'", str4, "admin");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "admin" + "'", str6, "admin");
    }

    @Test
    public void test00600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00600");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        java.lang.String str5 = admin2.getID();
        java.lang.String str6 = admin2.getID();
        java.lang.String str7 = admin2.getAccountType();
        admin2.viewProfile();
        java.lang.String str9 = admin2.getEmail();
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
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "admin" + "'", str6, "admin");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "admin" + "'", str10, "admin");
    }

    @Test
    public void test00601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00601");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        double double5 = admin2.getHourlyRate();
        double double6 = admin2.getHourlyRate();
        java.lang.String str7 = admin2.getPassword();
        double double8 = admin2.getHourlyRate();
        admin2.logout();
        double double10 = admin2.getHourlyRate();
        java.lang.String str11 = admin2.getPassword();
        admin2.viewProfile();
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
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test00602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00602");
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
        admin2.login("admin", "admin");
        java.lang.String str16 = admin2.getPassword();
        java.lang.Class<?> wildcardClass17 = admin2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "admin" + "'", str11, "admin");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test00603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00603");
        model.Admin admin2 = new model.Admin("admin", "admin");
        boolean boolean3 = admin2.isVerified();
        admin2.login("hi!", "");
        admin2.setVerified(true);
        admin2.viewProfile();
        admin2.viewProfile();
        room.Room room11 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.disableRoom(room11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test00604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00604");
        model.Admin admin2 = new model.Admin("admin", "");
        admin2.logout();
        boolean boolean4 = admin2.isVerified();
        java.lang.Class<?> wildcardClass5 = admin2.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test00605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00605");
        model.Admin admin2 = new model.Admin("", "");
        java.lang.String str3 = admin2.getAccountType();
        admin2.setVerified(true);
        double double6 = admin2.getHourlyRate();
        admin2.setVerified(false);
        admin2.logout();
        admin2.login("hi!", "");
        admin2.setVerified(true);
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
    }

    @Test
    public void test00606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00606");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getPassword();
        boolean boolean4 = admin2.isVerified();
        java.lang.String str5 = admin2.getID();
        double double6 = admin2.getHourlyRate();
        room.Room room7 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.addRoom(room7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.getRoomID()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test00607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00607");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        admin2.logout();
        java.lang.String str5 = admin2.getAccountType();
        java.lang.String str6 = admin2.getEmail();
        double double7 = admin2.getHourlyRate();
        java.lang.String str8 = admin2.getID();
        room.Room room9 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.enableRoom(room9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "admin" + "'", str8, "admin");
    }

    @Test
    public void test00608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00608");
        model.Admin admin2 = new model.Admin("admin", "");
        admin2.setVerified(true);
        java.lang.String str5 = admin2.getAccountType();
        admin2.viewProfile();
        admin2.viewProfile();
        room.Room room8 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.enableRoom(room8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
    }

    @Test
    public void test00609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00609");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        admin2.logout();
        java.lang.String str5 = admin2.getAccountType();
        admin2.viewProfile();
        admin2.login("hi!", "admin");
        java.lang.String str10 = admin2.getAccountType();
        boolean boolean11 = admin2.isVerified();
        java.lang.String str12 = admin2.getID();
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
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "admin" + "'", str10, "admin");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "admin" + "'", str12, "admin");
    }

    @Test
    public void test00610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00610");
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
            admin2.enableRoom(room12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "admin" + "'", str4, "admin");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "admin" + "'", str8, "admin");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "admin" + "'", str9, "admin");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "admin" + "'", str11, "admin");
    }

    @Test
    public void test00611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00611");
        model.Admin admin2 = new model.Admin("admin", "");
        admin2.setVerified(true);
        java.lang.String str5 = admin2.getEmail();
        double double6 = admin2.getHourlyRate();
        admin2.viewProfile();
        java.lang.Class<?> wildcardClass8 = admin2.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test00612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00612");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        java.lang.String str4 = admin2.getAccountType();
        java.lang.String str5 = admin2.getID();
        java.lang.String str6 = admin2.getEmail();
        java.lang.String str7 = admin2.getPassword();
        java.lang.String str8 = admin2.getID();
        java.lang.String str9 = admin2.getAccountType();
        admin2.logout();
        java.lang.Class<?> wildcardClass11 = admin2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "admin" + "'", str4, "admin");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "admin" + "'", str8, "admin");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "admin" + "'", str9, "admin");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00613");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getAccountType();
        boolean boolean4 = admin2.isVerified();
        admin2.setVerified(false);
        admin2.login("hi!", "");
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
    }

    @Test
    public void test00614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00614");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        admin2.logout();
        java.lang.String str5 = admin2.getAccountType();
        admin2.viewProfile();
        admin2.login("hi!", "admin");
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
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test00615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00615");
        model.Admin admin2 = new model.Admin("admin", "");
        admin2.setVerified(true);
        java.lang.String str5 = admin2.getEmail();
        double double6 = admin2.getHourlyRate();
        admin2.viewProfile();
        admin2.viewProfile();
        java.lang.String str9 = admin2.getEmail();
        java.lang.Class<?> wildcardClass10 = admin2.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "admin" + "'", str9, "admin");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00616");
        model.Admin admin2 = new model.Admin("admin", "admin");
        admin2.viewProfile();
        java.lang.String str4 = admin2.getPassword();
        admin2.login("", "");
        java.lang.String str8 = admin2.getEmail();
        java.lang.String str9 = admin2.getAccountType();
        admin2.login("", "");
        java.lang.String str13 = admin2.getPassword();
        double double14 = admin2.getHourlyRate();
        java.lang.String str15 = admin2.getAccountType();
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
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "admin" + "'", str13, "admin");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "admin" + "'", str15, "admin");
    }

    @Test
    public void test00617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00617");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        admin2.logout();
        java.lang.String str5 = admin2.getAccountType();
        java.lang.String str6 = admin2.getPassword();
        room.Room room7 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.enableRoom(room7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test00618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00618");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        double double5 = admin2.getHourlyRate();
        admin2.setVerified(true);
        admin2.logout();
        java.lang.String str9 = admin2.getAccountType();
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
    public void test00619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00619");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        java.lang.String str4 = admin2.getPassword();
        java.lang.String str5 = admin2.getAccountType();
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
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
    }

    @Test
    public void test00620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00620");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getPassword();
        admin2.setVerified(true);
        admin2.viewProfile();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
    }

    @Test
    public void test00621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00621");
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
        java.lang.Class<?> wildcardClass16 = admin2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test00622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00622");
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
        boolean boolean15 = admin2.isVerified();
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
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "admin" + "'", str11, "admin");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "admin" + "'", str12, "admin");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test00623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00623");
        model.Admin admin2 = new model.Admin("", "");
        java.lang.String str3 = admin2.getAccountType();
        admin2.setVerified(true);
        double double6 = admin2.getHourlyRate();
        admin2.viewProfile();
        boolean boolean8 = admin2.isVerified();
        java.lang.String str9 = admin2.getID();
        java.lang.String str10 = admin2.getID();
        double double11 = admin2.getHourlyRate();
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
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "admin" + "'", str9, "admin");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "admin" + "'", str10, "admin");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test00624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00624");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        java.lang.String str5 = admin2.getID();
        java.lang.String str6 = admin2.getID();
        double double7 = admin2.getHourlyRate();
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
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "admin" + "'", str6, "admin");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test00625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00625");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        double double5 = admin2.getHourlyRate();
        double double6 = admin2.getHourlyRate();
        java.lang.String str7 = admin2.getID();
        admin2.viewProfile();
        admin2.logout();
        boolean boolean10 = admin2.isVerified();
        java.lang.String str11 = admin2.getPassword();
        boolean boolean12 = admin2.isVerified();
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
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test00626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00626");
        model.Admin admin2 = new model.Admin("", "");
        java.lang.String str3 = admin2.getAccountType();
        java.lang.String str4 = admin2.getEmail();
        double double5 = admin2.getHourlyRate();
        java.lang.String str6 = admin2.getAccountType();
        room.Room room7 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.disableRoom(room7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "admin" + "'", str6, "admin");
    }

    @Test
    public void test00627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00627");
        model.Admin admin2 = new model.Admin("admin", "");
        admin2.logout();
        double double4 = admin2.getHourlyRate();
        admin2.setVerified(false);
        double double7 = admin2.getHourlyRate();
        java.lang.Class<?> wildcardClass8 = admin2.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test00628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00628");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        double double5 = admin2.getHourlyRate();
        double double6 = admin2.getHourlyRate();
        boolean boolean7 = admin2.isVerified();
        java.lang.Class<?> wildcardClass8 = admin2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test00629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00629");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getAccountType();
        boolean boolean4 = admin2.isVerified();
        boolean boolean5 = admin2.isVerified();
        admin2.logout();
        admin2.login("admin", "hi!");
        java.lang.String str10 = admin2.getPassword();
        double double11 = admin2.getHourlyRate();
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
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test00630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00630");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        java.lang.String str4 = admin2.getEmail();
        boolean boolean5 = admin2.isVerified();
        java.lang.String str6 = admin2.getAccountType();
        java.lang.String str7 = admin2.getAccountType();
        admin2.setVerified(false);
        java.lang.Class<?> wildcardClass10 = admin2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "admin" + "'", str6, "admin");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00631");
        model.Admin admin2 = new model.Admin("admin", "admin");
        admin2.login("admin", "admin");
        boolean boolean6 = admin2.isVerified();
        admin2.logout();
        java.lang.String str8 = admin2.getID();
        room.Room room9 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.disableRoom(room9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "admin" + "'", str8, "admin");
    }

    @Test
    public void test00632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00632");
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
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test00633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00633");
        model.Admin admin2 = new model.Admin("", "");
        java.lang.String str3 = admin2.getAccountType();
        java.lang.String str4 = admin2.getEmail();
        admin2.login("hi!", "");
        java.lang.String str8 = admin2.getAccountType();
        java.lang.String str9 = admin2.getID();
        admin2.logout();
        java.lang.String str11 = admin2.getAccountType();
        room.Room room12 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.disableRoom(room12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "admin" + "'", str8, "admin");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "admin" + "'", str9, "admin");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "admin" + "'", str11, "admin");
    }

    @Test
    public void test00634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00634");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        admin2.logout();
        java.lang.String str5 = admin2.getAccountType();
        admin2.login("", "");
        java.lang.String str9 = admin2.getPassword();
        java.lang.String str10 = admin2.getID();
        java.lang.String str11 = admin2.getAccountType();
        admin2.login("hi!", "admin");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "admin" + "'", str10, "admin");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "admin" + "'", str11, "admin");
    }

    @Test
    public void test00635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00635");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getAccountType();
        boolean boolean4 = admin2.isVerified();
        boolean boolean5 = admin2.isVerified();
        admin2.logout();
        admin2.login("admin", "hi!");
        java.lang.String str10 = admin2.getPassword();
        java.lang.String str11 = admin2.getAccountType();
        java.lang.String str12 = admin2.getID();
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
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "admin" + "'", str11, "admin");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "admin" + "'", str12, "admin");
    }

    @Test
    public void test00636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00636");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        java.lang.String str4 = admin2.getAccountType();
        java.lang.Class<?> wildcardClass5 = admin2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "admin" + "'", str4, "admin");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test00637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00637");
        model.Admin admin2 = new model.Admin("admin", "admin");
        admin2.login("admin", "admin");
        boolean boolean6 = admin2.isVerified();
        admin2.logout();
        java.lang.String str8 = admin2.getID();
        admin2.logout();
        java.lang.String str10 = admin2.getEmail();
        java.lang.String str11 = admin2.getPassword();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "admin" + "'", str8, "admin");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "admin" + "'", str10, "admin");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "admin" + "'", str11, "admin");
    }

    @Test
    public void test00638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00638");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        double double5 = admin2.getHourlyRate();
        double double6 = admin2.getHourlyRate();
        admin2.setVerified(true);
        java.lang.String str9 = admin2.getEmail();
        java.lang.String str10 = admin2.getEmail();
        java.lang.String str11 = admin2.getID();
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
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "admin" + "'", str11, "admin");
    }

    @Test
    public void test00639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00639");
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
        admin2.logout();
        double double14 = admin2.getHourlyRate();
        java.lang.Class<?> wildcardClass15 = admin2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "admin" + "'", str8, "admin");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "admin" + "'", str11, "admin");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test00640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00640");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        java.lang.String str4 = admin2.getEmail();
        admin2.logout();
        admin2.logout();
        java.lang.String str7 = admin2.getPassword();
        admin2.login("hi!", "");
        room.Room room11 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.enableRoom(room11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test00641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00641");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        double double5 = admin2.getHourlyRate();
        double double6 = admin2.getHourlyRate();
        java.lang.String str7 = admin2.getPassword();
        admin2.setVerified(true);
        java.lang.String str10 = admin2.getAccountType();
        java.lang.Class<?> wildcardClass11 = admin2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "admin" + "'", str10, "admin");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00642");
        model.Admin admin2 = new model.Admin("admin", "admin");
        admin2.login("admin", "admin");
        admin2.setVerified(false);
        room.Room room8 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.enableRoom(room8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00643");
        model.Admin admin2 = new model.Admin("admin", "");
        admin2.setVerified(true);
        admin2.logout();
        room.Room room6 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.disableRoom(room6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00644");
        model.Admin admin2 = new model.Admin("admin", "");
        admin2.setVerified(true);
        java.lang.String str5 = admin2.getID();
        boolean boolean6 = admin2.isVerified();
        room.Room room7 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.addRoom(room7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.getRoomID()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test00645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00645");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        java.lang.String str4 = admin2.getPassword();
        java.lang.String str5 = admin2.getAccountType();
        admin2.viewProfile();
        double double7 = admin2.getHourlyRate();
        java.lang.String str8 = admin2.getEmail();
        java.lang.String str9 = admin2.getAccountType();
        java.lang.String str10 = admin2.getPassword();
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
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "admin" + "'", str9, "admin");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test00646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00646");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        java.lang.String str4 = admin2.getPassword();
        java.lang.String str5 = admin2.getAccountType();
        admin2.viewProfile();
        double double7 = admin2.getHourlyRate();
        java.lang.String str8 = admin2.getEmail();
        java.lang.String str9 = admin2.getAccountType();
        room.Room room10 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.disableRoom(room10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "admin" + "'", str9, "admin");
    }

    @Test
    public void test00647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00647");
        model.Admin admin2 = new model.Admin("admin", "");
        admin2.login("hi!", "admin");
        boolean boolean6 = admin2.isVerified();
        admin2.setVerified(true);
        room.Room room9 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.addRoom(room9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.getRoomID()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test00648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00648");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        admin2.logout();
        java.lang.String str5 = admin2.getAccountType();
        java.lang.String str6 = admin2.getEmail();
        java.lang.String str7 = admin2.getPassword();
        double double8 = admin2.getHourlyRate();
        admin2.setVerified(true);
        java.lang.Class<?> wildcardClass11 = admin2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00649");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        double double5 = admin2.getHourlyRate();
        double double6 = admin2.getHourlyRate();
        java.lang.String str7 = admin2.getID();
        admin2.viewProfile();
        admin2.logout();
        boolean boolean10 = admin2.isVerified();
        java.lang.String str11 = admin2.getPassword();
        java.lang.Class<?> wildcardClass12 = admin2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test00650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00650");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        admin2.logout();
        java.lang.String str5 = admin2.getAccountType();
        admin2.viewProfile();
        admin2.login("hi!", "admin");
        double double10 = admin2.getHourlyRate();
        admin2.viewProfile();
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
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "admin" + "'", str12, "admin");
    }

    @Test
    public void test00651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00651");
        model.Admin admin2 = new model.Admin("admin", "admin");
        admin2.viewProfile();
        admin2.viewProfile();
        admin2.login("hi!", "admin");
        java.lang.String str8 = admin2.getID();
        room.Room room9 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.disableRoom(room9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "admin" + "'", str8, "admin");
    }

    @Test
    public void test00652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00652");
        model.Admin admin2 = new model.Admin("", "");
        java.lang.String str3 = admin2.getAccountType();
        java.lang.String str4 = admin2.getEmail();
        admin2.login("hi!", "");
        java.lang.String str8 = admin2.getAccountType();
        java.lang.String str9 = admin2.getID();
        admin2.logout();
        java.lang.String str11 = admin2.getEmail();
        java.lang.String str12 = admin2.getEmail();
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
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "admin" + "'", str8, "admin");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "admin" + "'", str9, "admin");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test00653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00653");
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
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "admin" + "'", str8, "admin");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "admin" + "'", str11, "admin");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test00654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00654");
        model.Admin admin2 = new model.Admin("admin", "admin");
        admin2.viewProfile();
        java.lang.String str4 = admin2.getID();
        java.lang.String str5 = admin2.getAccountType();
        admin2.viewProfile();
        java.lang.String str7 = admin2.getPassword();
        java.lang.Class<?> wildcardClass8 = admin2.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "admin" + "'", str4, "admin");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test00655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00655");
        model.Admin admin2 = new model.Admin("admin", "admin");
        admin2.logout();
        double double4 = admin2.getHourlyRate();
        room.Room room5 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.enableRoom(room5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test00656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00656");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        admin2.logout();
        java.lang.String str4 = admin2.getAccountType();
        admin2.viewProfile();
        boolean boolean6 = admin2.isVerified();
        room.Room room7 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.enableRoom(room7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "admin" + "'", str4, "admin");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test00657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00657");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        double double5 = admin2.getHourlyRate();
        double double6 = admin2.getHourlyRate();
        java.lang.String str7 = admin2.getID();
        admin2.login("", "admin");
        admin2.viewProfile();
        admin2.viewProfile();
        java.lang.Class<?> wildcardClass13 = admin2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00658");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        admin2.logout();
        java.lang.String str5 = admin2.getAccountType();
        admin2.viewProfile();
        admin2.setVerified(false);
        java.lang.String str9 = admin2.getEmail();
        admin2.setVerified(false);
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
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test00659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00659");
        model.Admin admin2 = new model.Admin("admin", "admin");
        admin2.login("admin", "admin");
        boolean boolean6 = admin2.isVerified();
        admin2.logout();
        java.lang.String str8 = admin2.getID();
        admin2.logout();
        java.lang.String str10 = admin2.getID();
        admin2.logout();
        admin2.viewProfile();
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
    }

    @Test
    public void test00660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00660");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        double double5 = admin2.getHourlyRate();
        double double6 = admin2.getHourlyRate();
        admin2.setVerified(true);
        java.lang.String str9 = admin2.getPassword();
        admin2.login("hi!", "admin");
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
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "admin" + "'", str13, "admin");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test00661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00661");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        admin2.logout();
        java.lang.String str4 = admin2.getAccountType();
        admin2.logout();
        java.lang.String str6 = admin2.getEmail();
        room.Room room7 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.disableRoom(room7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "admin" + "'", str4, "admin");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test00662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00662");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        admin2.logout();
        java.lang.String str4 = admin2.getEmail();
        admin2.login("admin", "admin");
        room.Room room8 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.addRoom(room8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.getRoomID()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test00663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00663");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        admin2.logout();
        java.lang.String str5 = admin2.getAccountType();
        boolean boolean6 = admin2.isVerified();
        java.lang.String str7 = admin2.getAccountType();
        admin2.login("", "hi!");
        java.lang.String str11 = admin2.getEmail();
        boolean boolean12 = admin2.isVerified();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test00664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00664");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        double double5 = admin2.getHourlyRate();
        double double6 = admin2.getHourlyRate();
        java.lang.String str7 = admin2.getPassword();
        java.lang.String str8 = admin2.getEmail();
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
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test00665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00665");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        admin2.logout();
        java.lang.String str5 = admin2.getAccountType();
        boolean boolean6 = admin2.isVerified();
        java.lang.String str7 = admin2.getAccountType();
        admin2.login("", "hi!");
        admin2.login("hi!", "hi!");
        boolean boolean14 = admin2.isVerified();
        java.lang.String str15 = admin2.getID();
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
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "admin" + "'", str15, "admin");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
    }

    @Test
    public void test00666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00666");
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
        admin2.login("admin", "");
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
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test00667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00667");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        java.lang.String str4 = admin2.getAccountType();
        java.lang.String str5 = admin2.getPassword();
        boolean boolean6 = admin2.isVerified();
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
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test00668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00668");
        model.Admin admin2 = new model.Admin("admin", "admin");
        admin2.viewProfile();
        java.lang.String str4 = admin2.getPassword();
        admin2.login("", "");
        boolean boolean8 = admin2.isVerified();
        admin2.setVerified(true);
        admin2.setVerified(false);
        java.lang.String str13 = admin2.getAccountType();
        admin2.setVerified(false);
        room.Room room16 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.addRoom(room16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.getRoomID()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "admin" + "'", str4, "admin");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "admin" + "'", str13, "admin");
    }

    @Test
    public void test00669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00669");
        model.Admin admin2 = new model.Admin("", "hi!");
        java.lang.String str3 = admin2.getPassword();
        admin2.setVerified(false);
        java.lang.String str6 = admin2.getPassword();
        boolean boolean7 = admin2.isVerified();
        java.lang.String str8 = admin2.getID();
        admin2.setVerified(false);
        java.lang.Class<?> wildcardClass11 = admin2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "admin" + "'", str8, "admin");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00670");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        double double5 = admin2.getHourlyRate();
        double double6 = admin2.getHourlyRate();
        java.lang.String str7 = admin2.getPassword();
        admin2.logout();
        java.lang.Class<?> wildcardClass9 = admin2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test00671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00671");
        model.Admin admin2 = new model.Admin("admin", "admin");
        admin2.viewProfile();
        java.lang.String str4 = admin2.getID();
        java.lang.String str5 = admin2.getPassword();
        double double6 = admin2.getHourlyRate();
        java.lang.Class<?> wildcardClass7 = admin2.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "admin" + "'", str4, "admin");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test00672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00672");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        admin2.logout();
        java.lang.String str5 = admin2.getAccountType();
        admin2.viewProfile();
        admin2.login("admin", "admin");
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
    }

    @Test
    public void test00673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00673");
        model.Admin admin2 = new model.Admin("admin", "admin");
        admin2.viewProfile();
        java.lang.String str4 = admin2.getID();
        java.lang.String str5 = admin2.getPassword();
        admin2.setVerified(false);
        java.lang.String str8 = admin2.getID();
        room.Room room9 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.enableRoom(room9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "admin" + "'", str4, "admin");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "admin" + "'", str8, "admin");
    }

    @Test
    public void test00674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00674");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        admin2.logout();
        java.lang.String str4 = admin2.getEmail();
        java.lang.String str5 = admin2.getPassword();
        boolean boolean6 = admin2.isVerified();
        admin2.logout();
        room.Room room8 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.addRoom(room8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.getRoomID()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test00675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00675");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        double double5 = admin2.getHourlyRate();
        double double6 = admin2.getHourlyRate();
        java.lang.String str7 = admin2.getPassword();
        admin2.setVerified(true);
        java.lang.String str10 = admin2.getID();
        admin2.logout();
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
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "admin" + "'", str10, "admin");
    }

    @Test
    public void test00676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00676");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        admin2.logout();
        java.lang.String str5 = admin2.getAccountType();
        boolean boolean6 = admin2.isVerified();
        java.lang.String str7 = admin2.getPassword();
        java.lang.String str8 = admin2.getPassword();
        admin2.setVerified(true);
        java.lang.Class<?> wildcardClass11 = admin2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00677");
        model.Admin admin2 = new model.Admin("admin", "admin");
        admin2.login("admin", "admin");
        boolean boolean6 = admin2.isVerified();
        admin2.logout();
        java.lang.String str8 = admin2.getID();
        admin2.logout();
        double double10 = admin2.getHourlyRate();
        java.lang.String str11 = admin2.getAccountType();
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
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "admin" + "'", str11, "admin");
    }

    @Test
    public void test00678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00678");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        admin2.logout();
        java.lang.String str5 = admin2.getAccountType();
        boolean boolean6 = admin2.isVerified();
        java.lang.String str7 = admin2.getAccountType();
        room.Room room8 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.addRoom(room8);
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
    public void test00679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00679");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        double double5 = admin2.getHourlyRate();
        double double6 = admin2.getHourlyRate();
        java.lang.String str7 = admin2.getPassword();
        admin2.setVerified(true);
        java.lang.String str10 = admin2.getAccountType();
        java.lang.String str11 = admin2.getPassword();
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
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "admin" + "'", str10, "admin");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test00680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00680");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        admin2.logout();
        java.lang.String str5 = admin2.getAccountType();
        boolean boolean6 = admin2.isVerified();
        java.lang.String str7 = admin2.getAccountType();
        admin2.login("", "hi!");
        admin2.login("hi!", "hi!");
        boolean boolean14 = admin2.isVerified();
        java.lang.Class<?> wildcardClass15 = admin2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test00681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00681");
        model.Admin admin2 = new model.Admin("", "");
        java.lang.String str3 = admin2.getAccountType();
        admin2.setVerified(true);
        double double6 = admin2.getHourlyRate();
        admin2.viewProfile();
        boolean boolean8 = admin2.isVerified();
        java.lang.String str9 = admin2.getID();
        java.lang.String str10 = admin2.getID();
        admin2.viewProfile();
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
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "admin" + "'", str9, "admin");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "admin" + "'", str10, "admin");
    }

    @Test
    public void test00682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00682");
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
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test00683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00683");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        admin2.logout();
        admin2.setVerified(false);
        java.lang.String str6 = admin2.getEmail();
        admin2.viewProfile();
        admin2.viewProfile();
        double double9 = admin2.getHourlyRate();
        admin2.setVerified(false);
        java.lang.String str12 = admin2.getEmail();
        room.Room room13 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.enableRoom(room13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test00684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00684");
        model.Admin admin2 = new model.Admin("admin", "admin");
        admin2.viewProfile();
        java.lang.String str4 = admin2.getID();
        java.lang.String str5 = admin2.getPassword();
        admin2.setVerified(false);
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
    }

    @Test
    public void test00685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00685");
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
            admin2.addRoom(room15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.getRoomID()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "admin" + "'", str8, "admin");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "admin" + "'", str10, "admin");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test00686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00686");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getAccountType();
        java.lang.String str4 = admin2.getPassword();
        admin2.setVerified(true);
        java.lang.Class<?> wildcardClass7 = admin2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test00687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00687");
        model.Admin admin2 = new model.Admin("admin", "admin");
        admin2.viewProfile();
        java.lang.String str4 = admin2.getID();
        java.lang.String str5 = admin2.getAccountType();
        java.lang.String str6 = admin2.getEmail();
        double double7 = admin2.getHourlyRate();
        java.lang.String str8 = admin2.getAccountType();
        double double9 = admin2.getHourlyRate();
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
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "admin" + "'", str6, "admin");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "admin" + "'", str8, "admin");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test00688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00688");
        model.Admin admin2 = new model.Admin("", "");
        java.lang.String str3 = admin2.getAccountType();
        admin2.setVerified(true);
        double double6 = admin2.getHourlyRate();
        admin2.login("", "admin");
        room.Room room10 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.enableRoom(room10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test00689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00689");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        admin2.logout();
        java.lang.String str5 = admin2.getAccountType();
        boolean boolean6 = admin2.isVerified();
        admin2.login("hi!", "admin");
        boolean boolean10 = admin2.isVerified();
        admin2.setVerified(false);
        java.lang.Class<?> wildcardClass13 = admin2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00690");
        model.Admin admin2 = new model.Admin("admin", "admin");
        admin2.viewProfile();
        java.lang.String str4 = admin2.getID();
        admin2.logout();
        java.lang.Class<?> wildcardClass6 = admin2.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "admin" + "'", str4, "admin");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test00691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00691");
        model.Admin admin2 = new model.Admin("admin", "admin");
        boolean boolean3 = admin2.isVerified();
        admin2.login("hi!", "");
        java.lang.String str7 = admin2.getEmail();
        room.Room room8 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.addRoom(room8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.getRoomID()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
    }

    @Test
    public void test00692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00692");
        model.Admin admin2 = new model.Admin("", "");
        java.lang.String str3 = admin2.getAccountType();
        java.lang.String str4 = admin2.getEmail();
        double double5 = admin2.getHourlyRate();
        java.lang.Class<?> wildcardClass6 = admin2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test00693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00693");
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
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "admin" + "'", str11, "admin");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "admin" + "'", str12, "admin");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "admin" + "'", str15, "admin");
    }

    @Test
    public void test00694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00694");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getAccountType();
        boolean boolean4 = admin2.isVerified();
        java.lang.String str5 = admin2.getPassword();
        room.Room room6 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.addRoom(room6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.getRoomID()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test00695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00695");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        admin2.logout();
        java.lang.String str5 = admin2.getAccountType();
        boolean boolean6 = admin2.isVerified();
        admin2.login("hi!", "admin");
        java.lang.String str10 = admin2.getAccountType();
        java.lang.String str11 = admin2.getEmail();
        java.lang.String str12 = admin2.getAccountType();
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
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "admin" + "'", str10, "admin");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "admin" + "'", str12, "admin");
    }

    @Test
    public void test00696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00696");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        java.lang.String str4 = admin2.getAccountType();
        java.lang.String str5 = admin2.getID();
        java.lang.String str6 = admin2.getEmail();
        java.lang.String str7 = admin2.getPassword();
        admin2.setVerified(false);
        java.lang.String str10 = admin2.getID();
        java.lang.String str11 = admin2.getID();
        java.lang.Class<?> wildcardClass12 = admin2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "admin" + "'", str4, "admin");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "admin" + "'", str10, "admin");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "admin" + "'", str11, "admin");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test00697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00697");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        admin2.logout();
        java.lang.String str5 = admin2.getAccountType();
        admin2.login("", "");
        java.lang.String str9 = admin2.getID();
        double double10 = admin2.getHourlyRate();
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
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "admin" + "'", str9, "admin");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test00698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00698");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        admin2.logout();
        java.lang.String str5 = admin2.getAccountType();
        boolean boolean6 = admin2.isVerified();
        admin2.login("hi!", "admin");
        java.lang.String str10 = admin2.getAccountType();
        java.lang.String str11 = admin2.getEmail();
        java.lang.String str12 = admin2.getPassword();
        java.lang.String str13 = admin2.getAccountType();
        java.lang.Class<?> wildcardClass14 = admin2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "admin" + "'", str10, "admin");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "admin" + "'", str13, "admin");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test00699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00699");
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
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test00700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00700");
        model.Admin admin2 = new model.Admin("", "hi!");
        java.lang.String str3 = admin2.getPassword();
        java.lang.String str4 = admin2.getEmail();
        admin2.login("admin", "admin");
        room.Room room8 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.disableRoom(room8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test00701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00701");
        model.Admin admin2 = new model.Admin("admin", "");
        admin2.setVerified(true);
        java.lang.String str5 = admin2.getID();
        room.Room room6 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.disableRoom(room6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
    }

    @Test
    public void test00702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00702");
        model.Admin admin2 = new model.Admin("admin", "admin");
        admin2.viewProfile();
        java.lang.String str4 = admin2.getPassword();
        admin2.login("", "");
        java.lang.String str8 = admin2.getEmail();
        java.lang.String str9 = admin2.getAccountType();
        admin2.login("", "");
        admin2.setVerified(false);
        room.Room room15 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.disableRoom(room15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "admin" + "'", str4, "admin");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "admin" + "'", str8, "admin");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "admin" + "'", str9, "admin");
    }

    @Test
    public void test00703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00703");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        double double5 = admin2.getHourlyRate();
        double double6 = admin2.getHourlyRate();
        admin2.setVerified(true);
        java.lang.String str9 = admin2.getEmail();
        java.lang.String str10 = admin2.getEmail();
        boolean boolean11 = admin2.isVerified();
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
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "admin" + "'", str12, "admin");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test00704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00704");
        model.Admin admin2 = new model.Admin("admin", "admin");
        admin2.viewProfile();
        admin2.viewProfile();
        admin2.login("admin", "");
        java.lang.Class<?> wildcardClass8 = admin2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test00705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00705");
        model.Admin admin2 = new model.Admin("admin", "admin");
        admin2.viewProfile();
        java.lang.String str4 = admin2.getPassword();
        admin2.login("", "");
        boolean boolean8 = admin2.isVerified();
        admin2.setVerified(true);
        admin2.setVerified(false);
        admin2.setVerified(false);
        admin2.viewProfile();
        room.Room room16 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.addRoom(room16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.getRoomID()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "admin" + "'", str4, "admin");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test00706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00706");
        model.Admin admin2 = new model.Admin("admin", "");
        admin2.setVerified(true);
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
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "admin" + "'", str6, "admin");
    }

    @Test
    public void test00707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00707");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        double double5 = admin2.getHourlyRate();
        java.lang.String str6 = admin2.getPassword();
        admin2.login("", "admin");
        admin2.logout();
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
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test00708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00708");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        java.lang.String str4 = admin2.getAccountType();
        java.lang.String str5 = admin2.getID();
        java.lang.String str6 = admin2.getEmail();
        java.lang.String str7 = admin2.getPassword();
        java.lang.String str8 = admin2.getID();
        java.lang.String str9 = admin2.getAccountType();
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
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "admin" + "'", str4, "admin");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "admin" + "'", str8, "admin");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "admin" + "'", str9, "admin");
    }

    @Test
    public void test00709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00709");
        model.Admin admin2 = new model.Admin("", "");
        java.lang.String str3 = admin2.getAccountType();
        admin2.setVerified(true);
        double double6 = admin2.getHourlyRate();
        admin2.viewProfile();
        boolean boolean8 = admin2.isVerified();
        java.lang.String str9 = admin2.getID();
        admin2.login("admin", "");
        admin2.viewProfile();
        java.lang.String str14 = admin2.getAccountType();
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
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "admin" + "'", str9, "admin");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "admin" + "'", str14, "admin");
    }

    @Test
    public void test00710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00710");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        admin2.logout();
        java.lang.String str5 = admin2.getAccountType();
        admin2.viewProfile();
        admin2.login("admin", "admin");
        java.lang.String str10 = admin2.getAccountType();
        java.lang.Class<?> wildcardClass11 = admin2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "admin" + "'", str10, "admin");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00711");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getPassword();
        boolean boolean4 = admin2.isVerified();
        java.lang.String str5 = admin2.getID();
        room.Room room6 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.addRoom(room6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.getRoomID()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
    }

    @Test
    public void test00712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00712");
        model.Admin admin2 = new model.Admin("", "hi!");
        java.lang.String str3 = admin2.getPassword();
        java.lang.String str4 = admin2.getEmail();
        admin2.login("admin", "admin");
        room.Room room8 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.addRoom(room8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.getRoomID()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test00713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00713");
        model.Admin admin2 = new model.Admin("admin", "admin");
        admin2.viewProfile();
        java.lang.String str4 = admin2.getID();
        java.lang.String str5 = admin2.getPassword();
        admin2.setVerified(false);
        java.lang.String str8 = admin2.getID();
        java.lang.String str9 = admin2.getPassword();
        java.lang.String str10 = admin2.getAccountType();
        java.lang.String str11 = admin2.getID();
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
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "admin" + "'", str8, "admin");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "admin" + "'", str9, "admin");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "admin" + "'", str10, "admin");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "admin" + "'", str11, "admin");
    }

    @Test
    public void test00714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00714");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        double double5 = admin2.getHourlyRate();
        double double6 = admin2.getHourlyRate();
        admin2.setVerified(true);
        java.lang.String str9 = admin2.getPassword();
        admin2.login("hi!", "admin");
        admin2.viewProfile();
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
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test00715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00715");
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
        java.lang.Class<?> wildcardClass13 = admin2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00716");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        java.lang.String str4 = admin2.getEmail();
        room.Room room5 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.addRoom(room5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.getRoomID()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test00717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00717");
        model.Admin admin2 = new model.Admin("admin", "admin");
        admin2.login("admin", "admin");
        boolean boolean6 = admin2.isVerified();
        admin2.logout();
        java.lang.String str8 = admin2.getID();
        admin2.logout();
        java.lang.String str10 = admin2.getID();
        boolean boolean11 = admin2.isVerified();
        admin2.login("admin", "");
        admin2.login("admin", "admin");
        room.Room room18 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.addRoom(room18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.getRoomID()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "admin" + "'", str8, "admin");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "admin" + "'", str10, "admin");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test00718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00718");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        double double5 = admin2.getHourlyRate();
        double double6 = admin2.getHourlyRate();
        java.lang.String str7 = admin2.getID();
        boolean boolean8 = admin2.isVerified();
        admin2.viewProfile();
        admin2.setVerified(true);
        admin2.viewProfile();
        java.lang.Class<?> wildcardClass13 = admin2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00719");
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
        admin2.logout();
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
    }

    @Test
    public void test00720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00720");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getAccountType();
        boolean boolean4 = admin2.isVerified();
        admin2.setVerified(false);
        admin2.login("hi!", "");
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
    }

    @Test
    public void test00721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00721");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        admin2.logout();
        admin2.login("", "admin");
        java.lang.String str7 = admin2.getPassword();
        java.lang.Class<?> wildcardClass8 = admin2.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test00722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00722");
        model.Admin admin2 = new model.Admin("", "");
        java.lang.String str3 = admin2.getAccountType();
        admin2.setVerified(true);
        double double6 = admin2.getHourlyRate();
        admin2.setVerified(false);
        room.Room room9 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.disableRoom(room9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test00723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00723");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        java.lang.String str5 = admin2.getID();
        boolean boolean6 = admin2.isVerified();
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
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test00724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00724");
        model.Admin admin2 = new model.Admin("admin", "");
        admin2.setVerified(true);
        java.lang.String str5 = admin2.getEmail();
        double double6 = admin2.getHourlyRate();
        java.lang.String str7 = admin2.getPassword();
        java.lang.String str8 = admin2.getAccountType();
        room.Room room9 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.disableRoom(room9);
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
    public void test00725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00725");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        java.lang.String str4 = admin2.getPassword();
        java.lang.String str5 = admin2.getAccountType();
        admin2.viewProfile();
        double double7 = admin2.getHourlyRate();
        java.lang.String str8 = admin2.getID();
        java.lang.String str9 = admin2.getAccountType();
        admin2.viewProfile();
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
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "admin" + "'", str8, "admin");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "admin" + "'", str9, "admin");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test00726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00726");
        model.Admin admin2 = new model.Admin("admin", "hi!");
        java.lang.String str3 = admin2.getPassword();
        room.Room room4 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.addRoom(room4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.getRoomID()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
    }

    @Test
    public void test00727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00727");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        admin2.logout();
        java.lang.String str5 = admin2.getAccountType();
        boolean boolean6 = admin2.isVerified();
        admin2.login("hi!", "admin");
        admin2.setVerified(false);
        boolean boolean12 = admin2.isVerified();
        admin2.viewProfile();
        admin2.setVerified(false);
        java.lang.String str16 = admin2.getEmail();
        boolean boolean17 = admin2.isVerified();
        java.lang.String str18 = admin2.getPassword();
        room.Room room19 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.enableRoom(room19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test00728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00728");
        model.Admin admin2 = new model.Admin("admin", "admin");
        admin2.viewProfile();
        java.lang.String str4 = admin2.getPassword();
        admin2.login("", "");
        boolean boolean8 = admin2.isVerified();
        admin2.setVerified(true);
        admin2.setVerified(false);
        java.lang.String str13 = admin2.getAccountType();
        room.Room room14 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.disableRoom(room14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "admin" + "'", str4, "admin");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "admin" + "'", str13, "admin");
    }

    @Test
    public void test00729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00729");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        admin2.logout();
        java.lang.String str5 = admin2.getAccountType();
        admin2.viewProfile();
        admin2.login("hi!", "admin");
        boolean boolean10 = admin2.isVerified();
        admin2.logout();
        admin2.setVerified(false);
        java.lang.Class<?> wildcardClass14 = admin2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test00730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00730");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        double double5 = admin2.getHourlyRate();
        double double6 = admin2.getHourlyRate();
        java.lang.String str7 = admin2.getID();
        admin2.viewProfile();
        admin2.logout();
        admin2.setVerified(false);
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
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test00731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00731");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        double double5 = admin2.getHourlyRate();
        double double6 = admin2.getHourlyRate();
        admin2.setVerified(true);
        java.lang.String str9 = admin2.getPassword();
        admin2.login("hi!", "admin");
        java.lang.String str13 = admin2.getAccountType();
        double double14 = admin2.getHourlyRate();
        java.lang.Class<?> wildcardClass15 = admin2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "admin" + "'", str13, "admin");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test00732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00732");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        admin2.logout();
        java.lang.String str5 = admin2.getAccountType();
        boolean boolean6 = admin2.isVerified();
        java.lang.String str7 = admin2.getAccountType();
        admin2.login("", "hi!");
        admin2.login("hi!", "hi!");
        room.Room room14 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.addRoom(room14);
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
    public void test00733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00733");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        double double5 = admin2.getHourlyRate();
        double double6 = admin2.getHourlyRate();
        java.lang.String str7 = admin2.getPassword();
        double double8 = admin2.getHourlyRate();
        admin2.logout();
        java.lang.Class<?> wildcardClass10 = admin2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00734");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        java.lang.String str4 = admin2.getPassword();
        java.lang.String str5 = admin2.getAccountType();
        admin2.viewProfile();
        admin2.logout();
        room.Room room8 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.enableRoom(room8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
    }

    @Test
    public void test00735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00735");
        model.Admin admin2 = new model.Admin("admin", "");
        admin2.setVerified(true);
        java.lang.String str5 = admin2.getAccountType();
        admin2.setVerified(false);
        java.lang.String str8 = admin2.getID();
        java.lang.String str9 = admin2.getEmail();
        java.lang.Class<?> wildcardClass10 = admin2.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "admin" + "'", str8, "admin");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "admin" + "'", str9, "admin");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00736");
        model.Admin admin2 = new model.Admin("admin", "admin");
        admin2.login("admin", "admin");
        boolean boolean6 = admin2.isVerified();
        admin2.logout();
        java.lang.String str8 = admin2.getID();
        admin2.logout();
        java.lang.String str10 = admin2.getID();
        admin2.logout();
        java.lang.Class<?> wildcardClass12 = admin2.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "admin" + "'", str8, "admin");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "admin" + "'", str10, "admin");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test00737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00737");
        model.Admin admin2 = new model.Admin("admin", "admin");
        admin2.viewProfile();
        java.lang.String str4 = admin2.getPassword();
        boolean boolean5 = admin2.isVerified();
        room.Room room6 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.addRoom(room6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.getRoomID()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "admin" + "'", str4, "admin");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test00738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00738");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        double double5 = admin2.getHourlyRate();
        double double6 = admin2.getHourlyRate();
        java.lang.String str7 = admin2.getPassword();
        double double8 = admin2.getHourlyRate();
        admin2.logout();
        double double10 = admin2.getHourlyRate();
        java.lang.String str11 = admin2.getPassword();
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
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test00739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00739");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        double double5 = admin2.getHourlyRate();
        double double6 = admin2.getHourlyRate();
        admin2.setVerified(true);
        java.lang.String str9 = admin2.getID();
        admin2.logout();
        java.lang.Class<?> wildcardClass11 = admin2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "admin" + "'", str9, "admin");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00740");
        model.Admin admin2 = new model.Admin("admin", "admin");
        admin2.viewProfile();
        java.lang.String str4 = admin2.getID();
        admin2.logout();
        java.lang.String str6 = admin2.getAccountType();
        admin2.viewProfile();
        admin2.setVerified(true);
        double double10 = admin2.getHourlyRate();
        room.Room room11 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.addRoom(room11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.getRoomID()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "admin" + "'", str4, "admin");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "admin" + "'", str6, "admin");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test00741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00741");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getAccountType();
        java.lang.String str4 = admin2.getAccountType();
        boolean boolean5 = admin2.isVerified();
        admin2.logout();
        room.Room room7 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.enableRoom(room7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "admin" + "'", str4, "admin");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test00742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00742");
        model.Admin admin2 = new model.Admin("admin", "admin");
        admin2.viewProfile();
        java.lang.String str4 = admin2.getPassword();
        double double5 = admin2.getHourlyRate();
        java.lang.String str6 = admin2.getAccountType();
        boolean boolean7 = admin2.isVerified();
        admin2.viewProfile();
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
    }

    @Test
    public void test00743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00743");
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
    }

    @Test
    public void test00744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00744");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getAccountType();
        boolean boolean4 = admin2.isVerified();
        boolean boolean5 = admin2.isVerified();
        admin2.viewProfile();
        admin2.login("admin", "hi!");
        java.lang.String str10 = admin2.getPassword();
        admin2.login("", "hi!");
        java.lang.String str14 = admin2.getPassword();
        java.lang.Class<?> wildcardClass15 = admin2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test00745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00745");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        admin2.logout();
        java.lang.String str5 = admin2.getAccountType();
        boolean boolean6 = admin2.isVerified();
        java.lang.String str7 = admin2.getID();
        admin2.logout();
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
    }

    @Test
    public void test00746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00746");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        double double5 = admin2.getHourlyRate();
        double double6 = admin2.getHourlyRate();
        room.Room room7 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.enableRoom(room7);
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
    public void test00747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00747");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        double double5 = admin2.getHourlyRate();
        admin2.login("admin", "hi!");
        admin2.viewProfile();
        admin2.setVerified(true);
        double double12 = admin2.getHourlyRate();
        java.lang.String str13 = admin2.getID();
        java.lang.String str14 = admin2.getEmail();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "admin" + "'", str13, "admin");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test00748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00748");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getAccountType();
        boolean boolean4 = admin2.isVerified();
        java.lang.String str5 = admin2.getPassword();
        admin2.logout();
        admin2.logout();
        double double8 = admin2.getHourlyRate();
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
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "admin" + "'", str9, "admin");
    }

    @Test
    public void test00749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00749");
        model.Admin admin2 = new model.Admin("admin", "admin");
        admin2.viewProfile();
        java.lang.String str4 = admin2.getPassword();
        java.lang.String str5 = admin2.getPassword();
        admin2.setVerified(false);
        room.Room room8 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.enableRoom(room8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "admin" + "'", str4, "admin");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
    }

    @Test
    public void test00750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00750");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        admin2.logout();
        java.lang.String str5 = admin2.getAccountType();
        admin2.viewProfile();
        admin2.setVerified(false);
        java.lang.String str9 = admin2.getEmail();
        admin2.logout();
        java.lang.Class<?> wildcardClass11 = admin2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00751");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        admin2.logout();
        java.lang.String str5 = admin2.getAccountType();
        boolean boolean6 = admin2.isVerified();
        java.lang.String str7 = admin2.getPassword();
        double double8 = admin2.getHourlyRate();
        java.lang.String str9 = admin2.getID();
        java.lang.Class<?> wildcardClass10 = admin2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "admin" + "'", str9, "admin");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00752");
        model.Admin admin2 = new model.Admin("admin", "admin");
        admin2.viewProfile();
        java.lang.String str4 = admin2.getID();
        room.Room room5 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.addRoom(room5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.getRoomID()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "admin" + "'", str4, "admin");
    }

    @Test
    public void test00753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00753");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        admin2.logout();
        java.lang.String str5 = admin2.getAccountType();
        java.lang.String str6 = admin2.getEmail();
        java.lang.String str7 = admin2.getPassword();
        java.lang.String str8 = admin2.getAccountType();
        double double9 = admin2.getHourlyRate();
        java.lang.Class<?> wildcardClass10 = admin2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "admin" + "'", str8, "admin");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00754");
        model.Admin admin2 = new model.Admin("admin", "");
        admin2.setVerified(true);
        java.lang.String str5 = admin2.getEmail();
        double double6 = admin2.getHourlyRate();
        admin2.viewProfile();
        admin2.viewProfile();
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
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "admin" + "'", str9, "admin");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "admin" + "'", str10, "admin");
    }

    @Test
    public void test00755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00755");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getAccountType();
        boolean boolean4 = admin2.isVerified();
        java.lang.String str5 = admin2.getPassword();
        admin2.logout();
        admin2.logout();
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
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test00756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00756");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        admin2.logout();
        java.lang.String str5 = admin2.getAccountType();
        admin2.login("", "");
        java.lang.String str9 = admin2.getID();
        java.lang.String str10 = admin2.getEmail();
        admin2.setVerified(false);
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
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test00757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00757");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        double double5 = admin2.getHourlyRate();
        double double6 = admin2.getHourlyRate();
        java.lang.String str7 = admin2.getID();
        admin2.login("", "admin");
        admin2.viewProfile();
        admin2.viewProfile();
        admin2.setVerified(false);
        java.lang.Class<?> wildcardClass15 = admin2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test00758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00758");
        model.Admin admin2 = new model.Admin("admin", "admin");
        admin2.login("admin", "admin");
        boolean boolean6 = admin2.isVerified();
        admin2.logout();
        java.lang.String str8 = admin2.getPassword();
        java.lang.String str9 = admin2.getID();
        boolean boolean10 = admin2.isVerified();
        java.lang.String str11 = admin2.getID();
        java.lang.Class<?> wildcardClass12 = admin2.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "admin" + "'", str8, "admin");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "admin" + "'", str9, "admin");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "admin" + "'", str11, "admin");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test00759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00759");
        model.Admin admin2 = new model.Admin("admin", "admin");
        admin2.login("admin", "admin");
        double double6 = admin2.getHourlyRate();
        java.lang.String str7 = admin2.getAccountType();
        room.Room room8 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.addRoom(room8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.getRoomID()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
    }

    @Test
    public void test00760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00760");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        admin2.logout();
        java.lang.String str5 = admin2.getAccountType();
        admin2.viewProfile();
        admin2.setVerified(false);
        java.lang.String str9 = admin2.getEmail();
        admin2.setVerified(false);
        java.lang.String str12 = admin2.getID();
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
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "admin" + "'", str12, "admin");
    }

    @Test
    public void test00761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00761");
        model.Admin admin2 = new model.Admin("", "admin");
        boolean boolean3 = admin2.isVerified();
        room.Room room4 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.addRoom(room4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.getRoomID()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test00762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00762");
        model.Admin admin2 = new model.Admin("", "hi!");
        double double3 = admin2.getHourlyRate();
        room.Room room4 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.addRoom(room4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.getRoomID()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test00763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00763");
        model.Admin admin2 = new model.Admin("", "");
        java.lang.String str3 = admin2.getAccountType();
        java.lang.String str4 = admin2.getEmail();
        java.lang.String str5 = admin2.getID();
        double double6 = admin2.getHourlyRate();
        java.lang.String str7 = admin2.getAccountType();
        double double8 = admin2.getHourlyRate();
        java.lang.String str9 = admin2.getEmail();
        admin2.viewProfile();
        admin2.logout();
        java.lang.Class<?> wildcardClass12 = admin2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test00764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00764");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getAccountType();
        admin2.setVerified(false);
        double double6 = admin2.getHourlyRate();
        double double7 = admin2.getHourlyRate();
        admin2.logout();
        admin2.viewProfile();
        java.lang.Class<?> wildcardClass10 = admin2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00765");
        model.Admin admin2 = new model.Admin("admin", "admin");
        admin2.viewProfile();
        java.lang.String str4 = admin2.getPassword();
        java.lang.String str5 = admin2.getPassword();
        admin2.setVerified(false);
        java.lang.String str8 = admin2.getID();
        java.lang.Class<?> wildcardClass9 = admin2.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "admin" + "'", str4, "admin");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "admin" + "'", str8, "admin");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test00766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00766");
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
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "admin" + "'", str11, "admin");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "admin" + "'", str12, "admin");
    }

    @Test
    public void test00767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00767");
        model.Admin admin2 = new model.Admin("admin", "admin");
        admin2.viewProfile();
        java.lang.String str4 = admin2.getID();
        admin2.logout();
        admin2.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "admin" + "'", str4, "admin");
    }

    @Test
    public void test00768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00768");
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
        java.lang.String str13 = admin2.getEmail();
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
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test00769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00769");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getAccountType();
        java.lang.String str4 = admin2.getPassword();
        admin2.setVerified(true);
        java.lang.String str7 = admin2.getEmail();
        admin2.viewProfile();
        room.Room room9 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.disableRoom(room9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test00770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00770");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        double double5 = admin2.getHourlyRate();
        double double6 = admin2.getHourlyRate();
        java.lang.String str7 = admin2.getPassword();
        admin2.setVerified(true);
        java.lang.String str10 = admin2.getEmail();
        java.lang.String str11 = admin2.getPassword();
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
    public void test00771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00771");
        model.Admin admin2 = new model.Admin("", "admin");
        java.lang.String str3 = admin2.getEmail();
        java.lang.String str4 = admin2.getPassword();
        java.lang.String str5 = admin2.getPassword();
        room.Room room6 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.addRoom(room6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.getRoomID()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "admin" + "'", str4, "admin");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
    }

    @Test
    public void test00772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00772");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        admin2.logout();
        java.lang.String str5 = admin2.getAccountType();
        boolean boolean6 = admin2.isVerified();
        java.lang.String str7 = admin2.getAccountType();
        java.lang.String str8 = admin2.getAccountType();
        admin2.setVerified(false);
        java.lang.String str11 = admin2.getEmail();
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
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "admin" + "'", str8, "admin");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test00773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00773");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        admin2.logout();
        java.lang.String str5 = admin2.getAccountType();
        boolean boolean6 = admin2.isVerified();
        admin2.login("hi!", "");
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
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test00774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00774");
        model.Admin admin2 = new model.Admin("admin", "admin");
        admin2.login("admin", "admin");
        boolean boolean6 = admin2.isVerified();
        java.lang.String str7 = admin2.getPassword();
        room.Room room8 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.disableRoom(room8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
    }

    @Test
    public void test00775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00775");
        model.Admin admin2 = new model.Admin("admin", "admin");
        admin2.viewProfile();
        java.lang.String str4 = admin2.getID();
        java.lang.String str5 = admin2.getPassword();
        double double6 = admin2.getHourlyRate();
        admin2.setVerified(true);
        room.Room room9 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.enableRoom(room9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "admin" + "'", str4, "admin");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test00776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00776");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        admin2.logout();
        java.lang.String str5 = admin2.getAccountType();
        boolean boolean6 = admin2.isVerified();
        admin2.login("hi!", "");
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
    }

    @Test
    public void test00777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00777");
        model.Admin admin2 = new model.Admin("admin", "admin");
        admin2.login("admin", "admin");
        boolean boolean6 = admin2.isVerified();
        admin2.logout();
        java.lang.String str8 = admin2.getID();
        admin2.logout();
        java.lang.Class<?> wildcardClass10 = admin2.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "admin" + "'", str8, "admin");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00778");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        admin2.logout();
        java.lang.String str5 = admin2.getAccountType();
        admin2.login("", "");
        java.lang.String str9 = admin2.getID();
        java.lang.String str10 = admin2.getEmail();
        admin2.logout();
        admin2.logout();
        java.lang.String str13 = admin2.getEmail();
        room.Room room14 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.addRoom(room14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.getRoomID()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "admin" + "'", str9, "admin");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test00779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00779");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        java.lang.String str4 = admin2.getAccountType();
        java.lang.String str5 = admin2.getPassword();
        java.lang.String str6 = admin2.getPassword();
        boolean boolean7 = admin2.isVerified();
        room.Room room8 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.addRoom(room8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.getRoomID()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "admin" + "'", str4, "admin");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test00780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00780");
        model.Admin admin2 = new model.Admin("", "admin");
        java.lang.String str3 = admin2.getEmail();
        java.lang.String str4 = admin2.getPassword();
        double double5 = admin2.getHourlyRate();
        double double6 = admin2.getHourlyRate();
        room.Room room7 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.addRoom(room7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.getRoomID()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "admin" + "'", str4, "admin");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test00781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00781");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        double double5 = admin2.getHourlyRate();
        double double6 = admin2.getHourlyRate();
        java.lang.String str7 = admin2.getID();
        boolean boolean8 = admin2.isVerified();
        java.lang.String str9 = admin2.getEmail();
        java.lang.String str10 = admin2.getEmail();
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
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test00782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00782");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        double double5 = admin2.getHourlyRate();
        double double6 = admin2.getHourlyRate();
        java.lang.String str7 = admin2.getID();
        boolean boolean8 = admin2.isVerified();
        admin2.login("", "");
        java.lang.String str12 = admin2.getID();
        java.lang.String str13 = admin2.getPassword();
        admin2.setVerified(true);
        java.lang.Class<?> wildcardClass16 = admin2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "admin" + "'", str12, "admin");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test00783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00783");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        admin2.logout();
        admin2.setVerified(false);
        java.lang.String str6 = admin2.getEmail();
        admin2.viewProfile();
        admin2.viewProfile();
        double double9 = admin2.getHourlyRate();
        admin2.setVerified(true);
        admin2.viewProfile();
        admin2.login("hi!", "");
        admin2.setVerified(false);
        room.Room room18 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.disableRoom(room18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test00784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00784");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        admin2.logout();
        java.lang.String str5 = admin2.getAccountType();
        admin2.viewProfile();
        admin2.logout();
        double double8 = admin2.getHourlyRate();
        double double9 = admin2.getHourlyRate();
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
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test00785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00785");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        admin2.logout();
        java.lang.String str5 = admin2.getAccountType();
        admin2.login("", "");
        java.lang.String str9 = admin2.getPassword();
        admin2.setVerified(false);
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
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test00786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00786");
        model.Admin admin2 = new model.Admin("admin", "admin");
        admin2.viewProfile();
        java.lang.String str4 = admin2.getID();
        admin2.logout();
        java.lang.String str6 = admin2.getAccountType();
        admin2.viewProfile();
        admin2.setVerified(true);
        double double10 = admin2.getHourlyRate();
        java.lang.String str11 = admin2.getID();
        double double12 = admin2.getHourlyRate();
        java.lang.String str13 = admin2.getID();
        admin2.logout();
        room.Room room15 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.addRoom(room15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.getRoomID()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "admin" + "'", str4, "admin");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "admin" + "'", str6, "admin");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "admin" + "'", str11, "admin");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "admin" + "'", str13, "admin");
    }

    @Test
    public void test00787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00787");
        model.Admin admin2 = new model.Admin("admin", "");
        admin2.login("hi!", "admin");
        boolean boolean6 = admin2.isVerified();
        room.Room room7 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.disableRoom(room7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test00788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00788");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        java.lang.String str4 = admin2.getPassword();
        java.lang.String str5 = admin2.getAccountType();
        admin2.viewProfile();
        double double7 = admin2.getHourlyRate();
        java.lang.String str8 = admin2.getID();
        java.lang.String str9 = admin2.getAccountType();
        java.lang.String str10 = admin2.getAccountType();
        admin2.logout();
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
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "admin" + "'", str8, "admin");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "admin" + "'", str9, "admin");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "admin" + "'", str10, "admin");
    }

    @Test
    public void test00789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00789");
        model.Admin admin2 = new model.Admin("admin", "admin");
        admin2.viewProfile();
        java.lang.String str4 = admin2.getID();
        admin2.logout();
        java.lang.String str6 = admin2.getAccountType();
        boolean boolean7 = admin2.isVerified();
        admin2.viewProfile();
        java.lang.Class<?> wildcardClass9 = admin2.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "admin" + "'", str4, "admin");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "admin" + "'", str6, "admin");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test00790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00790");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        java.lang.String str4 = admin2.getPassword();
        java.lang.String str5 = admin2.getAccountType();
        admin2.viewProfile();
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
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "admin" + "'", str8, "admin");
    }

    @Test
    public void test00791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00791");
        model.Admin admin2 = new model.Admin("admin", "admin");
        admin2.viewProfile();
        java.lang.String str4 = admin2.getPassword();
        admin2.login("", "");
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
    }

    @Test
    public void test00792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00792");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        double double5 = admin2.getHourlyRate();
        double double6 = admin2.getHourlyRate();
        java.lang.String str7 = admin2.getID();
        admin2.viewProfile();
        admin2.logout();
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
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test00793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00793");
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
            admin2.enableRoom(room13);
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
    public void test00794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00794");
        model.Admin admin2 = new model.Admin("admin", "admin");
        admin2.login("admin", "admin");
        boolean boolean6 = admin2.isVerified();
        room.Room room7 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.enableRoom(room7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test00795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00795");
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
        java.lang.String str17 = admin2.getPassword();
        java.lang.String str18 = admin2.getID();
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
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "admin" + "'", str12, "admin");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "admin" + "'", str18, "admin");
    }

    @Test
    public void test00796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00796");
        model.Admin admin2 = new model.Admin("hi!", "");
        java.lang.String str3 = admin2.getEmail();
        java.lang.String str4 = admin2.getID();
        java.lang.Class<?> wildcardClass5 = admin2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "admin" + "'", str4, "admin");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test00797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00797");
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
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test00798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00798");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        admin2.logout();
        admin2.setVerified(false);
        java.lang.String str6 = admin2.getEmail();
        admin2.viewProfile();
        admin2.viewProfile();
        double double9 = admin2.getHourlyRate();
        admin2.setVerified(true);
        admin2.viewProfile();
        java.lang.String str13 = admin2.getAccountType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "admin" + "'", str13, "admin");
    }

    @Test
    public void test00799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00799");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        java.lang.String str4 = admin2.getPassword();
        java.lang.String str5 = admin2.getPassword();
        room.Room room6 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.disableRoom(room6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test00800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00800");
        model.Admin admin2 = new model.Admin("", "");
        java.lang.String str3 = admin2.getAccountType();
        admin2.setVerified(true);
        double double6 = admin2.getHourlyRate();
        admin2.login("hi!", "admin");
        java.lang.Class<?> wildcardClass10 = admin2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00801");
        model.Admin admin2 = new model.Admin("admin", "admin");
        admin2.viewProfile();
        java.lang.String str4 = admin2.getPassword();
        admin2.login("", "");
        boolean boolean8 = admin2.isVerified();
        admin2.login("admin", "hi!");
        admin2.logout();
        admin2.login("hi!", "hi!");
        java.lang.String str16 = admin2.getPassword();
        room.Room room17 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.addRoom(room17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.getRoomID()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "admin" + "'", str4, "admin");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "admin" + "'", str16, "admin");
    }

    @Test
    public void test00802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00802");
        model.Admin admin2 = new model.Admin("admin", "admin");
        admin2.viewProfile();
        admin2.viewProfile();
        admin2.login("hi!", "admin");
        java.lang.String str8 = admin2.getID();
        admin2.setVerified(false);
        admin2.setVerified(false);
        room.Room room13 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.enableRoom(room13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "admin" + "'", str8, "admin");
    }

    @Test
    public void test00803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00803");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        admin2.logout();
        java.lang.String str5 = admin2.getAccountType();
        boolean boolean6 = admin2.isVerified();
        admin2.login("hi!", "admin");
        admin2.setVerified(false);
        boolean boolean12 = admin2.isVerified();
        java.lang.Class<?> wildcardClass13 = admin2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00804");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        java.lang.String str4 = admin2.getEmail();
        admin2.logout();
        admin2.logout();
        java.lang.String str7 = admin2.getPassword();
        admin2.viewProfile();
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
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "admin" + "'", str9, "admin");
    }

    @Test
    public void test00805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00805");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        double double5 = admin2.getHourlyRate();
        double double6 = admin2.getHourlyRate();
        java.lang.String str7 = admin2.getID();
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
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "admin" + "'", str9, "admin");
    }

    @Test
    public void test00806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00806");
        model.Admin admin2 = new model.Admin("admin", "admin");
        admin2.login("admin", "admin");
        boolean boolean6 = admin2.isVerified();
        admin2.logout();
        java.lang.String str8 = admin2.getID();
        admin2.viewProfile();
        admin2.login("hi!", "");
        admin2.setVerified(true);
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
    }

    @Test
    public void test00807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00807");
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
            admin2.addRoom(room15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.getRoomID()\" because \"room\" is null");
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
    public void test00808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00808");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        double double5 = admin2.getHourlyRate();
        double double6 = admin2.getHourlyRate();
        java.lang.String str7 = admin2.getID();
        double double8 = admin2.getHourlyRate();
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
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test00809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00809");
        model.Admin admin2 = new model.Admin("admin", "admin");
        admin2.viewProfile();
        java.lang.String str4 = admin2.getID();
        java.lang.String str5 = admin2.getAccountType();
        admin2.viewProfile();
        java.lang.Class<?> wildcardClass7 = admin2.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "admin" + "'", str4, "admin");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test00810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00810");
        model.Admin admin2 = new model.Admin("", "admin");
        boolean boolean3 = admin2.isVerified();
        java.lang.Class<?> wildcardClass4 = admin2.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test00811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00811");
        model.Admin admin2 = new model.Admin("admin", "");
        admin2.setVerified(true);
        boolean boolean5 = admin2.isVerified();
        java.lang.String str6 = admin2.getAccountType();
        admin2.viewProfile();
        java.lang.Class<?> wildcardClass8 = admin2.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "admin" + "'", str6, "admin");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test00812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00812");
        model.Admin admin2 = new model.Admin("admin", "admin");
        admin2.viewProfile();
        java.lang.String str4 = admin2.getID();
        java.lang.String str5 = admin2.getPassword();
        double double6 = admin2.getHourlyRate();
        admin2.setVerified(true);
        admin2.logout();
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
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test00813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00813");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        admin2.logout();
        java.lang.String str5 = admin2.getAccountType();
        admin2.login("", "");
        java.lang.String str9 = admin2.getPassword();
        admin2.logout();
        admin2.login("", "");
        java.lang.String str14 = admin2.getPassword();
        java.lang.Class<?> wildcardClass15 = admin2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test00814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00814");
        model.Admin admin2 = new model.Admin("admin", "admin");
        admin2.login("admin", "admin");
        boolean boolean6 = admin2.isVerified();
        admin2.logout();
        java.lang.String str8 = admin2.getID();
        admin2.logout();
        java.lang.String str10 = admin2.getID();
        boolean boolean11 = admin2.isVerified();
        room.Room room12 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.enableRoom(room12);
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
    public void test00815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00815");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        admin2.logout();
        java.lang.String str5 = admin2.getAccountType();
        boolean boolean6 = admin2.isVerified();
        java.lang.String str7 = admin2.getAccountType();
        admin2.login("", "hi!");
        java.lang.String str11 = admin2.getEmail();
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
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test00816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00816");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        double double5 = admin2.getHourlyRate();
        double double6 = admin2.getHourlyRate();
        admin2.setVerified(true);
        java.lang.String str9 = admin2.getPassword();
        admin2.logout();
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
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test00817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00817");
        model.Admin admin2 = new model.Admin("", "");
        java.lang.String str3 = admin2.getAccountType();
        java.lang.String str4 = admin2.getEmail();
        java.lang.String str5 = admin2.getID();
        double double6 = admin2.getHourlyRate();
        java.lang.String str7 = admin2.getAccountType();
        admin2.setVerified(false);
        boolean boolean10 = admin2.isVerified();
        java.lang.String str11 = admin2.getPassword();
        room.Room room12 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.disableRoom(room12);
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
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test00818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00818");
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
        java.lang.Class<?> wildcardClass15 = admin2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "admin" + "'", str14, "admin");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test00819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00819");
        model.Admin admin2 = new model.Admin("admin", "admin");
        admin2.login("admin", "admin");
        boolean boolean6 = admin2.isVerified();
        admin2.logout();
        java.lang.String str8 = admin2.getID();
        admin2.viewProfile();
        admin2.logout();
        java.lang.Class<?> wildcardClass11 = admin2.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "admin" + "'", str8, "admin");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00820");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        admin2.logout();
        admin2.setVerified(false);
        java.lang.String str6 = admin2.getEmail();
        java.lang.String str7 = admin2.getID();
        java.lang.String str8 = admin2.getPassword();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test00821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00821");
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
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "admin" + "'", str12, "admin");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test00822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00822");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        admin2.logout();
        java.lang.String str5 = admin2.getAccountType();
        boolean boolean6 = admin2.isVerified();
        java.lang.String str7 = admin2.getAccountType();
        java.lang.String str8 = admin2.getAccountType();
        admin2.setVerified(false);
        java.lang.String str11 = admin2.getID();
        double double12 = admin2.getHourlyRate();
        java.lang.String str13 = admin2.getEmail();
        room.Room room14 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.disableRoom(room14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "admin" + "'", str8, "admin");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "admin" + "'", str11, "admin");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test00823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00823");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        double double5 = admin2.getHourlyRate();
        double double6 = admin2.getHourlyRate();
        java.lang.String str7 = admin2.getPassword();
        double double8 = admin2.getHourlyRate();
        admin2.setVerified(true);
        admin2.viewProfile();
        java.lang.Class<?> wildcardClass12 = admin2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test00824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00824");
        model.Admin admin2 = new model.Admin("admin", "admin");
        admin2.viewProfile();
        java.lang.String str4 = admin2.getPassword();
        admin2.login("", "");
        boolean boolean8 = admin2.isVerified();
        admin2.setVerified(true);
        admin2.setVerified(false);
        admin2.setVerified(false);
        admin2.viewProfile();
        admin2.login("", "");
        java.lang.Class<?> wildcardClass19 = admin2.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "admin" + "'", str4, "admin");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test00825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00825");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        double double5 = admin2.getHourlyRate();
        double double6 = admin2.getHourlyRate();
        admin2.setVerified(true);
        java.lang.String str9 = admin2.getEmail();
        java.lang.String str10 = admin2.getEmail();
        boolean boolean11 = admin2.isVerified();
        java.lang.String str12 = admin2.getID();
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
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "admin" + "'", str12, "admin");
    }

    @Test
    public void test00826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00826");
        model.Admin admin2 = new model.Admin("", "");
        java.lang.String str3 = admin2.getAccountType();
        admin2.setVerified(true);
        double double6 = admin2.getHourlyRate();
        admin2.setVerified(false);
        admin2.logout();
        admin2.setVerified(true);
        boolean boolean12 = admin2.isVerified();
        java.lang.Class<?> wildcardClass13 = admin2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00827");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getAccountType();
        boolean boolean4 = admin2.isVerified();
        boolean boolean5 = admin2.isVerified();
        room.Room room6 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.disableRoom(room6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test00828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00828");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        admin2.logout();
        java.lang.String str4 = admin2.getAccountType();
        admin2.viewProfile();
        boolean boolean6 = admin2.isVerified();
        java.lang.Class<?> wildcardClass7 = admin2.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "admin" + "'", str4, "admin");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test00829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00829");
        model.Admin admin2 = new model.Admin("", "");
        java.lang.String str3 = admin2.getAccountType();
        admin2.logout();
        room.Room room5 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.disableRoom(room5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
    }

    @Test
    public void test00830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00830");
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
        admin2.logout();
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
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test00831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00831");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        admin2.logout();
        java.lang.String str5 = admin2.getAccountType();
        boolean boolean6 = admin2.isVerified();
        java.lang.String str7 = admin2.getAccountType();
        room.Room room8 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.enableRoom(room8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
    }

    @Test
    public void test00832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00832");
        model.Admin admin2 = new model.Admin("", "admin");
        java.lang.String str3 = admin2.getEmail();
        java.lang.String str4 = admin2.getPassword();
        double double5 = admin2.getHourlyRate();
        room.Room room6 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.addRoom(room6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.getRoomID()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "admin" + "'", str4, "admin");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test00833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00833");
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
            admin2.enableRoom(room12);
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
    public void test00834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00834");
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
        admin2.logout();
        admin2.logout();
        room.Room room15 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.disableRoom(room15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "admin" + "'", str8, "admin");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "admin" + "'", str11, "admin");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test00835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00835");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        admin2.logout();
        java.lang.String str4 = admin2.getAccountType();
        admin2.logout();
        admin2.login("hi!", "hi!");
        admin2.logout();
        java.lang.Class<?> wildcardClass10 = admin2.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "admin" + "'", str4, "admin");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00836");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getAccountType();
        boolean boolean4 = admin2.isVerified();
        boolean boolean5 = admin2.isVerified();
        admin2.logout();
        admin2.login("admin", "hi!");
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
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test00837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00837");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        admin2.logout();
        java.lang.String str5 = admin2.getAccountType();
        admin2.viewProfile();
        admin2.setVerified(false);
        java.lang.String str9 = admin2.getEmail();
        admin2.setVerified(false);
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
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test00838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00838");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        double double5 = admin2.getHourlyRate();
        double double6 = admin2.getHourlyRate();
        admin2.setVerified(true);
        java.lang.String str9 = admin2.getEmail();
        java.lang.String str10 = admin2.getEmail();
        boolean boolean11 = admin2.isVerified();
        java.lang.Class<?> wildcardClass12 = admin2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test00839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00839");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        java.lang.String str5 = admin2.getID();
        admin2.setVerified(false);
        double double8 = admin2.getHourlyRate();
        java.lang.String str9 = admin2.getAccountType();
        java.lang.String str10 = admin2.getID();
        admin2.viewProfile();
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
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "admin" + "'", str9, "admin");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "admin" + "'", str10, "admin");
    }

    @Test
    public void test00840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00840");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        java.lang.String str5 = admin2.getID();
        java.lang.String str6 = admin2.getID();
        java.lang.String str7 = admin2.getAccountType();
        admin2.setVerified(true);
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
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "admin" + "'", str6, "admin");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "admin" + "'", str10, "admin");
    }

    @Test
    public void test00841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00841");
        model.Admin admin2 = new model.Admin("admin", "admin");
        java.lang.String str3 = admin2.getAccountType();
        admin2.logout();
        room.Room room5 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.disableRoom(room5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
    }

    @Test
    public void test00842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00842");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        double double5 = admin2.getHourlyRate();
        admin2.setVerified(true);
        admin2.logout();
        java.lang.String str9 = admin2.getAccountType();
        admin2.logout();
        java.lang.String str11 = admin2.getEmail();
        java.lang.Class<?> wildcardClass12 = admin2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "admin" + "'", str9, "admin");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test00843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00843");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        admin2.logout();
        java.lang.String str4 = admin2.getEmail();
        java.lang.String str5 = admin2.getPassword();
        boolean boolean6 = admin2.isVerified();
        java.lang.Class<?> wildcardClass7 = admin2.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test00844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00844");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getAccountType();
        boolean boolean4 = admin2.isVerified();
        boolean boolean5 = admin2.isVerified();
        java.lang.String str6 = admin2.getID();
        room.Room room7 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.enableRoom(room7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "admin" + "'", str6, "admin");
    }

    @Test
    public void test00845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00845");
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
            admin2.addRoom(room12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.getRoomID()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test00846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00846");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        admin2.logout();
        java.lang.String str5 = admin2.getAccountType();
        boolean boolean6 = admin2.isVerified();
        admin2.login("hi!", "admin");
        java.lang.String str10 = admin2.getAccountType();
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
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "admin" + "'", str10, "admin");
    }

    @Test
    public void test00847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00847");
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
        java.lang.String str18 = admin2.getEmail();
        room.Room room19 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.enableRoom(room19);
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
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test00848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00848");
        model.Admin admin2 = new model.Admin("admin", "admin");
        admin2.viewProfile();
        java.lang.String str4 = admin2.getPassword();
        admin2.login("", "");
        java.lang.String str8 = admin2.getEmail();
        java.lang.String str9 = admin2.getAccountType();
        admin2.login("", "");
        java.lang.String str13 = admin2.getPassword();
        admin2.login("hi!", "admin");
        admin2.setVerified(true);
        admin2.setVerified(false);
        java.lang.Class<?> wildcardClass21 = admin2.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "admin" + "'", str4, "admin");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "admin" + "'", str8, "admin");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "admin" + "'", str9, "admin");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "admin" + "'", str13, "admin");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test00849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00849");
        model.Admin admin2 = new model.Admin("admin", "admin");
        admin2.viewProfile();
        java.lang.String str4 = admin2.getID();
        admin2.logout();
        java.lang.String str6 = admin2.getAccountType();
        admin2.viewProfile();
        double double8 = admin2.getHourlyRate();
        room.Room room9 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.disableRoom(room9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "admin" + "'", str4, "admin");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "admin" + "'", str6, "admin");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test00850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00850");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        admin2.logout();
        java.lang.String str5 = admin2.getAccountType();
        admin2.login("", "");
        java.lang.String str9 = admin2.getPassword();
        java.lang.String str10 = admin2.getID();
        java.lang.String str11 = admin2.getID();
        java.lang.String str12 = admin2.getID();
        java.lang.Class<?> wildcardClass13 = admin2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "admin" + "'", str10, "admin");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "admin" + "'", str11, "admin");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "admin" + "'", str12, "admin");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00851");
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
        room.Room room13 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.enableRoom(room13);
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
    }

    @Test
    public void test00852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00852");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        admin2.logout();
        admin2.setVerified(false);
        java.lang.String str6 = admin2.getEmail();
        admin2.viewProfile();
        admin2.viewProfile();
        double double9 = admin2.getHourlyRate();
        room.Room room10 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.addRoom(room10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.getRoomID()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test00853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00853");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        admin2.logout();
        admin2.setVerified(false);
        java.lang.String str6 = admin2.getAccountType();
        room.Room room7 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.enableRoom(room7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "admin" + "'", str6, "admin");
    }

    @Test
    public void test00854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00854");
        model.Admin admin2 = new model.Admin("admin", "admin");
        admin2.login("admin", "admin");
        boolean boolean6 = admin2.isVerified();
        admin2.logout();
        java.lang.String str8 = admin2.getID();
        admin2.logout();
        java.lang.String str10 = admin2.getID();
        boolean boolean11 = admin2.isVerified();
        admin2.setVerified(true);
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
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "admin" + "'", str10, "admin");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test00855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00855");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        java.lang.String str4 = admin2.getPassword();
        java.lang.String str5 = admin2.getAccountType();
        java.lang.String str6 = admin2.getID();
        room.Room room7 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.enableRoom(room7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "admin" + "'", str6, "admin");
    }

    @Test
    public void test00856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00856");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        java.lang.String str4 = admin2.getPassword();
        java.lang.String str5 = admin2.getAccountType();
        admin2.viewProfile();
        double double7 = admin2.getHourlyRate();
        java.lang.String str8 = admin2.getID();
        java.lang.String str9 = admin2.getAccountType();
        admin2.viewProfile();
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
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "admin" + "'", str8, "admin");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "admin" + "'", str9, "admin");
    }

    @Test
    public void test00857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00857");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        admin2.logout();
        java.lang.String str4 = admin2.getAccountType();
        admin2.viewProfile();
        boolean boolean6 = admin2.isVerified();
        double double7 = admin2.getHourlyRate();
        java.lang.Class<?> wildcardClass8 = admin2.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "admin" + "'", str4, "admin");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test00858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00858");
        model.Admin admin2 = new model.Admin("admin", "admin");
        admin2.login("admin", "admin");
        boolean boolean6 = admin2.isVerified();
        admin2.logout();
        java.lang.String str8 = admin2.getID();
        admin2.logout();
        java.lang.String str10 = admin2.getID();
        admin2.logout();
        admin2.viewProfile();
        java.lang.Class<?> wildcardClass13 = admin2.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "admin" + "'", str8, "admin");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "admin" + "'", str10, "admin");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00859");
        model.Admin admin2 = new model.Admin("admin", "");
        double double3 = admin2.getHourlyRate();
        admin2.setVerified(true);
        room.Room room6 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.addRoom(room6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.getRoomID()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test00860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00860");
        model.Admin admin2 = new model.Admin("hi!", "admin");
        java.lang.String str3 = admin2.getID();
        admin2.setVerified(false);
        admin2.viewProfile();
        admin2.viewProfile();
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
    public void test00861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00861");
        model.Admin admin2 = new model.Admin("admin", "admin");
        admin2.viewProfile();
        java.lang.String str4 = admin2.getPassword();
        double double5 = admin2.getHourlyRate();
        java.lang.String str6 = admin2.getAccountType();
        admin2.login("hi!", "admin");
        admin2.login("admin", "hi!");
        room.Room room13 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.disableRoom(room13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "admin" + "'", str4, "admin");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "admin" + "'", str6, "admin");
    }

    @Test
    public void test00862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00862");
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
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test00863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00863");
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
        room.Room room16 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.disableRoom(room16);
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
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test00864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00864");
        model.Admin admin2 = new model.Admin("", "");
        java.lang.String str3 = admin2.getAccountType();
        admin2.setVerified(true);
        double double6 = admin2.getHourlyRate();
        admin2.setVerified(false);
        java.lang.String str9 = admin2.getEmail();
        java.lang.String str10 = admin2.getPassword();
        java.lang.String str11 = admin2.getPassword();
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
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test00865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00865");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        double double5 = admin2.getHourlyRate();
        admin2.setVerified(true);
        admin2.setVerified(false);
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
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test00866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00866");
        model.Admin admin2 = new model.Admin("admin", "admin");
        admin2.viewProfile();
        admin2.viewProfile();
        admin2.login("hi!", "admin");
        java.lang.String str8 = admin2.getID();
        admin2.setVerified(false);
        room.Room room11 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.addRoom(room11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.getRoomID()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "admin" + "'", str8, "admin");
    }

    @Test
    public void test00867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00867");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        java.lang.String str4 = admin2.getPassword();
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
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test00868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00868");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        admin2.logout();
        java.lang.String str5 = admin2.getAccountType();
        admin2.login("", "");
        java.lang.String str9 = admin2.getID();
        java.lang.String str10 = admin2.getEmail();
        java.lang.String str11 = admin2.getAccountType();
        admin2.logout();
        admin2.logout();
        java.lang.String str14 = admin2.getPassword();
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
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test00869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00869");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        admin2.logout();
        java.lang.String str5 = admin2.getAccountType();
        admin2.login("", "");
        java.lang.String str9 = admin2.getID();
        java.lang.String str10 = admin2.getEmail();
        java.lang.String str11 = admin2.getAccountType();
        java.lang.Class<?> wildcardClass12 = admin2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "admin" + "'", str9, "admin");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "admin" + "'", str11, "admin");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test00870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00870");
        model.Admin admin2 = new model.Admin("admin", "admin");
        admin2.viewProfile();
        java.lang.String str4 = admin2.getPassword();
        admin2.login("", "");
        room.Room room8 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.addRoom(room8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.getRoomID()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "admin" + "'", str4, "admin");
    }

    @Test
    public void test00871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00871");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getAccountType();
        boolean boolean4 = admin2.isVerified();
        java.lang.String str5 = admin2.getEmail();
        java.lang.String str6 = admin2.getAccountType();
        java.lang.String str7 = admin2.getAccountType();
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
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "admin" + "'", str6, "admin");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "admin" + "'", str9, "admin");
    }

    @Test
    public void test00872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00872");
        model.Admin admin2 = new model.Admin("", "");
        java.lang.String str3 = admin2.getAccountType();
        java.lang.String str4 = admin2.getEmail();
        java.lang.String str5 = admin2.getID();
        double double6 = admin2.getHourlyRate();
        java.lang.String str7 = admin2.getAccountType();
        admin2.login("admin", "");
        admin2.login("hi!", "hi!");
        room.Room room14 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.enableRoom(room14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
    }

    @Test
    public void test00873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00873");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        admin2.logout();
        admin2.setVerified(false);
        java.lang.String str6 = admin2.getEmail();
        admin2.viewProfile();
        admin2.viewProfile();
        double double9 = admin2.getHourlyRate();
        admin2.setVerified(false);
        room.Room room12 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.addRoom(room12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.getRoomID()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test00874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00874");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getAccountType();
        java.lang.String str4 = admin2.getPassword();
        admin2.setVerified(true);
        double double7 = admin2.getHourlyRate();
        admin2.viewProfile();
        room.Room room9 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.addRoom(room9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.getRoomID()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test00875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00875");
        model.Admin admin2 = new model.Admin("admin", "");
        double double3 = admin2.getHourlyRate();
        java.lang.String str4 = admin2.getAccountType();
        room.Room room5 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.addRoom(room5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.getRoomID()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "admin" + "'", str4, "admin");
    }

    @Test
    public void test00876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00876");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        double double5 = admin2.getHourlyRate();
        double double6 = admin2.getHourlyRate();
        java.lang.String str7 = admin2.getID();
        boolean boolean8 = admin2.isVerified();
        java.lang.String str9 = admin2.getPassword();
        admin2.logout();
        admin2.logout();
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
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test00877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00877");
        model.Admin admin2 = new model.Admin("", "");
        java.lang.String str3 = admin2.getAccountType();
        admin2.setVerified(true);
        admin2.viewProfile();
        java.lang.String str7 = admin2.getEmail();
        java.lang.Class<?> wildcardClass8 = admin2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test00878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00878");
        model.Admin admin2 = new model.Admin("admin", "");
        admin2.setVerified(true);
        java.lang.String str5 = admin2.getEmail();
        double double6 = admin2.getHourlyRate();
        double double7 = admin2.getHourlyRate();
        room.Room room8 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.enableRoom(room8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test00879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00879");
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
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "admin" + "'", str19, "admin");
    }

    @Test
    public void test00880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00880");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        admin2.logout();
        java.lang.String str5 = admin2.getAccountType();
        java.lang.String str6 = admin2.getEmail();
        java.lang.String str7 = admin2.getPassword();
        java.lang.String str8 = admin2.getAccountType();
        java.lang.String str9 = admin2.getEmail();
        java.lang.Class<?> wildcardClass10 = admin2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "admin" + "'", str8, "admin");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00881");
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
        admin2.logout();
        java.lang.String str18 = admin2.getID();
        java.lang.String str19 = admin2.getEmail();
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
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "admin" + "'", str18, "admin");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test00882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00882");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        double double5 = admin2.getHourlyRate();
        double double6 = admin2.getHourlyRate();
        room.Room room7 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.addRoom(room7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.getRoomID()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test00883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00883");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        java.lang.String str4 = admin2.getPassword();
        java.lang.String str5 = admin2.getAccountType();
        room.Room room6 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.disableRoom(room6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
    }

    @Test
    public void test00884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00884");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        double double5 = admin2.getHourlyRate();
        double double6 = admin2.getHourlyRate();
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
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test00885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00885");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        admin2.logout();
        java.lang.String str5 = admin2.getAccountType();
        java.lang.String str6 = admin2.getEmail();
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
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "admin" + "'", str8, "admin");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test00886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00886");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        admin2.logout();
        java.lang.String str5 = admin2.getAccountType();
        admin2.viewProfile();
        admin2.login("hi!", "admin");
        java.lang.String str10 = admin2.getAccountType();
        boolean boolean11 = admin2.isVerified();
        boolean boolean12 = admin2.isVerified();
        java.lang.Class<?> wildcardClass13 = admin2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "admin" + "'", str10, "admin");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00887");
        model.Admin admin2 = new model.Admin("admin", "admin");
        admin2.viewProfile();
        java.lang.String str4 = admin2.getPassword();
        admin2.login("", "");
        admin2.viewProfile();
        admin2.setVerified(true);
        java.lang.Class<?> wildcardClass11 = admin2.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "admin" + "'", str4, "admin");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00888");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        java.lang.String str4 = admin2.getAccountType();
        java.lang.String str5 = admin2.getPassword();
        admin2.setVerified(true);
        admin2.login("", "");
        java.lang.String str11 = admin2.getID();
        room.Room room12 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.enableRoom(room12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "admin" + "'", str4, "admin");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "admin" + "'", str11, "admin");
    }

    @Test
    public void test00889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00889");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        java.lang.String str5 = admin2.getID();
        java.lang.String str6 = admin2.getID();
        admin2.logout();
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
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "admin" + "'", str6, "admin");
    }

    @Test
    public void test00890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00890");
        model.Admin admin2 = new model.Admin("admin", "admin");
        admin2.viewProfile();
        java.lang.String str4 = admin2.getID();
        admin2.logout();
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
    public void test00891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00891");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        java.lang.String str4 = admin2.getEmail();
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
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test00892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00892");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        admin2.logout();
        java.lang.String str5 = admin2.getAccountType();
        admin2.login("", "");
        java.lang.String str9 = admin2.getEmail();
        admin2.login("", "");
        admin2.setVerified(false);
        java.lang.Class<?> wildcardClass15 = admin2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test00893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00893");
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
        double double15 = admin2.getHourlyRate();
        double double16 = admin2.getHourlyRate();
        java.lang.Class<?> wildcardClass17 = admin2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "admin" + "'", str12, "admin");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test00894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00894");
        model.Admin admin2 = new model.Admin("", "");
        java.lang.String str3 = admin2.getAccountType();
        admin2.setVerified(true);
        java.lang.String str6 = admin2.getAccountType();
        admin2.logout();
        double double8 = admin2.getHourlyRate();
        double double9 = admin2.getHourlyRate();
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
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "admin" + "'", str6, "admin");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "admin" + "'", str10, "admin");
    }

    @Test
    public void test00895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00895");
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
        room.Room room15 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.enableRoom(room15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "admin" + "'", str9, "admin");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test00896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00896");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getAccountType();
        admin2.setVerified(false);
        double double6 = admin2.getHourlyRate();
        admin2.viewProfile();
        java.lang.Class<?> wildcardClass8 = admin2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test00897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00897");
        model.Admin admin2 = new model.Admin("admin", "admin");
        boolean boolean3 = admin2.isVerified();
        java.lang.String str4 = admin2.getPassword();
        java.lang.String str5 = admin2.getPassword();
        java.lang.String str6 = admin2.getAccountType();
        room.Room room7 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.disableRoom(room7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "admin" + "'", str4, "admin");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "admin" + "'", str6, "admin");
    }

    @Test
    public void test00898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00898");
        model.Admin admin2 = new model.Admin("admin", "admin");
        boolean boolean3 = admin2.isVerified();
        admin2.login("hi!", "");
        admin2.setVerified(true);
        admin2.viewProfile();
        admin2.viewProfile();
        java.lang.Class<?> wildcardClass11 = admin2.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00899");
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
        admin2.viewProfile();
        admin2.login("", "");
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
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "admin" + "'", str12, "admin");
    }

    @Test
    public void test00900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00900");
        model.Admin admin2 = new model.Admin("", "admin");
        java.lang.String str3 = admin2.getEmail();
        java.lang.String str4 = admin2.getPassword();
        java.lang.String str5 = admin2.getID();
        admin2.viewProfile();
        room.Room room7 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.enableRoom(room7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "admin" + "'", str4, "admin");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
    }

    @Test
    public void test00901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00901");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        double double5 = admin2.getHourlyRate();
        admin2.login("admin", "hi!");
        admin2.setVerified(false);
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
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test00902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00902");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        double double5 = admin2.getHourlyRate();
        double double6 = admin2.getHourlyRate();
        java.lang.String str7 = admin2.getID();
        double double8 = admin2.getHourlyRate();
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
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test00903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00903");
        model.Admin admin2 = new model.Admin("admin", "admin");
        admin2.viewProfile();
        java.lang.String str4 = admin2.getPassword();
        admin2.login("", "");
        boolean boolean8 = admin2.isVerified();
        admin2.setVerified(true);
        admin2.setVerified(false);
        admin2.setVerified(false);
        java.lang.String str15 = admin2.getAccountType();
        java.lang.Class<?> wildcardClass16 = admin2.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "admin" + "'", str4, "admin");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "admin" + "'", str15, "admin");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test00904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00904");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        admin2.logout();
        java.lang.String str5 = admin2.getAccountType();
        admin2.login("", "");
        java.lang.String str9 = admin2.getID();
        double double10 = admin2.getHourlyRate();
        java.lang.String str11 = admin2.getEmail();
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
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "admin" + "'", str9, "admin");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test00905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00905");
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
        admin2.logout();
        java.lang.String str18 = admin2.getID();
        java.lang.String str19 = admin2.getEmail();
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
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "admin" + "'", str18, "admin");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test00906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00906");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        java.lang.String str5 = admin2.getID();
        java.lang.String str6 = admin2.getID();
        admin2.logout();
        admin2.setVerified(true);
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
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "admin" + "'", str6, "admin");
    }

    @Test
    public void test00907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00907");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        admin2.logout();
        java.lang.String str5 = admin2.getAccountType();
        boolean boolean6 = admin2.isVerified();
        admin2.login("hi!", "admin");
        java.lang.String str10 = admin2.getEmail();
        double double11 = admin2.getHourlyRate();
        double double12 = admin2.getHourlyRate();
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
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test00908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00908");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        admin2.logout();
        java.lang.String str5 = admin2.getAccountType();
        admin2.login("", "");
        java.lang.String str9 = admin2.getPassword();
        java.lang.String str10 = admin2.getID();
        java.lang.String str11 = admin2.getID();
        java.lang.String str12 = admin2.getID();
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
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "admin" + "'", str10, "admin");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "admin" + "'", str11, "admin");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "admin" + "'", str12, "admin");
    }

    @Test
    public void test00909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00909");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        double double5 = admin2.getHourlyRate();
        double double6 = admin2.getHourlyRate();
        java.lang.String str7 = admin2.getPassword();
        admin2.logout();
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
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test00910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00910");
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
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test00911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00911");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        java.lang.String str4 = admin2.getAccountType();
        java.lang.String str5 = admin2.getID();
        java.lang.String str6 = admin2.getEmail();
        java.lang.String str7 = admin2.getPassword();
        java.lang.String str8 = admin2.getID();
        java.lang.String str9 = admin2.getAccountType();
        admin2.logout();
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
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "admin" + "'", str4, "admin");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "admin" + "'", str8, "admin");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "admin" + "'", str9, "admin");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "admin" + "'", str11, "admin");
    }

    @Test
    public void test00912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00912");
        model.Admin admin2 = new model.Admin("admin", "");
        admin2.setVerified(true);
        java.lang.String str5 = admin2.getEmail();
        double double6 = admin2.getHourlyRate();
        admin2.viewProfile();
        admin2.viewProfile();
        java.lang.String str9 = admin2.getEmail();
        java.lang.String str10 = admin2.getPassword();
        admin2.logout();
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
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "admin" + "'", str9, "admin");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test00913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00913");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        java.lang.String str5 = admin2.getID();
        admin2.setVerified(false);
        double double8 = admin2.getHourlyRate();
        double double9 = admin2.getHourlyRate();
        java.lang.Class<?> wildcardClass10 = admin2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00914");
        model.Admin admin2 = new model.Admin("admin", "admin");
        admin2.login("admin", "admin");
        boolean boolean6 = admin2.isVerified();
        room.Room room7 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.addRoom(room7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.getRoomID()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test00915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00915");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        java.lang.String str5 = admin2.getID();
        admin2.setVerified(false);
        java.lang.String str8 = admin2.getPassword();
        admin2.logout();
        java.lang.String str10 = admin2.getAccountType();
        java.lang.String str11 = admin2.getAccountType();
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
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "admin" + "'", str10, "admin");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "admin" + "'", str11, "admin");
    }

    @Test
    public void test00916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00916");
        model.Admin admin2 = new model.Admin("admin", "admin");
        admin2.viewProfile();
        java.lang.String str4 = admin2.getID();
        admin2.logout();
        java.lang.String str6 = admin2.getAccountType();
        java.lang.String str7 = admin2.getPassword();
        java.lang.Class<?> wildcardClass8 = admin2.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "admin" + "'", str4, "admin");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "admin" + "'", str6, "admin");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test00917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00917");
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
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "admin" + "'", str10, "admin");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test00918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00918");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getAccountType();
        boolean boolean4 = admin2.isVerified();
        boolean boolean5 = admin2.isVerified();
        java.lang.String str6 = admin2.getID();
        admin2.logout();
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
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "admin" + "'", str6, "admin");
    }

    @Test
    public void test00919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00919");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        double double5 = admin2.getHourlyRate();
        double double6 = admin2.getHourlyRate();
        admin2.setVerified(true);
        admin2.setVerified(true);
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
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test00920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00920");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        java.lang.String str4 = admin2.getAccountType();
        java.lang.String str5 = admin2.getID();
        java.lang.String str6 = admin2.getEmail();
        java.lang.String str7 = admin2.getPassword();
        admin2.login("hi!", "hi!");
        room.Room room11 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.addRoom(room11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.getRoomID()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "admin" + "'", str4, "admin");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test00921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00921");
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
        admin2.login("", "");
        java.lang.Class<?> wildcardClass21 = admin2.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "admin" + "'", str4, "admin");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "admin" + "'", str8, "admin");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "admin" + "'", str9, "admin");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "admin" + "'", str13, "admin");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "admin" + "'", str17, "admin");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test00922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00922");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        admin2.logout();
        java.lang.String str5 = admin2.getID();
        java.lang.Class<?> wildcardClass6 = admin2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test00923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00923");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        admin2.logout();
        java.lang.String str5 = admin2.getAccountType();
        admin2.viewProfile();
        admin2.login("hi!", "admin");
        double double10 = admin2.getHourlyRate();
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
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test00924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00924");
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
        admin2.viewProfile();
        java.lang.String str14 = admin2.getEmail();
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
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "admin" + "'", str12, "admin");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test00925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00925");
        model.Admin admin2 = new model.Admin("admin", "admin");
        admin2.viewProfile();
        java.lang.String str4 = admin2.getID();
        java.lang.String str5 = admin2.getPassword();
        double double6 = admin2.getHourlyRate();
        java.lang.String str7 = admin2.getEmail();
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
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "admin" + "'", str9, "admin");
    }

    @Test
    public void test00926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00926");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        admin2.logout();
        java.lang.String str5 = admin2.getAccountType();
        boolean boolean6 = admin2.isVerified();
        admin2.login("hi!", "admin");
        java.lang.String str10 = admin2.getAccountType();
        java.lang.String str11 = admin2.getEmail();
        admin2.logout();
        admin2.logout();
        room.Room room14 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.disableRoom(room14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "admin" + "'", str10, "admin");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test00927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00927");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        admin2.logout();
        java.lang.String str5 = admin2.getAccountType();
        boolean boolean6 = admin2.isVerified();
        admin2.login("hi!", "admin");
        java.lang.String str10 = admin2.getID();
        admin2.login("hi!", "");
        java.lang.String str14 = admin2.getEmail();
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
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "admin" + "'", str10, "admin");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test00928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00928");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        java.lang.String str5 = admin2.getID();
        admin2.setVerified(false);
        double double8 = admin2.getHourlyRate();
        java.lang.String str9 = admin2.getAccountType();
        java.lang.String str10 = admin2.getID();
        admin2.viewProfile();
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
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "admin" + "'", str9, "admin");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "admin" + "'", str10, "admin");
    }

    @Test
    public void test00929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00929");
        model.Admin admin2 = new model.Admin("admin", "admin");
        boolean boolean3 = admin2.isVerified();
        admin2.login("hi!", "");
        admin2.setVerified(true);
        admin2.viewProfile();
        admin2.login("admin", "admin");
        room.Room room13 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.disableRoom(room13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test00930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00930");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getPassword();
        room.Room room4 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.disableRoom(room4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
    }

    @Test
    public void test00931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00931");
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
        java.lang.String str16 = admin2.getPassword();
        java.lang.Class<?> wildcardClass17 = admin2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "admin" + "'", str15, "admin");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test00932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00932");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        admin2.logout();
        java.lang.String str5 = admin2.getAccountType();
        admin2.viewProfile();
        admin2.login("hi!", "admin");
        boolean boolean10 = admin2.isVerified();
        admin2.logout();
        java.lang.String str12 = admin2.getID();
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
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "admin" + "'", str12, "admin");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test00933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00933");
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
        room.Room room14 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.disableRoom(room14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test00934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00934");
        model.Admin admin2 = new model.Admin("admin", "admin");
        admin2.login("admin", "admin");
        boolean boolean6 = admin2.isVerified();
        admin2.logout();
        java.lang.String str8 = admin2.getID();
        admin2.logout();
        java.lang.String str10 = admin2.getID();
        room.Room room11 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.disableRoom(room11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "admin" + "'", str8, "admin");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "admin" + "'", str10, "admin");
    }

    @Test
    public void test00935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00935");
        model.Admin admin2 = new model.Admin("admin", "");
        admin2.setVerified(true);
        java.lang.String str5 = admin2.getAccountType();
        java.lang.String str6 = admin2.getAccountType();
        java.lang.Class<?> wildcardClass7 = admin2.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "admin" + "'", str6, "admin");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test00936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00936");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        double double5 = admin2.getHourlyRate();
        admin2.setVerified(false);
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
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test00937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00937");
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
        java.lang.String str17 = admin2.getID();
        admin2.logout();
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
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "admin" + "'", str17, "admin");
    }

    @Test
    public void test00938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00938");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        java.lang.String str5 = admin2.getID();
        java.lang.String str6 = admin2.getID();
        java.lang.String str7 = admin2.getAccountType();
        admin2.logout();
        java.lang.String str9 = admin2.getEmail();
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
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "admin" + "'", str6, "admin");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test00939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00939");
        model.Admin admin2 = new model.Admin("admin", "");
        admin2.logout();
        room.Room room4 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.enableRoom(room4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00940");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        double double5 = admin2.getHourlyRate();
        double double6 = admin2.getHourlyRate();
        java.lang.String str7 = admin2.getID();
        admin2.viewProfile();
        double double9 = admin2.getHourlyRate();
        java.lang.String str10 = admin2.getPassword();
        admin2.logout();
        java.lang.Class<?> wildcardClass12 = admin2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test00941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00941");
        model.Admin admin2 = new model.Admin("admin", "admin");
        admin2.viewProfile();
        java.lang.String str4 = admin2.getID();
        admin2.logout();
        java.lang.String str6 = admin2.getAccountType();
        admin2.viewProfile();
        admin2.setVerified(true);
        double double10 = admin2.getHourlyRate();
        room.Room room11 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.disableRoom(room11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "admin" + "'", str4, "admin");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "admin" + "'", str6, "admin");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test00942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00942");
        model.Admin admin2 = new model.Admin("", "hi!");
        java.lang.String str3 = admin2.getPassword();
        admin2.setVerified(false);
        java.lang.String str6 = admin2.getPassword();
        boolean boolean7 = admin2.isVerified();
        java.lang.String str8 = admin2.getID();
        admin2.setVerified(false);
        room.Room room11 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.disableRoom(room11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "admin" + "'", str8, "admin");
    }

    @Test
    public void test00943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00943");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        double double5 = admin2.getHourlyRate();
        double double6 = admin2.getHourlyRate();
        boolean boolean7 = admin2.isVerified();
        room.Room room8 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.enableRoom(room8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test00944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00944");
        model.Admin admin2 = new model.Admin("admin", "admin");
        admin2.viewProfile();
        java.lang.String str4 = admin2.getPassword();
        admin2.login("", "");
        boolean boolean8 = admin2.isVerified();
        admin2.setVerified(true);
        admin2.setVerified(false);
        admin2.viewProfile();
        admin2.login("", "admin");
        room.Room room17 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.disableRoom(room17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "admin" + "'", str4, "admin");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test00945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00945");
        model.Admin admin2 = new model.Admin("", "");
        java.lang.String str3 = admin2.getAccountType();
        admin2.setVerified(true);
        double double6 = admin2.getHourlyRate();
        admin2.setVerified(false);
        admin2.logout();
        admin2.setVerified(true);
        boolean boolean12 = admin2.isVerified();
        java.lang.String str13 = admin2.getAccountType();
        java.lang.String str14 = admin2.getAccountType();
        room.Room room15 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.enableRoom(room15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "admin" + "'", str13, "admin");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "admin" + "'", str14, "admin");
    }

    @Test
    public void test00946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00946");
        model.Admin admin2 = new model.Admin("admin", "admin");
        boolean boolean3 = admin2.isVerified();
        admin2.login("hi!", "");
        double double7 = admin2.getHourlyRate();
        java.lang.String str8 = admin2.getID();
        double double9 = admin2.getHourlyRate();
        admin2.viewProfile();
        boolean boolean11 = admin2.isVerified();
        java.lang.Class<?> wildcardClass12 = admin2.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "admin" + "'", str8, "admin");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test00947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00947");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        admin2.logout();
        admin2.setVerified(false);
        java.lang.String str6 = admin2.getEmail();
        admin2.viewProfile();
        admin2.viewProfile();
        double double9 = admin2.getHourlyRate();
        admin2.setVerified(true);
        room.Room room12 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.disableRoom(room12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test00948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00948");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        double double5 = admin2.getHourlyRate();
        double double6 = admin2.getHourlyRate();
        java.lang.String str7 = admin2.getID();
        boolean boolean8 = admin2.isVerified();
        admin2.viewProfile();
        admin2.login("hi!", "");
        admin2.viewProfile();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test00949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00949");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        double double5 = admin2.getHourlyRate();
        double double6 = admin2.getHourlyRate();
        java.lang.String str7 = admin2.getID();
        admin2.login("", "admin");
        admin2.viewProfile();
        boolean boolean12 = admin2.isVerified();
        java.lang.String str13 = admin2.getID();
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
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "admin" + "'", str13, "admin");
    }

    @Test
    public void test00950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00950");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        double double5 = admin2.getHourlyRate();
        double double6 = admin2.getHourlyRate();
        java.lang.String str7 = admin2.getID();
        admin2.setVerified(false);
        admin2.setVerified(false);
        java.lang.String str12 = admin2.getPassword();
        boolean boolean13 = admin2.isVerified();
        java.lang.String str14 = admin2.getID();
        java.lang.String str15 = admin2.getPassword();
        java.lang.Class<?> wildcardClass16 = admin2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "admin" + "'", str14, "admin");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test00951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00951");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        double double5 = admin2.getHourlyRate();
        double double6 = admin2.getHourlyRate();
        admin2.setVerified(true);
        java.lang.String str9 = admin2.getID();
        java.lang.String str10 = admin2.getEmail();
        admin2.logout();
        admin2.viewProfile();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "admin" + "'", str9, "admin");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test00952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00952");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        java.lang.String str4 = admin2.getPassword();
        java.lang.String str5 = admin2.getAccountType();
        java.lang.String str6 = admin2.getID();
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
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "admin" + "'", str6, "admin");
    }

    @Test
    public void test00953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00953");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getAccountType();
        admin2.setVerified(false);
        java.lang.String str6 = admin2.getPassword();
        room.Room room7 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.enableRoom(room7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test00954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00954");
        model.Admin admin2 = new model.Admin("admin", "");
        admin2.setVerified(true);
        java.lang.String str5 = admin2.getAccountType();
        admin2.viewProfile();
        admin2.viewProfile();
        room.Room room8 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.addRoom(room8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.getRoomID()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
    }

    @Test
    public void test00955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00955");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        admin2.logout();
        java.lang.String str5 = admin2.getAccountType();
        boolean boolean6 = admin2.isVerified();
        admin2.login("hi!", "admin");
        java.lang.String str10 = admin2.getAccountType();
        admin2.viewProfile();
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
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "admin" + "'", str10, "admin");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "admin" + "'", str12, "admin");
    }

    @Test
    public void test00956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00956");
        model.Admin admin2 = new model.Admin("admin", "admin");
        admin2.viewProfile();
        java.lang.String str4 = admin2.getPassword();
        admin2.login("", "");
        boolean boolean8 = admin2.isVerified();
        admin2.setVerified(false);
        double double11 = admin2.getHourlyRate();
        java.lang.String str12 = admin2.getPassword();
        admin2.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "admin" + "'", str4, "admin");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "admin" + "'", str12, "admin");
    }

    @Test
    public void test00957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00957");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getPassword();
        java.lang.String str4 = admin2.getID();
        java.lang.String str5 = admin2.getAccountType();
        java.lang.Class<?> wildcardClass6 = admin2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "admin" + "'", str4, "admin");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test00958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00958");
        model.Admin admin2 = new model.Admin("admin", "");
        admin2.setVerified(true);
        java.lang.String str5 = admin2.getEmail();
        double double6 = admin2.getHourlyRate();
        admin2.viewProfile();
        admin2.viewProfile();
        admin2.setVerified(false);
        room.Room room11 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.addRoom(room11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.getRoomID()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test00959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00959");
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
        admin2.setVerified(false);
        java.lang.Class<?> wildcardClass19 = admin2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "admin" + "'", str15, "admin");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test00960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00960");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        java.lang.String str5 = admin2.getID();
        admin2.setVerified(false);
        admin2.logout();
        admin2.logout();
        java.lang.Class<?> wildcardClass10 = admin2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00961");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        admin2.logout();
        java.lang.String str5 = admin2.getAccountType();
        boolean boolean6 = admin2.isVerified();
        admin2.login("hi!", "admin");
        boolean boolean10 = admin2.isVerified();
        admin2.setVerified(false);
        java.lang.String str13 = admin2.getEmail();
        room.Room room14 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.addRoom(room14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.getRoomID()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test00962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00962");
        model.Admin admin2 = new model.Admin("admin", "admin");
        admin2.viewProfile();
        java.lang.String str4 = admin2.getID();
        admin2.logout();
        java.lang.String str6 = admin2.getAccountType();
        admin2.viewProfile();
        admin2.setVerified(true);
        boolean boolean10 = admin2.isVerified();
        java.lang.String str11 = admin2.getEmail();
        java.lang.Class<?> wildcardClass12 = admin2.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "admin" + "'", str4, "admin");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "admin" + "'", str6, "admin");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "admin" + "'", str11, "admin");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test00963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00963");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getAccountType();
        boolean boolean4 = admin2.isVerified();
        boolean boolean5 = admin2.isVerified();
        admin2.logout();
        admin2.login("admin", "hi!");
        boolean boolean10 = admin2.isVerified();
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
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test00964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00964");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        admin2.logout();
        java.lang.String str5 = admin2.getAccountType();
        admin2.viewProfile();
        admin2.login("hi!", "admin");
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
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test00965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00965");
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
        java.lang.String str14 = admin2.getPassword();
        java.lang.Class<?> wildcardClass15 = admin2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test00966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00966");
        model.Admin admin2 = new model.Admin("", "admin");
        java.lang.String str3 = admin2.getEmail();
        java.lang.String str4 = admin2.getPassword();
        java.lang.String str5 = admin2.getPassword();
        admin2.setVerified(false);
        room.Room room8 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.addRoom(room8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.getRoomID()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "admin" + "'", str4, "admin");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
    }

    @Test
    public void test00967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00967");
        model.Admin admin2 = new model.Admin("admin", "");
        admin2.logout();
        admin2.viewProfile();
        boolean boolean5 = admin2.isVerified();
        java.lang.String str6 = admin2.getAccountType();
        java.lang.String str7 = admin2.getAccountType();
        room.Room room8 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.enableRoom(room8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "admin" + "'", str6, "admin");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
    }

    @Test
    public void test00968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00968");
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
            admin2.addRoom(room16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.getRoomID()\" because \"room\" is null");
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
    public void test00969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00969");
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
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "admin" + "'", str10, "admin");
    }

    @Test
    public void test00970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00970");
        model.Admin admin2 = new model.Admin("admin", "admin");
        admin2.viewProfile();
        java.lang.String str4 = admin2.getPassword();
        admin2.login("", "");
        java.lang.String str8 = admin2.getEmail();
        java.lang.String str9 = admin2.getAccountType();
        admin2.login("", "");
        java.lang.String str13 = admin2.getPassword();
        admin2.login("hi!", "hi!");
        room.Room room17 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.enableRoom(room17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "admin" + "'", str4, "admin");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "admin" + "'", str8, "admin");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "admin" + "'", str9, "admin");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "admin" + "'", str13, "admin");
    }

    @Test
    public void test00971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00971");
        model.Admin admin2 = new model.Admin("admin", "admin");
        admin2.login("admin", "admin");
        boolean boolean6 = admin2.isVerified();
        admin2.logout();
        admin2.setVerified(false);
        admin2.setVerified(false);
        boolean boolean12 = admin2.isVerified();
        room.Room room13 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.disableRoom(room13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test00972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00972");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        java.lang.String str5 = admin2.getID();
        java.lang.String str6 = admin2.getID();
        java.lang.String str7 = admin2.getAccountType();
        admin2.logout();
        java.lang.Class<?> wildcardClass9 = admin2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "admin" + "'", str6, "admin");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test00973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00973");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        double double5 = admin2.getHourlyRate();
        double double6 = admin2.getHourlyRate();
        java.lang.String str7 = admin2.getPassword();
        double double8 = admin2.getHourlyRate();
        admin2.logout();
        double double10 = admin2.getHourlyRate();
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
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test00974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00974");
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
            admin2.disableRoom(room10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "admin" + "'", str4, "admin");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
    }

    @Test
    public void test00975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00975");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        java.lang.String str4 = admin2.getEmail();
        boolean boolean5 = admin2.isVerified();
        admin2.logout();
        admin2.logout();
        room.Room room8 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.addRoom(room8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.getRoomID()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test00976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00976");
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
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "admin" + "'", str6, "admin");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test00977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00977");
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
    }

    @Test
    public void test00978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00978");
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
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test00979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00979");
        model.Admin admin2 = new model.Admin("", "");
        java.lang.String str3 = admin2.getAccountType();
        admin2.logout();
        java.lang.String str5 = admin2.getPassword();
        room.Room room6 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.addRoom(room6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.getRoomID()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test00980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00980");
        model.Admin admin2 = new model.Admin("admin", "");
        admin2.setVerified(true);
        admin2.logout();
        admin2.login("admin", "hi!");
        java.lang.String str9 = admin2.getPassword();
        java.lang.String str10 = admin2.getID();
        room.Room room11 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.disableRoom(room11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "admin" + "'", str10, "admin");
    }

    @Test
    public void test00981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00981");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        double double5 = admin2.getHourlyRate();
        double double6 = admin2.getHourlyRate();
        java.lang.String str7 = admin2.getID();
        admin2.viewProfile();
        admin2.logout();
        boolean boolean10 = admin2.isVerified();
        java.lang.String str11 = admin2.getPassword();
        boolean boolean12 = admin2.isVerified();
        java.lang.Class<?> wildcardClass13 = admin2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00982");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        admin2.login("admin", "hi!");
        java.lang.String str6 = admin2.getAccountType();
        admin2.setVerified(false);
        room.Room room9 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.disableRoom(room9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "admin" + "'", str6, "admin");
    }

    @Test
    public void test00983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00983");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        admin2.logout();
        java.lang.String str5 = admin2.getAccountType();
        admin2.login("hi!", "");
        admin2.logout();
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
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "admin" + "'", str10, "admin");
    }

    @Test
    public void test00984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00984");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getPassword();
        admin2.setVerified(true);
        room.Room room6 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.disableRoom(room6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
    }

    @Test
    public void test00985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00985");
        model.Admin admin2 = new model.Admin("", "hi!");
        java.lang.String str3 = admin2.getPassword();
        admin2.setVerified(false);
        java.lang.String str6 = admin2.getPassword();
        java.lang.Class<?> wildcardClass7 = admin2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test00986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00986");
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
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "admin" + "'", str12, "admin");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test00987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00987");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        admin2.logout();
        java.lang.String str5 = admin2.getAccountType();
        boolean boolean6 = admin2.isVerified();
        admin2.login("hi!", "admin");
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
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test00988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00988");
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
        room.Room room18 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.addRoom(room18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.getRoomID()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "admin" + "'", str8, "admin");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "admin" + "'", str10, "admin");
    }

    @Test
    public void test00989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00989");
        model.Admin admin2 = new model.Admin("admin", "admin");
        admin2.viewProfile();
        java.lang.String str4 = admin2.getPassword();
        admin2.login("", "");
        boolean boolean8 = admin2.isVerified();
        admin2.setVerified(true);
        admin2.setVerified(false);
        admin2.setVerified(false);
        java.lang.Class<?> wildcardClass15 = admin2.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "admin" + "'", str4, "admin");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test00990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00990");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        java.lang.String str5 = admin2.getID();
        java.lang.String str6 = admin2.getID();
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
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "admin" + "'", str6, "admin");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test00991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00991");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getAccountType();
        admin2.setVerified(false);
        admin2.login("hi!", "hi!");
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
    }

    @Test
    public void test00992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00992");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        double double5 = admin2.getHourlyRate();
        admin2.setVerified(true);
        admin2.logout();
        java.lang.String str9 = admin2.getAccountType();
        java.lang.String str10 = admin2.getAccountType();
        admin2.viewProfile();
        java.lang.Class<?> wildcardClass12 = admin2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "admin" + "'", str9, "admin");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "admin" + "'", str10, "admin");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test00993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00993");
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
        admin2.setVerified(true);
        double double20 = admin2.getHourlyRate();
        room.Room room21 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.addRoom(room21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.getRoomID()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "admin" + "'", str4, "admin");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "admin" + "'", str8, "admin");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "admin" + "'", str9, "admin");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "admin" + "'", str13, "admin");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "admin" + "'", str17, "admin");
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
    }

    @Test
    public void test00994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00994");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        admin2.logout();
        java.lang.String str5 = admin2.getAccountType();
        boolean boolean6 = admin2.isVerified();
        admin2.login("hi!", "admin");
        admin2.logout();
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
    }

    @Test
    public void test00995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00995");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        admin2.logout();
        java.lang.String str5 = admin2.getAccountType();
        admin2.login("hi!", "");
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
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test00996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00996");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        double double5 = admin2.getHourlyRate();
        double double6 = admin2.getHourlyRate();
        java.lang.String str7 = admin2.getPassword();
        admin2.logout();
        boolean boolean9 = admin2.isVerified();
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
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "admin" + "'", str10, "admin");
    }

    @Test
    public void test00997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00997");
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
        admin2.viewProfile();
        java.lang.String str20 = admin2.getEmail();
        room.Room room21 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.disableRoom(room21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test00998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00998");
        model.Admin admin2 = new model.Admin("admin", "admin");
        boolean boolean3 = admin2.isVerified();
        java.lang.String str4 = admin2.getEmail();
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
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "admin" + "'", str4, "admin");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "admin" + "'", str6, "admin");
    }

    @Test
    public void test00999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00999");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        admin2.logout();
        java.lang.String str5 = admin2.getAccountType();
        admin2.login("", "");
        java.lang.String str9 = admin2.getID();
        java.lang.String str10 = admin2.getEmail();
        java.lang.String str11 = admin2.getAccountType();
        java.lang.String str12 = admin2.getID();
        admin2.login("admin", "");
        java.lang.Class<?> wildcardClass16 = admin2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "admin" + "'", str9, "admin");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "admin" + "'", str11, "admin");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "admin" + "'", str12, "admin");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test01000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test01000");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        java.lang.String str5 = admin2.getID();
        java.lang.String str6 = admin2.getID();
        java.lang.String str7 = admin2.getAccountType();
        room.Room room8 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.enableRoom(room8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "admin" + "'", str6, "admin");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
    }
}

