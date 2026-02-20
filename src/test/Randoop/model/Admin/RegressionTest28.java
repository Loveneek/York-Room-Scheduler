import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest28 {

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
    public void test14001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14001");
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
        admin2.logout();
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
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "admin" + "'", str9, "admin");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
    }

    @Test
    public void test14002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14002");
        model.Admin admin2 = new model.Admin("admin", "admin");
        admin2.viewProfile();
        java.lang.String str4 = admin2.getPassword();
        boolean boolean5 = admin2.isVerified();
        java.lang.String str6 = admin2.getPassword();
        admin2.login("hi!", "hi!");
        admin2.logout();
        admin2.viewProfile();
        double double12 = admin2.getHourlyRate();
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
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "admin" + "'", str4, "admin");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "admin" + "'", str6, "admin");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "admin" + "'", str13, "admin");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "admin" + "'", str14, "admin");
    }

    @Test
    public void test14003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14003");
        model.Admin admin2 = new model.Admin("admin", "admin");
        admin2.login("admin", "admin");
        admin2.setVerified(false);
        boolean boolean8 = admin2.isVerified();
        boolean boolean9 = admin2.isVerified();
        java.lang.String str10 = admin2.getAccountType();
        admin2.setVerified(false);
        admin2.setVerified(false);
        admin2.setVerified(true);
        java.lang.String str17 = admin2.getPassword();
        boolean boolean18 = admin2.isVerified();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "admin" + "'", str10, "admin");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "admin" + "'", str17, "admin");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test14004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14004");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        admin2.logout();
        admin2.setVerified(false);
        java.lang.String str6 = admin2.getEmail();
        admin2.viewProfile();
        admin2.viewProfile();
        double double9 = admin2.getHourlyRate();
        admin2.setVerified(false);
        boolean boolean12 = admin2.isVerified();
        admin2.logout();
        boolean boolean14 = admin2.isVerified();
        boolean boolean15 = admin2.isVerified();
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
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test14005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14005");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        admin2.logout();
        java.lang.String str5 = admin2.getAccountType();
        boolean boolean6 = admin2.isVerified();
        java.lang.String str7 = admin2.getPassword();
        java.lang.String str8 = admin2.getEmail();
        admin2.login("hi!", "admin");
        boolean boolean12 = admin2.isVerified();
        admin2.login("", "");
        java.lang.String str16 = admin2.getAccountType();
        java.lang.String str17 = admin2.getEmail();
        admin2.setVerified(false);
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
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "admin" + "'", str16, "admin");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test14006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14006");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        double double5 = admin2.getHourlyRate();
        double double6 = admin2.getHourlyRate();
        java.lang.String str7 = admin2.getID();
        boolean boolean8 = admin2.isVerified();
        admin2.login("", "");
        admin2.login("", "hi!");
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
    }

    @Test
    public void test14007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14007");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getAccountType();
        boolean boolean4 = admin2.isVerified();
        java.lang.String str5 = admin2.getPassword();
        java.lang.String str6 = admin2.getID();
        java.lang.String str7 = admin2.getID();
        java.lang.String str8 = admin2.getPassword();
        double double9 = admin2.getHourlyRate();
        double double10 = admin2.getHourlyRate();
        java.lang.String str11 = admin2.getEmail();
        double double12 = admin2.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "admin" + "'", str6, "admin");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test14008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14008");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        admin2.logout();
        java.lang.String str5 = admin2.getAccountType();
        boolean boolean6 = admin2.isVerified();
        admin2.login("hi!", "admin");
        java.lang.String str10 = admin2.getAccountType();
        admin2.setVerified(true);
        admin2.logout();
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
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "admin" + "'", str10, "admin");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test14009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14009");
        model.Admin admin2 = new model.Admin("admin", "admin");
        admin2.login("admin", "admin");
        admin2.setVerified(false);
        java.lang.String str8 = admin2.getPassword();
        double double9 = admin2.getHourlyRate();
        java.lang.String str10 = admin2.getID();
        java.lang.String str11 = admin2.getPassword();
        double double12 = admin2.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "admin" + "'", str8, "admin");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "admin" + "'", str10, "admin");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "admin" + "'", str11, "admin");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test14010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14010");
        model.Admin admin2 = new model.Admin("admin", "admin");
        boolean boolean3 = admin2.isVerified();
        admin2.login("hi!", "");
        double double7 = admin2.getHourlyRate();
        admin2.viewProfile();
        double double9 = admin2.getHourlyRate();
        java.lang.String str10 = admin2.getPassword();
        admin2.setVerified(true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "admin" + "'", str10, "admin");
    }

    @Test
    public void test14011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14011");
        model.Admin admin2 = new model.Admin("admin", "admin");
        admin2.login("admin", "admin");
        boolean boolean6 = admin2.isVerified();
        admin2.logout();
        java.lang.String str8 = admin2.getID();
        admin2.logout();
        java.lang.String str10 = admin2.getID();
        admin2.login("hi!", "");
        admin2.login("admin", "hi!");
        boolean boolean17 = admin2.isVerified();
        admin2.login("hi!", "admin");
        admin2.setVerified(true);
        java.lang.Class<?> wildcardClass23 = admin2.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "admin" + "'", str8, "admin");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "admin" + "'", str10, "admin");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test14012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14012");
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
        boolean boolean14 = admin2.isVerified();
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
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "admin" + "'", str15, "admin");
    }

    @Test
    public void test14013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14013");
        model.Admin admin2 = new model.Admin("admin", "admin");
        boolean boolean3 = admin2.isVerified();
        admin2.login("hi!", "");
        double double7 = admin2.getHourlyRate();
        java.lang.String str8 = admin2.getID();
        double double9 = admin2.getHourlyRate();
        admin2.viewProfile();
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
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "admin" + "'", str8, "admin");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "admin" + "'", str13, "admin");
    }

    @Test
    public void test14014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14014");
        model.Admin admin2 = new model.Admin("admin", "");
        admin2.setVerified(true);
        java.lang.String str5 = admin2.getEmail();
        double double6 = admin2.getHourlyRate();
        java.lang.String str7 = admin2.getPassword();
        java.lang.String str8 = admin2.getEmail();
        java.lang.String str9 = admin2.getAccountType();
        java.lang.String str10 = admin2.getAccountType();
        admin2.setVerified(false);
        java.lang.String str13 = admin2.getAccountType();
        java.lang.String str14 = admin2.getEmail();
        java.lang.String str15 = admin2.getEmail();
        admin2.logout();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "admin" + "'", str8, "admin");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "admin" + "'", str9, "admin");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "admin" + "'", str10, "admin");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "admin" + "'", str13, "admin");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "admin" + "'", str14, "admin");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "admin" + "'", str15, "admin");
    }

    @Test
    public void test14015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14015");
        model.Admin admin2 = new model.Admin("", "admin");
        java.lang.String str3 = admin2.getEmail();
        java.lang.String str4 = admin2.getPassword();
        double double5 = admin2.getHourlyRate();
        admin2.login("hi!", "");
        java.lang.String str9 = admin2.getID();
        double double10 = admin2.getHourlyRate();
        java.lang.Class<?> wildcardClass11 = admin2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "admin" + "'", str4, "admin");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "admin" + "'", str9, "admin");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test14016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14016");
        model.Admin admin2 = new model.Admin("", "");
        java.lang.String str3 = admin2.getAccountType();
        java.lang.String str4 = admin2.getEmail();
        double double5 = admin2.getHourlyRate();
        admin2.viewProfile();
        boolean boolean7 = admin2.isVerified();
        java.lang.String str8 = admin2.getAccountType();
        boolean boolean9 = admin2.isVerified();
        admin2.viewProfile();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "admin" + "'", str8, "admin");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test14017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14017");
        model.Admin admin2 = new model.Admin("hi!", "");
        java.lang.String str3 = admin2.getEmail();
        java.lang.String str4 = admin2.getID();
        boolean boolean5 = admin2.isVerified();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "admin" + "'", str4, "admin");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test14018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14018");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        admin2.logout();
        java.lang.String str5 = admin2.getAccountType();
        admin2.viewProfile();
        admin2.setVerified(false);
        java.lang.String str9 = admin2.getEmail();
        java.lang.String str10 = admin2.getPassword();
        java.lang.String str11 = admin2.getEmail();
        admin2.setVerified(true);
        double double14 = admin2.getHourlyRate();
        java.lang.Class<?> wildcardClass15 = admin2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test14019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14019");
        model.Admin admin2 = new model.Admin("admin", "admin");
        admin2.viewProfile();
        java.lang.String str4 = admin2.getPassword();
        java.lang.String str5 = admin2.getPassword();
        admin2.setVerified(false);
        java.lang.String str8 = admin2.getID();
        admin2.setVerified(false);
        java.lang.String str11 = admin2.getEmail();
        java.lang.String str12 = admin2.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "admin" + "'", str4, "admin");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "admin" + "'", str8, "admin");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "admin" + "'", str11, "admin");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "admin" + "'", str12, "admin");
    }

    @Test
    public void test14020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14020");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        double double5 = admin2.getHourlyRate();
        admin2.setVerified(false);
        boolean boolean8 = admin2.isVerified();
        admin2.setVerified(true);
        admin2.logout();
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
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "admin" + "'", str12, "admin");
    }

    @Test
    public void test14021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14021");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        admin2.logout();
        java.lang.String str5 = admin2.getAccountType();
        java.lang.String str6 = admin2.getEmail();
        java.lang.String str7 = admin2.getPassword();
        admin2.logout();
        java.lang.String str9 = admin2.getAccountType();
        java.lang.String str10 = admin2.getPassword();
        java.lang.Class<?> wildcardClass11 = admin2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "admin" + "'", str9, "admin");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test14022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14022");
        model.Admin admin2 = new model.Admin("admin", "admin");
        admin2.login("admin", "admin");
        boolean boolean6 = admin2.isVerified();
        admin2.logout();
        java.lang.String str8 = admin2.getPassword();
        java.lang.String str9 = admin2.getID();
        admin2.login("hi!", "");
        admin2.viewProfile();
        admin2.logout();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "admin" + "'", str8, "admin");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "admin" + "'", str9, "admin");
    }

    @Test
    public void test14023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14023");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        double double5 = admin2.getHourlyRate();
        admin2.login("admin", "hi!");
        admin2.viewProfile();
        admin2.setVerified(true);
        double double12 = admin2.getHourlyRate();
        admin2.viewProfile();
        java.lang.String str14 = admin2.getID();
        java.lang.String str15 = admin2.getAccountType();
        admin2.setVerified(false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "admin" + "'", str14, "admin");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "admin" + "'", str15, "admin");
    }

    @Test
    public void test14024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14024");
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
        admin2.viewProfile();
        admin2.setVerified(false);
        admin2.logout();
        java.lang.String str19 = admin2.getAccountType();
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
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "admin" + "'", str19, "admin");
    }

    @Test
    public void test14025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14025");
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
        admin2.login("hi!", "admin");
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
    }

    @Test
    public void test14026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14026");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        double double5 = admin2.getHourlyRate();
        admin2.setVerified(true);
        admin2.logout();
        java.lang.String str9 = admin2.getAccountType();
        java.lang.String str10 = admin2.getAccountType();
        double double11 = admin2.getHourlyRate();
        admin2.viewProfile();
        java.lang.String str13 = admin2.getPassword();
        admin2.setVerified(false);
        java.lang.String str16 = admin2.getEmail();
        java.lang.String str17 = admin2.getID();
        java.lang.String str18 = admin2.getAccountType();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "admin" + "'", str9, "admin");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "admin" + "'", str10, "admin");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "admin" + "'", str17, "admin");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "admin" + "'", str18, "admin");
    }

    @Test
    public void test14027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14027");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        double double5 = admin2.getHourlyRate();
        double double6 = admin2.getHourlyRate();
        admin2.viewProfile();
        admin2.login("", "");
        admin2.logout();
        java.lang.String str12 = admin2.getEmail();
        admin2.setVerified(false);
        boolean boolean15 = admin2.isVerified();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test14028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14028");
        model.Admin admin2 = new model.Admin("admin", "");
        admin2.setVerified(true);
        boolean boolean5 = admin2.isVerified();
        java.lang.String str6 = admin2.getAccountType();
        java.lang.String str7 = admin2.getAccountType();
        java.lang.String str8 = admin2.getAccountType();
        java.lang.String str9 = admin2.getPassword();
        java.lang.String str10 = admin2.getID();
        java.lang.String str11 = admin2.getID();
        java.lang.String str12 = admin2.getID();
        admin2.login("admin", "admin");
        java.lang.String str16 = admin2.getPassword();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "admin" + "'", str6, "admin");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "admin" + "'", str8, "admin");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "admin" + "'", str10, "admin");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "admin" + "'", str11, "admin");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "admin" + "'", str12, "admin");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test14029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14029");
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
        java.lang.String str14 = admin2.getID();
        admin2.setVerified(true);
        admin2.setVerified(true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "admin" + "'", str8, "admin");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "admin" + "'", str9, "admin");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "admin" + "'", str10, "admin");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "admin" + "'", str14, "admin");
    }

    @Test
    public void test14030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14030");
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
        java.lang.String str16 = admin2.getID();
        java.lang.String str17 = admin2.getID();
        boolean boolean18 = admin2.isVerified();
        java.lang.String str19 = admin2.getEmail();
        admin2.login("admin", "admin");
        java.lang.String str23 = admin2.getEmail();
        admin2.setVerified(true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "admin" + "'", str16, "admin");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "admin" + "'", str17, "admin");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
    }

    @Test
    public void test14031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14031");
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
        admin2.login("admin", "");
        boolean boolean20 = admin2.isVerified();
        admin2.viewProfile();
        admin2.viewProfile();
        java.lang.String str23 = admin2.getEmail();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
    }

    @Test
    public void test14032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14032");
        model.Admin admin2 = new model.Admin("admin", "admin");
        boolean boolean3 = admin2.isVerified();
        admin2.login("hi!", "");
        double double7 = admin2.getHourlyRate();
        java.lang.String str8 = admin2.getID();
        boolean boolean9 = admin2.isVerified();
        java.lang.String str10 = admin2.getAccountType();
        double double11 = admin2.getHourlyRate();
        java.lang.String str12 = admin2.getEmail();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "admin" + "'", str8, "admin");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "admin" + "'", str10, "admin");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "admin" + "'", str12, "admin");
    }

    @Test
    public void test14033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14033");
        model.Admin admin2 = new model.Admin("admin", "admin");
        admin2.viewProfile();
        java.lang.String str4 = admin2.getPassword();
        admin2.login("", "");
        admin2.viewProfile();
        admin2.login("", "admin");
        java.lang.String str12 = admin2.getEmail();
        admin2.login("hi!", "hi!");
        java.lang.String str16 = admin2.getID();
        java.lang.String str17 = admin2.getAccountType();
        admin2.logout();
        java.lang.String str19 = admin2.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "admin" + "'", str4, "admin");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "admin" + "'", str12, "admin");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "admin" + "'", str16, "admin");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "admin" + "'", str17, "admin");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "admin" + "'", str19, "admin");
    }

    @Test
    public void test14034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14034");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        admin2.logout();
        java.lang.String str5 = admin2.getAccountType();
        boolean boolean6 = admin2.isVerified();
        admin2.login("hi!", "admin");
        java.lang.String str10 = admin2.getID();
        admin2.login("hi!", "");
        java.lang.String str14 = admin2.getEmail();
        admin2.setVerified(false);
        java.lang.String str17 = admin2.getEmail();
        java.lang.String str18 = admin2.getID();
        admin2.logout();
        java.lang.String str20 = admin2.getID();
        admin2.viewProfile();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "admin" + "'", str10, "admin");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "admin" + "'", str18, "admin");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "admin" + "'", str20, "admin");
    }

    @Test
    public void test14035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14035");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        admin2.logout();
        java.lang.String str5 = admin2.getAccountType();
        java.lang.String str6 = admin2.getEmail();
        java.lang.String str7 = admin2.getAccountType();
        java.lang.String str8 = admin2.getAccountType();
        java.lang.String str9 = admin2.getAccountType();
        java.lang.String str10 = admin2.getAccountType();
        boolean boolean11 = admin2.isVerified();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "admin" + "'", str8, "admin");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "admin" + "'", str9, "admin");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "admin" + "'", str10, "admin");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test14036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14036");
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
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "admin" + "'", str13, "admin");
    }

    @Test
    public void test14037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14037");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getAccountType();
        boolean boolean4 = admin2.isVerified();
        admin2.setVerified(true);
        java.lang.String str7 = admin2.getID();
        double double8 = admin2.getHourlyRate();
        java.lang.String str9 = admin2.getEmail();
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
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test14038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14038");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getAccountType();
        boolean boolean4 = admin2.isVerified();
        admin2.setVerified(false);
        admin2.viewProfile();
        admin2.login("hi!", "");
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
    }

    @Test
    public void test14039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14039");
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
        admin2.setVerified(false);
        admin2.login("hi!", "admin");
        room.Room room23 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.enableRoom(room23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test14040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14040");
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
        admin2.logout();
        admin2.viewProfile();
        admin2.logout();
        java.lang.String str21 = admin2.getPassword();
        double double22 = admin2.getHourlyRate();
        java.lang.String str23 = admin2.getPassword();
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
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
    }

    @Test
    public void test14041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14041");
        model.Admin admin2 = new model.Admin("", "admin");
        java.lang.String str3 = admin2.getEmail();
        admin2.login("admin", "admin");
        admin2.logout();
        admin2.login("admin", "");
        double double11 = admin2.getHourlyRate();
        room.Room room12 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.disableRoom(room12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test14042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14042");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        admin2.logout();
        admin2.setVerified(false);
        java.lang.String str6 = admin2.getEmail();
        admin2.viewProfile();
        admin2.viewProfile();
        double double9 = admin2.getHourlyRate();
        admin2.setVerified(true);
        admin2.viewProfile();
        boolean boolean13 = admin2.isVerified();
        java.lang.String str14 = admin2.getPassword();
        admin2.viewProfile();
        admin2.login("", "");
        double double19 = admin2.getHourlyRate();
        admin2.setVerified(true);
        admin2.setVerified(true);
        room.Room room24 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.disableRoom(room24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
    }

    @Test
    public void test14043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14043");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        double double5 = admin2.getHourlyRate();
        admin2.setVerified(true);
        admin2.setVerified(false);
        admin2.setVerified(false);
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
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test14044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14044");
        model.Admin admin2 = new model.Admin("", "");
        java.lang.String str3 = admin2.getAccountType();
        java.lang.String str4 = admin2.getEmail();
        admin2.login("hi!", "");
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
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "admin" + "'", str8, "admin");
    }

    @Test
    public void test14045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14045");
        model.Admin admin2 = new model.Admin("", "admin");
        java.lang.String str3 = admin2.getEmail();
        java.lang.String str4 = admin2.getPassword();
        double double5 = admin2.getHourlyRate();
        admin2.login("hi!", "");
        java.lang.String str9 = admin2.getAccountType();
        admin2.login("admin", "admin");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "admin" + "'", str4, "admin");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "admin" + "'", str9, "admin");
    }

    @Test
    public void test14046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14046");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        double double5 = admin2.getHourlyRate();
        double double6 = admin2.getHourlyRate();
        java.lang.String str7 = admin2.getID();
        admin2.viewProfile();
        admin2.logout();
        boolean boolean10 = admin2.isVerified();
        admin2.logout();
        admin2.login("hi!", "admin");
        java.lang.String str15 = admin2.getID();
        java.lang.String str16 = admin2.getEmail();
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
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "admin" + "'", str15, "admin");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test14047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14047");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getPassword();
        java.lang.String str4 = admin2.getID();
        java.lang.String str5 = admin2.getEmail();
        boolean boolean6 = admin2.isVerified();
        admin2.login("hi!", "admin");
        java.lang.String str10 = admin2.getPassword();
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
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "admin" + "'", str4, "admin");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "admin" + "'", str11, "admin");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test14048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14048");
        model.Admin admin2 = new model.Admin("admin", "admin");
        admin2.viewProfile();
        admin2.viewProfile();
        admin2.login("hi!", "admin");
        java.lang.String str8 = admin2.getID();
        admin2.viewProfile();
        admin2.viewProfile();
        admin2.viewProfile();
        admin2.viewProfile();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "admin" + "'", str8, "admin");
    }

    @Test
    public void test14049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14049");
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
        java.lang.String str19 = admin2.getEmail();
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
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "admin" + "'", str15, "admin");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test14050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14050");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        admin2.logout();
        java.lang.String str5 = admin2.getAccountType();
        admin2.login("", "");
        java.lang.String str9 = admin2.getID();
        java.lang.String str10 = admin2.getEmail();
        admin2.viewProfile();
        java.lang.String str12 = admin2.getAccountType();
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
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "admin" + "'", str9, "admin");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "admin" + "'", str12, "admin");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test14051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14051");
        model.Admin admin2 = new model.Admin("admin", "admin");
        admin2.login("admin", "admin");
        boolean boolean6 = admin2.isVerified();
        admin2.logout();
        java.lang.String str8 = admin2.getID();
        admin2.viewProfile();
        admin2.setVerified(false);
        admin2.login("", "admin");
        double double15 = admin2.getHourlyRate();
        double double16 = admin2.getHourlyRate();
        boolean boolean17 = admin2.isVerified();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "admin" + "'", str8, "admin");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test14052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14052");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        java.lang.String str4 = admin2.getEmail();
        admin2.logout();
        admin2.logout();
        java.lang.String str7 = admin2.getPassword();
        admin2.login("hi!", "");
        java.lang.String str11 = admin2.getID();
        java.lang.String str12 = admin2.getPassword();
        java.lang.String str13 = admin2.getEmail();
        java.lang.String str14 = admin2.getEmail();
        admin2.viewProfile();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "admin" + "'", str11, "admin");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test14053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14053");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        admin2.logout();
        java.lang.String str5 = admin2.getAccountType();
        admin2.viewProfile();
        admin2.setVerified(false);
        admin2.login("hi!", "admin");
        admin2.setVerified(false);
        java.lang.String str14 = admin2.getPassword();
        admin2.login("", "hi!");
        admin2.viewProfile();
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
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test14054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14054");
        model.Admin admin2 = new model.Admin("", "");
        java.lang.String str3 = admin2.getAccountType();
        java.lang.String str4 = admin2.getEmail();
        java.lang.String str5 = admin2.getID();
        double double6 = admin2.getHourlyRate();
        java.lang.String str7 = admin2.getAccountType();
        admin2.setVerified(false);
        boolean boolean10 = admin2.isVerified();
        java.lang.String str11 = admin2.getPassword();
        java.lang.String str12 = admin2.getEmail();
        java.lang.String str13 = admin2.getID();
        admin2.viewProfile();
        room.Room room15 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.enableRoom(room15);
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
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "admin" + "'", str13, "admin");
    }

    @Test
    public void test14055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14055");
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
        java.lang.String str12 = admin2.getPassword();
        admin2.setVerified(false);
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
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test14056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14056");
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
        java.lang.String str16 = admin2.getID();
        admin2.login("admin", "hi!");
        admin2.logout();
        room.Room room21 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.addRoom(room21);
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
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "admin" + "'", str16, "admin");
    }

    @Test
    public void test14057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14057");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getAccountType();
        boolean boolean4 = admin2.isVerified();
        java.lang.String str5 = admin2.getPassword();
        admin2.logout();
        admin2.login("", "");
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
    }

    @Test
    public void test14058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14058");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getAccountType();
        boolean boolean4 = admin2.isVerified();
        java.lang.String str5 = admin2.getPassword();
        admin2.logout();
        java.lang.String str7 = admin2.getPassword();
        admin2.viewProfile();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test14059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14059");
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
        admin2.logout();
        admin2.logout();
        admin2.viewProfile();
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
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "admin" + "'", str9, "admin");
    }

    @Test
    public void test14060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14060");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        admin2.logout();
        java.lang.String str4 = admin2.getAccountType();
        java.lang.String str5 = admin2.getAccountType();
        boolean boolean6 = admin2.isVerified();
        java.lang.String str7 = admin2.getEmail();
        admin2.login("admin", "admin");
        java.lang.String str11 = admin2.getAccountType();
        admin2.login("hi!", "");
        java.lang.String str15 = admin2.getEmail();
        java.lang.String str16 = admin2.getEmail();
        java.lang.String str17 = admin2.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "admin" + "'", str4, "admin");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "admin" + "'", str11, "admin");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test14061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14061");
        model.Admin admin2 = new model.Admin("admin", "hi!");
        java.lang.String str3 = admin2.getPassword();
        java.lang.String str4 = admin2.getEmail();
        java.lang.String str5 = admin2.getEmail();
        admin2.viewProfile();
        java.lang.String str7 = admin2.getEmail();
        room.Room room8 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.enableRoom(room8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "admin" + "'", str4, "admin");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
    }

    @Test
    public void test14062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14062");
        model.Admin admin2 = new model.Admin("admin", "admin");
        admin2.viewProfile();
        java.lang.String str4 = admin2.getPassword();
        admin2.login("", "");
        java.lang.String str8 = admin2.getEmail();
        java.lang.String str9 = admin2.getAccountType();
        admin2.login("", "");
        java.lang.String str13 = admin2.getAccountType();
        double double14 = admin2.getHourlyRate();
        boolean boolean15 = admin2.isVerified();
        java.lang.String str16 = admin2.getEmail();
        boolean boolean17 = admin2.isVerified();
        admin2.viewProfile();
        java.lang.String str19 = admin2.getID();
        java.lang.String str20 = admin2.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "admin" + "'", str4, "admin");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "admin" + "'", str8, "admin");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "admin" + "'", str9, "admin");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "admin" + "'", str13, "admin");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "admin" + "'", str16, "admin");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "admin" + "'", str19, "admin");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "admin" + "'", str20, "admin");
    }

    @Test
    public void test14063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14063");
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
        java.lang.String str20 = admin2.getID();
        java.lang.String str21 = admin2.getEmail();
        double double22 = admin2.getHourlyRate();
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
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "admin" + "'", str19, "admin");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "admin" + "'", str20, "admin");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
    }

    @Test
    public void test14064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14064");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        java.lang.String str5 = admin2.getID();
        java.lang.String str6 = admin2.getID();
        admin2.logout();
        java.lang.String str8 = admin2.getID();
        boolean boolean9 = admin2.isVerified();
        java.lang.String str10 = admin2.getEmail();
        boolean boolean11 = admin2.isVerified();
        java.lang.String str12 = admin2.getID();
        admin2.viewProfile();
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
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "admin" + "'", str6, "admin");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "admin" + "'", str8, "admin");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "admin" + "'", str12, "admin");
    }

    @Test
    public void test14065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14065");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        double double5 = admin2.getHourlyRate();
        double double6 = admin2.getHourlyRate();
        java.lang.String str7 = admin2.getPassword();
        admin2.setVerified(true);
        boolean boolean10 = admin2.isVerified();
        java.lang.String str11 = admin2.getEmail();
        java.lang.String str12 = admin2.getAccountType();
        java.lang.String str13 = admin2.getPassword();
        admin2.viewProfile();
        java.lang.String str15 = admin2.getPassword();
        admin2.logout();
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
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "admin" + "'", str12, "admin");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test14066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14066");
        model.Admin admin2 = new model.Admin("admin", "");
        admin2.setVerified(true);
        java.lang.String str5 = admin2.getEmail();
        java.lang.String str6 = admin2.getEmail();
        java.lang.String str7 = admin2.getEmail();
        admin2.logout();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "admin" + "'", str6, "admin");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
    }

    @Test
    public void test14067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14067");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        java.lang.String str4 = admin2.getEmail();
        boolean boolean5 = admin2.isVerified();
        admin2.logout();
        admin2.logout();
        boolean boolean8 = admin2.isVerified();
        double double9 = admin2.getHourlyRate();
        admin2.logout();
        admin2.viewProfile();
        java.lang.String str12 = admin2.getID();
        java.lang.String str13 = admin2.getPassword();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "admin" + "'", str12, "admin");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test14068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14068");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        java.lang.String str4 = admin2.getPassword();
        java.lang.String str5 = admin2.getAccountType();
        admin2.viewProfile();
        double double7 = admin2.getHourlyRate();
        java.lang.String str8 = admin2.getID();
        java.lang.String str9 = admin2.getAccountType();
        admin2.viewProfile();
        double double11 = admin2.getHourlyRate();
        boolean boolean12 = admin2.isVerified();
        admin2.login("hi!", "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "admin" + "'", str8, "admin");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "admin" + "'", str9, "admin");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test14069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14069");
        model.Admin admin2 = new model.Admin("", "");
        java.lang.String str3 = admin2.getAccountType();
        java.lang.String str4 = admin2.getEmail();
        java.lang.String str5 = admin2.getID();
        double double6 = admin2.getHourlyRate();
        java.lang.String str7 = admin2.getAccountType();
        double double8 = admin2.getHourlyRate();
        java.lang.String str9 = admin2.getEmail();
        admin2.viewProfile();
        admin2.setVerified(false);
        java.lang.String str13 = admin2.getEmail();
        admin2.setVerified(true);
        java.lang.String str16 = admin2.getPassword();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test14070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14070");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        admin2.logout();
        java.lang.String str5 = admin2.getAccountType();
        admin2.viewProfile();
        admin2.login("hi!", "admin");
        java.lang.String str10 = admin2.getAccountType();
        boolean boolean11 = admin2.isVerified();
        boolean boolean12 = admin2.isVerified();
        admin2.login("", "admin");
        admin2.setVerified(false);
        admin2.viewProfile();
        admin2.viewProfile();
        double double20 = admin2.getHourlyRate();
        admin2.setVerified(true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "admin" + "'", str10, "admin");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
    }

    @Test
    public void test14071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14071");
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
        java.lang.String str17 = admin2.getID();
        admin2.viewProfile();
        java.lang.String str19 = admin2.getAccountType();
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
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "admin" + "'", str17, "admin");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "admin" + "'", str19, "admin");
    }

    @Test
    public void test14072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14072");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        java.lang.String str5 = admin2.getAccountType();
        java.lang.String str6 = admin2.getEmail();
        java.lang.String str7 = admin2.getEmail();
        admin2.login("", "admin");
        boolean boolean11 = admin2.isVerified();
        admin2.login("hi!", "");
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
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test14073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14073");
        model.Admin admin2 = new model.Admin("", "");
        java.lang.String str3 = admin2.getAccountType();
        admin2.setVerified(true);
        java.lang.String str6 = admin2.getAccountType();
        admin2.logout();
        double double8 = admin2.getHourlyRate();
        java.lang.String str9 = admin2.getPassword();
        admin2.login("hi!", "hi!");
        admin2.login("", "");
        java.lang.String str16 = admin2.getAccountType();
        boolean boolean17 = admin2.isVerified();
        java.lang.String str18 = admin2.getPassword();
        admin2.login("admin", "hi!");
        room.Room room22 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.enableRoom(room22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "admin" + "'", str6, "admin");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "admin" + "'", str16, "admin");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test14074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14074");
        model.Admin admin2 = new model.Admin("", "");
        java.lang.String str3 = admin2.getAccountType();
        java.lang.String str4 = admin2.getEmail();
        double double5 = admin2.getHourlyRate();
        java.lang.String str6 = admin2.getEmail();
        boolean boolean7 = admin2.isVerified();
        admin2.setVerified(true);
        admin2.setVerified(true);
        java.lang.String str12 = admin2.getPassword();
        admin2.viewProfile();
        admin2.setVerified(false);
        boolean boolean16 = admin2.isVerified();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test14075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14075");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        admin2.logout();
        java.lang.String str4 = admin2.getAccountType();
        admin2.viewProfile();
        admin2.logout();
        java.lang.String str7 = admin2.getAccountType();
        java.lang.String str8 = admin2.getID();
        java.lang.String str9 = admin2.getID();
        boolean boolean10 = admin2.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "admin" + "'", str4, "admin");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "admin" + "'", str8, "admin");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "admin" + "'", str9, "admin");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test14076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14076");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        admin2.logout();
        java.lang.String str5 = admin2.getAccountType();
        boolean boolean6 = admin2.isVerified();
        admin2.login("hi!", "");
        java.lang.String str10 = admin2.getEmail();
        double double11 = admin2.getHourlyRate();
        java.lang.String str12 = admin2.getAccountType();
        admin2.login("", "hi!");
        admin2.logout();
        admin2.login("", "hi!");
        boolean boolean20 = admin2.isVerified();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "admin" + "'", str12, "admin");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test14077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14077");
        model.Admin admin2 = new model.Admin("admin", "admin");
        admin2.login("admin", "admin");
        java.lang.String str6 = admin2.getAccountType();
        admin2.viewProfile();
        java.lang.String str8 = admin2.getPassword();
        admin2.setVerified(false);
        admin2.viewProfile();
        java.lang.String str12 = admin2.getID();
        boolean boolean13 = admin2.isVerified();
        room.Room room14 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.enableRoom(room14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "admin" + "'", str6, "admin");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "admin" + "'", str8, "admin");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "admin" + "'", str12, "admin");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test14078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14078");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        java.lang.String str4 = admin2.getAccountType();
        java.lang.String str5 = admin2.getPassword();
        boolean boolean6 = admin2.isVerified();
        admin2.setVerified(true);
        java.lang.String str9 = admin2.getEmail();
        java.lang.String str10 = admin2.getAccountType();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "admin" + "'", str4, "admin");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "admin" + "'", str10, "admin");
    }

    @Test
    public void test14079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14079");
        model.Admin admin2 = new model.Admin("admin", "");
        admin2.logout();
        admin2.viewProfile();
        admin2.viewProfile();
        admin2.logout();
        boolean boolean7 = admin2.isVerified();
        java.lang.String str8 = admin2.getAccountType();
        admin2.login("admin", "admin");
        java.lang.String str12 = admin2.getEmail();
        java.lang.String str13 = admin2.getID();
        double double14 = admin2.getHourlyRate();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "admin" + "'", str8, "admin");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "admin" + "'", str12, "admin");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "admin" + "'", str13, "admin");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test14080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14080");
        model.Admin admin2 = new model.Admin("admin", "admin");
        admin2.login("admin", "admin");
        boolean boolean6 = admin2.isVerified();
        admin2.logout();
        java.lang.String str8 = admin2.getID();
        admin2.setVerified(true);
        admin2.setVerified(true);
        double double13 = admin2.getHourlyRate();
        admin2.login("hi!", "");
        admin2.viewProfile();
        admin2.viewProfile();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "admin" + "'", str8, "admin");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test14081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14081");
        model.Admin admin2 = new model.Admin("admin", "");
        admin2.setVerified(true);
        java.lang.String str5 = admin2.getAccountType();
        boolean boolean6 = admin2.isVerified();
        java.lang.String str7 = admin2.getPassword();
        java.lang.String str8 = admin2.getAccountType();
        admin2.viewProfile();
        java.lang.String str10 = admin2.getID();
        java.lang.Class<?> wildcardClass11 = admin2.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "admin" + "'", str8, "admin");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "admin" + "'", str10, "admin");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test14082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14082");
        model.Admin admin2 = new model.Admin("hi!", "admin");
        admin2.viewProfile();
        double double4 = admin2.getHourlyRate();
        java.lang.String str5 = admin2.getEmail();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test14083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14083");
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
        boolean boolean15 = admin2.isVerified();
        admin2.viewProfile();
        admin2.setVerified(false);
        java.lang.String str19 = admin2.getEmail();
        java.lang.String str20 = admin2.getEmail();
        admin2.viewProfile();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "admin" + "'", str11, "admin");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "admin" + "'", str12, "admin");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "admin" + "'", str14, "admin");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test14084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14084");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getAccountType();
        java.lang.String str4 = admin2.getPassword();
        admin2.setVerified(true);
        java.lang.String str7 = admin2.getID();
        java.lang.String str8 = admin2.getEmail();
        java.lang.String str9 = admin2.getPassword();
        admin2.logout();
        boolean boolean11 = admin2.isVerified();
        java.lang.Class<?> wildcardClass12 = admin2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test14085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14085");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        admin2.logout();
        java.lang.String str5 = admin2.getAccountType();
        boolean boolean6 = admin2.isVerified();
        admin2.login("hi!", "");
        java.lang.String str10 = admin2.getEmail();
        java.lang.String str11 = admin2.getAccountType();
        admin2.viewProfile();
        admin2.login("admin", "hi!");
        admin2.logout();
        java.lang.String str17 = admin2.getEmail();
        admin2.logout();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "admin" + "'", str11, "admin");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test14086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14086");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        admin2.logout();
        java.lang.String str5 = admin2.getAccountType();
        boolean boolean6 = admin2.isVerified();
        java.lang.String str7 = admin2.getAccountType();
        java.lang.String str8 = admin2.getAccountType();
        admin2.setVerified(false);
        java.lang.String str11 = admin2.getAccountType();
        admin2.login("", "admin");
        java.lang.String str15 = admin2.getPassword();
        admin2.setVerified(false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "admin" + "'", str8, "admin");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "admin" + "'", str11, "admin");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test14087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14087");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        admin2.logout();
        java.lang.String str5 = admin2.getID();
        admin2.viewProfile();
        admin2.logout();
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
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
    }

    @Test
    public void test14088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14088");
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
        admin2.login("admin", "hi!");
        java.lang.String str17 = admin2.getID();
        java.lang.String str18 = admin2.getID();
        admin2.logout();
        admin2.login("", "admin");
        java.lang.String str23 = admin2.getAccountType();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "admin" + "'", str17, "admin");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "admin" + "'", str18, "admin");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "admin" + "'", str23, "admin");
    }

    @Test
    public void test14089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14089");
        model.Admin admin2 = new model.Admin("admin", "");
        admin2.setVerified(true);
        java.lang.String str5 = admin2.getEmail();
        double double6 = admin2.getHourlyRate();
        double double7 = admin2.getHourlyRate();
        admin2.setVerified(false);
        admin2.setVerified(true);
        admin2.logout();
        java.lang.String str13 = admin2.getID();
        boolean boolean14 = admin2.isVerified();
        java.lang.String str15 = admin2.getPassword();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "admin" + "'", str13, "admin");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test14090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14090");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        java.lang.String str4 = admin2.getAccountType();
        java.lang.String str5 = admin2.getPassword();
        admin2.setVerified(true);
        double double8 = admin2.getHourlyRate();
        java.lang.String str9 = admin2.getAccountType();
        java.lang.String str10 = admin2.getID();
        java.lang.String str11 = admin2.getID();
        admin2.login("", "admin");
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
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "admin" + "'", str4, "admin");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "admin" + "'", str9, "admin");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "admin" + "'", str10, "admin");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "admin" + "'", str11, "admin");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "admin" + "'", str15, "admin");
    }

    @Test
    public void test14091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14091");
        model.Admin admin2 = new model.Admin("", "");
        java.lang.String str3 = admin2.getAccountType();
        java.lang.String str4 = admin2.getEmail();
        java.lang.String str5 = admin2.getID();
        double double6 = admin2.getHourlyRate();
        java.lang.String str7 = admin2.getAccountType();
        double double8 = admin2.getHourlyRate();
        java.lang.String str9 = admin2.getAccountType();
        admin2.logout();
        admin2.setVerified(true);
        java.lang.String str13 = admin2.getEmail();
        java.lang.String str14 = admin2.getID();
        java.lang.String str15 = admin2.getEmail();
        admin2.logout();
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
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "admin" + "'", str9, "admin");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "admin" + "'", str14, "admin");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
    }

    @Test
    public void test14092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14092");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        java.lang.String str4 = admin2.getEmail();
        admin2.logout();
        admin2.logout();
        java.lang.String str7 = admin2.getPassword();
        admin2.viewProfile();
        java.lang.String str9 = admin2.getID();
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
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "admin" + "'", str9, "admin");
    }

    @Test
    public void test14093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14093");
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
        java.lang.String str14 = admin2.getID();
        java.lang.String str15 = admin2.getAccountType();
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
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "admin" + "'", str13, "admin");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "admin" + "'", str14, "admin");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "admin" + "'", str15, "admin");
    }

    @Test
    public void test14094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14094");
        model.Admin admin2 = new model.Admin("admin", "admin");
        admin2.viewProfile();
        java.lang.String str4 = admin2.getID();
        java.lang.String str5 = admin2.getAccountType();
        java.lang.String str6 = admin2.getEmail();
        admin2.viewProfile();
        admin2.setVerified(false);
        java.lang.String str10 = admin2.getAccountType();
        double double11 = admin2.getHourlyRate();
        admin2.login("admin", "hi!");
        double double15 = admin2.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "admin" + "'", str4, "admin");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "admin" + "'", str6, "admin");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "admin" + "'", str10, "admin");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test14095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14095");
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
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "admin" + "'", str6, "admin");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test14096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14096");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        admin2.logout();
        java.lang.String str5 = admin2.getAccountType();
        admin2.viewProfile();
        admin2.login("hi!", "admin");
        double double10 = admin2.getHourlyRate();
        admin2.viewProfile();
        java.lang.String str12 = admin2.getEmail();
        admin2.logout();
        admin2.login("admin", "");
        admin2.viewProfile();
        admin2.setVerified(true);
        boolean boolean20 = admin2.isVerified();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test14097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14097");
        model.Admin admin2 = new model.Admin("", "admin");
        java.lang.String str3 = admin2.getEmail();
        admin2.viewProfile();
        java.lang.String str5 = admin2.getAccountType();
        java.lang.String str6 = admin2.getAccountType();
        admin2.setVerified(false);
        java.lang.String str9 = admin2.getEmail();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "admin" + "'", str6, "admin");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test14098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14098");
        model.Admin admin2 = new model.Admin("hi!", "admin");
        java.lang.String str3 = admin2.getID();
        admin2.setVerified(true);
        admin2.logout();
        java.lang.String str7 = admin2.getAccountType();
        java.lang.String str8 = admin2.getAccountType();
        double double9 = admin2.getHourlyRate();
        java.lang.String str10 = admin2.getAccountType();
        double double11 = admin2.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "admin" + "'", str8, "admin");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "admin" + "'", str10, "admin");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test14099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14099");
        model.Admin admin2 = new model.Admin("admin", "admin");
        admin2.viewProfile();
        java.lang.String str4 = admin2.getID();
        java.lang.String str5 = admin2.getPassword();
        admin2.viewProfile();
        admin2.logout();
        java.lang.String str8 = admin2.getAccountType();
        boolean boolean9 = admin2.isVerified();
        java.lang.String str10 = admin2.getID();
        java.lang.String str11 = admin2.getAccountType();
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
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "admin" + "'", str10, "admin");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "admin" + "'", str11, "admin");
    }

    @Test
    public void test14100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14100");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        double double5 = admin2.getHourlyRate();
        double double6 = admin2.getHourlyRate();
        java.lang.String str7 = admin2.getPassword();
        double double8 = admin2.getHourlyRate();
        admin2.logout();
        java.lang.String str10 = admin2.getPassword();
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
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "admin" + "'", str11, "admin");
    }

    @Test
    public void test14101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14101");
        model.Admin admin2 = new model.Admin("hi!", "admin");
        java.lang.String str3 = admin2.getID();
        admin2.setVerified(false);
        admin2.viewProfile();
        admin2.viewProfile();
        double double8 = admin2.getHourlyRate();
        admin2.setVerified(true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test14102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14102");
        model.Admin admin2 = new model.Admin("", "");
        java.lang.String str3 = admin2.getAccountType();
        java.lang.String str4 = admin2.getEmail();
        java.lang.String str5 = admin2.getID();
        double double6 = admin2.getHourlyRate();
        java.lang.String str7 = admin2.getAccountType();
        double double8 = admin2.getHourlyRate();
        java.lang.String str9 = admin2.getEmail();
        admin2.viewProfile();
        admin2.setVerified(false);
        java.lang.String str13 = admin2.getID();
        java.lang.String str14 = admin2.getID();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "admin" + "'", str13, "admin");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "admin" + "'", str14, "admin");
    }

    @Test
    public void test14103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14103");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        double double5 = admin2.getHourlyRate();
        admin2.setVerified(true);
        double double8 = admin2.getHourlyRate();
        double double9 = admin2.getHourlyRate();
        java.lang.String str10 = admin2.getPassword();
        admin2.logout();
        java.lang.String str12 = admin2.getEmail();
        java.lang.String str13 = admin2.getAccountType();
        double double14 = admin2.getHourlyRate();
        admin2.setVerified(true);
        java.lang.String str17 = admin2.getAccountType();
        admin2.setVerified(true);
        double double20 = admin2.getHourlyRate();
        java.lang.String str21 = admin2.getPassword();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "admin" + "'", str13, "admin");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "admin" + "'", str17, "admin");
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
    }

    @Test
    public void test14104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14104");
        model.Admin admin2 = new model.Admin("admin", "admin");
        admin2.viewProfile();
        java.lang.String str4 = admin2.getPassword();
        double double5 = admin2.getHourlyRate();
        java.lang.String str6 = admin2.getAccountType();
        admin2.viewProfile();
        admin2.login("hi!", "hi!");
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
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "admin" + "'", str4, "admin");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "admin" + "'", str6, "admin");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "admin" + "'", str11, "admin");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test14105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14105");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getAccountType();
        boolean boolean4 = admin2.isVerified();
        admin2.setVerified(false);
        admin2.login("hi!", "");
        double double10 = admin2.getHourlyRate();
        admin2.setVerified(false);
        boolean boolean13 = admin2.isVerified();
        java.lang.String str14 = admin2.getEmail();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test14106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14106");
        model.Admin admin2 = new model.Admin("admin", "admin");
        admin2.viewProfile();
        java.lang.String str4 = admin2.getPassword();
        double double5 = admin2.getHourlyRate();
        java.lang.String str6 = admin2.getAccountType();
        boolean boolean7 = admin2.isVerified();
        admin2.viewProfile();
        java.lang.String str9 = admin2.getID();
        admin2.setVerified(false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "admin" + "'", str4, "admin");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "admin" + "'", str6, "admin");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "admin" + "'", str9, "admin");
    }

    @Test
    public void test14107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14107");
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
        admin2.logout();
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
    public void test14108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14108");
        model.Admin admin2 = new model.Admin("", "hi!");
        java.lang.String str3 = admin2.getPassword();
        admin2.setVerified(false);
        java.lang.String str6 = admin2.getPassword();
        boolean boolean7 = admin2.isVerified();
        java.lang.String str8 = admin2.getID();
        admin2.setVerified(false);
        admin2.login("admin", "hi!");
        admin2.login("", "");
        double double17 = admin2.getHourlyRate();
        java.lang.String str18 = admin2.getAccountType();
        room.Room room19 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.addRoom(room19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.getRoomID()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "admin" + "'", str8, "admin");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "admin" + "'", str18, "admin");
    }

    @Test
    public void test14109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14109");
        model.Admin admin2 = new model.Admin("", "");
        java.lang.String str3 = admin2.getAccountType();
        admin2.setVerified(true);
        double double6 = admin2.getHourlyRate();
        admin2.viewProfile();
        boolean boolean8 = admin2.isVerified();
        java.lang.String str9 = admin2.getEmail();
        admin2.logout();
        admin2.setVerified(false);
        admin2.setVerified(false);
        java.lang.String str15 = admin2.getEmail();
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
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test14110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14110");
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
        double double17 = admin2.getHourlyRate();
        admin2.login("hi!", "admin");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "admin" + "'", str10, "admin");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
    }

    @Test
    public void test14111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14111");
        model.Admin admin2 = new model.Admin("", "");
        java.lang.String str3 = admin2.getAccountType();
        boolean boolean4 = admin2.isVerified();
        admin2.setVerified(false);
        boolean boolean7 = admin2.isVerified();
        boolean boolean8 = admin2.isVerified();
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
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test14112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14112");
        model.Admin admin2 = new model.Admin("admin", "admin");
        admin2.viewProfile();
        java.lang.String str4 = admin2.getID();
        java.lang.String str5 = admin2.getPassword();
        admin2.viewProfile();
        admin2.logout();
        java.lang.String str8 = admin2.getAccountType();
        java.lang.String str9 = admin2.getAccountType();
        boolean boolean10 = admin2.isVerified();
        java.lang.String str11 = admin2.getPassword();
        java.lang.String str12 = admin2.getEmail();
        boolean boolean13 = admin2.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "admin" + "'", str4, "admin");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "admin" + "'", str8, "admin");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "admin" + "'", str9, "admin");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "admin" + "'", str11, "admin");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "admin" + "'", str12, "admin");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test14113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14113");
        model.Admin admin2 = new model.Admin("admin", "");
        admin2.setVerified(true);
        admin2.logout();
        double double6 = admin2.getHourlyRate();
        java.lang.String str7 = admin2.getID();
        java.lang.String str8 = admin2.getAccountType();
        double double9 = admin2.getHourlyRate();
        admin2.setVerified(false);
        boolean boolean12 = admin2.isVerified();
        admin2.setVerified(false);
        room.Room room15 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.addRoom(room15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.getRoomID()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "admin" + "'", str8, "admin");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test14114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14114");
        model.Admin admin2 = new model.Admin("", "");
        java.lang.String str3 = admin2.getAccountType();
        java.lang.String str4 = admin2.getEmail();
        java.lang.String str5 = admin2.getID();
        double double6 = admin2.getHourlyRate();
        java.lang.String str7 = admin2.getAccountType();
        admin2.setVerified(false);
        java.lang.String str10 = admin2.getID();
        admin2.viewProfile();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "admin" + "'", str10, "admin");
    }

    @Test
    public void test14115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14115");
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
        admin2.logout();
        admin2.login("", "hi!");
        java.lang.String str24 = admin2.getPassword();
        java.lang.String str25 = admin2.getPassword();
        admin2.login("admin", "");
        admin2.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "admin" + "'", str4, "admin");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "admin" + "'", str8, "admin");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "admin" + "'", str9, "admin");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "admin" + "'", str13, "admin");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "admin" + "'", str17, "admin");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "admin" + "'", str24, "admin");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "admin" + "'", str25, "admin");
    }

    @Test
    public void test14116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14116");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        double double5 = admin2.getHourlyRate();
        double double6 = admin2.getHourlyRate();
        java.lang.String str7 = admin2.getPassword();
        admin2.setVerified(true);
        boolean boolean10 = admin2.isVerified();
        java.lang.String str11 = admin2.getEmail();
        java.lang.String str12 = admin2.getEmail();
        admin2.login("hi!", "hi!");
        java.lang.String str16 = admin2.getAccountType();
        admin2.login("hi!", "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "admin" + "'", str16, "admin");
    }

    @Test
    public void test14117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14117");
        model.Admin admin2 = new model.Admin("admin", "admin");
        admin2.login("admin", "admin");
        boolean boolean6 = admin2.isVerified();
        admin2.logout();
        java.lang.String str8 = admin2.getID();
        admin2.setVerified(true);
        admin2.setVerified(true);
        boolean boolean13 = admin2.isVerified();
        java.lang.String str14 = admin2.getPassword();
        java.lang.String str15 = admin2.getEmail();
        java.lang.String str16 = admin2.getAccountType();
        java.lang.String str17 = admin2.getPassword();
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
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "admin" + "'", str14, "admin");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "admin" + "'", str15, "admin");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "admin" + "'", str16, "admin");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "admin" + "'", str17, "admin");
    }

    @Test
    public void test14118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14118");
        model.Admin admin2 = new model.Admin("admin", "admin");
        admin2.viewProfile();
        java.lang.String str4 = admin2.getID();
        java.lang.String str5 = admin2.getAccountType();
        java.lang.String str6 = admin2.getEmail();
        admin2.viewProfile();
        admin2.setVerified(false);
        java.lang.String str10 = admin2.getAccountType();
        double double11 = admin2.getHourlyRate();
        admin2.login("admin", "hi!");
        java.lang.Class<?> wildcardClass15 = admin2.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "admin" + "'", str4, "admin");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "admin" + "'", str6, "admin");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "admin" + "'", str10, "admin");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test14119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14119");
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
        java.lang.String str13 = admin2.getPassword();
        boolean boolean14 = admin2.isVerified();
        admin2.login("", "hi!");
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
    public void test14120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14120");
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
        java.lang.String str13 = admin2.getEmail();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test14121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14121");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        admin2.logout();
        java.lang.String str5 = admin2.getAccountType();
        java.lang.String str6 = admin2.getEmail();
        java.lang.String str7 = admin2.getPassword();
        java.lang.String str8 = admin2.getAccountType();
        admin2.login("admin", "admin");
        boolean boolean12 = admin2.isVerified();
        admin2.logout();
        admin2.logout();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "admin" + "'", str8, "admin");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test14122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14122");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getAccountType();
        boolean boolean4 = admin2.isVerified();
        admin2.setVerified(false);
        admin2.viewProfile();
        admin2.login("admin", "hi!");
        admin2.logout();
        java.lang.String str12 = admin2.getPassword();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test14123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14123");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        java.lang.String str4 = admin2.getPassword();
        java.lang.String str5 = admin2.getAccountType();
        admin2.viewProfile();
        double double7 = admin2.getHourlyRate();
        java.lang.String str8 = admin2.getID();
        java.lang.String str9 = admin2.getAccountType();
        admin2.logout();
        admin2.logout();
        admin2.login("hi!", "");
        java.lang.String str15 = admin2.getAccountType();
        double double16 = admin2.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "admin" + "'", str8, "admin");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "admin" + "'", str9, "admin");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "admin" + "'", str15, "admin");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
    }

    @Test
    public void test14124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14124");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getAccountType();
        java.lang.String str4 = admin2.getAccountType();
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
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "admin" + "'", str4, "admin");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test14125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14125");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        double double5 = admin2.getHourlyRate();
        admin2.setVerified(false);
        java.lang.String str8 = admin2.getID();
        java.lang.String str9 = admin2.getPassword();
        admin2.viewProfile();
        java.lang.String str11 = admin2.getEmail();
        java.lang.String str12 = admin2.getEmail();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "admin" + "'", str8, "admin");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test14126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14126");
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
        boolean boolean15 = admin2.isVerified();
        boolean boolean16 = admin2.isVerified();
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
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test14127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14127");
        model.Admin admin2 = new model.Admin("admin", "admin");
        admin2.viewProfile();
        java.lang.String str4 = admin2.getPassword();
        admin2.login("", "");
        java.lang.String str8 = admin2.getEmail();
        java.lang.String str9 = admin2.getID();
        admin2.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "admin" + "'", str4, "admin");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "admin" + "'", str8, "admin");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "admin" + "'", str9, "admin");
    }

    @Test
    public void test14128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14128");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        java.lang.String str4 = admin2.getAccountType();
        java.lang.String str5 = admin2.getPassword();
        admin2.setVerified(true);
        admin2.login("", "");
        admin2.login("admin", "admin");
        double double14 = admin2.getHourlyRate();
        java.lang.String str15 = admin2.getEmail();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "admin" + "'", str4, "admin");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test14129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14129");
        model.Admin admin2 = new model.Admin("", "admin");
        java.lang.String str3 = admin2.getEmail();
        java.lang.String str4 = admin2.getPassword();
        admin2.logout();
        double double6 = admin2.getHourlyRate();
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
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test14130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14130");
        model.Admin admin2 = new model.Admin("admin", "admin");
        admin2.viewProfile();
        java.lang.String str4 = admin2.getPassword();
        admin2.login("", "");
        java.lang.String str8 = admin2.getEmail();
        java.lang.String str9 = admin2.getAccountType();
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
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "admin" + "'", str8, "admin");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "admin" + "'", str9, "admin");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "admin" + "'", str10, "admin");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "admin" + "'", str11, "admin");
    }

    @Test
    public void test14131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14131");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        java.lang.String str5 = admin2.getID();
        admin2.setVerified(false);
        double double8 = admin2.getHourlyRate();
        admin2.viewProfile();
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
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test14132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14132");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        double double5 = admin2.getHourlyRate();
        double double6 = admin2.getHourlyRate();
        java.lang.String str7 = admin2.getPassword();
        admin2.setVerified(true);
        java.lang.String str10 = admin2.getAccountType();
        java.lang.String str11 = admin2.getEmail();
        admin2.login("admin", "hi!");
        java.lang.String str15 = admin2.getPassword();
        java.lang.String str16 = admin2.getID();
        java.lang.String str17 = admin2.getAccountType();
        admin2.logout();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "admin" + "'", str10, "admin");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "admin" + "'", str16, "admin");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "admin" + "'", str17, "admin");
    }

    @Test
    public void test14133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14133");
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
        admin2.viewProfile();
        admin2.logout();
        double double20 = admin2.getHourlyRate();
        admin2.setVerified(true);
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
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
    }

    @Test
    public void test14134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14134");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        admin2.logout();
        java.lang.String str5 = admin2.getAccountType();
        boolean boolean6 = admin2.isVerified();
        admin2.login("hi!", "admin");
        boolean boolean10 = admin2.isVerified();
        admin2.setVerified(false);
        java.lang.String str13 = admin2.getAccountType();
        boolean boolean14 = admin2.isVerified();
        double double15 = admin2.getHourlyRate();
        java.lang.String str16 = admin2.getID();
        java.lang.String str17 = admin2.getEmail();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "admin" + "'", str13, "admin");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "admin" + "'", str16, "admin");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test14135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14135");
        model.Admin admin2 = new model.Admin("admin", "");
        admin2.setVerified(true);
        java.lang.String str5 = admin2.getAccountType();
        java.lang.String str6 = admin2.getAccountType();
        boolean boolean7 = admin2.isVerified();
        boolean boolean8 = admin2.isVerified();
        room.Room room9 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.disableRoom(room9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "admin" + "'", str6, "admin");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test14136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14136");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        java.lang.String str5 = admin2.getID();
        admin2.setVerified(false);
        java.lang.String str8 = admin2.getPassword();
        admin2.logout();
        admin2.setVerified(true);
        admin2.setVerified(true);
        java.lang.String str14 = admin2.getAccountType();
        admin2.setVerified(true);
        admin2.login("", "admin");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "admin" + "'", str14, "admin");
    }

    @Test
    public void test14137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14137");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        java.lang.String str5 = admin2.getID();
        java.lang.String str6 = admin2.getID();
        admin2.logout();
        java.lang.String str8 = admin2.getID();
        boolean boolean9 = admin2.isVerified();
        admin2.logout();
        double double11 = admin2.getHourlyRate();
        admin2.viewProfile();
        double double13 = admin2.getHourlyRate();
        java.lang.String str14 = admin2.getPassword();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "admin" + "'", str6, "admin");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "admin" + "'", str8, "admin");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test14138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14138");
        model.Admin admin2 = new model.Admin("admin", "admin");
        admin2.login("admin", "admin");
        boolean boolean6 = admin2.isVerified();
        admin2.logout();
        java.lang.String str8 = admin2.getID();
        admin2.viewProfile();
        java.lang.String str10 = admin2.getID();
        boolean boolean11 = admin2.isVerified();
        admin2.login("", "");
        admin2.login("admin", "hi!");
        java.lang.String str18 = admin2.getPassword();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "admin" + "'", str8, "admin");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "admin" + "'", str10, "admin");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "admin" + "'", str18, "admin");
    }

    @Test
    public void test14139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14139");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        admin2.logout();
        java.lang.String str5 = admin2.getAccountType();
        boolean boolean6 = admin2.isVerified();
        java.lang.String str7 = admin2.getAccountType();
        java.lang.String str8 = admin2.getAccountType();
        admin2.setVerified(false);
        java.lang.String str11 = admin2.getID();
        java.lang.String str12 = admin2.getAccountType();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "admin" + "'", str8, "admin");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "admin" + "'", str11, "admin");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "admin" + "'", str12, "admin");
    }

    @Test
    public void test14140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14140");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        java.lang.String str5 = admin2.getAccountType();
        java.lang.String str6 = admin2.getEmail();
        admin2.viewProfile();
        java.lang.String str8 = admin2.getEmail();
        java.lang.String str9 = admin2.getID();
        admin2.setVerified(true);
        admin2.login("admin", "");
        admin2.login("hi!", "admin");
        double double18 = admin2.getHourlyRate();
        java.lang.String str19 = admin2.getAccountType();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "admin" + "'", str9, "admin");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "admin" + "'", str19, "admin");
    }

    @Test
    public void test14141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14141");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        double double5 = admin2.getHourlyRate();
        boolean boolean6 = admin2.isVerified();
        admin2.login("hi!", "");
        double double10 = admin2.getHourlyRate();
        java.lang.String str11 = admin2.getEmail();
        java.lang.String str12 = admin2.getID();
        java.lang.String str13 = admin2.getEmail();
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
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "admin" + "'", str12, "admin");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test14142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14142");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getAccountType();
        boolean boolean4 = admin2.isVerified();
        boolean boolean5 = admin2.isVerified();
        java.lang.String str6 = admin2.getID();
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
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "admin" + "'", str6, "admin");
    }

    @Test
    public void test14143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14143");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        double double5 = admin2.getHourlyRate();
        double double6 = admin2.getHourlyRate();
        java.lang.String str7 = admin2.getID();
        admin2.viewProfile();
        double double9 = admin2.getHourlyRate();
        java.lang.String str10 = admin2.getAccountType();
        java.lang.String str11 = admin2.getEmail();
        java.lang.String str12 = admin2.getPassword();
        java.lang.String str13 = admin2.getAccountType();
        admin2.setVerified(false);
        boolean boolean16 = admin2.isVerified();
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
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "admin" + "'", str10, "admin");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "admin" + "'", str13, "admin");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test14144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14144");
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
        admin2.login("hi!", "hi!");
        java.lang.Class<?> wildcardClass19 = admin2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test14145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14145");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        admin2.logout();
        java.lang.String str5 = admin2.getAccountType();
        admin2.login("", "");
        java.lang.String str9 = admin2.getID();
        double double10 = admin2.getHourlyRate();
        java.lang.String str11 = admin2.getPassword();
        admin2.logout();
        java.lang.String str13 = admin2.getEmail();
        admin2.setVerified(false);
        double double16 = admin2.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "admin" + "'", str9, "admin");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
    }

    @Test
    public void test14146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14146");
        model.Admin admin2 = new model.Admin("", "");
        java.lang.String str3 = admin2.getAccountType();
        admin2.setVerified(true);
        java.lang.String str6 = admin2.getAccountType();
        admin2.logout();
        double double8 = admin2.getHourlyRate();
        java.lang.String str9 = admin2.getEmail();
        admin2.login("", "hi!");
        boolean boolean13 = admin2.isVerified();
        admin2.logout();
        boolean boolean15 = admin2.isVerified();
        admin2.logout();
        java.lang.String str17 = admin2.getID();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "admin" + "'", str6, "admin");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "admin" + "'", str17, "admin");
    }

    @Test
    public void test14147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14147");
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
        admin2.login("hi!", "hi!");
        boolean boolean22 = admin2.isVerified();
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
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test14148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14148");
        model.Admin admin2 = new model.Admin("admin", "admin");
        admin2.viewProfile();
        java.lang.String str4 = admin2.getID();
        admin2.logout();
        java.lang.String str6 = admin2.getAccountType();
        admin2.viewProfile();
        admin2.setVerified(true);
        java.lang.String str10 = admin2.getAccountType();
        boolean boolean11 = admin2.isVerified();
        admin2.logout();
        admin2.login("hi!", "");
        admin2.setVerified(false);
        room.Room room18 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.addRoom(room18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.getRoomID()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "admin" + "'", str4, "admin");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "admin" + "'", str6, "admin");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "admin" + "'", str10, "admin");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test14149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14149");
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
        java.lang.String str14 = admin2.getEmail();
        java.lang.String str15 = admin2.getID();
        admin2.login("hi!", "admin");
        double double19 = admin2.getHourlyRate();
        java.lang.String str20 = admin2.getEmail();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "admin" + "'", str9, "admin");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "admin" + "'", str15, "admin");
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test14150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14150");
        model.Admin admin2 = new model.Admin("admin", "admin");
        boolean boolean3 = admin2.isVerified();
        java.lang.String str4 = admin2.getPassword();
        java.lang.String str5 = admin2.getPassword();
        boolean boolean6 = admin2.isVerified();
        admin2.login("admin", "hi!");
        java.lang.Class<?> wildcardClass10 = admin2.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "admin" + "'", str4, "admin");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test14151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14151");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        double double5 = admin2.getHourlyRate();
        boolean boolean6 = admin2.isVerified();
        admin2.login("hi!", "");
        boolean boolean10 = admin2.isVerified();
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
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test14152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14152");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        java.lang.String str4 = admin2.getEmail();
        admin2.logout();
        admin2.logout();
        java.lang.String str7 = admin2.getPassword();
        java.lang.String str8 = admin2.getPassword();
        admin2.viewProfile();
        admin2.logout();
        admin2.login("", "admin");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test14153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14153");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        admin2.logout();
        boolean boolean4 = admin2.isVerified();
        double double5 = admin2.getHourlyRate();
        room.Room room6 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.disableRoom(room6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test14154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14154");
        model.Admin admin2 = new model.Admin("admin", "admin");
        admin2.viewProfile();
        java.lang.String str4 = admin2.getID();
        admin2.logout();
        java.lang.String str6 = admin2.getAccountType();
        boolean boolean7 = admin2.isVerified();
        admin2.setVerified(false);
        java.lang.Class<?> wildcardClass10 = admin2.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "admin" + "'", str4, "admin");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "admin" + "'", str6, "admin");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test14155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14155");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        java.lang.String str4 = admin2.getPassword();
        java.lang.String str5 = admin2.getAccountType();
        admin2.viewProfile();
        double double7 = admin2.getHourlyRate();
        java.lang.String str8 = admin2.getEmail();
        boolean boolean9 = admin2.isVerified();
        java.lang.String str10 = admin2.getPassword();
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
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test14156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14156");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getAccountType();
        java.lang.String str4 = admin2.getAccountType();
        boolean boolean5 = admin2.isVerified();
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
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "admin" + "'", str4, "admin");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test14157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14157");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        admin2.logout();
        java.lang.String str5 = admin2.getAccountType();
        admin2.viewProfile();
        admin2.login("hi!", "admin");
        boolean boolean10 = admin2.isVerified();
        java.lang.String str11 = admin2.getEmail();
        admin2.setVerified(true);
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
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test14158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14158");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        admin2.logout();
        admin2.setVerified(false);
        java.lang.String str6 = admin2.getEmail();
        admin2.viewProfile();
        admin2.viewProfile();
        java.lang.String str9 = admin2.getID();
        admin2.login("hi!", "hi!");
        admin2.viewProfile();
        double double14 = admin2.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "admin" + "'", str9, "admin");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test14159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14159");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        double double5 = admin2.getHourlyRate();
        double double6 = admin2.getHourlyRate();
        java.lang.String str7 = admin2.getID();
        admin2.viewProfile();
        admin2.logout();
        admin2.setVerified(false);
        java.lang.String str12 = admin2.getID();
        boolean boolean13 = admin2.isVerified();
        double double14 = admin2.getHourlyRate();
        double double15 = admin2.getHourlyRate();
        java.lang.String str16 = admin2.getEmail();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "admin" + "'", str12, "admin");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test14160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14160");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getAccountType();
        boolean boolean4 = admin2.isVerified();
        java.lang.String str5 = admin2.getPassword();
        java.lang.String str6 = admin2.getID();
        java.lang.String str7 = admin2.getID();
        admin2.logout();
        java.lang.String str9 = admin2.getEmail();
        admin2.logout();
        admin2.logout();
        admin2.viewProfile();
        admin2.viewProfile();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "admin" + "'", str6, "admin");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test14161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14161");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        admin2.logout();
        java.lang.String str5 = admin2.getAccountType();
        java.lang.String str6 = admin2.getEmail();
        java.lang.String str7 = admin2.getPassword();
        java.lang.String str8 = admin2.getAccountType();
        double double9 = admin2.getHourlyRate();
        admin2.login("", "");
        java.lang.String str13 = admin2.getAccountType();
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
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "admin" + "'", str8, "admin");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "admin" + "'", str13, "admin");
    }

    @Test
    public void test14162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14162");
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
        double double16 = admin2.getHourlyRate();
        admin2.viewProfile();
        java.lang.String str18 = admin2.getAccountType();
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
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "admin" + "'", str18, "admin");
    }

    @Test
    public void test14163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14163");
        model.Admin admin2 = new model.Admin("admin", "");
        admin2.setVerified(true);
        java.lang.String str5 = admin2.getAccountType();
        java.lang.String str6 = admin2.getAccountType();
        admin2.logout();
        admin2.login("hi!", "");
        admin2.login("", "hi!");
        boolean boolean14 = admin2.isVerified();
        admin2.logout();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "admin" + "'", str6, "admin");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test14164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14164");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        java.lang.String str4 = admin2.getPassword();
        java.lang.String str5 = admin2.getAccountType();
        admin2.viewProfile();
        double double7 = admin2.getHourlyRate();
        java.lang.String str8 = admin2.getID();
        java.lang.String str9 = admin2.getAccountType();
        admin2.viewProfile();
        admin2.viewProfile();
        admin2.login("", "hi!");
        java.lang.String str15 = admin2.getID();
        double double16 = admin2.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "admin" + "'", str8, "admin");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "admin" + "'", str9, "admin");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "admin" + "'", str15, "admin");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
    }

    @Test
    public void test14165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14165");
        model.Admin admin2 = new model.Admin("", "");
        java.lang.String str3 = admin2.getAccountType();
        java.lang.String str4 = admin2.getEmail();
        admin2.login("hi!", "");
        java.lang.String str8 = admin2.getAccountType();
        java.lang.String str9 = admin2.getID();
        admin2.logout();
        admin2.login("hi!", "");
        admin2.logout();
        admin2.login("hi!", "admin");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "admin" + "'", str8, "admin");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "admin" + "'", str9, "admin");
    }

    @Test
    public void test14166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14166");
        model.Admin admin2 = new model.Admin("admin", "admin");
        admin2.login("admin", "admin");
        boolean boolean6 = admin2.isVerified();
        admin2.logout();
        java.lang.String str8 = admin2.getID();
        admin2.setVerified(true);
        admin2.setVerified(true);
        double double13 = admin2.getHourlyRate();
        java.lang.String str14 = admin2.getPassword();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "admin" + "'", str8, "admin");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "admin" + "'", str14, "admin");
    }

    @Test
    public void test14167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14167");
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
        admin2.viewProfile();
        admin2.setVerified(true);
        java.lang.String str15 = admin2.getID();
        boolean boolean16 = admin2.isVerified();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "admin" + "'", str15, "admin");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test14168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14168");
        model.Admin admin2 = new model.Admin("", "");
        java.lang.String str3 = admin2.getAccountType();
        java.lang.String str4 = admin2.getEmail();
        java.lang.String str5 = admin2.getID();
        double double6 = admin2.getHourlyRate();
        java.lang.String str7 = admin2.getEmail();
        admin2.login("admin", "admin");
        java.lang.String str11 = admin2.getEmail();
        double double12 = admin2.getHourlyRate();
        boolean boolean13 = admin2.isVerified();
        admin2.login("hi!", "admin");
        admin2.viewProfile();
        java.lang.String str18 = admin2.getEmail();
        java.lang.String str19 = admin2.getEmail();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test14169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14169");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getPassword();
        java.lang.String str4 = admin2.getID();
        java.lang.String str5 = admin2.getEmail();
        boolean boolean6 = admin2.isVerified();
        java.lang.String str7 = admin2.getAccountType();
        admin2.login("admin", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "admin" + "'", str4, "admin");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
    }

    @Test
    public void test14170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14170");
        model.Admin admin2 = new model.Admin("admin", "admin");
        admin2.login("admin", "admin");
        boolean boolean6 = admin2.isVerified();
        admin2.logout();
        admin2.setVerified(false);
        admin2.setVerified(false);
        admin2.logout();
        java.lang.String str13 = admin2.getAccountType();
        java.lang.String str14 = admin2.getID();
        admin2.logout();
        admin2.login("hi!", "");
        java.lang.String str19 = admin2.getPassword();
        boolean boolean20 = admin2.isVerified();
        admin2.viewProfile();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "admin" + "'", str13, "admin");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "admin" + "'", str14, "admin");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "admin" + "'", str19, "admin");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test14171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14171");
        model.Admin admin2 = new model.Admin("", "");
        java.lang.String str3 = admin2.getAccountType();
        admin2.setVerified(true);
        java.lang.String str6 = admin2.getAccountType();
        admin2.logout();
        double double8 = admin2.getHourlyRate();
        double double9 = admin2.getHourlyRate();
        boolean boolean10 = admin2.isVerified();
        java.lang.String str11 = admin2.getAccountType();
        admin2.viewProfile();
        java.lang.String str13 = admin2.getPassword();
        admin2.login("", "");
        java.lang.String str17 = admin2.getEmail();
        java.lang.Class<?> wildcardClass18 = admin2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "admin" + "'", str6, "admin");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "admin" + "'", str11, "admin");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test14172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14172");
        model.Admin admin2 = new model.Admin("", "");
        java.lang.String str3 = admin2.getAccountType();
        admin2.setVerified(true);
        double double6 = admin2.getHourlyRate();
        admin2.viewProfile();
        boolean boolean8 = admin2.isVerified();
        java.lang.String str9 = admin2.getID();
        java.lang.String str10 = admin2.getID();
        admin2.viewProfile();
        admin2.login("admin", "hi!");
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
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "admin" + "'", str9, "admin");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "admin" + "'", str10, "admin");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "admin" + "'", str15, "admin");
    }

    @Test
    public void test14173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14173");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getAccountType();
        boolean boolean4 = admin2.isVerified();
        boolean boolean5 = admin2.isVerified();
        admin2.viewProfile();
        admin2.login("admin", "hi!");
        java.lang.String str10 = admin2.getPassword();
        admin2.login("", "hi!");
        admin2.setVerified(true);
        admin2.login("admin", "admin");
        admin2.login("admin", "");
        room.Room room22 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.enableRoom(room22);
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
    public void test14174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14174");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        admin2.logout();
        java.lang.String str5 = admin2.getAccountType();
        admin2.login("", "");
        java.lang.String str9 = admin2.getPassword();
        java.lang.String str10 = admin2.getEmail();
        java.lang.String str11 = admin2.getAccountType();
        java.lang.String str12 = admin2.getPassword();
        java.lang.String str13 = admin2.getEmail();
        admin2.viewProfile();
        admin2.login("", "");
        java.lang.String str18 = admin2.getEmail();
        boolean boolean19 = admin2.isVerified();
        java.lang.String str20 = admin2.getAccountType();
        room.Room room21 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.disableRoom(room21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "admin" + "'", str11, "admin");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "admin" + "'", str20, "admin");
    }

    @Test
    public void test14175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14175");
        model.Admin admin2 = new model.Admin("admin", "admin");
        boolean boolean3 = admin2.isVerified();
        admin2.login("hi!", "");
        java.lang.String str7 = admin2.getEmail();
        admin2.viewProfile();
        double double9 = admin2.getHourlyRate();
        admin2.viewProfile();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test14176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14176");
        model.Admin admin2 = new model.Admin("admin", "admin");
        admin2.login("admin", "admin");
        boolean boolean6 = admin2.isVerified();
        admin2.viewProfile();
        boolean boolean8 = admin2.isVerified();
        admin2.setVerified(false);
        java.lang.String str11 = admin2.getPassword();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "admin" + "'", str11, "admin");
    }

    @Test
    public void test14177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14177");
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
        java.lang.String str21 = admin2.getEmail();
        java.lang.String str22 = admin2.getAccountType();
        java.lang.String str23 = admin2.getPassword();
        java.lang.String str24 = admin2.getPassword();
        room.Room room25 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.disableRoom(room25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "admin" + "'", str4, "admin");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "admin" + "'", str20, "admin");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "admin" + "'", str21, "admin");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "admin" + "'", str22, "admin");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "admin" + "'", str23, "admin");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "admin" + "'", str24, "admin");
    }

    @Test
    public void test14178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14178");
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
        java.lang.String str14 = admin2.getPassword();
        admin2.setVerified(true);
        double double17 = admin2.getHourlyRate();
        admin2.setVerified(true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "admin" + "'", str12, "admin");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
    }

    @Test
    public void test14179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14179");
        model.Admin admin2 = new model.Admin("admin", "");
        admin2.setVerified(true);
        java.lang.String str5 = admin2.getEmail();
        double double6 = admin2.getHourlyRate();
        double double7 = admin2.getHourlyRate();
        admin2.setVerified(false);
        admin2.setVerified(true);
        admin2.logout();
        admin2.setVerified(true);
        admin2.login("admin", "");
        double double18 = admin2.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
    }

    @Test
    public void test14180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14180");
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
        java.lang.String str12 = admin2.getEmail();
        admin2.viewProfile();
        admin2.setVerified(true);
        java.lang.String str16 = admin2.getPassword();
        admin2.setVerified(false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "admin" + "'", str8, "admin");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "admin" + "'", str9, "admin");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "admin" + "'", str10, "admin");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test14181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14181");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        java.lang.String str5 = admin2.getID();
        java.lang.String str6 = admin2.getID();
        admin2.logout();
        java.lang.String str8 = admin2.getID();
        boolean boolean9 = admin2.isVerified();
        java.lang.String str10 = admin2.getEmail();
        boolean boolean11 = admin2.isVerified();
        java.lang.String str12 = admin2.getID();
        admin2.viewProfile();
        double double14 = admin2.getHourlyRate();
        admin2.logout();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "admin" + "'", str6, "admin");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "admin" + "'", str8, "admin");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "admin" + "'", str12, "admin");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test14182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14182");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getAccountType();
        boolean boolean4 = admin2.isVerified();
        boolean boolean5 = admin2.isVerified();
        admin2.logout();
        admin2.login("admin", "hi!");
        boolean boolean10 = admin2.isVerified();
        admin2.logout();
        java.lang.String str12 = admin2.getID();
        admin2.viewProfile();
        admin2.viewProfile();
        admin2.logout();
        java.lang.String str16 = admin2.getAccountType();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "admin" + "'", str12, "admin");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "admin" + "'", str16, "admin");
    }

    @Test
    public void test14183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14183");
        model.Admin admin2 = new model.Admin("admin", "admin");
        admin2.login("admin", "admin");
        java.lang.String str6 = admin2.getAccountType();
        admin2.viewProfile();
        java.lang.String str8 = admin2.getPassword();
        admin2.setVerified(false);
        java.lang.String str11 = admin2.getEmail();
        java.lang.String str12 = admin2.getID();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "admin" + "'", str6, "admin");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "admin" + "'", str8, "admin");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "admin" + "'", str11, "admin");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "admin" + "'", str12, "admin");
    }

    @Test
    public void test14184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14184");
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
        boolean boolean16 = admin2.isVerified();
        double double17 = admin2.getHourlyRate();
        admin2.login("admin", "admin");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
    }

    @Test
    public void test14185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14185");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getAccountType();
        admin2.setVerified(false);
        java.lang.String str6 = admin2.getPassword();
        double double7 = admin2.getHourlyRate();
        java.lang.String str8 = admin2.getAccountType();
        double double9 = admin2.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "admin" + "'", str8, "admin");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test14186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14186");
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
        admin2.logout();
        double double16 = admin2.getHourlyRate();
        java.lang.String str17 = admin2.getEmail();
        java.lang.Class<?> wildcardClass18 = admin2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "admin" + "'", str9, "admin");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test14187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14187");
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
        java.lang.String str18 = admin2.getEmail();
        admin2.login("hi!", "admin");
        admin2.setVerified(true);
        java.lang.String str24 = admin2.getEmail();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "admin" + "'", str11, "admin");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
    }

    @Test
    public void test14188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14188");
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
        admin2.viewProfile();
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
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "admin" + "'", str15, "admin");
    }

    @Test
    public void test14189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14189");
        model.Admin admin2 = new model.Admin("", "");
        java.lang.String str3 = admin2.getAccountType();
        java.lang.String str4 = admin2.getEmail();
        java.lang.String str5 = admin2.getID();
        double double6 = admin2.getHourlyRate();
        java.lang.String str7 = admin2.getAccountType();
        admin2.setVerified(false);
        java.lang.String str10 = admin2.getAccountType();
        java.lang.String str11 = admin2.getPassword();
        boolean boolean12 = admin2.isVerified();
        java.lang.Class<?> wildcardClass13 = admin2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "admin" + "'", str10, "admin");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test14190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14190");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        admin2.logout();
        java.lang.String str5 = admin2.getAccountType();
        admin2.login("", "");
        admin2.setVerified(true);
        admin2.login("admin", "admin");
        java.lang.String str14 = admin2.getAccountType();
        java.lang.String str15 = admin2.getID();
        java.lang.String str16 = admin2.getPassword();
        boolean boolean17 = admin2.isVerified();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "admin" + "'", str14, "admin");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "admin" + "'", str15, "admin");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test14191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14191");
        model.Admin admin2 = new model.Admin("admin", "admin");
        admin2.viewProfile();
        java.lang.String str4 = admin2.getPassword();
        admin2.login("", "");
        boolean boolean8 = admin2.isVerified();
        admin2.setVerified(true);
        admin2.setVerified(false);
        java.lang.String str13 = admin2.getAccountType();
        admin2.setVerified(false);
        boolean boolean16 = admin2.isVerified();
        java.lang.String str17 = admin2.getPassword();
        admin2.login("admin", "hi!");
        admin2.login("", "admin");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "admin" + "'", str4, "admin");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "admin" + "'", str13, "admin");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "admin" + "'", str17, "admin");
    }

    @Test
    public void test14192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14192");
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
        java.lang.String str17 = admin2.getPassword();
        boolean boolean18 = admin2.isVerified();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "admin" + "'", str9, "admin");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test14193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14193");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        java.lang.String str4 = admin2.getAccountType();
        admin2.logout();
        java.lang.String str6 = admin2.getID();
        boolean boolean7 = admin2.isVerified();
        room.Room room8 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.disableRoom(room8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "admin" + "'", str4, "admin");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "admin" + "'", str6, "admin");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test14194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14194");
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
        java.lang.String str15 = admin2.getID();
        java.lang.String str16 = admin2.getEmail();
        boolean boolean17 = admin2.isVerified();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "admin" + "'", str13, "admin");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "admin" + "'", str15, "admin");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test14195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14195");
        model.Admin admin2 = new model.Admin("admin", "admin");
        admin2.viewProfile();
        java.lang.String str4 = admin2.getPassword();
        admin2.login("", "");
        boolean boolean8 = admin2.isVerified();
        admin2.login("admin", "hi!");
        admin2.setVerified(true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "admin" + "'", str4, "admin");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test14196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14196");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        java.lang.String str5 = admin2.getID();
        admin2.setVerified(false);
        double double8 = admin2.getHourlyRate();
        double double9 = admin2.getHourlyRate();
        admin2.setVerified(false);
        admin2.viewProfile();
        admin2.login("admin", "admin");
        admin2.viewProfile();
        admin2.login("", "admin");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test14197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14197");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getAccountType();
        java.lang.String str4 = admin2.getPassword();
        admin2.setVerified(true);
        java.lang.String str7 = admin2.getID();
        java.lang.String str8 = admin2.getEmail();
        java.lang.String str9 = admin2.getPassword();
        java.lang.String str10 = admin2.getEmail();
        boolean boolean11 = admin2.isVerified();
        admin2.login("admin", "hi!");
        java.lang.String str15 = admin2.getEmail();
        admin2.login("", "admin");
        boolean boolean19 = admin2.isVerified();
        admin2.logout();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test14198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14198");
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
        java.lang.String str20 = admin2.getID();
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
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "admin" + "'", str20, "admin");
    }

    @Test
    public void test14199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14199");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getAccountType();
        boolean boolean4 = admin2.isVerified();
        java.lang.String str5 = admin2.getPassword();
        java.lang.String str6 = admin2.getID();
        java.lang.String str7 = admin2.getID();
        admin2.logout();
        java.lang.String str9 = admin2.getEmail();
        boolean boolean10 = admin2.isVerified();
        admin2.viewProfile();
        admin2.setVerified(false);
        admin2.setVerified(true);
        admin2.setVerified(false);
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
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "admin" + "'", str6, "admin");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test14200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14200");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        admin2.logout();
        java.lang.String str4 = admin2.getEmail();
        java.lang.String str5 = admin2.getPassword();
        boolean boolean6 = admin2.isVerified();
        admin2.logout();
        admin2.login("admin", "hi!");
        double double11 = admin2.getHourlyRate();
        admin2.logout();
        admin2.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test14201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14201");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        admin2.logout();
        java.lang.String str4 = admin2.getEmail();
        java.lang.String str5 = admin2.getPassword();
        boolean boolean6 = admin2.isVerified();
        double double7 = admin2.getHourlyRate();
        admin2.login("", "hi!");
        java.lang.String str11 = admin2.getAccountType();
        boolean boolean12 = admin2.isVerified();
        java.lang.String str13 = admin2.getPassword();
        room.Room room14 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.enableRoom(room14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "admin" + "'", str11, "admin");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test14202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14202");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        admin2.logout();
        java.lang.String str5 = admin2.getAccountType();
        java.lang.String str6 = admin2.getEmail();
        java.lang.String str7 = admin2.getPassword();
        java.lang.String str8 = admin2.getAccountType();
        admin2.login("admin", "admin");
        boolean boolean12 = admin2.isVerified();
        admin2.logout();
        admin2.viewProfile();
        java.lang.String str15 = admin2.getID();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "admin" + "'", str8, "admin");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "admin" + "'", str15, "admin");
    }

    @Test
    public void test14203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14203");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        double double5 = admin2.getHourlyRate();
        admin2.setVerified(true);
        admin2.logout();
        java.lang.String str9 = admin2.getAccountType();
        java.lang.String str10 = admin2.getAccountType();
        double double11 = admin2.getHourlyRate();
        admin2.viewProfile();
        java.lang.String str13 = admin2.getPassword();
        java.lang.String str14 = admin2.getAccountType();
        java.lang.String str15 = admin2.getAccountType();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "admin" + "'", str9, "admin");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "admin" + "'", str10, "admin");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "admin" + "'", str14, "admin");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "admin" + "'", str15, "admin");
    }

    @Test
    public void test14204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14204");
        model.Admin admin2 = new model.Admin("", "");
        java.lang.String str3 = admin2.getAccountType();
        admin2.setVerified(true);
        double double6 = admin2.getHourlyRate();
        admin2.setVerified(false);
        admin2.logout();
        admin2.login("hi!", "");
        admin2.setVerified(true);
        java.lang.String str15 = admin2.getPassword();
        admin2.viewProfile();
        java.lang.String str17 = admin2.getID();
        double double18 = admin2.getHourlyRate();
        java.lang.String str19 = admin2.getPassword();
        admin2.logout();
        admin2.viewProfile();
        admin2.logout();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "admin" + "'", str17, "admin");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test14205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14205");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        admin2.logout();
        java.lang.String str4 = admin2.getAccountType();
        admin2.logout();
        java.lang.String str6 = admin2.getPassword();
        admin2.viewProfile();
        admin2.login("hi!", "admin");
        boolean boolean11 = admin2.isVerified();
        admin2.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "admin" + "'", str4, "admin");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test14206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14206");
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
        boolean boolean13 = admin2.isVerified();
        admin2.viewProfile();
        java.lang.String str15 = admin2.getPassword();
        java.lang.String str16 = admin2.getPassword();
        java.lang.String str17 = admin2.getPassword();
        java.lang.Class<?> wildcardClass18 = admin2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test14207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14207");
        model.Admin admin2 = new model.Admin("", "");
        java.lang.String str3 = admin2.getAccountType();
        admin2.setVerified(true);
        java.lang.String str6 = admin2.getAccountType();
        admin2.logout();
        double double8 = admin2.getHourlyRate();
        double double9 = admin2.getHourlyRate();
        boolean boolean10 = admin2.isVerified();
        java.lang.String str11 = admin2.getID();
        admin2.login("hi!", "admin");
        admin2.viewProfile();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "admin" + "'", str6, "admin");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "admin" + "'", str11, "admin");
    }

    @Test
    public void test14208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14208");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        double double5 = admin2.getHourlyRate();
        admin2.setVerified(true);
        double double8 = admin2.getHourlyRate();
        double double9 = admin2.getHourlyRate();
        admin2.login("", "admin");
        java.lang.String str13 = admin2.getID();
        java.lang.String str14 = admin2.getAccountType();
        java.lang.String str15 = admin2.getPassword();
        admin2.logout();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "admin" + "'", str13, "admin");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "admin" + "'", str14, "admin");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test14209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14209");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        java.lang.String str4 = admin2.getEmail();
        admin2.logout();
        admin2.logout();
        java.lang.String str7 = admin2.getPassword();
        admin2.login("hi!", "");
        java.lang.String str11 = admin2.getAccountType();
        admin2.logout();
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
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "admin" + "'", str11, "admin");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "admin" + "'", str13, "admin");
    }

    @Test
    public void test14210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14210");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getAccountType();
        boolean boolean4 = admin2.isVerified();
        boolean boolean5 = admin2.isVerified();
        admin2.logout();
        java.lang.String str7 = admin2.getPassword();
        admin2.setVerified(true);
        admin2.viewProfile();
        java.lang.String str11 = admin2.getEmail();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test14211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14211");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        double double5 = admin2.getHourlyRate();
        double double6 = admin2.getHourlyRate();
        admin2.setVerified(true);
        admin2.setVerified(true);
        java.lang.String str11 = admin2.getAccountType();
        java.lang.String str12 = admin2.getPassword();
        boolean boolean13 = admin2.isVerified();
        java.lang.Class<?> wildcardClass14 = admin2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "admin" + "'", str11, "admin");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test14212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14212");
        model.Admin admin2 = new model.Admin("admin", "admin");
        admin2.viewProfile();
        java.lang.String str4 = admin2.getID();
        java.lang.String str5 = admin2.getPassword();
        java.lang.String str6 = admin2.getID();
        java.lang.String str7 = admin2.getAccountType();
        boolean boolean8 = admin2.isVerified();
        admin2.viewProfile();
        java.lang.String str10 = admin2.getID();
        java.lang.String str11 = admin2.getPassword();
        java.lang.Class<?> wildcardClass12 = admin2.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "admin" + "'", str4, "admin");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "admin" + "'", str6, "admin");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "admin" + "'", str10, "admin");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "admin" + "'", str11, "admin");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test14213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14213");
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
        java.lang.String str18 = admin2.getEmail();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test14214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14214");
        model.Admin admin2 = new model.Admin("admin", "admin");
        admin2.login("admin", "admin");
        boolean boolean6 = admin2.isVerified();
        admin2.logout();
        java.lang.String str8 = admin2.getID();
        admin2.logout();
        java.lang.String str10 = admin2.getID();
        boolean boolean11 = admin2.isVerified();
        admin2.setVerified(true);
        java.lang.String str14 = admin2.getEmail();
        admin2.logout();
        double double16 = admin2.getHourlyRate();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "admin" + "'", str8, "admin");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "admin" + "'", str10, "admin");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "admin" + "'", str14, "admin");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
    }

    @Test
    public void test14215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14215");
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
        java.lang.String str15 = admin2.getPassword();
        java.lang.Class<?> wildcardClass16 = admin2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test14216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14216");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        admin2.logout();
        java.lang.String str5 = admin2.getAccountType();
        admin2.login("hi!", "");
        admin2.logout();
        java.lang.String str10 = admin2.getID();
        admin2.viewProfile();
        boolean boolean12 = admin2.isVerified();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "admin" + "'", str10, "admin");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test14217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14217");
        model.Admin admin2 = new model.Admin("admin", "");
        admin2.logout();
        double double4 = admin2.getHourlyRate();
        admin2.setVerified(false);
        double double7 = admin2.getHourlyRate();
        admin2.logout();
        java.lang.String str9 = admin2.getAccountType();
        admin2.login("hi!", "admin");
        admin2.viewProfile();
        admin2.viewProfile();
        admin2.viewProfile();
        boolean boolean16 = admin2.isVerified();
        room.Room room17 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.enableRoom(room17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "admin" + "'", str9, "admin");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test14218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14218");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getAccountType();
        java.lang.String str4 = admin2.getPassword();
        admin2.setVerified(true);
        java.lang.String str7 = admin2.getEmail();
        double double8 = admin2.getHourlyRate();
        admin2.login("", "hi!");
        admin2.setVerified(false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test14219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14219");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        admin2.logout();
        java.lang.String str5 = admin2.getAccountType();
        java.lang.String str6 = admin2.getEmail();
        double double7 = admin2.getHourlyRate();
        java.lang.String str8 = admin2.getPassword();
        java.lang.String str9 = admin2.getPassword();
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
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "admin" + "'", str10, "admin");
    }

    @Test
    public void test14220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14220");
        model.Admin admin2 = new model.Admin("", "");
        java.lang.String str3 = admin2.getAccountType();
        java.lang.String str4 = admin2.getEmail();
        admin2.login("hi!", "");
        java.lang.String str8 = admin2.getAccountType();
        java.lang.String str9 = admin2.getEmail();
        double double10 = admin2.getHourlyRate();
        double double11 = admin2.getHourlyRate();
        boolean boolean12 = admin2.isVerified();
        java.lang.String str13 = admin2.getID();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "admin" + "'", str8, "admin");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "admin" + "'", str13, "admin");
    }

    @Test
    public void test14221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14221");
        model.Admin admin2 = new model.Admin("admin", "");
        admin2.setVerified(true);
        java.lang.String str5 = admin2.getEmail();
        double double6 = admin2.getHourlyRate();
        admin2.viewProfile();
        admin2.viewProfile();
        admin2.viewProfile();
        admin2.setVerified(true);
        double double12 = admin2.getHourlyRate();
        admin2.logout();
        admin2.login("", "");
        admin2.logout();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test14222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14222");
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
        admin2.logout();
        java.lang.Class<?> wildcardClass17 = admin2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "admin" + "'", str12, "admin");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test14223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14223");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        admin2.logout();
        java.lang.String str5 = admin2.getAccountType();
        boolean boolean6 = admin2.isVerified();
        java.lang.String str7 = admin2.getAccountType();
        admin2.logout();
        admin2.setVerified(false);
        admin2.viewProfile();
        java.lang.String str12 = admin2.getID();
        java.lang.Class<?> wildcardClass13 = admin2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "admin" + "'", str12, "admin");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test14224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14224");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getAccountType();
        boolean boolean4 = admin2.isVerified();
        boolean boolean5 = admin2.isVerified();
        admin2.logout();
        admin2.login("admin", "hi!");
        java.lang.String str10 = admin2.getPassword();
        java.lang.String str11 = admin2.getAccountType();
        java.lang.String str12 = admin2.getID();
        admin2.login("", "hi!");
        boolean boolean16 = admin2.isVerified();
        admin2.viewProfile();
        admin2.viewProfile();
        java.lang.String str19 = admin2.getPassword();
        java.lang.String str20 = admin2.getEmail();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "admin" + "'", str11, "admin");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "admin" + "'", str12, "admin");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test14225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14225");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        double double5 = admin2.getHourlyRate();
        double double6 = admin2.getHourlyRate();
        java.lang.String str7 = admin2.getID();
        boolean boolean8 = admin2.isVerified();
        admin2.login("", "");
        admin2.login("", "hi!");
        java.lang.String str15 = admin2.getAccountType();
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
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "admin" + "'", str15, "admin");
    }

    @Test
    public void test14226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14226");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        admin2.logout();
        java.lang.String str5 = admin2.getAccountType();
        java.lang.String str6 = admin2.getEmail();
        java.lang.String str7 = admin2.getID();
        java.lang.String str8 = admin2.getEmail();
        admin2.viewProfile();
        admin2.login("admin", "hi!");
        admin2.logout();
        admin2.login("admin", "hi!");
        java.lang.String str17 = admin2.getPassword();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test14227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14227");
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
        double double13 = admin2.getHourlyRate();
        double double14 = admin2.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "admin" + "'", str9, "admin");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test14228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14228");
        model.Admin admin2 = new model.Admin("admin", "admin");
        admin2.viewProfile();
        java.lang.String str4 = admin2.getPassword();
        admin2.login("", "");
        boolean boolean8 = admin2.isVerified();
        admin2.setVerified(false);
        java.lang.String str11 = admin2.getAccountType();
        double double12 = admin2.getHourlyRate();
        double double13 = admin2.getHourlyRate();
        admin2.viewProfile();
        java.lang.String str15 = admin2.getAccountType();
        admin2.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "admin" + "'", str4, "admin");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "admin" + "'", str11, "admin");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "admin" + "'", str15, "admin");
    }

    @Test
    public void test14229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14229");
        model.Admin admin2 = new model.Admin("admin", "admin");
        admin2.login("admin", "admin");
        admin2.setVerified(false);
        boolean boolean8 = admin2.isVerified();
        boolean boolean9 = admin2.isVerified();
        java.lang.String str10 = admin2.getPassword();
        admin2.login("hi!", "admin");
        double double14 = admin2.getHourlyRate();
        java.lang.String str15 = admin2.getPassword();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "admin" + "'", str10, "admin");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "admin" + "'", str15, "admin");
    }

    @Test
    public void test14230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14230");
        model.Admin admin2 = new model.Admin("admin", "admin");
        admin2.viewProfile();
        java.lang.String str4 = admin2.getID();
        java.lang.String str5 = admin2.getPassword();
        admin2.logout();
        java.lang.String str7 = admin2.getID();
        admin2.login("admin", "hi!");
        java.lang.String str11 = admin2.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "admin" + "'", str4, "admin");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "admin" + "'", str11, "admin");
    }

    @Test
    public void test14231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14231");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getAccountType();
        admin2.setVerified(false);
        admin2.login("hi!", "hi!");
        admin2.logout();
        java.lang.String str10 = admin2.getID();
        admin2.logout();
        admin2.setVerified(false);
        java.lang.String str14 = admin2.getPassword();
        java.lang.String str15 = admin2.getID();
        java.lang.Class<?> wildcardClass16 = admin2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "admin" + "'", str10, "admin");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "admin" + "'", str15, "admin");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test14232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14232");
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
        boolean boolean16 = admin2.isVerified();
        admin2.logout();
        double double18 = admin2.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "admin" + "'", str12, "admin");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
    }

    @Test
    public void test14233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14233");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        admin2.logout();
        java.lang.String str5 = admin2.getAccountType();
        admin2.viewProfile();
        admin2.setVerified(false);
        java.lang.String str9 = admin2.getEmail();
        java.lang.String str10 = admin2.getPassword();
        java.lang.String str11 = admin2.getAccountType();
        java.lang.String str12 = admin2.getID();
        admin2.viewProfile();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "admin" + "'", str11, "admin");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "admin" + "'", str12, "admin");
    }

    @Test
    public void test14234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14234");
        model.Admin admin2 = new model.Admin("admin", "admin");
        boolean boolean3 = admin2.isVerified();
        admin2.login("hi!", "");
        admin2.setVerified(true);
        java.lang.String str9 = admin2.getAccountType();
        boolean boolean10 = admin2.isVerified();
        java.lang.String str11 = admin2.getEmail();
        admin2.login("hi!", "hi!");
        java.lang.String str15 = admin2.getID();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "admin" + "'", str9, "admin");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "admin" + "'", str11, "admin");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "admin" + "'", str15, "admin");
    }

    @Test
    public void test14235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14235");
        model.Admin admin2 = new model.Admin("hi!", "admin");
        java.lang.String str3 = admin2.getID();
        admin2.setVerified(false);
        java.lang.String str6 = admin2.getPassword();
        java.lang.String str7 = admin2.getPassword();
        admin2.viewProfile();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "admin" + "'", str6, "admin");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
    }

    @Test
    public void test14236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14236");
        model.Admin admin2 = new model.Admin("admin", "hi!");
        java.lang.String str3 = admin2.getPassword();
        admin2.viewProfile();
        java.lang.String str5 = admin2.getEmail();
        admin2.setVerified(true);
        admin2.logout();
        admin2.logout();
        room.Room room10 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.disableRoom(room10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
    }

    @Test
    public void test14237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14237");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        double double5 = admin2.getHourlyRate();
        double double6 = admin2.getHourlyRate();
        java.lang.String str7 = admin2.getID();
        admin2.viewProfile();
        double double9 = admin2.getHourlyRate();
        admin2.setVerified(true);
        admin2.setVerified(false);
        admin2.login("", "");
        java.lang.String str17 = admin2.getAccountType();
        admin2.viewProfile();
        boolean boolean19 = admin2.isVerified();
        java.lang.String str20 = admin2.getPassword();
        java.lang.String str21 = admin2.getPassword();
        java.lang.String str22 = admin2.getPassword();
        room.Room room23 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.addRoom(room23);
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
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "admin" + "'", str17, "admin");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
    }

    @Test
    public void test14238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14238");
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
        admin2.login("", "hi!");
        java.lang.String str19 = admin2.getAccountType();
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
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "admin" + "'", str14, "admin");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "admin" + "'", str19, "admin");
    }

    @Test
    public void test14239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14239");
        model.Admin admin2 = new model.Admin("admin", "admin");
        boolean boolean3 = admin2.isVerified();
        admin2.login("hi!", "");
        double double7 = admin2.getHourlyRate();
        java.lang.String str8 = admin2.getID();
        admin2.viewProfile();
        boolean boolean10 = admin2.isVerified();
        admin2.logout();
        java.lang.String str12 = admin2.getPassword();
        admin2.setVerified(false);
        admin2.viewProfile();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "admin" + "'", str8, "admin");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "admin" + "'", str12, "admin");
    }

    @Test
    public void test14240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14240");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        java.lang.String str5 = admin2.getID();
        java.lang.String str6 = admin2.getID();
        java.lang.String str7 = admin2.getAccountType();
        admin2.setVerified(true);
        java.lang.String str10 = admin2.getAccountType();
        admin2.setVerified(true);
        double double13 = admin2.getHourlyRate();
        java.lang.String str14 = admin2.getID();
        java.lang.String str15 = admin2.getPassword();
        java.lang.Class<?> wildcardClass16 = admin2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "admin" + "'", str6, "admin");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "admin" + "'", str10, "admin");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "admin" + "'", str14, "admin");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test14241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14241");
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
        double double14 = admin2.getHourlyRate();
        admin2.login("hi!", "hi!");
        java.lang.String str18 = admin2.getAccountType();
        boolean boolean19 = admin2.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "admin" + "'", str4, "admin");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "admin" + "'", str6, "admin");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "admin" + "'", str11, "admin");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "admin" + "'", str13, "admin");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "admin" + "'", str18, "admin");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test14242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14242");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        java.lang.String str5 = admin2.getID();
        admin2.setVerified(false);
        double double8 = admin2.getHourlyRate();
        java.lang.String str9 = admin2.getAccountType();
        boolean boolean10 = admin2.isVerified();
        java.lang.String str11 = admin2.getID();
        admin2.viewProfile();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "admin" + "'", str9, "admin");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "admin" + "'", str11, "admin");
    }

    @Test
    public void test14243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14243");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        java.lang.String str4 = admin2.getEmail();
        admin2.logout();
        admin2.logout();
        java.lang.String str7 = admin2.getPassword();
        java.lang.String str8 = admin2.getAccountType();
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
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "admin" + "'", str8, "admin");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "admin" + "'", str10, "admin");
    }

    @Test
    public void test14244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14244");
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
        java.lang.String str16 = admin2.getPassword();
        room.Room room17 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.addRoom(room17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.getRoomID()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test14245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14245");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        admin2.logout();
        java.lang.String str5 = admin2.getAccountType();
        admin2.viewProfile();
        admin2.login("hi!", "admin");
        double double10 = admin2.getHourlyRate();
        admin2.setVerified(false);
        admin2.logout();
        java.lang.String str14 = admin2.getEmail();
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
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test14246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14246");
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
        java.lang.String str15 = admin2.getAccountType();
        admin2.viewProfile();
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
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "admin" + "'", str12, "admin");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "admin" + "'", str15, "admin");
    }

    @Test
    public void test14247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14247");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        java.lang.String str4 = admin2.getEmail();
        boolean boolean5 = admin2.isVerified();
        java.lang.String str6 = admin2.getPassword();
        java.lang.String str7 = admin2.getAccountType();
        double double8 = admin2.getHourlyRate();
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
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "admin" + "'", str9, "admin");
    }

    @Test
    public void test14248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14248");
        model.Admin admin2 = new model.Admin("admin", "");
        admin2.setVerified(true);
        java.lang.String str5 = admin2.getAccountType();
        boolean boolean6 = admin2.isVerified();
        java.lang.String str7 = admin2.getPassword();
        admin2.login("hi!", "hi!");
        admin2.setVerified(false);
        admin2.setVerified(false);
        java.lang.String str15 = admin2.getAccountType();
        java.lang.String str16 = admin2.getEmail();
        room.Room room17 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.disableRoom(room17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "admin" + "'", str15, "admin");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "admin" + "'", str16, "admin");
    }

    @Test
    public void test14249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14249");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        admin2.logout();
        java.lang.String str4 = admin2.getAccountType();
        admin2.viewProfile();
        admin2.logout();
        java.lang.String str7 = admin2.getAccountType();
        boolean boolean8 = admin2.isVerified();
        java.lang.Class<?> wildcardClass9 = admin2.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "admin" + "'", str4, "admin");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test14250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14250");
        model.Admin admin2 = new model.Admin("", "");
        java.lang.String str3 = admin2.getAccountType();
        java.lang.String str4 = admin2.getEmail();
        double double5 = admin2.getHourlyRate();
        java.lang.String str6 = admin2.getEmail();
        boolean boolean7 = admin2.isVerified();
        admin2.setVerified(true);
        java.lang.String str10 = admin2.getAccountType();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "admin" + "'", str10, "admin");
    }

    @Test
    public void test14251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14251");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        admin2.logout();
        java.lang.String str5 = admin2.getAccountType();
        admin2.login("", "");
        java.lang.String str9 = admin2.getPassword();
        double double10 = admin2.getHourlyRate();
        admin2.login("", "");
        admin2.viewProfile();
        java.lang.String str15 = admin2.getPassword();
        admin2.logout();
        java.lang.String str17 = admin2.getEmail();
        java.lang.Class<?> wildcardClass18 = admin2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test14252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14252");
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
        java.lang.String str14 = admin2.getEmail();
        admin2.setVerified(true);
        java.lang.String str17 = admin2.getPassword();
        boolean boolean18 = admin2.isVerified();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "admin" + "'", str8, "admin");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "admin" + "'", str11, "admin");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test14253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14253");
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
        boolean boolean17 = admin2.isVerified();
        java.lang.String str18 = admin2.getID();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "admin" + "'", str15, "admin");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "admin" + "'", str18, "admin");
    }

    @Test
    public void test14254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14254");
        model.Admin admin2 = new model.Admin("admin", "admin");
        admin2.viewProfile();
        java.lang.String str4 = admin2.getID();
        java.lang.String str5 = admin2.getPassword();
        admin2.setVerified(false);
        java.lang.String str8 = admin2.getID();
        java.lang.String str9 = admin2.getPassword();
        admin2.viewProfile();
        admin2.setVerified(true);
        admin2.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "admin" + "'", str4, "admin");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "admin" + "'", str8, "admin");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "admin" + "'", str9, "admin");
    }

    @Test
    public void test14255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14255");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        admin2.logout();
        java.lang.String str5 = admin2.getAccountType();
        boolean boolean6 = admin2.isVerified();
        admin2.login("hi!", "admin");
        java.lang.String str10 = admin2.getEmail();
        java.lang.String str11 = admin2.getPassword();
        java.lang.String str12 = admin2.getID();
        admin2.login("", "");
        admin2.login("", "admin");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "admin" + "'", str12, "admin");
    }

    @Test
    public void test14256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14256");
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
        admin2.viewProfile();
        admin2.logout();
        room.Room room22 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.disableRoom(room22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "admin" + "'", str4, "admin");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "admin" + "'", str19, "admin");
    }

    @Test
    public void test14257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14257");
        model.Admin admin2 = new model.Admin("admin", "admin");
        admin2.viewProfile();
        java.lang.String str4 = admin2.getPassword();
        admin2.login("", "");
        java.lang.String str8 = admin2.getEmail();
        java.lang.String str9 = admin2.getAccountType();
        admin2.login("", "");
        java.lang.String str13 = admin2.getAccountType();
        double double14 = admin2.getHourlyRate();
        admin2.viewProfile();
        java.lang.String str16 = admin2.getPassword();
        admin2.logout();
        admin2.viewProfile();
        room.Room room19 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.disableRoom(room19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "admin" + "'", str4, "admin");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "admin" + "'", str8, "admin");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "admin" + "'", str9, "admin");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "admin" + "'", str13, "admin");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "admin" + "'", str16, "admin");
    }

    @Test
    public void test14258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14258");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        admin2.logout();
        java.lang.String str5 = admin2.getAccountType();
        admin2.login("", "");
        java.lang.String str9 = admin2.getID();
        java.lang.String str10 = admin2.getEmail();
        java.lang.String str11 = admin2.getAccountType();
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
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "admin" + "'", str9, "admin");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "admin" + "'", str11, "admin");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test14259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14259");
        model.Admin admin2 = new model.Admin("", "");
        java.lang.String str3 = admin2.getAccountType();
        admin2.setVerified(true);
        java.lang.String str6 = admin2.getAccountType();
        admin2.logout();
        double double8 = admin2.getHourlyRate();
        double double9 = admin2.getHourlyRate();
        boolean boolean10 = admin2.isVerified();
        java.lang.String str11 = admin2.getID();
        java.lang.String str12 = admin2.getPassword();
        admin2.viewProfile();
        java.lang.String str14 = admin2.getAccountType();
        admin2.setVerified(false);
        room.Room room17 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.addRoom(room17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.getRoomID()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "admin" + "'", str6, "admin");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "admin" + "'", str11, "admin");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "admin" + "'", str14, "admin");
    }

    @Test
    public void test14260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14260");
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
        java.lang.String str18 = admin2.getPassword();
        admin2.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "admin" + "'", str4, "admin");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "admin" + "'", str16, "admin");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "admin" + "'", str18, "admin");
    }

    @Test
    public void test14261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14261");
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
        java.lang.String str16 = admin2.getPassword();
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
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test14262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14262");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        java.lang.String str5 = admin2.getID();
        java.lang.String str6 = admin2.getID();
        java.lang.String str7 = admin2.getAccountType();
        admin2.logout();
        java.lang.String str9 = admin2.getID();
        admin2.login("admin", "");
        admin2.viewProfile();
        double double14 = admin2.getHourlyRate();
        admin2.logout();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "admin" + "'", str6, "admin");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "admin" + "'", str9, "admin");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test14263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14263");
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
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "admin" + "'", str11, "admin");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "admin" + "'", str12, "admin");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test14264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14264");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        admin2.logout();
        java.lang.String str5 = admin2.getAccountType();
        boolean boolean6 = admin2.isVerified();
        java.lang.String str7 = admin2.getID();
        java.lang.String str8 = admin2.getID();
        double double9 = admin2.getHourlyRate();
        double double10 = admin2.getHourlyRate();
        admin2.viewProfile();
        java.lang.String str12 = admin2.getEmail();
        java.lang.String str13 = admin2.getEmail();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "admin" + "'", str8, "admin");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test14265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14265");
        model.Admin admin2 = new model.Admin("admin", "admin");
        admin2.viewProfile();
        java.lang.String str4 = admin2.getID();
        java.lang.String str5 = admin2.getPassword();
        double double6 = admin2.getHourlyRate();
        java.lang.String str7 = admin2.getEmail();
        java.lang.String str8 = admin2.getEmail();
        java.lang.String str9 = admin2.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "admin" + "'", str4, "admin");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "admin" + "'", str8, "admin");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "admin" + "'", str9, "admin");
    }

    @Test
    public void test14266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14266");
        model.Admin admin2 = new model.Admin("admin", "admin");
        boolean boolean3 = admin2.isVerified();
        admin2.login("hi!", "");
        java.lang.String str7 = admin2.getEmail();
        admin2.logout();
        java.lang.String str9 = admin2.getID();
        admin2.login("", "hi!");
        admin2.viewProfile();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "admin" + "'", str9, "admin");
    }

    @Test
    public void test14267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14267");
        model.Admin admin2 = new model.Admin("admin", "admin");
        boolean boolean3 = admin2.isVerified();
        java.lang.String str4 = admin2.getEmail();
        java.lang.String str5 = admin2.getEmail();
        double double6 = admin2.getHourlyRate();
        admin2.logout();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "admin" + "'", str4, "admin");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test14268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14268");
        model.Admin admin2 = new model.Admin("", "admin");
        java.lang.String str3 = admin2.getEmail();
        java.lang.String str4 = admin2.getPassword();
        double double5 = admin2.getHourlyRate();
        double double6 = admin2.getHourlyRate();
        java.lang.String str7 = admin2.getPassword();
        java.lang.String str8 = admin2.getAccountType();
        admin2.login("admin", "");
        admin2.viewProfile();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "admin" + "'", str4, "admin");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "admin" + "'", str8, "admin");
    }

    @Test
    public void test14269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14269");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        admin2.logout();
        java.lang.String str5 = admin2.getAccountType();
        boolean boolean6 = admin2.isVerified();
        java.lang.String str7 = admin2.getAccountType();
        admin2.login("", "hi!");
        admin2.login("hi!", "hi!");
        boolean boolean14 = admin2.isVerified();
        boolean boolean15 = admin2.isVerified();
        admin2.viewProfile();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test14270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14270");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        admin2.logout();
        java.lang.String str5 = admin2.getAccountType();
        admin2.login("", "");
        java.lang.String str9 = admin2.getPassword();
        admin2.setVerified(false);
        java.lang.String str12 = admin2.getID();
        admin2.logout();
        admin2.setVerified(false);
        admin2.viewProfile();
        java.lang.String str17 = admin2.getPassword();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "admin" + "'", str12, "admin");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test14271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14271");
        model.Admin admin2 = new model.Admin("admin", "admin");
        admin2.login("admin", "admin");
        admin2.setVerified(false);
        boolean boolean8 = admin2.isVerified();
        boolean boolean9 = admin2.isVerified();
        java.lang.String str10 = admin2.getAccountType();
        admin2.setVerified(false);
        java.lang.String str13 = admin2.getPassword();
        admin2.logout();
        admin2.setVerified(true);
        java.lang.String str17 = admin2.getID();
        java.lang.String str18 = admin2.getEmail();
        java.lang.String str19 = admin2.getEmail();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "admin" + "'", str10, "admin");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "admin" + "'", str13, "admin");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "admin" + "'", str17, "admin");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "admin" + "'", str18, "admin");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "admin" + "'", str19, "admin");
    }

    @Test
    public void test14272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14272");
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
        boolean boolean17 = admin2.isVerified();
        boolean boolean18 = admin2.isVerified();
        java.lang.String str19 = admin2.getPassword();
        java.lang.String str20 = admin2.getAccountType();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "admin" + "'", str20, "admin");
    }

    @Test
    public void test14273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14273");
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
        boolean boolean16 = admin2.isVerified();
        admin2.setVerified(false);
        admin2.viewProfile();
        admin2.login("", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test14274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14274");
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
        admin2.setVerified(false);
        java.lang.String str16 = admin2.getAccountType();
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
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "admin" + "'", str16, "admin");
    }

    @Test
    public void test14275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14275");
        model.Admin admin2 = new model.Admin("", "");
        java.lang.String str3 = admin2.getAccountType();
        java.lang.String str4 = admin2.getEmail();
        java.lang.String str5 = admin2.getID();
        double double6 = admin2.getHourlyRate();
        java.lang.String str7 = admin2.getAccountType();
        admin2.setVerified(false);
        admin2.viewProfile();
        admin2.login("hi!", "hi!");
        java.lang.String str14 = admin2.getPassword();
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
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test14276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14276");
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
        java.lang.String str21 = admin2.getID();
        double double22 = admin2.getHourlyRate();
        boolean boolean23 = admin2.isVerified();
        admin2.login("admin", "admin");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "admin" + "'", str4, "admin");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "admin" + "'", str8, "admin");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "admin" + "'", str9, "admin");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "admin" + "'", str13, "admin");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "admin" + "'", str17, "admin");
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "admin" + "'", str21, "admin");
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test14277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14277");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        admin2.logout();
        java.lang.String str5 = admin2.getAccountType();
        java.lang.String str6 = admin2.getEmail();
        java.lang.String str7 = admin2.getPassword();
        admin2.logout();
        java.lang.String str9 = admin2.getAccountType();
        admin2.login("admin", "admin");
        java.lang.String str13 = admin2.getEmail();
        double double14 = admin2.getHourlyRate();
        boolean boolean15 = admin2.isVerified();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "admin" + "'", str9, "admin");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test14278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14278");
        model.Admin admin2 = new model.Admin("", "");
        java.lang.String str3 = admin2.getAccountType();
        java.lang.String str4 = admin2.getEmail();
        double double5 = admin2.getHourlyRate();
        admin2.logout();
        admin2.viewProfile();
        admin2.logout();
        java.lang.String str9 = admin2.getPassword();
        admin2.logout();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test14279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14279");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        admin2.logout();
        admin2.setVerified(false);
        java.lang.String str6 = admin2.getEmail();
        admin2.setVerified(false);
        boolean boolean9 = admin2.isVerified();
        java.lang.String str10 = admin2.getID();
        java.lang.Class<?> wildcardClass11 = admin2.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "admin" + "'", str10, "admin");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test14280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14280");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        double double5 = admin2.getHourlyRate();
        double double6 = admin2.getHourlyRate();
        java.lang.String str7 = admin2.getID();
        java.lang.String str8 = admin2.getAccountType();
        java.lang.String str9 = admin2.getEmail();
        double double10 = admin2.getHourlyRate();
        admin2.logout();
        java.lang.String str12 = admin2.getEmail();
        java.lang.String str13 = admin2.getEmail();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "admin" + "'", str8, "admin");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test14281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14281");
        model.Admin admin2 = new model.Admin("admin", "admin");
        admin2.viewProfile();
        java.lang.String str4 = admin2.getPassword();
        admin2.login("", "");
        boolean boolean8 = admin2.isVerified();
        admin2.setVerified(true);
        admin2.setVerified(false);
        admin2.viewProfile();
        java.lang.String str14 = admin2.getEmail();
        java.lang.String str15 = admin2.getPassword();
        boolean boolean16 = admin2.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "admin" + "'", str4, "admin");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "admin" + "'", str14, "admin");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "admin" + "'", str15, "admin");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test14282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14282");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        double double5 = admin2.getHourlyRate();
        admin2.login("admin", "hi!");
        admin2.viewProfile();
        admin2.setVerified(true);
        admin2.setVerified(false);
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
    }

    @Test
    public void test14283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14283");
        model.Admin admin2 = new model.Admin("admin", "admin");
        admin2.viewProfile();
        java.lang.String str4 = admin2.getPassword();
        double double5 = admin2.getHourlyRate();
        java.lang.String str6 = admin2.getAccountType();
        boolean boolean7 = admin2.isVerified();
        double double8 = admin2.getHourlyRate();
        double double9 = admin2.getHourlyRate();
        java.lang.String str10 = admin2.getAccountType();
        room.Room room11 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.addRoom(room11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.getRoomID()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "admin" + "'", str4, "admin");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "admin" + "'", str6, "admin");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "admin" + "'", str10, "admin");
    }

    @Test
    public void test14284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14284");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        double double5 = admin2.getHourlyRate();
        double double6 = admin2.getHourlyRate();
        java.lang.String str7 = admin2.getPassword();
        java.lang.String str8 = admin2.getEmail();
        boolean boolean9 = admin2.isVerified();
        double double10 = admin2.getHourlyRate();
        boolean boolean11 = admin2.isVerified();
        java.lang.String str12 = admin2.getPassword();
        boolean boolean13 = admin2.isVerified();
        boolean boolean14 = admin2.isVerified();
        java.lang.Class<?> wildcardClass15 = admin2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test14285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14285");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        java.lang.String str4 = admin2.getEmail();
        admin2.logout();
        admin2.logout();
        java.lang.String str7 = admin2.getPassword();
        admin2.login("hi!", "");
        java.lang.String str11 = admin2.getID();
        java.lang.String str12 = admin2.getAccountType();
        java.lang.String str13 = admin2.getEmail();
        java.lang.Class<?> wildcardClass14 = admin2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "admin" + "'", str11, "admin");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "admin" + "'", str12, "admin");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test14286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14286");
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
        boolean boolean16 = admin2.isVerified();
        admin2.logout();
        admin2.login("hi!", "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "admin" + "'", str12, "admin");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test14287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14287");
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
        java.lang.String str14 = admin2.getAccountType();
        java.lang.String str15 = admin2.getEmail();
        java.lang.String str16 = admin2.getPassword();
        double double17 = admin2.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "admin" + "'", str4, "admin");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "admin" + "'", str8, "admin");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "admin" + "'", str9, "admin");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "admin" + "'", str10, "admin");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "admin" + "'", str12, "admin");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "admin" + "'", str14, "admin");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "admin" + "'", str15, "admin");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "admin" + "'", str16, "admin");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
    }

    @Test
    public void test14288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14288");
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
        admin2.viewProfile();
        admin2.logout();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test14289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14289");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getAccountType();
        boolean boolean4 = admin2.isVerified();
        java.lang.String str5 = admin2.getPassword();
        admin2.logout();
        admin2.logout();
        double double8 = admin2.getHourlyRate();
        java.lang.String str9 = admin2.getPassword();
        double double10 = admin2.getHourlyRate();
        admin2.login("admin", "hi!");
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
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test14290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14290");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getPassword();
        admin2.setVerified(true);
        admin2.logout();
        admin2.setVerified(true);
        java.lang.String str9 = admin2.getID();
        admin2.viewProfile();
        java.lang.String str11 = admin2.getAccountType();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "admin" + "'", str9, "admin");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "admin" + "'", str11, "admin");
    }

    @Test
    public void test14291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14291");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getAccountType();
        boolean boolean4 = admin2.isVerified();
        java.lang.String str5 = admin2.getPassword();
        admin2.logout();
        java.lang.String str7 = admin2.getPassword();
        admin2.login("hi!", "admin");
        java.lang.String str11 = admin2.getAccountType();
        java.lang.String str12 = admin2.getAccountType();
        admin2.viewProfile();
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
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "admin" + "'", str11, "admin");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "admin" + "'", str12, "admin");
    }

    @Test
    public void test14292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14292");
        model.Admin admin2 = new model.Admin("admin", "");
        admin2.setVerified(true);
        java.lang.String str5 = admin2.getEmail();
        double double6 = admin2.getHourlyRate();
        admin2.viewProfile();
        admin2.viewProfile();
        admin2.viewProfile();
        admin2.setVerified(true);
        double double12 = admin2.getHourlyRate();
        admin2.logout();
        admin2.login("", "");
        room.Room room17 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.disableRoom(room17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test14293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14293");
        model.Admin admin2 = new model.Admin("admin", "admin");
        admin2.login("admin", "admin");
        boolean boolean6 = admin2.isVerified();
        admin2.logout();
        java.lang.String str8 = admin2.getID();
        admin2.logout();
        double double10 = admin2.getHourlyRate();
        boolean boolean11 = admin2.isVerified();
        admin2.login("", "admin");
        admin2.viewProfile();
        boolean boolean16 = admin2.isVerified();
        java.lang.String str17 = admin2.getID();
        boolean boolean18 = admin2.isVerified();
        admin2.viewProfile();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "admin" + "'", str8, "admin");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "admin" + "'", str17, "admin");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test14294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14294");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        admin2.logout();
        java.lang.String str5 = admin2.getID();
        admin2.logout();
        java.lang.String str7 = admin2.getPassword();
        admin2.login("", "admin");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test14295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14295");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        double double5 = admin2.getHourlyRate();
        double double6 = admin2.getHourlyRate();
        java.lang.String str7 = admin2.getPassword();
        double double8 = admin2.getHourlyRate();
        admin2.setVerified(true);
        admin2.login("hi!", "hi!");
        java.lang.String str14 = admin2.getEmail();
        java.lang.String str15 = admin2.getPassword();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test14296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14296");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        double double5 = admin2.getHourlyRate();
        admin2.login("admin", "hi!");
        admin2.setVerified(true);
        java.lang.String str11 = admin2.getEmail();
        admin2.setVerified(false);
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
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "admin" + "'", str14, "admin");
    }

    @Test
    public void test14297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14297");
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
        admin2.viewProfile();
        java.lang.String str16 = admin2.getAccountType();
        admin2.login("", "admin");
        java.lang.String str20 = admin2.getID();
        admin2.setVerified(false);
        java.lang.String str23 = admin2.getID();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "admin" + "'", str16, "admin");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "admin" + "'", str20, "admin");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "admin" + "'", str23, "admin");
    }

    @Test
    public void test14298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14298");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        java.lang.String str4 = admin2.getEmail();
        admin2.logout();
        admin2.logout();
        java.lang.String str7 = admin2.getPassword();
        admin2.viewProfile();
        java.lang.String str9 = admin2.getAccountType();
        admin2.logout();
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
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "admin" + "'", str9, "admin");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test14299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14299");
        model.Admin admin2 = new model.Admin("admin", "admin");
        admin2.login("admin", "admin");
        admin2.setVerified(false);
        boolean boolean8 = admin2.isVerified();
        boolean boolean9 = admin2.isVerified();
        java.lang.String str10 = admin2.getAccountType();
        admin2.setVerified(false);
        java.lang.String str13 = admin2.getPassword();
        admin2.logout();
        java.lang.String str15 = admin2.getAccountType();
        room.Room room16 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.enableRoom(room16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "admin" + "'", str10, "admin");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "admin" + "'", str13, "admin");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "admin" + "'", str15, "admin");
    }

    @Test
    public void test14300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14300");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        java.lang.String str4 = admin2.getEmail();
        java.lang.String str5 = admin2.getAccountType();
        admin2.setVerified(false);
        admin2.viewProfile();
        admin2.login("", "admin");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
    }

    @Test
    public void test14301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14301");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        admin2.logout();
        admin2.setVerified(false);
        java.lang.String str6 = admin2.getEmail();
        admin2.viewProfile();
        admin2.viewProfile();
        java.lang.String str9 = admin2.getID();
        double double10 = admin2.getHourlyRate();
        admin2.setVerified(false);
        admin2.viewProfile();
        boolean boolean14 = admin2.isVerified();
        admin2.setVerified(true);
        java.lang.String str17 = admin2.getPassword();
        admin2.login("admin", "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "admin" + "'", str9, "admin");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test14302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14302");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        admin2.logout();
        java.lang.String str5 = admin2.getAccountType();
        admin2.viewProfile();
        admin2.logout();
        double double8 = admin2.getHourlyRate();
        double double9 = admin2.getHourlyRate();
        java.lang.String str10 = admin2.getID();
        double double11 = admin2.getHourlyRate();
        double double12 = admin2.getHourlyRate();
        admin2.login("", "admin");
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
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "admin" + "'", str10, "admin");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test14303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14303");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        admin2.logout();
        java.lang.String str5 = admin2.getAccountType();
        boolean boolean6 = admin2.isVerified();
        java.lang.String str7 = admin2.getAccountType();
        java.lang.String str8 = admin2.getAccountType();
        admin2.setVerified(false);
        java.lang.String str11 = admin2.getAccountType();
        admin2.viewProfile();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "admin" + "'", str8, "admin");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "admin" + "'", str11, "admin");
    }

    @Test
    public void test14304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14304");
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
        java.lang.String str14 = admin2.getID();
        admin2.viewProfile();
        admin2.viewProfile();
        double double17 = admin2.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "admin" + "'", str13, "admin");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "admin" + "'", str14, "admin");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
    }

    @Test
    public void test14305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14305");
        model.Admin admin2 = new model.Admin("admin", "");
        admin2.login("hi!", "admin");
        boolean boolean6 = admin2.isVerified();
        admin2.setVerified(true);
        admin2.logout();
        admin2.setVerified(true);
        double double12 = admin2.getHourlyRate();
        room.Room room13 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.addRoom(room13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.getRoomID()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test14306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14306");
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
        admin2.login("", "admin");
        java.lang.String str19 = admin2.getAccountType();
        java.lang.String str20 = admin2.getEmail();
        java.lang.String str21 = admin2.getID();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "admin" + "'", str15, "admin");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "admin" + "'", str19, "admin");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "admin" + "'", str21, "admin");
    }

    @Test
    public void test14307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14307");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        double double5 = admin2.getHourlyRate();
        admin2.setVerified(true);
        admin2.logout();
        java.lang.String str9 = admin2.getAccountType();
        java.lang.String str10 = admin2.getAccountType();
        double double11 = admin2.getHourlyRate();
        admin2.viewProfile();
        java.lang.String str13 = admin2.getPassword();
        java.lang.String str14 = admin2.getEmail();
        admin2.logout();
        java.lang.String str16 = admin2.getAccountType();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "admin" + "'", str9, "admin");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "admin" + "'", str10, "admin");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "admin" + "'", str16, "admin");
    }

    @Test
    public void test14308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14308");
        model.Admin admin2 = new model.Admin("admin", "admin");
        boolean boolean3 = admin2.isVerified();
        admin2.login("hi!", "");
        double double7 = admin2.getHourlyRate();
        java.lang.String str8 = admin2.getID();
        admin2.viewProfile();
        boolean boolean10 = admin2.isVerified();
        java.lang.String str11 = admin2.getPassword();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "admin" + "'", str8, "admin");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "admin" + "'", str11, "admin");
    }

    @Test
    public void test14309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14309");
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
        java.lang.String str14 = admin2.getID();
        java.lang.String str15 = admin2.getID();
        java.lang.String str16 = admin2.getID();
        admin2.viewProfile();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "admin" + "'", str8, "admin");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "admin" + "'", str11, "admin");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "admin" + "'", str14, "admin");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "admin" + "'", str15, "admin");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "admin" + "'", str16, "admin");
    }

    @Test
    public void test14310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14310");
        model.Admin admin2 = new model.Admin("admin", "admin");
        admin2.viewProfile();
        java.lang.String str4 = admin2.getPassword();
        admin2.login("", "");
        boolean boolean8 = admin2.isVerified();
        admin2.setVerified(true);
        admin2.setVerified(false);
        admin2.setVerified(false);
        admin2.viewProfile();
        java.lang.String str16 = admin2.getPassword();
        admin2.login("admin", "admin");
        boolean boolean20 = admin2.isVerified();
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
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "admin" + "'", str16, "admin");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test14311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14311");
        model.Admin admin2 = new model.Admin("", "");
        java.lang.String str3 = admin2.getAccountType();
        admin2.setVerified(true);
        double double6 = admin2.getHourlyRate();
        admin2.setVerified(false);
        admin2.logout();
        admin2.login("hi!", "");
        admin2.setVerified(true);
        java.lang.String str15 = admin2.getPassword();
        java.lang.String str16 = admin2.getID();
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
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "admin" + "'", str16, "admin");
    }

    @Test
    public void test14312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14312");
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
        admin2.setVerified(false);
        admin2.login("hi!", "hi!");
        admin2.login("hi!", "admin");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "admin" + "'", str4, "admin");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "admin" + "'", str8, "admin");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "admin" + "'", str9, "admin");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "admin" + "'", str13, "admin");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "admin" + "'", str17, "admin");
    }

    @Test
    public void test14313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14313");
        model.Admin admin2 = new model.Admin("admin", "admin");
        admin2.viewProfile();
        java.lang.String str4 = admin2.getPassword();
        double double5 = admin2.getHourlyRate();
        java.lang.String str6 = admin2.getPassword();
        admin2.setVerified(false);
        java.lang.String str9 = admin2.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "admin" + "'", str4, "admin");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "admin" + "'", str6, "admin");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "admin" + "'", str9, "admin");
    }

    @Test
    public void test14314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14314");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        admin2.logout();
        java.lang.String str5 = admin2.getAccountType();
        admin2.viewProfile();
        admin2.logout();
        admin2.login("admin", "");
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
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test14315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14315");
        model.Admin admin2 = new model.Admin("admin", "");
        admin2.setVerified(true);
        boolean boolean5 = admin2.isVerified();
        java.lang.String str6 = admin2.getAccountType();
        admin2.logout();
        boolean boolean8 = admin2.isVerified();
        double double9 = admin2.getHourlyRate();
        java.lang.String str10 = admin2.getEmail();
        java.lang.Class<?> wildcardClass11 = admin2.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "admin" + "'", str6, "admin");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "admin" + "'", str10, "admin");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test14316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14316");
        model.Admin admin2 = new model.Admin("admin", "admin");
        admin2.login("admin", "admin");
        boolean boolean6 = admin2.isVerified();
        admin2.logout();
        admin2.setVerified(false);
        java.lang.String str10 = admin2.getID();
        java.lang.String str11 = admin2.getAccountType();
        double double12 = admin2.getHourlyRate();
        java.lang.String str13 = admin2.getPassword();
        java.lang.String str14 = admin2.getEmail();
        java.lang.String str15 = admin2.getPassword();
        java.lang.String str16 = admin2.getEmail();
        java.lang.String str17 = admin2.getEmail();
        boolean boolean18 = admin2.isVerified();
        admin2.viewProfile();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "admin" + "'", str10, "admin");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "admin" + "'", str11, "admin");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "admin" + "'", str13, "admin");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "admin" + "'", str14, "admin");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "admin" + "'", str15, "admin");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "admin" + "'", str16, "admin");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "admin" + "'", str17, "admin");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test14317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14317");
        model.Admin admin2 = new model.Admin("admin", "");
        admin2.setVerified(true);
        java.lang.String str5 = admin2.getEmail();
        boolean boolean6 = admin2.isVerified();
        admin2.viewProfile();
        admin2.logout();
        java.lang.String str9 = admin2.getEmail();
        room.Room room10 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.addRoom(room10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.getRoomID()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "admin" + "'", str9, "admin");
    }

    @Test
    public void test14318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14318");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        double double5 = admin2.getHourlyRate();
        admin2.login("admin", "hi!");
        admin2.viewProfile();
        admin2.setVerified(true);
        admin2.setVerified(false);
        double double14 = admin2.getHourlyRate();
        admin2.login("hi!", "");
        admin2.login("hi!", "admin");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test14319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14319");
        model.Admin admin2 = new model.Admin("admin", "admin");
        admin2.viewProfile();
        java.lang.String str4 = admin2.getID();
        admin2.logout();
        java.lang.String str6 = admin2.getAccountType();
        admin2.viewProfile();
        double double8 = admin2.getHourlyRate();
        admin2.viewProfile();
        admin2.viewProfile();
        admin2.setVerified(false);
        admin2.viewProfile();
        room.Room room14 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.disableRoom(room14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "admin" + "'", str4, "admin");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "admin" + "'", str6, "admin");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test14320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14320");
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
        admin2.login("admin", "");
        admin2.login("admin", "admin");
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
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test14321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14321");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getAccountType();
        boolean boolean4 = admin2.isVerified();
        java.lang.String str5 = admin2.getPassword();
        admin2.logout();
        admin2.logout();
        admin2.logout();
        admin2.login("", "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test14322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14322");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        admin2.logout();
        java.lang.String str5 = admin2.getAccountType();
        boolean boolean6 = admin2.isVerified();
        java.lang.String str7 = admin2.getAccountType();
        admin2.logout();
        java.lang.String str9 = admin2.getID();
        java.lang.String str10 = admin2.getAccountType();
        admin2.login("", "hi!");
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
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "admin" + "'", str9, "admin");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "admin" + "'", str10, "admin");
    }

    @Test
    public void test14323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14323");
        model.Admin admin2 = new model.Admin("admin", "admin");
        boolean boolean3 = admin2.isVerified();
        admin2.login("hi!", "");
        admin2.viewProfile();
        java.lang.String str8 = admin2.getPassword();
        java.lang.String str9 = admin2.getPassword();
        admin2.login("hi!", "admin");
        java.lang.Class<?> wildcardClass13 = admin2.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "admin" + "'", str8, "admin");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "admin" + "'", str9, "admin");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test14324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14324");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        double double5 = admin2.getHourlyRate();
        double double6 = admin2.getHourlyRate();
        java.lang.String str7 = admin2.getPassword();
        admin2.logout();
        double double9 = admin2.getHourlyRate();
        java.lang.String str10 = admin2.getID();
        java.lang.String str11 = admin2.getID();
        admin2.viewProfile();
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
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "admin" + "'", str10, "admin");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "admin" + "'", str11, "admin");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test14325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14325");
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
        admin2.setVerified(false);
        double double15 = admin2.getHourlyRate();
        admin2.setVerified(true);
        admin2.viewProfile();
        java.lang.String str19 = admin2.getPassword();
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
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test14326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14326");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getAccountType();
        boolean boolean4 = admin2.isVerified();
        boolean boolean5 = admin2.isVerified();
        admin2.logout();
        admin2.login("admin", "hi!");
        java.lang.String str10 = admin2.getPassword();
        java.lang.String str11 = admin2.getAccountType();
        java.lang.String str12 = admin2.getID();
        double double13 = admin2.getHourlyRate();
        admin2.login("", "");
        java.lang.String str17 = admin2.getAccountType();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "admin" + "'", str11, "admin");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "admin" + "'", str12, "admin");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "admin" + "'", str17, "admin");
    }

    @Test
    public void test14327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14327");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        java.lang.String str5 = admin2.getAccountType();
        java.lang.String str6 = admin2.getEmail();
        admin2.viewProfile();
        java.lang.String str8 = admin2.getEmail();
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
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test14328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14328");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        admin2.setVerified(true);
        java.lang.String str5 = admin2.getID();
        admin2.setVerified(false);
        java.lang.String str8 = admin2.getAccountType();
        java.lang.String str9 = admin2.getEmail();
        admin2.login("admin", "");
        java.lang.String str13 = admin2.getAccountType();
        room.Room room14 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.addRoom(room14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.getRoomID()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "admin" + "'", str8, "admin");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "admin" + "'", str13, "admin");
    }

    @Test
    public void test14329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14329");
        model.Admin admin2 = new model.Admin("admin", "admin");
        boolean boolean3 = admin2.isVerified();
        admin2.login("hi!", "");
        double double7 = admin2.getHourlyRate();
        java.lang.String str8 = admin2.getID();
        double double9 = admin2.getHourlyRate();
        admin2.viewProfile();
        admin2.setVerified(true);
        java.lang.String str13 = admin2.getEmail();
        java.lang.String str14 = admin2.getID();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "admin" + "'", str8, "admin");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "admin" + "'", str13, "admin");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "admin" + "'", str14, "admin");
    }

    @Test
    public void test14330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14330");
        model.Admin admin2 = new model.Admin("admin", "");
        admin2.setVerified(true);
        admin2.logout();
        admin2.login("admin", "hi!");
        admin2.logout();
    }

    @Test
    public void test14331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14331");
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
        java.lang.String str19 = admin2.getEmail();
        boolean boolean20 = admin2.isVerified();
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
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test14332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14332");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        admin2.logout();
        java.lang.String str4 = admin2.getAccountType();
        boolean boolean5 = admin2.isVerified();
        admin2.viewProfile();
        double double7 = admin2.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "admin" + "'", str4, "admin");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test14333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14333");
        model.Admin admin2 = new model.Admin("admin", "");
        admin2.setVerified(true);
        admin2.logout();
        admin2.logout();
        room.Room room7 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.disableRoom(room7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test14334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14334");
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
        boolean boolean14 = admin2.isVerified();
        admin2.login("hi!", "hi!");
        admin2.login("admin", "admin");
        admin2.logout();
        java.lang.String str22 = admin2.getID();
        java.lang.Class<?> wildcardClass23 = admin2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "admin" + "'", str9, "admin");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "admin" + "'", str22, "admin");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test14335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14335");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        admin2.logout();
        java.lang.String str5 = admin2.getAccountType();
        boolean boolean6 = admin2.isVerified();
        admin2.login("hi!", "");
        java.lang.String str10 = admin2.getEmail();
        double double11 = admin2.getHourlyRate();
        admin2.viewProfile();
        boolean boolean13 = admin2.isVerified();
        java.lang.String str14 = admin2.getPassword();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test14336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14336");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getAccountType();
        java.lang.String str4 = admin2.getPassword();
        admin2.setVerified(true);
        java.lang.String str7 = admin2.getEmail();
        java.lang.String str8 = admin2.getEmail();
        double double9 = admin2.getHourlyRate();
        double double10 = admin2.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test14337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14337");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getAccountType();
        java.lang.String str4 = admin2.getPassword();
        admin2.setVerified(true);
        java.lang.String str7 = admin2.getID();
        java.lang.String str8 = admin2.getEmail();
        admin2.login("admin", "");
        admin2.setVerified(false);
        java.lang.String str14 = admin2.getID();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "admin" + "'", str14, "admin");
    }

    @Test
    public void test14338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14338");
        model.Admin admin2 = new model.Admin("admin", "admin");
        admin2.login("admin", "admin");
        boolean boolean6 = admin2.isVerified();
        admin2.logout();
        java.lang.String str8 = admin2.getID();
        admin2.logout();
        java.lang.String str10 = admin2.getEmail();
        admin2.logout();
        java.lang.String str12 = admin2.getAccountType();
        double double13 = admin2.getHourlyRate();
        java.lang.String str14 = admin2.getID();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "admin" + "'", str8, "admin");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "admin" + "'", str10, "admin");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "admin" + "'", str12, "admin");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "admin" + "'", str14, "admin");
    }

    @Test
    public void test14339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14339");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        admin2.logout();
        java.lang.String str5 = admin2.getAccountType();
        admin2.login("", "");
        java.lang.String str9 = admin2.getPassword();
        double double10 = admin2.getHourlyRate();
        admin2.login("", "");
        admin2.viewProfile();
        java.lang.String str15 = admin2.getPassword();
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
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test14340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14340");
        model.Admin admin2 = new model.Admin("admin", "admin");
        admin2.viewProfile();
        java.lang.String str4 = admin2.getPassword();
        double double5 = admin2.getHourlyRate();
        java.lang.String str6 = admin2.getAccountType();
        boolean boolean7 = admin2.isVerified();
        admin2.logout();
        java.lang.String str9 = admin2.getID();
        java.lang.String str10 = admin2.getID();
        admin2.setVerified(true);
        java.lang.String str13 = admin2.getEmail();
        java.lang.String str14 = admin2.getID();
        boolean boolean15 = admin2.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "admin" + "'", str4, "admin");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "admin" + "'", str6, "admin");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "admin" + "'", str9, "admin");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "admin" + "'", str10, "admin");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "admin" + "'", str13, "admin");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "admin" + "'", str14, "admin");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test14341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14341");
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
        java.lang.String str16 = admin2.getID();
        java.lang.String str17 = admin2.getAccountType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "admin" + "'", str13, "admin");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "admin" + "'", str16, "admin");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "admin" + "'", str17, "admin");
    }

    @Test
    public void test14342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14342");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        double double5 = admin2.getHourlyRate();
        double double6 = admin2.getHourlyRate();
        java.lang.String str7 = admin2.getID();
        admin2.viewProfile();
        admin2.logout();
        java.lang.String str10 = admin2.getEmail();
        java.lang.String str11 = admin2.getAccountType();
        admin2.login("", "admin");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "admin" + "'", str11, "admin");
    }

    @Test
    public void test14343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14343");
        model.Admin admin2 = new model.Admin("admin", "hi!");
        admin2.login("", "hi!");
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
    public void test14344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14344");
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
        double double15 = admin2.getHourlyRate();
        admin2.login("admin", "hi!");
        admin2.logout();
        java.lang.String str20 = admin2.getPassword();
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
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "admin" + "'", str9, "admin");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "admin" + "'", str11, "admin");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test14345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14345");
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
        double double13 = admin2.getHourlyRate();
        java.lang.String str14 = admin2.getEmail();
        admin2.login("admin", "admin");
        admin2.setVerified(false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test14346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14346");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        admin2.logout();
        java.lang.String str5 = admin2.getAccountType();
        boolean boolean6 = admin2.isVerified();
        admin2.login("hi!", "");
        java.lang.String str10 = admin2.getEmail();
        java.lang.String str11 = admin2.getAccountType();
        admin2.viewProfile();
        double double13 = admin2.getHourlyRate();
        admin2.login("hi!", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "admin" + "'", str11, "admin");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test14347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14347");
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
        boolean boolean14 = admin2.isVerified();
        admin2.login("", "admin");
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
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test14348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14348");
        model.Admin admin2 = new model.Admin("admin", "hi!");
        java.lang.String str3 = admin2.getPassword();
        java.lang.String str4 = admin2.getEmail();
        java.lang.String str5 = admin2.getAccountType();
        java.lang.String str6 = admin2.getAccountType();
        boolean boolean7 = admin2.isVerified();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "admin" + "'", str4, "admin");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "admin" + "'", str6, "admin");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test14349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14349");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        double double5 = admin2.getHourlyRate();
        double double6 = admin2.getHourlyRate();
        java.lang.String str7 = admin2.getID();
        double double8 = admin2.getHourlyRate();
        admin2.setVerified(false);
        java.lang.String str11 = admin2.getEmail();
        admin2.login("hi!", "");
        java.lang.String str15 = admin2.getAccountType();
        admin2.login("", "");
        java.lang.String str19 = admin2.getEmail();
        admin2.logout();
        java.lang.String str21 = admin2.getEmail();
        admin2.logout();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "admin" + "'", str15, "admin");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
    }

    @Test
    public void test14350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14350");
        model.Admin admin2 = new model.Admin("admin", "");
        admin2.logout();
        double double4 = admin2.getHourlyRate();
        admin2.setVerified(false);
        double double7 = admin2.getHourlyRate();
        java.lang.String str8 = admin2.getPassword();
        room.Room room9 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.disableRoom(room9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test14351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14351");
        model.Admin admin2 = new model.Admin("", "");
        java.lang.String str3 = admin2.getAccountType();
        admin2.setVerified(true);
        java.lang.String str6 = admin2.getAccountType();
        admin2.logout();
        double double8 = admin2.getHourlyRate();
        java.lang.String str9 = admin2.getPassword();
        admin2.login("hi!", "hi!");
        admin2.login("", "");
        java.lang.String str16 = admin2.getEmail();
        double double17 = admin2.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "admin" + "'", str6, "admin");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
    }

    @Test
    public void test14352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14352");
        model.Admin admin2 = new model.Admin("hi!", "");
        java.lang.String str3 = admin2.getEmail();
        java.lang.String str4 = admin2.getAccountType();
        boolean boolean5 = admin2.isVerified();
        java.lang.String str6 = admin2.getAccountType();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "admin" + "'", str4, "admin");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "admin" + "'", str6, "admin");
    }

    @Test
    public void test14353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14353");
        model.Admin admin2 = new model.Admin("admin", "");
        admin2.setVerified(true);
        boolean boolean5 = admin2.isVerified();
        java.lang.String str6 = admin2.getID();
        admin2.logout();
        java.lang.String str8 = admin2.getID();
        admin2.viewProfile();
        java.lang.Class<?> wildcardClass10 = admin2.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "admin" + "'", str6, "admin");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "admin" + "'", str8, "admin");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test14354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14354");
        model.Admin admin2 = new model.Admin("admin", "");
        admin2.setVerified(true);
        java.lang.String str5 = admin2.getEmail();
        double double6 = admin2.getHourlyRate();
        java.lang.String str7 = admin2.getPassword();
        admin2.login("", "");
        java.lang.String str11 = admin2.getPassword();
        admin2.login("", "");
        java.lang.String str15 = admin2.getAccountType();
        room.Room room16 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.addRoom(room16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.getRoomID()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "admin" + "'", str15, "admin");
    }

    @Test
    public void test14355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14355");
        model.Admin admin2 = new model.Admin("", "");
        java.lang.String str3 = admin2.getAccountType();
        java.lang.String str4 = admin2.getEmail();
        admin2.login("hi!", "");
        java.lang.String str8 = admin2.getAccountType();
        java.lang.String str9 = admin2.getID();
        admin2.logout();
        java.lang.String str11 = admin2.getID();
        java.lang.String str12 = admin2.getEmail();
        java.lang.String str13 = admin2.getEmail();
        java.lang.String str14 = admin2.getEmail();
        boolean boolean15 = admin2.isVerified();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "admin" + "'", str8, "admin");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "admin" + "'", str9, "admin");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "admin" + "'", str11, "admin");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test14356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14356");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        admin2.logout();
        java.lang.String str5 = admin2.getAccountType();
        admin2.viewProfile();
        admin2.login("hi!", "admin");
        boolean boolean10 = admin2.isVerified();
        admin2.logout();
        admin2.logout();
        admin2.setVerified(false);
        double double15 = admin2.getHourlyRate();
        java.lang.String str16 = admin2.getID();
        admin2.viewProfile();
        admin2.login("hi!", "hi!");
        admin2.login("hi!", "");
        admin2.logout();
        java.lang.String str25 = admin2.getAccountType();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "admin" + "'", str16, "admin");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "admin" + "'", str25, "admin");
    }

    @Test
    public void test14357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14357");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        java.lang.String str4 = admin2.getEmail();
        boolean boolean5 = admin2.isVerified();
        java.lang.String str6 = admin2.getAccountType();
        admin2.viewProfile();
        java.lang.String str8 = admin2.getAccountType();
        admin2.login("admin", "");
        admin2.login("", "admin");
        admin2.logout();
        java.lang.String str16 = admin2.getID();
        admin2.viewProfile();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "admin" + "'", str6, "admin");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "admin" + "'", str8, "admin");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "admin" + "'", str16, "admin");
    }

    @Test
    public void test14358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14358");
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
        java.lang.String str12 = admin2.getPassword();
        java.lang.String str13 = admin2.getID();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "admin" + "'", str8, "admin");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "admin" + "'", str9, "admin");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "admin" + "'", str10, "admin");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "admin" + "'", str13, "admin");
    }

    @Test
    public void test14359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14359");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        java.lang.String str5 = admin2.getID();
        boolean boolean6 = admin2.isVerified();
        admin2.logout();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test14360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14360");
        model.Admin admin2 = new model.Admin("admin", "admin");
        admin2.login("admin", "admin");
        boolean boolean6 = admin2.isVerified();
        admin2.logout();
        java.lang.String str8 = admin2.getID();
        admin2.logout();
        java.lang.String str10 = admin2.getID();
        boolean boolean11 = admin2.isVerified();
        admin2.login("admin", "");
        java.lang.String str15 = admin2.getEmail();
        java.lang.String str16 = admin2.getPassword();
        double double17 = admin2.getHourlyRate();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "admin" + "'", str8, "admin");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "admin" + "'", str10, "admin");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "admin" + "'", str15, "admin");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "admin" + "'", str16, "admin");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
    }

    @Test
    public void test14361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14361");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        admin2.logout();
        java.lang.String str4 = admin2.getAccountType();
        java.lang.String str5 = admin2.getAccountType();
        java.lang.String str6 = admin2.getPassword();
        double double7 = admin2.getHourlyRate();
        java.lang.String str8 = admin2.getPassword();
        admin2.logout();
        admin2.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "admin" + "'", str4, "admin");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test14362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14362");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getAccountType();
        boolean boolean4 = admin2.isVerified();
        boolean boolean5 = admin2.isVerified();
        admin2.viewProfile();
        admin2.login("admin", "hi!");
        java.lang.String str10 = admin2.getPassword();
        admin2.login("", "hi!");
        double double14 = admin2.getHourlyRate();
        double double15 = admin2.getHourlyRate();
        admin2.viewProfile();
        java.lang.String str17 = admin2.getAccountType();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "admin" + "'", str17, "admin");
    }

    @Test
    public void test14363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14363");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        admin2.login("admin", "hi!");
        java.lang.String str6 = admin2.getAccountType();
        java.lang.String str7 = admin2.getPassword();
        boolean boolean8 = admin2.isVerified();
        admin2.login("", "admin");
        java.lang.String str12 = admin2.getID();
        room.Room room13 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.addRoom(room13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.getRoomID()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "admin" + "'", str6, "admin");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "admin" + "'", str12, "admin");
    }

    @Test
    public void test14364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14364");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        double double5 = admin2.getHourlyRate();
        double double6 = admin2.getHourlyRate();
        java.lang.String str7 = admin2.getID();
        admin2.viewProfile();
        admin2.logout();
        admin2.setVerified(false);
        java.lang.String str12 = admin2.getAccountType();
        admin2.logout();
        admin2.login("hi!", "");
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
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "admin" + "'", str12, "admin");
    }

    @Test
    public void test14365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14365");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        double double4 = admin2.getHourlyRate();
        java.lang.String str5 = admin2.getAccountType();
        java.lang.String str6 = admin2.getPassword();
        java.lang.String str7 = admin2.getEmail();
        admin2.logout();
        double double9 = admin2.getHourlyRate();
        java.lang.String str10 = admin2.getEmail();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test14366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14366");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        admin2.logout();
        java.lang.String str5 = admin2.getAccountType();
        boolean boolean6 = admin2.isVerified();
        admin2.login("hi!", "admin");
        boolean boolean10 = admin2.isVerified();
        admin2.setVerified(false);
        admin2.login("", "hi!");
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
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test14367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14367");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        admin2.logout();
        admin2.setVerified(false);
        java.lang.String str6 = admin2.getEmail();
        admin2.viewProfile();
        admin2.viewProfile();
        double double9 = admin2.getHourlyRate();
        double double10 = admin2.getHourlyRate();
        double double11 = admin2.getHourlyRate();
        admin2.viewProfile();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test14368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14368");
        model.Admin admin2 = new model.Admin("admin", "admin");
        admin2.login("admin", "admin");
        boolean boolean6 = admin2.isVerified();
        admin2.logout();
        java.lang.String str8 = admin2.getID();
        admin2.logout();
        admin2.viewProfile();
        admin2.setVerified(true);
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
    }

    @Test
    public void test14369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14369");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        admin2.logout();
        java.lang.String str5 = admin2.getAccountType();
        boolean boolean6 = admin2.isVerified();
        admin2.login("hi!", "admin");
        boolean boolean10 = admin2.isVerified();
        admin2.setVerified(false);
        java.lang.String str13 = admin2.getEmail();
        java.lang.String str14 = admin2.getEmail();
        boolean boolean15 = admin2.isVerified();
        admin2.viewProfile();
        java.lang.String str17 = admin2.getEmail();
        java.lang.String str18 = admin2.getEmail();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test14370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14370");
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
        java.lang.String str17 = admin2.getPassword();
        admin2.setVerified(true);
        admin2.setVerified(false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "admin" + "'", str11, "admin");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test14371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14371");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        double double5 = admin2.getHourlyRate();
        double double6 = admin2.getHourlyRate();
        java.lang.String str7 = admin2.getPassword();
        admin2.setVerified(true);
        java.lang.String str10 = admin2.getAccountType();
        admin2.viewProfile();
        admin2.setVerified(true);
        java.lang.Class<?> wildcardClass14 = admin2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "admin" + "'", str10, "admin");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test14372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14372");
        model.Admin admin2 = new model.Admin("admin", "");
        double double3 = admin2.getHourlyRate();
        admin2.logout();
        java.lang.String str5 = admin2.getID();
        boolean boolean6 = admin2.isVerified();
        double double7 = admin2.getHourlyRate();
        admin2.logout();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test14373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14373");
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
        admin2.viewProfile();
        admin2.logout();
        boolean boolean15 = admin2.isVerified();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "admin" + "'", str9, "admin");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test14374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14374");
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
        java.lang.String str17 = admin2.getPassword();
        room.Room room18 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.enableRoom(room18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "admin" + "'", str8, "admin");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "admin" + "'", str10, "admin");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "admin" + "'", str15, "admin");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "admin" + "'", str16, "admin");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "admin" + "'", str17, "admin");
    }

    @Test
    public void test14375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14375");
        model.Admin admin2 = new model.Admin("admin", "admin");
        admin2.viewProfile();
        java.lang.String str4 = admin2.getID();
        admin2.logout();
        java.lang.String str6 = admin2.getAccountType();
        double double7 = admin2.getHourlyRate();
        admin2.setVerified(true);
        room.Room room10 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.addRoom(room10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.getRoomID()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "admin" + "'", str4, "admin");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "admin" + "'", str6, "admin");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test14376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14376");
        model.Admin admin2 = new model.Admin("", "");
        java.lang.String str3 = admin2.getAccountType();
        admin2.setVerified(true);
        double double6 = admin2.getHourlyRate();
        admin2.viewProfile();
        boolean boolean8 = admin2.isVerified();
        java.lang.String str9 = admin2.getID();
        admin2.logout();
        java.lang.String str11 = admin2.getPassword();
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
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "admin" + "'", str9, "admin");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test14377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14377");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        admin2.logout();
        java.lang.String str5 = admin2.getAccountType();
        admin2.viewProfile();
        admin2.login("hi!", "admin");
        boolean boolean10 = admin2.isVerified();
        admin2.logout();
        admin2.logout();
        admin2.setVerified(false);
        double double15 = admin2.getHourlyRate();
        java.lang.String str16 = admin2.getID();
        admin2.viewProfile();
        boolean boolean18 = admin2.isVerified();
        boolean boolean19 = admin2.isVerified();
        admin2.setVerified(true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "admin" + "'", str16, "admin");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test14378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14378");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
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
    public void test14379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14379");
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
            admin2.enableRoom(room10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
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
    public void test14380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14380");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        admin2.logout();
        java.lang.String str5 = admin2.getAccountType();
        admin2.login("", "");
        java.lang.String str9 = admin2.getEmail();
        java.lang.String str10 = admin2.getAccountType();
        java.lang.String str11 = admin2.getAccountType();
        admin2.login("", "");
        admin2.logout();
        java.lang.String str16 = admin2.getAccountType();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "admin" + "'", str10, "admin");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "admin" + "'", str11, "admin");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "admin" + "'", str16, "admin");
    }

    @Test
    public void test14381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14381");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        java.lang.String str4 = admin2.getPassword();
        java.lang.String str5 = admin2.getAccountType();
        java.lang.String str6 = admin2.getID();
        admin2.login("admin", "admin");
        java.lang.String str10 = admin2.getAccountType();
        java.lang.String str11 = admin2.getPassword();
        admin2.setVerified(true);
        admin2.login("hi!", "hi!");
        java.lang.Class<?> wildcardClass17 = admin2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "admin" + "'", str6, "admin");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "admin" + "'", str10, "admin");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test14382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14382");
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
        admin2.viewProfile();
        java.lang.String str16 = admin2.getPassword();
        java.lang.String str17 = admin2.getID();
        java.lang.String str18 = admin2.getID();
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
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "admin" + "'", str17, "admin");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "admin" + "'", str18, "admin");
    }

    @Test
    public void test14383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14383");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getPassword();
        boolean boolean4 = admin2.isVerified();
        java.lang.String str5 = admin2.getPassword();
        admin2.logout();
        boolean boolean7 = admin2.isVerified();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test14384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14384");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        admin2.logout();
        java.lang.String str5 = admin2.getAccountType();
        boolean boolean6 = admin2.isVerified();
        admin2.login("hi!", "");
        admin2.login("admin", "hi!");
        java.lang.String str13 = admin2.getID();
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
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "admin" + "'", str13, "admin");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test14385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14385");
        model.Admin admin2 = new model.Admin("admin", "admin");
        admin2.viewProfile();
        java.lang.String str4 = admin2.getPassword();
        admin2.login("", "");
        admin2.login("hi!", "hi!");
        admin2.logout();
        java.lang.String str12 = admin2.getID();
        boolean boolean13 = admin2.isVerified();
        java.lang.String str14 = admin2.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "admin" + "'", str4, "admin");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "admin" + "'", str12, "admin");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "admin" + "'", str14, "admin");
    }

    @Test
    public void test14386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14386");
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
        java.lang.String str17 = admin2.getEmail();
        room.Room room18 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.disableRoom(room18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test14387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14387");
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
        admin2.login("admin", "admin");
        java.lang.String str19 = admin2.getAccountType();
        double double20 = admin2.getHourlyRate();
        admin2.setVerified(false);
        boolean boolean23 = admin2.isVerified();
        java.lang.String str24 = admin2.getPassword();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "admin" + "'", str15, "admin");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "admin" + "'", str19, "admin");
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
    }

    @Test
    public void test14388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14388");
        model.Admin admin2 = new model.Admin("admin", "admin");
        admin2.viewProfile();
        java.lang.String str4 = admin2.getPassword();
        admin2.login("", "");
        admin2.viewProfile();
        java.lang.String str9 = admin2.getID();
        boolean boolean10 = admin2.isVerified();
        admin2.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "admin" + "'", str4, "admin");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "admin" + "'", str9, "admin");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test14389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14389");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        double double5 = admin2.getHourlyRate();
        double double6 = admin2.getHourlyRate();
        java.lang.String str7 = admin2.getPassword();
        double double8 = admin2.getHourlyRate();
        admin2.logout();
        java.lang.String str10 = admin2.getID();
        admin2.logout();
        boolean boolean12 = admin2.isVerified();
        double double13 = admin2.getHourlyRate();
        admin2.logout();
        double double15 = admin2.getHourlyRate();
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
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "admin" + "'", str10, "admin");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test14390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14390");
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
        boolean boolean13 = admin2.isVerified();
        java.lang.String str14 = admin2.getEmail();
        admin2.logout();
        java.lang.String str16 = admin2.getPassword();
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
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "admin" + "'", str11, "admin");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "admin" + "'", str12, "admin");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test14391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14391");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        double double5 = admin2.getHourlyRate();
        double double6 = admin2.getHourlyRate();
        java.lang.String str7 = admin2.getPassword();
        admin2.logout();
        admin2.setVerified(true);
        double double11 = admin2.getHourlyRate();
        double double12 = admin2.getHourlyRate();
        java.lang.String str13 = admin2.getID();
        admin2.logout();
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
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "admin" + "'", str13, "admin");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test14392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14392");
        model.Admin admin2 = new model.Admin("admin", "admin");
        admin2.viewProfile();
        java.lang.String str4 = admin2.getPassword();
        admin2.login("", "");
        java.lang.String str8 = admin2.getEmail();
        java.lang.String str9 = admin2.getAccountType();
        admin2.login("", "");
        java.lang.String str13 = admin2.getAccountType();
        double double14 = admin2.getHourlyRate();
        boolean boolean15 = admin2.isVerified();
        java.lang.String str16 = admin2.getEmail();
        admin2.setVerified(false);
        admin2.login("admin", "hi!");
        admin2.login("hi!", "");
        room.Room room25 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.enableRoom(room25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "admin" + "'", str4, "admin");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "admin" + "'", str8, "admin");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "admin" + "'", str9, "admin");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "admin" + "'", str13, "admin");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "admin" + "'", str16, "admin");
    }

    @Test
    public void test14393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14393");
        model.Admin admin2 = new model.Admin("admin", "admin");
        boolean boolean3 = admin2.isVerified();
        admin2.login("hi!", "");
        java.lang.String str7 = admin2.getEmail();
        admin2.viewProfile();
        java.lang.String str9 = admin2.getAccountType();
        boolean boolean10 = admin2.isVerified();
        java.lang.String str11 = admin2.getAccountType();
        double double12 = admin2.getHourlyRate();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "admin" + "'", str9, "admin");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "admin" + "'", str11, "admin");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test14394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14394");
        model.Admin admin2 = new model.Admin("admin", "admin");
        admin2.login("admin", "admin");
        boolean boolean6 = admin2.isVerified();
        admin2.logout();
        java.lang.String str8 = admin2.getID();
        admin2.viewProfile();
        admin2.logout();
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
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "admin" + "'", str8, "admin");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "admin" + "'", str12, "admin");
    }

    @Test
    public void test14395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14395");
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
        java.lang.String str12 = admin2.getPassword();
        admin2.viewProfile();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "admin" + "'", str8, "admin");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "admin" + "'", str9, "admin");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test14396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14396");
        model.Admin admin2 = new model.Admin("admin", "admin");
        admin2.viewProfile();
        java.lang.String str4 = admin2.getPassword();
        boolean boolean5 = admin2.isVerified();
        java.lang.String str6 = admin2.getPassword();
        admin2.login("hi!", "hi!");
        admin2.logout();
        admin2.viewProfile();
        java.lang.String str12 = admin2.getPassword();
        boolean boolean13 = admin2.isVerified();
        java.lang.Class<?> wildcardClass14 = admin2.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "admin" + "'", str4, "admin");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "admin" + "'", str6, "admin");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "admin" + "'", str12, "admin");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test14397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14397");
        model.Admin admin2 = new model.Admin("admin", "admin");
        boolean boolean3 = admin2.isVerified();
        admin2.login("hi!", "");
        double double7 = admin2.getHourlyRate();
        admin2.viewProfile();
        admin2.setVerified(true);
        admin2.login("admin", "");
        room.Room room14 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.enableRoom(room14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test14398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14398");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        double double5 = admin2.getHourlyRate();
        double double6 = admin2.getHourlyRate();
        java.lang.String str7 = admin2.getPassword();
        java.lang.String str8 = admin2.getEmail();
        double double9 = admin2.getHourlyRate();
        admin2.setVerified(false);
        java.lang.String str12 = admin2.getPassword();
        admin2.setVerified(true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test14399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14399");
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
        admin2.setVerified(true);
        admin2.setVerified(false);
        room.Room room20 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.disableRoom(room20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test14400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14400");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        admin2.logout();
        java.lang.String str5 = admin2.getAccountType();
        admin2.login("hi!", "");
        double double9 = admin2.getHourlyRate();
        admin2.login("", "");
        double double13 = admin2.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test14401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14401");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        java.lang.String str5 = admin2.getAccountType();
        java.lang.String str6 = admin2.getEmail();
        java.lang.String str7 = admin2.getEmail();
        admin2.login("", "admin");
        boolean boolean11 = admin2.isVerified();
        java.lang.String str12 = admin2.getAccountType();
        admin2.logout();
        admin2.setVerified(true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "admin" + "'", str12, "admin");
    }

    @Test
    public void test14402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14402");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        double double5 = admin2.getHourlyRate();
        admin2.setVerified(true);
        admin2.viewProfile();
        admin2.login("", "admin");
        java.lang.String str12 = admin2.getEmail();
        java.lang.String str13 = admin2.getPassword();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test14403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14403");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        java.lang.String str4 = admin2.getPassword();
        java.lang.String str5 = admin2.getPassword();
        java.lang.String str6 = admin2.getPassword();
        admin2.logout();
        admin2.viewProfile();
        java.lang.String str9 = admin2.getPassword();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test14404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14404");
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
        admin2.viewProfile();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "admin" + "'", str13, "admin");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test14405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14405");
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
        admin2.setVerified(false);
        admin2.login("", "hi!");
        room.Room room22 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.enableRoom(room22);
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
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "admin" + "'", str16, "admin");
    }

    @Test
    public void test14406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14406");
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
        boolean boolean18 = admin2.isVerified();
        admin2.logout();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "admin" + "'", str12, "admin");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test14407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14407");
        model.Admin admin2 = new model.Admin("", "");
        java.lang.String str3 = admin2.getAccountType();
        admin2.setVerified(true);
        double double6 = admin2.getHourlyRate();
        admin2.setVerified(false);
        admin2.logout();
        admin2.login("hi!", "");
        admin2.setVerified(true);
        java.lang.String str15 = admin2.getPassword();
        admin2.viewProfile();
        java.lang.String str17 = admin2.getID();
        double double18 = admin2.getHourlyRate();
        java.lang.String str19 = admin2.getPassword();
        admin2.logout();
        java.lang.String str21 = admin2.getID();
        admin2.viewProfile();
        admin2.viewProfile();
        admin2.login("hi!", "admin");
        admin2.setVerified(false);
        double double29 = admin2.getHourlyRate();
        room.Room room30 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.enableRoom(room30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "admin" + "'", str17, "admin");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "admin" + "'", str21, "admin");
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 0.0d + "'", double29 == 0.0d);
    }

    @Test
    public void test14408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14408");
        model.Admin admin2 = new model.Admin("admin", "admin");
        admin2.viewProfile();
        java.lang.String str4 = admin2.getPassword();
        boolean boolean5 = admin2.isVerified();
        java.lang.String str6 = admin2.getPassword();
        admin2.login("", "");
        admin2.login("hi!", "hi!");
        java.lang.String str13 = admin2.getID();
        java.lang.String str14 = admin2.getEmail();
        double double15 = admin2.getHourlyRate();
        room.Room room16 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.disableRoom(room16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "admin" + "'", str4, "admin");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "admin" + "'", str6, "admin");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "admin" + "'", str13, "admin");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "admin" + "'", str14, "admin");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test14409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14409");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        admin2.logout();
        admin2.setVerified(false);
        java.lang.String str6 = admin2.getEmail();
        double double7 = admin2.getHourlyRate();
        java.lang.String str8 = admin2.getPassword();
        double double9 = admin2.getHourlyRate();
        java.lang.String str10 = admin2.getAccountType();
        admin2.setVerified(true);
        admin2.viewProfile();
        admin2.viewProfile();
        java.lang.String str15 = admin2.getID();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "admin" + "'", str10, "admin");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "admin" + "'", str15, "admin");
    }

    @Test
    public void test14410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14410");
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
        admin2.login("", "hi!");
        java.lang.String str19 = admin2.getAccountType();
        admin2.logout();
        admin2.viewProfile();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "admin" + "'", str14, "admin");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "admin" + "'", str19, "admin");
    }

    @Test
    public void test14411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14411");
        model.Admin admin2 = new model.Admin("admin", "admin");
        admin2.viewProfile();
        java.lang.String str4 = admin2.getPassword();
        admin2.login("", "");
        boolean boolean8 = admin2.isVerified();
        admin2.setVerified(false);
        double double11 = admin2.getHourlyRate();
        java.lang.String str12 = admin2.getPassword();
        admin2.viewProfile();
        admin2.logout();
        double double15 = admin2.getHourlyRate();
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
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "admin" + "'", str12, "admin");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test14412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14412");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getAccountType();
        boolean boolean4 = admin2.isVerified();
        admin2.setVerified(false);
        java.lang.String str7 = admin2.getPassword();
        double double8 = admin2.getHourlyRate();
        admin2.setVerified(false);
        admin2.setVerified(false);
        java.lang.String str13 = admin2.getEmail();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test14413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14413");
        model.Admin admin2 = new model.Admin("admin", "");
        admin2.logout();
        admin2.viewProfile();
        boolean boolean5 = admin2.isVerified();
        admin2.logout();
        admin2.setVerified(false);
        admin2.logout();
        java.lang.String str10 = admin2.getEmail();
        java.lang.String str11 = admin2.getAccountType();
        room.Room room12 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.addRoom(room12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.getRoomID()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "admin" + "'", str10, "admin");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "admin" + "'", str11, "admin");
    }

    @Test
    public void test14414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14414");
        model.Admin admin2 = new model.Admin("admin", "");
        admin2.logout();
        double double4 = admin2.getHourlyRate();
        java.lang.String str5 = admin2.getAccountType();
        admin2.login("hi!", "hi!");
        admin2.logout();
        admin2.login("", "admin");
        admin2.viewProfile();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
    }

    @Test
    public void test14415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14415");
        model.Admin admin2 = new model.Admin("admin", "");
        admin2.setVerified(true);
        java.lang.String str5 = admin2.getAccountType();
        admin2.viewProfile();
        admin2.setVerified(false);
        java.lang.String str9 = admin2.getEmail();
        admin2.setVerified(true);
        admin2.setVerified(true);
        room.Room room14 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.disableRoom(room14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "admin" + "'", str9, "admin");
    }

    @Test
    public void test14416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14416");
        model.Admin admin2 = new model.Admin("admin", "admin");
        admin2.viewProfile();
        java.lang.String str4 = admin2.getPassword();
        admin2.login("", "");
        java.lang.String str8 = admin2.getEmail();
        java.lang.String str9 = admin2.getAccountType();
        admin2.login("", "");
        java.lang.String str13 = admin2.getPassword();
        double double14 = admin2.getHourlyRate();
        admin2.login("hi!", "admin");
        room.Room room18 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.enableRoom(room18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "admin" + "'", str4, "admin");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "admin" + "'", str8, "admin");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "admin" + "'", str9, "admin");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "admin" + "'", str13, "admin");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test14417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14417");
        model.Admin admin2 = new model.Admin("admin", "");
        admin2.setVerified(true);
        java.lang.String str5 = admin2.getAccountType();
        admin2.viewProfile();
        admin2.setVerified(false);
        admin2.viewProfile();
        java.lang.String str10 = admin2.getPassword();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test14418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14418");
        model.Admin admin2 = new model.Admin("admin", "admin");
        admin2.login("admin", "admin");
        boolean boolean6 = admin2.isVerified();
        admin2.logout();
        java.lang.String str8 = admin2.getID();
        admin2.viewProfile();
        admin2.login("hi!", "");
        admin2.setVerified(true);
        java.lang.String str15 = admin2.getEmail();
        admin2.login("", "admin");
        java.lang.String str19 = admin2.getAccountType();
        java.lang.String str20 = admin2.getID();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "admin" + "'", str8, "admin");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "admin" + "'", str15, "admin");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "admin" + "'", str19, "admin");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "admin" + "'", str20, "admin");
    }

    @Test
    public void test14419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14419");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        admin2.logout();
        java.lang.String str5 = admin2.getAccountType();
        admin2.viewProfile();
        admin2.logout();
        double double8 = admin2.getHourlyRate();
        boolean boolean9 = admin2.isVerified();
        java.lang.String str10 = admin2.getPassword();
        boolean boolean11 = admin2.isVerified();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test14420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14420");
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
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "admin" + "'", str17, "admin");
    }

    @Test
    public void test14421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14421");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        admin2.logout();
        java.lang.String str5 = admin2.getAccountType();
        java.lang.String str6 = admin2.getEmail();
        java.lang.String str7 = admin2.getPassword();
        java.lang.String str8 = admin2.getAccountType();
        java.lang.String str9 = admin2.getEmail();
        java.lang.String str10 = admin2.getAccountType();
        admin2.login("admin", "hi!");
        admin2.logout();
        java.lang.Class<?> wildcardClass15 = admin2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "admin" + "'", str8, "admin");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "admin" + "'", str10, "admin");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test14422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14422");
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
        java.lang.String str14 = admin2.getAccountType();
        java.lang.String str15 = admin2.getAccountType();
        boolean boolean16 = admin2.isVerified();
        double double17 = admin2.getHourlyRate();
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
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "admin" + "'", str14, "admin");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "admin" + "'", str15, "admin");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
    }

    @Test
    public void test14423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14423");
        model.Admin admin2 = new model.Admin("admin", "admin");
        admin2.login("admin", "admin");
        boolean boolean6 = admin2.isVerified();
        admin2.logout();
        admin2.setVerified(false);
        java.lang.String str10 = admin2.getPassword();
        java.lang.String str11 = admin2.getID();
        java.lang.String str12 = admin2.getPassword();
        java.lang.String str13 = admin2.getID();
        admin2.viewProfile();
        admin2.logout();
        admin2.setVerified(false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "admin" + "'", str10, "admin");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "admin" + "'", str11, "admin");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "admin" + "'", str12, "admin");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "admin" + "'", str13, "admin");
    }

    @Test
    public void test14424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14424");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        admin2.logout();
        admin2.setVerified(false);
        java.lang.String str6 = admin2.getEmail();
        admin2.viewProfile();
        admin2.viewProfile();
        double double9 = admin2.getHourlyRate();
        admin2.setVerified(true);
        admin2.viewProfile();
        boolean boolean13 = admin2.isVerified();
        java.lang.String str14 = admin2.getPassword();
        admin2.viewProfile();
        java.lang.String str16 = admin2.getAccountType();
        room.Room room17 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.enableRoom(room17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "admin" + "'", str16, "admin");
    }

    @Test
    public void test14425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14425");
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
        java.lang.String str15 = admin2.getEmail();
        java.lang.String str16 = admin2.getID();
        admin2.logout();
        java.lang.String str18 = admin2.getAccountType();
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
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "admin" + "'", str16, "admin");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "admin" + "'", str18, "admin");
    }

    @Test
    public void test14426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14426");
        model.Admin admin2 = new model.Admin("admin", "admin");
        admin2.viewProfile();
        java.lang.String str4 = admin2.getID();
        admin2.logout();
        java.lang.String str6 = admin2.getAccountType();
        admin2.login("admin", "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "admin" + "'", str4, "admin");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "admin" + "'", str6, "admin");
    }

    @Test
    public void test14427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14427");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        double double5 = admin2.getHourlyRate();
        admin2.login("admin", "hi!");
        admin2.viewProfile();
        admin2.setVerified(true);
        double double12 = admin2.getHourlyRate();
        java.lang.String str13 = admin2.getID();
        java.lang.String str14 = admin2.getPassword();
        java.lang.String str15 = admin2.getAccountType();
        admin2.viewProfile();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "admin" + "'", str13, "admin");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "admin" + "'", str15, "admin");
    }

    @Test
    public void test14428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14428");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getAccountType();
        boolean boolean4 = admin2.isVerified();
        boolean boolean5 = admin2.isVerified();
        admin2.viewProfile();
        admin2.login("admin", "hi!");
        java.lang.String str10 = admin2.getPassword();
        admin2.login("", "hi!");
        admin2.logout();
        admin2.login("admin", "");
        admin2.viewProfile();
        admin2.viewProfile();
        java.lang.String str20 = admin2.getPassword();
        java.lang.String str21 = admin2.getEmail();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
    }

    @Test
    public void test14429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14429");
        model.Admin admin2 = new model.Admin("admin", "admin");
        admin2.login("admin", "admin");
        boolean boolean6 = admin2.isVerified();
        admin2.logout();
        java.lang.String str8 = admin2.getID();
        admin2.logout();
        java.lang.String str10 = admin2.getID();
        boolean boolean11 = admin2.isVerified();
        admin2.setVerified(true);
        double double14 = admin2.getHourlyRate();
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
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test14430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14430");
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
        java.lang.String str17 = admin2.getID();
        admin2.viewProfile();
        java.lang.String str19 = admin2.getAccountType();
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
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "admin" + "'", str17, "admin");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "admin" + "'", str19, "admin");
    }

    @Test
    public void test14431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14431");
        model.Admin admin2 = new model.Admin("", "");
        java.lang.String str3 = admin2.getAccountType();
        java.lang.String str4 = admin2.getEmail();
        java.lang.String str5 = admin2.getID();
        double double6 = admin2.getHourlyRate();
        java.lang.String str7 = admin2.getAccountType();
        admin2.setVerified(false);
        boolean boolean10 = admin2.isVerified();
        double double11 = admin2.getHourlyRate();
        java.lang.String str12 = admin2.getEmail();
        java.lang.String str13 = admin2.getAccountType();
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
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "admin" + "'", str13, "admin");
    }

    @Test
    public void test14432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14432");
        model.Admin admin2 = new model.Admin("admin", "admin");
        boolean boolean3 = admin2.isVerified();
        admin2.login("hi!", "");
        java.lang.String str7 = admin2.getEmail();
        admin2.viewProfile();
        java.lang.String str9 = admin2.getAccountType();
        admin2.logout();
        admin2.viewProfile();
        admin2.viewProfile();
        admin2.login("hi!", "admin");
        admin2.logout();
        java.lang.String str17 = admin2.getID();
        admin2.logout();
        java.lang.String str19 = admin2.getAccountType();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "admin" + "'", str9, "admin");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "admin" + "'", str17, "admin");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "admin" + "'", str19, "admin");
    }

    @Test
    public void test14433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14433");
        model.Admin admin2 = new model.Admin("", "admin");
        java.lang.String str3 = admin2.getEmail();
        java.lang.String str4 = admin2.getPassword();
        double double5 = admin2.getHourlyRate();
        double double6 = admin2.getHourlyRate();
        admin2.logout();
        admin2.logout();
        boolean boolean9 = admin2.isVerified();
        admin2.login("", "admin");
        java.lang.String str13 = admin2.getEmail();
        admin2.login("", "hi!");
        boolean boolean17 = admin2.isVerified();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "admin" + "'", str4, "admin");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test14434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14434");
        model.Admin admin2 = new model.Admin("admin", "admin");
        boolean boolean3 = admin2.isVerified();
        java.lang.String str4 = admin2.getEmail();
        java.lang.String str5 = admin2.getAccountType();
        admin2.logout();
        java.lang.String str7 = admin2.getAccountType();
        admin2.viewProfile();
        boolean boolean9 = admin2.isVerified();
        room.Room room10 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.addRoom(room10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.getRoomID()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "admin" + "'", str4, "admin");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test14435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14435");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        admin2.logout();
        java.lang.String str5 = admin2.getAccountType();
        boolean boolean6 = admin2.isVerified();
        admin2.login("hi!", "admin");
        admin2.setVerified(true);
        admin2.viewProfile();
        admin2.login("admin", "");
        admin2.setVerified(false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test14436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14436");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        admin2.logout();
        java.lang.String str5 = admin2.getAccountType();
        boolean boolean6 = admin2.isVerified();
        java.lang.String str7 = admin2.getPassword();
        double double8 = admin2.getHourlyRate();
        java.lang.String str9 = admin2.getID();
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
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "admin" + "'", str9, "admin");
    }

    @Test
    public void test14437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14437");
        model.Admin admin2 = new model.Admin("hi!", "admin");
        java.lang.String str3 = admin2.getID();
        admin2.setVerified(false);
        admin2.viewProfile();
        admin2.viewProfile();
        admin2.login("", "hi!");
        admin2.logout();
        admin2.login("hi!", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
    }

    @Test
    public void test14438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14438");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        double double5 = admin2.getHourlyRate();
        admin2.setVerified(true);
        double double8 = admin2.getHourlyRate();
        double double9 = admin2.getHourlyRate();
        admin2.login("", "admin");
        admin2.setVerified(false);
        admin2.viewProfile();
        admin2.setVerified(false);
        admin2.login("hi!", "admin");
        admin2.setVerified(true);
        admin2.login("", "");
        java.lang.String str26 = admin2.getID();
        room.Room room27 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.disableRoom(room27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "admin" + "'", str26, "admin");
    }

    @Test
    public void test14439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14439");
        model.Admin admin2 = new model.Admin("", "hi!");
        boolean boolean3 = admin2.isVerified();
        admin2.logout();
        java.lang.String str5 = admin2.getID();
        double double6 = admin2.getHourlyRate();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test14440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14440");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        java.lang.String str4 = admin2.getEmail();
        java.lang.String str5 = admin2.getPassword();
        admin2.login("", "hi!");
        java.lang.Class<?> wildcardClass9 = admin2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test14441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14441");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        admin2.logout();
        java.lang.String str5 = admin2.getAccountType();
        boolean boolean6 = admin2.isVerified();
        admin2.login("hi!", "admin");
        admin2.setVerified(false);
        boolean boolean12 = admin2.isVerified();
        java.lang.String str13 = admin2.getID();
        boolean boolean14 = admin2.isVerified();
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
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "admin" + "'", str13, "admin");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test14442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14442");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        admin2.logout();
        java.lang.String str5 = admin2.getAccountType();
        admin2.viewProfile();
        admin2.logout();
        admin2.login("admin", "");
        admin2.setVerified(false);
        admin2.viewProfile();
        admin2.viewProfile();
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
    }

    @Test
    public void test14443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14443");
        model.Admin admin2 = new model.Admin("admin", "");
        admin2.setVerified(true);
        java.lang.String str5 = admin2.getEmail();
        boolean boolean6 = admin2.isVerified();
        admin2.viewProfile();
        admin2.logout();
        java.lang.String str9 = admin2.getEmail();
        java.lang.String str10 = admin2.getAccountType();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "admin" + "'", str9, "admin");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "admin" + "'", str10, "admin");
    }

    @Test
    public void test14444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14444");
        model.Admin admin2 = new model.Admin("admin", "admin");
        admin2.login("admin", "admin");
        boolean boolean6 = admin2.isVerified();
        admin2.logout();
        java.lang.String str8 = admin2.getID();
        admin2.viewProfile();
        admin2.logout();
        double double11 = admin2.getHourlyRate();
        java.lang.String str12 = admin2.getAccountType();
        boolean boolean13 = admin2.isVerified();
        java.lang.Class<?> wildcardClass14 = admin2.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "admin" + "'", str8, "admin");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "admin" + "'", str12, "admin");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test14445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14445");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        java.lang.String str5 = admin2.getID();
        java.lang.String str6 = admin2.getID();
        java.lang.String str7 = admin2.getAccountType();
        admin2.viewProfile();
        admin2.viewProfile();
        admin2.viewProfile();
        java.lang.String str11 = admin2.getAccountType();
        java.lang.String str12 = admin2.getID();
        admin2.login("", "");
        admin2.login("hi!", "admin");
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
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "admin" + "'", str6, "admin");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "admin" + "'", str11, "admin");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "admin" + "'", str12, "admin");
    }

    @Test
    public void test14446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14446");
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
        admin2.logout();
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
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test14447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14447");
        model.Admin admin2 = new model.Admin("admin", "");
        admin2.logout();
        double double4 = admin2.getHourlyRate();
        admin2.login("hi!", "admin");
        room.Room room8 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.disableRoom(room8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test14448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14448");
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
        java.lang.String str13 = admin2.getEmail();
        admin2.setVerified(false);
        admin2.logout();
        java.lang.String str17 = admin2.getEmail();
        java.lang.String str18 = admin2.getAccountType();
        admin2.login("hi!", "admin");
        admin2.setVerified(true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "admin" + "'", str18, "admin");
    }

    @Test
    public void test14449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14449");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getAccountType();
        boolean boolean4 = admin2.isVerified();
        boolean boolean5 = admin2.isVerified();
        java.lang.String str6 = admin2.getID();
        admin2.logout();
        admin2.login("hi!", "hi!");
        java.lang.String str11 = admin2.getAccountType();
        admin2.viewProfile();
        java.lang.String str13 = admin2.getPassword();
        boolean boolean14 = admin2.isVerified();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "admin" + "'", str6, "admin");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "admin" + "'", str11, "admin");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test14450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14450");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        java.lang.String str5 = admin2.getID();
        java.lang.String str6 = admin2.getID();
        java.lang.String str7 = admin2.getAccountType();
        admin2.setVerified(true);
        admin2.viewProfile();
        admin2.login("admin", "hi!");
        java.lang.Class<?> wildcardClass14 = admin2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "admin" + "'", str6, "admin");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test14451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14451");
        model.Admin admin2 = new model.Admin("admin", "");
        admin2.setVerified(true);
        admin2.logout();
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
    public void test14452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14452");
        model.Admin admin2 = new model.Admin("admin", "admin");
        admin2.login("admin", "admin");
        boolean boolean6 = admin2.isVerified();
        admin2.logout();
        java.lang.String str8 = admin2.getID();
        admin2.logout();
        java.lang.String str10 = admin2.getEmail();
        admin2.logout();
        java.lang.String str12 = admin2.getAccountType();
        java.lang.String str13 = admin2.getID();
        java.lang.String str14 = admin2.getEmail();
        java.lang.String str15 = admin2.getID();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "admin" + "'", str8, "admin");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "admin" + "'", str10, "admin");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "admin" + "'", str12, "admin");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "admin" + "'", str13, "admin");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "admin" + "'", str14, "admin");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "admin" + "'", str15, "admin");
    }

    @Test
    public void test14453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14453");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        double double5 = admin2.getHourlyRate();
        double double6 = admin2.getHourlyRate();
        java.lang.String str7 = admin2.getID();
        admin2.viewProfile();
        java.lang.String str9 = admin2.getID();
        admin2.login("hi!", "admin");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "admin" + "'", str9, "admin");
    }

    @Test
    public void test14454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14454");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        admin2.logout();
        java.lang.String str5 = admin2.getAccountType();
        boolean boolean6 = admin2.isVerified();
        admin2.login("hi!", "admin");
        admin2.setVerified(false);
        boolean boolean12 = admin2.isVerified();
        admin2.setVerified(false);
        java.lang.String str15 = admin2.getEmail();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test14455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14455");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        admin2.logout();
        java.lang.String str5 = admin2.getAccountType();
        boolean boolean6 = admin2.isVerified();
        java.lang.String str7 = admin2.getAccountType();
        admin2.logout();
        java.lang.String str9 = admin2.getID();
        java.lang.String str10 = admin2.getAccountType();
        admin2.login("", "hi!");
        boolean boolean14 = admin2.isVerified();
        java.lang.String str15 = admin2.getEmail();
        java.lang.String str16 = admin2.getID();
        double double17 = admin2.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "admin" + "'", str9, "admin");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "admin" + "'", str10, "admin");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "admin" + "'", str16, "admin");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
    }

    @Test
    public void test14456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14456");
        model.Admin admin2 = new model.Admin("admin", "admin");
        admin2.viewProfile();
        java.lang.String str4 = admin2.getPassword();
        admin2.login("", "");
        boolean boolean8 = admin2.isVerified();
        admin2.setVerified(true);
        admin2.setVerified(false);
        admin2.setVerified(false);
        admin2.viewProfile();
        java.lang.String str16 = admin2.getPassword();
        admin2.login("admin", "admin");
        java.lang.String str20 = admin2.getPassword();
        java.lang.String str21 = admin2.getAccountType();
        java.lang.String str22 = admin2.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "admin" + "'", str4, "admin");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "admin" + "'", str16, "admin");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "admin" + "'", str20, "admin");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "admin" + "'", str21, "admin");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "admin" + "'", str22, "admin");
    }

    @Test
    public void test14457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14457");
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
        double double17 = admin2.getHourlyRate();
        java.lang.String str18 = admin2.getPassword();
        java.lang.String str19 = admin2.getAccountType();
        boolean boolean20 = admin2.isVerified();
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
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "admin" + "'", str19, "admin");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test14458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14458");
        model.Admin admin2 = new model.Admin("", "admin");
        java.lang.String str3 = admin2.getEmail();
        admin2.login("admin", "admin");
        admin2.logout();
        boolean boolean8 = admin2.isVerified();
        java.lang.String str9 = admin2.getID();
        admin2.logout();
        java.lang.String str11 = admin2.getPassword();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "admin" + "'", str9, "admin");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "admin" + "'", str11, "admin");
    }

    @Test
    public void test14459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14459");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        java.lang.String str5 = admin2.getAccountType();
        double double6 = admin2.getHourlyRate();
        admin2.setVerified(false);
        boolean boolean9 = admin2.isVerified();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test14460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14460");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        java.lang.String str5 = admin2.getID();
        admin2.setVerified(false);
        admin2.logout();
        java.lang.String str9 = admin2.getEmail();
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
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "admin" + "'", str10, "admin");
    }

    @Test
    public void test14461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14461");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        java.lang.String str5 = admin2.getID();
        java.lang.String str6 = admin2.getID();
        java.lang.String str7 = admin2.getAccountType();
        admin2.viewProfile();
        java.lang.String str9 = admin2.getEmail();
        java.lang.String str10 = admin2.getID();
        admin2.login("", "hi!");
        admin2.login("admin", "");
        java.lang.String str17 = admin2.getAccountType();
        admin2.setVerified(true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "admin" + "'", str6, "admin");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "admin" + "'", str10, "admin");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "admin" + "'", str17, "admin");
    }

    @Test
    public void test14462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14462");
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
        admin2.viewProfile();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
    }

    @Test
    public void test14463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14463");
        model.Admin admin2 = new model.Admin("admin", "admin");
        boolean boolean3 = admin2.isVerified();
        admin2.login("hi!", "");
        admin2.setVerified(true);
        java.lang.String str9 = admin2.getAccountType();
        boolean boolean10 = admin2.isVerified();
        java.lang.String str11 = admin2.getEmail();
        admin2.logout();
        java.lang.String str13 = admin2.getPassword();
        admin2.login("admin", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "admin" + "'", str9, "admin");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "admin" + "'", str11, "admin");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "admin" + "'", str13, "admin");
    }

    @Test
    public void test14464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14464");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        double double5 = admin2.getHourlyRate();
        double double6 = admin2.getHourlyRate();
        admin2.setVerified(true);
        java.lang.String str9 = admin2.getEmail();
        java.lang.String str10 = admin2.getEmail();
        java.lang.String str11 = admin2.getID();
        java.lang.String str12 = admin2.getAccountType();
        java.lang.String str13 = admin2.getPassword();
        java.lang.String str14 = admin2.getID();
        java.lang.String str15 = admin2.getID();
        java.lang.String str16 = admin2.getEmail();
        java.lang.String str17 = admin2.getAccountType();
        admin2.setVerified(true);
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
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "admin" + "'", str11, "admin");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "admin" + "'", str12, "admin");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "admin" + "'", str14, "admin");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "admin" + "'", str15, "admin");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "admin" + "'", str17, "admin");
    }

    @Test
    public void test14465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14465");
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
        admin2.login("admin", "admin");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "admin" + "'", str9, "admin");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test14466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14466");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        admin2.logout();
        admin2.setVerified(false);
        java.lang.String str6 = admin2.getEmail();
        admin2.setVerified(false);
        java.lang.String str9 = admin2.getPassword();
        admin2.logout();
        admin2.login("", "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test14467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14467");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        double double5 = admin2.getHourlyRate();
        double double6 = admin2.getHourlyRate();
        admin2.viewProfile();
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
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "admin" + "'", str9, "admin");
    }

    @Test
    public void test14468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14468");
        model.Admin admin2 = new model.Admin("admin", "admin");
        admin2.viewProfile();
        admin2.viewProfile();
        admin2.login("hi!", "admin");
        java.lang.String str8 = admin2.getID();
        admin2.login("", "hi!");
        admin2.viewProfile();
        java.lang.String str13 = admin2.getEmail();
        room.Room room14 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.addRoom(room14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.getRoomID()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "admin" + "'", str8, "admin");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "admin" + "'", str13, "admin");
    }

    @Test
    public void test14469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14469");
        model.Admin admin2 = new model.Admin("", "hi!");
        java.lang.String str3 = admin2.getPassword();
        admin2.setVerified(false);
        java.lang.String str6 = admin2.getPassword();
        boolean boolean7 = admin2.isVerified();
        java.lang.String str8 = admin2.getID();
        admin2.setVerified(false);
        admin2.login("admin", "hi!");
        admin2.login("", "");
        double double17 = admin2.getHourlyRate();
        boolean boolean18 = admin2.isVerified();
        java.lang.String str19 = admin2.getAccountType();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "admin" + "'", str8, "admin");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "admin" + "'", str19, "admin");
    }

    @Test
    public void test14470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14470");
        model.Admin admin2 = new model.Admin("", "");
        java.lang.String str3 = admin2.getAccountType();
        java.lang.String str4 = admin2.getEmail();
        java.lang.String str5 = admin2.getID();
        double double6 = admin2.getHourlyRate();
        java.lang.String str7 = admin2.getAccountType();
        double double8 = admin2.getHourlyRate();
        java.lang.String str9 = admin2.getEmail();
        admin2.viewProfile();
        admin2.setVerified(true);
        double double13 = admin2.getHourlyRate();
        java.lang.String str14 = admin2.getID();
        java.lang.String str15 = admin2.getAccountType();
        java.lang.String str16 = admin2.getEmail();
        java.lang.String str17 = admin2.getAccountType();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "admin" + "'", str14, "admin");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "admin" + "'", str15, "admin");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "admin" + "'", str17, "admin");
    }

    @Test
    public void test14471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14471");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getAccountType();
        admin2.setVerified(false);
        double double6 = admin2.getHourlyRate();
        java.lang.String str7 = admin2.getEmail();
        admin2.logout();
        java.lang.String str9 = admin2.getAccountType();
        java.lang.String str10 = admin2.getAccountType();
        java.lang.String str11 = admin2.getID();
        admin2.setVerified(false);
        admin2.viewProfile();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "admin" + "'", str9, "admin");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "admin" + "'", str10, "admin");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "admin" + "'", str11, "admin");
    }

    @Test
    public void test14472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14472");
        model.Admin admin2 = new model.Admin("admin", "");
        admin2.setVerified(true);
        java.lang.String str5 = admin2.getAccountType();
        boolean boolean6 = admin2.isVerified();
        java.lang.String str7 = admin2.getPassword();
        admin2.login("hi!", "hi!");
        admin2.setVerified(false);
        java.lang.String str13 = admin2.getAccountType();
        java.lang.String str14 = admin2.getAccountType();
        admin2.viewProfile();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "admin" + "'", str13, "admin");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "admin" + "'", str14, "admin");
    }

    @Test
    public void test14473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14473");
        model.Admin admin2 = new model.Admin("", "");
        java.lang.String str3 = admin2.getAccountType();
        admin2.setVerified(true);
        double double6 = admin2.getHourlyRate();
        admin2.setVerified(false);
        admin2.logout();
        admin2.login("hi!", "");
        admin2.setVerified(true);
        java.lang.String str15 = admin2.getPassword();
        admin2.viewProfile();
        java.lang.String str17 = admin2.getID();
        double double18 = admin2.getHourlyRate();
        java.lang.String str19 = admin2.getPassword();
        admin2.logout();
        double double21 = admin2.getHourlyRate();
        java.lang.String str22 = admin2.getPassword();
        room.Room room23 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.disableRoom(room23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "admin" + "'", str17, "admin");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test14474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14474");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        double double5 = admin2.getHourlyRate();
        admin2.login("admin", "hi!");
        admin2.viewProfile();
        admin2.logout();
        java.lang.String str11 = admin2.getAccountType();
        java.lang.String str12 = admin2.getPassword();
        java.lang.Class<?> wildcardClass13 = admin2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "admin" + "'", str11, "admin");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test14475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14475");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        java.lang.String str4 = admin2.getPassword();
        java.lang.String str5 = admin2.getAccountType();
        java.lang.String str6 = admin2.getEmail();
        admin2.logout();
        double double8 = admin2.getHourlyRate();
        admin2.viewProfile();
        admin2.setVerified(true);
        admin2.viewProfile();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test14476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14476");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        admin2.logout();
        java.lang.String str5 = admin2.getAccountType();
        admin2.login("hi!", "");
        double double9 = admin2.getHourlyRate();
        java.lang.String str10 = admin2.getEmail();
        java.lang.String str11 = admin2.getAccountType();
        java.lang.String str12 = admin2.getID();
        boolean boolean13 = admin2.isVerified();
        admin2.logout();
        java.lang.String str15 = admin2.getEmail();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "admin" + "'", str11, "admin");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "admin" + "'", str12, "admin");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test14477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14477");
        model.Admin admin2 = new model.Admin("admin", "");
        admin2.setVerified(true);
        java.lang.String str5 = admin2.getEmail();
        double double6 = admin2.getHourlyRate();
        java.lang.String str7 = admin2.getPassword();
        java.lang.String str8 = admin2.getEmail();
        admin2.viewProfile();
        admin2.setVerified(false);
        admin2.login("hi!", "hi!");
        boolean boolean15 = admin2.isVerified();
        room.Room room16 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.disableRoom(room16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "admin" + "'", str8, "admin");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test14478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14478");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        admin2.logout();
        java.lang.String str5 = admin2.getAccountType();
        boolean boolean6 = admin2.isVerified();
        java.lang.String str7 = admin2.getPassword();
        java.lang.String str8 = admin2.getPassword();
        admin2.setVerified(true);
        admin2.login("hi!", "");
        java.lang.String str14 = admin2.getID();
        admin2.setVerified(true);
        java.lang.String str17 = admin2.getEmail();
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
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "admin" + "'", str14, "admin");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test14479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14479");
        model.Admin admin2 = new model.Admin("admin", "");
        admin2.setVerified(true);
        java.lang.String str5 = admin2.getEmail();
        double double6 = admin2.getHourlyRate();
        admin2.viewProfile();
        admin2.viewProfile();
        java.lang.String str9 = admin2.getEmail();
        admin2.login("admin", "hi!");
        admin2.logout();
        java.lang.String str14 = admin2.getID();
        admin2.login("", "admin");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "admin" + "'", str9, "admin");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "admin" + "'", str14, "admin");
    }

    @Test
    public void test14480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14480");
        model.Admin admin2 = new model.Admin("", "");
        java.lang.String str3 = admin2.getAccountType();
        admin2.setVerified(true);
        java.lang.String str6 = admin2.getAccountType();
        admin2.logout();
        double double8 = admin2.getHourlyRate();
        java.lang.String str9 = admin2.getPassword();
        double double10 = admin2.getHourlyRate();
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
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "admin" + "'", str6, "admin");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test14481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14481");
        model.Admin admin2 = new model.Admin("admin", "admin");
        admin2.viewProfile();
        java.lang.String str4 = admin2.getPassword();
        double double5 = admin2.getHourlyRate();
        java.lang.String str6 = admin2.getAccountType();
        boolean boolean7 = admin2.isVerified();
        admin2.viewProfile();
        admin2.setVerified(false);
        java.lang.String str11 = admin2.getPassword();
        java.lang.String str12 = admin2.getAccountType();
        java.lang.String str13 = admin2.getEmail();
        admin2.login("", "hi!");
        admin2.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "admin" + "'", str4, "admin");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "admin" + "'", str6, "admin");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "admin" + "'", str11, "admin");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "admin" + "'", str12, "admin");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "admin" + "'", str13, "admin");
    }

    @Test
    public void test14482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14482");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        admin2.logout();
        java.lang.String str5 = admin2.getAccountType();
        admin2.viewProfile();
        admin2.login("hi!", "admin");
        boolean boolean10 = admin2.isVerified();
        admin2.logout();
        admin2.setVerified(false);
        java.lang.String str14 = admin2.getAccountType();
        admin2.setVerified(true);
        admin2.logout();
        admin2.logout();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "admin" + "'", str14, "admin");
    }

    @Test
    public void test14483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14483");
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
        admin2.login("admin", "hi!");
        java.lang.String str17 = admin2.getID();
        java.lang.String str18 = admin2.getID();
        java.lang.String str19 = admin2.getEmail();
        java.lang.String str20 = admin2.getPassword();
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
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "admin" + "'", str17, "admin");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "admin" + "'", str18, "admin");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test14484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14484");
        model.Admin admin2 = new model.Admin("admin", "");
        admin2.setVerified(true);
        java.lang.String str5 = admin2.getEmail();
        double double6 = admin2.getHourlyRate();
        admin2.viewProfile();
        admin2.viewProfile();
        admin2.viewProfile();
        admin2.setVerified(true);
        double double12 = admin2.getHourlyRate();
        admin2.logout();
        double double14 = admin2.getHourlyRate();
        java.lang.String str15 = admin2.getID();
        admin2.setVerified(true);
        admin2.setVerified(false);
        java.lang.String str20 = admin2.getAccountType();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "admin" + "'", str15, "admin");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "admin" + "'", str20, "admin");
    }

    @Test
    public void test14485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14485");
        model.Admin admin2 = new model.Admin("admin", "admin");
        admin2.viewProfile();
        java.lang.String str4 = admin2.getPassword();
        double double5 = admin2.getHourlyRate();
        java.lang.String str6 = admin2.getAccountType();
        boolean boolean7 = admin2.isVerified();
        admin2.logout();
        admin2.logout();
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
    }

    @Test
    public void test14486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14486");
        model.Admin admin2 = new model.Admin("", "");
        java.lang.String str3 = admin2.getAccountType();
        java.lang.String str4 = admin2.getEmail();
        java.lang.String str5 = admin2.getID();
        double double6 = admin2.getHourlyRate();
        java.lang.String str7 = admin2.getAccountType();
        admin2.login("admin", "");
        java.lang.String str11 = admin2.getAccountType();
        boolean boolean12 = admin2.isVerified();
        java.lang.String str13 = admin2.getEmail();
        java.lang.String str14 = admin2.getID();
        boolean boolean15 = admin2.isVerified();
        java.lang.String str16 = admin2.getEmail();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "admin" + "'", str11, "admin");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "admin" + "'", str14, "admin");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test14487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14487");
        model.Admin admin2 = new model.Admin("admin", "admin");
        admin2.viewProfile();
        java.lang.String str4 = admin2.getPassword();
        admin2.login("", "");
        java.lang.String str8 = admin2.getEmail();
        java.lang.String str9 = admin2.getAccountType();
        java.lang.String str10 = admin2.getPassword();
        java.lang.String str11 = admin2.getID();
        admin2.logout();
        admin2.setVerified(false);
        boolean boolean15 = admin2.isVerified();
        boolean boolean16 = admin2.isVerified();
        boolean boolean17 = admin2.isVerified();
        java.lang.Class<?> wildcardClass18 = admin2.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "admin" + "'", str4, "admin");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "admin" + "'", str8, "admin");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "admin" + "'", str9, "admin");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "admin" + "'", str10, "admin");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "admin" + "'", str11, "admin");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test14488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14488");
        model.Admin admin2 = new model.Admin("", "");
        java.lang.String str3 = admin2.getAccountType();
        java.lang.String str4 = admin2.getEmail();
        java.lang.String str5 = admin2.getID();
        double double6 = admin2.getHourlyRate();
        java.lang.String str7 = admin2.getAccountType();
        double double8 = admin2.getHourlyRate();
        java.lang.String str9 = admin2.getEmail();
        admin2.viewProfile();
        admin2.setVerified(false);
        admin2.login("admin", "hi!");
        java.lang.String str16 = admin2.getEmail();
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
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test14489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14489");
        model.Admin admin2 = new model.Admin("", "");
        java.lang.String str3 = admin2.getAccountType();
        java.lang.String str4 = admin2.getEmail();
        java.lang.String str5 = admin2.getID();
        double double6 = admin2.getHourlyRate();
        java.lang.String str7 = admin2.getAccountType();
        admin2.login("admin", "");
        java.lang.String str11 = admin2.getAccountType();
        boolean boolean12 = admin2.isVerified();
        admin2.login("", "admin");
        admin2.logout();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "admin" + "'", str11, "admin");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test14490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14490");
        model.Admin admin2 = new model.Admin("", "");
        java.lang.String str3 = admin2.getAccountType();
        java.lang.String str4 = admin2.getEmail();
        java.lang.String str5 = admin2.getID();
        double double6 = admin2.getHourlyRate();
        java.lang.String str7 = admin2.getEmail();
        admin2.login("admin", "admin");
        java.lang.String str11 = admin2.getEmail();
        double double12 = admin2.getHourlyRate();
        boolean boolean13 = admin2.isVerified();
        admin2.setVerified(false);
        java.lang.String str16 = admin2.getAccountType();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "admin" + "'", str16, "admin");
    }

    @Test
    public void test14491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14491");
        model.Admin admin2 = new model.Admin("admin", "admin");
        admin2.viewProfile();
        admin2.viewProfile();
        admin2.login("hi!", "admin");
        java.lang.String str8 = admin2.getID();
        admin2.setVerified(false);
        admin2.logout();
        boolean boolean12 = admin2.isVerified();
        admin2.login("", "");
        room.Room room16 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.addRoom(room16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.getRoomID()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "admin" + "'", str8, "admin");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test14492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14492");
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
        boolean boolean13 = admin2.isVerified();
        admin2.setVerified(false);
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
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test14493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14493");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        admin2.logout();
        java.lang.String str5 = admin2.getAccountType();
        boolean boolean6 = admin2.isVerified();
        admin2.login("hi!", "");
        java.lang.String str10 = admin2.getEmail();
        java.lang.String str11 = admin2.getAccountType();
        admin2.viewProfile();
        java.lang.String str13 = admin2.getAccountType();
        java.lang.String str14 = admin2.getAccountType();
        boolean boolean15 = admin2.isVerified();
        java.lang.String str16 = admin2.getAccountType();
        java.lang.Class<?> wildcardClass17 = admin2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "admin" + "'", str11, "admin");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "admin" + "'", str13, "admin");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "admin" + "'", str14, "admin");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "admin" + "'", str16, "admin");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test14494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14494");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        admin2.logout();
        java.lang.String str5 = admin2.getAccountType();
        boolean boolean6 = admin2.isVerified();
        admin2.login("hi!", "admin");
        admin2.setVerified(true);
        admin2.viewProfile();
        admin2.logout();
        admin2.login("", "hi!");
        admin2.setVerified(false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test14495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14495");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        java.lang.String str4 = admin2.getAccountType();
        java.lang.String str5 = admin2.getPassword();
        admin2.logout();
        java.lang.String str7 = admin2.getAccountType();
        admin2.setVerified(false);
        java.lang.String str10 = admin2.getAccountType();
        java.lang.String str11 = admin2.getPassword();
        java.lang.String str12 = admin2.getEmail();
        java.lang.String str13 = admin2.getAccountType();
        admin2.setVerified(true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "admin" + "'", str4, "admin");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "admin" + "'", str10, "admin");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "admin" + "'", str13, "admin");
    }

    @Test
    public void test14496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14496");
        model.Admin admin2 = new model.Admin("", "");
        java.lang.String str3 = admin2.getAccountType();
        java.lang.String str4 = admin2.getEmail();
        java.lang.String str5 = admin2.getID();
        double double6 = admin2.getHourlyRate();
        java.lang.String str7 = admin2.getAccountType();
        double double8 = admin2.getHourlyRate();
        java.lang.String str9 = admin2.getID();
        java.lang.String str10 = admin2.getPassword();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "admin" + "'", str9, "admin");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test14497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14497");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        admin2.logout();
        java.lang.String str5 = admin2.getAccountType();
        admin2.viewProfile();
        admin2.setVerified(false);
        admin2.setVerified(true);
        java.lang.String str11 = admin2.getAccountType();
        java.lang.String str12 = admin2.getPassword();
        admin2.login("", "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "admin" + "'", str11, "admin");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test14498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14498");
        model.Admin admin2 = new model.Admin("", "");
        java.lang.String str3 = admin2.getAccountType();
        java.lang.String str4 = admin2.getEmail();
        double double5 = admin2.getHourlyRate();
        admin2.logout();
        java.lang.String str7 = admin2.getEmail();
        admin2.setVerified(false);
        java.lang.String str10 = admin2.getAccountType();
        java.lang.String str11 = admin2.getEmail();
        java.lang.String str12 = admin2.getEmail();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "admin" + "'", str10, "admin");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test14499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14499");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        admin2.logout();
        java.lang.String str5 = admin2.getAccountType();
        admin2.login("", "");
        java.lang.String str9 = admin2.getID();
        double double10 = admin2.getHourlyRate();
        admin2.setVerified(false);
        admin2.setVerified(true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "admin" + "'", str9, "admin");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test14500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14500");
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
        double double13 = admin2.getHourlyRate();
        admin2.viewProfile();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "admin" + "'", str6, "admin");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "admin" + "'", str12, "admin");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }
}

