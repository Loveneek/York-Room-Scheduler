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
        model.Staff staff3 = new model.Staff("hi!", "", "hi!");
        double double4 = staff3.getHourlyRate();
        boolean boolean5 = staff3.isVerified();
        staff3.viewProfile();
        staff3.logout();
        java.lang.Class<?> wildcardClass8 = staff3.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 40.0d + "'", double4 == 40.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test03502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03502");
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
        staff3.viewProfile();
        boolean boolean17 = staff3.isVerified();
        java.lang.Class<?> wildcardClass18 = staff3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "staff" + "'", str15, "staff");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test03503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03503");
        model.Staff staff3 = new model.Staff("hi!", "", "hi!");
        java.lang.String str4 = staff3.getAccountType();
        java.lang.String str5 = staff3.getEmail();
        staff3.viewProfile();
        staff3.logout();
        staff3.login("staff", "staff");
        double double11 = staff3.getHourlyRate();
        java.lang.String str12 = staff3.getPassword();
        staff3.setVerified(true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "staff" + "'", str4, "staff");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 40.0d + "'", double11 == 40.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test03504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03504");
        model.Staff staff3 = new model.Staff("staff", "", "staff");
        staff3.setVerified(false);
        staff3.viewProfile();
        java.lang.String str7 = staff3.getEmail();
        java.lang.String str8 = staff3.getID();
        double double9 = staff3.getHourlyRate();
        staff3.login("hi!", "staff");
        java.lang.String str13 = staff3.getID();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "staff" + "'", str7, "staff");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "staff" + "'", str8, "staff");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 40.0d + "'", double9 == 40.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "staff" + "'", str13, "staff");
    }

    @Test
    public void test03505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03505");
        model.Staff staff3 = new model.Staff("hi!", "", "hi!");
        staff3.setVerified(false);
        java.lang.String str6 = staff3.getPassword();
        java.lang.String str7 = staff3.getAccountType();
        staff3.viewProfile();
        double double9 = staff3.getHourlyRate();
        java.lang.String str10 = staff3.getEmail();
        boolean boolean11 = staff3.isVerified();
        staff3.setVerified(false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "staff" + "'", str7, "staff");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 40.0d + "'", double9 == 40.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test03506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03506");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        boolean boolean6 = staff3.isVerified();
        staff3.logout();
        java.lang.String str8 = staff3.getPassword();
        staff3.setVerified(false);
        staff3.logout();
        staff3.viewProfile();
        java.lang.String str13 = staff3.getAccountType();
        java.lang.String str14 = staff3.getEmail();
        java.lang.Class<?> wildcardClass15 = staff3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "staff" + "'", str13, "staff");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test03507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03507");
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
        staff3.viewProfile();
        java.lang.String str19 = staff3.getPassword();
        java.lang.String str20 = staff3.getAccountType();
        java.lang.String str21 = staff3.getPassword();
        staff3.viewProfile();
        staff3.setVerified(false);
        java.lang.String str25 = staff3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "staff" + "'", str10, "staff");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "staff" + "'", str20, "staff");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
    }

    @Test
    public void test03508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03508");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        boolean boolean6 = staff3.isVerified();
        staff3.logout();
        java.lang.String str8 = staff3.getAccountType();
        staff3.setVerified(false);
        staff3.viewProfile();
        staff3.setVerified(true);
        staff3.viewProfile();
        staff3.login("staff", "");
        java.lang.Class<?> wildcardClass18 = staff3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "staff" + "'", str8, "staff");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test03509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03509");
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
        staff3.viewProfile();
        double double19 = staff3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "staff" + "'", str17, "staff");
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 40.0d + "'", double19 == 40.0d);
    }

    @Test
    public void test03510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03510");
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
        boolean boolean19 = staff3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "staff" + "'", str18, "staff");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test03511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03511");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        staff3.logout();
        java.lang.String str5 = staff3.getID();
        java.lang.String str6 = staff3.getEmail();
        staff3.login("hi!", "hi!");
        boolean boolean10 = staff3.isVerified();
        java.lang.Class<?> wildcardClass11 = staff3.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test03512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03512");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        boolean boolean6 = staff3.isVerified();
        staff3.viewProfile();
        java.lang.String str8 = staff3.getAccountType();
        staff3.logout();
        double double10 = staff3.getHourlyRate();
        double double11 = staff3.getHourlyRate();
        staff3.login("hi!", "staff");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "staff" + "'", str8, "staff");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 40.0d + "'", double10 == 40.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 40.0d + "'", double11 == 40.0d);
    }

    @Test
    public void test03513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03513");
        model.Staff staff3 = new model.Staff("hi!", "", "hi!");
        staff3.logout();
        staff3.login("hi!", "hi!");
        double double8 = staff3.getHourlyRate();
        java.lang.String str9 = staff3.getID();
        java.lang.String str10 = staff3.getEmail();
        staff3.setVerified(true);
        boolean boolean13 = staff3.isVerified();
        staff3.viewProfile();
        staff3.viewProfile();
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 40.0d + "'", double8 == 40.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test03514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03514");
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
        java.lang.String str15 = staff3.getID();
        staff3.setVerified(true);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 40.0d + "'", double8 == 40.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "staff" + "'", str10, "staff");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "staff" + "'", str11, "staff");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 40.0d + "'", double12 == 40.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 40.0d + "'", double13 == 40.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test03515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03515");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        boolean boolean6 = staff3.isVerified();
        staff3.logout();
        java.lang.String str8 = staff3.getEmail();
        java.lang.String str9 = staff3.getID();
        java.lang.String str10 = staff3.getAccountType();
        java.lang.String str11 = staff3.getID();
        staff3.viewProfile();
        java.lang.String str13 = staff3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "staff" + "'", str10, "staff");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test03516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03516");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        boolean boolean5 = staff3.isVerified();
        java.lang.String str6 = staff3.getID();
        java.lang.String str7 = staff3.getID();
        double double8 = staff3.getHourlyRate();
        double double9 = staff3.getHourlyRate();
        staff3.logout();
        java.lang.String str11 = staff3.getID();
        double double12 = staff3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 40.0d + "'", double8 == 40.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 40.0d + "'", double9 == 40.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 40.0d + "'", double12 == 40.0d);
    }

    @Test
    public void test03517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03517");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        boolean boolean6 = staff3.isVerified();
        staff3.login("", "");
        staff3.login("staff", "staff");
        java.lang.String str13 = staff3.getPassword();
        java.lang.String str14 = staff3.getID();
        java.lang.Class<?> wildcardClass15 = staff3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test03518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03518");
        model.Staff staff3 = new model.Staff("hi!", "", "hi!");
        staff3.setVerified(false);
        java.lang.String str6 = staff3.getPassword();
        java.lang.String str7 = staff3.getAccountType();
        staff3.viewProfile();
        boolean boolean9 = staff3.isVerified();
        java.lang.String str10 = staff3.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "staff" + "'", str7, "staff");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test03519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03519");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        boolean boolean5 = staff3.isVerified();
        java.lang.String str6 = staff3.getID();
        staff3.setVerified(false);
        java.lang.String str9 = staff3.getID();
        staff3.setVerified(false);
        staff3.logout();
        staff3.login("staff", "");
        staff3.login("hi!", "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test03520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03520");
        model.Staff staff3 = new model.Staff("hi!", "", "hi!");
        staff3.setVerified(false);
        java.lang.String str6 = staff3.getEmail();
        java.lang.String str7 = staff3.getAccountType();
        java.lang.String str8 = staff3.getPassword();
        staff3.viewProfile();
        staff3.viewProfile();
        staff3.login("hi!", "hi!");
        staff3.setVerified(false);
        java.lang.String str16 = staff3.getAccountType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "staff" + "'", str7, "staff");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "staff" + "'", str16, "staff");
    }

    @Test
    public void test03521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03521");
        model.Staff staff3 = new model.Staff("staff", "", "staff");
        staff3.setVerified(false);
        staff3.login("hi!", "hi!");
        java.lang.String str9 = staff3.getEmail();
        staff3.logout();
        staff3.login("", "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "staff" + "'", str9, "staff");
    }

    @Test
    public void test03522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03522");
        model.Staff staff3 = new model.Staff("hi!", "", "hi!");
        staff3.logout();
        staff3.login("hi!", "hi!");
        double double8 = staff3.getHourlyRate();
        boolean boolean9 = staff3.isVerified();
        java.lang.String str10 = staff3.getAccountType();
        java.lang.String str11 = staff3.getPassword();
        java.lang.String str12 = staff3.getID();
        java.lang.String str13 = staff3.getID();
        boolean boolean14 = staff3.isVerified();
        staff3.login("hi!", "staff");
        staff3.login("staff", "staff");
        staff3.logout();
        boolean boolean22 = staff3.isVerified();
        staff3.setVerified(true);
        staff3.login("staff", "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 40.0d + "'", double8 == 40.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "staff" + "'", str10, "staff");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test03523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03523");
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
        boolean boolean20 = staff3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test03524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03524");
        model.Staff staff3 = new model.Staff("hi!", "", "hi!");
        double double4 = staff3.getHourlyRate();
        boolean boolean5 = staff3.isVerified();
        java.lang.String str6 = staff3.getID();
        java.lang.Class<?> wildcardClass7 = staff3.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 40.0d + "'", double4 == 40.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test03525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03525");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getEmail();
        staff3.viewProfile();
        java.lang.String str7 = staff3.getPassword();
        staff3.viewProfile();
        staff3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test03526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03526");
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
        double double15 = staff3.getHourlyRate();
        java.lang.String str16 = staff3.getAccountType();
        staff3.setVerified(true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "staff" + "'", str13, "staff");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 40.0d + "'", double15 == 40.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "staff" + "'", str16, "staff");
    }

    @Test
    public void test03527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03527");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        boolean boolean6 = staff3.isVerified();
        staff3.logout();
        java.lang.String str8 = staff3.getAccountType();
        staff3.setVerified(false);
        staff3.viewProfile();
        staff3.setVerified(true);
        staff3.viewProfile();
        staff3.login("staff", "");
        boolean boolean18 = staff3.isVerified();
        java.lang.String str19 = staff3.getEmail();
        staff3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "staff" + "'", str8, "staff");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test03528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03528");
        model.Staff staff3 = new model.Staff("hi!", "", "hi!");
        staff3.setVerified(false);
        java.lang.String str6 = staff3.getPassword();
        java.lang.String str7 = staff3.getAccountType();
        java.lang.String str8 = staff3.getEmail();
        java.lang.String str9 = staff3.getID();
        staff3.login("staff", "hi!");
        double double13 = staff3.getHourlyRate();
        double double14 = staff3.getHourlyRate();
        staff3.logout();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "staff" + "'", str7, "staff");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 40.0d + "'", double13 == 40.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 40.0d + "'", double14 == 40.0d);
    }

    @Test
    public void test03529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03529");
        model.Staff staff3 = new model.Staff("hi!", "hi!", "staff");
        staff3.login("hi!", "staff");
        staff3.login("", "staff");
        java.lang.String str10 = staff3.getPassword();
        java.lang.String str11 = staff3.getID();
        boolean boolean12 = staff3.isVerified();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "staff" + "'", str11, "staff");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test03530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03530");
        model.Staff staff3 = new model.Staff("hi!", "hi!", "");
        staff3.logout();
        java.lang.String str5 = staff3.getEmail();
        boolean boolean6 = staff3.isVerified();
        staff3.login("", "staff");
        staff3.viewProfile();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test03531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03531");
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
        staff3.login("", "staff");
        java.lang.Class<?> wildcardClass20 = staff3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "staff" + "'", str8, "staff");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "staff" + "'", str9, "staff");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test03532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03532");
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
        java.lang.String str15 = staff3.getID();
        staff3.setVerified(true);
        java.lang.String str18 = staff3.getEmail();
        double double19 = staff3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "staff" + "'", str4, "staff");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "staff" + "'", str11, "staff");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 40.0d + "'", double14 == 40.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 40.0d + "'", double19 == 40.0d);
    }

    @Test
    public void test03533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03533");
        model.Staff staff3 = new model.Staff("hi!", "hi!", "");
        staff3.logout();
        java.lang.String str5 = staff3.getEmail();
        staff3.setVerified(true);
        double double8 = staff3.getHourlyRate();
        staff3.logout();
        java.lang.Class<?> wildcardClass10 = staff3.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 40.0d + "'", double8 == 40.0d);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test03534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03534");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        boolean boolean6 = staff3.isVerified();
        staff3.logout();
        staff3.setVerified(false);
        staff3.viewProfile();
        java.lang.String str11 = staff3.getEmail();
        java.lang.String str12 = staff3.getEmail();
        java.lang.String str13 = staff3.getID();
        java.lang.String str14 = staff3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test03535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03535");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        staff3.logout();
        java.lang.String str5 = staff3.getID();
        java.lang.String str6 = staff3.getEmail();
        staff3.viewProfile();
        staff3.setVerified(false);
        java.lang.String str10 = staff3.getID();
        java.lang.String str11 = staff3.getAccountType();
        staff3.logout();
        boolean boolean13 = staff3.isVerified();
        java.lang.String str14 = staff3.getID();
        boolean boolean15 = staff3.isVerified();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "staff" + "'", str11, "staff");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test03536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03536");
        model.Staff staff3 = new model.Staff("staff", "", "staff");
        staff3.setVerified(false);
        staff3.viewProfile();
        java.lang.String str7 = staff3.getEmail();
        java.lang.String str8 = staff3.getID();
        java.lang.String str9 = staff3.getID();
        boolean boolean10 = staff3.isVerified();
        double double11 = staff3.getHourlyRate();
        staff3.logout();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "staff" + "'", str7, "staff");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "staff" + "'", str8, "staff");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "staff" + "'", str9, "staff");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 40.0d + "'", double11 == 40.0d);
    }

    @Test
    public void test03537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03537");
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
        java.lang.String str15 = staff3.getAccountType();
        staff3.setVerified(true);
        double double18 = staff3.getHourlyRate();
        staff3.viewProfile();
        java.lang.String str20 = staff3.getID();
        staff3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 40.0d + "'", double6 == 40.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 40.0d + "'", double12 == 40.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "staff" + "'", str15, "staff");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 40.0d + "'", double18 == 40.0d);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test03538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03538");
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
        staff3.login("hi!", "");
        java.lang.Class<?> wildcardClass22 = staff3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test03539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03539");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        boolean boolean6 = staff3.isVerified();
        staff3.logout();
        java.lang.String str8 = staff3.getEmail();
        staff3.viewProfile();
        staff3.logout();
        staff3.login("hi!", "hi!");
        double double14 = staff3.getHourlyRate();
        java.lang.String str15 = staff3.getEmail();
        boolean boolean16 = staff3.isVerified();
        staff3.login("staff", "staff");
        staff3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 40.0d + "'", double14 == 40.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test03540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03540");
        model.Staff staff3 = new model.Staff("", "staff", "");
        staff3.setVerified(true);
        staff3.login("", "hi!");
        boolean boolean9 = staff3.isVerified();
        double double10 = staff3.getHourlyRate();
        staff3.setVerified(false);
        java.lang.String str13 = staff3.getID();
        staff3.login("hi!", "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 40.0d + "'", double10 == 40.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test03541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03541");
        model.Staff staff3 = new model.Staff("hi!", "", "hi!");
        staff3.logout();
        staff3.login("hi!", "hi!");
        staff3.setVerified(false);
    }

    @Test
    public void test03542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03542");
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
        boolean boolean21 = staff3.isVerified();
        java.lang.Class<?> wildcardClass22 = staff3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 40.0d + "'", double11 == 40.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 40.0d + "'", double14 == 40.0d);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test03543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03543");
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
        staff3.login("", "");
        java.lang.String str18 = staff3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "staff" + "'", str4, "staff");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "staff" + "'", str11, "staff");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 40.0d + "'", double12 == 40.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test03544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03544");
        model.Staff staff3 = new model.Staff("hi!", "", "hi!");
        staff3.setVerified(false);
        java.lang.String str6 = staff3.getPassword();
        java.lang.String str7 = staff3.getAccountType();
        java.lang.String str8 = staff3.getEmail();
        staff3.setVerified(true);
        java.lang.String str11 = staff3.getAccountType();
        staff3.login("staff", "");
        java.lang.String str15 = staff3.getID();
        staff3.login("staff", "staff");
        java.lang.Class<?> wildcardClass19 = staff3.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "staff" + "'", str7, "staff");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "staff" + "'", str11, "staff");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test03545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03545");
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
        java.lang.String str18 = staff3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test03546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03546");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        staff3.logout();
        java.lang.String str5 = staff3.getID();
        java.lang.String str6 = staff3.getEmail();
        double double7 = staff3.getHourlyRate();
        boolean boolean8 = staff3.isVerified();
        java.lang.String str9 = staff3.getPassword();
        java.lang.String str10 = staff3.getID();
        java.lang.String str11 = staff3.getID();
        java.lang.String str12 = staff3.getPassword();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 40.0d + "'", double7 == 40.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test03547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03547");
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
        java.lang.String str15 = staff3.getEmail();
        java.lang.Class<?> wildcardClass16 = staff3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 40.0d + "'", double14 == 40.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test03548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03548");
        model.Staff staff3 = new model.Staff("staff", "", "staff");
        staff3.setVerified(false);
        staff3.viewProfile();
        java.lang.String str7 = staff3.getEmail();
        java.lang.String str8 = staff3.getID();
        double double9 = staff3.getHourlyRate();
        java.lang.String str10 = staff3.getEmail();
        staff3.logout();
        java.lang.String str12 = staff3.getAccountType();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "staff" + "'", str7, "staff");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "staff" + "'", str8, "staff");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 40.0d + "'", double9 == 40.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "staff" + "'", str10, "staff");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "staff" + "'", str12, "staff");
    }

    @Test
    public void test03549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03549");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        boolean boolean6 = staff3.isVerified();
        staff3.login("", "");
        java.lang.String str10 = staff3.getID();
        boolean boolean11 = staff3.isVerified();
        double double12 = staff3.getHourlyRate();
        java.lang.String str13 = staff3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 40.0d + "'", double12 == 40.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "staff" + "'", str13, "staff");
    }

    @Test
    public void test03550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03550");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        boolean boolean6 = staff3.isVerified();
        staff3.logout();
        java.lang.String str8 = staff3.getPassword();
        staff3.setVerified(false);
        java.lang.String str11 = staff3.getID();
        staff3.login("staff", "staff");
        staff3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test03551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03551");
        model.Staff staff3 = new model.Staff("hi!", "staff", "");
        java.lang.String str4 = staff3.getEmail();
        staff3.viewProfile();
        staff3.logout();
        staff3.viewProfile();
        java.lang.String str8 = staff3.getID();
        boolean boolean9 = staff3.isVerified();
        staff3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test03552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03552");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        staff3.logout();
        java.lang.String str5 = staff3.getID();
        java.lang.String str6 = staff3.getEmail();
        double double7 = staff3.getHourlyRate();
        boolean boolean8 = staff3.isVerified();
        java.lang.String str9 = staff3.getPassword();
        java.lang.String str10 = staff3.getID();
        java.lang.String str11 = staff3.getPassword();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 40.0d + "'", double7 == 40.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test03553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03553");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        boolean boolean5 = staff3.isVerified();
        java.lang.String str6 = staff3.getID();
        boolean boolean7 = staff3.isVerified();
        java.lang.String str8 = staff3.getID();
        java.lang.String str9 = staff3.getAccountType();
        staff3.logout();
        java.lang.String str11 = staff3.getID();
        java.lang.String str12 = staff3.getEmail();
        java.lang.String str13 = staff3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "staff" + "'", str9, "staff");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test03554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03554");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        boolean boolean5 = staff3.isVerified();
        java.lang.String str6 = staff3.getID();
        boolean boolean7 = staff3.isVerified();
        staff3.logout();
        java.lang.String str9 = staff3.getID();
        staff3.login("hi!", "");
        java.lang.String str13 = staff3.getPassword();
        java.lang.String str14 = staff3.getID();
        staff3.login("staff", "hi!");
        staff3.login("", "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test03555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03555");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        boolean boolean5 = staff3.isVerified();
        java.lang.String str6 = staff3.getID();
        java.lang.String str7 = staff3.getID();
        staff3.setVerified(true);
        staff3.setVerified(false);
        java.lang.String str12 = staff3.getEmail();
        double double13 = staff3.getHourlyRate();
        boolean boolean14 = staff3.isVerified();
        java.lang.String str15 = staff3.getAccountType();
        java.lang.String str16 = staff3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 40.0d + "'", double13 == 40.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "staff" + "'", str15, "staff");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test03556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03556");
        model.Staff staff3 = new model.Staff("", "staff", "staff");
        double double4 = staff3.getHourlyRate();
        java.lang.String str5 = staff3.getAccountType();
        java.lang.String str6 = staff3.getAccountType();
        staff3.login("staff", "");
        staff3.login("staff", "");
        staff3.logout();
        java.lang.String str14 = staff3.getPassword();
        double double15 = staff3.getHourlyRate();
        staff3.logout();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 40.0d + "'", double4 == 40.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "staff" + "'", str6, "staff");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "staff" + "'", str14, "staff");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 40.0d + "'", double15 == 40.0d);
    }

    @Test
    public void test03557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03557");
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
        double double18 = staff3.getHourlyRate();
        boolean boolean19 = staff3.isVerified();
        staff3.viewProfile();
        staff3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "staff" + "'", str13, "staff");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "staff" + "'", str14, "staff");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 40.0d + "'", double18 == 40.0d);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test03558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03558");
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
        double double15 = staff3.getHourlyRate();
        java.lang.String str16 = staff3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "staff" + "'", str11, "staff");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 40.0d + "'", double15 == 40.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test03559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03559");
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
        java.lang.String str17 = staff3.getEmail();
        java.lang.String str18 = staff3.getEmail();
        java.lang.String str19 = staff3.getID();
        boolean boolean20 = staff3.isVerified();
        staff3.logout();
        double double22 = staff3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 40.0d + "'", double16 == 40.0d);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 40.0d + "'", double22 == 40.0d);
    }

    @Test
    public void test03560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03560");
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
        staff3.viewProfile();
        java.lang.Class<?> wildcardClass16 = staff3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 40.0d + "'", double11 == 40.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "staff" + "'", str12, "staff");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 40.0d + "'", double13 == 40.0d);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test03561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03561");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        boolean boolean6 = staff3.isVerified();
        staff3.logout();
        staff3.setVerified(false);
        java.lang.String str10 = staff3.getID();
        staff3.setVerified(false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test03562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03562");
        model.Staff staff3 = new model.Staff("hi!", "hi!", "");
        staff3.setVerified(true);
        boolean boolean6 = staff3.isVerified();
        java.lang.String str7 = staff3.getPassword();
        staff3.logout();
        double double9 = staff3.getHourlyRate();
        java.lang.String str10 = staff3.getID();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 40.0d + "'", double9 == 40.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test03563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03563");
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
        java.lang.String str14 = staff3.getID();
        staff3.logout();
        staff3.login("hi!", "staff");
        double double19 = staff3.getHourlyRate();
        staff3.setVerified(false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "staff" + "'", str8, "staff");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "staff" + "'", str12, "staff");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 40.0d + "'", double19 == 40.0d);
    }

    @Test
    public void test03564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03564");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        double double6 = staff3.getHourlyRate();
        java.lang.String str7 = staff3.getPassword();
        java.lang.String str8 = staff3.getPassword();
        java.lang.String str9 = staff3.getAccountType();
        staff3.login("hi!", "staff");
        java.lang.String str13 = staff3.getID();
        java.lang.String str14 = staff3.getPassword();
        staff3.login("", "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 40.0d + "'", double6 == 40.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "staff" + "'", str9, "staff");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test03565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03565");
        model.Staff staff3 = new model.Staff("hi!", "", "hi!");
        staff3.logout();
        staff3.login("hi!", "hi!");
        staff3.viewProfile();
        java.lang.String str9 = staff3.getID();
        staff3.login("", "");
        staff3.viewProfile();
        java.lang.String str14 = staff3.getEmail();
        java.lang.String str15 = staff3.getAccountType();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "staff" + "'", str15, "staff");
    }

    @Test
    public void test03566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03566");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        boolean boolean6 = staff3.isVerified();
        staff3.login("", "");
        staff3.login("staff", "staff");
        java.lang.String str13 = staff3.getAccountType();
        staff3.login("", "hi!");
        java.lang.String str17 = staff3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "staff" + "'", str13, "staff");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test03567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03567");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        staff3.logout();
        java.lang.String str5 = staff3.getID();
        java.lang.String str6 = staff3.getEmail();
        double double7 = staff3.getHourlyRate();
        java.lang.String str8 = staff3.getEmail();
        staff3.login("", "");
        staff3.login("", "");
        staff3.logout();
        java.lang.String str16 = staff3.getEmail();
        staff3.login("hi!", "staff");
        staff3.login("staff", "");
        staff3.viewProfile();
        staff3.viewProfile();
        java.lang.Class<?> wildcardClass25 = staff3.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 40.0d + "'", double7 == 40.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test03568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03568");
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
        staff3.logout();
        java.lang.String str15 = staff3.getPassword();
        java.lang.String str16 = staff3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test03569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03569");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        boolean boolean6 = staff3.isVerified();
        staff3.logout();
        java.lang.String str8 = staff3.getEmail();
        staff3.viewProfile();
        staff3.logout();
        double double11 = staff3.getHourlyRate();
        double double12 = staff3.getHourlyRate();
        java.lang.String str13 = staff3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 40.0d + "'", double11 == 40.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 40.0d + "'", double12 == 40.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test03570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03570");
        model.Staff staff3 = new model.Staff("hi!", "hi!", "");
        java.lang.String str4 = staff3.getEmail();
        java.lang.String str5 = staff3.getAccountType();
        staff3.logout();
        java.lang.String str7 = staff3.getPassword();
        java.lang.String str8 = staff3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test03571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03571");
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
        java.lang.String str19 = staff3.getPassword();
        boolean boolean20 = staff3.isVerified();
        java.lang.Class<?> wildcardClass21 = staff3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 40.0d + "'", double11 == 40.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "staff" + "'", str18, "staff");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test03572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03572");
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
        double double17 = staff3.getHourlyRate();
        staff3.setVerified(false);
        staff3.login("", "staff");
        double double23 = staff3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "staff" + "'", str8, "staff");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "staff" + "'", str9, "staff");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 40.0d + "'", double17 == 40.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 40.0d + "'", double23 == 40.0d);
    }

    @Test
    public void test03573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03573");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        staff3.logout();
        java.lang.String str5 = staff3.getID();
        java.lang.String str6 = staff3.getEmail();
        java.lang.String str7 = staff3.getPassword();
        java.lang.String str8 = staff3.getID();
        staff3.logout();
        java.lang.String str10 = staff3.getAccountType();
        java.lang.String str11 = staff3.getEmail();
        staff3.login("", "hi!");
        java.lang.String str15 = staff3.getPassword();
        staff3.setVerified(true);
        java.lang.Class<?> wildcardClass18 = staff3.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "staff" + "'", str10, "staff");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test03574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03574");
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
        java.lang.Class<?> wildcardClass17 = staff3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "staff" + "'", str11, "staff");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test03575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03575");
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
        java.lang.String str15 = staff3.getID();
        staff3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "staff" + "'", str13, "staff");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test03576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03576");
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
        staff3.logout();
        staff3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 40.0d + "'", double14 == 40.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test03577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03577");
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
        java.lang.String str15 = staff3.getAccountType();
        staff3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "staff" + "'", str13, "staff");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "staff" + "'", str14, "staff");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "staff" + "'", str15, "staff");
    }

    @Test
    public void test03578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03578");
        model.Staff staff3 = new model.Staff("hi!", "staff", "");
        java.lang.String str4 = staff3.getEmail();
        staff3.logout();
        staff3.setVerified(true);
        double double8 = staff3.getHourlyRate();
        java.lang.String str9 = staff3.getAccountType();
        java.lang.Class<?> wildcardClass10 = staff3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 40.0d + "'", double8 == 40.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "staff" + "'", str9, "staff");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test03579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03579");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        boolean boolean6 = staff3.isVerified();
        staff3.logout();
        java.lang.String str8 = staff3.getAccountType();
        staff3.setVerified(false);
        double double11 = staff3.getHourlyRate();
        boolean boolean12 = staff3.isVerified();
        staff3.login("hi!", "");
        java.lang.String str16 = staff3.getEmail();
        java.lang.String str17 = staff3.getID();
        java.lang.String str18 = staff3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "staff" + "'", str8, "staff");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 40.0d + "'", double11 == 40.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "staff" + "'", str18, "staff");
    }

    @Test
    public void test03580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03580");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        boolean boolean6 = staff3.isVerified();
        staff3.logout();
        java.lang.String str8 = staff3.getEmail();
        staff3.viewProfile();
        staff3.logout();
        double double11 = staff3.getHourlyRate();
        java.lang.String str12 = staff3.getPassword();
        staff3.login("staff", "hi!");
        java.lang.String str16 = staff3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 40.0d + "'", double11 == 40.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "staff" + "'", str16, "staff");
    }

    @Test
    public void test03581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03581");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        boolean boolean5 = staff3.isVerified();
        java.lang.String str6 = staff3.getID();
        boolean boolean7 = staff3.isVerified();
        staff3.logout();
        java.lang.String str9 = staff3.getID();
        staff3.setVerified(true);
        staff3.viewProfile();
        staff3.viewProfile();
        java.lang.String str14 = staff3.getAccountType();
        staff3.logout();
        java.lang.String str16 = staff3.getPassword();
        staff3.viewProfile();
        java.lang.String str18 = staff3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "staff" + "'", str14, "staff");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test03582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03582");
        model.Staff staff3 = new model.Staff("hi!", "hi!", "");
        staff3.logout();
        java.lang.String str5 = staff3.getEmail();
        double double6 = staff3.getHourlyRate();
        java.lang.String str7 = staff3.getAccountType();
        staff3.logout();
        boolean boolean9 = staff3.isVerified();
        staff3.logout();
        staff3.setVerified(false);
        staff3.viewProfile();
        staff3.viewProfile();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 40.0d + "'", double6 == 40.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "staff" + "'", str7, "staff");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test03583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03583");
        model.Staff staff3 = new model.Staff("hi!", "", "hi!");
        staff3.logout();
        staff3.login("hi!", "hi!");
        double double8 = staff3.getHourlyRate();
        java.lang.String str9 = staff3.getID();
        java.lang.String str10 = staff3.getAccountType();
        staff3.setVerified(true);
        staff3.login("hi!", "hi!");
        java.lang.String str16 = staff3.getPassword();
        double double17 = staff3.getHourlyRate();
        staff3.setVerified(false);
        staff3.login("staff", "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 40.0d + "'", double8 == 40.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "staff" + "'", str10, "staff");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 40.0d + "'", double17 == 40.0d);
    }

    @Test
    public void test03584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03584");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        boolean boolean6 = staff3.isVerified();
        staff3.login("", "");
        java.lang.String str10 = staff3.getAccountType();
        staff3.viewProfile();
        staff3.login("", "hi!");
        boolean boolean15 = staff3.isVerified();
        boolean boolean16 = staff3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "staff" + "'", str10, "staff");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test03585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03585");
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
        java.lang.String str13 = staff3.getAccountType();
        staff3.setVerified(false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "staff" + "'", str6, "staff");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "staff" + "'", str13, "staff");
    }

    @Test
    public void test03586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03586");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        boolean boolean5 = staff3.isVerified();
        java.lang.String str6 = staff3.getID();
        staff3.setVerified(false);
        java.lang.String str9 = staff3.getID();
        staff3.setVerified(false);
        boolean boolean12 = staff3.isVerified();
        staff3.setVerified(true);
        java.lang.String str15 = staff3.getID();
        staff3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test03587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03587");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        boolean boolean6 = staff3.isVerified();
        staff3.logout();
        staff3.setVerified(false);
        java.lang.String str10 = staff3.getEmail();
        staff3.logout();
        java.lang.String str12 = staff3.getID();
        staff3.login("", "staff");
        java.lang.String str16 = staff3.getAccountType();
        staff3.logout();
        java.lang.String str18 = staff3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "staff" + "'", str16, "staff");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test03588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03588");
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
        java.lang.String str18 = staff3.getEmail();
        double double19 = staff3.getHourlyRate();
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
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 40.0d + "'", double19 == 40.0d);
    }

    @Test
    public void test03589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03589");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        java.lang.String str6 = staff3.getPassword();
        staff3.setVerified(false);
        staff3.setVerified(true);
        staff3.viewProfile();
        java.lang.String str12 = staff3.getEmail();
        staff3.setVerified(false);
        staff3.viewProfile();
        staff3.login("hi!", "hi!");
        java.lang.String str19 = staff3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test03590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03590");
        model.Staff staff3 = new model.Staff("hi!", "", "hi!");
        staff3.logout();
        staff3.login("hi!", "hi!");
        double double8 = staff3.getHourlyRate();
        java.lang.String str9 = staff3.getID();
        staff3.logout();
        java.lang.String str11 = staff3.getID();
        java.lang.String str12 = staff3.getEmail();
        staff3.viewProfile();
        staff3.viewProfile();
        java.lang.String str15 = staff3.getAccountType();
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 40.0d + "'", double8 == 40.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "staff" + "'", str15, "staff");
    }

    @Test
    public void test03591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03591");
        model.Staff staff3 = new model.Staff("", "staff", "hi!");
        boolean boolean4 = staff3.isVerified();
        java.lang.String str5 = staff3.getID();
        staff3.setVerified(false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test03592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03592");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        boolean boolean5 = staff3.isVerified();
        java.lang.String str6 = staff3.getAccountType();
        java.lang.String str7 = staff3.getAccountType();
        java.lang.String str8 = staff3.getEmail();
        staff3.setVerified(true);
        double double11 = staff3.getHourlyRate();
        staff3.login("hi!", "hi!");
        java.lang.Class<?> wildcardClass15 = staff3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "staff" + "'", str6, "staff");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "staff" + "'", str7, "staff");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 40.0d + "'", double11 == 40.0d);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test03593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03593");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        staff3.logout();
        java.lang.String str5 = staff3.getID();
        java.lang.String str6 = staff3.getEmail();
        double double7 = staff3.getHourlyRate();
        java.lang.String str8 = staff3.getPassword();
        staff3.login("staff", "");
        staff3.setVerified(false);
        java.lang.String str14 = staff3.getPassword();
        java.lang.String str15 = staff3.getAccountType();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 40.0d + "'", double7 == 40.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "staff" + "'", str15, "staff");
    }

    @Test
    public void test03594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03594");
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
        boolean boolean16 = staff3.isVerified();
        staff3.viewProfile();
        staff3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 40.0d + "'", double6 == 40.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 40.0d + "'", double15 == 40.0d);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test03595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03595");
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
        staff3.viewProfile();
        java.lang.Class<?> wildcardClass18 = staff3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 40.0d + "'", double11 == 40.0d);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test03596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03596");
        model.Staff staff3 = new model.Staff("hi!", "", "hi!");
        staff3.logout();
        staff3.login("hi!", "hi!");
        double double8 = staff3.getHourlyRate();
        java.lang.String str9 = staff3.getID();
        java.lang.String str10 = staff3.getAccountType();
        staff3.setVerified(true);
        staff3.logout();
        staff3.viewProfile();
        java.lang.String str15 = staff3.getAccountType();
        java.lang.String str16 = staff3.getID();
        staff3.login("hi!", "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 40.0d + "'", double8 == 40.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "staff" + "'", str10, "staff");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "staff" + "'", str15, "staff");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test03597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03597");
        model.Staff staff3 = new model.Staff("staff", "", "");
        staff3.logout();
        java.lang.String str5 = staff3.getPassword();
        boolean boolean6 = staff3.isVerified();
        double double7 = staff3.getHourlyRate();
        staff3.viewProfile();
        double double9 = staff3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 40.0d + "'", double7 == 40.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 40.0d + "'", double9 == 40.0d);
    }

    @Test
    public void test03598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03598");
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
        staff3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "staff" + "'", str6, "staff");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 40.0d + "'", double10 == 40.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 40.0d + "'", double12 == 40.0d);
    }

    @Test
    public void test03599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03599");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        boolean boolean5 = staff3.isVerified();
        java.lang.String str6 = staff3.getID();
        boolean boolean7 = staff3.isVerified();
        staff3.logout();
        staff3.logout();
        staff3.viewProfile();
        staff3.logout();
        boolean boolean12 = staff3.isVerified();
        java.lang.String str13 = staff3.getEmail();
        java.lang.Class<?> wildcardClass14 = staff3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test03600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03600");
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
        staff3.viewProfile();
        staff3.setVerified(true);
        staff3.viewProfile();
        java.lang.Class<?> wildcardClass22 = staff3.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test03601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03601");
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
        double double14 = staff3.getHourlyRate();
        double double15 = staff3.getHourlyRate();
        java.lang.String str16 = staff3.getEmail();
        java.lang.String str17 = staff3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "staff" + "'", str6, "staff");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "staff" + "'", str12, "staff");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 40.0d + "'", double14 == 40.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 40.0d + "'", double15 == 40.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test03602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03602");
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
        staff3.viewProfile();
        double double18 = staff3.getHourlyRate();
        java.lang.String str19 = staff3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "staff" + "'", str10, "staff");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 40.0d + "'", double16 == 40.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 40.0d + "'", double18 == 40.0d);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test03603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03603");
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
        staff3.login("", "hi!");
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
    }

    @Test
    public void test03604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03604");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        staff3.login("", "");
        staff3.viewProfile();
        staff3.viewProfile();
        staff3.login("", "");
        staff3.viewProfile();
        staff3.logout();
        java.lang.String str14 = staff3.getID();
        java.lang.String str15 = staff3.getID();
        staff3.setVerified(false);
        boolean boolean18 = staff3.isVerified();
        staff3.viewProfile();
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test03605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03605");
        model.Staff staff3 = new model.Staff("hi!", "", "hi!");
        staff3.logout();
        staff3.login("hi!", "hi!");
        double double8 = staff3.getHourlyRate();
        boolean boolean9 = staff3.isVerified();
        java.lang.String str10 = staff3.getAccountType();
        java.lang.String str11 = staff3.getAccountType();
        double double12 = staff3.getHourlyRate();
        double double13 = staff3.getHourlyRate();
        java.lang.String str14 = staff3.getID();
        staff3.login("hi!", "hi!");
        java.lang.String str18 = staff3.getPassword();
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 40.0d + "'", double8 == 40.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "staff" + "'", str10, "staff");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "staff" + "'", str11, "staff");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 40.0d + "'", double12 == 40.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 40.0d + "'", double13 == 40.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test03606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03606");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getEmail();
        boolean boolean6 = staff3.isVerified();
        boolean boolean7 = staff3.isVerified();
        java.lang.String str8 = staff3.getID();
        java.lang.String str9 = staff3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test03607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03607");
        model.Staff staff3 = new model.Staff("hi!", "", "hi!");
        java.lang.String str4 = staff3.getAccountType();
        java.lang.String str5 = staff3.getEmail();
        double double6 = staff3.getHourlyRate();
        staff3.viewProfile();
        boolean boolean8 = staff3.isVerified();
        java.lang.String str9 = staff3.getEmail();
        java.lang.String str10 = staff3.getEmail();
        java.lang.Class<?> wildcardClass11 = staff3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "staff" + "'", str4, "staff");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 40.0d + "'", double6 == 40.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test03608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03608");
        model.Staff staff3 = new model.Staff("hi!", "", "hi!");
        staff3.setVerified(false);
        staff3.viewProfile();
        java.lang.String str7 = staff3.getEmail();
        java.lang.String str8 = staff3.getAccountType();
        staff3.logout();
        boolean boolean10 = staff3.isVerified();
        staff3.login("hi!", "hi!");
        java.lang.String str14 = staff3.getPassword();
        staff3.setVerified(false);
        staff3.viewProfile();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "staff" + "'", str8, "staff");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test03609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03609");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        staff3.logout();
        java.lang.String str5 = staff3.getID();
        java.lang.String str6 = staff3.getEmail();
        java.lang.String str7 = staff3.getPassword();
        java.lang.String str8 = staff3.getID();
        staff3.logout();
        java.lang.String str10 = staff3.getAccountType();
        java.lang.String str11 = staff3.getEmail();
        staff3.logout();
        java.lang.String str13 = staff3.getID();
        boolean boolean14 = staff3.isVerified();
        staff3.viewProfile();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "staff" + "'", str10, "staff");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test03610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03610");
        model.Staff staff3 = new model.Staff("", "staff", "");
        java.lang.String str4 = staff3.getPassword();
        java.lang.String str5 = staff3.getEmail();
        staff3.viewProfile();
        java.lang.String str7 = staff3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "staff" + "'", str4, "staff");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test03611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03611");
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
        staff3.logout();
        java.lang.String str14 = staff3.getID();
        boolean boolean15 = staff3.isVerified();
        java.lang.String str16 = staff3.getID();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 40.0d + "'", double11 == 40.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "staff" + "'", str12, "staff");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test03612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03612");
        model.Staff staff3 = new model.Staff("", "staff", "");
        staff3.setVerified(true);
        staff3.login("", "hi!");
        boolean boolean9 = staff3.isVerified();
        staff3.logout();
        java.lang.String str11 = staff3.getID();
        java.lang.String str12 = staff3.getID();
        double double13 = staff3.getHourlyRate();
        java.lang.String str14 = staff3.getPassword();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 40.0d + "'", double13 == 40.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "staff" + "'", str14, "staff");
    }

    @Test
    public void test03613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03613");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        boolean boolean5 = staff3.isVerified();
        java.lang.String str6 = staff3.getAccountType();
        staff3.logout();
        java.lang.String str8 = staff3.getAccountType();
        double double9 = staff3.getHourlyRate();
        staff3.logout();
        staff3.setVerified(false);
        java.lang.String str13 = staff3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "staff" + "'", str6, "staff");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "staff" + "'", str8, "staff");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 40.0d + "'", double9 == 40.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test03614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03614");
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
        staff3.logout();
        boolean boolean18 = staff3.isVerified();
        boolean boolean19 = staff3.isVerified();
        java.lang.String str20 = staff3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "staff" + "'", str10, "staff");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 40.0d + "'", double15 == 40.0d);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test03615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03615");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        boolean boolean5 = staff3.isVerified();
        java.lang.String str6 = staff3.getID();
        staff3.setVerified(false);
        java.lang.String str9 = staff3.getID();
        staff3.setVerified(false);
        java.lang.String str12 = staff3.getID();
        double double13 = staff3.getHourlyRate();
        java.lang.String str14 = staff3.getID();
        staff3.setVerified(false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 40.0d + "'", double13 == 40.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test03616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03616");
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
        double double17 = staff3.getHourlyRate();
        boolean boolean18 = staff3.isVerified();
        java.lang.Class<?> wildcardClass19 = staff3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 40.0d + "'", double13 == 40.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 40.0d + "'", double17 == 40.0d);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test03617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03617");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        boolean boolean5 = staff3.isVerified();
        java.lang.String str6 = staff3.getID();
        staff3.setVerified(false);
        java.lang.String str9 = staff3.getID();
        java.lang.String str10 = staff3.getAccountType();
        java.lang.String str11 = staff3.getPassword();
        java.lang.String str12 = staff3.getID();
        java.lang.String str13 = staff3.getAccountType();
        double double14 = staff3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "staff" + "'", str10, "staff");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "staff" + "'", str13, "staff");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 40.0d + "'", double14 == 40.0d);
    }

    @Test
    public void test03618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03618");
        model.Staff staff3 = new model.Staff("hi!", "hi!", "");
        java.lang.String str4 = staff3.getEmail();
        java.lang.String str5 = staff3.getPassword();
        java.lang.Class<?> wildcardClass6 = staff3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test03619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03619");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        double double6 = staff3.getHourlyRate();
        java.lang.String str7 = staff3.getPassword();
        java.lang.String str8 = staff3.getPassword();
        staff3.login("staff", "hi!");
        staff3.login("", "hi!");
        java.lang.Class<?> wildcardClass15 = staff3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 40.0d + "'", double6 == 40.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test03620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03620");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getEmail();
        boolean boolean6 = staff3.isVerified();
        staff3.logout();
        staff3.login("hi!", "staff");
        double double11 = staff3.getHourlyRate();
        java.lang.String str12 = staff3.getAccountType();
        staff3.login("", "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 40.0d + "'", double11 == 40.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "staff" + "'", str12, "staff");
    }

    @Test
    public void test03621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03621");
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
        staff3.login("hi!", "staff");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test03622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03622");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        boolean boolean5 = staff3.isVerified();
        java.lang.String str6 = staff3.getAccountType();
        staff3.logout();
        java.lang.String str8 = staff3.getEmail();
        staff3.viewProfile();
        java.lang.String str10 = staff3.getID();
        staff3.logout();
        staff3.logout();
        staff3.setVerified(false);
        double double15 = staff3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "staff" + "'", str6, "staff");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 40.0d + "'", double15 == 40.0d);
    }

    @Test
    public void test03623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03623");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        staff3.logout();
        java.lang.String str5 = staff3.getID();
        java.lang.String str6 = staff3.getEmail();
        staff3.viewProfile();
        staff3.setVerified(false);
        java.lang.String str10 = staff3.getID();
        java.lang.String str11 = staff3.getAccountType();
        staff3.logout();
        double double13 = staff3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "staff" + "'", str11, "staff");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 40.0d + "'", double13 == 40.0d);
    }

    @Test
    public void test03624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03624");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        staff3.setVerified(false);
        boolean boolean7 = staff3.isVerified();
        java.lang.String str8 = staff3.getPassword();
        java.lang.Class<?> wildcardClass9 = staff3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test03625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03625");
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
        staff3.login("", "staff");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "staff" + "'", str11, "staff");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test03626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03626");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        boolean boolean5 = staff3.isVerified();
        java.lang.String str6 = staff3.getAccountType();
        java.lang.String str7 = staff3.getAccountType();
        java.lang.String str8 = staff3.getEmail();
        staff3.logout();
        boolean boolean10 = staff3.isVerified();
        java.lang.String str11 = staff3.getPassword();
        staff3.setVerified(true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "staff" + "'", str6, "staff");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "staff" + "'", str7, "staff");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test03627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03627");
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
        java.lang.Class<?> wildcardClass20 = staff3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "staff" + "'", str6, "staff");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 40.0d + "'", double8 == 40.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "staff" + "'", str10, "staff");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test03628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03628");
        model.Staff staff3 = new model.Staff("hi!", "staff", "");
        java.lang.String str4 = staff3.getEmail();
        staff3.logout();
        java.lang.String str6 = staff3.getID();
        boolean boolean7 = staff3.isVerified();
        double double8 = staff3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 40.0d + "'", double8 == 40.0d);
    }

    @Test
    public void test03629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03629");
        model.Staff staff3 = new model.Staff("hi!", "", "hi!");
        staff3.setVerified(false);
        java.lang.String str6 = staff3.getEmail();
        java.lang.String str7 = staff3.getAccountType();
        staff3.viewProfile();
        java.lang.String str9 = staff3.getAccountType();
        java.lang.String str10 = staff3.getPassword();
        staff3.setVerified(true);
        staff3.viewProfile();
        staff3.logout();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "staff" + "'", str7, "staff");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "staff" + "'", str9, "staff");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test03630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03630");
        model.Staff staff3 = new model.Staff("staff", "", "staff");
        staff3.setVerified(false);
        staff3.viewProfile();
        java.lang.String str7 = staff3.getEmail();
        java.lang.String str8 = staff3.getID();
        java.lang.String str9 = staff3.getID();
        boolean boolean10 = staff3.isVerified();
        double double11 = staff3.getHourlyRate();
        staff3.viewProfile();
        staff3.setVerified(true);
        staff3.viewProfile();
        staff3.logout();
        java.lang.Class<?> wildcardClass17 = staff3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "staff" + "'", str7, "staff");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "staff" + "'", str8, "staff");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "staff" + "'", str9, "staff");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 40.0d + "'", double11 == 40.0d);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test03631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03631");
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
        java.lang.String str19 = staff3.getEmail();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 40.0d + "'", double13 == 40.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 40.0d + "'", double14 == 40.0d);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test03632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03632");
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
        java.lang.String str15 = staff3.getPassword();
        staff3.setVerified(false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "staff" + "'", str6, "staff");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 40.0d + "'", double12 == 40.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "staff" + "'", str14, "staff");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test03633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03633");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        staff3.logout();
        java.lang.String str5 = staff3.getID();
        java.lang.String str6 = staff3.getEmail();
        double double7 = staff3.getHourlyRate();
        java.lang.String str8 = staff3.getEmail();
        boolean boolean9 = staff3.isVerified();
        java.lang.String str10 = staff3.getAccountType();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 40.0d + "'", double7 == 40.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "staff" + "'", str10, "staff");
    }

    @Test
    public void test03634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03634");
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
        boolean boolean14 = staff3.isVerified();
        staff3.login("hi!", "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "staff" + "'", str10, "staff");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test03635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03635");
        model.Staff staff3 = new model.Staff("hi!", "hi!", "hi!");
        staff3.login("hi!", "staff");
        staff3.logout();
        java.lang.String str8 = staff3.getPassword();
        staff3.login("hi!", "hi!");
        java.lang.String str12 = staff3.getAccountType();
        double double13 = staff3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "staff" + "'", str12, "staff");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 40.0d + "'", double13 == 40.0d);
    }

    @Test
    public void test03636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03636");
        model.Staff staff3 = new model.Staff("hi!", "staff", "");
        staff3.logout();
        java.lang.String str5 = staff3.getEmail();
        java.lang.String str6 = staff3.getEmail();
        java.lang.Class<?> wildcardClass7 = staff3.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test03637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03637");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        boolean boolean6 = staff3.isVerified();
        staff3.logout();
        java.lang.String str8 = staff3.getAccountType();
        staff3.setVerified(false);
        staff3.viewProfile();
        staff3.viewProfile();
        java.lang.String str13 = staff3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "staff" + "'", str8, "staff");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test03638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03638");
        model.Staff staff3 = new model.Staff("staff", "hi!", "hi!");
        java.lang.String str4 = staff3.getEmail();
        staff3.setVerified(true);
        double double7 = staff3.getHourlyRate();
        java.lang.Class<?> wildcardClass8 = staff3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "staff" + "'", str4, "staff");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 40.0d + "'", double7 == 40.0d);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test03639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03639");
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
        java.lang.String str17 = staff3.getAccountType();
        java.lang.String str18 = staff3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "staff" + "'", str13, "staff");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "staff" + "'", str17, "staff");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "staff" + "'", str18, "staff");
    }

    @Test
    public void test03640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03640");
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
        java.lang.String str19 = staff3.getID();
        java.lang.String str20 = staff3.getEmail();
        staff3.setVerified(true);
        staff3.viewProfile();
        double double24 = staff3.getHourlyRate();
        java.lang.String str25 = staff3.getAccountType();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 40.0d + "'", double7 == 40.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "staff" + "'", str15, "staff");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 40.0d + "'", double24 == 40.0d);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "staff" + "'", str25, "staff");
    }

    @Test
    public void test03641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03641");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        double double6 = staff3.getHourlyRate();
        staff3.logout();
        staff3.viewProfile();
        java.lang.String str9 = staff3.getEmail();
        java.lang.String str10 = staff3.getEmail();
        java.lang.String str11 = staff3.getAccountType();
        java.lang.String str12 = staff3.getPassword();
        java.lang.String str13 = staff3.getID();
        staff3.setVerified(false);
        java.lang.Class<?> wildcardClass16 = staff3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 40.0d + "'", double6 == 40.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "staff" + "'", str11, "staff");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test03642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03642");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        staff3.logout();
        java.lang.String str5 = staff3.getID();
        java.lang.String str6 = staff3.getEmail();
        staff3.viewProfile();
        staff3.setVerified(false);
        staff3.logout();
        java.lang.String str11 = staff3.getEmail();
        staff3.login("hi!", "hi!");
        java.lang.String str15 = staff3.getAccountType();
        java.lang.String str16 = staff3.getAccountType();
        staff3.viewProfile();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "staff" + "'", str15, "staff");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "staff" + "'", str16, "staff");
    }

    @Test
    public void test03643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03643");
        model.Staff staff3 = new model.Staff("hi!", "hi!", "");
        staff3.setVerified(false);
        staff3.viewProfile();
        java.lang.String str7 = staff3.getPassword();
        java.lang.Class<?> wildcardClass8 = staff3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test03644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03644");
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
        java.lang.String str14 = staff3.getEmail();
        staff3.login("hi!", "staff");
        java.lang.String str18 = staff3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "staff" + "'", str10, "staff");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "staff" + "'", str18, "staff");
    }

    @Test
    public void test03645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03645");
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
        staff3.viewProfile();
        java.lang.String str19 = staff3.getEmail();
        boolean boolean20 = staff3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "staff" + "'", str10, "staff");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test03646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03646");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        java.lang.String str6 = staff3.getPassword();
        staff3.setVerified(false);
        java.lang.String str9 = staff3.getPassword();
        double double10 = staff3.getHourlyRate();
        java.lang.String str11 = staff3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 40.0d + "'", double10 == 40.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "staff" + "'", str11, "staff");
    }

    @Test
    public void test03647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03647");
        model.Staff staff3 = new model.Staff("", "staff", "");
        java.lang.String str4 = staff3.getPassword();
        java.lang.String str5 = staff3.getEmail();
        staff3.logout();
        staff3.login("staff", "");
        java.lang.String str10 = staff3.getAccountType();
        boolean boolean11 = staff3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "staff" + "'", str4, "staff");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "staff" + "'", str10, "staff");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test03648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03648");
        model.Staff staff3 = new model.Staff("", "staff", "staff");
        double double4 = staff3.getHourlyRate();
        java.lang.String str5 = staff3.getAccountType();
        double double6 = staff3.getHourlyRate();
        java.lang.String str7 = staff3.getPassword();
        double double8 = staff3.getHourlyRate();
        boolean boolean9 = staff3.isVerified();
        java.lang.Class<?> wildcardClass10 = staff3.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 40.0d + "'", double4 == 40.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 40.0d + "'", double6 == 40.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "staff" + "'", str7, "staff");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 40.0d + "'", double8 == 40.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test03649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03649");
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
        java.lang.String str14 = staff3.getEmail();
        boolean boolean15 = staff3.isVerified();
        staff3.setVerified(true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "staff" + "'", str10, "staff");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test03650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03650");
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
        java.lang.String str21 = staff3.getPassword();
        java.lang.String str22 = staff3.getPassword();
        java.lang.String str23 = staff3.getID();
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
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
    }

    @Test
    public void test03651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03651");
        model.Staff staff3 = new model.Staff("hi!", "", "hi!");
        staff3.setVerified(false);
        java.lang.String str6 = staff3.getEmail();
        java.lang.String str7 = staff3.getAccountType();
        staff3.viewProfile();
        java.lang.String str9 = staff3.getAccountType();
        java.lang.String str10 = staff3.getPassword();
        double double11 = staff3.getHourlyRate();
        boolean boolean12 = staff3.isVerified();
        java.lang.String str13 = staff3.getEmail();
        staff3.login("hi!", "hi!");
        staff3.setVerified(true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "staff" + "'", str7, "staff");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "staff" + "'", str9, "staff");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 40.0d + "'", double11 == 40.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test03652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03652");
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
        java.lang.String str14 = staff3.getPassword();
        boolean boolean15 = staff3.isVerified();
        staff3.logout();
        java.lang.Class<?> wildcardClass17 = staff3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 40.0d + "'", double11 == 40.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test03653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03653");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        staff3.logout();
        java.lang.String str5 = staff3.getID();
        java.lang.String str6 = staff3.getEmail();
        double double7 = staff3.getHourlyRate();
        java.lang.String str8 = staff3.getEmail();
        java.lang.String str9 = staff3.getID();
        staff3.login("", "");
        staff3.login("", "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 40.0d + "'", double7 == 40.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test03654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03654");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        staff3.logout();
        staff3.viewProfile();
        staff3.viewProfile();
        double double7 = staff3.getHourlyRate();
        java.lang.String str8 = staff3.getPassword();
        java.lang.String str9 = staff3.getPassword();
        staff3.setVerified(true);
        staff3.login("", "hi!");
        java.lang.String str15 = staff3.getPassword();
        java.lang.String str16 = staff3.getEmail();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 40.0d + "'", double7 == 40.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test03655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03655");
        model.Staff staff3 = new model.Staff("hi!", "staff", "");
        java.lang.String str4 = staff3.getEmail();
        staff3.viewProfile();
        staff3.setVerified(true);
        java.lang.Class<?> wildcardClass8 = staff3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test03656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03656");
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
        staff3.setVerified(true);
        java.lang.String str19 = staff3.getAccountType();
        java.lang.String str20 = staff3.getEmail();
        java.lang.String str21 = staff3.getPassword();
        java.lang.String str22 = staff3.getID();
        staff3.viewProfile();
        boolean boolean24 = staff3.isVerified();
        java.lang.String str25 = staff3.getPassword();
        java.lang.Class<?> wildcardClass26 = staff3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "staff" + "'", str19, "staff");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test03657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03657");
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
        boolean boolean13 = staff3.isVerified();
        double double14 = staff3.getHourlyRate();
        staff3.login("staff", "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 40.0d + "'", double7 == 40.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "staff" + "'", str10, "staff");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 40.0d + "'", double11 == 40.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 40.0d + "'", double14 == 40.0d);
    }

    @Test
    public void test03658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03658");
        model.Staff staff3 = new model.Staff("hi!", "", "hi!");
        staff3.logout();
        staff3.login("hi!", "hi!");
        java.lang.String str8 = staff3.getID();
        java.lang.String str9 = staff3.getEmail();
        double double10 = staff3.getHourlyRate();
        java.lang.String str11 = staff3.getEmail();
        java.lang.String str12 = staff3.getEmail();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 40.0d + "'", double10 == 40.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test03659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03659");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        boolean boolean5 = staff3.isVerified();
        java.lang.String str6 = staff3.getID();
        staff3.login("", "staff");
        staff3.login("hi!", "hi!");
        java.lang.String str13 = staff3.getAccountType();
        java.lang.String str14 = staff3.getPassword();
        java.lang.String str15 = staff3.getPassword();
        java.lang.String str16 = staff3.getID();
        staff3.logout();
        staff3.login("staff", "staff");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "staff" + "'", str13, "staff");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test03660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03660");
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
        boolean boolean18 = staff3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "staff" + "'", str12, "staff");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 40.0d + "'", double17 == 40.0d);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test03661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03661");
        model.Staff staff3 = new model.Staff("hi!", "", "hi!");
        staff3.logout();
        java.lang.String str5 = staff3.getAccountType();
        staff3.viewProfile();
        boolean boolean7 = staff3.isVerified();
        java.lang.String str8 = staff3.getPassword();
        staff3.setVerified(false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test03662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03662");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        staff3.login("", "");
        staff3.viewProfile();
        staff3.viewProfile();
        staff3.login("", "");
        boolean boolean12 = staff3.isVerified();
        staff3.viewProfile();
        double double14 = staff3.getHourlyRate();
        staff3.viewProfile();
        staff3.setVerified(false);
        java.lang.Class<?> wildcardClass18 = staff3.getClass();
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 40.0d + "'", double14 == 40.0d);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test03663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03663");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        boolean boolean6 = staff3.isVerified();
        staff3.logout();
        staff3.setVerified(false);
        java.lang.String str10 = staff3.getEmail();
        staff3.logout();
        staff3.viewProfile();
        java.lang.String str13 = staff3.getID();
        java.lang.String str14 = staff3.getAccountType();
        staff3.setVerified(false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "staff" + "'", str14, "staff");
    }

    @Test
    public void test03664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03664");
        model.Staff staff3 = new model.Staff("hi!", "", "hi!");
        staff3.logout();
        staff3.login("hi!", "hi!");
        staff3.viewProfile();
        java.lang.String str9 = staff3.getPassword();
        java.lang.String str10 = staff3.getID();
        staff3.logout();
        staff3.login("", "staff");
        staff3.login("", "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test03665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03665");
        model.Staff staff3 = new model.Staff("hi!", "", "hi!");
        double double4 = staff3.getHourlyRate();
        boolean boolean5 = staff3.isVerified();
        staff3.viewProfile();
        staff3.logout();
        java.lang.String str8 = staff3.getAccountType();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 40.0d + "'", double4 == 40.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "staff" + "'", str8, "staff");
    }

    @Test
    public void test03666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03666");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        java.lang.String str6 = staff3.getPassword();
        java.lang.String str7 = staff3.getPassword();
        staff3.login("hi!", "hi!");
        boolean boolean11 = staff3.isVerified();
        java.lang.String str12 = staff3.getEmail();
        double double13 = staff3.getHourlyRate();
        staff3.viewProfile();
        java.lang.Class<?> wildcardClass15 = staff3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 40.0d + "'", double13 == 40.0d);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test03667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03667");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        staff3.logout();
        java.lang.String str5 = staff3.getID();
        java.lang.String str6 = staff3.getEmail();
        double double7 = staff3.getHourlyRate();
        java.lang.String str8 = staff3.getPassword();
        staff3.login("hi!", "hi!");
        boolean boolean12 = staff3.isVerified();
        staff3.setVerified(false);
        java.lang.Class<?> wildcardClass15 = staff3.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 40.0d + "'", double7 == 40.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test03668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03668");
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
        double double14 = staff3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "staff" + "'", str6, "staff");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "staff" + "'", str10, "staff");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 40.0d + "'", double11 == 40.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 40.0d + "'", double13 == 40.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 40.0d + "'", double14 == 40.0d);
    }

    @Test
    public void test03669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03669");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        staff3.logout();
        staff3.viewProfile();
        staff3.viewProfile();
        staff3.logout();
        boolean boolean8 = staff3.isVerified();
        java.lang.String str9 = staff3.getPassword();
        double double10 = staff3.getHourlyRate();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 40.0d + "'", double10 == 40.0d);
    }

    @Test
    public void test03670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03670");
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
        staff3.login("staff", "staff");
        staff3.login("staff", "");
        boolean boolean19 = staff3.isVerified();
        staff3.logout();
        staff3.viewProfile();
        java.lang.Class<?> wildcardClass22 = staff3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 40.0d + "'", double6 == 40.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test03671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03671");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        boolean boolean6 = staff3.isVerified();
        staff3.viewProfile();
        boolean boolean8 = staff3.isVerified();
        staff3.login("hi!", "staff");
        double double12 = staff3.getHourlyRate();
        java.lang.Class<?> wildcardClass13 = staff3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 40.0d + "'", double12 == 40.0d);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test03672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03672");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        boolean boolean5 = staff3.isVerified();
        java.lang.String str6 = staff3.getAccountType();
        staff3.logout();
        java.lang.String str8 = staff3.getEmail();
        staff3.viewProfile();
        double double10 = staff3.getHourlyRate();
        java.lang.String str11 = staff3.getID();
        double double12 = staff3.getHourlyRate();
        java.lang.String str13 = staff3.getEmail();
        staff3.viewProfile();
        java.lang.String str15 = staff3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "staff" + "'", str6, "staff");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 40.0d + "'", double10 == 40.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 40.0d + "'", double12 == 40.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "staff" + "'", str15, "staff");
    }

    @Test
    public void test03673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03673");
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
        staff3.setVerified(false);
        java.lang.Class<?> wildcardClass15 = staff3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 40.0d + "'", double10 == 40.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "staff" + "'", str11, "staff");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test03674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03674");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        boolean boolean5 = staff3.isVerified();
        java.lang.String str6 = staff3.getID();
        java.lang.String str7 = staff3.getID();
        java.lang.String str8 = staff3.getEmail();
        staff3.logout();
        java.lang.String str10 = staff3.getAccountType();
        staff3.login("hi!", "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "staff" + "'", str10, "staff");
    }

    @Test
    public void test03675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03675");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        boolean boolean5 = staff3.isVerified();
        java.lang.String str6 = staff3.getID();
        boolean boolean7 = staff3.isVerified();
        staff3.logout();
        java.lang.String str9 = staff3.getID();
        java.lang.String str10 = staff3.getID();
        double double11 = staff3.getHourlyRate();
        staff3.login("hi!", "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 40.0d + "'", double11 == 40.0d);
    }

    @Test
    public void test03676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03676");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        staff3.login("", "");
        double double7 = staff3.getHourlyRate();
        staff3.login("staff", "staff");
        java.lang.String str11 = staff3.getID();
        java.lang.String str12 = staff3.getAccountType();
        staff3.logout();
        staff3.setVerified(false);
        boolean boolean16 = staff3.isVerified();
        boolean boolean17 = staff3.isVerified();
        staff3.login("hi!", "staff");
        java.lang.Class<?> wildcardClass21 = staff3.getClass();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 40.0d + "'", double7 == 40.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "staff" + "'", str12, "staff");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test03677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03677");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        java.lang.String str6 = staff3.getPassword();
        java.lang.String str7 = staff3.getPassword();
        java.lang.String str8 = staff3.getID();
        double double9 = staff3.getHourlyRate();
        java.lang.String str10 = staff3.getPassword();
        staff3.logout();
        java.lang.String str12 = staff3.getID();
        java.lang.String str13 = staff3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 40.0d + "'", double9 == 40.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test03678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03678");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        staff3.logout();
        java.lang.String str5 = staff3.getID();
        java.lang.String str6 = staff3.getEmail();
        java.lang.String str7 = staff3.getEmail();
        java.lang.String str8 = staff3.getEmail();
        java.lang.String str9 = staff3.getID();
        java.lang.String str10 = staff3.getPassword();
        staff3.viewProfile();
        java.lang.Class<?> wildcardClass12 = staff3.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test03679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03679");
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
        staff3.setVerified(false);
        java.lang.String str17 = staff3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "staff" + "'", str8, "staff");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 40.0d + "'", double13 == 40.0d);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test03680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03680");
        model.Staff staff3 = new model.Staff("", "staff", "");
        staff3.setVerified(true);
        staff3.login("", "hi!");
        staff3.viewProfile();
        java.lang.String str10 = staff3.getID();
        staff3.viewProfile();
        java.lang.String str12 = staff3.getEmail();
        java.lang.Class<?> wildcardClass13 = staff3.getClass();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test03681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03681");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        double double6 = staff3.getHourlyRate();
        staff3.setVerified(true);
        staff3.login("hi!", "");
        java.lang.String str12 = staff3.getPassword();
        staff3.login("hi!", "");
        java.lang.String str16 = staff3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 40.0d + "'", double6 == 40.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test03682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03682");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        boolean boolean6 = staff3.isVerified();
        staff3.viewProfile();
        boolean boolean8 = staff3.isVerified();
        java.lang.String str9 = staff3.getEmail();
        java.lang.String str10 = staff3.getPassword();
        java.lang.String str11 = staff3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test03683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03683");
        model.Staff staff3 = new model.Staff("", "staff", "");
        staff3.setVerified(true);
        staff3.login("", "hi!");
        staff3.viewProfile();
        java.lang.String str10 = staff3.getID();
        staff3.viewProfile();
        double double12 = staff3.getHourlyRate();
        double double13 = staff3.getHourlyRate();
        staff3.viewProfile();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 40.0d + "'", double12 == 40.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 40.0d + "'", double13 == 40.0d);
    }

    @Test
    public void test03684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03684");
        model.Staff staff3 = new model.Staff("staff", "hi!", "hi!");
        java.lang.String str4 = staff3.getEmail();
        staff3.login("hi!", "hi!");
        staff3.viewProfile();
        java.lang.String str9 = staff3.getPassword();
        staff3.login("staff", "hi!");
        java.lang.String str13 = staff3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "staff" + "'", str4, "staff");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test03685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03685");
        model.Staff staff3 = new model.Staff("hi!", "", "hi!");
        staff3.setVerified(false);
        java.lang.String str6 = staff3.getPassword();
        java.lang.String str7 = staff3.getAccountType();
        java.lang.String str8 = staff3.getEmail();
        staff3.setVerified(true);
        java.lang.String str11 = staff3.getAccountType();
        staff3.login("staff", "");
        boolean boolean15 = staff3.isVerified();
        java.lang.String str16 = staff3.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "staff" + "'", str7, "staff");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "staff" + "'", str11, "staff");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test03686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03686");
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
        staff3.viewProfile();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "staff" + "'", str8, "staff");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 40.0d + "'", double14 == 40.0d);
    }

    @Test
    public void test03687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03687");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        staff3.logout();
        java.lang.String str5 = staff3.getID();
        java.lang.String str6 = staff3.getEmail();
        double double7 = staff3.getHourlyRate();
        java.lang.String str8 = staff3.getPassword();
        staff3.login("hi!", "hi!");
        staff3.logout();
        double double13 = staff3.getHourlyRate();
        java.lang.Class<?> wildcardClass14 = staff3.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 40.0d + "'", double7 == 40.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 40.0d + "'", double13 == 40.0d);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test03688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03688");
        model.Staff staff3 = new model.Staff("hi!", "hi!", "");
        staff3.setVerified(true);
        java.lang.String str6 = staff3.getID();
        staff3.setVerified(true);
        java.lang.Class<?> wildcardClass9 = staff3.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test03689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03689");
        model.Staff staff3 = new model.Staff("hi!", "", "hi!");
        java.lang.String str4 = staff3.getAccountType();
        java.lang.String str5 = staff3.getEmail();
        double double6 = staff3.getHourlyRate();
        double double7 = staff3.getHourlyRate();
        java.lang.String str8 = staff3.getPassword();
        boolean boolean9 = staff3.isVerified();
        java.lang.String str10 = staff3.getPassword();
        java.lang.String str11 = staff3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "staff" + "'", str4, "staff");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 40.0d + "'", double6 == 40.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 40.0d + "'", double7 == 40.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test03690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03690");
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
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "staff" + "'", str16, "staff");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test03691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03691");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        boolean boolean5 = staff3.isVerified();
        java.lang.String str6 = staff3.getID();
        java.lang.String str7 = staff3.getID();
        staff3.login("hi!", "");
        java.lang.String str11 = staff3.getPassword();
        staff3.setVerified(false);
        java.lang.String str14 = staff3.getID();
        staff3.setVerified(true);
        staff3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test03692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03692");
        model.Staff staff3 = new model.Staff("hi!", "", "hi!");
        staff3.setVerified(false);
        staff3.viewProfile();
        java.lang.String str7 = staff3.getEmail();
        java.lang.String str8 = staff3.getAccountType();
        java.lang.String str9 = staff3.getID();
        java.lang.String str10 = staff3.getID();
        staff3.viewProfile();
        java.lang.String str12 = staff3.getEmail();
        java.lang.Class<?> wildcardClass13 = staff3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "staff" + "'", str8, "staff");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test03693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03693");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        staff3.logout();
        java.lang.String str5 = staff3.getID();
        java.lang.String str6 = staff3.getPassword();
        staff3.logout();
        staff3.login("staff", "hi!");
        java.lang.String str11 = staff3.getID();
        staff3.logout();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test03694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03694");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        boolean boolean6 = staff3.isVerified();
        staff3.logout();
        staff3.setVerified(false);
        java.lang.String str10 = staff3.getEmail();
        double double11 = staff3.getHourlyRate();
        java.lang.String str12 = staff3.getEmail();
        double double13 = staff3.getHourlyRate();
        java.lang.String str14 = staff3.getID();
        double double15 = staff3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 40.0d + "'", double11 == 40.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 40.0d + "'", double13 == 40.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 40.0d + "'", double15 == 40.0d);
    }

    @Test
    public void test03695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03695");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        java.lang.String str6 = staff3.getPassword();
        staff3.setVerified(false);
        staff3.setVerified(true);
        staff3.viewProfile();
        java.lang.String str12 = staff3.getID();
        double double13 = staff3.getHourlyRate();
        double double14 = staff3.getHourlyRate();
        java.lang.String str15 = staff3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 40.0d + "'", double13 == 40.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 40.0d + "'", double14 == 40.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test03696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03696");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        staff3.logout();
        staff3.setVerified(false);
        java.lang.String str7 = staff3.getAccountType();
        java.lang.String str8 = staff3.getEmail();
        java.lang.String str9 = staff3.getID();
        staff3.login("", "hi!");
        java.lang.Class<?> wildcardClass13 = staff3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "staff" + "'", str7, "staff");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test03697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03697");
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
        boolean boolean14 = staff3.isVerified();
        java.lang.String str15 = staff3.getEmail();
        staff3.login("staff", "hi!");
        staff3.login("", "staff");
        java.lang.String str22 = staff3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "staff" + "'", str11, "staff");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 40.0d + "'", double13 == 40.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test03698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03698");
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
        boolean boolean13 = staff3.isVerified();
        java.lang.String str14 = staff3.getAccountType();
        java.lang.String str15 = staff3.getAccountType();
        java.lang.String str16 = staff3.getID();
        staff3.login("staff", "staff");
        java.lang.Class<?> wildcardClass20 = staff3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 40.0d + "'", double6 == 40.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "staff" + "'", str11, "staff");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "staff" + "'", str14, "staff");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "staff" + "'", str15, "staff");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test03699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03699");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        boolean boolean6 = staff3.isVerified();
        staff3.viewProfile();
        staff3.viewProfile();
        staff3.login("hi!", "hi!");
        java.lang.String str12 = staff3.getPassword();
        java.lang.String str13 = staff3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test03700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03700");
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
        java.lang.String str19 = staff3.getID();
        double double20 = staff3.getHourlyRate();
        staff3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "staff" + "'", str13, "staff");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 40.0d + "'", double20 == 40.0d);
    }

    @Test
    public void test03701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03701");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getID();
        staff3.setVerified(false);
        boolean boolean8 = staff3.isVerified();
        staff3.setVerified(false);
        staff3.setVerified(false);
        staff3.logout();
        java.lang.Class<?> wildcardClass14 = staff3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test03702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03702");
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
        staff3.logout();
        staff3.setVerified(true);
        staff3.setVerified(true);
        staff3.setVerified(false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test03703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03703");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        boolean boolean5 = staff3.isVerified();
        java.lang.String str6 = staff3.getAccountType();
        staff3.login("hi!", "hi!");
        staff3.login("", "staff");
        java.lang.String str13 = staff3.getAccountType();
        java.lang.Class<?> wildcardClass14 = staff3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "staff" + "'", str6, "staff");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "staff" + "'", str13, "staff");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test03704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03704");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getEmail();
        boolean boolean6 = staff3.isVerified();
        staff3.logout();
        double double8 = staff3.getHourlyRate();
        double double9 = staff3.getHourlyRate();
        staff3.viewProfile();
        java.lang.String str11 = staff3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 40.0d + "'", double8 == 40.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 40.0d + "'", double9 == 40.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test03705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03705");
        model.Staff staff3 = new model.Staff("hi!", "staff", "hi!");
        staff3.logout();
        staff3.setVerified(false);
        staff3.logout();
        boolean boolean8 = staff3.isVerified();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test03706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03706");
        model.Staff staff3 = new model.Staff("staff", "hi!", "");
        staff3.login("", "staff");
    }

    @Test
    public void test03707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03707");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        double double6 = staff3.getHourlyRate();
        staff3.logout();
        staff3.viewProfile();
        java.lang.String str9 = staff3.getEmail();
        java.lang.String str10 = staff3.getEmail();
        java.lang.String str11 = staff3.getID();
        staff3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 40.0d + "'", double6 == 40.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test03708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03708");
        model.Staff staff3 = new model.Staff("hi!", "staff", "");
        java.lang.String str4 = staff3.getEmail();
        staff3.logout();
        java.lang.String str6 = staff3.getID();
        java.lang.String str7 = staff3.getPassword();
        staff3.login("staff", "staff");
        staff3.logout();
        double double12 = staff3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "staff" + "'", str7, "staff");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 40.0d + "'", double12 == 40.0d);
    }

    @Test
    public void test03709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03709");
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
        staff3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 40.0d + "'", double11 == 40.0d);
    }

    @Test
    public void test03710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03710");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        boolean boolean5 = staff3.isVerified();
        java.lang.String str6 = staff3.getID();
        boolean boolean7 = staff3.isVerified();
        staff3.logout();
        staff3.logout();
        double double10 = staff3.getHourlyRate();
        staff3.setVerified(true);
        boolean boolean13 = staff3.isVerified();
        double double14 = staff3.getHourlyRate();
        staff3.logout();
        staff3.login("hi!", "");
        java.lang.Class<?> wildcardClass19 = staff3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 40.0d + "'", double10 == 40.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 40.0d + "'", double14 == 40.0d);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test03711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03711");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        boolean boolean5 = staff3.isVerified();
        java.lang.String str6 = staff3.getID();
        java.lang.String str7 = staff3.getID();
        staff3.setVerified(true);
        java.lang.String str10 = staff3.getAccountType();
        java.lang.String str11 = staff3.getEmail();
        java.lang.Class<?> wildcardClass12 = staff3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "staff" + "'", str10, "staff");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test03712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03712");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        boolean boolean5 = staff3.isVerified();
        java.lang.String str6 = staff3.getID();
        java.lang.String str7 = staff3.getID();
        staff3.login("hi!", "");
        java.lang.String str11 = staff3.getPassword();
        java.lang.String str12 = staff3.getPassword();
        staff3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test03713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03713");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        boolean boolean6 = staff3.isVerified();
        staff3.logout();
        java.lang.String str8 = staff3.getPassword();
        staff3.setVerified(false);
        staff3.logout();
        staff3.viewProfile();
        staff3.viewProfile();
        staff3.login("hi!", "staff");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test03714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03714");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        staff3.login("", "");
        staff3.viewProfile();
        staff3.viewProfile();
        staff3.login("", "");
        staff3.logout();
        java.lang.String str13 = staff3.getAccountType();
        double double14 = staff3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "staff" + "'", str13, "staff");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 40.0d + "'", double14 == 40.0d);
    }

    @Test
    public void test03715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03715");
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
        staff3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "staff" + "'", str10, "staff");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test03716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03716");
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
        java.lang.String str15 = staff3.getAccountType();
        staff3.setVerified(true);
        double double18 = staff3.getHourlyRate();
        java.lang.String str19 = staff3.getPassword();
        staff3.setVerified(false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 40.0d + "'", double6 == 40.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 40.0d + "'", double12 == 40.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "staff" + "'", str15, "staff");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 40.0d + "'", double18 == 40.0d);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test03717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03717");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        boolean boolean5 = staff3.isVerified();
        java.lang.String str6 = staff3.getID();
        boolean boolean7 = staff3.isVerified();
        staff3.logout();
        java.lang.String str9 = staff3.getID();
        java.lang.String str10 = staff3.getID();
        double double11 = staff3.getHourlyRate();
        staff3.logout();
        java.lang.String str13 = staff3.getAccountType();
        java.lang.String str14 = staff3.getAccountType();
        boolean boolean15 = staff3.isVerified();
        staff3.logout();
        java.lang.String str17 = staff3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 40.0d + "'", double11 == 40.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "staff" + "'", str13, "staff");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "staff" + "'", str14, "staff");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "staff" + "'", str17, "staff");
    }

    @Test
    public void test03718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03718");
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
        double double21 = staff3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 40.0d + "'", double16 == 40.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 40.0d + "'", double17 == 40.0d);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 40.0d + "'", double21 == 40.0d);
    }

    @Test
    public void test03719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03719");
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
        java.lang.String str16 = staff3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 40.0d + "'", double13 == 40.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test03720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03720");
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
        java.lang.String str18 = staff3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "staff" + "'", str8, "staff");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 40.0d + "'", double13 == 40.0d);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test03721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03721");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        boolean boolean5 = staff3.isVerified();
        java.lang.String str6 = staff3.getID();
        staff3.setVerified(false);
        java.lang.String str9 = staff3.getID();
        staff3.setVerified(false);
        staff3.logout();
        java.lang.String str13 = staff3.getAccountType();
        java.lang.Class<?> wildcardClass14 = staff3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "staff" + "'", str13, "staff");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test03722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03722");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        java.lang.String str6 = staff3.getPassword();
        staff3.setVerified(false);
        java.lang.String str9 = staff3.getEmail();
        staff3.logout();
        staff3.viewProfile();
        staff3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test03723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03723");
        model.Staff staff3 = new model.Staff("hi!", "", "hi!");
        staff3.setVerified(false);
        staff3.viewProfile();
        java.lang.String str7 = staff3.getEmail();
        boolean boolean8 = staff3.isVerified();
        staff3.logout();
        java.lang.String str10 = staff3.getEmail();
        java.lang.Class<?> wildcardClass11 = staff3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test03724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03724");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        boolean boolean6 = staff3.isVerified();
        staff3.viewProfile();
        staff3.viewProfile();
        staff3.login("hi!", "hi!");
        java.lang.String str12 = staff3.getPassword();
        staff3.login("staff", "staff");
        staff3.setVerified(false);
        double double18 = staff3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 40.0d + "'", double18 == 40.0d);
    }

    @Test
    public void test03725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03725");
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
        java.lang.String str21 = staff3.getID();
        staff3.viewProfile();
        boolean boolean23 = staff3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test03726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03726");
        model.Staff staff3 = new model.Staff("hi!", "", "hi!");
        staff3.setVerified(false);
        java.lang.String str6 = staff3.getPassword();
        java.lang.String str7 = staff3.getAccountType();
        java.lang.String str8 = staff3.getEmail();
        java.lang.String str9 = staff3.getAccountType();
        java.lang.String str10 = staff3.getAccountType();
        staff3.setVerified(false);
        java.lang.String str13 = staff3.getPassword();
        java.lang.String str14 = staff3.getPassword();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "staff" + "'", str7, "staff");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "staff" + "'", str9, "staff");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "staff" + "'", str10, "staff");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test03727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03727");
        model.Staff staff3 = new model.Staff("", "staff", "");
        staff3.login("staff", "");
        boolean boolean7 = staff3.isVerified();
        java.lang.String str8 = staff3.getEmail();
        java.lang.String str9 = staff3.getID();
        java.lang.String str10 = staff3.getEmail();
        java.lang.String str11 = staff3.getID();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test03728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03728");
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
        staff3.login("staff", "staff");
        staff3.login("staff", "");
        java.lang.String str19 = staff3.getPassword();
        java.lang.Class<?> wildcardClass20 = staff3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 40.0d + "'", double6 == 40.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test03729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03729");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        boolean boolean5 = staff3.isVerified();
        java.lang.String str6 = staff3.getID();
        java.lang.String str7 = staff3.getID();
        staff3.setVerified(true);
        staff3.setVerified(false);
        java.lang.String str12 = staff3.getEmail();
        double double13 = staff3.getHourlyRate();
        boolean boolean14 = staff3.isVerified();
        staff3.viewProfile();
        staff3.viewProfile();
        java.lang.Class<?> wildcardClass17 = staff3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 40.0d + "'", double13 == 40.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test03730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03730");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        java.lang.String str6 = staff3.getPassword();
        staff3.setVerified(false);
        staff3.setVerified(true);
        double double11 = staff3.getHourlyRate();
        boolean boolean12 = staff3.isVerified();
        staff3.viewProfile();
        java.lang.String str14 = staff3.getAccountType();
        double double15 = staff3.getHourlyRate();
        java.lang.Class<?> wildcardClass16 = staff3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 40.0d + "'", double11 == 40.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "staff" + "'", str14, "staff");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 40.0d + "'", double15 == 40.0d);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test03731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03731");
        model.Staff staff3 = new model.Staff("hi!", "", "hi!");
        staff3.logout();
        staff3.login("hi!", "hi!");
        staff3.viewProfile();
        java.lang.String str9 = staff3.getPassword();
        java.lang.String str10 = staff3.getID();
        staff3.logout();
        boolean boolean12 = staff3.isVerified();
        boolean boolean13 = staff3.isVerified();
        java.lang.String str14 = staff3.getID();
        staff3.logout();
        java.lang.Class<?> wildcardClass16 = staff3.getClass();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test03732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03732");
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
        double double20 = staff3.getHourlyRate();
        java.lang.Class<?> wildcardClass21 = staff3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "staff" + "'", str8, "staff");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 40.0d + "'", double14 == 40.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 40.0d + "'", double20 == 40.0d);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test03733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03733");
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
        boolean boolean19 = staff3.isVerified();
        staff3.setVerified(true);
        staff3.setVerified(true);
        java.lang.String str24 = staff3.getPassword();
        java.lang.String str25 = staff3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 40.0d + "'", double11 == 40.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 40.0d + "'", double18 == 40.0d);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
    }

    @Test
    public void test03734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03734");
        model.Staff staff3 = new model.Staff("", "staff", "staff");
        double double4 = staff3.getHourlyRate();
        double double5 = staff3.getHourlyRate();
        java.lang.String str6 = staff3.getPassword();
        java.lang.String str7 = staff3.getEmail();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 40.0d + "'", double4 == 40.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 40.0d + "'", double5 == 40.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "staff" + "'", str6, "staff");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test03735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03735");
        model.Staff staff3 = new model.Staff("staff", "", "staff");
        staff3.setVerified(false);
        staff3.viewProfile();
        java.lang.String str7 = staff3.getID();
        boolean boolean8 = staff3.isVerified();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "staff" + "'", str7, "staff");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test03736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03736");
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
        staff3.login("staff", "staff");
        java.lang.Class<?> wildcardClass20 = staff3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "staff" + "'", str4, "staff");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test03737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03737");
        model.Staff staff3 = new model.Staff("", "staff", "");
        staff3.setVerified(true);
        staff3.login("", "hi!");
        staff3.viewProfile();
        staff3.logout();
        java.lang.String str11 = staff3.getAccountType();
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "staff" + "'", str11, "staff");
    }

    @Test
    public void test03738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03738");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        java.lang.String str6 = staff3.getPassword();
        staff3.setVerified(false);
        staff3.setVerified(true);
        staff3.viewProfile();
        java.lang.String str12 = staff3.getID();
        double double13 = staff3.getHourlyRate();
        boolean boolean14 = staff3.isVerified();
        staff3.setVerified(false);
        java.lang.Class<?> wildcardClass17 = staff3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 40.0d + "'", double13 == 40.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test03739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03739");
        model.Staff staff3 = new model.Staff("hi!", "", "hi!");
        staff3.logout();
        staff3.login("hi!", "hi!");
        staff3.viewProfile();
        java.lang.String str9 = staff3.getPassword();
        java.lang.String str10 = staff3.getID();
        staff3.logout();
        boolean boolean12 = staff3.isVerified();
        boolean boolean13 = staff3.isVerified();
        java.lang.String str14 = staff3.getID();
        staff3.logout();
        staff3.setVerified(false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test03740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03740");
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
        staff3.login("hi!", "");
        staff3.logout();
        java.lang.String str22 = staff3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "staff" + "'", str13, "staff");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test03741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03741");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        boolean boolean5 = staff3.isVerified();
        java.lang.String str6 = staff3.getAccountType();
        staff3.logout();
        java.lang.String str8 = staff3.getEmail();
        staff3.viewProfile();
        boolean boolean10 = staff3.isVerified();
        java.lang.String str11 = staff3.getID();
        java.lang.String str12 = staff3.getID();
        java.lang.String str13 = staff3.getAccountType();
        staff3.login("staff", "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "staff" + "'", str6, "staff");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "staff" + "'", str13, "staff");
    }

    @Test
    public void test03742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03742");
        model.Staff staff3 = new model.Staff("hi!", "", "hi!");
        staff3.logout();
        staff3.login("hi!", "hi!");
        double double8 = staff3.getHourlyRate();
        java.lang.String str9 = staff3.getID();
        java.lang.String str10 = staff3.getAccountType();
        staff3.viewProfile();
        java.lang.String str12 = staff3.getID();
        staff3.setVerified(true);
        java.lang.String str15 = staff3.getEmail();
        java.lang.String str16 = staff3.getPassword();
        java.lang.String str17 = staff3.getAccountType();
        java.lang.String str18 = staff3.getID();
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 40.0d + "'", double8 == 40.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "staff" + "'", str10, "staff");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "staff" + "'", str17, "staff");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test03743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03743");
        model.Staff staff3 = new model.Staff("hi!", "staff", "");
        staff3.setVerified(false);
        staff3.logout();
        double double7 = staff3.getHourlyRate();
        staff3.login("staff", "staff");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 40.0d + "'", double7 == 40.0d);
    }

    @Test
    public void test03744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03744");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        staff3.logout();
        java.lang.String str5 = staff3.getID();
        java.lang.String str6 = staff3.getEmail();
        double double7 = staff3.getHourlyRate();
        java.lang.String str8 = staff3.getEmail();
        staff3.login("", "");
        boolean boolean12 = staff3.isVerified();
        staff3.viewProfile();
        java.lang.String str14 = staff3.getAccountType();
        staff3.setVerified(true);
        staff3.setVerified(false);
        staff3.viewProfile();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 40.0d + "'", double7 == 40.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "staff" + "'", str14, "staff");
    }

    @Test
    public void test03745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03745");
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
        java.lang.Class<?> wildcardClass18 = staff3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "staff" + "'", str17, "staff");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test03746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03746");
        model.Staff staff3 = new model.Staff("hi!", "", "hi!");
        staff3.logout();
        staff3.login("hi!", "hi!");
        double double8 = staff3.getHourlyRate();
        boolean boolean9 = staff3.isVerified();
        java.lang.String str10 = staff3.getAccountType();
        java.lang.String str11 = staff3.getPassword();
        java.lang.Class<?> wildcardClass12 = staff3.getClass();
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 40.0d + "'", double8 == 40.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "staff" + "'", str10, "staff");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test03747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03747");
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
        java.lang.String str14 = staff3.getAccountType();
        staff3.setVerified(true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "staff" + "'", str6, "staff");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "staff" + "'", str12, "staff");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "staff" + "'", str14, "staff");
    }

    @Test
    public void test03748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03748");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        double double6 = staff3.getHourlyRate();
        staff3.logout();
        staff3.viewProfile();
        java.lang.String str9 = staff3.getEmail();
        boolean boolean10 = staff3.isVerified();
        java.lang.String str11 = staff3.getPassword();
        java.lang.String str12 = staff3.getID();
        staff3.viewProfile();
        boolean boolean14 = staff3.isVerified();
        java.lang.String str15 = staff3.getEmail();
        java.lang.Class<?> wildcardClass16 = staff3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 40.0d + "'", double6 == 40.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test03749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03749");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        boolean boolean5 = staff3.isVerified();
        java.lang.String str6 = staff3.getAccountType();
        staff3.logout();
        double double8 = staff3.getHourlyRate();
        java.lang.String str9 = staff3.getEmail();
        java.lang.String str10 = staff3.getAccountType();
        boolean boolean11 = staff3.isVerified();
        staff3.login("staff", "staff");
        java.lang.Class<?> wildcardClass15 = staff3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "staff" + "'", str6, "staff");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 40.0d + "'", double8 == 40.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "staff" + "'", str10, "staff");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test03750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03750");
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
        java.lang.Class<?> wildcardClass15 = staff3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 40.0d + "'", double14 == 40.0d);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test03751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03751");
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
        staff3.setVerified(false);
        java.lang.String str23 = staff3.getAccountType();
        staff3.login("staff", "");
        java.lang.Class<?> wildcardClass27 = staff3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 40.0d + "'", double11 == 40.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "staff" + "'", str23, "staff");
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test03752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03752");
        model.Staff staff3 = new model.Staff("", "", "");
        staff3.viewProfile();
        double double5 = staff3.getHourlyRate();
        boolean boolean6 = staff3.isVerified();
        staff3.login("hi!", "");
        double double10 = staff3.getHourlyRate();
        java.lang.String str11 = staff3.getEmail();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 40.0d + "'", double5 == 40.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 40.0d + "'", double10 == 40.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test03753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03753");
        model.Staff staff3 = new model.Staff("hi!", "", "hi!");
        staff3.logout();
        staff3.login("hi!", "hi!");
        double double8 = staff3.getHourlyRate();
        java.lang.String str9 = staff3.getID();
        java.lang.String str10 = staff3.getAccountType();
        double double11 = staff3.getHourlyRate();
        java.lang.String str12 = staff3.getPassword();
        staff3.logout();
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 40.0d + "'", double8 == 40.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "staff" + "'", str10, "staff");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 40.0d + "'", double11 == 40.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test03754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03754");
        model.Staff staff3 = new model.Staff("hi!", "hi!", "");
        staff3.setVerified(true);
        staff3.login("staff", "");
        staff3.viewProfile();
        java.lang.String str10 = staff3.getID();
        java.lang.String str11 = staff3.getID();
        java.lang.String str12 = staff3.getPassword();
        staff3.setVerified(false);
        java.lang.String str15 = staff3.getID();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test03755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03755");
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
        java.lang.Class<?> wildcardClass22 = staff3.getClass();
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 40.0d + "'", double8 == 40.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "staff" + "'", str10, "staff");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "staff" + "'", str11, "staff");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 40.0d + "'", double12 == 40.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 40.0d + "'", double13 == 40.0d);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test03756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03756");
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
        staff3.logout();
        double double16 = staff3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 40.0d + "'", double16 == 40.0d);
    }

    @Test
    public void test03757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03757");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        boolean boolean6 = staff3.isVerified();
        staff3.logout();
        java.lang.String str8 = staff3.getPassword();
        staff3.logout();
        java.lang.String str10 = staff3.getID();
        double double11 = staff3.getHourlyRate();
        java.lang.Class<?> wildcardClass12 = staff3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 40.0d + "'", double11 == 40.0d);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test03758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03758");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        staff3.logout();
        java.lang.String str5 = staff3.getID();
        java.lang.String str6 = staff3.getEmail();
        java.lang.String str7 = staff3.getPassword();
        java.lang.String str8 = staff3.getID();
        staff3.logout();
        java.lang.String str10 = staff3.getPassword();
        staff3.logout();
        java.lang.String str12 = staff3.getEmail();
        staff3.setVerified(true);
        staff3.login("hi!", "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test03759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03759");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        boolean boolean5 = staff3.isVerified();
        java.lang.String str6 = staff3.getID();
        boolean boolean7 = staff3.isVerified();
        java.lang.String str8 = staff3.getEmail();
        staff3.setVerified(true);
        java.lang.String str11 = staff3.getAccountType();
        staff3.viewProfile();
        staff3.login("", "");
        staff3.setVerified(false);
        staff3.login("hi!", "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "staff" + "'", str11, "staff");
    }

    @Test
    public void test03760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03760");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        staff3.login("", "");
        staff3.viewProfile();
        staff3.login("", "staff");
        java.lang.String str11 = staff3.getID();
        java.lang.String str12 = staff3.getID();
        java.lang.String str13 = staff3.getPassword();
        java.lang.Class<?> wildcardClass14 = staff3.getClass();
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test03761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03761");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        double double6 = staff3.getHourlyRate();
        java.lang.String str7 = staff3.getEmail();
        staff3.viewProfile();
        boolean boolean9 = staff3.isVerified();
        double double10 = staff3.getHourlyRate();
        staff3.setVerified(false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 40.0d + "'", double6 == 40.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 40.0d + "'", double10 == 40.0d);
    }

    @Test
    public void test03762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03762");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        double double6 = staff3.getHourlyRate();
        java.lang.String str7 = staff3.getPassword();
        staff3.login("", "staff");
        java.lang.String str11 = staff3.getAccountType();
        java.lang.String str12 = staff3.getAccountType();
        boolean boolean13 = staff3.isVerified();
        double double14 = staff3.getHourlyRate();
        java.lang.String str15 = staff3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 40.0d + "'", double6 == 40.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "staff" + "'", str11, "staff");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "staff" + "'", str12, "staff");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 40.0d + "'", double14 == 40.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test03763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03763");
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
        staff3.logout();
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 40.0d + "'", double8 == 40.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "staff" + "'", str10, "staff");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "staff" + "'", str11, "staff");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 40.0d + "'", double12 == 40.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 40.0d + "'", double13 == 40.0d);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test03764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03764");
        model.Staff staff3 = new model.Staff("hi!", "staff", "");
        java.lang.String str4 = staff3.getPassword();
        boolean boolean5 = staff3.isVerified();
        double double6 = staff3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "staff" + "'", str4, "staff");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 40.0d + "'", double6 == 40.0d);
    }

    @Test
    public void test03765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03765");
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
        boolean boolean20 = staff3.isVerified();
        java.lang.String str21 = staff3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "staff" + "'", str16, "staff");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test03766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03766");
        model.Staff staff3 = new model.Staff("hi!", "", "hi!");
        java.lang.String str4 = staff3.getAccountType();
        java.lang.String str5 = staff3.getEmail();
        double double6 = staff3.getHourlyRate();
        staff3.viewProfile();
        java.lang.String str8 = staff3.getEmail();
        staff3.setVerified(false);
        java.lang.String str11 = staff3.getPassword();
        staff3.logout();
        java.lang.String str13 = staff3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "staff" + "'", str4, "staff");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 40.0d + "'", double6 == 40.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test03767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03767");
        model.Staff staff3 = new model.Staff("hi!", "hi!", "hi!");
        staff3.login("hi!", "staff");
        staff3.logout();
        java.lang.String str8 = staff3.getPassword();
        staff3.viewProfile();
        staff3.setVerified(false);
        staff3.logout();
        staff3.viewProfile();
        staff3.logout();
        staff3.login("staff", "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test03768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03768");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        boolean boolean5 = staff3.isVerified();
        java.lang.String str6 = staff3.getAccountType();
        staff3.logout();
        double double8 = staff3.getHourlyRate();
        java.lang.String str9 = staff3.getEmail();
        java.lang.String str10 = staff3.getAccountType();
        staff3.setVerified(true);
        java.lang.String str13 = staff3.getAccountType();
        staff3.login("", "hi!");
        staff3.setVerified(false);
        java.lang.Class<?> wildcardClass19 = staff3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "staff" + "'", str6, "staff");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 40.0d + "'", double8 == 40.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "staff" + "'", str10, "staff");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "staff" + "'", str13, "staff");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test03769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03769");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        double double6 = staff3.getHourlyRate();
        java.lang.String str7 = staff3.getPassword();
        staff3.login("", "staff");
        staff3.setVerified(false);
        java.lang.Class<?> wildcardClass13 = staff3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 40.0d + "'", double6 == 40.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test03770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03770");
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
        staff3.setVerified(false);
        java.lang.String str17 = staff3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 40.0d + "'", double6 == 40.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "staff" + "'", str9, "staff");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "staff" + "'", str14, "staff");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test03771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03771");
        model.Staff staff3 = new model.Staff("hi!", "", "hi!");
        java.lang.String str4 = staff3.getAccountType();
        java.lang.String str5 = staff3.getEmail();
        double double6 = staff3.getHourlyRate();
        double double7 = staff3.getHourlyRate();
        staff3.logout();
        java.lang.Class<?> wildcardClass9 = staff3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "staff" + "'", str4, "staff");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 40.0d + "'", double6 == 40.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 40.0d + "'", double7 == 40.0d);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test03772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03772");
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
        java.lang.String str17 = staff3.getAccountType();
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
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "staff" + "'", str17, "staff");
    }

    @Test
    public void test03773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03773");
        model.Staff staff3 = new model.Staff("hi!", "hi!", "");
        java.lang.String str4 = staff3.getEmail();
        staff3.login("staff", "staff");
        java.lang.String str8 = staff3.getPassword();
        staff3.viewProfile();
        java.lang.Class<?> wildcardClass10 = staff3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test03774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03774");
        model.Staff staff3 = new model.Staff("hi!", "", "hi!");
        staff3.logout();
        staff3.login("hi!", "hi!");
        double double8 = staff3.getHourlyRate();
        boolean boolean9 = staff3.isVerified();
        java.lang.String str10 = staff3.getAccountType();
        java.lang.String str11 = staff3.getEmail();
        java.lang.String str12 = staff3.getEmail();
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 40.0d + "'", double8 == 40.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "staff" + "'", str10, "staff");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test03775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03775");
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
        staff3.login("staff", "staff");
        staff3.login("staff", "");
        boolean boolean19 = staff3.isVerified();
        staff3.logout();
        java.lang.String str21 = staff3.getEmail();
        java.lang.String str22 = staff3.getID();
        staff3.viewProfile();
        java.lang.String str24 = staff3.getID();
        java.lang.Class<?> wildcardClass25 = staff3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 40.0d + "'", double6 == 40.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test03776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03776");
        model.Staff staff3 = new model.Staff("hi!", "", "hi!");
        java.lang.String str4 = staff3.getAccountType();
        java.lang.String str5 = staff3.getEmail();
        staff3.viewProfile();
        java.lang.String str7 = staff3.getPassword();
        java.lang.String str8 = staff3.getID();
        staff3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "staff" + "'", str4, "staff");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test03777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03777");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        boolean boolean5 = staff3.isVerified();
        java.lang.String str6 = staff3.getID();
        boolean boolean7 = staff3.isVerified();
        staff3.logout();
        java.lang.String str9 = staff3.getID();
        staff3.setVerified(true);
        staff3.setVerified(false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test03778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03778");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        staff3.logout();
        java.lang.String str5 = staff3.getID();
        java.lang.String str6 = staff3.getEmail();
        double double7 = staff3.getHourlyRate();
        java.lang.String str8 = staff3.getPassword();
        staff3.login("hi!", "hi!");
        java.lang.String str12 = staff3.getAccountType();
        staff3.logout();
        java.lang.String str14 = staff3.getEmail();
        java.lang.Class<?> wildcardClass15 = staff3.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 40.0d + "'", double7 == 40.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "staff" + "'", str12, "staff");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test03779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03779");
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
        staff3.login("", "hi!");
        java.lang.String str19 = staff3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 40.0d + "'", double14 == 40.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 40.0d + "'", double15 == 40.0d);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "staff" + "'", str19, "staff");
    }

    @Test
    public void test03780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03780");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        boolean boolean6 = staff3.isVerified();
        staff3.logout();
        java.lang.String str8 = staff3.getPassword();
        java.lang.String str9 = staff3.getEmail();
        staff3.setVerified(false);
        staff3.login("hi!", "");
        java.lang.String str15 = staff3.getAccountType();
        staff3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "staff" + "'", str15, "staff");
    }

    @Test
    public void test03781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03781");
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
        double double17 = staff3.getHourlyRate();
        staff3.setVerified(false);
        java.lang.String str20 = staff3.getEmail();
        java.lang.String str21 = staff3.getAccountType();
        java.lang.String str22 = staff3.getAccountType();
        java.lang.String str23 = staff3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "staff" + "'", str8, "staff");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "staff" + "'", str9, "staff");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 40.0d + "'", double17 == 40.0d);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "staff" + "'", str21, "staff");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "staff" + "'", str22, "staff");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test03782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03782");
        model.Staff staff3 = new model.Staff("", "staff", "hi!");
        java.lang.String str4 = staff3.getPassword();
        java.lang.String str5 = staff3.getPassword();
        java.lang.String str6 = staff3.getAccountType();
        java.lang.String str7 = staff3.getPassword();
        java.lang.Class<?> wildcardClass8 = staff3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "staff" + "'", str4, "staff");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "staff" + "'", str6, "staff");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "staff" + "'", str7, "staff");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test03783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03783");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        boolean boolean6 = staff3.isVerified();
        staff3.logout();
        staff3.setVerified(false);
        staff3.logout();
        double double11 = staff3.getHourlyRate();
        boolean boolean12 = staff3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 40.0d + "'", double11 == 40.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test03784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03784");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        boolean boolean6 = staff3.isVerified();
        staff3.viewProfile();
        double double8 = staff3.getHourlyRate();
        staff3.login("staff", "staff");
        staff3.login("staff", "");
        staff3.setVerified(true);
        staff3.setVerified(false);
        java.lang.String str19 = staff3.getID();
        java.lang.String str20 = staff3.getPassword();
        java.lang.Class<?> wildcardClass21 = staff3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 40.0d + "'", double8 == 40.0d);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test03785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03785");
        model.Staff staff3 = new model.Staff("", "staff", "staff");
        staff3.setVerified(true);
        java.lang.String str6 = staff3.getPassword();
        boolean boolean7 = staff3.isVerified();
        java.lang.String str8 = staff3.getEmail();
        staff3.logout();
        boolean boolean10 = staff3.isVerified();
        java.lang.String str11 = staff3.getID();
        java.lang.String str12 = staff3.getID();
        staff3.login("", "hi!");
        java.lang.String str16 = staff3.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "staff" + "'", str6, "staff");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "staff" + "'", str11, "staff");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "staff" + "'", str12, "staff");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test03786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03786");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        boolean boolean5 = staff3.isVerified();
        java.lang.String str6 = staff3.getID();
        java.lang.String str7 = staff3.getID();
        java.lang.String str8 = staff3.getEmail();
        staff3.login("", "");
        boolean boolean12 = staff3.isVerified();
        boolean boolean13 = staff3.isVerified();
        staff3.setVerified(true);
        staff3.viewProfile();
        staff3.login("staff", "staff");
        double double20 = staff3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 40.0d + "'", double20 == 40.0d);
    }

    @Test
    public void test03787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03787");
        model.Staff staff3 = new model.Staff("hi!", "staff", "staff");
        java.lang.String str4 = staff3.getID();
        staff3.setVerified(true);
        staff3.setVerified(true);
        java.lang.String str9 = staff3.getPassword();
        java.lang.String str10 = staff3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "staff" + "'", str4, "staff");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "staff" + "'", str9, "staff");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "staff" + "'", str10, "staff");
    }

    @Test
    public void test03788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03788");
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
        staff3.setVerified(true);
        boolean boolean29 = staff3.isVerified();
        boolean boolean30 = staff3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "staff" + "'", str10, "staff");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "staff" + "'", str23, "staff");
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 40.0d + "'", double26 == 40.0d);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
    }

    @Test
    public void test03789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03789");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        boolean boolean6 = staff3.isVerified();
        staff3.viewProfile();
        staff3.viewProfile();
        staff3.logout();
        staff3.viewProfile();
        staff3.viewProfile();
        staff3.viewProfile();
        staff3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test03790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03790");
        model.Staff staff3 = new model.Staff("hi!", "", "hi!");
        staff3.setVerified(false);
        java.lang.String str6 = staff3.getEmail();
        java.lang.String str7 = staff3.getAccountType();
        java.lang.String str8 = staff3.getID();
        java.lang.String str9 = staff3.getPassword();
        staff3.logout();
        java.lang.String str11 = staff3.getPassword();
        double double12 = staff3.getHourlyRate();
        java.lang.String str13 = staff3.getPassword();
        boolean boolean14 = staff3.isVerified();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "staff" + "'", str7, "staff");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 40.0d + "'", double12 == 40.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test03791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03791");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        staff3.logout();
        java.lang.String str5 = staff3.getID();
        java.lang.String str6 = staff3.getEmail();
        java.lang.String str7 = staff3.getEmail();
        java.lang.String str8 = staff3.getEmail();
        java.lang.String str9 = staff3.getID();
        java.lang.String str10 = staff3.getPassword();
        staff3.setVerified(false);
        boolean boolean13 = staff3.isVerified();
        staff3.logout();
        boolean boolean15 = staff3.isVerified();
        staff3.login("hi!", "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test03792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03792");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        java.lang.String str6 = staff3.getPassword();
        staff3.setVerified(false);
        staff3.setVerified(false);
        java.lang.String str11 = staff3.getPassword();
        java.lang.String str12 = staff3.getEmail();
        staff3.login("hi!", "hi!");
        staff3.logout();
        staff3.login("staff", "");
        staff3.setVerified(true);
        java.lang.String str22 = staff3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
    }

    @Test
    public void test03793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03793");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        boolean boolean6 = staff3.isVerified();
        staff3.viewProfile();
        java.lang.String str8 = staff3.getAccountType();
        java.lang.String str9 = staff3.getID();
        java.lang.String str10 = staff3.getID();
        staff3.login("hi!", "");
        java.lang.String str14 = staff3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "staff" + "'", str8, "staff");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test03794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03794");
        model.Staff staff3 = new model.Staff("hi!", "", "hi!");
        staff3.setVerified(false);
        staff3.viewProfile();
        java.lang.String str7 = staff3.getEmail();
        staff3.login("hi!", "hi!");
        double double11 = staff3.getHourlyRate();
        java.lang.String str12 = staff3.getID();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 40.0d + "'", double11 == 40.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test03795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03795");
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
        staff3.logout();
        boolean boolean15 = staff3.isVerified();
        staff3.setVerified(true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test03796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03796");
        model.Staff staff3 = new model.Staff("hi!", "hi!", "staff");
        double double4 = staff3.getHourlyRate();
        staff3.viewProfile();
        java.lang.String str6 = staff3.getID();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 40.0d + "'", double4 == 40.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "staff" + "'", str6, "staff");
    }

    @Test
    public void test03797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03797");
        model.Staff staff3 = new model.Staff("hi!", "", "hi!");
        staff3.logout();
        staff3.login("hi!", "hi!");
        double double8 = staff3.getHourlyRate();
        boolean boolean9 = staff3.isVerified();
        java.lang.String str10 = staff3.getAccountType();
        java.lang.String str11 = staff3.getAccountType();
        java.lang.String str12 = staff3.getID();
        staff3.viewProfile();
        java.lang.String str14 = staff3.getPassword();
        java.lang.Class<?> wildcardClass15 = staff3.getClass();
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 40.0d + "'", double8 == 40.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "staff" + "'", str10, "staff");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "staff" + "'", str11, "staff");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test03798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03798");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        boolean boolean6 = staff3.isVerified();
        double double7 = staff3.getHourlyRate();
        java.lang.String str8 = staff3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 40.0d + "'", double7 == 40.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test03799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03799");
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
        java.lang.Class<?> wildcardClass16 = staff3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "staff" + "'", str4, "staff");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 40.0d + "'", double6 == 40.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test03800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03800");
        model.Staff staff3 = new model.Staff("hi!", "", "hi!");
        staff3.setVerified(false);
        staff3.viewProfile();
        java.lang.String str7 = staff3.getEmail();
        java.lang.String str8 = staff3.getAccountType();
        boolean boolean9 = staff3.isVerified();
        java.lang.String str10 = staff3.getID();
        double double11 = staff3.getHourlyRate();
        boolean boolean12 = staff3.isVerified();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "staff" + "'", str8, "staff");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 40.0d + "'", double11 == 40.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test03801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03801");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        boolean boolean6 = staff3.isVerified();
        staff3.logout();
        java.lang.String str8 = staff3.getPassword();
        staff3.setVerified(false);
        staff3.logout();
        staff3.viewProfile();
        java.lang.String str13 = staff3.getAccountType();
        staff3.viewProfile();
        boolean boolean15 = staff3.isVerified();
        staff3.login("staff", "staff");
        staff3.login("", "hi!");
        staff3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "staff" + "'", str13, "staff");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test03802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03802");
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
        staff3.setVerified(false);
        staff3.login("", "");
        staff3.login("staff", "staff");
        java.lang.String str29 = staff3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 40.0d + "'", double11 == 40.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "staff" + "'", str29, "staff");
    }

    @Test
    public void test03803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03803");
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
        staff3.setVerified(true);
        java.lang.String str18 = staff3.getID();
        staff3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "staff" + "'", str8, "staff");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "staff" + "'", str9, "staff");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test03804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03804");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        double double6 = staff3.getHourlyRate();
        java.lang.String str7 = staff3.getPassword();
        java.lang.String str8 = staff3.getPassword();
        java.lang.String str9 = staff3.getAccountType();
        staff3.login("hi!", "staff");
        staff3.viewProfile();
        boolean boolean14 = staff3.isVerified();
        staff3.viewProfile();
        staff3.setVerified(false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 40.0d + "'", double6 == 40.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "staff" + "'", str9, "staff");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test03805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03805");
        model.Staff staff3 = new model.Staff("hi!", "", "hi!");
        staff3.setVerified(false);
        staff3.viewProfile();
        java.lang.String str7 = staff3.getEmail();
        java.lang.String str8 = staff3.getAccountType();
        java.lang.String str9 = staff3.getID();
        java.lang.String str10 = staff3.getAccountType();
        staff3.setVerified(true);
        staff3.viewProfile();
        staff3.login("hi!", "hi!");
        java.lang.String str17 = staff3.getEmail();
        java.lang.String str18 = staff3.getPassword();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "staff" + "'", str8, "staff");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "staff" + "'", str10, "staff");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test03806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03806");
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
        double double22 = staff3.getHourlyRate();
        staff3.viewProfile();
        double double24 = staff3.getHourlyRate();
        java.lang.String str25 = staff3.getEmail();
        java.lang.Class<?> wildcardClass26 = staff3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 40.0d + "'", double22 == 40.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 40.0d + "'", double24 == 40.0d);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test03807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03807");
        model.Staff staff3 = new model.Staff("hi!", "", "hi!");
        java.lang.String str4 = staff3.getAccountType();
        java.lang.String str5 = staff3.getEmail();
        staff3.viewProfile();
        staff3.logout();
        staff3.viewProfile();
        staff3.login("", "");
        staff3.viewProfile();
        staff3.login("hi!", "hi!");
        boolean boolean16 = staff3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "staff" + "'", str4, "staff");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test03808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03808");
        model.Staff staff3 = new model.Staff("hi!", "hi!", "staff");
        staff3.login("hi!", "staff");
        staff3.login("", "staff");
        java.lang.String str10 = staff3.getPassword();
        staff3.viewProfile();
        staff3.setVerified(false);
        java.lang.String str14 = staff3.getAccountType();
        boolean boolean15 = staff3.isVerified();
        java.lang.String str16 = staff3.getPassword();
        staff3.viewProfile();
        java.lang.String str18 = staff3.getEmail();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "staff" + "'", str14, "staff");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test03809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03809");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        boolean boolean6 = staff3.isVerified();
        staff3.logout();
        java.lang.String str8 = staff3.getPassword();
        staff3.setVerified(false);
        staff3.logout();
        java.lang.String str12 = staff3.getID();
        java.lang.String str13 = staff3.getID();
        java.lang.String str14 = staff3.getEmail();
        java.lang.String str15 = staff3.getID();
        java.lang.Class<?> wildcardClass16 = staff3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test03810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03810");
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
        java.lang.String str20 = staff3.getPassword();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 40.0d + "'", double13 == 40.0d);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test03811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03811");
        model.Staff staff3 = new model.Staff("staff", "hi!", "");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getPassword();
        java.lang.String str6 = staff3.getAccountType();
        staff3.setVerified(false);
        staff3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "staff" + "'", str6, "staff");
    }

    @Test
    public void test03812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03812");
        model.Staff staff3 = new model.Staff("hi!", "staff", "");
        java.lang.String str4 = staff3.getEmail();
        staff3.viewProfile();
        staff3.logout();
        double double7 = staff3.getHourlyRate();
        staff3.viewProfile();
        java.lang.String str9 = staff3.getID();
        java.lang.Class<?> wildcardClass10 = staff3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 40.0d + "'", double7 == 40.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test03813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03813");
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
        java.lang.String str16 = staff3.getEmail();
        java.lang.String str17 = staff3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 40.0d + "'", double13 == 40.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test03814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03814");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        java.lang.String str6 = staff3.getPassword();
        staff3.setVerified(false);
        staff3.setVerified(false);
        java.lang.String str11 = staff3.getPassword();
        staff3.viewProfile();
        staff3.logout();
        staff3.logout();
        java.lang.String str15 = staff3.getEmail();
        double double16 = staff3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 40.0d + "'", double16 == 40.0d);
    }

    @Test
    public void test03815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03815");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        boolean boolean5 = staff3.isVerified();
        java.lang.String str6 = staff3.getAccountType();
        staff3.logout();
        java.lang.String str8 = staff3.getID();
        staff3.login("", "");
        java.lang.String str12 = staff3.getAccountType();
        java.lang.String str13 = staff3.getPassword();
        java.lang.Class<?> wildcardClass14 = staff3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "staff" + "'", str6, "staff");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "staff" + "'", str12, "staff");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test03816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03816");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getID();
        java.lang.String str6 = staff3.getPassword();
        java.lang.String str7 = staff3.getEmail();
        boolean boolean8 = staff3.isVerified();
        java.lang.String str9 = staff3.getID();
        boolean boolean10 = staff3.isVerified();
        java.lang.String str11 = staff3.getEmail();
        staff3.viewProfile();
        java.lang.Class<?> wildcardClass13 = staff3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test03817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03817");
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
        java.lang.String str16 = staff3.getID();
        java.lang.String str17 = staff3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "staff" + "'", str15, "staff");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "staff" + "'", str17, "staff");
    }

    @Test
    public void test03818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03818");
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
        staff3.login("staff", "staff");
        java.lang.Class<?> wildcardClass20 = staff3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "staff" + "'", str8, "staff");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "staff" + "'", str9, "staff");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 40.0d + "'", double13 == 40.0d);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "staff" + "'", str16, "staff");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test03819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03819");
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
        staff3.logout();
        java.lang.Class<?> wildcardClass19 = staff3.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test03820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03820");
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
        boolean boolean17 = staff3.isVerified();
        java.lang.String str18 = staff3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "staff" + "'", str13, "staff");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test03821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03821");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        staff3.logout();
        java.lang.String str5 = staff3.getID();
        java.lang.String str6 = staff3.getEmail();
        double double7 = staff3.getHourlyRate();
        java.lang.String str8 = staff3.getEmail();
        staff3.login("", "");
        staff3.login("", "");
        staff3.logout();
        java.lang.String str16 = staff3.getEmail();
        staff3.login("hi!", "staff");
        staff3.login("staff", "");
        staff3.login("staff", "staff");
        staff3.logout();
        java.lang.String str27 = staff3.getEmail();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 40.0d + "'", double7 == 40.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
    }

    @Test
    public void test03822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03822");
        model.Staff staff3 = new model.Staff("hi!", "", "hi!");
        staff3.setVerified(false);
        staff3.viewProfile();
        java.lang.String str7 = staff3.getEmail();
        staff3.login("hi!", "hi!");
        java.lang.String str11 = staff3.getEmail();
        staff3.login("staff", "hi!");
        java.lang.String str15 = staff3.getAccountType();
        java.lang.Class<?> wildcardClass16 = staff3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "staff" + "'", str15, "staff");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test03823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03823");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        staff3.logout();
        java.lang.String str5 = staff3.getID();
        java.lang.String str6 = staff3.getEmail();
        double double7 = staff3.getHourlyRate();
        java.lang.String str8 = staff3.getPassword();
        staff3.login("hi!", "hi!");
        staff3.setVerified(false);
        java.lang.String str14 = staff3.getAccountType();
        java.lang.String str15 = staff3.getEmail();
        boolean boolean16 = staff3.isVerified();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 40.0d + "'", double7 == 40.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "staff" + "'", str14, "staff");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test03824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03824");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        boolean boolean5 = staff3.isVerified();
        double double6 = staff3.getHourlyRate();
        java.lang.String str7 = staff3.getEmail();
        java.lang.String str8 = staff3.getEmail();
        staff3.login("", "hi!");
        java.lang.String str12 = staff3.getAccountType();
        staff3.setVerified(false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 40.0d + "'", double6 == 40.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "staff" + "'", str12, "staff");
    }

    @Test
    public void test03825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03825");
        model.Staff staff3 = new model.Staff("hi!", "", "hi!");
        java.lang.String str4 = staff3.getAccountType();
        java.lang.String str5 = staff3.getEmail();
        double double6 = staff3.getHourlyRate();
        staff3.viewProfile();
        java.lang.String str8 = staff3.getID();
        boolean boolean9 = staff3.isVerified();
        java.lang.String str10 = staff3.getAccountType();
        staff3.logout();
        staff3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "staff" + "'", str4, "staff");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 40.0d + "'", double6 == 40.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "staff" + "'", str10, "staff");
    }

    @Test
    public void test03826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03826");
        model.Staff staff3 = new model.Staff("hi!", "hi!", "");
        staff3.logout();
        java.lang.String str5 = staff3.getEmail();
        java.lang.String str6 = staff3.getAccountType();
        staff3.login("staff", "staff");
        double double10 = staff3.getHourlyRate();
        java.lang.String str11 = staff3.getID();
        staff3.login("", "");
        staff3.viewProfile();
        staff3.setVerified(true);
        boolean boolean18 = staff3.isVerified();
        java.lang.Class<?> wildcardClass19 = staff3.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "staff" + "'", str6, "staff");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 40.0d + "'", double10 == 40.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test03827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03827");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getID();
        java.lang.String str6 = staff3.getID();
        staff3.login("", "");
        staff3.setVerified(false);
        java.lang.String str12 = staff3.getPassword();
        boolean boolean13 = staff3.isVerified();
        staff3.login("hi!", "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test03828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03828");
        model.Staff staff3 = new model.Staff("hi!", "hi!", "");
        staff3.setVerified(true);
        boolean boolean6 = staff3.isVerified();
        java.lang.String str7 = staff3.getPassword();
        staff3.logout();
        staff3.login("staff", "");
        staff3.setVerified(true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test03829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03829");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        boolean boolean5 = staff3.isVerified();
        java.lang.String str6 = staff3.getID();
        java.lang.String str7 = staff3.getID();
        java.lang.String str8 = staff3.getEmail();
        staff3.login("", "");
        boolean boolean12 = staff3.isVerified();
        java.lang.String str13 = staff3.getPassword();
        boolean boolean14 = staff3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test03830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03830");
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
        staff3.logout();
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
    }

    @Test
    public void test03831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03831");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        staff3.logout();
        java.lang.String str5 = staff3.getID();
        java.lang.String str6 = staff3.getEmail();
        double double7 = staff3.getHourlyRate();
        java.lang.String str8 = staff3.getPassword();
        staff3.login("hi!", "hi!");
        staff3.logout();
        staff3.login("staff", "hi!");
        staff3.setVerified(false);
        java.lang.String str18 = staff3.getPassword();
        java.lang.String str19 = staff3.getID();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 40.0d + "'", double7 == 40.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test03832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03832");
        model.Staff staff3 = new model.Staff("hi!", "hi!", "");
        staff3.logout();
        java.lang.String str5 = staff3.getEmail();
        staff3.logout();
        staff3.login("", "staff");
        java.lang.String str10 = staff3.getPassword();
        java.lang.String str11 = staff3.getAccountType();
        java.lang.Class<?> wildcardClass12 = staff3.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "staff" + "'", str11, "staff");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test03833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03833");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        staff3.logout();
        java.lang.String str5 = staff3.getID();
        java.lang.String str6 = staff3.getEmail();
        java.lang.String str7 = staff3.getPassword();
        java.lang.String str8 = staff3.getID();
        staff3.logout();
        java.lang.String str10 = staff3.getPassword();
        staff3.logout();
        java.lang.String str12 = staff3.getEmail();
        java.lang.Class<?> wildcardClass13 = staff3.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test03834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03834");
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
        java.lang.Class<?> wildcardClass14 = staff3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "staff" + "'", str10, "staff");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test03835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03835");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        staff3.logout();
        java.lang.String str5 = staff3.getID();
        java.lang.String str6 = staff3.getEmail();
        staff3.viewProfile();
        staff3.setVerified(false);
        java.lang.String str10 = staff3.getID();
        java.lang.String str11 = staff3.getAccountType();
        staff3.setVerified(true);
        java.lang.String str14 = staff3.getPassword();
        boolean boolean15 = staff3.isVerified();
        java.lang.String str16 = staff3.getEmail();
        double double17 = staff3.getHourlyRate();
        boolean boolean18 = staff3.isVerified();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "staff" + "'", str11, "staff");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 40.0d + "'", double17 == 40.0d);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test03836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03836");
        model.Staff staff3 = new model.Staff("hi!", "hi!", "");
        staff3.logout();
        java.lang.String str5 = staff3.getEmail();
        boolean boolean6 = staff3.isVerified();
        staff3.login("", "staff");
        boolean boolean10 = staff3.isVerified();
        java.lang.String str11 = staff3.getEmail();
        java.lang.String str12 = staff3.getEmail();
        staff3.viewProfile();
        java.lang.String str14 = staff3.getPassword();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test03837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03837");
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
        staff3.login("hi!", "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test03838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03838");
        model.Staff staff3 = new model.Staff("", "staff", "staff");
        staff3.setVerified(true);
        java.lang.String str6 = staff3.getPassword();
        boolean boolean7 = staff3.isVerified();
        java.lang.String str8 = staff3.getEmail();
        staff3.setVerified(true);
        boolean boolean11 = staff3.isVerified();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "staff" + "'", str6, "staff");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test03839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03839");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        boolean boolean6 = staff3.isVerified();
        staff3.logout();
        java.lang.String str8 = staff3.getAccountType();
        java.lang.String str9 = staff3.getAccountType();
        java.lang.String str10 = staff3.getID();
        staff3.viewProfile();
        double double12 = staff3.getHourlyRate();
        double double13 = staff3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "staff" + "'", str8, "staff");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "staff" + "'", str9, "staff");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 40.0d + "'", double12 == 40.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 40.0d + "'", double13 == 40.0d);
    }

    @Test
    public void test03840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03840");
        model.Staff staff3 = new model.Staff("hi!", "", "hi!");
        java.lang.String str4 = staff3.getAccountType();
        java.lang.String str5 = staff3.getEmail();
        staff3.viewProfile();
        staff3.logout();
        staff3.viewProfile();
        staff3.login("hi!", "hi!");
        java.lang.Class<?> wildcardClass12 = staff3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "staff" + "'", str4, "staff");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test03841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03841");
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
        java.lang.String str16 = staff3.getPassword();
        staff3.login("hi!", "hi!");
        java.lang.String str20 = staff3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test03842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03842");
        model.Staff staff3 = new model.Staff("hi!", "hi!", "");
        staff3.logout();
        java.lang.String str5 = staff3.getEmail();
        double double6 = staff3.getHourlyRate();
        staff3.setVerified(false);
        staff3.login("", "");
        java.lang.String str12 = staff3.getEmail();
        boolean boolean13 = staff3.isVerified();
        java.lang.Class<?> wildcardClass14 = staff3.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 40.0d + "'", double6 == 40.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test03843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03843");
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
        java.lang.Class<?> wildcardClass17 = staff3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "staff" + "'", str6, "staff");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 40.0d + "'", double12 == 40.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "staff" + "'", str14, "staff");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "staff" + "'", str16, "staff");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test03844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03844");
        model.Staff staff3 = new model.Staff("hi!", "", "hi!");
        staff3.setVerified(false);
        java.lang.Class<?> wildcardClass6 = staff3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test03845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03845");
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
        java.lang.String str16 = staff3.getPassword();
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 40.0d + "'", double8 == 40.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "staff" + "'", str10, "staff");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test03846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03846");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        double double6 = staff3.getHourlyRate();
        java.lang.String str7 = staff3.getPassword();
        java.lang.String str8 = staff3.getPassword();
        staff3.login("staff", "hi!");
        staff3.login("hi!", "");
        staff3.login("hi!", "hi!");
        staff3.setVerified(false);
        staff3.viewProfile();
        staff3.setVerified(true);
        java.lang.String str23 = staff3.getEmail();
        staff3.login("", "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 40.0d + "'", double6 == 40.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test03847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03847");
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
        java.lang.String str20 = staff3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "staff" + "'", str10, "staff");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 40.0d + "'", double16 == 40.0d);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "staff" + "'", str19, "staff");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "staff" + "'", str20, "staff");
    }

    @Test
    public void test03848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03848");
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
        java.lang.Class<?> wildcardClass24 = staff3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "staff" + "'", str8, "staff");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 40.0d + "'", double15 == 40.0d);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "staff" + "'", str17, "staff");
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test03849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03849");
        model.Staff staff3 = new model.Staff("hi!", "", "hi!");
        staff3.setVerified(false);
        java.lang.String str6 = staff3.getPassword();
        java.lang.String str7 = staff3.getAccountType();
        java.lang.String str8 = staff3.getEmail();
        java.lang.String str9 = staff3.getAccountType();
        java.lang.String str10 = staff3.getID();
        java.lang.String str11 = staff3.getPassword();
        boolean boolean12 = staff3.isVerified();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "staff" + "'", str7, "staff");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "staff" + "'", str9, "staff");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test03850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03850");
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
        boolean boolean22 = staff3.isVerified();
        java.lang.String str23 = staff3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "staff" + "'", str23, "staff");
    }

    @Test
    public void test03851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03851");
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
        java.lang.String str13 = staff3.getEmail();
        staff3.login("staff", "");
        double double17 = staff3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 40.0d + "'", double6 == 40.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "staff" + "'", str11, "staff");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 40.0d + "'", double17 == 40.0d);
    }

    @Test
    public void test03852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03852");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        boolean boolean5 = staff3.isVerified();
        java.lang.String str6 = staff3.getID();
        staff3.setVerified(false);
        java.lang.String str9 = staff3.getID();
        staff3.setVerified(false);
        staff3.logout();
        java.lang.String str13 = staff3.getPassword();
        java.lang.String str14 = staff3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test03853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03853");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        staff3.logout();
        java.lang.String str5 = staff3.getID();
        java.lang.String str6 = staff3.getEmail();
        java.lang.String str7 = staff3.getPassword();
        java.lang.String str8 = staff3.getID();
        staff3.logout();
        staff3.viewProfile();
        staff3.login("hi!", "");
        staff3.setVerified(true);
        boolean boolean16 = staff3.isVerified();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test03854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03854");
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
        java.lang.String str26 = staff3.getEmail();
        boolean boolean27 = staff3.isVerified();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 40.0d + "'", double7 == 40.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "staff" + "'", str15, "staff");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "staff" + "'", str22, "staff");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test03855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03855");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        boolean boolean6 = staff3.isVerified();
        staff3.logout();
        java.lang.String str8 = staff3.getAccountType();
        staff3.setVerified(false);
        staff3.viewProfile();
        staff3.setVerified(true);
        staff3.viewProfile();
        staff3.login("staff", "");
        boolean boolean18 = staff3.isVerified();
        staff3.login("staff", "");
        staff3.logout();
        java.lang.String str23 = staff3.getAccountType();
        java.lang.String str24 = staff3.getPassword();
        staff3.login("hi!", "staff");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "staff" + "'", str8, "staff");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "staff" + "'", str23, "staff");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test03856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03856");
        model.Staff staff3 = new model.Staff("hi!", "", "hi!");
        staff3.logout();
        staff3.login("hi!", "hi!");
        java.lang.String str8 = staff3.getID();
        boolean boolean9 = staff3.isVerified();
        staff3.setVerified(true);
        java.lang.String str12 = staff3.getPassword();
        boolean boolean13 = staff3.isVerified();
        double double14 = staff3.getHourlyRate();
        staff3.logout();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 40.0d + "'", double14 == 40.0d);
    }

    @Test
    public void test03857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03857");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        boolean boolean6 = staff3.isVerified();
        staff3.logout();
        double double8 = staff3.getHourlyRate();
        boolean boolean9 = staff3.isVerified();
        staff3.logout();
        boolean boolean11 = staff3.isVerified();
        staff3.setVerified(true);
        staff3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 40.0d + "'", double8 == 40.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test03858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03858");
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
        staff3.logout();
        double double18 = staff3.getHourlyRate();
        staff3.logout();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 40.0d + "'", double18 == 40.0d);
    }

    @Test
    public void test03859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03859");
        model.Staff staff3 = new model.Staff("hi!", "hi!", "");
        staff3.logout();
        java.lang.String str5 = staff3.getEmail();
        java.lang.String str6 = staff3.getAccountType();
        staff3.login("staff", "staff");
        double double10 = staff3.getHourlyRate();
        java.lang.String str11 = staff3.getID();
        staff3.login("", "");
        staff3.viewProfile();
        staff3.setVerified(true);
        staff3.logout();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "staff" + "'", str6, "staff");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 40.0d + "'", double10 == 40.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test03860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03860");
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
        double double17 = staff3.getHourlyRate();
        java.lang.String str18 = staff3.getPassword();
        boolean boolean19 = staff3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 40.0d + "'", double17 == 40.0d);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test03861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03861");
        model.Staff staff3 = new model.Staff("hi!", "", "hi!");
        staff3.logout();
        staff3.login("hi!", "hi!");
        double double8 = staff3.getHourlyRate();
        boolean boolean9 = staff3.isVerified();
        staff3.setVerified(false);
        staff3.logout();
        java.lang.String str13 = staff3.getEmail();
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 40.0d + "'", double8 == 40.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test03862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03862");
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
        boolean boolean20 = staff3.isVerified();
        staff3.login("hi!", "staff");
        staff3.setVerified(true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "staff" + "'", str16, "staff");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test03863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03863");
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
        java.lang.String str21 = staff3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 40.0d + "'", double14 == 40.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
    }

    @Test
    public void test03864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03864");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        staff3.logout();
        staff3.viewProfile();
        java.lang.String str7 = staff3.getEmail();
        staff3.viewProfile();
        staff3.setVerified(false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test03865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03865");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        boolean boolean6 = staff3.isVerified();
        staff3.logout();
        staff3.setVerified(false);
        java.lang.String str10 = staff3.getEmail();
        staff3.logout();
        staff3.login("", "");
        staff3.setVerified(true);
        java.lang.String str17 = staff3.getPassword();
        java.lang.String str18 = staff3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test03866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03866");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        boolean boolean5 = staff3.isVerified();
        java.lang.String str6 = staff3.getID();
        staff3.setVerified(false);
        boolean boolean9 = staff3.isVerified();
        java.lang.String str10 = staff3.getAccountType();
        java.lang.String str11 = staff3.getPassword();
        java.lang.String str12 = staff3.getEmail();
        double double13 = staff3.getHourlyRate();
        java.lang.Class<?> wildcardClass14 = staff3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "staff" + "'", str10, "staff");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 40.0d + "'", double13 == 40.0d);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test03867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03867");
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
        staff3.login("", "staff");
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
    }

    @Test
    public void test03868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03868");
        model.Staff staff3 = new model.Staff("", "staff", "staff");
        double double4 = staff3.getHourlyRate();
        java.lang.String str5 = staff3.getAccountType();
        java.lang.String str6 = staff3.getAccountType();
        staff3.login("staff", "");
        staff3.login("staff", "");
        staff3.logout();
        java.lang.String str14 = staff3.getPassword();
        boolean boolean15 = staff3.isVerified();
        java.lang.String str16 = staff3.getEmail();
        staff3.login("", "staff");
        double double20 = staff3.getHourlyRate();
        java.lang.Class<?> wildcardClass21 = staff3.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 40.0d + "'", double4 == 40.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "staff" + "'", str6, "staff");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "staff" + "'", str14, "staff");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 40.0d + "'", double20 == 40.0d);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test03869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03869");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        boolean boolean5 = staff3.isVerified();
        java.lang.String str6 = staff3.getAccountType();
        staff3.logout();
        java.lang.String str8 = staff3.getAccountType();
        double double9 = staff3.getHourlyRate();
        staff3.setVerified(true);
        boolean boolean12 = staff3.isVerified();
        staff3.setVerified(false);
        staff3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "staff" + "'", str6, "staff");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "staff" + "'", str8, "staff");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 40.0d + "'", double9 == 40.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test03870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03870");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        boolean boolean5 = staff3.isVerified();
        java.lang.String str6 = staff3.getID();
        boolean boolean7 = staff3.isVerified();
        staff3.login("", "hi!");
        java.lang.String str11 = staff3.getEmail();
        staff3.viewProfile();
        staff3.login("", "staff");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test03871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03871");
        model.Staff staff3 = new model.Staff("hi!", "", "hi!");
        java.lang.String str4 = staff3.getAccountType();
        java.lang.String str5 = staff3.getID();
        staff3.setVerified(true);
        boolean boolean8 = staff3.isVerified();
        staff3.setVerified(false);
        java.lang.String str11 = staff3.getAccountType();
        staff3.logout();
        staff3.viewProfile();
        java.lang.Class<?> wildcardClass14 = staff3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "staff" + "'", str4, "staff");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "staff" + "'", str11, "staff");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test03872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03872");
        model.Staff staff3 = new model.Staff("hi!", "hi!", "");
        staff3.logout();
        java.lang.String str5 = staff3.getEmail();
        boolean boolean6 = staff3.isVerified();
        staff3.login("", "staff");
        boolean boolean10 = staff3.isVerified();
        java.lang.String str11 = staff3.getEmail();
        double double12 = staff3.getHourlyRate();
        staff3.setVerified(true);
        staff3.viewProfile();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 40.0d + "'", double12 == 40.0d);
    }

    @Test
    public void test03873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03873");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        boolean boolean5 = staff3.isVerified();
        java.lang.String str6 = staff3.getAccountType();
        java.lang.String str7 = staff3.getAccountType();
        java.lang.String str8 = staff3.getEmail();
        staff3.viewProfile();
        java.lang.String str10 = staff3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "staff" + "'", str6, "staff");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "staff" + "'", str7, "staff");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "staff" + "'", str10, "staff");
    }

    @Test
    public void test03874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03874");
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
        boolean boolean15 = staff3.isVerified();
        java.lang.String str16 = staff3.getPassword();
        staff3.viewProfile();
        java.lang.String str18 = staff3.getID();
        java.lang.String str19 = staff3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 40.0d + "'", double14 == 40.0d);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "staff" + "'", str19, "staff");
    }

    @Test
    public void test03875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03875");
        model.Staff staff3 = new model.Staff("", "", "");
        staff3.viewProfile();
        java.lang.String str5 = staff3.getEmail();
        java.lang.String str6 = staff3.getEmail();
        staff3.login("hi!", "hi!");
        boolean boolean10 = staff3.isVerified();
        staff3.login("", "hi!");
        java.lang.String str14 = staff3.getPassword();
        double double15 = staff3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 40.0d + "'", double15 == 40.0d);
    }

    @Test
    public void test03876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03876");
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
        java.lang.String str16 = staff3.getID();
        staff3.login("staff", "");
        double double20 = staff3.getHourlyRate();
        java.lang.String str21 = staff3.getPassword();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 40.0d + "'", double20 == 40.0d);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test03877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03877");
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
        double double16 = staff3.getHourlyRate();
        java.lang.String str17 = staff3.getID();
        staff3.viewProfile();
        staff3.setVerified(false);
        boolean boolean21 = staff3.isVerified();
        double double22 = staff3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "staff" + "'", str12, "staff");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 40.0d + "'", double16 == 40.0d);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 40.0d + "'", double22 == 40.0d);
    }

    @Test
    public void test03878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03878");
        model.Staff staff3 = new model.Staff("hi!", "hi!", "staff");
        staff3.login("hi!", "staff");
        java.lang.String str7 = staff3.getEmail();
        staff3.login("staff", "staff");
        staff3.viewProfile();
        java.lang.String str12 = staff3.getEmail();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test03879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03879");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        boolean boolean6 = staff3.isVerified();
        staff3.logout();
        java.lang.String str8 = staff3.getEmail();
        staff3.viewProfile();
        staff3.logout();
        java.lang.String str11 = staff3.getAccountType();
        staff3.logout();
        java.lang.String str13 = staff3.getPassword();
        staff3.login("staff", "staff");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "staff" + "'", str11, "staff");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test03880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03880");
        model.Staff staff3 = new model.Staff("", "staff", "staff");
        double double4 = staff3.getHourlyRate();
        java.lang.String str5 = staff3.getAccountType();
        java.lang.String str6 = staff3.getAccountType();
        java.lang.String str7 = staff3.getAccountType();
        double double8 = staff3.getHourlyRate();
        java.lang.String str9 = staff3.getID();
        staff3.login("staff", "staff");
        staff3.login("", "staff");
        java.lang.String str16 = staff3.getAccountType();
        double double17 = staff3.getHourlyRate();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 40.0d + "'", double4 == 40.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "staff" + "'", str6, "staff");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "staff" + "'", str7, "staff");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 40.0d + "'", double8 == 40.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "staff" + "'", str9, "staff");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "staff" + "'", str16, "staff");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 40.0d + "'", double17 == 40.0d);
    }

    @Test
    public void test03881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03881");
        model.Staff staff3 = new model.Staff("hi!", "staff", "");
        java.lang.String str4 = staff3.getEmail();
        staff3.logout();
        java.lang.String str6 = staff3.getID();
        boolean boolean7 = staff3.isVerified();
        boolean boolean8 = staff3.isVerified();
        java.lang.Class<?> wildcardClass9 = staff3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test03882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03882");
        model.Staff staff3 = new model.Staff("staff", "", "staff");
        staff3.setVerified(false);
        java.lang.String str6 = staff3.getAccountType();
        java.lang.String str7 = staff3.getPassword();
        java.lang.String str8 = staff3.getPassword();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "staff" + "'", str6, "staff");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test03883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03883");
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
        staff3.login("hi!", "staff");
        staff3.setVerified(true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "staff" + "'", str10, "staff");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test03884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03884");
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
        staff3.viewProfile();
        java.lang.String str18 = staff3.getPassword();
        java.lang.String str19 = staff3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "staff" + "'", str10, "staff");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 40.0d + "'", double16 == 40.0d);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test03885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03885");
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
        staff3.logout();
        staff3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "staff" + "'", str11, "staff");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 40.0d + "'", double18 == 40.0d);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test03886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03886");
        model.Staff staff3 = new model.Staff("hi!", "", "hi!");
        staff3.setVerified(false);
        staff3.viewProfile();
        java.lang.String str7 = staff3.getEmail();
        java.lang.String str8 = staff3.getAccountType();
        staff3.logout();
        boolean boolean10 = staff3.isVerified();
        staff3.login("", "hi!");
        boolean boolean14 = staff3.isVerified();
        staff3.login("", "hi!");
        java.lang.String str18 = staff3.getAccountType();
        java.lang.String str19 = staff3.getEmail();
        staff3.viewProfile();
        staff3.viewProfile();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "staff" + "'", str8, "staff");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "staff" + "'", str18, "staff");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test03887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03887");
        model.Staff staff3 = new model.Staff("hi!", "", "hi!");
        staff3.logout();
        staff3.login("hi!", "hi!");
        double double8 = staff3.getHourlyRate();
        boolean boolean9 = staff3.isVerified();
        staff3.setVerified(false);
        java.lang.String str12 = staff3.getPassword();
        staff3.viewProfile();
        java.lang.String str14 = staff3.getID();
        java.lang.String str15 = staff3.getID();
        java.lang.String str16 = staff3.getID();
        java.lang.String str17 = staff3.getEmail();
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 40.0d + "'", double8 == 40.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test03888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03888");
        model.Staff staff3 = new model.Staff("", "staff", "");
        staff3.setVerified(true);
        staff3.login("", "hi!");
        staff3.viewProfile();
        staff3.login("hi!", "");
        java.lang.String str13 = staff3.getAccountType();
        staff3.logout();
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "staff" + "'", str13, "staff");
    }

    @Test
    public void test03889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03889");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        double double6 = staff3.getHourlyRate();
        java.lang.String str7 = staff3.getEmail();
        staff3.viewProfile();
        java.lang.String str9 = staff3.getPassword();
        java.lang.String str10 = staff3.getEmail();
        boolean boolean11 = staff3.isVerified();
        staff3.setVerified(false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 40.0d + "'", double6 == 40.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test03890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03890");
        model.Staff staff3 = new model.Staff("hi!", "hi!", "");
        staff3.logout();
        java.lang.String str5 = staff3.getEmail();
        double double6 = staff3.getHourlyRate();
        java.lang.String str7 = staff3.getAccountType();
        staff3.logout();
        boolean boolean9 = staff3.isVerified();
        staff3.logout();
        java.lang.String str11 = staff3.getID();
        java.lang.Class<?> wildcardClass12 = staff3.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 40.0d + "'", double6 == 40.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "staff" + "'", str7, "staff");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test03891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03891");
        model.Staff staff3 = new model.Staff("hi!", "", "hi!");
        staff3.setVerified(false);
        staff3.viewProfile();
        java.lang.String str7 = staff3.getEmail();
        boolean boolean8 = staff3.isVerified();
        staff3.logout();
        java.lang.String str10 = staff3.getEmail();
        java.lang.String str11 = staff3.getEmail();
        staff3.setVerified(true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test03892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03892");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        staff3.login("", "");
        double double7 = staff3.getHourlyRate();
        staff3.login("staff", "staff");
        java.lang.String str11 = staff3.getID();
        staff3.logout();
        staff3.logout();
        java.lang.String str14 = staff3.getID();
        java.lang.String str15 = staff3.getPassword();
        java.lang.String str16 = staff3.getPassword();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 40.0d + "'", double7 == 40.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test03893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03893");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        double double6 = staff3.getHourlyRate();
        java.lang.String str7 = staff3.getID();
        boolean boolean8 = staff3.isVerified();
        staff3.setVerified(true);
        staff3.setVerified(true);
        staff3.viewProfile();
        staff3.viewProfile();
        staff3.setVerified(true);
        double double17 = staff3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 40.0d + "'", double6 == 40.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 40.0d + "'", double17 == 40.0d);
    }

    @Test
    public void test03894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03894");
        model.Staff staff3 = new model.Staff("hi!", "", "hi!");
        staff3.setVerified(false);
        java.lang.String str6 = staff3.getPassword();
        java.lang.String str7 = staff3.getAccountType();
        java.lang.String str8 = staff3.getEmail();
        staff3.setVerified(true);
        java.lang.String str11 = staff3.getAccountType();
        staff3.login("staff", "");
        boolean boolean15 = staff3.isVerified();
        staff3.login("", "");
        staff3.setVerified(true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "staff" + "'", str7, "staff");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "staff" + "'", str11, "staff");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test03895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03895");
        model.Staff staff3 = new model.Staff("hi!", "", "hi!");
        staff3.setVerified(false);
        staff3.viewProfile();
        java.lang.String str7 = staff3.getEmail();
        java.lang.String str8 = staff3.getID();
        staff3.login("hi!", "staff");
        java.lang.String str12 = staff3.getPassword();
        boolean boolean13 = staff3.isVerified();
        staff3.viewProfile();
        double double15 = staff3.getHourlyRate();
        staff3.logout();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 40.0d + "'", double15 == 40.0d);
    }

    @Test
    public void test03896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03896");
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
        java.lang.String str14 = staff3.getAccountType();
        staff3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "staff" + "'", str8, "staff");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "staff" + "'", str12, "staff");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "staff" + "'", str14, "staff");
    }

    @Test
    public void test03897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03897");
        model.Staff staff3 = new model.Staff("hi!", "staff", "");
        staff3.logout();
        java.lang.String str5 = staff3.getEmail();
        java.lang.String str6 = staff3.getEmail();
        double double7 = staff3.getHourlyRate();
        staff3.logout();
        staff3.viewProfile();
        java.lang.String str10 = staff3.getAccountType();
        java.lang.String str11 = staff3.getID();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 40.0d + "'", double7 == 40.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "staff" + "'", str10, "staff");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test03898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03898");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        java.lang.String str6 = staff3.getPassword();
        java.lang.String str7 = staff3.getPassword();
        java.lang.String str8 = staff3.getID();
        java.lang.String str9 = staff3.getID();
        staff3.viewProfile();
        java.lang.String str11 = staff3.getID();
        java.lang.Class<?> wildcardClass12 = staff3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test03899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03899");
        model.Staff staff3 = new model.Staff("hi!", "", "hi!");
        java.lang.String str4 = staff3.getAccountType();
        java.lang.String str5 = staff3.getID();
        staff3.setVerified(true);
        boolean boolean8 = staff3.isVerified();
        staff3.setVerified(false);
        java.lang.String str11 = staff3.getAccountType();
        double double12 = staff3.getHourlyRate();
        java.lang.String str13 = staff3.getEmail();
        double double14 = staff3.getHourlyRate();
        java.lang.String str15 = staff3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "staff" + "'", str4, "staff");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "staff" + "'", str11, "staff");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 40.0d + "'", double12 == 40.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 40.0d + "'", double14 == 40.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test03900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03900");
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
        staff3.setVerified(false);
        java.lang.String str20 = staff3.getAccountType();
        double double21 = staff3.getHourlyRate();
        boolean boolean22 = staff3.isVerified();
        java.lang.String str23 = staff3.getID();
        staff3.logout();
        java.lang.Class<?> wildcardClass25 = staff3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "staff" + "'", str20, "staff");
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 40.0d + "'", double21 == 40.0d);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test03901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03901");
        model.Staff staff3 = new model.Staff("staff", "hi!", "");
        staff3.login("hi!", "hi!");
        staff3.logout();
        staff3.setVerified(false);
        staff3.viewProfile();
        staff3.logout();
        boolean boolean12 = staff3.isVerified();
        staff3.login("hi!", "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test03902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03902");
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
        staff3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 40.0d + "'", double10 == 40.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test03903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03903");
        model.Staff staff3 = new model.Staff("", "", "staff");
        java.lang.String str4 = staff3.getID();
        double double5 = staff3.getHourlyRate();
        double double6 = staff3.getHourlyRate();
        staff3.setVerified(false);
        java.lang.String str9 = staff3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "staff" + "'", str4, "staff");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 40.0d + "'", double5 == 40.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 40.0d + "'", double6 == 40.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test03904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03904");
        model.Staff staff3 = new model.Staff("hi!", "", "hi!");
        staff3.setVerified(false);
        staff3.viewProfile();
        java.lang.String str7 = staff3.getEmail();
        java.lang.String str8 = staff3.getAccountType();
        java.lang.String str9 = staff3.getID();
        java.lang.String str10 = staff3.getAccountType();
        staff3.setVerified(false);
        java.lang.String str13 = staff3.getEmail();
        java.lang.String str14 = staff3.getID();
        boolean boolean15 = staff3.isVerified();
        java.lang.String str16 = staff3.getEmail();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "staff" + "'", str8, "staff");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "staff" + "'", str10, "staff");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test03905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03905");
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
        double double14 = staff3.getHourlyRate();
        staff3.setVerified(false);
        staff3.login("", "staff");
        staff3.setVerified(false);
        boolean boolean22 = staff3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "staff" + "'", str10, "staff");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 40.0d + "'", double14 == 40.0d);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test03906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03906");
        model.Staff staff3 = new model.Staff("hi!", "", "hi!");
        java.lang.String str4 = staff3.getAccountType();
        java.lang.String str5 = staff3.getEmail();
        double double6 = staff3.getHourlyRate();
        staff3.viewProfile();
        java.lang.String str8 = staff3.getEmail();
        java.lang.String str9 = staff3.getID();
        staff3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "staff" + "'", str4, "staff");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 40.0d + "'", double6 == 40.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test03907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03907");
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
        java.lang.String str18 = staff3.getEmail();
        staff3.login("", "hi!");
        double double22 = staff3.getHourlyRate();
        staff3.login("hi!", "");
        boolean boolean26 = staff3.isVerified();
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
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 40.0d + "'", double22 == 40.0d);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test03908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03908");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        boolean boolean6 = staff3.isVerified();
        staff3.viewProfile();
        boolean boolean8 = staff3.isVerified();
        java.lang.String str9 = staff3.getEmail();
        staff3.setVerified(true);
        boolean boolean12 = staff3.isVerified();
        staff3.setVerified(false);
        staff3.logout();
        staff3.viewProfile();
        java.lang.String str17 = staff3.getAccountType();
        staff3.login("hi!", "hi!");
        staff3.login("hi!", "staff");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "staff" + "'", str17, "staff");
    }

    @Test
    public void test03909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03909");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        boolean boolean5 = staff3.isVerified();
        java.lang.String str6 = staff3.getID();
        boolean boolean7 = staff3.isVerified();
        staff3.logout();
        staff3.logout();
        boolean boolean10 = staff3.isVerified();
        double double11 = staff3.getHourlyRate();
        staff3.setVerified(true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 40.0d + "'", double11 == 40.0d);
    }

    @Test
    public void test03910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03910");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        double double6 = staff3.getHourlyRate();
        java.lang.String str7 = staff3.getPassword();
        staff3.login("", "staff");
        java.lang.String str11 = staff3.getAccountType();
        java.lang.String str12 = staff3.getEmail();
        java.lang.String str13 = staff3.getPassword();
        java.lang.String str14 = staff3.getAccountType();
        double double15 = staff3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 40.0d + "'", double6 == 40.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "staff" + "'", str11, "staff");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "staff" + "'", str14, "staff");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 40.0d + "'", double15 == 40.0d);
    }

    @Test
    public void test03911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03911");
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
        java.lang.Class<?> wildcardClass21 = staff3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "staff" + "'", str17, "staff");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test03912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03912");
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
        boolean boolean15 = staff3.isVerified();
        java.lang.String str16 = staff3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 40.0d + "'", double6 == 40.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "staff" + "'", str14, "staff");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test03913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03913");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        boolean boolean5 = staff3.isVerified();
        java.lang.String str6 = staff3.getID();
        staff3.setVerified(false);
        java.lang.String str9 = staff3.getID();
        java.lang.String str10 = staff3.getEmail();
        staff3.logout();
        java.lang.Class<?> wildcardClass12 = staff3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test03914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03914");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        boolean boolean6 = staff3.isVerified();
        staff3.login("", "");
        java.lang.String str10 = staff3.getID();
        java.lang.String str11 = staff3.getAccountType();
        staff3.viewProfile();
        java.lang.String str13 = staff3.getID();
        java.lang.String str14 = staff3.getEmail();
        java.lang.Class<?> wildcardClass15 = staff3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "staff" + "'", str11, "staff");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test03915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03915");
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
        staff3.logout();
        staff3.logout();
        java.lang.Class<?> wildcardClass22 = staff3.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test03916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03916");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        staff3.logout();
        java.lang.String str5 = staff3.getID();
        java.lang.String str6 = staff3.getPassword();
        double double7 = staff3.getHourlyRate();
        java.lang.String str8 = staff3.getAccountType();
        staff3.viewProfile();
        java.lang.String str10 = staff3.getID();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 40.0d + "'", double7 == 40.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "staff" + "'", str8, "staff");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test03917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03917");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        boolean boolean5 = staff3.isVerified();
        java.lang.String str6 = staff3.getID();
        java.lang.String str7 = staff3.getID();
        java.lang.String str8 = staff3.getEmail();
        staff3.login("", "");
        java.lang.String str12 = staff3.getAccountType();
        staff3.logout();
        java.lang.String str14 = staff3.getAccountType();
        double double15 = staff3.getHourlyRate();
        java.lang.String str16 = staff3.getEmail();
        java.lang.String str17 = staff3.getID();
        staff3.login("hi!", "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "staff" + "'", str12, "staff");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "staff" + "'", str14, "staff");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 40.0d + "'", double15 == 40.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test03918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03918");
        model.Staff staff3 = new model.Staff("hi!", "", "hi!");
        staff3.setVerified(false);
        staff3.viewProfile();
        java.lang.String str7 = staff3.getEmail();
        staff3.login("hi!", "");
        staff3.setVerified(false);
        double double13 = staff3.getHourlyRate();
        boolean boolean14 = staff3.isVerified();
        staff3.setVerified(false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 40.0d + "'", double13 == 40.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test03919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03919");
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
        staff3.login("hi!", "staff");
        staff3.logout();
        staff3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 40.0d + "'", double6 == 40.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 40.0d + "'", double15 == 40.0d);
    }

    @Test
    public void test03920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03920");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        staff3.logout();
        java.lang.String str5 = staff3.getID();
        java.lang.String str6 = staff3.getEmail();
        double double7 = staff3.getHourlyRate();
        java.lang.String str8 = staff3.getPassword();
        staff3.login("hi!", "hi!");
        double double12 = staff3.getHourlyRate();
        boolean boolean13 = staff3.isVerified();
        double double14 = staff3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 40.0d + "'", double7 == 40.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 40.0d + "'", double12 == 40.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 40.0d + "'", double14 == 40.0d);
    }

    @Test
    public void test03921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03921");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        staff3.logout();
        java.lang.String str5 = staff3.getID();
        java.lang.String str6 = staff3.getEmail();
        double double7 = staff3.getHourlyRate();
        java.lang.String str8 = staff3.getPassword();
        staff3.login("hi!", "hi!");
        java.lang.String str12 = staff3.getID();
        java.lang.String str13 = staff3.getEmail();
        staff3.login("staff", "staff");
        double double17 = staff3.getHourlyRate();
        double double18 = staff3.getHourlyRate();
        java.lang.String str19 = staff3.getAccountType();
        java.lang.String str20 = staff3.getID();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 40.0d + "'", double7 == 40.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 40.0d + "'", double17 == 40.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 40.0d + "'", double18 == 40.0d);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "staff" + "'", str19, "staff");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test03922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03922");
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
        java.lang.String str14 = staff3.getEmail();
        java.lang.Class<?> wildcardClass15 = staff3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "staff" + "'", str8, "staff");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "staff" + "'", str12, "staff");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test03923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03923");
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
        java.lang.String str13 = staff3.getAccountType();
        boolean boolean14 = staff3.isVerified();
        java.lang.String str15 = staff3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "staff" + "'", str12, "staff");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "staff" + "'", str13, "staff");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "staff" + "'", str15, "staff");
    }

    @Test
    public void test03924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03924");
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
        boolean boolean13 = staff3.isVerified();
        java.lang.String str14 = staff3.getAccountType();
        java.lang.String str15 = staff3.getAccountType();
        java.lang.String str16 = staff3.getID();
        staff3.login("staff", "staff");
        staff3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 40.0d + "'", double6 == 40.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "staff" + "'", str11, "staff");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "staff" + "'", str14, "staff");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "staff" + "'", str15, "staff");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test03925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03925");
        model.Staff staff3 = new model.Staff("hi!", "", "hi!");
        staff3.setVerified(false);
        java.lang.String str6 = staff3.getEmail();
        staff3.setVerified(false);
        boolean boolean9 = staff3.isVerified();
        java.lang.String str10 = staff3.getPassword();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test03926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03926");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        java.lang.String str6 = staff3.getPassword();
        staff3.setVerified(false);
        staff3.setVerified(false);
        java.lang.String str11 = staff3.getAccountType();
        staff3.logout();
        java.lang.String str13 = staff3.getEmail();
        boolean boolean14 = staff3.isVerified();
        staff3.viewProfile();
        boolean boolean16 = staff3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "staff" + "'", str11, "staff");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test03927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03927");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        double double6 = staff3.getHourlyRate();
        staff3.logout();
        staff3.setVerified(false);
        staff3.login("", "");
        java.lang.Class<?> wildcardClass13 = staff3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 40.0d + "'", double6 == 40.0d);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test03928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03928");
        model.Staff staff3 = new model.Staff("", "staff", "staff");
        staff3.setVerified(true);
        java.lang.String str6 = staff3.getPassword();
        boolean boolean7 = staff3.isVerified();
        java.lang.String str8 = staff3.getPassword();
        java.lang.String str9 = staff3.getAccountType();
        java.lang.Class<?> wildcardClass10 = staff3.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "staff" + "'", str6, "staff");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "staff" + "'", str8, "staff");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "staff" + "'", str9, "staff");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test03929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03929");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        double double6 = staff3.getHourlyRate();
        staff3.logout();
        staff3.setVerified(false);
        double double10 = staff3.getHourlyRate();
        staff3.login("", "");
        staff3.logout();
        double double15 = staff3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 40.0d + "'", double6 == 40.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 40.0d + "'", double10 == 40.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 40.0d + "'", double15 == 40.0d);
    }

    @Test
    public void test03930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03930");
        model.Staff staff3 = new model.Staff("hi!", "", "hi!");
        staff3.logout();
        staff3.login("hi!", "hi!");
        java.lang.String str8 = staff3.getEmail();
        java.lang.String str9 = staff3.getEmail();
        staff3.viewProfile();
        staff3.setVerified(false);
        staff3.setVerified(true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test03931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03931");
        model.Staff staff3 = new model.Staff("hi!", "", "hi!");
        java.lang.String str4 = staff3.getAccountType();
        java.lang.String str5 = staff3.getEmail();
        staff3.viewProfile();
        double double7 = staff3.getHourlyRate();
        staff3.setVerified(true);
        staff3.viewProfile();
        java.lang.String str11 = staff3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "staff" + "'", str4, "staff");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 40.0d + "'", double7 == 40.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test03932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03932");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        double double6 = staff3.getHourlyRate();
        java.lang.String str7 = staff3.getPassword();
        java.lang.String str8 = staff3.getPassword();
        staff3.login("staff", "hi!");
        staff3.login("hi!", "");
        staff3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 40.0d + "'", double6 == 40.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test03933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03933");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        java.lang.String str6 = staff3.getPassword();
        staff3.setVerified(false);
        staff3.setVerified(false);
        boolean boolean11 = staff3.isVerified();
        boolean boolean12 = staff3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test03934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03934");
        model.Staff staff3 = new model.Staff("hi!", "hi!", "");
        staff3.setVerified(true);
        double double6 = staff3.getHourlyRate();
        java.lang.String str7 = staff3.getEmail();
        staff3.viewProfile();
        java.lang.String str9 = staff3.getPassword();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 40.0d + "'", double6 == 40.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test03935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03935");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        staff3.logout();
        java.lang.String str5 = staff3.getID();
        java.lang.String str6 = staff3.getEmail();
        double double7 = staff3.getHourlyRate();
        boolean boolean8 = staff3.isVerified();
        java.lang.String str9 = staff3.getID();
        double double10 = staff3.getHourlyRate();
        staff3.setVerified(false);
        double double13 = staff3.getHourlyRate();
        staff3.setVerified(true);
        java.lang.String str16 = staff3.getAccountType();
        staff3.viewProfile();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 40.0d + "'", double7 == 40.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 40.0d + "'", double10 == 40.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 40.0d + "'", double13 == 40.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "staff" + "'", str16, "staff");
    }

    @Test
    public void test03936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03936");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        boolean boolean6 = staff3.isVerified();
        staff3.logout();
        boolean boolean8 = staff3.isVerified();
        staff3.setVerified(false);
        boolean boolean11 = staff3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test03937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03937");
        model.Staff staff3 = new model.Staff("hi!", "", "hi!");
        staff3.setVerified(false);
        staff3.viewProfile();
        java.lang.String str7 = staff3.getEmail();
        staff3.login("hi!", "hi!");
        java.lang.String str11 = staff3.getEmail();
        staff3.login("staff", "hi!");
        java.lang.String str15 = staff3.getPassword();
        staff3.logout();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test03938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03938");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        boolean boolean5 = staff3.isVerified();
        java.lang.String str6 = staff3.getAccountType();
        java.lang.String str7 = staff3.getAccountType();
        java.lang.String str8 = staff3.getEmail();
        java.lang.String str9 = staff3.getID();
        double double10 = staff3.getHourlyRate();
        staff3.logout();
        java.lang.Class<?> wildcardClass12 = staff3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "staff" + "'", str6, "staff");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "staff" + "'", str7, "staff");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 40.0d + "'", double10 == 40.0d);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test03939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03939");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        staff3.logout();
        java.lang.String str5 = staff3.getID();
        java.lang.String str6 = staff3.getEmail();
        java.lang.String str7 = staff3.getEmail();
        staff3.logout();
        java.lang.String str9 = staff3.getID();
        java.lang.Class<?> wildcardClass10 = staff3.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test03940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03940");
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
        java.lang.String str15 = staff3.getEmail();
        staff3.logout();
        double double17 = staff3.getHourlyRate();
        double double18 = staff3.getHourlyRate();
        java.lang.String str19 = staff3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "staff" + "'", str6, "staff");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "staff" + "'", str7, "staff");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 40.0d + "'", double17 == 40.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 40.0d + "'", double18 == 40.0d);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test03941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03941");
        model.Staff staff3 = new model.Staff("hi!", "", "hi!");
        staff3.logout();
        staff3.login("hi!", "hi!");
        double double8 = staff3.getHourlyRate();
        boolean boolean9 = staff3.isVerified();
        java.lang.String str10 = staff3.getAccountType();
        java.lang.String str11 = staff3.getEmail();
        java.lang.String str12 = staff3.getID();
        java.lang.String str13 = staff3.getEmail();
        staff3.logout();
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 40.0d + "'", double8 == 40.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "staff" + "'", str10, "staff");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test03942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03942");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        boolean boolean6 = staff3.isVerified();
        staff3.logout();
        java.lang.String str8 = staff3.getAccountType();
        java.lang.String str9 = staff3.getAccountType();
        staff3.login("hi!", "");
        double double13 = staff3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "staff" + "'", str8, "staff");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "staff" + "'", str9, "staff");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 40.0d + "'", double13 == 40.0d);
    }

    @Test
    public void test03943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03943");
        model.Staff staff3 = new model.Staff("hi!", "hi!", "");
        staff3.logout();
        java.lang.String str5 = staff3.getEmail();
        boolean boolean6 = staff3.isVerified();
        java.lang.String str7 = staff3.getEmail();
        staff3.login("", "staff");
        java.lang.String str11 = staff3.getEmail();
        java.lang.String str12 = staff3.getEmail();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test03944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03944");
        model.Staff staff3 = new model.Staff("staff", "", "hi!");
        double double4 = staff3.getHourlyRate();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 40.0d + "'", double4 == 40.0d);
    }

    @Test
    public void test03945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03945");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        java.lang.String str6 = staff3.getPassword();
        java.lang.String str7 = staff3.getPassword();
        staff3.login("hi!", "hi!");
        boolean boolean11 = staff3.isVerified();
        staff3.login("hi!", "hi!");
        java.lang.String str15 = staff3.getAccountType();
        java.lang.Class<?> wildcardClass16 = staff3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "staff" + "'", str15, "staff");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test03946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03946");
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
        staff3.login("hi!", "");
        java.lang.String str20 = staff3.getAccountType();
        staff3.login("", "hi!");
        java.lang.String str24 = staff3.getID();
        double double25 = staff3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 40.0d + "'", double16 == 40.0d);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "staff" + "'", str20, "staff");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 40.0d + "'", double25 == 40.0d);
    }

    @Test
    public void test03947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03947");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        boolean boolean5 = staff3.isVerified();
        java.lang.String str6 = staff3.getID();
        staff3.setVerified(false);
        java.lang.String str9 = staff3.getID();
        staff3.setVerified(false);
        java.lang.String str12 = staff3.getID();
        java.lang.String str13 = staff3.getEmail();
        double double14 = staff3.getHourlyRate();
        staff3.login("staff", "");
        staff3.viewProfile();
        staff3.setVerified(true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 40.0d + "'", double14 == 40.0d);
    }

    @Test
    public void test03948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03948");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        double double6 = staff3.getHourlyRate();
        java.lang.String str7 = staff3.getPassword();
        java.lang.String str8 = staff3.getPassword();
        java.lang.String str9 = staff3.getAccountType();
        staff3.viewProfile();
        java.lang.String str11 = staff3.getID();
        double double12 = staff3.getHourlyRate();
        staff3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 40.0d + "'", double6 == 40.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "staff" + "'", str9, "staff");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 40.0d + "'", double12 == 40.0d);
    }

    @Test
    public void test03949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03949");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        boolean boolean5 = staff3.isVerified();
        java.lang.String str6 = staff3.getID();
        boolean boolean7 = staff3.isVerified();
        java.lang.String str8 = staff3.getID();
        boolean boolean9 = staff3.isVerified();
        staff3.viewProfile();
        boolean boolean11 = staff3.isVerified();
        java.lang.String str12 = staff3.getID();
        java.lang.String str13 = staff3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test03950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03950");
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
        double double17 = staff3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "staff" + "'", str8, "staff");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "staff" + "'", str9, "staff");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 40.0d + "'", double17 == 40.0d);
    }

    @Test
    public void test03951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03951");
        model.Staff staff3 = new model.Staff("hi!", "hi!", "");
        java.lang.String str4 = staff3.getEmail();
        staff3.login("staff", "staff");
        java.lang.String str8 = staff3.getPassword();
        staff3.setVerified(true);
        java.lang.String str11 = staff3.getPassword();
        staff3.login("", "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test03952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03952");
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
        staff3.setVerified(true);
        java.lang.String str19 = staff3.getAccountType();
        java.lang.String str20 = staff3.getEmail();
        java.lang.String str21 = staff3.getPassword();
        java.lang.String str22 = staff3.getID();
        java.lang.String str23 = staff3.getEmail();
        java.lang.Class<?> wildcardClass24 = staff3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "staff" + "'", str19, "staff");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test03953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03953");
        model.Staff staff3 = new model.Staff("hi!", "", "hi!");
        staff3.setVerified(false);
        staff3.viewProfile();
        java.lang.String str7 = staff3.getEmail();
        java.lang.String str8 = staff3.getAccountType();
        staff3.viewProfile();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "staff" + "'", str8, "staff");
    }

    @Test
    public void test03954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03954");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        staff3.login("", "");
        double double7 = staff3.getHourlyRate();
        staff3.login("staff", "staff");
        java.lang.String str11 = staff3.getID();
        java.lang.String str12 = staff3.getAccountType();
        java.lang.String str13 = staff3.getAccountType();
        staff3.login("staff", "hi!");
        java.lang.String str17 = staff3.getEmail();
        boolean boolean18 = staff3.isVerified();
        java.lang.String str19 = staff3.getID();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 40.0d + "'", double7 == 40.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "staff" + "'", str12, "staff");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "staff" + "'", str13, "staff");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test03955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03955");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        staff3.logout();
        java.lang.String str5 = staff3.getID();
        java.lang.String str6 = staff3.getEmail();
        java.lang.String str7 = staff3.getPassword();
        java.lang.String str8 = staff3.getID();
        staff3.viewProfile();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test03956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03956");
        model.Staff staff3 = new model.Staff("hi!", "", "hi!");
        staff3.logout();
        staff3.login("hi!", "hi!");
        double double8 = staff3.getHourlyRate();
        boolean boolean9 = staff3.isVerified();
        java.lang.String str10 = staff3.getAccountType();
        java.lang.String str11 = staff3.getAccountType();
        double double12 = staff3.getHourlyRate();
        staff3.viewProfile();
        double double14 = staff3.getHourlyRate();
        staff3.login("", "");
        java.lang.Class<?> wildcardClass18 = staff3.getClass();
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 40.0d + "'", double8 == 40.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "staff" + "'", str10, "staff");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "staff" + "'", str11, "staff");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 40.0d + "'", double12 == 40.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 40.0d + "'", double14 == 40.0d);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test03957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03957");
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
        staff3.login("staff", "");
        java.lang.Class<?> wildcardClass20 = staff3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "staff" + "'", str12, "staff");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test03958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03958");
        model.Staff staff3 = new model.Staff("hi!", "", "hi!");
        staff3.setVerified(false);
        java.lang.String str6 = staff3.getEmail();
        staff3.setVerified(false);
        staff3.login("staff", "hi!");
        java.lang.String str12 = staff3.getAccountType();
        double double13 = staff3.getHourlyRate();
        double double14 = staff3.getHourlyRate();
        java.lang.String str15 = staff3.getID();
        java.lang.String str16 = staff3.getPassword();
        staff3.login("", "staff");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "staff" + "'", str12, "staff");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 40.0d + "'", double13 == 40.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 40.0d + "'", double14 == 40.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test03959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03959");
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
        staff3.login("", "");
        boolean boolean24 = staff3.isVerified();
        java.lang.Class<?> wildcardClass25 = staff3.getClass();
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
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test03960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03960");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        java.lang.String str6 = staff3.getPassword();
        staff3.setVerified(false);
        staff3.setVerified(true);
        staff3.viewProfile();
        java.lang.String str12 = staff3.getEmail();
        staff3.setVerified(false);
        staff3.setVerified(true);
        java.lang.String str17 = staff3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test03961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03961");
        model.Staff staff3 = new model.Staff("hi!", "hi!", "");
        staff3.viewProfile();
        java.lang.String str5 = staff3.getAccountType();
        boolean boolean6 = staff3.isVerified();
        staff3.viewProfile();
        java.lang.String str8 = staff3.getPassword();
        staff3.viewProfile();
        staff3.setVerified(false);
        java.lang.String str12 = staff3.getEmail();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test03962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03962");
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
        double double16 = staff3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 40.0d + "'", double15 == 40.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 40.0d + "'", double16 == 40.0d);
    }

    @Test
    public void test03963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03963");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        staff3.logout();
        java.lang.String str5 = staff3.getID();
        java.lang.String str6 = staff3.getEmail();
        java.lang.String str7 = staff3.getPassword();
        java.lang.String str8 = staff3.getID();
        staff3.logout();
        java.lang.String str10 = staff3.getPassword();
        staff3.logout();
        staff3.setVerified(false);
        double double14 = staff3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 40.0d + "'", double14 == 40.0d);
    }

    @Test
    public void test03964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03964");
        model.Staff staff3 = new model.Staff("staff", "", "staff");
        staff3.setVerified(false);
        staff3.viewProfile();
        java.lang.String str7 = staff3.getEmail();
        java.lang.String str8 = staff3.getID();
        java.lang.String str9 = staff3.getID();
        boolean boolean10 = staff3.isVerified();
        double double11 = staff3.getHourlyRate();
        staff3.viewProfile();
        staff3.setVerified(true);
        staff3.viewProfile();
        staff3.logout();
        staff3.setVerified(false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "staff" + "'", str7, "staff");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "staff" + "'", str8, "staff");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "staff" + "'", str9, "staff");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 40.0d + "'", double11 == 40.0d);
    }

    @Test
    public void test03965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03965");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        boolean boolean6 = staff3.isVerified();
        staff3.logout();
        java.lang.String str8 = staff3.getAccountType();
        staff3.setVerified(false);
        double double11 = staff3.getHourlyRate();
        boolean boolean12 = staff3.isVerified();
        staff3.login("hi!", "");
        java.lang.String str16 = staff3.getEmail();
        java.lang.Class<?> wildcardClass17 = staff3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "staff" + "'", str8, "staff");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 40.0d + "'", double11 == 40.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test03966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03966");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        boolean boolean5 = staff3.isVerified();
        java.lang.String str6 = staff3.getID();
        java.lang.String str7 = staff3.getID();
        java.lang.String str8 = staff3.getID();
        java.lang.String str9 = staff3.getAccountType();
        boolean boolean10 = staff3.isVerified();
        staff3.logout();
        java.lang.String str12 = staff3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "staff" + "'", str9, "staff");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "staff" + "'", str12, "staff");
    }

    @Test
    public void test03967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03967");
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
        boolean boolean15 = staff3.isVerified();
        staff3.setVerified(true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 40.0d + "'", double8 == 40.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 40.0d + "'", double13 == 40.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 40.0d + "'", double14 == 40.0d);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test03968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03968");
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
        boolean boolean20 = staff3.isVerified();
        staff3.logout();
        staff3.setVerified(true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "staff" + "'", str16, "staff");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test03969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03969");
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
        java.lang.String str15 = staff3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 40.0d + "'", double12 == 40.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test03970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03970");
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
        boolean boolean14 = staff3.isVerified();
        java.lang.String str15 = staff3.getAccountType();
        java.lang.String str16 = staff3.getEmail();
        staff3.login("hi!", "hi!");
        staff3.viewProfile();
        java.lang.String str21 = staff3.getPassword();
        staff3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "staff" + "'", str10, "staff");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "staff" + "'", str15, "staff");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test03971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03971");
        model.Staff staff3 = new model.Staff("", "staff", "");
        java.lang.String str4 = staff3.getPassword();
        java.lang.String str5 = staff3.getEmail();
        staff3.logout();
        staff3.viewProfile();
        java.lang.String str8 = staff3.getPassword();
        java.lang.Class<?> wildcardClass9 = staff3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "staff" + "'", str4, "staff");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "staff" + "'", str8, "staff");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test03972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03972");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        boolean boolean6 = staff3.isVerified();
        staff3.logout();
        java.lang.String str8 = staff3.getPassword();
        staff3.setVerified(false);
        staff3.logout();
        staff3.viewProfile();
        java.lang.String str13 = staff3.getAccountType();
        java.lang.String str14 = staff3.getPassword();
        java.lang.String str15 = staff3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "staff" + "'", str13, "staff");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test03973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03973");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        boolean boolean5 = staff3.isVerified();
        java.lang.String str6 = staff3.getAccountType();
        java.lang.String str7 = staff3.getAccountType();
        double double8 = staff3.getHourlyRate();
        java.lang.String str9 = staff3.getEmail();
        staff3.setVerified(false);
        java.lang.String str12 = staff3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "staff" + "'", str6, "staff");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "staff" + "'", str7, "staff");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 40.0d + "'", double8 == 40.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "staff" + "'", str12, "staff");
    }

    @Test
    public void test03974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03974");
        model.Staff staff3 = new model.Staff("hi!", "hi!", "");
        java.lang.String str4 = staff3.getEmail();
        staff3.login("", "staff");
        java.lang.String str8 = staff3.getPassword();
        java.lang.String str9 = staff3.getEmail();
        double double10 = staff3.getHourlyRate();
        staff3.logout();
        java.lang.String str12 = staff3.getAccountType();
        java.lang.String str13 = staff3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 40.0d + "'", double10 == 40.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "staff" + "'", str12, "staff");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test03975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03975");
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
        staff3.setVerified(false);
        staff3.logout();
        boolean boolean24 = staff3.isVerified();
        java.lang.String str25 = staff3.getAccountType();
        java.lang.Class<?> wildcardClass26 = staff3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 40.0d + "'", double11 == 40.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "staff" + "'", str25, "staff");
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test03976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03976");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        staff3.logout();
        java.lang.String str5 = staff3.getID();
        java.lang.String str6 = staff3.getPassword();
        double double7 = staff3.getHourlyRate();
        staff3.login("staff", "hi!");
        java.lang.String str11 = staff3.getID();
        java.lang.String str12 = staff3.getID();
        staff3.login("hi!", "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 40.0d + "'", double7 == 40.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test03977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03977");
        model.Staff staff3 = new model.Staff("hi!", "hi!", "");
        staff3.viewProfile();
        staff3.viewProfile();
        double double6 = staff3.getHourlyRate();
        boolean boolean7 = staff3.isVerified();
        java.lang.Class<?> wildcardClass8 = staff3.getClass();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 40.0d + "'", double6 == 40.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test03978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03978");
        model.Staff staff3 = new model.Staff("hi!", "", "hi!");
        staff3.setVerified(false);
        staff3.viewProfile();
        java.lang.String str7 = staff3.getEmail();
        java.lang.String str8 = staff3.getAccountType();
        staff3.logout();
        staff3.login("", "");
        staff3.viewProfile();
        java.lang.Class<?> wildcardClass14 = staff3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "staff" + "'", str8, "staff");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test03979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03979");
        model.Staff staff3 = new model.Staff("hi!", "hi!", "");
        staff3.viewProfile();
        java.lang.String str5 = staff3.getAccountType();
        java.lang.String str6 = staff3.getEmail();
        java.lang.String str7 = staff3.getAccountType();
        java.lang.String str8 = staff3.getPassword();
        staff3.logout();
        staff3.viewProfile();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "staff" + "'", str7, "staff");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test03980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03980");
        model.Staff staff3 = new model.Staff("hi!", "staff", "");
        java.lang.String str4 = staff3.getEmail();
        staff3.viewProfile();
        staff3.logout();
        boolean boolean7 = staff3.isVerified();
        java.lang.String str8 = staff3.getID();
        java.lang.String str9 = staff3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test03981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03981");
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
        staff3.viewProfile();
        java.lang.String str20 = staff3.getEmail();
        java.lang.String str21 = staff3.getEmail();
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
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test03982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03982");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getID();
        staff3.setVerified(false);
        boolean boolean8 = staff3.isVerified();
        staff3.setVerified(false);
        staff3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test03983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03983");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        staff3.logout();
        java.lang.String str5 = staff3.getID();
        java.lang.String str6 = staff3.getEmail();
        staff3.viewProfile();
        staff3.setVerified(false);
        staff3.logout();
        java.lang.String str11 = staff3.getEmail();
        staff3.viewProfile();
        staff3.login("hi!", "hi!");
        java.lang.String str16 = staff3.getAccountType();
        staff3.logout();
        double double18 = staff3.getHourlyRate();
        staff3.login("hi!", "staff");
        java.lang.String str22 = staff3.getAccountType();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "staff" + "'", str16, "staff");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 40.0d + "'", double18 == 40.0d);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "staff" + "'", str22, "staff");
    }

    @Test
    public void test03984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03984");
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
        double double14 = staff3.getHourlyRate();
        staff3.logout();
        staff3.logout();
        staff3.login("", "staff");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 40.0d + "'", double14 == 40.0d);
    }

    @Test
    public void test03985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03985");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        double double6 = staff3.getHourlyRate();
        java.lang.String str7 = staff3.getPassword();
        java.lang.String str8 = staff3.getPassword();
        java.lang.String str9 = staff3.getAccountType();
        staff3.viewProfile();
        java.lang.String str11 = staff3.getEmail();
        double double12 = staff3.getHourlyRate();
        staff3.login("hi!", "hi!");
        staff3.setVerified(true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 40.0d + "'", double6 == 40.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "staff" + "'", str9, "staff");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 40.0d + "'", double12 == 40.0d);
    }

    @Test
    public void test03986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03986");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        double double6 = staff3.getHourlyRate();
        staff3.logout();
        staff3.setVerified(true);
        java.lang.String str10 = staff3.getEmail();
        java.lang.String str11 = staff3.getID();
        java.lang.String str12 = staff3.getEmail();
        double double13 = staff3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 40.0d + "'", double6 == 40.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 40.0d + "'", double13 == 40.0d);
    }

    @Test
    public void test03987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03987");
        model.Staff staff3 = new model.Staff("hi!", "", "hi!");
        java.lang.String str4 = staff3.getAccountType();
        java.lang.String str5 = staff3.getEmail();
        staff3.viewProfile();
        staff3.logout();
        staff3.viewProfile();
        java.lang.String str9 = staff3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "staff" + "'", str4, "staff");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test03988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03988");
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
        staff3.viewProfile();
        java.lang.String str16 = staff3.getID();
        java.lang.String str17 = staff3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 40.0d + "'", double6 == 40.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 40.0d + "'", double12 == 40.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test03989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03989");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        boolean boolean5 = staff3.isVerified();
        java.lang.String str6 = staff3.getID();
        java.lang.String str7 = staff3.getID();
        staff3.login("hi!", "");
        java.lang.String str11 = staff3.getPassword();
        boolean boolean12 = staff3.isVerified();
        java.lang.String str13 = staff3.getPassword();
        java.lang.String str14 = staff3.getID();
        boolean boolean15 = staff3.isVerified();
        java.lang.Class<?> wildcardClass16 = staff3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test03990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03990");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        java.lang.String str6 = staff3.getPassword();
        java.lang.String str7 = staff3.getPassword();
        java.lang.String str8 = staff3.getID();
        java.lang.String str9 = staff3.getID();
        double double10 = staff3.getHourlyRate();
        staff3.login("staff", "");
        boolean boolean14 = staff3.isVerified();
        java.lang.String str15 = staff3.getPassword();
        java.lang.String str16 = staff3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 40.0d + "'", double10 == 40.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test03991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03991");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        boolean boolean5 = staff3.isVerified();
        java.lang.String str6 = staff3.getID();
        boolean boolean7 = staff3.isVerified();
        java.lang.String str8 = staff3.getEmail();
        staff3.setVerified(true);
        java.lang.String str11 = staff3.getAccountType();
        staff3.login("", "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "staff" + "'", str11, "staff");
    }

    @Test
    public void test03992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03992");
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
        staff3.login("hi!", "");
        java.lang.String str20 = staff3.getAccountType();
        java.lang.String str21 = staff3.getID();
        staff3.login("", "staff");
        staff3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 40.0d + "'", double16 == 40.0d);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "staff" + "'", str20, "staff");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
    }

    @Test
    public void test03993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03993");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        boolean boolean6 = staff3.isVerified();
        staff3.logout();
        java.lang.String str8 = staff3.getEmail();
        staff3.viewProfile();
        staff3.viewProfile();
        boolean boolean11 = staff3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test03994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03994");
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
        staff3.logout();
        staff3.viewProfile();
        java.lang.String str17 = staff3.getAccountType();
        java.lang.String str18 = staff3.getEmail();
        staff3.login("", "hi!");
        java.lang.Class<?> wildcardClass22 = staff3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "staff" + "'", str10, "staff");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "staff" + "'", str17, "staff");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test03995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03995");
        model.Staff staff3 = new model.Staff("", "hi!", "");
        staff3.login("hi!", "hi!");
        staff3.logout();
        java.lang.String str8 = staff3.getEmail();
        java.lang.String str9 = staff3.getPassword();
        java.lang.String str10 = staff3.getPassword();
        java.lang.String str11 = staff3.getAccountType();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "staff" + "'", str11, "staff");
    }

    @Test
    public void test03996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03996");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        boolean boolean5 = staff3.isVerified();
        java.lang.String str6 = staff3.getID();
        boolean boolean7 = staff3.isVerified();
        staff3.logout();
        java.lang.String str9 = staff3.getID();
        java.lang.String str10 = staff3.getID();
        double double11 = staff3.getHourlyRate();
        staff3.logout();
        java.lang.String str13 = staff3.getAccountType();
        java.lang.String str14 = staff3.getAccountType();
        boolean boolean15 = staff3.isVerified();
        staff3.logout();
        staff3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 40.0d + "'", double11 == 40.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "staff" + "'", str13, "staff");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "staff" + "'", str14, "staff");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test03997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03997");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        java.lang.String str6 = staff3.getPassword();
        staff3.setVerified(false);
        java.lang.String str9 = staff3.getEmail();
        staff3.logout();
        java.lang.String str11 = staff3.getID();
        java.lang.String str12 = staff3.getID();
        double double13 = staff3.getHourlyRate();
        staff3.setVerified(false);
        java.lang.String str16 = staff3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 40.0d + "'", double13 == 40.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test03998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03998");
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
        boolean boolean14 = staff3.isVerified();
        java.lang.String str15 = staff3.getAccountType();
        java.lang.String str16 = staff3.getEmail();
        staff3.login("hi!", "hi!");
        staff3.viewProfile();
        staff3.setVerified(false);
        double double23 = staff3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "staff" + "'", str10, "staff");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "staff" + "'", str15, "staff");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 40.0d + "'", double23 == 40.0d);
    }

    @Test
    public void test03999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03999");
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
        staff3.login("", "hi!");
        staff3.setVerified(true);
        boolean boolean22 = staff3.isVerified();
        java.lang.String str23 = staff3.getEmail();
        boolean boolean24 = staff3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test04000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test04000");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        boolean boolean6 = staff3.isVerified();
        staff3.login("", "");
        java.lang.String str10 = staff3.getAccountType();
        java.lang.String str11 = staff3.getID();
        staff3.setVerified(true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "staff" + "'", str10, "staff");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }
}

