import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest48 {

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
    public void test24001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24001");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        boolean boolean6 = staff3.isVerified();
        staff3.logout();
        java.lang.String str8 = staff3.getPassword();
        java.lang.String str9 = staff3.getID();
        double double10 = staff3.getHourlyRate();
        staff3.login("staff", "");
        java.lang.String str14 = staff3.getAccountType();
        boolean boolean15 = staff3.isVerified();
        java.lang.String str16 = staff3.getPassword();
        staff3.viewProfile();
        double double18 = staff3.getHourlyRate();
        java.lang.String str19 = staff3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 40.0d + "'", double10 == 40.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "staff" + "'", str14, "staff");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 40.0d + "'", double18 == 40.0d);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "staff" + "'", str19, "staff");
    }

    @Test
    public void test24002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24002");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        boolean boolean6 = staff3.isVerified();
        staff3.logout();
        java.lang.String str8 = staff3.getAccountType();
        staff3.logout();
        java.lang.String str10 = staff3.getEmail();
        java.lang.String str11 = staff3.getID();
        double double12 = staff3.getHourlyRate();
        staff3.setVerified(true);
        staff3.logout();
        java.lang.String str16 = staff3.getPassword();
        staff3.viewProfile();
        java.lang.String str18 = staff3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "staff" + "'", str8, "staff");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 40.0d + "'", double12 == 40.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test24003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24003");
        model.Staff staff3 = new model.Staff("hi!", "", "hi!");
        staff3.logout();
        staff3.login("hi!", "hi!");
        staff3.viewProfile();
        java.lang.String str9 = staff3.getPassword();
        java.lang.String str10 = staff3.getID();
        staff3.logout();
        boolean boolean12 = staff3.isVerified();
        double double13 = staff3.getHourlyRate();
        staff3.viewProfile();
        staff3.setVerified(false);
        boolean boolean17 = staff3.isVerified();
        double double18 = staff3.getHourlyRate();
        java.lang.String str19 = staff3.getEmail();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 40.0d + "'", double13 == 40.0d);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 40.0d + "'", double18 == 40.0d);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test24004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24004");
        model.Staff staff3 = new model.Staff("hi!", "", "hi!");
        staff3.setVerified(false);
        java.lang.String str6 = staff3.getPassword();
        java.lang.String str7 = staff3.getAccountType();
        staff3.viewProfile();
        staff3.logout();
        boolean boolean10 = staff3.isVerified();
        java.lang.String str11 = staff3.getAccountType();
        java.lang.String str12 = staff3.getAccountType();
        java.lang.String str13 = staff3.getPassword();
        java.lang.String str14 = staff3.getEmail();
        boolean boolean15 = staff3.isVerified();
        staff3.viewProfile();
        java.lang.String str17 = staff3.getAccountType();
        java.lang.String str18 = staff3.getAccountType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "staff" + "'", str7, "staff");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "staff" + "'", str11, "staff");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "staff" + "'", str12, "staff");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "staff" + "'", str17, "staff");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "staff" + "'", str18, "staff");
    }

    @Test
    public void test24005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24005");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        boolean boolean6 = staff3.isVerified();
        staff3.login("", "");
        java.lang.String str10 = staff3.getID();
        staff3.logout();
        java.lang.String str12 = staff3.getID();
        java.lang.String str13 = staff3.getEmail();
        staff3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test24006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24006");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        staff3.logout();
        java.lang.String str5 = staff3.getID();
        java.lang.String str6 = staff3.getEmail();
        double double7 = staff3.getHourlyRate();
        boolean boolean8 = staff3.isVerified();
        java.lang.String str9 = staff3.getID();
        double double10 = staff3.getHourlyRate();
        staff3.logout();
        staff3.setVerified(true);
        staff3.login("staff", "");
        java.lang.String str17 = staff3.getEmail();
        staff3.setVerified(true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 40.0d + "'", double7 == 40.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 40.0d + "'", double10 == 40.0d);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test24007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24007");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        java.lang.String str6 = staff3.getPassword();
        double double7 = staff3.getHourlyRate();
        staff3.logout();
        staff3.viewProfile();
        staff3.login("", "");
        java.lang.String str13 = staff3.getAccountType();
        staff3.setVerified(false);
        java.lang.Class<?> wildcardClass16 = staff3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 40.0d + "'", double7 == 40.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "staff" + "'", str13, "staff");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test24008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24008");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        staff3.logout();
        java.lang.String str5 = staff3.getEmail();
        java.lang.String str6 = staff3.getID();
        java.lang.String str7 = staff3.getPassword();
        java.lang.String str8 = staff3.getID();
        staff3.logout();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test24009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24009");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        boolean boolean5 = staff3.isVerified();
        java.lang.String str6 = staff3.getID();
        staff3.setVerified(false);
        java.lang.String str9 = staff3.getID();
        staff3.setVerified(false);
        staff3.logout();
        java.lang.String str13 = staff3.getAccountType();
        java.lang.String str14 = staff3.getAccountType();
        java.lang.String str15 = staff3.getID();
        java.lang.String str16 = staff3.getAccountType();
        staff3.viewProfile();
        staff3.viewProfile();
        java.lang.String str19 = staff3.getPassword();
        staff3.logout();
        java.lang.String str21 = staff3.getID();
        staff3.setVerified(true);
        staff3.login("", "staff");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "staff" + "'", str13, "staff");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "staff" + "'", str14, "staff");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "staff" + "'", str16, "staff");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
    }

    @Test
    public void test24010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24010");
        model.Staff staff3 = new model.Staff("hi!", "", "staff");
        staff3.setVerified(false);
        java.lang.String str6 = staff3.getPassword();
        java.lang.Class<?> wildcardClass7 = staff3.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test24011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24011");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        boolean boolean5 = staff3.isVerified();
        java.lang.String str6 = staff3.getID();
        java.lang.String str7 = staff3.getID();
        staff3.setVerified(true);
        java.lang.String str10 = staff3.getAccountType();
        java.lang.String str11 = staff3.getPassword();
        staff3.login("", "");
        java.lang.String str15 = staff3.getAccountType();
        staff3.login("hi!", "staff");
        java.lang.String str19 = staff3.getAccountType();
        staff3.setVerified(true);
        staff3.logout();
        staff3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "staff" + "'", str10, "staff");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "staff" + "'", str15, "staff");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "staff" + "'", str19, "staff");
    }

    @Test
    public void test24012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24012");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        boolean boolean6 = staff3.isVerified();
        staff3.logout();
        java.lang.String str8 = staff3.getPassword();
        java.lang.String str9 = staff3.getEmail();
        staff3.logout();
        boolean boolean11 = staff3.isVerified();
        java.lang.String str12 = staff3.getAccountType();
        staff3.setVerified(true);
        staff3.logout();
        boolean boolean16 = staff3.isVerified();
        boolean boolean17 = staff3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "staff" + "'", str12, "staff");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test24013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24013");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        double double6 = staff3.getHourlyRate();
        staff3.logout();
        staff3.viewProfile();
        java.lang.String str9 = staff3.getEmail();
        java.lang.String str10 = staff3.getEmail();
        java.lang.String str11 = staff3.getAccountType();
        staff3.logout();
        staff3.logout();
        java.lang.String str14 = staff3.getID();
        java.lang.String str15 = staff3.getPassword();
        staff3.setVerified(false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 40.0d + "'", double6 == 40.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "staff" + "'", str11, "staff");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test24014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24014");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        boolean boolean6 = staff3.isVerified();
        staff3.login("", "");
        java.lang.String str10 = staff3.getID();
        staff3.logout();
        boolean boolean12 = staff3.isVerified();
        staff3.setVerified(false);
        double double15 = staff3.getHourlyRate();
        boolean boolean16 = staff3.isVerified();
        boolean boolean17 = staff3.isVerified();
        java.lang.String str18 = staff3.getPassword();
        boolean boolean19 = staff3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 40.0d + "'", double15 == 40.0d);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test24015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24015");
        model.Staff staff3 = new model.Staff("hi!", "hi!", "");
        staff3.logout();
        java.lang.String str5 = staff3.getEmail();
        boolean boolean6 = staff3.isVerified();
        staff3.login("", "staff");
        boolean boolean10 = staff3.isVerified();
        java.lang.String str11 = staff3.getEmail();
        double double12 = staff3.getHourlyRate();
        staff3.setVerified(true);
        staff3.login("staff", "staff");
        staff3.setVerified(false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 40.0d + "'", double12 == 40.0d);
    }

    @Test
    public void test24016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24016");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        boolean boolean5 = staff3.isVerified();
        java.lang.String str6 = staff3.getID();
        java.lang.String str7 = staff3.getID();
        staff3.setVerified(true);
        java.lang.String str10 = staff3.getEmail();
        staff3.setVerified(true);
        staff3.setVerified(true);
        staff3.logout();
        java.lang.String str16 = staff3.getID();
        boolean boolean17 = staff3.isVerified();
        staff3.setVerified(false);
        staff3.login("staff", "hi!");
        double double23 = staff3.getHourlyRate();
        staff3.login("hi!", "hi!");
        java.lang.String str27 = staff3.getEmail();
        java.lang.Class<?> wildcardClass28 = staff3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 40.0d + "'", double23 == 40.0d);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test24017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24017");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        boolean boolean5 = staff3.isVerified();
        java.lang.String str6 = staff3.getAccountType();
        staff3.logout();
        double double8 = staff3.getHourlyRate();
        java.lang.String str9 = staff3.getEmail();
        java.lang.String str10 = staff3.getPassword();
        staff3.logout();
        java.lang.String str12 = staff3.getPassword();
        double double13 = staff3.getHourlyRate();
        java.lang.String str14 = staff3.getAccountType();
        staff3.logout();
        double double16 = staff3.getHourlyRate();
        staff3.login("", "hi!");
        staff3.setVerified(false);
        double double22 = staff3.getHourlyRate();
        boolean boolean23 = staff3.isVerified();
        boolean boolean24 = staff3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "staff" + "'", str6, "staff");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 40.0d + "'", double8 == 40.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 40.0d + "'", double13 == 40.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "staff" + "'", str14, "staff");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 40.0d + "'", double16 == 40.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 40.0d + "'", double22 == 40.0d);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test24018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24018");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        boolean boolean5 = staff3.isVerified();
        java.lang.String str6 = staff3.getID();
        java.lang.String str7 = staff3.getID();
        java.lang.String str8 = staff3.getEmail();
        staff3.login("", "");
        boolean boolean12 = staff3.isVerified();
        boolean boolean13 = staff3.isVerified();
        staff3.logout();
        java.lang.String str15 = staff3.getPassword();
        java.lang.String str16 = staff3.getID();
        staff3.login("", "staff");
        java.lang.String str20 = staff3.getPassword();
        staff3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test24019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24019");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        boolean boolean5 = staff3.isVerified();
        java.lang.String str6 = staff3.getID();
        staff3.setVerified(false);
        java.lang.String str9 = staff3.getID();
        staff3.setVerified(false);
        staff3.logout();
        java.lang.String str13 = staff3.getAccountType();
        java.lang.String str14 = staff3.getAccountType();
        staff3.viewProfile();
        java.lang.String str16 = staff3.getEmail();
        staff3.logout();
        boolean boolean18 = staff3.isVerified();
        staff3.setVerified(false);
        java.lang.String str21 = staff3.getID();
        java.lang.String str22 = staff3.getAccountType();
        java.lang.String str23 = staff3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "staff" + "'", str13, "staff");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "staff" + "'", str14, "staff");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "staff" + "'", str22, "staff");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "staff" + "'", str23, "staff");
    }

    @Test
    public void test24020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24020");
        model.Staff staff3 = new model.Staff("hi!", "", "hi!");
        java.lang.String str4 = staff3.getAccountType();
        java.lang.String str5 = staff3.getEmail();
        staff3.viewProfile();
        staff3.logout();
        double double8 = staff3.getHourlyRate();
        staff3.setVerified(true);
        staff3.setVerified(false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "staff" + "'", str4, "staff");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 40.0d + "'", double8 == 40.0d);
    }

    @Test
    public void test24021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24021");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        boolean boolean6 = staff3.isVerified();
        staff3.logout();
        staff3.setVerified(false);
        java.lang.String str10 = staff3.getID();
        staff3.viewProfile();
        java.lang.String str12 = staff3.getID();
        java.lang.String str13 = staff3.getAccountType();
        java.lang.String str14 = staff3.getAccountType();
        java.lang.String str15 = staff3.getID();
        java.lang.String str16 = staff3.getPassword();
        java.lang.String str17 = staff3.getAccountType();
        staff3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "staff" + "'", str13, "staff");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "staff" + "'", str14, "staff");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "staff" + "'", str17, "staff");
    }

    @Test
    public void test24022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24022");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        boolean boolean5 = staff3.isVerified();
        java.lang.String str6 = staff3.getID();
        java.lang.String str7 = staff3.getID();
        java.lang.String str8 = staff3.getID();
        java.lang.String str9 = staff3.getID();
        staff3.setVerified(true);
        staff3.setVerified(false);
        staff3.login("", "hi!");
        java.lang.String str17 = staff3.getPassword();
        java.lang.String str18 = staff3.getEmail();
        java.lang.String str19 = staff3.getAccountType();
        java.lang.String str20 = staff3.getPassword();
        java.lang.String str21 = staff3.getPassword();
        java.lang.String str22 = staff3.getID();
        java.lang.String str23 = staff3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "staff" + "'", str19, "staff");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test24023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24023");
        model.Staff staff3 = new model.Staff("hi!", "", "hi!");
        staff3.setVerified(false);
        staff3.viewProfile();
        java.lang.String str7 = staff3.getEmail();
        java.lang.String str8 = staff3.getAccountType();
        staff3.logout();
        boolean boolean10 = staff3.isVerified();
        staff3.login("", "hi!");
        staff3.viewProfile();
        java.lang.String str15 = staff3.getPassword();
        staff3.logout();
        java.lang.String str17 = staff3.getID();
        java.lang.String str18 = staff3.getEmail();
        java.lang.String str19 = staff3.getID();
        java.lang.String str20 = staff3.getID();
        java.lang.String str21 = staff3.getEmail();
        boolean boolean22 = staff3.isVerified();
        staff3.setVerified(false);
        java.lang.String str25 = staff3.getEmail();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "staff" + "'", str8, "staff");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
    }

    @Test
    public void test24024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24024");
        model.Staff staff3 = new model.Staff("hi!", "", "hi!");
        staff3.setVerified(false);
        staff3.viewProfile();
        java.lang.String str7 = staff3.getEmail();
        staff3.login("hi!", "hi!");
        java.lang.String str11 = staff3.getEmail();
        staff3.login("staff", "hi!");
        java.lang.String str15 = staff3.getPassword();
        java.lang.String str16 = staff3.getAccountType();
        java.lang.String str17 = staff3.getEmail();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "staff" + "'", str16, "staff");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test24025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24025");
        model.Staff staff3 = new model.Staff("hi!", "hi!", "");
        staff3.viewProfile();
        staff3.viewProfile();
        double double6 = staff3.getHourlyRate();
        staff3.login("", "");
        staff3.viewProfile();
        staff3.logout();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 40.0d + "'", double6 == 40.0d);
    }

    @Test
    public void test24026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24026");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        boolean boolean6 = staff3.isVerified();
        staff3.logout();
        staff3.setVerified(false);
        java.lang.String str10 = staff3.getID();
        staff3.viewProfile();
        java.lang.String str12 = staff3.getID();
        staff3.setVerified(false);
        java.lang.String str15 = staff3.getID();
        boolean boolean16 = staff3.isVerified();
        java.lang.String str17 = staff3.getAccountType();
        double double18 = staff3.getHourlyRate();
        boolean boolean19 = staff3.isVerified();
        staff3.viewProfile();
        double double21 = staff3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "staff" + "'", str17, "staff");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 40.0d + "'", double18 == 40.0d);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 40.0d + "'", double21 == 40.0d);
    }

    @Test
    public void test24027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24027");
        model.Staff staff3 = new model.Staff("", "", "staff");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getPassword();
        boolean boolean6 = staff3.isVerified();
        java.lang.String str7 = staff3.getID();
        boolean boolean8 = staff3.isVerified();
        double double9 = staff3.getHourlyRate();
        staff3.setVerified(false);
        java.lang.String str12 = staff3.getID();
        java.lang.String str13 = staff3.getEmail();
        boolean boolean14 = staff3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "staff" + "'", str4, "staff");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "staff" + "'", str7, "staff");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 40.0d + "'", double9 == 40.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "staff" + "'", str12, "staff");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test24028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24028");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        boolean boolean6 = staff3.isVerified();
        staff3.logout();
        staff3.setVerified(false);
        java.lang.String str10 = staff3.getID();
        staff3.viewProfile();
        java.lang.String str12 = staff3.getID();
        staff3.logout();
        boolean boolean14 = staff3.isVerified();
        java.lang.String str15 = staff3.getID();
        staff3.setVerified(false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test24029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24029");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        boolean boolean5 = staff3.isVerified();
        java.lang.String str6 = staff3.getAccountType();
        staff3.logout();
        java.lang.String str8 = staff3.getEmail();
        staff3.viewProfile();
        java.lang.String str10 = staff3.getAccountType();
        java.lang.String str11 = staff3.getAccountType();
        staff3.logout();
        staff3.viewProfile();
        staff3.login("hi!", "hi!");
        java.lang.String str17 = staff3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "staff" + "'", str6, "staff");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "staff" + "'", str10, "staff");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "staff" + "'", str11, "staff");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test24030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24030");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        boolean boolean6 = staff3.isVerified();
        staff3.logout();
        staff3.setVerified(false);
        java.lang.String str10 = staff3.getID();
        staff3.viewProfile();
        java.lang.String str12 = staff3.getID();
        boolean boolean13 = staff3.isVerified();
        java.lang.String str14 = staff3.getPassword();
        staff3.logout();
        boolean boolean16 = staff3.isVerified();
        java.lang.String str17 = staff3.getID();
        java.lang.String str18 = staff3.getEmail();
        java.lang.String str19 = staff3.getEmail();
        staff3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test24031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24031");
        model.Staff staff3 = new model.Staff("hi!", "", "hi!");
        staff3.logout();
        staff3.login("hi!", "hi!");
        staff3.viewProfile();
        staff3.setVerified(false);
        boolean boolean11 = staff3.isVerified();
        staff3.login("staff", "");
        java.lang.String str15 = staff3.getPassword();
        java.lang.String str16 = staff3.getID();
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test24032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24032");
        model.Staff staff3 = new model.Staff("hi!", "", "hi!");
        staff3.setVerified(false);
        staff3.viewProfile();
        java.lang.String str7 = staff3.getEmail();
        java.lang.String str8 = staff3.getAccountType();
        staff3.logout();
        boolean boolean10 = staff3.isVerified();
        staff3.login("", "hi!");
        boolean boolean14 = staff3.isVerified();
        java.lang.String str15 = staff3.getEmail();
        staff3.setVerified(true);
        java.lang.String str18 = staff3.getID();
        java.lang.Class<?> wildcardClass19 = staff3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "staff" + "'", str8, "staff");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test24033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24033");
        model.Staff staff3 = new model.Staff("hi!", "staff", "staff");
        java.lang.String str4 = staff3.getID();
        staff3.setVerified(true);
        staff3.setVerified(true);
        java.lang.String str9 = staff3.getID();
        staff3.logout();
        java.lang.String str11 = staff3.getAccountType();
        java.lang.String str12 = staff3.getAccountType();
        java.lang.String str13 = staff3.getEmail();
        double double14 = staff3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "staff" + "'", str4, "staff");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "staff" + "'", str9, "staff");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "staff" + "'", str11, "staff");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "staff" + "'", str12, "staff");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 40.0d + "'", double14 == 40.0d);
    }

    @Test
    public void test24034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24034");
        model.Staff staff3 = new model.Staff("hi!", "", "hi!");
        java.lang.String str4 = staff3.getAccountType();
        java.lang.String str5 = staff3.getEmail();
        double double6 = staff3.getHourlyRate();
        staff3.viewProfile();
        java.lang.String str8 = staff3.getEmail();
        staff3.viewProfile();
        staff3.login("", "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "staff" + "'", str4, "staff");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 40.0d + "'", double6 == 40.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test24035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24035");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        staff3.logout();
        staff3.logout();
        java.lang.String str6 = staff3.getAccountType();
        java.lang.String str7 = staff3.getPassword();
        staff3.viewProfile();
        java.lang.String str9 = staff3.getPassword();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "staff" + "'", str6, "staff");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test24036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24036");
        model.Staff staff3 = new model.Staff("hi!", "hi!", "");
        java.lang.String str4 = staff3.getEmail();
        staff3.login("", "staff");
        java.lang.String str8 = staff3.getPassword();
        java.lang.String str9 = staff3.getID();
        java.lang.String str10 = staff3.getID();
        java.lang.String str11 = staff3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test24037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24037");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        staff3.login("", "");
        java.lang.String str7 = staff3.getPassword();
        java.lang.String str8 = staff3.getEmail();
        java.lang.String str9 = staff3.getAccountType();
        staff3.login("staff", "staff");
        staff3.setVerified(true);
        java.lang.String str15 = staff3.getAccountType();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "staff" + "'", str9, "staff");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "staff" + "'", str15, "staff");
    }

    @Test
    public void test24038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24038");
        model.Staff staff3 = new model.Staff("hi!", "staff", "");
        java.lang.String str4 = staff3.getEmail();
        staff3.viewProfile();
        staff3.login("", "staff");
        java.lang.String str9 = staff3.getEmail();
        boolean boolean10 = staff3.isVerified();
        double double11 = staff3.getHourlyRate();
        double double12 = staff3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 40.0d + "'", double11 == 40.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 40.0d + "'", double12 == 40.0d);
    }

    @Test
    public void test24039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24039");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getEmail();
        staff3.viewProfile();
        java.lang.String str7 = staff3.getPassword();
        staff3.login("hi!", "staff");
        staff3.setVerified(false);
        staff3.setVerified(false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test24040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24040");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        double double6 = staff3.getHourlyRate();
        java.lang.String str7 = staff3.getID();
        staff3.setVerified(false);
        java.lang.String str10 = staff3.getAccountType();
        java.lang.String str11 = staff3.getAccountType();
        java.lang.String str12 = staff3.getID();
        staff3.setVerified(false);
        double double15 = staff3.getHourlyRate();
        double double16 = staff3.getHourlyRate();
        staff3.login("hi!", "staff");
        staff3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 40.0d + "'", double6 == 40.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "staff" + "'", str10, "staff");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "staff" + "'", str11, "staff");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 40.0d + "'", double15 == 40.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 40.0d + "'", double16 == 40.0d);
    }

    @Test
    public void test24041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24041");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        boolean boolean5 = staff3.isVerified();
        java.lang.String str6 = staff3.getID();
        java.lang.String str7 = staff3.getID();
        double double8 = staff3.getHourlyRate();
        staff3.logout();
        staff3.logout();
        staff3.setVerified(true);
        java.lang.String str13 = staff3.getPassword();
        staff3.logout();
        staff3.setVerified(true);
        staff3.login("hi!", "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 40.0d + "'", double8 == 40.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test24042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24042");
        model.Staff staff3 = new model.Staff("hi!", "", "hi!");
        java.lang.String str4 = staff3.getAccountType();
        java.lang.String str5 = staff3.getEmail();
        staff3.viewProfile();
        staff3.setVerified(true);
        java.lang.String str9 = staff3.getPassword();
        staff3.login("hi!", "");
        staff3.setVerified(true);
        double double15 = staff3.getHourlyRate();
        java.lang.String str16 = staff3.getPassword();
        staff3.setVerified(false);
        java.lang.String str19 = staff3.getAccountType();
        staff3.viewProfile();
        java.lang.String str21 = staff3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "staff" + "'", str4, "staff");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 40.0d + "'", double15 == 40.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "staff" + "'", str19, "staff");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
    }

    @Test
    public void test24043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24043");
        model.Staff staff3 = new model.Staff("hi!", "", "staff");
        java.lang.String str4 = staff3.getPassword();
        double double5 = staff3.getHourlyRate();
        double double6 = staff3.getHourlyRate();
        java.lang.String str7 = staff3.getAccountType();
        java.lang.String str8 = staff3.getEmail();
        staff3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 40.0d + "'", double5 == 40.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 40.0d + "'", double6 == 40.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "staff" + "'", str7, "staff");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test24044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24044");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        boolean boolean6 = staff3.isVerified();
        staff3.logout();
        java.lang.String str8 = staff3.getPassword();
        staff3.setVerified(false);
        java.lang.String str11 = staff3.getID();
        staff3.login("staff", "staff");
        java.lang.String str15 = staff3.getEmail();
        staff3.logout();
        java.lang.String str17 = staff3.getEmail();
        double double18 = staff3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 40.0d + "'", double18 == 40.0d);
    }

    @Test
    public void test24045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24045");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        staff3.logout();
        java.lang.String str5 = staff3.getID();
        java.lang.String str6 = staff3.getEmail();
        java.lang.String str7 = staff3.getPassword();
        java.lang.String str8 = staff3.getID();
        staff3.logout();
        staff3.logout();
        double double11 = staff3.getHourlyRate();
        java.lang.String str12 = staff3.getAccountType();
        staff3.viewProfile();
        boolean boolean14 = staff3.isVerified();
        boolean boolean15 = staff3.isVerified();
        java.lang.String str16 = staff3.getID();
        staff3.viewProfile();
        staff3.setVerified(false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 40.0d + "'", double11 == 40.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "staff" + "'", str12, "staff");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test24046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24046");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        boolean boolean5 = staff3.isVerified();
        java.lang.String str6 = staff3.getID();
        java.lang.String str7 = staff3.getID();
        java.lang.String str8 = staff3.getID();
        java.lang.String str9 = staff3.getID();
        staff3.setVerified(true);
        boolean boolean12 = staff3.isVerified();
        staff3.logout();
        java.lang.String str14 = staff3.getID();
        java.lang.String str15 = staff3.getPassword();
        staff3.login("hi!", "staff");
        staff3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test24047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24047");
        model.Staff staff3 = new model.Staff("hi!", "", "hi!");
        staff3.setVerified(false);
        staff3.viewProfile();
        java.lang.String str7 = staff3.getEmail();
        java.lang.String str8 = staff3.getAccountType();
        java.lang.String str9 = staff3.getID();
        java.lang.String str10 = staff3.getAccountType();
        staff3.setVerified(false);
        staff3.logout();
        boolean boolean14 = staff3.isVerified();
        staff3.login("", "hi!");
        staff3.viewProfile();
        staff3.viewProfile();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "staff" + "'", str8, "staff");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "staff" + "'", str10, "staff");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test24048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24048");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        staff3.login("", "");
        double double7 = staff3.getHourlyRate();
        staff3.login("staff", "staff");
        java.lang.String str11 = staff3.getID();
        staff3.logout();
        java.lang.String str13 = staff3.getID();
        staff3.setVerified(true);
        staff3.logout();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 40.0d + "'", double7 == 40.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test24049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24049");
        model.Staff staff3 = new model.Staff("hi!", "", "hi!");
        staff3.setVerified(false);
        staff3.viewProfile();
        double double7 = staff3.getHourlyRate();
        staff3.viewProfile();
        java.lang.String str9 = staff3.getAccountType();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 40.0d + "'", double7 == 40.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "staff" + "'", str9, "staff");
    }

    @Test
    public void test24050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24050");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        boolean boolean6 = staff3.isVerified();
        staff3.logout();
        java.lang.String str8 = staff3.getPassword();
        staff3.logout();
        java.lang.String str10 = staff3.getID();
        double double11 = staff3.getHourlyRate();
        staff3.login("staff", "hi!");
        java.lang.String str15 = staff3.getEmail();
        staff3.viewProfile();
        java.lang.String str17 = staff3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 40.0d + "'", double11 == 40.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test24051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24051");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        boolean boolean6 = staff3.isVerified();
        staff3.logout();
        staff3.setVerified(false);
        java.lang.String str10 = staff3.getID();
        staff3.viewProfile();
        java.lang.String str12 = staff3.getID();
        java.lang.String str13 = staff3.getAccountType();
        java.lang.String str14 = staff3.getEmail();
        staff3.login("hi!", "");
        staff3.logout();
        staff3.setVerified(true);
        java.lang.String str21 = staff3.getPassword();
        java.lang.String str22 = staff3.getEmail();
        double double23 = staff3.getHourlyRate();
        java.lang.Class<?> wildcardClass24 = staff3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "staff" + "'", str13, "staff");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 40.0d + "'", double23 == 40.0d);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test24052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24052");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        boolean boolean6 = staff3.isVerified();
        staff3.logout();
        staff3.setVerified(false);
        java.lang.String str10 = staff3.getID();
        java.lang.String str11 = staff3.getAccountType();
        java.lang.String str12 = staff3.getPassword();
        staff3.logout();
        staff3.setVerified(false);
        double double16 = staff3.getHourlyRate();
        staff3.setVerified(false);
        boolean boolean19 = staff3.isVerified();
        boolean boolean20 = staff3.isVerified();
        boolean boolean21 = staff3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "staff" + "'", str11, "staff");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 40.0d + "'", double16 == 40.0d);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test24053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24053");
        model.Staff staff3 = new model.Staff("hi!", "", "hi!");
        staff3.logout();
        staff3.login("hi!", "hi!");
        double double8 = staff3.getHourlyRate();
        boolean boolean9 = staff3.isVerified();
        java.lang.String str10 = staff3.getAccountType();
        java.lang.String str11 = staff3.getAccountType();
        java.lang.String str12 = staff3.getID();
        staff3.setVerified(false);
        double double15 = staff3.getHourlyRate();
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 40.0d + "'", double8 == 40.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "staff" + "'", str10, "staff");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "staff" + "'", str11, "staff");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 40.0d + "'", double15 == 40.0d);
    }

    @Test
    public void test24054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24054");
        model.Staff staff3 = new model.Staff("", "staff", "hi!");
        boolean boolean4 = staff3.isVerified();
        staff3.login("", "");
        double double8 = staff3.getHourlyRate();
        java.lang.String str9 = staff3.getID();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 40.0d + "'", double8 == 40.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test24055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24055");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        boolean boolean6 = staff3.isVerified();
        staff3.logout();
        staff3.setVerified(false);
        java.lang.String str10 = staff3.getAccountType();
        java.lang.String str11 = staff3.getEmail();
        boolean boolean12 = staff3.isVerified();
        java.lang.String str13 = staff3.getEmail();
        java.lang.String str14 = staff3.getPassword();
        java.lang.String str15 = staff3.getID();
        boolean boolean16 = staff3.isVerified();
        staff3.login("", "hi!");
        staff3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "staff" + "'", str10, "staff");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test24056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24056");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        java.lang.String str6 = staff3.getPassword();
        staff3.setVerified(false);
        staff3.setVerified(false);
        java.lang.String str11 = staff3.getPassword();
        staff3.viewProfile();
        staff3.logout();
        java.lang.String str14 = staff3.getAccountType();
        staff3.setVerified(false);
        staff3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "staff" + "'", str14, "staff");
    }

    @Test
    public void test24057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24057");
        model.Staff staff3 = new model.Staff("hi!", "", "hi!");
        staff3.setVerified(false);
        staff3.viewProfile();
        java.lang.String str7 = staff3.getEmail();
        java.lang.String str8 = staff3.getID();
        staff3.viewProfile();
        staff3.setVerified(true);
        staff3.viewProfile();
        staff3.login("staff", "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test24058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24058");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        boolean boolean5 = staff3.isVerified();
        java.lang.String str6 = staff3.getID();
        staff3.setVerified(false);
        java.lang.String str9 = staff3.getID();
        staff3.setVerified(false);
        java.lang.String str12 = staff3.getID();
        java.lang.String str13 = staff3.getID();
        java.lang.String str14 = staff3.getPassword();
        java.lang.String str15 = staff3.getID();
        boolean boolean16 = staff3.isVerified();
        boolean boolean17 = staff3.isVerified();
        staff3.setVerified(true);
        java.lang.String str20 = staff3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test24059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24059");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        boolean boolean6 = staff3.isVerified();
        staff3.viewProfile();
        java.lang.String str8 = staff3.getAccountType();
        staff3.logout();
        staff3.logout();
        java.lang.String str11 = staff3.getAccountType();
        java.lang.String str12 = staff3.getAccountType();
        staff3.viewProfile();
        java.lang.String str14 = staff3.getEmail();
        staff3.login("", "hi!");
        staff3.logout();
        boolean boolean19 = staff3.isVerified();
        staff3.setVerified(false);
        boolean boolean22 = staff3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "staff" + "'", str8, "staff");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "staff" + "'", str11, "staff");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "staff" + "'", str12, "staff");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test24060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24060");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        boolean boolean5 = staff3.isVerified();
        java.lang.String str6 = staff3.getID();
        staff3.setVerified(false);
        java.lang.String str9 = staff3.getID();
        staff3.setVerified(false);
        staff3.logout();
        staff3.setVerified(false);
        boolean boolean15 = staff3.isVerified();
        staff3.setVerified(false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test24061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24061");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        boolean boolean5 = staff3.isVerified();
        java.lang.String str6 = staff3.getID();
        java.lang.String str7 = staff3.getID();
        boolean boolean8 = staff3.isVerified();
        staff3.setVerified(false);
        staff3.login("", "hi!");
        staff3.viewProfile();
        java.lang.Class<?> wildcardClass15 = staff3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test24062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24062");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        staff3.logout();
        java.lang.String str5 = staff3.getID();
        java.lang.String str6 = staff3.getEmail();
        java.lang.String str7 = staff3.getPassword();
        java.lang.String str8 = staff3.getID();
        staff3.logout();
        java.lang.String str10 = staff3.getAccountType();
        staff3.viewProfile();
        java.lang.String str12 = staff3.getID();
        java.lang.String str13 = staff3.getID();
        staff3.logout();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "staff" + "'", str10, "staff");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test24063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24063");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        boolean boolean6 = staff3.isVerified();
        staff3.logout();
        staff3.setVerified(false);
        java.lang.String str10 = staff3.getAccountType();
        java.lang.String str11 = staff3.getEmail();
        staff3.logout();
        staff3.setVerified(false);
        staff3.login("", "");
        staff3.login("staff", "");
        staff3.setVerified(false);
        java.lang.String str23 = staff3.getAccountType();
        staff3.setVerified(true);
        double double26 = staff3.getHourlyRate();
        double double27 = staff3.getHourlyRate();
        java.lang.String str28 = staff3.getAccountType();
        java.lang.Class<?> wildcardClass29 = staff3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "staff" + "'", str10, "staff");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "staff" + "'", str23, "staff");
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 40.0d + "'", double26 == 40.0d);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 40.0d + "'", double27 == 40.0d);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "staff" + "'", str28, "staff");
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test24064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24064");
        model.Staff staff3 = new model.Staff("hi!", "staff", "");
        java.lang.String str4 = staff3.getEmail();
        staff3.viewProfile();
        staff3.logout();
        boolean boolean7 = staff3.isVerified();
        boolean boolean8 = staff3.isVerified();
        double double9 = staff3.getHourlyRate();
        java.lang.String str10 = staff3.getPassword();
        staff3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 40.0d + "'", double9 == 40.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "staff" + "'", str10, "staff");
    }

    @Test
    public void test24065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24065");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        boolean boolean5 = staff3.isVerified();
        java.lang.String str6 = staff3.getID();
        staff3.login("", "staff");
        java.lang.String str10 = staff3.getEmail();
        staff3.login("", "hi!");
        java.lang.String str14 = staff3.getPassword();
        staff3.viewProfile();
        boolean boolean16 = staff3.isVerified();
        staff3.setVerified(true);
        java.lang.String str19 = staff3.getID();
        staff3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test24066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24066");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        boolean boolean5 = staff3.isVerified();
        java.lang.String str6 = staff3.getID();
        staff3.setVerified(false);
        java.lang.String str9 = staff3.getID();
        staff3.setVerified(false);
        java.lang.String str12 = staff3.getID();
        double double13 = staff3.getHourlyRate();
        boolean boolean14 = staff3.isVerified();
        staff3.viewProfile();
        staff3.login("", "staff");
        staff3.viewProfile();
        boolean boolean20 = staff3.isVerified();
        java.lang.String str21 = staff3.getEmail();
        double double22 = staff3.getHourlyRate();
        java.lang.String str23 = staff3.getEmail();
        staff3.setVerified(true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 40.0d + "'", double13 == 40.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 40.0d + "'", double22 == 40.0d);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test24067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24067");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        boolean boolean5 = staff3.isVerified();
        java.lang.String str6 = staff3.getAccountType();
        java.lang.String str7 = staff3.getAccountType();
        java.lang.String str8 = staff3.getEmail();
        java.lang.String str9 = staff3.getID();
        java.lang.String str10 = staff3.getEmail();
        double double11 = staff3.getHourlyRate();
        boolean boolean12 = staff3.isVerified();
        staff3.login("hi!", "");
        java.lang.String str16 = staff3.getPassword();
        java.lang.String str17 = staff3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "staff" + "'", str6, "staff");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "staff" + "'", str7, "staff");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 40.0d + "'", double11 == 40.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test24068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24068");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        boolean boolean6 = staff3.isVerified();
        staff3.logout();
        staff3.setVerified(false);
        java.lang.String str10 = staff3.getID();
        java.lang.String str11 = staff3.getAccountType();
        java.lang.String str12 = staff3.getPassword();
        staff3.logout();
        staff3.setVerified(false);
        staff3.viewProfile();
        staff3.viewProfile();
        java.lang.String str18 = staff3.getPassword();
        staff3.setVerified(false);
        java.lang.String str21 = staff3.getID();
        staff3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "staff" + "'", str11, "staff");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
    }

    @Test
    public void test24069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24069");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        boolean boolean6 = staff3.isVerified();
        staff3.login("", "");
        java.lang.String str10 = staff3.getID();
        staff3.logout();
        boolean boolean12 = staff3.isVerified();
        java.lang.String str13 = staff3.getEmail();
        staff3.login("staff", "");
        java.lang.String str17 = staff3.getID();
        boolean boolean18 = staff3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test24070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24070");
        model.Staff staff3 = new model.Staff("hi!", "staff", "staff");
        double double4 = staff3.getHourlyRate();
        double double5 = staff3.getHourlyRate();
        java.lang.String str6 = staff3.getEmail();
        java.lang.String str7 = staff3.getID();
        java.lang.String str8 = staff3.getAccountType();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 40.0d + "'", double4 == 40.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 40.0d + "'", double5 == 40.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "staff" + "'", str7, "staff");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "staff" + "'", str8, "staff");
    }

    @Test
    public void test24071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24071");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        boolean boolean6 = staff3.isVerified();
        staff3.logout();
        staff3.setVerified(false);
        java.lang.String str10 = staff3.getID();
        staff3.viewProfile();
        java.lang.String str12 = staff3.getID();
        staff3.logout();
        boolean boolean14 = staff3.isVerified();
        java.lang.String str15 = staff3.getAccountType();
        boolean boolean16 = staff3.isVerified();
        double double17 = staff3.getHourlyRate();
        staff3.login("staff", "");
        java.lang.String str21 = staff3.getID();
        java.lang.String str22 = staff3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "staff" + "'", str15, "staff");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 40.0d + "'", double17 == 40.0d);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
    }

    @Test
    public void test24072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24072");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        staff3.logout();
        java.lang.String str5 = staff3.getID();
        java.lang.String str6 = staff3.getEmail();
        java.lang.String str7 = staff3.getPassword();
        java.lang.String str8 = staff3.getID();
        staff3.logout();
        staff3.logout();
        staff3.viewProfile();
        java.lang.String str12 = staff3.getID();
        double double13 = staff3.getHourlyRate();
        double double14 = staff3.getHourlyRate();
        staff3.viewProfile();
        java.lang.String str16 = staff3.getPassword();
        staff3.logout();
        staff3.login("hi!", "staff");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 40.0d + "'", double13 == 40.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 40.0d + "'", double14 == 40.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test24073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24073");
        model.Staff staff3 = new model.Staff("hi!", "hi!", "");
        staff3.setVerified(true);
        staff3.login("staff", "");
        staff3.viewProfile();
        java.lang.String str10 = staff3.getID();
        java.lang.String str11 = staff3.getID();
        java.lang.String str12 = staff3.getPassword();
        staff3.login("staff", "staff");
        java.lang.String str16 = staff3.getID();
        boolean boolean17 = staff3.isVerified();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test24074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24074");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        boolean boolean6 = staff3.isVerified();
        staff3.logout();
        java.lang.String str8 = staff3.getPassword();
        java.lang.String str9 = staff3.getPassword();
        staff3.logout();
        java.lang.String str11 = staff3.getAccountType();
        java.lang.String str12 = staff3.getEmail();
        staff3.logout();
        java.lang.String str14 = staff3.getEmail();
        java.lang.String str15 = staff3.getEmail();
        double double16 = staff3.getHourlyRate();
        staff3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "staff" + "'", str11, "staff");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 40.0d + "'", double16 == 40.0d);
    }

    @Test
    public void test24075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24075");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        boolean boolean5 = staff3.isVerified();
        java.lang.String str6 = staff3.getID();
        java.lang.String str7 = staff3.getID();
        java.lang.String str8 = staff3.getEmail();
        staff3.login("", "");
        boolean boolean12 = staff3.isVerified();
        boolean boolean13 = staff3.isVerified();
        staff3.logout();
        java.lang.String str15 = staff3.getAccountType();
        staff3.setVerified(true);
        java.lang.Class<?> wildcardClass18 = staff3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "staff" + "'", str15, "staff");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test24076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24076");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        boolean boolean6 = staff3.isVerified();
        staff3.viewProfile();
        java.lang.String str8 = staff3.getAccountType();
        java.lang.String str9 = staff3.getID();
        staff3.login("", "hi!");
        double double13 = staff3.getHourlyRate();
        staff3.viewProfile();
        staff3.login("staff", "");
        java.lang.String str18 = staff3.getPassword();
        staff3.login("hi!", "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "staff" + "'", str8, "staff");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 40.0d + "'", double13 == 40.0d);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test24077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24077");
        model.Staff staff3 = new model.Staff("hi!", "", "hi!");
        staff3.setVerified(false);
        java.lang.String str6 = staff3.getEmail();
        staff3.setVerified(false);
        staff3.login("staff", "hi!");
        staff3.logout();
        java.lang.String str13 = staff3.getEmail();
        staff3.setVerified(false);
        java.lang.String str16 = staff3.getID();
        staff3.viewProfile();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test24078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24078");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        boolean boolean6 = staff3.isVerified();
        staff3.login("", "");
        java.lang.String str10 = staff3.getID();
        java.lang.String str11 = staff3.getPassword();
        double double12 = staff3.getHourlyRate();
        java.lang.String str13 = staff3.getID();
        java.lang.String str14 = staff3.getAccountType();
        java.lang.String str15 = staff3.getPassword();
        staff3.login("hi!", "hi!");
        staff3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 40.0d + "'", double12 == 40.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "staff" + "'", str14, "staff");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test24079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24079");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        boolean boolean6 = staff3.isVerified();
        staff3.logout();
        staff3.setVerified(false);
        staff3.viewProfile();
        java.lang.String str11 = staff3.getEmail();
        java.lang.String str12 = staff3.getPassword();
        java.lang.String str13 = staff3.getPassword();
        java.lang.String str14 = staff3.getPassword();
        staff3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test24080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24080");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        boolean boolean6 = staff3.isVerified();
        staff3.logout();
        staff3.setVerified(false);
        java.lang.String str10 = staff3.getEmail();
        staff3.viewProfile();
        java.lang.String str12 = staff3.getEmail();
        staff3.viewProfile();
        java.lang.String str14 = staff3.getPassword();
        java.lang.String str15 = staff3.getPassword();
        staff3.setVerified(false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test24081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24081");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        double double6 = staff3.getHourlyRate();
        java.lang.String str7 = staff3.getPassword();
        java.lang.String str8 = staff3.getPassword();
        staff3.viewProfile();
        double double10 = staff3.getHourlyRate();
        java.lang.String str11 = staff3.getPassword();
        staff3.login("hi!", "staff");
        double double15 = staff3.getHourlyRate();
        java.lang.String str16 = staff3.getPassword();
        staff3.login("hi!", "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 40.0d + "'", double6 == 40.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 40.0d + "'", double10 == 40.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 40.0d + "'", double15 == 40.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test24082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24082");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        staff3.logout();
        java.lang.String str5 = staff3.getID();
        java.lang.String str6 = staff3.getEmail();
        double double7 = staff3.getHourlyRate();
        java.lang.String str8 = staff3.getPassword();
        staff3.login("hi!", "hi!");
        staff3.logout();
        staff3.viewProfile();
        java.lang.String str14 = staff3.getID();
        java.lang.String str15 = staff3.getPassword();
        java.lang.String str16 = staff3.getPassword();
        boolean boolean17 = staff3.isVerified();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 40.0d + "'", double7 == 40.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test24083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24083");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        boolean boolean6 = staff3.isVerified();
        staff3.viewProfile();
        staff3.viewProfile();
        staff3.login("hi!", "hi!");
        java.lang.String str12 = staff3.getPassword();
        staff3.login("staff", "staff");
        staff3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test24084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24084");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        boolean boolean5 = staff3.isVerified();
        java.lang.String str6 = staff3.getAccountType();
        staff3.logout();
        java.lang.String str8 = staff3.getEmail();
        staff3.viewProfile();
        java.lang.String str10 = staff3.getID();
        java.lang.String str11 = staff3.getPassword();
        boolean boolean12 = staff3.isVerified();
        java.lang.String str13 = staff3.getEmail();
        java.lang.String str14 = staff3.getAccountType();
        staff3.viewProfile();
        boolean boolean16 = staff3.isVerified();
        staff3.login("staff", "");
        java.lang.String str20 = staff3.getID();
        double double21 = staff3.getHourlyRate();
        staff3.login("", "hi!");
        boolean boolean25 = staff3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "staff" + "'", str6, "staff");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "staff" + "'", str14, "staff");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 40.0d + "'", double21 == 40.0d);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test24085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24085");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        double double6 = staff3.getHourlyRate();
        java.lang.String str7 = staff3.getPassword();
        java.lang.String str8 = staff3.getPassword();
        staff3.login("staff", "staff");
        double double12 = staff3.getHourlyRate();
        java.lang.String str13 = staff3.getEmail();
        java.lang.String str14 = staff3.getEmail();
        double double15 = staff3.getHourlyRate();
        java.lang.String str16 = staff3.getID();
        staff3.login("hi!", "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 40.0d + "'", double6 == 40.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 40.0d + "'", double12 == 40.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 40.0d + "'", double15 == 40.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test24086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24086");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        staff3.logout();
        java.lang.String str5 = staff3.getID();
        java.lang.String str6 = staff3.getEmail();
        double double7 = staff3.getHourlyRate();
        boolean boolean8 = staff3.isVerified();
        java.lang.String str9 = staff3.getID();
        staff3.setVerified(true);
        double double12 = staff3.getHourlyRate();
        staff3.setVerified(false);
        staff3.viewProfile();
        staff3.login("staff", "hi!");
        java.lang.String str19 = staff3.getID();
        staff3.setVerified(false);
        double double22 = staff3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 40.0d + "'", double7 == 40.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 40.0d + "'", double12 == 40.0d);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 40.0d + "'", double22 == 40.0d);
    }

    @Test
    public void test24087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24087");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        boolean boolean5 = staff3.isVerified();
        java.lang.String str6 = staff3.getID();
        java.lang.String str7 = staff3.getID();
        staff3.setVerified(true);
        staff3.setVerified(false);
        java.lang.String str12 = staff3.getEmail();
        java.lang.String str13 = staff3.getPassword();
        staff3.setVerified(false);
        boolean boolean16 = staff3.isVerified();
        java.lang.String str17 = staff3.getPassword();
        boolean boolean18 = staff3.isVerified();
        boolean boolean19 = staff3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test24088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24088");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        boolean boolean6 = staff3.isVerified();
        staff3.logout();
        java.lang.String str8 = staff3.getPassword();
        java.lang.String str9 = staff3.getID();
        double double10 = staff3.getHourlyRate();
        staff3.login("staff", "");
        staff3.logout();
        staff3.setVerified(false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 40.0d + "'", double10 == 40.0d);
    }

    @Test
    public void test24089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24089");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getEmail();
        boolean boolean6 = staff3.isVerified();
        staff3.logout();
        staff3.login("hi!", "staff");
        java.lang.String str11 = staff3.getAccountType();
        java.lang.String str12 = staff3.getEmail();
        double double13 = staff3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "staff" + "'", str11, "staff");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 40.0d + "'", double13 == 40.0d);
    }

    @Test
    public void test24090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24090");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        boolean boolean6 = staff3.isVerified();
        staff3.logout();
        staff3.setVerified(false);
        java.lang.String str10 = staff3.getID();
        staff3.viewProfile();
        java.lang.String str12 = staff3.getID();
        staff3.setVerified(false);
        double double15 = staff3.getHourlyRate();
        staff3.logout();
        staff3.viewProfile();
        staff3.setVerified(false);
        double double20 = staff3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 40.0d + "'", double15 == 40.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 40.0d + "'", double20 == 40.0d);
    }

    @Test
    public void test24091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24091");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        boolean boolean6 = staff3.isVerified();
        staff3.logout();
        java.lang.String str8 = staff3.getAccountType();
        java.lang.String str9 = staff3.getAccountType();
        java.lang.String str10 = staff3.getID();
        java.lang.String str11 = staff3.getID();
        staff3.login("", "staff");
        java.lang.String str15 = staff3.getEmail();
        boolean boolean16 = staff3.isVerified();
        boolean boolean17 = staff3.isVerified();
        java.lang.String str18 = staff3.getID();
        staff3.login("", "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "staff" + "'", str8, "staff");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "staff" + "'", str9, "staff");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test24092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24092");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        staff3.logout();
        java.lang.String str5 = staff3.getID();
        java.lang.String str6 = staff3.getEmail();
        java.lang.String str7 = staff3.getPassword();
        java.lang.String str8 = staff3.getID();
        staff3.logout();
        staff3.logout();
        staff3.viewProfile();
        java.lang.String str12 = staff3.getID();
        double double13 = staff3.getHourlyRate();
        double double14 = staff3.getHourlyRate();
        staff3.viewProfile();
        staff3.login("staff", "staff");
        staff3.login("staff", "staff");
        staff3.setVerified(false);
        staff3.setVerified(false);
        java.lang.Class<?> wildcardClass26 = staff3.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 40.0d + "'", double13 == 40.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 40.0d + "'", double14 == 40.0d);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test24093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24093");
        model.Staff staff3 = new model.Staff("hi!", "hi!", "hi!");
        staff3.login("hi!", "staff");
        staff3.logout();
        boolean boolean8 = staff3.isVerified();
        java.lang.String str9 = staff3.getAccountType();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "staff" + "'", str9, "staff");
    }

    @Test
    public void test24094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24094");
        model.Staff staff3 = new model.Staff("hi!", "", "hi!");
        java.lang.String str4 = staff3.getAccountType();
        java.lang.String str5 = staff3.getID();
        boolean boolean6 = staff3.isVerified();
        java.lang.String str7 = staff3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "staff" + "'", str4, "staff");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "staff" + "'", str7, "staff");
    }

    @Test
    public void test24095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24095");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        boolean boolean5 = staff3.isVerified();
        java.lang.String str6 = staff3.getID();
        boolean boolean7 = staff3.isVerified();
        staff3.logout();
        java.lang.String str9 = staff3.getID();
        staff3.setVerified(true);
        staff3.viewProfile();
        double double13 = staff3.getHourlyRate();
        staff3.login("", "");
        staff3.viewProfile();
        java.lang.String str18 = staff3.getEmail();
        double double19 = staff3.getHourlyRate();
        staff3.logout();
        staff3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 40.0d + "'", double13 == 40.0d);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 40.0d + "'", double19 == 40.0d);
    }

    @Test
    public void test24096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24096");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        boolean boolean6 = staff3.isVerified();
        staff3.logout();
        staff3.setVerified(false);
        java.lang.String str10 = staff3.getID();
        staff3.viewProfile();
        double double12 = staff3.getHourlyRate();
        java.lang.String str13 = staff3.getID();
        boolean boolean14 = staff3.isVerified();
        staff3.setVerified(true);
        double double17 = staff3.getHourlyRate();
        java.lang.String str18 = staff3.getEmail();
        staff3.logout();
        java.lang.Class<?> wildcardClass20 = staff3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 40.0d + "'", double12 == 40.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 40.0d + "'", double17 == 40.0d);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test24097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24097");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        boolean boolean6 = staff3.isVerified();
        staff3.logout();
        staff3.setVerified(false);
        java.lang.String str10 = staff3.getAccountType();
        java.lang.String str11 = staff3.getEmail();
        boolean boolean12 = staff3.isVerified();
        staff3.login("", "staff");
        double double16 = staff3.getHourlyRate();
        java.lang.String str17 = staff3.getID();
        staff3.logout();
        java.lang.String str19 = staff3.getAccountType();
        staff3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "staff" + "'", str10, "staff");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 40.0d + "'", double16 == 40.0d);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "staff" + "'", str19, "staff");
    }

    @Test
    public void test24098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24098");
        model.Staff staff3 = new model.Staff("hi!", "", "hi!");
        staff3.setVerified(false);
        java.lang.String str6 = staff3.getPassword();
        java.lang.String str7 = staff3.getAccountType();
        staff3.viewProfile();
        double double9 = staff3.getHourlyRate();
        java.lang.String str10 = staff3.getEmail();
        boolean boolean11 = staff3.isVerified();
        java.lang.Class<?> wildcardClass12 = staff3.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "staff" + "'", str7, "staff");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 40.0d + "'", double9 == 40.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test24099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24099");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        boolean boolean5 = staff3.isVerified();
        java.lang.String str6 = staff3.getID();
        java.lang.String str7 = staff3.getID();
        double double8 = staff3.getHourlyRate();
        double double9 = staff3.getHourlyRate();
        staff3.login("staff", "hi!");
        java.lang.String str13 = staff3.getEmail();
        java.lang.Class<?> wildcardClass14 = staff3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 40.0d + "'", double8 == 40.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 40.0d + "'", double9 == 40.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test24100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24100");
        model.Staff staff3 = new model.Staff("staff", "", "staff");
        staff3.setVerified(false);
        staff3.login("hi!", "hi!");
        java.lang.String str9 = staff3.getEmail();
        staff3.logout();
        double double11 = staff3.getHourlyRate();
        staff3.logout();
        staff3.viewProfile();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "staff" + "'", str9, "staff");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 40.0d + "'", double11 == 40.0d);
    }

    @Test
    public void test24101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24101");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        boolean boolean6 = staff3.isVerified();
        staff3.viewProfile();
        staff3.viewProfile();
        staff3.logout();
        staff3.viewProfile();
        double double11 = staff3.getHourlyRate();
        double double12 = staff3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 40.0d + "'", double11 == 40.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 40.0d + "'", double12 == 40.0d);
    }

    @Test
    public void test24102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24102");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        double double6 = staff3.getHourlyRate();
        staff3.logout();
        staff3.viewProfile();
        java.lang.String str9 = staff3.getEmail();
        boolean boolean10 = staff3.isVerified();
        java.lang.String str11 = staff3.getPassword();
        staff3.login("", "hi!");
        double double15 = staff3.getHourlyRate();
        staff3.viewProfile();
        staff3.setVerified(false);
        java.lang.String str19 = staff3.getID();
        staff3.logout();
        staff3.setVerified(true);
        java.lang.String str23 = staff3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 40.0d + "'", double6 == 40.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 40.0d + "'", double15 == 40.0d);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
    }

    @Test
    public void test24103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24103");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        boolean boolean5 = staff3.isVerified();
        java.lang.String str6 = staff3.getID();
        staff3.login("", "staff");
        java.lang.String str10 = staff3.getEmail();
        staff3.login("", "hi!");
        java.lang.String str14 = staff3.getPassword();
        staff3.viewProfile();
        boolean boolean16 = staff3.isVerified();
        staff3.setVerified(true);
        java.lang.String str19 = staff3.getAccountType();
        staff3.login("hi!", "staff");
        boolean boolean23 = staff3.isVerified();
        java.lang.String str24 = staff3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "staff" + "'", str19, "staff");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test24104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24104");
        model.Staff staff3 = new model.Staff("staff", "", "staff");
        staff3.setVerified(false);
        staff3.viewProfile();
        staff3.logout();
        staff3.setVerified(true);
        java.lang.String str10 = staff3.getEmail();
        double double11 = staff3.getHourlyRate();
        java.lang.String str12 = staff3.getID();
        staff3.login("hi!", "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "staff" + "'", str10, "staff");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 40.0d + "'", double11 == 40.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "staff" + "'", str12, "staff");
    }

    @Test
    public void test24105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24105");
        model.Staff staff3 = new model.Staff("hi!", "", "hi!");
        staff3.setVerified(false);
        java.lang.String str6 = staff3.getPassword();
        java.lang.String str7 = staff3.getAccountType();
        java.lang.String str8 = staff3.getEmail();
        staff3.setVerified(true);
        boolean boolean11 = staff3.isVerified();
        java.lang.String str12 = staff3.getPassword();
        staff3.viewProfile();
        java.lang.String str14 = staff3.getEmail();
        java.lang.String str15 = staff3.getPassword();
        java.lang.String str16 = staff3.getID();
        staff3.login("hi!", "staff");
        double double20 = staff3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "staff" + "'", str7, "staff");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 40.0d + "'", double20 == 40.0d);
    }

    @Test
    public void test24106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24106");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        boolean boolean5 = staff3.isVerified();
        java.lang.String str6 = staff3.getID();
        boolean boolean7 = staff3.isVerified();
        staff3.logout();
        java.lang.String str9 = staff3.getID();
        staff3.login("hi!", "");
        java.lang.String str13 = staff3.getID();
        java.lang.String str14 = staff3.getID();
        java.lang.String str15 = staff3.getAccountType();
        double double16 = staff3.getHourlyRate();
        java.lang.String str17 = staff3.getAccountType();
        staff3.setVerified(true);
        staff3.viewProfile();
        staff3.login("", "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "staff" + "'", str15, "staff");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 40.0d + "'", double16 == 40.0d);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "staff" + "'", str17, "staff");
    }

    @Test
    public void test24107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24107");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        boolean boolean6 = staff3.isVerified();
        staff3.logout();
        staff3.setVerified(false);
        java.lang.String str10 = staff3.getID();
        staff3.viewProfile();
        java.lang.String str12 = staff3.getID();
        java.lang.String str13 = staff3.getAccountType();
        staff3.login("staff", "hi!");
        boolean boolean17 = staff3.isVerified();
        java.lang.String str18 = staff3.getPassword();
        java.lang.String str19 = staff3.getAccountType();
        java.lang.String str20 = staff3.getAccountType();
        staff3.logout();
        java.lang.String str22 = staff3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "staff" + "'", str13, "staff");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "staff" + "'", str19, "staff");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "staff" + "'", str20, "staff");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test24108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24108");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        staff3.logout();
        java.lang.String str5 = staff3.getID();
        java.lang.String str6 = staff3.getEmail();
        java.lang.String str7 = staff3.getEmail();
        java.lang.String str8 = staff3.getEmail();
        java.lang.String str9 = staff3.getID();
        java.lang.String str10 = staff3.getPassword();
        staff3.viewProfile();
        java.lang.String str12 = staff3.getEmail();
        staff3.logout();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test24109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24109");
        model.Staff staff3 = new model.Staff("", "", "staff");
        java.lang.String str4 = staff3.getID();
        double double5 = staff3.getHourlyRate();
        double double6 = staff3.getHourlyRate();
        staff3.setVerified(false);
        staff3.setVerified(false);
        staff3.setVerified(true);
        java.lang.Class<?> wildcardClass13 = staff3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "staff" + "'", str4, "staff");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 40.0d + "'", double5 == 40.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 40.0d + "'", double6 == 40.0d);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test24110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24110");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        boolean boolean5 = staff3.isVerified();
        java.lang.String str6 = staff3.getID();
        staff3.setVerified(false);
        boolean boolean9 = staff3.isVerified();
        java.lang.String str10 = staff3.getAccountType();
        java.lang.String str11 = staff3.getID();
        staff3.logout();
        java.lang.String str13 = staff3.getAccountType();
        staff3.login("staff", "");
        boolean boolean17 = staff3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "staff" + "'", str10, "staff");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "staff" + "'", str13, "staff");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test24111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24111");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        boolean boolean6 = staff3.isVerified();
        staff3.logout();
        staff3.setVerified(false);
        java.lang.String str10 = staff3.getID();
        double double11 = staff3.getHourlyRate();
        staff3.viewProfile();
        staff3.login("hi!", "staff");
        staff3.viewProfile();
        java.lang.String str17 = staff3.getEmail();
        boolean boolean18 = staff3.isVerified();
        java.lang.String str19 = staff3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 40.0d + "'", double11 == 40.0d);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "staff" + "'", str19, "staff");
    }

    @Test
    public void test24112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24112");
        model.Staff staff3 = new model.Staff("staff", "staff", "hi!");
        staff3.setVerified(false);
        java.lang.String str6 = staff3.getID();
        staff3.setVerified(true);
        double double9 = staff3.getHourlyRate();
        java.lang.String str10 = staff3.getPassword();
        java.lang.String str11 = staff3.getAccountType();
        boolean boolean12 = staff3.isVerified();
        java.lang.String str13 = staff3.getPassword();
        staff3.logout();
        double double15 = staff3.getHourlyRate();
        java.lang.String str16 = staff3.getID();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 40.0d + "'", double9 == 40.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "staff" + "'", str10, "staff");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "staff" + "'", str11, "staff");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "staff" + "'", str13, "staff");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 40.0d + "'", double15 == 40.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test24113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24113");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        staff3.logout();
        staff3.viewProfile();
        staff3.setVerified(true);
        java.lang.String str9 = staff3.getEmail();
        staff3.viewProfile();
        java.lang.String str11 = staff3.getPassword();
        java.lang.String str12 = staff3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "staff" + "'", str12, "staff");
    }

    @Test
    public void test24114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24114");
        model.Staff staff3 = new model.Staff("", "", "staff");
        java.lang.String str4 = staff3.getAccountType();
        java.lang.String str5 = staff3.getID();
        java.lang.String str6 = staff3.getAccountType();
        java.lang.String str7 = staff3.getEmail();
        java.lang.String str8 = staff3.getPassword();
        staff3.logout();
        double double10 = staff3.getHourlyRate();
        java.lang.String str11 = staff3.getEmail();
        staff3.login("hi!", "hi!");
        double double15 = staff3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "staff" + "'", str4, "staff");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "staff" + "'", str6, "staff");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 40.0d + "'", double10 == 40.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 40.0d + "'", double15 == 40.0d);
    }

    @Test
    public void test24115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24115");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        double double6 = staff3.getHourlyRate();
        java.lang.String str7 = staff3.getEmail();
        staff3.viewProfile();
        java.lang.String str9 = staff3.getPassword();
        staff3.login("", "hi!");
        staff3.setVerified(false);
        staff3.viewProfile();
        boolean boolean16 = staff3.isVerified();
        staff3.login("staff", "staff");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 40.0d + "'", double6 == 40.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test24116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24116");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        boolean boolean5 = staff3.isVerified();
        java.lang.String str6 = staff3.getAccountType();
        staff3.logout();
        staff3.setVerified(true);
        java.lang.String str10 = staff3.getPassword();
        boolean boolean11 = staff3.isVerified();
        boolean boolean12 = staff3.isVerified();
        java.lang.Class<?> wildcardClass13 = staff3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "staff" + "'", str6, "staff");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test24117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24117");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        staff3.logout();
        java.lang.String str5 = staff3.getID();
        java.lang.String str6 = staff3.getEmail();
        java.lang.String str7 = staff3.getPassword();
        java.lang.String str8 = staff3.getID();
        staff3.logout();
        staff3.logout();
        double double11 = staff3.getHourlyRate();
        java.lang.String str12 = staff3.getAccountType();
        staff3.viewProfile();
        boolean boolean14 = staff3.isVerified();
        java.lang.String str15 = staff3.getAccountType();
        java.lang.String str16 = staff3.getID();
        java.lang.String str17 = staff3.getPassword();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 40.0d + "'", double11 == 40.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "staff" + "'", str12, "staff");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "staff" + "'", str15, "staff");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test24118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24118");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        boolean boolean6 = staff3.isVerified();
        staff3.setVerified(false);
        java.lang.String str9 = staff3.getPassword();
        staff3.viewProfile();
        java.lang.String str11 = staff3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "staff" + "'", str11, "staff");
    }

    @Test
    public void test24119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24119");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        staff3.logout();
        java.lang.String str5 = staff3.getID();
        java.lang.String str6 = staff3.getPassword();
        java.lang.String str7 = staff3.getAccountType();
        java.lang.String str8 = staff3.getPassword();
        staff3.logout();
        java.lang.String str10 = staff3.getID();
        java.lang.String str11 = staff3.getEmail();
        staff3.login("hi!", "staff");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "staff" + "'", str7, "staff");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test24120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24120");
        model.Staff staff3 = new model.Staff("hi!", "", "hi!");
        staff3.logout();
        staff3.login("", "");
        java.lang.String str8 = staff3.getPassword();
        staff3.logout();
        boolean boolean10 = staff3.isVerified();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test24121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24121");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        boolean boolean5 = staff3.isVerified();
        java.lang.String str6 = staff3.getID();
        java.lang.String str7 = staff3.getID();
        staff3.setVerified(true);
        staff3.setVerified(false);
        boolean boolean12 = staff3.isVerified();
        double double13 = staff3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 40.0d + "'", double13 == 40.0d);
    }

    @Test
    public void test24122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24122");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        boolean boolean5 = staff3.isVerified();
        java.lang.String str6 = staff3.getID();
        staff3.setVerified(false);
        java.lang.String str9 = staff3.getID();
        staff3.setVerified(false);
        java.lang.String str12 = staff3.getID();
        java.lang.String str13 = staff3.getID();
        java.lang.String str14 = staff3.getPassword();
        java.lang.String str15 = staff3.getEmail();
        double double16 = staff3.getHourlyRate();
        staff3.setVerified(true);
        java.lang.String str19 = staff3.getID();
        boolean boolean20 = staff3.isVerified();
        java.lang.String str21 = staff3.getAccountType();
        staff3.setVerified(true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 40.0d + "'", double16 == 40.0d);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "staff" + "'", str21, "staff");
    }

    @Test
    public void test24123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24123");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        java.lang.String str6 = staff3.getPassword();
        staff3.setVerified(false);
        staff3.setVerified(true);
        double double11 = staff3.getHourlyRate();
        staff3.login("", "staff");
        java.lang.String str15 = staff3.getEmail();
        staff3.logout();
        java.lang.String str17 = staff3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 40.0d + "'", double11 == 40.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "staff" + "'", str17, "staff");
    }

    @Test
    public void test24124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24124");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        boolean boolean5 = staff3.isVerified();
        java.lang.String str6 = staff3.getID();
        boolean boolean7 = staff3.isVerified();
        java.lang.String str8 = staff3.getID();
        java.lang.String str9 = staff3.getPassword();
        boolean boolean10 = staff3.isVerified();
        boolean boolean11 = staff3.isVerified();
        java.lang.String str12 = staff3.getID();
        boolean boolean13 = staff3.isVerified();
        java.lang.String str14 = staff3.getAccountType();
        java.lang.String str15 = staff3.getEmail();
        staff3.viewProfile();
        java.lang.String str17 = staff3.getPassword();
        staff3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "staff" + "'", str14, "staff");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test24125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24125");
        model.Staff staff3 = new model.Staff("hi!", "staff", "");
        java.lang.String str4 = staff3.getEmail();
        staff3.viewProfile();
        java.lang.String str6 = staff3.getAccountType();
        staff3.viewProfile();
        java.lang.String str8 = staff3.getPassword();
        java.lang.Class<?> wildcardClass9 = staff3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "staff" + "'", str6, "staff");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "staff" + "'", str8, "staff");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test24126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24126");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        staff3.logout();
        java.lang.String str5 = staff3.getID();
        java.lang.String str6 = staff3.getEmail();
        java.lang.String str7 = staff3.getID();
        boolean boolean8 = staff3.isVerified();
        java.lang.String str9 = staff3.getEmail();
        java.lang.String str10 = staff3.getAccountType();
        java.lang.String str11 = staff3.getEmail();
        staff3.setVerified(false);
        staff3.viewProfile();
        java.lang.String str15 = staff3.getPassword();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "staff" + "'", str10, "staff");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test24127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24127");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        staff3.logout();
        java.lang.String str5 = staff3.getID();
        java.lang.String str6 = staff3.getEmail();
        double double7 = staff3.getHourlyRate();
        java.lang.String str8 = staff3.getPassword();
        staff3.login("hi!", "hi!");
        boolean boolean12 = staff3.isVerified();
        java.lang.String str13 = staff3.getEmail();
        java.lang.String str14 = staff3.getID();
        staff3.login("", "staff");
        java.lang.String str18 = staff3.getPassword();
        staff3.setVerified(false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 40.0d + "'", double7 == 40.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test24128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24128");
        model.Staff staff3 = new model.Staff("hi!", "staff", "");
        staff3.logout();
        java.lang.String str5 = staff3.getEmail();
        staff3.login("", "");
        java.lang.String str9 = staff3.getPassword();
        staff3.login("staff", "");
        staff3.viewProfile();
        staff3.login("hi!", "staff");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "staff" + "'", str9, "staff");
    }

    @Test
    public void test24129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24129");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        boolean boolean5 = staff3.isVerified();
        java.lang.String str6 = staff3.getID();
        boolean boolean7 = staff3.isVerified();
        java.lang.String str8 = staff3.getID();
        double double9 = staff3.getHourlyRate();
        java.lang.String str10 = staff3.getPassword();
        java.lang.String str11 = staff3.getID();
        staff3.login("", "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 40.0d + "'", double9 == 40.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test24130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24130");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        double double6 = staff3.getHourlyRate();
        java.lang.String str7 = staff3.getPassword();
        java.lang.String str8 = staff3.getPassword();
        java.lang.String str9 = staff3.getAccountType();
        staff3.viewProfile();
        java.lang.String str11 = staff3.getPassword();
        staff3.viewProfile();
        java.lang.String str13 = staff3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 40.0d + "'", double6 == 40.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "staff" + "'", str9, "staff");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test24131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24131");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        boolean boolean5 = staff3.isVerified();
        java.lang.String str6 = staff3.getAccountType();
        java.lang.String str7 = staff3.getAccountType();
        java.lang.String str8 = staff3.getEmail();
        staff3.setVerified(true);
        double double11 = staff3.getHourlyRate();
        boolean boolean12 = staff3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "staff" + "'", str6, "staff");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "staff" + "'", str7, "staff");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 40.0d + "'", double11 == 40.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test24132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24132");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        boolean boolean5 = staff3.isVerified();
        java.lang.String str6 = staff3.getAccountType();
        staff3.logout();
        java.lang.String str8 = staff3.getEmail();
        staff3.viewProfile();
        java.lang.String str10 = staff3.getID();
        staff3.login("", "staff");
        staff3.logout();
        staff3.setVerified(false);
        java.lang.String str17 = staff3.getEmail();
        staff3.login("", "hi!");
        java.lang.String str21 = staff3.getPassword();
        staff3.setVerified(false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "staff" + "'", str6, "staff");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test24133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24133");
        model.Staff staff3 = new model.Staff("hi!", "staff", "");
        java.lang.String str4 = staff3.getEmail();
        double double5 = staff3.getHourlyRate();
        staff3.login("", "staff");
        staff3.viewProfile();
        java.lang.String str10 = staff3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 40.0d + "'", double5 == 40.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test24134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24134");
        model.Staff staff3 = new model.Staff("hi!", "", "hi!");
        java.lang.String str4 = staff3.getAccountType();
        java.lang.String str5 = staff3.getID();
        staff3.login("", "staff");
        double double9 = staff3.getHourlyRate();
        staff3.login("hi!", "");
        java.lang.String str13 = staff3.getPassword();
        staff3.logout();
        staff3.login("", "hi!");
        double double18 = staff3.getHourlyRate();
        java.lang.String str19 = staff3.getAccountType();
        staff3.logout();
        java.lang.String str21 = staff3.getID();
        double double22 = staff3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "staff" + "'", str4, "staff");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 40.0d + "'", double9 == 40.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 40.0d + "'", double18 == 40.0d);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "staff" + "'", str19, "staff");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 40.0d + "'", double22 == 40.0d);
    }

    @Test
    public void test24135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24135");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        boolean boolean6 = staff3.isVerified();
        staff3.logout();
        staff3.setVerified(false);
        java.lang.String str10 = staff3.getID();
        java.lang.String str11 = staff3.getAccountType();
        java.lang.String str12 = staff3.getPassword();
        staff3.logout();
        staff3.setVerified(false);
        staff3.logout();
        java.lang.String str17 = staff3.getEmail();
        double double18 = staff3.getHourlyRate();
        java.lang.String str19 = staff3.getEmail();
        staff3.setVerified(false);
        staff3.login("", "");
        java.lang.String str25 = staff3.getPassword();
        java.lang.String str26 = staff3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "staff" + "'", str11, "staff");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 40.0d + "'", double18 == 40.0d);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "staff" + "'", str26, "staff");
    }

    @Test
    public void test24136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24136");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        boolean boolean5 = staff3.isVerified();
        java.lang.String str6 = staff3.getID();
        staff3.setVerified(false);
        boolean boolean9 = staff3.isVerified();
        double double10 = staff3.getHourlyRate();
        java.lang.String str11 = staff3.getID();
        boolean boolean12 = staff3.isVerified();
        java.lang.String str13 = staff3.getEmail();
        staff3.viewProfile();
        staff3.login("hi!", "staff");
        java.lang.Class<?> wildcardClass18 = staff3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 40.0d + "'", double10 == 40.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test24137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24137");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        staff3.logout();
        java.lang.String str5 = staff3.getID();
        java.lang.String str6 = staff3.getEmail();
        double double7 = staff3.getHourlyRate();
        java.lang.String str8 = staff3.getPassword();
        staff3.login("hi!", "hi!");
        staff3.logout();
        staff3.login("staff", "hi!");
        staff3.logout();
        staff3.setVerified(false);
        boolean boolean19 = staff3.isVerified();
        double double20 = staff3.getHourlyRate();
        java.lang.String str21 = staff3.getPassword();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 40.0d + "'", double7 == 40.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 40.0d + "'", double20 == 40.0d);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test24138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24138");
        model.Staff staff3 = new model.Staff("hi!", "", "hi!");
        staff3.setVerified(false);
        java.lang.String str6 = staff3.getEmail();
        java.lang.String str7 = staff3.getAccountType();
        staff3.viewProfile();
        staff3.viewProfile();
        staff3.setVerified(true);
        staff3.logout();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "staff" + "'", str7, "staff");
    }

    @Test
    public void test24139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24139");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        boolean boolean5 = staff3.isVerified();
        java.lang.String str6 = staff3.getID();
        boolean boolean7 = staff3.isVerified();
        java.lang.String str8 = staff3.getID();
        staff3.setVerified(false);
        boolean boolean11 = staff3.isVerified();
        staff3.setVerified(false);
        staff3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test24140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24140");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        boolean boolean5 = staff3.isVerified();
        java.lang.String str6 = staff3.getID();
        staff3.setVerified(false);
        java.lang.String str9 = staff3.getID();
        staff3.setVerified(false);
        staff3.logout();
        staff3.setVerified(false);
        java.lang.String str15 = staff3.getPassword();
        staff3.setVerified(true);
        double double18 = staff3.getHourlyRate();
        staff3.logout();
        java.lang.String str20 = staff3.getAccountType();
        staff3.login("hi!", "staff");
        java.lang.String str24 = staff3.getID();
        staff3.setVerified(true);
        java.lang.Class<?> wildcardClass27 = staff3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 40.0d + "'", double18 == 40.0d);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "staff" + "'", str20, "staff");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test24141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24141");
        model.Staff staff3 = new model.Staff("staff", "", "");
        staff3.logout();
        java.lang.String str5 = staff3.getPassword();
        boolean boolean6 = staff3.isVerified();
        java.lang.String str7 = staff3.getAccountType();
        staff3.logout();
        double double9 = staff3.getHourlyRate();
        java.lang.String str10 = staff3.getEmail();
        java.lang.String str11 = staff3.getAccountType();
        staff3.login("", "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "staff" + "'", str7, "staff");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 40.0d + "'", double9 == 40.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "staff" + "'", str10, "staff");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "staff" + "'", str11, "staff");
    }

    @Test
    public void test24142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24142");
        model.Staff staff3 = new model.Staff("hi!", "hi!", "hi!");
        staff3.login("hi!", "staff");
        staff3.logout();
        java.lang.String str8 = staff3.getPassword();
        staff3.viewProfile();
        boolean boolean10 = staff3.isVerified();
        java.lang.String str11 = staff3.getID();
        java.lang.String str12 = staff3.getEmail();
        staff3.viewProfile();
        staff3.viewProfile();
        staff3.viewProfile();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test24143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24143");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        boolean boolean5 = staff3.isVerified();
        java.lang.String str6 = staff3.getID();
        staff3.setVerified(false);
        java.lang.String str9 = staff3.getID();
        staff3.setVerified(false);
        java.lang.String str12 = staff3.getID();
        java.lang.String str13 = staff3.getID();
        java.lang.String str14 = staff3.getPassword();
        java.lang.String str15 = staff3.getEmail();
        double double16 = staff3.getHourlyRate();
        staff3.setVerified(true);
        staff3.setVerified(false);
        boolean boolean21 = staff3.isVerified();
        boolean boolean22 = staff3.isVerified();
        staff3.login("", "hi!");
        java.lang.String str26 = staff3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 40.0d + "'", double16 == 40.0d);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
    }

    @Test
    public void test24144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24144");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        boolean boolean5 = staff3.isVerified();
        java.lang.String str6 = staff3.getAccountType();
        staff3.login("hi!", "");
        double double10 = staff3.getHourlyRate();
        java.lang.String str11 = staff3.getEmail();
        java.lang.String str12 = staff3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "staff" + "'", str6, "staff");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 40.0d + "'", double10 == 40.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "staff" + "'", str12, "staff");
    }

    @Test
    public void test24145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24145");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        boolean boolean5 = staff3.isVerified();
        java.lang.String str6 = staff3.getID();
        staff3.setVerified(false);
        java.lang.String str9 = staff3.getID();
        staff3.setVerified(false);
        java.lang.String str12 = staff3.getID();
        java.lang.String str13 = staff3.getEmail();
        staff3.login("", "staff");
        java.lang.String str17 = staff3.getPassword();
        staff3.viewProfile();
        java.lang.String str19 = staff3.getAccountType();
        boolean boolean20 = staff3.isVerified();
        staff3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "staff" + "'", str19, "staff");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test24146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24146");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        boolean boolean5 = staff3.isVerified();
        java.lang.String str6 = staff3.getID();
        boolean boolean7 = staff3.isVerified();
        java.lang.String str8 = staff3.getID();
        java.lang.String str9 = staff3.getAccountType();
        staff3.logout();
        staff3.logout();
        java.lang.String str12 = staff3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "staff" + "'", str9, "staff");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "staff" + "'", str12, "staff");
    }

    @Test
    public void test24147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24147");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        double double6 = staff3.getHourlyRate();
        staff3.logout();
        staff3.viewProfile();
        java.lang.String str9 = staff3.getEmail();
        java.lang.String str10 = staff3.getEmail();
        staff3.logout();
        staff3.logout();
        double double13 = staff3.getHourlyRate();
        java.lang.String str14 = staff3.getID();
        java.lang.String str15 = staff3.getEmail();
        java.lang.String str16 = staff3.getID();
        java.lang.String str17 = staff3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 40.0d + "'", double6 == 40.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 40.0d + "'", double13 == 40.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test24148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24148");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        staff3.logout();
        java.lang.String str5 = staff3.getID();
        java.lang.String str6 = staff3.getEmail();
        java.lang.String str7 = staff3.getPassword();
        java.lang.String str8 = staff3.getID();
        staff3.logout();
        staff3.logout();
        double double11 = staff3.getHourlyRate();
        java.lang.String str12 = staff3.getAccountType();
        staff3.viewProfile();
        staff3.logout();
        staff3.setVerified(true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 40.0d + "'", double11 == 40.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "staff" + "'", str12, "staff");
    }

    @Test
    public void test24149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24149");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getID();
        java.lang.String str6 = staff3.getID();
        staff3.login("", "");
        staff3.setVerified(false);
        java.lang.String str12 = staff3.getID();
        staff3.login("staff", "");
        staff3.logout();
        staff3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test24150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24150");
        model.Staff staff3 = new model.Staff("hi!", "", "hi!");
        staff3.logout();
        staff3.login("hi!", "hi!");
        double double8 = staff3.getHourlyRate();
        boolean boolean9 = staff3.isVerified();
        java.lang.String str10 = staff3.getAccountType();
        java.lang.String str11 = staff3.getAccountType();
        double double12 = staff3.getHourlyRate();
        double double13 = staff3.getHourlyRate();
        staff3.login("hi!", "");
        boolean boolean17 = staff3.isVerified();
        java.lang.String str18 = staff3.getID();
        staff3.login("hi!", "hi!");
        staff3.login("staff", "staff");
        java.lang.String str25 = staff3.getAccountType();
        staff3.logout();
        boolean boolean27 = staff3.isVerified();
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 40.0d + "'", double8 == 40.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "staff" + "'", str10, "staff");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "staff" + "'", str11, "staff");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 40.0d + "'", double12 == 40.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 40.0d + "'", double13 == 40.0d);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "staff" + "'", str25, "staff");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test24151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24151");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        boolean boolean6 = staff3.isVerified();
        staff3.logout();
        staff3.setVerified(false);
        java.lang.String str10 = staff3.getEmail();
        staff3.logout();
        java.lang.String str12 = staff3.getID();
        staff3.login("hi!", "");
        java.lang.String str16 = staff3.getPassword();
        java.lang.String str17 = staff3.getEmail();
        java.lang.String str18 = staff3.getPassword();
        java.lang.String str19 = staff3.getPassword();
        java.lang.String str20 = staff3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test24152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24152");
        model.Staff staff3 = new model.Staff("", "hi!", "hi!");
        staff3.login("staff", "staff");
        staff3.logout();
        staff3.viewProfile();
        java.lang.String str9 = staff3.getAccountType();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "staff" + "'", str9, "staff");
    }

    @Test
    public void test24153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24153");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        boolean boolean6 = staff3.isVerified();
        staff3.logout();
        java.lang.String str8 = staff3.getPassword();
        boolean boolean9 = staff3.isVerified();
        staff3.viewProfile();
        java.lang.String str11 = staff3.getEmail();
        staff3.login("staff", "hi!");
        java.lang.String str15 = staff3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "staff" + "'", str15, "staff");
    }

    @Test
    public void test24154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24154");
        model.Staff staff3 = new model.Staff("staff", "", "staff");
        staff3.setVerified(false);
        java.lang.String str6 = staff3.getAccountType();
        staff3.login("hi!", "staff");
        staff3.logout();
        staff3.setVerified(true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "staff" + "'", str6, "staff");
    }

    @Test
    public void test24155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24155");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        double double6 = staff3.getHourlyRate();
        staff3.logout();
        staff3.setVerified(true);
        staff3.viewProfile();
        double double11 = staff3.getHourlyRate();
        java.lang.String str12 = staff3.getPassword();
        staff3.login("staff", "");
        java.lang.String str16 = staff3.getID();
        staff3.setVerified(false);
        java.lang.Class<?> wildcardClass19 = staff3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 40.0d + "'", double6 == 40.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 40.0d + "'", double11 == 40.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test24156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24156");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        boolean boolean6 = staff3.isVerified();
        staff3.logout();
        java.lang.String str8 = staff3.getAccountType();
        java.lang.String str9 = staff3.getAccountType();
        java.lang.String str10 = staff3.getID();
        staff3.setVerified(false);
        double double13 = staff3.getHourlyRate();
        staff3.viewProfile();
        boolean boolean15 = staff3.isVerified();
        java.lang.String str16 = staff3.getAccountType();
        java.lang.String str17 = staff3.getID();
        java.lang.String str18 = staff3.getPassword();
        boolean boolean19 = staff3.isVerified();
        double double20 = staff3.getHourlyRate();
        java.lang.String str21 = staff3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "staff" + "'", str8, "staff");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "staff" + "'", str9, "staff");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 40.0d + "'", double13 == 40.0d);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "staff" + "'", str16, "staff");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 40.0d + "'", double20 == 40.0d);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test24157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24157");
        model.Staff staff3 = new model.Staff("hi!", "", "hi!");
        staff3.logout();
        staff3.login("hi!", "hi!");
        java.lang.String str8 = staff3.getID();
        boolean boolean9 = staff3.isVerified();
        staff3.setVerified(true);
        java.lang.String str12 = staff3.getPassword();
        java.lang.String str13 = staff3.getID();
        staff3.setVerified(true);
        staff3.viewProfile();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test24158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24158");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        boolean boolean5 = staff3.isVerified();
        java.lang.String str6 = staff3.getAccountType();
        staff3.logout();
        boolean boolean8 = staff3.isVerified();
        staff3.setVerified(true);
        staff3.setVerified(false);
        boolean boolean13 = staff3.isVerified();
        staff3.login("", "");
        java.lang.String str17 = staff3.getPassword();
        staff3.setVerified(false);
        java.lang.String str20 = staff3.getID();
        java.lang.String str21 = staff3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "staff" + "'", str6, "staff");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test24159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24159");
        model.Staff staff3 = new model.Staff("hi!", "", "hi!");
        staff3.logout();
        staff3.login("hi!", "hi!");
        double double8 = staff3.getHourlyRate();
        boolean boolean9 = staff3.isVerified();
        java.lang.String str10 = staff3.getAccountType();
        java.lang.String str11 = staff3.getAccountType();
        java.lang.String str12 = staff3.getID();
        java.lang.String str13 = staff3.getID();
        staff3.login("hi!", "");
        boolean boolean17 = staff3.isVerified();
        java.lang.String str18 = staff3.getPassword();
        staff3.logout();
        java.lang.String str20 = staff3.getEmail();
        java.lang.Class<?> wildcardClass21 = staff3.getClass();
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 40.0d + "'", double8 == 40.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "staff" + "'", str10, "staff");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "staff" + "'", str11, "staff");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test24160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24160");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        staff3.login("", "");
        java.lang.String str7 = staff3.getPassword();
        java.lang.String str8 = staff3.getEmail();
        staff3.logout();
        staff3.setVerified(true);
        staff3.login("", "");
        staff3.setVerified(false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test24161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24161");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getID();
        staff3.setVerified(false);
        staff3.viewProfile();
        staff3.logout();
        double double10 = staff3.getHourlyRate();
        staff3.logout();
        double double12 = staff3.getHourlyRate();
        java.lang.String str13 = staff3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 40.0d + "'", double10 == 40.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 40.0d + "'", double12 == 40.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test24162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24162");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        boolean boolean5 = staff3.isVerified();
        java.lang.String str6 = staff3.getID();
        java.lang.String str7 = staff3.getID();
        double double8 = staff3.getHourlyRate();
        java.lang.String str9 = staff3.getID();
        java.lang.String str10 = staff3.getAccountType();
        java.lang.String str11 = staff3.getID();
        staff3.setVerified(true);
        boolean boolean14 = staff3.isVerified();
        java.lang.String str15 = staff3.getEmail();
        boolean boolean16 = staff3.isVerified();
        staff3.setVerified(true);
        double double19 = staff3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 40.0d + "'", double8 == 40.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "staff" + "'", str10, "staff");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 40.0d + "'", double19 == 40.0d);
    }

    @Test
    public void test24163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24163");
        model.Staff staff3 = new model.Staff("hi!", "", "hi!");
        staff3.setVerified(false);
        staff3.viewProfile();
        java.lang.String str7 = staff3.getEmail();
        java.lang.String str8 = staff3.getAccountType();
        staff3.logout();
        boolean boolean10 = staff3.isVerified();
        staff3.login("hi!", "hi!");
        java.lang.String str14 = staff3.getAccountType();
        java.lang.String str15 = staff3.getID();
        double double16 = staff3.getHourlyRate();
        staff3.logout();
        staff3.login("", "");
        java.lang.String str21 = staff3.getID();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "staff" + "'", str8, "staff");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "staff" + "'", str14, "staff");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 40.0d + "'", double16 == 40.0d);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
    }

    @Test
    public void test24164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24164");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        boolean boolean5 = staff3.isVerified();
        java.lang.String str6 = staff3.getAccountType();
        staff3.logout();
        boolean boolean8 = staff3.isVerified();
        staff3.setVerified(true);
        java.lang.String str11 = staff3.getPassword();
        java.lang.String str12 = staff3.getAccountType();
        java.lang.String str13 = staff3.getPassword();
        staff3.setVerified(false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "staff" + "'", str6, "staff");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "staff" + "'", str12, "staff");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test24165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24165");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        boolean boolean5 = staff3.isVerified();
        java.lang.String str6 = staff3.getAccountType();
        staff3.logout();
        java.lang.String str8 = staff3.getEmail();
        staff3.viewProfile();
        java.lang.String str10 = staff3.getAccountType();
        double double11 = staff3.getHourlyRate();
        boolean boolean12 = staff3.isVerified();
        boolean boolean13 = staff3.isVerified();
        boolean boolean14 = staff3.isVerified();
        staff3.login("staff", "hi!");
        java.lang.String str18 = staff3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "staff" + "'", str6, "staff");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "staff" + "'", str10, "staff");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 40.0d + "'", double11 == 40.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test24166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24166");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        boolean boolean6 = staff3.isVerified();
        staff3.viewProfile();
        java.lang.String str8 = staff3.getAccountType();
        staff3.setVerified(false);
        double double11 = staff3.getHourlyRate();
        staff3.login("", "hi!");
        java.lang.String str15 = staff3.getPassword();
        java.lang.String str16 = staff3.getPassword();
        staff3.setVerified(false);
        staff3.login("staff", "staff");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "staff" + "'", str8, "staff");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 40.0d + "'", double11 == 40.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test24167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24167");
        model.Staff staff3 = new model.Staff("", "staff", "");
        staff3.login("staff", "");
        boolean boolean7 = staff3.isVerified();
        java.lang.String str8 = staff3.getEmail();
        double double9 = staff3.getHourlyRate();
        java.lang.String str10 = staff3.getID();
        double double11 = staff3.getHourlyRate();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 40.0d + "'", double9 == 40.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 40.0d + "'", double11 == 40.0d);
    }

    @Test
    public void test24168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24168");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        staff3.logout();
        staff3.logout();
        java.lang.String str7 = staff3.getID();
        staff3.logout();
        java.lang.String str9 = staff3.getEmail();
        java.lang.String str10 = staff3.getEmail();
        staff3.logout();
        double double12 = staff3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 40.0d + "'", double12 == 40.0d);
    }

    @Test
    public void test24169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24169");
        model.Staff staff3 = new model.Staff("hi!", "", "hi!");
        java.lang.String str4 = staff3.getAccountType();
        java.lang.String str5 = staff3.getID();
        staff3.viewProfile();
        staff3.setVerified(true);
        double double9 = staff3.getHourlyRate();
        java.lang.String str10 = staff3.getPassword();
        java.lang.String str11 = staff3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "staff" + "'", str4, "staff");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 40.0d + "'", double9 == 40.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test24170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24170");
        model.Staff staff3 = new model.Staff("hi!", "staff", "");
        java.lang.String str4 = staff3.getEmail();
        double double5 = staff3.getHourlyRate();
        java.lang.String str6 = staff3.getEmail();
        java.lang.String str7 = staff3.getPassword();
        java.lang.String str8 = staff3.getAccountType();
        java.lang.String str9 = staff3.getID();
        boolean boolean10 = staff3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 40.0d + "'", double5 == 40.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "staff" + "'", str7, "staff");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "staff" + "'", str8, "staff");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test24171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24171");
        model.Staff staff3 = new model.Staff("hi!", "", "hi!");
        staff3.setVerified(false);
        staff3.viewProfile();
        java.lang.String str7 = staff3.getEmail();
        java.lang.String str8 = staff3.getAccountType();
        staff3.logout();
        boolean boolean10 = staff3.isVerified();
        staff3.login("", "hi!");
        staff3.viewProfile();
        double double15 = staff3.getHourlyRate();
        staff3.viewProfile();
        java.lang.String str17 = staff3.getAccountType();
        staff3.login("", "");
        boolean boolean21 = staff3.isVerified();
        boolean boolean22 = staff3.isVerified();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "staff" + "'", str8, "staff");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 40.0d + "'", double15 == 40.0d);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "staff" + "'", str17, "staff");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test24172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24172");
        model.Staff staff3 = new model.Staff("hi!", "", "hi!");
        java.lang.String str4 = staff3.getAccountType();
        java.lang.String str5 = staff3.getEmail();
        staff3.viewProfile();
        staff3.logout();
        staff3.login("staff", "staff");
        java.lang.String str11 = staff3.getAccountType();
        java.lang.String str12 = staff3.getAccountType();
        java.lang.String str13 = staff3.getAccountType();
        staff3.logout();
        staff3.setVerified(false);
        staff3.login("staff", "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "staff" + "'", str4, "staff");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "staff" + "'", str11, "staff");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "staff" + "'", str12, "staff");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "staff" + "'", str13, "staff");
    }

    @Test
    public void test24173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24173");
        model.Staff staff3 = new model.Staff("hi!", "", "hi!");
        java.lang.String str4 = staff3.getAccountType();
        java.lang.String str5 = staff3.getID();
        staff3.login("", "staff");
        double double9 = staff3.getHourlyRate();
        staff3.login("hi!", "");
        staff3.logout();
        java.lang.String str14 = staff3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "staff" + "'", str4, "staff");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 40.0d + "'", double9 == 40.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test24174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24174");
        model.Staff staff3 = new model.Staff("hi!", "", "hi!");
        staff3.setVerified(false);
        staff3.viewProfile();
        java.lang.String str7 = staff3.getEmail();
        java.lang.String str8 = staff3.getAccountType();
        staff3.logout();
        staff3.login("", "");
        staff3.logout();
        java.lang.String str14 = staff3.getPassword();
        staff3.login("staff", "");
        staff3.login("", "");
        double double21 = staff3.getHourlyRate();
        java.lang.String str22 = staff3.getAccountType();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "staff" + "'", str8, "staff");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 40.0d + "'", double21 == 40.0d);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "staff" + "'", str22, "staff");
    }

    @Test
    public void test24175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24175");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        double double6 = staff3.getHourlyRate();
        staff3.logout();
        staff3.viewProfile();
        java.lang.String str9 = staff3.getEmail();
        boolean boolean10 = staff3.isVerified();
        staff3.viewProfile();
        boolean boolean12 = staff3.isVerified();
        java.lang.String str13 = staff3.getAccountType();
        java.lang.String str14 = staff3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 40.0d + "'", double6 == 40.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "staff" + "'", str13, "staff");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test24176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24176");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        boolean boolean6 = staff3.isVerified();
        staff3.logout();
        java.lang.String str8 = staff3.getPassword();
        staff3.setVerified(false);
        staff3.logout();
        java.lang.String str12 = staff3.getID();
        staff3.login("", "hi!");
        java.lang.String str16 = staff3.getID();
        staff3.viewProfile();
        staff3.login("staff", "");
        java.lang.String str21 = staff3.getID();
        staff3.setVerified(false);
        java.lang.String str24 = staff3.getAccountType();
        java.lang.String str25 = staff3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "staff" + "'", str24, "staff");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "staff" + "'", str25, "staff");
    }

    @Test
    public void test24177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24177");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        staff3.logout();
        java.lang.String str5 = staff3.getID();
        java.lang.String str6 = staff3.getEmail();
        java.lang.String str7 = staff3.getPassword();
        java.lang.String str8 = staff3.getID();
        staff3.logout();
        staff3.logout();
        java.lang.String str11 = staff3.getEmail();
        staff3.viewProfile();
        staff3.logout();
        staff3.logout();
        java.lang.String str15 = staff3.getID();
        boolean boolean16 = staff3.isVerified();
        staff3.login("staff", "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test24178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24178");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        boolean boolean6 = staff3.isVerified();
        staff3.login("", "");
        double double10 = staff3.getHourlyRate();
        java.lang.String str11 = staff3.getPassword();
        boolean boolean12 = staff3.isVerified();
        java.lang.String str13 = staff3.getPassword();
        java.lang.String str14 = staff3.getID();
        double double15 = staff3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 40.0d + "'", double10 == 40.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 40.0d + "'", double15 == 40.0d);
    }

    @Test
    public void test24179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24179");
        model.Staff staff3 = new model.Staff("hi!", "", "staff");
        java.lang.String str4 = staff3.getPassword();
        double double5 = staff3.getHourlyRate();
        java.lang.String str6 = staff3.getPassword();
        double double7 = staff3.getHourlyRate();
        staff3.logout();
        staff3.login("staff", "hi!");
        staff3.setVerified(false);
        staff3.setVerified(true);
        staff3.login("", "staff");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 40.0d + "'", double5 == 40.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 40.0d + "'", double7 == 40.0d);
    }

    @Test
    public void test24180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24180");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        boolean boolean6 = staff3.isVerified();
        staff3.logout();
        staff3.setVerified(false);
        staff3.viewProfile();
        java.lang.String str11 = staff3.getEmail();
        staff3.login("staff", "hi!");
        staff3.login("hi!", "staff");
        staff3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test24181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24181");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        boolean boolean6 = staff3.isVerified();
        staff3.logout();
        java.lang.String str8 = staff3.getPassword();
        java.lang.String str9 = staff3.getPassword();
        staff3.setVerified(true);
        staff3.logout();
        staff3.viewProfile();
        java.lang.String str14 = staff3.getAccountType();
        double double15 = staff3.getHourlyRate();
        staff3.login("", "hi!");
        java.lang.String str19 = staff3.getPassword();
        java.lang.String str20 = staff3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "staff" + "'", str14, "staff");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 40.0d + "'", double15 == 40.0d);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "staff" + "'", str20, "staff");
    }

    @Test
    public void test24182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24182");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        boolean boolean5 = staff3.isVerified();
        java.lang.String str6 = staff3.getID();
        java.lang.String str7 = staff3.getID();
        java.lang.String str8 = staff3.getEmail();
        staff3.login("", "");
        boolean boolean12 = staff3.isVerified();
        boolean boolean13 = staff3.isVerified();
        staff3.logout();
        java.lang.String str15 = staff3.getAccountType();
        staff3.login("staff", "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "staff" + "'", str15, "staff");
    }

    @Test
    public void test24183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24183");
        model.Staff staff3 = new model.Staff("", "", "staff");
        staff3.login("staff", "");
        boolean boolean7 = staff3.isVerified();
        staff3.viewProfile();
        staff3.viewProfile();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test24184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24184");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        boolean boolean5 = staff3.isVerified();
        java.lang.String str6 = staff3.getAccountType();
        staff3.logout();
        java.lang.String str8 = staff3.getID();
        staff3.login("", "");
        java.lang.String str12 = staff3.getID();
        staff3.logout();
        staff3.viewProfile();
        double double15 = staff3.getHourlyRate();
        boolean boolean16 = staff3.isVerified();
        java.lang.String str17 = staff3.getAccountType();
        staff3.viewProfile();
        staff3.viewProfile();
        java.lang.Class<?> wildcardClass20 = staff3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "staff" + "'", str6, "staff");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 40.0d + "'", double15 == 40.0d);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "staff" + "'", str17, "staff");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test24185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24185");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        boolean boolean6 = staff3.isVerified();
        staff3.logout();
        staff3.setVerified(false);
        java.lang.String str10 = staff3.getID();
        java.lang.String str11 = staff3.getAccountType();
        java.lang.String str12 = staff3.getPassword();
        staff3.logout();
        staff3.viewProfile();
        java.lang.String str15 = staff3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "staff" + "'", str11, "staff");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test24186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24186");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        staff3.logout();
        java.lang.String str5 = staff3.getID();
        java.lang.String str6 = staff3.getEmail();
        double double7 = staff3.getHourlyRate();
        java.lang.String str8 = staff3.getEmail();
        java.lang.String str9 = staff3.getID();
        java.lang.String str10 = staff3.getID();
        boolean boolean11 = staff3.isVerified();
        boolean boolean12 = staff3.isVerified();
        staff3.setVerified(false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 40.0d + "'", double7 == 40.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test24187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24187");
        model.Staff staff3 = new model.Staff("hi!", "staff", "");
        staff3.logout();
        staff3.logout();
        staff3.logout();
        double double7 = staff3.getHourlyRate();
        boolean boolean8 = staff3.isVerified();
        double double9 = staff3.getHourlyRate();
        boolean boolean10 = staff3.isVerified();
        java.lang.String str11 = staff3.getPassword();
        java.lang.String str12 = staff3.getPassword();
        staff3.logout();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 40.0d + "'", double7 == 40.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 40.0d + "'", double9 == 40.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "staff" + "'", str11, "staff");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "staff" + "'", str12, "staff");
    }

    @Test
    public void test24188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24188");
        model.Staff staff3 = new model.Staff("hi!", "", "hi!");
        staff3.setVerified(false);
        staff3.viewProfile();
        java.lang.String str7 = staff3.getEmail();
        java.lang.String str8 = staff3.getAccountType();
        staff3.logout();
        boolean boolean10 = staff3.isVerified();
        staff3.login("", "hi!");
        double double14 = staff3.getHourlyRate();
        java.lang.String str15 = staff3.getAccountType();
        staff3.viewProfile();
        double double17 = staff3.getHourlyRate();
        java.lang.String str18 = staff3.getAccountType();
        staff3.viewProfile();
        staff3.viewProfile();
        java.lang.String str21 = staff3.getPassword();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "staff" + "'", str8, "staff");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 40.0d + "'", double14 == 40.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "staff" + "'", str15, "staff");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 40.0d + "'", double17 == 40.0d);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "staff" + "'", str18, "staff");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test24189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24189");
        model.Staff staff3 = new model.Staff("hi!", "", "hi!");
        staff3.logout();
        staff3.login("hi!", "hi!");
        java.lang.String str8 = staff3.getID();
        boolean boolean9 = staff3.isVerified();
        staff3.setVerified(true);
        java.lang.String str12 = staff3.getPassword();
        java.lang.String str13 = staff3.getPassword();
        staff3.login("", "");
        java.lang.String str17 = staff3.getPassword();
        staff3.logout();
        java.lang.Class<?> wildcardClass19 = staff3.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test24190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24190");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        boolean boolean5 = staff3.isVerified();
        java.lang.String str6 = staff3.getID();
        java.lang.String str7 = staff3.getID();
        staff3.login("hi!", "");
        java.lang.String str11 = staff3.getPassword();
        staff3.setVerified(false);
        double double14 = staff3.getHourlyRate();
        java.lang.String str15 = staff3.getPassword();
        staff3.login("", "staff");
        java.lang.Class<?> wildcardClass19 = staff3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 40.0d + "'", double14 == 40.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test24191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24191");
        model.Staff staff3 = new model.Staff("hi!", "", "hi!");
        staff3.logout();
        boolean boolean5 = staff3.isVerified();
        staff3.setVerified(true);
        staff3.viewProfile();
        java.lang.String str9 = staff3.getPassword();
        boolean boolean10 = staff3.isVerified();
        staff3.login("staff", "staff");
        java.lang.String str14 = staff3.getEmail();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test24192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24192");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        staff3.logout();
        java.lang.String str5 = staff3.getID();
        java.lang.String str6 = staff3.getPassword();
        staff3.logout();
        staff3.login("staff", "hi!");
        java.lang.String str11 = staff3.getAccountType();
        java.lang.String str12 = staff3.getEmail();
        double double13 = staff3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "staff" + "'", str11, "staff");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 40.0d + "'", double13 == 40.0d);
    }

    @Test
    public void test24193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24193");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        boolean boolean5 = staff3.isVerified();
        java.lang.String str6 = staff3.getID();
        boolean boolean7 = staff3.isVerified();
        java.lang.String str8 = staff3.getEmail();
        staff3.setVerified(true);
        double double11 = staff3.getHourlyRate();
        java.lang.String str12 = staff3.getID();
        java.lang.String str13 = staff3.getAccountType();
        staff3.logout();
        java.lang.String str15 = staff3.getEmail();
        staff3.setVerified(true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 40.0d + "'", double11 == 40.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "staff" + "'", str13, "staff");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test24194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24194");
        model.Staff staff3 = new model.Staff("staff", "", "");
        staff3.logout();
        double double5 = staff3.getHourlyRate();
        java.lang.String str6 = staff3.getAccountType();
        java.lang.String str7 = staff3.getID();
        boolean boolean8 = staff3.isVerified();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 40.0d + "'", double5 == 40.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "staff" + "'", str6, "staff");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test24195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24195");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        boolean boolean5 = staff3.isVerified();
        java.lang.String str6 = staff3.getID();
        staff3.setVerified(false);
        java.lang.String str9 = staff3.getID();
        staff3.setVerified(false);
        java.lang.String str12 = staff3.getID();
        double double13 = staff3.getHourlyRate();
        boolean boolean14 = staff3.isVerified();
        staff3.viewProfile();
        boolean boolean16 = staff3.isVerified();
        double double17 = staff3.getHourlyRate();
        staff3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 40.0d + "'", double13 == 40.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 40.0d + "'", double17 == 40.0d);
    }

    @Test
    public void test24196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24196");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        staff3.login("", "");
        double double7 = staff3.getHourlyRate();
        boolean boolean8 = staff3.isVerified();
        java.lang.String str9 = staff3.getEmail();
        staff3.setVerified(true);
        staff3.viewProfile();
        staff3.login("hi!", "hi!");
        java.lang.String str16 = staff3.getID();
        staff3.viewProfile();
        staff3.login("hi!", "");
        java.lang.String str21 = staff3.getEmail();
        java.lang.String str22 = staff3.getID();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 40.0d + "'", double7 == 40.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
    }

    @Test
    public void test24197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24197");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        boolean boolean5 = staff3.isVerified();
        java.lang.String str6 = staff3.getID();
        boolean boolean7 = staff3.isVerified();
        staff3.logout();
        java.lang.String str9 = staff3.getID();
        staff3.setVerified(true);
        staff3.viewProfile();
        double double13 = staff3.getHourlyRate();
        staff3.login("", "");
        java.lang.String str17 = staff3.getEmail();
        java.lang.String str18 = staff3.getEmail();
        java.lang.String str19 = staff3.getAccountType();
        boolean boolean20 = staff3.isVerified();
        java.lang.String str21 = staff3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 40.0d + "'", double13 == 40.0d);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "staff" + "'", str19, "staff");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
    }

    @Test
    public void test24198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24198");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        staff3.login("", "");
        staff3.viewProfile();
        staff3.viewProfile();
        staff3.login("", "");
        staff3.logout();
        java.lang.String str13 = staff3.getID();
        boolean boolean14 = staff3.isVerified();
        java.lang.String str15 = staff3.getEmail();
        staff3.viewProfile();
        java.lang.String str17 = staff3.getPassword();
        java.lang.String str18 = staff3.getID();
        java.lang.String str19 = staff3.getEmail();
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test24199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24199");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        double double6 = staff3.getHourlyRate();
        java.lang.String str7 = staff3.getPassword();
        staff3.login("", "staff");
        boolean boolean11 = staff3.isVerified();
        double double12 = staff3.getHourlyRate();
        java.lang.String str13 = staff3.getAccountType();
        java.lang.String str14 = staff3.getPassword();
        staff3.login("hi!", "hi!");
        java.lang.String str18 = staff3.getID();
        java.lang.String str19 = staff3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 40.0d + "'", double6 == 40.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 40.0d + "'", double12 == 40.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "staff" + "'", str13, "staff");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test24200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24200");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        boolean boolean6 = staff3.isVerified();
        staff3.logout();
        staff3.setVerified(false);
        java.lang.String str10 = staff3.getID();
        double double11 = staff3.getHourlyRate();
        java.lang.String str12 = staff3.getPassword();
        staff3.login("hi!", "hi!");
        java.lang.String str16 = staff3.getEmail();
        java.lang.String str17 = staff3.getID();
        java.lang.Class<?> wildcardClass18 = staff3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 40.0d + "'", double11 == 40.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test24201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24201");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        boolean boolean6 = staff3.isVerified();
        staff3.logout();
        staff3.setVerified(false);
        java.lang.String str10 = staff3.getID();
        java.lang.String str11 = staff3.getAccountType();
        java.lang.String str12 = staff3.getPassword();
        staff3.logout();
        staff3.setVerified(false);
        double double16 = staff3.getHourlyRate();
        staff3.setVerified(false);
        java.lang.String str19 = staff3.getID();
        staff3.setVerified(false);
        double double22 = staff3.getHourlyRate();
        staff3.logout();
        java.lang.String str24 = staff3.getEmail();
        java.lang.String str25 = staff3.getEmail();
        java.lang.String str26 = staff3.getAccountType();
        staff3.login("", "staff");
        staff3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "staff" + "'", str11, "staff");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 40.0d + "'", double16 == 40.0d);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 40.0d + "'", double22 == 40.0d);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "staff" + "'", str26, "staff");
    }

    @Test
    public void test24202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24202");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        boolean boolean6 = staff3.isVerified();
        staff3.logout();
        java.lang.String str8 = staff3.getPassword();
        staff3.setVerified(false);
        staff3.logout();
        staff3.viewProfile();
        staff3.logout();
        java.lang.String str14 = staff3.getEmail();
        java.lang.String str15 = staff3.getPassword();
        staff3.setVerified(false);
        java.lang.Class<?> wildcardClass18 = staff3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test24203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24203");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        staff3.logout();
        java.lang.String str5 = staff3.getID();
        java.lang.String str6 = staff3.getEmail();
        java.lang.String str7 = staff3.getPassword();
        java.lang.String str8 = staff3.getID();
        staff3.logout();
        java.lang.String str10 = staff3.getPassword();
        staff3.login("", "");
        staff3.setVerified(false);
        java.lang.String str16 = staff3.getPassword();
        staff3.logout();
        java.lang.String str18 = staff3.getAccountType();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "staff" + "'", str18, "staff");
    }

    @Test
    public void test24204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24204");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        staff3.login("", "");
        double double7 = staff3.getHourlyRate();
        staff3.login("staff", "staff");
        java.lang.String str11 = staff3.getID();
        java.lang.String str12 = staff3.getAccountType();
        staff3.login("", "staff");
        staff3.login("hi!", "");
        staff3.viewProfile();
        double double20 = staff3.getHourlyRate();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 40.0d + "'", double7 == 40.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "staff" + "'", str12, "staff");
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 40.0d + "'", double20 == 40.0d);
    }

    @Test
    public void test24205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24205");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        boolean boolean6 = staff3.isVerified();
        staff3.logout();
        java.lang.String str8 = staff3.getPassword();
        staff3.setVerified(false);
        staff3.logout();
        java.lang.String str12 = staff3.getID();
        staff3.login("", "hi!");
        java.lang.String str16 = staff3.getID();
        staff3.viewProfile();
        staff3.login("staff", "");
        java.lang.String str21 = staff3.getID();
        staff3.setVerified(false);
        java.lang.String str24 = staff3.getAccountType();
        java.lang.String str25 = staff3.getPassword();
        java.lang.String str26 = staff3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "staff" + "'", str24, "staff");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "staff" + "'", str26, "staff");
    }

    @Test
    public void test24206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24206");
        model.Staff staff3 = new model.Staff("hi!", "hi!", "");
        java.lang.String str4 = staff3.getAccountType();
        java.lang.String str5 = staff3.getID();
        staff3.viewProfile();
        java.lang.String str7 = staff3.getEmail();
        java.lang.String str8 = staff3.getID();
        double double9 = staff3.getHourlyRate();
        staff3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "staff" + "'", str4, "staff");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 40.0d + "'", double9 == 40.0d);
    }

    @Test
    public void test24207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24207");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        boolean boolean6 = staff3.isVerified();
        staff3.logout();
        staff3.setVerified(false);
        java.lang.String str10 = staff3.getID();
        staff3.viewProfile();
        staff3.login("", "");
        java.lang.String str15 = staff3.getPassword();
        java.lang.String str16 = staff3.getID();
        java.lang.String str17 = staff3.getID();
        java.lang.String str18 = staff3.getAccountType();
        staff3.logout();
        staff3.logout();
        java.lang.String str21 = staff3.getEmail();
        staff3.setVerified(true);
        boolean boolean24 = staff3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "staff" + "'", str18, "staff");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test24208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24208");
        model.Staff staff3 = new model.Staff("staff", "", "hi!");
        java.lang.String str4 = staff3.getAccountType();
        staff3.setVerified(false);
        staff3.setVerified(true);
        java.lang.String str9 = staff3.getEmail();
        double double10 = staff3.getHourlyRate();
        double double11 = staff3.getHourlyRate();
        staff3.logout();
        staff3.setVerified(true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "staff" + "'", str4, "staff");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "staff" + "'", str9, "staff");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 40.0d + "'", double10 == 40.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 40.0d + "'", double11 == 40.0d);
    }

    @Test
    public void test24209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24209");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        boolean boolean5 = staff3.isVerified();
        java.lang.String str6 = staff3.getAccountType();
        staff3.logout();
        java.lang.String str8 = staff3.getEmail();
        staff3.viewProfile();
        java.lang.String str10 = staff3.getID();
        java.lang.String str11 = staff3.getPassword();
        boolean boolean12 = staff3.isVerified();
        java.lang.String str13 = staff3.getEmail();
        staff3.login("staff", "staff");
        staff3.login("", "");
        java.lang.String str20 = staff3.getEmail();
        staff3.login("hi!", "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "staff" + "'", str6, "staff");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test24210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24210");
        model.Staff staff3 = new model.Staff("hi!", "", "hi!");
        staff3.setVerified(false);
        java.lang.String str6 = staff3.getPassword();
        java.lang.String str7 = staff3.getAccountType();
        java.lang.String str8 = staff3.getEmail();
        staff3.setVerified(true);
        boolean boolean11 = staff3.isVerified();
        java.lang.String str12 = staff3.getPassword();
        boolean boolean13 = staff3.isVerified();
        java.lang.String str14 = staff3.getEmail();
        double double15 = staff3.getHourlyRate();
        java.lang.String str16 = staff3.getAccountType();
        staff3.setVerified(false);
        staff3.logout();
        java.lang.String str20 = staff3.getEmail();
        staff3.logout();
        staff3.login("staff", "staff");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "staff" + "'", str7, "staff");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 40.0d + "'", double15 == 40.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "staff" + "'", str16, "staff");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test24211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24211");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        boolean boolean5 = staff3.isVerified();
        java.lang.String str6 = staff3.getID();
        java.lang.String str7 = staff3.getID();
        staff3.setVerified(true);
        java.lang.String str10 = staff3.getAccountType();
        java.lang.String str11 = staff3.getPassword();
        staff3.login("", "");
        double double15 = staff3.getHourlyRate();
        boolean boolean16 = staff3.isVerified();
        boolean boolean17 = staff3.isVerified();
        java.lang.String str18 = staff3.getEmail();
        java.lang.String str19 = staff3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "staff" + "'", str10, "staff");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 40.0d + "'", double15 == 40.0d);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test24212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24212");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        staff3.logout();
        java.lang.String str5 = staff3.getID();
        java.lang.String str6 = staff3.getPassword();
        staff3.logout();
        java.lang.String str8 = staff3.getPassword();
        java.lang.String str9 = staff3.getPassword();
        staff3.setVerified(true);
        double double12 = staff3.getHourlyRate();
        staff3.viewProfile();
        java.lang.String str14 = staff3.getAccountType();
        staff3.logout();
        staff3.setVerified(true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 40.0d + "'", double12 == 40.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "staff" + "'", str14, "staff");
    }

    @Test
    public void test24213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24213");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        boolean boolean6 = staff3.isVerified();
        staff3.logout();
        java.lang.String str8 = staff3.getAccountType();
        staff3.setVerified(false);
        staff3.viewProfile();
        java.lang.String str12 = staff3.getEmail();
        staff3.login("staff", "");
        staff3.logout();
        java.lang.String str17 = staff3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "staff" + "'", str8, "staff");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test24214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24214");
        model.Staff staff3 = new model.Staff("hi!", "", "hi!");
        staff3.setVerified(false);
        java.lang.String str6 = staff3.getEmail();
        java.lang.String str7 = staff3.getAccountType();
        java.lang.String str8 = staff3.getID();
        java.lang.String str9 = staff3.getPassword();
        staff3.logout();
        java.lang.String str11 = staff3.getPassword();
        boolean boolean12 = staff3.isVerified();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "staff" + "'", str7, "staff");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test24215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24215");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        boolean boolean6 = staff3.isVerified();
        staff3.logout();
        staff3.setVerified(false);
        java.lang.String str10 = staff3.getID();
        staff3.viewProfile();
        staff3.login("", "");
        java.lang.String str15 = staff3.getPassword();
        java.lang.String str16 = staff3.getID();
        java.lang.String str17 = staff3.getID();
        java.lang.String str18 = staff3.getAccountType();
        staff3.login("hi!", "staff");
        staff3.viewProfile();
        staff3.viewProfile();
        java.lang.String str24 = staff3.getEmail();
        double double25 = staff3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "staff" + "'", str18, "staff");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 40.0d + "'", double25 == 40.0d);
    }

    @Test
    public void test24216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24216");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        boolean boolean6 = staff3.isVerified();
        staff3.logout();
        staff3.setVerified(false);
        java.lang.String str10 = staff3.getID();
        staff3.viewProfile();
        java.lang.String str12 = staff3.getID();
        java.lang.String str13 = staff3.getAccountType();
        java.lang.String str14 = staff3.getEmail();
        staff3.login("hi!", "");
        boolean boolean18 = staff3.isVerified();
        staff3.setVerified(false);
        java.lang.String str21 = staff3.getEmail();
        java.lang.String str22 = staff3.getEmail();
        staff3.setVerified(false);
        java.lang.String str25 = staff3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "staff" + "'", str13, "staff");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
    }

    @Test
    public void test24217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24217");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        boolean boolean5 = staff3.isVerified();
        java.lang.String str6 = staff3.getID();
        java.lang.String str7 = staff3.getID();
        staff3.login("hi!", "");
        staff3.login("hi!", "");
        staff3.logout();
        java.lang.String str15 = staff3.getAccountType();
        staff3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "staff" + "'", str15, "staff");
    }

    @Test
    public void test24218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24218");
        model.Staff staff3 = new model.Staff("hi!", "hi!", "");
        java.lang.String str4 = staff3.getAccountType();
        java.lang.String str5 = staff3.getID();
        staff3.viewProfile();
        java.lang.String str7 = staff3.getID();
        staff3.setVerified(true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "staff" + "'", str4, "staff");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test24219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24219");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        boolean boolean5 = staff3.isVerified();
        java.lang.String str6 = staff3.getID();
        staff3.setVerified(false);
        java.lang.String str9 = staff3.getID();
        staff3.setVerified(false);
        staff3.logout();
        staff3.setVerified(false);
        java.lang.String str15 = staff3.getPassword();
        staff3.setVerified(true);
        double double18 = staff3.getHourlyRate();
        staff3.viewProfile();
        staff3.viewProfile();
        java.lang.Class<?> wildcardClass21 = staff3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 40.0d + "'", double18 == 40.0d);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test24220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24220");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        boolean boolean6 = staff3.isVerified();
        staff3.logout();
        java.lang.String str8 = staff3.getPassword();
        staff3.setVerified(false);
        staff3.logout();
        java.lang.String str12 = staff3.getID();
        java.lang.String str13 = staff3.getAccountType();
        staff3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "staff" + "'", str13, "staff");
    }

    @Test
    public void test24221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24221");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        boolean boolean6 = staff3.isVerified();
        staff3.logout();
        staff3.setVerified(false);
        java.lang.String str10 = staff3.getID();
        staff3.viewProfile();
        staff3.viewProfile();
        java.lang.String str13 = staff3.getID();
        boolean boolean14 = staff3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test24222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24222");
        model.Staff staff3 = new model.Staff("hi!", "", "hi!");
        staff3.logout();
        staff3.login("hi!", "hi!");
        double double8 = staff3.getHourlyRate();
        staff3.login("", "hi!");
        staff3.logout();
        staff3.login("hi!", "hi!");
        double double16 = staff3.getHourlyRate();
        java.lang.String str17 = staff3.getPassword();
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 40.0d + "'", double8 == 40.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 40.0d + "'", double16 == 40.0d);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test24223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24223");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        boolean boolean5 = staff3.isVerified();
        java.lang.String str6 = staff3.getID();
        staff3.setVerified(false);
        java.lang.String str9 = staff3.getID();
        staff3.setVerified(false);
        java.lang.String str12 = staff3.getID();
        java.lang.String str13 = staff3.getID();
        java.lang.String str14 = staff3.getEmail();
        java.lang.String str15 = staff3.getAccountType();
        boolean boolean16 = staff3.isVerified();
        java.lang.String str17 = staff3.getID();
        staff3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "staff" + "'", str15, "staff");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test24224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24224");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        boolean boolean5 = staff3.isVerified();
        java.lang.String str6 = staff3.getID();
        staff3.login("", "staff");
        staff3.login("hi!", "hi!");
        java.lang.String str13 = staff3.getAccountType();
        java.lang.String str14 = staff3.getEmail();
        java.lang.String str15 = staff3.getPassword();
        java.lang.String str16 = staff3.getAccountType();
        staff3.viewProfile();
        java.lang.String str18 = staff3.getAccountType();
        java.lang.String str19 = staff3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "staff" + "'", str13, "staff");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "staff" + "'", str16, "staff");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "staff" + "'", str18, "staff");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test24225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24225");
        model.Staff staff3 = new model.Staff("staff", "hi!", "staff");
        boolean boolean4 = staff3.isVerified();
        java.lang.String str5 = staff3.getAccountType();
        java.lang.String str6 = staff3.getID();
        boolean boolean7 = staff3.isVerified();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "staff" + "'", str6, "staff");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test24226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24226");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        boolean boolean6 = staff3.isVerified();
        staff3.logout();
        staff3.setVerified(false);
        java.lang.String str10 = staff3.getID();
        staff3.viewProfile();
        java.lang.String str12 = staff3.getID();
        staff3.setVerified(false);
        boolean boolean15 = staff3.isVerified();
        staff3.logout();
        java.lang.String str17 = staff3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test24227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24227");
        model.Staff staff3 = new model.Staff("hi!", "", "hi!");
        java.lang.String str4 = staff3.getAccountType();
        java.lang.String str5 = staff3.getID();
        staff3.login("", "staff");
        java.lang.String str9 = staff3.getEmail();
        java.lang.String str10 = staff3.getAccountType();
        staff3.logout();
        double double12 = staff3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "staff" + "'", str4, "staff");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "staff" + "'", str10, "staff");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 40.0d + "'", double12 == 40.0d);
    }

    @Test
    public void test24228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24228");
        model.Staff staff3 = new model.Staff("hi!", "", "hi!");
        staff3.logout();
        java.lang.String str5 = staff3.getAccountType();
        java.lang.String str6 = staff3.getID();
        java.lang.Class<?> wildcardClass7 = staff3.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test24229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24229");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        boolean boolean5 = staff3.isVerified();
        java.lang.String str6 = staff3.getID();
        java.lang.String str7 = staff3.getID();
        staff3.setVerified(true);
        java.lang.String str10 = staff3.getEmail();
        staff3.setVerified(true);
        java.lang.String str13 = staff3.getAccountType();
        java.lang.String str14 = staff3.getPassword();
        java.lang.String str15 = staff3.getEmail();
        java.lang.String str16 = staff3.getPassword();
        staff3.login("", "staff");
        double double20 = staff3.getHourlyRate();
        staff3.login("", "");
        staff3.setVerified(true);
        java.lang.String str26 = staff3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "staff" + "'", str13, "staff");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 40.0d + "'", double20 == 40.0d);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "staff" + "'", str26, "staff");
    }

    @Test
    public void test24230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24230");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        boolean boolean5 = staff3.isVerified();
        java.lang.String str6 = staff3.getAccountType();
        staff3.logout();
        double double8 = staff3.getHourlyRate();
        java.lang.String str9 = staff3.getEmail();
        java.lang.String str10 = staff3.getAccountType();
        staff3.setVerified(true);
        staff3.login("hi!", "");
        java.lang.String str16 = staff3.getAccountType();
        staff3.logout();
        java.lang.String str18 = staff3.getEmail();
        boolean boolean19 = staff3.isVerified();
        java.lang.String str20 = staff3.getPassword();
        staff3.logout();
        staff3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "staff" + "'", str6, "staff");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 40.0d + "'", double8 == 40.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "staff" + "'", str10, "staff");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "staff" + "'", str16, "staff");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test24231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24231");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        java.lang.String str6 = staff3.getPassword();
        staff3.setVerified(false);
        staff3.setVerified(false);
        java.lang.String str11 = staff3.getAccountType();
        staff3.logout();
        staff3.login("", "hi!");
        boolean boolean16 = staff3.isVerified();
        double double17 = staff3.getHourlyRate();
        staff3.logout();
        staff3.login("hi!", "hi!");
        staff3.login("staff", "");
        staff3.setVerified(false);
        staff3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "staff" + "'", str11, "staff");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 40.0d + "'", double17 == 40.0d);
    }

    @Test
    public void test24232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24232");
        model.Staff staff3 = new model.Staff("hi!", "", "hi!");
        staff3.logout();
        staff3.login("hi!", "hi!");
        double double8 = staff3.getHourlyRate();
        boolean boolean9 = staff3.isVerified();
        java.lang.String str10 = staff3.getAccountType();
        java.lang.String str11 = staff3.getAccountType();
        double double12 = staff3.getHourlyRate();
        double double13 = staff3.getHourlyRate();
        staff3.login("hi!", "");
        java.lang.String str17 = staff3.getAccountType();
        staff3.viewProfile();
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 40.0d + "'", double8 == 40.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "staff" + "'", str10, "staff");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "staff" + "'", str11, "staff");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 40.0d + "'", double12 == 40.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 40.0d + "'", double13 == 40.0d);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "staff" + "'", str17, "staff");
    }

    @Test
    public void test24233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24233");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        boolean boolean5 = staff3.isVerified();
        java.lang.String str6 = staff3.getID();
        java.lang.String str7 = staff3.getID();
        staff3.setVerified(true);
        java.lang.String str10 = staff3.getEmail();
        staff3.setVerified(true);
        staff3.logout();
        java.lang.String str14 = staff3.getAccountType();
        java.lang.String str15 = staff3.getID();
        staff3.logout();
        java.lang.String str17 = staff3.getEmail();
        staff3.setVerified(true);
        staff3.login("staff", "");
        double double23 = staff3.getHourlyRate();
        double double24 = staff3.getHourlyRate();
        staff3.login("hi!", "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "staff" + "'", str14, "staff");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 40.0d + "'", double23 == 40.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 40.0d + "'", double24 == 40.0d);
    }

    @Test
    public void test24234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24234");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        boolean boolean5 = staff3.isVerified();
        java.lang.String str6 = staff3.getAccountType();
        staff3.logout();
        java.lang.String str8 = staff3.getEmail();
        staff3.viewProfile();
        java.lang.String str10 = staff3.getID();
        staff3.logout();
        staff3.login("staff", "");
        java.lang.String str15 = staff3.getEmail();
        java.lang.String str16 = staff3.getID();
        java.lang.String str17 = staff3.getPassword();
        staff3.viewProfile();
        double double19 = staff3.getHourlyRate();
        boolean boolean20 = staff3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "staff" + "'", str6, "staff");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 40.0d + "'", double19 == 40.0d);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test24235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24235");
        model.Staff staff3 = new model.Staff("", "hi!", "hi!");
        java.lang.String str4 = staff3.getAccountType();
        staff3.viewProfile();
        staff3.logout();
        java.lang.String str7 = staff3.getPassword();
        java.lang.String str8 = staff3.getID();
        staff3.login("hi!", "hi!");
        staff3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "staff" + "'", str4, "staff");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test24236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24236");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        boolean boolean6 = staff3.isVerified();
        staff3.logout();
        java.lang.String str8 = staff3.getAccountType();
        java.lang.String str9 = staff3.getAccountType();
        java.lang.String str10 = staff3.getID();
        staff3.setVerified(true);
        staff3.viewProfile();
        java.lang.String str14 = staff3.getID();
        staff3.logout();
        java.lang.String str16 = staff3.getEmail();
        java.lang.String str17 = staff3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "staff" + "'", str8, "staff");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "staff" + "'", str9, "staff");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "staff" + "'", str17, "staff");
    }

    @Test
    public void test24237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24237");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        boolean boolean5 = staff3.isVerified();
        java.lang.String str6 = staff3.getID();
        java.lang.String str7 = staff3.getID();
        staff3.login("hi!", "");
        java.lang.String str11 = staff3.getPassword();
        boolean boolean12 = staff3.isVerified();
        staff3.login("", "staff");
        staff3.login("", "staff");
        staff3.logout();
        staff3.setVerified(false);
        double double22 = staff3.getHourlyRate();
        java.lang.String str23 = staff3.getID();
        staff3.setVerified(true);
        staff3.viewProfile();
        staff3.viewProfile();
        java.lang.String str28 = staff3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 40.0d + "'", double22 == 40.0d);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
    }

    @Test
    public void test24238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24238");
        model.Staff staff3 = new model.Staff("hi!", "", "hi!");
        staff3.logout();
        staff3.login("hi!", "hi!");
        staff3.viewProfile();
        java.lang.String str9 = staff3.getPassword();
        java.lang.String str10 = staff3.getID();
        staff3.logout();
        staff3.login("", "staff");
        java.lang.String str15 = staff3.getID();
        java.lang.String str16 = staff3.getEmail();
        double double17 = staff3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 40.0d + "'", double17 == 40.0d);
    }

    @Test
    public void test24239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24239");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        staff3.logout();
        java.lang.String str5 = staff3.getID();
        java.lang.String str6 = staff3.getEmail();
        double double7 = staff3.getHourlyRate();
        java.lang.String str8 = staff3.getEmail();
        java.lang.String str9 = staff3.getID();
        staff3.setVerified(true);
        double double12 = staff3.getHourlyRate();
        java.lang.String str13 = staff3.getEmail();
        staff3.setVerified(false);
        staff3.viewProfile();
        java.lang.Class<?> wildcardClass17 = staff3.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 40.0d + "'", double7 == 40.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 40.0d + "'", double12 == 40.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test24240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24240");
        model.Staff staff3 = new model.Staff("", "staff", "staff");
        staff3.viewProfile();
        staff3.viewProfile();
        java.lang.String str6 = staff3.getEmail();
        java.lang.String str7 = staff3.getAccountType();
        java.lang.String str8 = staff3.getAccountType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "staff" + "'", str7, "staff");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "staff" + "'", str8, "staff");
    }

    @Test
    public void test24241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24241");
        model.Staff staff3 = new model.Staff("hi!", "", "hi!");
        staff3.logout();
        staff3.login("hi!", "hi!");
        double double8 = staff3.getHourlyRate();
        boolean boolean9 = staff3.isVerified();
        staff3.setVerified(false);
        java.lang.String str12 = staff3.getPassword();
        boolean boolean13 = staff3.isVerified();
        java.lang.String str14 = staff3.getEmail();
        staff3.login("", "");
        staff3.viewProfile();
        java.lang.String str19 = staff3.getID();
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 40.0d + "'", double8 == 40.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test24242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24242");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        boolean boolean5 = staff3.isVerified();
        java.lang.String str6 = staff3.getAccountType();
        java.lang.String str7 = staff3.getAccountType();
        java.lang.String str8 = staff3.getEmail();
        staff3.logout();
        java.lang.String str10 = staff3.getEmail();
        java.lang.String str11 = staff3.getAccountType();
        staff3.setVerified(false);
        java.lang.String str14 = staff3.getPassword();
        java.lang.String str15 = staff3.getAccountType();
        boolean boolean16 = staff3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "staff" + "'", str6, "staff");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "staff" + "'", str7, "staff");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "staff" + "'", str11, "staff");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "staff" + "'", str15, "staff");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test24243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24243");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        boolean boolean6 = staff3.isVerified();
        staff3.logout();
        java.lang.String str8 = staff3.getPassword();
        java.lang.String str9 = staff3.getPassword();
        staff3.logout();
        java.lang.String str11 = staff3.getEmail();
        java.lang.String str12 = staff3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test24244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24244");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        boolean boolean5 = staff3.isVerified();
        java.lang.String str6 = staff3.getID();
        java.lang.String str7 = staff3.getID();
        staff3.setVerified(true);
        java.lang.String str10 = staff3.getEmail();
        staff3.setVerified(true);
        staff3.setVerified(true);
        staff3.logout();
        java.lang.String str16 = staff3.getID();
        double double17 = staff3.getHourlyRate();
        staff3.logout();
        boolean boolean19 = staff3.isVerified();
        boolean boolean20 = staff3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 40.0d + "'", double17 == 40.0d);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test24245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24245");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        boolean boolean6 = staff3.isVerified();
        staff3.logout();
        java.lang.String str8 = staff3.getPassword();
        java.lang.String str9 = staff3.getPassword();
        staff3.logout();
        staff3.viewProfile();
        staff3.logout();
        java.lang.String str13 = staff3.getEmail();
        boolean boolean14 = staff3.isVerified();
        staff3.setVerified(true);
        staff3.login("staff", "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test24246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24246");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        staff3.logout();
        java.lang.String str5 = staff3.getID();
        java.lang.String str6 = staff3.getEmail();
        java.lang.String str7 = staff3.getPassword();
        java.lang.String str8 = staff3.getID();
        staff3.logout();
        staff3.logout();
        staff3.viewProfile();
        java.lang.String str12 = staff3.getID();
        double double13 = staff3.getHourlyRate();
        staff3.login("hi!", "");
        staff3.login("hi!", "");
        staff3.setVerified(true);
        staff3.viewProfile();
        boolean boolean23 = staff3.isVerified();
        boolean boolean24 = staff3.isVerified();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 40.0d + "'", double13 == 40.0d);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test24247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24247");
        model.Staff staff3 = new model.Staff("hi!", "staff", "");
        java.lang.String str4 = staff3.getEmail();
        double double5 = staff3.getHourlyRate();
        staff3.login("", "staff");
        staff3.setVerified(true);
        boolean boolean11 = staff3.isVerified();
        java.lang.String str12 = staff3.getID();
        java.lang.String str13 = staff3.getEmail();
        java.lang.String str14 = staff3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 40.0d + "'", double5 == 40.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test24248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24248");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        boolean boolean5 = staff3.isVerified();
        java.lang.String str6 = staff3.getID();
        java.lang.String str7 = staff3.getID();
        staff3.login("hi!", "");
        staff3.login("hi!", "staff");
        staff3.viewProfile();
        staff3.logout();
        java.lang.String str16 = staff3.getAccountType();
        java.lang.String str17 = staff3.getEmail();
        java.lang.String str18 = staff3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "staff" + "'", str16, "staff");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "staff" + "'", str18, "staff");
    }

    @Test
    public void test24249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24249");
        model.Staff staff3 = new model.Staff("hi!", "staff", "");
        staff3.logout();
        staff3.logout();
        staff3.logout();
        double double7 = staff3.getHourlyRate();
        boolean boolean8 = staff3.isVerified();
        double double9 = staff3.getHourlyRate();
        boolean boolean10 = staff3.isVerified();
        java.lang.String str11 = staff3.getPassword();
        staff3.viewProfile();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 40.0d + "'", double7 == 40.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 40.0d + "'", double9 == 40.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "staff" + "'", str11, "staff");
    }

    @Test
    public void test24250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24250");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        boolean boolean5 = staff3.isVerified();
        java.lang.String str6 = staff3.getID();
        boolean boolean7 = staff3.isVerified();
        staff3.logout();
        java.lang.String str9 = staff3.getID();
        staff3.login("hi!", "");
        staff3.logout();
        staff3.viewProfile();
        staff3.login("hi!", "");
        boolean boolean18 = staff3.isVerified();
        staff3.logout();
        java.lang.Class<?> wildcardClass20 = staff3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test24251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24251");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        staff3.login("", "");
        staff3.viewProfile();
        staff3.viewProfile();
        staff3.login("", "");
        staff3.viewProfile();
        boolean boolean13 = staff3.isVerified();
        boolean boolean14 = staff3.isVerified();
        double double15 = staff3.getHourlyRate();
        double double16 = staff3.getHourlyRate();
        staff3.setVerified(false);
        staff3.setVerified(false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 40.0d + "'", double15 == 40.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 40.0d + "'", double16 == 40.0d);
    }

    @Test
    public void test24252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24252");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        boolean boolean6 = staff3.isVerified();
        staff3.logout();
        java.lang.String str8 = staff3.getPassword();
        java.lang.String str9 = staff3.getPassword();
        staff3.setVerified(true);
        staff3.logout();
        staff3.logout();
        staff3.viewProfile();
        java.lang.String str15 = staff3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test24253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24253");
        model.Staff staff3 = new model.Staff("hi!", "", "hi!");
        staff3.logout();
        staff3.login("hi!", "hi!");
        staff3.viewProfile();
        staff3.login("", "staff");
        staff3.login("", "staff");
        java.lang.String str15 = staff3.getEmail();
        double double16 = staff3.getHourlyRate();
        java.lang.String str17 = staff3.getPassword();
        staff3.login("", "");
        java.lang.Class<?> wildcardClass21 = staff3.getClass();
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 40.0d + "'", double16 == 40.0d);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test24254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24254");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        boolean boolean5 = staff3.isVerified();
        java.lang.String str6 = staff3.getID();
        java.lang.String str7 = staff3.getID();
        double double8 = staff3.getHourlyRate();
        java.lang.String str9 = staff3.getID();
        java.lang.String str10 = staff3.getEmail();
        staff3.login("hi!", "");
        staff3.login("", "hi!");
        staff3.viewProfile();
        staff3.logout();
        double double19 = staff3.getHourlyRate();
        boolean boolean20 = staff3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 40.0d + "'", double8 == 40.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 40.0d + "'", double19 == 40.0d);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test24255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24255");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        boolean boolean6 = staff3.isVerified();
        staff3.logout();
        java.lang.String str8 = staff3.getAccountType();
        staff3.logout();
        java.lang.String str10 = staff3.getEmail();
        java.lang.String str11 = staff3.getID();
        double double12 = staff3.getHourlyRate();
        staff3.setVerified(true);
        staff3.logout();
        java.lang.String str16 = staff3.getPassword();
        staff3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "staff" + "'", str8, "staff");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 40.0d + "'", double12 == 40.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test24256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24256");
        model.Staff staff3 = new model.Staff("hi!", "", "hi!");
        java.lang.String str4 = staff3.getAccountType();
        java.lang.String str5 = staff3.getEmail();
        staff3.viewProfile();
        java.lang.String str7 = staff3.getPassword();
        double double8 = staff3.getHourlyRate();
        staff3.viewProfile();
        java.lang.String str10 = staff3.getID();
        boolean boolean11 = staff3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "staff" + "'", str4, "staff");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 40.0d + "'", double8 == 40.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test24257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24257");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        boolean boolean5 = staff3.isVerified();
        java.lang.String str6 = staff3.getID();
        java.lang.String str7 = staff3.getID();
        double double8 = staff3.getHourlyRate();
        java.lang.String str9 = staff3.getID();
        boolean boolean10 = staff3.isVerified();
        staff3.setVerified(false);
        double double13 = staff3.getHourlyRate();
        double double14 = staff3.getHourlyRate();
        java.lang.String str15 = staff3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 40.0d + "'", double8 == 40.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 40.0d + "'", double13 == 40.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 40.0d + "'", double14 == 40.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test24258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24258");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        staff3.logout();
        java.lang.String str5 = staff3.getID();
        java.lang.String str6 = staff3.getEmail();
        double double7 = staff3.getHourlyRate();
        boolean boolean8 = staff3.isVerified();
        java.lang.String str9 = staff3.getID();
        java.lang.String str10 = staff3.getAccountType();
        staff3.viewProfile();
        java.lang.String str12 = staff3.getPassword();
        staff3.logout();
        staff3.logout();
        staff3.setVerified(false);
        java.lang.String str17 = staff3.getID();
        staff3.logout();
        boolean boolean19 = staff3.isVerified();
        staff3.viewProfile();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 40.0d + "'", double7 == 40.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "staff" + "'", str10, "staff");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test24259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24259");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        boolean boolean5 = staff3.isVerified();
        java.lang.String str6 = staff3.getID();
        staff3.setVerified(false);
        java.lang.String str9 = staff3.getID();
        staff3.setVerified(false);
        java.lang.String str12 = staff3.getID();
        java.lang.String str13 = staff3.getEmail();
        java.lang.String str14 = staff3.getID();
        staff3.viewProfile();
        java.lang.String str16 = staff3.getID();
        double double17 = staff3.getHourlyRate();
        java.lang.String str18 = staff3.getAccountType();
        staff3.login("hi!", "staff");
        java.lang.String str22 = staff3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 40.0d + "'", double17 == 40.0d);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "staff" + "'", str18, "staff");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test24260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24260");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        boolean boolean5 = staff3.isVerified();
        java.lang.String str6 = staff3.getAccountType();
        staff3.logout();
        java.lang.String str8 = staff3.getEmail();
        staff3.viewProfile();
        java.lang.String str10 = staff3.getAccountType();
        java.lang.String str11 = staff3.getAccountType();
        staff3.setVerified(true);
        java.lang.String str14 = staff3.getPassword();
        java.lang.String str15 = staff3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "staff" + "'", str6, "staff");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "staff" + "'", str10, "staff");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "staff" + "'", str11, "staff");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test24261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24261");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        boolean boolean6 = staff3.isVerified();
        staff3.logout();
        staff3.setVerified(false);
        java.lang.String str10 = staff3.getID();
        staff3.viewProfile();
        java.lang.String str12 = staff3.getID();
        java.lang.String str13 = staff3.getAccountType();
        java.lang.String str14 = staff3.getID();
        staff3.login("", "staff");
        java.lang.String str18 = staff3.getEmail();
        staff3.setVerified(false);
        java.lang.String str21 = staff3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "staff" + "'", str13, "staff");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
    }

    @Test
    public void test24262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24262");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        boolean boolean6 = staff3.isVerified();
        staff3.logout();
        java.lang.String str8 = staff3.getPassword();
        java.lang.String str9 = staff3.getPassword();
        staff3.logout();
        java.lang.String str11 = staff3.getAccountType();
        java.lang.String str12 = staff3.getEmail();
        staff3.logout();
        java.lang.String str14 = staff3.getEmail();
        java.lang.String str15 = staff3.getEmail();
        staff3.viewProfile();
        staff3.login("hi!", "");
        staff3.logout();
        staff3.login("hi!", "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "staff" + "'", str11, "staff");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test24263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24263");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        staff3.logout();
        java.lang.String str5 = staff3.getID();
        java.lang.String str6 = staff3.getEmail();
        staff3.viewProfile();
        staff3.setVerified(false);
        staff3.logout();
        java.lang.String str11 = staff3.getEmail();
        staff3.login("hi!", "hi!");
        java.lang.String str15 = staff3.getEmail();
        staff3.login("hi!", "hi!");
        java.lang.String str19 = staff3.getID();
        java.lang.String str20 = staff3.getID();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test24264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24264");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        boolean boolean5 = staff3.isVerified();
        java.lang.String str6 = staff3.getID();
        staff3.setVerified(false);
        java.lang.String str9 = staff3.getID();
        staff3.setVerified(false);
        java.lang.String str12 = staff3.getID();
        java.lang.String str13 = staff3.getID();
        java.lang.String str14 = staff3.getPassword();
        java.lang.String str15 = staff3.getEmail();
        staff3.viewProfile();
        java.lang.String str17 = staff3.getPassword();
        java.lang.String str18 = staff3.getID();
        staff3.setVerified(true);
        double double21 = staff3.getHourlyRate();
        staff3.logout();
        staff3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 40.0d + "'", double21 == 40.0d);
    }

    @Test
    public void test24265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24265");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        boolean boolean5 = staff3.isVerified();
        java.lang.String str6 = staff3.getAccountType();
        staff3.logout();
        double double8 = staff3.getHourlyRate();
        java.lang.String str9 = staff3.getEmail();
        java.lang.String str10 = staff3.getAccountType();
        staff3.setVerified(true);
        java.lang.String str13 = staff3.getPassword();
        java.lang.String str14 = staff3.getPassword();
        double double15 = staff3.getHourlyRate();
        java.lang.String str16 = staff3.getPassword();
        staff3.viewProfile();
        staff3.login("", "");
        java.lang.String str21 = staff3.getEmail();
        java.lang.String str22 = staff3.getEmail();
        double double23 = staff3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "staff" + "'", str6, "staff");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 40.0d + "'", double8 == 40.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "staff" + "'", str10, "staff");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 40.0d + "'", double15 == 40.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 40.0d + "'", double23 == 40.0d);
    }

    @Test
    public void test24266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24266");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        staff3.logout();
        java.lang.String str5 = staff3.getID();
        java.lang.String str6 = staff3.getPassword();
        double double7 = staff3.getHourlyRate();
        staff3.setVerified(false);
        java.lang.String str10 = staff3.getID();
        java.lang.String str11 = staff3.getID();
        java.lang.String str12 = staff3.getAccountType();
        java.lang.String str13 = staff3.getID();
        staff3.login("hi!", "");
        java.lang.String str17 = staff3.getEmail();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 40.0d + "'", double7 == 40.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "staff" + "'", str12, "staff");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test24267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24267");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        staff3.logout();
        java.lang.String str5 = staff3.getID();
        java.lang.String str6 = staff3.getEmail();
        double double7 = staff3.getHourlyRate();
        java.lang.String str8 = staff3.getPassword();
        staff3.login("hi!", "hi!");
        boolean boolean12 = staff3.isVerified();
        java.lang.String str13 = staff3.getEmail();
        java.lang.String str14 = staff3.getPassword();
        java.lang.String str15 = staff3.getID();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 40.0d + "'", double7 == 40.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test24268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24268");
        model.Staff staff3 = new model.Staff("hi!", "staff", "");
        staff3.logout();
        staff3.logout();
        staff3.login("", "");
        double double9 = staff3.getHourlyRate();
        staff3.setVerified(false);
        boolean boolean12 = staff3.isVerified();
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 40.0d + "'", double9 == 40.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test24269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24269");
        model.Staff staff3 = new model.Staff("hi!", "", "hi!");
        staff3.setVerified(false);
        java.lang.String str6 = staff3.getPassword();
        java.lang.String str7 = staff3.getAccountType();
        java.lang.String str8 = staff3.getEmail();
        staff3.setVerified(true);
        boolean boolean11 = staff3.isVerified();
        staff3.login("hi!", "staff");
        double double15 = staff3.getHourlyRate();
        staff3.viewProfile();
        staff3.setVerified(true);
        java.lang.String str19 = staff3.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "staff" + "'", str7, "staff");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 40.0d + "'", double15 == 40.0d);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test24270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24270");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        boolean boolean5 = staff3.isVerified();
        java.lang.String str6 = staff3.getAccountType();
        staff3.logout();
        java.lang.String str8 = staff3.getEmail();
        staff3.viewProfile();
        boolean boolean10 = staff3.isVerified();
        staff3.viewProfile();
        double double12 = staff3.getHourlyRate();
        staff3.logout();
        java.lang.String str14 = staff3.getAccountType();
        staff3.viewProfile();
        java.lang.String str16 = staff3.getAccountType();
        java.lang.String str17 = staff3.getPassword();
        staff3.login("staff", "");
        boolean boolean21 = staff3.isVerified();
        java.lang.String str22 = staff3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "staff" + "'", str6, "staff");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 40.0d + "'", double12 == 40.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "staff" + "'", str14, "staff");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "staff" + "'", str16, "staff");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "staff" + "'", str22, "staff");
    }

    @Test
    public void test24271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24271");
        model.Staff staff3 = new model.Staff("staff", "hi!", "");
        java.lang.String str4 = staff3.getPassword();
        staff3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test24272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24272");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        boolean boolean6 = staff3.isVerified();
        staff3.logout();
        staff3.setVerified(false);
        java.lang.String str10 = staff3.getID();
        double double11 = staff3.getHourlyRate();
        java.lang.String str12 = staff3.getPassword();
        boolean boolean13 = staff3.isVerified();
        double double14 = staff3.getHourlyRate();
        boolean boolean15 = staff3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 40.0d + "'", double11 == 40.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 40.0d + "'", double14 == 40.0d);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test24273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24273");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        java.lang.String str6 = staff3.getPassword();
        staff3.setVerified(false);
        staff3.setVerified(false);
        java.lang.String str11 = staff3.getAccountType();
        staff3.logout();
        staff3.viewProfile();
        java.lang.String str14 = staff3.getAccountType();
        staff3.setVerified(false);
        java.lang.String str17 = staff3.getAccountType();
        double double18 = staff3.getHourlyRate();
        java.lang.String str19 = staff3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "staff" + "'", str11, "staff");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "staff" + "'", str14, "staff");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "staff" + "'", str17, "staff");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 40.0d + "'", double18 == 40.0d);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "staff" + "'", str19, "staff");
    }

    @Test
    public void test24274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24274");
        model.Staff staff3 = new model.Staff("hi!", "", "hi!");
        staff3.logout();
        staff3.login("hi!", "hi!");
        double double8 = staff3.getHourlyRate();
        java.lang.String str9 = staff3.getID();
        java.lang.String str10 = staff3.getAccountType();
        staff3.setVerified(true);
        staff3.logout();
        staff3.setVerified(false);
        java.lang.String str16 = staff3.getPassword();
        staff3.logout();
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 40.0d + "'", double8 == 40.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "staff" + "'", str10, "staff");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test24275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24275");
        model.Staff staff3 = new model.Staff("hi!", "", "staff");
        java.lang.String str4 = staff3.getPassword();
        double double5 = staff3.getHourlyRate();
        java.lang.String str6 = staff3.getPassword();
        staff3.setVerified(true);
        staff3.setVerified(true);
        java.lang.String str11 = staff3.getEmail();
        staff3.login("hi!", "staff");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 40.0d + "'", double5 == 40.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test24276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24276");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        boolean boolean5 = staff3.isVerified();
        java.lang.String str6 = staff3.getID();
        boolean boolean7 = staff3.isVerified();
        staff3.logout();
        staff3.logout();
        staff3.viewProfile();
        staff3.viewProfile();
        double double12 = staff3.getHourlyRate();
        double double13 = staff3.getHourlyRate();
        staff3.logout();
        staff3.logout();
        staff3.viewProfile();
        staff3.login("hi!", "staff");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 40.0d + "'", double12 == 40.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 40.0d + "'", double13 == 40.0d);
    }

    @Test
    public void test24277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24277");
        model.Staff staff3 = new model.Staff("hi!", "staff", "");
        staff3.logout();
        staff3.logout();
        staff3.logout();
        staff3.viewProfile();
        staff3.login("hi!", "");
        staff3.logout();
        java.lang.String str12 = staff3.getID();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test24278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24278");
        model.Staff staff3 = new model.Staff("hi!", "", "hi!");
        staff3.logout();
        staff3.login("hi!", "hi!");
        staff3.viewProfile();
        java.lang.String str9 = staff3.getPassword();
        java.lang.String str10 = staff3.getID();
        staff3.logout();
        staff3.login("", "staff");
        java.lang.String str15 = staff3.getID();
        java.lang.String str16 = staff3.getID();
        java.lang.String str17 = staff3.getPassword();
        java.lang.String str18 = staff3.getAccountType();
        staff3.logout();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "staff" + "'", str18, "staff");
    }

    @Test
    public void test24279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24279");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        boolean boolean6 = staff3.isVerified();
        staff3.logout();
        java.lang.String str8 = staff3.getPassword();
        boolean boolean9 = staff3.isVerified();
        staff3.viewProfile();
        staff3.viewProfile();
        java.lang.String str12 = staff3.getEmail();
        staff3.logout();
        java.lang.String str14 = staff3.getEmail();
        double double15 = staff3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 40.0d + "'", double15 == 40.0d);
    }

    @Test
    public void test24280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24280");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        double double6 = staff3.getHourlyRate();
        staff3.logout();
        staff3.viewProfile();
        java.lang.String str9 = staff3.getEmail();
        boolean boolean10 = staff3.isVerified();
        java.lang.String str11 = staff3.getPassword();
        staff3.logout();
        staff3.login("staff", "");
        staff3.login("", "staff");
        staff3.login("staff", "");
        staff3.logout();
        double double23 = staff3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 40.0d + "'", double6 == 40.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 40.0d + "'", double23 == 40.0d);
    }

    @Test
    public void test24281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24281");
        model.Staff staff3 = new model.Staff("hi!", "", "hi!");
        java.lang.String str4 = staff3.getAccountType();
        java.lang.String str5 = staff3.getID();
        staff3.setVerified(true);
        java.lang.String str8 = staff3.getAccountType();
        staff3.viewProfile();
        double double10 = staff3.getHourlyRate();
        staff3.setVerified(false);
        java.lang.String str13 = staff3.getEmail();
        staff3.viewProfile();
        boolean boolean15 = staff3.isVerified();
        staff3.setVerified(true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "staff" + "'", str4, "staff");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "staff" + "'", str8, "staff");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 40.0d + "'", double10 == 40.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test24282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24282");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        boolean boolean5 = staff3.isVerified();
        java.lang.String str6 = staff3.getID();
        java.lang.String str7 = staff3.getID();
        staff3.setVerified(true);
        java.lang.String str10 = staff3.getEmail();
        staff3.setVerified(true);
        staff3.logout();
        java.lang.String str14 = staff3.getAccountType();
        java.lang.String str15 = staff3.getID();
        java.lang.String str16 = staff3.getAccountType();
        java.lang.String str17 = staff3.getAccountType();
        staff3.logout();
        staff3.logout();
        boolean boolean20 = staff3.isVerified();
        double double21 = staff3.getHourlyRate();
        staff3.viewProfile();
        staff3.setVerified(false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "staff" + "'", str14, "staff");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "staff" + "'", str16, "staff");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "staff" + "'", str17, "staff");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 40.0d + "'", double21 == 40.0d);
    }

    @Test
    public void test24283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24283");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        boolean boolean6 = staff3.isVerified();
        staff3.logout();
        java.lang.String str8 = staff3.getAccountType();
        java.lang.String str9 = staff3.getAccountType();
        java.lang.String str10 = staff3.getID();
        java.lang.String str11 = staff3.getID();
        staff3.login("", "staff");
        java.lang.String str15 = staff3.getEmail();
        staff3.setVerified(false);
        staff3.viewProfile();
        java.lang.String str19 = staff3.getID();
        java.lang.Class<?> wildcardClass20 = staff3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "staff" + "'", str8, "staff");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "staff" + "'", str9, "staff");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test24284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24284");
        model.Staff staff3 = new model.Staff("hi!", "", "hi!");
        java.lang.String str4 = staff3.getAccountType();
        java.lang.String str5 = staff3.getID();
        staff3.setVerified(true);
        java.lang.String str8 = staff3.getID();
        java.lang.String str9 = staff3.getID();
        java.lang.String str10 = staff3.getID();
        staff3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "staff" + "'", str4, "staff");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test24285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24285");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        staff3.login("", "staff");
        double double7 = staff3.getHourlyRate();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 40.0d + "'", double7 == 40.0d);
    }

    @Test
    public void test24286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24286");
        model.Staff staff3 = new model.Staff("hi!", "", "hi!");
        staff3.setVerified(false);
        java.lang.String str6 = staff3.getPassword();
        java.lang.String str7 = staff3.getAccountType();
        java.lang.String str8 = staff3.getEmail();
        staff3.setVerified(false);
        java.lang.String str11 = staff3.getPassword();
        java.lang.String str12 = staff3.getPassword();
        staff3.logout();
        staff3.login("", "hi!");
        java.lang.String str17 = staff3.getPassword();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "staff" + "'", str7, "staff");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test24287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24287");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        boolean boolean5 = staff3.isVerified();
        java.lang.String str6 = staff3.getID();
        java.lang.String str7 = staff3.getID();
        staff3.setVerified(true);
        staff3.setVerified(false);
        java.lang.String str12 = staff3.getPassword();
        java.lang.String str13 = staff3.getID();
        double double14 = staff3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 40.0d + "'", double14 == 40.0d);
    }

    @Test
    public void test24288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24288");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        boolean boolean6 = staff3.isVerified();
        staff3.logout();
        java.lang.String str8 = staff3.getEmail();
        staff3.viewProfile();
        java.lang.String str10 = staff3.getPassword();
        java.lang.String str11 = staff3.getEmail();
        java.lang.String str12 = staff3.getAccountType();
        boolean boolean13 = staff3.isVerified();
        staff3.login("", "staff");
        boolean boolean17 = staff3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "staff" + "'", str12, "staff");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test24289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24289");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        boolean boolean6 = staff3.isVerified();
        staff3.logout();
        staff3.setVerified(false);
        java.lang.String str10 = staff3.getAccountType();
        java.lang.String str11 = staff3.getEmail();
        staff3.logout();
        staff3.setVerified(false);
        staff3.viewProfile();
        staff3.logout();
        staff3.setVerified(false);
        staff3.setVerified(true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "staff" + "'", str10, "staff");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test24290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24290");
        model.Staff staff3 = new model.Staff("hi!", "hi!", "");
        staff3.setVerified(false);
        staff3.viewProfile();
        staff3.setVerified(false);
        staff3.viewProfile();
        java.lang.String str10 = staff3.getID();
        java.lang.String str11 = staff3.getPassword();
        staff3.login("staff", "hi!");
        staff3.setVerified(false);
        java.lang.String str17 = staff3.getEmail();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test24291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24291");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        staff3.login("", "");
        staff3.viewProfile();
        staff3.viewProfile();
        staff3.login("", "");
        staff3.viewProfile();
        java.lang.String str13 = staff3.getAccountType();
        java.lang.String str14 = staff3.getPassword();
        boolean boolean15 = staff3.isVerified();
        java.lang.String str16 = staff3.getID();
        java.lang.String str17 = staff3.getAccountType();
        java.lang.String str18 = staff3.getEmail();
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "staff" + "'", str13, "staff");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "staff" + "'", str17, "staff");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test24292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24292");
        model.Staff staff3 = new model.Staff("hi!", "hi!", "hi!");
        staff3.login("hi!", "staff");
        staff3.logout();
        java.lang.String str8 = staff3.getPassword();
        staff3.viewProfile();
        boolean boolean10 = staff3.isVerified();
        java.lang.String str11 = staff3.getID();
        staff3.setVerified(false);
        java.lang.String str14 = staff3.getAccountType();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "staff" + "'", str14, "staff");
    }

    @Test
    public void test24293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24293");
        model.Staff staff3 = new model.Staff("hi!", "staff", "");
        java.lang.String str4 = staff3.getEmail();
        staff3.viewProfile();
        staff3.setVerified(true);
        java.lang.String str8 = staff3.getID();
        staff3.viewProfile();
        java.lang.String str10 = staff3.getID();
        java.lang.String str11 = staff3.getPassword();
        staff3.setVerified(false);
        staff3.setVerified(false);
        staff3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "staff" + "'", str11, "staff");
    }

    @Test
    public void test24294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24294");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        boolean boolean5 = staff3.isVerified();
        java.lang.String str6 = staff3.getID();
        staff3.setVerified(false);
        java.lang.String str9 = staff3.getID();
        staff3.setVerified(false);
        java.lang.String str12 = staff3.getID();
        java.lang.String str13 = staff3.getID();
        java.lang.String str14 = staff3.getPassword();
        java.lang.String str15 = staff3.getEmail();
        staff3.viewProfile();
        java.lang.String str17 = staff3.getPassword();
        java.lang.String str18 = staff3.getEmail();
        java.lang.String str19 = staff3.getEmail();
        boolean boolean20 = staff3.isVerified();
        java.lang.String str21 = staff3.getAccountType();
        staff3.logout();
        staff3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "staff" + "'", str21, "staff");
    }

    @Test
    public void test24295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24295");
        model.Staff staff3 = new model.Staff("hi!", "", "hi!");
        staff3.setVerified(false);
        java.lang.String str6 = staff3.getPassword();
        java.lang.String str7 = staff3.getAccountType();
        java.lang.String str8 = staff3.getEmail();
        staff3.setVerified(true);
        boolean boolean11 = staff3.isVerified();
        staff3.login("hi!", "staff");
        double double15 = staff3.getHourlyRate();
        staff3.logout();
        boolean boolean17 = staff3.isVerified();
        staff3.logout();
        staff3.logout();
        double double20 = staff3.getHourlyRate();
        boolean boolean21 = staff3.isVerified();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "staff" + "'", str7, "staff");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 40.0d + "'", double15 == 40.0d);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 40.0d + "'", double20 == 40.0d);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test24296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24296");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        boolean boolean6 = staff3.isVerified();
        staff3.logout();
        staff3.setVerified(false);
        staff3.viewProfile();
        java.lang.String str11 = staff3.getEmail();
        java.lang.String str12 = staff3.getPassword();
        java.lang.String str13 = staff3.getPassword();
        java.lang.String str14 = staff3.getID();
        boolean boolean15 = staff3.isVerified();
        java.lang.String str16 = staff3.getEmail();
        staff3.login("", "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test24297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24297");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        boolean boolean5 = staff3.isVerified();
        java.lang.String str6 = staff3.getID();
        staff3.setVerified(false);
        java.lang.String str9 = staff3.getID();
        staff3.setVerified(false);
        java.lang.String str12 = staff3.getID();
        java.lang.String str13 = staff3.getID();
        java.lang.String str14 = staff3.getPassword();
        java.lang.String str15 = staff3.getEmail();
        staff3.viewProfile();
        staff3.login("hi!", "");
        java.lang.String str20 = staff3.getAccountType();
        staff3.login("", "staff");
        java.lang.Class<?> wildcardClass24 = staff3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "staff" + "'", str20, "staff");
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test24298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24298");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        boolean boolean5 = staff3.isVerified();
        java.lang.String str6 = staff3.getID();
        java.lang.String str7 = staff3.getID();
        staff3.setVerified(true);
        java.lang.String str10 = staff3.getEmail();
        staff3.setVerified(true);
        java.lang.String str13 = staff3.getAccountType();
        java.lang.String str14 = staff3.getID();
        staff3.login("staff", "hi!");
        java.lang.String str18 = staff3.getAccountType();
        java.lang.String str19 = staff3.getAccountType();
        java.lang.String str20 = staff3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "staff" + "'", str13, "staff");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "staff" + "'", str18, "staff");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "staff" + "'", str19, "staff");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test24299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24299");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        boolean boolean6 = staff3.isVerified();
        staff3.logout();
        staff3.setVerified(false);
        staff3.viewProfile();
        staff3.login("hi!", "");
        java.lang.String str14 = staff3.getAccountType();
        staff3.login("staff", "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "staff" + "'", str14, "staff");
    }

    @Test
    public void test24300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24300");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getID();
        java.lang.String str6 = staff3.getID();
        staff3.login("", "");
        staff3.setVerified(false);
        java.lang.String str12 = staff3.getPassword();
        java.lang.String str13 = staff3.getID();
        staff3.logout();
        java.lang.String str15 = staff3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test24301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24301");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        boolean boolean5 = staff3.isVerified();
        java.lang.String str6 = staff3.getID();
        staff3.setVerified(false);
        boolean boolean9 = staff3.isVerified();
        java.lang.String str10 = staff3.getAccountType();
        java.lang.String str11 = staff3.getPassword();
        java.lang.String str12 = staff3.getEmail();
        java.lang.String str13 = staff3.getEmail();
        double double14 = staff3.getHourlyRate();
        boolean boolean15 = staff3.isVerified();
        java.lang.String str16 = staff3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "staff" + "'", str10, "staff");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 40.0d + "'", double14 == 40.0d);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "staff" + "'", str16, "staff");
    }

    @Test
    public void test24302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24302");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        boolean boolean6 = staff3.isVerified();
        staff3.logout();
        staff3.setVerified(false);
        java.lang.String str10 = staff3.getID();
        staff3.viewProfile();
        java.lang.String str12 = staff3.getID();
        java.lang.String str13 = staff3.getAccountType();
        java.lang.String str14 = staff3.getEmail();
        java.lang.String str15 = staff3.getID();
        java.lang.String str16 = staff3.getAccountType();
        java.lang.Class<?> wildcardClass17 = staff3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "staff" + "'", str13, "staff");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "staff" + "'", str16, "staff");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test24303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24303");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        boolean boolean6 = staff3.isVerified();
        staff3.logout();
        staff3.setVerified(false);
        java.lang.String str10 = staff3.getID();
        staff3.viewProfile();
        java.lang.String str12 = staff3.getID();
        java.lang.String str13 = staff3.getID();
        staff3.setVerified(false);
        staff3.logout();
        java.lang.String str17 = staff3.getAccountType();
        staff3.login("", "staff");
        java.lang.String str21 = staff3.getPassword();
        staff3.setVerified(false);
        java.lang.String str24 = staff3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "staff" + "'", str17, "staff");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "staff" + "'", str24, "staff");
    }

    @Test
    public void test24304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24304");
        model.Staff staff3 = new model.Staff("hi!", "", "staff");
        java.lang.String str4 = staff3.getPassword();
        double double5 = staff3.getHourlyRate();
        double double6 = staff3.getHourlyRate();
        java.lang.String str7 = staff3.getAccountType();
        staff3.login("hi!", "staff");
        boolean boolean11 = staff3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 40.0d + "'", double5 == 40.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 40.0d + "'", double6 == 40.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "staff" + "'", str7, "staff");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test24305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24305");
        model.Staff staff3 = new model.Staff("hi!", "staff", "");
        java.lang.String str4 = staff3.getEmail();
        staff3.viewProfile();
        staff3.viewProfile();
        java.lang.String str7 = staff3.getEmail();
        staff3.login("hi!", "");
        staff3.viewProfile();
        java.lang.String str12 = staff3.getEmail();
        staff3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test24306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24306");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        boolean boolean5 = staff3.isVerified();
        java.lang.String str6 = staff3.getID();
        boolean boolean7 = staff3.isVerified();
        java.lang.String str8 = staff3.getID();
        staff3.login("", "staff");
        java.lang.String str12 = staff3.getPassword();
        java.lang.String str13 = staff3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test24307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24307");
        model.Staff staff3 = new model.Staff("hi!", "hi!", "");
        staff3.setVerified(true);
        double double6 = staff3.getHourlyRate();
        java.lang.String str7 = staff3.getAccountType();
        java.lang.String str8 = staff3.getID();
        boolean boolean9 = staff3.isVerified();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 40.0d + "'", double6 == 40.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "staff" + "'", str7, "staff");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test24308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24308");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        boolean boolean6 = staff3.isVerified();
        staff3.viewProfile();
        boolean boolean8 = staff3.isVerified();
        java.lang.String str9 = staff3.getEmail();
        staff3.setVerified(true);
        boolean boolean12 = staff3.isVerified();
        staff3.logout();
        double double14 = staff3.getHourlyRate();
        staff3.logout();
        java.lang.String str16 = staff3.getEmail();
        staff3.setVerified(true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 40.0d + "'", double14 == 40.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test24309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24309");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        java.lang.String str6 = staff3.getPassword();
        staff3.setVerified(false);
        staff3.viewProfile();
        java.lang.String str10 = staff3.getID();
        java.lang.String str11 = staff3.getPassword();
        staff3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test24310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24310");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        boolean boolean6 = staff3.isVerified();
        staff3.logout();
        staff3.setVerified(false);
        java.lang.String str10 = staff3.getID();
        staff3.viewProfile();
        java.lang.String str12 = staff3.getID();
        java.lang.String str13 = staff3.getAccountType();
        staff3.login("staff", "hi!");
        boolean boolean17 = staff3.isVerified();
        java.lang.String str18 = staff3.getPassword();
        java.lang.String str19 = staff3.getAccountType();
        java.lang.String str20 = staff3.getAccountType();
        java.lang.String str21 = staff3.getPassword();
        boolean boolean22 = staff3.isVerified();
        java.lang.String str23 = staff3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "staff" + "'", str13, "staff");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "staff" + "'", str19, "staff");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "staff" + "'", str20, "staff");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "staff" + "'", str23, "staff");
    }

    @Test
    public void test24311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24311");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        staff3.logout();
        java.lang.String str5 = staff3.getID();
        java.lang.String str6 = staff3.getEmail();
        double double7 = staff3.getHourlyRate();
        boolean boolean8 = staff3.isVerified();
        java.lang.String str9 = staff3.getID();
        double double10 = staff3.getHourlyRate();
        java.lang.String str11 = staff3.getEmail();
        java.lang.String str12 = staff3.getPassword();
        boolean boolean13 = staff3.isVerified();
        boolean boolean14 = staff3.isVerified();
        boolean boolean15 = staff3.isVerified();
        java.lang.String str16 = staff3.getEmail();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 40.0d + "'", double7 == 40.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 40.0d + "'", double10 == 40.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test24312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24312");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        boolean boolean6 = staff3.isVerified();
        staff3.logout();
        staff3.setVerified(false);
        java.lang.String str10 = staff3.getID();
        double double11 = staff3.getHourlyRate();
        java.lang.String str12 = staff3.getPassword();
        staff3.login("hi!", "hi!");
        boolean boolean16 = staff3.isVerified();
        java.lang.String str17 = staff3.getEmail();
        java.lang.String str18 = staff3.getAccountType();
        boolean boolean19 = staff3.isVerified();
        staff3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 40.0d + "'", double11 == 40.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "staff" + "'", str18, "staff");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test24313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24313");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        boolean boolean5 = staff3.isVerified();
        java.lang.String str6 = staff3.getAccountType();
        staff3.login("hi!", "hi!");
        staff3.login("", "staff");
        java.lang.String str13 = staff3.getPassword();
        staff3.login("", "hi!");
        staff3.viewProfile();
        java.lang.String str18 = staff3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "staff" + "'", str6, "staff");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test24314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24314");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        boolean boolean6 = staff3.isVerified();
        staff3.logout();
        staff3.setVerified(false);
        java.lang.String str10 = staff3.getID();
        double double11 = staff3.getHourlyRate();
        java.lang.String str12 = staff3.getPassword();
        staff3.login("hi!", "hi!");
        staff3.setVerified(true);
        java.lang.String str18 = staff3.getID();
        java.lang.String str19 = staff3.getEmail();
        java.lang.String str20 = staff3.getAccountType();
        staff3.login("staff", "hi!");
        java.lang.String str24 = staff3.getID();
        boolean boolean25 = staff3.isVerified();
        staff3.setVerified(true);
        java.lang.String str28 = staff3.getID();
        java.lang.String str29 = staff3.getEmail();
        staff3.setVerified(false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 40.0d + "'", double11 == 40.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "staff" + "'", str20, "staff");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
    }

    @Test
    public void test24315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24315");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        boolean boolean5 = staff3.isVerified();
        java.lang.String str6 = staff3.getID();
        java.lang.String str7 = staff3.getID();
        staff3.login("hi!", "");
        java.lang.String str11 = staff3.getPassword();
        boolean boolean12 = staff3.isVerified();
        staff3.setVerified(true);
        double double15 = staff3.getHourlyRate();
        double double16 = staff3.getHourlyRate();
        java.lang.String str17 = staff3.getPassword();
        staff3.viewProfile();
        staff3.viewProfile();
        staff3.logout();
        java.lang.String str21 = staff3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 40.0d + "'", double15 == 40.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 40.0d + "'", double16 == 40.0d);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "staff" + "'", str21, "staff");
    }

    @Test
    public void test24316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24316");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        boolean boolean5 = staff3.isVerified();
        java.lang.String str6 = staff3.getID();
        java.lang.String str7 = staff3.getID();
        staff3.setVerified(true);
        java.lang.String str10 = staff3.getAccountType();
        java.lang.String str11 = staff3.getPassword();
        staff3.viewProfile();
        boolean boolean13 = staff3.isVerified();
        java.lang.String str14 = staff3.getAccountType();
        java.lang.String str15 = staff3.getID();
        java.lang.String str16 = staff3.getID();
        staff3.logout();
        staff3.login("", "staff");
        staff3.setVerified(false);
        boolean boolean23 = staff3.isVerified();
        staff3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "staff" + "'", str10, "staff");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "staff" + "'", str14, "staff");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test24317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24317");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        boolean boolean5 = staff3.isVerified();
        java.lang.String str6 = staff3.getID();
        staff3.setVerified(false);
        java.lang.String str9 = staff3.getID();
        staff3.setVerified(false);
        java.lang.String str12 = staff3.getID();
        java.lang.String str13 = staff3.getAccountType();
        boolean boolean14 = staff3.isVerified();
        java.lang.String str15 = staff3.getEmail();
        staff3.logout();
        java.lang.String str17 = staff3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "staff" + "'", str13, "staff");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test24318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24318");
        model.Staff staff3 = new model.Staff("hi!", "", "hi!");
        staff3.setVerified(false);
        java.lang.String str6 = staff3.getPassword();
        java.lang.String str7 = staff3.getAccountType();
        staff3.login("staff", "staff");
        java.lang.String str11 = staff3.getAccountType();
        java.lang.String str12 = staff3.getAccountType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "staff" + "'", str7, "staff");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "staff" + "'", str11, "staff");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "staff" + "'", str12, "staff");
    }

    @Test
    public void test24319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24319");
        model.Staff staff3 = new model.Staff("hi!", "", "hi!");
        staff3.logout();
        staff3.login("hi!", "hi!");
        staff3.viewProfile();
        java.lang.String str9 = staff3.getPassword();
        java.lang.String str10 = staff3.getEmail();
        java.lang.String str11 = staff3.getID();
        java.lang.String str12 = staff3.getPassword();
        staff3.logout();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test24320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24320");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        boolean boolean6 = staff3.isVerified();
        staff3.logout();
        staff3.setVerified(false);
        java.lang.String str10 = staff3.getID();
        staff3.viewProfile();
        java.lang.String str12 = staff3.getID();
        boolean boolean13 = staff3.isVerified();
        staff3.setVerified(false);
        staff3.logout();
        java.lang.String str17 = staff3.getAccountType();
        boolean boolean18 = staff3.isVerified();
        java.lang.String str19 = staff3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "staff" + "'", str17, "staff");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test24321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24321");
        model.Staff staff3 = new model.Staff("staff", "", "hi!");
        java.lang.String str4 = staff3.getAccountType();
        staff3.setVerified(false);
        staff3.setVerified(true);
        java.lang.String str9 = staff3.getEmail();
        double double10 = staff3.getHourlyRate();
        double double11 = staff3.getHourlyRate();
        staff3.logout();
        boolean boolean13 = staff3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "staff" + "'", str4, "staff");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "staff" + "'", str9, "staff");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 40.0d + "'", double10 == 40.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 40.0d + "'", double11 == 40.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test24322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24322");
        model.Staff staff3 = new model.Staff("hi!", "", "hi!");
        staff3.logout();
        staff3.login("hi!", "hi!");
        double double8 = staff3.getHourlyRate();
        boolean boolean9 = staff3.isVerified();
        boolean boolean10 = staff3.isVerified();
        boolean boolean11 = staff3.isVerified();
        boolean boolean12 = staff3.isVerified();
        staff3.logout();
        staff3.setVerified(true);
        staff3.logout();
        java.lang.String str17 = staff3.getAccountType();
        java.lang.String str18 = staff3.getID();
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 40.0d + "'", double8 == 40.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "staff" + "'", str17, "staff");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test24323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24323");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        boolean boolean6 = staff3.isVerified();
        staff3.logout();
        java.lang.String str8 = staff3.getAccountType();
        java.lang.String str9 = staff3.getAccountType();
        java.lang.String str10 = staff3.getID();
        java.lang.String str11 = staff3.getID();
        java.lang.String str12 = staff3.getEmail();
        double double13 = staff3.getHourlyRate();
        staff3.login("hi!", "staff");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "staff" + "'", str8, "staff");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "staff" + "'", str9, "staff");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 40.0d + "'", double13 == 40.0d);
    }

    @Test
    public void test24324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24324");
        model.Staff staff3 = new model.Staff("hi!", "", "hi!");
        staff3.logout();
        staff3.login("hi!", "hi!");
        staff3.viewProfile();
        java.lang.String str9 = staff3.getPassword();
        java.lang.String str10 = staff3.getID();
        staff3.logout();
        boolean boolean12 = staff3.isVerified();
        java.lang.String str13 = staff3.getID();
        staff3.setVerified(true);
        java.lang.String str16 = staff3.getEmail();
        staff3.viewProfile();
        staff3.viewProfile();
        java.lang.String str19 = staff3.getPassword();
        staff3.logout();
        java.lang.String str21 = staff3.getAccountType();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "staff" + "'", str21, "staff");
    }

    @Test
    public void test24325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24325");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        boolean boolean6 = staff3.isVerified();
        staff3.logout();
        java.lang.String str8 = staff3.getPassword();
        java.lang.String str9 = staff3.getPassword();
        staff3.logout();
        java.lang.String str11 = staff3.getAccountType();
        java.lang.String str12 = staff3.getEmail();
        staff3.logout();
        staff3.login("staff", "");
        staff3.logout();
        double double18 = staff3.getHourlyRate();
        java.lang.String str19 = staff3.getAccountType();
        java.lang.String str20 = staff3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "staff" + "'", str11, "staff");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 40.0d + "'", double18 == 40.0d);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "staff" + "'", str19, "staff");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "staff" + "'", str20, "staff");
    }

    @Test
    public void test24326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24326");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        boolean boolean5 = staff3.isVerified();
        java.lang.String str6 = staff3.getID();
        staff3.setVerified(false);
        java.lang.String str9 = staff3.getID();
        staff3.setVerified(false);
        staff3.logout();
        staff3.setVerified(false);
        staff3.logout();
        java.lang.String str16 = staff3.getEmail();
        boolean boolean17 = staff3.isVerified();
        java.lang.String str18 = staff3.getID();
        double double19 = staff3.getHourlyRate();
        staff3.login("", "");
        staff3.login("staff", "staff");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 40.0d + "'", double19 == 40.0d);
    }

    @Test
    public void test24327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24327");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        boolean boolean5 = staff3.isVerified();
        java.lang.String str6 = staff3.getID();
        staff3.setVerified(false);
        java.lang.String str9 = staff3.getID();
        staff3.setVerified(false);
        java.lang.String str12 = staff3.getID();
        java.lang.String str13 = staff3.getEmail();
        java.lang.String str14 = staff3.getID();
        java.lang.String str15 = staff3.getAccountType();
        staff3.setVerified(false);
        double double18 = staff3.getHourlyRate();
        staff3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "staff" + "'", str15, "staff");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 40.0d + "'", double18 == 40.0d);
    }

    @Test
    public void test24328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24328");
        model.Staff staff3 = new model.Staff("", "staff", "staff");
        staff3.setVerified(true);
        staff3.logout();
        java.lang.String str7 = staff3.getEmail();
        java.lang.String str8 = staff3.getPassword();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "staff" + "'", str8, "staff");
    }

    @Test
    public void test24329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24329");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        staff3.login("", "");
        double double7 = staff3.getHourlyRate();
        staff3.login("staff", "staff");
        java.lang.String str11 = staff3.getID();
        java.lang.String str12 = staff3.getAccountType();
        staff3.logout();
        staff3.setVerified(false);
        boolean boolean16 = staff3.isVerified();
        staff3.viewProfile();
        boolean boolean18 = staff3.isVerified();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 40.0d + "'", double7 == 40.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "staff" + "'", str12, "staff");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test24330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24330");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        boolean boolean6 = staff3.isVerified();
        staff3.logout();
        java.lang.String str8 = staff3.getAccountType();
        java.lang.String str9 = staff3.getAccountType();
        java.lang.String str10 = staff3.getID();
        java.lang.String str11 = staff3.getID();
        staff3.login("", "staff");
        java.lang.String str15 = staff3.getEmail();
        boolean boolean16 = staff3.isVerified();
        staff3.viewProfile();
        java.lang.String str18 = staff3.getPassword();
        java.lang.String str19 = staff3.getEmail();
        boolean boolean20 = staff3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "staff" + "'", str8, "staff");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "staff" + "'", str9, "staff");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test24331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24331");
        model.Staff staff3 = new model.Staff("hi!", "", "hi!");
        staff3.setVerified(false);
        java.lang.String str6 = staff3.getPassword();
        java.lang.String str7 = staff3.getAccountType();
        staff3.viewProfile();
        boolean boolean9 = staff3.isVerified();
        java.lang.String str10 = staff3.getPassword();
        staff3.login("staff", "staff");
        java.lang.String str14 = staff3.getID();
        boolean boolean15 = staff3.isVerified();
        staff3.setVerified(false);
        java.lang.Class<?> wildcardClass18 = staff3.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "staff" + "'", str7, "staff");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test24332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24332");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        boolean boolean6 = staff3.isVerified();
        staff3.logout();
        staff3.setVerified(false);
        staff3.viewProfile();
        java.lang.String str11 = staff3.getEmail();
        java.lang.String str12 = staff3.getPassword();
        java.lang.String str13 = staff3.getPassword();
        java.lang.String str14 = staff3.getID();
        boolean boolean15 = staff3.isVerified();
        staff3.login("", "hi!");
        java.lang.String str19 = staff3.getID();
        staff3.viewProfile();
        staff3.logout();
        java.lang.String str22 = staff3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test24333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24333");
        model.Staff staff3 = new model.Staff("hi!", "", "hi!");
        staff3.setVerified(false);
        staff3.viewProfile();
        java.lang.String str7 = staff3.getEmail();
        java.lang.String str8 = staff3.getAccountType();
        staff3.logout();
        staff3.login("", "");
        java.lang.String str13 = staff3.getID();
        java.lang.String str14 = staff3.getPassword();
        staff3.logout();
        java.lang.String str16 = staff3.getEmail();
        staff3.logout();
        double double18 = staff3.getHourlyRate();
        staff3.setVerified(false);
        staff3.login("hi!", "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "staff" + "'", str8, "staff");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 40.0d + "'", double18 == 40.0d);
    }

    @Test
    public void test24334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24334");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        boolean boolean6 = staff3.isVerified();
        staff3.logout();
        staff3.setVerified(false);
        java.lang.String str10 = staff3.getID();
        staff3.viewProfile();
        java.lang.String str12 = staff3.getID();
        java.lang.String str13 = staff3.getID();
        java.lang.String str14 = staff3.getAccountType();
        java.lang.String str15 = staff3.getAccountType();
        staff3.login("", "");
        java.lang.String str19 = staff3.getAccountType();
        staff3.setVerified(true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "staff" + "'", str14, "staff");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "staff" + "'", str15, "staff");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "staff" + "'", str19, "staff");
    }

    @Test
    public void test24335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24335");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        boolean boolean6 = staff3.isVerified();
        staff3.logout();
        staff3.setVerified(false);
        java.lang.String str10 = staff3.getID();
        java.lang.String str11 = staff3.getAccountType();
        java.lang.String str12 = staff3.getPassword();
        staff3.logout();
        staff3.setVerified(false);
        java.lang.String str16 = staff3.getPassword();
        boolean boolean17 = staff3.isVerified();
        staff3.login("", "staff");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "staff" + "'", str11, "staff");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test24336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24336");
        model.Staff staff3 = new model.Staff("hi!", "", "hi!");
        java.lang.String str4 = staff3.getAccountType();
        staff3.logout();
        staff3.setVerified(true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "staff" + "'", str4, "staff");
    }

    @Test
    public void test24337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24337");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        boolean boolean6 = staff3.isVerified();
        staff3.logout();
        staff3.setVerified(false);
        java.lang.String str10 = staff3.getID();
        staff3.viewProfile();
        java.lang.String str12 = staff3.getID();
        java.lang.String str13 = staff3.getAccountType();
        staff3.login("staff", "hi!");
        boolean boolean17 = staff3.isVerified();
        java.lang.String str18 = staff3.getPassword();
        java.lang.String str19 = staff3.getPassword();
        staff3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "staff" + "'", str13, "staff");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test24338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24338");
        model.Staff staff3 = new model.Staff("hi!", "hi!", "");
        staff3.logout();
        java.lang.String str5 = staff3.getID();
        staff3.login("hi!", "staff");
        java.lang.String str9 = staff3.getPassword();
        double double10 = staff3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 40.0d + "'", double10 == 40.0d);
    }

    @Test
    public void test24339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24339");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        boolean boolean5 = staff3.isVerified();
        java.lang.String str6 = staff3.getID();
        java.lang.String str7 = staff3.getID();
        double double8 = staff3.getHourlyRate();
        java.lang.String str9 = staff3.getID();
        java.lang.String str10 = staff3.getAccountType();
        staff3.setVerified(true);
        java.lang.String str13 = staff3.getPassword();
        java.lang.String str14 = staff3.getPassword();
        java.lang.String str15 = staff3.getAccountType();
        java.lang.String str16 = staff3.getID();
        boolean boolean17 = staff3.isVerified();
        java.lang.String str18 = staff3.getPassword();
        java.lang.Class<?> wildcardClass19 = staff3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 40.0d + "'", double8 == 40.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "staff" + "'", str10, "staff");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "staff" + "'", str15, "staff");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test24340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24340");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        boolean boolean6 = staff3.isVerified();
        staff3.logout();
        java.lang.String str8 = staff3.getEmail();
        staff3.viewProfile();
        java.lang.String str10 = staff3.getAccountType();
        staff3.login("staff", "hi!");
        boolean boolean14 = staff3.isVerified();
        staff3.logout();
        java.lang.String str16 = staff3.getPassword();
        java.lang.String str17 = staff3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "staff" + "'", str10, "staff");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test24341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24341");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        boolean boolean6 = staff3.isVerified();
        staff3.logout();
        java.lang.String str8 = staff3.getPassword();
        java.lang.String str9 = staff3.getPassword();
        staff3.logout();
        java.lang.String str11 = staff3.getAccountType();
        java.lang.String str12 = staff3.getEmail();
        staff3.logout();
        java.lang.String str14 = staff3.getEmail();
        staff3.viewProfile();
        double double16 = staff3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "staff" + "'", str11, "staff");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 40.0d + "'", double16 == 40.0d);
    }

    @Test
    public void test24342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24342");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        java.lang.String str6 = staff3.getPassword();
        staff3.setVerified(false);
        staff3.setVerified(false);
        java.lang.String str11 = staff3.getPassword();
        java.lang.String str12 = staff3.getEmail();
        staff3.setVerified(false);
        java.lang.String str15 = staff3.getPassword();
        java.lang.String str16 = staff3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test24343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24343");
        model.Staff staff3 = new model.Staff("hi!", "", "hi!");
        java.lang.String str4 = staff3.getAccountType();
        java.lang.String str5 = staff3.getEmail();
        double double6 = staff3.getHourlyRate();
        staff3.viewProfile();
        java.lang.String str8 = staff3.getEmail();
        staff3.setVerified(false);
        java.lang.String str11 = staff3.getAccountType();
        java.lang.String str12 = staff3.getID();
        staff3.logout();
        java.lang.String str14 = staff3.getAccountType();
        staff3.setVerified(true);
        double double17 = staff3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "staff" + "'", str4, "staff");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 40.0d + "'", double6 == 40.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "staff" + "'", str11, "staff");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "staff" + "'", str14, "staff");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 40.0d + "'", double17 == 40.0d);
    }

    @Test
    public void test24344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24344");
        model.Staff staff3 = new model.Staff("hi!", "", "hi!");
        staff3.setVerified(false);
        staff3.viewProfile();
        java.lang.String str7 = staff3.getEmail();
        java.lang.String str8 = staff3.getAccountType();
        java.lang.String str9 = staff3.getID();
        java.lang.String str10 = staff3.getAccountType();
        staff3.setVerified(false);
        staff3.login("", "hi!");
        java.lang.String str16 = staff3.getID();
        java.lang.String str17 = staff3.getPassword();
        staff3.setVerified(false);
        java.lang.String str20 = staff3.getPassword();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "staff" + "'", str8, "staff");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "staff" + "'", str10, "staff");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test24345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24345");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        boolean boolean6 = staff3.isVerified();
        staff3.setVerified(false);
        double double9 = staff3.getHourlyRate();
        staff3.setVerified(true);
        java.lang.String str12 = staff3.getID();
        java.lang.String str13 = staff3.getEmail();
        java.lang.Class<?> wildcardClass14 = staff3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 40.0d + "'", double9 == 40.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test24346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24346");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        boolean boolean5 = staff3.isVerified();
        java.lang.String str6 = staff3.getID();
        staff3.setVerified(false);
        java.lang.String str9 = staff3.getID();
        staff3.setVerified(false);
        staff3.logout();
        java.lang.String str13 = staff3.getAccountType();
        java.lang.String str14 = staff3.getAccountType();
        java.lang.String str15 = staff3.getID();
        java.lang.String str16 = staff3.getAccountType();
        staff3.viewProfile();
        staff3.setVerified(true);
        staff3.login("staff", "staff");
        java.lang.String str23 = staff3.getEmail();
        java.lang.Class<?> wildcardClass24 = staff3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "staff" + "'", str13, "staff");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "staff" + "'", str14, "staff");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "staff" + "'", str16, "staff");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test24347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24347");
        model.Staff staff3 = new model.Staff("hi!", "", "hi!");
        java.lang.String str4 = staff3.getPassword();
        staff3.logout();
        double double6 = staff3.getHourlyRate();
        java.lang.String str7 = staff3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 40.0d + "'", double6 == 40.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "staff" + "'", str7, "staff");
    }

    @Test
    public void test24348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24348");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        boolean boolean5 = staff3.isVerified();
        java.lang.String str6 = staff3.getAccountType();
        staff3.logout();
        java.lang.String str8 = staff3.getEmail();
        staff3.viewProfile();
        java.lang.String str10 = staff3.getID();
        java.lang.String str11 = staff3.getPassword();
        boolean boolean12 = staff3.isVerified();
        java.lang.String str13 = staff3.getEmail();
        staff3.setVerified(true);
        double double16 = staff3.getHourlyRate();
        staff3.viewProfile();
        boolean boolean18 = staff3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "staff" + "'", str6, "staff");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 40.0d + "'", double16 == 40.0d);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test24349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24349");
        model.Staff staff3 = new model.Staff("hi!", "staff", "staff");
        java.lang.String str4 = staff3.getID();
        staff3.setVerified(true);
        double double7 = staff3.getHourlyRate();
        staff3.viewProfile();
        java.lang.String str9 = staff3.getAccountType();
        staff3.viewProfile();
        staff3.logout();
        java.lang.String str12 = staff3.getAccountType();
        java.lang.String str13 = staff3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "staff" + "'", str4, "staff");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 40.0d + "'", double7 == 40.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "staff" + "'", str9, "staff");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "staff" + "'", str12, "staff");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "staff" + "'", str13, "staff");
    }

    @Test
    public void test24350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24350");
        model.Staff staff3 = new model.Staff("hi!", "", "hi!");
        java.lang.String str4 = staff3.getAccountType();
        java.lang.String str5 = staff3.getEmail();
        staff3.viewProfile();
        staff3.logout();
        staff3.login("staff", "staff");
        staff3.logout();
        boolean boolean12 = staff3.isVerified();
        double double13 = staff3.getHourlyRate();
        java.lang.String str14 = staff3.getAccountType();
        staff3.login("hi!", "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "staff" + "'", str4, "staff");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 40.0d + "'", double13 == 40.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "staff" + "'", str14, "staff");
    }

    @Test
    public void test24351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24351");
        model.Staff staff3 = new model.Staff("hi!", "", "hi!");
        java.lang.String str4 = staff3.getAccountType();
        java.lang.String str5 = staff3.getEmail();
        double double6 = staff3.getHourlyRate();
        staff3.logout();
        java.lang.String str8 = staff3.getEmail();
        boolean boolean9 = staff3.isVerified();
        java.lang.String str10 = staff3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "staff" + "'", str4, "staff");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 40.0d + "'", double6 == 40.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test24352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24352");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        boolean boolean6 = staff3.isVerified();
        staff3.logout();
        staff3.setVerified(false);
        java.lang.String str10 = staff3.getID();
        staff3.viewProfile();
        staff3.login("", "");
        java.lang.String str15 = staff3.getPassword();
        java.lang.String str16 = staff3.getID();
        java.lang.String str17 = staff3.getID();
        staff3.setVerified(false);
        java.lang.String str20 = staff3.getID();
        java.lang.String str21 = staff3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "staff" + "'", str21, "staff");
    }

    @Test
    public void test24353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24353");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        boolean boolean6 = staff3.isVerified();
        staff3.logout();
        staff3.setVerified(false);
        java.lang.String str10 = staff3.getID();
        staff3.viewProfile();
        staff3.login("", "");
        java.lang.String str15 = staff3.getPassword();
        double double16 = staff3.getHourlyRate();
        java.lang.String str17 = staff3.getPassword();
        java.lang.String str18 = staff3.getPassword();
        staff3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 40.0d + "'", double16 == 40.0d);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test24354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24354");
        model.Staff staff3 = new model.Staff("hi!", "hi!", "hi!");
        staff3.login("hi!", "staff");
        staff3.logout();
        java.lang.String str8 = staff3.getPassword();
        staff3.viewProfile();
        staff3.setVerified(false);
        staff3.logout();
        staff3.viewProfile();
        staff3.logout();
        java.lang.String str15 = staff3.getAccountType();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "staff" + "'", str15, "staff");
    }

    @Test
    public void test24355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24355");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        boolean boolean6 = staff3.isVerified();
        staff3.logout();
        staff3.setVerified(false);
        java.lang.String str10 = staff3.getID();
        staff3.viewProfile();
        java.lang.String str12 = staff3.getID();
        staff3.setVerified(false);
        java.lang.String str15 = staff3.getID();
        boolean boolean16 = staff3.isVerified();
        java.lang.String str17 = staff3.getAccountType();
        double double18 = staff3.getHourlyRate();
        staff3.setVerified(true);
        java.lang.String str21 = staff3.getEmail();
        staff3.login("staff", "hi!");
        java.lang.String str25 = staff3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "staff" + "'", str17, "staff");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 40.0d + "'", double18 == 40.0d);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
    }

    @Test
    public void test24356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24356");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        boolean boolean5 = staff3.isVerified();
        java.lang.String str6 = staff3.getID();
        staff3.setVerified(false);
        java.lang.String str9 = staff3.getID();
        staff3.setVerified(false);
        java.lang.String str12 = staff3.getID();
        java.lang.String str13 = staff3.getID();
        java.lang.String str14 = staff3.getPassword();
        java.lang.String str15 = staff3.getEmail();
        staff3.viewProfile();
        staff3.login("hi!", "");
        java.lang.String str20 = staff3.getEmail();
        staff3.login("", "hi!");
        double double24 = staff3.getHourlyRate();
        java.lang.String str25 = staff3.getID();
        staff3.setVerified(false);
        staff3.login("staff", "staff");
        java.lang.String str31 = staff3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 40.0d + "'", double24 == 40.0d);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
    }

    @Test
    public void test24357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24357");
        model.Staff staff3 = new model.Staff("hi!", "staff", "");
        java.lang.String str4 = staff3.getEmail();
        double double5 = staff3.getHourlyRate();
        staff3.login("", "staff");
        java.lang.String str9 = staff3.getID();
        staff3.setVerified(false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 40.0d + "'", double5 == 40.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test24358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24358");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        boolean boolean5 = staff3.isVerified();
        java.lang.String str6 = staff3.getID();
        staff3.setVerified(false);
        java.lang.String str9 = staff3.getID();
        staff3.setVerified(false);
        java.lang.String str12 = staff3.getID();
        java.lang.String str13 = staff3.getID();
        java.lang.String str14 = staff3.getEmail();
        java.lang.String str15 = staff3.getAccountType();
        java.lang.String str16 = staff3.getAccountType();
        java.lang.String str17 = staff3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "staff" + "'", str15, "staff");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "staff" + "'", str16, "staff");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test24359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24359");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        java.lang.String str6 = staff3.getPassword();
        staff3.setVerified(false);
        staff3.setVerified(false);
        java.lang.String str11 = staff3.getAccountType();
        staff3.logout();
        staff3.viewProfile();
        java.lang.String str14 = staff3.getEmail();
        staff3.viewProfile();
        java.lang.Class<?> wildcardClass16 = staff3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "staff" + "'", str11, "staff");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test24360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24360");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        boolean boolean6 = staff3.isVerified();
        staff3.viewProfile();
        java.lang.String str8 = staff3.getAccountType();
        staff3.logout();
        staff3.logout();
        java.lang.String str11 = staff3.getPassword();
        java.lang.String str12 = staff3.getEmail();
        java.lang.String str13 = staff3.getPassword();
        staff3.setVerified(true);
        double double16 = staff3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "staff" + "'", str8, "staff");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 40.0d + "'", double16 == 40.0d);
    }

    @Test
    public void test24361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24361");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        boolean boolean5 = staff3.isVerified();
        java.lang.String str6 = staff3.getID();
        staff3.setVerified(false);
        java.lang.String str9 = staff3.getID();
        staff3.setVerified(false);
        staff3.logout();
        java.lang.String str13 = staff3.getAccountType();
        java.lang.String str14 = staff3.getAccountType();
        staff3.viewProfile();
        java.lang.String str16 = staff3.getEmail();
        staff3.logout();
        java.lang.String str18 = staff3.getPassword();
        staff3.login("", "staff");
        java.lang.String str22 = staff3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "staff" + "'", str13, "staff");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "staff" + "'", str14, "staff");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test24362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24362");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        staff3.logout();
        java.lang.String str5 = staff3.getID();
        java.lang.String str6 = staff3.getEmail();
        java.lang.String str7 = staff3.getPassword();
        java.lang.String str8 = staff3.getID();
        staff3.logout();
        staff3.logout();
        staff3.viewProfile();
        java.lang.String str12 = staff3.getEmail();
        staff3.logout();
        java.lang.String str14 = staff3.getAccountType();
        staff3.viewProfile();
        boolean boolean16 = staff3.isVerified();
        java.lang.String str17 = staff3.getPassword();
        double double18 = staff3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "staff" + "'", str14, "staff");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 40.0d + "'", double18 == 40.0d);
    }

    @Test
    public void test24363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24363");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        boolean boolean6 = staff3.isVerified();
        staff3.logout();
        staff3.setVerified(false);
        java.lang.String str10 = staff3.getID();
        staff3.viewProfile();
        double double12 = staff3.getHourlyRate();
        java.lang.String str13 = staff3.getEmail();
        java.lang.String str14 = staff3.getPassword();
        boolean boolean15 = staff3.isVerified();
        java.lang.String str16 = staff3.getPassword();
        staff3.login("hi!", "staff");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 40.0d + "'", double12 == 40.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test24364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24364");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        boolean boolean5 = staff3.isVerified();
        java.lang.String str6 = staff3.getAccountType();
        staff3.logout();
        staff3.setVerified(true);
        staff3.setVerified(true);
        staff3.logout();
        boolean boolean13 = staff3.isVerified();
        staff3.logout();
        staff3.viewProfile();
        staff3.viewProfile();
        double double17 = staff3.getHourlyRate();
        double double18 = staff3.getHourlyRate();
        java.lang.String str19 = staff3.getEmail();
        staff3.setVerified(false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "staff" + "'", str6, "staff");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 40.0d + "'", double17 == 40.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 40.0d + "'", double18 == 40.0d);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test24365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24365");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        staff3.logout();
        java.lang.String str5 = staff3.getAccountType();
        java.lang.Class<?> wildcardClass6 = staff3.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test24366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24366");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        staff3.logout();
        staff3.viewProfile();
        staff3.login("", "");
        java.lang.String str9 = staff3.getEmail();
        staff3.logout();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test24367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24367");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        staff3.logout();
        java.lang.String str5 = staff3.getID();
        java.lang.String str6 = staff3.getEmail();
        java.lang.String str7 = staff3.getEmail();
        staff3.viewProfile();
        java.lang.String str9 = staff3.getEmail();
        double double10 = staff3.getHourlyRate();
        staff3.viewProfile();
        staff3.login("", "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 40.0d + "'", double10 == 40.0d);
    }

    @Test
    public void test24368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24368");
        model.Staff staff3 = new model.Staff("hi!", "", "hi!");
        java.lang.String str4 = staff3.getAccountType();
        java.lang.String str5 = staff3.getID();
        staff3.setVerified(true);
        staff3.login("staff", "staff");
        java.lang.String str11 = staff3.getID();
        staff3.viewProfile();
        staff3.viewProfile();
        java.lang.String str14 = staff3.getAccountType();
        double double15 = staff3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "staff" + "'", str4, "staff");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "staff" + "'", str14, "staff");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 40.0d + "'", double15 == 40.0d);
    }

    @Test
    public void test24369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24369");
        model.Staff staff3 = new model.Staff("hi!", "", "hi!");
        staff3.setVerified(false);
        staff3.viewProfile();
        java.lang.String str7 = staff3.getEmail();
        java.lang.String str8 = staff3.getAccountType();
        java.lang.String str9 = staff3.getID();
        staff3.setVerified(false);
        double double12 = staff3.getHourlyRate();
        java.lang.String str13 = staff3.getAccountType();
        boolean boolean14 = staff3.isVerified();
        boolean boolean15 = staff3.isVerified();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "staff" + "'", str8, "staff");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 40.0d + "'", double12 == 40.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "staff" + "'", str13, "staff");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test24370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24370");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        staff3.logout();
        java.lang.String str5 = staff3.getID();
        java.lang.String str6 = staff3.getEmail();
        double double7 = staff3.getHourlyRate();
        boolean boolean8 = staff3.isVerified();
        boolean boolean9 = staff3.isVerified();
        staff3.login("", "staff");
        staff3.setVerified(true);
        staff3.setVerified(true);
        staff3.setVerified(false);
        staff3.logout();
        staff3.viewProfile();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 40.0d + "'", double7 == 40.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test24371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24371");
        model.Staff staff3 = new model.Staff("hi!", "", "hi!");
        staff3.setVerified(false);
        java.lang.String str6 = staff3.getPassword();
        java.lang.String str7 = staff3.getAccountType();
        staff3.viewProfile();
        staff3.logout();
        staff3.logout();
        java.lang.String str11 = staff3.getAccountType();
        boolean boolean12 = staff3.isVerified();
        staff3.login("", "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "staff" + "'", str7, "staff");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "staff" + "'", str11, "staff");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test24372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24372");
        model.Staff staff3 = new model.Staff("hi!", "", "hi!");
        staff3.logout();
        staff3.login("hi!", "hi!");
        double double8 = staff3.getHourlyRate();
        java.lang.String str9 = staff3.getID();
        staff3.logout();
        staff3.login("staff", "");
        staff3.viewProfile();
        java.lang.String str15 = staff3.getPassword();
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 40.0d + "'", double8 == 40.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test24373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24373");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        boolean boolean5 = staff3.isVerified();
        java.lang.String str6 = staff3.getID();
        staff3.setVerified(false);
        boolean boolean9 = staff3.isVerified();
        double double10 = staff3.getHourlyRate();
        java.lang.String str11 = staff3.getPassword();
        java.lang.String str12 = staff3.getID();
        boolean boolean13 = staff3.isVerified();
        staff3.login("staff", "hi!");
        java.lang.String str17 = staff3.getID();
        java.lang.String str18 = staff3.getAccountType();
        java.lang.String str19 = staff3.getAccountType();
        java.lang.String str20 = staff3.getID();
        java.lang.String str21 = staff3.getEmail();
        java.lang.String str22 = staff3.getPassword();
        staff3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 40.0d + "'", double10 == 40.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "staff" + "'", str18, "staff");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "staff" + "'", str19, "staff");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test24374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24374");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        boolean boolean6 = staff3.isVerified();
        staff3.login("", "");
        double double10 = staff3.getHourlyRate();
        java.lang.String str11 = staff3.getPassword();
        staff3.logout();
        boolean boolean13 = staff3.isVerified();
        staff3.login("", "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 40.0d + "'", double10 == 40.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test24375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24375");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        boolean boolean5 = staff3.isVerified();
        java.lang.String str6 = staff3.getID();
        java.lang.String str7 = staff3.getID();
        staff3.setVerified(true);
        java.lang.String str10 = staff3.getEmail();
        staff3.setVerified(true);
        staff3.login("", "");
        java.lang.String str16 = staff3.getID();
        staff3.viewProfile();
        java.lang.String str18 = staff3.getAccountType();
        staff3.viewProfile();
        staff3.setVerified(false);
        java.lang.String str22 = staff3.getID();
        staff3.login("", "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "staff" + "'", str18, "staff");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
    }

    @Test
    public void test24376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24376");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        boolean boolean5 = staff3.isVerified();
        java.lang.String str6 = staff3.getAccountType();
        staff3.logout();
        java.lang.String str8 = staff3.getEmail();
        staff3.viewProfile();
        java.lang.String str10 = staff3.getID();
        staff3.login("", "staff");
        staff3.logout();
        staff3.setVerified(false);
        java.lang.String str17 = staff3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "staff" + "'", str6, "staff");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test24377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24377");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        boolean boolean6 = staff3.isVerified();
        staff3.login("", "");
        java.lang.String str10 = staff3.getID();
        staff3.logout();
        java.lang.String str12 = staff3.getID();
        boolean boolean13 = staff3.isVerified();
        double double14 = staff3.getHourlyRate();
        double double15 = staff3.getHourlyRate();
        java.lang.String str16 = staff3.getID();
        staff3.logout();
        double double18 = staff3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 40.0d + "'", double14 == 40.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 40.0d + "'", double15 == 40.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 40.0d + "'", double18 == 40.0d);
    }

    @Test
    public void test24378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24378");
        model.Staff staff3 = new model.Staff("hi!", "", "hi!");
        staff3.setVerified(false);
        java.lang.String str6 = staff3.getPassword();
        java.lang.String str7 = staff3.getAccountType();
        java.lang.String str8 = staff3.getEmail();
        staff3.setVerified(true);
        boolean boolean11 = staff3.isVerified();
        staff3.login("hi!", "staff");
        double double15 = staff3.getHourlyRate();
        staff3.logout();
        java.lang.String str17 = staff3.getAccountType();
        staff3.setVerified(false);
        java.lang.Class<?> wildcardClass20 = staff3.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "staff" + "'", str7, "staff");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 40.0d + "'", double15 == 40.0d);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "staff" + "'", str17, "staff");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test24379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24379");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        staff3.logout();
        java.lang.String str5 = staff3.getID();
        java.lang.String str6 = staff3.getEmail();
        java.lang.String str7 = staff3.getEmail();
        java.lang.String str8 = staff3.getEmail();
        java.lang.String str9 = staff3.getID();
        java.lang.String str10 = staff3.getPassword();
        staff3.viewProfile();
        java.lang.String str12 = staff3.getAccountType();
        staff3.login("staff", "hi!");
        java.lang.String str16 = staff3.getAccountType();
        java.lang.Class<?> wildcardClass17 = staff3.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "staff" + "'", str12, "staff");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "staff" + "'", str16, "staff");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test24380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24380");
        model.Staff staff3 = new model.Staff("hi!", "hi!", "");
        staff3.logout();
        java.lang.String str5 = staff3.getEmail();
        boolean boolean6 = staff3.isVerified();
        staff3.login("", "staff");
        boolean boolean10 = staff3.isVerified();
        java.lang.String str11 = staff3.getEmail();
        double double12 = staff3.getHourlyRate();
        staff3.setVerified(true);
        boolean boolean15 = staff3.isVerified();
        staff3.logout();
        staff3.logout();
        java.lang.String str18 = staff3.getPassword();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 40.0d + "'", double12 == 40.0d);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test24381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24381");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        java.lang.String str6 = staff3.getPassword();
        staff3.setVerified(false);
        staff3.setVerified(false);
        staff3.viewProfile();
        staff3.login("staff", "");
        staff3.logout();
        staff3.login("hi!", "hi!");
        staff3.logout();
        java.lang.String str20 = staff3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "staff" + "'", str20, "staff");
    }

    @Test
    public void test24382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24382");
        model.Staff staff3 = new model.Staff("hi!", "", "hi!");
        java.lang.String str4 = staff3.getAccountType();
        java.lang.String str5 = staff3.getID();
        java.lang.String str6 = staff3.getAccountType();
        double double7 = staff3.getHourlyRate();
        java.lang.String str8 = staff3.getAccountType();
        java.lang.String str9 = staff3.getPassword();
        staff3.login("staff", "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "staff" + "'", str4, "staff");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "staff" + "'", str6, "staff");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 40.0d + "'", double7 == 40.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "staff" + "'", str8, "staff");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test24383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24383");
        model.Staff staff3 = new model.Staff("hi!", "", "hi!");
        java.lang.String str4 = staff3.getAccountType();
        java.lang.String str5 = staff3.getID();
        java.lang.String str6 = staff3.getAccountType();
        staff3.logout();
        staff3.logout();
        staff3.logout();
        java.lang.String str10 = staff3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "staff" + "'", str4, "staff");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "staff" + "'", str6, "staff");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test24384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24384");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        boolean boolean5 = staff3.isVerified();
        java.lang.String str6 = staff3.getID();
        boolean boolean7 = staff3.isVerified();
        java.lang.String str8 = staff3.getID();
        java.lang.String str9 = staff3.getAccountType();
        staff3.logout();
        staff3.viewProfile();
        java.lang.String str12 = staff3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "staff" + "'", str9, "staff");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "staff" + "'", str12, "staff");
    }

    @Test
    public void test24385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24385");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        boolean boolean6 = staff3.isVerified();
        staff3.logout();
        staff3.setVerified(false);
        java.lang.String str10 = staff3.getID();
        java.lang.String str11 = staff3.getAccountType();
        java.lang.String str12 = staff3.getPassword();
        double double13 = staff3.getHourlyRate();
        java.lang.String str14 = staff3.getPassword();
        staff3.viewProfile();
        java.lang.String str16 = staff3.getID();
        java.lang.String str17 = staff3.getPassword();
        staff3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "staff" + "'", str11, "staff");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 40.0d + "'", double13 == 40.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test24386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24386");
        model.Staff staff3 = new model.Staff("hi!", "", "hi!");
        java.lang.String str4 = staff3.getAccountType();
        java.lang.String str5 = staff3.getID();
        staff3.setVerified(true);
        staff3.login("staff", "staff");
        java.lang.String str11 = staff3.getPassword();
        java.lang.String str12 = staff3.getEmail();
        staff3.logout();
        boolean boolean14 = staff3.isVerified();
        staff3.setVerified(true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "staff" + "'", str4, "staff");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test24387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24387");
        model.Staff staff3 = new model.Staff("hi!", "", "hi!");
        staff3.logout();
        boolean boolean5 = staff3.isVerified();
        staff3.setVerified(true);
        staff3.viewProfile();
        java.lang.String str9 = staff3.getPassword();
        java.lang.Class<?> wildcardClass10 = staff3.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test24388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24388");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        boolean boolean6 = staff3.isVerified();
        staff3.logout();
        java.lang.String str8 = staff3.getAccountType();
        java.lang.String str9 = staff3.getAccountType();
        java.lang.String str10 = staff3.getID();
        staff3.setVerified(true);
        staff3.viewProfile();
        java.lang.String str14 = staff3.getID();
        staff3.logout();
        staff3.viewProfile();
        staff3.logout();
        staff3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "staff" + "'", str8, "staff");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "staff" + "'", str9, "staff");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test24389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24389");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        java.lang.String str6 = staff3.getPassword();
        staff3.setVerified(false);
        staff3.setVerified(false);
        java.lang.String str11 = staff3.getAccountType();
        staff3.logout();
        staff3.viewProfile();
        java.lang.String str14 = staff3.getAccountType();
        staff3.setVerified(false);
        java.lang.String str17 = staff3.getAccountType();
        java.lang.String str18 = staff3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "staff" + "'", str11, "staff");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "staff" + "'", str14, "staff");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "staff" + "'", str17, "staff");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test24390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24390");
        model.Staff staff3 = new model.Staff("hi!", "staff", "");
        staff3.logout();
        staff3.logout();
        staff3.login("", "");
        double double9 = staff3.getHourlyRate();
        staff3.setVerified(false);
        java.lang.String str12 = staff3.getEmail();
        java.lang.String str13 = staff3.getAccountType();
        staff3.viewProfile();
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 40.0d + "'", double9 == 40.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "staff" + "'", str13, "staff");
    }

    @Test
    public void test24391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24391");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        boolean boolean5 = staff3.isVerified();
        java.lang.String str6 = staff3.getID();
        boolean boolean7 = staff3.isVerified();
        java.lang.String str8 = staff3.getID();
        java.lang.String str9 = staff3.getPassword();
        boolean boolean10 = staff3.isVerified();
        boolean boolean11 = staff3.isVerified();
        double double12 = staff3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 40.0d + "'", double12 == 40.0d);
    }

    @Test
    public void test24392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24392");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        boolean boolean6 = staff3.isVerified();
        staff3.login("", "");
        java.lang.String str10 = staff3.getID();
        staff3.logout();
        boolean boolean12 = staff3.isVerified();
        java.lang.String str13 = staff3.getEmail();
        staff3.login("staff", "");
        staff3.viewProfile();
        java.lang.String str18 = staff3.getEmail();
        boolean boolean19 = staff3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test24393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24393");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        boolean boolean5 = staff3.isVerified();
        java.lang.String str6 = staff3.getID();
        staff3.setVerified(false);
        java.lang.String str9 = staff3.getID();
        staff3.setVerified(false);
        java.lang.String str12 = staff3.getID();
        java.lang.String str13 = staff3.getID();
        java.lang.String str14 = staff3.getPassword();
        java.lang.String str15 = staff3.getEmail();
        java.lang.String str16 = staff3.getAccountType();
        staff3.login("staff", "hi!");
        staff3.login("", "staff");
        double double23 = staff3.getHourlyRate();
        java.lang.String str24 = staff3.getAccountType();
        boolean boolean25 = staff3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "staff" + "'", str16, "staff");
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 40.0d + "'", double23 == 40.0d);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "staff" + "'", str24, "staff");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test24394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24394");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        boolean boolean5 = staff3.isVerified();
        java.lang.String str6 = staff3.getAccountType();
        java.lang.String str7 = staff3.getAccountType();
        java.lang.String str8 = staff3.getEmail();
        staff3.logout();
        staff3.login("staff", "hi!");
        java.lang.String str13 = staff3.getID();
        staff3.logout();
        staff3.setVerified(true);
        double double17 = staff3.getHourlyRate();
        double double18 = staff3.getHourlyRate();
        java.lang.String str19 = staff3.getEmail();
        boolean boolean20 = staff3.isVerified();
        boolean boolean21 = staff3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "staff" + "'", str6, "staff");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "staff" + "'", str7, "staff");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 40.0d + "'", double17 == 40.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 40.0d + "'", double18 == 40.0d);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test24395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24395");
        model.Staff staff3 = new model.Staff("staff", "", "staff");
        staff3.setVerified(false);
        staff3.viewProfile();
        java.lang.String str7 = staff3.getEmail();
        java.lang.String str8 = staff3.getID();
        java.lang.String str9 = staff3.getID();
        staff3.setVerified(true);
        java.lang.String str12 = staff3.getID();
        java.lang.String str13 = staff3.getPassword();
        java.lang.String str14 = staff3.getEmail();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "staff" + "'", str7, "staff");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "staff" + "'", str8, "staff");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "staff" + "'", str9, "staff");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "staff" + "'", str12, "staff");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "staff" + "'", str14, "staff");
    }

    @Test
    public void test24396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24396");
        model.Staff staff3 = new model.Staff("hi!", "staff", "");
        staff3.logout();
        staff3.logout();
        staff3.login("", "staff");
        staff3.setVerified(false);
        staff3.viewProfile();
    }

    @Test
    public void test24397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24397");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        boolean boolean6 = staff3.isVerified();
        staff3.logout();
        java.lang.String str8 = staff3.getAccountType();
        java.lang.String str9 = staff3.getAccountType();
        java.lang.String str10 = staff3.getID();
        java.lang.String str11 = staff3.getID();
        staff3.login("", "staff");
        java.lang.String str15 = staff3.getEmail();
        boolean boolean16 = staff3.isVerified();
        staff3.viewProfile();
        java.lang.String str18 = staff3.getPassword();
        java.lang.String str19 = staff3.getAccountType();
        java.lang.String str20 = staff3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "staff" + "'", str8, "staff");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "staff" + "'", str9, "staff");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "staff" + "'", str19, "staff");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test24398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24398");
        model.Staff staff3 = new model.Staff("hi!", "staff", "");
        java.lang.String str4 = staff3.getEmail();
        staff3.logout();
        java.lang.String str6 = staff3.getID();
        java.lang.String str7 = staff3.getAccountType();
        boolean boolean8 = staff3.isVerified();
        java.lang.String str9 = staff3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "staff" + "'", str7, "staff");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "staff" + "'", str9, "staff");
    }

    @Test
    public void test24399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24399");
        model.Staff staff3 = new model.Staff("staff", "staff", "hi!");
        java.lang.String str4 = staff3.getEmail();
        staff3.viewProfile();
        java.lang.String str6 = staff3.getAccountType();
        java.lang.String str7 = staff3.getEmail();
        staff3.setVerified(false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "staff" + "'", str4, "staff");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "staff" + "'", str6, "staff");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "staff" + "'", str7, "staff");
    }

    @Test
    public void test24400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24400");
        model.Staff staff3 = new model.Staff("", "", "");
        staff3.viewProfile();
        java.lang.String str5 = staff3.getEmail();
        java.lang.String str6 = staff3.getEmail();
        staff3.logout();
        staff3.setVerified(true);
        java.lang.String str10 = staff3.getPassword();
        boolean boolean11 = staff3.isVerified();
        staff3.viewProfile();
        java.lang.String str13 = staff3.getEmail();
        staff3.login("", "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test24401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24401");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        double double6 = staff3.getHourlyRate();
        staff3.setVerified(true);
        java.lang.String str9 = staff3.getID();
        boolean boolean10 = staff3.isVerified();
        java.lang.String str11 = staff3.getAccountType();
        double double12 = staff3.getHourlyRate();
        staff3.login("staff", "hi!");
        java.lang.String str16 = staff3.getEmail();
        java.lang.String str17 = staff3.getPassword();
        boolean boolean18 = staff3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 40.0d + "'", double6 == 40.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "staff" + "'", str11, "staff");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 40.0d + "'", double12 == 40.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test24402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24402");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        boolean boolean6 = staff3.isVerified();
        staff3.logout();
        staff3.setVerified(false);
        java.lang.String str10 = staff3.getID();
        staff3.viewProfile();
        java.lang.String str12 = staff3.getID();
        staff3.setVerified(false);
        staff3.setVerified(false);
        staff3.logout();
        double double18 = staff3.getHourlyRate();
        java.lang.String str19 = staff3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 40.0d + "'", double18 == 40.0d);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test24403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24403");
        model.Staff staff3 = new model.Staff("hi!", "", "hi!");
        java.lang.String str4 = staff3.getAccountType();
        java.lang.String str5 = staff3.getID();
        staff3.setVerified(true);
        boolean boolean8 = staff3.isVerified();
        staff3.setVerified(false);
        java.lang.String str11 = staff3.getAccountType();
        staff3.logout();
        java.lang.String str13 = staff3.getID();
        java.lang.String str14 = staff3.getEmail();
        java.lang.String str15 = staff3.getEmail();
        java.lang.String str16 = staff3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "staff" + "'", str4, "staff");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "staff" + "'", str11, "staff");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test24404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24404");
        model.Staff staff3 = new model.Staff("", "staff", "");
        staff3.setVerified(true);
        staff3.setVerified(true);
        staff3.login("", "staff");
        java.lang.String str11 = staff3.getPassword();
        boolean boolean12 = staff3.isVerified();
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "staff" + "'", str11, "staff");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test24405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24405");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        boolean boolean5 = staff3.isVerified();
        java.lang.String str6 = staff3.getID();
        staff3.setVerified(false);
        java.lang.String str9 = staff3.getID();
        staff3.setVerified(false);
        java.lang.String str12 = staff3.getID();
        java.lang.String str13 = staff3.getID();
        double double14 = staff3.getHourlyRate();
        staff3.viewProfile();
        java.lang.String str16 = staff3.getPassword();
        staff3.setVerified(false);
        staff3.logout();
        java.lang.String str20 = staff3.getID();
        staff3.login("staff", "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 40.0d + "'", double14 == 40.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test24406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24406");
        model.Staff staff3 = new model.Staff("hi!", "", "hi!");
        staff3.setVerified(false);
        staff3.viewProfile();
        java.lang.String str7 = staff3.getEmail();
        staff3.viewProfile();
        java.lang.String str9 = staff3.getEmail();
        staff3.viewProfile();
        java.lang.String str11 = staff3.getPassword();
        java.lang.String str12 = staff3.getPassword();
        staff3.setVerified(true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test24407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24407");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        boolean boolean5 = staff3.isVerified();
        java.lang.String str6 = staff3.getAccountType();
        staff3.logout();
        java.lang.String str8 = staff3.getEmail();
        staff3.viewProfile();
        double double10 = staff3.getHourlyRate();
        java.lang.String str11 = staff3.getID();
        java.lang.String str12 = staff3.getEmail();
        staff3.logout();
        double double14 = staff3.getHourlyRate();
        staff3.setVerified(false);
        staff3.viewProfile();
        java.lang.String str18 = staff3.getID();
        java.lang.String str19 = staff3.getPassword();
        java.lang.String str20 = staff3.getEmail();
        java.lang.String str21 = staff3.getEmail();
        java.lang.String str22 = staff3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "staff" + "'", str6, "staff");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 40.0d + "'", double10 == 40.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 40.0d + "'", double14 == 40.0d);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "staff" + "'", str22, "staff");
    }

    @Test
    public void test24408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24408");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        boolean boolean5 = staff3.isVerified();
        java.lang.String str6 = staff3.getAccountType();
        staff3.logout();
        staff3.setVerified(true);
        java.lang.String str10 = staff3.getAccountType();
        double double11 = staff3.getHourlyRate();
        staff3.viewProfile();
        double double13 = staff3.getHourlyRate();
        java.lang.String str14 = staff3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "staff" + "'", str6, "staff");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "staff" + "'", str10, "staff");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 40.0d + "'", double11 == 40.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 40.0d + "'", double13 == 40.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test24409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24409");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        boolean boolean6 = staff3.isVerified();
        staff3.logout();
        staff3.setVerified(false);
        java.lang.String str10 = staff3.getID();
        java.lang.String str11 = staff3.getAccountType();
        java.lang.String str12 = staff3.getPassword();
        staff3.logout();
        staff3.setVerified(false);
        staff3.logout();
        java.lang.String str17 = staff3.getEmail();
        double double18 = staff3.getHourlyRate();
        staff3.login("staff", "staff");
        java.lang.String str22 = staff3.getEmail();
        staff3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "staff" + "'", str11, "staff");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 40.0d + "'", double18 == 40.0d);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test24410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24410");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        double double6 = staff3.getHourlyRate();
        java.lang.String str7 = staff3.getID();
        boolean boolean8 = staff3.isVerified();
        staff3.setVerified(true);
        java.lang.String str11 = staff3.getEmail();
        double double12 = staff3.getHourlyRate();
        staff3.setVerified(false);
        java.lang.String str15 = staff3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 40.0d + "'", double6 == 40.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 40.0d + "'", double12 == 40.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "staff" + "'", str15, "staff");
    }

    @Test
    public void test24411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24411");
        model.Staff staff3 = new model.Staff("hi!", "staff", "staff");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getEmail();
        double double6 = staff3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "staff" + "'", str4, "staff");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 40.0d + "'", double6 == 40.0d);
    }

    @Test
    public void test24412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24412");
        model.Staff staff3 = new model.Staff("", "staff", "");
        java.lang.String str4 = staff3.getPassword();
        java.lang.String str5 = staff3.getEmail();
        staff3.logout();
        double double7 = staff3.getHourlyRate();
        staff3.setVerified(false);
        java.lang.String str10 = staff3.getPassword();
        staff3.logout();
        java.lang.String str12 = staff3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "staff" + "'", str4, "staff");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 40.0d + "'", double7 == 40.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "staff" + "'", str10, "staff");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "staff" + "'", str12, "staff");
    }

    @Test
    public void test24413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24413");
        model.Staff staff3 = new model.Staff("hi!", "", "hi!");
        staff3.logout();
        staff3.login("hi!", "hi!");
        double double8 = staff3.getHourlyRate();
        java.lang.String str9 = staff3.getID();
        java.lang.String str10 = staff3.getAccountType();
        staff3.setVerified(true);
        staff3.logout();
        staff3.viewProfile();
        staff3.login("hi!", "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 40.0d + "'", double8 == 40.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "staff" + "'", str10, "staff");
    }

    @Test
    public void test24414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24414");
        model.Staff staff3 = new model.Staff("hi!", "staff", "");
        staff3.logout();
        java.lang.String str5 = staff3.getEmail();
        staff3.login("", "");
        staff3.login("", "staff");
        double double12 = staff3.getHourlyRate();
        java.lang.String str13 = staff3.getAccountType();
        staff3.setVerified(false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 40.0d + "'", double12 == 40.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "staff" + "'", str13, "staff");
    }

    @Test
    public void test24415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24415");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        boolean boolean5 = staff3.isVerified();
        java.lang.String str6 = staff3.getAccountType();
        staff3.logout();
        double double8 = staff3.getHourlyRate();
        java.lang.String str9 = staff3.getEmail();
        java.lang.String str10 = staff3.getPassword();
        boolean boolean11 = staff3.isVerified();
        boolean boolean12 = staff3.isVerified();
        java.lang.String str13 = staff3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "staff" + "'", str6, "staff");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 40.0d + "'", double8 == 40.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "staff" + "'", str13, "staff");
    }

    @Test
    public void test24416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24416");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        staff3.logout();
        java.lang.String str5 = staff3.getID();
        java.lang.String str6 = staff3.getEmail();
        double double7 = staff3.getHourlyRate();
        java.lang.String str8 = staff3.getPassword();
        staff3.login("hi!", "hi!");
        staff3.logout();
        staff3.viewProfile();
        staff3.logout();
        boolean boolean15 = staff3.isVerified();
        staff3.logout();
        staff3.logout();
        staff3.viewProfile();
        java.lang.String str19 = staff3.getEmail();
        double double20 = staff3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 40.0d + "'", double7 == 40.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 40.0d + "'", double20 == 40.0d);
    }

    @Test
    public void test24417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24417");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        boolean boolean6 = staff3.isVerified();
        staff3.logout();
        java.lang.String str8 = staff3.getEmail();
        java.lang.String str9 = staff3.getPassword();
        boolean boolean10 = staff3.isVerified();
        boolean boolean11 = staff3.isVerified();
        double double12 = staff3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 40.0d + "'", double12 == 40.0d);
    }

    @Test
    public void test24418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24418");
        model.Staff staff3 = new model.Staff("staff", "hi!", "staff");
        boolean boolean4 = staff3.isVerified();
        java.lang.String str5 = staff3.getAccountType();
        java.lang.String str6 = staff3.getID();
        java.lang.Class<?> wildcardClass7 = staff3.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "staff" + "'", str6, "staff");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test24419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24419");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        boolean boolean5 = staff3.isVerified();
        java.lang.String str6 = staff3.getAccountType();
        staff3.logout();
        java.lang.String str8 = staff3.getEmail();
        staff3.viewProfile();
        java.lang.String str10 = staff3.getID();
        boolean boolean11 = staff3.isVerified();
        java.lang.String str12 = staff3.getAccountType();
        double double13 = staff3.getHourlyRate();
        staff3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "staff" + "'", str6, "staff");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "staff" + "'", str12, "staff");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 40.0d + "'", double13 == 40.0d);
    }

    @Test
    public void test24420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24420");
        model.Staff staff3 = new model.Staff("hi!", "", "hi!");
        staff3.setVerified(false);
        java.lang.String str6 = staff3.getEmail();
        java.lang.String str7 = staff3.getAccountType();
        staff3.viewProfile();
        java.lang.String str9 = staff3.getAccountType();
        java.lang.String str10 = staff3.getPassword();
        staff3.setVerified(true);
        staff3.viewProfile();
        java.lang.String str14 = staff3.getAccountType();
        java.lang.String str15 = staff3.getAccountType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "staff" + "'", str7, "staff");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "staff" + "'", str9, "staff");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "staff" + "'", str14, "staff");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "staff" + "'", str15, "staff");
    }

    @Test
    public void test24421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24421");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        boolean boolean5 = staff3.isVerified();
        java.lang.String str6 = staff3.getAccountType();
        staff3.logout();
        java.lang.String str8 = staff3.getEmail();
        staff3.viewProfile();
        double double10 = staff3.getHourlyRate();
        boolean boolean11 = staff3.isVerified();
        java.lang.String str12 = staff3.getPassword();
        boolean boolean13 = staff3.isVerified();
        staff3.login("hi!", "staff");
        staff3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "staff" + "'", str6, "staff");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 40.0d + "'", double10 == 40.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test24422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24422");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        boolean boolean6 = staff3.isVerified();
        staff3.logout();
        java.lang.String str8 = staff3.getAccountType();
        java.lang.String str9 = staff3.getAccountType();
        staff3.login("staff", "staff");
        java.lang.Class<?> wildcardClass13 = staff3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "staff" + "'", str8, "staff");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "staff" + "'", str9, "staff");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test24423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24423");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        boolean boolean6 = staff3.isVerified();
        staff3.logout();
        staff3.setVerified(false);
        java.lang.String str10 = staff3.getEmail();
        staff3.logout();
        staff3.viewProfile();
        staff3.viewProfile();
        staff3.setVerified(false);
        java.lang.String str16 = staff3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test24424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24424");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        boolean boolean5 = staff3.isVerified();
        java.lang.String str6 = staff3.getID();
        java.lang.String str7 = staff3.getID();
        staff3.setVerified(true);
        java.lang.String str10 = staff3.getEmail();
        staff3.setVerified(true);
        java.lang.String str13 = staff3.getID();
        boolean boolean14 = staff3.isVerified();
        java.lang.String str15 = staff3.getPassword();
        java.lang.String str16 = staff3.getEmail();
        staff3.setVerified(false);
        boolean boolean19 = staff3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test24425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24425");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        boolean boolean5 = staff3.isVerified();
        java.lang.String str6 = staff3.getID();
        staff3.setVerified(false);
        java.lang.String str9 = staff3.getID();
        staff3.setVerified(false);
        java.lang.String str12 = staff3.getID();
        java.lang.String str13 = staff3.getID();
        double double14 = staff3.getHourlyRate();
        staff3.viewProfile();
        java.lang.String str16 = staff3.getID();
        java.lang.String str17 = staff3.getAccountType();
        staff3.viewProfile();
        java.lang.String str19 = staff3.getEmail();
        staff3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 40.0d + "'", double14 == 40.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "staff" + "'", str17, "staff");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test24426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24426");
        model.Staff staff3 = new model.Staff("", "", "staff");
        staff3.login("staff", "staff");
        double double7 = staff3.getHourlyRate();
        double double8 = staff3.getHourlyRate();
        java.lang.String str9 = staff3.getEmail();
        staff3.viewProfile();
        staff3.viewProfile();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 40.0d + "'", double7 == 40.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 40.0d + "'", double8 == 40.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test24427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24427");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        double double6 = staff3.getHourlyRate();
        staff3.logout();
        staff3.viewProfile();
        java.lang.String str9 = staff3.getEmail();
        boolean boolean10 = staff3.isVerified();
        java.lang.String str11 = staff3.getPassword();
        double double12 = staff3.getHourlyRate();
        staff3.logout();
        boolean boolean14 = staff3.isVerified();
        java.lang.String str15 = staff3.getID();
        staff3.viewProfile();
        staff3.setVerified(true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 40.0d + "'", double6 == 40.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 40.0d + "'", double12 == 40.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test24428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24428");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        boolean boolean6 = staff3.isVerified();
        staff3.viewProfile();
        staff3.login("staff", "");
        java.lang.String str11 = staff3.getAccountType();
        double double12 = staff3.getHourlyRate();
        double double13 = staff3.getHourlyRate();
        staff3.login("", "");
        staff3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "staff" + "'", str11, "staff");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 40.0d + "'", double12 == 40.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 40.0d + "'", double13 == 40.0d);
    }

    @Test
    public void test24429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24429");
        model.Staff staff3 = new model.Staff("hi!", "", "hi!");
        staff3.setVerified(false);
        staff3.viewProfile();
        java.lang.String str7 = staff3.getEmail();
        staff3.login("hi!", "");
        staff3.setVerified(false);
        java.lang.String str13 = staff3.getPassword();
        java.lang.String str14 = staff3.getEmail();
        java.lang.String str15 = staff3.getPassword();
        staff3.login("", "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test24430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24430");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        boolean boolean6 = staff3.isVerified();
        staff3.logout();
        staff3.setVerified(false);
        staff3.viewProfile();
        staff3.login("hi!", "");
        staff3.setVerified(true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test24431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24431");
        model.Staff staff3 = new model.Staff("hi!", "", "hi!");
        java.lang.String str4 = staff3.getAccountType();
        java.lang.String str5 = staff3.getID();
        staff3.setVerified(true);
        staff3.login("staff", "staff");
        java.lang.String str11 = staff3.getID();
        staff3.viewProfile();
        boolean boolean13 = staff3.isVerified();
        staff3.setVerified(false);
        staff3.login("", "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "staff" + "'", str4, "staff");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test24432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24432");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        java.lang.String str6 = staff3.getPassword();
        java.lang.String str7 = staff3.getPassword();
        staff3.login("hi!", "hi!");
        java.lang.String str11 = staff3.getPassword();
        double double12 = staff3.getHourlyRate();
        staff3.viewProfile();
        java.lang.String str14 = staff3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 40.0d + "'", double12 == 40.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test24433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24433");
        model.Staff staff3 = new model.Staff("hi!", "", "hi!");
        java.lang.String str4 = staff3.getPassword();
        java.lang.String str5 = staff3.getID();
        java.lang.String str6 = staff3.getEmail();
        staff3.login("", "staff");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test24434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24434");
        model.Staff staff3 = new model.Staff("hi!", "", "hi!");
        staff3.setVerified(false);
        java.lang.String str6 = staff3.getPassword();
        java.lang.String str7 = staff3.getAccountType();
        java.lang.String str8 = staff3.getEmail();
        staff3.viewProfile();
        boolean boolean10 = staff3.isVerified();
        staff3.logout();
        staff3.login("staff", "hi!");
        java.lang.String str15 = staff3.getPassword();
        double double16 = staff3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "staff" + "'", str7, "staff");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 40.0d + "'", double16 == 40.0d);
    }

    @Test
    public void test24435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24435");
        model.Staff staff3 = new model.Staff("hi!", "", "staff");
        staff3.setVerified(false);
        java.lang.String str6 = staff3.getID();
        double double7 = staff3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "staff" + "'", str6, "staff");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 40.0d + "'", double7 == 40.0d);
    }

    @Test
    public void test24436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24436");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        staff3.login("", "");
        double double7 = staff3.getHourlyRate();
        staff3.login("staff", "staff");
        java.lang.String str11 = staff3.getID();
        java.lang.String str12 = staff3.getAccountType();
        java.lang.String str13 = staff3.getAccountType();
        java.lang.String str14 = staff3.getEmail();
        java.lang.String str15 = staff3.getPassword();
        staff3.setVerified(false);
        java.lang.String str18 = staff3.getID();
        double double19 = staff3.getHourlyRate();
        staff3.logout();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 40.0d + "'", double7 == 40.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "staff" + "'", str12, "staff");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "staff" + "'", str13, "staff");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 40.0d + "'", double19 == 40.0d);
    }

    @Test
    public void test24437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24437");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        boolean boolean5 = staff3.isVerified();
        java.lang.String str6 = staff3.getAccountType();
        staff3.logout();
        java.lang.String str8 = staff3.getEmail();
        staff3.viewProfile();
        java.lang.String str10 = staff3.getID();
        staff3.logout();
        staff3.login("staff", "");
        java.lang.String str15 = staff3.getEmail();
        staff3.logout();
        java.lang.String str17 = staff3.getEmail();
        staff3.logout();
        java.lang.String str19 = staff3.getEmail();
        java.lang.String str20 = staff3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "staff" + "'", str6, "staff");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test24438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24438");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        staff3.logout();
        java.lang.String str5 = staff3.getID();
        java.lang.String str6 = staff3.getEmail();
        double double7 = staff3.getHourlyRate();
        boolean boolean8 = staff3.isVerified();
        java.lang.String str9 = staff3.getID();
        java.lang.String str10 = staff3.getAccountType();
        staff3.login("hi!", "hi!");
        staff3.setVerified(false);
        double double16 = staff3.getHourlyRate();
        java.lang.String str17 = staff3.getPassword();
        double double18 = staff3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 40.0d + "'", double7 == 40.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "staff" + "'", str10, "staff");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 40.0d + "'", double16 == 40.0d);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 40.0d + "'", double18 == 40.0d);
    }

    @Test
    public void test24439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24439");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        boolean boolean6 = staff3.isVerified();
        staff3.viewProfile();
        java.lang.String str8 = staff3.getAccountType();
        java.lang.String str9 = staff3.getID();
        double double10 = staff3.getHourlyRate();
        staff3.setVerified(true);
        java.lang.String str13 = staff3.getPassword();
        java.lang.String str14 = staff3.getPassword();
        double double15 = staff3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "staff" + "'", str8, "staff");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 40.0d + "'", double10 == 40.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 40.0d + "'", double15 == 40.0d);
    }

    @Test
    public void test24440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24440");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        boolean boolean6 = staff3.isVerified();
        staff3.logout();
        java.lang.String str8 = staff3.getPassword();
        java.lang.String str9 = staff3.getEmail();
        double double10 = staff3.getHourlyRate();
        staff3.login("hi!", "staff");
        java.lang.String str14 = staff3.getAccountType();
        staff3.login("", "staff");
        staff3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 40.0d + "'", double10 == 40.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "staff" + "'", str14, "staff");
    }

    @Test
    public void test24441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24441");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        boolean boolean5 = staff3.isVerified();
        java.lang.String str6 = staff3.getID();
        java.lang.String str7 = staff3.getID();
        staff3.login("hi!", "");
        java.lang.String str11 = staff3.getPassword();
        boolean boolean12 = staff3.isVerified();
        staff3.setVerified(true);
        double double15 = staff3.getHourlyRate();
        double double16 = staff3.getHourlyRate();
        java.lang.String str17 = staff3.getAccountType();
        staff3.login("", "");
        double double21 = staff3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 40.0d + "'", double15 == 40.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 40.0d + "'", double16 == 40.0d);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "staff" + "'", str17, "staff");
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 40.0d + "'", double21 == 40.0d);
    }

    @Test
    public void test24442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24442");
        model.Staff staff3 = new model.Staff("", "staff", "staff");
        double double4 = staff3.getHourlyRate();
        java.lang.String str5 = staff3.getAccountType();
        double double6 = staff3.getHourlyRate();
        java.lang.String str7 = staff3.getPassword();
        boolean boolean8 = staff3.isVerified();
        staff3.viewProfile();
        java.lang.String str10 = staff3.getAccountType();
        java.lang.String str11 = staff3.getEmail();
        staff3.setVerified(false);
        java.lang.String str14 = staff3.getEmail();
        staff3.setVerified(false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 40.0d + "'", double4 == 40.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 40.0d + "'", double6 == 40.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "staff" + "'", str7, "staff");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "staff" + "'", str10, "staff");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test24443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24443");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        boolean boolean5 = staff3.isVerified();
        java.lang.String str6 = staff3.getID();
        staff3.setVerified(false);
        java.lang.String str9 = staff3.getID();
        staff3.setVerified(false);
        java.lang.String str12 = staff3.getID();
        java.lang.String str13 = staff3.getEmail();
        java.lang.String str14 = staff3.getID();
        staff3.login("", "");
        boolean boolean18 = staff3.isVerified();
        boolean boolean19 = staff3.isVerified();
        staff3.login("", "hi!");
        staff3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test24444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24444");
        model.Staff staff3 = new model.Staff("hi!", "hi!", "");
        staff3.setVerified(true);
        staff3.login("hi!", "hi!");
        java.lang.String str9 = staff3.getID();
        staff3.logout();
        java.lang.String str11 = staff3.getAccountType();
        java.lang.Class<?> wildcardClass12 = staff3.getClass();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "staff" + "'", str11, "staff");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test24445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24445");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        boolean boolean5 = staff3.isVerified();
        java.lang.String str6 = staff3.getID();
        staff3.login("", "staff");
        staff3.setVerified(true);
        java.lang.String str12 = staff3.getID();
        java.lang.Class<?> wildcardClass13 = staff3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test24446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24446");
        model.Staff staff3 = new model.Staff("hi!", "", "hi!");
        java.lang.String str4 = staff3.getAccountType();
        java.lang.String str5 = staff3.getEmail();
        staff3.viewProfile();
        staff3.setVerified(true);
        java.lang.String str9 = staff3.getPassword();
        staff3.setVerified(false);
        java.lang.String str12 = staff3.getAccountType();
        java.lang.String str13 = staff3.getEmail();
        java.lang.String str14 = staff3.getAccountType();
        double double15 = staff3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "staff" + "'", str4, "staff");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "staff" + "'", str12, "staff");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "staff" + "'", str14, "staff");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 40.0d + "'", double15 == 40.0d);
    }

    @Test
    public void test24447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24447");
        model.Staff staff3 = new model.Staff("hi!", "", "hi!");
        java.lang.String str4 = staff3.getAccountType();
        java.lang.String str5 = staff3.getEmail();
        double double6 = staff3.getHourlyRate();
        boolean boolean7 = staff3.isVerified();
        staff3.logout();
        java.lang.String str9 = staff3.getEmail();
        java.lang.String str10 = staff3.getEmail();
        java.lang.String str11 = staff3.getID();
        java.lang.String str12 = staff3.getPassword();
        staff3.login("staff", "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "staff" + "'", str4, "staff");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 40.0d + "'", double6 == 40.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test24448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24448");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        staff3.logout();
        java.lang.String str5 = staff3.getID();
        java.lang.String str6 = staff3.getEmail();
        staff3.viewProfile();
        staff3.setVerified(false);
        java.lang.String str10 = staff3.getID();
        java.lang.String str11 = staff3.getEmail();
        java.lang.String str12 = staff3.getAccountType();
        staff3.logout();
        java.lang.String str14 = staff3.getEmail();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "staff" + "'", str12, "staff");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test24449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24449");
        model.Staff staff3 = new model.Staff("hi!", "", "hi!");
        staff3.logout();
        staff3.login("hi!", "hi!");
        double double8 = staff3.getHourlyRate();
        java.lang.String str9 = staff3.getID();
        java.lang.String str10 = staff3.getAccountType();
        staff3.viewProfile();
        java.lang.String str12 = staff3.getID();
        staff3.setVerified(true);
        double double15 = staff3.getHourlyRate();
        java.lang.String str16 = staff3.getID();
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 40.0d + "'", double8 == 40.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "staff" + "'", str10, "staff");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 40.0d + "'", double15 == 40.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test24450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24450");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        boolean boolean5 = staff3.isVerified();
        java.lang.String str6 = staff3.getID();
        staff3.setVerified(false);
        java.lang.String str9 = staff3.getID();
        staff3.setVerified(false);
        java.lang.String str12 = staff3.getID();
        double double13 = staff3.getHourlyRate();
        boolean boolean14 = staff3.isVerified();
        staff3.logout();
        staff3.logout();
        java.lang.String str17 = staff3.getAccountType();
        staff3.viewProfile();
        boolean boolean19 = staff3.isVerified();
        staff3.login("staff", "staff");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 40.0d + "'", double13 == 40.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "staff" + "'", str17, "staff");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test24451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24451");
        model.Staff staff3 = new model.Staff("hi!", "hi!", "");
        staff3.logout();
        java.lang.String str5 = staff3.getEmail();
        staff3.logout();
        java.lang.String str7 = staff3.getID();
        java.lang.String str8 = staff3.getID();
        double double9 = staff3.getHourlyRate();
        java.lang.String str10 = staff3.getAccountType();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 40.0d + "'", double9 == 40.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "staff" + "'", str10, "staff");
    }

    @Test
    public void test24452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24452");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        boolean boolean5 = staff3.isVerified();
        java.lang.String str6 = staff3.getAccountType();
        staff3.logout();
        double double8 = staff3.getHourlyRate();
        java.lang.String str9 = staff3.getEmail();
        java.lang.String str10 = staff3.getAccountType();
        staff3.setVerified(true);
        staff3.login("hi!", "staff");
        boolean boolean16 = staff3.isVerified();
        staff3.login("staff", "");
        boolean boolean20 = staff3.isVerified();
        staff3.viewProfile();
        staff3.logout();
        staff3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "staff" + "'", str6, "staff");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 40.0d + "'", double8 == 40.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "staff" + "'", str10, "staff");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test24453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24453");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        java.lang.String str6 = staff3.getPassword();
        double double7 = staff3.getHourlyRate();
        staff3.logout();
        staff3.viewProfile();
        staff3.login("", "");
        java.lang.String str13 = staff3.getAccountType();
        staff3.viewProfile();
        java.lang.String str15 = staff3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 40.0d + "'", double7 == 40.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "staff" + "'", str13, "staff");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test24454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24454");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        staff3.logout();
        java.lang.String str5 = staff3.getID();
        java.lang.String str6 = staff3.getPassword();
        staff3.logout();
        staff3.login("staff", "hi!");
        java.lang.String str11 = staff3.getAccountType();
        java.lang.String str12 = staff3.getID();
        java.lang.String str13 = staff3.getPassword();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "staff" + "'", str11, "staff");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test24455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24455");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        boolean boolean6 = staff3.isVerified();
        staff3.logout();
        staff3.setVerified(false);
        java.lang.String str10 = staff3.getID();
        double double11 = staff3.getHourlyRate();
        java.lang.String str12 = staff3.getPassword();
        staff3.login("hi!", "hi!");
        staff3.setVerified(true);
        java.lang.String str18 = staff3.getID();
        java.lang.String str19 = staff3.getEmail();
        java.lang.String str20 = staff3.getEmail();
        staff3.logout();
        staff3.viewProfile();
        java.lang.String str23 = staff3.getEmail();
        java.lang.String str24 = staff3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 40.0d + "'", double11 == 40.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "staff" + "'", str24, "staff");
    }

    @Test
    public void test24456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24456");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        boolean boolean6 = staff3.isVerified();
        staff3.logout();
        staff3.setVerified(false);
        java.lang.String str10 = staff3.getAccountType();
        java.lang.String str11 = staff3.getEmail();
        boolean boolean12 = staff3.isVerified();
        staff3.login("", "staff");
        staff3.login("", "staff");
        java.lang.String str19 = staff3.getEmail();
        java.lang.String str20 = staff3.getPassword();
        staff3.logout();
        java.lang.String str22 = staff3.getEmail();
        java.lang.String str23 = staff3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "staff" + "'", str10, "staff");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
    }

    @Test
    public void test24457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24457");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        boolean boolean5 = staff3.isVerified();
        java.lang.String str6 = staff3.getAccountType();
        staff3.logout();
        double double8 = staff3.getHourlyRate();
        java.lang.String str9 = staff3.getEmail();
        java.lang.String str10 = staff3.getPassword();
        java.lang.String str11 = staff3.getID();
        java.lang.Class<?> wildcardClass12 = staff3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "staff" + "'", str6, "staff");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 40.0d + "'", double8 == 40.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test24458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24458");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        boolean boolean5 = staff3.isVerified();
        java.lang.String str6 = staff3.getID();
        java.lang.String str7 = staff3.getID();
        staff3.login("hi!", "");
        java.lang.String str11 = staff3.getPassword();
        boolean boolean12 = staff3.isVerified();
        boolean boolean13 = staff3.isVerified();
        boolean boolean14 = staff3.isVerified();
        staff3.logout();
        double double16 = staff3.getHourlyRate();
        java.lang.String str17 = staff3.getEmail();
        java.lang.String str18 = staff3.getEmail();
        boolean boolean19 = staff3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 40.0d + "'", double16 == 40.0d);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test24459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24459");
        model.Staff staff3 = new model.Staff("hi!", "", "hi!");
        java.lang.String str4 = staff3.getAccountType();
        java.lang.String str5 = staff3.getID();
        staff3.setVerified(true);
        staff3.login("staff", "staff");
        java.lang.String str11 = staff3.getPassword();
        java.lang.String str12 = staff3.getEmail();
        staff3.logout();
        java.lang.String str14 = staff3.getID();
        java.lang.String str15 = staff3.getID();
        staff3.setVerified(true);
        double double18 = staff3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "staff" + "'", str4, "staff");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 40.0d + "'", double18 == 40.0d);
    }

    @Test
    public void test24460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24460");
        model.Staff staff3 = new model.Staff("hi!", "", "hi!");
        staff3.logout();
        staff3.login("hi!", "hi!");
        java.lang.String str8 = staff3.getEmail();
        java.lang.String str9 = staff3.getID();
        java.lang.String str10 = staff3.getPassword();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test24461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24461");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        boolean boolean5 = staff3.isVerified();
        java.lang.String str6 = staff3.getID();
        staff3.login("", "staff");
        java.lang.String str10 = staff3.getEmail();
        boolean boolean11 = staff3.isVerified();
        java.lang.String str12 = staff3.getAccountType();
        double double13 = staff3.getHourlyRate();
        java.lang.String str14 = staff3.getID();
        boolean boolean15 = staff3.isVerified();
        java.lang.String str16 = staff3.getAccountType();
        staff3.logout();
        double double18 = staff3.getHourlyRate();
        java.lang.String str19 = staff3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "staff" + "'", str12, "staff");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 40.0d + "'", double13 == 40.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "staff" + "'", str16, "staff");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 40.0d + "'", double18 == 40.0d);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "staff" + "'", str19, "staff");
    }

    @Test
    public void test24462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24462");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getID();
        staff3.setVerified(false);
        boolean boolean8 = staff3.isVerified();
        java.lang.String str9 = staff3.getID();
        staff3.viewProfile();
        staff3.login("hi!", "");
        staff3.setVerified(true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test24463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24463");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        java.lang.String str6 = staff3.getPassword();
        staff3.setVerified(false);
        staff3.setVerified(false);
        java.lang.String str11 = staff3.getAccountType();
        staff3.logout();
        staff3.login("", "hi!");
        staff3.setVerified(true);
        staff3.viewProfile();
        double double19 = staff3.getHourlyRate();
        staff3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "staff" + "'", str11, "staff");
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 40.0d + "'", double19 == 40.0d);
    }

    @Test
    public void test24464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24464");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        boolean boolean5 = staff3.isVerified();
        java.lang.String str6 = staff3.getID();
        java.lang.String str7 = staff3.getID();
        java.lang.String str8 = staff3.getEmail();
        staff3.login("", "");
        boolean boolean12 = staff3.isVerified();
        boolean boolean13 = staff3.isVerified();
        java.lang.String str14 = staff3.getPassword();
        java.lang.String str15 = staff3.getID();
        java.lang.String str16 = staff3.getPassword();
        java.lang.String str17 = staff3.getID();
        double double18 = staff3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 40.0d + "'", double18 == 40.0d);
    }

    @Test
    public void test24465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24465");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        boolean boolean6 = staff3.isVerified();
        staff3.logout();
        staff3.setVerified(false);
        java.lang.String str10 = staff3.getEmail();
        staff3.logout();
        staff3.login("staff", "hi!");
        java.lang.String str15 = staff3.getPassword();
        staff3.login("staff", "");
        staff3.login("", "hi!");
        java.lang.String str22 = staff3.getEmail();
        staff3.login("staff", "staff");
        double double26 = staff3.getHourlyRate();
        java.lang.String str27 = staff3.getEmail();
        java.lang.String str28 = staff3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 40.0d + "'", double26 == 40.0d);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
    }

    @Test
    public void test24466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24466");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        boolean boolean5 = staff3.isVerified();
        java.lang.String str6 = staff3.getID();
        java.lang.String str7 = staff3.getID();
        java.lang.String str8 = staff3.getID();
        java.lang.String str9 = staff3.getID();
        staff3.setVerified(true);
        boolean boolean12 = staff3.isVerified();
        java.lang.String str13 = staff3.getEmail();
        staff3.login("staff", "");
        staff3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test24467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24467");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        staff3.logout();
        java.lang.String str5 = staff3.getID();
        java.lang.String str6 = staff3.getEmail();
        java.lang.String str7 = staff3.getPassword();
        java.lang.String str8 = staff3.getID();
        staff3.logout();
        staff3.logout();
        staff3.viewProfile();
        staff3.login("", "staff");
        java.lang.String str15 = staff3.getID();
        java.lang.Class<?> wildcardClass16 = staff3.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test24468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24468");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        staff3.logout();
        staff3.setVerified(false);
        java.lang.String str7 = staff3.getAccountType();
        java.lang.String str8 = staff3.getEmail();
        staff3.login("", "");
        staff3.logout();
        staff3.logout();
        staff3.setVerified(false);
        java.lang.String str16 = staff3.getID();
        java.lang.Class<?> wildcardClass17 = staff3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "staff" + "'", str7, "staff");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test24469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24469");
        model.Staff staff3 = new model.Staff("hi!", "", "hi!");
        staff3.setVerified(false);
        staff3.viewProfile();
        java.lang.String str7 = staff3.getEmail();
        java.lang.String str8 = staff3.getAccountType();
        staff3.logout();
        boolean boolean10 = staff3.isVerified();
        staff3.login("", "hi!");
        staff3.viewProfile();
        double double15 = staff3.getHourlyRate();
        staff3.viewProfile();
        boolean boolean17 = staff3.isVerified();
        boolean boolean18 = staff3.isVerified();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "staff" + "'", str8, "staff");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 40.0d + "'", double15 == 40.0d);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test24470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24470");
        model.Staff staff3 = new model.Staff("", "staff", "staff");
        staff3.setVerified(true);
        java.lang.String str6 = staff3.getPassword();
        boolean boolean7 = staff3.isVerified();
        java.lang.String str8 = staff3.getEmail();
        staff3.login("", "staff");
        java.lang.String str12 = staff3.getEmail();
        staff3.setVerified(true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "staff" + "'", str6, "staff");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test24471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24471");
        model.Staff staff3 = new model.Staff("hi!", "", "hi!");
        staff3.setVerified(false);
        java.lang.String str6 = staff3.getEmail();
        java.lang.String str7 = staff3.getAccountType();
        java.lang.String str8 = staff3.getEmail();
        staff3.logout();
        java.lang.String str10 = staff3.getEmail();
        double double11 = staff3.getHourlyRate();
        double double12 = staff3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "staff" + "'", str7, "staff");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 40.0d + "'", double11 == 40.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 40.0d + "'", double12 == 40.0d);
    }

    @Test
    public void test24472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24472");
        model.Staff staff3 = new model.Staff("hi!", "", "hi!");
        staff3.setVerified(false);
        java.lang.String str6 = staff3.getPassword();
        java.lang.String str7 = staff3.getAccountType();
        java.lang.String str8 = staff3.getEmail();
        staff3.setVerified(true);
        java.lang.String str11 = staff3.getAccountType();
        staff3.login("staff", "");
        java.lang.String str15 = staff3.getPassword();
        java.lang.String str16 = staff3.getAccountType();
        staff3.viewProfile();
        staff3.logout();
        staff3.setVerified(false);
        java.lang.Class<?> wildcardClass21 = staff3.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "staff" + "'", str7, "staff");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "staff" + "'", str11, "staff");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "staff" + "'", str16, "staff");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test24473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24473");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        staff3.logout();
        java.lang.String str5 = staff3.getID();
        java.lang.String str6 = staff3.getPassword();
        java.lang.String str7 = staff3.getAccountType();
        staff3.setVerified(false);
        java.lang.String str10 = staff3.getAccountType();
        staff3.setVerified(false);
        java.lang.String str13 = staff3.getAccountType();
        staff3.viewProfile();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "staff" + "'", str7, "staff");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "staff" + "'", str10, "staff");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "staff" + "'", str13, "staff");
    }

    @Test
    public void test24474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24474");
        model.Staff staff3 = new model.Staff("hi!", "", "staff");
        java.lang.String str4 = staff3.getPassword();
        double double5 = staff3.getHourlyRate();
        java.lang.String str6 = staff3.getPassword();
        double double7 = staff3.getHourlyRate();
        double double8 = staff3.getHourlyRate();
        java.lang.String str9 = staff3.getAccountType();
        java.lang.String str10 = staff3.getID();
        java.lang.String str11 = staff3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 40.0d + "'", double5 == 40.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 40.0d + "'", double7 == 40.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 40.0d + "'", double8 == 40.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "staff" + "'", str9, "staff");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "staff" + "'", str10, "staff");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "staff" + "'", str11, "staff");
    }

    @Test
    public void test24475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24475");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        boolean boolean6 = staff3.isVerified();
        staff3.logout();
        staff3.setVerified(false);
        java.lang.String str10 = staff3.getID();
        java.lang.String str11 = staff3.getAccountType();
        java.lang.String str12 = staff3.getPassword();
        staff3.logout();
        staff3.login("hi!", "");
        java.lang.String str17 = staff3.getEmail();
        staff3.setVerified(false);
        staff3.viewProfile();
        boolean boolean21 = staff3.isVerified();
        java.lang.String str22 = staff3.getAccountType();
        staff3.setVerified(true);
        java.lang.String str25 = staff3.getID();
        staff3.setVerified(false);
        staff3.login("hi!", "hi!");
        java.lang.String str31 = staff3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "staff" + "'", str11, "staff");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "staff" + "'", str22, "staff");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
    }

    @Test
    public void test24476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24476");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        staff3.logout();
        java.lang.String str5 = staff3.getID();
        java.lang.String str6 = staff3.getEmail();
        java.lang.String str7 = staff3.getPassword();
        double double8 = staff3.getHourlyRate();
        staff3.logout();
        double double10 = staff3.getHourlyRate();
        java.lang.String str11 = staff3.getEmail();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 40.0d + "'", double8 == 40.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 40.0d + "'", double10 == 40.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test24477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24477");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        staff3.logout();
        java.lang.String str5 = staff3.getID();
        java.lang.String str6 = staff3.getEmail();
        java.lang.String str7 = staff3.getPassword();
        java.lang.String str8 = staff3.getPassword();
        boolean boolean9 = staff3.isVerified();
        staff3.viewProfile();
        staff3.logout();
        java.lang.String str12 = staff3.getEmail();
        java.lang.String str13 = staff3.getAccountType();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "staff" + "'", str13, "staff");
    }

    @Test
    public void test24478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24478");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        boolean boolean5 = staff3.isVerified();
        java.lang.String str6 = staff3.getID();
        staff3.setVerified(false);
        java.lang.String str9 = staff3.getID();
        staff3.setVerified(false);
        java.lang.String str12 = staff3.getID();
        java.lang.String str13 = staff3.getID();
        staff3.logout();
        java.lang.String str15 = staff3.getAccountType();
        java.lang.String str16 = staff3.getPassword();
        double double17 = staff3.getHourlyRate();
        java.lang.String str18 = staff3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "staff" + "'", str15, "staff");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 40.0d + "'", double17 == 40.0d);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test24479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24479");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        boolean boolean6 = staff3.isVerified();
        staff3.logout();
        java.lang.String str8 = staff3.getEmail();
        java.lang.String str9 = staff3.getPassword();
        boolean boolean10 = staff3.isVerified();
        java.lang.String str11 = staff3.getEmail();
        java.lang.Class<?> wildcardClass12 = staff3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test24480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24480");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        boolean boolean5 = staff3.isVerified();
        java.lang.String str6 = staff3.getID();
        staff3.setVerified(false);
        java.lang.String str9 = staff3.getID();
        staff3.setVerified(false);
        java.lang.String str12 = staff3.getID();
        double double13 = staff3.getHourlyRate();
        java.lang.String str14 = staff3.getPassword();
        staff3.login("staff", "");
        java.lang.String str18 = staff3.getEmail();
        java.lang.String str19 = staff3.getAccountType();
        boolean boolean20 = staff3.isVerified();
        staff3.logout();
        java.lang.String str22 = staff3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 40.0d + "'", double13 == 40.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "staff" + "'", str19, "staff");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
    }

    @Test
    public void test24481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24481");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        staff3.login("", "");
        staff3.viewProfile();
        staff3.viewProfile();
        staff3.login("", "");
        staff3.viewProfile();
        java.lang.String str13 = staff3.getAccountType();
        java.lang.String str14 = staff3.getPassword();
        staff3.viewProfile();
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "staff" + "'", str13, "staff");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test24482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24482");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        double double6 = staff3.getHourlyRate();
        java.lang.String str7 = staff3.getEmail();
        staff3.viewProfile();
        java.lang.String str9 = staff3.getPassword();
        java.lang.String str10 = staff3.getEmail();
        boolean boolean11 = staff3.isVerified();
        staff3.logout();
        java.lang.String str13 = staff3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 40.0d + "'", double6 == 40.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test24483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24483");
        model.Staff staff3 = new model.Staff("hi!", "", "hi!");
        java.lang.String str4 = staff3.getAccountType();
        java.lang.String str5 = staff3.getID();
        staff3.setVerified(true);
        staff3.login("staff", "staff");
        double double11 = staff3.getHourlyRate();
        staff3.viewProfile();
        java.lang.String str13 = staff3.getID();
        staff3.viewProfile();
        java.lang.String str15 = staff3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "staff" + "'", str4, "staff");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 40.0d + "'", double11 == 40.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test24484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24484");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        boolean boolean5 = staff3.isVerified();
        java.lang.String str6 = staff3.getID();
        staff3.setVerified(false);
        java.lang.String str9 = staff3.getID();
        staff3.setVerified(false);
        java.lang.String str12 = staff3.getID();
        java.lang.String str13 = staff3.getID();
        java.lang.String str14 = staff3.getPassword();
        java.lang.String str15 = staff3.getEmail();
        double double16 = staff3.getHourlyRate();
        staff3.setVerified(true);
        java.lang.String str19 = staff3.getID();
        java.lang.String str20 = staff3.getEmail();
        boolean boolean21 = staff3.isVerified();
        java.lang.String str22 = staff3.getPassword();
        java.lang.String str23 = staff3.getAccountType();
        java.lang.String str24 = staff3.getPassword();
        java.lang.String str25 = staff3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 40.0d + "'", double16 == 40.0d);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "staff" + "'", str23, "staff");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
    }

    @Test
    public void test24485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24485");
        model.Staff staff3 = new model.Staff("hi!", "", "hi!");
        staff3.logout();
        staff3.login("hi!", "hi!");
        staff3.viewProfile();
        staff3.login("", "staff");
        boolean boolean12 = staff3.isVerified();
        staff3.viewProfile();
        staff3.login("hi!", "hi!");
        java.lang.Class<?> wildcardClass17 = staff3.getClass();
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test24486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24486");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        boolean boolean5 = staff3.isVerified();
        java.lang.String str6 = staff3.getID();
        boolean boolean7 = staff3.isVerified();
        staff3.logout();
        java.lang.String str9 = staff3.getID();
        staff3.setVerified(true);
        staff3.viewProfile();
        double double13 = staff3.getHourlyRate();
        java.lang.String str14 = staff3.getPassword();
        boolean boolean15 = staff3.isVerified();
        java.lang.String str16 = staff3.getEmail();
        boolean boolean17 = staff3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 40.0d + "'", double13 == 40.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test24487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24487");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        double double6 = staff3.getHourlyRate();
        staff3.logout();
        staff3.viewProfile();
        java.lang.String str9 = staff3.getEmail();
        boolean boolean10 = staff3.isVerified();
        staff3.viewProfile();
        boolean boolean12 = staff3.isVerified();
        boolean boolean13 = staff3.isVerified();
        staff3.setVerified(false);
        staff3.viewProfile();
        staff3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 40.0d + "'", double6 == 40.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test24488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24488");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        boolean boolean6 = staff3.isVerified();
        staff3.login("", "");
        double double10 = staff3.getHourlyRate();
        java.lang.String str11 = staff3.getPassword();
        double double12 = staff3.getHourlyRate();
        java.lang.String str13 = staff3.getPassword();
        boolean boolean14 = staff3.isVerified();
        double double15 = staff3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 40.0d + "'", double10 == 40.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 40.0d + "'", double12 == 40.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 40.0d + "'", double15 == 40.0d);
    }

    @Test
    public void test24489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24489");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        boolean boolean5 = staff3.isVerified();
        java.lang.String str6 = staff3.getID();
        java.lang.String str7 = staff3.getID();
        staff3.setVerified(true);
        java.lang.String str10 = staff3.getEmail();
        staff3.setVerified(true);
        staff3.setVerified(true);
        double double15 = staff3.getHourlyRate();
        staff3.logout();
        java.lang.String str17 = staff3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 40.0d + "'", double15 == 40.0d);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test24490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24490");
        model.Staff staff3 = new model.Staff("hi!", "staff", "");
        staff3.logout();
        staff3.logout();
        staff3.logout();
        double double7 = staff3.getHourlyRate();
        java.lang.String str8 = staff3.getID();
        java.lang.String str9 = staff3.getAccountType();
        double double10 = staff3.getHourlyRate();
        double double11 = staff3.getHourlyRate();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 40.0d + "'", double7 == 40.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "staff" + "'", str9, "staff");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 40.0d + "'", double10 == 40.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 40.0d + "'", double11 == 40.0d);
    }

    @Test
    public void test24491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24491");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        boolean boolean6 = staff3.isVerified();
        staff3.logout();
        java.lang.String str8 = staff3.getPassword();
        java.lang.String str9 = staff3.getPassword();
        staff3.logout();
        java.lang.String str11 = staff3.getAccountType();
        java.lang.String str12 = staff3.getEmail();
        staff3.logout();
        staff3.login("staff", "");
        boolean boolean17 = staff3.isVerified();
        java.lang.String str18 = staff3.getAccountType();
        java.lang.String str19 = staff3.getPassword();
        java.lang.String str20 = staff3.getEmail();
        staff3.viewProfile();
        staff3.login("hi!", "staff");
        double double25 = staff3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "staff" + "'", str11, "staff");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "staff" + "'", str18, "staff");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 40.0d + "'", double25 == 40.0d);
    }

    @Test
    public void test24492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24492");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        boolean boolean6 = staff3.isVerified();
        staff3.logout();
        staff3.setVerified(false);
        staff3.logout();
        java.lang.String str11 = staff3.getEmail();
        boolean boolean12 = staff3.isVerified();
        java.lang.String str13 = staff3.getAccountType();
        java.lang.String str14 = staff3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "staff" + "'", str13, "staff");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "staff" + "'", str14, "staff");
    }

    @Test
    public void test24493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24493");
        model.Staff staff3 = new model.Staff("hi!", "hi!", "");
        java.lang.String str4 = staff3.getEmail();
        double double5 = staff3.getHourlyRate();
        double double6 = staff3.getHourlyRate();
        java.lang.String str7 = staff3.getEmail();
        boolean boolean8 = staff3.isVerified();
        staff3.viewProfile();
        java.lang.Class<?> wildcardClass10 = staff3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 40.0d + "'", double5 == 40.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 40.0d + "'", double6 == 40.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test24494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24494");
        model.Staff staff3 = new model.Staff("hi!", "", "hi!");
        java.lang.String str4 = staff3.getAccountType();
        java.lang.String str5 = staff3.getID();
        staff3.setVerified(true);
        staff3.login("staff", "staff");
        java.lang.String str11 = staff3.getPassword();
        staff3.logout();
        staff3.setVerified(false);
        boolean boolean15 = staff3.isVerified();
        staff3.login("staff", "");
        staff3.login("", "hi!");
        java.lang.String str22 = staff3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "staff" + "'", str4, "staff");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
    }

    @Test
    public void test24495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24495");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        boolean boolean5 = staff3.isVerified();
        java.lang.String str6 = staff3.getID();
        staff3.setVerified(false);
        java.lang.String str9 = staff3.getID();
        staff3.setVerified(false);
        staff3.logout();
        java.lang.String str13 = staff3.getAccountType();
        java.lang.String str14 = staff3.getAccountType();
        java.lang.String str15 = staff3.getID();
        java.lang.String str16 = staff3.getAccountType();
        staff3.viewProfile();
        staff3.viewProfile();
        java.lang.String str19 = staff3.getPassword();
        staff3.logout();
        java.lang.String str21 = staff3.getID();
        staff3.setVerified(true);
        java.lang.String str24 = staff3.getPassword();
        java.lang.String str25 = staff3.getAccountType();
        staff3.viewProfile();
        java.lang.String str27 = staff3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "staff" + "'", str13, "staff");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "staff" + "'", str14, "staff");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "staff" + "'", str16, "staff");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "staff" + "'", str25, "staff");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
    }

    @Test
    public void test24496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24496");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        boolean boolean6 = staff3.isVerified();
        staff3.logout();
        java.lang.String str8 = staff3.getAccountType();
        java.lang.String str9 = staff3.getAccountType();
        java.lang.String str10 = staff3.getID();
        staff3.setVerified(true);
        staff3.viewProfile();
        staff3.login("staff", "staff");
        double double17 = staff3.getHourlyRate();
        staff3.viewProfile();
        staff3.login("staff", "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "staff" + "'", str8, "staff");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "staff" + "'", str9, "staff");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 40.0d + "'", double17 == 40.0d);
    }

    @Test
    public void test24497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24497");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        boolean boolean6 = staff3.isVerified();
        staff3.viewProfile();
        java.lang.String str8 = staff3.getAccountType();
        staff3.logout();
        staff3.logout();
        java.lang.String str11 = staff3.getAccountType();
        java.lang.String str12 = staff3.getAccountType();
        staff3.viewProfile();
        double double14 = staff3.getHourlyRate();
        staff3.logout();
        staff3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "staff" + "'", str8, "staff");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "staff" + "'", str11, "staff");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "staff" + "'", str12, "staff");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 40.0d + "'", double14 == 40.0d);
    }

    @Test
    public void test24498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24498");
        model.Staff staff3 = new model.Staff("hi!", "", "hi!");
        double double4 = staff3.getHourlyRate();
        java.lang.String str5 = staff3.getPassword();
        java.lang.String str6 = staff3.getAccountType();
        staff3.login("hi!", "hi!");
        staff3.logout();
        java.lang.String str11 = staff3.getEmail();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 40.0d + "'", double4 == 40.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "staff" + "'", str6, "staff");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test24499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24499");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        java.lang.String str6 = staff3.getPassword();
        java.lang.String str7 = staff3.getPassword();
        java.lang.String str8 = staff3.getID();
        double double9 = staff3.getHourlyRate();
        double double10 = staff3.getHourlyRate();
        staff3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 40.0d + "'", double9 == 40.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 40.0d + "'", double10 == 40.0d);
    }

    @Test
    public void test24500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24500");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        java.lang.String str6 = staff3.getPassword();
        staff3.setVerified(false);
        java.lang.String str9 = staff3.getEmail();
        staff3.logout();
        java.lang.String str11 = staff3.getID();
        double double12 = staff3.getHourlyRate();
        staff3.setVerified(true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 40.0d + "'", double12 == 40.0d);
    }
}

