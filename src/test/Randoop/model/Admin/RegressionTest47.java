import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest47 {

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
    public void test23501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23501");
        model.Admin admin2 = new model.Admin("hi!", "");
        admin2.login("", "hi!");
        java.lang.String str6 = admin2.getPassword();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test23502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23502");
        model.Admin admin2 = new model.Admin("", "admin");
        java.lang.String str3 = admin2.getEmail();
        admin2.viewProfile();
        java.lang.String str5 = admin2.getAccountType();
        admin2.viewProfile();
        java.lang.String str7 = admin2.getAccountType();
        double double8 = admin2.getHourlyRate();
        boolean boolean9 = admin2.isVerified();
        boolean boolean10 = admin2.isVerified();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test23503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23503");
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
        java.lang.String str12 = admin2.getID();
        admin2.viewProfile();
        java.lang.String str14 = admin2.getEmail();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "admin" + "'", str6, "admin");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "admin" + "'", str11, "admin");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "admin" + "'", str12, "admin");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test23504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23504");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        admin2.logout();
        java.lang.String str5 = admin2.getAccountType();
        boolean boolean6 = admin2.isVerified();
        admin2.login("hi!", "admin");
        java.lang.String str10 = admin2.getID();
        boolean boolean11 = admin2.isVerified();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "admin" + "'", str10, "admin");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test23505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23505");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        double double5 = admin2.getHourlyRate();
        double double6 = admin2.getHourlyRate();
        java.lang.String str7 = admin2.getPassword();
        admin2.logout();
        double double9 = admin2.getHourlyRate();
        boolean boolean10 = admin2.isVerified();
        admin2.logout();
        java.lang.String str12 = admin2.getAccountType();
        boolean boolean13 = admin2.isVerified();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "admin" + "'", str12, "admin");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test23506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23506");
        model.Admin admin2 = new model.Admin("admin", "admin");
        admin2.viewProfile();
        java.lang.String str4 = admin2.getPassword();
        admin2.login("", "");
        boolean boolean8 = admin2.isVerified();
        admin2.setVerified(false);
        double double11 = admin2.getHourlyRate();
        java.lang.String str12 = admin2.getPassword();
        admin2.viewProfile();
        java.lang.String str14 = admin2.getAccountType();
        java.lang.String str15 = admin2.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "admin" + "'", str4, "admin");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "admin" + "'", str12, "admin");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "admin" + "'", str14, "admin");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "admin" + "'", str15, "admin");
    }

    @Test
    public void test23507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23507");
        model.Admin admin2 = new model.Admin("hi!", "admin");
        admin2.viewProfile();
        admin2.logout();
        java.lang.String str5 = admin2.getID();
        java.lang.String str6 = admin2.getID();
        java.lang.Class<?> wildcardClass7 = admin2.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "admin" + "'", str6, "admin");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test23508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23508");
        model.Admin admin2 = new model.Admin("admin", "admin");
        admin2.viewProfile();
        java.lang.String str4 = admin2.getPassword();
        admin2.login("", "");
        boolean boolean8 = admin2.isVerified();
        admin2.setVerified(false);
        admin2.viewProfile();
        admin2.viewProfile();
        java.lang.String str13 = admin2.getID();
        boolean boolean14 = admin2.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "admin" + "'", str4, "admin");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "admin" + "'", str13, "admin");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test23509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23509");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        double double5 = admin2.getHourlyRate();
        double double6 = admin2.getHourlyRate();
        java.lang.String str7 = admin2.getPassword();
        admin2.setVerified(true);
        java.lang.String str10 = admin2.getEmail();
        java.lang.String str11 = admin2.getID();
        admin2.logout();
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
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "admin" + "'", str11, "admin");
    }

    @Test
    public void test23510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23510");
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
        admin2.viewProfile();
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
    }

    @Test
    public void test23511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23511");
        model.Admin admin2 = new model.Admin("", "");
        java.lang.String str3 = admin2.getAccountType();
        java.lang.String str4 = admin2.getEmail();
        double double5 = admin2.getHourlyRate();
        admin2.setVerified(true);
        java.lang.String str8 = admin2.getPassword();
        java.lang.String str9 = admin2.getPassword();
        java.lang.String str10 = admin2.getEmail();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test23512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23512");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        java.lang.String str5 = admin2.getID();
        java.lang.String str6 = admin2.getID();
        java.lang.String str7 = admin2.getAccountType();
        admin2.logout();
        java.lang.String str9 = admin2.getEmail();
        boolean boolean10 = admin2.isVerified();
        double double11 = admin2.getHourlyRate();
        java.lang.String str12 = admin2.getEmail();
        java.lang.String str13 = admin2.getID();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "admin" + "'", str6, "admin");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "admin" + "'", str13, "admin");
    }

    @Test
    public void test23513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23513");
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
        admin2.logout();
        java.lang.String str18 = admin2.getEmail();
        admin2.setVerified(false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "admin" + "'", str9, "admin");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "admin" + "'", str11, "admin");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "admin" + "'", str13, "admin");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "admin" + "'", str16, "admin");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test23514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23514");
        model.Admin admin2 = new model.Admin("admin", "admin");
        boolean boolean3 = admin2.isVerified();
        admin2.login("hi!", "");
        admin2.setVerified(true);
        admin2.viewProfile();
        double double10 = admin2.getHourlyRate();
        admin2.viewProfile();
        admin2.login("hi!", "");
        double double15 = admin2.getHourlyRate();
        boolean boolean16 = admin2.isVerified();
        java.lang.String str17 = admin2.getPassword();
        admin2.logout();
        admin2.login("hi!", "admin");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "admin" + "'", str17, "admin");
    }

    @Test
    public void test23515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23515");
        model.Admin admin2 = new model.Admin("admin", "admin");
        boolean boolean3 = admin2.isVerified();
        admin2.login("hi!", "");
        admin2.viewProfile();
        java.lang.String str8 = admin2.getPassword();
        java.lang.String str9 = admin2.getAccountType();
        admin2.viewProfile();
        java.lang.String str11 = admin2.getPassword();
        double double12 = admin2.getHourlyRate();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "admin" + "'", str8, "admin");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "admin" + "'", str9, "admin");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "admin" + "'", str11, "admin");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test23516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23516");
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
        admin2.setVerified(true);
        java.lang.String str23 = admin2.getAccountType();
        double double24 = admin2.getHourlyRate();
        admin2.logout();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "admin" + "'", str11, "admin");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "admin" + "'", str23, "admin");
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
    }

    @Test
    public void test23517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23517");
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
        java.lang.String str20 = admin2.getPassword();
        admin2.logout();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test23518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23518");
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
        boolean boolean13 = admin2.isVerified();
        double double14 = admin2.getHourlyRate();
        admin2.viewProfile();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "admin" + "'", str6, "admin");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "admin" + "'", str11, "admin");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test23519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23519");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        double double5 = admin2.getHourlyRate();
        admin2.setVerified(false);
        admin2.login("hi!", "");
        boolean boolean11 = admin2.isVerified();
        admin2.login("hi!", "");
        admin2.logout();
        admin2.login("", "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test23520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23520");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        admin2.logout();
        java.lang.String str5 = admin2.getAccountType();
        admin2.setVerified(true);
        double double8 = admin2.getHourlyRate();
        java.lang.String str9 = admin2.getPassword();
        boolean boolean10 = admin2.isVerified();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test23521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23521");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        admin2.logout();
        java.lang.String str5 = admin2.getAccountType();
        admin2.viewProfile();
        admin2.login("hi!", "admin");
        java.lang.String str10 = admin2.getAccountType();
        boolean boolean11 = admin2.isVerified();
        double double12 = admin2.getHourlyRate();
        java.lang.String str13 = admin2.getPassword();
        java.lang.String str14 = admin2.getAccountType();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "admin" + "'", str10, "admin");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "admin" + "'", str14, "admin");
    }

    @Test
    public void test23522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23522");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        admin2.logout();
        java.lang.String str5 = admin2.getAccountType();
        admin2.login("", "");
        java.lang.String str9 = admin2.getEmail();
        java.lang.String str10 = admin2.getAccountType();
        java.lang.String str11 = admin2.getAccountType();
        double double12 = admin2.getHourlyRate();
        double double13 = admin2.getHourlyRate();
        java.lang.String str14 = admin2.getPassword();
        java.lang.String str15 = admin2.getAccountType();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "admin" + "'", str10, "admin");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "admin" + "'", str11, "admin");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "admin" + "'", str15, "admin");
    }

    @Test
    public void test23523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23523");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        double double5 = admin2.getHourlyRate();
        admin2.setVerified(true);
        admin2.logout();
        java.lang.String str9 = admin2.getAccountType();
        java.lang.String str10 = admin2.getAccountType();
        double double11 = admin2.getHourlyRate();
        java.lang.String str12 = admin2.getPassword();
        admin2.logout();
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
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "admin" + "'", str9, "admin");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "admin" + "'", str10, "admin");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test23524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23524");
        model.Admin admin2 = new model.Admin("admin", "");
        admin2.setVerified(true);
        boolean boolean5 = admin2.isVerified();
        java.lang.String str6 = admin2.getAccountType();
        java.lang.String str7 = admin2.getAccountType();
        java.lang.String str8 = admin2.getAccountType();
        java.lang.String str9 = admin2.getPassword();
        java.lang.String str10 = admin2.getID();
        admin2.login("", "hi!");
        room.Room room14 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.disableRoom(room14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "admin" + "'", str6, "admin");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "admin" + "'", str8, "admin");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "admin" + "'", str10, "admin");
    }

    @Test
    public void test23525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23525");
        model.Admin admin2 = new model.Admin("admin", "admin");
        boolean boolean3 = admin2.isVerified();
        admin2.login("hi!", "");
        double double7 = admin2.getHourlyRate();
        boolean boolean8 = admin2.isVerified();
        admin2.viewProfile();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test23526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23526");
        model.Admin admin2 = new model.Admin("", "admin");
        java.lang.String str3 = admin2.getEmail();
        java.lang.String str4 = admin2.getPassword();
        java.lang.String str5 = admin2.getID();
        admin2.viewProfile();
        double double7 = admin2.getHourlyRate();
        admin2.logout();
        admin2.setVerified(true);
        admin2.setVerified(false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "admin" + "'", str4, "admin");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test23527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23527");
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
        admin2.setVerified(false);
        double double17 = admin2.getHourlyRate();
        admin2.viewProfile();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "admin" + "'", str9, "admin");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "admin" + "'", str10, "admin");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
    }

    @Test
    public void test23528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23528");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        admin2.logout();
        java.lang.String str5 = admin2.getAccountType();
        admin2.login("hi!", "");
        double double9 = admin2.getHourlyRate();
        java.lang.String str10 = admin2.getEmail();
        java.lang.String str11 = admin2.getEmail();
        boolean boolean12 = admin2.isVerified();
        java.lang.String str13 = admin2.getID();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "admin" + "'", str13, "admin");
    }

    @Test
    public void test23529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23529");
        model.Admin admin2 = new model.Admin("admin", "");
        admin2.logout();
        double double4 = admin2.getHourlyRate();
        admin2.setVerified(false);
        double double7 = admin2.getHourlyRate();
        admin2.logout();
        double double9 = admin2.getHourlyRate();
        admin2.viewProfile();
        java.lang.String str11 = admin2.getAccountType();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "admin" + "'", str11, "admin");
    }

    @Test
    public void test23530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23530");
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
        boolean boolean18 = admin2.isVerified();
        boolean boolean19 = admin2.isVerified();
        admin2.viewProfile();
        admin2.viewProfile();
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
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test23531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23531");
        model.Admin admin2 = new model.Admin("", "admin");
        java.lang.String str3 = admin2.getEmail();
        java.lang.String str4 = admin2.getPassword();
        admin2.logout();
        java.lang.String str6 = admin2.getID();
        java.lang.String str7 = admin2.getID();
        admin2.login("", "hi!");
        admin2.logout();
        java.lang.Class<?> wildcardClass12 = admin2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "admin" + "'", str4, "admin");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "admin" + "'", str6, "admin");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test23532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23532");
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
        boolean boolean17 = admin2.isVerified();
        boolean boolean18 = admin2.isVerified();
        admin2.login("admin", "admin");
        java.lang.String str22 = admin2.getAccountType();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "admin" + "'", str12, "admin");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "admin" + "'", str22, "admin");
    }

    @Test
    public void test23533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23533");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        java.lang.String str5 = admin2.getEmail();
        admin2.logout();
        java.lang.String str7 = admin2.getPassword();
        boolean boolean8 = admin2.isVerified();
        java.lang.String str9 = admin2.getEmail();
        java.lang.String str10 = admin2.getAccountType();
        java.lang.String str11 = admin2.getPassword();
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
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "admin" + "'", str10, "admin");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test23534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23534");
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
        admin2.login("admin", "");
        admin2.login("admin", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test23535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23535");
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
        boolean boolean13 = admin2.isVerified();
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
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "admin" + "'", str9, "admin");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "admin" + "'", str10, "admin");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test23536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23536");
        model.Admin admin2 = new model.Admin("admin", "");
        admin2.setVerified(true);
        java.lang.String str5 = admin2.getEmail();
        double double6 = admin2.getHourlyRate();
        java.lang.String str7 = admin2.getPassword();
        java.lang.String str8 = admin2.getEmail();
        java.lang.String str9 = admin2.getAccountType();
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
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "admin" + "'", str8, "admin");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "admin" + "'", str9, "admin");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test23537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23537");
        model.Admin admin2 = new model.Admin("", "");
        admin2.viewProfile();
        admin2.logout();
        double double5 = admin2.getHourlyRate();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test23538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23538");
        model.Admin admin2 = new model.Admin("admin", "admin");
        admin2.viewProfile();
        java.lang.String str4 = admin2.getPassword();
        admin2.login("", "");
        admin2.viewProfile();
        admin2.login("", "admin");
        java.lang.String str12 = admin2.getEmail();
        admin2.setVerified(true);
        java.lang.String str15 = admin2.getAccountType();
        java.lang.String str16 = admin2.getID();
        java.lang.String str17 = admin2.getPassword();
        java.lang.Class<?> wildcardClass18 = admin2.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "admin" + "'", str4, "admin");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "admin" + "'", str12, "admin");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "admin" + "'", str15, "admin");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "admin" + "'", str16, "admin");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "admin" + "'", str17, "admin");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test23539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23539");
        model.Admin admin2 = new model.Admin("", "hi!");
        boolean boolean3 = admin2.isVerified();
        java.lang.String str4 = admin2.getPassword();
        admin2.viewProfile();
        java.lang.String str6 = admin2.getID();
        double double7 = admin2.getHourlyRate();
        admin2.logout();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "admin" + "'", str6, "admin");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test23540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23540");
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
        double double12 = admin2.getHourlyRate();
        java.lang.String str13 = admin2.getID();
        java.lang.String str14 = admin2.getEmail();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "admin" + "'", str13, "admin");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test23541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23541");
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
        admin2.logout();
        admin2.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "admin" + "'", str4, "admin");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test23542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23542");
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
        java.lang.String str21 = admin2.getEmail();
        double double22 = admin2.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
    }

    @Test
    public void test23543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23543");
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
        room.Room room15 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.enableRoom(room15);
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
    public void test23544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23544");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        double double5 = admin2.getHourlyRate();
        admin2.setVerified(false);
        admin2.logout();
        java.lang.String str9 = admin2.getPassword();
        admin2.login("admin", "admin");
        admin2.login("", "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test23545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23545");
        model.Admin admin2 = new model.Admin("admin", "admin");
        admin2.viewProfile();
        java.lang.String str4 = admin2.getPassword();
        double double5 = admin2.getHourlyRate();
        java.lang.String str6 = admin2.getAccountType();
        admin2.login("hi!", "admin");
        admin2.login("admin", "hi!");
        boolean boolean13 = admin2.isVerified();
        admin2.login("hi!", "admin");
        java.lang.Class<?> wildcardClass17 = admin2.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "admin" + "'", str4, "admin");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "admin" + "'", str6, "admin");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test23546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23546");
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
        boolean boolean23 = admin2.isVerified();
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
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test23547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23547");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        java.lang.String str5 = admin2.getAccountType();
        java.lang.String str6 = admin2.getAccountType();
        java.lang.Class<?> wildcardClass7 = admin2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "admin" + "'", str6, "admin");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test23548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23548");
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
        admin2.viewProfile();
        admin2.viewProfile();
        admin2.viewProfile();
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
    }

    @Test
    public void test23549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23549");
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
        admin2.viewProfile();
        admin2.viewProfile();
        java.lang.String str18 = admin2.getAccountType();
        admin2.login("admin", "admin");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "admin" + "'", str13, "admin");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "admin" + "'", str14, "admin");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "admin" + "'", str18, "admin");
    }

    @Test
    public void test23550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23550");
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
        admin2.viewProfile();
        java.lang.String str19 = admin2.getID();
        java.lang.String str20 = admin2.getID();
        admin2.viewProfile();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "admin" + "'", str19, "admin");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "admin" + "'", str20, "admin");
    }

    @Test
    public void test23551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23551");
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
        java.lang.String str13 = admin2.getEmail();
        java.lang.String str14 = admin2.getAccountType();
        admin2.login("admin", "hi!");
        admin2.login("", "hi!");
        java.lang.String str21 = admin2.getID();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "admin" + "'", str14, "admin");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "admin" + "'", str21, "admin");
    }

    @Test
    public void test23552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23552");
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
        admin2.login("admin", "admin");
        admin2.setVerified(true);
        java.lang.String str24 = admin2.getID();
        java.lang.String str25 = admin2.getID();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "admin" + "'", str24, "admin");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "admin" + "'", str25, "admin");
    }

    @Test
    public void test23553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23553");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        java.lang.String str4 = admin2.getAccountType();
        java.lang.String str5 = admin2.getPassword();
        admin2.setVerified(true);
        admin2.login("", "");
        admin2.login("admin", "admin");
        admin2.login("admin", "hi!");
        admin2.logout();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "admin" + "'", str4, "admin");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test23554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23554");
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
        java.lang.String str21 = admin2.getPassword();
        admin2.login("admin", "");
        java.lang.String str25 = admin2.getID();
        java.lang.String str26 = admin2.getID();
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
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "admin" + "'", str25, "admin");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "admin" + "'", str26, "admin");
    }

    @Test
    public void test23555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23555");
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
        admin2.viewProfile();
        admin2.login("hi!", "hi!");
        admin2.logout();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "admin" + "'", str14, "admin");
    }

    @Test
    public void test23556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23556");
        model.Admin admin2 = new model.Admin("", "");
        java.lang.String str3 = admin2.getAccountType();
        admin2.setVerified(true);
        double double6 = admin2.getHourlyRate();
        admin2.viewProfile();
        boolean boolean8 = admin2.isVerified();
        java.lang.String str9 = admin2.getID();
        admin2.setVerified(false);
        java.lang.String str12 = admin2.getID();
        java.lang.String str13 = admin2.getAccountType();
        double double14 = admin2.getHourlyRate();
        java.lang.String str15 = admin2.getEmail();
        admin2.login("", "admin");
        admin2.viewProfile();
        admin2.login("hi!", "");
        boolean boolean23 = admin2.isVerified();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "admin" + "'", str9, "admin");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "admin" + "'", str12, "admin");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "admin" + "'", str13, "admin");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test23557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23557");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        admin2.logout();
        admin2.setVerified(false);
        java.lang.String str6 = admin2.getEmail();
        java.lang.String str7 = admin2.getID();
        admin2.setVerified(true);
        java.lang.String str10 = admin2.getID();
        java.lang.String str11 = admin2.getAccountType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "admin" + "'", str10, "admin");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "admin" + "'", str11, "admin");
    }

    @Test
    public void test23558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23558");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getAccountType();
        boolean boolean4 = admin2.isVerified();
        boolean boolean5 = admin2.isVerified();
        admin2.logout();
        admin2.login("admin", "hi!");
        boolean boolean10 = admin2.isVerified();
        admin2.logout();
        admin2.setVerified(true);
        boolean boolean14 = admin2.isVerified();
        admin2.viewProfile();
        java.lang.String str16 = admin2.getPassword();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test23559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23559");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getAccountType();
        boolean boolean4 = admin2.isVerified();
        admin2.setVerified(false);
        java.lang.String str7 = admin2.getPassword();
        double double8 = admin2.getHourlyRate();
        java.lang.String str9 = admin2.getPassword();
        admin2.viewProfile();
        admin2.login("hi!", "admin");
        double double14 = admin2.getHourlyRate();
        java.lang.String str15 = admin2.getAccountType();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "admin" + "'", str15, "admin");
    }

    @Test
    public void test23560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23560");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        admin2.logout();
        java.lang.String str5 = admin2.getAccountType();
        admin2.login("", "");
        java.lang.String str9 = admin2.getPassword();
        admin2.logout();
        admin2.login("", "");
        java.lang.String str14 = admin2.getID();
        admin2.viewProfile();
        admin2.login("admin", "hi!");
        admin2.viewProfile();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "admin" + "'", str14, "admin");
    }

    @Test
    public void test23561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23561");
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
        java.lang.String str17 = admin2.getID();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "admin" + "'", str15, "admin");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "admin" + "'", str16, "admin");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "admin" + "'", str17, "admin");
    }

    @Test
    public void test23562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23562");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getPassword();
        boolean boolean4 = admin2.isVerified();
        java.lang.String str5 = admin2.getID();
        java.lang.String str6 = admin2.getEmail();
        java.lang.String str7 = admin2.getAccountType();
        admin2.setVerified(false);
        java.lang.String str10 = admin2.getPassword();
        admin2.setVerified(false);
        java.lang.String str13 = admin2.getAccountType();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "admin" + "'", str13, "admin");
    }

    @Test
    public void test23563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23563");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        admin2.logout();
        java.lang.String str5 = admin2.getAccountType();
        admin2.viewProfile();
        admin2.login("hi!", "admin");
        boolean boolean10 = admin2.isVerified();
        admin2.logout();
        admin2.setVerified(false);
        java.lang.String str14 = admin2.getEmail();
        java.lang.String str15 = admin2.getID();
        java.lang.String str16 = admin2.getPassword();
        admin2.setVerified(true);
        admin2.login("admin", "");
        admin2.login("hi!", "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "admin" + "'", str15, "admin");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test23564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23564");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        java.lang.String str4 = admin2.getPassword();
        java.lang.String str5 = admin2.getAccountType();
        java.lang.String str6 = admin2.getEmail();
        admin2.logout();
        admin2.viewProfile();
        java.lang.String str9 = admin2.getEmail();
        admin2.login("admin", "");
        double double13 = admin2.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test23565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23565");
        model.Admin admin2 = new model.Admin("admin", "admin");
        admin2.viewProfile();
        java.lang.String str4 = admin2.getPassword();
        admin2.login("", "");
        java.lang.String str8 = admin2.getEmail();
        java.lang.String str9 = admin2.getAccountType();
        java.lang.String str10 = admin2.getPassword();
        java.lang.String str11 = admin2.getID();
        admin2.logout();
        java.lang.String str13 = admin2.getPassword();
        admin2.viewProfile();
        admin2.logout();
        admin2.login("", "admin");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "admin" + "'", str4, "admin");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "admin" + "'", str8, "admin");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "admin" + "'", str9, "admin");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "admin" + "'", str10, "admin");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "admin" + "'", str11, "admin");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "admin" + "'", str13, "admin");
    }

    @Test
    public void test23566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23566");
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
        double double21 = admin2.getHourlyRate();
        admin2.viewProfile();
        java.lang.String str23 = admin2.getEmail();
        boolean boolean24 = admin2.isVerified();
        boolean boolean25 = admin2.isVerified();
        room.Room room26 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.enableRoom(room26);
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
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test23567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23567");
        model.Admin admin2 = new model.Admin("", "");
        java.lang.String str3 = admin2.getAccountType();
        admin2.setVerified(true);
        java.lang.String str6 = admin2.getAccountType();
        admin2.logout();
        java.lang.String str8 = admin2.getID();
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
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "admin" + "'", str6, "admin");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "admin" + "'", str8, "admin");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "admin" + "'", str9, "admin");
    }

    @Test
    public void test23568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23568");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        admin2.logout();
        java.lang.String str5 = admin2.getAccountType();
        boolean boolean6 = admin2.isVerified();
        java.lang.String str7 = admin2.getAccountType();
        java.lang.String str8 = admin2.getAccountType();
        admin2.setVerified(false);
        java.lang.String str11 = admin2.getID();
        boolean boolean12 = admin2.isVerified();
        java.lang.Class<?> wildcardClass13 = admin2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "admin" + "'", str8, "admin");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "admin" + "'", str11, "admin");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test23569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23569");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        java.lang.String str5 = admin2.getEmail();
        admin2.logout();
        java.lang.String str7 = admin2.getPassword();
        java.lang.String str8 = admin2.getAccountType();
        java.lang.String str9 = admin2.getAccountType();
        java.lang.String str10 = admin2.getPassword();
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
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "admin" + "'", str8, "admin");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "admin" + "'", str9, "admin");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test23570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23570");
        model.Admin admin2 = new model.Admin("admin", "");
        admin2.setVerified(true);
        java.lang.String str5 = admin2.getEmail();
        double double6 = admin2.getHourlyRate();
        admin2.viewProfile();
        admin2.viewProfile();
        admin2.viewProfile();
        admin2.setVerified(false);
        admin2.logout();
        double double13 = admin2.getHourlyRate();
        room.Room room14 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.addRoom(room14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.getRoomID()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test23571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23571");
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
        admin2.login("admin", "admin");
        admin2.viewProfile();
        java.lang.String str25 = admin2.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "admin" + "'", str4, "admin");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "admin" + "'", str8, "admin");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "admin" + "'", str9, "admin");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "admin" + "'", str13, "admin");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "admin" + "'", str17, "admin");
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "admin" + "'", str25, "admin");
    }

    @Test
    public void test23572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23572");
        model.Admin admin2 = new model.Admin("admin", "");
        admin2.setVerified(true);
        java.lang.String str5 = admin2.getID();
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
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test23573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23573");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getAccountType();
        boolean boolean4 = admin2.isVerified();
        admin2.setVerified(false);
        admin2.viewProfile();
        admin2.login("admin", "hi!");
        boolean boolean11 = admin2.isVerified();
        admin2.logout();
        java.lang.String str13 = admin2.getEmail();
        java.lang.String str14 = admin2.getEmail();
        boolean boolean15 = admin2.isVerified();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test23574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23574");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getPassword();
        boolean boolean4 = admin2.isVerified();
        java.lang.String str5 = admin2.getID();
        java.lang.String str6 = admin2.getEmail();
        java.lang.String str7 = admin2.getAccountType();
        admin2.setVerified(false);
        admin2.viewProfile();
        java.lang.String str11 = admin2.getEmail();
        java.lang.String str12 = admin2.getID();
        room.Room room13 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.addRoom(room13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.getRoomID()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "admin" + "'", str12, "admin");
    }

    @Test
    public void test23575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23575");
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
        java.lang.String str13 = admin2.getAccountType();
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
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "admin" + "'", str12, "admin");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "admin" + "'", str13, "admin");
    }

    @Test
    public void test23576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23576");
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
        boolean boolean16 = admin2.isVerified();
        admin2.viewProfile();
        room.Room room18 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.disableRoom(room18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "admin" + "'", str8, "admin");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "admin" + "'", str14, "admin");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "admin" + "'", str15, "admin");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test23577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23577");
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
        boolean boolean15 = admin2.isVerified();
        java.lang.String str16 = admin2.getPassword();
        java.lang.String str17 = admin2.getAccountType();
        java.lang.String str18 = admin2.getPassword();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "admin" + "'", str17, "admin");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test23578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23578");
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
        admin2.setVerified(false);
        admin2.viewProfile();
        double double24 = admin2.getHourlyRate();
        java.lang.Class<?> wildcardClass25 = admin2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test23579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23579");
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
        admin2.setVerified(true);
        double double21 = admin2.getHourlyRate();
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
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "admin" + "'", str18, "admin");
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
    }

    @Test
    public void test23580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23580");
        model.Admin admin2 = new model.Admin("", "");
        java.lang.String str3 = admin2.getAccountType();
        admin2.setVerified(true);
        double double6 = admin2.getHourlyRate();
        admin2.viewProfile();
        boolean boolean8 = admin2.isVerified();
        java.lang.String str9 = admin2.getID();
        admin2.viewProfile();
        java.lang.String str11 = admin2.getPassword();
        boolean boolean12 = admin2.isVerified();
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
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "admin" + "'", str9, "admin");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test23581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23581");
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
        java.lang.String str17 = admin2.getID();
        boolean boolean18 = admin2.isVerified();
        room.Room room19 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.disableRoom(room19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "admin" + "'", str17, "admin");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test23582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23582");
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
        double double12 = admin2.getHourlyRate();
        admin2.viewProfile();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test23583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23583");
        model.Admin admin2 = new model.Admin("", "hi!");
        java.lang.String str3 = admin2.getPassword();
        admin2.setVerified(false);
        java.lang.String str6 = admin2.getPassword();
        boolean boolean7 = admin2.isVerified();
        java.lang.String str8 = admin2.getID();
        java.lang.String str9 = admin2.getPassword();
        java.lang.String str10 = admin2.getPassword();
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
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "admin" + "'", str8, "admin");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test23584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23584");
        model.Admin admin2 = new model.Admin("", "admin");
        java.lang.String str3 = admin2.getEmail();
        java.lang.String str4 = admin2.getPassword();
        admin2.logout();
        java.lang.String str6 = admin2.getID();
        java.lang.String str7 = admin2.getID();
        double double8 = admin2.getHourlyRate();
        java.lang.String str9 = admin2.getPassword();
        java.lang.String str10 = admin2.getPassword();
        admin2.setVerified(true);
        admin2.viewProfile();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "admin" + "'", str4, "admin");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "admin" + "'", str6, "admin");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "admin" + "'", str9, "admin");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "admin" + "'", str10, "admin");
    }

    @Test
    public void test23585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23585");
        model.Admin admin2 = new model.Admin("admin", "");
        admin2.logout();
        double double4 = admin2.getHourlyRate();
        admin2.setVerified(false);
        double double7 = admin2.getHourlyRate();
        boolean boolean8 = admin2.isVerified();
        double double9 = admin2.getHourlyRate();
        double double10 = admin2.getHourlyRate();
        java.lang.String str11 = admin2.getAccountType();
        admin2.logout();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "admin" + "'", str11, "admin");
    }

    @Test
    public void test23586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23586");
        model.Admin admin2 = new model.Admin("admin", "");
        admin2.setVerified(true);
        boolean boolean5 = admin2.isVerified();
        java.lang.String str6 = admin2.getAccountType();
        admin2.viewProfile();
        admin2.setVerified(false);
        admin2.viewProfile();
        java.lang.String str11 = admin2.getPassword();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "admin" + "'", str6, "admin");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test23587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23587");
        model.Admin admin2 = new model.Admin("admin", "");
        admin2.logout();
        admin2.viewProfile();
        admin2.viewProfile();
        admin2.logout();
        boolean boolean7 = admin2.isVerified();
        java.lang.String str8 = admin2.getEmail();
        admin2.logout();
        admin2.logout();
        java.lang.String str11 = admin2.getID();
        admin2.login("", "admin");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "admin" + "'", str8, "admin");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "admin" + "'", str11, "admin");
    }

    @Test
    public void test23588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23588");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getAccountType();
        boolean boolean4 = admin2.isVerified();
        java.lang.String str5 = admin2.getPassword();
        java.lang.String str6 = admin2.getID();
        java.lang.String str7 = admin2.getID();
        admin2.logout();
        java.lang.String str9 = admin2.getEmail();
        admin2.logout();
        admin2.setVerified(true);
        admin2.viewProfile();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "admin" + "'", str6, "admin");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test23589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23589");
        model.Admin admin2 = new model.Admin("hi!", "");
        java.lang.String str3 = admin2.getEmail();
        admin2.login("", "admin");
        admin2.login("admin", "hi!");
        java.lang.String str10 = admin2.getID();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "admin" + "'", str10, "admin");
    }

    @Test
    public void test23590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23590");
        model.Admin admin2 = new model.Admin("admin", "admin");
        admin2.viewProfile();
        java.lang.String str4 = admin2.getID();
        java.lang.String str5 = admin2.getAccountType();
        java.lang.String str6 = admin2.getEmail();
        java.lang.String str7 = admin2.getPassword();
        java.lang.String str8 = admin2.getPassword();
        admin2.setVerified(true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "admin" + "'", str4, "admin");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "admin" + "'", str6, "admin");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "admin" + "'", str8, "admin");
    }

    @Test
    public void test23591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23591");
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
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test23592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23592");
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
        java.lang.String str16 = admin2.getID();
        admin2.setVerified(false);
        room.Room room19 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.addRoom(room19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.getRoomID()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "admin" + "'", str8, "admin");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "admin" + "'", str14, "admin");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "admin" + "'", str15, "admin");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "admin" + "'", str16, "admin");
    }

    @Test
    public void test23593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23593");
        model.Admin admin2 = new model.Admin("admin", "");
        admin2.setVerified(true);
        java.lang.String str5 = admin2.getAccountType();
        admin2.setVerified(false);
        java.lang.String str8 = admin2.getID();
        java.lang.String str9 = admin2.getEmail();
        boolean boolean10 = admin2.isVerified();
        java.lang.String str11 = admin2.getPassword();
        java.lang.String str12 = admin2.getAccountType();
        admin2.login("", "hi!");
        admin2.setVerified(true);
        java.lang.String str18 = admin2.getPassword();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "admin" + "'", str8, "admin");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "admin" + "'", str9, "admin");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "admin" + "'", str12, "admin");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test23594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23594");
        model.Admin admin2 = new model.Admin("admin", "admin");
        admin2.viewProfile();
        admin2.viewProfile();
        admin2.login("hi!", "admin");
        java.lang.String str8 = admin2.getID();
        admin2.setVerified(false);
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
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "admin" + "'", str8, "admin");
    }

    @Test
    public void test23595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23595");
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
        admin2.viewProfile();
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
    public void test23596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23596");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        admin2.logout();
        java.lang.String str5 = admin2.getAccountType();
        java.lang.String str6 = admin2.getEmail();
        double double7 = admin2.getHourlyRate();
        java.lang.String str8 = admin2.getID();
        double double9 = admin2.getHourlyRate();
        admin2.logout();
        double double11 = admin2.getHourlyRate();
        java.lang.String str12 = admin2.getID();
        admin2.logout();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "admin" + "'", str8, "admin");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "admin" + "'", str12, "admin");
    }

    @Test
    public void test23597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23597");
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
        java.lang.String str16 = admin2.getID();
        admin2.viewProfile();
        java.lang.String str18 = admin2.getID();
        admin2.login("hi!", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "admin" + "'", str10, "admin");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "admin" + "'", str16, "admin");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "admin" + "'", str18, "admin");
    }

    @Test
    public void test23598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23598");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getAccountType();
        boolean boolean4 = admin2.isVerified();
        java.lang.String str5 = admin2.getPassword();
        java.lang.String str6 = admin2.getEmail();
        admin2.login("", "");
        admin2.setVerified(false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test23599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23599");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        admin2.logout();
        java.lang.String str5 = admin2.getAccountType();
        admin2.viewProfile();
        admin2.setVerified(false);
        java.lang.String str9 = admin2.getEmail();
        admin2.setVerified(false);
        java.lang.String str12 = admin2.getID();
        admin2.login("", "");
        java.lang.String str16 = admin2.getID();
        boolean boolean17 = admin2.isVerified();
        java.lang.String str18 = admin2.getAccountType();
        admin2.login("", "admin");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "admin" + "'", str12, "admin");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "admin" + "'", str16, "admin");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "admin" + "'", str18, "admin");
    }

    @Test
    public void test23600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23600");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        double double5 = admin2.getHourlyRate();
        double double6 = admin2.getHourlyRate();
        admin2.viewProfile();
        admin2.login("", "");
        java.lang.String str11 = admin2.getID();
        java.lang.String str12 = admin2.getEmail();
        java.lang.String str13 = admin2.getAccountType();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "admin" + "'", str11, "admin");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "admin" + "'", str13, "admin");
    }

    @Test
    public void test23601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23601");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getAccountType();
        boolean boolean4 = admin2.isVerified();
        admin2.setVerified(false);
        admin2.login("hi!", "");
        admin2.viewProfile();
        admin2.setVerified(true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test23602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23602");
        model.Admin admin2 = new model.Admin("admin", "");
        admin2.setVerified(true);
        java.lang.String str5 = admin2.getEmail();
        double double6 = admin2.getHourlyRate();
        java.lang.String str7 = admin2.getPassword();
        java.lang.String str8 = admin2.getID();
        java.lang.String str9 = admin2.getPassword();
        java.lang.String str10 = admin2.getAccountType();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "admin" + "'", str8, "admin");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "admin" + "'", str10, "admin");
    }

    @Test
    public void test23603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23603");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        admin2.logout();
        java.lang.String str5 = admin2.getAccountType();
        boolean boolean6 = admin2.isVerified();
        admin2.login("hi!", "admin");
        java.lang.String str10 = admin2.getAccountType();
        java.lang.String str11 = admin2.getEmail();
        admin2.setVerified(false);
        double double14 = admin2.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "admin" + "'", str10, "admin");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test23604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23604");
        model.Admin admin2 = new model.Admin("admin", "admin");
        admin2.viewProfile();
        java.lang.String str4 = admin2.getPassword();
        boolean boolean5 = admin2.isVerified();
        java.lang.String str6 = admin2.getPassword();
        admin2.login("", "");
        admin2.login("hi!", "hi!");
        double double13 = admin2.getHourlyRate();
        admin2.setVerified(false);
        admin2.viewProfile();
        java.lang.String str17 = admin2.getEmail();
        java.lang.Class<?> wildcardClass18 = admin2.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "admin" + "'", str4, "admin");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "admin" + "'", str6, "admin");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "admin" + "'", str17, "admin");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test23605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23605");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getAccountType();
        java.lang.String str4 = admin2.getPassword();
        admin2.setVerified(true);
        java.lang.String str7 = admin2.getID();
        java.lang.String str8 = admin2.getEmail();
        admin2.login("admin", "");
        admin2.viewProfile();
        double double13 = admin2.getHourlyRate();
        admin2.viewProfile();
        java.lang.String str15 = admin2.getEmail();
        admin2.setVerified(false);
        admin2.logout();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test23606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23606");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        admin2.logout();
        java.lang.String str5 = admin2.getAccountType();
        boolean boolean6 = admin2.isVerified();
        java.lang.String str7 = admin2.getPassword();
        java.lang.String str8 = admin2.getEmail();
        admin2.login("hi!", "admin");
        boolean boolean12 = admin2.isVerified();
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
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test23607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23607");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getAccountType();
        boolean boolean4 = admin2.isVerified();
        admin2.setVerified(false);
        boolean boolean7 = admin2.isVerified();
        admin2.login("", "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test23608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23608");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        double double5 = admin2.getHourlyRate();
        double double6 = admin2.getHourlyRate();
        java.lang.String str7 = admin2.getID();
        boolean boolean8 = admin2.isVerified();
        admin2.login("", "");
        admin2.login("", "hi!");
        admin2.viewProfile();
        double double16 = admin2.getHourlyRate();
        double double17 = admin2.getHourlyRate();
        admin2.setVerified(false);
        java.lang.String str20 = admin2.getAccountType();
        java.lang.String str21 = admin2.getEmail();
        java.lang.String str22 = admin2.getPassword();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "admin" + "'", str20, "admin");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
    }

    @Test
    public void test23609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23609");
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
        java.lang.String str12 = admin2.getEmail();
        admin2.logout();
        java.lang.String str14 = admin2.getPassword();
        java.lang.Class<?> wildcardClass15 = admin2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test23610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23610");
        model.Admin admin2 = new model.Admin("admin", "admin");
        admin2.viewProfile();
        java.lang.String str4 = admin2.getID();
        admin2.logout();
        java.lang.String str6 = admin2.getAccountType();
        admin2.viewProfile();
        admin2.setVerified(true);
        java.lang.String str10 = admin2.getAccountType();
        java.lang.String str11 = admin2.getID();
        java.lang.String str12 = admin2.getAccountType();
        java.lang.String str13 = admin2.getEmail();
        admin2.logout();
        admin2.setVerified(false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "admin" + "'", str4, "admin");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "admin" + "'", str6, "admin");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "admin" + "'", str10, "admin");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "admin" + "'", str11, "admin");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "admin" + "'", str12, "admin");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "admin" + "'", str13, "admin");
    }

    @Test
    public void test23611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23611");
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
        admin2.viewProfile();
        admin2.setVerified(false);
        java.lang.String str16 = admin2.getPassword();
        boolean boolean17 = admin2.isVerified();
        admin2.setVerified(true);
        java.lang.String str20 = admin2.getEmail();
        admin2.setVerified(true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test23612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23612");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        admin2.logout();
        java.lang.String str5 = admin2.getAccountType();
        admin2.viewProfile();
        admin2.setVerified(false);
        java.lang.String str9 = admin2.getEmail();
        java.lang.String str10 = admin2.getPassword();
        java.lang.String str11 = admin2.getEmail();
        java.lang.String str12 = admin2.getEmail();
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
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test23613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23613");
        model.Admin admin2 = new model.Admin("admin", "admin");
        admin2.login("admin", "admin");
        boolean boolean6 = admin2.isVerified();
        admin2.logout();
        java.lang.String str8 = admin2.getID();
        admin2.viewProfile();
        java.lang.String str10 = admin2.getAccountType();
        boolean boolean11 = admin2.isVerified();
        java.lang.String str12 = admin2.getAccountType();
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
    public void test23614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23614");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        java.lang.String str4 = admin2.getEmail();
        boolean boolean5 = admin2.isVerified();
        java.lang.String str6 = admin2.getAccountType();
        java.lang.String str7 = admin2.getAccountType();
        admin2.setVerified(false);
        admin2.setVerified(false);
        boolean boolean12 = admin2.isVerified();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "admin" + "'", str6, "admin");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test23615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23615");
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
        admin2.viewProfile();
        double double18 = admin2.getHourlyRate();
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
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
    }

    @Test
    public void test23616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23616");
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
        double double16 = admin2.getHourlyRate();
        admin2.login("", "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
    }

    @Test
    public void test23617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23617");
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
        admin2.setVerified(true);
        admin2.setVerified(false);
        admin2.logout();
        admin2.setVerified(false);
        double double24 = admin2.getHourlyRate();
        room.Room room25 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.addRoom(room25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.getRoomID()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "admin" + "'", str15, "admin");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
    }

    @Test
    public void test23618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23618");
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
        admin2.login("admin", "");
        double double18 = admin2.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "admin" + "'", str13, "admin");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "admin" + "'", str14, "admin");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
    }

    @Test
    public void test23619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23619");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        admin2.setVerified(true);
        java.lang.String str5 = admin2.getEmail();
        room.Room room6 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.disableRoom(room6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test23620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23620");
        model.Admin admin2 = new model.Admin("admin", "admin");
        admin2.login("admin", "admin");
        boolean boolean6 = admin2.isVerified();
        admin2.logout();
        java.lang.String str8 = admin2.getID();
        admin2.logout();
        double double10 = admin2.getHourlyRate();
        java.lang.String str11 = admin2.getAccountType();
        java.lang.String str12 = admin2.getPassword();
        double double13 = admin2.getHourlyRate();
        java.lang.String str14 = admin2.getAccountType();
        admin2.logout();
        admin2.login("admin", "hi!");
        java.lang.String str19 = admin2.getEmail();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "admin" + "'", str8, "admin");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "admin" + "'", str11, "admin");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "admin" + "'", str12, "admin");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "admin" + "'", str14, "admin");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "admin" + "'", str19, "admin");
    }

    @Test
    public void test23621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23621");
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
        admin2.logout();
        admin2.setVerified(true);
        double double15 = admin2.getHourlyRate();
        admin2.setVerified(true);
        admin2.viewProfile();
        admin2.logout();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "admin" + "'", str8, "admin");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "admin" + "'", str9, "admin");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "admin" + "'", str10, "admin");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test23622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23622");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        admin2.logout();
        java.lang.String str4 = admin2.getAccountType();
        admin2.logout();
        admin2.login("hi!", "admin");
        java.lang.String str9 = admin2.getAccountType();
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
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "admin" + "'", str4, "admin");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "admin" + "'", str9, "admin");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test23623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23623");
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
        admin2.setVerified(false);
        java.lang.String str16 = admin2.getID();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "admin" + "'", str6, "admin");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "admin" + "'", str16, "admin");
    }

    @Test
    public void test23624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23624");
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
        admin2.setVerified(true);
        java.lang.String str23 = admin2.getAccountType();
        java.lang.String str24 = admin2.getPassword();
        java.lang.String str25 = admin2.getPassword();
        boolean boolean26 = admin2.isVerified();
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
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "admin" + "'", str23, "admin");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test23625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23625");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        admin2.logout();
        java.lang.String str5 = admin2.getAccountType();
        admin2.viewProfile();
        admin2.login("hi!", "admin");
        java.lang.String str10 = admin2.getAccountType();
        boolean boolean11 = admin2.isVerified();
        double double12 = admin2.getHourlyRate();
        java.lang.String str13 = admin2.getPassword();
        java.lang.String str14 = admin2.getEmail();
        boolean boolean15 = admin2.isVerified();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "admin" + "'", str10, "admin");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test23626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23626");
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
        java.lang.String str16 = admin2.getPassword();
        admin2.logout();
        java.lang.String str18 = admin2.getPassword();
        double double19 = admin2.getHourlyRate();
        java.lang.String str20 = admin2.getID();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "admin" + "'", str10, "admin");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "admin" + "'", str20, "admin");
    }

    @Test
    public void test23627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23627");
        model.Admin admin2 = new model.Admin("", "admin");
        java.lang.String str3 = admin2.getEmail();
        admin2.viewProfile();
        double double5 = admin2.getHourlyRate();
        java.lang.String str6 = admin2.getAccountType();
        java.lang.String str7 = admin2.getPassword();
        java.lang.String str8 = admin2.getAccountType();
        java.lang.String str9 = admin2.getPassword();
        admin2.setVerified(false);
        java.lang.String str12 = admin2.getPassword();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "admin" + "'", str6, "admin");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "admin" + "'", str8, "admin");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "admin" + "'", str9, "admin");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "admin" + "'", str12, "admin");
    }

    @Test
    public void test23628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23628");
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
        java.lang.String str18 = admin2.getID();
        admin2.login("admin", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "admin" + "'", str18, "admin");
    }

    @Test
    public void test23629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23629");
        model.Admin admin2 = new model.Admin("admin", "admin");
        admin2.login("admin", "admin");
        boolean boolean6 = admin2.isVerified();
        admin2.logout();
        java.lang.String str8 = admin2.getID();
        admin2.setVerified(true);
        admin2.setVerified(true);
        java.lang.String str13 = admin2.getID();
        boolean boolean14 = admin2.isVerified();
        admin2.login("", "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "admin" + "'", str8, "admin");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "admin" + "'", str13, "admin");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test23630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23630");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        admin2.logout();
        java.lang.String str4 = admin2.getAccountType();
        admin2.logout();
        java.lang.String str6 = admin2.getPassword();
        java.lang.String str7 = admin2.getAccountType();
        admin2.login("admin", "");
        java.lang.String str11 = admin2.getID();
        admin2.setVerified(false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "admin" + "'", str4, "admin");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "admin" + "'", str11, "admin");
    }

    @Test
    public void test23631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23631");
        model.Admin admin2 = new model.Admin("", "");
        java.lang.String str3 = admin2.getAccountType();
        java.lang.String str4 = admin2.getEmail();
        java.lang.String str5 = admin2.getID();
        double double6 = admin2.getHourlyRate();
        java.lang.String str7 = admin2.getEmail();
        admin2.login("admin", "admin");
        java.lang.String str11 = admin2.getEmail();
        admin2.logout();
        java.lang.String str13 = admin2.getPassword();
        double double14 = admin2.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test23632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23632");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        admin2.logout();
        java.lang.String str5 = admin2.getAccountType();
        admin2.login("", "");
        java.lang.String str9 = admin2.getPassword();
        admin2.setVerified(false);
        java.lang.String str12 = admin2.getPassword();
        admin2.setVerified(false);
        java.lang.String str15 = admin2.getEmail();
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
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test23633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23633");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        admin2.logout();
        admin2.setVerified(false);
        java.lang.String str6 = admin2.getAccountType();
        java.lang.String str7 = admin2.getID();
        java.lang.String str8 = admin2.getID();
        admin2.login("hi!", "hi!");
        java.lang.String str12 = admin2.getID();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "admin" + "'", str6, "admin");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "admin" + "'", str8, "admin");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "admin" + "'", str12, "admin");
    }

    @Test
    public void test23634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23634");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        double double5 = admin2.getHourlyRate();
        admin2.viewProfile();
        admin2.login("admin", "admin");
        admin2.login("admin", "hi!");
        double double13 = admin2.getHourlyRate();
        java.lang.String str14 = admin2.getID();
        java.lang.String str15 = admin2.getAccountType();
        admin2.logout();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "admin" + "'", str14, "admin");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "admin" + "'", str15, "admin");
    }

    @Test
    public void test23635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23635");
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
        java.lang.String str15 = admin2.getID();
        java.lang.String str16 = admin2.getAccountType();
        java.lang.Class<?> wildcardClass17 = admin2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "admin" + "'", str15, "admin");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "admin" + "'", str16, "admin");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test23636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23636");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        admin2.logout();
        java.lang.String str5 = admin2.getAccountType();
        java.lang.String str6 = admin2.getEmail();
        double double7 = admin2.getHourlyRate();
        java.lang.String str8 = admin2.getID();
        double double9 = admin2.getHourlyRate();
        admin2.logout();
        double double11 = admin2.getHourlyRate();
        admin2.login("hi!", "hi!");
        boolean boolean15 = admin2.isVerified();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "admin" + "'", str8, "admin");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test23637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23637");
        model.Admin admin2 = new model.Admin("admin", "admin");
        admin2.login("admin", "admin");
        boolean boolean6 = admin2.isVerified();
        admin2.logout();
        java.lang.String str8 = admin2.getID();
        admin2.logout();
        java.lang.String str10 = admin2.getEmail();
        admin2.logout();
        java.lang.String str12 = admin2.getAccountType();
        admin2.login("admin", "");
        double double16 = admin2.getHourlyRate();
        boolean boolean17 = admin2.isVerified();
        double double18 = admin2.getHourlyRate();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "admin" + "'", str8, "admin");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "admin" + "'", str10, "admin");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "admin" + "'", str12, "admin");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
    }

    @Test
    public void test23638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23638");
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
        java.lang.String str15 = admin2.getEmail();
        java.lang.String str16 = admin2.getAccountType();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "admin" + "'", str11, "admin");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "admin" + "'", str13, "admin");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "admin" + "'", str14, "admin");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "admin" + "'", str16, "admin");
    }

    @Test
    public void test23639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23639");
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
        java.lang.String str16 = admin2.getID();
        admin2.setVerified(true);
        java.lang.String str19 = admin2.getPassword();
        admin2.viewProfile();
        java.lang.String str21 = admin2.getAccountType();
        boolean boolean22 = admin2.isVerified();
        double double23 = admin2.getHourlyRate();
        java.lang.String str24 = admin2.getPassword();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "admin" + "'", str16, "admin");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "admin" + "'", str21, "admin");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
    }

    @Test
    public void test23640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23640");
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
        boolean boolean15 = admin2.isVerified();
        admin2.viewProfile();
        admin2.viewProfile();
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
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "admin" + "'", str11, "admin");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test23641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23641");
        model.Admin admin2 = new model.Admin("admin", "");
        admin2.login("hi!", "admin");
        admin2.login("", "");
        admin2.viewProfile();
        java.lang.String str10 = admin2.getAccountType();
        java.lang.String str11 = admin2.getEmail();
        admin2.logout();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "admin" + "'", str10, "admin");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "admin" + "'", str11, "admin");
    }

    @Test
    public void test23642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23642");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        admin2.logout();
        java.lang.String str4 = admin2.getEmail();
        java.lang.String str5 = admin2.getPassword();
        boolean boolean6 = admin2.isVerified();
        double double7 = admin2.getHourlyRate();
        admin2.login("", "hi!");
        java.lang.String str11 = admin2.getAccountType();
        admin2.setVerified(false);
        admin2.viewProfile();
        admin2.viewProfile();
        admin2.login("admin", "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "admin" + "'", str11, "admin");
    }

    @Test
    public void test23643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23643");
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
        double double21 = admin2.getHourlyRate();
        admin2.viewProfile();
        java.lang.String str23 = admin2.getEmail();
        boolean boolean24 = admin2.isVerified();
        double double25 = admin2.getHourlyRate();
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
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
    }

    @Test
    public void test23644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23644");
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
        boolean boolean20 = admin2.isVerified();
        admin2.logout();
        admin2.login("", "");
        admin2.setVerified(false);
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
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test23645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23645");
        model.Admin admin2 = new model.Admin("", "");
        java.lang.String str3 = admin2.getAccountType();
        admin2.setVerified(true);
        double double6 = admin2.getHourlyRate();
        admin2.logout();
        admin2.setVerified(true);
        boolean boolean10 = admin2.isVerified();
        java.lang.String str11 = admin2.getEmail();
        boolean boolean12 = admin2.isVerified();
        java.lang.String str13 = admin2.getPassword();
        boolean boolean14 = admin2.isVerified();
        admin2.viewProfile();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test23646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23646");
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
        java.lang.String str17 = admin2.getEmail();
        java.lang.String str18 = admin2.getPassword();
        admin2.setVerified(true);
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
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "admin" + "'", str12, "admin");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test23647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23647");
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
        admin2.logout();
        admin2.login("hi!", "admin");
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
    }

    @Test
    public void test23648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23648");
        model.Admin admin2 = new model.Admin("admin", "admin");
        admin2.viewProfile();
        java.lang.String str4 = admin2.getPassword();
        double double5 = admin2.getHourlyRate();
        java.lang.String str6 = admin2.getAccountType();
        boolean boolean7 = admin2.isVerified();
        double double8 = admin2.getHourlyRate();
        admin2.viewProfile();
        admin2.setVerified(false);
        java.lang.String str12 = admin2.getID();
        admin2.setVerified(false);
        java.lang.String str15 = admin2.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "admin" + "'", str4, "admin");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "admin" + "'", str6, "admin");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "admin" + "'", str12, "admin");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "admin" + "'", str15, "admin");
    }

    @Test
    public void test23649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23649");
        model.Admin admin2 = new model.Admin("admin", "admin");
        admin2.viewProfile();
        java.lang.String str4 = admin2.getPassword();
        admin2.login("", "");
        java.lang.String str8 = admin2.getEmail();
        java.lang.String str9 = admin2.getAccountType();
        admin2.login("", "");
        java.lang.String str13 = admin2.getAccountType();
        double double14 = admin2.getHourlyRate();
        java.lang.String str15 = admin2.getPassword();
        admin2.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "admin" + "'", str4, "admin");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "admin" + "'", str8, "admin");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "admin" + "'", str9, "admin");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "admin" + "'", str13, "admin");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "admin" + "'", str15, "admin");
    }

    @Test
    public void test23650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23650");
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
        java.lang.String str21 = admin2.getEmail();
        java.lang.String str22 = admin2.getID();
        admin2.logout();
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
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "admin" + "'", str22, "admin");
    }

    @Test
    public void test23651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23651");
        model.Admin admin2 = new model.Admin("admin", "admin");
        admin2.login("admin", "admin");
        boolean boolean6 = admin2.isVerified();
        admin2.logout();
        java.lang.String str8 = admin2.getID();
        admin2.logout();
        java.lang.String str10 = admin2.getEmail();
        admin2.logout();
        java.lang.String str12 = admin2.getAccountType();
        admin2.login("admin", "");
        java.lang.String str16 = admin2.getEmail();
        double double17 = admin2.getHourlyRate();
        java.lang.String str18 = admin2.getAccountType();
        java.lang.String str19 = admin2.getAccountType();
        admin2.viewProfile();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "admin" + "'", str8, "admin");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "admin" + "'", str10, "admin");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "admin" + "'", str12, "admin");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "admin" + "'", str16, "admin");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "admin" + "'", str18, "admin");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "admin" + "'", str19, "admin");
    }

    @Test
    public void test23652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23652");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        java.lang.String str5 = admin2.getEmail();
        double double6 = admin2.getHourlyRate();
        java.lang.String str7 = admin2.getID();
        admin2.logout();
        admin2.login("hi!", "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
    }

    @Test
    public void test23653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23653");
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
        java.lang.String str18 = admin2.getAccountType();
        java.lang.String str19 = admin2.getEmail();
        java.lang.String str20 = admin2.getAccountType();
        boolean boolean21 = admin2.isVerified();
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
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "admin" + "'", str18, "admin");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "admin" + "'", str20, "admin");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test23654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23654");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        double double5 = admin2.getHourlyRate();
        double double6 = admin2.getHourlyRate();
        java.lang.String str7 = admin2.getID();
        admin2.viewProfile();
        double double9 = admin2.getHourlyRate();
        java.lang.String str10 = admin2.getEmail();
        admin2.viewProfile();
        java.lang.String str12 = admin2.getAccountType();
        double double13 = admin2.getHourlyRate();
        java.lang.String str14 = admin2.getPassword();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "admin" + "'", str12, "admin");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test23655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23655");
        model.Admin admin2 = new model.Admin("admin", "");
        admin2.setVerified(true);
        boolean boolean5 = admin2.isVerified();
        java.lang.String str6 = admin2.getAccountType();
        admin2.logout();
        boolean boolean8 = admin2.isVerified();
        double double9 = admin2.getHourlyRate();
        java.lang.String str10 = admin2.getEmail();
        double double11 = admin2.getHourlyRate();
        double double12 = admin2.getHourlyRate();
        java.lang.String str13 = admin2.getAccountType();
        admin2.viewProfile();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "admin" + "'", str6, "admin");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "admin" + "'", str10, "admin");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "admin" + "'", str13, "admin");
    }

    @Test
    public void test23656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23656");
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
        java.lang.String str16 = admin2.getID();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "admin" + "'", str11, "admin");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "admin" + "'", str13, "admin");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "admin" + "'", str14, "admin");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "admin" + "'", str16, "admin");
    }

    @Test
    public void test23657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23657");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        double double5 = admin2.getHourlyRate();
        boolean boolean6 = admin2.isVerified();
        boolean boolean7 = admin2.isVerified();
        admin2.logout();
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
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test23658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23658");
        model.Admin admin2 = new model.Admin("admin", "admin");
        admin2.login("admin", "admin");
        admin2.setVerified(false);
        boolean boolean8 = admin2.isVerified();
        boolean boolean9 = admin2.isVerified();
        java.lang.String str10 = admin2.getPassword();
        admin2.login("hi!", "admin");
        java.lang.String str14 = admin2.getPassword();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "admin" + "'", str10, "admin");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "admin" + "'", str14, "admin");
    }

    @Test
    public void test23659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23659");
        model.Admin admin2 = new model.Admin("admin", "admin");
        admin2.logout();
        double double4 = admin2.getHourlyRate();
        admin2.logout();
        admin2.setVerified(false);
        double double8 = admin2.getHourlyRate();
        admin2.setVerified(true);
        room.Room room11 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.enableRoom(room11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test23660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23660");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        double double5 = admin2.getHourlyRate();
        double double6 = admin2.getHourlyRate();
        java.lang.String str7 = admin2.getID();
        admin2.login("", "admin");
        admin2.viewProfile();
        admin2.setVerified(true);
        java.lang.String str14 = admin2.getID();
        java.lang.String str15 = admin2.getPassword();
        java.lang.String str16 = admin2.getPassword();
        admin2.setVerified(false);
        java.lang.String str19 = admin2.getEmail();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "admin" + "'", str14, "admin");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test23661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23661");
        model.Admin admin2 = new model.Admin("", "");
        admin2.login("", "hi!");
        admin2.login("hi!", "");
        double double9 = admin2.getHourlyRate();
        java.lang.String str10 = admin2.getAccountType();
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "admin" + "'", str10, "admin");
    }

    @Test
    public void test23662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23662");
        model.Admin admin2 = new model.Admin("", "admin");
        java.lang.String str3 = admin2.getEmail();
        java.lang.String str4 = admin2.getPassword();
        java.lang.String str5 = admin2.getID();
        admin2.viewProfile();
        double double7 = admin2.getHourlyRate();
        admin2.logout();
        boolean boolean9 = admin2.isVerified();
        java.lang.String str10 = admin2.getPassword();
        admin2.logout();
        java.lang.String str12 = admin2.getEmail();
        java.lang.String str13 = admin2.getAccountType();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "admin" + "'", str4, "admin");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "admin" + "'", str10, "admin");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "admin" + "'", str13, "admin");
    }

    @Test
    public void test23663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23663");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        double double5 = admin2.getHourlyRate();
        double double6 = admin2.getHourlyRate();
        java.lang.String str7 = admin2.getID();
        admin2.login("", "admin");
        admin2.viewProfile();
        admin2.setVerified(true);
        double double14 = admin2.getHourlyRate();
        admin2.logout();
        java.lang.String str16 = admin2.getPassword();
        admin2.viewProfile();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test23664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23664");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getAccountType();
        boolean boolean4 = admin2.isVerified();
        boolean boolean5 = admin2.isVerified();
        admin2.viewProfile();
        java.lang.String str7 = admin2.getID();
        admin2.login("", "admin");
        java.lang.String str11 = admin2.getEmail();
        admin2.setVerified(false);
        double double14 = admin2.getHourlyRate();
        java.lang.String str15 = admin2.getPassword();
        boolean boolean16 = admin2.isVerified();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test23665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23665");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        java.lang.String str4 = admin2.getAccountType();
        java.lang.String str5 = admin2.getPassword();
        admin2.setVerified(true);
        admin2.login("", "");
        admin2.login("admin", "admin");
        admin2.login("", "");
        boolean boolean17 = admin2.isVerified();
        java.lang.String str18 = admin2.getPassword();
        java.lang.String str19 = admin2.getID();
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
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "admin" + "'", str4, "admin");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "admin" + "'", str19, "admin");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test23666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23666");
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
        java.lang.String str20 = admin2.getAccountType();
        java.lang.String str21 = admin2.getAccountType();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "admin" + "'", str9, "admin");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "admin" + "'", str11, "admin");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "admin" + "'", str20, "admin");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "admin" + "'", str21, "admin");
    }

    @Test
    public void test23667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23667");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        double double5 = admin2.getHourlyRate();
        double double6 = admin2.getHourlyRate();
        java.lang.String str7 = admin2.getID();
        boolean boolean8 = admin2.isVerified();
        java.lang.String str9 = admin2.getPassword();
        boolean boolean10 = admin2.isVerified();
        admin2.login("hi!", "hi!");
        java.lang.String str14 = admin2.getID();
        admin2.logout();
        admin2.viewProfile();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "admin" + "'", str14, "admin");
    }

    @Test
    public void test23668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23668");
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
        admin2.logout();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test23669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23669");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        admin2.logout();
        java.lang.String str5 = admin2.getAccountType();
        admin2.login("", "");
        java.lang.String str9 = admin2.getID();
        admin2.login("", "");
        admin2.setVerified(false);
        admin2.logout();
        java.lang.String str16 = admin2.getEmail();
        double double17 = admin2.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "admin" + "'", str9, "admin");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
    }

    @Test
    public void test23670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23670");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        admin2.logout();
        admin2.setVerified(false);
        java.lang.String str6 = admin2.getEmail();
        java.lang.String str7 = admin2.getID();
        admin2.setVerified(true);
        double double10 = admin2.getHourlyRate();
        java.lang.String str11 = admin2.getID();
        admin2.setVerified(false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "admin" + "'", str11, "admin");
    }

    @Test
    public void test23671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23671");
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
        double double15 = admin2.getHourlyRate();
        java.lang.String str16 = admin2.getPassword();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "admin" + "'", str8, "admin");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "admin" + "'", str11, "admin");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "admin" + "'", str14, "admin");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test23672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23672");
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
        java.lang.String str18 = admin2.getEmail();
        boolean boolean19 = admin2.isVerified();
        admin2.viewProfile();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "admin" + "'", str17, "admin");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test23673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23673");
        model.Admin admin2 = new model.Admin("admin", "");
        admin2.setVerified(true);
        boolean boolean5 = admin2.isVerified();
        java.lang.String str6 = admin2.getID();
        admin2.logout();
        double double8 = admin2.getHourlyRate();
        java.lang.String str9 = admin2.getEmail();
        room.Room room10 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.enableRoom(room10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "admin" + "'", str6, "admin");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "admin" + "'", str9, "admin");
    }

    @Test
    public void test23674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23674");
        model.Admin admin2 = new model.Admin("admin", "");
        admin2.logout();
        double double4 = admin2.getHourlyRate();
        admin2.setVerified(false);
        java.lang.String str7 = admin2.getID();
        java.lang.String str8 = admin2.getEmail();
        java.lang.String str9 = admin2.getID();
        java.lang.String str10 = admin2.getEmail();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "admin" + "'", str8, "admin");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "admin" + "'", str9, "admin");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "admin" + "'", str10, "admin");
    }

    @Test
    public void test23675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23675");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        admin2.logout();
        java.lang.String str5 = admin2.getAccountType();
        admin2.viewProfile();
        admin2.setVerified(false);
        java.lang.String str9 = admin2.getEmail();
        admin2.setVerified(false);
        java.lang.String str12 = admin2.getID();
        java.lang.String str13 = admin2.getEmail();
        java.lang.String str14 = admin2.getID();
        admin2.viewProfile();
        double double16 = admin2.getHourlyRate();
        java.lang.String str17 = admin2.getID();
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
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "admin" + "'", str12, "admin");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "admin" + "'", str14, "admin");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "admin" + "'", str17, "admin");
    }

    @Test
    public void test23676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23676");
        model.Admin admin2 = new model.Admin("hi!", "admin");
        java.lang.String str3 = admin2.getID();
        admin2.setVerified(false);
        admin2.viewProfile();
        admin2.viewProfile();
        admin2.setVerified(true);
        admin2.login("", "");
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
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "admin" + "'", str13, "admin");
    }

    @Test
    public void test23677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23677");
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
        admin2.viewProfile();
        admin2.viewProfile();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "admin" + "'", str11, "admin");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "admin" + "'", str14, "admin");
    }

    @Test
    public void test23678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23678");
        model.Admin admin2 = new model.Admin("admin", "");
        admin2.setVerified(true);
        java.lang.String str5 = admin2.getAccountType();
        admin2.setVerified(false);
        java.lang.String str8 = admin2.getID();
        admin2.viewProfile();
        double double10 = admin2.getHourlyRate();
        room.Room room11 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.enableRoom(room11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "admin" + "'", str8, "admin");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test23679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23679");
        model.Admin admin2 = new model.Admin("", "");
        java.lang.String str3 = admin2.getAccountType();
        admin2.setVerified(true);
        double double6 = admin2.getHourlyRate();
        admin2.viewProfile();
        boolean boolean8 = admin2.isVerified();
        java.lang.String str9 = admin2.getID();
        admin2.setVerified(false);
        boolean boolean12 = admin2.isVerified();
        boolean boolean13 = admin2.isVerified();
        double double14 = admin2.getHourlyRate();
        double double15 = admin2.getHourlyRate();
        java.lang.String str16 = admin2.getPassword();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "admin" + "'", str9, "admin");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test23680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23680");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        java.lang.String str5 = admin2.getID();
        java.lang.String str6 = admin2.getID();
        java.lang.String str7 = admin2.getAccountType();
        admin2.logout();
        java.lang.String str9 = admin2.getEmail();
        java.lang.String str10 = admin2.getPassword();
        admin2.setVerified(true);
        admin2.viewProfile();
        admin2.setVerified(true);
        boolean boolean16 = admin2.isVerified();
        admin2.logout();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "admin" + "'", str6, "admin");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test23681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23681");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getAccountType();
        java.lang.String str4 = admin2.getPassword();
        admin2.setVerified(true);
        java.lang.String str7 = admin2.getID();
        java.lang.String str8 = admin2.getEmail();
        admin2.login("admin", "");
        admin2.viewProfile();
        double double13 = admin2.getHourlyRate();
        admin2.viewProfile();
        java.lang.String str15 = admin2.getID();
        java.lang.String str16 = admin2.getPassword();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "admin" + "'", str15, "admin");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test23682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23682");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        admin2.logout();
        java.lang.String str5 = admin2.getAccountType();
        admin2.viewProfile();
        admin2.setVerified(false);
        java.lang.String str9 = admin2.getEmail();
        admin2.logout();
        admin2.logout();
        admin2.viewProfile();
        java.lang.String str13 = admin2.getEmail();
        java.lang.String str14 = admin2.getAccountType();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "admin" + "'", str14, "admin");
    }

    @Test
    public void test23683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23683");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        admin2.logout();
        java.lang.String str5 = admin2.getAccountType();
        admin2.viewProfile();
        admin2.login("hi!", "admin");
        double double10 = admin2.getHourlyRate();
        admin2.viewProfile();
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
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test23684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23684");
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
        java.lang.String str13 = admin2.getID();
        java.lang.String str14 = admin2.getPassword();
        admin2.viewProfile();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "admin" + "'", str6, "admin");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "admin" + "'", str11, "admin");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "admin" + "'", str13, "admin");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test23685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23685");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        double double4 = admin2.getHourlyRate();
        java.lang.String str5 = admin2.getAccountType();
        double double6 = admin2.getHourlyRate();
        admin2.logout();
        java.lang.String str8 = admin2.getID();
        admin2.viewProfile();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "admin" + "'", str8, "admin");
    }

    @Test
    public void test23686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23686");
        model.Admin admin2 = new model.Admin("admin", "admin");
        admin2.viewProfile();
        java.lang.String str4 = admin2.getPassword();
        double double5 = admin2.getHourlyRate();
        java.lang.String str6 = admin2.getAccountType();
        admin2.login("hi!", "admin");
        double double10 = admin2.getHourlyRate();
        admin2.login("", "");
        admin2.setVerified(true);
        java.lang.String str16 = admin2.getID();
        admin2.login("admin", "hi!");
        admin2.login("hi!", "");
        java.lang.String str23 = admin2.getID();
        double double24 = admin2.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "admin" + "'", str4, "admin");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "admin" + "'", str6, "admin");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "admin" + "'", str16, "admin");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "admin" + "'", str23, "admin");
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
    }

    @Test
    public void test23687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23687");
        model.Admin admin2 = new model.Admin("admin", "admin");
        admin2.viewProfile();
        java.lang.String str4 = admin2.getID();
        java.lang.String str5 = admin2.getPassword();
        double double6 = admin2.getHourlyRate();
        admin2.login("admin", "");
        admin2.login("hi!", "admin");
        java.lang.String str13 = admin2.getEmail();
        admin2.setVerified(true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "admin" + "'", str4, "admin");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "admin" + "'", str13, "admin");
    }

    @Test
    public void test23688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23688");
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
        admin2.login("admin", "");
        double double20 = admin2.getHourlyRate();
        java.lang.String str21 = admin2.getID();
        java.lang.String str22 = admin2.getID();
        room.Room room23 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.disableRoom(room23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "admin" + "'", str4, "admin");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "admin" + "'", str8, "admin");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "admin" + "'", str9, "admin");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "admin" + "'", str10, "admin");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "admin" + "'", str11, "admin");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "admin" + "'", str21, "admin");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "admin" + "'", str22, "admin");
    }

    @Test
    public void test23689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23689");
        model.Admin admin2 = new model.Admin("admin", "admin");
        admin2.login("admin", "admin");
        boolean boolean6 = admin2.isVerified();
        admin2.logout();
        java.lang.String str8 = admin2.getID();
        admin2.setVerified(true);
        java.lang.String str11 = admin2.getAccountType();
        admin2.viewProfile();
        admin2.login("admin", "admin");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "admin" + "'", str8, "admin");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "admin" + "'", str11, "admin");
    }

    @Test
    public void test23690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23690");
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
        java.lang.String str20 = admin2.getEmail();
        java.lang.String str21 = admin2.getID();
        java.lang.Class<?> wildcardClass22 = admin2.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "admin" + "'", str4, "admin");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "admin" + "'", str20, "admin");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "admin" + "'", str21, "admin");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test23691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23691");
        model.Admin admin2 = new model.Admin("", "");
        java.lang.String str3 = admin2.getAccountType();
        java.lang.String str4 = admin2.getEmail();
        admin2.login("hi!", "");
        java.lang.String str8 = admin2.getAccountType();
        java.lang.String str9 = admin2.getEmail();
        double double10 = admin2.getHourlyRate();
        java.lang.String str11 = admin2.getEmail();
        admin2.setVerified(true);
        admin2.logout();
        java.lang.String str15 = admin2.getEmail();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "admin" + "'", str8, "admin");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test23692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23692");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        admin2.logout();
        java.lang.String str5 = admin2.getAccountType();
        admin2.login("", "");
        java.lang.String str9 = admin2.getPassword();
        java.lang.String str10 = admin2.getID();
        java.lang.String str11 = admin2.getID();
        java.lang.String str12 = admin2.getID();
        java.lang.String str13 = admin2.getEmail();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "admin" + "'", str10, "admin");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "admin" + "'", str11, "admin");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "admin" + "'", str12, "admin");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test23693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23693");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        java.lang.String str4 = admin2.getEmail();
        boolean boolean5 = admin2.isVerified();
        java.lang.String str6 = admin2.getPassword();
        java.lang.String str7 = admin2.getID();
        java.lang.String str8 = admin2.getID();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "admin" + "'", str8, "admin");
    }

    @Test
    public void test23694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23694");
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
        admin2.logout();
        java.lang.String str17 = admin2.getID();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "admin" + "'", str17, "admin");
    }

    @Test
    public void test23695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23695");
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
        java.lang.String str14 = admin2.getPassword();
        java.lang.String str15 = admin2.getID();
        java.lang.String str16 = admin2.getPassword();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "admin" + "'", str15, "admin");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test23696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23696");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        java.lang.String str4 = admin2.getAccountType();
        java.lang.String str5 = admin2.getPassword();
        admin2.logout();
        admin2.setVerified(true);
        double double9 = admin2.getHourlyRate();
        admin2.logout();
        boolean boolean11 = admin2.isVerified();
        admin2.viewProfile();
        java.lang.String str13 = admin2.getAccountType();
        room.Room room14 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.disableRoom(room14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "admin" + "'", str4, "admin");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "admin" + "'", str13, "admin");
    }

    @Test
    public void test23697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23697");
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
        admin2.setVerified(true);
        java.lang.String str17 = admin2.getAccountType();
        java.lang.String str18 = admin2.getID();
        admin2.setVerified(true);
        admin2.logout();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "admin" + "'", str14, "admin");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "admin" + "'", str17, "admin");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "admin" + "'", str18, "admin");
    }

    @Test
    public void test23698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23698");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        admin2.logout();
        java.lang.String str5 = admin2.getAccountType();
        boolean boolean6 = admin2.isVerified();
        admin2.login("hi!", "admin");
        java.lang.String str10 = admin2.getAccountType();
        admin2.viewProfile();
        java.lang.String str12 = admin2.getPassword();
        java.lang.String str13 = admin2.getPassword();
        admin2.viewProfile();
        java.lang.String str15 = admin2.getAccountType();
        double double16 = admin2.getHourlyRate();
        admin2.setVerified(false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "admin" + "'", str10, "admin");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "admin" + "'", str15, "admin");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
    }

    @Test
    public void test23699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23699");
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
        double double17 = admin2.getHourlyRate();
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
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
    }

    @Test
    public void test23700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23700");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        admin2.logout();
        admin2.setVerified(false);
        java.lang.String str6 = admin2.getEmail();
        admin2.setVerified(false);
        boolean boolean9 = admin2.isVerified();
        double double10 = admin2.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test23701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23701");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        java.lang.String str4 = admin2.getEmail();
        java.lang.String str5 = admin2.getPassword();
        java.lang.String str6 = admin2.getPassword();
        boolean boolean7 = admin2.isVerified();
        admin2.viewProfile();
        java.lang.String str9 = admin2.getPassword();
        java.lang.String str10 = admin2.getEmail();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test23702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23702");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        java.lang.String str4 = admin2.getAccountType();
        java.lang.String str5 = admin2.getPassword();
        admin2.logout();
        boolean boolean7 = admin2.isVerified();
        admin2.setVerified(true);
        admin2.login("hi!", "");
        java.lang.String str13 = admin2.getPassword();
        java.lang.String str14 = admin2.getPassword();
        java.lang.String str15 = admin2.getID();
        java.lang.String str16 = admin2.getPassword();
        java.lang.String str17 = admin2.getID();
        admin2.logout();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "admin" + "'", str4, "admin");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "admin" + "'", str15, "admin");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "admin" + "'", str17, "admin");
    }

    @Test
    public void test23703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23703");
        model.Admin admin2 = new model.Admin("admin", "admin");
        admin2.login("admin", "admin");
        boolean boolean6 = admin2.isVerified();
        admin2.logout();
        java.lang.String str8 = admin2.getID();
        admin2.logout();
        java.lang.String str10 = admin2.getEmail();
        boolean boolean11 = admin2.isVerified();
        java.lang.String str12 = admin2.getEmail();
        boolean boolean13 = admin2.isVerified();
        admin2.login("hi!", "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "admin" + "'", str8, "admin");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "admin" + "'", str10, "admin");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "admin" + "'", str12, "admin");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test23704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23704");
        model.Admin admin2 = new model.Admin("admin", "admin");
        admin2.viewProfile();
        java.lang.String str4 = admin2.getPassword();
        admin2.login("", "");
        boolean boolean8 = admin2.isVerified();
        admin2.setVerified(true);
        admin2.setVerified(false);
        java.lang.String str13 = admin2.getAccountType();
        double double14 = admin2.getHourlyRate();
        admin2.logout();
        admin2.logout();
        admin2.viewProfile();
        room.Room room18 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.disableRoom(room18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "admin" + "'", str4, "admin");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "admin" + "'", str13, "admin");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test23705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23705");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        java.lang.String str4 = admin2.getEmail();
        admin2.logout();
        admin2.logout();
        java.lang.String str7 = admin2.getPassword();
        admin2.viewProfile();
        java.lang.String str9 = admin2.getID();
        java.lang.String str10 = admin2.getAccountType();
        double double11 = admin2.getHourlyRate();
        double double12 = admin2.getHourlyRate();
        admin2.logout();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "admin" + "'", str9, "admin");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "admin" + "'", str10, "admin");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test23706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23706");
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
        java.lang.String str21 = admin2.getAccountType();
        java.lang.String str22 = admin2.getPassword();
        java.lang.String str23 = admin2.getEmail();
        admin2.logout();
        room.Room room25 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.disableRoom(room25);
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
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "admin" + "'", str21, "admin");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
    }

    @Test
    public void test23707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23707");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        admin2.logout();
        java.lang.String str5 = admin2.getAccountType();
        admin2.viewProfile();
        admin2.logout();
        double double8 = admin2.getHourlyRate();
        java.lang.String str9 = admin2.getEmail();
        java.lang.String str10 = admin2.getAccountType();
        java.lang.String str11 = admin2.getEmail();
        java.lang.String str12 = admin2.getPassword();
        java.lang.String str13 = admin2.getAccountType();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "admin" + "'", str10, "admin");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "admin" + "'", str13, "admin");
    }

    @Test
    public void test23708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23708");
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
        admin2.viewProfile();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "admin" + "'", str13, "admin");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "admin" + "'", str14, "admin");
    }

    @Test
    public void test23709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23709");
        model.Admin admin2 = new model.Admin("admin", "admin");
        admin2.login("admin", "admin");
        boolean boolean6 = admin2.isVerified();
        admin2.logout();
        java.lang.String str8 = admin2.getID();
        admin2.setVerified(true);
        admin2.setVerified(true);
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
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "admin" + "'", str8, "admin");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "admin" + "'", str13, "admin");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test23710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23710");
        model.Admin admin2 = new model.Admin("admin", "admin");
        admin2.viewProfile();
        java.lang.String str4 = admin2.getID();
        java.lang.String str5 = admin2.getPassword();
        admin2.setVerified(false);
        boolean boolean8 = admin2.isVerified();
        boolean boolean9 = admin2.isVerified();
        admin2.logout();
        admin2.login("admin", "");
        admin2.setVerified(false);
        java.lang.String str16 = admin2.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "admin" + "'", str4, "admin");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "admin" + "'", str16, "admin");
    }

    @Test
    public void test23711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23711");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        double double5 = admin2.getHourlyRate();
        double double6 = admin2.getHourlyRate();
        java.lang.String str7 = admin2.getPassword();
        double double8 = admin2.getHourlyRate();
        admin2.logout();
        java.lang.String str10 = admin2.getID();
        admin2.setVerified(false);
        double double13 = admin2.getHourlyRate();
        admin2.logout();
        java.lang.Class<?> wildcardClass15 = admin2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "admin" + "'", str10, "admin");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test23712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23712");
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
        admin2.logout();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "admin" + "'", str9, "admin");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test23713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23713");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        java.lang.String str4 = admin2.getPassword();
        java.lang.String str5 = admin2.getID();
        admin2.login("admin", "hi!");
        boolean boolean9 = admin2.isVerified();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test23714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23714");
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
        java.lang.String str20 = admin2.getID();
        java.lang.String str21 = admin2.getID();
        java.lang.String str22 = admin2.getPassword();
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
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "admin" + "'", str20, "admin");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "admin" + "'", str21, "admin");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
    }

    @Test
    public void test23715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23715");
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
        admin2.logout();
        boolean boolean16 = admin2.isVerified();
        java.lang.String str17 = admin2.getEmail();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test23716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23716");
        model.Admin admin2 = new model.Admin("admin", "admin");
        admin2.login("admin", "admin");
        boolean boolean6 = admin2.isVerified();
        admin2.viewProfile();
        admin2.logout();
        admin2.login("", "hi!");
        admin2.logout();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test23717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23717");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        admin2.logout();
        java.lang.String str5 = admin2.getAccountType();
        admin2.viewProfile();
        admin2.setVerified(false);
        java.lang.String str9 = admin2.getEmail();
        admin2.setVerified(false);
        java.lang.String str12 = admin2.getID();
        java.lang.String str13 = admin2.getEmail();
        java.lang.String str14 = admin2.getID();
        boolean boolean15 = admin2.isVerified();
        java.lang.String str16 = admin2.getEmail();
        admin2.logout();
        admin2.viewProfile();
        java.lang.String str19 = admin2.getPassword();
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
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "admin" + "'", str12, "admin");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "admin" + "'", str14, "admin");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test23718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23718");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        java.lang.String str5 = admin2.getEmail();
        admin2.logout();
        java.lang.String str7 = admin2.getPassword();
        boolean boolean8 = admin2.isVerified();
        double double9 = admin2.getHourlyRate();
        admin2.login("admin", "admin");
        admin2.viewProfile();
        java.lang.String str14 = admin2.getID();
        admin2.setVerified(false);
        admin2.login("", "");
        admin2.viewProfile();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "admin" + "'", str14, "admin");
    }

    @Test
    public void test23719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23719");
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
        double double20 = admin2.getHourlyRate();
        java.lang.String str21 = admin2.getAccountType();
        double double22 = admin2.getHourlyRate();
        admin2.logout();
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
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "admin" + "'", str21, "admin");
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
    }

    @Test
    public void test23720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23720");
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
        admin2.login("", "hi!");
        admin2.setVerified(true);
        admin2.login("admin", "");
        java.lang.String str23 = admin2.getAccountType();
        admin2.login("hi!", "admin");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "admin" + "'", str9, "admin");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "admin" + "'", str10, "admin");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "admin" + "'", str23, "admin");
    }

    @Test
    public void test23721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23721");
        model.Admin admin2 = new model.Admin("admin", "admin");
        admin2.viewProfile();
        java.lang.String str4 = admin2.getPassword();
        admin2.login("", "");
        java.lang.String str8 = admin2.getEmail();
        java.lang.String str9 = admin2.getAccountType();
        admin2.login("", "");
        java.lang.String str13 = admin2.getAccountType();
        double double14 = admin2.getHourlyRate();
        java.lang.String str15 = admin2.getPassword();
        java.lang.String str16 = admin2.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "admin" + "'", str4, "admin");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "admin" + "'", str8, "admin");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "admin" + "'", str9, "admin");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "admin" + "'", str13, "admin");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "admin" + "'", str15, "admin");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "admin" + "'", str16, "admin");
    }

    @Test
    public void test23722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23722");
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
        java.lang.String str17 = admin2.getID();
        java.lang.String str18 = admin2.getPassword();
        java.lang.String str19 = admin2.getPassword();
        boolean boolean20 = admin2.isVerified();
        java.lang.Class<?> wildcardClass21 = admin2.getClass();
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
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "admin" + "'", str17, "admin");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test23723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23723");
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
        admin2.logout();
        java.lang.String str16 = admin2.getEmail();
        admin2.logout();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "admin" + "'", str9, "admin");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "admin" + "'", str14, "admin");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test23724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23724");
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
        admin2.login("hi!", "");
        java.lang.String str16 = admin2.getID();
        java.lang.Class<?> wildcardClass17 = admin2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "admin" + "'", str12, "admin");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "admin" + "'", str16, "admin");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test23725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23725");
        model.Admin admin2 = new model.Admin("admin", "");
        admin2.setVerified(true);
        admin2.logout();
        admin2.login("admin", "hi!");
        java.lang.String str9 = admin2.getPassword();
        java.lang.String str10 = admin2.getID();
        double double11 = admin2.getHourlyRate();
        java.lang.String str12 = admin2.getEmail();
        java.lang.String str13 = admin2.getID();
        boolean boolean14 = admin2.isVerified();
        java.lang.String str15 = admin2.getAccountType();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "admin" + "'", str10, "admin");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "admin" + "'", str12, "admin");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "admin" + "'", str13, "admin");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "admin" + "'", str15, "admin");
    }

    @Test
    public void test23726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23726");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        double double5 = admin2.getHourlyRate();
        double double6 = admin2.getHourlyRate();
        java.lang.String str7 = admin2.getPassword();
        admin2.setVerified(true);
        java.lang.String str10 = admin2.getAccountType();
        java.lang.String str11 = admin2.getPassword();
        admin2.viewProfile();
        admin2.logout();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "admin" + "'", str10, "admin");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test23727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23727");
        model.Admin admin2 = new model.Admin("admin", "");
        admin2.setVerified(true);
        admin2.login("admin", "");
        java.lang.String str8 = admin2.getEmail();
        java.lang.String str9 = admin2.getID();
        admin2.setVerified(false);
        admin2.setVerified(false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "admin" + "'", str8, "admin");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "admin" + "'", str9, "admin");
    }

    @Test
    public void test23728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23728");
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
        java.lang.String str12 = admin2.getPassword();
        admin2.logout();
        java.lang.String str14 = admin2.getEmail();
        admin2.viewProfile();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "admin" + "'", str8, "admin");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "admin" + "'", str9, "admin");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test23729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23729");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        java.lang.String str4 = admin2.getEmail();
        admin2.logout();
        admin2.logout();
        java.lang.String str7 = admin2.getPassword();
        admin2.login("admin", "admin");
        admin2.viewProfile();
        admin2.viewProfile();
        java.lang.String str13 = admin2.getID();
        boolean boolean14 = admin2.isVerified();
        admin2.setVerified(true);
        java.lang.String str17 = admin2.getEmail();
        admin2.logout();
        room.Room room19 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.enableRoom(room19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "admin" + "'", str13, "admin");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test23730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23730");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getAccountType();
        admin2.setVerified(false);
        double double6 = admin2.getHourlyRate();
        double double7 = admin2.getHourlyRate();
        admin2.logout();
        java.lang.String str9 = admin2.getAccountType();
        admin2.setVerified(true);
        java.lang.String str12 = admin2.getPassword();
        admin2.viewProfile();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "admin" + "'", str9, "admin");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test23731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23731");
        model.Admin admin2 = new model.Admin("admin", "");
        admin2.logout();
        double double4 = admin2.getHourlyRate();
        admin2.setVerified(false);
        double double7 = admin2.getHourlyRate();
        java.lang.String str8 = admin2.getID();
        boolean boolean9 = admin2.isVerified();
        admin2.viewProfile();
        admin2.setVerified(true);
        java.lang.String str13 = admin2.getAccountType();
        boolean boolean14 = admin2.isVerified();
        admin2.setVerified(true);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "admin" + "'", str8, "admin");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "admin" + "'", str13, "admin");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test23732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23732");
        model.Admin admin2 = new model.Admin("admin", "");
        admin2.logout();
        admin2.viewProfile();
        boolean boolean5 = admin2.isVerified();
        admin2.logout();
        java.lang.String str7 = admin2.getID();
        java.lang.String str8 = admin2.getAccountType();
        double double9 = admin2.getHourlyRate();
        java.lang.String str10 = admin2.getID();
        java.lang.String str11 = admin2.getEmail();
        admin2.login("admin", "hi!");
        boolean boolean15 = admin2.isVerified();
        admin2.logout();
        double double17 = admin2.getHourlyRate();
        double double18 = admin2.getHourlyRate();
        admin2.setVerified(true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "admin" + "'", str8, "admin");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "admin" + "'", str10, "admin");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "admin" + "'", str11, "admin");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
    }

    @Test
    public void test23733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23733");
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
        admin2.setVerified(false);
        java.lang.String str21 = admin2.getEmail();
        admin2.viewProfile();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "admin" + "'", str10, "admin");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
    }

    @Test
    public void test23734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23734");
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
        admin2.login("", "hi!");
        java.lang.String str22 = admin2.getEmail();
        java.lang.String str23 = admin2.getID();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "admin" + "'", str8, "admin");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "admin" + "'", str10, "admin");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "admin" + "'", str22, "admin");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "admin" + "'", str23, "admin");
    }

    @Test
    public void test23735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23735");
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
        admin2.login("", "admin");
        admin2.login("", "hi!");
        java.lang.Class<?> wildcardClass20 = admin2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "admin" + "'", str13, "admin");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test23736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23736");
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
        java.lang.String str17 = admin2.getEmail();
        java.lang.String str18 = admin2.getPassword();
        java.lang.String str19 = admin2.getAccountType();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "admin" + "'", str12, "admin");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "admin" + "'", str19, "admin");
    }

    @Test
    public void test23737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23737");
        model.Admin admin2 = new model.Admin("admin", "");
        admin2.setVerified(true);
        boolean boolean5 = admin2.isVerified();
        java.lang.String str6 = admin2.getAccountType();
        admin2.logout();
        boolean boolean8 = admin2.isVerified();
        double double9 = admin2.getHourlyRate();
        java.lang.String str10 = admin2.getEmail();
        double double11 = admin2.getHourlyRate();
        double double12 = admin2.getHourlyRate();
        java.lang.String str13 = admin2.getAccountType();
        room.Room room14 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.disableRoom(room14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "admin" + "'", str6, "admin");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "admin" + "'", str10, "admin");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "admin" + "'", str13, "admin");
    }

    @Test
    public void test23738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23738");
        model.Admin admin2 = new model.Admin("hi!", "admin");
        java.lang.String str3 = admin2.getID();
        admin2.setVerified(false);
        admin2.viewProfile();
        admin2.viewProfile();
        admin2.login("", "hi!");
        admin2.logout();
        admin2.login("admin", "");
        admin2.login("hi!", "hi!");
        java.lang.String str18 = admin2.getPassword();
        admin2.logout();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "admin" + "'", str18, "admin");
    }

    @Test
    public void test23739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23739");
        model.Admin admin2 = new model.Admin("", "");
        java.lang.String str3 = admin2.getAccountType();
        java.lang.String str4 = admin2.getEmail();
        admin2.login("hi!", "");
        java.lang.String str8 = admin2.getAccountType();
        java.lang.String str9 = admin2.getID();
        admin2.logout();
        java.lang.String str11 = admin2.getPassword();
        java.lang.String str12 = admin2.getEmail();
        java.lang.String str13 = admin2.getAccountType();
        admin2.logout();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "admin" + "'", str8, "admin");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "admin" + "'", str9, "admin");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "admin" + "'", str13, "admin");
    }

    @Test
    public void test23740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23740");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        admin2.logout();
        java.lang.String str5 = admin2.getAccountType();
        boolean boolean6 = admin2.isVerified();
        admin2.login("hi!", "admin");
        java.lang.String str10 = admin2.getID();
        admin2.login("hi!", "");
        java.lang.String str14 = admin2.getAccountType();
        admin2.logout();
        java.lang.String str16 = admin2.getEmail();
        java.lang.String str17 = admin2.getPassword();
        java.lang.String str18 = admin2.getPassword();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "admin" + "'", str10, "admin");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "admin" + "'", str14, "admin");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test23741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23741");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        double double5 = admin2.getHourlyRate();
        admin2.login("admin", "hi!");
        admin2.viewProfile();
        admin2.setVerified(true);
        admin2.setVerified(false);
        java.lang.String str14 = admin2.getAccountType();
        admin2.logout();
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
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "admin" + "'", str14, "admin");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test23742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23742");
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
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test23743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23743");
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
        admin2.login("hi!", "admin");
        admin2.logout();
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
    public void test23744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23744");
        model.Admin admin2 = new model.Admin("", "");
        java.lang.String str3 = admin2.getAccountType();
        java.lang.String str4 = admin2.getEmail();
        admin2.login("hi!", "");
        java.lang.String str8 = admin2.getAccountType();
        java.lang.String str9 = admin2.getID();
        admin2.logout();
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
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "admin" + "'", str8, "admin");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "admin" + "'", str9, "admin");
    }

    @Test
    public void test23745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23745");
        model.Admin admin2 = new model.Admin("admin", "admin");
        admin2.viewProfile();
        java.lang.String str4 = admin2.getPassword();
        boolean boolean5 = admin2.isVerified();
        java.lang.String str6 = admin2.getPassword();
        admin2.login("", "");
        java.lang.String str10 = admin2.getPassword();
        admin2.logout();
        java.lang.String str12 = admin2.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "admin" + "'", str4, "admin");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "admin" + "'", str6, "admin");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "admin" + "'", str10, "admin");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "admin" + "'", str12, "admin");
    }

    @Test
    public void test23746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23746");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        double double5 = admin2.getHourlyRate();
        double double6 = admin2.getHourlyRate();
        java.lang.String str7 = admin2.getID();
        admin2.viewProfile();
        double double9 = admin2.getHourlyRate();
        admin2.setVerified(true);
        java.lang.String str12 = admin2.getEmail();
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
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test23747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23747");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        java.lang.String str5 = admin2.getEmail();
        admin2.logout();
        java.lang.String str7 = admin2.getPassword();
        boolean boolean8 = admin2.isVerified();
        double double9 = admin2.getHourlyRate();
        admin2.login("admin", "admin");
        admin2.viewProfile();
        java.lang.String str14 = admin2.getID();
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
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "admin" + "'", str14, "admin");
    }

    @Test
    public void test23748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23748");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        java.lang.String str4 = admin2.getEmail();
        admin2.logout();
        double double6 = admin2.getHourlyRate();
        java.lang.String str7 = admin2.getAccountType();
        admin2.setVerified(true);
        java.lang.String str10 = admin2.getAccountType();
        boolean boolean11 = admin2.isVerified();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "admin" + "'", str10, "admin");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test23749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23749");
        model.Admin admin2 = new model.Admin("", "");
        java.lang.String str3 = admin2.getAccountType();
        admin2.setVerified(true);
        admin2.viewProfile();
        java.lang.String str7 = admin2.getEmail();
        admin2.login("hi!", "admin");
        admin2.logout();
        java.lang.Class<?> wildcardClass12 = admin2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test23750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23750");
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
        admin2.viewProfile();
        room.Room room19 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.disableRoom(room19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "admin" + "'", str8, "admin");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
    }

    @Test
    public void test23751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23751");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        admin2.logout();
        java.lang.String str5 = admin2.getAccountType();
        boolean boolean6 = admin2.isVerified();
        java.lang.String str7 = admin2.getAccountType();
        java.lang.String str8 = admin2.getAccountType();
        admin2.setVerified(false);
        java.lang.String str11 = admin2.getEmail();
        admin2.viewProfile();
        admin2.login("admin", "");
        java.lang.String str16 = admin2.getID();
        java.lang.String str17 = admin2.getAccountType();
        boolean boolean18 = admin2.isVerified();
        boolean boolean19 = admin2.isVerified();
        java.lang.String str20 = admin2.getEmail();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "admin" + "'", str8, "admin");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "admin" + "'", str16, "admin");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "admin" + "'", str17, "admin");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test23752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23752");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        admin2.logout();
        java.lang.String str5 = admin2.getAccountType();
        admin2.login("", "");
        java.lang.String str9 = admin2.getAccountType();
        java.lang.String str10 = admin2.getEmail();
        double double11 = admin2.getHourlyRate();
        java.lang.String str12 = admin2.getID();
        admin2.viewProfile();
        java.lang.String str14 = admin2.getAccountType();
        admin2.viewProfile();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "admin" + "'", str9, "admin");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "admin" + "'", str12, "admin");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "admin" + "'", str14, "admin");
    }

    @Test
    public void test23753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23753");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        double double5 = admin2.getHourlyRate();
        admin2.setVerified(true);
        admin2.logout();
        admin2.setVerified(false);
        boolean boolean11 = admin2.isVerified();
        java.lang.String str12 = admin2.getAccountType();
        java.lang.String str13 = admin2.getID();
        admin2.login("hi!", "admin");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "admin" + "'", str12, "admin");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "admin" + "'", str13, "admin");
    }

    @Test
    public void test23754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23754");
        model.Admin admin2 = new model.Admin("", "hi!");
        java.lang.String str3 = admin2.getPassword();
        java.lang.String str4 = admin2.getEmail();
        admin2.login("hi!", "");
        java.lang.String str8 = admin2.getPassword();
        admin2.viewProfile();
        admin2.login("", "");
        admin2.logout();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test23755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23755");
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
        admin2.setVerified(true);
        admin2.setVerified(false);
        admin2.logout();
        java.lang.String str22 = admin2.getPassword();
        boolean boolean23 = admin2.isVerified();
        java.lang.String str24 = admin2.getAccountType();
        admin2.logout();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "admin" + "'", str15, "admin");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "admin" + "'", str24, "admin");
    }

    @Test
    public void test23756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23756");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        admin2.logout();
        java.lang.String str5 = admin2.getAccountType();
        java.lang.String str6 = admin2.getEmail();
        java.lang.String str7 = admin2.getAccountType();
        java.lang.String str8 = admin2.getAccountType();
        java.lang.String str9 = admin2.getAccountType();
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
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "admin" + "'", str8, "admin");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "admin" + "'", str9, "admin");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test23757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23757");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        java.lang.String str4 = admin2.getAccountType();
        java.lang.String str5 = admin2.getPassword();
        admin2.logout();
        boolean boolean7 = admin2.isVerified();
        admin2.setVerified(true);
        java.lang.String str10 = admin2.getEmail();
        java.lang.String str11 = admin2.getAccountType();
        admin2.viewProfile();
        admin2.login("", "hi!");
        java.lang.String str16 = admin2.getAccountType();
        java.lang.String str17 = admin2.getAccountType();
        double double18 = admin2.getHourlyRate();
        java.lang.String str19 = admin2.getEmail();
        java.lang.Class<?> wildcardClass20 = admin2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "admin" + "'", str4, "admin");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "admin" + "'", str11, "admin");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "admin" + "'", str16, "admin");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "admin" + "'", str17, "admin");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test23758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23758");
        model.Admin admin2 = new model.Admin("admin", "admin");
        admin2.login("admin", "admin");
        boolean boolean6 = admin2.isVerified();
        admin2.logout();
        admin2.logout();
        java.lang.String str9 = admin2.getAccountType();
        java.lang.String str10 = admin2.getAccountType();
        java.lang.String str11 = admin2.getAccountType();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "admin" + "'", str9, "admin");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "admin" + "'", str10, "admin");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "admin" + "'", str11, "admin");
    }

    @Test
    public void test23759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23759");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getAccountType();
        boolean boolean4 = admin2.isVerified();
        java.lang.String str5 = admin2.getPassword();
        java.lang.String str6 = admin2.getEmail();
        java.lang.String str7 = admin2.getID();
        admin2.login("", "hi!");
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
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
    }

    @Test
    public void test23760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23760");
        model.Admin admin2 = new model.Admin("admin", "");
        admin2.setVerified(true);
        boolean boolean5 = admin2.isVerified();
        java.lang.String str6 = admin2.getID();
        admin2.logout();
        double double8 = admin2.getHourlyRate();
        java.lang.String str9 = admin2.getEmail();
        java.lang.String str10 = admin2.getEmail();
        java.lang.String str11 = admin2.getEmail();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "admin" + "'", str6, "admin");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "admin" + "'", str9, "admin");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "admin" + "'", str10, "admin");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "admin" + "'", str11, "admin");
    }

    @Test
    public void test23761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23761");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        double double5 = admin2.getHourlyRate();
        double double6 = admin2.getHourlyRate();
        java.lang.String str7 = admin2.getID();
        boolean boolean8 = admin2.isVerified();
        admin2.login("", "");
        java.lang.String str12 = admin2.getPassword();
        java.lang.String str13 = admin2.getAccountType();
        boolean boolean14 = admin2.isVerified();
        admin2.viewProfile();
        admin2.setVerified(false);
        admin2.setVerified(false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "admin" + "'", str13, "admin");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test23762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23762");
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
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "admin" + "'", str15, "admin");
    }

    @Test
    public void test23763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23763");
        model.Admin admin2 = new model.Admin("hi!", "admin");
        java.lang.String str3 = admin2.getID();
        admin2.setVerified(true);
        java.lang.String str6 = admin2.getAccountType();
        admin2.login("hi!", "hi!");
        java.lang.String str10 = admin2.getID();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "admin" + "'", str6, "admin");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "admin" + "'", str10, "admin");
    }

    @Test
    public void test23764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23764");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        admin2.viewProfile();
        java.lang.String str5 = admin2.getID();
        java.lang.String str6 = admin2.getAccountType();
        java.lang.String str7 = admin2.getID();
        java.lang.String str8 = admin2.getEmail();
        java.lang.String str9 = admin2.getPassword();
        boolean boolean10 = admin2.isVerified();
        double double11 = admin2.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "admin" + "'", str6, "admin");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test23765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23765");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        double double5 = admin2.getHourlyRate();
        double double6 = admin2.getHourlyRate();
        java.lang.String str7 = admin2.getPassword();
        admin2.setVerified(true);
        boolean boolean10 = admin2.isVerified();
        admin2.setVerified(true);
        boolean boolean13 = admin2.isVerified();
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
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test23766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23766");
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
        java.lang.String str13 = admin2.getPassword();
        java.lang.String str14 = admin2.getAccountType();
        admin2.logout();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "admin" + "'", str6, "admin");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "admin" + "'", str14, "admin");
    }

    @Test
    public void test23767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23767");
        model.Admin admin2 = new model.Admin("admin", "admin");
        boolean boolean3 = admin2.isVerified();
        admin2.login("hi!", "");
        java.lang.String str7 = admin2.getEmail();
        admin2.viewProfile();
        double double9 = admin2.getHourlyRate();
        admin2.login("hi!", "hi!");
        admin2.viewProfile();
        boolean boolean14 = admin2.isVerified();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test23768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23768");
        model.Admin admin2 = new model.Admin("admin", "admin");
        admin2.viewProfile();
        java.lang.String str4 = admin2.getPassword();
        admin2.login("", "");
        boolean boolean8 = admin2.isVerified();
        admin2.setVerified(true);
        admin2.setVerified(false);
        admin2.setVerified(false);
        admin2.viewProfile();
        double double16 = admin2.getHourlyRate();
        admin2.setVerified(true);
        java.lang.Class<?> wildcardClass19 = admin2.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "admin" + "'", str4, "admin");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test23769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23769");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        java.lang.String str4 = admin2.getEmail();
        admin2.logout();
        admin2.logout();
        java.lang.String str7 = admin2.getPassword();
        java.lang.String str8 = admin2.getAccountType();
        java.lang.String str9 = admin2.getEmail();
        double double10 = admin2.getHourlyRate();
        admin2.logout();
        boolean boolean12 = admin2.isVerified();
        java.lang.String str13 = admin2.getID();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "admin" + "'", str8, "admin");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "admin" + "'", str13, "admin");
    }

    @Test
    public void test23770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23770");
        model.Admin admin2 = new model.Admin("admin", "admin");
        admin2.login("admin", "admin");
        boolean boolean6 = admin2.isVerified();
        admin2.logout();
        admin2.logout();
        admin2.login("hi!", "admin");
        java.lang.String str12 = admin2.getPassword();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "admin" + "'", str12, "admin");
    }

    @Test
    public void test23771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23771");
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
        admin2.login("admin", "admin");
        java.lang.String str19 = admin2.getPassword();
        boolean boolean20 = admin2.isVerified();
        java.lang.String str21 = admin2.getAccountType();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "admin" + "'", str9, "admin");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "admin" + "'", str10, "admin");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "admin" + "'", str21, "admin");
    }

    @Test
    public void test23772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23772");
        model.Admin admin2 = new model.Admin("admin", "admin");
        admin2.login("admin", "admin");
        boolean boolean6 = admin2.isVerified();
        admin2.logout();
        java.lang.String str8 = admin2.getID();
        admin2.logout();
        java.lang.String str10 = admin2.getEmail();
        admin2.logout();
        java.lang.String str12 = admin2.getAccountType();
        admin2.login("admin", "");
        java.lang.String str16 = admin2.getEmail();
        admin2.login("hi!", "admin");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "admin" + "'", str8, "admin");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "admin" + "'", str10, "admin");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "admin" + "'", str12, "admin");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "admin" + "'", str16, "admin");
    }

    @Test
    public void test23773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23773");
        model.Admin admin2 = new model.Admin("admin", "admin");
        admin2.viewProfile();
        admin2.viewProfile();
        admin2.login("hi!", "admin");
        java.lang.String str8 = admin2.getID();
        boolean boolean9 = admin2.isVerified();
        java.lang.String str10 = admin2.getAccountType();
        admin2.logout();
        room.Room room12 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.addRoom(room12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.getRoomID()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "admin" + "'", str8, "admin");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "admin" + "'", str10, "admin");
    }

    @Test
    public void test23774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23774");
        model.Admin admin2 = new model.Admin("admin", "admin");
        admin2.viewProfile();
        java.lang.String str4 = admin2.getPassword();
        double double5 = admin2.getHourlyRate();
        java.lang.String str6 = admin2.getAccountType();
        boolean boolean7 = admin2.isVerified();
        admin2.logout();
        boolean boolean9 = admin2.isVerified();
        java.lang.String str10 = admin2.getAccountType();
        boolean boolean11 = admin2.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "admin" + "'", str4, "admin");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "admin" + "'", str6, "admin");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "admin" + "'", str10, "admin");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test23775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23775");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        double double5 = admin2.getHourlyRate();
        double double6 = admin2.getHourlyRate();
        java.lang.String str7 = admin2.getPassword();
        double double8 = admin2.getHourlyRate();
        admin2.logout();
        double double10 = admin2.getHourlyRate();
        boolean boolean11 = admin2.isVerified();
        java.lang.String str12 = admin2.getEmail();
        admin2.login("admin", "hi!");
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
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test23776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23776");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        java.lang.String str4 = admin2.getPassword();
        java.lang.String str5 = admin2.getAccountType();
        admin2.viewProfile();
        double double7 = admin2.getHourlyRate();
        java.lang.String str8 = admin2.getEmail();
        admin2.login("hi!", "admin");
        admin2.viewProfile();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test23777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23777");
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
        java.lang.String str20 = admin2.getEmail();
        admin2.logout();
        java.lang.String str22 = admin2.getID();
        java.lang.String str23 = admin2.getID();
        java.lang.Class<?> wildcardClass24 = admin2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "admin" + "'", str17, "admin");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "admin" + "'", str22, "admin");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "admin" + "'", str23, "admin");
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test23778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23778");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getAccountType();
        admin2.setVerified(false);
        double double6 = admin2.getHourlyRate();
        java.lang.String str7 = admin2.getEmail();
        admin2.logout();
        java.lang.String str9 = admin2.getAccountType();
        java.lang.String str10 = admin2.getID();
        admin2.viewProfile();
        admin2.setVerified(false);
        boolean boolean14 = admin2.isVerified();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "admin" + "'", str9, "admin");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "admin" + "'", str10, "admin");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test23779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23779");
        model.Admin admin2 = new model.Admin("", "");
        java.lang.String str3 = admin2.getAccountType();
        admin2.setVerified(true);
        java.lang.String str6 = admin2.getAccountType();
        admin2.logout();
        double double8 = admin2.getHourlyRate();
        java.lang.String str9 = admin2.getEmail();
        admin2.login("", "hi!");
        java.lang.String str13 = admin2.getID();
        admin2.login("", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "admin" + "'", str6, "admin");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "admin" + "'", str13, "admin");
    }

    @Test
    public void test23780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23780");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        admin2.logout();
        java.lang.String str5 = admin2.getAccountType();
        admin2.viewProfile();
        admin2.login("hi!", "admin");
        boolean boolean10 = admin2.isVerified();
        admin2.logout();
        admin2.login("", "");
        boolean boolean15 = admin2.isVerified();
        boolean boolean16 = admin2.isVerified();
        double double17 = admin2.getHourlyRate();
        java.lang.String str18 = admin2.getEmail();
        java.lang.String str19 = admin2.getID();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "admin" + "'", str19, "admin");
    }

    @Test
    public void test23781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23781");
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
        java.lang.String str17 = admin2.getEmail();
        java.lang.String str18 = admin2.getEmail();
        java.lang.String str19 = admin2.getID();
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
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "admin" + "'", str19, "admin");
    }

    @Test
    public void test23782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23782");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        admin2.logout();
        admin2.setVerified(false);
        java.lang.String str6 = admin2.getEmail();
        java.lang.String str7 = admin2.getID();
        double double8 = admin2.getHourlyRate();
        java.lang.String str9 = admin2.getAccountType();
        java.lang.String str10 = admin2.getPassword();
        room.Room room11 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.addRoom(room11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.getRoomID()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "admin" + "'", str9, "admin");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test23783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23783");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        double double5 = admin2.getHourlyRate();
        admin2.setVerified(true);
        admin2.viewProfile();
        admin2.login("", "admin");
        java.lang.String str12 = admin2.getAccountType();
        java.lang.String str13 = admin2.getEmail();
        java.lang.String str14 = admin2.getPassword();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "admin" + "'", str12, "admin");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test23784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23784");
        model.Admin admin2 = new model.Admin("admin", "admin");
        admin2.login("admin", "admin");
        boolean boolean6 = admin2.isVerified();
        admin2.logout();
        java.lang.String str8 = admin2.getPassword();
        java.lang.String str9 = admin2.getID();
        boolean boolean10 = admin2.isVerified();
        java.lang.String str11 = admin2.getEmail();
        admin2.login("hi!", "admin");
        java.lang.String str15 = admin2.getID();
        double double16 = admin2.getHourlyRate();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "admin" + "'", str8, "admin");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "admin" + "'", str9, "admin");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "admin" + "'", str11, "admin");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "admin" + "'", str15, "admin");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
    }

    @Test
    public void test23785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23785");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        double double5 = admin2.getHourlyRate();
        admin2.login("admin", "hi!");
        admin2.viewProfile();
        admin2.setVerified(true);
        double double12 = admin2.getHourlyRate();
        boolean boolean13 = admin2.isVerified();
        admin2.setVerified(false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test23786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23786");
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
        admin2.login("", "");
        double double19 = admin2.getHourlyRate();
        java.lang.String str20 = admin2.getID();
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
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "admin" + "'", str20, "admin");
    }

    @Test
    public void test23787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23787");
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
        admin2.login("hi!", "");
        java.lang.String str17 = admin2.getID();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "admin" + "'", str8, "admin");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "admin" + "'", str17, "admin");
    }

    @Test
    public void test23788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23788");
        model.Admin admin2 = new model.Admin("", "");
        java.lang.String str3 = admin2.getAccountType();
        admin2.setVerified(true);
        java.lang.String str6 = admin2.getAccountType();
        admin2.logout();
        double double8 = admin2.getHourlyRate();
        java.lang.String str9 = admin2.getEmail();
        admin2.login("", "hi!");
        boolean boolean13 = admin2.isVerified();
        java.lang.String str14 = admin2.getEmail();
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
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "admin" + "'", str6, "admin");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "admin" + "'", str15, "admin");
    }

    @Test
    public void test23789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23789");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        double double5 = admin2.getHourlyRate();
        double double6 = admin2.getHourlyRate();
        admin2.viewProfile();
        java.lang.String str8 = admin2.getID();
        admin2.logout();
        boolean boolean10 = admin2.isVerified();
        boolean boolean11 = admin2.isVerified();
        admin2.logout();
        admin2.viewProfile();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "admin" + "'", str8, "admin");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test23790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23790");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        java.lang.String str5 = admin2.getEmail();
        admin2.logout();
        java.lang.String str7 = admin2.getPassword();
        boolean boolean8 = admin2.isVerified();
        double double9 = admin2.getHourlyRate();
        admin2.login("admin", "hi!");
        java.lang.String str13 = admin2.getPassword();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test23791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23791");
        model.Admin admin2 = new model.Admin("admin", "admin");
        admin2.viewProfile();
        admin2.viewProfile();
        admin2.login("hi!", "admin");
        java.lang.String str8 = admin2.getID();
        admin2.setVerified(false);
        admin2.logout();
        boolean boolean12 = admin2.isVerified();
        java.lang.String str13 = admin2.getID();
        java.lang.String str14 = admin2.getEmail();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "admin" + "'", str8, "admin");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "admin" + "'", str13, "admin");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "admin" + "'", str14, "admin");
    }

    @Test
    public void test23792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23792");
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
        boolean boolean15 = admin2.isVerified();
        java.lang.String str16 = admin2.getAccountType();
        admin2.viewProfile();
        double double18 = admin2.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "admin" + "'", str13, "admin");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "admin" + "'", str16, "admin");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
    }

    @Test
    public void test23793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23793");
        model.Admin admin2 = new model.Admin("admin", "admin");
        admin2.viewProfile();
        java.lang.String str4 = admin2.getID();
        java.lang.String str5 = admin2.getAccountType();
        java.lang.String str6 = admin2.getEmail();
        java.lang.String str7 = admin2.getPassword();
        double double8 = admin2.getHourlyRate();
        java.lang.String str9 = admin2.getAccountType();
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
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "admin" + "'", str4, "admin");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "admin" + "'", str6, "admin");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "admin" + "'", str9, "admin");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "admin" + "'", str12, "admin");
    }

    @Test
    public void test23794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23794");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getAccountType();
        boolean boolean4 = admin2.isVerified();
        admin2.setVerified(true);
        boolean boolean7 = admin2.isVerified();
        admin2.logout();
        admin2.logout();
        java.lang.String str10 = admin2.getID();
        admin2.setVerified(true);
        admin2.login("admin", "admin");
        admin2.login("admin", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "admin" + "'", str10, "admin");
    }

    @Test
    public void test23795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23795");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        admin2.logout();
        java.lang.String str5 = admin2.getAccountType();
        boolean boolean6 = admin2.isVerified();
        admin2.login("hi!", "admin");
        java.lang.String str10 = admin2.getEmail();
        admin2.login("hi!", "");
        java.lang.String str14 = admin2.getPassword();
        double double15 = admin2.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test23796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23796");
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
        admin2.logout();
        admin2.logout();
        admin2.login("hi!", "hi!");
        admin2.logout();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "admin" + "'", str11, "admin");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test23797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23797");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        java.lang.String str4 = admin2.getPassword();
        java.lang.String str5 = admin2.getPassword();
        java.lang.String str6 = admin2.getPassword();
        java.lang.String str7 = admin2.getPassword();
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
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test23798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23798");
        model.Admin admin2 = new model.Admin("", "");
        java.lang.String str3 = admin2.getAccountType();
        java.lang.String str4 = admin2.getEmail();
        boolean boolean5 = admin2.isVerified();
        admin2.login("", "hi!");
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
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "admin" + "'", str9, "admin");
    }

    @Test
    public void test23799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23799");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        admin2.logout();
        java.lang.String str5 = admin2.getAccountType();
        admin2.viewProfile();
        admin2.logout();
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
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "admin" + "'", str8, "admin");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test23800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23800");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getAccountType();
        java.lang.String str4 = admin2.getPassword();
        admin2.setVerified(true);
        java.lang.String str7 = admin2.getID();
        java.lang.String str8 = admin2.getEmail();
        java.lang.String str9 = admin2.getID();
        admin2.viewProfile();
        double double11 = admin2.getHourlyRate();
        admin2.viewProfile();
        java.lang.String str13 = admin2.getAccountType();
        admin2.setVerified(true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "admin" + "'", str9, "admin");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "admin" + "'", str13, "admin");
    }

    @Test
    public void test23801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23801");
        model.Admin admin2 = new model.Admin("", "");
        java.lang.String str3 = admin2.getAccountType();
        java.lang.String str4 = admin2.getEmail();
        double double5 = admin2.getHourlyRate();
        admin2.logout();
        java.lang.String str7 = admin2.getEmail();
        admin2.setVerified(false);
        java.lang.String str10 = admin2.getAccountType();
        java.lang.String str11 = admin2.getPassword();
        admin2.logout();
        java.lang.String str13 = admin2.getID();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "admin" + "'", str10, "admin");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "admin" + "'", str13, "admin");
    }

    @Test
    public void test23802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23802");
        model.Admin admin2 = new model.Admin("admin", "admin");
        admin2.viewProfile();
        java.lang.String str4 = admin2.getPassword();
        admin2.login("", "");
        boolean boolean8 = admin2.isVerified();
        boolean boolean9 = admin2.isVerified();
        java.lang.String str10 = admin2.getAccountType();
        admin2.logout();
        admin2.logout();
        java.lang.String str13 = admin2.getID();
        double double14 = admin2.getHourlyRate();
        java.lang.String str15 = admin2.getAccountType();
        boolean boolean16 = admin2.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "admin" + "'", str4, "admin");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "admin" + "'", str10, "admin");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "admin" + "'", str13, "admin");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "admin" + "'", str15, "admin");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test23803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23803");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        admin2.setVerified(true);
        java.lang.String str5 = admin2.getID();
        admin2.setVerified(false);
        java.lang.String str8 = admin2.getAccountType();
        admin2.setVerified(false);
        java.lang.String str11 = admin2.getAccountType();
        java.lang.String str12 = admin2.getEmail();
        double double13 = admin2.getHourlyRate();
        java.lang.String str14 = admin2.getID();
        room.Room room15 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.enableRoom(room15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "admin" + "'", str8, "admin");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "admin" + "'", str11, "admin");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "admin" + "'", str14, "admin");
    }

    @Test
    public void test23804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23804");
        model.Admin admin2 = new model.Admin("", "");
        java.lang.String str3 = admin2.getAccountType();
        java.lang.String str4 = admin2.getEmail();
        java.lang.String str5 = admin2.getID();
        double double6 = admin2.getHourlyRate();
        java.lang.String str7 = admin2.getAccountType();
        double double8 = admin2.getHourlyRate();
        java.lang.String str9 = admin2.getAccountType();
        admin2.setVerified(false);
        java.lang.String str12 = admin2.getEmail();
        java.lang.String str13 = admin2.getID();
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
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "admin" + "'", str9, "admin");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "admin" + "'", str13, "admin");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "admin" + "'", str14, "admin");
    }

    @Test
    public void test23805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23805");
        model.Admin admin2 = new model.Admin("", "");
        java.lang.String str3 = admin2.getAccountType();
        admin2.setVerified(true);
        double double6 = admin2.getHourlyRate();
        admin2.viewProfile();
        boolean boolean8 = admin2.isVerified();
        java.lang.String str9 = admin2.getID();
        java.lang.String str10 = admin2.getID();
        double double11 = admin2.getHourlyRate();
        admin2.logout();
        admin2.logout();
        double double14 = admin2.getHourlyRate();
        java.lang.String str15 = admin2.getEmail();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "admin" + "'", str9, "admin");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "admin" + "'", str10, "admin");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test23806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23806");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        java.lang.String str4 = admin2.getAccountType();
        java.lang.String str5 = admin2.getPassword();
        admin2.logout();
        java.lang.String str7 = admin2.getAccountType();
        admin2.login("", "hi!");
        admin2.login("admin", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "admin" + "'", str4, "admin");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
    }

    @Test
    public void test23807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23807");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        admin2.logout();
        java.lang.String str5 = admin2.getAccountType();
        admin2.viewProfile();
        admin2.logout();
        admin2.login("admin", "");
        admin2.setVerified(false);
        boolean boolean13 = admin2.isVerified();
        double double14 = admin2.getHourlyRate();
        admin2.logout();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test23808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23808");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        double double5 = admin2.getHourlyRate();
        admin2.login("admin", "hi!");
        admin2.setVerified(true);
        java.lang.String str11 = admin2.getEmail();
        admin2.setVerified(true);
        boolean boolean14 = admin2.isVerified();
        java.lang.String str15 = admin2.getEmail();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test23809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23809");
        model.Admin admin2 = new model.Admin("admin", "");
        admin2.setVerified(true);
        java.lang.String str5 = admin2.getEmail();
        double double6 = admin2.getHourlyRate();
        admin2.viewProfile();
        boolean boolean8 = admin2.isVerified();
        admin2.login("admin", "admin");
        admin2.logout();
        java.lang.String str13 = admin2.getAccountType();
        admin2.login("admin", "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "admin" + "'", str13, "admin");
    }

    @Test
    public void test23810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23810");
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
        java.lang.String str21 = admin2.getPassword();
        boolean boolean22 = admin2.isVerified();
        admin2.viewProfile();
        room.Room room24 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.disableRoom(room24);
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
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test23811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23811");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        admin2.logout();
        java.lang.String str5 = admin2.getAccountType();
        admin2.login("", "");
        java.lang.String str9 = admin2.getEmail();
        java.lang.String str10 = admin2.getAccountType();
        java.lang.String str11 = admin2.getEmail();
        admin2.viewProfile();
        java.lang.String str13 = admin2.getPassword();
        double double14 = admin2.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "admin" + "'", str10, "admin");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test23812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23812");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        admin2.logout();
        admin2.setVerified(false);
        java.lang.String str6 = admin2.getEmail();
        java.lang.String str7 = admin2.getID();
        admin2.setVerified(true);
        double double10 = admin2.getHourlyRate();
        java.lang.String str11 = admin2.getPassword();
        admin2.login("hi!", "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test23813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23813");
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
        admin2.setVerified(false);
        admin2.setVerified(true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "admin" + "'", str15, "admin");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test23814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23814");
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
        double double18 = admin2.getHourlyRate();
        java.lang.String str19 = admin2.getPassword();
        boolean boolean20 = admin2.isVerified();
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
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test23815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23815");
        model.Admin admin2 = new model.Admin("admin", "admin");
        boolean boolean3 = admin2.isVerified();
        admin2.login("hi!", "");
        admin2.setVerified(true);
        java.lang.String str9 = admin2.getAccountType();
        java.lang.String str10 = admin2.getPassword();
        java.lang.String str11 = admin2.getEmail();
        java.lang.String str12 = admin2.getAccountType();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "admin" + "'", str9, "admin");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "admin" + "'", str10, "admin");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "admin" + "'", str11, "admin");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "admin" + "'", str12, "admin");
    }

    @Test
    public void test23816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23816");
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
        java.lang.String str16 = admin2.getID();
        admin2.setVerified(true);
        java.lang.String str19 = admin2.getEmail();
        admin2.viewProfile();
        admin2.viewProfile();
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
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "admin" + "'", str16, "admin");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test23817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23817");
        model.Admin admin2 = new model.Admin("admin", "");
        admin2.setVerified(true);
        admin2.logout();
        admin2.login("admin", "hi!");
        admin2.setVerified(false);
        admin2.setVerified(false);
        admin2.viewProfile();
        admin2.logout();
        admin2.viewProfile();
        admin2.login("", "admin");
        java.lang.String str19 = admin2.getEmail();
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "admin" + "'", str19, "admin");
    }

    @Test
    public void test23818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23818");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        java.lang.String str4 = admin2.getEmail();
        admin2.logout();
        admin2.logout();
        admin2.login("hi!", "hi!");
        java.lang.String str10 = admin2.getAccountType();
        admin2.viewProfile();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "admin" + "'", str10, "admin");
    }

    @Test
    public void test23819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23819");
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
        double double20 = admin2.getHourlyRate();
        admin2.viewProfile();
        java.lang.String str22 = admin2.getAccountType();
        java.lang.String str23 = admin2.getEmail();
        boolean boolean24 = admin2.isVerified();
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
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "admin" + "'", str22, "admin");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test23820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23820");
        model.Admin admin2 = new model.Admin("admin", "admin");
        admin2.login("admin", "admin");
        boolean boolean6 = admin2.isVerified();
        admin2.logout();
        java.lang.String str8 = admin2.getPassword();
        admin2.viewProfile();
        admin2.setVerified(true);
        boolean boolean12 = admin2.isVerified();
        java.lang.String str13 = admin2.getID();
        admin2.setVerified(true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "admin" + "'", str8, "admin");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "admin" + "'", str13, "admin");
    }

    @Test
    public void test23821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23821");
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
        java.lang.String str14 = admin2.getAccountType();
        double double15 = admin2.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "admin" + "'", str8, "admin");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "admin" + "'", str9, "admin");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "admin" + "'", str10, "admin");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "admin" + "'", str14, "admin");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test23822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23822");
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
        boolean boolean18 = admin2.isVerified();
        double double19 = admin2.getHourlyRate();
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
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
    }

    @Test
    public void test23823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23823");
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
        double double16 = admin2.getHourlyRate();
        admin2.setVerified(true);
        admin2.setVerified(false);
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
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "admin" + "'", str15, "admin");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
    }

    @Test
    public void test23824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23824");
        model.Admin admin2 = new model.Admin("", "hi!");
        boolean boolean3 = admin2.isVerified();
        java.lang.String str4 = admin2.getPassword();
        admin2.login("", "");
        boolean boolean8 = admin2.isVerified();
        double double9 = admin2.getHourlyRate();
        java.lang.String str10 = admin2.getPassword();
        java.lang.String str11 = admin2.getEmail();
        double double12 = admin2.getHourlyRate();
        room.Room room13 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.enableRoom(room13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test23825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23825");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getAccountType();
        boolean boolean4 = admin2.isVerified();
        boolean boolean5 = admin2.isVerified();
        admin2.logout();
        admin2.login("admin", "hi!");
        boolean boolean10 = admin2.isVerified();
        admin2.logout();
        admin2.setVerified(true);
        admin2.login("", "hi!");
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
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test23826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23826");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        admin2.logout();
        java.lang.String str5 = admin2.getAccountType();
        boolean boolean6 = admin2.isVerified();
        admin2.login("hi!", "admin");
        admin2.setVerified(false);
        java.lang.String str12 = admin2.getAccountType();
        java.lang.String str13 = admin2.getID();
        java.lang.String str14 = admin2.getPassword();
        admin2.login("hi!", "admin");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "admin" + "'", str12, "admin");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "admin" + "'", str13, "admin");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test23827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23827");
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
        double double15 = admin2.getHourlyRate();
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
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test23828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23828");
        model.Admin admin2 = new model.Admin("admin", "admin");
        boolean boolean3 = admin2.isVerified();
        admin2.login("hi!", "");
        admin2.setVerified(true);
        admin2.viewProfile();
        admin2.login("admin", "admin");
        admin2.setVerified(false);
        admin2.logout();
        boolean boolean16 = admin2.isVerified();
        admin2.setVerified(true);
        java.lang.String str19 = admin2.getAccountType();
        admin2.login("admin", "admin");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "admin" + "'", str19, "admin");
    }

    @Test
    public void test23829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23829");
        model.Admin admin2 = new model.Admin("admin", "admin");
        boolean boolean3 = admin2.isVerified();
        admin2.login("hi!", "");
        admin2.setVerified(true);
        admin2.viewProfile();
        admin2.login("admin", "admin");
        admin2.login("hi!", "hi!");
        double double16 = admin2.getHourlyRate();
        admin2.login("hi!", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
    }

    @Test
    public void test23830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23830");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        double double5 = admin2.getHourlyRate();
        admin2.setVerified(true);
        double double8 = admin2.getHourlyRate();
        double double9 = admin2.getHourlyRate();
        admin2.login("", "admin");
        java.lang.String str13 = admin2.getID();
        admin2.login("", "hi!");
        admin2.login("hi!", "hi!");
        admin2.viewProfile();
        java.lang.String str21 = admin2.getEmail();
        admin2.login("", "admin");
        admin2.logout();
        java.lang.String str26 = admin2.getEmail();
        java.lang.Class<?> wildcardClass27 = admin2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "admin" + "'", str13, "admin");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test23831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23831");
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
        java.lang.Class<?> wildcardClass17 = admin2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test23832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23832");
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
        admin2.setVerified(true);
        admin2.viewProfile();
        java.lang.String str18 = admin2.getPassword();
        double double19 = admin2.getHourlyRate();
        admin2.viewProfile();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "admin" + "'", str14, "admin");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
    }

    @Test
    public void test23833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23833");
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
        admin2.login("admin", "");
        admin2.logout();
        java.lang.String str20 = admin2.getID();
        double double21 = admin2.getHourlyRate();
        java.lang.String str22 = admin2.getAccountType();
        java.lang.String str23 = admin2.getPassword();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "admin" + "'", str9, "admin");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "admin" + "'", str20, "admin");
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "admin" + "'", str22, "admin");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test23834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23834");
        model.Admin admin2 = new model.Admin("", "");
        java.lang.String str3 = admin2.getAccountType();
        java.lang.String str4 = admin2.getEmail();
        admin2.login("hi!", "");
        java.lang.String str8 = admin2.getAccountType();
        java.lang.String str9 = admin2.getID();
        admin2.logout();
        java.lang.String str11 = admin2.getID();
        java.lang.String str12 = admin2.getEmail();
        java.lang.String str13 = admin2.getPassword();
        java.lang.String str14 = admin2.getID();
        double double15 = admin2.getHourlyRate();
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
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "admin" + "'", str8, "admin");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "admin" + "'", str9, "admin");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "admin" + "'", str11, "admin");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "admin" + "'", str14, "admin");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test23835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23835");
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
        admin2.setVerified(true);
        java.lang.String str15 = admin2.getPassword();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test23836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23836");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        java.lang.String str4 = admin2.getAccountType();
        java.lang.String str5 = admin2.getPassword();
        admin2.logout();
        admin2.logout();
        java.lang.String str8 = admin2.getAccountType();
        java.lang.String str9 = admin2.getEmail();
        java.lang.String str10 = admin2.getID();
        admin2.viewProfile();
        double double12 = admin2.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "admin" + "'", str4, "admin");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "admin" + "'", str8, "admin");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "admin" + "'", str10, "admin");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test23837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23837");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getAccountType();
        java.lang.String str4 = admin2.getPassword();
        admin2.setVerified(true);
        java.lang.String str7 = admin2.getID();
        admin2.viewProfile();
        java.lang.String str9 = admin2.getEmail();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test23838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23838");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        admin2.logout();
        java.lang.String str5 = admin2.getAccountType();
        admin2.login("hi!", "");
        double double9 = admin2.getHourlyRate();
        boolean boolean10 = admin2.isVerified();
        admin2.login("admin", "admin");
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
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test23839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23839");
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
        java.lang.String str19 = admin2.getID();
        admin2.logout();
        java.lang.String str21 = admin2.getAccountType();
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
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "admin" + "'", str18, "admin");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "admin" + "'", str19, "admin");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "admin" + "'", str21, "admin");
    }

    @Test
    public void test23840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23840");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        admin2.logout();
        java.lang.String str5 = admin2.getAccountType();
        boolean boolean6 = admin2.isVerified();
        admin2.login("hi!", "admin");
        java.lang.String str10 = admin2.getID();
        double double11 = admin2.getHourlyRate();
        double double12 = admin2.getHourlyRate();
        java.lang.String str13 = admin2.getEmail();
        admin2.logout();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "admin" + "'", str10, "admin");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test23841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23841");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        java.lang.String str5 = admin2.getID();
        admin2.setVerified(false);
        java.lang.String str8 = admin2.getPassword();
        admin2.logout();
        admin2.login("admin", "");
        admin2.viewProfile();
        admin2.login("admin", "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test23842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23842");
        model.Admin admin2 = new model.Admin("admin", "");
        admin2.setVerified(true);
        java.lang.String str5 = admin2.getEmail();
        double double6 = admin2.getHourlyRate();
        java.lang.String str7 = admin2.getPassword();
        java.lang.String str8 = admin2.getID();
        java.lang.String str9 = admin2.getPassword();
        admin2.viewProfile();
        admin2.viewProfile();
        java.lang.String str12 = admin2.getAccountType();
        java.lang.String str13 = admin2.getID();
        room.Room room14 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.addRoom(room14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.getRoomID()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "admin" + "'", str8, "admin");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "admin" + "'", str12, "admin");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "admin" + "'", str13, "admin");
    }

    @Test
    public void test23843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23843");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        double double5 = admin2.getHourlyRate();
        double double6 = admin2.getHourlyRate();
        java.lang.String str7 = admin2.getID();
        admin2.viewProfile();
        java.lang.String str9 = admin2.getID();
        admin2.logout();
        admin2.login("", "hi!");
        admin2.setVerified(false);
        java.lang.String str16 = admin2.getAccountType();
        admin2.login("", "admin");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "admin" + "'", str9, "admin");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "admin" + "'", str16, "admin");
    }

    @Test
    public void test23844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23844");
        model.Admin admin2 = new model.Admin("", "");
        java.lang.String str3 = admin2.getAccountType();
        java.lang.String str4 = admin2.getEmail();
        java.lang.String str5 = admin2.getID();
        double double6 = admin2.getHourlyRate();
        java.lang.String str7 = admin2.getEmail();
        java.lang.String str8 = admin2.getID();
        admin2.logout();
        admin2.viewProfile();
        java.lang.String str11 = admin2.getAccountType();
        java.lang.String str12 = admin2.getID();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "admin" + "'", str8, "admin");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "admin" + "'", str11, "admin");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "admin" + "'", str12, "admin");
    }

    @Test
    public void test23845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23845");
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
        admin2.login("", "admin");
        admin2.setVerified(false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "admin" + "'", str11, "admin");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test23846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23846");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        java.lang.String str5 = admin2.getAccountType();
        java.lang.String str6 = admin2.getEmail();
        admin2.viewProfile();
        java.lang.String str8 = admin2.getID();
        admin2.setVerified(true);
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
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "admin" + "'", str8, "admin");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test23847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23847");
        model.Admin admin2 = new model.Admin("admin", "admin");
        boolean boolean3 = admin2.isVerified();
        admin2.login("hi!", "");
        admin2.setVerified(true);
        admin2.viewProfile();
        admin2.login("admin", "admin");
        admin2.login("hi!", "hi!");
        admin2.viewProfile();
        admin2.viewProfile();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test23848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23848");
        model.Admin admin2 = new model.Admin("admin", "admin");
        admin2.viewProfile();
        java.lang.String str4 = admin2.getID();
        admin2.logout();
        java.lang.String str6 = admin2.getAccountType();
        admin2.viewProfile();
        admin2.setVerified(true);
        admin2.logout();
        java.lang.String str11 = admin2.getAccountType();
        admin2.setVerified(false);
        admin2.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "admin" + "'", str4, "admin");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "admin" + "'", str6, "admin");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "admin" + "'", str11, "admin");
    }

    @Test
    public void test23849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23849");
        model.Admin admin2 = new model.Admin("admin", "admin");
        admin2.viewProfile();
        java.lang.String str4 = admin2.getPassword();
        admin2.login("", "");
        java.lang.String str8 = admin2.getEmail();
        java.lang.String str9 = admin2.getAccountType();
        admin2.login("", "");
        java.lang.String str13 = admin2.getPassword();
        double double14 = admin2.getHourlyRate();
        admin2.logout();
        java.lang.String str16 = admin2.getEmail();
        java.lang.String str17 = admin2.getAccountType();
        java.lang.String str18 = admin2.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "admin" + "'", str4, "admin");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "admin" + "'", str8, "admin");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "admin" + "'", str9, "admin");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "admin" + "'", str13, "admin");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "admin" + "'", str16, "admin");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "admin" + "'", str17, "admin");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "admin" + "'", str18, "admin");
    }

    @Test
    public void test23850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23850");
        model.Admin admin2 = new model.Admin("admin", "admin");
        admin2.viewProfile();
        java.lang.String str4 = admin2.getID();
        java.lang.String str5 = admin2.getPassword();
        admin2.viewProfile();
        admin2.setVerified(false);
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
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "admin" + "'", str4, "admin");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "admin" + "'", str9, "admin");
    }

    @Test
    public void test23851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23851");
        model.Admin admin2 = new model.Admin("admin", "");
        admin2.setVerified(true);
        java.lang.String str5 = admin2.getAccountType();
        boolean boolean6 = admin2.isVerified();
        java.lang.String str7 = admin2.getPassword();
        java.lang.String str8 = admin2.getAccountType();
        java.lang.String str9 = admin2.getID();
        admin2.viewProfile();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "admin" + "'", str8, "admin");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "admin" + "'", str9, "admin");
    }

    @Test
    public void test23852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23852");
        model.Admin admin2 = new model.Admin("admin", "");
        admin2.setVerified(true);
        boolean boolean5 = admin2.isVerified();
        java.lang.String str6 = admin2.getPassword();
        double double7 = admin2.getHourlyRate();
        admin2.viewProfile();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test23853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23853");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        double double5 = admin2.getHourlyRate();
        admin2.setVerified(true);
        admin2.logout();
        admin2.setVerified(false);
        admin2.viewProfile();
        admin2.logout();
        double double13 = admin2.getHourlyRate();
        boolean boolean14 = admin2.isVerified();
        java.lang.String str15 = admin2.getID();
        java.lang.String str16 = admin2.getPassword();
        admin2.login("hi!", "admin");
        java.lang.Class<?> wildcardClass20 = admin2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "admin" + "'", str15, "admin");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test23854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23854");
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
        java.lang.String str15 = admin2.getAccountType();
        boolean boolean16 = admin2.isVerified();
        java.lang.String str17 = admin2.getEmail();
        boolean boolean18 = admin2.isVerified();
        admin2.setVerified(true);
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
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "admin" + "'", str15, "admin");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test23855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23855");
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
        admin2.setVerified(true);
        java.lang.String str18 = admin2.getPassword();
        java.lang.String str19 = admin2.getID();
        boolean boolean20 = admin2.isVerified();
        java.lang.String str21 = admin2.getEmail();
        boolean boolean22 = admin2.isVerified();
        admin2.viewProfile();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "admin" + "'", str13, "admin");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "admin" + "'", str19, "admin");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test23856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23856");
        model.Admin admin2 = new model.Admin("admin", "admin");
        boolean boolean3 = admin2.isVerified();
        admin2.login("hi!", "");
        admin2.viewProfile();
        java.lang.String str8 = admin2.getEmail();
        admin2.logout();
        admin2.login("admin", "");
        java.lang.String str13 = admin2.getEmail();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "admin" + "'", str8, "admin");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "admin" + "'", str13, "admin");
    }

    @Test
    public void test23857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23857");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        double double5 = admin2.getHourlyRate();
        double double6 = admin2.getHourlyRate();
        admin2.setVerified(true);
        java.lang.String str9 = admin2.getPassword();
        admin2.setVerified(false);
        admin2.viewProfile();
        admin2.viewProfile();
        boolean boolean14 = admin2.isVerified();
        admin2.login("hi!", "admin");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test23858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23858");
        model.Admin admin2 = new model.Admin("admin", "");
        admin2.logout();
        admin2.viewProfile();
        boolean boolean5 = admin2.isVerified();
        admin2.logout();
        java.lang.String str7 = admin2.getID();
        java.lang.String str8 = admin2.getAccountType();
        admin2.login("hi!", "hi!");
        admin2.logout();
        java.lang.String str13 = admin2.getAccountType();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "admin" + "'", str8, "admin");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "admin" + "'", str13, "admin");
    }

    @Test
    public void test23859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23859");
        model.Admin admin2 = new model.Admin("admin", "admin");
        admin2.viewProfile();
        java.lang.String str4 = admin2.getID();
        admin2.logout();
        java.lang.String str6 = admin2.getAccountType();
        admin2.viewProfile();
        admin2.setVerified(true);
        java.lang.String str10 = admin2.getAccountType();
        java.lang.String str11 = admin2.getPassword();
        java.lang.String str12 = admin2.getAccountType();
        java.lang.String str13 = admin2.getEmail();
        admin2.login("admin", "admin");
        admin2.login("hi!", "admin");
        java.lang.String str20 = admin2.getAccountType();
        admin2.setVerified(true);
        java.lang.String str23 = admin2.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "admin" + "'", str4, "admin");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "admin" + "'", str6, "admin");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "admin" + "'", str10, "admin");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "admin" + "'", str11, "admin");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "admin" + "'", str12, "admin");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "admin" + "'", str13, "admin");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "admin" + "'", str20, "admin");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "admin" + "'", str23, "admin");
    }

    @Test
    public void test23860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23860");
        model.Admin admin2 = new model.Admin("admin", "admin");
        boolean boolean3 = admin2.isVerified();
        admin2.login("hi!", "");
        double double7 = admin2.getHourlyRate();
        java.lang.String str8 = admin2.getID();
        double double9 = admin2.getHourlyRate();
        java.lang.String str10 = admin2.getID();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "admin" + "'", str8, "admin");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "admin" + "'", str10, "admin");
    }

    @Test
    public void test23861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23861");
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
        java.lang.String str15 = admin2.getPassword();
        double double16 = admin2.getHourlyRate();
        java.lang.String str17 = admin2.getEmail();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test23862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23862");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        admin2.logout();
        java.lang.String str5 = admin2.getAccountType();
        boolean boolean6 = admin2.isVerified();
        admin2.login("hi!", "admin");
        java.lang.String str10 = admin2.getAccountType();
        java.lang.String str11 = admin2.getEmail();
        admin2.logout();
        admin2.viewProfile();
        admin2.login("", "hi!");
        admin2.setVerified(false);
        java.lang.String str19 = admin2.getID();
        admin2.setVerified(true);
        admin2.viewProfile();
        room.Room room23 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.disableRoom(room23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "admin" + "'", str10, "admin");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "admin" + "'", str19, "admin");
    }

    @Test
    public void test23863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23863");
        model.Admin admin2 = new model.Admin("", "");
        java.lang.String str3 = admin2.getAccountType();
        admin2.setVerified(true);
        java.lang.String str6 = admin2.getAccountType();
        admin2.logout();
        double double8 = admin2.getHourlyRate();
        double double9 = admin2.getHourlyRate();
        boolean boolean10 = admin2.isVerified();
        admin2.logout();
        admin2.setVerified(false);
        boolean boolean14 = admin2.isVerified();
        admin2.viewProfile();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "admin" + "'", str6, "admin");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test23864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23864");
        model.Admin admin2 = new model.Admin("admin", "admin");
        admin2.viewProfile();
        admin2.viewProfile();
        admin2.login("hi!", "admin");
        java.lang.String str8 = admin2.getID();
        admin2.setVerified(false);
        admin2.logout();
        admin2.login("", "admin");
        java.lang.String str15 = admin2.getPassword();
        java.lang.String str16 = admin2.getEmail();
        admin2.logout();
        room.Room room18 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.enableRoom(room18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "admin" + "'", str8, "admin");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "admin" + "'", str15, "admin");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "admin" + "'", str16, "admin");
    }

    @Test
    public void test23865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23865");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getAccountType();
        boolean boolean4 = admin2.isVerified();
        boolean boolean5 = admin2.isVerified();
        admin2.logout();
        admin2.login("admin", "hi!");
        boolean boolean10 = admin2.isVerified();
        java.lang.Class<?> wildcardClass11 = admin2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test23866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23866");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        java.lang.String str4 = admin2.getPassword();
        java.lang.String str5 = admin2.getAccountType();
        java.lang.String str6 = admin2.getPassword();
        admin2.viewProfile();
        double double8 = admin2.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test23867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23867");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        double double5 = admin2.getHourlyRate();
        double double6 = admin2.getHourlyRate();
        admin2.setVerified(true);
        java.lang.String str9 = admin2.getID();
        admin2.logout();
        admin2.logout();
        admin2.login("hi!", "admin");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "admin" + "'", str9, "admin");
    }

    @Test
    public void test23868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23868");
        model.Admin admin2 = new model.Admin("admin", "");
        admin2.setVerified(true);
        java.lang.String str5 = admin2.getAccountType();
        java.lang.String str6 = admin2.getAccountType();
        admin2.logout();
        admin2.login("hi!", "");
        java.lang.String str11 = admin2.getID();
        java.lang.String str12 = admin2.getAccountType();
        java.lang.String str13 = admin2.getID();
        admin2.logout();
        java.lang.String str15 = admin2.getID();
        admin2.logout();
        double double17 = admin2.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "admin" + "'", str6, "admin");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "admin" + "'", str11, "admin");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "admin" + "'", str12, "admin");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "admin" + "'", str13, "admin");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "admin" + "'", str15, "admin");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
    }

    @Test
    public void test23869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23869");
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
        java.lang.String str21 = admin2.getEmail();
        java.lang.String str22 = admin2.getPassword();
        boolean boolean23 = admin2.isVerified();
        java.lang.String str24 = admin2.getPassword();
        admin2.viewProfile();
        admin2.login("admin", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
    }

    @Test
    public void test23870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23870");
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
        admin2.login("hi!", "");
        admin2.login("admin", "admin");
        admin2.login("", "");
        admin2.setVerified(false);
        double double25 = admin2.getHourlyRate();
        java.lang.String str26 = admin2.getEmail();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "admin" + "'", str8, "admin");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "admin" + "'", str9, "admin");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "admin" + "'", str11, "admin");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
    }

    @Test
    public void test23871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23871");
        model.Admin admin2 = new model.Admin("admin", "admin");
        admin2.viewProfile();
        java.lang.String str4 = admin2.getID();
        java.lang.String str5 = admin2.getPassword();
        double double6 = admin2.getHourlyRate();
        java.lang.String str7 = admin2.getEmail();
        admin2.logout();
        admin2.setVerified(false);
        java.lang.String str11 = admin2.getEmail();
        java.lang.String str12 = admin2.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "admin" + "'", str4, "admin");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "admin" + "'", str11, "admin");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "admin" + "'", str12, "admin");
    }

    @Test
    public void test23872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23872");
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
        admin2.logout();
        admin2.viewProfile();
        java.lang.String str20 = admin2.getPassword();
        java.lang.String str21 = admin2.getID();
        java.lang.String str22 = admin2.getPassword();
        java.lang.String str23 = admin2.getID();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "admin" + "'", str8, "admin");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "admin" + "'", str10, "admin");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "admin" + "'", str20, "admin");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "admin" + "'", str21, "admin");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "admin" + "'", str22, "admin");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "admin" + "'", str23, "admin");
    }

    @Test
    public void test23873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23873");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        admin2.logout();
        java.lang.String str5 = admin2.getAccountType();
        admin2.login("hi!", "");
        double double9 = admin2.getHourlyRate();
        admin2.login("", "hi!");
        boolean boolean13 = admin2.isVerified();
        admin2.logout();
        admin2.setVerified(false);
        admin2.viewProfile();
        boolean boolean18 = admin2.isVerified();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test23874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23874");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        admin2.logout();
        java.lang.String str5 = admin2.getAccountType();
        admin2.viewProfile();
        admin2.login("hi!", "admin");
        boolean boolean10 = admin2.isVerified();
        java.lang.String str11 = admin2.getEmail();
        admin2.logout();
        admin2.login("admin", "");
        admin2.setVerified(false);
        admin2.login("", "");
        java.lang.String str21 = admin2.getID();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "admin" + "'", str21, "admin");
    }

    @Test
    public void test23875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23875");
        model.Admin admin2 = new model.Admin("admin", "admin");
        admin2.login("admin", "admin");
        boolean boolean6 = admin2.isVerified();
        admin2.logout();
        java.lang.String str8 = admin2.getID();
        admin2.logout();
        java.lang.String str10 = admin2.getEmail();
        boolean boolean11 = admin2.isVerified();
        java.lang.String str12 = admin2.getEmail();
        boolean boolean13 = admin2.isVerified();
        java.lang.Class<?> wildcardClass14 = admin2.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "admin" + "'", str8, "admin");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "admin" + "'", str10, "admin");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "admin" + "'", str12, "admin");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test23876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23876");
        model.Admin admin2 = new model.Admin("", "");
        java.lang.String str3 = admin2.getAccountType();
        admin2.setVerified(true);
        double double6 = admin2.getHourlyRate();
        admin2.viewProfile();
        boolean boolean8 = admin2.isVerified();
        java.lang.String str9 = admin2.getID();
        java.lang.String str10 = admin2.getEmail();
        java.lang.String str11 = admin2.getID();
        java.lang.String str12 = admin2.getID();
        admin2.setVerified(true);
        boolean boolean15 = admin2.isVerified();
        admin2.setVerified(false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "admin" + "'", str9, "admin");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "admin" + "'", str11, "admin");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "admin" + "'", str12, "admin");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test23877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23877");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        admin2.logout();
        admin2.setVerified(false);
        java.lang.String str6 = admin2.getEmail();
        admin2.viewProfile();
        admin2.viewProfile();
        java.lang.String str9 = admin2.getID();
        admin2.login("hi!", "hi!");
        java.lang.String str13 = admin2.getPassword();
        admin2.logout();
        admin2.logout();
        java.lang.String str16 = admin2.getID();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "admin" + "'", str9, "admin");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "admin" + "'", str16, "admin");
    }

    @Test
    public void test23878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23878");
        model.Admin admin2 = new model.Admin("admin", "");
        double double3 = admin2.getHourlyRate();
        admin2.login("hi!", "hi!");
        double double7 = admin2.getHourlyRate();
        admin2.logout();
        java.lang.String str9 = admin2.getAccountType();
        java.lang.String str10 = admin2.getEmail();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "admin" + "'", str9, "admin");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "admin" + "'", str10, "admin");
    }

    @Test
    public void test23879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23879");
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
        boolean boolean18 = admin2.isVerified();
        double double19 = admin2.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "admin" + "'", str9, "admin");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
    }

    @Test
    public void test23880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23880");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        admin2.logout();
        java.lang.String str5 = admin2.getAccountType();
        admin2.viewProfile();
        admin2.logout();
        admin2.login("admin", "");
        admin2.setVerified(false);
        boolean boolean13 = admin2.isVerified();
        java.lang.String str14 = admin2.getPassword();
        admin2.setVerified(true);
        java.lang.String str17 = admin2.getPassword();
        java.lang.String str18 = admin2.getID();
        admin2.setVerified(true);
        admin2.logout();
        room.Room room22 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.disableRoom(room22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "admin" + "'", str18, "admin");
    }

    @Test
    public void test23881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23881");
        model.Admin admin2 = new model.Admin("admin", "");
        admin2.setVerified(true);
        java.lang.String str5 = admin2.getEmail();
        double double6 = admin2.getHourlyRate();
        admin2.viewProfile();
        admin2.viewProfile();
        admin2.viewProfile();
        admin2.setVerified(true);
        java.lang.String str12 = admin2.getID();
        double double13 = admin2.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "admin" + "'", str12, "admin");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test23882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23882");
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
        java.lang.String str21 = admin2.getAccountType();
        admin2.setVerified(true);
        admin2.login("admin", "");
        java.lang.String str27 = admin2.getEmail();
        java.lang.String str28 = admin2.getEmail();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "admin" + "'", str15, "admin");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "admin" + "'", str21, "admin");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
    }

    @Test
    public void test23883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23883");
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
        admin2.viewProfile();
        admin2.logout();
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
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "admin" + "'", str15, "admin");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test23884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23884");
        model.Admin admin2 = new model.Admin("admin", "admin");
        admin2.viewProfile();
        java.lang.String str4 = admin2.getPassword();
        admin2.login("", "");
        admin2.login("hi!", "hi!");
        admin2.logout();
        java.lang.String str12 = admin2.getID();
        java.lang.String str13 = admin2.getEmail();
        room.Room room14 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.addRoom(room14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.getRoomID()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "admin" + "'", str4, "admin");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "admin" + "'", str12, "admin");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "admin" + "'", str13, "admin");
    }

    @Test
    public void test23885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23885");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        admin2.logout();
        java.lang.String str5 = admin2.getAccountType();
        admin2.login("", "");
        admin2.setVerified(true);
        admin2.login("admin", "admin");
        java.lang.String str14 = admin2.getAccountType();
        java.lang.String str15 = admin2.getID();
        java.lang.String str16 = admin2.getAccountType();
        java.lang.String str17 = admin2.getPassword();
        boolean boolean18 = admin2.isVerified();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "admin" + "'", str14, "admin");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "admin" + "'", str15, "admin");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "admin" + "'", str16, "admin");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test23886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23886");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        java.lang.String str4 = admin2.getEmail();
        admin2.logout();
        admin2.logout();
        java.lang.String str7 = admin2.getPassword();
        admin2.login("admin", "admin");
        admin2.viewProfile();
        admin2.login("hi!", "admin");
        double double15 = admin2.getHourlyRate();
        java.lang.String str16 = admin2.getPassword();
        java.lang.String str17 = admin2.getAccountType();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "admin" + "'", str17, "admin");
    }

    @Test
    public void test23887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23887");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        java.lang.String str5 = admin2.getEmail();
        admin2.logout();
        java.lang.String str7 = admin2.getPassword();
        java.lang.String str8 = admin2.getAccountType();
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
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "admin" + "'", str8, "admin");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test23888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23888");
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
        admin2.setVerified(false);
        java.lang.String str23 = admin2.getEmail();
        admin2.logout();
        admin2.setVerified(false);
        double double27 = admin2.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.0d + "'", double27 == 0.0d);
    }

    @Test
    public void test23889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23889");
        model.Admin admin2 = new model.Admin("", "");
        java.lang.String str3 = admin2.getAccountType();
        java.lang.String str4 = admin2.getEmail();
        java.lang.String str5 = admin2.getID();
        double double6 = admin2.getHourlyRate();
        java.lang.String str7 = admin2.getEmail();
        admin2.login("", "");
        double double11 = admin2.getHourlyRate();
        double double12 = admin2.getHourlyRate();
        boolean boolean13 = admin2.isVerified();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test23890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23890");
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
        boolean boolean14 = admin2.isVerified();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "admin" + "'", str13, "admin");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test23891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23891");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        double double5 = admin2.getHourlyRate();
        double double6 = admin2.getHourlyRate();
        admin2.setVerified(true);
        java.lang.String str9 = admin2.getID();
        java.lang.String str10 = admin2.getEmail();
        admin2.logout();
        java.lang.String str12 = admin2.getID();
        admin2.login("", "admin");
        admin2.login("admin", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "admin" + "'", str9, "admin");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "admin" + "'", str12, "admin");
    }

    @Test
    public void test23892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23892");
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
        admin2.logout();
        java.lang.String str21 = admin2.getPassword();
        java.lang.String str22 = admin2.getPassword();
        admin2.login("admin", "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "admin" + "'", str4, "admin");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "admin" + "'", str19, "admin");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "admin" + "'", str21, "admin");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "admin" + "'", str22, "admin");
    }

    @Test
    public void test23893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23893");
        model.Admin admin2 = new model.Admin("admin", "admin");
        admin2.login("admin", "admin");
        boolean boolean6 = admin2.isVerified();
        admin2.logout();
        java.lang.String str8 = admin2.getID();
        admin2.logout();
        admin2.viewProfile();
        java.lang.String str11 = admin2.getPassword();
        admin2.logout();
        admin2.setVerified(true);
        boolean boolean15 = admin2.isVerified();
        java.lang.String str16 = admin2.getEmail();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "admin" + "'", str8, "admin");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "admin" + "'", str11, "admin");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "admin" + "'", str16, "admin");
    }

    @Test
    public void test23894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23894");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        java.lang.String str4 = admin2.getEmail();
        admin2.logout();
        admin2.logout();
        java.lang.String str7 = admin2.getPassword();
        java.lang.String str8 = admin2.getPassword();
        admin2.viewProfile();
        java.lang.String str10 = admin2.getEmail();
        admin2.login("hi!", "hi!");
        admin2.login("admin", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test23895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23895");
        model.Admin admin2 = new model.Admin("admin", "");
        admin2.logout();
        admin2.viewProfile();
        boolean boolean5 = admin2.isVerified();
        java.lang.String str6 = admin2.getAccountType();
        java.lang.String str7 = admin2.getAccountType();
        boolean boolean8 = admin2.isVerified();
        java.lang.String str9 = admin2.getEmail();
        admin2.setVerified(true);
        boolean boolean12 = admin2.isVerified();
        double double13 = admin2.getHourlyRate();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "admin" + "'", str6, "admin");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "admin" + "'", str9, "admin");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test23896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23896");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        admin2.logout();
        java.lang.String str5 = admin2.getAccountType();
        boolean boolean6 = admin2.isVerified();
        java.lang.String str7 = admin2.getAccountType();
        admin2.logout();
        double double9 = admin2.getHourlyRate();
        admin2.logout();
        java.lang.String str11 = admin2.getID();
        boolean boolean12 = admin2.isVerified();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "admin" + "'", str11, "admin");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test23897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23897");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        double double5 = admin2.getHourlyRate();
        admin2.setVerified(true);
        admin2.setVerified(false);
        admin2.logout();
        admin2.logout();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test23898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23898");
        model.Admin admin2 = new model.Admin("", "");
        java.lang.String str3 = admin2.getAccountType();
        java.lang.String str4 = admin2.getEmail();
        java.lang.String str5 = admin2.getID();
        double double6 = admin2.getHourlyRate();
        admin2.viewProfile();
        java.lang.String str8 = admin2.getID();
        admin2.viewProfile();
        java.lang.String str10 = admin2.getID();
        java.lang.String str11 = admin2.getEmail();
        admin2.setVerified(true);
        room.Room room14 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.addRoom(room14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.getRoomID()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "admin" + "'", str8, "admin");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "admin" + "'", str10, "admin");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test23899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23899");
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
        java.lang.String str16 = admin2.getID();
        java.lang.String str17 = admin2.getID();
        boolean boolean18 = admin2.isVerified();
        java.lang.String str19 = admin2.getID();
        admin2.logout();
        admin2.login("", "");
        java.lang.Class<?> wildcardClass24 = admin2.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "admin" + "'", str16, "admin");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "admin" + "'", str17, "admin");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "admin" + "'", str19, "admin");
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test23900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23900");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        double double5 = admin2.getHourlyRate();
        java.lang.String str6 = admin2.getPassword();
        admin2.login("", "admin");
        admin2.logout();
        boolean boolean11 = admin2.isVerified();
        java.lang.String str12 = admin2.getID();
        double double13 = admin2.getHourlyRate();
        java.lang.String str14 = admin2.getID();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "admin" + "'", str12, "admin");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "admin" + "'", str14, "admin");
    }

    @Test
    public void test23901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23901");
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
        admin2.login("hi!", "");
        java.lang.String str23 = admin2.getID();
        boolean boolean24 = admin2.isVerified();
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
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "admin" + "'", str23, "admin");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test23902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23902");
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
        admin2.setVerified(false);
        admin2.logout();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test23903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23903");
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
        boolean boolean13 = admin2.isVerified();
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
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test23904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23904");
        model.Admin admin2 = new model.Admin("admin", "hi!");
        java.lang.String str3 = admin2.getPassword();
        java.lang.String str4 = admin2.getEmail();
        java.lang.String str5 = admin2.getEmail();
        admin2.viewProfile();
        java.lang.String str7 = admin2.getPassword();
        java.lang.String str8 = admin2.getEmail();
        admin2.viewProfile();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "admin" + "'", str4, "admin");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "admin" + "'", str8, "admin");
    }

    @Test
    public void test23905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23905");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        double double5 = admin2.getHourlyRate();
        admin2.setVerified(true);
        admin2.logout();
        java.lang.String str9 = admin2.getAccountType();
        java.lang.String str10 = admin2.getAccountType();
        double double11 = admin2.getHourlyRate();
        java.lang.String str12 = admin2.getPassword();
        admin2.logout();
        java.lang.String str14 = admin2.getEmail();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "admin" + "'", str9, "admin");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "admin" + "'", str10, "admin");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test23906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23906");
        model.Admin admin2 = new model.Admin("admin", "admin");
        admin2.viewProfile();
        java.lang.String str4 = admin2.getID();
        java.lang.String str5 = admin2.getPassword();
        java.lang.String str6 = admin2.getAccountType();
        java.lang.String str7 = admin2.getAccountType();
        boolean boolean8 = admin2.isVerified();
        admin2.login("", "hi!");
        double double12 = admin2.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "admin" + "'", str4, "admin");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "admin" + "'", str6, "admin");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test23907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23907");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        double double5 = admin2.getHourlyRate();
        boolean boolean6 = admin2.isVerified();
        boolean boolean7 = admin2.isVerified();
        java.lang.String str8 = admin2.getEmail();
        java.lang.String str9 = admin2.getID();
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
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "admin" + "'", str9, "admin");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test23908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23908");
        model.Admin admin2 = new model.Admin("admin", "admin");
        admin2.viewProfile();
        java.lang.String str4 = admin2.getID();
        java.lang.String str5 = admin2.getPassword();
        double double6 = admin2.getHourlyRate();
        java.lang.String str7 = admin2.getEmail();
        admin2.logout();
        admin2.setVerified(false);
        double double11 = admin2.getHourlyRate();
        java.lang.String str12 = admin2.getID();
        admin2.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "admin" + "'", str4, "admin");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "admin" + "'", str12, "admin");
    }

    @Test
    public void test23909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23909");
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
        java.lang.String str17 = admin2.getAccountType();
        java.lang.String str18 = admin2.getID();
        java.lang.String str19 = admin2.getPassword();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "admin" + "'", str6, "admin");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "admin" + "'", str11, "admin");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "admin" + "'", str14, "admin");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "admin" + "'", str17, "admin");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "admin" + "'", str18, "admin");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test23910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23910");
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
        java.lang.String str17 = admin2.getAccountType();
        java.lang.String str18 = admin2.getEmail();
        admin2.setVerified(true);
        admin2.logout();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "admin" + "'", str12, "admin");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "admin" + "'", str17, "admin");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test23911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23911");
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
        admin2.viewProfile();
        double double14 = admin2.getHourlyRate();
        boolean boolean15 = admin2.isVerified();
        double double16 = admin2.getHourlyRate();
        java.lang.String str17 = admin2.getID();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "admin" + "'", str10, "admin");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "admin" + "'", str17, "admin");
    }

    @Test
    public void test23912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23912");
        model.Admin admin2 = new model.Admin("", "");
        java.lang.String str3 = admin2.getAccountType();
        java.lang.String str4 = admin2.getEmail();
        java.lang.String str5 = admin2.getID();
        admin2.login("", "hi!");
        admin2.logout();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
    }

    @Test
    public void test23913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23913");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        java.lang.String str4 = admin2.getAccountType();
        java.lang.String str5 = admin2.getPassword();
        admin2.logout();
        java.lang.String str7 = admin2.getAccountType();
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
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "admin" + "'", str4, "admin");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test23914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23914");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        admin2.logout();
        java.lang.String str5 = admin2.getAccountType();
        boolean boolean6 = admin2.isVerified();
        java.lang.String str7 = admin2.getPassword();
        java.lang.String str8 = admin2.getPassword();
        java.lang.String str9 = admin2.getPassword();
        java.lang.Class<?> wildcardClass10 = admin2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test23915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23915");
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
        admin2.login("", "hi!");
        java.lang.String str22 = admin2.getEmail();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "admin" + "'", str13, "admin");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
    }

    @Test
    public void test23916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23916");
        model.Admin admin2 = new model.Admin("admin", "admin");
        boolean boolean3 = admin2.isVerified();
        admin2.login("hi!", "");
        double double7 = admin2.getHourlyRate();
        admin2.viewProfile();
        double double9 = admin2.getHourlyRate();
        java.lang.String str10 = admin2.getPassword();
        java.lang.String str11 = admin2.getEmail();
        admin2.login("hi!", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "admin" + "'", str10, "admin");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "admin" + "'", str11, "admin");
    }

    @Test
    public void test23917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23917");
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
        java.lang.String str13 = admin2.getAccountType();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "admin" + "'", str13, "admin");
    }

    @Test
    public void test23918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23918");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        double double5 = admin2.getHourlyRate();
        double double6 = admin2.getHourlyRate();
        admin2.setVerified(true);
        java.lang.String str9 = admin2.getPassword();
        admin2.logout();
        admin2.setVerified(true);
        java.lang.String str13 = admin2.getAccountType();
        java.lang.String str14 = admin2.getAccountType();
        admin2.setVerified(true);
        java.lang.String str17 = admin2.getID();
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
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "admin" + "'", str13, "admin");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "admin" + "'", str14, "admin");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "admin" + "'", str17, "admin");
    }

    @Test
    public void test23919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23919");
        model.Admin admin2 = new model.Admin("admin", "admin");
        admin2.viewProfile();
        admin2.viewProfile();
        admin2.login("hi!", "admin");
        java.lang.String str8 = admin2.getID();
        admin2.setVerified(false);
        admin2.logout();
        boolean boolean12 = admin2.isVerified();
        java.lang.String str13 = admin2.getPassword();
        admin2.viewProfile();
        admin2.setVerified(true);
        room.Room room17 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.addRoom(room17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.getRoomID()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "admin" + "'", str8, "admin");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "admin" + "'", str13, "admin");
    }

    @Test
    public void test23920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23920");
        model.Admin admin2 = new model.Admin("", "");
        java.lang.String str3 = admin2.getAccountType();
        java.lang.String str4 = admin2.getEmail();
        java.lang.String str5 = admin2.getID();
        double double6 = admin2.getHourlyRate();
        java.lang.String str7 = admin2.getEmail();
        admin2.login("", "");
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
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "admin" + "'", str12, "admin");
    }

    @Test
    public void test23921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23921");
        model.Admin admin2 = new model.Admin("", "");
        java.lang.String str3 = admin2.getAccountType();
        java.lang.String str4 = admin2.getEmail();
        admin2.login("hi!", "");
        java.lang.String str8 = admin2.getAccountType();
        java.lang.String str9 = admin2.getID();
        boolean boolean10 = admin2.isVerified();
        java.lang.String str11 = admin2.getAccountType();
        admin2.login("", "");
        admin2.setVerified(true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "admin" + "'", str8, "admin");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "admin" + "'", str9, "admin");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "admin" + "'", str11, "admin");
    }

    @Test
    public void test23922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23922");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        java.lang.String str4 = admin2.getPassword();
        java.lang.String str5 = admin2.getAccountType();
        admin2.viewProfile();
        double double7 = admin2.getHourlyRate();
        java.lang.String str8 = admin2.getID();
        java.lang.String str9 = admin2.getAccountType();
        admin2.logout();
        java.lang.String str11 = admin2.getPassword();
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
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "admin" + "'", str8, "admin");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "admin" + "'", str9, "admin");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test23923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23923");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        admin2.logout();
        java.lang.String str5 = admin2.getAccountType();
        boolean boolean6 = admin2.isVerified();
        java.lang.String str7 = admin2.getID();
        double double8 = admin2.getHourlyRate();
        admin2.login("admin", "hi!");
        admin2.logout();
        admin2.setVerified(true);
        admin2.login("admin", "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test23924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23924");
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
        admin2.setVerified(false);
        double double22 = admin2.getHourlyRate();
        java.lang.String str23 = admin2.getPassword();
        double double24 = admin2.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "admin" + "'", str4, "admin");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "admin" + "'", str8, "admin");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "admin" + "'", str9, "admin");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "admin" + "'", str13, "admin");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "admin" + "'", str17, "admin");
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "admin" + "'", str23, "admin");
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
    }

    @Test
    public void test23925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23925");
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
        admin2.logout();
        double double15 = admin2.getHourlyRate();
        java.lang.String str16 = admin2.getID();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "admin" + "'", str11, "admin");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "admin" + "'", str13, "admin");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "admin" + "'", str16, "admin");
    }

    @Test
    public void test23926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23926");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        java.lang.String str5 = admin2.getID();
        admin2.setVerified(false);
        java.lang.String str8 = admin2.getPassword();
        admin2.logout();
        java.lang.String str10 = admin2.getAccountType();
        double double11 = admin2.getHourlyRate();
        admin2.login("", "hi!");
        double double15 = admin2.getHourlyRate();
        java.lang.String str16 = admin2.getID();
        admin2.logout();
        admin2.viewProfile();
        double double19 = admin2.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "admin" + "'", str10, "admin");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "admin" + "'", str16, "admin");
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
    }

    @Test
    public void test23927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23927");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        java.lang.String str4 = admin2.getEmail();
        java.lang.String str5 = admin2.getPassword();
        admin2.viewProfile();
        admin2.logout();
        java.lang.String str8 = admin2.getPassword();
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
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test23928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23928");
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
        java.lang.Class<?> wildcardClass20 = admin2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "admin" + "'", str10, "admin");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "admin" + "'", str18, "admin");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test23929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23929");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        double double5 = admin2.getHourlyRate();
        boolean boolean6 = admin2.isVerified();
        boolean boolean7 = admin2.isVerified();
        java.lang.String str8 = admin2.getEmail();
        admin2.logout();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test23930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23930");
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
        java.lang.String str18 = admin2.getPassword();
        admin2.logout();
        boolean boolean20 = admin2.isVerified();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "admin" + "'", str8, "admin");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "admin" + "'", str10, "admin");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "admin" + "'", str18, "admin");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test23931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23931");
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
        java.lang.String str16 = admin2.getEmail();
        admin2.viewProfile();
        java.lang.String str18 = admin2.getID();
        java.lang.String str19 = admin2.getEmail();
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
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "admin" + "'", str18, "admin");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test23932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23932");
        model.Admin admin2 = new model.Admin("admin", "admin");
        admin2.viewProfile();
        java.lang.String str4 = admin2.getID();
        java.lang.String str5 = admin2.getAccountType();
        admin2.viewProfile();
        java.lang.String str7 = admin2.getPassword();
        admin2.setVerified(true);
        java.lang.String str10 = admin2.getAccountType();
        java.lang.Class<?> wildcardClass11 = admin2.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "admin" + "'", str4, "admin");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "admin" + "'", str10, "admin");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test23933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23933");
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
        java.lang.String str15 = admin2.getEmail();
        admin2.login("", "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test23934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23934");
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
        admin2.setVerified(true);
        admin2.viewProfile();
        java.lang.String str22 = admin2.getEmail();
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
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
    }

    @Test
    public void test23935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23935");
        model.Admin admin2 = new model.Admin("", "");
        java.lang.String str3 = admin2.getAccountType();
        java.lang.String str4 = admin2.getEmail();
        double double5 = admin2.getHourlyRate();
        admin2.setVerified(true);
        admin2.logout();
        admin2.viewProfile();
        admin2.login("", "");
        admin2.viewProfile();
        admin2.logout();
        admin2.setVerified(false);
        java.lang.String str17 = admin2.getPassword();
        admin2.viewProfile();
        java.lang.String str19 = admin2.getID();
        admin2.viewProfile();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "admin" + "'", str19, "admin");
    }

    @Test
    public void test23936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23936");
        model.Admin admin2 = new model.Admin("admin", "admin");
        admin2.login("admin", "admin");
        boolean boolean6 = admin2.isVerified();
        admin2.logout();
        java.lang.String str8 = admin2.getID();
        admin2.setVerified(true);
        admin2.setVerified(true);
        double double13 = admin2.getHourlyRate();
        double double14 = admin2.getHourlyRate();
        java.lang.String str15 = admin2.getPassword();
        admin2.logout();
        boolean boolean17 = admin2.isVerified();
        java.lang.String str18 = admin2.getPassword();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "admin" + "'", str8, "admin");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "admin" + "'", str15, "admin");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "admin" + "'", str18, "admin");
    }

    @Test
    public void test23937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23937");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        double double5 = admin2.getHourlyRate();
        admin2.setVerified(true);
        admin2.logout();
        admin2.setVerified(false);
        admin2.viewProfile();
        admin2.logout();
        double double13 = admin2.getHourlyRate();
        boolean boolean14 = admin2.isVerified();
        admin2.setVerified(false);
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
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test23938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23938");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        java.lang.String str5 = admin2.getID();
        java.lang.String str6 = admin2.getID();
        java.lang.String str7 = admin2.getAccountType();
        admin2.logout();
        java.lang.String str9 = admin2.getEmail();
        java.lang.String str10 = admin2.getPassword();
        admin2.logout();
        admin2.login("hi!", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "admin" + "'", str6, "admin");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test23939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23939");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        admin2.logout();
        java.lang.String str5 = admin2.getAccountType();
        admin2.login("", "");
        java.lang.String str9 = admin2.getEmail();
        admin2.login("", "");
        admin2.setVerified(false);
        java.lang.String str15 = admin2.getEmail();
        java.lang.String str16 = admin2.getID();
        boolean boolean17 = admin2.isVerified();
        admin2.setVerified(false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "admin" + "'", str16, "admin");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test23940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23940");
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
        admin2.setVerified(true);
        admin2.viewProfile();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "admin" + "'", str12, "admin");
    }

    @Test
    public void test23941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23941");
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
        java.lang.String str15 = admin2.getAccountType();
        admin2.login("hi!", "admin");
        boolean boolean19 = admin2.isVerified();
        admin2.logout();
        double double21 = admin2.getHourlyRate();
        java.lang.String str22 = admin2.getID();
        admin2.logout();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "admin" + "'", str13, "admin");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "admin" + "'", str15, "admin");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "admin" + "'", str22, "admin");
    }

    @Test
    public void test23942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23942");
        model.Admin admin2 = new model.Admin("admin", "admin");
        admin2.viewProfile();
        java.lang.String str4 = admin2.getPassword();
        double double5 = admin2.getHourlyRate();
        java.lang.String str6 = admin2.getAccountType();
        boolean boolean7 = admin2.isVerified();
        double double8 = admin2.getHourlyRate();
        admin2.setVerified(true);
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
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "admin" + "'", str6, "admin");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "admin" + "'", str11, "admin");
    }

    @Test
    public void test23943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23943");
        model.Admin admin2 = new model.Admin("", "");
        java.lang.String str3 = admin2.getAccountType();
        java.lang.String str4 = admin2.getEmail();
        java.lang.String str5 = admin2.getID();
        double double6 = admin2.getHourlyRate();
        java.lang.String str7 = admin2.getAccountType();
        admin2.setVerified(false);
        admin2.viewProfile();
        admin2.login("hi!", "hi!");
        java.lang.String str14 = admin2.getID();
        java.lang.String str15 = admin2.getID();
        room.Room room16 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.disableRoom(room16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "admin" + "'", str14, "admin");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "admin" + "'", str15, "admin");
    }

    @Test
    public void test23944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23944");
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
        double double21 = admin2.getHourlyRate();
        java.lang.String str22 = admin2.getAccountType();
        java.lang.String str23 = admin2.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "admin" + "'", str4, "admin");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "admin" + "'", str20, "admin");
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "admin" + "'", str22, "admin");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "admin" + "'", str23, "admin");
    }

    @Test
    public void test23945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23945");
        model.Admin admin2 = new model.Admin("admin", "admin");
        admin2.viewProfile();
        java.lang.String str4 = admin2.getPassword();
        admin2.login("", "");
        java.lang.String str8 = admin2.getEmail();
        boolean boolean9 = admin2.isVerified();
        java.lang.String str10 = admin2.getPassword();
        admin2.logout();
        java.lang.String str12 = admin2.getID();
        java.lang.String str13 = admin2.getAccountType();
        java.lang.String str14 = admin2.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "admin" + "'", str4, "admin");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "admin" + "'", str8, "admin");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "admin" + "'", str10, "admin");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "admin" + "'", str12, "admin");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "admin" + "'", str13, "admin");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "admin" + "'", str14, "admin");
    }

    @Test
    public void test23946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23946");
        model.Admin admin2 = new model.Admin("", "");
        java.lang.String str3 = admin2.getAccountType();
        admin2.setVerified(true);
        java.lang.String str6 = admin2.getAccountType();
        admin2.logout();
        double double8 = admin2.getHourlyRate();
        java.lang.String str9 = admin2.getEmail();
        java.lang.String str10 = admin2.getAccountType();
        admin2.login("admin", "hi!");
        boolean boolean14 = admin2.isVerified();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "admin" + "'", str6, "admin");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "admin" + "'", str10, "admin");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test23947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23947");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getAccountType();
        admin2.setVerified(false);
        double double6 = admin2.getHourlyRate();
        double double7 = admin2.getHourlyRate();
        admin2.viewProfile();
        java.lang.String str9 = admin2.getPassword();
        double double10 = admin2.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test23948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23948");
        model.Admin admin2 = new model.Admin("", "");
        java.lang.String str3 = admin2.getAccountType();
        java.lang.String str4 = admin2.getEmail();
        admin2.login("hi!", "");
        java.lang.String str8 = admin2.getAccountType();
        java.lang.String str9 = admin2.getEmail();
        double double10 = admin2.getHourlyRate();
        java.lang.String str11 = admin2.getEmail();
        boolean boolean12 = admin2.isVerified();
        admin2.logout();
        double double14 = admin2.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "admin" + "'", str8, "admin");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test23949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23949");
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
        admin2.login("admin", "");
        admin2.login("admin", "admin");
        admin2.logout();
        java.lang.String str24 = admin2.getAccountType();
        java.lang.String str25 = admin2.getPassword();
        admin2.viewProfile();
        java.lang.Class<?> wildcardClass27 = admin2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "admin" + "'", str15, "admin");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "admin" + "'", str24, "admin");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test23950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23950");
        model.Admin admin2 = new model.Admin("", "");
        java.lang.String str3 = admin2.getAccountType();
        admin2.setVerified(true);
        double double6 = admin2.getHourlyRate();
        admin2.login("", "admin");
        double double10 = admin2.getHourlyRate();
        boolean boolean11 = admin2.isVerified();
        admin2.setVerified(false);
        java.lang.String str14 = admin2.getEmail();
        boolean boolean15 = admin2.isVerified();
        admin2.login("hi!", "admin");
        java.lang.String str19 = admin2.getPassword();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test23951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23951");
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
        double double18 = admin2.getHourlyRate();
        double double19 = admin2.getHourlyRate();
        java.lang.String str20 = admin2.getID();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "admin" + "'", str15, "admin");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "admin" + "'", str16, "admin");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "admin" + "'", str20, "admin");
    }

    @Test
    public void test23952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23952");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        admin2.logout();
        java.lang.String str5 = admin2.getAccountType();
        admin2.login("", "");
        java.lang.String str9 = admin2.getPassword();
        java.lang.String str10 = admin2.getID();
        admin2.login("hi!", "");
        admin2.viewProfile();
        admin2.logout();
        java.lang.String str16 = admin2.getEmail();
        admin2.login("admin", "");
        admin2.viewProfile();
        java.lang.String str21 = admin2.getEmail();
        double double22 = admin2.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "admin" + "'", str10, "admin");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
    }

    @Test
    public void test23953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23953");
        model.Admin admin2 = new model.Admin("admin", "admin");
        admin2.viewProfile();
        java.lang.String str4 = admin2.getID();
        admin2.logout();
        java.lang.String str6 = admin2.getAccountType();
        admin2.viewProfile();
        admin2.setVerified(true);
        boolean boolean10 = admin2.isVerified();
        java.lang.String str11 = admin2.getEmail();
        boolean boolean12 = admin2.isVerified();
        admin2.logout();
        admin2.login("hi!", "admin");
        admin2.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "admin" + "'", str4, "admin");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "admin" + "'", str6, "admin");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "admin" + "'", str11, "admin");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test23954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23954");
        model.Admin admin2 = new model.Admin("admin", "admin");
        boolean boolean3 = admin2.isVerified();
        admin2.login("hi!", "");
        java.lang.String str7 = admin2.getEmail();
        admin2.viewProfile();
        double double9 = admin2.getHourlyRate();
        admin2.login("", "admin");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test23955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23955");
        model.Admin admin2 = new model.Admin("admin", "admin");
        admin2.viewProfile();
        admin2.viewProfile();
        admin2.login("hi!", "admin");
        java.lang.String str8 = admin2.getID();
        java.lang.String str9 = admin2.getAccountType();
        java.lang.String str10 = admin2.getID();
        admin2.logout();
        double double12 = admin2.getHourlyRate();
        java.lang.String str13 = admin2.getID();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "admin" + "'", str8, "admin");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "admin" + "'", str9, "admin");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "admin" + "'", str10, "admin");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "admin" + "'", str13, "admin");
    }

    @Test
    public void test23956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23956");
        model.Admin admin2 = new model.Admin("admin", "admin");
        admin2.viewProfile();
        java.lang.String str4 = admin2.getPassword();
        admin2.login("", "");
        boolean boolean8 = admin2.isVerified();
        admin2.setVerified(false);
        admin2.viewProfile();
        admin2.login("admin", "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "admin" + "'", str4, "admin");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test23957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23957");
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
        admin2.viewProfile();
        admin2.viewProfile();
        java.lang.String str18 = admin2.getAccountType();
        admin2.login("hi!", "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "admin" + "'", str13, "admin");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "admin" + "'", str14, "admin");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "admin" + "'", str18, "admin");
    }

    @Test
    public void test23958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23958");
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
        boolean boolean13 = admin2.isVerified();
        admin2.logout();
        java.lang.String str15 = admin2.getPassword();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "admin" + "'", str10, "admin");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test23959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23959");
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
        admin2.login("", "hi!");
        admin2.logout();
        java.lang.String str21 = admin2.getEmail();
        admin2.login("hi!", "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
    }

    @Test
    public void test23960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23960");
        model.Admin admin2 = new model.Admin("admin", "admin");
        admin2.viewProfile();
        java.lang.String str4 = admin2.getID();
        java.lang.String str5 = admin2.getAccountType();
        java.lang.String str6 = admin2.getEmail();
        double double7 = admin2.getHourlyRate();
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
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "admin" + "'", str4, "admin");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "admin" + "'", str6, "admin");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "admin" + "'", str8, "admin");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "admin" + "'", str9, "admin");
    }

    @Test
    public void test23961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23961");
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
        admin2.viewProfile();
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
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "admin" + "'", str10, "admin");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "admin" + "'", str16, "admin");
    }

    @Test
    public void test23962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23962");
        model.Admin admin2 = new model.Admin("", "admin");
        java.lang.String str3 = admin2.getEmail();
        java.lang.String str4 = admin2.getPassword();
        double double5 = admin2.getHourlyRate();
        java.lang.String str6 = admin2.getID();
        java.lang.Class<?> wildcardClass7 = admin2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "admin" + "'", str4, "admin");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "admin" + "'", str6, "admin");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test23963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23963");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        java.lang.String str5 = admin2.getEmail();
        java.lang.String str6 = admin2.getEmail();
        admin2.setVerified(false);
        boolean boolean9 = admin2.isVerified();
        admin2.logout();
        admin2.setVerified(false);
        admin2.viewProfile();
        double double14 = admin2.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test23964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23964");
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
        java.lang.String str20 = admin2.getID();
        admin2.viewProfile();
        room.Room room22 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.addRoom(room22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.getRoomID()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "admin" + "'", str4, "admin");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "admin" + "'", str20, "admin");
    }

    @Test
    public void test23965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23965");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getAccountType();
        boolean boolean4 = admin2.isVerified();
        java.lang.String str5 = admin2.getPassword();
        java.lang.String str6 = admin2.getID();
        java.lang.String str7 = admin2.getID();
        admin2.logout();
        java.lang.String str9 = admin2.getEmail();
        boolean boolean10 = admin2.isVerified();
        boolean boolean11 = admin2.isVerified();
        admin2.login("admin", "");
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
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "admin" + "'", str6, "admin");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test23966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23966");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        admin2.logout();
        java.lang.String str5 = admin2.getAccountType();
        boolean boolean6 = admin2.isVerified();
        java.lang.String str7 = admin2.getID();
        admin2.logout();
        double double9 = admin2.getHourlyRate();
        java.lang.String str10 = admin2.getEmail();
        admin2.logout();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test23967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23967");
        model.Admin admin2 = new model.Admin("hi!", "admin");
        java.lang.String str3 = admin2.getID();
        admin2.setVerified(true);
        admin2.logout();
        java.lang.String str7 = admin2.getAccountType();
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
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "admin" + "'", str8, "admin");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test23968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23968");
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
        admin2.setVerified(true);
        admin2.setVerified(false);
        java.lang.String str21 = admin2.getAccountType();
        admin2.login("", "");
        java.lang.String str25 = admin2.getPassword();
        admin2.setVerified(false);
        admin2.setVerified(true);
        admin2.viewProfile();
        admin2.login("hi!", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "admin" + "'", str15, "admin");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "admin" + "'", str21, "admin");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
    }

    @Test
    public void test23969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23969");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        java.lang.String str4 = admin2.getAccountType();
        java.lang.String str5 = admin2.getID();
        java.lang.String str6 = admin2.getEmail();
        java.lang.String str7 = admin2.getPassword();
        admin2.login("hi!", "hi!");
        admin2.setVerified(false);
        admin2.logout();
        java.lang.String str14 = admin2.getEmail();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "admin" + "'", str4, "admin");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test23970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23970");
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
        admin2.logout();
        double double19 = admin2.getHourlyRate();
        admin2.logout();
        double double21 = admin2.getHourlyRate();
        room.Room room22 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.addRoom(room22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.getRoomID()\" because \"room\" is null");
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
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
    }

    @Test
    public void test23971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23971");
        model.Admin admin2 = new model.Admin("admin", "hi!");
        java.lang.String str3 = admin2.getPassword();
        admin2.login("admin", "");
        java.lang.String str7 = admin2.getEmail();
        java.lang.String str8 = admin2.getAccountType();
        java.lang.String str9 = admin2.getAccountType();
        admin2.login("", "hi!");
        double double13 = admin2.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "admin" + "'", str8, "admin");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "admin" + "'", str9, "admin");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test23972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23972");
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
        admin2.login("admin", "admin");
        java.lang.String str17 = admin2.getID();
        admin2.viewProfile();
        double double19 = admin2.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "admin" + "'", str17, "admin");
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
    }

    @Test
    public void test23973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23973");
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
        java.lang.String str14 = admin2.getID();
        java.lang.String str15 = admin2.getEmail();
        admin2.login("", "admin");
        admin2.login("", "hi!");
        java.lang.String str22 = admin2.getEmail();
        java.lang.String str23 = admin2.getID();
        boolean boolean24 = admin2.isVerified();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "admin" + "'", str9, "admin");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "admin" + "'", str10, "admin");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "admin" + "'", str14, "admin");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "admin" + "'", str23, "admin");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test23974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23974");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        double double5 = admin2.getHourlyRate();
        admin2.setVerified(true);
        double double8 = admin2.getHourlyRate();
        double double9 = admin2.getHourlyRate();
        java.lang.String str10 = admin2.getPassword();
        admin2.logout();
        java.lang.String str12 = admin2.getID();
        admin2.login("", "admin");
        java.lang.String str16 = admin2.getID();
        admin2.setVerified(false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "admin" + "'", str12, "admin");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "admin" + "'", str16, "admin");
    }

    @Test
    public void test23975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23975");
        model.Admin admin2 = new model.Admin("admin", "");
        admin2.setVerified(true);
        admin2.logout();
        admin2.login("admin", "hi!");
        java.lang.String str9 = admin2.getPassword();
        java.lang.String str10 = admin2.getID();
        java.lang.String str11 = admin2.getID();
        boolean boolean12 = admin2.isVerified();
        admin2.setVerified(false);
        admin2.viewProfile();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "admin" + "'", str10, "admin");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "admin" + "'", str11, "admin");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test23976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23976");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        java.lang.String str4 = admin2.getEmail();
        admin2.logout();
        admin2.logout();
        admin2.login("", "");
        admin2.logout();
        boolean boolean11 = admin2.isVerified();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test23977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23977");
        model.Admin admin2 = new model.Admin("admin", "admin");
        admin2.viewProfile();
        java.lang.String str4 = admin2.getPassword();
        admin2.login("", "");
        boolean boolean8 = admin2.isVerified();
        admin2.login("admin", "hi!");
        admin2.logout();
        admin2.login("hi!", "hi!");
        java.lang.String str16 = admin2.getAccountType();
        java.lang.String str17 = admin2.getAccountType();
        java.lang.String str18 = admin2.getID();
        double double19 = admin2.getHourlyRate();
        admin2.setVerified(true);
        java.lang.String str22 = admin2.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "admin" + "'", str4, "admin");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "admin" + "'", str16, "admin");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "admin" + "'", str17, "admin");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "admin" + "'", str18, "admin");
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "admin" + "'", str22, "admin");
    }

    @Test
    public void test23978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23978");
        model.Admin admin2 = new model.Admin("admin", "admin");
        admin2.viewProfile();
        java.lang.String str4 = admin2.getPassword();
        admin2.login("", "");
        boolean boolean8 = admin2.isVerified();
        admin2.setVerified(false);
        admin2.logout();
        java.lang.String str12 = admin2.getAccountType();
        boolean boolean13 = admin2.isVerified();
        admin2.logout();
        admin2.login("admin", "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "admin" + "'", str4, "admin");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "admin" + "'", str12, "admin");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test23979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23979");
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
        admin2.viewProfile();
        double double14 = admin2.getHourlyRate();
        boolean boolean15 = admin2.isVerified();
        double double16 = admin2.getHourlyRate();
        admin2.login("", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "admin" + "'", str10, "admin");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
    }

    @Test
    public void test23980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23980");
        model.Admin admin2 = new model.Admin("admin", "hi!");
        java.lang.String str3 = admin2.getID();
        java.lang.Class<?> wildcardClass4 = admin2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test23981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23981");
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
        java.lang.String str21 = admin2.getEmail();
        java.lang.String str22 = admin2.getID();
        java.lang.String str23 = admin2.getPassword();
        admin2.viewProfile();
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
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "admin" + "'", str22, "admin");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
    }

    @Test
    public void test23982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23982");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        admin2.logout();
        java.lang.String str5 = admin2.getAccountType();
        boolean boolean6 = admin2.isVerified();
        admin2.login("hi!", "admin");
        java.lang.String str10 = admin2.getAccountType();
        java.lang.String str11 = admin2.getEmail();
        java.lang.String str12 = admin2.getAccountType();
        java.lang.String str13 = admin2.getPassword();
        admin2.setVerified(false);
        room.Room room16 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.enableRoom(room16);
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
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test23983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23983");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        admin2.logout();
        java.lang.String str5 = admin2.getAccountType();
        admin2.viewProfile();
        admin2.login("hi!", "admin");
        java.lang.String str10 = admin2.getAccountType();
        boolean boolean11 = admin2.isVerified();
        java.lang.String str12 = admin2.getPassword();
        java.lang.String str13 = admin2.getAccountType();
        admin2.setVerified(true);
        boolean boolean16 = admin2.isVerified();
        java.lang.String str17 = admin2.getPassword();
        admin2.login("admin", "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "admin" + "'", str10, "admin");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "admin" + "'", str13, "admin");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test23984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23984");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        double double5 = admin2.getHourlyRate();
        double double6 = admin2.getHourlyRate();
        java.lang.String str7 = admin2.getID();
        admin2.setVerified(false);
        admin2.setVerified(false);
        java.lang.String str12 = admin2.getPassword();
        double double13 = admin2.getHourlyRate();
        java.lang.String str14 = admin2.getAccountType();
        double double15 = admin2.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "admin" + "'", str14, "admin");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test23985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23985");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getPassword();
        boolean boolean4 = admin2.isVerified();
        java.lang.String str5 = admin2.getID();
        java.lang.String str6 = admin2.getEmail();
        java.lang.String str7 = admin2.getAccountType();
        admin2.setVerified(false);
        java.lang.String str10 = admin2.getPassword();
        admin2.setVerified(false);
        admin2.setVerified(true);
        double double15 = admin2.getHourlyRate();
        java.lang.String str16 = admin2.getPassword();
        admin2.logout();
        admin2.setVerified(true);
        java.lang.String str20 = admin2.getEmail();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test23986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23986");
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
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "admin" + "'", str9, "admin");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "admin" + "'", str11, "admin");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test23987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23987");
        model.Admin admin2 = new model.Admin("admin", "admin");
        boolean boolean3 = admin2.isVerified();
        admin2.login("hi!", "");
        double double7 = admin2.getHourlyRate();
        admin2.viewProfile();
        java.lang.String str9 = admin2.getPassword();
        admin2.logout();
        java.lang.String str11 = admin2.getID();
        java.lang.String str12 = admin2.getPassword();
        java.lang.String str13 = admin2.getEmail();
        double double14 = admin2.getHourlyRate();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "admin" + "'", str9, "admin");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "admin" + "'", str11, "admin");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "admin" + "'", str12, "admin");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "admin" + "'", str13, "admin");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test23988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23988");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        double double5 = admin2.getHourlyRate();
        admin2.setVerified(true);
        double double8 = admin2.getHourlyRate();
        double double9 = admin2.getHourlyRate();
        admin2.login("", "admin");
        java.lang.String str13 = admin2.getID();
        java.lang.String str14 = admin2.getPassword();
        admin2.setVerified(false);
        admin2.logout();
        java.lang.String str18 = admin2.getAccountType();
        java.lang.String str19 = admin2.getEmail();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "admin" + "'", str13, "admin");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "admin" + "'", str18, "admin");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test23989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23989");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        admin2.logout();
        java.lang.String str5 = admin2.getAccountType();
        admin2.viewProfile();
        admin2.login("hi!", "admin");
        java.lang.String str10 = admin2.getAccountType();
        boolean boolean11 = admin2.isVerified();
        java.lang.String str12 = admin2.getPassword();
        admin2.login("", "hi!");
        admin2.setVerified(false);
        admin2.setVerified(true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "admin" + "'", str10, "admin");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test23990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23990");
        model.Admin admin2 = new model.Admin("admin", "admin");
        admin2.login("admin", "admin");
        boolean boolean6 = admin2.isVerified();
        admin2.logout();
        java.lang.String str8 = admin2.getID();
        admin2.setVerified(true);
        double double11 = admin2.getHourlyRate();
        java.lang.String str12 = admin2.getID();
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
    public void test23991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23991");
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
        java.lang.String str15 = admin2.getID();
        admin2.setVerified(true);
        boolean boolean18 = admin2.isVerified();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "admin" + "'", str12, "admin");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "admin" + "'", str15, "admin");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test23992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23992");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        admin2.logout();
        java.lang.String str5 = admin2.getAccountType();
        boolean boolean6 = admin2.isVerified();
        admin2.login("hi!", "admin");
        admin2.setVerified(false);
        java.lang.String str12 = admin2.getAccountType();
        double double13 = admin2.getHourlyRate();
        boolean boolean14 = admin2.isVerified();
        java.lang.String str15 = admin2.getEmail();
        admin2.login("admin", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "admin" + "'", str12, "admin");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test23993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23993");
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
        admin2.logout();
        admin2.setVerified(true);
        double double15 = admin2.getHourlyRate();
        java.lang.String str16 = admin2.getEmail();
        admin2.viewProfile();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "admin" + "'", str8, "admin");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "admin" + "'", str9, "admin");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "admin" + "'", str10, "admin");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test23994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23994");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        java.lang.String str5 = admin2.getID();
        java.lang.String str6 = admin2.getID();
        admin2.logout();
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
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "admin" + "'", str6, "admin");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "admin" + "'", str8, "admin");
    }

    @Test
    public void test23995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23995");
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
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "admin" + "'", str13, "admin");
    }

    @Test
    public void test23996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23996");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getAccountType();
        boolean boolean4 = admin2.isVerified();
        java.lang.String str5 = admin2.getEmail();
        java.lang.String str6 = admin2.getAccountType();
        admin2.login("hi!", "");
        admin2.viewProfile();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "admin" + "'", str6, "admin");
    }

    @Test
    public void test23997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23997");
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
        admin2.login("hi!", "hi!");
        java.lang.String str19 = admin2.getAccountType();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "admin" + "'", str12, "admin");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "admin" + "'", str19, "admin");
    }

    @Test
    public void test23998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23998");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getAccountType();
        admin2.setVerified(false);
        admin2.login("hi!", "hi!");
        admin2.logout();
        java.lang.String str10 = admin2.getID();
        double double11 = admin2.getHourlyRate();
        java.lang.String str12 = admin2.getID();
        admin2.setVerified(true);
        java.lang.String str15 = admin2.getID();
        boolean boolean16 = admin2.isVerified();
        java.lang.Class<?> wildcardClass17 = admin2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "admin" + "'", str10, "admin");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "admin" + "'", str12, "admin");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "admin" + "'", str15, "admin");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test23999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23999");
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
        admin2.logout();
        double double15 = admin2.getHourlyRate();
        admin2.logout();
        java.lang.String str17 = admin2.getEmail();
        boolean boolean18 = admin2.isVerified();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "admin" + "'", str11, "admin");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test24000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test24000");
        model.Admin admin2 = new model.Admin("admin", "admin");
        boolean boolean3 = admin2.isVerified();
        admin2.login("hi!", "");
        admin2.viewProfile();
        java.lang.String str8 = admin2.getPassword();
        java.lang.String str9 = admin2.getPassword();
        java.lang.String str10 = admin2.getEmail();
        java.lang.String str11 = admin2.getPassword();
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
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "admin" + "'", str8, "admin");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "admin" + "'", str9, "admin");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "admin" + "'", str10, "admin");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "admin" + "'", str11, "admin");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "admin" + "'", str12, "admin");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "admin" + "'", str13, "admin");
    }
}

