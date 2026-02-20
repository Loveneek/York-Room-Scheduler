import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest27 {

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
    public void test13501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13501");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        staff3.setVerified(false);
        boolean boolean7 = staff3.isVerified();
        java.lang.String str8 = staff3.getPassword();
        double double9 = staff3.getHourlyRate();
        java.lang.String str10 = staff3.getEmail();
        staff3.login("staff", "hi!");
        staff3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 40.0d + "'", double9 == 40.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test13502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13502");
        model.Staff staff3 = new model.Staff("hi!", "staff", "");
        java.lang.String str4 = staff3.getEmail();
        staff3.viewProfile();
        java.lang.Class<?> wildcardClass6 = staff3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test13503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13503");
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
        boolean boolean15 = staff3.isVerified();
        java.lang.String str16 = staff3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "staff" + "'", str6, "staff");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "staff" + "'", str16, "staff");
    }

    @Test
    public void test13504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13504");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        boolean boolean6 = staff3.isVerified();
        staff3.logout();
        staff3.setVerified(false);
        java.lang.String str10 = staff3.getID();
        double double11 = staff3.getHourlyRate();
        java.lang.String str12 = staff3.getEmail();
        java.lang.String str13 = staff3.getID();
        java.lang.String str14 = staff3.getAccountType();
        double double15 = staff3.getHourlyRate();
        staff3.viewProfile();
        boolean boolean17 = staff3.isVerified();
        double double18 = staff3.getHourlyRate();
        java.lang.String str19 = staff3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 40.0d + "'", double11 == 40.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "staff" + "'", str14, "staff");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 40.0d + "'", double15 == 40.0d);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 40.0d + "'", double18 == 40.0d);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "staff" + "'", str19, "staff");
    }

    @Test
    public void test13505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13505");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        boolean boolean6 = staff3.isVerified();
        staff3.logout();
        staff3.setVerified(false);
        java.lang.String str10 = staff3.getID();
        staff3.viewProfile();
        staff3.login("", "");
        java.lang.String str15 = staff3.getID();
        java.lang.String str16 = staff3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test13506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13506");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        boolean boolean6 = staff3.isVerified();
        staff3.logout();
        java.lang.String str8 = staff3.getPassword();
        staff3.setVerified(false);
        staff3.logout();
        java.lang.String str12 = staff3.getID();
        staff3.login("staff", "staff");
        staff3.viewProfile();
        double double17 = staff3.getHourlyRate();
        double double18 = staff3.getHourlyRate();
        double double19 = staff3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 40.0d + "'", double17 == 40.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 40.0d + "'", double18 == 40.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 40.0d + "'", double19 == 40.0d);
    }

    @Test
    public void test13507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13507");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        boolean boolean5 = staff3.isVerified();
        java.lang.String str6 = staff3.getID();
        java.lang.String str7 = staff3.getID();
        boolean boolean8 = staff3.isVerified();
        staff3.setVerified(true);
        java.lang.String str11 = staff3.getID();
        java.lang.String str12 = staff3.getID();
        boolean boolean13 = staff3.isVerified();
        java.lang.String str14 = staff3.getEmail();
        staff3.logout();
        boolean boolean16 = staff3.isVerified();
        staff3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test13508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13508");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        double double6 = staff3.getHourlyRate();
        staff3.logout();
        staff3.setVerified(true);
        java.lang.String str10 = staff3.getEmail();
        staff3.setVerified(false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 40.0d + "'", double6 == 40.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test13509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13509");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        boolean boolean5 = staff3.isVerified();
        java.lang.String str6 = staff3.getAccountType();
        staff3.logout();
        java.lang.String str8 = staff3.getEmail();
        staff3.viewProfile();
        boolean boolean10 = staff3.isVerified();
        java.lang.String str11 = staff3.getID();
        java.lang.String str12 = staff3.getAccountType();
        staff3.logout();
        staff3.setVerified(true);
        java.lang.String str16 = staff3.getEmail();
        staff3.setVerified(true);
        java.lang.String str19 = staff3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "staff" + "'", str6, "staff");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "staff" + "'", str12, "staff");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test13510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13510");
        model.Staff staff3 = new model.Staff("hi!", "", "hi!");
        staff3.logout();
        staff3.login("hi!", "hi!");
        staff3.viewProfile();
        java.lang.String str9 = staff3.getID();
        staff3.login("", "");
        double double13 = staff3.getHourlyRate();
        staff3.setVerified(true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 40.0d + "'", double13 == 40.0d);
    }

    @Test
    public void test13511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13511");
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
        staff3.viewProfile();
        staff3.setVerified(true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 40.0d + "'", double13 == 40.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test13512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13512");
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
        java.lang.Class<?> wildcardClass19 = staff3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test13513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13513");
        model.Staff staff3 = new model.Staff("hi!", "", "hi!");
        staff3.logout();
        staff3.login("hi!", "hi!");
        staff3.viewProfile();
        java.lang.String str9 = staff3.getPassword();
        staff3.viewProfile();
        java.lang.String str11 = staff3.getPassword();
        staff3.setVerified(false);
        java.lang.String str14 = staff3.getAccountType();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "staff" + "'", str14, "staff");
    }

    @Test
    public void test13514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13514");
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
        staff3.login("staff", "hi!");
        double double22 = staff3.getHourlyRate();
        java.lang.Class<?> wildcardClass23 = staff3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "staff" + "'", str13, "staff");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "staff" + "'", str14, "staff");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 40.0d + "'", double22 == 40.0d);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test13515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13515");
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
        java.lang.String str18 = staff3.getAccountType();
        staff3.login("staff", "hi!");
        double double22 = staff3.getHourlyRate();
        java.lang.String str23 = staff3.getEmail();
        java.lang.String str24 = staff3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 40.0d + "'", double11 == 40.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "staff" + "'", str18, "staff");
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 40.0d + "'", double22 == 40.0d);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
    }

    @Test
    public void test13516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13516");
        model.Staff staff3 = new model.Staff("", "", "staff");
        java.lang.String str4 = staff3.getID();
        double double5 = staff3.getHourlyRate();
        staff3.logout();
        java.lang.String str7 = staff3.getPassword();
        java.lang.String str8 = staff3.getID();
        staff3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "staff" + "'", str4, "staff");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 40.0d + "'", double5 == 40.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "staff" + "'", str8, "staff");
    }

    @Test
    public void test13517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13517");
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
        double double16 = staff3.getHourlyRate();
        double double17 = staff3.getHourlyRate();
        staff3.login("", "hi!");
        staff3.login("hi!", "staff");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "staff" + "'", str8, "staff");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 40.0d + "'", double14 == 40.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "staff" + "'", str15, "staff");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 40.0d + "'", double16 == 40.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 40.0d + "'", double17 == 40.0d);
    }

    @Test
    public void test13518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13518");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        boolean boolean6 = staff3.isVerified();
        staff3.logout();
        java.lang.String str8 = staff3.getPassword();
        staff3.logout();
        java.lang.String str10 = staff3.getID();
        double double11 = staff3.getHourlyRate();
        java.lang.String str12 = staff3.getEmail();
        java.lang.String str13 = staff3.getID();
        java.lang.String str14 = staff3.getPassword();
        java.lang.String str15 = staff3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 40.0d + "'", double11 == 40.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test13519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13519");
        model.Staff staff3 = new model.Staff("", "staff", "staff");
        double double4 = staff3.getHourlyRate();
        java.lang.String str5 = staff3.getAccountType();
        double double6 = staff3.getHourlyRate();
        java.lang.String str7 = staff3.getPassword();
        double double8 = staff3.getHourlyRate();
        staff3.logout();
        java.lang.String str10 = staff3.getAccountType();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 40.0d + "'", double4 == 40.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 40.0d + "'", double6 == 40.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "staff" + "'", str7, "staff");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 40.0d + "'", double8 == 40.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "staff" + "'", str10, "staff");
    }

    @Test
    public void test13520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13520");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        boolean boolean6 = staff3.isVerified();
        staff3.logout();
        java.lang.String str8 = staff3.getPassword();
        staff3.setVerified(false);
        java.lang.String str11 = staff3.getEmail();
        java.lang.String str12 = staff3.getPassword();
        java.lang.String str13 = staff3.getEmail();
        boolean boolean14 = staff3.isVerified();
        staff3.login("hi!", "hi!");
        java.lang.String str18 = staff3.getID();
        java.lang.String str19 = staff3.getEmail();
        staff3.setVerified(false);
        staff3.setVerified(true);
        double double24 = staff3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 40.0d + "'", double24 == 40.0d);
    }

    @Test
    public void test13521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13521");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        double double6 = staff3.getHourlyRate();
        java.lang.String str7 = staff3.getPassword();
        java.lang.String str8 = staff3.getPassword();
        java.lang.String str9 = staff3.getAccountType();
        staff3.viewProfile();
        java.lang.String str11 = staff3.getPassword();
        java.lang.String str12 = staff3.getAccountType();
        java.lang.String str13 = staff3.getPassword();
        staff3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 40.0d + "'", double6 == 40.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "staff" + "'", str9, "staff");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "staff" + "'", str12, "staff");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test13522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13522");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        java.lang.String str6 = staff3.getPassword();
        staff3.setVerified(false);
        staff3.setVerified(false);
        staff3.logout();
        java.lang.String str12 = staff3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "staff" + "'", str12, "staff");
    }

    @Test
    public void test13523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13523");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        boolean boolean6 = staff3.isVerified();
        staff3.viewProfile();
        boolean boolean8 = staff3.isVerified();
        staff3.login("hi!", "staff");
        staff3.login("", "");
        java.lang.Class<?> wildcardClass15 = staff3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test13524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13524");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        boolean boolean5 = staff3.isVerified();
        java.lang.String str6 = staff3.getID();
        java.lang.String str7 = staff3.getID();
        staff3.setVerified(true);
        java.lang.String str10 = staff3.getEmail();
        staff3.setVerified(true);
        staff3.logout();
        double double14 = staff3.getHourlyRate();
        double double15 = staff3.getHourlyRate();
        java.lang.String str16 = staff3.getID();
        double double17 = staff3.getHourlyRate();
        double double18 = staff3.getHourlyRate();
        staff3.login("staff", "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 40.0d + "'", double14 == 40.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 40.0d + "'", double15 == 40.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 40.0d + "'", double17 == 40.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 40.0d + "'", double18 == 40.0d);
    }

    @Test
    public void test13525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13525");
        model.Staff staff3 = new model.Staff("hi!", "hi!", "");
        java.lang.String str4 = staff3.getEmail();
        double double5 = staff3.getHourlyRate();
        double double6 = staff3.getHourlyRate();
        java.lang.String str7 = staff3.getEmail();
        staff3.setVerified(false);
        staff3.login("staff", "");
        java.lang.String str13 = staff3.getPassword();
        java.lang.String str14 = staff3.getEmail();
        java.lang.String str15 = staff3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 40.0d + "'", double5 == 40.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 40.0d + "'", double6 == 40.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "staff" + "'", str15, "staff");
    }

    @Test
    public void test13526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13526");
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
        boolean boolean16 = staff3.isVerified();
        double double17 = staff3.getHourlyRate();
        staff3.login("staff", "staff");
        staff3.login("", "staff");
        double double24 = staff3.getHourlyRate();
        double double25 = staff3.getHourlyRate();
        java.lang.Class<?> wildcardClass26 = staff3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 40.0d + "'", double15 == 40.0d);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 40.0d + "'", double17 == 40.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 40.0d + "'", double24 == 40.0d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 40.0d + "'", double25 == 40.0d);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test13527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13527");
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
        java.lang.Class<?> wildcardClass23 = staff3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "staff" + "'", str11, "staff");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 40.0d + "'", double18 == 40.0d);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test13528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13528");
        model.Staff staff3 = new model.Staff("", "staff", "");
        staff3.setVerified(true);
        staff3.login("", "hi!");
        staff3.viewProfile();
        staff3.login("hi!", "");
        java.lang.String str13 = staff3.getAccountType();
        staff3.login("", "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "staff" + "'", str13, "staff");
    }

    @Test
    public void test13529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13529");
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
        staff3.login("", "hi!");
        staff3.setVerified(true);
        java.lang.String str26 = staff3.getID();
        staff3.setVerified(true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "staff" + "'", str8, "staff");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 40.0d + "'", double15 == 40.0d);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "staff" + "'", str17, "staff");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
    }

    @Test
    public void test13530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13530");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        boolean boolean5 = staff3.isVerified();
        java.lang.String str6 = staff3.getID();
        java.lang.String str7 = staff3.getID();
        double double8 = staff3.getHourlyRate();
        java.lang.String str9 = staff3.getID();
        java.lang.String str10 = staff3.getEmail();
        staff3.login("hi!", "");
        java.lang.String str14 = staff3.getEmail();
        staff3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 40.0d + "'", double8 == 40.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test13531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13531");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        boolean boolean5 = staff3.isVerified();
        java.lang.String str6 = staff3.getID();
        staff3.setVerified(false);
        java.lang.String str9 = staff3.getID();
        staff3.setVerified(false);
        staff3.logout();
        java.lang.String str13 = staff3.getAccountType();
        staff3.login("staff", "staff");
        staff3.login("", "hi!");
        staff3.viewProfile();
        java.lang.Class<?> wildcardClass21 = staff3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "staff" + "'", str13, "staff");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test13532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13532");
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
        staff3.setVerified(false);
        staff3.setVerified(false);
        staff3.login("hi!", "");
        staff3.viewProfile();
        java.lang.String str26 = staff3.getAccountType();
        staff3.logout();
        java.lang.String str28 = staff3.getID();
        staff3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "staff" + "'", str26, "staff");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
    }

    @Test
    public void test13533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13533");
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
        staff3.viewProfile();
        staff3.setVerified(false);
        staff3.viewProfile();
        staff3.viewProfile();
        java.lang.String str20 = staff3.getID();
        staff3.login("staff", "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 40.0d + "'", double10 == 40.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test13534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13534");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        staff3.setVerified(false);
        boolean boolean7 = staff3.isVerified();
        java.lang.String str8 = staff3.getID();
        java.lang.String str9 = staff3.getEmail();
        staff3.login("", "hi!");
        double double13 = staff3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 40.0d + "'", double13 == 40.0d);
    }

    @Test
    public void test13535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13535");
        model.Staff staff3 = new model.Staff("", "staff", "");
        java.lang.String str4 = staff3.getPassword();
        java.lang.String str5 = staff3.getEmail();
        staff3.logout();
        double double7 = staff3.getHourlyRate();
        java.lang.String str8 = staff3.getEmail();
        java.lang.String str9 = staff3.getEmail();
        double double10 = staff3.getHourlyRate();
        staff3.setVerified(true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "staff" + "'", str4, "staff");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 40.0d + "'", double7 == 40.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 40.0d + "'", double10 == 40.0d);
    }

    @Test
    public void test13536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13536");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        boolean boolean5 = staff3.isVerified();
        java.lang.String str6 = staff3.getAccountType();
        staff3.logout();
        boolean boolean8 = staff3.isVerified();
        staff3.setVerified(true);
        boolean boolean11 = staff3.isVerified();
        staff3.login("", "staff");
        staff3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "staff" + "'", str6, "staff");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test13537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13537");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        boolean boolean5 = staff3.isVerified();
        java.lang.String str6 = staff3.getAccountType();
        staff3.login("hi!", "");
        java.lang.String str10 = staff3.getID();
        java.lang.String str11 = staff3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "staff" + "'", str6, "staff");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "staff" + "'", str11, "staff");
    }

    @Test
    public void test13538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13538");
        model.Staff staff3 = new model.Staff("hi!", "", "hi!");
        java.lang.String str4 = staff3.getAccountType();
        java.lang.String str5 = staff3.getID();
        java.lang.String str6 = staff3.getAccountType();
        staff3.logout();
        staff3.logout();
        double double9 = staff3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "staff" + "'", str4, "staff");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "staff" + "'", str6, "staff");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 40.0d + "'", double9 == 40.0d);
    }

    @Test
    public void test13539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13539");
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
        java.lang.String str17 = staff3.getEmail();
        staff3.login("hi!", "");
        staff3.login("", "hi!");
        staff3.login("", "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 40.0d + "'", double14 == 40.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test13540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13540");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        boolean boolean5 = staff3.isVerified();
        java.lang.String str6 = staff3.getID();
        java.lang.String str7 = staff3.getID();
        staff3.setVerified(true);
        staff3.viewProfile();
        staff3.login("", "");
        double double14 = staff3.getHourlyRate();
        java.lang.String str15 = staff3.getEmail();
        staff3.login("hi!", "staff");
        staff3.login("hi!", "");
        double double22 = staff3.getHourlyRate();
        staff3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 40.0d + "'", double14 == 40.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 40.0d + "'", double22 == 40.0d);
    }

    @Test
    public void test13541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13541");
        model.Staff staff3 = new model.Staff("", "staff", "staff");
        double double4 = staff3.getHourlyRate();
        double double5 = staff3.getHourlyRate();
        java.lang.String str6 = staff3.getID();
        double double7 = staff3.getHourlyRate();
        java.lang.String str8 = staff3.getID();
        staff3.logout();
        java.lang.String str10 = staff3.getEmail();
        java.lang.Class<?> wildcardClass11 = staff3.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 40.0d + "'", double4 == 40.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 40.0d + "'", double5 == 40.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "staff" + "'", str6, "staff");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 40.0d + "'", double7 == 40.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "staff" + "'", str8, "staff");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test13542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13542");
        model.Staff staff3 = new model.Staff("hi!", "staff", "");
        java.lang.String str4 = staff3.getEmail();
        staff3.logout();
        java.lang.String str6 = staff3.getID();
        java.lang.String str7 = staff3.getAccountType();
        boolean boolean8 = staff3.isVerified();
        double double9 = staff3.getHourlyRate();
        java.lang.String str10 = staff3.getAccountType();
        java.lang.String str11 = staff3.getPassword();
        staff3.login("", "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "staff" + "'", str7, "staff");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 40.0d + "'", double9 == 40.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "staff" + "'", str10, "staff");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "staff" + "'", str11, "staff");
    }

    @Test
    public void test13543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13543");
        model.Staff staff3 = new model.Staff("hi!", "", "hi!");
        staff3.setVerified(false);
        java.lang.String str6 = staff3.getPassword();
        java.lang.String str7 = staff3.getAccountType();
        java.lang.String str8 = staff3.getEmail();
        staff3.setVerified(true);
        java.lang.String str11 = staff3.getAccountType();
        staff3.login("staff", "");
        double double15 = staff3.getHourlyRate();
        staff3.setVerified(true);
        java.lang.String str18 = staff3.getAccountType();
        boolean boolean19 = staff3.isVerified();
        boolean boolean20 = staff3.isVerified();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "staff" + "'", str7, "staff");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "staff" + "'", str11, "staff");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 40.0d + "'", double15 == 40.0d);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "staff" + "'", str18, "staff");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test13544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13544");
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
        staff3.viewProfile();
        boolean boolean24 = staff3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "staff" + "'", str11, "staff");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 40.0d + "'", double16 == 40.0d);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 40.0d + "'", double22 == 40.0d);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test13545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13545");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        boolean boolean5 = staff3.isVerified();
        java.lang.String str6 = staff3.getAccountType();
        staff3.logout();
        java.lang.String str8 = staff3.getEmail();
        staff3.viewProfile();
        double double10 = staff3.getHourlyRate();
        boolean boolean11 = staff3.isVerified();
        double double12 = staff3.getHourlyRate();
        staff3.login("staff", "");
        staff3.setVerified(true);
        java.lang.String str18 = staff3.getPassword();
        staff3.login("", "staff");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "staff" + "'", str6, "staff");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 40.0d + "'", double10 == 40.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 40.0d + "'", double12 == 40.0d);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test13546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13546");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        boolean boolean5 = staff3.isVerified();
        java.lang.String str6 = staff3.getID();
        java.lang.String str7 = staff3.getID();
        staff3.setVerified(true);
        staff3.logout();
        boolean boolean11 = staff3.isVerified();
        double double12 = staff3.getHourlyRate();
        double double13 = staff3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 40.0d + "'", double12 == 40.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 40.0d + "'", double13 == 40.0d);
    }

    @Test
    public void test13547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13547");
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
        java.lang.String str16 = staff3.getID();
        java.lang.String str17 = staff3.getID();
        java.lang.String str18 = staff3.getEmail();
        staff3.login("", "");
        staff3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 40.0d + "'", double13 == 40.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test13548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13548");
        model.Staff staff3 = new model.Staff("hi!", "", "hi!");
        staff3.setVerified(false);
        java.lang.String str6 = staff3.getEmail();
        java.lang.String str7 = staff3.getAccountType();
        java.lang.String str8 = staff3.getID();
        double double9 = staff3.getHourlyRate();
        staff3.logout();
        staff3.setVerified(false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "staff" + "'", str7, "staff");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 40.0d + "'", double9 == 40.0d);
    }

    @Test
    public void test13549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13549");
        model.Staff staff3 = new model.Staff("hi!", "", "hi!");
        java.lang.String str4 = staff3.getPassword();
        double double5 = staff3.getHourlyRate();
        double double6 = staff3.getHourlyRate();
        staff3.logout();
        java.lang.String str8 = staff3.getAccountType();
        double double9 = staff3.getHourlyRate();
        double double10 = staff3.getHourlyRate();
        staff3.login("", "hi!");
        boolean boolean14 = staff3.isVerified();
        double double15 = staff3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 40.0d + "'", double5 == 40.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 40.0d + "'", double6 == 40.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "staff" + "'", str8, "staff");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 40.0d + "'", double9 == 40.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 40.0d + "'", double10 == 40.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 40.0d + "'", double15 == 40.0d);
    }

    @Test
    public void test13550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13550");
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
        staff3.login("", "staff");
        staff3.viewProfile();
        java.lang.String str22 = staff3.getEmail();
        java.lang.String str23 = staff3.getEmail();
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 40.0d + "'", double8 == 40.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "staff" + "'", str10, "staff");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "staff" + "'", str11, "staff");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 40.0d + "'", double12 == 40.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 40.0d + "'", double13 == 40.0d);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
    }

    @Test
    public void test13551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13551");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        boolean boolean6 = staff3.isVerified();
        staff3.logout();
        double double8 = staff3.getHourlyRate();
        boolean boolean9 = staff3.isVerified();
        staff3.setVerified(false);
        java.lang.String str12 = staff3.getAccountType();
        staff3.logout();
        staff3.setVerified(false);
        java.lang.String str16 = staff3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 40.0d + "'", double8 == 40.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "staff" + "'", str12, "staff");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test13552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13552");
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
        java.lang.String str14 = staff3.getEmail();
        staff3.setVerified(false);
        java.lang.String str17 = staff3.getID();
        boolean boolean18 = staff3.isVerified();
        java.lang.String str19 = staff3.getEmail();
        staff3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "staff" + "'", str11, "staff");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 40.0d + "'", double13 == 40.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test13553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13553");
        model.Staff staff3 = new model.Staff("hi!", "", "hi!");
        staff3.setVerified(false);
        staff3.viewProfile();
        java.lang.String str7 = staff3.getEmail();
        java.lang.String str8 = staff3.getAccountType();
        java.lang.String str9 = staff3.getID();
        java.lang.String str10 = staff3.getID();
        staff3.logout();
        staff3.setVerified(true);
        java.lang.String str14 = staff3.getID();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "staff" + "'", str8, "staff");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test13554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13554");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        boolean boolean5 = staff3.isVerified();
        java.lang.String str6 = staff3.getAccountType();
        staff3.logout();
        java.lang.String str8 = staff3.getEmail();
        staff3.viewProfile();
        java.lang.String str10 = staff3.getID();
        boolean boolean11 = staff3.isVerified();
        java.lang.String str12 = staff3.getPassword();
        java.lang.String str13 = staff3.getPassword();
        staff3.viewProfile();
        boolean boolean15 = staff3.isVerified();
        staff3.logout();
        staff3.setVerified(true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "staff" + "'", str6, "staff");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test13555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13555");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        boolean boolean5 = staff3.isVerified();
        java.lang.String str6 = staff3.getID();
        java.lang.String str7 = staff3.getID();
        double double8 = staff3.getHourlyRate();
        boolean boolean9 = staff3.isVerified();
        staff3.login("", "");
        double double13 = staff3.getHourlyRate();
        staff3.setVerified(true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 40.0d + "'", double8 == 40.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 40.0d + "'", double13 == 40.0d);
    }

    @Test
    public void test13556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13556");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        staff3.login("", "");
        double double7 = staff3.getHourlyRate();
        staff3.login("staff", "staff");
        java.lang.String str11 = staff3.getID();
        java.lang.String str12 = staff3.getAccountType();
        staff3.logout();
        staff3.setVerified(false);
        java.lang.String str16 = staff3.getAccountType();
        java.lang.String str17 = staff3.getPassword();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 40.0d + "'", double7 == 40.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "staff" + "'", str12, "staff");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "staff" + "'", str16, "staff");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test13557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13557");
        model.Staff staff3 = new model.Staff("hi!", "", "hi!");
        staff3.logout();
        staff3.login("hi!", "hi!");
        double double8 = staff3.getHourlyRate();
        boolean boolean9 = staff3.isVerified();
        boolean boolean10 = staff3.isVerified();
        boolean boolean11 = staff3.isVerified();
        boolean boolean12 = staff3.isVerified();
        staff3.logout();
        java.lang.String str14 = staff3.getEmail();
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 40.0d + "'", double8 == 40.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test13558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13558");
        model.Staff staff3 = new model.Staff("staff", "", "hi!");
        java.lang.String str4 = staff3.getAccountType();
        java.lang.String str5 = staff3.getID();
        java.lang.String str6 = staff3.getID();
        boolean boolean7 = staff3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "staff" + "'", str4, "staff");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test13559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13559");
        model.Staff staff3 = new model.Staff("", "hi!", "hi!");
        java.lang.String str4 = staff3.getAccountType();
        staff3.viewProfile();
        java.lang.String str6 = staff3.getID();
        staff3.setVerified(true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "staff" + "'", str4, "staff");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test13560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13560");
        model.Staff staff3 = new model.Staff("hi!", "", "hi!");
        staff3.logout();
        staff3.login("hi!", "hi!");
        staff3.viewProfile();
        staff3.login("", "staff");
        staff3.setVerified(true);
        java.lang.Class<?> wildcardClass14 = staff3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test13561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13561");
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
        staff3.logout();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 40.0d + "'", double13 == 40.0d);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test13562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13562");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        staff3.logout();
        staff3.setVerified(false);
        java.lang.String str7 = staff3.getAccountType();
        java.lang.String str8 = staff3.getEmail();
        staff3.login("hi!", "staff");
        boolean boolean12 = staff3.isVerified();
        staff3.login("hi!", "");
        staff3.login("staff", "hi!");
        java.lang.Class<?> wildcardClass19 = staff3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "staff" + "'", str7, "staff");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test13563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13563");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getID();
        staff3.setVerified(false);
        staff3.logout();
        staff3.setVerified(false);
        staff3.login("", "staff");
        java.lang.Class<?> wildcardClass14 = staff3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test13564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13564");
        model.Staff staff3 = new model.Staff("hi!", "staff", "");
        staff3.logout();
        java.lang.String str5 = staff3.getEmail();
        java.lang.String str6 = staff3.getEmail();
        double double7 = staff3.getHourlyRate();
        staff3.logout();
        staff3.logout();
        staff3.setVerified(false);
        java.lang.String str12 = staff3.getPassword();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 40.0d + "'", double7 == 40.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "staff" + "'", str12, "staff");
    }

    @Test
    public void test13565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13565");
        model.Staff staff3 = new model.Staff("hi!", "", "hi!");
        staff3.setVerified(false);
        java.lang.String str6 = staff3.getPassword();
        java.lang.String str7 = staff3.getAccountType();
        staff3.viewProfile();
        staff3.login("", "hi!");
        staff3.viewProfile();
        staff3.login("staff", "staff");
        java.lang.String str16 = staff3.getPassword();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "staff" + "'", str7, "staff");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test13566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13566");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        boolean boolean6 = staff3.isVerified();
        staff3.logout();
        java.lang.String str8 = staff3.getPassword();
        staff3.setVerified(false);
        java.lang.String str11 = staff3.getID();
        double double12 = staff3.getHourlyRate();
        staff3.viewProfile();
        java.lang.String str14 = staff3.getID();
        double double15 = staff3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 40.0d + "'", double12 == 40.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 40.0d + "'", double15 == 40.0d);
    }

    @Test
    public void test13567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13567");
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
        staff3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "staff" + "'", str8, "staff");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "staff" + "'", str9, "staff");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 40.0d + "'", double13 == 40.0d);
    }

    @Test
    public void test13568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13568");
        model.Staff staff3 = new model.Staff("staff", "hi!", "");
        staff3.login("hi!", "hi!");
        staff3.logout();
        java.lang.String str8 = staff3.getPassword();
        java.lang.String str9 = staff3.getID();
        staff3.viewProfile();
        java.lang.String str11 = staff3.getAccountType();
        java.lang.String str12 = staff3.getAccountType();
        staff3.viewProfile();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "staff" + "'", str11, "staff");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "staff" + "'", str12, "staff");
    }

    @Test
    public void test13569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13569");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        boolean boolean6 = staff3.isVerified();
        staff3.logout();
        java.lang.String str8 = staff3.getPassword();
        staff3.setVerified(false);
        staff3.logout();
        staff3.viewProfile();
        java.lang.String str13 = staff3.getID();
        boolean boolean14 = staff3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test13570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13570");
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
        java.lang.String str18 = staff3.getPassword();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "staff" + "'", str8, "staff");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test13571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13571");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        boolean boolean5 = staff3.isVerified();
        java.lang.String str6 = staff3.getID();
        java.lang.String str7 = staff3.getID();
        staff3.setVerified(true);
        java.lang.String str10 = staff3.getEmail();
        staff3.setVerified(true);
        staff3.logout();
        double double14 = staff3.getHourlyRate();
        double double15 = staff3.getHourlyRate();
        java.lang.String str16 = staff3.getID();
        java.lang.String str17 = staff3.getAccountType();
        java.lang.String str18 = staff3.getPassword();
        boolean boolean19 = staff3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 40.0d + "'", double14 == 40.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 40.0d + "'", double15 == 40.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "staff" + "'", str17, "staff");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test13572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13572");
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
        java.lang.String str15 = staff3.getPassword();
        java.lang.String str16 = staff3.getPassword();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "staff" + "'", str7, "staff");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "staff" + "'", str9, "staff");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "staff" + "'", str14, "staff");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test13573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13573");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        boolean boolean6 = staff3.isVerified();
        staff3.logout();
        java.lang.String str8 = staff3.getAccountType();
        staff3.setVerified(false);
        staff3.viewProfile();
        java.lang.String str12 = staff3.getAccountType();
        java.lang.String str13 = staff3.getID();
        java.lang.String str14 = staff3.getPassword();
        staff3.login("hi!", "");
        java.lang.String str18 = staff3.getAccountType();
        boolean boolean19 = staff3.isVerified();
        java.lang.Class<?> wildcardClass20 = staff3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "staff" + "'", str8, "staff");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "staff" + "'", str12, "staff");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "staff" + "'", str18, "staff");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test13574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13574");
        model.Staff staff3 = new model.Staff("", "staff", "");
        staff3.setVerified(true);
        staff3.viewProfile();
        double double7 = staff3.getHourlyRate();
        java.lang.String str8 = staff3.getEmail();
        double double9 = staff3.getHourlyRate();
        java.lang.String str10 = staff3.getID();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 40.0d + "'", double7 == 40.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 40.0d + "'", double9 == 40.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test13575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13575");
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
        staff3.setVerified(false);
        boolean boolean21 = staff3.isVerified();
        staff3.login("", "staff");
        staff3.logout();
        staff3.login("hi!", "");
        staff3.login("", "staff");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test13576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13576");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        boolean boolean6 = staff3.isVerified();
        staff3.logout();
        staff3.setVerified(false);
        java.lang.String str10 = staff3.getID();
        double double11 = staff3.getHourlyRate();
        staff3.viewProfile();
        java.lang.String str13 = staff3.getID();
        boolean boolean14 = staff3.isVerified();
        java.lang.String str15 = staff3.getEmail();
        double double16 = staff3.getHourlyRate();
        staff3.setVerified(true);
        double double19 = staff3.getHourlyRate();
        staff3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 40.0d + "'", double11 == 40.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 40.0d + "'", double16 == 40.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 40.0d + "'", double19 == 40.0d);
    }

    @Test
    public void test13577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13577");
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
        java.lang.String str22 = staff3.getPassword();
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
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test13578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13578");
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
        java.lang.String str14 = staff3.getPassword();
        staff3.setVerified(false);
        staff3.viewProfile();
        java.lang.String str18 = staff3.getAccountType();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 40.0d + "'", double13 == 40.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "staff" + "'", str18, "staff");
    }

    @Test
    public void test13579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13579");
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
        staff3.logout();
        java.lang.String str18 = staff3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "staff" + "'", str13, "staff");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test13580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13580");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        boolean boolean5 = staff3.isVerified();
        java.lang.String str6 = staff3.getAccountType();
        staff3.login("hi!", "hi!");
        staff3.login("", "staff");
        java.lang.String str13 = staff3.getAccountType();
        java.lang.String str14 = staff3.getPassword();
        java.lang.String str15 = staff3.getAccountType();
        java.lang.String str16 = staff3.getID();
        boolean boolean17 = staff3.isVerified();
        java.lang.Class<?> wildcardClass18 = staff3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "staff" + "'", str6, "staff");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "staff" + "'", str13, "staff");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "staff" + "'", str15, "staff");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test13581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13581");
        model.Staff staff3 = new model.Staff("hi!", "hi!", "");
        java.lang.String str4 = staff3.getPassword();
        staff3.viewProfile();
        boolean boolean6 = staff3.isVerified();
        java.lang.String str7 = staff3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test13582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13582");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        boolean boolean6 = staff3.isVerified();
        staff3.logout();
        java.lang.String str8 = staff3.getPassword();
        staff3.setVerified(false);
        java.lang.String str11 = staff3.getID();
        double double12 = staff3.getHourlyRate();
        java.lang.String str13 = staff3.getPassword();
        staff3.viewProfile();
        staff3.login("", "hi!");
        staff3.viewProfile();
        staff3.login("hi!", "staff");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 40.0d + "'", double12 == 40.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test13583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13583");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        double double6 = staff3.getHourlyRate();
        java.lang.String str7 = staff3.getPassword();
        staff3.login("", "staff");
        java.lang.String str11 = staff3.getPassword();
        staff3.logout();
        java.lang.String str13 = staff3.getEmail();
        java.lang.Class<?> wildcardClass14 = staff3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 40.0d + "'", double6 == 40.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test13584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13584");
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
        double double15 = staff3.getHourlyRate();
        staff3.logout();
        boolean boolean17 = staff3.isVerified();
        double double18 = staff3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 40.0d + "'", double13 == 40.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 40.0d + "'", double15 == 40.0d);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 40.0d + "'", double18 == 40.0d);
    }

    @Test
    public void test13585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13585");
        model.Staff staff3 = new model.Staff("hi!", "", "hi!");
        java.lang.String str4 = staff3.getAccountType();
        java.lang.String str5 = staff3.getEmail();
        staff3.viewProfile();
        staff3.setVerified(true);
        java.lang.String str9 = staff3.getPassword();
        staff3.setVerified(false);
        java.lang.String str12 = staff3.getAccountType();
        double double13 = staff3.getHourlyRate();
        staff3.logout();
        boolean boolean15 = staff3.isVerified();
        staff3.login("hi!", "");
        java.lang.String str19 = staff3.getID();
        staff3.setVerified(true);
        java.lang.String str22 = staff3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "staff" + "'", str4, "staff");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "staff" + "'", str12, "staff");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 40.0d + "'", double13 == 40.0d);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "staff" + "'", str22, "staff");
    }

    @Test
    public void test13586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13586");
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
        staff3.logout();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 40.0d + "'", double12 == 40.0d);
    }

    @Test
    public void test13587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13587");
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
        double double15 = staff3.getHourlyRate();
        java.lang.String str16 = staff3.getEmail();
        java.lang.String str17 = staff3.getEmail();
        boolean boolean18 = staff3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 40.0d + "'", double15 == 40.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test13588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13588");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        double double6 = staff3.getHourlyRate();
        java.lang.String str7 = staff3.getPassword();
        java.lang.String str8 = staff3.getPassword();
        staff3.login("staff", "hi!");
        staff3.login("", "hi!");
        double double15 = staff3.getHourlyRate();
        staff3.viewProfile();
        double double17 = staff3.getHourlyRate();
        boolean boolean18 = staff3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 40.0d + "'", double6 == 40.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 40.0d + "'", double15 == 40.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 40.0d + "'", double17 == 40.0d);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test13589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13589");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        staff3.logout();
        java.lang.String str5 = staff3.getID();
        java.lang.String str6 = staff3.getEmail();
        java.lang.String str7 = staff3.getEmail();
        java.lang.String str8 = staff3.getPassword();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test13590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13590");
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
        double double17 = staff3.getHourlyRate();
        boolean boolean18 = staff3.isVerified();
        staff3.setVerified(true);
        java.lang.String str21 = staff3.getEmail();
        java.lang.String str22 = staff3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 40.0d + "'", double16 == 40.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 40.0d + "'", double17 == 40.0d);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "staff" + "'", str22, "staff");
    }

    @Test
    public void test13591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13591");
        model.Staff staff3 = new model.Staff("hi!", "", "hi!");
        java.lang.String str4 = staff3.getAccountType();
        java.lang.String str5 = staff3.getEmail();
        staff3.viewProfile();
        staff3.setVerified(true);
        java.lang.String str9 = staff3.getPassword();
        staff3.setVerified(false);
        staff3.setVerified(true);
        staff3.viewProfile();
        staff3.logout();
        staff3.logout();
        staff3.login("", "staff");
        staff3.login("", "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "staff" + "'", str4, "staff");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test13592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13592");
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
        java.lang.String str21 = staff3.getID();
        boolean boolean22 = staff3.isVerified();
        staff3.setVerified(false);
        java.lang.String str25 = staff3.getPassword();
        double double26 = staff3.getHourlyRate();
        java.lang.String str27 = staff3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 40.0d + "'", double16 == 40.0d);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 40.0d + "'", double26 == 40.0d);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
    }

    @Test
    public void test13593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13593");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        boolean boolean6 = staff3.isVerified();
        staff3.login("", "");
        java.lang.String str10 = staff3.getID();
        staff3.logout();
        boolean boolean12 = staff3.isVerified();
        double double13 = staff3.getHourlyRate();
        java.lang.String str14 = staff3.getEmail();
        staff3.logout();
        boolean boolean16 = staff3.isVerified();
        staff3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 40.0d + "'", double13 == 40.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test13594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13594");
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
        java.lang.String str14 = staff3.getID();
        staff3.logout();
        java.lang.String str16 = staff3.getID();
        java.lang.String str17 = staff3.getID();
        java.lang.String str18 = staff3.getPassword();
        java.lang.String str19 = staff3.getPassword();
        staff3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "staff" + "'", str11, "staff");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test13595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13595");
        model.Staff staff3 = new model.Staff("staff", "", "staff");
        staff3.setVerified(false);
        staff3.viewProfile();
        java.lang.String str7 = staff3.getEmail();
        java.lang.String str8 = staff3.getPassword();
        java.lang.String str9 = staff3.getID();
        double double10 = staff3.getHourlyRate();
        java.lang.String str11 = staff3.getEmail();
        boolean boolean12 = staff3.isVerified();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "staff" + "'", str7, "staff");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "staff" + "'", str9, "staff");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 40.0d + "'", double10 == 40.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "staff" + "'", str11, "staff");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test13596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13596");
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
        java.lang.String str14 = staff3.getPassword();
        boolean boolean15 = staff3.isVerified();
        java.lang.String str16 = staff3.getEmail();
        double double17 = staff3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "staff" + "'", str6, "staff");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 40.0d + "'", double17 == 40.0d);
    }

    @Test
    public void test13597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13597");
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
        boolean boolean22 = staff3.isVerified();
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
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test13598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13598");
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
        java.lang.String str19 = staff3.getAccountType();
        staff3.setVerified(true);
        staff3.viewProfile();
        java.lang.String str23 = staff3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "staff" + "'", str11, "staff");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "staff" + "'", str18, "staff");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "staff" + "'", str19, "staff");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "staff" + "'", str23, "staff");
    }

    @Test
    public void test13599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13599");
        model.Staff staff3 = new model.Staff("hi!", "", "hi!");
        staff3.logout();
        staff3.login("hi!", "hi!");
        double double8 = staff3.getHourlyRate();
        java.lang.String str9 = staff3.getID();
        java.lang.String str10 = staff3.getAccountType();
        staff3.setVerified(true);
        staff3.logout();
        staff3.setVerified(false);
        java.lang.String str16 = staff3.getEmail();
        boolean boolean17 = staff3.isVerified();
        staff3.login("", "staff");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 40.0d + "'", double8 == 40.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "staff" + "'", str10, "staff");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test13600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13600");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        boolean boolean5 = staff3.isVerified();
        java.lang.String str6 = staff3.getAccountType();
        java.lang.String str7 = staff3.getAccountType();
        java.lang.String str8 = staff3.getEmail();
        java.lang.String str9 = staff3.getID();
        double double10 = staff3.getHourlyRate();
        java.lang.String str11 = staff3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "staff" + "'", str6, "staff");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "staff" + "'", str7, "staff");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 40.0d + "'", double10 == 40.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test13601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13601");
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
        java.lang.String str16 = staff3.getEmail();
        boolean boolean17 = staff3.isVerified();
        java.lang.String str18 = staff3.getPassword();
        boolean boolean19 = staff3.isVerified();
        boolean boolean20 = staff3.isVerified();
        java.lang.String str21 = staff3.getID();
        staff3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 40.0d + "'", double14 == 40.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
    }

    @Test
    public void test13602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13602");
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
        staff3.logout();
        java.lang.String str18 = staff3.getPassword();
        double double19 = staff3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 40.0d + "'", double19 == 40.0d);
    }

    @Test
    public void test13603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13603");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        boolean boolean6 = staff3.isVerified();
        staff3.viewProfile();
        java.lang.String str8 = staff3.getAccountType();
        java.lang.String str9 = staff3.getID();
        staff3.login("", "hi!");
        double double13 = staff3.getHourlyRate();
        double double14 = staff3.getHourlyRate();
        staff3.setVerified(true);
        staff3.viewProfile();
        staff3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "staff" + "'", str8, "staff");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 40.0d + "'", double13 == 40.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 40.0d + "'", double14 == 40.0d);
    }

    @Test
    public void test13604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13604");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        boolean boolean5 = staff3.isVerified();
        java.lang.String str6 = staff3.getAccountType();
        staff3.logout();
        java.lang.String str8 = staff3.getEmail();
        staff3.viewProfile();
        java.lang.String str10 = staff3.getID();
        staff3.logout();
        boolean boolean12 = staff3.isVerified();
        double double13 = staff3.getHourlyRate();
        java.lang.String str14 = staff3.getAccountType();
        java.lang.String str15 = staff3.getAccountType();
        staff3.setVerified(false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "staff" + "'", str6, "staff");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 40.0d + "'", double13 == 40.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "staff" + "'", str14, "staff");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "staff" + "'", str15, "staff");
    }

    @Test
    public void test13605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13605");
        model.Staff staff3 = new model.Staff("hi!", "hi!", "");
        staff3.logout();
        boolean boolean5 = staff3.isVerified();
        double double6 = staff3.getHourlyRate();
        java.lang.String str7 = staff3.getEmail();
        java.lang.String str8 = staff3.getAccountType();
        java.lang.String str9 = staff3.getID();
        java.lang.String str10 = staff3.getPassword();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 40.0d + "'", double6 == 40.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "staff" + "'", str8, "staff");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test13606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13606");
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
        java.lang.String str15 = staff3.getPassword();
        boolean boolean16 = staff3.isVerified();
        staff3.setVerified(true);
        staff3.logout();
        java.lang.String str20 = staff3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test13607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13607");
        model.Staff staff3 = new model.Staff("hi!", "", "hi!");
        staff3.setVerified(false);
        staff3.viewProfile();
        java.lang.String str7 = staff3.getEmail();
        java.lang.String str8 = staff3.getID();
        staff3.viewProfile();
        staff3.setVerified(true);
        java.lang.String str12 = staff3.getID();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test13608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13608");
        model.Staff staff3 = new model.Staff("hi!", "staff", "");
        staff3.logout();
        staff3.logout();
        staff3.logout();
        double double7 = staff3.getHourlyRate();
        boolean boolean8 = staff3.isVerified();
        staff3.setVerified(false);
        staff3.setVerified(true);
        staff3.setVerified(false);
        java.lang.String str15 = staff3.getAccountType();
        staff3.login("", "hi!");
        staff3.setVerified(true);
        double double21 = staff3.getHourlyRate();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 40.0d + "'", double7 == 40.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "staff" + "'", str15, "staff");
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 40.0d + "'", double21 == 40.0d);
    }

    @Test
    public void test13609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13609");
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
        java.lang.String str15 = staff3.getPassword();
        double double16 = staff3.getHourlyRate();
        double double17 = staff3.getHourlyRate();
        staff3.setVerified(true);
        java.lang.String str20 = staff3.getEmail();
        staff3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 40.0d + "'", double8 == 40.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "staff" + "'", str10, "staff");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 40.0d + "'", double16 == 40.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 40.0d + "'", double17 == 40.0d);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test13610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13610");
        model.Staff staff3 = new model.Staff("hi!", "staff", "");
        java.lang.String str4 = staff3.getEmail();
        staff3.logout();
        java.lang.String str6 = staff3.getID();
        java.lang.String str7 = staff3.getEmail();
        java.lang.String str8 = staff3.getPassword();
        boolean boolean9 = staff3.isVerified();
        staff3.login("staff", "");
        double double13 = staff3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "staff" + "'", str8, "staff");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 40.0d + "'", double13 == 40.0d);
    }

    @Test
    public void test13611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13611");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        boolean boolean5 = staff3.isVerified();
        java.lang.String str6 = staff3.getID();
        boolean boolean7 = staff3.isVerified();
        staff3.logout();
        java.lang.String str9 = staff3.getID();
        staff3.setVerified(true);
        staff3.viewProfile();
        boolean boolean13 = staff3.isVerified();
        java.lang.String str14 = staff3.getEmail();
        boolean boolean15 = staff3.isVerified();
        double double16 = staff3.getHourlyRate();
        java.lang.String str17 = staff3.getEmail();
        staff3.viewProfile();
        double double19 = staff3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 40.0d + "'", double16 == 40.0d);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 40.0d + "'", double19 == 40.0d);
    }

    @Test
    public void test13612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13612");
        model.Staff staff3 = new model.Staff("hi!", "", "hi!");
        staff3.setVerified(false);
        java.lang.String str6 = staff3.getEmail();
        staff3.setVerified(false);
        staff3.login("staff", "hi!");
        java.lang.String str12 = staff3.getPassword();
        staff3.setVerified(false);
        java.lang.String str15 = staff3.getPassword();
        java.lang.String str16 = staff3.getEmail();
        java.lang.String str17 = staff3.getEmail();
        java.lang.String str18 = staff3.getEmail();
        staff3.login("staff", "staff");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test13613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13613");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        boolean boolean6 = staff3.isVerified();
        staff3.logout();
        staff3.setVerified(false);
        java.lang.String str10 = staff3.getID();
        double double11 = staff3.getHourlyRate();
        java.lang.String str12 = staff3.getPassword();
        staff3.logout();
        double double14 = staff3.getHourlyRate();
        staff3.login("hi!", "staff");
        staff3.login("hi!", "");
        staff3.viewProfile();
        staff3.setVerified(false);
        staff3.logout();
        java.lang.String str25 = staff3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 40.0d + "'", double11 == 40.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 40.0d + "'", double14 == 40.0d);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
    }

    @Test
    public void test13614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13614");
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
        boolean boolean14 = staff3.isVerified();
        java.lang.String str15 = staff3.getPassword();
        staff3.login("staff", "staff");
        java.lang.String str19 = staff3.getPassword();
        staff3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test13615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13615");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        java.lang.String str6 = staff3.getPassword();
        staff3.setVerified(false);
        staff3.setVerified(true);
        java.lang.String str11 = staff3.getEmail();
        staff3.login("hi!", "hi!");
        java.lang.String str15 = staff3.getID();
        staff3.viewProfile();
        double double17 = staff3.getHourlyRate();
        java.lang.String str18 = staff3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 40.0d + "'", double17 == 40.0d);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test13616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13616");
        model.Staff staff3 = new model.Staff("hi!", "staff", "");
        java.lang.String str4 = staff3.getPassword();
        staff3.setVerified(false);
        java.lang.String str7 = staff3.getEmail();
        staff3.setVerified(false);
        staff3.logout();
        java.lang.String str11 = staff3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "staff" + "'", str4, "staff");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test13617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13617");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        boolean boolean5 = staff3.isVerified();
        java.lang.String str6 = staff3.getAccountType();
        staff3.logout();
        java.lang.String str8 = staff3.getEmail();
        staff3.viewProfile();
        java.lang.String str10 = staff3.getAccountType();
        staff3.setVerified(false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "staff" + "'", str6, "staff");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "staff" + "'", str10, "staff");
    }

    @Test
    public void test13618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13618");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        staff3.logout();
        java.lang.String str5 = staff3.getID();
        java.lang.String str6 = staff3.getPassword();
        staff3.logout();
        java.lang.String str8 = staff3.getPassword();
        java.lang.String str9 = staff3.getPassword();
        staff3.setVerified(true);
        staff3.logout();
        double double13 = staff3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 40.0d + "'", double13 == 40.0d);
    }

    @Test
    public void test13619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13619");
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
        java.lang.String str15 = staff3.getAccountType();
        staff3.login("", "hi!");
        staff3.login("hi!", "hi!");
        java.lang.String str22 = staff3.getAccountType();
        staff3.viewProfile();
        boolean boolean24 = staff3.isVerified();
        java.lang.String str25 = staff3.getPassword();
        double double26 = staff3.getHourlyRate();
        staff3.logout();
        java.lang.String str28 = staff3.getAccountType();
        staff3.login("staff", "staff");
        staff3.setVerified(false);
        java.lang.String str34 = staff3.getEmail();
        staff3.logout();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 40.0d + "'", double7 == 40.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "staff" + "'", str15, "staff");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "staff" + "'", str22, "staff");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 40.0d + "'", double26 == 40.0d);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "staff" + "'", str28, "staff");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
    }

    @Test
    public void test13620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13620");
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
        staff3.logout();
        java.lang.String str18 = staff3.getPassword();
        double double19 = staff3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 40.0d + "'", double7 == 40.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 40.0d + "'", double19 == 40.0d);
    }

    @Test
    public void test13621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13621");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        boolean boolean6 = staff3.isVerified();
        staff3.logout();
        java.lang.String str8 = staff3.getEmail();
        java.lang.String str9 = staff3.getPassword();
        boolean boolean10 = staff3.isVerified();
        java.lang.String str11 = staff3.getID();
        java.lang.String str12 = staff3.getPassword();
        staff3.setVerified(true);
        java.lang.String str15 = staff3.getPassword();
        java.lang.Class<?> wildcardClass16 = staff3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test13622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13622");
        model.Staff staff3 = new model.Staff("hi!", "", "hi!");
        staff3.logout();
        staff3.login("hi!", "hi!");
        double double8 = staff3.getHourlyRate();
        java.lang.String str9 = staff3.getID();
        java.lang.String str10 = staff3.getAccountType();
        staff3.viewProfile();
        java.lang.String str12 = staff3.getID();
        staff3.setVerified(true);
        staff3.login("staff", "hi!");
        double double18 = staff3.getHourlyRate();
        double double19 = staff3.getHourlyRate();
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 40.0d + "'", double8 == 40.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "staff" + "'", str10, "staff");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 40.0d + "'", double18 == 40.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 40.0d + "'", double19 == 40.0d);
    }

    @Test
    public void test13623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13623");
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
        java.lang.String str15 = staff3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "staff" + "'", str8, "staff");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "staff" + "'", str11, "staff");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "staff" + "'", str12, "staff");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test13624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13624");
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
        staff3.viewProfile();
        java.lang.String str16 = staff3.getAccountType();
        java.lang.String str17 = staff3.getID();
        staff3.login("staff", "");
        staff3.logout();
        staff3.setVerified(false);
        staff3.login("staff", "staff");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 40.0d + "'", double8 == 40.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "staff" + "'", str10, "staff");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "staff" + "'", str16, "staff");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test13625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13625");
        model.Staff staff3 = new model.Staff("hi!", "hi!", "");
        staff3.setVerified(true);
        double double6 = staff3.getHourlyRate();
        java.lang.String str7 = staff3.getID();
        staff3.logout();
        staff3.logout();
        boolean boolean10 = staff3.isVerified();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 40.0d + "'", double6 == 40.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test13626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13626");
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
        staff3.logout();
        staff3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "staff" + "'", str6, "staff");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 40.0d + "'", double16 == 40.0d);
    }

    @Test
    public void test13627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13627");
        model.Staff staff3 = new model.Staff("", "", "");
        staff3.viewProfile();
        double double5 = staff3.getHourlyRate();
        boolean boolean6 = staff3.isVerified();
        java.lang.String str7 = staff3.getAccountType();
        java.lang.String str8 = staff3.getPassword();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 40.0d + "'", double5 == 40.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "staff" + "'", str7, "staff");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test13628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13628");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        staff3.logout();
        java.lang.String str5 = staff3.getID();
        java.lang.String str6 = staff3.getEmail();
        java.lang.String str7 = staff3.getEmail();
        java.lang.String str8 = staff3.getEmail();
        java.lang.String str9 = staff3.getAccountType();
        staff3.setVerified(true);
        java.lang.String str12 = staff3.getAccountType();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "staff" + "'", str9, "staff");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "staff" + "'", str12, "staff");
    }

    @Test
    public void test13629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13629");
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
        java.lang.String str15 = staff3.getAccountType();
        staff3.viewProfile();
        double double17 = staff3.getHourlyRate();
        java.lang.String str18 = staff3.getID();
        java.lang.String str19 = staff3.getID();
        staff3.viewProfile();
        java.lang.String str21 = staff3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "staff" + "'", str11, "staff");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "staff" + "'", str15, "staff");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 40.0d + "'", double17 == 40.0d);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "staff" + "'", str21, "staff");
    }

    @Test
    public void test13630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13630");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        boolean boolean5 = staff3.isVerified();
        java.lang.String str6 = staff3.getID();
        java.lang.String str7 = staff3.getID();
        double double8 = staff3.getHourlyRate();
        staff3.logout();
        staff3.logout();
        staff3.setVerified(true);
        java.lang.String str13 = staff3.getAccountType();
        staff3.setVerified(false);
        staff3.login("staff", "hi!");
        java.lang.String str19 = staff3.getEmail();
        java.lang.String str20 = staff3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 40.0d + "'", double8 == 40.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "staff" + "'", str13, "staff");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test13631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13631");
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
        staff3.setVerified(true);
        boolean boolean20 = staff3.isVerified();
        java.lang.String str21 = staff3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "staff" + "'", str15, "staff");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 40.0d + "'", double17 == 40.0d);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test13632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13632");
        model.Staff staff3 = new model.Staff("hi!", "staff", "");
        java.lang.String str4 = staff3.getEmail();
        staff3.viewProfile();
        java.lang.String str6 = staff3.getID();
        staff3.logout();
        java.lang.String str8 = staff3.getPassword();
        staff3.setVerified(true);
        boolean boolean11 = staff3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "staff" + "'", str8, "staff");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test13633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13633");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        boolean boolean6 = staff3.isVerified();
        staff3.logout();
        java.lang.String str8 = staff3.getPassword();
        java.lang.String str9 = staff3.getPassword();
        staff3.logout();
        staff3.viewProfile();
        java.lang.String str12 = staff3.getID();
        staff3.login("staff", "staff");
        java.lang.Class<?> wildcardClass16 = staff3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test13634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13634");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        boolean boolean5 = staff3.isVerified();
        java.lang.String str6 = staff3.getID();
        java.lang.String str7 = staff3.getID();
        staff3.setVerified(true);
        java.lang.String str10 = staff3.getEmail();
        staff3.setVerified(true);
        staff3.login("staff", "hi!");
        boolean boolean16 = staff3.isVerified();
        java.lang.String str17 = staff3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test13635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13635");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        staff3.logout();
        java.lang.String str5 = staff3.getID();
        java.lang.String str6 = staff3.getEmail();
        double double7 = staff3.getHourlyRate();
        java.lang.String str8 = staff3.getEmail();
        java.lang.String str9 = staff3.getEmail();
        java.lang.String str10 = staff3.getPassword();
        staff3.setVerified(true);
        staff3.logout();
        staff3.login("hi!", "");
        staff3.login("", "");
        double double20 = staff3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 40.0d + "'", double7 == 40.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 40.0d + "'", double20 == 40.0d);
    }

    @Test
    public void test13636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13636");
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
        staff3.viewProfile();
        boolean boolean17 = staff3.isVerified();
        staff3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test13637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13637");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        staff3.logout();
        java.lang.String str5 = staff3.getID();
        java.lang.String str6 = staff3.getEmail();
        staff3.viewProfile();
        staff3.setVerified(false);
        java.lang.String str10 = staff3.getID();
        java.lang.String str11 = staff3.getAccountType();
        staff3.setVerified(true);
        staff3.setVerified(true);
        java.lang.String str16 = staff3.getAccountType();
        staff3.login("", "staff");
        double double20 = staff3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "staff" + "'", str11, "staff");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "staff" + "'", str16, "staff");
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 40.0d + "'", double20 == 40.0d);
    }

    @Test
    public void test13638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13638");
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
        java.lang.String str17 = staff3.getEmail();
        java.lang.String str18 = staff3.getAccountType();
        java.lang.String str19 = staff3.getAccountType();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "staff" + "'", str8, "staff");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "staff" + "'", str10, "staff");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "staff" + "'", str18, "staff");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "staff" + "'", str19, "staff");
    }

    @Test
    public void test13639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13639");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        boolean boolean6 = staff3.isVerified();
        staff3.logout();
        java.lang.String str8 = staff3.getPassword();
        java.lang.String str9 = staff3.getPassword();
        staff3.logout();
        java.lang.String str11 = staff3.getAccountType();
        staff3.logout();
        staff3.login("", "hi!");
        staff3.logout();
        staff3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "staff" + "'", str11, "staff");
    }

    @Test
    public void test13640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13640");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        staff3.logout();
        java.lang.String str5 = staff3.getID();
        java.lang.String str6 = staff3.getEmail();
        staff3.viewProfile();
        staff3.setVerified(false);
        staff3.logout();
        java.lang.String str11 = staff3.getEmail();
        staff3.logout();
        java.lang.String str13 = staff3.getPassword();
        staff3.logout();
        java.lang.String str15 = staff3.getEmail();
        java.lang.String str16 = staff3.getID();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test13641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13641");
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
        java.lang.String str15 = staff3.getEmail();
        staff3.login("hi!", "staff");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "staff" + "'", str11, "staff");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 40.0d + "'", double13 == 40.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test13642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13642");
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
        staff3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "staff" + "'", str6, "staff");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 40.0d + "'", double8 == 40.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "staff" + "'", str10, "staff");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "staff" + "'", str16, "staff");
    }

    @Test
    public void test13643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13643");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        boolean boolean5 = staff3.isVerified();
        java.lang.String str6 = staff3.getID();
        java.lang.String str7 = staff3.getID();
        staff3.setVerified(true);
        java.lang.String str10 = staff3.getEmail();
        staff3.setVerified(true);
        staff3.setVerified(true);
        java.lang.String str15 = staff3.getPassword();
        java.lang.String str16 = staff3.getEmail();
        boolean boolean17 = staff3.isVerified();
        staff3.logout();
        java.lang.String str19 = staff3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test13644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13644");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        staff3.logout();
        java.lang.String str5 = staff3.getID();
        java.lang.String str6 = staff3.getEmail();
        double double7 = staff3.getHourlyRate();
        java.lang.String str8 = staff3.getEmail();
        java.lang.String str9 = staff3.getEmail();
        java.lang.String str10 = staff3.getPassword();
        staff3.setVerified(true);
        staff3.logout();
        staff3.login("hi!", "");
        java.lang.String str17 = staff3.getEmail();
        double double18 = staff3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 40.0d + "'", double7 == 40.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 40.0d + "'", double18 == 40.0d);
    }

    @Test
    public void test13645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13645");
        model.Staff staff3 = new model.Staff("hi!", "", "hi!");
        staff3.setVerified(false);
        staff3.viewProfile();
        java.lang.String str7 = staff3.getEmail();
        double double8 = staff3.getHourlyRate();
        staff3.viewProfile();
        java.lang.String str10 = staff3.getAccountType();
        staff3.login("hi!", "staff");
        double double14 = staff3.getHourlyRate();
        boolean boolean15 = staff3.isVerified();
        double double16 = staff3.getHourlyRate();
        double double17 = staff3.getHourlyRate();
        boolean boolean18 = staff3.isVerified();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 40.0d + "'", double8 == 40.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "staff" + "'", str10, "staff");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 40.0d + "'", double14 == 40.0d);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 40.0d + "'", double16 == 40.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 40.0d + "'", double17 == 40.0d);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test13646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13646");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        boolean boolean6 = staff3.isVerified();
        staff3.logout();
        staff3.viewProfile();
        double double9 = staff3.getHourlyRate();
        java.lang.String str10 = staff3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 40.0d + "'", double9 == 40.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test13647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13647");
        model.Staff staff3 = new model.Staff("staff", "", "hi!");
        java.lang.String str4 = staff3.getAccountType();
        staff3.setVerified(false);
        java.lang.Class<?> wildcardClass7 = staff3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "staff" + "'", str4, "staff");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test13648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13648");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        boolean boolean5 = staff3.isVerified();
        java.lang.String str6 = staff3.getID();
        staff3.setVerified(false);
        java.lang.String str9 = staff3.getID();
        staff3.setVerified(false);
        staff3.logout();
        java.lang.String str13 = staff3.getAccountType();
        staff3.login("staff", "staff");
        staff3.login("", "hi!");
        java.lang.String str20 = staff3.getAccountType();
        staff3.setVerified(true);
        staff3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "staff" + "'", str13, "staff");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "staff" + "'", str20, "staff");
    }

    @Test
    public void test13649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13649");
        model.Staff staff3 = new model.Staff("hi!", "", "hi!");
        staff3.setVerified(false);
        staff3.viewProfile();
        java.lang.String str7 = staff3.getEmail();
        staff3.login("hi!", "");
        staff3.setVerified(false);
        double double13 = staff3.getHourlyRate();
        boolean boolean14 = staff3.isVerified();
        staff3.setVerified(true);
        java.lang.String str17 = staff3.getAccountType();
        java.lang.String str18 = staff3.getAccountType();
        double double19 = staff3.getHourlyRate();
        java.lang.String str20 = staff3.getPassword();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 40.0d + "'", double13 == 40.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "staff" + "'", str17, "staff");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "staff" + "'", str18, "staff");
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 40.0d + "'", double19 == 40.0d);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test13650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13650");
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
        java.lang.String str15 = staff3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "staff" + "'", str8, "staff");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 40.0d + "'", double12 == 40.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test13651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13651");
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
        staff3.login("", "staff");
        staff3.setVerified(false);
        staff3.viewProfile();
        java.lang.String str22 = staff3.getPassword();
        boolean boolean23 = staff3.isVerified();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "staff" + "'", str8, "staff");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 40.0d + "'", double14 == 40.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "staff" + "'", str15, "staff");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test13652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13652");
        model.Staff staff3 = new model.Staff("hi!", "staff", "");
        java.lang.String str4 = staff3.getEmail();
        staff3.viewProfile();
        staff3.logout();
        staff3.viewProfile();
        java.lang.String str8 = staff3.getPassword();
        java.lang.String str9 = staff3.getEmail();
        java.lang.String str10 = staff3.getID();
        java.lang.String str11 = staff3.getID();
        staff3.login("staff", "staff");
        java.lang.String str15 = staff3.getAccountType();
        java.lang.String str16 = staff3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "staff" + "'", str8, "staff");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "staff" + "'", str15, "staff");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test13653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13653");
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
        java.lang.String str15 = staff3.getAccountType();
        java.lang.String str16 = staff3.getEmail();
        staff3.setVerified(false);
        staff3.viewProfile();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 40.0d + "'", double7 == 40.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "staff" + "'", str15, "staff");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test13654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13654");
        model.Staff staff3 = new model.Staff("hi!", "", "hi!");
        java.lang.String str4 = staff3.getAccountType();
        java.lang.String str5 = staff3.getEmail();
        staff3.viewProfile();
        staff3.setVerified(true);
        java.lang.String str9 = staff3.getPassword();
        staff3.setVerified(false);
        java.lang.String str12 = staff3.getAccountType();
        double double13 = staff3.getHourlyRate();
        staff3.logout();
        boolean boolean15 = staff3.isVerified();
        staff3.login("hi!", "");
        java.lang.String str19 = staff3.getID();
        staff3.viewProfile();
        double double21 = staff3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "staff" + "'", str4, "staff");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "staff" + "'", str12, "staff");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 40.0d + "'", double13 == 40.0d);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 40.0d + "'", double21 == 40.0d);
    }

    @Test
    public void test13655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13655");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        staff3.login("", "");
        java.lang.String str7 = staff3.getPassword();
        java.lang.String str8 = staff3.getEmail();
        java.lang.String str9 = staff3.getID();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test13656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13656");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        boolean boolean6 = staff3.isVerified();
        staff3.logout();
        java.lang.String str8 = staff3.getEmail();
        java.lang.String str9 = staff3.getID();
        staff3.logout();
        staff3.logout();
        double double12 = staff3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 40.0d + "'", double12 == 40.0d);
    }

    @Test
    public void test13657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13657");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        boolean boolean5 = staff3.isVerified();
        java.lang.String str6 = staff3.getAccountType();
        staff3.logout();
        java.lang.String str8 = staff3.getEmail();
        staff3.viewProfile();
        java.lang.String str10 = staff3.getID();
        java.lang.String str11 = staff3.getEmail();
        staff3.setVerified(false);
        java.lang.String str14 = staff3.getAccountType();
        java.lang.String str15 = staff3.getPassword();
        double double16 = staff3.getHourlyRate();
        double double17 = staff3.getHourlyRate();
        staff3.viewProfile();
        staff3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "staff" + "'", str6, "staff");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "staff" + "'", str14, "staff");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 40.0d + "'", double16 == 40.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 40.0d + "'", double17 == 40.0d);
    }

    @Test
    public void test13658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13658");
        model.Staff staff3 = new model.Staff("hi!", "", "hi!");
        staff3.setVerified(false);
        staff3.viewProfile();
        java.lang.String str7 = staff3.getEmail();
        staff3.login("hi!", "hi!");
        java.lang.String str11 = staff3.getEmail();
        staff3.login("staff", "hi!");
        staff3.setVerified(true);
        java.lang.String str17 = staff3.getEmail();
        boolean boolean18 = staff3.isVerified();
        staff3.logout();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test13659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13659");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        boolean boolean5 = staff3.isVerified();
        java.lang.String str6 = staff3.getAccountType();
        staff3.logout();
        java.lang.String str8 = staff3.getEmail();
        staff3.viewProfile();
        boolean boolean10 = staff3.isVerified();
        java.lang.String str11 = staff3.getID();
        java.lang.String str12 = staff3.getEmail();
        staff3.logout();
        java.lang.String str14 = staff3.getEmail();
        java.lang.String str15 = staff3.getID();
        java.lang.String str16 = staff3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "staff" + "'", str6, "staff");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test13660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13660");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        boolean boolean5 = staff3.isVerified();
        java.lang.String str6 = staff3.getID();
        boolean boolean7 = staff3.isVerified();
        staff3.logout();
        java.lang.String str9 = staff3.getID();
        staff3.login("hi!", "");
        staff3.login("", "staff");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test13661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13661");
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
        java.lang.String str16 = staff3.getEmail();
        java.lang.String str17 = staff3.getID();
        staff3.setVerified(false);
        staff3.login("hi!", "hi!");
        staff3.login("", "hi!");
        java.lang.String str26 = staff3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 40.0d + "'", double14 == 40.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
    }

    @Test
    public void test13662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13662");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        boolean boolean5 = staff3.isVerified();
        java.lang.String str6 = staff3.getID();
        java.lang.String str7 = staff3.getID();
        java.lang.String str8 = staff3.getEmail();
        staff3.login("", "");
        java.lang.String str12 = staff3.getAccountType();
        staff3.viewProfile();
        boolean boolean14 = staff3.isVerified();
        staff3.setVerified(true);
        double double17 = staff3.getHourlyRate();
        java.lang.String str18 = staff3.getAccountType();
        staff3.logout();
        java.lang.String str20 = staff3.getID();
        double double21 = staff3.getHourlyRate();
        java.lang.String str22 = staff3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "staff" + "'", str12, "staff");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 40.0d + "'", double17 == 40.0d);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "staff" + "'", str18, "staff");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 40.0d + "'", double21 == 40.0d);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
    }

    @Test
    public void test13663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13663");
        model.Staff staff3 = new model.Staff("hi!", "hi!", "");
        staff3.setVerified(true);
        double double6 = staff3.getHourlyRate();
        java.lang.String str7 = staff3.getID();
        boolean boolean8 = staff3.isVerified();
        java.lang.String str9 = staff3.getPassword();
        staff3.login("hi!", "hi!");
        staff3.logout();
        staff3.login("staff", "staff");
        java.lang.Class<?> wildcardClass17 = staff3.getClass();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 40.0d + "'", double6 == 40.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test13664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13664");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        boolean boolean6 = staff3.isVerified();
        staff3.logout();
        staff3.setVerified(false);
        java.lang.String str10 = staff3.getAccountType();
        java.lang.String str11 = staff3.getEmail();
        staff3.login("staff", "");
        staff3.viewProfile();
        java.lang.Class<?> wildcardClass16 = staff3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "staff" + "'", str10, "staff");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test13665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13665");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        staff3.logout();
        java.lang.String str5 = staff3.getID();
        java.lang.String str6 = staff3.getEmail();
        double double7 = staff3.getHourlyRate();
        boolean boolean8 = staff3.isVerified();
        java.lang.String str9 = staff3.getID();
        java.lang.String str10 = staff3.getAccountType();
        double double11 = staff3.getHourlyRate();
        java.lang.String str12 = staff3.getPassword();
        java.lang.String str13 = staff3.getAccountType();
        boolean boolean14 = staff3.isVerified();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 40.0d + "'", double7 == 40.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "staff" + "'", str10, "staff");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 40.0d + "'", double11 == 40.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "staff" + "'", str13, "staff");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test13666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13666");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        double double6 = staff3.getHourlyRate();
        java.lang.String str7 = staff3.getPassword();
        staff3.logout();
        staff3.logout();
        java.lang.String str10 = staff3.getPassword();
        staff3.login("", "hi!");
        java.lang.String str14 = staff3.getEmail();
        java.lang.String str15 = staff3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 40.0d + "'", double6 == 40.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test13667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13667");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        boolean boolean6 = staff3.isVerified();
        staff3.viewProfile();
        java.lang.String str8 = staff3.getAccountType();
        staff3.setVerified(false);
        double double11 = staff3.getHourlyRate();
        staff3.login("", "hi!");
        staff3.logout();
        staff3.viewProfile();
        java.lang.String str17 = staff3.getAccountType();
        java.lang.String str18 = staff3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "staff" + "'", str8, "staff");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 40.0d + "'", double11 == 40.0d);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "staff" + "'", str17, "staff");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test13668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13668");
        model.Staff staff3 = new model.Staff("hi!", "", "hi!");
        java.lang.String str4 = staff3.getAccountType();
        java.lang.String str5 = staff3.getEmail();
        double double6 = staff3.getHourlyRate();
        boolean boolean7 = staff3.isVerified();
        staff3.logout();
        java.lang.String str9 = staff3.getEmail();
        staff3.setVerified(false);
        staff3.login("", "hi!");
        boolean boolean15 = staff3.isVerified();
        staff3.logout();
        staff3.setVerified(true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "staff" + "'", str4, "staff");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 40.0d + "'", double6 == 40.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test13669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13669");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        boolean boolean6 = staff3.isVerified();
        staff3.logout();
        java.lang.String str8 = staff3.getPassword();
        java.lang.String str9 = staff3.getID();
        staff3.logout();
        java.lang.String str11 = staff3.getEmail();
        java.lang.String str12 = staff3.getAccountType();
        staff3.login("hi!", "staff");
        double double16 = staff3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "staff" + "'", str12, "staff");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 40.0d + "'", double16 == 40.0d);
    }

    @Test
    public void test13670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13670");
        model.Staff staff3 = new model.Staff("hi!", "", "hi!");
        java.lang.String str4 = staff3.getAccountType();
        java.lang.String str5 = staff3.getEmail();
        staff3.viewProfile();
        staff3.setVerified(true);
        java.lang.String str9 = staff3.getPassword();
        staff3.setVerified(false);
        java.lang.String str12 = staff3.getAccountType();
        java.lang.String str13 = staff3.getPassword();
        double double14 = staff3.getHourlyRate();
        double double15 = staff3.getHourlyRate();
        java.lang.String str16 = staff3.getID();
        double double17 = staff3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "staff" + "'", str4, "staff");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "staff" + "'", str12, "staff");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 40.0d + "'", double14 == 40.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 40.0d + "'", double15 == 40.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 40.0d + "'", double17 == 40.0d);
    }

    @Test
    public void test13671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13671");
        model.Staff staff3 = new model.Staff("hi!", "", "hi!");
        staff3.logout();
        staff3.login("hi!", "hi!");
        double double8 = staff3.getHourlyRate();
        boolean boolean9 = staff3.isVerified();
        java.lang.String str10 = staff3.getAccountType();
        java.lang.String str11 = staff3.getPassword();
        java.lang.String str12 = staff3.getID();
        java.lang.String str13 = staff3.getPassword();
        java.lang.String str14 = staff3.getID();
        java.lang.String str15 = staff3.getEmail();
        boolean boolean16 = staff3.isVerified();
        double double17 = staff3.getHourlyRate();
        java.lang.String str18 = staff3.getID();
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 40.0d + "'", double8 == 40.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "staff" + "'", str10, "staff");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 40.0d + "'", double17 == 40.0d);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test13672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13672");
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
        java.lang.String str24 = staff3.getAccountType();
        staff3.login("", "");
        java.lang.Class<?> wildcardClass28 = staff3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 40.0d + "'", double23 == 40.0d);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "staff" + "'", str24, "staff");
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test13673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13673");
        model.Staff staff3 = new model.Staff("", "staff", "staff");
        staff3.viewProfile();
        staff3.viewProfile();
        java.lang.String str6 = staff3.getAccountType();
        java.lang.String str7 = staff3.getEmail();
        staff3.logout();
        double double9 = staff3.getHourlyRate();
        java.lang.String str10 = staff3.getID();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "staff" + "'", str6, "staff");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 40.0d + "'", double9 == 40.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "staff" + "'", str10, "staff");
    }

    @Test
    public void test13674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13674");
        model.Staff staff3 = new model.Staff("hi!", "", "hi!");
        java.lang.String str4 = staff3.getAccountType();
        java.lang.String str5 = staff3.getID();
        staff3.setVerified(true);
        boolean boolean8 = staff3.isVerified();
        staff3.setVerified(false);
        java.lang.String str11 = staff3.getAccountType();
        staff3.logout();
        java.lang.String str13 = staff3.getID();
        double double14 = staff3.getHourlyRate();
        java.lang.String str15 = staff3.getPassword();
        staff3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "staff" + "'", str4, "staff");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "staff" + "'", str11, "staff");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 40.0d + "'", double14 == 40.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test13675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13675");
        model.Staff staff3 = new model.Staff("hi!", "", "hi!");
        java.lang.String str4 = staff3.getAccountType();
        java.lang.String str5 = staff3.getEmail();
        double double6 = staff3.getHourlyRate();
        staff3.viewProfile();
        java.lang.String str8 = staff3.getID();
        boolean boolean9 = staff3.isVerified();
        java.lang.String str10 = staff3.getAccountType();
        boolean boolean11 = staff3.isVerified();
        java.lang.String str12 = staff3.getID();
        staff3.login("staff", "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "staff" + "'", str4, "staff");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 40.0d + "'", double6 == 40.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "staff" + "'", str10, "staff");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test13676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13676");
        model.Staff staff3 = new model.Staff("hi!", "hi!", "");
        staff3.logout();
        java.lang.String str5 = staff3.getEmail();
        boolean boolean6 = staff3.isVerified();
        java.lang.String str7 = staff3.getEmail();
        staff3.login("", "staff");
        java.lang.String str11 = staff3.getEmail();
        staff3.viewProfile();
        staff3.login("hi!", "hi!");
        java.lang.String str16 = staff3.getAccountType();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "staff" + "'", str16, "staff");
    }

    @Test
    public void test13677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13677");
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
        java.lang.Class<?> wildcardClass22 = staff3.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 40.0d + "'", double13 == 40.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 40.0d + "'", double14 == 40.0d);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test13678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13678");
        model.Staff staff3 = new model.Staff("", "staff", "staff");
        staff3.setVerified(true);
        java.lang.String str6 = staff3.getPassword();
        boolean boolean7 = staff3.isVerified();
        java.lang.String str8 = staff3.getEmail();
        boolean boolean9 = staff3.isVerified();
        java.lang.String str10 = staff3.getAccountType();
        java.lang.String str11 = staff3.getEmail();
        java.lang.String str12 = staff3.getAccountType();
        java.lang.String str13 = staff3.getAccountType();
        java.lang.String str14 = staff3.getAccountType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "staff" + "'", str6, "staff");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "staff" + "'", str10, "staff");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "staff" + "'", str12, "staff");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "staff" + "'", str13, "staff");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "staff" + "'", str14, "staff");
    }

    @Test
    public void test13679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13679");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        java.lang.String str6 = staff3.getPassword();
        java.lang.String str7 = staff3.getPassword();
        java.lang.String str8 = staff3.getID();
        java.lang.String str9 = staff3.getID();
        double double10 = staff3.getHourlyRate();
        java.lang.String str11 = staff3.getPassword();
        staff3.setVerified(false);
        staff3.logout();
        double double15 = staff3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 40.0d + "'", double10 == 40.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 40.0d + "'", double15 == 40.0d);
    }

    @Test
    public void test13680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13680");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        boolean boolean6 = staff3.isVerified();
        staff3.logout();
        staff3.setVerified(false);
        java.lang.String str10 = staff3.getID();
        double double11 = staff3.getHourlyRate();
        staff3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 40.0d + "'", double11 == 40.0d);
    }

    @Test
    public void test13681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13681");
        model.Staff staff3 = new model.Staff("staff", "hi!", "");
        java.lang.String str4 = staff3.getID();
        boolean boolean5 = staff3.isVerified();
        staff3.login("", "");
        java.lang.String str9 = staff3.getPassword();
        java.lang.String str10 = staff3.getEmail();
        java.lang.String str11 = staff3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "staff" + "'", str10, "staff");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test13682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13682");
        model.Staff staff3 = new model.Staff("hi!", "", "hi!");
        java.lang.String str4 = staff3.getAccountType();
        java.lang.String str5 = staff3.getID();
        staff3.setVerified(true);
        staff3.login("staff", "staff");
        java.lang.String str11 = staff3.getPassword();
        java.lang.String str12 = staff3.getEmail();
        staff3.logout();
        staff3.setVerified(true);
        java.lang.String str16 = staff3.getPassword();
        java.lang.String str17 = staff3.getPassword();
        java.lang.String str18 = staff3.getAccountType();
        boolean boolean19 = staff3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "staff" + "'", str4, "staff");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "staff" + "'", str18, "staff");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test13683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13683");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        boolean boolean5 = staff3.isVerified();
        java.lang.String str6 = staff3.getID();
        java.lang.String str7 = staff3.getID();
        staff3.setVerified(true);
        java.lang.String str10 = staff3.getEmail();
        staff3.setVerified(true);
        double double13 = staff3.getHourlyRate();
        double double14 = staff3.getHourlyRate();
        java.lang.String str15 = staff3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 40.0d + "'", double13 == 40.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 40.0d + "'", double14 == 40.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test13684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13684");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        boolean boolean5 = staff3.isVerified();
        java.lang.String str6 = staff3.getID();
        java.lang.String str7 = staff3.getID();
        double double8 = staff3.getHourlyRate();
        staff3.setVerified(true);
        staff3.logout();
        boolean boolean12 = staff3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 40.0d + "'", double8 == 40.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test13685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13685");
        model.Staff staff3 = new model.Staff("hi!", "", "hi!");
        staff3.logout();
        staff3.login("hi!", "hi!");
        double double8 = staff3.getHourlyRate();
        boolean boolean9 = staff3.isVerified();
        java.lang.String str10 = staff3.getAccountType();
        java.lang.String str11 = staff3.getAccountType();
        double double12 = staff3.getHourlyRate();
        double double13 = staff3.getHourlyRate();
        staff3.viewProfile();
        java.lang.String str15 = staff3.getPassword();
        staff3.logout();
        staff3.setVerified(true);
        java.lang.Class<?> wildcardClass19 = staff3.getClass();
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 40.0d + "'", double8 == 40.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "staff" + "'", str10, "staff");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "staff" + "'", str11, "staff");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 40.0d + "'", double12 == 40.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 40.0d + "'", double13 == 40.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test13686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13686");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        staff3.logout();
        java.lang.String str5 = staff3.getID();
        java.lang.String str6 = staff3.getEmail();
        java.lang.String str7 = staff3.getEmail();
        java.lang.String str8 = staff3.getID();
        staff3.viewProfile();
        staff3.viewProfile();
        boolean boolean11 = staff3.isVerified();
        staff3.viewProfile();
        java.lang.String str13 = staff3.getEmail();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test13687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13687");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        boolean boolean6 = staff3.isVerified();
        staff3.logout();
        java.lang.String str8 = staff3.getEmail();
        java.lang.String str9 = staff3.getPassword();
        staff3.setVerified(false);
        java.lang.String str12 = staff3.getPassword();
        staff3.viewProfile();
        java.lang.String str14 = staff3.getID();
        double double15 = staff3.getHourlyRate();
        java.lang.String str16 = staff3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 40.0d + "'", double15 == 40.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test13688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13688");
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
        boolean boolean15 = staff3.isVerified();
        staff3.viewProfile();
        staff3.setVerified(false);
        double double19 = staff3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 40.0d + "'", double11 == 40.0d);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 40.0d + "'", double19 == 40.0d);
    }

    @Test
    public void test13689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13689");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        double double6 = staff3.getHourlyRate();
        java.lang.String str7 = staff3.getPassword();
        staff3.login("", "staff");
        java.lang.String str11 = staff3.getAccountType();
        java.lang.String str12 = staff3.getAccountType();
        boolean boolean13 = staff3.isVerified();
        java.lang.String str14 = staff3.getID();
        double double15 = staff3.getHourlyRate();
        staff3.setVerified(true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 40.0d + "'", double6 == 40.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "staff" + "'", str11, "staff");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "staff" + "'", str12, "staff");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 40.0d + "'", double15 == 40.0d);
    }

    @Test
    public void test13690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13690");
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
        java.lang.String str16 = staff3.getID();
        java.lang.Class<?> wildcardClass17 = staff3.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 40.0d + "'", double12 == 40.0d);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test13691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13691");
        model.Staff staff3 = new model.Staff("hi!", "", "hi!");
        java.lang.String str4 = staff3.getAccountType();
        java.lang.String str5 = staff3.getEmail();
        double double6 = staff3.getHourlyRate();
        boolean boolean7 = staff3.isVerified();
        staff3.logout();
        boolean boolean9 = staff3.isVerified();
        staff3.setVerified(true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "staff" + "'", str4, "staff");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 40.0d + "'", double6 == 40.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test13692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13692");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        boolean boolean5 = staff3.isVerified();
        java.lang.String str6 = staff3.getID();
        staff3.setVerified(false);
        java.lang.String str9 = staff3.getID();
        staff3.setVerified(false);
        java.lang.String str12 = staff3.getID();
        java.lang.String str13 = staff3.getAccountType();
        double double14 = staff3.getHourlyRate();
        staff3.login("hi!", "staff");
        java.lang.String str18 = staff3.getAccountType();
        java.lang.String str19 = staff3.getAccountType();
        boolean boolean20 = staff3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "staff" + "'", str13, "staff");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 40.0d + "'", double14 == 40.0d);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "staff" + "'", str18, "staff");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "staff" + "'", str19, "staff");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test13693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13693");
        model.Staff staff3 = new model.Staff("hi!", "", "hi!");
        java.lang.String str4 = staff3.getAccountType();
        java.lang.String str5 = staff3.getEmail();
        staff3.viewProfile();
        staff3.logout();
        staff3.login("staff", "staff");
        double double11 = staff3.getHourlyRate();
        java.lang.String str12 = staff3.getPassword();
        java.lang.String str13 = staff3.getAccountType();
        staff3.setVerified(true);
        boolean boolean16 = staff3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "staff" + "'", str4, "staff");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 40.0d + "'", double11 == 40.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "staff" + "'", str13, "staff");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test13694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13694");
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
        java.lang.String str22 = staff3.getAccountType();
        double double23 = staff3.getHourlyRate();
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
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "staff" + "'", str22, "staff");
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 40.0d + "'", double23 == 40.0d);
    }

    @Test
    public void test13695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13695");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        boolean boolean6 = staff3.isVerified();
        staff3.logout();
        java.lang.String str8 = staff3.getPassword();
        java.lang.String str9 = staff3.getID();
        double double10 = staff3.getHourlyRate();
        java.lang.String str11 = staff3.getID();
        java.lang.String str12 = staff3.getPassword();
        java.lang.String str13 = staff3.getEmail();
        staff3.viewProfile();
        double double15 = staff3.getHourlyRate();
        java.lang.String str16 = staff3.getPassword();
        staff3.login("hi!", "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 40.0d + "'", double10 == 40.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 40.0d + "'", double15 == 40.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test13696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13696");
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
        java.lang.String str16 = staff3.getID();
        staff3.login("staff", "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 40.0d + "'", double12 == 40.0d);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test13697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13697");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        boolean boolean5 = staff3.isVerified();
        java.lang.String str6 = staff3.getID();
        staff3.setVerified(false);
        java.lang.String str9 = staff3.getID();
        staff3.setVerified(false);
        staff3.logout();
        staff3.setVerified(false);
        java.lang.String str15 = staff3.getEmail();
        staff3.viewProfile();
        java.lang.String str17 = staff3.getPassword();
        double double18 = staff3.getHourlyRate();
        staff3.setVerified(false);
        staff3.setVerified(false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 40.0d + "'", double18 == 40.0d);
    }

    @Test
    public void test13698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13698");
        model.Staff staff3 = new model.Staff("hi!", "", "hi!");
        staff3.setVerified(false);
        java.lang.String str6 = staff3.getPassword();
        java.lang.String str7 = staff3.getAccountType();
        java.lang.String str8 = staff3.getEmail();
        staff3.setVerified(false);
        java.lang.String str11 = staff3.getID();
        java.lang.String str12 = staff3.getID();
        staff3.logout();
        staff3.setVerified(false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "staff" + "'", str7, "staff");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test13699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13699");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getID();
        java.lang.String str6 = staff3.getPassword();
        java.lang.String str7 = staff3.getEmail();
        java.lang.String str8 = staff3.getEmail();
        staff3.viewProfile();
        java.lang.String str10 = staff3.getEmail();
        boolean boolean11 = staff3.isVerified();
        staff3.viewProfile();
        staff3.login("", "staff");
        staff3.setVerified(false);
        staff3.login("hi!", "staff");
        staff3.setVerified(false);
        java.lang.String str23 = staff3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
    }

    @Test
    public void test13700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13700");
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
        boolean boolean21 = staff3.isVerified();
        boolean boolean22 = staff3.isVerified();
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
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test13701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13701");
        model.Staff staff3 = new model.Staff("hi!", "", "hi!");
        staff3.logout();
        staff3.login("hi!", "hi!");
        double double8 = staff3.getHourlyRate();
        staff3.logout();
        staff3.viewProfile();
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 40.0d + "'", double8 == 40.0d);
    }

    @Test
    public void test13702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13702");
        model.Staff staff3 = new model.Staff("hi!", "", "hi!");
        java.lang.String str4 = staff3.getAccountType();
        java.lang.String str5 = staff3.getID();
        staff3.setVerified(true);
        boolean boolean8 = staff3.isVerified();
        staff3.setVerified(false);
        java.lang.String str11 = staff3.getAccountType();
        staff3.logout();
        java.lang.String str13 = staff3.getID();
        java.lang.String str14 = staff3.getPassword();
        staff3.viewProfile();
        staff3.login("hi!", "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "staff" + "'", str4, "staff");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "staff" + "'", str11, "staff");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test13703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13703");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        boolean boolean5 = staff3.isVerified();
        java.lang.String str6 = staff3.getID();
        staff3.login("", "staff");
        java.lang.String str10 = staff3.getEmail();
        staff3.login("", "hi!");
        java.lang.String str14 = staff3.getPassword();
        java.lang.String str15 = staff3.getID();
        staff3.viewProfile();
        java.lang.String str17 = staff3.getID();
        staff3.login("hi!", "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test13704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13704");
        model.Staff staff3 = new model.Staff("", "", "staff");
        staff3.login("staff", "staff");
        double double7 = staff3.getHourlyRate();
        staff3.setVerified(true);
        boolean boolean10 = staff3.isVerified();
        java.lang.String str11 = staff3.getEmail();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 40.0d + "'", double7 == 40.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test13705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13705");
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
        java.lang.String str18 = staff3.getPassword();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 40.0d + "'", double7 == 40.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 40.0d + "'", double10 == 40.0d);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test13706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13706");
        model.Staff staff3 = new model.Staff("", "staff", "");
        staff3.setVerified(true);
        staff3.login("", "hi!");
        boolean boolean9 = staff3.isVerified();
        java.lang.String str10 = staff3.getPassword();
        java.lang.String str11 = staff3.getPassword();
        java.lang.String str12 = staff3.getPassword();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "staff" + "'", str10, "staff");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "staff" + "'", str11, "staff");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "staff" + "'", str12, "staff");
    }

    @Test
    public void test13707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13707");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        staff3.logout();
        java.lang.String str5 = staff3.getID();
        java.lang.String str6 = staff3.getEmail();
        double double7 = staff3.getHourlyRate();
        boolean boolean8 = staff3.isVerified();
        java.lang.String str9 = staff3.getID();
        staff3.setVerified(true);
        double double12 = staff3.getHourlyRate();
        staff3.logout();
        staff3.logout();
        staff3.viewProfile();
        java.lang.String str16 = staff3.getPassword();
        double double17 = staff3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 40.0d + "'", double7 == 40.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 40.0d + "'", double12 == 40.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 40.0d + "'", double17 == 40.0d);
    }

    @Test
    public void test13708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13708");
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
        java.lang.String str15 = staff3.getEmail();
        staff3.logout();
        boolean boolean17 = staff3.isVerified();
        java.lang.String str18 = staff3.getPassword();
        boolean boolean19 = staff3.isVerified();
        staff3.setVerified(true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 40.0d + "'", double7 == 40.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test13709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13709");
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
        double double19 = staff3.getHourlyRate();
        staff3.login("hi!", "");
        java.lang.String str23 = staff3.getID();
        staff3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "staff" + "'", str11, "staff");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 40.0d + "'", double16 == 40.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 40.0d + "'", double19 == 40.0d);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
    }

    @Test
    public void test13710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13710");
        model.Staff staff3 = new model.Staff("hi!", "staff", "");
        staff3.setVerified(false);
        staff3.logout();
        java.lang.String str7 = staff3.getEmail();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test13711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13711");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        boolean boolean6 = staff3.isVerified();
        staff3.logout();
        java.lang.String str8 = staff3.getPassword();
        staff3.logout();
        java.lang.String str10 = staff3.getID();
        staff3.login("staff", "");
        staff3.setVerified(false);
        staff3.viewProfile();
        java.lang.Class<?> wildcardClass17 = staff3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test13712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13712");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        staff3.logout();
        java.lang.String str5 = staff3.getAccountType();
        boolean boolean6 = staff3.isVerified();
        staff3.setVerified(false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test13713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13713");
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
        java.lang.String str21 = staff3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 40.0d + "'", double6 == 40.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 40.0d + "'", double15 == 40.0d);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
    }

    @Test
    public void test13714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13714");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        staff3.logout();
        java.lang.String str5 = staff3.getID();
        java.lang.String str6 = staff3.getEmail();
        java.lang.String str7 = staff3.getEmail();
        double double8 = staff3.getHourlyRate();
        staff3.login("", "");
        java.lang.String str12 = staff3.getPassword();
        java.lang.String str13 = staff3.getEmail();
        java.lang.String str14 = staff3.getAccountType();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 40.0d + "'", double8 == 40.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "staff" + "'", str14, "staff");
    }

    @Test
    public void test13715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13715");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        double double6 = staff3.getHourlyRate();
        java.lang.String str7 = staff3.getID();
        staff3.setVerified(false);
        java.lang.String str10 = staff3.getID();
        staff3.setVerified(true);
        staff3.login("hi!", "hi!");
        staff3.setVerified(false);
        java.lang.String str18 = staff3.getAccountType();
        java.lang.String str19 = staff3.getID();
        boolean boolean20 = staff3.isVerified();
        boolean boolean21 = staff3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 40.0d + "'", double6 == 40.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "staff" + "'", str18, "staff");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test13716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13716");
        model.Staff staff3 = new model.Staff("hi!", "", "hi!");
        staff3.setVerified(false);
        staff3.viewProfile();
        java.lang.String str7 = staff3.getEmail();
        java.lang.String str8 = staff3.getAccountType();
        staff3.logout();
        boolean boolean10 = staff3.isVerified();
        java.lang.String str11 = staff3.getEmail();
        java.lang.String str12 = staff3.getPassword();
        double double13 = staff3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "staff" + "'", str8, "staff");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 40.0d + "'", double13 == 40.0d);
    }

    @Test
    public void test13717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13717");
        model.Staff staff3 = new model.Staff("hi!", "", "hi!");
        staff3.setVerified(false);
        staff3.viewProfile();
        java.lang.String str7 = staff3.getEmail();
        java.lang.String str8 = staff3.getAccountType();
        staff3.logout();
        boolean boolean10 = staff3.isVerified();
        staff3.login("", "hi!");
        double double14 = staff3.getHourlyRate();
        staff3.setVerified(true);
        staff3.login("hi!", "staff");
        java.lang.String str20 = staff3.getEmail();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "staff" + "'", str8, "staff");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 40.0d + "'", double14 == 40.0d);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test13718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13718");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        boolean boolean5 = staff3.isVerified();
        java.lang.String str6 = staff3.getAccountType();
        staff3.logout();
        java.lang.String str8 = staff3.getEmail();
        staff3.viewProfile();
        boolean boolean10 = staff3.isVerified();
        java.lang.String str11 = staff3.getID();
        double double12 = staff3.getHourlyRate();
        staff3.login("", "");
        java.lang.String str16 = staff3.getPassword();
        staff3.setVerified(false);
        boolean boolean19 = staff3.isVerified();
        java.lang.Class<?> wildcardClass20 = staff3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "staff" + "'", str6, "staff");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 40.0d + "'", double12 == 40.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test13719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13719");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        staff3.logout();
        java.lang.String str5 = staff3.getID();
        java.lang.String str6 = staff3.getPassword();
        staff3.logout();
        staff3.viewProfile();
        java.lang.String str9 = staff3.getAccountType();
        staff3.login("hi!", "hi!");
        staff3.logout();
        java.lang.String str14 = staff3.getAccountType();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "staff" + "'", str9, "staff");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "staff" + "'", str14, "staff");
    }

    @Test
    public void test13720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13720");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        boolean boolean6 = staff3.isVerified();
        staff3.logout();
        staff3.setVerified(true);
        staff3.login("hi!", "");
        staff3.viewProfile();
        java.lang.String str14 = staff3.getID();
        staff3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test13721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13721");
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
        staff3.login("hi!", "hi!");
        java.lang.String str20 = staff3.getEmail();
        java.lang.String str21 = staff3.getEmail();
        staff3.login("hi!", "");
        java.lang.String str25 = staff3.getEmail();
        java.lang.String str26 = staff3.getID();
        boolean boolean27 = staff3.isVerified();
        staff3.setVerified(true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "staff" + "'", str13, "staff");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "staff" + "'", str14, "staff");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "staff" + "'", str16, "staff");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test13722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13722");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getID();
        java.lang.String str6 = staff3.getPassword();
        java.lang.String str7 = staff3.getEmail();
        java.lang.String str8 = staff3.getEmail();
        staff3.viewProfile();
        double double10 = staff3.getHourlyRate();
        java.lang.String str11 = staff3.getAccountType();
        boolean boolean12 = staff3.isVerified();
        staff3.viewProfile();
        java.lang.String str14 = staff3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 40.0d + "'", double10 == 40.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "staff" + "'", str11, "staff");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test13723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13723");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        boolean boolean5 = staff3.isVerified();
        java.lang.String str6 = staff3.getAccountType();
        staff3.login("hi!", "hi!");
        staff3.logout();
        java.lang.String str11 = staff3.getPassword();
        java.lang.String str12 = staff3.getAccountType();
        staff3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "staff" + "'", str6, "staff");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "staff" + "'", str12, "staff");
    }

    @Test
    public void test13724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13724");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        boolean boolean6 = staff3.isVerified();
        staff3.viewProfile();
        staff3.viewProfile();
        java.lang.String str9 = staff3.getID();
        double double10 = staff3.getHourlyRate();
        java.lang.String str11 = staff3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 40.0d + "'", double10 == 40.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "staff" + "'", str11, "staff");
    }

    @Test
    public void test13725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13725");
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
        staff3.setVerified(true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "staff" + "'", str12, "staff");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test13726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13726");
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
        java.lang.String str15 = staff3.getAccountType();
        boolean boolean16 = staff3.isVerified();
        java.lang.String str17 = staff3.getAccountType();
        boolean boolean18 = staff3.isVerified();
        staff3.login("", "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "staff" + "'", str6, "staff");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "staff" + "'", str14, "staff");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "staff" + "'", str15, "staff");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "staff" + "'", str17, "staff");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test13727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13727");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        boolean boolean5 = staff3.isVerified();
        double double6 = staff3.getHourlyRate();
        java.lang.String str7 = staff3.getEmail();
        java.lang.String str8 = staff3.getEmail();
        java.lang.String str9 = staff3.getEmail();
        staff3.login("staff", "");
        java.lang.String str13 = staff3.getEmail();
        java.lang.String str14 = staff3.getAccountType();
        staff3.setVerified(true);
        boolean boolean17 = staff3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 40.0d + "'", double6 == 40.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "staff" + "'", str14, "staff");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test13728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13728");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        boolean boolean5 = staff3.isVerified();
        java.lang.String str6 = staff3.getAccountType();
        staff3.logout();
        double double8 = staff3.getHourlyRate();
        java.lang.String str9 = staff3.getEmail();
        java.lang.String str10 = staff3.getPassword();
        java.lang.String str11 = staff3.getAccountType();
        staff3.viewProfile();
        double double13 = staff3.getHourlyRate();
        java.lang.String str14 = staff3.getEmail();
        java.lang.String str15 = staff3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "staff" + "'", str6, "staff");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 40.0d + "'", double8 == 40.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "staff" + "'", str11, "staff");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 40.0d + "'", double13 == 40.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test13729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13729");
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
        staff3.viewProfile();
        java.lang.String str16 = staff3.getAccountType();
        java.lang.String str17 = staff3.getID();
        staff3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 40.0d + "'", double8 == 40.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "staff" + "'", str10, "staff");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "staff" + "'", str16, "staff");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test13730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13730");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        staff3.logout();
        java.lang.String str5 = staff3.getID();
        java.lang.String str6 = staff3.getEmail();
        staff3.viewProfile();
        staff3.setVerified(false);
        java.lang.String str10 = staff3.getPassword();
        java.lang.String str11 = staff3.getPassword();
        staff3.viewProfile();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test13731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13731");
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
        java.lang.String str15 = staff3.getAccountType();
        staff3.login("", "hi!");
        java.lang.String str19 = staff3.getEmail();
        staff3.setVerified(true);
        boolean boolean22 = staff3.isVerified();
        staff3.setVerified(false);
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
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "staff" + "'", str15, "staff");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test13732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13732");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        boolean boolean5 = staff3.isVerified();
        java.lang.String str6 = staff3.getID();
        java.lang.String str7 = staff3.getID();
        staff3.login("hi!", "");
        java.lang.String str11 = staff3.getPassword();
        java.lang.String str12 = staff3.getPassword();
        staff3.logout();
        java.lang.String str14 = staff3.getPassword();
        staff3.setVerified(false);
        staff3.setVerified(false);
        double double19 = staff3.getHourlyRate();
        java.lang.String str20 = staff3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 40.0d + "'", double19 == 40.0d);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "staff" + "'", str20, "staff");
    }

    @Test
    public void test13733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13733");
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
        java.lang.String str15 = staff3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "staff" + "'", str13, "staff");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "staff" + "'", str15, "staff");
    }

    @Test
    public void test13734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13734");
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
        java.lang.String str15 = staff3.getAccountType();
        staff3.viewProfile();
        staff3.login("staff", "hi!");
        staff3.viewProfile();
        java.lang.String str21 = staff3.getAccountType();
        staff3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "staff" + "'", str15, "staff");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "staff" + "'", str21, "staff");
    }

    @Test
    public void test13735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13735");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        staff3.logout();
        java.lang.String str5 = staff3.getID();
        java.lang.String str6 = staff3.getPassword();
        staff3.logout();
        staff3.login("staff", "hi!");
        java.lang.String str11 = staff3.getID();
        staff3.login("staff", "");
        java.lang.String str15 = staff3.getAccountType();
        java.lang.String str16 = staff3.getPassword();
        staff3.logout();
        staff3.viewProfile();
        staff3.viewProfile();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "staff" + "'", str15, "staff");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test13736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13736");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        staff3.logout();
        java.lang.String str5 = staff3.getID();
        java.lang.String str6 = staff3.getEmail();
        double double7 = staff3.getHourlyRate();
        java.lang.String str8 = staff3.getEmail();
        java.lang.String str9 = staff3.getID();
        java.lang.String str10 = staff3.getID();
        boolean boolean11 = staff3.isVerified();
        java.lang.String str12 = staff3.getID();
        java.lang.String str13 = staff3.getAccountType();
        staff3.logout();
        java.lang.String str15 = staff3.getAccountType();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 40.0d + "'", double7 == 40.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "staff" + "'", str13, "staff");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "staff" + "'", str15, "staff");
    }

    @Test
    public void test13737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13737");
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
        java.lang.String str13 = staff3.getEmail();
        java.lang.String str14 = staff3.getEmail();
        boolean boolean15 = staff3.isVerified();
        boolean boolean16 = staff3.isVerified();
        java.lang.String str17 = staff3.getID();
        staff3.login("staff", "staff");
        staff3.login("", "hi!");
        double double24 = staff3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "staff" + "'", str6, "staff");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "staff" + "'", str12, "staff");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 40.0d + "'", double24 == 40.0d);
    }

    @Test
    public void test13738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13738");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        boolean boolean5 = staff3.isVerified();
        java.lang.String str6 = staff3.getID();
        java.lang.String str7 = staff3.getID();
        staff3.setVerified(true);
        java.lang.String str10 = staff3.getEmail();
        staff3.setVerified(false);
        staff3.logout();
        java.lang.String str14 = staff3.getEmail();
        java.lang.String str15 = staff3.getPassword();
        staff3.viewProfile();
        java.lang.String str17 = staff3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "staff" + "'", str17, "staff");
    }

    @Test
    public void test13739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13739");
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
        java.lang.String str17 = staff3.getID();
        staff3.setVerified(false);
        staff3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "staff" + "'", str13, "staff");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "staff" + "'", str16, "staff");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test13740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13740");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        boolean boolean5 = staff3.isVerified();
        java.lang.String str6 = staff3.getID();
        java.lang.String str7 = staff3.getID();
        double double8 = staff3.getHourlyRate();
        staff3.logout();
        staff3.logout();
        staff3.setVerified(true);
        staff3.viewProfile();
        java.lang.String str14 = staff3.getPassword();
        java.lang.String str15 = staff3.getEmail();
        java.lang.String str16 = staff3.getPassword();
        java.lang.String str17 = staff3.getAccountType();
        java.lang.String str18 = staff3.getEmail();
        java.lang.String str19 = staff3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 40.0d + "'", double8 == 40.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "staff" + "'", str17, "staff");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test13741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13741");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getID();
        java.lang.String str6 = staff3.getID();
        double double7 = staff3.getHourlyRate();
        staff3.logout();
        double double9 = staff3.getHourlyRate();
        staff3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 40.0d + "'", double7 == 40.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 40.0d + "'", double9 == 40.0d);
    }

    @Test
    public void test13742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13742");
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
        java.lang.String str15 = staff3.getPassword();
        double double16 = staff3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "staff" + "'", str6, "staff");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 40.0d + "'", double8 == 40.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "staff" + "'", str10, "staff");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 40.0d + "'", double16 == 40.0d);
    }

    @Test
    public void test13743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13743");
        model.Staff staff3 = new model.Staff("hi!", "staff", "");
        staff3.logout();
        java.lang.String str5 = staff3.getEmail();
        java.lang.String str6 = staff3.getEmail();
        double double7 = staff3.getHourlyRate();
        staff3.logout();
        staff3.logout();
        java.lang.String str10 = staff3.getAccountType();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 40.0d + "'", double7 == 40.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "staff" + "'", str10, "staff");
    }

    @Test
    public void test13744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13744");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        boolean boolean6 = staff3.isVerified();
        staff3.login("", "");
        double double10 = staff3.getHourlyRate();
        java.lang.String str11 = staff3.getPassword();
        boolean boolean12 = staff3.isVerified();
        java.lang.String str13 = staff3.getID();
        boolean boolean14 = staff3.isVerified();
        staff3.viewProfile();
        staff3.login("", "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 40.0d + "'", double10 == 40.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test13745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13745");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getID();
        java.lang.String str6 = staff3.getID();
        staff3.login("", "");
        java.lang.String str10 = staff3.getID();
        java.lang.String str11 = staff3.getEmail();
        java.lang.String str12 = staff3.getPassword();
        staff3.viewProfile();
        java.lang.String str14 = staff3.getAccountType();
        boolean boolean15 = staff3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "staff" + "'", str14, "staff");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test13746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13746");
        model.Staff staff3 = new model.Staff("hi!", "", "hi!");
        staff3.logout();
        staff3.login("hi!", "hi!");
        staff3.viewProfile();
        staff3.login("", "staff");
        staff3.login("", "staff");
        staff3.viewProfile();
        java.lang.String str16 = staff3.getID();
        staff3.setVerified(true);
        double double19 = staff3.getHourlyRate();
        java.lang.String str20 = staff3.getAccountType();
        staff3.login("staff", "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 40.0d + "'", double19 == 40.0d);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "staff" + "'", str20, "staff");
    }

    @Test
    public void test13747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13747");
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
        staff3.login("hi!", "hi!");
        java.lang.String str20 = staff3.getID();
        java.lang.String str21 = staff3.getID();
        java.lang.String str22 = staff3.getPassword();
        staff3.viewProfile();
        staff3.viewProfile();
        java.lang.String str25 = staff3.getAccountType();
        java.lang.String str26 = staff3.getAccountType();
        staff3.setVerified(false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "staff" + "'", str16, "staff");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "staff" + "'", str25, "staff");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "staff" + "'", str26, "staff");
    }

    @Test
    public void test13748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13748");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        double double6 = staff3.getHourlyRate();
        java.lang.String str7 = staff3.getPassword();
        staff3.logout();
        staff3.logout();
        boolean boolean10 = staff3.isVerified();
        staff3.login("staff", "hi!");
        java.lang.String str14 = staff3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 40.0d + "'", double6 == 40.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test13749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13749");
        model.Staff staff3 = new model.Staff("hi!", "", "hi!");
        java.lang.String str4 = staff3.getPassword();
        double double5 = staff3.getHourlyRate();
        double double6 = staff3.getHourlyRate();
        java.lang.String str7 = staff3.getEmail();
        java.lang.String str8 = staff3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 40.0d + "'", double5 == 40.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 40.0d + "'", double6 == 40.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "staff" + "'", str8, "staff");
    }

    @Test
    public void test13750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13750");
        model.Staff staff3 = new model.Staff("hi!", "", "hi!");
        staff3.setVerified(false);
        java.lang.String str6 = staff3.getEmail();
        java.lang.String str7 = staff3.getAccountType();
        java.lang.String str8 = staff3.getPassword();
        staff3.viewProfile();
        java.lang.String str10 = staff3.getAccountType();
        boolean boolean11 = staff3.isVerified();
        staff3.setVerified(false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "staff" + "'", str7, "staff");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "staff" + "'", str10, "staff");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test13751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13751");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        boolean boolean5 = staff3.isVerified();
        java.lang.String str6 = staff3.getID();
        java.lang.String str7 = staff3.getID();
        double double8 = staff3.getHourlyRate();
        staff3.logout();
        staff3.logout();
        staff3.setVerified(true);
        double double13 = staff3.getHourlyRate();
        double double14 = staff3.getHourlyRate();
        staff3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 40.0d + "'", double8 == 40.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 40.0d + "'", double13 == 40.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 40.0d + "'", double14 == 40.0d);
    }

    @Test
    public void test13752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13752");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        staff3.logout();
        java.lang.String str5 = staff3.getID();
        java.lang.String str6 = staff3.getPassword();
        staff3.logout();
        staff3.login("staff", "hi!");
        java.lang.String str11 = staff3.getID();
        staff3.login("staff", "");
        java.lang.String str15 = staff3.getID();
        double double16 = staff3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 40.0d + "'", double16 == 40.0d);
    }

    @Test
    public void test13753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13753");
        model.Staff staff3 = new model.Staff("", "staff", "staff");
        staff3.setVerified(true);
        java.lang.String str6 = staff3.getPassword();
        boolean boolean7 = staff3.isVerified();
        java.lang.String str8 = staff3.getPassword();
        boolean boolean9 = staff3.isVerified();
        staff3.login("staff", "hi!");
        staff3.logout();
        java.lang.String str14 = staff3.getAccountType();
        java.lang.String str15 = staff3.getAccountType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "staff" + "'", str6, "staff");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "staff" + "'", str8, "staff");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "staff" + "'", str14, "staff");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "staff" + "'", str15, "staff");
    }

    @Test
    public void test13754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13754");
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
        java.lang.String str18 = staff3.getEmail();
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
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test13755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13755");
        model.Staff staff3 = new model.Staff("", "", "staff");
        staff3.login("staff", "");
        boolean boolean7 = staff3.isVerified();
        staff3.logout();
        staff3.logout();
        java.lang.String str10 = staff3.getID();
        java.lang.String str11 = staff3.getID();
        java.lang.String str12 = staff3.getID();
        staff3.viewProfile();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "staff" + "'", str10, "staff");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "staff" + "'", str11, "staff");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "staff" + "'", str12, "staff");
    }

    @Test
    public void test13756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13756");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        boolean boolean5 = staff3.isVerified();
        java.lang.String str6 = staff3.getID();
        java.lang.String str7 = staff3.getID();
        staff3.setVerified(true);
        java.lang.String str10 = staff3.getEmail();
        staff3.setVerified(true);
        java.lang.String str13 = staff3.getID();
        java.lang.String str14 = staff3.getPassword();
        java.lang.String str15 = staff3.getAccountType();
        staff3.setVerified(true);
        staff3.logout();
        java.lang.String str19 = staff3.getEmail();
        java.lang.Class<?> wildcardClass20 = staff3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "staff" + "'", str15, "staff");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test13757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13757");
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
        java.lang.String str18 = staff3.getAccountType();
        staff3.viewProfile();
        staff3.logout();
        staff3.setVerified(true);
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
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "staff" + "'", str18, "staff");
    }

    @Test
    public void test13758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13758");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getID();
        java.lang.String str6 = staff3.getPassword();
        java.lang.String str7 = staff3.getEmail();
        java.lang.String str8 = staff3.getEmail();
        staff3.viewProfile();
        double double10 = staff3.getHourlyRate();
        java.lang.String str11 = staff3.getEmail();
        java.lang.String str12 = staff3.getID();
        boolean boolean13 = staff3.isVerified();
        java.lang.String str14 = staff3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 40.0d + "'", double10 == 40.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test13759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13759");
        model.Staff staff3 = new model.Staff("staff", "", "staff");
        staff3.setVerified(false);
        java.lang.String str6 = staff3.getAccountType();
        java.lang.String str7 = staff3.getEmail();
        staff3.login("", "");
        java.lang.String str11 = staff3.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "staff" + "'", str6, "staff");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "staff" + "'", str7, "staff");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "staff" + "'", str11, "staff");
    }

    @Test
    public void test13760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13760");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        boolean boolean5 = staff3.isVerified();
        java.lang.String str6 = staff3.getID();
        boolean boolean7 = staff3.isVerified();
        staff3.logout();
        staff3.logout();
        staff3.viewProfile();
        staff3.logout();
        java.lang.String str12 = staff3.getAccountType();
        staff3.login("hi!", "staff");
        staff3.viewProfile();
        java.lang.String str17 = staff3.getAccountType();
        staff3.setVerified(false);
        boolean boolean20 = staff3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "staff" + "'", str12, "staff");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "staff" + "'", str17, "staff");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test13761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13761");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        boolean boolean6 = staff3.isVerified();
        staff3.logout();
        staff3.setVerified(false);
        java.lang.String str10 = staff3.getID();
        double double11 = staff3.getHourlyRate();
        staff3.viewProfile();
        staff3.login("staff", "staff");
        boolean boolean16 = staff3.isVerified();
        staff3.setVerified(false);
        boolean boolean19 = staff3.isVerified();
        staff3.setVerified(false);
        java.lang.String str22 = staff3.getAccountType();
        java.lang.String str23 = staff3.getPassword();
        staff3.setVerified(true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 40.0d + "'", double11 == 40.0d);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "staff" + "'", str22, "staff");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test13762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13762");
        model.Staff staff3 = new model.Staff("hi!", "", "hi!");
        staff3.logout();
        staff3.login("hi!", "hi!");
        double double8 = staff3.getHourlyRate();
        java.lang.String str9 = staff3.getID();
        java.lang.String str10 = staff3.getEmail();
        staff3.setVerified(true);
        java.lang.String str13 = staff3.getEmail();
        double double14 = staff3.getHourlyRate();
        java.lang.String str15 = staff3.getEmail();
        staff3.viewProfile();
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 40.0d + "'", double8 == 40.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 40.0d + "'", double14 == 40.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test13763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13763");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        boolean boolean5 = staff3.isVerified();
        java.lang.String str6 = staff3.getAccountType();
        staff3.logout();
        boolean boolean8 = staff3.isVerified();
        staff3.logout();
        double double10 = staff3.getHourlyRate();
        staff3.logout();
        staff3.logout();
        staff3.logout();
        staff3.setVerified(false);
        boolean boolean16 = staff3.isVerified();
        java.lang.String str17 = staff3.getEmail();
        java.lang.String str18 = staff3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "staff" + "'", str6, "staff");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 40.0d + "'", double10 == 40.0d);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "staff" + "'", str18, "staff");
    }

    @Test
    public void test13764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13764");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        boolean boolean5 = staff3.isVerified();
        java.lang.String str6 = staff3.getID();
        staff3.setVerified(false);
        java.lang.String str9 = staff3.getID();
        java.lang.String str10 = staff3.getEmail();
        staff3.logout();
        staff3.logout();
        java.lang.String str13 = staff3.getID();
        java.lang.String str14 = staff3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test13765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13765");
        model.Staff staff3 = new model.Staff("hi!", "", "hi!");
        staff3.logout();
        staff3.login("hi!", "hi!");
        double double8 = staff3.getHourlyRate();
        java.lang.String str9 = staff3.getID();
        java.lang.String str10 = staff3.getEmail();
        staff3.setVerified(true);
        staff3.setVerified(true);
        java.lang.String str15 = staff3.getEmail();
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 40.0d + "'", double8 == 40.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test13766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13766");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        staff3.login("", "");
        double double7 = staff3.getHourlyRate();
        boolean boolean8 = staff3.isVerified();
        java.lang.String str9 = staff3.getEmail();
        java.lang.String str10 = staff3.getEmail();
        staff3.logout();
        java.lang.String str12 = staff3.getID();
        java.lang.String str13 = staff3.getPassword();
        staff3.logout();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 40.0d + "'", double7 == 40.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test13767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13767");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        staff3.setVerified(false);
        staff3.viewProfile();
        java.lang.Class<?> wildcardClass8 = staff3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test13768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13768");
        model.Staff staff3 = new model.Staff("hi!", "", "hi!");
        java.lang.String str4 = staff3.getPassword();
        double double5 = staff3.getHourlyRate();
        java.lang.String str6 = staff3.getPassword();
        staff3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 40.0d + "'", double5 == 40.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test13769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13769");
        model.Staff staff3 = new model.Staff("", "", "staff");
        java.lang.String str4 = staff3.getID();
        staff3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "staff" + "'", str4, "staff");
    }

    @Test
    public void test13770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13770");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        staff3.logout();
        java.lang.String str5 = staff3.getID();
        java.lang.String str6 = staff3.getEmail();
        java.lang.String str7 = staff3.getPassword();
        double double8 = staff3.getHourlyRate();
        staff3.setVerified(true);
        java.lang.String str11 = staff3.getEmail();
        double double12 = staff3.getHourlyRate();
        java.lang.String str13 = staff3.getID();
        java.lang.String str14 = staff3.getPassword();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 40.0d + "'", double8 == 40.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 40.0d + "'", double12 == 40.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test13771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13771");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        double double6 = staff3.getHourlyRate();
        java.lang.String str7 = staff3.getPassword();
        staff3.login("", "staff");
        boolean boolean11 = staff3.isVerified();
        double double12 = staff3.getHourlyRate();
        staff3.setVerified(false);
        staff3.viewProfile();
        java.lang.String str16 = staff3.getPassword();
        staff3.setVerified(false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 40.0d + "'", double6 == 40.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 40.0d + "'", double12 == 40.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test13772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13772");
        model.Staff staff3 = new model.Staff("", "staff", "");
        staff3.setVerified(true);
        staff3.login("", "hi!");
        staff3.viewProfile();
        java.lang.String str10 = staff3.getID();
        staff3.viewProfile();
        java.lang.String str12 = staff3.getEmail();
        boolean boolean13 = staff3.isVerified();
        staff3.viewProfile();
        java.lang.String str15 = staff3.getEmail();
        java.lang.String str16 = staff3.getPassword();
        staff3.viewProfile();
        double double18 = staff3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "staff" + "'", str16, "staff");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 40.0d + "'", double18 == 40.0d);
    }

    @Test
    public void test13773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13773");
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
        java.lang.String str17 = staff3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test13774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13774");
        model.Staff staff3 = new model.Staff("hi!", "", "staff");
        java.lang.String str4 = staff3.getPassword();
        double double5 = staff3.getHourlyRate();
        staff3.logout();
        java.lang.String str7 = staff3.getID();
        java.lang.String str8 = staff3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 40.0d + "'", double5 == 40.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "staff" + "'", str7, "staff");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "staff" + "'", str8, "staff");
    }

    @Test
    public void test13775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13775");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        boolean boolean6 = staff3.isVerified();
        staff3.logout();
        java.lang.String str8 = staff3.getPassword();
        java.lang.String str9 = staff3.getPassword();
        staff3.logout();
        java.lang.String str11 = staff3.getAccountType();
        boolean boolean12 = staff3.isVerified();
        java.lang.String str13 = staff3.getPassword();
        staff3.viewProfile();
        java.lang.String str15 = staff3.getPassword();
        java.lang.String str16 = staff3.getEmail();
        staff3.setVerified(false);
        staff3.viewProfile();
        staff3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "staff" + "'", str11, "staff");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test13776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13776");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        java.lang.String str6 = staff3.getPassword();
        staff3.setVerified(false);
        staff3.setVerified(false);
        java.lang.String str11 = staff3.getID();
        staff3.login("", "hi!");
        double double15 = staff3.getHourlyRate();
        java.lang.String str16 = staff3.getEmail();
        java.lang.String str17 = staff3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 40.0d + "'", double15 == 40.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "staff" + "'", str17, "staff");
    }

    @Test
    public void test13777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13777");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        staff3.login("", "");
        double double7 = staff3.getHourlyRate();
        staff3.login("staff", "staff");
        boolean boolean11 = staff3.isVerified();
        java.lang.String str12 = staff3.getID();
        double double13 = staff3.getHourlyRate();
        staff3.login("", "staff");
        staff3.viewProfile();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 40.0d + "'", double7 == 40.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 40.0d + "'", double13 == 40.0d);
    }

    @Test
    public void test13778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13778");
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
        staff3.logout();
        staff3.setVerified(false);
        staff3.login("hi!", "staff");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "staff" + "'", str6, "staff");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "staff" + "'", str14, "staff");
    }

    @Test
    public void test13779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13779");
        model.Staff staff3 = new model.Staff("hi!", "", "hi!");
        java.lang.String str4 = staff3.getAccountType();
        java.lang.String str5 = staff3.getEmail();
        staff3.viewProfile();
        staff3.logout();
        java.lang.String str8 = staff3.getPassword();
        java.lang.String str9 = staff3.getPassword();
        staff3.setVerified(true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "staff" + "'", str4, "staff");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test13780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13780");
        model.Staff staff3 = new model.Staff("hi!", "hi!", "");
        staff3.logout();
        java.lang.String str5 = staff3.getEmail();
        double double6 = staff3.getHourlyRate();
        staff3.setVerified(false);
        staff3.login("", "");
        java.lang.String str12 = staff3.getEmail();
        java.lang.String str13 = staff3.getID();
        java.lang.String str14 = staff3.getID();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 40.0d + "'", double6 == 40.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test13781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13781");
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
        double double15 = staff3.getHourlyRate();
        java.lang.String str16 = staff3.getAccountType();
        java.lang.String str17 = staff3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 40.0d + "'", double12 == 40.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 40.0d + "'", double15 == 40.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "staff" + "'", str16, "staff");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test13782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13782");
        model.Staff staff3 = new model.Staff("hi!", "hi!", "hi!");
        staff3.login("hi!", "staff");
        staff3.logout();
        java.lang.String str8 = staff3.getPassword();
        staff3.viewProfile();
        boolean boolean10 = staff3.isVerified();
        staff3.login("", "");
        staff3.logout();
        double double15 = staff3.getHourlyRate();
        staff3.logout();
        java.lang.String str17 = staff3.getPassword();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 40.0d + "'", double15 == 40.0d);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test13783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13783");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        boolean boolean5 = staff3.isVerified();
        java.lang.String str6 = staff3.getID();
        staff3.setVerified(false);
        java.lang.String str9 = staff3.getID();
        staff3.setVerified(false);
        staff3.logout();
        java.lang.String str13 = staff3.getAccountType();
        java.lang.String str14 = staff3.getEmail();
        staff3.login("", "staff");
        java.lang.String str18 = staff3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "staff" + "'", str13, "staff");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test13784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13784");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        staff3.logout();
        java.lang.String str5 = staff3.getID();
        java.lang.String str6 = staff3.getEmail();
        double double7 = staff3.getHourlyRate();
        java.lang.String str8 = staff3.getPassword();
        staff3.login("hi!", "hi!");
        staff3.logout();
        staff3.viewProfile();
        java.lang.String str14 = staff3.getAccountType();
        java.lang.String str15 = staff3.getEmail();
        java.lang.String str16 = staff3.getPassword();
        staff3.setVerified(false);
        staff3.viewProfile();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 40.0d + "'", double7 == 40.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "staff" + "'", str14, "staff");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test13785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13785");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        boolean boolean5 = staff3.isVerified();
        java.lang.String str6 = staff3.getID();
        java.lang.String str7 = staff3.getID();
        staff3.setVerified(true);
        java.lang.String str10 = staff3.getEmail();
        java.lang.String str11 = staff3.getEmail();
        boolean boolean12 = staff3.isVerified();
        double double13 = staff3.getHourlyRate();
        java.lang.String str14 = staff3.getEmail();
        java.lang.String str15 = staff3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 40.0d + "'", double13 == 40.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test13786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13786");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        boolean boolean6 = staff3.isVerified();
        staff3.logout();
        java.lang.String str8 = staff3.getPassword();
        java.lang.String str9 = staff3.getID();
        double double10 = staff3.getHourlyRate();
        staff3.login("staff", "hi!");
        java.lang.Class<?> wildcardClass14 = staff3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 40.0d + "'", double10 == 40.0d);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test13787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13787");
        model.Staff staff3 = new model.Staff("hi!", "staff", "");
        staff3.logout();
        java.lang.String str5 = staff3.getEmail();
        java.lang.String str6 = staff3.getEmail();
        double double7 = staff3.getHourlyRate();
        staff3.setVerified(false);
        staff3.viewProfile();
        staff3.login("", "");
        staff3.viewProfile();
        staff3.login("hi!", "staff");
        java.lang.String str18 = staff3.getID();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 40.0d + "'", double7 == 40.0d);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test13788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13788");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        boolean boolean5 = staff3.isVerified();
        java.lang.String str6 = staff3.getID();
        java.lang.String str7 = staff3.getID();
        staff3.login("hi!", "");
        java.lang.String str11 = staff3.getPassword();
        boolean boolean12 = staff3.isVerified();
        java.lang.String str13 = staff3.getEmail();
        boolean boolean14 = staff3.isVerified();
        double double15 = staff3.getHourlyRate();
        double double16 = staff3.getHourlyRate();
        staff3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 40.0d + "'", double15 == 40.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 40.0d + "'", double16 == 40.0d);
    }

    @Test
    public void test13789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13789");
        model.Staff staff3 = new model.Staff("", "staff", "");
        staff3.setVerified(true);
        staff3.login("", "hi!");
        staff3.viewProfile();
        staff3.login("hi!", "");
        staff3.setVerified(false);
    }

    @Test
    public void test13790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13790");
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
        java.lang.String str20 = staff3.getPassword();
        java.lang.String str21 = staff3.getAccountType();
        staff3.login("", "hi!");
        staff3.viewProfile();
        java.lang.String str26 = staff3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 40.0d + "'", double11 == 40.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "staff" + "'", str21, "staff");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "staff" + "'", str26, "staff");
    }

    @Test
    public void test13791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13791");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        boolean boolean6 = staff3.isVerified();
        staff3.logout();
        java.lang.String str8 = staff3.getPassword();
        staff3.setVerified(false);
        staff3.logout();
        java.lang.String str12 = staff3.getID();
        staff3.login("staff", "staff");
        staff3.viewProfile();
        double double17 = staff3.getHourlyRate();
        staff3.login("", "hi!");
        double double21 = staff3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 40.0d + "'", double17 == 40.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 40.0d + "'", double21 == 40.0d);
    }

    @Test
    public void test13792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13792");
        model.Staff staff3 = new model.Staff("hi!", "", "hi!");
        java.lang.String str4 = staff3.getAccountType();
        java.lang.String str5 = staff3.getID();
        staff3.setVerified(true);
        boolean boolean8 = staff3.isVerified();
        staff3.setVerified(false);
        staff3.login("", "");
        boolean boolean14 = staff3.isVerified();
        java.lang.String str15 = staff3.getPassword();
        java.lang.String str16 = staff3.getAccountType();
        java.lang.Class<?> wildcardClass17 = staff3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "staff" + "'", str4, "staff");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "staff" + "'", str16, "staff");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test13793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13793");
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
        boolean boolean15 = staff3.isVerified();
        boolean boolean16 = staff3.isVerified();
        double double17 = staff3.getHourlyRate();
        double double18 = staff3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "staff" + "'", str6, "staff");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 40.0d + "'", double17 == 40.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 40.0d + "'", double18 == 40.0d);
    }

    @Test
    public void test13794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13794");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        boolean boolean6 = staff3.isVerified();
        staff3.login("", "");
        staff3.login("staff", "staff");
        java.lang.String str13 = staff3.getPassword();
        java.lang.String str14 = staff3.getID();
        staff3.login("", "hi!");
        java.lang.String str18 = staff3.getID();
        staff3.logout();
        java.lang.String str20 = staff3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test13795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13795");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        staff3.logout();
        staff3.logout();
        java.lang.String str6 = staff3.getAccountType();
        java.lang.String str7 = staff3.getEmail();
        staff3.setVerified(true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "staff" + "'", str6, "staff");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test13796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13796");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        boolean boolean5 = staff3.isVerified();
        java.lang.String str6 = staff3.getAccountType();
        staff3.logout();
        double double8 = staff3.getHourlyRate();
        java.lang.String str9 = staff3.getEmail();
        java.lang.String str10 = staff3.getAccountType();
        boolean boolean11 = staff3.isVerified();
        staff3.setVerified(true);
        staff3.setVerified(true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "staff" + "'", str6, "staff");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 40.0d + "'", double8 == 40.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "staff" + "'", str10, "staff");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test13797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13797");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        boolean boolean5 = staff3.isVerified();
        java.lang.String str6 = staff3.getID();
        java.lang.String str7 = staff3.getID();
        staff3.setVerified(true);
        java.lang.String str10 = staff3.getEmail();
        staff3.setVerified(true);
        staff3.setVerified(true);
        java.lang.String str15 = staff3.getPassword();
        java.lang.String str16 = staff3.getEmail();
        staff3.login("", "staff");
        staff3.viewProfile();
        java.lang.String str21 = staff3.getEmail();
        staff3.login("hi!", "");
        staff3.viewProfile();
        java.lang.String str26 = staff3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
    }

    @Test
    public void test13798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13798");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        boolean boolean5 = staff3.isVerified();
        java.lang.String str6 = staff3.getID();
        staff3.setVerified(false);
        boolean boolean9 = staff3.isVerified();
        double double10 = staff3.getHourlyRate();
        java.lang.String str11 = staff3.getPassword();
        java.lang.String str12 = staff3.getID();
        java.lang.String str13 = staff3.getEmail();
        boolean boolean14 = staff3.isVerified();
        staff3.login("hi!", "");
        java.lang.String str18 = staff3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 40.0d + "'", double10 == 40.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test13799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13799");
        model.Staff staff3 = new model.Staff("hi!", "", "hi!");
        java.lang.String str4 = staff3.getAccountType();
        java.lang.String str5 = staff3.getEmail();
        staff3.viewProfile();
        staff3.setVerified(true);
        java.lang.String str9 = staff3.getPassword();
        staff3.setVerified(false);
        java.lang.String str12 = staff3.getAccountType();
        java.lang.String str13 = staff3.getPassword();
        staff3.viewProfile();
        java.lang.String str15 = staff3.getID();
        java.lang.String str16 = staff3.getID();
        java.lang.String str17 = staff3.getEmail();
        java.lang.String str18 = staff3.getPassword();
        java.lang.String str19 = staff3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "staff" + "'", str4, "staff");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "staff" + "'", str12, "staff");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test13800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13800");
        model.Staff staff3 = new model.Staff("hi!", "", "hi!");
        staff3.setVerified(false);
        staff3.viewProfile();
        java.lang.String str7 = staff3.getEmail();
        java.lang.String str8 = staff3.getAccountType();
        staff3.logout();
        staff3.login("", "");
        staff3.logout();
        java.lang.String str14 = staff3.getPassword();
        java.lang.String str15 = staff3.getAccountType();
        staff3.viewProfile();
        double double17 = staff3.getHourlyRate();
        staff3.viewProfile();
        boolean boolean19 = staff3.isVerified();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "staff" + "'", str8, "staff");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "staff" + "'", str15, "staff");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 40.0d + "'", double17 == 40.0d);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test13801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13801");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        double double6 = staff3.getHourlyRate();
        staff3.logout();
        staff3.viewProfile();
        java.lang.String str9 = staff3.getEmail();
        boolean boolean10 = staff3.isVerified();
        java.lang.String str11 = staff3.getPassword();
        staff3.setVerified(false);
        staff3.viewProfile();
        boolean boolean15 = staff3.isVerified();
        java.lang.String str16 = staff3.getPassword();
        staff3.viewProfile();
        java.lang.String str18 = staff3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 40.0d + "'", double6 == 40.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test13802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13802");
        model.Staff staff3 = new model.Staff("hi!", "", "hi!");
        java.lang.String str4 = staff3.getAccountType();
        java.lang.String str5 = staff3.getEmail();
        staff3.viewProfile();
        staff3.setVerified(true);
        java.lang.String str9 = staff3.getPassword();
        staff3.setVerified(false);
        staff3.setVerified(true);
        staff3.viewProfile();
        staff3.logout();
        staff3.setVerified(true);
        java.lang.String str18 = staff3.getPassword();
        java.lang.String str19 = staff3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "staff" + "'", str4, "staff");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "staff" + "'", str19, "staff");
    }

    @Test
    public void test13803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13803");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        boolean boolean6 = staff3.isVerified();
        staff3.login("", "");
        staff3.login("staff", "staff");
        java.lang.String str13 = staff3.getPassword();
        java.lang.String str14 = staff3.getPassword();
        staff3.login("hi!", "staff");
        boolean boolean18 = staff3.isVerified();
        boolean boolean19 = staff3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test13804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13804");
        model.Staff staff3 = new model.Staff("hi!", "hi!", "");
        staff3.logout();
        java.lang.String str5 = staff3.getEmail();
        java.lang.String str6 = staff3.getAccountType();
        java.lang.String str7 = staff3.getPassword();
        staff3.viewProfile();
        staff3.logout();
        staff3.logout();
        staff3.setVerified(true);
        staff3.login("staff", "staff");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "staff" + "'", str6, "staff");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test13805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13805");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        double double6 = staff3.getHourlyRate();
        java.lang.String str7 = staff3.getPassword();
        java.lang.String str8 = staff3.getPassword();
        java.lang.String str9 = staff3.getAccountType();
        staff3.login("hi!", "staff");
        staff3.viewProfile();
        java.lang.String str14 = staff3.getAccountType();
        staff3.login("", "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 40.0d + "'", double6 == 40.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "staff" + "'", str9, "staff");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "staff" + "'", str14, "staff");
    }

    @Test
    public void test13806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13806");
        model.Staff staff3 = new model.Staff("", "staff", "staff");
        staff3.setVerified(true);
        java.lang.String str6 = staff3.getPassword();
        boolean boolean7 = staff3.isVerified();
        java.lang.String str8 = staff3.getPassword();
        staff3.login("", "staff");
        java.lang.String str12 = staff3.getAccountType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "staff" + "'", str6, "staff");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "staff" + "'", str8, "staff");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "staff" + "'", str12, "staff");
    }

    @Test
    public void test13807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13807");
        model.Staff staff3 = new model.Staff("hi!", "", "hi!");
        staff3.setVerified(false);
        staff3.viewProfile();
        java.lang.String str7 = staff3.getEmail();
        staff3.login("hi!", "hi!");
        java.lang.String str11 = staff3.getEmail();
        staff3.login("staff", "hi!");
        staff3.setVerified(true);
        boolean boolean17 = staff3.isVerified();
        staff3.logout();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test13808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13808");
        model.Staff staff3 = new model.Staff("", "staff", "staff");
        double double4 = staff3.getHourlyRate();
        java.lang.String str5 = staff3.getAccountType();
        java.lang.String str6 = staff3.getAccountType();
        staff3.login("staff", "");
        staff3.login("staff", "");
        staff3.logout();
        java.lang.String str14 = staff3.getEmail();
        java.lang.String str15 = staff3.getAccountType();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 40.0d + "'", double4 == 40.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "staff" + "'", str6, "staff");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "staff" + "'", str15, "staff");
    }

    @Test
    public void test13809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13809");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        boolean boolean6 = staff3.isVerified();
        staff3.logout();
        java.lang.String str8 = staff3.getEmail();
        staff3.viewProfile();
        java.lang.String str10 = staff3.getAccountType();
        staff3.login("staff", "hi!");
        double double14 = staff3.getHourlyRate();
        java.lang.Class<?> wildcardClass15 = staff3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "staff" + "'", str10, "staff");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 40.0d + "'", double14 == 40.0d);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test13810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13810");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        staff3.logout();
        java.lang.String str5 = staff3.getID();
        java.lang.String str6 = staff3.getPassword();
        java.lang.String str7 = staff3.getPassword();
        java.lang.String str8 = staff3.getPassword();
        java.lang.String str9 = staff3.getEmail();
        boolean boolean10 = staff3.isVerified();
        boolean boolean11 = staff3.isVerified();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test13811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13811");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        boolean boolean5 = staff3.isVerified();
        java.lang.String str6 = staff3.getID();
        staff3.login("staff", "");
        boolean boolean10 = staff3.isVerified();
        double double11 = staff3.getHourlyRate();
        staff3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 40.0d + "'", double11 == 40.0d);
    }

    @Test
    public void test13812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13812");
        model.Staff staff3 = new model.Staff("", "staff", "");
        staff3.setVerified(true);
        staff3.login("", "hi!");
        staff3.setVerified(true);
        staff3.setVerified(false);
        staff3.setVerified(true);
        java.lang.String str15 = staff3.getPassword();
        java.lang.Class<?> wildcardClass16 = staff3.getClass();
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "staff" + "'", str15, "staff");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test13813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13813");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        staff3.login("", "");
        staff3.viewProfile();
        double double8 = staff3.getHourlyRate();
        staff3.setVerified(false);
        java.lang.String str11 = staff3.getAccountType();
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 40.0d + "'", double8 == 40.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "staff" + "'", str11, "staff");
    }

    @Test
    public void test13814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13814");
        model.Staff staff3 = new model.Staff("hi!", "staff", "");
        staff3.logout();
        staff3.logout();
        staff3.logout();
        double double7 = staff3.getHourlyRate();
        staff3.setVerified(false);
        java.lang.String str10 = staff3.getPassword();
        java.lang.String str11 = staff3.getEmail();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 40.0d + "'", double7 == 40.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "staff" + "'", str10, "staff");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test13815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13815");
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
        staff3.login("hi!", "");
        staff3.setVerified(false);
        staff3.logout();
        java.lang.String str24 = staff3.getPassword();
        java.lang.String str25 = staff3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 40.0d + "'", double16 == 40.0d);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
    }

    @Test
    public void test13816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13816");
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
        java.lang.String str20 = staff3.getID();
        staff3.viewProfile();
        staff3.setVerified(true);
        boolean boolean24 = staff3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test13817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13817");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        boolean boolean5 = staff3.isVerified();
        java.lang.String str6 = staff3.getID();
        staff3.setVerified(false);
        java.lang.String str9 = staff3.getID();
        staff3.setVerified(false);
        java.lang.String str12 = staff3.getID();
        staff3.login("", "");
        staff3.login("staff", "");
        java.lang.String str19 = staff3.getPassword();
        java.lang.String str20 = staff3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test13818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13818");
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
        java.lang.String str13 = staff3.getEmail();
        boolean boolean14 = staff3.isVerified();
        java.lang.Class<?> wildcardClass15 = staff3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "staff" + "'", str6, "staff");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "staff" + "'", str12, "staff");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test13819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13819");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        java.lang.String str6 = staff3.getPassword();
        staff3.setVerified(false);
        staff3.setVerified(true);
        staff3.viewProfile();
        java.lang.String str12 = staff3.getID();
        java.lang.String str13 = staff3.getAccountType();
        staff3.login("", "hi!");
        boolean boolean17 = staff3.isVerified();
        java.lang.String str18 = staff3.getID();
        java.lang.String str19 = staff3.getID();
        staff3.setVerified(false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "staff" + "'", str13, "staff");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test13820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13820");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        double double6 = staff3.getHourlyRate();
        staff3.logout();
        staff3.setVerified(false);
        staff3.logout();
        boolean boolean11 = staff3.isVerified();
        staff3.login("", "staff");
        java.lang.String str15 = staff3.getID();
        java.lang.String str16 = staff3.getAccountType();
        double double17 = staff3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 40.0d + "'", double6 == 40.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "staff" + "'", str16, "staff");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 40.0d + "'", double17 == 40.0d);
    }

    @Test
    public void test13821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13821");
        model.Staff staff3 = new model.Staff("staff", "staff", "hi!");
        staff3.setVerified(false);
        java.lang.String str6 = staff3.getID();
        staff3.setVerified(true);
        double double9 = staff3.getHourlyRate();
        java.lang.String str10 = staff3.getPassword();
        java.lang.String str11 = staff3.getAccountType();
        boolean boolean12 = staff3.isVerified();
        java.lang.String str13 = staff3.getPassword();
        staff3.login("hi!", "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 40.0d + "'", double9 == 40.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "staff" + "'", str10, "staff");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "staff" + "'", str11, "staff");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "staff" + "'", str13, "staff");
    }

    @Test
    public void test13822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13822");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        boolean boolean6 = staff3.isVerified();
        staff3.logout();
        staff3.setVerified(false);
        java.lang.String str10 = staff3.getID();
        staff3.viewProfile();
        staff3.login("", "");
        double double15 = staff3.getHourlyRate();
        staff3.login("staff", "");
        double double19 = staff3.getHourlyRate();
        staff3.logout();
        staff3.setVerified(false);
        double double23 = staff3.getHourlyRate();
        java.lang.String str24 = staff3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 40.0d + "'", double15 == 40.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 40.0d + "'", double19 == 40.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 40.0d + "'", double23 == 40.0d);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "staff" + "'", str24, "staff");
    }

    @Test
    public void test13823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13823");
        model.Staff staff3 = new model.Staff("hi!", "", "hi!");
        staff3.setVerified(false);
        java.lang.String str6 = staff3.getPassword();
        java.lang.String str7 = staff3.getAccountType();
        staff3.viewProfile();
        double double9 = staff3.getHourlyRate();
        boolean boolean10 = staff3.isVerified();
        staff3.login("hi!", "");
        java.lang.String str14 = staff3.getEmail();
        java.lang.String str15 = staff3.getPassword();
        staff3.logout();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "staff" + "'", str7, "staff");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 40.0d + "'", double9 == 40.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test13824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13824");
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
        java.lang.String str17 = staff3.getID();
        java.lang.String str18 = staff3.getAccountType();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "staff" + "'", str8, "staff");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "staff" + "'", str14, "staff");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 40.0d + "'", double16 == 40.0d);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "staff" + "'", str18, "staff");
    }

    @Test
    public void test13825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13825");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        boolean boolean6 = staff3.isVerified();
        staff3.viewProfile();
        java.lang.String str8 = staff3.getAccountType();
        staff3.setVerified(false);
        double double11 = staff3.getHourlyRate();
        staff3.login("", "hi!");
        double double15 = staff3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "staff" + "'", str8, "staff");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 40.0d + "'", double11 == 40.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 40.0d + "'", double15 == 40.0d);
    }

    @Test
    public void test13826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13826");
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
        double double17 = staff3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "staff" + "'", str6, "staff");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 40.0d + "'", double8 == 40.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "staff" + "'", str10, "staff");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "staff" + "'", str16, "staff");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 40.0d + "'", double17 == 40.0d);
    }

    @Test
    public void test13827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13827");
        model.Staff staff3 = new model.Staff("hi!", "", "hi!");
        staff3.setVerified(false);
        java.lang.String str6 = staff3.getEmail();
        staff3.setVerified(false);
        staff3.login("staff", "hi!");
        java.lang.String str12 = staff3.getAccountType();
        double double13 = staff3.getHourlyRate();
        staff3.logout();
        java.lang.Class<?> wildcardClass15 = staff3.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "staff" + "'", str12, "staff");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 40.0d + "'", double13 == 40.0d);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test13828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13828");
        model.Staff staff3 = new model.Staff("hi!", "", "hi!");
        staff3.logout();
        staff3.login("hi!", "hi!");
        staff3.viewProfile();
        java.lang.String str9 = staff3.getPassword();
        java.lang.String str10 = staff3.getID();
        java.lang.String str11 = staff3.getAccountType();
        java.lang.String str12 = staff3.getEmail();
        java.lang.String str13 = staff3.getPassword();
        staff3.setVerified(false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "staff" + "'", str11, "staff");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test13829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13829");
        model.Staff staff3 = new model.Staff("hi!", "hi!", "");
        staff3.logout();
        java.lang.String str5 = staff3.getEmail();
        boolean boolean6 = staff3.isVerified();
        java.lang.String str7 = staff3.getEmail();
        java.lang.String str8 = staff3.getID();
        staff3.viewProfile();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test13830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13830");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getEmail();
        boolean boolean6 = staff3.isVerified();
        staff3.logout();
        staff3.login("hi!", "staff");
        double double11 = staff3.getHourlyRate();
        java.lang.String str12 = staff3.getAccountType();
        double double13 = staff3.getHourlyRate();
        staff3.logout();
        java.lang.String str15 = staff3.getID();
        java.lang.String str16 = staff3.getEmail();
        java.lang.String str17 = staff3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 40.0d + "'", double11 == 40.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "staff" + "'", str12, "staff");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 40.0d + "'", double13 == 40.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "staff" + "'", str17, "staff");
    }

    @Test
    public void test13831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13831");
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
        staff3.login("staff", "hi!");
        staff3.viewProfile();
        java.lang.String str20 = staff3.getAccountType();
        boolean boolean21 = staff3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "staff" + "'", str20, "staff");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test13832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13832");
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
        double double15 = staff3.getHourlyRate();
        java.lang.String str16 = staff3.getAccountType();
        staff3.viewProfile();
        java.lang.String str18 = staff3.getID();
        java.lang.String str19 = staff3.getAccountType();
        staff3.setVerified(false);
        staff3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 40.0d + "'", double15 == 40.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "staff" + "'", str16, "staff");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "staff" + "'", str19, "staff");
    }

    @Test
    public void test13833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13833");
        model.Staff staff3 = new model.Staff("hi!", "hi!", "");
        staff3.logout();
        java.lang.String str5 = staff3.getEmail();
        boolean boolean6 = staff3.isVerified();
        java.lang.String str7 = staff3.getEmail();
        staff3.logout();
        staff3.logout();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test13834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13834");
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
        java.lang.String str15 = staff3.getAccountType();
        staff3.login("", "hi!");
        staff3.login("hi!", "hi!");
        java.lang.String str22 = staff3.getAccountType();
        staff3.viewProfile();
        boolean boolean24 = staff3.isVerified();
        java.lang.String str25 = staff3.getPassword();
        boolean boolean26 = staff3.isVerified();
        java.lang.String str27 = staff3.getAccountType();
        staff3.viewProfile();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 40.0d + "'", double7 == 40.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "staff" + "'", str15, "staff");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "staff" + "'", str22, "staff");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "staff" + "'", str27, "staff");
    }

    @Test
    public void test13835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13835");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        double double6 = staff3.getHourlyRate();
        staff3.logout();
        staff3.viewProfile();
        java.lang.String str9 = staff3.getEmail();
        java.lang.String str10 = staff3.getEmail();
        staff3.logout();
        java.lang.String str12 = staff3.getAccountType();
        java.lang.Class<?> wildcardClass13 = staff3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 40.0d + "'", double6 == 40.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "staff" + "'", str12, "staff");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test13836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13836");
        model.Staff staff3 = new model.Staff("", "staff", "");
        staff3.setVerified(true);
        staff3.login("", "hi!");
        staff3.viewProfile();
        java.lang.String str10 = staff3.getID();
        staff3.viewProfile();
        double double12 = staff3.getHourlyRate();
        boolean boolean13 = staff3.isVerified();
        boolean boolean14 = staff3.isVerified();
        java.lang.String str15 = staff3.getID();
        java.lang.String str16 = staff3.getID();
        java.lang.String str17 = staff3.getEmail();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 40.0d + "'", double12 == 40.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test13837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13837");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        staff3.logout();
        java.lang.String str5 = staff3.getID();
        java.lang.String str6 = staff3.getPassword();
        java.lang.String str7 = staff3.getAccountType();
        staff3.setVerified(false);
        boolean boolean10 = staff3.isVerified();
        staff3.logout();
        java.lang.String str12 = staff3.getAccountType();
        staff3.login("", "staff");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "staff" + "'", str7, "staff");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "staff" + "'", str12, "staff");
    }

    @Test
    public void test13838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13838");
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
        staff3.viewProfile();
        java.lang.String str19 = staff3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "staff" + "'", str10, "staff");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 40.0d + "'", double15 == 40.0d);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test13839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13839");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        java.lang.String str6 = staff3.getPassword();
        java.lang.String str7 = staff3.getPassword();
        java.lang.String str8 = staff3.getID();
        java.lang.String str9 = staff3.getID();
        double double10 = staff3.getHourlyRate();
        java.lang.String str11 = staff3.getPassword();
        staff3.logout();
        staff3.logout();
        staff3.login("", "");
        staff3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 40.0d + "'", double10 == 40.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test13840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13840");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getID();
        java.lang.String str6 = staff3.getPassword();
        java.lang.String str7 = staff3.getEmail();
        java.lang.String str8 = staff3.getEmail();
        staff3.viewProfile();
        java.lang.String str10 = staff3.getEmail();
        boolean boolean11 = staff3.isVerified();
        staff3.viewProfile();
        staff3.login("", "staff");
        staff3.setVerified(false);
        staff3.login("hi!", "staff");
        staff3.setVerified(false);
        java.lang.String str23 = staff3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "staff" + "'", str23, "staff");
    }

    @Test
    public void test13841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13841");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        boolean boolean6 = staff3.isVerified();
        staff3.logout();
        java.lang.String str8 = staff3.getPassword();
        staff3.setVerified(false);
        java.lang.String str11 = staff3.getEmail();
        java.lang.String str12 = staff3.getPassword();
        java.lang.String str13 = staff3.getID();
        staff3.login("", "");
        java.lang.String str17 = staff3.getAccountType();
        java.lang.String str18 = staff3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "staff" + "'", str17, "staff");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "staff" + "'", str18, "staff");
    }

    @Test
    public void test13842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13842");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        boolean boolean6 = staff3.isVerified();
        staff3.viewProfile();
        java.lang.String str8 = staff3.getAccountType();
        java.lang.String str9 = staff3.getID();
        java.lang.String str10 = staff3.getID();
        staff3.login("hi!", "");
        java.lang.String str14 = staff3.getPassword();
        java.lang.Class<?> wildcardClass15 = staff3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "staff" + "'", str8, "staff");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test13843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13843");
        model.Staff staff3 = new model.Staff("", "staff", "staff");
        staff3.viewProfile();
        staff3.viewProfile();
        java.lang.String str6 = staff3.getAccountType();
        java.lang.String str7 = staff3.getEmail();
        staff3.logout();
        java.lang.String str9 = staff3.getID();
        java.lang.String str10 = staff3.getID();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "staff" + "'", str6, "staff");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "staff" + "'", str9, "staff");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "staff" + "'", str10, "staff");
    }

    @Test
    public void test13844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13844");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        staff3.login("", "");
        staff3.viewProfile();
        staff3.viewProfile();
        staff3.login("", "");
        staff3.viewProfile();
        java.lang.String str13 = staff3.getID();
        java.lang.String str14 = staff3.getEmail();
        java.lang.String str15 = staff3.getID();
        java.lang.Class<?> wildcardClass16 = staff3.getClass();
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test13845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13845");
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
        java.lang.String str20 = staff3.getAccountType();
        staff3.setVerified(true);
        staff3.logout();
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
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "staff" + "'", str20, "staff");
    }

    @Test
    public void test13846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13846");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        boolean boolean5 = staff3.isVerified();
        java.lang.String str6 = staff3.getID();
        java.lang.String str7 = staff3.getID();
        double double8 = staff3.getHourlyRate();
        staff3.viewProfile();
        java.lang.String str10 = staff3.getEmail();
        java.lang.String str11 = staff3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 40.0d + "'", double8 == 40.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test13847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13847");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        staff3.login("", "");
        java.lang.String str7 = staff3.getPassword();
        java.lang.String str8 = staff3.getEmail();
        staff3.logout();
        boolean boolean10 = staff3.isVerified();
        staff3.logout();
        staff3.logout();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test13848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13848");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        boolean boolean5 = staff3.isVerified();
        java.lang.String str6 = staff3.getID();
        java.lang.String str7 = staff3.getID();
        staff3.setVerified(true);
        staff3.setVerified(false);
        java.lang.String str12 = staff3.getEmail();
        java.lang.String str13 = staff3.getPassword();
        staff3.logout();
        java.lang.String str15 = staff3.getPassword();
        java.lang.String str16 = staff3.getID();
        java.lang.String str17 = staff3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test13849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13849");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getID();
        java.lang.String str6 = staff3.getPassword();
        java.lang.String str7 = staff3.getEmail();
        boolean boolean8 = staff3.isVerified();
        java.lang.String str9 = staff3.getID();
        boolean boolean10 = staff3.isVerified();
        java.lang.String str11 = staff3.getEmail();
        boolean boolean12 = staff3.isVerified();
        staff3.login("", "staff");
        java.lang.Class<?> wildcardClass16 = staff3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test13850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13850");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        double double6 = staff3.getHourlyRate();
        java.lang.String str7 = staff3.getPassword();
        java.lang.String str8 = staff3.getPassword();
        staff3.viewProfile();
        boolean boolean10 = staff3.isVerified();
        java.lang.String str11 = staff3.getEmail();
        boolean boolean12 = staff3.isVerified();
        java.lang.String str13 = staff3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 40.0d + "'", double6 == 40.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "staff" + "'", str13, "staff");
    }

    @Test
    public void test13851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13851");
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
        java.lang.String str13 = staff3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "staff" + "'", str13, "staff");
    }

    @Test
    public void test13852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13852");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        staff3.logout();
        java.lang.String str5 = staff3.getID();
        java.lang.String str6 = staff3.getPassword();
        staff3.logout();
        staff3.login("staff", "hi!");
        java.lang.String str11 = staff3.getID();
        staff3.login("staff", "");
        java.lang.String str15 = staff3.getAccountType();
        staff3.viewProfile();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "staff" + "'", str15, "staff");
    }

    @Test
    public void test13853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13853");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        boolean boolean6 = staff3.isVerified();
        staff3.logout();
        staff3.setVerified(false);
        java.lang.String str10 = staff3.getID();
        double double11 = staff3.getHourlyRate();
        java.lang.String str12 = staff3.getID();
        java.lang.String str13 = staff3.getID();
        java.lang.String str14 = staff3.getEmail();
        java.lang.Class<?> wildcardClass15 = staff3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 40.0d + "'", double11 == 40.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test13854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13854");
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
        java.lang.String str19 = staff3.getID();
        staff3.login("", "staff");
        staff3.login("staff", "");
        java.lang.String str26 = staff3.getPassword();
        staff3.setVerified(true);
        staff3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "staff" + "'", str13, "staff");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
    }

    @Test
    public void test13855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13855");
        model.Staff staff3 = new model.Staff("hi!", "", "hi!");
        staff3.setVerified(false);
        staff3.viewProfile();
        java.lang.String str7 = staff3.getEmail();
        java.lang.String str8 = staff3.getID();
        staff3.viewProfile();
        java.lang.String str10 = staff3.getEmail();
        java.lang.String str11 = staff3.getPassword();
        java.lang.String str12 = staff3.getAccountType();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "staff" + "'", str12, "staff");
    }

    @Test
    public void test13856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13856");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        boolean boolean6 = staff3.isVerified();
        staff3.logout();
        java.lang.String str8 = staff3.getPassword();
        staff3.setVerified(false);
        java.lang.String str11 = staff3.getID();
        boolean boolean12 = staff3.isVerified();
        java.lang.String str13 = staff3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test13857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13857");
        model.Staff staff3 = new model.Staff("hi!", "", "hi!");
        java.lang.String str4 = staff3.getAccountType();
        java.lang.String str5 = staff3.getID();
        staff3.setVerified(true);
        staff3.login("staff", "staff");
        java.lang.String str11 = staff3.getPassword();
        staff3.logout();
        double double13 = staff3.getHourlyRate();
        staff3.login("hi!", "");
        staff3.viewProfile();
        java.lang.String str18 = staff3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "staff" + "'", str4, "staff");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 40.0d + "'", double13 == 40.0d);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test13858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13858");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        boolean boolean6 = staff3.isVerified();
        staff3.logout();
        java.lang.String str8 = staff3.getAccountType();
        staff3.setVerified(false);
        staff3.viewProfile();
        java.lang.String str12 = staff3.getAccountType();
        java.lang.String str13 = staff3.getID();
        java.lang.String str14 = staff3.getPassword();
        staff3.login("hi!", "");
        java.lang.String str18 = staff3.getAccountType();
        staff3.setVerified(false);
        java.lang.String str21 = staff3.getPassword();
        java.lang.String str22 = staff3.getEmail();
        java.lang.String str23 = staff3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "staff" + "'", str8, "staff");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "staff" + "'", str12, "staff");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "staff" + "'", str18, "staff");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
    }

    @Test
    public void test13859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13859");
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
        java.lang.String str18 = staff3.getID();
        double double19 = staff3.getHourlyRate();
        java.lang.String str20 = staff3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "staff" + "'", str11, "staff");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 40.0d + "'", double19 == 40.0d);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "staff" + "'", str20, "staff");
    }

    @Test
    public void test13860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13860");
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
        staff3.setVerified(false);
        staff3.setVerified(false);
        java.lang.String str22 = staff3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test13861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13861");
        model.Staff staff3 = new model.Staff("hi!", "", "hi!");
        java.lang.String str4 = staff3.getAccountType();
        java.lang.String str5 = staff3.getEmail();
        staff3.viewProfile();
        staff3.setVerified(true);
        java.lang.String str9 = staff3.getAccountType();
        staff3.setVerified(false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "staff" + "'", str4, "staff");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "staff" + "'", str9, "staff");
    }

    @Test
    public void test13862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13862");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        boolean boolean6 = staff3.isVerified();
        staff3.logout();
        java.lang.String str8 = staff3.getPassword();
        staff3.setVerified(false);
        java.lang.String str11 = staff3.getEmail();
        java.lang.String str12 = staff3.getPassword();
        java.lang.String str13 = staff3.getEmail();
        boolean boolean14 = staff3.isVerified();
        staff3.login("", "staff");
        java.lang.String str18 = staff3.getAccountType();
        java.lang.String str19 = staff3.getID();
        staff3.login("", "staff");
        staff3.setVerified(false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "staff" + "'", str18, "staff");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test13863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13863");
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
        staff3.viewProfile();
        java.lang.String str16 = staff3.getAccountType();
        staff3.login("", "");
        java.lang.String str20 = staff3.getAccountType();
        staff3.logout();
        staff3.login("staff", "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 40.0d + "'", double8 == 40.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "staff" + "'", str10, "staff");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "staff" + "'", str16, "staff");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "staff" + "'", str20, "staff");
    }

    @Test
    public void test13864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13864");
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
        staff3.viewProfile();
        java.lang.String str24 = staff3.getPassword();
        double double25 = staff3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 40.0d + "'", double25 == 40.0d);
    }

    @Test
    public void test13865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13865");
        model.Staff staff3 = new model.Staff("hi!", "", "hi!");
        staff3.logout();
        staff3.login("hi!", "hi!");
        staff3.viewProfile();
        java.lang.String str9 = staff3.getPassword();
        java.lang.String str10 = staff3.getID();
        staff3.logout();
        staff3.login("", "staff");
        staff3.setVerified(false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test13866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13866");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        staff3.logout();
        java.lang.String str5 = staff3.getID();
        java.lang.String str6 = staff3.getEmail();
        double double7 = staff3.getHourlyRate();
        java.lang.String str8 = staff3.getPassword();
        staff3.login("hi!", "hi!");
        staff3.setVerified(false);
        java.lang.String str14 = staff3.getAccountType();
        staff3.login("hi!", "hi!");
        double double18 = staff3.getHourlyRate();
        java.lang.String str19 = staff3.getID();
        java.lang.String str20 = staff3.getAccountType();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 40.0d + "'", double7 == 40.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "staff" + "'", str14, "staff");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 40.0d + "'", double18 == 40.0d);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "staff" + "'", str20, "staff");
    }

    @Test
    public void test13867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13867");
        model.Staff staff3 = new model.Staff("", "", "staff");
        java.lang.String str4 = staff3.getID();
        double double5 = staff3.getHourlyRate();
        double double6 = staff3.getHourlyRate();
        java.lang.String str7 = staff3.getAccountType();
        staff3.logout();
        java.lang.String str9 = staff3.getAccountType();
        double double10 = staff3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "staff" + "'", str4, "staff");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 40.0d + "'", double5 == 40.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 40.0d + "'", double6 == 40.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "staff" + "'", str7, "staff");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "staff" + "'", str9, "staff");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 40.0d + "'", double10 == 40.0d);
    }

    @Test
    public void test13868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13868");
        model.Staff staff3 = new model.Staff("", "staff", "hi!");
        java.lang.String str4 = staff3.getPassword();
        java.lang.String str5 = staff3.getPassword();
        java.lang.String str6 = staff3.getAccountType();
        java.lang.String str7 = staff3.getPassword();
        java.lang.String str8 = staff3.getPassword();
        java.lang.String str9 = staff3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "staff" + "'", str4, "staff");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "staff" + "'", str6, "staff");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "staff" + "'", str7, "staff");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "staff" + "'", str8, "staff");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test13869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13869");
        model.Staff staff3 = new model.Staff("hi!", "", "hi!");
        staff3.setVerified(false);
        java.lang.String str6 = staff3.getEmail();
        staff3.setVerified(false);
        java.lang.String str9 = staff3.getEmail();
        java.lang.Class<?> wildcardClass10 = staff3.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test13870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13870");
        model.Staff staff3 = new model.Staff("hi!", "hi!", "");
        staff3.setVerified(true);
        double double6 = staff3.getHourlyRate();
        java.lang.String str7 = staff3.getEmail();
        staff3.viewProfile();
        java.lang.String str9 = staff3.getAccountType();
        java.lang.String str10 = staff3.getEmail();
        java.lang.String str11 = staff3.getPassword();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 40.0d + "'", double6 == 40.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "staff" + "'", str9, "staff");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test13871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13871");
        model.Staff staff3 = new model.Staff("", "staff", "");
        staff3.setVerified(true);
        staff3.login("", "hi!");
        staff3.viewProfile();
        java.lang.String str10 = staff3.getID();
        staff3.viewProfile();
        double double12 = staff3.getHourlyRate();
        staff3.viewProfile();
        java.lang.String str14 = staff3.getID();
        java.lang.String str15 = staff3.getPassword();
        java.lang.String str16 = staff3.getEmail();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 40.0d + "'", double12 == 40.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "staff" + "'", str15, "staff");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test13872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13872");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        boolean boolean5 = staff3.isVerified();
        java.lang.String str6 = staff3.getID();
        java.lang.String str7 = staff3.getID();
        double double8 = staff3.getHourlyRate();
        staff3.logout();
        staff3.login("hi!", "hi!");
        java.lang.String str13 = staff3.getID();
        java.lang.String str14 = staff3.getAccountType();
        java.lang.String str15 = staff3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 40.0d + "'", double8 == 40.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "staff" + "'", str14, "staff");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test13873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13873");
        model.Staff staff3 = new model.Staff("staff", "hi!", "");
        java.lang.String str4 = staff3.getID();
        boolean boolean5 = staff3.isVerified();
        staff3.setVerified(false);
        staff3.setVerified(true);
        staff3.login("", "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test13874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13874");
        model.Staff staff3 = new model.Staff("hi!", "hi!", "");
        staff3.setVerified(false);
        staff3.setVerified(false);
        staff3.logout();
        java.lang.String str9 = staff3.getID();
        staff3.setVerified(false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test13875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13875");
        model.Staff staff3 = new model.Staff("hi!", "", "hi!");
        staff3.logout();
        staff3.login("hi!", "hi!");
        double double8 = staff3.getHourlyRate();
        boolean boolean9 = staff3.isVerified();
        java.lang.String str10 = staff3.getAccountType();
        java.lang.String str11 = staff3.getAccountType();
        double double12 = staff3.getHourlyRate();
        java.lang.String str13 = staff3.getID();
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 40.0d + "'", double8 == 40.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "staff" + "'", str10, "staff");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "staff" + "'", str11, "staff");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 40.0d + "'", double12 == 40.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test13876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13876");
        model.Staff staff3 = new model.Staff("hi!", "", "hi!");
        java.lang.String str4 = staff3.getAccountType();
        java.lang.String str5 = staff3.getID();
        staff3.setVerified(true);
        boolean boolean8 = staff3.isVerified();
        staff3.setVerified(false);
        java.lang.String str11 = staff3.getAccountType();
        double double12 = staff3.getHourlyRate();
        java.lang.String str13 = staff3.getEmail();
        java.lang.String str14 = staff3.getPassword();
        java.lang.Class<?> wildcardClass15 = staff3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "staff" + "'", str4, "staff");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "staff" + "'", str11, "staff");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 40.0d + "'", double12 == 40.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test13877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13877");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        boolean boolean5 = staff3.isVerified();
        java.lang.String str6 = staff3.getID();
        staff3.login("", "staff");
        staff3.login("hi!", "hi!");
        java.lang.String str13 = staff3.getAccountType();
        java.lang.String str14 = staff3.getEmail();
        java.lang.String str15 = staff3.getPassword();
        java.lang.String str16 = staff3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "staff" + "'", str13, "staff");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test13878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13878");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        boolean boolean6 = staff3.isVerified();
        staff3.logout();
        staff3.setVerified(false);
        staff3.viewProfile();
        staff3.login("hi!", "");
        java.lang.String str14 = staff3.getID();
        java.lang.String str15 = staff3.getID();
        java.lang.String str16 = staff3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test13879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13879");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        double double6 = staff3.getHourlyRate();
        staff3.logout();
        staff3.setVerified(false);
        staff3.logout();
        java.lang.String str11 = staff3.getAccountType();
        java.lang.String str12 = staff3.getAccountType();
        java.lang.String str13 = staff3.getPassword();
        double double14 = staff3.getHourlyRate();
        double double15 = staff3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 40.0d + "'", double6 == 40.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "staff" + "'", str11, "staff");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "staff" + "'", str12, "staff");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 40.0d + "'", double14 == 40.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 40.0d + "'", double15 == 40.0d);
    }

    @Test
    public void test13880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13880");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        boolean boolean6 = staff3.isVerified();
        staff3.login("", "");
        double double10 = staff3.getHourlyRate();
        staff3.login("", "staff");
        boolean boolean14 = staff3.isVerified();
        staff3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 40.0d + "'", double10 == 40.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test13881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13881");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        double double6 = staff3.getHourlyRate();
        java.lang.String str7 = staff3.getPassword();
        staff3.login("", "staff");
        boolean boolean11 = staff3.isVerified();
        double double12 = staff3.getHourlyRate();
        boolean boolean13 = staff3.isVerified();
        java.lang.String str14 = staff3.getEmail();
        java.lang.String str15 = staff3.getAccountType();
        java.lang.String str16 = staff3.getPassword();
        staff3.setVerified(false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 40.0d + "'", double6 == 40.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 40.0d + "'", double12 == 40.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "staff" + "'", str15, "staff");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test13882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13882");
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
        double double18 = staff3.getHourlyRate();
        staff3.setVerified(true);
        java.lang.String str21 = staff3.getAccountType();
        double double22 = staff3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 40.0d + "'", double11 == 40.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 40.0d + "'", double18 == 40.0d);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "staff" + "'", str21, "staff");
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 40.0d + "'", double22 == 40.0d);
    }

    @Test
    public void test13883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13883");
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
        boolean boolean19 = staff3.isVerified();
        java.lang.String str20 = staff3.getPassword();
        staff3.setVerified(true);
        double double23 = staff3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "staff" + "'", str10, "staff");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 40.0d + "'", double23 == 40.0d);
    }

    @Test
    public void test13884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13884");
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
        java.lang.String str16 = staff3.getID();
        java.lang.String str17 = staff3.getID();
        boolean boolean18 = staff3.isVerified();
        staff3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "staff" + "'", str13, "staff");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test13885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13885");
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
        staff3.logout();
        staff3.viewProfile();
        java.lang.String str18 = staff3.getAccountType();
        staff3.login("staff", "");
        java.lang.String str22 = staff3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "staff" + "'", str18, "staff");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
    }

    @Test
    public void test13886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13886");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        boolean boolean5 = staff3.isVerified();
        java.lang.String str6 = staff3.getAccountType();
        staff3.logout();
        java.lang.String str8 = staff3.getID();
        staff3.setVerified(true);
        java.lang.String str11 = staff3.getEmail();
        double double12 = staff3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "staff" + "'", str6, "staff");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 40.0d + "'", double12 == 40.0d);
    }

    @Test
    public void test13887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13887");
        model.Staff staff3 = new model.Staff("hi!", "", "hi!");
        staff3.logout();
        staff3.login("hi!", "hi!");
        double double8 = staff3.getHourlyRate();
        java.lang.String str9 = staff3.getID();
        java.lang.String str10 = staff3.getAccountType();
        staff3.viewProfile();
        double double12 = staff3.getHourlyRate();
        staff3.login("staff", "staff");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 40.0d + "'", double8 == 40.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "staff" + "'", str10, "staff");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 40.0d + "'", double12 == 40.0d);
    }

    @Test
    public void test13888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13888");
        model.Staff staff3 = new model.Staff("hi!", "", "hi!");
        staff3.setVerified(false);
        java.lang.String str6 = staff3.getPassword();
        java.lang.String str7 = staff3.getAccountType();
        staff3.viewProfile();
        boolean boolean9 = staff3.isVerified();
        staff3.login("", "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "staff" + "'", str7, "staff");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test13889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13889");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        staff3.logout();
        java.lang.String str5 = staff3.getID();
        java.lang.String str6 = staff3.getEmail();
        java.lang.String str7 = staff3.getPassword();
        staff3.logout();
        staff3.login("hi!", "hi!");
        double double12 = staff3.getHourlyRate();
        java.lang.Class<?> wildcardClass13 = staff3.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 40.0d + "'", double12 == 40.0d);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test13890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13890");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        staff3.logout();
        java.lang.String str5 = staff3.getID();
        java.lang.String str6 = staff3.getEmail();
        double double7 = staff3.getHourlyRate();
        java.lang.String str8 = staff3.getPassword();
        staff3.login("hi!", "hi!");
        boolean boolean12 = staff3.isVerified();
        java.lang.String str13 = staff3.getEmail();
        staff3.setVerified(false);
        staff3.viewProfile();
        staff3.login("", "hi!");
        java.lang.String str20 = staff3.getPassword();
        java.lang.String str21 = staff3.getPassword();
        java.lang.String str22 = staff3.getEmail();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 40.0d + "'", double7 == 40.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test13891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13891");
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
        java.lang.String str19 = staff3.getAccountType();
        staff3.setVerified(true);
        double double22 = staff3.getHourlyRate();
        double double23 = staff3.getHourlyRate();
        java.lang.String str24 = staff3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "staff" + "'", str11, "staff");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "staff" + "'", str18, "staff");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "staff" + "'", str19, "staff");
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 40.0d + "'", double22 == 40.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 40.0d + "'", double23 == 40.0d);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "staff" + "'", str24, "staff");
    }

    @Test
    public void test13892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13892");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        boolean boolean6 = staff3.isVerified();
        staff3.logout();
        staff3.setVerified(false);
        java.lang.String str10 = staff3.getID();
        staff3.viewProfile();
        staff3.login("", "");
        staff3.setVerified(true);
        staff3.viewProfile();
        java.lang.String str18 = staff3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test13893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13893");
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
        staff3.viewProfile();
        staff3.viewProfile();
        staff3.setVerified(true);
        java.lang.String str19 = staff3.getPassword();
        java.lang.String str20 = staff3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test13894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13894");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        java.lang.String str6 = staff3.getPassword();
        staff3.setVerified(false);
        staff3.setVerified(true);
        staff3.viewProfile();
        java.lang.String str12 = staff3.getID();
        java.lang.String str13 = staff3.getAccountType();
        staff3.login("", "hi!");
        boolean boolean17 = staff3.isVerified();
        java.lang.String str18 = staff3.getID();
        staff3.login("staff", "staff");
        java.lang.String str22 = staff3.getID();
        java.lang.Class<?> wildcardClass23 = staff3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "staff" + "'", str13, "staff");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test13895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13895");
        model.Staff staff3 = new model.Staff("hi!", "", "hi!");
        java.lang.String str4 = staff3.getPassword();
        double double5 = staff3.getHourlyRate();
        double double6 = staff3.getHourlyRate();
        staff3.logout();
        java.lang.String str8 = staff3.getAccountType();
        double double9 = staff3.getHourlyRate();
        staff3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 40.0d + "'", double5 == 40.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 40.0d + "'", double6 == 40.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "staff" + "'", str8, "staff");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 40.0d + "'", double9 == 40.0d);
    }

    @Test
    public void test13896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13896");
        model.Staff staff3 = new model.Staff("hi!", "staff", "");
        java.lang.String str4 = staff3.getEmail();
        staff3.logout();
        java.lang.String str6 = staff3.getID();
        boolean boolean7 = staff3.isVerified();
        java.lang.String str8 = staff3.getID();
        java.lang.String str9 = staff3.getID();
        double double10 = staff3.getHourlyRate();
        java.lang.String str11 = staff3.getPassword();
        double double12 = staff3.getHourlyRate();
        staff3.login("staff", "staff");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 40.0d + "'", double10 == 40.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "staff" + "'", str11, "staff");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 40.0d + "'", double12 == 40.0d);
    }

    @Test
    public void test13897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13897");
        model.Staff staff3 = new model.Staff("staff", "hi!", "");
        java.lang.String str4 = staff3.getEmail();
        java.lang.Class<?> wildcardClass5 = staff3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "staff" + "'", str4, "staff");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test13898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13898");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        double double6 = staff3.getHourlyRate();
        staff3.logout();
        staff3.viewProfile();
        java.lang.String str9 = staff3.getEmail();
        boolean boolean10 = staff3.isVerified();
        staff3.viewProfile();
        staff3.login("", "hi!");
        staff3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 40.0d + "'", double6 == 40.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test13899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13899");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        boolean boolean5 = staff3.isVerified();
        java.lang.String str6 = staff3.getID();
        staff3.setVerified(false);
        java.lang.String str9 = staff3.getID();
        staff3.setVerified(false);
        staff3.logout();
        staff3.setVerified(false);
        java.lang.String str15 = staff3.getEmail();
        staff3.viewProfile();
        staff3.setVerified(false);
        java.lang.Class<?> wildcardClass19 = staff3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test13900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13900");
        model.Staff staff3 = new model.Staff("hi!", "", "hi!");
        staff3.setVerified(false);
        java.lang.String str6 = staff3.getEmail();
        java.lang.String str7 = staff3.getAccountType();
        java.lang.String str8 = staff3.getEmail();
        staff3.viewProfile();
        double double10 = staff3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "staff" + "'", str7, "staff");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 40.0d + "'", double10 == 40.0d);
    }

    @Test
    public void test13901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13901");
        model.Staff staff3 = new model.Staff("hi!", "staff", "staff");
        staff3.setVerified(true);
        java.lang.String str6 = staff3.getPassword();
        java.lang.String str7 = staff3.getID();
        double double8 = staff3.getHourlyRate();
        java.lang.String str9 = staff3.getID();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "staff" + "'", str6, "staff");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "staff" + "'", str7, "staff");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 40.0d + "'", double8 == 40.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "staff" + "'", str9, "staff");
    }

    @Test
    public void test13902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13902");
        model.Staff staff3 = new model.Staff("", "staff", "staff");
        double double4 = staff3.getHourlyRate();
        java.lang.String str5 = staff3.getAccountType();
        double double6 = staff3.getHourlyRate();
        boolean boolean7 = staff3.isVerified();
        java.lang.String str8 = staff3.getPassword();
        java.lang.String str9 = staff3.getEmail();
        boolean boolean10 = staff3.isVerified();
        double double11 = staff3.getHourlyRate();
        staff3.login("", "");
        staff3.setVerified(true);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 40.0d + "'", double4 == 40.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 40.0d + "'", double6 == 40.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "staff" + "'", str8, "staff");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 40.0d + "'", double11 == 40.0d);
    }

    @Test
    public void test13903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13903");
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
        staff3.logout();
        staff3.login("hi!", "staff");
        double double28 = staff3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "staff" + "'", str20, "staff");
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 40.0d + "'", double28 == 40.0d);
    }

    @Test
    public void test13904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13904");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        java.lang.String str6 = staff3.getPassword();
        java.lang.String str7 = staff3.getPassword();
        java.lang.String str8 = staff3.getID();
        java.lang.String str9 = staff3.getPassword();
        staff3.viewProfile();
        staff3.login("", "staff");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test13905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13905");
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
        staff3.login("hi!", "");
        staff3.setVerified(false);
        java.lang.Class<?> wildcardClass23 = staff3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 40.0d + "'", double16 == 40.0d);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test13906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13906");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        double double6 = staff3.getHourlyRate();
        java.lang.String str7 = staff3.getPassword();
        java.lang.String str8 = staff3.getPassword();
        java.lang.String str9 = staff3.getAccountType();
        staff3.login("hi!", "staff");
        staff3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 40.0d + "'", double6 == 40.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "staff" + "'", str9, "staff");
    }

    @Test
    public void test13907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13907");
        model.Staff staff3 = new model.Staff("hi!", "", "hi!");
        java.lang.String str4 = staff3.getAccountType();
        java.lang.String str5 = staff3.getID();
        staff3.setVerified(true);
        boolean boolean8 = staff3.isVerified();
        staff3.setVerified(false);
        java.lang.String str11 = staff3.getAccountType();
        double double12 = staff3.getHourlyRate();
        java.lang.String str13 = staff3.getEmail();
        java.lang.String str14 = staff3.getID();
        staff3.viewProfile();
        staff3.setVerified(false);
        boolean boolean18 = staff3.isVerified();
        java.lang.String str19 = staff3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "staff" + "'", str4, "staff");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "staff" + "'", str11, "staff");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 40.0d + "'", double12 == 40.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "staff" + "'", str19, "staff");
    }

    @Test
    public void test13908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13908");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        boolean boolean5 = staff3.isVerified();
        java.lang.String str6 = staff3.getAccountType();
        staff3.logout();
        boolean boolean8 = staff3.isVerified();
        staff3.logout();
        double double10 = staff3.getHourlyRate();
        staff3.logout();
        staff3.logout();
        staff3.logout();
        staff3.setVerified(false);
        boolean boolean16 = staff3.isVerified();
        java.lang.String str17 = staff3.getEmail();
        java.lang.Class<?> wildcardClass18 = staff3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "staff" + "'", str6, "staff");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 40.0d + "'", double10 == 40.0d);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test13909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13909");
        model.Staff staff3 = new model.Staff("hi!", "", "hi!");
        java.lang.String str4 = staff3.getAccountType();
        java.lang.String str5 = staff3.getID();
        staff3.login("", "staff");
        double double9 = staff3.getHourlyRate();
        staff3.login("hi!", "");
        staff3.logout();
        staff3.login("staff", "hi!");
        double double17 = staff3.getHourlyRate();
        double double18 = staff3.getHourlyRate();
        double double19 = staff3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "staff" + "'", str4, "staff");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 40.0d + "'", double9 == 40.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 40.0d + "'", double17 == 40.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 40.0d + "'", double18 == 40.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 40.0d + "'", double19 == 40.0d);
    }

    @Test
    public void test13910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13910");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        boolean boolean5 = staff3.isVerified();
        java.lang.String str6 = staff3.getID();
        java.lang.String str7 = staff3.getID();
        double double8 = staff3.getHourlyRate();
        java.lang.String str9 = staff3.getID();
        java.lang.String str10 = staff3.getID();
        java.lang.String str11 = staff3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 40.0d + "'", double8 == 40.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test13911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13911");
        model.Staff staff3 = new model.Staff("hi!", "", "hi!");
        staff3.logout();
        staff3.login("hi!", "hi!");
        double double8 = staff3.getHourlyRate();
        java.lang.String str9 = staff3.getID();
        java.lang.String str10 = staff3.getAccountType();
        staff3.viewProfile();
        java.lang.String str12 = staff3.getID();
        staff3.setVerified(false);
        staff3.setVerified(true);
        staff3.login("hi!", "hi!");
        staff3.login("staff", "");
        staff3.setVerified(true);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 40.0d + "'", double8 == 40.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "staff" + "'", str10, "staff");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test13912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13912");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        boolean boolean5 = staff3.isVerified();
        java.lang.String str6 = staff3.getID();
        java.lang.String str7 = staff3.getID();
        java.lang.String str8 = staff3.getID();
        java.lang.String str9 = staff3.getID();
        staff3.setVerified(true);
        staff3.setVerified(false);
        double double14 = staff3.getHourlyRate();
        staff3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 40.0d + "'", double14 == 40.0d);
    }

    @Test
    public void test13913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13913");
        model.Staff staff3 = new model.Staff("hi!", "", "hi!");
        java.lang.String str4 = staff3.getAccountType();
        java.lang.String str5 = staff3.getEmail();
        staff3.viewProfile();
        staff3.setVerified(true);
        staff3.viewProfile();
        java.lang.String str10 = staff3.getID();
        boolean boolean11 = staff3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "staff" + "'", str4, "staff");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test13914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13914");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getEmail();
        boolean boolean6 = staff3.isVerified();
        java.lang.String str7 = staff3.getAccountType();
        staff3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "staff" + "'", str7, "staff");
    }

    @Test
    public void test13915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13915");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        double double6 = staff3.getHourlyRate();
        staff3.logout();
        staff3.setVerified(true);
        staff3.viewProfile();
        double double11 = staff3.getHourlyRate();
        java.lang.String str12 = staff3.getAccountType();
        java.lang.String str13 = staff3.getID();
        java.lang.String str14 = staff3.getEmail();
        java.lang.Class<?> wildcardClass15 = staff3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 40.0d + "'", double6 == 40.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 40.0d + "'", double11 == 40.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "staff" + "'", str12, "staff");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test13916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13916");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        boolean boolean6 = staff3.isVerified();
        staff3.logout();
        java.lang.String str8 = staff3.getPassword();
        staff3.logout();
        java.lang.String str10 = staff3.getID();
        staff3.logout();
        java.lang.String str12 = staff3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test13917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13917");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        boolean boolean5 = staff3.isVerified();
        java.lang.String str6 = staff3.getID();
        java.lang.String str7 = staff3.getID();
        double double8 = staff3.getHourlyRate();
        staff3.logout();
        staff3.logout();
        staff3.setVerified(true);
        double double13 = staff3.getHourlyRate();
        staff3.viewProfile();
        java.lang.String str15 = staff3.getAccountType();
        double double16 = staff3.getHourlyRate();
        java.lang.String str17 = staff3.getID();
        java.lang.String str18 = staff3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 40.0d + "'", double8 == 40.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 40.0d + "'", double13 == 40.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "staff" + "'", str15, "staff");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 40.0d + "'", double16 == 40.0d);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test13918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13918");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        boolean boolean6 = staff3.isVerified();
        staff3.setVerified(false);
        double double9 = staff3.getHourlyRate();
        boolean boolean10 = staff3.isVerified();
        staff3.login("", "");
        java.lang.String str14 = staff3.getPassword();
        java.lang.String str15 = staff3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 40.0d + "'", double9 == 40.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "staff" + "'", str15, "staff");
    }

    @Test
    public void test13919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13919");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        staff3.logout();
        java.lang.String str5 = staff3.getID();
        java.lang.String str6 = staff3.getEmail();
        double double7 = staff3.getHourlyRate();
        boolean boolean8 = staff3.isVerified();
        java.lang.String str9 = staff3.getID();
        staff3.setVerified(true);
        double double12 = staff3.getHourlyRate();
        staff3.logout();
        java.lang.String str14 = staff3.getID();
        staff3.setVerified(false);
        java.lang.Class<?> wildcardClass17 = staff3.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 40.0d + "'", double7 == 40.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 40.0d + "'", double12 == 40.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test13920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13920");
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
        java.lang.String str16 = staff3.getID();
        java.lang.String str17 = staff3.getPassword();
        double double18 = staff3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "staff" + "'", str6, "staff");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 40.0d + "'", double8 == 40.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "staff" + "'", str10, "staff");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 40.0d + "'", double15 == 40.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 40.0d + "'", double18 == 40.0d);
    }

    @Test
    public void test13921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13921");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        boolean boolean5 = staff3.isVerified();
        java.lang.String str6 = staff3.getID();
        staff3.setVerified(false);
        java.lang.String str9 = staff3.getID();
        java.lang.String str10 = staff3.getAccountType();
        double double11 = staff3.getHourlyRate();
        staff3.login("staff", "staff");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "staff" + "'", str10, "staff");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 40.0d + "'", double11 == 40.0d);
    }

    @Test
    public void test13922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13922");
        model.Staff staff3 = new model.Staff("hi!", "", "hi!");
        staff3.logout();
        staff3.login("hi!", "hi!");
        double double8 = staff3.getHourlyRate();
        java.lang.String str9 = staff3.getID();
        java.lang.String str10 = staff3.getAccountType();
        staff3.viewProfile();
        boolean boolean12 = staff3.isVerified();
        boolean boolean13 = staff3.isVerified();
        double double14 = staff3.getHourlyRate();
        staff3.setVerified(false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 40.0d + "'", double8 == 40.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "staff" + "'", str10, "staff");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 40.0d + "'", double14 == 40.0d);
    }

    @Test
    public void test13923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13923");
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
        staff3.setVerified(false);
        java.lang.String str16 = staff3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "staff" + "'", str10, "staff");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test13924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13924");
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
        java.lang.String str16 = staff3.getID();
        double double17 = staff3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 40.0d + "'", double17 == 40.0d);
    }

    @Test
    public void test13925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13925");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        staff3.logout();
        java.lang.String str5 = staff3.getID();
        java.lang.String str6 = staff3.getEmail();
        java.lang.String str7 = staff3.getPassword();
        java.lang.String str8 = staff3.getID();
        staff3.logout();
        staff3.logout();
        staff3.viewProfile();
        java.lang.String str12 = staff3.getAccountType();
        staff3.viewProfile();
        staff3.viewProfile();
        staff3.viewProfile();
        staff3.viewProfile();
        staff3.login("hi!", "hi!");
        staff3.logout();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "staff" + "'", str12, "staff");
    }

    @Test
    public void test13926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13926");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        boolean boolean5 = staff3.isVerified();
        java.lang.String str6 = staff3.getAccountType();
        staff3.logout();
        java.lang.String str8 = staff3.getEmail();
        staff3.viewProfile();
        double double10 = staff3.getHourlyRate();
        boolean boolean11 = staff3.isVerified();
        double double12 = staff3.getHourlyRate();
        staff3.login("staff", "");
        java.lang.String str16 = staff3.getEmail();
        staff3.setVerified(false);
        staff3.viewProfile();
        java.lang.String str20 = staff3.getAccountType();
        java.lang.String str21 = staff3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "staff" + "'", str6, "staff");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 40.0d + "'", double10 == 40.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 40.0d + "'", double12 == 40.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "staff" + "'", str20, "staff");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "staff" + "'", str21, "staff");
    }

    @Test
    public void test13927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13927");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        boolean boolean5 = staff3.isVerified();
        java.lang.String str6 = staff3.getID();
        java.lang.String str7 = staff3.getID();
        staff3.setVerified(true);
        staff3.setVerified(false);
        java.lang.String str12 = staff3.getEmail();
        boolean boolean13 = staff3.isVerified();
        staff3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test13928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13928");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        double double6 = staff3.getHourlyRate();
        staff3.setVerified(true);
        staff3.login("hi!", "");
        staff3.login("hi!", "");
        double double15 = staff3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 40.0d + "'", double6 == 40.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 40.0d + "'", double15 == 40.0d);
    }

    @Test
    public void test13929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13929");
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
        java.lang.String str15 = staff3.getAccountType();
        boolean boolean16 = staff3.isVerified();
        java.lang.String str17 = staff3.getAccountType();
        double double18 = staff3.getHourlyRate();
        boolean boolean19 = staff3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "staff" + "'", str6, "staff");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "staff" + "'", str14, "staff");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "staff" + "'", str15, "staff");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "staff" + "'", str17, "staff");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 40.0d + "'", double18 == 40.0d);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test13930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13930");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        boolean boolean6 = staff3.isVerified();
        staff3.logout();
        java.lang.String str8 = staff3.getPassword();
        staff3.logout();
        java.lang.String str10 = staff3.getID();
        double double11 = staff3.getHourlyRate();
        staff3.setVerified(false);
        double double14 = staff3.getHourlyRate();
        staff3.viewProfile();
        boolean boolean16 = staff3.isVerified();
        boolean boolean17 = staff3.isVerified();
        staff3.login("", "staff");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 40.0d + "'", double11 == 40.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 40.0d + "'", double14 == 40.0d);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test13931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13931");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        java.lang.String str6 = staff3.getPassword();
        staff3.setVerified(false);
        java.lang.String str9 = staff3.getAccountType();
        staff3.setVerified(false);
        java.lang.String str12 = staff3.getPassword();
        java.lang.Class<?> wildcardClass13 = staff3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "staff" + "'", str9, "staff");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test13932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13932");
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
        java.lang.String str19 = staff3.getAccountType();
        staff3.logout();
        java.lang.String str21 = staff3.getID();
        staff3.viewProfile();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 40.0d + "'", double13 == 40.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 40.0d + "'", double14 == 40.0d);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "staff" + "'", str19, "staff");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
    }

    @Test
    public void test13933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13933");
        model.Staff staff3 = new model.Staff("hi!", "", "hi!");
        staff3.logout();
        staff3.login("hi!", "hi!");
        double double8 = staff3.getHourlyRate();
        java.lang.String str9 = staff3.getID();
        staff3.logout();
        java.lang.String str11 = staff3.getID();
        staff3.logout();
        boolean boolean13 = staff3.isVerified();
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 40.0d + "'", double8 == 40.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test13934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13934");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        boolean boolean5 = staff3.isVerified();
        java.lang.String str6 = staff3.getID();
        java.lang.String str7 = staff3.getID();
        staff3.setVerified(true);
        java.lang.String str10 = staff3.getAccountType();
        java.lang.String str11 = staff3.getPassword();
        staff3.setVerified(true);
        staff3.viewProfile();
        java.lang.String str15 = staff3.getEmail();
        java.lang.String str16 = staff3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "staff" + "'", str10, "staff");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test13935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13935");
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
        boolean boolean18 = staff3.isVerified();
        java.lang.String str19 = staff3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "staff" + "'", str14, "staff");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "staff" + "'", str19, "staff");
    }

    @Test
    public void test13936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13936");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        java.lang.String str6 = staff3.getPassword();
        java.lang.String str7 = staff3.getPassword();
        staff3.login("hi!", "hi!");
        boolean boolean11 = staff3.isVerified();
        staff3.login("hi!", "hi!");
        java.lang.String str15 = staff3.getAccountType();
        boolean boolean16 = staff3.isVerified();
        java.lang.String str17 = staff3.getEmail();
        staff3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "staff" + "'", str15, "staff");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test13937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13937");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getEmail();
        boolean boolean6 = staff3.isVerified();
        staff3.logout();
        staff3.login("hi!", "staff");
        java.lang.String str11 = staff3.getAccountType();
        java.lang.String str12 = staff3.getAccountType();
        staff3.logout();
        java.lang.String str14 = staff3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "staff" + "'", str11, "staff");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "staff" + "'", str12, "staff");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "staff" + "'", str14, "staff");
    }

    @Test
    public void test13938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13938");
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
        double double15 = staff3.getHourlyRate();
        java.lang.String str16 = staff3.getPassword();
        java.lang.String str17 = staff3.getEmail();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 40.0d + "'", double15 == 40.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test13939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13939");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        staff3.logout();
        java.lang.String str5 = staff3.getID();
        java.lang.String str6 = staff3.getEmail();
        double double7 = staff3.getHourlyRate();
        boolean boolean8 = staff3.isVerified();
        java.lang.String str9 = staff3.getID();
        java.lang.String str10 = staff3.getAccountType();
        double double11 = staff3.getHourlyRate();
        staff3.setVerified(true);
        java.lang.String str14 = staff3.getAccountType();
        staff3.login("hi!", "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 40.0d + "'", double7 == 40.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "staff" + "'", str10, "staff");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 40.0d + "'", double11 == 40.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "staff" + "'", str14, "staff");
    }

    @Test
    public void test13940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13940");
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
        staff3.login("staff", "");
        java.lang.Class<?> wildcardClass24 = staff3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "staff" + "'", str11, "staff");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 40.0d + "'", double16 == 40.0d);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test13941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13941");
        model.Staff staff3 = new model.Staff("", "staff", "staff");
        double double4 = staff3.getHourlyRate();
        java.lang.String str5 = staff3.getAccountType();
        java.lang.String str6 = staff3.getAccountType();
        java.lang.String str7 = staff3.getAccountType();
        double double8 = staff3.getHourlyRate();
        staff3.viewProfile();
        java.lang.String str10 = staff3.getAccountType();
        staff3.viewProfile();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 40.0d + "'", double4 == 40.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "staff" + "'", str6, "staff");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "staff" + "'", str7, "staff");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 40.0d + "'", double8 == 40.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "staff" + "'", str10, "staff");
    }

    @Test
    public void test13942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13942");
        model.Staff staff3 = new model.Staff("hi!", "", "hi!");
        staff3.setVerified(false);
        java.lang.String str6 = staff3.getPassword();
        java.lang.String str7 = staff3.getAccountType();
        staff3.viewProfile();
        double double9 = staff3.getHourlyRate();
        double double10 = staff3.getHourlyRate();
        staff3.viewProfile();
        java.lang.String str12 = staff3.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "staff" + "'", str7, "staff");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 40.0d + "'", double9 == 40.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 40.0d + "'", double10 == 40.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test13943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13943");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        java.lang.String str6 = staff3.getPassword();
        staff3.setVerified(false);
        java.lang.String str9 = staff3.getAccountType();
        double double10 = staff3.getHourlyRate();
        double double11 = staff3.getHourlyRate();
        java.lang.String str12 = staff3.getPassword();
        java.lang.String str13 = staff3.getPassword();
        staff3.login("hi!", "");
        boolean boolean17 = staff3.isVerified();
        java.lang.Class<?> wildcardClass18 = staff3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "staff" + "'", str9, "staff");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 40.0d + "'", double10 == 40.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 40.0d + "'", double11 == 40.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test13944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13944");
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
        staff3.viewProfile();
        java.lang.Class<?> wildcardClass16 = staff3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "staff" + "'", str6, "staff");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "staff" + "'", str7, "staff");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test13945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13945");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        boolean boolean6 = staff3.isVerified();
        staff3.logout();
        staff3.setVerified(false);
        staff3.viewProfile();
        java.lang.String str11 = staff3.getEmail();
        staff3.login("staff", "hi!");
        staff3.login("", "staff");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test13946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13946");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        boolean boolean6 = staff3.isVerified();
        staff3.login("", "");
        staff3.login("staff", "staff");
        java.lang.String str13 = staff3.getAccountType();
        staff3.login("", "hi!");
        staff3.viewProfile();
        staff3.logout();
        boolean boolean19 = staff3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "staff" + "'", str13, "staff");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test13947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13947");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        boolean boolean5 = staff3.isVerified();
        java.lang.String str6 = staff3.getID();
        java.lang.String str7 = staff3.getID();
        staff3.login("hi!", "");
        java.lang.String str11 = staff3.getPassword();
        staff3.setVerified(false);
        double double14 = staff3.getHourlyRate();
        staff3.viewProfile();
        staff3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 40.0d + "'", double14 == 40.0d);
    }

    @Test
    public void test13948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13948");
        model.Staff staff3 = new model.Staff("hi!", "staff", "");
        staff3.logout();
        java.lang.String str5 = staff3.getEmail();
        java.lang.String str6 = staff3.getEmail();
        double double7 = staff3.getHourlyRate();
        staff3.setVerified(false);
        staff3.viewProfile();
        staff3.login("", "hi!");
        staff3.setVerified(true);
        java.lang.String str16 = staff3.getAccountType();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 40.0d + "'", double7 == 40.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "staff" + "'", str16, "staff");
    }

    @Test
    public void test13949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13949");
        model.Staff staff3 = new model.Staff("hi!", "", "staff");
        java.lang.String str4 = staff3.getPassword();
        staff3.logout();
        java.lang.String str6 = staff3.getPassword();
        staff3.login("", "");
        staff3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test13950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13950");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        double double6 = staff3.getHourlyRate();
        staff3.logout();
        staff3.setVerified(false);
        staff3.logout();
        java.lang.String str11 = staff3.getAccountType();
        boolean boolean12 = staff3.isVerified();
        staff3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 40.0d + "'", double6 == 40.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "staff" + "'", str11, "staff");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test13951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13951");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        staff3.login("", "");
        double double7 = staff3.getHourlyRate();
        boolean boolean8 = staff3.isVerified();
        java.lang.String str9 = staff3.getEmail();
        boolean boolean10 = staff3.isVerified();
        java.lang.String str11 = staff3.getID();
        double double12 = staff3.getHourlyRate();
        staff3.logout();
        java.lang.String str14 = staff3.getID();
        java.lang.String str15 = staff3.getPassword();
        staff3.logout();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 40.0d + "'", double7 == 40.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 40.0d + "'", double12 == 40.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test13952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13952");
        model.Staff staff3 = new model.Staff("hi!", "hi!", "");
        staff3.logout();
        java.lang.String str5 = staff3.getEmail();
        staff3.logout();
        java.lang.String str7 = staff3.getEmail();
        boolean boolean8 = staff3.isVerified();
        java.lang.String str9 = staff3.getEmail();
        staff3.logout();
        java.lang.String str11 = staff3.getPassword();
        java.lang.String str12 = staff3.getAccountType();
        java.lang.String str13 = staff3.getEmail();
        staff3.setVerified(true);
        staff3.viewProfile();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "staff" + "'", str12, "staff");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test13953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13953");
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
        staff3.viewProfile();
        staff3.login("hi!", "staff");
        java.lang.String str23 = staff3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test13954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13954");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        boolean boolean6 = staff3.isVerified();
        staff3.viewProfile();
        staff3.login("staff", "");
        java.lang.String str11 = staff3.getAccountType();
        double double12 = staff3.getHourlyRate();
        staff3.setVerified(true);
        staff3.login("staff", "staff");
        boolean boolean18 = staff3.isVerified();
        java.lang.String str19 = staff3.getEmail();
        boolean boolean20 = staff3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "staff" + "'", str11, "staff");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 40.0d + "'", double12 == 40.0d);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test13955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13955");
        model.Staff staff3 = new model.Staff("hi!", "staff", "");
        staff3.logout();
        staff3.logout();
        staff3.logout();
        double double7 = staff3.getHourlyRate();
        staff3.setVerified(false);
        java.lang.String str10 = staff3.getPassword();
        double double11 = staff3.getHourlyRate();
        double double12 = staff3.getHourlyRate();
        boolean boolean13 = staff3.isVerified();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 40.0d + "'", double7 == 40.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "staff" + "'", str10, "staff");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 40.0d + "'", double11 == 40.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 40.0d + "'", double12 == 40.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test13956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13956");
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
        java.lang.String str19 = staff3.getID();
        double double20 = staff3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 40.0d + "'", double20 == 40.0d);
    }

    @Test
    public void test13957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13957");
        model.Staff staff3 = new model.Staff("hi!", "", "hi!");
        staff3.setVerified(false);
        java.lang.String str6 = staff3.getPassword();
        java.lang.String str7 = staff3.getAccountType();
        java.lang.String str8 = staff3.getEmail();
        java.lang.String str9 = staff3.getID();
        java.lang.String str10 = staff3.getPassword();
        java.lang.String str11 = staff3.getAccountType();
        java.lang.String str12 = staff3.getPassword();
        java.lang.String str13 = staff3.getID();
        java.lang.String str14 = staff3.getPassword();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "staff" + "'", str7, "staff");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "staff" + "'", str11, "staff");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test13958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13958");
        model.Staff staff3 = new model.Staff("hi!", "hi!", "staff");
        staff3.login("hi!", "hi!");
        double double7 = staff3.getHourlyRate();
        java.lang.String str8 = staff3.getPassword();
        staff3.setVerified(true);
        staff3.viewProfile();
        staff3.setVerified(false);
        java.lang.String str14 = staff3.getAccountType();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 40.0d + "'", double7 == 40.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "staff" + "'", str14, "staff");
    }

    @Test
    public void test13959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13959");
        model.Staff staff3 = new model.Staff("staff", "", "staff");
        staff3.setVerified(false);
        staff3.login("hi!", "hi!");
        boolean boolean9 = staff3.isVerified();
        staff3.setVerified(true);
        java.lang.String str12 = staff3.getEmail();
        double double13 = staff3.getHourlyRate();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "staff" + "'", str12, "staff");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 40.0d + "'", double13 == 40.0d);
    }

    @Test
    public void test13960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13960");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        boolean boolean6 = staff3.isVerified();
        staff3.viewProfile();
        staff3.viewProfile();
        staff3.viewProfile();
        staff3.login("staff", "hi!");
        java.lang.String str13 = staff3.getID();
        staff3.login("", "staff");
        java.lang.String str17 = staff3.getAccountType();
        java.lang.Class<?> wildcardClass18 = staff3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "staff" + "'", str17, "staff");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test13961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13961");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        boolean boolean5 = staff3.isVerified();
        java.lang.String str6 = staff3.getID();
        java.lang.String str7 = staff3.getID();
        staff3.login("hi!", "");
        java.lang.String str11 = staff3.getPassword();
        boolean boolean12 = staff3.isVerified();
        boolean boolean13 = staff3.isVerified();
        staff3.setVerified(true);
        staff3.setVerified(true);
        staff3.logout();
        java.lang.String str19 = staff3.getEmail();
        java.lang.Class<?> wildcardClass20 = staff3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test13962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13962");
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
        java.lang.String str16 = staff3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "staff" + "'", str13, "staff");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "staff" + "'", str16, "staff");
    }

    @Test
    public void test13963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13963");
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
        staff3.setVerified(false);
        java.lang.String str18 = staff3.getAccountType();
        java.lang.String str19 = staff3.getPassword();
        boolean boolean20 = staff3.isVerified();
        staff3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "staff" + "'", str13, "staff");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "staff" + "'", str14, "staff");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "staff" + "'", str18, "staff");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test13964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13964");
        model.Staff staff3 = new model.Staff("hi!", "", "hi!");
        staff3.logout();
        staff3.login("hi!", "hi!");
        staff3.viewProfile();
        java.lang.String str9 = staff3.getPassword();
        java.lang.String str10 = staff3.getID();
        staff3.logout();
        staff3.login("", "staff");
        java.lang.String str15 = staff3.getID();
        staff3.setVerified(false);
        java.lang.String str18 = staff3.getPassword();
        staff3.viewProfile();
        boolean boolean20 = staff3.isVerified();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test13965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13965");
        model.Staff staff3 = new model.Staff("hi!", "hi!", "hi!");
        staff3.login("hi!", "staff");
        staff3.logout();
        java.lang.String str8 = staff3.getPassword();
        staff3.viewProfile();
        boolean boolean10 = staff3.isVerified();
        java.lang.String str11 = staff3.getID();
        staff3.setVerified(false);
        java.lang.String str14 = staff3.getEmail();
        java.lang.Class<?> wildcardClass15 = staff3.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test13966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13966");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        staff3.logout();
        java.lang.String str5 = staff3.getID();
        java.lang.String str6 = staff3.getEmail();
        staff3.login("hi!", "hi!");
        staff3.logout();
        staff3.setVerified(false);
        java.lang.String str13 = staff3.getEmail();
        double double14 = staff3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 40.0d + "'", double14 == 40.0d);
    }

    @Test
    public void test13967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13967");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        boolean boolean6 = staff3.isVerified();
        staff3.logout();
        staff3.setVerified(false);
        java.lang.String str10 = staff3.getAccountType();
        java.lang.String str11 = staff3.getEmail();
        staff3.logout();
        boolean boolean13 = staff3.isVerified();
        java.lang.String str14 = staff3.getAccountType();
        staff3.login("", "staff");
        java.lang.String str18 = staff3.getEmail();
        staff3.logout();
        java.lang.String str20 = staff3.getAccountType();
        java.lang.String str21 = staff3.getPassword();
        staff3.setVerified(true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "staff" + "'", str10, "staff");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "staff" + "'", str14, "staff");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "staff" + "'", str20, "staff");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test13968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13968");
        model.Staff staff3 = new model.Staff("hi!", "", "hi!");
        staff3.setVerified(false);
        java.lang.String str6 = staff3.getPassword();
        java.lang.String str7 = staff3.getAccountType();
        java.lang.String str8 = staff3.getEmail();
        java.lang.String str9 = staff3.getID();
        staff3.login("staff", "hi!");
        double double13 = staff3.getHourlyRate();
        java.lang.String str14 = staff3.getPassword();
        staff3.setVerified(false);
        boolean boolean17 = staff3.isVerified();
        java.lang.Class<?> wildcardClass18 = staff3.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "staff" + "'", str7, "staff");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 40.0d + "'", double13 == 40.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test13969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13969");
        model.Staff staff3 = new model.Staff("staff", "hi!", "");
        double double4 = staff3.getHourlyRate();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 40.0d + "'", double4 == 40.0d);
    }

    @Test
    public void test13970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13970");
        model.Staff staff3 = new model.Staff("hi!", "staff", "");
        java.lang.String str4 = staff3.getEmail();
        staff3.viewProfile();
        staff3.setVerified(true);
        java.lang.String str8 = staff3.getID();
        staff3.login("hi!", "staff");
        double double12 = staff3.getHourlyRate();
        staff3.login("staff", "staff");
        double double16 = staff3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 40.0d + "'", double12 == 40.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 40.0d + "'", double16 == 40.0d);
    }

    @Test
    public void test13971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13971");
        model.Staff staff3 = new model.Staff("hi!", "", "hi!");
        staff3.logout();
        staff3.login("hi!", "hi!");
        double double8 = staff3.getHourlyRate();
        java.lang.String str9 = staff3.getID();
        staff3.logout();
        boolean boolean11 = staff3.isVerified();
        java.lang.String str12 = staff3.getEmail();
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 40.0d + "'", double8 == 40.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test13972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13972");
        model.Staff staff3 = new model.Staff("hi!", "", "hi!");
        staff3.setVerified(false);
        java.lang.String str6 = staff3.getPassword();
        java.lang.String str7 = staff3.getAccountType();
        java.lang.String str8 = staff3.getEmail();
        staff3.setVerified(false);
        java.lang.String str11 = staff3.getPassword();
        java.lang.String str12 = staff3.getAccountType();
        staff3.viewProfile();
        boolean boolean14 = staff3.isVerified();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "staff" + "'", str7, "staff");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "staff" + "'", str12, "staff");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test13973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13973");
        model.Staff staff3 = new model.Staff("hi!", "", "hi!");
        staff3.logout();
        staff3.login("hi!", "hi!");
        double double8 = staff3.getHourlyRate();
        java.lang.String str9 = staff3.getID();
        staff3.login("", "staff");
        staff3.viewProfile();
        java.lang.String str14 = staff3.getEmail();
        boolean boolean15 = staff3.isVerified();
        java.lang.String str16 = staff3.getAccountType();
        java.lang.String str17 = staff3.getID();
        java.lang.String str18 = staff3.getAccountType();
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 40.0d + "'", double8 == 40.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "staff" + "'", str16, "staff");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "staff" + "'", str18, "staff");
    }

    @Test
    public void test13974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13974");
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
        staff3.setVerified(false);
        staff3.setVerified(false);
        java.lang.Class<?> wildcardClass19 = staff3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "staff" + "'", str8, "staff");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "staff" + "'", str9, "staff");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test13975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13975");
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
        java.lang.String str15 = staff3.getAccountType();
        staff3.login("staff", "");
        java.lang.String str19 = staff3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 40.0d + "'", double13 == 40.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "staff" + "'", str15, "staff");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test13976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13976");
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
        staff3.login("", "staff");
        java.lang.String str18 = staff3.getEmail();
        java.lang.String str19 = staff3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "staff" + "'", str4, "staff");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "staff" + "'", str11, "staff");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test13977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13977");
        model.Staff staff3 = new model.Staff("hi!", "", "hi!");
        java.lang.String str4 = staff3.getAccountType();
        java.lang.String str5 = staff3.getID();
        java.lang.String str6 = staff3.getEmail();
        java.lang.String str7 = staff3.getPassword();
        java.lang.String str8 = staff3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "staff" + "'", str4, "staff");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test13978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13978");
        model.Staff staff3 = new model.Staff("staff", "", "staff");
        staff3.setVerified(false);
        java.lang.String str6 = staff3.getAccountType();
        java.lang.String str7 = staff3.getAccountType();
        java.lang.Class<?> wildcardClass8 = staff3.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "staff" + "'", str6, "staff");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "staff" + "'", str7, "staff");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test13979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13979");
        model.Staff staff3 = new model.Staff("hi!", "", "hi!");
        java.lang.String str4 = staff3.getAccountType();
        java.lang.String str5 = staff3.getEmail();
        staff3.viewProfile();
        staff3.setVerified(true);
        java.lang.String str9 = staff3.getPassword();
        staff3.setVerified(false);
        staff3.setVerified(true);
        staff3.viewProfile();
        staff3.logout();
        staff3.viewProfile();
        staff3.setVerified(false);
        boolean boolean19 = staff3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "staff" + "'", str4, "staff");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test13980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13980");
        model.Staff staff3 = new model.Staff("hi!", "hi!", "");
        staff3.logout();
        java.lang.String str5 = staff3.getEmail();
        java.lang.String str6 = staff3.getAccountType();
        staff3.login("staff", "staff");
        double double10 = staff3.getHourlyRate();
        staff3.viewProfile();
        staff3.setVerified(false);
        staff3.login("hi!", "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "staff" + "'", str6, "staff");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 40.0d + "'", double10 == 40.0d);
    }

    @Test
    public void test13981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13981");
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
        java.lang.String str16 = staff3.getEmail();
        java.lang.String str17 = staff3.getPassword();
        java.lang.String str18 = staff3.getPassword();
        java.lang.Class<?> wildcardClass19 = staff3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "staff" + "'", str15, "staff");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test13982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13982");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        boolean boolean6 = staff3.isVerified();
        staff3.logout();
        staff3.setVerified(false);
        java.lang.String str10 = staff3.getEmail();
        staff3.logout();
        java.lang.String str12 = staff3.getID();
        staff3.login("", "hi!");
        double double16 = staff3.getHourlyRate();
        staff3.viewProfile();
        java.lang.String str18 = staff3.getID();
        java.lang.String str19 = staff3.getID();
        staff3.login("hi!", "");
        double double23 = staff3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 40.0d + "'", double16 == 40.0d);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 40.0d + "'", double23 == 40.0d);
    }

    @Test
    public void test13983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13983");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        boolean boolean6 = staff3.isVerified();
        staff3.logout();
        java.lang.String str8 = staff3.getPassword();
        java.lang.String str9 = staff3.getEmail();
        double double10 = staff3.getHourlyRate();
        staff3.logout();
        java.lang.String str12 = staff3.getID();
        staff3.viewProfile();
        double double14 = staff3.getHourlyRate();
        java.lang.String str15 = staff3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 40.0d + "'", double10 == 40.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 40.0d + "'", double14 == 40.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test13984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13984");
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
        boolean boolean17 = staff3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 40.0d + "'", double8 == 40.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test13985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13985");
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
        java.lang.String str19 = staff3.getEmail();
        staff3.login("", "hi!");
        double double23 = staff3.getHourlyRate();
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
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 40.0d + "'", double23 == 40.0d);
    }

    @Test
    public void test13986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13986");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        boolean boolean5 = staff3.isVerified();
        java.lang.String str6 = staff3.getAccountType();
        staff3.logout();
        java.lang.String str8 = staff3.getEmail();
        staff3.viewProfile();
        boolean boolean10 = staff3.isVerified();
        java.lang.String str11 = staff3.getID();
        java.lang.String str12 = staff3.getEmail();
        staff3.logout();
        java.lang.String str14 = staff3.getEmail();
        java.lang.String str15 = staff3.getID();
        java.lang.String str16 = staff3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "staff" + "'", str6, "staff");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test13987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13987");
        model.Staff staff3 = new model.Staff("hi!", "", "hi!");
        staff3.setVerified(false);
        java.lang.String str6 = staff3.getEmail();
        staff3.setVerified(false);
        staff3.login("staff", "hi!");
        java.lang.String str12 = staff3.getPassword();
        java.lang.String str13 = staff3.getPassword();
        staff3.setVerified(true);
        java.lang.String str16 = staff3.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test13988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13988");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        boolean boolean5 = staff3.isVerified();
        java.lang.String str6 = staff3.getID();
        staff3.setVerified(false);
        java.lang.String str9 = staff3.getID();
        staff3.setVerified(false);
        staff3.logout();
        java.lang.String str13 = staff3.getAccountType();
        staff3.login("staff", "staff");
        java.lang.String str17 = staff3.getID();
        java.lang.String str18 = staff3.getAccountType();
        double double19 = staff3.getHourlyRate();
        staff3.setVerified(true);
        boolean boolean22 = staff3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "staff" + "'", str13, "staff");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "staff" + "'", str18, "staff");
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 40.0d + "'", double19 == 40.0d);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test13989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13989");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        boolean boolean6 = staff3.isVerified();
        staff3.logout();
        staff3.setVerified(false);
        staff3.viewProfile();
        java.lang.String str11 = staff3.getEmail();
        staff3.login("staff", "hi!");
        double double15 = staff3.getHourlyRate();
        java.lang.String str16 = staff3.getAccountType();
        java.lang.String str17 = staff3.getPassword();
        staff3.login("staff", "staff");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 40.0d + "'", double15 == 40.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "staff" + "'", str16, "staff");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test13990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13990");
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
        java.lang.String str17 = staff3.getEmail();
        boolean boolean18 = staff3.isVerified();
        java.lang.String str19 = staff3.getID();
        double double20 = staff3.getHourlyRate();
        staff3.viewProfile();
        java.lang.String str22 = staff3.getAccountType();
        staff3.setVerified(false);
        java.lang.String str25 = staff3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 40.0d + "'", double20 == 40.0d);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "staff" + "'", str22, "staff");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "staff" + "'", str25, "staff");
    }

    @Test
    public void test13991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13991");
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
        java.lang.String str21 = staff3.getAccountType();
        staff3.setVerified(true);
        boolean boolean24 = staff3.isVerified();
        java.lang.String str25 = staff3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 40.0d + "'", double11 == 40.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "staff" + "'", str20, "staff");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "staff" + "'", str21, "staff");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
    }

    @Test
    public void test13992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13992");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        staff3.login("", "");
        staff3.viewProfile();
        staff3.viewProfile();
        staff3.login("", "");
        staff3.logout();
        java.lang.String str13 = staff3.getID();
        boolean boolean14 = staff3.isVerified();
        staff3.setVerified(true);
        java.lang.String str17 = staff3.getEmail();
        staff3.login("hi!", "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test13993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13993");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        boolean boolean5 = staff3.isVerified();
        java.lang.String str6 = staff3.getAccountType();
        staff3.logout();
        java.lang.String str8 = staff3.getEmail();
        staff3.viewProfile();
        double double10 = staff3.getHourlyRate();
        boolean boolean11 = staff3.isVerified();
        double double12 = staff3.getHourlyRate();
        staff3.login("staff", "hi!");
        java.lang.Class<?> wildcardClass16 = staff3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "staff" + "'", str6, "staff");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 40.0d + "'", double10 == 40.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 40.0d + "'", double12 == 40.0d);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test13994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13994");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        boolean boolean6 = staff3.isVerified();
        staff3.logout();
        java.lang.String str8 = staff3.getAccountType();
        staff3.setVerified(false);
        staff3.viewProfile();
        java.lang.String str12 = staff3.getAccountType();
        java.lang.String str13 = staff3.getEmail();
        staff3.login("hi!", "hi!");
        java.lang.String str17 = staff3.getEmail();
        staff3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "staff" + "'", str8, "staff");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "staff" + "'", str12, "staff");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test13995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13995");
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
        staff3.viewProfile();
        java.lang.String str18 = staff3.getPassword();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 40.0d + "'", double7 == 40.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test13996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13996");
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
        java.lang.String str19 = staff3.getPassword();
        java.lang.String str20 = staff3.getID();
        boolean boolean21 = staff3.isVerified();
        staff3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 40.0d + "'", double18 == 40.0d);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test13997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13997");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        boolean boolean6 = staff3.isVerified();
        staff3.logout();
        staff3.setVerified(false);
        java.lang.String str10 = staff3.getID();
        staff3.viewProfile();
        staff3.login("", "");
        java.lang.String str15 = staff3.getAccountType();
        java.lang.String str16 = staff3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "staff" + "'", str15, "staff");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test13998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13998");
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
        staff3.login("hi!", "");
        staff3.setVerified(false);
        java.lang.String str23 = staff3.getEmail();
        boolean boolean24 = staff3.isVerified();
        java.lang.String str25 = staff3.getAccountType();
        double double26 = staff3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 40.0d + "'", double16 == 40.0d);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "staff" + "'", str25, "staff");
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 40.0d + "'", double26 == 40.0d);
    }

    @Test
    public void test13999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13999");
        model.Staff staff3 = new model.Staff("", "hi!", "");
        staff3.login("hi!", "hi!");
        java.lang.String str7 = staff3.getPassword();
        java.lang.String str8 = staff3.getPassword();
        java.lang.String str9 = staff3.getID();
        staff3.viewProfile();
        staff3.logout();
        staff3.setVerified(true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test14000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test14000");
        model.Staff staff3 = new model.Staff("hi!", "", "hi!");
        staff3.logout();
        staff3.login("hi!", "hi!");
        java.lang.String str8 = staff3.getID();
        boolean boolean9 = staff3.isVerified();
        double double10 = staff3.getHourlyRate();
        java.lang.String str11 = staff3.getPassword();
        double double12 = staff3.getHourlyRate();
        staff3.viewProfile();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 40.0d + "'", double10 == 40.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 40.0d + "'", double12 == 40.0d);
    }
}

