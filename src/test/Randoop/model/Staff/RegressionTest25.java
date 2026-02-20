import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest25 {

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
    public void test12501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12501");
        model.Staff staff3 = new model.Staff("hi!", "", "hi!");
        java.lang.String str4 = staff3.getAccountType();
        java.lang.String str5 = staff3.getID();
        staff3.setVerified(true);
        java.lang.String str8 = staff3.getAccountType();
        java.lang.String str9 = staff3.getAccountType();
        java.lang.String str10 = staff3.getPassword();
        staff3.logout();
        java.lang.String str12 = staff3.getPassword();
        java.lang.String str13 = staff3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "staff" + "'", str4, "staff");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "staff" + "'", str8, "staff");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "staff" + "'", str9, "staff");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "staff" + "'", str13, "staff");
    }

    @Test
    public void test12502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12502");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        boolean boolean6 = staff3.isVerified();
        staff3.logout();
        staff3.setVerified(false);
        java.lang.String str10 = staff3.getAccountType();
        java.lang.String str11 = staff3.getEmail();
        staff3.logout();
        staff3.viewProfile();
        staff3.login("", "staff");
        staff3.viewProfile();
        java.lang.String str18 = staff3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "staff" + "'", str10, "staff");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test12503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12503");
        model.Staff staff3 = new model.Staff("hi!", "", "hi!");
        staff3.logout();
        staff3.login("hi!", "hi!");
        double double8 = staff3.getHourlyRate();
        staff3.login("", "hi!");
        staff3.viewProfile();
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 40.0d + "'", double8 == 40.0d);
    }

    @Test
    public void test12504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12504");
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
        java.lang.String str17 = staff3.getPassword();
        java.lang.String str18 = staff3.getPassword();
        java.lang.String str19 = staff3.getPassword();
        staff3.logout();
        staff3.login("", "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "staff" + "'", str13, "staff");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "staff" + "'", str14, "staff");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test12505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12505");
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
        java.lang.String str16 = staff3.getEmail();
        staff3.setVerified(true);
        double double19 = staff3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "staff" + "'", str6, "staff");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 40.0d + "'", double19 == 40.0d);
    }

    @Test
    public void test12506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12506");
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
        staff3.login("hi!", "");
        java.lang.Class<?> wildcardClass18 = staff3.getClass();
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 40.0d + "'", double8 == 40.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "staff" + "'", str10, "staff");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "staff" + "'", str11, "staff");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test12507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12507");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        staff3.logout();
        java.lang.String str5 = staff3.getID();
        java.lang.String str6 = staff3.getEmail();
        java.lang.String str7 = staff3.getEmail();
        java.lang.String str8 = staff3.getID();
        staff3.viewProfile();
        java.lang.String str10 = staff3.getID();
        staff3.login("staff", "hi!");
        double double14 = staff3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 40.0d + "'", double14 == 40.0d);
    }

    @Test
    public void test12508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12508");
        model.Staff staff3 = new model.Staff("hi!", "", "hi!");
        staff3.logout();
        staff3.login("hi!", "hi!");
        double double8 = staff3.getHourlyRate();
        boolean boolean9 = staff3.isVerified();
        boolean boolean10 = staff3.isVerified();
        boolean boolean11 = staff3.isVerified();
        boolean boolean12 = staff3.isVerified();
        staff3.logout();
        staff3.logout();
        staff3.login("hi!", "");
        staff3.logout();
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 40.0d + "'", double8 == 40.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test12509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12509");
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
        java.lang.String str14 = staff3.getID();
        java.lang.String str15 = staff3.getPassword();
        java.lang.String str16 = staff3.getAccountType();
        java.lang.String str17 = staff3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "staff" + "'", str11, "staff");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "staff" + "'", str16, "staff");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test12510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12510");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        staff3.setVerified(false);
        staff3.viewProfile();
        java.lang.String str8 = staff3.getID();
        java.lang.String str9 = staff3.getAccountType();
        java.lang.String str10 = staff3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "staff" + "'", str9, "staff");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test12511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12511");
        model.Staff staff3 = new model.Staff("", "staff", "");
        staff3.setVerified(true);
        staff3.login("", "hi!");
        boolean boolean9 = staff3.isVerified();
        java.lang.String str10 = staff3.getID();
        staff3.viewProfile();
        staff3.login("staff", "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test12512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12512");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        boolean boolean5 = staff3.isVerified();
        java.lang.String str6 = staff3.getID();
        staff3.login("", "staff");
        java.lang.String str10 = staff3.getEmail();
        boolean boolean11 = staff3.isVerified();
        staff3.logout();
        java.lang.String str13 = staff3.getPassword();
        java.lang.String str14 = staff3.getPassword();
        java.lang.Class<?> wildcardClass15 = staff3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test12513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12513");
        model.Staff staff3 = new model.Staff("hi!", "", "hi!");
        java.lang.String str4 = staff3.getAccountType();
        java.lang.String str5 = staff3.getEmail();
        double double6 = staff3.getHourlyRate();
        boolean boolean7 = staff3.isVerified();
        staff3.logout();
        java.lang.String str9 = staff3.getAccountType();
        staff3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "staff" + "'", str4, "staff");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 40.0d + "'", double6 == 40.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "staff" + "'", str9, "staff");
    }

    @Test
    public void test12514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12514");
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
        double double21 = staff3.getHourlyRate();
        staff3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 40.0d + "'", double15 == 40.0d);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 40.0d + "'", double17 == 40.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 40.0d + "'", double21 == 40.0d);
    }

    @Test
    public void test12515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12515");
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
        java.lang.String str17 = staff3.getEmail();
        java.lang.String str18 = staff3.getID();
        staff3.logout();
        java.lang.String str20 = staff3.getPassword();
        staff3.viewProfile();
        java.lang.String str22 = staff3.getPassword();
        java.lang.String str23 = staff3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 40.0d + "'", double13 == 40.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test12516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12516");
        model.Staff staff3 = new model.Staff("hi!", "", "hi!");
        staff3.setVerified(false);
        java.lang.String str6 = staff3.getPassword();
        java.lang.String str7 = staff3.getAccountType();
        java.lang.String str8 = staff3.getEmail();
        java.lang.String str9 = staff3.getAccountType();
        java.lang.String str10 = staff3.getID();
        java.lang.String str11 = staff3.getEmail();
        staff3.login("", "staff");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "staff" + "'", str7, "staff");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "staff" + "'", str9, "staff");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test12517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12517");
        model.Staff staff3 = new model.Staff("hi!", "hi!", "");
        staff3.setVerified(true);
        staff3.login("staff", "");
        java.lang.String str9 = staff3.getAccountType();
        staff3.logout();
        double double11 = staff3.getHourlyRate();
        boolean boolean12 = staff3.isVerified();
        staff3.setVerified(false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "staff" + "'", str9, "staff");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 40.0d + "'", double11 == 40.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test12518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12518");
        model.Staff staff3 = new model.Staff("", "staff", "staff");
        staff3.setVerified(true);
        java.lang.String str6 = staff3.getPassword();
        boolean boolean7 = staff3.isVerified();
        java.lang.String str8 = staff3.getEmail();
        double double9 = staff3.getHourlyRate();
        staff3.logout();
        double double11 = staff3.getHourlyRate();
        boolean boolean12 = staff3.isVerified();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "staff" + "'", str6, "staff");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 40.0d + "'", double9 == 40.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 40.0d + "'", double11 == 40.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test12519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12519");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getID();
        staff3.setVerified(true);
        java.lang.String str8 = staff3.getID();
        staff3.logout();
        java.lang.String str10 = staff3.getID();
        java.lang.Class<?> wildcardClass11 = staff3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test12520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12520");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        boolean boolean6 = staff3.isVerified();
        staff3.logout();
        java.lang.String str8 = staff3.getAccountType();
        staff3.setVerified(false);
        staff3.viewProfile();
        java.lang.String str12 = staff3.getAccountType();
        java.lang.String str13 = staff3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "staff" + "'", str8, "staff");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "staff" + "'", str12, "staff");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test12521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12521");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        double double6 = staff3.getHourlyRate();
        java.lang.String str7 = staff3.getPassword();
        staff3.login("", "staff");
        boolean boolean11 = staff3.isVerified();
        staff3.setVerified(true);
        staff3.login("hi!", "hi!");
        staff3.viewProfile();
        staff3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 40.0d + "'", double6 == 40.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test12522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12522");
        model.Staff staff3 = new model.Staff("hi!", "staff", "");
        java.lang.String str4 = staff3.getEmail();
        staff3.logout();
        java.lang.String str6 = staff3.getID();
        boolean boolean7 = staff3.isVerified();
        java.lang.String str8 = staff3.getID();
        double double9 = staff3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 40.0d + "'", double9 == 40.0d);
    }

    @Test
    public void test12523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12523");
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
        staff3.setVerified(false);
        staff3.logout();
        staff3.setVerified(true);
        boolean boolean20 = staff3.isVerified();
        boolean boolean21 = staff3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "staff" + "'", str13, "staff");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test12524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12524");
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
        java.lang.String str13 = staff3.getID();
        boolean boolean14 = staff3.isVerified();
        double double15 = staff3.getHourlyRate();
        boolean boolean16 = staff3.isVerified();
        java.lang.Class<?> wildcardClass17 = staff3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 40.0d + "'", double6 == 40.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 40.0d + "'", double15 == 40.0d);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test12525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12525");
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
        java.lang.String str13 = staff3.getPassword();
        double double14 = staff3.getHourlyRate();
        java.lang.String str15 = staff3.getID();
        staff3.login("hi!", "hi!");
        staff3.login("hi!", "");
        staff3.login("staff", "hi!");
        java.lang.String str25 = staff3.getEmail();
        staff3.setVerified(false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 40.0d + "'", double11 == 40.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "staff" + "'", str12, "staff");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 40.0d + "'", double14 == 40.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
    }

    @Test
    public void test12526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12526");
        model.Staff staff3 = new model.Staff("hi!", "staff", "");
        staff3.logout();
        java.lang.String str5 = staff3.getEmail();
        java.lang.String str6 = staff3.getEmail();
        double double7 = staff3.getHourlyRate();
        staff3.setVerified(false);
        staff3.viewProfile();
        staff3.logout();
        java.lang.String str12 = staff3.getEmail();
        java.lang.Class<?> wildcardClass13 = staff3.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 40.0d + "'", double7 == 40.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test12527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12527");
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
        java.lang.String str17 = staff3.getID();
        staff3.viewProfile();
        staff3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test12528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12528");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        boolean boolean6 = staff3.isVerified();
        staff3.viewProfile();
        java.lang.String str8 = staff3.getAccountType();
        staff3.logout();
        staff3.logout();
        java.lang.String str11 = staff3.getEmail();
        java.lang.String str12 = staff3.getID();
        double double13 = staff3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "staff" + "'", str8, "staff");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 40.0d + "'", double13 == 40.0d);
    }

    @Test
    public void test12529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12529");
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
        java.lang.String str18 = staff3.getPassword();
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
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test12530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12530");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        staff3.login("", "");
        staff3.viewProfile();
        staff3.viewProfile();
        staff3.login("", "");
        staff3.logout();
        java.lang.String str13 = staff3.getID();
        boolean boolean14 = staff3.isVerified();
        java.lang.String str15 = staff3.getEmail();
        staff3.logout();
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test12531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12531");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        staff3.logout();
        java.lang.String str5 = staff3.getID();
        java.lang.String str6 = staff3.getEmail();
        double double7 = staff3.getHourlyRate();
        java.lang.String str8 = staff3.getPassword();
        staff3.login("staff", "");
        java.lang.String str12 = staff3.getAccountType();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 40.0d + "'", double7 == 40.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "staff" + "'", str12, "staff");
    }

    @Test
    public void test12532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12532");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        boolean boolean5 = staff3.isVerified();
        java.lang.String str6 = staff3.getID();
        java.lang.String str7 = staff3.getID();
        staff3.setVerified(true);
        java.lang.String str10 = staff3.getAccountType();
        java.lang.String str11 = staff3.getPassword();
        staff3.setVerified(true);
        staff3.logout();
        java.lang.String str15 = staff3.getEmail();
        staff3.login("hi!", "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "staff" + "'", str10, "staff");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test12533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12533");
        model.Staff staff3 = new model.Staff("hi!", "", "hi!");
        java.lang.String str4 = staff3.getAccountType();
        java.lang.String str5 = staff3.getID();
        staff3.setVerified(true);
        java.lang.String str8 = staff3.getAccountType();
        java.lang.String str9 = staff3.getAccountType();
        java.lang.String str10 = staff3.getPassword();
        double double11 = staff3.getHourlyRate();
        staff3.setVerified(false);
        java.lang.Class<?> wildcardClass14 = staff3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "staff" + "'", str4, "staff");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "staff" + "'", str8, "staff");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "staff" + "'", str9, "staff");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 40.0d + "'", double11 == 40.0d);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test12534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12534");
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
        boolean boolean17 = staff3.isVerified();
        boolean boolean18 = staff3.isVerified();
        staff3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 40.0d + "'", double12 == 40.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test12535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12535");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        staff3.logout();
        staff3.viewProfile();
        staff3.setVerified(true);
        java.lang.String str9 = staff3.getEmail();
        staff3.viewProfile();
        double double11 = staff3.getHourlyRate();
        java.lang.String str12 = staff3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 40.0d + "'", double11 == 40.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test12536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12536");
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
        java.lang.String str15 = staff3.getAccountType();
        java.lang.String str16 = staff3.getAccountType();
        java.lang.String str17 = staff3.getAccountType();
        double double18 = staff3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 40.0d + "'", double11 == 40.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "staff" + "'", str15, "staff");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "staff" + "'", str16, "staff");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "staff" + "'", str17, "staff");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 40.0d + "'", double18 == 40.0d);
    }

    @Test
    public void test12537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12537");
        model.Staff staff3 = new model.Staff("hi!", "", "hi!");
        staff3.setVerified(false);
        staff3.viewProfile();
        java.lang.String str7 = staff3.getEmail();
        java.lang.String str8 = staff3.getID();
        staff3.login("hi!", "staff");
        staff3.setVerified(true);
        staff3.viewProfile();
        staff3.login("hi!", "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test12538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12538");
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
        java.lang.String str20 = staff3.getPassword();
        java.lang.Class<?> wildcardClass21 = staff3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 40.0d + "'", double6 == 40.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "staff" + "'", str18, "staff");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test12539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12539");
        model.Staff staff3 = new model.Staff("hi!", "hi!", "");
        staff3.logout();
        java.lang.String str5 = staff3.getID();
        java.lang.Class<?> wildcardClass6 = staff3.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test12540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12540");
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
        staff3.login("hi!", "staff");
        java.lang.String str20 = staff3.getEmail();
        java.lang.String str21 = staff3.getAccountType();
        java.lang.String str22 = staff3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "staff" + "'", str6, "staff");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "staff" + "'", str21, "staff");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test12541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12541");
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
        java.lang.String str17 = staff3.getPassword();
        staff3.login("", "");
        double double21 = staff3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "staff" + "'", str12, "staff");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 40.0d + "'", double16 == 40.0d);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 40.0d + "'", double21 == 40.0d);
    }

    @Test
    public void test12542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12542");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        double double6 = staff3.getHourlyRate();
        java.lang.String str7 = staff3.getPassword();
        java.lang.String str8 = staff3.getPassword();
        staff3.login("staff", "hi!");
        staff3.login("", "hi!");
        staff3.viewProfile();
        java.lang.String str16 = staff3.getAccountType();
        java.lang.String str17 = staff3.getPassword();
        double double18 = staff3.getHourlyRate();
        staff3.viewProfile();
        staff3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 40.0d + "'", double6 == 40.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "staff" + "'", str16, "staff");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 40.0d + "'", double18 == 40.0d);
    }

    @Test
    public void test12543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12543");
        model.Staff staff3 = new model.Staff("", "staff", "staff");
        staff3.setVerified(true);
        java.lang.String str6 = staff3.getPassword();
        boolean boolean7 = staff3.isVerified();
        java.lang.String str8 = staff3.getEmail();
        staff3.logout();
        boolean boolean10 = staff3.isVerified();
        java.lang.String str11 = staff3.getID();
        java.lang.String str12 = staff3.getID();
        java.lang.String str13 = staff3.getEmail();
        java.lang.String str14 = staff3.getID();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "staff" + "'", str6, "staff");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "staff" + "'", str11, "staff");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "staff" + "'", str12, "staff");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "staff" + "'", str14, "staff");
    }

    @Test
    public void test12544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12544");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        boolean boolean6 = staff3.isVerified();
        staff3.login("", "");
        staff3.login("staff", "staff");
        java.lang.String str13 = staff3.getPassword();
        java.lang.String str14 = staff3.getPassword();
        boolean boolean15 = staff3.isVerified();
        java.lang.String str16 = staff3.getPassword();
        staff3.viewProfile();
        staff3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test12545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12545");
        model.Staff staff3 = new model.Staff("hi!", "", "hi!");
        java.lang.String str4 = staff3.getAccountType();
        java.lang.String str5 = staff3.getID();
        staff3.setVerified(true);
        staff3.login("staff", "staff");
        java.lang.String str11 = staff3.getPassword();
        java.lang.String str12 = staff3.getID();
        java.lang.String str13 = staff3.getID();
        java.lang.Class<?> wildcardClass14 = staff3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "staff" + "'", str4, "staff");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test12546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12546");
        model.Staff staff3 = new model.Staff("hi!", "hi!", "");
        staff3.logout();
        java.lang.String str5 = staff3.getEmail();
        staff3.logout();
        java.lang.String str7 = staff3.getID();
        staff3.viewProfile();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test12547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12547");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        staff3.logout();
        java.lang.String str5 = staff3.getID();
        java.lang.String str6 = staff3.getEmail();
        double double7 = staff3.getHourlyRate();
        boolean boolean8 = staff3.isVerified();
        java.lang.String str9 = staff3.getPassword();
        java.lang.String str10 = staff3.getID();
        java.lang.String str11 = staff3.getID();
        java.lang.Class<?> wildcardClass12 = staff3.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 40.0d + "'", double7 == 40.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test12548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12548");
        model.Staff staff3 = new model.Staff("hi!", "", "hi!");
        java.lang.String str4 = staff3.getAccountType();
        java.lang.String str5 = staff3.getID();
        staff3.setVerified(true);
        staff3.login("staff", "staff");
        java.lang.String str11 = staff3.getPassword();
        java.lang.String str12 = staff3.getEmail();
        staff3.logout();
        java.lang.String str14 = staff3.getID();
        staff3.setVerified(false);
        boolean boolean17 = staff3.isVerified();
        boolean boolean18 = staff3.isVerified();
        staff3.login("", "hi!");
        java.lang.String str22 = staff3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "staff" + "'", str4, "staff");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "staff" + "'", str22, "staff");
    }

    @Test
    public void test12549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12549");
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
        double double16 = staff3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 40.0d + "'", double14 == 40.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 40.0d + "'", double16 == 40.0d);
    }

    @Test
    public void test12550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12550");
        model.Staff staff3 = new model.Staff("hi!", "", "hi!");
        java.lang.String str4 = staff3.getAccountType();
        java.lang.String str5 = staff3.getID();
        boolean boolean6 = staff3.isVerified();
        double double7 = staff3.getHourlyRate();
        java.lang.String str8 = staff3.getAccountType();
        double double9 = staff3.getHourlyRate();
        double double10 = staff3.getHourlyRate();
        java.lang.String str11 = staff3.getAccountType();
        staff3.setVerified(true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "staff" + "'", str4, "staff");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 40.0d + "'", double7 == 40.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "staff" + "'", str8, "staff");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 40.0d + "'", double9 == 40.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 40.0d + "'", double10 == 40.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "staff" + "'", str11, "staff");
    }

    @Test
    public void test12551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12551");
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
        staff3.logout();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "staff" + "'", str6, "staff");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 40.0d + "'", double10 == 40.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test12552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12552");
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
        java.lang.String str17 = staff3.getPassword();
        staff3.setVerified(false);
        staff3.logout();
        double double21 = staff3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "staff" + "'", str16, "staff");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 40.0d + "'", double21 == 40.0d);
    }

    @Test
    public void test12553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12553");
        model.Staff staff3 = new model.Staff("staff", "hi!", "");
        staff3.login("hi!", "hi!");
        staff3.logout();
        java.lang.String str8 = staff3.getEmail();
        staff3.setVerified(false);
        java.lang.Class<?> wildcardClass11 = staff3.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "staff" + "'", str8, "staff");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test12554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12554");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        double double6 = staff3.getHourlyRate();
        java.lang.String str7 = staff3.getID();
        boolean boolean8 = staff3.isVerified();
        staff3.logout();
        java.lang.String str10 = staff3.getEmail();
        java.lang.String str11 = staff3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 40.0d + "'", double6 == 40.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test12555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12555");
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
        staff3.login("hi!", "");
        boolean boolean21 = staff3.isVerified();
        staff3.setVerified(true);
        staff3.login("", "staff");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 40.0d + "'", double14 == 40.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test12556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12556");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        boolean boolean6 = staff3.isVerified();
        staff3.logout();
        double double8 = staff3.getHourlyRate();
        boolean boolean9 = staff3.isVerified();
        staff3.logout();
        staff3.viewProfile();
        staff3.login("", "");
        java.lang.String str15 = staff3.getEmail();
        java.lang.String str16 = staff3.getEmail();
        staff3.login("", "staff");
        boolean boolean20 = staff3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 40.0d + "'", double8 == 40.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test12557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12557");
        model.Staff staff3 = new model.Staff("hi!", "", "hi!");
        staff3.setVerified(false);
        java.lang.String str6 = staff3.getPassword();
        java.lang.String str7 = staff3.getAccountType();
        java.lang.String str8 = staff3.getEmail();
        staff3.setVerified(true);
        java.lang.String str11 = staff3.getAccountType();
        staff3.login("staff", "");
        java.lang.String str15 = staff3.getPassword();
        staff3.viewProfile();
        java.lang.String str17 = staff3.getPassword();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "staff" + "'", str7, "staff");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "staff" + "'", str11, "staff");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test12558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12558");
        model.Staff staff3 = new model.Staff("hi!", "", "hi!");
        staff3.logout();
        staff3.login("hi!", "hi!");
        double double8 = staff3.getHourlyRate();
        boolean boolean9 = staff3.isVerified();
        staff3.setVerified(false);
        java.lang.String str12 = staff3.getPassword();
        java.lang.String str13 = staff3.getID();
        double double14 = staff3.getHourlyRate();
        java.lang.String str15 = staff3.getID();
        staff3.login("hi!", "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 40.0d + "'", double8 == 40.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 40.0d + "'", double14 == 40.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test12559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12559");
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
        staff3.viewProfile();
        java.lang.String str18 = staff3.getAccountType();
        java.lang.String str19 = staff3.getAccountType();
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
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "staff" + "'", str18, "staff");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "staff" + "'", str19, "staff");
    }

    @Test
    public void test12560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12560");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        staff3.logout();
        java.lang.String str5 = staff3.getID();
        java.lang.String str6 = staff3.getEmail();
        java.lang.String str7 = staff3.getPassword();
        java.lang.String str8 = staff3.getID();
        staff3.logout();
        java.lang.String str10 = staff3.getAccountType();
        staff3.viewProfile();
        java.lang.String str12 = staff3.getEmail();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "staff" + "'", str10, "staff");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test12561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12561");
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
        staff3.logout();
        staff3.login("", "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "staff" + "'", str13, "staff");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test12562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12562");
        model.Staff staff3 = new model.Staff("hi!", "", "hi!");
        java.lang.String str4 = staff3.getAccountType();
        java.lang.String str5 = staff3.getID();
        staff3.setVerified(true);
        staff3.login("staff", "staff");
        java.lang.String str11 = staff3.getPassword();
        java.lang.String str12 = staff3.getEmail();
        boolean boolean13 = staff3.isVerified();
        java.lang.String str14 = staff3.getPassword();
        staff3.setVerified(true);
        java.lang.Class<?> wildcardClass17 = staff3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "staff" + "'", str4, "staff");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test12563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12563");
        model.Staff staff3 = new model.Staff("hi!", "hi!", "");
        staff3.logout();
        java.lang.String str5 = staff3.getEmail();
        java.lang.String str6 = staff3.getAccountType();
        staff3.login("staff", "staff");
        double double10 = staff3.getHourlyRate();
        staff3.viewProfile();
        double double12 = staff3.getHourlyRate();
        java.lang.String str13 = staff3.getAccountType();
        staff3.logout();
        staff3.logout();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "staff" + "'", str6, "staff");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 40.0d + "'", double10 == 40.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 40.0d + "'", double12 == 40.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "staff" + "'", str13, "staff");
    }

    @Test
    public void test12564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12564");
        model.Staff staff3 = new model.Staff("hi!", "hi!", "");
        staff3.logout();
        java.lang.String str5 = staff3.getEmail();
        boolean boolean6 = staff3.isVerified();
        java.lang.String str7 = staff3.getID();
        java.lang.String str8 = staff3.getPassword();
        boolean boolean9 = staff3.isVerified();
        boolean boolean10 = staff3.isVerified();
        java.lang.String str11 = staff3.getPassword();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test12565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12565");
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
        boolean boolean14 = staff3.isVerified();
        staff3.setVerified(true);
        boolean boolean17 = staff3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "staff" + "'", str6, "staff");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test12566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12566");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        boolean boolean6 = staff3.isVerified();
        staff3.logout();
        staff3.setVerified(false);
        java.lang.String str10 = staff3.getEmail();
        staff3.logout();
        java.lang.String str12 = staff3.getID();
        staff3.setVerified(true);
        java.lang.String str15 = staff3.getID();
        java.lang.String str16 = staff3.getEmail();
        java.lang.String str17 = staff3.getPassword();
        java.lang.String str18 = staff3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "staff" + "'", str18, "staff");
    }

    @Test
    public void test12567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12567");
        model.Staff staff3 = new model.Staff("hi!", "", "hi!");
        staff3.logout();
        staff3.login("hi!", "hi!");
        double double8 = staff3.getHourlyRate();
        java.lang.String str9 = staff3.getID();
        java.lang.String str10 = staff3.getAccountType();
        staff3.login("", "hi!");
        staff3.logout();
        staff3.setVerified(true);
        staff3.login("hi!", "");
        double double20 = staff3.getHourlyRate();
        boolean boolean21 = staff3.isVerified();
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 40.0d + "'", double8 == 40.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "staff" + "'", str10, "staff");
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 40.0d + "'", double20 == 40.0d);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test12568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12568");
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
        double double17 = staff3.getHourlyRate();
        boolean boolean18 = staff3.isVerified();
        java.lang.String str19 = staff3.getEmail();
        java.lang.String str20 = staff3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "staff" + "'", str13, "staff");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 40.0d + "'", double17 == 40.0d);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "staff" + "'", str20, "staff");
    }

    @Test
    public void test12569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12569");
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
        staff3.setVerified(false);
        staff3.logout();
        staff3.setVerified(true);
        staff3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "staff" + "'", str13, "staff");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test12570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12570");
        model.Staff staff3 = new model.Staff("hi!", "hi!", "");
        staff3.logout();
        double double5 = staff3.getHourlyRate();
        staff3.login("", "staff");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 40.0d + "'", double5 == 40.0d);
    }

    @Test
    public void test12571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12571");
        model.Staff staff3 = new model.Staff("", "staff", "");
        staff3.login("staff", "");
        boolean boolean7 = staff3.isVerified();
        java.lang.String str8 = staff3.getEmail();
        java.lang.String str9 = staff3.getPassword();
        staff3.logout();
        staff3.setVerified(true);
        double double13 = staff3.getHourlyRate();
        staff3.login("staff", "hi!");
        staff3.login("hi!", "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "staff" + "'", str9, "staff");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 40.0d + "'", double13 == 40.0d);
    }

    @Test
    public void test12572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12572");
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
        java.lang.String str17 = staff3.getPassword();
        java.lang.String str18 = staff3.getPassword();
        staff3.viewProfile();
        java.lang.String str20 = staff3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "staff" + "'", str13, "staff");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "staff" + "'", str14, "staff");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test12573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12573");
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
        java.lang.String str19 = staff3.getID();
        java.lang.String str20 = staff3.getEmail();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "staff" + "'", str8, "staff");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 40.0d + "'", double14 == 40.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "staff" + "'", str15, "staff");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test12574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12574");
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
        double double22 = staff3.getHourlyRate();
        staff3.viewProfile();
        java.lang.String str24 = staff3.getID();
        staff3.setVerified(false);
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
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 40.0d + "'", double22 == 40.0d);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
    }

    @Test
    public void test12575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12575");
        model.Staff staff3 = new model.Staff("hi!", "", "hi!");
        double double4 = staff3.getHourlyRate();
        double double5 = staff3.getHourlyRate();
        java.lang.String str6 = staff3.getEmail();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 40.0d + "'", double4 == 40.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 40.0d + "'", double5 == 40.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test12576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12576");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        staff3.login("", "");
        double double7 = staff3.getHourlyRate();
        boolean boolean8 = staff3.isVerified();
        java.lang.String str9 = staff3.getEmail();
        java.lang.String str10 = staff3.getEmail();
        staff3.logout();
        double double12 = staff3.getHourlyRate();
        double double13 = staff3.getHourlyRate();
        java.lang.String str14 = staff3.getEmail();
        staff3.setVerified(true);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 40.0d + "'", double7 == 40.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 40.0d + "'", double12 == 40.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 40.0d + "'", double13 == 40.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test12577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12577");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        java.lang.String str6 = staff3.getPassword();
        staff3.setVerified(false);
        java.lang.String str9 = staff3.getEmail();
        double double10 = staff3.getHourlyRate();
        staff3.setVerified(true);
        boolean boolean13 = staff3.isVerified();
        boolean boolean14 = staff3.isVerified();
        java.lang.String str15 = staff3.getPassword();
        double double16 = staff3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 40.0d + "'", double10 == 40.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 40.0d + "'", double16 == 40.0d);
    }

    @Test
    public void test12578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12578");
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
        staff3.login("", "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "staff" + "'", str7, "staff");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test12579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12579");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        staff3.logout();
        java.lang.String str5 = staff3.getID();
        staff3.setVerified(true);
        staff3.setVerified(true);
        java.lang.String str10 = staff3.getID();
        staff3.logout();
        double double12 = staff3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 40.0d + "'", double12 == 40.0d);
    }

    @Test
    public void test12580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12580");
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
        double double22 = staff3.getHourlyRate();
        staff3.login("staff", "hi!");
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
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 40.0d + "'", double22 == 40.0d);
    }

    @Test
    public void test12581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12581");
        model.Staff staff3 = new model.Staff("", "staff", "");
        staff3.setVerified(true);
        staff3.login("", "hi!");
        boolean boolean9 = staff3.isVerified();
        double double10 = staff3.getHourlyRate();
        staff3.viewProfile();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 40.0d + "'", double10 == 40.0d);
    }

    @Test
    public void test12582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12582");
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
        staff3.login("hi!", "");
        java.lang.Class<?> wildcardClass17 = staff3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 40.0d + "'", double12 == 40.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test12583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12583");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        staff3.logout();
        java.lang.String str5 = staff3.getID();
        java.lang.String str6 = staff3.getEmail();
        double double7 = staff3.getHourlyRate();
        java.lang.String str8 = staff3.getEmail();
        staff3.login("", "");
        boolean boolean12 = staff3.isVerified();
        staff3.login("hi!", "staff");
        java.lang.String str16 = staff3.getPassword();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 40.0d + "'", double7 == 40.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test12584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12584");
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
        staff3.setVerified(true);
        double double17 = staff3.getHourlyRate();
        staff3.login("", "");
        staff3.logout();
        double double22 = staff3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "staff" + "'", str13, "staff");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 40.0d + "'", double17 == 40.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 40.0d + "'", double22 == 40.0d);
    }

    @Test
    public void test12585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12585");
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
        java.lang.String str16 = staff3.getPassword();
        java.lang.String str17 = staff3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "staff" + "'", str4, "staff");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "staff" + "'", str11, "staff");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 40.0d + "'", double12 == 40.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test12586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12586");
        model.Staff staff3 = new model.Staff("hi!", "", "hi!");
        staff3.logout();
        staff3.login("hi!", "hi!");
        double double8 = staff3.getHourlyRate();
        boolean boolean9 = staff3.isVerified();
        boolean boolean10 = staff3.isVerified();
        boolean boolean11 = staff3.isVerified();
        boolean boolean12 = staff3.isVerified();
        staff3.logout();
        staff3.logout();
        staff3.login("hi!", "");
        staff3.login("hi!", "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 40.0d + "'", double8 == 40.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test12587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12587");
        model.Staff staff3 = new model.Staff("hi!", "hi!", "");
        staff3.setVerified(true);
        staff3.login("hi!", "hi!");
        java.lang.String str9 = staff3.getID();
        double double10 = staff3.getHourlyRate();
        staff3.logout();
        java.lang.String str12 = staff3.getEmail();
        java.lang.String str13 = staff3.getPassword();
        staff3.setVerified(false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 40.0d + "'", double10 == 40.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test12588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12588");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        java.lang.String str6 = staff3.getPassword();
        staff3.setVerified(false);
        staff3.setVerified(false);
        java.lang.String str11 = staff3.getID();
        java.lang.String str12 = staff3.getAccountType();
        staff3.setVerified(false);
        java.lang.String str15 = staff3.getAccountType();
        staff3.logout();
        java.lang.String str17 = staff3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "staff" + "'", str12, "staff");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "staff" + "'", str15, "staff");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test12589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12589");
        model.Staff staff3 = new model.Staff("hi!", "", "hi!");
        staff3.setVerified(false);
        java.lang.String str6 = staff3.getPassword();
        java.lang.String str7 = staff3.getID();
        staff3.login("", "hi!");
        staff3.setVerified(false);
        boolean boolean13 = staff3.isVerified();
        staff3.logout();
        staff3.setVerified(true);
        java.lang.String str17 = staff3.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test12590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12590");
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
        staff3.login("staff", "hi!");
        java.lang.String str18 = staff3.getPassword();
        java.lang.String str19 = staff3.getID();
        java.lang.String str20 = staff3.getPassword();
        java.lang.String str21 = staff3.getEmail();
        boolean boolean22 = staff3.isVerified();
        java.lang.String str23 = staff3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 40.0d + "'", double14 == 40.0d);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "staff" + "'", str23, "staff");
    }

    @Test
    public void test12591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12591");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        staff3.login("", "");
        double double7 = staff3.getHourlyRate();
        staff3.login("staff", "staff");
        java.lang.String str11 = staff3.getID();
        staff3.logout();
        staff3.logout();
        double double14 = staff3.getHourlyRate();
        java.lang.String str15 = staff3.getEmail();
        java.lang.String str16 = staff3.getPassword();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 40.0d + "'", double7 == 40.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 40.0d + "'", double14 == 40.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test12592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12592");
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
        java.lang.String str15 = staff3.getPassword();
        boolean boolean16 = staff3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "staff" + "'", str10, "staff");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "staff" + "'", str14, "staff");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test12593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12593");
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
        boolean boolean15 = staff3.isVerified();
        staff3.login("", "staff");
        java.lang.String str19 = staff3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "staff" + "'", str13, "staff");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test12594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12594");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        boolean boolean5 = staff3.isVerified();
        java.lang.String str6 = staff3.getAccountType();
        staff3.logout();
        boolean boolean8 = staff3.isVerified();
        staff3.setVerified(true);
        java.lang.String str11 = staff3.getPassword();
        java.lang.String str12 = staff3.getPassword();
        java.lang.String str13 = staff3.getAccountType();
        java.lang.String str14 = staff3.getAccountType();
        boolean boolean15 = staff3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "staff" + "'", str6, "staff");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "staff" + "'", str13, "staff");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "staff" + "'", str14, "staff");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test12595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12595");
        model.Staff staff3 = new model.Staff("hi!", "", "hi!");
        java.lang.String str4 = staff3.getPassword();
        double double5 = staff3.getHourlyRate();
        double double6 = staff3.getHourlyRate();
        staff3.logout();
        java.lang.String str8 = staff3.getAccountType();
        double double9 = staff3.getHourlyRate();
        java.lang.String str10 = staff3.getPassword();
        staff3.login("staff", "staff");
        staff3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 40.0d + "'", double5 == 40.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 40.0d + "'", double6 == 40.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "staff" + "'", str8, "staff");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 40.0d + "'", double9 == 40.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test12596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12596");
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
        java.lang.String str15 = staff3.getPassword();
        staff3.logout();
        staff3.logout();
        double double18 = staff3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 40.0d + "'", double14 == 40.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 40.0d + "'", double18 == 40.0d);
    }

    @Test
    public void test12597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12597");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        boolean boolean5 = staff3.isVerified();
        java.lang.String str6 = staff3.getID();
        boolean boolean7 = staff3.isVerified();
        java.lang.Class<?> wildcardClass8 = staff3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test12598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12598");
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
        java.lang.String str18 = staff3.getEmail();
        staff3.logout();
        staff3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 40.0d + "'", double17 == 40.0d);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test12599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12599");
        model.Staff staff3 = new model.Staff("hi!", "staff", "");
        java.lang.String str4 = staff3.getEmail();
        double double5 = staff3.getHourlyRate();
        staff3.logout();
        java.lang.String str7 = staff3.getAccountType();
        staff3.viewProfile();
        double double9 = staff3.getHourlyRate();
        staff3.login("hi!", "hi!");
        staff3.logout();
        staff3.setVerified(true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 40.0d + "'", double5 == 40.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "staff" + "'", str7, "staff");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 40.0d + "'", double9 == 40.0d);
    }

    @Test
    public void test12600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12600");
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
        java.lang.String str14 = staff3.getPassword();
        java.lang.String str15 = staff3.getEmail();
        boolean boolean16 = staff3.isVerified();
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
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test12601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12601");
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
        java.lang.String str13 = staff3.getID();
        staff3.logout();
        double double15 = staff3.getHourlyRate();
        staff3.logout();
        java.lang.Class<?> wildcardClass17 = staff3.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 40.0d + "'", double7 == 40.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "staff" + "'", str10, "staff");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 40.0d + "'", double15 == 40.0d);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test12602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12602");
        model.Staff staff3 = new model.Staff("hi!", "hi!", "");
        staff3.viewProfile();
        java.lang.String str5 = staff3.getAccountType();
        java.lang.String str6 = staff3.getEmail();
        java.lang.String str7 = staff3.getAccountType();
        java.lang.String str8 = staff3.getPassword();
        staff3.setVerified(false);
        staff3.login("staff", "hi!");
        staff3.logout();
        staff3.setVerified(true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "staff" + "'", str7, "staff");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test12603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12603");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        java.lang.String str6 = staff3.getPassword();
        java.lang.String str7 = staff3.getPassword();
        java.lang.String str8 = staff3.getID();
        java.lang.String str9 = staff3.getID();
        staff3.viewProfile();
        java.lang.String str11 = staff3.getPassword();
        staff3.setVerified(false);
        staff3.logout();
        staff3.viewProfile();
        java.lang.String str16 = staff3.getAccountType();
        boolean boolean17 = staff3.isVerified();
        java.lang.Class<?> wildcardClass18 = staff3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "staff" + "'", str16, "staff");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test12604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12604");
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
        java.lang.String str20 = staff3.getID();
        java.lang.Class<?> wildcardClass21 = staff3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "staff" + "'", str8, "staff");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 40.0d + "'", double14 == 40.0d);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test12605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12605");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        boolean boolean5 = staff3.isVerified();
        java.lang.String str6 = staff3.getID();
        boolean boolean7 = staff3.isVerified();
        staff3.logout();
        staff3.logout();
        double double10 = staff3.getHourlyRate();
        staff3.login("hi!", "staff");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 40.0d + "'", double10 == 40.0d);
    }

    @Test
    public void test12606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12606");
        model.Staff staff3 = new model.Staff("hi!", "hi!", "");
        staff3.logout();
        java.lang.String str5 = staff3.getEmail();
        staff3.logout();
        staff3.login("", "staff");
        java.lang.String str10 = staff3.getPassword();
        java.lang.String str11 = staff3.getAccountType();
        java.lang.String str12 = staff3.getPassword();
        staff3.login("hi!", "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "staff" + "'", str11, "staff");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test12607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12607");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        double double6 = staff3.getHourlyRate();
        staff3.logout();
        staff3.setVerified(false);
        java.lang.String str10 = staff3.getPassword();
        java.lang.String str11 = staff3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 40.0d + "'", double6 == 40.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test12608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12608");
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
        boolean boolean13 = staff3.isVerified();
        staff3.logout();
        double double15 = staff3.getHourlyRate();
        java.lang.String str16 = staff3.getID();
        java.lang.String str17 = staff3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "staff" + "'", str6, "staff");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 40.0d + "'", double10 == 40.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 40.0d + "'", double12 == 40.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 40.0d + "'", double15 == 40.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "staff" + "'", str17, "staff");
    }

    @Test
    public void test12609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12609");
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
        staff3.logout();
        java.lang.String str17 = staff3.getEmail();
        staff3.setVerified(false);
        java.lang.String str20 = staff3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 40.0d + "'", double13 == 40.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test12610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12610");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        boolean boolean5 = staff3.isVerified();
        java.lang.String str6 = staff3.getID();
        java.lang.String str7 = staff3.getID();
        double double8 = staff3.getHourlyRate();
        staff3.logout();
        staff3.logout();
        staff3.setVerified(true);
        java.lang.String str13 = staff3.getID();
        boolean boolean14 = staff3.isVerified();
        java.lang.String str15 = staff3.getPassword();
        java.lang.String str16 = staff3.getPassword();
        java.lang.String str17 = staff3.getID();
        staff3.login("hi!", "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 40.0d + "'", double8 == 40.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test12611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12611");
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
        double double24 = staff3.getHourlyRate();
        java.lang.String str25 = staff3.getEmail();
        java.lang.String str26 = staff3.getPassword();
        java.lang.Class<?> wildcardClass27 = staff3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 40.0d + "'", double16 == 40.0d);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "staff" + "'", str20, "staff");
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 40.0d + "'", double24 == 40.0d);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test12612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12612");
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
        java.lang.String str13 = staff3.getAccountType();
        staff3.setVerified(true);
        java.lang.String str16 = staff3.getEmail();
        java.lang.String str17 = staff3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "staff" + "'", str12, "staff");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "staff" + "'", str13, "staff");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test12613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12613");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        staff3.logout();
        java.lang.String str5 = staff3.getID();
        java.lang.String str6 = staff3.getEmail();
        staff3.viewProfile();
        staff3.login("hi!", "staff");
        staff3.viewProfile();
        java.lang.String str12 = staff3.getEmail();
        staff3.logout();
        java.lang.String str14 = staff3.getID();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test12614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12614");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        boolean boolean6 = staff3.isVerified();
        staff3.logout();
        java.lang.String str8 = staff3.getEmail();
        staff3.viewProfile();
        java.lang.String str10 = staff3.getID();
        boolean boolean11 = staff3.isVerified();
        staff3.login("staff", "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test12615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12615");
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
        java.lang.Class<?> wildcardClass15 = staff3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 40.0d + "'", double11 == 40.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 40.0d + "'", double14 == 40.0d);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test12616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12616");
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
        staff3.viewProfile();
        staff3.logout();
        staff3.setVerified(true);
        staff3.logout();
        staff3.logout();
        java.lang.String str22 = staff3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "staff" + "'", str13, "staff");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "staff" + "'", str14, "staff");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
    }

    @Test
    public void test12617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12617");
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
        java.lang.String str22 = staff3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "staff" + "'", str6, "staff");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "staff" + "'", str22, "staff");
    }

    @Test
    public void test12618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12618");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        boolean boolean5 = staff3.isVerified();
        java.lang.String str6 = staff3.getID();
        staff3.setVerified(false);
        java.lang.String str9 = staff3.getID();
        staff3.setVerified(false);
        staff3.logout();
        boolean boolean13 = staff3.isVerified();
        double double14 = staff3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 40.0d + "'", double14 == 40.0d);
    }

    @Test
    public void test12619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12619");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        boolean boolean5 = staff3.isVerified();
        java.lang.String str6 = staff3.getAccountType();
        staff3.logout();
        boolean boolean8 = staff3.isVerified();
        staff3.setVerified(true);
        staff3.setVerified(false);
        boolean boolean13 = staff3.isVerified();
        staff3.login("", "hi!");
        boolean boolean17 = staff3.isVerified();
        java.lang.String str18 = staff3.getID();
        staff3.setVerified(true);
        staff3.login("staff", "");
        boolean boolean24 = staff3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "staff" + "'", str6, "staff");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test12620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12620");
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
        java.lang.String str15 = staff3.getAccountType();
        java.lang.String str16 = staff3.getEmail();
        java.lang.String str17 = staff3.getPassword();
        java.lang.String str18 = staff3.getID();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "staff" + "'", str7, "staff");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "staff" + "'", str15, "staff");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test12621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12621");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        staff3.logout();
        java.lang.String str5 = staff3.getID();
        java.lang.String str6 = staff3.getEmail();
        java.lang.String str7 = staff3.getEmail();
        double double8 = staff3.getHourlyRate();
        boolean boolean9 = staff3.isVerified();
        java.lang.String str10 = staff3.getAccountType();
        staff3.logout();
        staff3.setVerified(false);
        java.lang.String str14 = staff3.getAccountType();
        java.lang.String str15 = staff3.getAccountType();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 40.0d + "'", double8 == 40.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "staff" + "'", str10, "staff");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "staff" + "'", str14, "staff");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "staff" + "'", str15, "staff");
    }

    @Test
    public void test12622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12622");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        staff3.logout();
        staff3.logout();
        java.lang.String str7 = staff3.getID();
        staff3.viewProfile();
        staff3.login("staff", "staff");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test12623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12623");
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
        boolean boolean15 = staff3.isVerified();
        double double16 = staff3.getHourlyRate();
        java.lang.String str17 = staff3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "staff" + "'", str10, "staff");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 40.0d + "'", double16 == 40.0d);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test12624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12624");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        java.lang.String str6 = staff3.getPassword();
        staff3.setVerified(false);
        staff3.setVerified(true);
        staff3.viewProfile();
        java.lang.String str12 = staff3.getID();
        java.lang.String str13 = staff3.getAccountType();
        java.lang.String str14 = staff3.getID();
        staff3.login("staff", "hi!");
        staff3.viewProfile();
        java.lang.String str19 = staff3.getPassword();
        java.lang.String str20 = staff3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "staff" + "'", str13, "staff");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test12625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12625");
        model.Staff staff3 = new model.Staff("hi!", "hi!", "");
        staff3.logout();
        boolean boolean5 = staff3.isVerified();
        java.lang.String str6 = staff3.getPassword();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test12626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12626");
        model.Staff staff3 = new model.Staff("hi!", "", "hi!");
        staff3.setVerified(false);
        java.lang.String str6 = staff3.getEmail();
        staff3.setVerified(false);
        staff3.login("staff", "hi!");
        staff3.logout();
        staff3.viewProfile();
        java.lang.String str14 = staff3.getAccountType();
        java.lang.String str15 = staff3.getID();
        java.lang.String str16 = staff3.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "staff" + "'", str14, "staff");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test12627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12627");
        model.Staff staff3 = new model.Staff("hi!", "", "hi!");
        java.lang.String str4 = staff3.getPassword();
        double double5 = staff3.getHourlyRate();
        double double6 = staff3.getHourlyRate();
        staff3.logout();
        boolean boolean8 = staff3.isVerified();
        java.lang.String str9 = staff3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 40.0d + "'", double5 == 40.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 40.0d + "'", double6 == 40.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test12628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12628");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        double double6 = staff3.getHourlyRate();
        java.lang.String str7 = staff3.getPassword();
        java.lang.String str8 = staff3.getPassword();
        staff3.login("staff", "staff");
        double double12 = staff3.getHourlyRate();
        java.lang.String str13 = staff3.getEmail();
        staff3.setVerified(false);
        staff3.viewProfile();
        staff3.logout();
        java.lang.String str18 = staff3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 40.0d + "'", double6 == 40.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 40.0d + "'", double12 == 40.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test12629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12629");
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
        java.lang.String str13 = staff3.getEmail();
        boolean boolean14 = staff3.isVerified();
        staff3.setVerified(false);
        staff3.setVerified(true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "staff" + "'", str12, "staff");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test12630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12630");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        boolean boolean6 = staff3.isVerified();
        staff3.login("", "");
        staff3.login("staff", "staff");
        java.lang.String str13 = staff3.getAccountType();
        java.lang.String str14 = staff3.getEmail();
        java.lang.String str15 = staff3.getEmail();
        staff3.logout();
        double double17 = staff3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "staff" + "'", str13, "staff");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 40.0d + "'", double17 == 40.0d);
    }

    @Test
    public void test12631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12631");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        staff3.logout();
        staff3.setVerified(false);
        java.lang.String str7 = staff3.getAccountType();
        java.lang.String str8 = staff3.getEmail();
        staff3.login("hi!", "staff");
        boolean boolean12 = staff3.isVerified();
        staff3.login("hi!", "");
        staff3.logout();
        staff3.login("", "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "staff" + "'", str7, "staff");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test12632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12632");
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
        boolean boolean17 = staff3.isVerified();
        staff3.logout();
        java.lang.String str19 = staff3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 40.0d + "'", double11 == 40.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "staff" + "'", str19, "staff");
    }

    @Test
    public void test12633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12633");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        boolean boolean5 = staff3.isVerified();
        java.lang.String str6 = staff3.getAccountType();
        staff3.logout();
        java.lang.String str8 = staff3.getEmail();
        staff3.viewProfile();
        java.lang.String str10 = staff3.getAccountType();
        double double11 = staff3.getHourlyRate();
        staff3.login("hi!", "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "staff" + "'", str6, "staff");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "staff" + "'", str10, "staff");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 40.0d + "'", double11 == 40.0d);
    }

    @Test
    public void test12634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12634");
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
        java.lang.String str14 = staff3.getPassword();
        java.lang.String str15 = staff3.getPassword();
        staff3.logout();
        staff3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "staff" + "'", str8, "staff");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "staff" + "'", str12, "staff");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test12635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12635");
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
        staff3.logout();
        staff3.logout();
        java.lang.String str15 = staff3.getID();
        double double16 = staff3.getHourlyRate();
        java.lang.String str17 = staff3.getAccountType();
        staff3.login("", "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "staff" + "'", str12, "staff");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 40.0d + "'", double16 == 40.0d);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "staff" + "'", str17, "staff");
    }

    @Test
    public void test12636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12636");
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
    public void test12637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12637");
        model.Staff staff3 = new model.Staff("hi!", "", "hi!");
        staff3.setVerified(false);
        java.lang.String str6 = staff3.getEmail();
        staff3.setVerified(false);
        staff3.login("staff", "hi!");
        java.lang.String str12 = staff3.getAccountType();
        double double13 = staff3.getHourlyRate();
        java.lang.String str14 = staff3.getID();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "staff" + "'", str12, "staff");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 40.0d + "'", double13 == 40.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test12638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12638");
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
        java.lang.String str14 = staff3.getID();
        double double15 = staff3.getHourlyRate();
        java.lang.String str16 = staff3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "staff" + "'", str6, "staff");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "staff" + "'", str12, "staff");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 40.0d + "'", double15 == 40.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "staff" + "'", str16, "staff");
    }

    @Test
    public void test12639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12639");
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
        java.lang.String str18 = staff3.getPassword();
        java.lang.String str19 = staff3.getEmail();
        java.lang.String str20 = staff3.getID();
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
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test12640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12640");
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
        boolean boolean19 = staff3.isVerified();
        java.lang.String str20 = staff3.getID();
        java.lang.String str21 = staff3.getEmail();
        double double22 = staff3.getHourlyRate();
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
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 40.0d + "'", double22 == 40.0d);
    }

    @Test
    public void test12641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12641");
        model.Staff staff3 = new model.Staff("staff", "hi!", "");
        staff3.login("hi!", "hi!");
        staff3.logout();
        staff3.setVerified(false);
        java.lang.Class<?> wildcardClass10 = staff3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test12642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12642");
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
        java.lang.String str16 = staff3.getEmail();
        staff3.viewProfile();
        staff3.login("", "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "staff" + "'", str11, "staff");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 40.0d + "'", double13 == 40.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test12643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12643");
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
        java.lang.String str19 = staff3.getPassword();
        java.lang.String str20 = staff3.getID();
        staff3.setVerified(true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test12644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12644");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        staff3.logout();
        java.lang.String str5 = staff3.getID();
        java.lang.String str6 = staff3.getEmail();
        double double7 = staff3.getHourlyRate();
        boolean boolean8 = staff3.isVerified();
        java.lang.String str9 = staff3.getPassword();
        java.lang.String str10 = staff3.getID();
        staff3.login("hi!", "staff");
        staff3.logout();
        double double15 = staff3.getHourlyRate();
        staff3.viewProfile();
        staff3.viewProfile();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 40.0d + "'", double7 == 40.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 40.0d + "'", double15 == 40.0d);
    }

    @Test
    public void test12645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12645");
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
        java.lang.String str20 = staff3.getID();
        java.lang.String str21 = staff3.getID();
        java.lang.String str22 = staff3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 40.0d + "'", double11 == 40.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 40.0d + "'", double18 == 40.0d);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
    }

    @Test
    public void test12646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12646");
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
        java.lang.String str15 = staff3.getPassword();
        staff3.viewProfile();
        staff3.setVerified(false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test12647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12647");
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
        staff3.setVerified(false);
        staff3.login("", "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "staff" + "'", str6, "staff");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "staff" + "'", str12, "staff");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 40.0d + "'", double14 == 40.0d);
    }

    @Test
    public void test12648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12648");
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
        staff3.setVerified(false);
        staff3.login("", "staff");
        staff3.viewProfile();
        staff3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 40.0d + "'", double6 == 40.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test12649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12649");
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
        java.lang.String str17 = staff3.getAccountType();
        staff3.viewProfile();
        java.lang.String str19 = staff3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 40.0d + "'", double14 == 40.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "staff" + "'", str17, "staff");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test12650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12650");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        boolean boolean6 = staff3.isVerified();
        staff3.login("", "");
        java.lang.String str10 = staff3.getAccountType();
        staff3.viewProfile();
        staff3.login("hi!", "");
        java.lang.String str15 = staff3.getEmail();
        java.lang.String str16 = staff3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "staff" + "'", str10, "staff");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test12651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12651");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        boolean boolean5 = staff3.isVerified();
        java.lang.String str6 = staff3.getID();
        java.lang.String str7 = staff3.getID();
        double double8 = staff3.getHourlyRate();
        staff3.logout();
        staff3.logout();
        staff3.setVerified(true);
        java.lang.String str13 = staff3.getID();
        java.lang.String str14 = staff3.getEmail();
        staff3.setVerified(true);
        java.lang.String str17 = staff3.getEmail();
        java.lang.String str18 = staff3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 40.0d + "'", double8 == 40.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test12652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12652");
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
        staff3.login("", "staff");
        double double21 = staff3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 40.0d + "'", double17 == 40.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 40.0d + "'", double21 == 40.0d);
    }

    @Test
    public void test12653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12653");
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
        java.lang.String str13 = staff3.getID();
        java.lang.String str14 = staff3.getAccountType();
        java.lang.String str15 = staff3.getAccountType();
        double double16 = staff3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 40.0d + "'", double7 == 40.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "staff" + "'", str10, "staff");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "staff" + "'", str14, "staff");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "staff" + "'", str15, "staff");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 40.0d + "'", double16 == 40.0d);
    }

    @Test
    public void test12654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12654");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        boolean boolean5 = staff3.isVerified();
        java.lang.String str6 = staff3.getID();
        staff3.login("", "staff");
        staff3.login("hi!", "hi!");
        java.lang.String str13 = staff3.getAccountType();
        java.lang.String str14 = staff3.getEmail();
        staff3.setVerified(false);
        staff3.viewProfile();
        java.lang.String str18 = staff3.getID();
        java.lang.String str19 = staff3.getID();
        java.lang.Class<?> wildcardClass20 = staff3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "staff" + "'", str13, "staff");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test12655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12655");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        boolean boolean5 = staff3.isVerified();
        java.lang.String str6 = staff3.getID();
        staff3.login("", "staff");
        staff3.login("hi!", "hi!");
        java.lang.String str13 = staff3.getAccountType();
        java.lang.String str14 = staff3.getPassword();
        boolean boolean15 = staff3.isVerified();
        java.lang.String str16 = staff3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "staff" + "'", str13, "staff");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test12656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12656");
        model.Staff staff3 = new model.Staff("hi!", "", "hi!");
        staff3.setVerified(false);
        java.lang.String str6 = staff3.getPassword();
        java.lang.String str7 = staff3.getAccountType();
        java.lang.String str8 = staff3.getEmail();
        staff3.setVerified(true);
        java.lang.String str11 = staff3.getAccountType();
        staff3.login("staff", "");
        java.lang.String str15 = staff3.getID();
        staff3.login("", "hi!");
        staff3.login("", "hi!");
        java.lang.String str22 = staff3.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "staff" + "'", str7, "staff");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "staff" + "'", str11, "staff");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
    }

    @Test
    public void test12657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12657");
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
        double double18 = staff3.getHourlyRate();
        java.lang.String str19 = staff3.getPassword();
        staff3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "staff" + "'", str11, "staff");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 40.0d + "'", double18 == 40.0d);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test12658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12658");
        model.Staff staff3 = new model.Staff("hi!", "hi!", "");
        staff3.logout();
        java.lang.String str5 = staff3.getEmail();
        boolean boolean6 = staff3.isVerified();
        java.lang.String str7 = staff3.getID();
        java.lang.String str8 = staff3.getPassword();
        java.lang.String str9 = staff3.getID();
        double double10 = staff3.getHourlyRate();
        staff3.viewProfile();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 40.0d + "'", double10 == 40.0d);
    }

    @Test
    public void test12659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12659");
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
        staff3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "staff" + "'", str14, "staff");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test12660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12660");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        boolean boolean5 = staff3.isVerified();
        java.lang.String str6 = staff3.getID();
        staff3.setVerified(false);
        java.lang.String str9 = staff3.getID();
        staff3.setVerified(false);
        staff3.logout();
        staff3.setVerified(false);
        double double15 = staff3.getHourlyRate();
        staff3.login("hi!", "hi!");
        java.lang.String str19 = staff3.getAccountType();
        java.lang.String str20 = staff3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 40.0d + "'", double15 == 40.0d);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "staff" + "'", str19, "staff");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test12661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12661");
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
        double double23 = staff3.getHourlyRate();
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
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 40.0d + "'", double23 == 40.0d);
    }

    @Test
    public void test12662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12662");
        model.Staff staff3 = new model.Staff("hi!", "", "hi!");
        java.lang.String str4 = staff3.getAccountType();
        java.lang.String str5 = staff3.getEmail();
        double double6 = staff3.getHourlyRate();
        double double7 = staff3.getHourlyRate();
        java.lang.String str8 = staff3.getPassword();
        boolean boolean9 = staff3.isVerified();
        boolean boolean10 = staff3.isVerified();
        staff3.logout();
        staff3.logout();
        staff3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "staff" + "'", str4, "staff");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 40.0d + "'", double6 == 40.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 40.0d + "'", double7 == 40.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test12663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12663");
        model.Staff staff3 = new model.Staff("hi!", "", "hi!");
        java.lang.String str4 = staff3.getAccountType();
        java.lang.String str5 = staff3.getEmail();
        double double6 = staff3.getHourlyRate();
        staff3.logout();
        java.lang.String str8 = staff3.getEmail();
        java.lang.String str9 = staff3.getEmail();
        java.lang.String str10 = staff3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "staff" + "'", str4, "staff");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 40.0d + "'", double6 == 40.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "staff" + "'", str10, "staff");
    }

    @Test
    public void test12664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12664");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        boolean boolean6 = staff3.isVerified();
        staff3.logout();
        double double8 = staff3.getHourlyRate();
        staff3.viewProfile();
        staff3.login("staff", "");
        java.lang.String str13 = staff3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 40.0d + "'", double8 == 40.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "staff" + "'", str13, "staff");
    }

    @Test
    public void test12665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12665");
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
        java.lang.String str23 = staff3.getAccountType();
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
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "staff" + "'", str23, "staff");
    }

    @Test
    public void test12666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12666");
        model.Staff staff3 = new model.Staff("hi!", "", "hi!");
        staff3.logout();
        staff3.login("hi!", "hi!");
        double double8 = staff3.getHourlyRate();
        java.lang.String str9 = staff3.getID();
        java.lang.String str10 = staff3.getEmail();
        java.lang.String str11 = staff3.getPassword();
        java.lang.String str12 = staff3.getID();
        double double13 = staff3.getHourlyRate();
        boolean boolean14 = staff3.isVerified();
        java.lang.String str15 = staff3.getAccountType();
        java.lang.String str16 = staff3.getID();
        staff3.logout();
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 40.0d + "'", double8 == 40.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 40.0d + "'", double13 == 40.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "staff" + "'", str15, "staff");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test12667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12667");
        model.Staff staff3 = new model.Staff("staff", "hi!", "");
        staff3.login("hi!", "hi!");
        staff3.logout();
        java.lang.String str8 = staff3.getAccountType();
        staff3.login("", "");
        staff3.viewProfile();
        staff3.logout();
        boolean boolean14 = staff3.isVerified();
        staff3.logout();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "staff" + "'", str8, "staff");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test12668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12668");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        boolean boolean6 = staff3.isVerified();
        staff3.login("", "");
        staff3.login("staff", "staff");
        java.lang.String str13 = staff3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test12669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12669");
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
        staff3.login("", "");
        java.lang.String str17 = staff3.getPassword();
        boolean boolean18 = staff3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 40.0d + "'", double12 == 40.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test12670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12670");
        model.Staff staff3 = new model.Staff("hi!", "staff", "");
        staff3.logout();
        java.lang.String str5 = staff3.getEmail();
        java.lang.String str6 = staff3.getEmail();
        boolean boolean7 = staff3.isVerified();
        java.lang.String str8 = staff3.getEmail();
        double double9 = staff3.getHourlyRate();
        java.lang.String str10 = staff3.getPassword();
        staff3.setVerified(false);
        staff3.setVerified(false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 40.0d + "'", double9 == 40.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "staff" + "'", str10, "staff");
    }

    @Test
    public void test12671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12671");
        model.Staff staff3 = new model.Staff("hi!", "", "hi!");
        java.lang.String str4 = staff3.getAccountType();
        java.lang.String str5 = staff3.getID();
        staff3.login("", "staff");
        java.lang.String str9 = staff3.getPassword();
        java.lang.String str10 = staff3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "staff" + "'", str4, "staff");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test12672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12672");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        boolean boolean5 = staff3.isVerified();
        java.lang.String str6 = staff3.getAccountType();
        staff3.logout();
        java.lang.String str8 = staff3.getEmail();
        staff3.viewProfile();
        double double10 = staff3.getHourlyRate();
        boolean boolean11 = staff3.isVerified();
        boolean boolean12 = staff3.isVerified();
        staff3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "staff" + "'", str6, "staff");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 40.0d + "'", double10 == 40.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test12673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12673");
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
        staff3.viewProfile();
        staff3.viewProfile();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "staff" + "'", str11, "staff");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test12674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12674");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        boolean boolean6 = staff3.isVerified();
        staff3.viewProfile();
        staff3.login("staff", "");
        boolean boolean11 = staff3.isVerified();
        staff3.setVerified(true);
        staff3.setVerified(false);
        staff3.logout();
        java.lang.String str17 = staff3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "staff" + "'", str17, "staff");
    }

    @Test
    public void test12675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12675");
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
        java.lang.String str17 = staff3.getEmail();
        java.lang.Class<?> wildcardClass18 = staff3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "staff" + "'", str8, "staff");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 40.0d + "'", double11 == 40.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test12676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12676");
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
        staff3.viewProfile();
        staff3.setVerified(false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 40.0d + "'", double11 == 40.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "staff" + "'", str14, "staff");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 40.0d + "'", double15 == 40.0d);
    }

    @Test
    public void test12677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12677");
        model.Staff staff3 = new model.Staff("hi!", "", "hi!");
        staff3.logout();
        staff3.login("hi!", "hi!");
        double double8 = staff3.getHourlyRate();
        java.lang.String str9 = staff3.getID();
        java.lang.String str10 = staff3.getEmail();
        staff3.setVerified(true);
        boolean boolean13 = staff3.isVerified();
        java.lang.String str14 = staff3.getID();
        java.lang.String str15 = staff3.getEmail();
        staff3.viewProfile();
        java.lang.String str17 = staff3.getPassword();
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 40.0d + "'", double8 == 40.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test12678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12678");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        java.lang.String str6 = staff3.getPassword();
        staff3.setVerified(false);
        staff3.setVerified(true);
        staff3.viewProfile();
        java.lang.String str12 = staff3.getID();
        java.lang.String str13 = staff3.getAccountType();
        java.lang.String str14 = staff3.getEmail();
        java.lang.String str15 = staff3.getPassword();
        staff3.logout();
        java.lang.String str17 = staff3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "staff" + "'", str13, "staff");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test12679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12679");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        staff3.logout();
        java.lang.String str5 = staff3.getID();
        java.lang.String str6 = staff3.getEmail();
        double double7 = staff3.getHourlyRate();
        double double8 = staff3.getHourlyRate();
        staff3.setVerified(false);
        java.lang.String str11 = staff3.getAccountType();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 40.0d + "'", double7 == 40.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 40.0d + "'", double8 == 40.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "staff" + "'", str11, "staff");
    }

    @Test
    public void test12680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12680");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        java.lang.String str6 = staff3.getPassword();
        double double7 = staff3.getHourlyRate();
        staff3.logout();
        staff3.viewProfile();
        staff3.login("", "");
        staff3.logout();
        staff3.login("", "staff");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 40.0d + "'", double7 == 40.0d);
    }

    @Test
    public void test12681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12681");
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
        staff3.viewProfile();
        boolean boolean22 = staff3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test12682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12682");
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
        staff3.setVerified(true);
        staff3.logout();
        java.lang.String str19 = staff3.getAccountType();
        double double20 = staff3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "staff" + "'", str4, "staff");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "staff" + "'", str11, "staff");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 40.0d + "'", double14 == 40.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "staff" + "'", str19, "staff");
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 40.0d + "'", double20 == 40.0d);
    }

    @Test
    public void test12683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12683");
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
        double double26 = staff3.getHourlyRate();
        staff3.setVerified(false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 40.0d + "'", double22 == 40.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 40.0d + "'", double24 == 40.0d);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 40.0d + "'", double26 == 40.0d);
    }

    @Test
    public void test12684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12684");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        boolean boolean5 = staff3.isVerified();
        java.lang.String str6 = staff3.getAccountType();
        staff3.logout();
        java.lang.String str8 = staff3.getEmail();
        staff3.viewProfile();
        boolean boolean10 = staff3.isVerified();
        staff3.viewProfile();
        staff3.logout();
        staff3.logout();
        staff3.login("", "staff");
        boolean boolean17 = staff3.isVerified();
        java.lang.Class<?> wildcardClass18 = staff3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "staff" + "'", str6, "staff");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test12685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12685");
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
        staff3.login("", "staff");
        staff3.viewProfile();
        staff3.viewProfile();
        staff3.login("", "");
        boolean boolean27 = staff3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "staff" + "'", str11, "staff");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 40.0d + "'", double18 == 40.0d);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test12686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12686");
        model.Staff staff3 = new model.Staff("hi!", "", "hi!");
        staff3.logout();
        staff3.login("hi!", "hi!");
        java.lang.String str8 = staff3.getID();
        boolean boolean9 = staff3.isVerified();
        double double10 = staff3.getHourlyRate();
        java.lang.String str11 = staff3.getPassword();
        double double12 = staff3.getHourlyRate();
        double double13 = staff3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 40.0d + "'", double10 == 40.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 40.0d + "'", double12 == 40.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 40.0d + "'", double13 == 40.0d);
    }

    @Test
    public void test12687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12687");
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
        double double16 = staff3.getHourlyRate();
        staff3.login("staff", "hi!");
        boolean boolean20 = staff3.isVerified();
        java.lang.String str21 = staff3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 40.0d + "'", double10 == 40.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "staff" + "'", str14, "staff");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 40.0d + "'", double16 == 40.0d);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test12688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12688");
        model.Staff staff3 = new model.Staff("hi!", "staff", "staff");
        java.lang.String str4 = staff3.getID();
        staff3.setVerified(true);
        double double7 = staff3.getHourlyRate();
        staff3.viewProfile();
        staff3.viewProfile();
        boolean boolean10 = staff3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "staff" + "'", str4, "staff");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 40.0d + "'", double7 == 40.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test12689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12689");
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
        java.lang.String str18 = staff3.getID();
        boolean boolean19 = staff3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "staff" + "'", str8, "staff");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test12690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12690");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        boolean boolean6 = staff3.isVerified();
        staff3.login("", "");
        java.lang.String str10 = staff3.getID();
        java.lang.String str11 = staff3.getEmail();
        java.lang.String str12 = staff3.getID();
        java.lang.String str13 = staff3.getID();
        java.lang.String str14 = staff3.getID();
        java.lang.String str15 = staff3.getAccountType();
        staff3.login("hi!", "");
        java.lang.Class<?> wildcardClass19 = staff3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "staff" + "'", str15, "staff");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test12691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12691");
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
        java.lang.String str13 = staff3.getAccountType();
        java.lang.String str14 = staff3.getID();
        staff3.login("hi!", "");
        java.lang.String str18 = staff3.getAccountType();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 40.0d + "'", double7 == 40.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 40.0d + "'", double10 == 40.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "staff" + "'", str13, "staff");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "staff" + "'", str18, "staff");
    }

    @Test
    public void test12692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12692");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        double double6 = staff3.getHourlyRate();
        java.lang.String str7 = staff3.getPassword();
        java.lang.String str8 = staff3.getID();
        double double9 = staff3.getHourlyRate();
        java.lang.String str10 = staff3.getEmail();
        java.lang.String str11 = staff3.getPassword();
        java.lang.Class<?> wildcardClass12 = staff3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 40.0d + "'", double6 == 40.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 40.0d + "'", double9 == 40.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test12693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12693");
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
        java.lang.String str17 = staff3.getAccountType();
        staff3.viewProfile();
        double double19 = staff3.getHourlyRate();
        java.lang.String str20 = staff3.getEmail();
        java.lang.String str21 = staff3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 40.0d + "'", double14 == 40.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "staff" + "'", str17, "staff");
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 40.0d + "'", double19 == 40.0d);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "staff" + "'", str21, "staff");
    }

    @Test
    public void test12694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12694");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        boolean boolean5 = staff3.isVerified();
        java.lang.String str6 = staff3.getID();
        boolean boolean7 = staff3.isVerified();
        staff3.login("", "hi!");
        java.lang.String str11 = staff3.getEmail();
        staff3.viewProfile();
        java.lang.String str13 = staff3.getAccountType();
        staff3.login("", "staff");
        double double17 = staff3.getHourlyRate();
        java.lang.String str18 = staff3.getEmail();
        java.lang.String str19 = staff3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "staff" + "'", str13, "staff");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 40.0d + "'", double17 == 40.0d);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test12695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12695");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        boolean boolean6 = staff3.isVerified();
        staff3.logout();
        java.lang.String str8 = staff3.getPassword();
        staff3.setVerified(false);
        staff3.logout();
        staff3.viewProfile();
        staff3.setVerified(false);
        java.lang.String str15 = staff3.getAccountType();
        boolean boolean16 = staff3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "staff" + "'", str15, "staff");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test12696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12696");
        model.Staff staff3 = new model.Staff("hi!", "staff", "");
        java.lang.String str4 = staff3.getEmail();
        staff3.logout();
        java.lang.String str6 = staff3.getID();
        boolean boolean7 = staff3.isVerified();
        java.lang.String str8 = staff3.getAccountType();
        staff3.login("hi!", "hi!");
        java.lang.String str12 = staff3.getPassword();
        staff3.setVerified(true);
        java.lang.String str15 = staff3.getPassword();
        boolean boolean16 = staff3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "staff" + "'", str8, "staff");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "staff" + "'", str12, "staff");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "staff" + "'", str15, "staff");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test12697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12697");
        model.Staff staff3 = new model.Staff("hi!", "", "hi!");
        java.lang.String str4 = staff3.getPassword();
        double double5 = staff3.getHourlyRate();
        double double6 = staff3.getHourlyRate();
        staff3.viewProfile();
        staff3.setVerified(false);
        java.lang.String str10 = staff3.getAccountType();
        java.lang.String str11 = staff3.getID();
        staff3.viewProfile();
        boolean boolean13 = staff3.isVerified();
        boolean boolean14 = staff3.isVerified();
        staff3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 40.0d + "'", double5 == 40.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 40.0d + "'", double6 == 40.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "staff" + "'", str10, "staff");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test12698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12698");
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
        staff3.logout();
        staff3.setVerified(true);
        staff3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "staff" + "'", str6, "staff");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 40.0d + "'", double12 == 40.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "staff" + "'", str14, "staff");
    }

    @Test
    public void test12699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12699");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        java.lang.String str6 = staff3.getPassword();
        java.lang.String str7 = staff3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test12700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12700");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        boolean boolean5 = staff3.isVerified();
        java.lang.String str6 = staff3.getID();
        java.lang.String str7 = staff3.getID();
        boolean boolean8 = staff3.isVerified();
        staff3.setVerified(true);
        java.lang.String str11 = staff3.getID();
        java.lang.String str12 = staff3.getID();
        java.lang.String str13 = staff3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test12701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12701");
        model.Staff staff3 = new model.Staff("hi!", "", "hi!");
        staff3.setVerified(false);
        java.lang.String str6 = staff3.getPassword();
        java.lang.String str7 = staff3.getAccountType();
        java.lang.String str8 = staff3.getEmail();
        staff3.setVerified(false);
        java.lang.String str11 = staff3.getID();
        java.lang.String str12 = staff3.getID();
        java.lang.String str13 = staff3.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "staff" + "'", str7, "staff");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test12702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12702");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        boolean boolean6 = staff3.isVerified();
        staff3.logout();
        java.lang.String str8 = staff3.getPassword();
        java.lang.String str9 = staff3.getID();
        double double10 = staff3.getHourlyRate();
        double double11 = staff3.getHourlyRate();
        staff3.setVerified(true);
        java.lang.String str14 = staff3.getAccountType();
        java.lang.String str15 = staff3.getID();
        java.lang.String str16 = staff3.getAccountType();
        java.lang.String str17 = staff3.getEmail();
        boolean boolean18 = staff3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 40.0d + "'", double10 == 40.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 40.0d + "'", double11 == 40.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "staff" + "'", str14, "staff");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "staff" + "'", str16, "staff");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test12703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12703");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        staff3.setVerified(false);
        double double7 = staff3.getHourlyRate();
        boolean boolean8 = staff3.isVerified();
        java.lang.String str9 = staff3.getAccountType();
        java.lang.String str10 = staff3.getID();
        double double11 = staff3.getHourlyRate();
        staff3.setVerified(true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 40.0d + "'", double7 == 40.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "staff" + "'", str9, "staff");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 40.0d + "'", double11 == 40.0d);
    }

    @Test
    public void test12704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12704");
        model.Staff staff3 = new model.Staff("hi!", "", "hi!");
        staff3.setVerified(false);
        staff3.viewProfile();
        java.lang.String str7 = staff3.getEmail();
        java.lang.String str8 = staff3.getAccountType();
        staff3.logout();
        staff3.login("", "");
        staff3.setVerified(true);
        double double15 = staff3.getHourlyRate();
        staff3.login("staff", "staff");
        java.lang.Class<?> wildcardClass19 = staff3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "staff" + "'", str8, "staff");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 40.0d + "'", double15 == 40.0d);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test12705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12705");
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
        boolean boolean15 = staff3.isVerified();
        staff3.viewProfile();
        staff3.setVerified(true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "staff" + "'", str4, "staff");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "staff" + "'", str11, "staff");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "staff" + "'", str12, "staff");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "staff" + "'", str13, "staff");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test12706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12706");
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
        staff3.logout();
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
    }

    @Test
    public void test12707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12707");
        model.Staff staff3 = new model.Staff("hi!", "staff", "");
        java.lang.String str4 = staff3.getEmail();
        staff3.viewProfile();
        staff3.viewProfile();
        java.lang.String str7 = staff3.getEmail();
        staff3.login("hi!", "");
        java.lang.String str11 = staff3.getAccountType();
        staff3.logout();
        java.lang.String str13 = staff3.getAccountType();
        java.lang.String str14 = staff3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "staff" + "'", str11, "staff");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "staff" + "'", str13, "staff");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test12708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12708");
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
        java.lang.String str20 = staff3.getAccountType();
        boolean boolean21 = staff3.isVerified();
        staff3.setVerified(false);
        java.lang.String str24 = staff3.getID();
        java.lang.Class<?> wildcardClass25 = staff3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "staff" + "'", str6, "staff");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 40.0d + "'", double8 == 40.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "staff" + "'", str10, "staff");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "staff" + "'", str16, "staff");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "staff" + "'", str20, "staff");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test12709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12709");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        boolean boolean6 = staff3.isVerified();
        staff3.logout();
        staff3.setVerified(false);
        java.lang.String str10 = staff3.getID();
        java.lang.String str11 = staff3.getAccountType();
        double double12 = staff3.getHourlyRate();
        boolean boolean13 = staff3.isVerified();
        boolean boolean14 = staff3.isVerified();
        staff3.login("hi!", "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "staff" + "'", str11, "staff");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 40.0d + "'", double12 == 40.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test12710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12710");
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
        java.lang.String str17 = staff3.getPassword();
        java.lang.String str18 = staff3.getAccountType();
        java.lang.String str19 = staff3.getID();
        staff3.viewProfile();
        java.lang.Class<?> wildcardClass21 = staff3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "staff" + "'", str13, "staff");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "staff" + "'", str14, "staff");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "staff" + "'", str18, "staff");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test12711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12711");
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
        java.lang.String str17 = staff3.getID();
        java.lang.String str18 = staff3.getAccountType();
        staff3.login("hi!", "staff");
        java.lang.String str22 = staff3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 40.0d + "'", double16 == 40.0d);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "staff" + "'", str18, "staff");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "staff" + "'", str22, "staff");
    }

    @Test
    public void test12712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12712");
        model.Staff staff3 = new model.Staff("hi!", "", "hi!");
        java.lang.String str4 = staff3.getAccountType();
        java.lang.String str5 = staff3.getID();
        staff3.login("", "staff");
        double double9 = staff3.getHourlyRate();
        staff3.login("hi!", "");
        java.lang.String str13 = staff3.getPassword();
        double double14 = staff3.getHourlyRate();
        staff3.setVerified(false);
        java.lang.String str17 = staff3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "staff" + "'", str4, "staff");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 40.0d + "'", double9 == 40.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 40.0d + "'", double14 == 40.0d);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test12713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12713");
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
        java.lang.String str22 = staff3.getAccountType();
        java.lang.String str23 = staff3.getID();
        staff3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "staff" + "'", str22, "staff");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
    }

    @Test
    public void test12714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12714");
        model.Staff staff3 = new model.Staff("hi!", "staff", "");
        java.lang.String str4 = staff3.getEmail();
        staff3.viewProfile();
        java.lang.String str6 = staff3.getID();
        staff3.logout();
        boolean boolean8 = staff3.isVerified();
        java.lang.String str9 = staff3.getEmail();
        java.lang.Class<?> wildcardClass10 = staff3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test12715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12715");
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
        double double20 = staff3.getHourlyRate();
        staff3.login("staff", "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "staff" + "'", str8, "staff");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "staff" + "'", str9, "staff");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 40.0d + "'", double17 == 40.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 40.0d + "'", double20 == 40.0d);
    }

    @Test
    public void test12716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12716");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        boolean boolean5 = staff3.isVerified();
        java.lang.String str6 = staff3.getID();
        boolean boolean7 = staff3.isVerified();
        staff3.logout();
        java.lang.String str9 = staff3.getID();
        java.lang.String str10 = staff3.getAccountType();
        staff3.login("staff", "staff");
        double double14 = staff3.getHourlyRate();
        staff3.login("staff", "hi!");
        double double18 = staff3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "staff" + "'", str10, "staff");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 40.0d + "'", double14 == 40.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 40.0d + "'", double18 == 40.0d);
    }

    @Test
    public void test12717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12717");
        model.Staff staff3 = new model.Staff("hi!", "", "hi!");
        java.lang.String str4 = staff3.getAccountType();
        java.lang.String str5 = staff3.getEmail();
        staff3.viewProfile();
        staff3.setVerified(true);
        java.lang.String str9 = staff3.getPassword();
        staff3.setVerified(false);
        staff3.logout();
        staff3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "staff" + "'", str4, "staff");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test12718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12718");
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
        staff3.login("staff", "hi!");
        boolean boolean20 = staff3.isVerified();
        boolean boolean21 = staff3.isVerified();
        staff3.setVerified(true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 40.0d + "'", double13 == 40.0d);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test12719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12719");
        model.Staff staff3 = new model.Staff("hi!", "staff", "");
        java.lang.String str4 = staff3.getEmail();
        staff3.viewProfile();
        staff3.viewProfile();
        java.lang.String str7 = staff3.getID();
        java.lang.String str8 = staff3.getPassword();
        java.lang.String str9 = staff3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "staff" + "'", str8, "staff");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "staff" + "'", str9, "staff");
    }

    @Test
    public void test12720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12720");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        boolean boolean5 = staff3.isVerified();
        java.lang.String str6 = staff3.getAccountType();
        java.lang.String str7 = staff3.getAccountType();
        java.lang.String str8 = staff3.getEmail();
        staff3.logout();
        java.lang.String str10 = staff3.getEmail();
        staff3.setVerified(false);
        java.lang.String str13 = staff3.getAccountType();
        staff3.viewProfile();
        java.lang.String str15 = staff3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "staff" + "'", str6, "staff");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "staff" + "'", str7, "staff");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "staff" + "'", str13, "staff");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test12721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12721");
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
        double double17 = staff3.getHourlyRate();
        staff3.viewProfile();
        staff3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "staff" + "'", str13, "staff");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 40.0d + "'", double17 == 40.0d);
    }

    @Test
    public void test12722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12722");
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
        double double16 = staff3.getHourlyRate();
        boolean boolean17 = staff3.isVerified();
        java.lang.String str18 = staff3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "staff" + "'", str6, "staff");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 40.0d + "'", double10 == 40.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 40.0d + "'", double16 == 40.0d);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test12723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12723");
        model.Staff staff3 = new model.Staff("hi!", "hi!", "");
        staff3.viewProfile();
        java.lang.String str5 = staff3.getAccountType();
        double double6 = staff3.getHourlyRate();
        java.lang.String str7 = staff3.getEmail();
        double double8 = staff3.getHourlyRate();
        staff3.login("", "");
        double double12 = staff3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 40.0d + "'", double6 == 40.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 40.0d + "'", double8 == 40.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 40.0d + "'", double12 == 40.0d);
    }

    @Test
    public void test12724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12724");
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
        staff3.logout();
        staff3.login("", "staff");
        java.lang.String str23 = staff3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "staff" + "'", str10, "staff");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 40.0d + "'", double15 == 40.0d);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "staff" + "'", str23, "staff");
    }

    @Test
    public void test12725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12725");
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
        java.lang.String str20 = staff3.getPassword();
        java.lang.String str21 = staff3.getAccountType();
        boolean boolean22 = staff3.isVerified();
        double double23 = staff3.getHourlyRate();
        java.lang.String str24 = staff3.getID();
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
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "staff" + "'", str21, "staff");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 40.0d + "'", double23 == 40.0d);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
    }

    @Test
    public void test12726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12726");
        model.Staff staff3 = new model.Staff("hi!", "", "hi!");
        java.lang.String str4 = staff3.getAccountType();
        java.lang.String str5 = staff3.getID();
        staff3.setVerified(true);
        staff3.login("staff", "staff");
        double double11 = staff3.getHourlyRate();
        staff3.viewProfile();
        java.lang.String str13 = staff3.getID();
        staff3.viewProfile();
        staff3.logout();
        boolean boolean16 = staff3.isVerified();
        java.lang.String str17 = staff3.getID();
        staff3.logout();
        double double19 = staff3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "staff" + "'", str4, "staff");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 40.0d + "'", double11 == 40.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 40.0d + "'", double19 == 40.0d);
    }

    @Test
    public void test12727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12727");
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
        java.lang.String str16 = staff3.getAccountType();
        java.lang.String str17 = staff3.getID();
        java.lang.String str18 = staff3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "staff" + "'", str6, "staff");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 40.0d + "'", double8 == 40.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "staff" + "'", str10, "staff");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "staff" + "'", str16, "staff");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test12728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12728");
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
        staff3.login("hi!", "hi!");
        java.lang.String str20 = staff3.getID();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test12729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12729");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        staff3.logout();
        staff3.logout();
        java.lang.String str7 = staff3.getID();
        staff3.viewProfile();
        staff3.viewProfile();
        java.lang.Class<?> wildcardClass10 = staff3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test12730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12730");
        model.Staff staff3 = new model.Staff("staff", "hi!", "");
        staff3.login("hi!", "hi!");
        staff3.logout();
        java.lang.String str8 = staff3.getAccountType();
        staff3.setVerified(true);
        java.lang.String str11 = staff3.getID();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "staff" + "'", str8, "staff");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test12731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12731");
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
        boolean boolean26 = staff3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "staff" + "'", str13, "staff");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test12732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12732");
        model.Staff staff3 = new model.Staff("", "", "");
        staff3.viewProfile();
        double double5 = staff3.getHourlyRate();
        java.lang.String str6 = staff3.getAccountType();
        staff3.logout();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 40.0d + "'", double5 == 40.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "staff" + "'", str6, "staff");
    }

    @Test
    public void test12733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12733");
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
        double double14 = staff3.getHourlyRate();
        java.lang.String str15 = staff3.getEmail();
        staff3.setVerified(false);
        staff3.logout();
        java.lang.String str19 = staff3.getAccountType();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 40.0d + "'", double11 == 40.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "staff" + "'", str12, "staff");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 40.0d + "'", double14 == 40.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "staff" + "'", str19, "staff");
    }

    @Test
    public void test12734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12734");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        boolean boolean5 = staff3.isVerified();
        java.lang.String str6 = staff3.getID();
        java.lang.String str7 = staff3.getID();
        double double8 = staff3.getHourlyRate();
        staff3.logout();
        staff3.login("hi!", "hi!");
        java.lang.String str13 = staff3.getID();
        double double14 = staff3.getHourlyRate();
        java.lang.String str15 = staff3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 40.0d + "'", double8 == 40.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 40.0d + "'", double14 == 40.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test12735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12735");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        boolean boolean5 = staff3.isVerified();
        java.lang.String str6 = staff3.getAccountType();
        staff3.logout();
        boolean boolean8 = staff3.isVerified();
        staff3.setVerified(true);
        boolean boolean11 = staff3.isVerified();
        staff3.login("", "staff");
        java.lang.String str15 = staff3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "staff" + "'", str6, "staff");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test12736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12736");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        staff3.logout();
        java.lang.String str5 = staff3.getID();
        java.lang.String str6 = staff3.getEmail();
        double double7 = staff3.getHourlyRate();
        double double8 = staff3.getHourlyRate();
        staff3.setVerified(false);
        java.lang.String str11 = staff3.getID();
        java.lang.String str12 = staff3.getEmail();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 40.0d + "'", double7 == 40.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 40.0d + "'", double8 == 40.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test12737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12737");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        boolean boolean6 = staff3.isVerified();
        staff3.viewProfile();
        boolean boolean8 = staff3.isVerified();
        java.lang.String str9 = staff3.getEmail();
        staff3.setVerified(true);
        boolean boolean12 = staff3.isVerified();
        staff3.login("", "");
        boolean boolean16 = staff3.isVerified();
        staff3.logout();
        staff3.setVerified(false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test12738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12738");
        model.Staff staff3 = new model.Staff("", "staff", "staff");
        double double4 = staff3.getHourlyRate();
        java.lang.String str5 = staff3.getAccountType();
        java.lang.String str6 = staff3.getAccountType();
        java.lang.String str7 = staff3.getID();
        java.lang.String str8 = staff3.getPassword();
        boolean boolean9 = staff3.isVerified();
        java.lang.String str10 = staff3.getID();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 40.0d + "'", double4 == 40.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "staff" + "'", str6, "staff");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "staff" + "'", str7, "staff");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "staff" + "'", str8, "staff");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "staff" + "'", str10, "staff");
    }

    @Test
    public void test12739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12739");
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
        double double14 = staff3.getHourlyRate();
        java.lang.Class<?> wildcardClass15 = staff3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 40.0d + "'", double14 == 40.0d);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test12740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12740");
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
        staff3.logout();
        boolean boolean18 = staff3.isVerified();
        staff3.logout();
        java.lang.String str20 = staff3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 40.0d + "'", double6 == 40.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "staff" + "'", str16, "staff");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test12741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12741");
        model.Staff staff3 = new model.Staff("hi!", "", "hi!");
        staff3.logout();
        staff3.login("hi!", "hi!");
        staff3.viewProfile();
        staff3.login("", "staff");
        staff3.login("", "staff");
        java.lang.String str15 = staff3.getEmail();
        staff3.viewProfile();
        java.lang.String str17 = staff3.getEmail();
        java.lang.String str18 = staff3.getAccountType();
        java.lang.Class<?> wildcardClass19 = staff3.getClass();
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "staff" + "'", str18, "staff");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test12742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12742");
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
        double double18 = staff3.getHourlyRate();
        staff3.setVerified(true);
        staff3.login("staff", "");
        java.lang.String str24 = staff3.getEmail();
        java.lang.String str25 = staff3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "staff" + "'", str14, "staff");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 40.0d + "'", double18 == 40.0d);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
    }

    @Test
    public void test12743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12743");
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
        staff3.viewProfile();
        staff3.logout();
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
    }

    @Test
    public void test12744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12744");
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
        boolean boolean15 = staff3.isVerified();
        java.lang.Class<?> wildcardClass16 = staff3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 40.0d + "'", double6 == 40.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test12745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12745");
        model.Staff staff3 = new model.Staff("hi!", "hi!", "");
        staff3.logout();
        java.lang.String str5 = staff3.getEmail();
        java.lang.String str6 = staff3.getAccountType();
        java.lang.String str7 = staff3.getPassword();
        staff3.viewProfile();
        staff3.logout();
        java.lang.String str10 = staff3.getAccountType();
        staff3.logout();
        staff3.logout();
        staff3.logout();
        staff3.login("staff", "staff");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "staff" + "'", str6, "staff");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "staff" + "'", str10, "staff");
    }

    @Test
    public void test12746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12746");
        model.Staff staff3 = new model.Staff("hi!", "hi!", "");
        staff3.setVerified(true);
        double double6 = staff3.getHourlyRate();
        java.lang.String str7 = staff3.getID();
        staff3.logout();
        java.lang.String str9 = staff3.getEmail();
        java.lang.String str10 = staff3.getAccountType();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 40.0d + "'", double6 == 40.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "staff" + "'", str10, "staff");
    }

    @Test
    public void test12747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12747");
        model.Staff staff3 = new model.Staff("hi!", "hi!", "hi!");
        staff3.login("hi!", "staff");
        staff3.logout();
        staff3.viewProfile();
        java.lang.String str9 = staff3.getPassword();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test12748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12748");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        boolean boolean6 = staff3.isVerified();
        staff3.viewProfile();
        double double8 = staff3.getHourlyRate();
        staff3.login("staff", "staff");
        staff3.logout();
        staff3.login("hi!", "staff");
        java.lang.String str16 = staff3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 40.0d + "'", double8 == 40.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test12749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12749");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        boolean boolean5 = staff3.isVerified();
        java.lang.String str6 = staff3.getID();
        boolean boolean7 = staff3.isVerified();
        java.lang.String str8 = staff3.getID();
        staff3.login("", "staff");
        staff3.setVerified(false);
        staff3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test12750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12750");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        boolean boolean6 = staff3.isVerified();
        staff3.logout();
        staff3.setVerified(false);
        java.lang.String str10 = staff3.getID();
        java.lang.String str11 = staff3.getAccountType();
        staff3.setVerified(false);
        java.lang.String str14 = staff3.getAccountType();
        staff3.logout();
        java.lang.String str16 = staff3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "staff" + "'", str11, "staff");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "staff" + "'", str14, "staff");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "staff" + "'", str16, "staff");
    }

    @Test
    public void test12751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12751");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        staff3.logout();
        staff3.viewProfile();
        java.lang.String str6 = staff3.getID();
        staff3.setVerified(false);
        boolean boolean9 = staff3.isVerified();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test12752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12752");
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
        java.lang.String str19 = staff3.getEmail();
        staff3.viewProfile();
        double double21 = staff3.getHourlyRate();
        java.lang.String str22 = staff3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "staff" + "'", str18, "staff");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 40.0d + "'", double21 == 40.0d);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "staff" + "'", str22, "staff");
    }

    @Test
    public void test12753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12753");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        double double6 = staff3.getHourlyRate();
        staff3.logout();
        staff3.viewProfile();
        java.lang.String str9 = staff3.getEmail();
        java.lang.String str10 = staff3.getEmail();
        staff3.setVerified(true);
        staff3.login("", "");
        staff3.logout();
        java.lang.String str17 = staff3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 40.0d + "'", double6 == 40.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "staff" + "'", str17, "staff");
    }

    @Test
    public void test12754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12754");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        boolean boolean6 = staff3.isVerified();
        staff3.login("", "");
        java.lang.String str10 = staff3.getID();
        staff3.viewProfile();
        boolean boolean12 = staff3.isVerified();
        java.lang.String str13 = staff3.getAccountType();
        double double14 = staff3.getHourlyRate();
        java.lang.String str15 = staff3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "staff" + "'", str13, "staff");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 40.0d + "'", double14 == 40.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test12755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12755");
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
        java.lang.String str21 = staff3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "staff" + "'", str13, "staff");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test12756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12756");
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
        double double17 = staff3.getHourlyRate();
        java.lang.String str18 = staff3.getID();
        java.lang.String str19 = staff3.getPassword();
        staff3.viewProfile();
        boolean boolean21 = staff3.isVerified();
        java.lang.String str22 = staff3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "staff" + "'", str12, "staff");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 40.0d + "'", double17 == 40.0d);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test12757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12757");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        staff3.login("", "");
        double double7 = staff3.getHourlyRate();
        staff3.login("staff", "staff");
        java.lang.String str11 = staff3.getPassword();
        staff3.logout();
        staff3.viewProfile();
        java.lang.String str14 = staff3.getEmail();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 40.0d + "'", double7 == 40.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test12758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12758");
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
        java.lang.String str21 = staff3.getEmail();
        java.lang.String str22 = staff3.getAccountType();
        java.lang.Class<?> wildcardClass23 = staff3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "staff" + "'", str6, "staff");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "staff" + "'", str22, "staff");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test12759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12759");
        model.Staff staff3 = new model.Staff("hi!", "hi!", "");
        staff3.setVerified(true);
        double double6 = staff3.getHourlyRate();
        java.lang.String str7 = staff3.getID();
        boolean boolean8 = staff3.isVerified();
        java.lang.String str9 = staff3.getPassword();
        double double10 = staff3.getHourlyRate();
        staff3.login("hi!", "staff");
        java.lang.Class<?> wildcardClass14 = staff3.getClass();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 40.0d + "'", double6 == 40.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 40.0d + "'", double10 == 40.0d);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test12760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12760");
        model.Staff staff3 = new model.Staff("hi!", "", "hi!");
        staff3.logout();
        staff3.login("hi!", "hi!");
        double double8 = staff3.getHourlyRate();
        boolean boolean9 = staff3.isVerified();
        java.lang.String str10 = staff3.getAccountType();
        java.lang.String str11 = staff3.getAccountType();
        java.lang.String str12 = staff3.getID();
        java.lang.String str13 = staff3.getID();
        java.lang.String str14 = staff3.getID();
        java.lang.String str15 = staff3.getPassword();
        java.lang.String str16 = staff3.getEmail();
        staff3.login("", "hi!");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 40.0d + "'", double8 == 40.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "staff" + "'", str10, "staff");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "staff" + "'", str11, "staff");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test12761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12761");
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
        java.lang.String str16 = staff3.getEmail();
        java.lang.String str17 = staff3.getID();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test12762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12762");
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
        staff3.login("hi!", "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "staff" + "'", str6, "staff");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test12763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12763");
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
        boolean boolean15 = staff3.isVerified();
        boolean boolean16 = staff3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 40.0d + "'", double5 == 40.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 40.0d + "'", double6 == 40.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "staff" + "'", str8, "staff");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 40.0d + "'", double9 == 40.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 40.0d + "'", double10 == 40.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test12764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12764");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        boolean boolean6 = staff3.isVerified();
        staff3.viewProfile();
        boolean boolean8 = staff3.isVerified();
        staff3.login("hi!", "staff");
        staff3.viewProfile();
        java.lang.String str13 = staff3.getID();
        java.lang.String str14 = staff3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test12765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12765");
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
        staff3.viewProfile();
        java.lang.String str23 = staff3.getID();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 40.0d + "'", double7 == 40.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
    }

    @Test
    public void test12766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12766");
        model.Staff staff3 = new model.Staff("staff", "hi!", "");
        staff3.login("hi!", "hi!");
        staff3.logout();
        staff3.viewProfile();
        staff3.setVerified(false);
        staff3.logout();
        staff3.viewProfile();
        java.lang.String str13 = staff3.getID();
        java.lang.String str14 = staff3.getPassword();
        java.lang.String str15 = staff3.getEmail();
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "staff" + "'", str15, "staff");
    }

    @Test
    public void test12767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12767");
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
        staff3.setVerified(true);
        double double19 = staff3.getHourlyRate();
        boolean boolean20 = staff3.isVerified();
        boolean boolean21 = staff3.isVerified();
        java.lang.String str22 = staff3.getAccountType();
        java.lang.String str23 = staff3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 40.0d + "'", double16 == 40.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 40.0d + "'", double19 == 40.0d);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "staff" + "'", str22, "staff");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
    }

    @Test
    public void test12768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12768");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        double double6 = staff3.getHourlyRate();
        java.lang.String str7 = staff3.getPassword();
        staff3.login("", "staff");
        boolean boolean11 = staff3.isVerified();
        double double12 = staff3.getHourlyRate();
        boolean boolean13 = staff3.isVerified();
        staff3.viewProfile();
        staff3.logout();
        java.lang.Class<?> wildcardClass16 = staff3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 40.0d + "'", double6 == 40.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 40.0d + "'", double12 == 40.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test12769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12769");
        model.Staff staff3 = new model.Staff("", "", "");
        staff3.viewProfile();
        java.lang.String str5 = staff3.getEmail();
        java.lang.String str6 = staff3.getEmail();
        staff3.login("hi!", "hi!");
        boolean boolean10 = staff3.isVerified();
        staff3.setVerified(false);
        staff3.login("hi!", "staff");
        java.lang.String str16 = staff3.getPassword();
        staff3.viewProfile();
        staff3.viewProfile();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test12770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12770");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        java.lang.String str6 = staff3.getPassword();
        java.lang.String str7 = staff3.getPassword();
        java.lang.String str8 = staff3.getID();
        java.lang.String str9 = staff3.getID();
        staff3.viewProfile();
        java.lang.String str11 = staff3.getID();
        staff3.viewProfile();
        staff3.setVerified(false);
        boolean boolean15 = staff3.isVerified();
        staff3.viewProfile();
        double double17 = staff3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 40.0d + "'", double17 == 40.0d);
    }

    @Test
    public void test12771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12771");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        boolean boolean6 = staff3.isVerified();
        staff3.logout();
        staff3.setVerified(false);
        staff3.viewProfile();
        boolean boolean11 = staff3.isVerified();
        staff3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test12772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12772");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        double double6 = staff3.getHourlyRate();
        staff3.logout();
        staff3.viewProfile();
        java.lang.String str9 = staff3.getEmail();
        java.lang.String str10 = staff3.getEmail();
        double double11 = staff3.getHourlyRate();
        staff3.logout();
        staff3.viewProfile();
        java.lang.String str14 = staff3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 40.0d + "'", double6 == 40.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 40.0d + "'", double11 == 40.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test12773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12773");
        model.Staff staff3 = new model.Staff("hi!", "", "hi!");
        staff3.setVerified(false);
        java.lang.String str6 = staff3.getPassword();
        java.lang.String str7 = staff3.getAccountType();
        staff3.viewProfile();
        double double9 = staff3.getHourlyRate();
        double double10 = staff3.getHourlyRate();
        java.lang.String str11 = staff3.getAccountType();
        staff3.setVerified(false);
        staff3.login("hi!", "staff");
        staff3.viewProfile();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "staff" + "'", str7, "staff");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 40.0d + "'", double9 == 40.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 40.0d + "'", double10 == 40.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "staff" + "'", str11, "staff");
    }

    @Test
    public void test12774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12774");
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
        java.lang.String str15 = staff3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "staff" + "'", str8, "staff");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "staff" + "'", str9, "staff");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "staff" + "'", str15, "staff");
    }

    @Test
    public void test12775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12775");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        boolean boolean5 = staff3.isVerified();
        java.lang.String str6 = staff3.getID();
        java.lang.String str7 = staff3.getID();
        double double8 = staff3.getHourlyRate();
        staff3.logout();
        staff3.logout();
        staff3.setVerified(true);
        staff3.logout();
        staff3.viewProfile();
        java.lang.String str15 = staff3.getID();
        boolean boolean16 = staff3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 40.0d + "'", double8 == 40.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test12776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12776");
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
        java.lang.String str20 = staff3.getPassword();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 40.0d + "'", double7 == 40.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test12777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12777");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        boolean boolean5 = staff3.isVerified();
        java.lang.String str6 = staff3.getID();
        boolean boolean7 = staff3.isVerified();
        staff3.logout();
        java.lang.String str9 = staff3.getID();
        staff3.login("hi!", "");
        staff3.logout();
        double double14 = staff3.getHourlyRate();
        staff3.setVerified(false);
        java.lang.String str17 = staff3.getEmail();
        staff3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 40.0d + "'", double14 == 40.0d);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test12778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12778");
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
        double double19 = staff3.getHourlyRate();
        staff3.login("staff", "hi!");
        staff3.login("", "staff");
        boolean boolean26 = staff3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "staff" + "'", str10, "staff");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 40.0d + "'", double15 == 40.0d);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 40.0d + "'", double19 == 40.0d);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test12779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12779");
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
        staff3.setVerified(false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "staff" + "'", str6, "staff");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 40.0d + "'", double10 == 40.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 40.0d + "'", double14 == 40.0d);
    }

    @Test
    public void test12780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12780");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        boolean boolean6 = staff3.isVerified();
        staff3.logout();
        double double8 = staff3.getHourlyRate();
        boolean boolean9 = staff3.isVerified();
        staff3.logout();
        staff3.viewProfile();
        staff3.login("", "");
        java.lang.String str15 = staff3.getEmail();
        java.lang.String str16 = staff3.getEmail();
        java.lang.Class<?> wildcardClass17 = staff3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 40.0d + "'", double8 == 40.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test12781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12781");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        boolean boolean6 = staff3.isVerified();
        staff3.login("", "");
        java.lang.String str10 = staff3.getID();
        java.lang.String str11 = staff3.getEmail();
        staff3.login("staff", "");
        boolean boolean15 = staff3.isVerified();
        boolean boolean16 = staff3.isVerified();
        double double17 = staff3.getHourlyRate();
        staff3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 40.0d + "'", double17 == 40.0d);
    }

    @Test
    public void test12782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12782");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        boolean boolean6 = staff3.isVerified();
        staff3.logout();
        java.lang.String str8 = staff3.getAccountType();
        java.lang.String str9 = staff3.getAccountType();
        staff3.login("staff", "staff");
        staff3.logout();
        java.lang.String str14 = staff3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "staff" + "'", str8, "staff");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "staff" + "'", str9, "staff");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test12783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12783");
        model.Staff staff3 = new model.Staff("staff", "hi!", "");
        staff3.login("hi!", "hi!");
        staff3.logout();
        java.lang.String str8 = staff3.getPassword();
        java.lang.String str9 = staff3.getID();
        staff3.viewProfile();
        java.lang.String str11 = staff3.getAccountType();
        staff3.setVerified(true);
        staff3.viewProfile();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "staff" + "'", str11, "staff");
    }

    @Test
    public void test12784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12784");
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
        staff3.logout();
        staff3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 40.0d + "'", double16 == 40.0d);
    }

    @Test
    public void test12785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12785");
        model.Staff staff3 = new model.Staff("", "hi!", "staff");
        java.lang.String str4 = staff3.getAccountType();
        staff3.viewProfile();
        staff3.login("", "hi!");
        boolean boolean9 = staff3.isVerified();
        staff3.login("hi!", "staff");
        java.lang.Class<?> wildcardClass13 = staff3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "staff" + "'", str4, "staff");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test12786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12786");
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
        staff3.setVerified(true);
        staff3.logout();
        java.lang.String str21 = staff3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 40.0d + "'", double13 == 40.0d);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
    }

    @Test
    public void test12787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12787");
        model.Staff staff3 = new model.Staff("hi!", "staff", "");
        java.lang.String str4 = staff3.getEmail();
        staff3.logout();
        java.lang.String str6 = staff3.getAccountType();
        java.lang.String str7 = staff3.getPassword();
        staff3.logout();
        staff3.setVerified(false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "staff" + "'", str6, "staff");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "staff" + "'", str7, "staff");
    }

    @Test
    public void test12788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12788");
        model.Staff staff3 = new model.Staff("", "hi!", "");
        staff3.login("hi!", "hi!");
        staff3.logout();
        java.lang.String str8 = staff3.getEmail();
        staff3.login("hi!", "staff");
        java.lang.String str12 = staff3.getID();
        java.lang.String str13 = staff3.getPassword();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test12789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12789");
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
        java.lang.String str15 = staff3.getPassword();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "staff" + "'", str7, "staff");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "staff" + "'", str11, "staff");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "staff" + "'", str12, "staff");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test12790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12790");
        model.Staff staff3 = new model.Staff("", "staff", "staff");
        double double4 = staff3.getHourlyRate();
        java.lang.String str5 = staff3.getAccountType();
        double double6 = staff3.getHourlyRate();
        boolean boolean7 = staff3.isVerified();
        staff3.viewProfile();
        java.lang.String str9 = staff3.getPassword();
        staff3.setVerified(false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 40.0d + "'", double4 == 40.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 40.0d + "'", double6 == 40.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "staff" + "'", str9, "staff");
    }

    @Test
    public void test12791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12791");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        boolean boolean5 = staff3.isVerified();
        double double6 = staff3.getHourlyRate();
        java.lang.String str7 = staff3.getEmail();
        java.lang.String str8 = staff3.getEmail();
        staff3.login("", "hi!");
        java.lang.String str12 = staff3.getEmail();
        java.lang.String str13 = staff3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 40.0d + "'", double6 == 40.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test12792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12792");
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
        boolean boolean19 = staff3.isVerified();
        staff3.logout();
        staff3.login("staff", "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 40.0d + "'", double7 == 40.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "staff" + "'", str15, "staff");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test12793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12793");
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
        boolean boolean17 = staff3.isVerified();
        staff3.login("hi!", "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 40.0d + "'", double7 == 40.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test12794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12794");
        model.Staff staff3 = new model.Staff("hi!", "", "hi!");
        staff3.logout();
        staff3.login("hi!", "hi!");
        staff3.viewProfile();
        java.lang.String str9 = staff3.getPassword();
        java.lang.String str10 = staff3.getID();
        staff3.logout();
        boolean boolean12 = staff3.isVerified();
        double double13 = staff3.getHourlyRate();
        java.lang.String str14 = staff3.getAccountType();
        staff3.login("", "staff");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 40.0d + "'", double13 == 40.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "staff" + "'", str14, "staff");
    }

    @Test
    public void test12795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12795");
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
        java.lang.String str19 = staff3.getID();
        staff3.login("", "staff");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "staff" + "'", str8, "staff");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "staff" + "'", str9, "staff");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 40.0d + "'", double17 == 40.0d);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test12796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12796");
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
        staff3.logout();
        staff3.setVerified(true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 40.0d + "'", double15 == 40.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 40.0d + "'", double16 == 40.0d);
    }

    @Test
    public void test12797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12797");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        staff3.logout();
        staff3.viewProfile();
        staff3.viewProfile();
        double double7 = staff3.getHourlyRate();
        java.lang.String str8 = staff3.getPassword();
        java.lang.String str9 = staff3.getPassword();
        staff3.login("", "staff");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 40.0d + "'", double7 == 40.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test12798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12798");
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
        staff3.setVerified(false);
        java.lang.Class<?> wildcardClass19 = staff3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 40.0d + "'", double6 == 40.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 40.0d + "'", double13 == 40.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test12799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12799");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        staff3.login("", "");
        double double7 = staff3.getHourlyRate();
        boolean boolean8 = staff3.isVerified();
        java.lang.String str9 = staff3.getEmail();
        java.lang.String str10 = staff3.getEmail();
        staff3.login("hi!", "");
        staff3.setVerified(false);
        java.lang.String str16 = staff3.getID();
        java.lang.String str17 = staff3.getEmail();
        staff3.login("staff", "hi!");
        boolean boolean21 = staff3.isVerified();
        staff3.logout();
        java.lang.Class<?> wildcardClass23 = staff3.getClass();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 40.0d + "'", double7 == 40.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test12800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12800");
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
        java.lang.Class<?> wildcardClass15 = staff3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 40.0d + "'", double12 == 40.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "staff" + "'", str14, "staff");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test12801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12801");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        staff3.logout();
        staff3.setVerified(false);
        java.lang.String str7 = staff3.getAccountType();
        staff3.login("staff", "hi!");
        staff3.logout();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "staff" + "'", str7, "staff");
    }

    @Test
    public void test12802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12802");
        model.Staff staff3 = new model.Staff("hi!", "", "hi!");
        staff3.setVerified(false);
        staff3.viewProfile();
        java.lang.String str7 = staff3.getEmail();
        java.lang.String str8 = staff3.getAccountType();
        java.lang.String str9 = staff3.getAccountType();
        java.lang.String str10 = staff3.getEmail();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "staff" + "'", str8, "staff");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "staff" + "'", str9, "staff");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test12803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12803");
        model.Staff staff3 = new model.Staff("hi!", "", "hi!");
        staff3.setVerified(false);
        staff3.viewProfile();
        java.lang.String str7 = staff3.getEmail();
        staff3.login("hi!", "hi!");
        java.lang.String str11 = staff3.getEmail();
        staff3.login("staff", "hi!");
        java.lang.String str15 = staff3.getPassword();
        staff3.viewProfile();
        boolean boolean17 = staff3.isVerified();
        boolean boolean18 = staff3.isVerified();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test12804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12804");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        boolean boolean6 = staff3.isVerified();
        staff3.logout();
        staff3.setVerified(false);
        staff3.viewProfile();
        staff3.login("hi!", "");
        boolean boolean14 = staff3.isVerified();
        staff3.logout();
        staff3.logout();
        boolean boolean17 = staff3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test12805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12805");
        model.Staff staff3 = new model.Staff("hi!", "hi!", "");
        staff3.setVerified(false);
        staff3.viewProfile();
        staff3.setVerified(false);
        staff3.viewProfile();
        staff3.viewProfile();
        java.lang.String str11 = staff3.getPassword();
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test12806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12806");
        model.Staff staff3 = new model.Staff("hi!", "", "hi!");
        staff3.logout();
        staff3.login("hi!", "hi!");
        double double8 = staff3.getHourlyRate();
        java.lang.String str9 = staff3.getID();
        java.lang.String str10 = staff3.getEmail();
        java.lang.String str11 = staff3.getPassword();
        java.lang.String str12 = staff3.getID();
        java.lang.String str13 = staff3.getID();
        staff3.setVerified(false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 40.0d + "'", double8 == 40.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test12807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12807");
        model.Staff staff3 = new model.Staff("hi!", "", "hi!");
        java.lang.String str4 = staff3.getAccountType();
        java.lang.String str5 = staff3.getID();
        staff3.setVerified(true);
        boolean boolean8 = staff3.isVerified();
        staff3.setVerified(false);
        java.lang.Class<?> wildcardClass11 = staff3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "staff" + "'", str4, "staff");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test12808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12808");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        boolean boolean5 = staff3.isVerified();
        java.lang.String str6 = staff3.getAccountType();
        java.lang.String str7 = staff3.getAccountType();
        java.lang.String str8 = staff3.getEmail();
        staff3.logout();
        staff3.login("staff", "hi!");
        staff3.viewProfile();
        java.lang.String str14 = staff3.getID();
        java.lang.String str15 = staff3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "staff" + "'", str6, "staff");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "staff" + "'", str7, "staff");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test12809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12809");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getID();
        java.lang.String str6 = staff3.getPassword();
        java.lang.String str7 = staff3.getEmail();
        boolean boolean8 = staff3.isVerified();
        java.lang.String str9 = staff3.getID();
        boolean boolean10 = staff3.isVerified();
        staff3.viewProfile();
        java.lang.Class<?> wildcardClass12 = staff3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test12810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12810");
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
        java.lang.String str18 = staff3.getID();
        java.lang.String str19 = staff3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 40.0d + "'", double13 == 40.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test12811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12811");
        model.Staff staff3 = new model.Staff("hi!", "staff", "staff");
        java.lang.String str4 = staff3.getID();
        staff3.setVerified(true);
        staff3.viewProfile();
        staff3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "staff" + "'", str4, "staff");
    }

    @Test
    public void test12812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12812");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        boolean boolean6 = staff3.isVerified();
        staff3.logout();
        java.lang.String str8 = staff3.getAccountType();
        staff3.setVerified(false);
        staff3.setVerified(true);
        staff3.login("", "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "staff" + "'", str8, "staff");
    }

    @Test
    public void test12813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12813");
        model.Staff staff3 = new model.Staff("hi!", "", "hi!");
        java.lang.String str4 = staff3.getAccountType();
        java.lang.String str5 = staff3.getID();
        staff3.setVerified(true);
        staff3.login("staff", "staff");
        double double11 = staff3.getHourlyRate();
        staff3.viewProfile();
        java.lang.String str13 = staff3.getID();
        staff3.viewProfile();
        staff3.viewProfile();
        java.lang.String str16 = staff3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "staff" + "'", str4, "staff");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 40.0d + "'", double11 == 40.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test12814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12814");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        boolean boolean6 = staff3.isVerified();
        staff3.logout();
        staff3.setVerified(false);
        java.lang.String str10 = staff3.getEmail();
        staff3.logout();
        staff3.login("", "");
        java.lang.String str15 = staff3.getID();
        java.lang.Class<?> wildcardClass16 = staff3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test12815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12815");
        model.Staff staff3 = new model.Staff("hi!", "", "hi!");
        staff3.logout();
        staff3.login("hi!", "hi!");
        java.lang.String str8 = staff3.getID();
        java.lang.String str9 = staff3.getEmail();
        double double10 = staff3.getHourlyRate();
        java.lang.String str11 = staff3.getEmail();
        staff3.login("", "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 40.0d + "'", double10 == 40.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test12816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12816");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        java.lang.String str6 = staff3.getPassword();
        java.lang.String str7 = staff3.getPassword();
        staff3.login("hi!", "hi!");
        boolean boolean11 = staff3.isVerified();
        staff3.login("staff", "");
        boolean boolean15 = staff3.isVerified();
        boolean boolean16 = staff3.isVerified();
        java.lang.String str17 = staff3.getID();
        staff3.setVerified(false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test12817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12817");
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
        staff3.setVerified(true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 40.0d + "'", double11 == 40.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 40.0d + "'", double14 == 40.0d);
    }

    @Test
    public void test12818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12818");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        boolean boolean5 = staff3.isVerified();
        java.lang.String str6 = staff3.getID();
        java.lang.String str7 = staff3.getID();
        staff3.login("hi!", "");
        java.lang.String str11 = staff3.getPassword();
        boolean boolean12 = staff3.isVerified();
        java.lang.String str13 = staff3.getPassword();
        staff3.setVerified(false);
        java.lang.String str16 = staff3.getEmail();
        staff3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test12819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12819");
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
        java.lang.String str28 = staff3.getEmail();
        staff3.logout();
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
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
    }

    @Test
    public void test12820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12820");
        model.Staff staff3 = new model.Staff("hi!", "", "staff");
        java.lang.String str4 = staff3.getPassword();
        double double5 = staff3.getHourlyRate();
        staff3.logout();
        java.lang.String str7 = staff3.getID();
        java.lang.String str8 = staff3.getEmail();
        java.lang.String str9 = staff3.getAccountType();
        staff3.login("", "hi!");
        staff3.setVerified(true);
        staff3.setVerified(false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 40.0d + "'", double5 == 40.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "staff" + "'", str7, "staff");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "staff" + "'", str9, "staff");
    }

    @Test
    public void test12821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12821");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        boolean boolean6 = staff3.isVerified();
        staff3.logout();
        staff3.setVerified(true);
        staff3.viewProfile();
        java.lang.String str11 = staff3.getID();
        boolean boolean12 = staff3.isVerified();
        java.lang.String str13 = staff3.getEmail();
        staff3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test12822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12822");
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
        java.lang.String str13 = staff3.getID();
        java.lang.String str14 = staff3.getEmail();
        boolean boolean15 = staff3.isVerified();
        staff3.setVerified(true);
        staff3.setVerified(false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "staff" + "'", str6, "staff");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "staff" + "'", str12, "staff");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test12823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12823");
        model.Staff staff3 = new model.Staff("hi!", "", "hi!");
        staff3.setVerified(false);
        java.lang.String str6 = staff3.getPassword();
        java.lang.String str7 = staff3.getAccountType();
        java.lang.String str8 = staff3.getEmail();
        staff3.setVerified(true);
        java.lang.String str11 = staff3.getAccountType();
        staff3.login("staff", "");
        java.lang.String str15 = staff3.getID();
        staff3.login("", "hi!");
        staff3.login("", "hi!");
        staff3.logout();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "staff" + "'", str7, "staff");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "staff" + "'", str11, "staff");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test12824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12824");
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
        staff3.setVerified(true);
        java.lang.Class<?> wildcardClass20 = staff3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "staff" + "'", str8, "staff");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "staff" + "'", str14, "staff");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 40.0d + "'", double16 == 40.0d);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test12825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12825");
        model.Staff staff3 = new model.Staff("", "", "staff");
        java.lang.String str4 = staff3.getAccountType();
        double double5 = staff3.getHourlyRate();
        java.lang.String str6 = staff3.getAccountType();
        java.lang.String str7 = staff3.getEmail();
        java.lang.String str8 = staff3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "staff" + "'", str4, "staff");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 40.0d + "'", double5 == 40.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "staff" + "'", str6, "staff");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test12826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12826");
        model.Staff staff3 = new model.Staff("hi!", "", "hi!");
        staff3.setVerified(false);
        java.lang.String str6 = staff3.getEmail();
        java.lang.String str7 = staff3.getAccountType();
        staff3.viewProfile();
        staff3.setVerified(false);
        staff3.logout();
        staff3.logout();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "staff" + "'", str7, "staff");
    }

    @Test
    public void test12827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12827");
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
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test12828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12828");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getAccountType();
        java.lang.String str5 = staff3.getAccountType();
        double double6 = staff3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "staff" + "'", str4, "staff");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 40.0d + "'", double6 == 40.0d);
    }

    @Test
    public void test12829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12829");
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
        java.lang.String str16 = staff3.getID();
        staff3.logout();
        staff3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 40.0d + "'", double15 == 40.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test12830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12830");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getID();
        java.lang.String str6 = staff3.getID();
        staff3.login("", "");
        java.lang.String str10 = staff3.getID();
        staff3.setVerified(true);
        java.lang.String str13 = staff3.getAccountType();
        java.lang.String str14 = staff3.getAccountType();
        java.lang.String str15 = staff3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "staff" + "'", str13, "staff");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "staff" + "'", str14, "staff");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test12831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12831");
        model.Staff staff3 = new model.Staff("hi!", "staff", "");
        staff3.logout();
        java.lang.String str5 = staff3.getEmail();
        java.lang.String str6 = staff3.getEmail();
        boolean boolean7 = staff3.isVerified();
        double double8 = staff3.getHourlyRate();
        staff3.login("hi!", "");
        java.lang.String str12 = staff3.getAccountType();
        staff3.login("staff", "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 40.0d + "'", double8 == 40.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "staff" + "'", str12, "staff");
    }

    @Test
    public void test12832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12832");
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
        double double15 = staff3.getHourlyRate();
        java.lang.String str16 = staff3.getAccountType();
        double double17 = staff3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "staff" + "'", str11, "staff");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 40.0d + "'", double13 == 40.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 40.0d + "'", double15 == 40.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "staff" + "'", str16, "staff");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 40.0d + "'", double17 == 40.0d);
    }

    @Test
    public void test12833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12833");
        model.Staff staff3 = new model.Staff("hi!", "", "hi!");
        staff3.setVerified(false);
        staff3.viewProfile();
        java.lang.String str7 = staff3.getEmail();
        double double8 = staff3.getHourlyRate();
        java.lang.String str9 = staff3.getID();
        staff3.login("staff", "");
        boolean boolean13 = staff3.isVerified();
        double double14 = staff3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 40.0d + "'", double8 == 40.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 40.0d + "'", double14 == 40.0d);
    }

    @Test
    public void test12834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12834");
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
        staff3.setVerified(false);
        java.lang.String str21 = staff3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 40.0d + "'", double16 == 40.0d);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test12835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12835");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        staff3.logout();
        java.lang.String str5 = staff3.getID();
        java.lang.String str6 = staff3.getEmail();
        staff3.viewProfile();
        staff3.setVerified(false);
        staff3.logout();
        java.lang.String str11 = staff3.getEmail();
        staff3.viewProfile();
        double double13 = staff3.getHourlyRate();
        java.lang.String str14 = staff3.getPassword();
        staff3.login("", "");
        java.lang.Class<?> wildcardClass18 = staff3.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 40.0d + "'", double13 == 40.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test12836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12836");
        model.Staff staff3 = new model.Staff("", "", "staff");
        staff3.login("staff", "");
        boolean boolean7 = staff3.isVerified();
        staff3.logout();
        staff3.logout();
        staff3.viewProfile();
        java.lang.String str11 = staff3.getEmail();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test12837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12837");
        model.Staff staff3 = new model.Staff("hi!", "hi!", "");
        java.lang.String str4 = staff3.getEmail();
        staff3.logout();
        java.lang.String str6 = staff3.getAccountType();
        java.lang.String str7 = staff3.getAccountType();
        staff3.setVerified(true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "staff" + "'", str6, "staff");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "staff" + "'", str7, "staff");
    }

    @Test
    public void test12838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12838");
        model.Staff staff3 = new model.Staff("staff", "", "staff");
        staff3.setVerified(false);
        java.lang.String str6 = staff3.getAccountType();
        staff3.login("hi!", "staff");
        staff3.logout();
        java.lang.Class<?> wildcardClass11 = staff3.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "staff" + "'", str6, "staff");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test12839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12839");
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
        java.lang.String str16 = staff3.getAccountType();
        java.lang.String str17 = staff3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 40.0d + "'", double12 == 40.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "staff" + "'", str14, "staff");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "staff" + "'", str16, "staff");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test12840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12840");
        model.Staff staff3 = new model.Staff("hi!", "", "hi!");
        staff3.logout();
        staff3.login("hi!", "hi!");
        double double8 = staff3.getHourlyRate();
        java.lang.String str9 = staff3.getID();
        java.lang.String str10 = staff3.getAccountType();
        staff3.setVerified(true);
        staff3.login("hi!", "hi!");
        java.lang.String str16 = staff3.getPassword();
        staff3.setVerified(false);
        staff3.setVerified(true);
        staff3.setVerified(true);
        staff3.setVerified(false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 40.0d + "'", double8 == 40.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "staff" + "'", str10, "staff");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test12841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12841");
        model.Staff staff3 = new model.Staff("hi!", "", "hi!");
        staff3.setVerified(false);
        java.lang.String str6 = staff3.getPassword();
        java.lang.String str7 = staff3.getAccountType();
        java.lang.String str8 = staff3.getEmail();
        java.lang.String str9 = staff3.getID();
        staff3.login("staff", "hi!");
        double double13 = staff3.getHourlyRate();
        java.lang.String str14 = staff3.getEmail();
        double double15 = staff3.getHourlyRate();
        java.lang.Class<?> wildcardClass16 = staff3.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "staff" + "'", str7, "staff");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 40.0d + "'", double13 == 40.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 40.0d + "'", double15 == 40.0d);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test12842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12842");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getID();
        java.lang.String str6 = staff3.getPassword();
        java.lang.String str7 = staff3.getEmail();
        staff3.setVerified(false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test12843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12843");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        staff3.logout();
        java.lang.String str5 = staff3.getID();
        java.lang.String str6 = staff3.getEmail();
        java.lang.String str7 = staff3.getPassword();
        java.lang.String str8 = staff3.getID();
        staff3.logout();
        staff3.logout();
        java.lang.String str11 = staff3.getPassword();
        staff3.login("hi!", "");
        staff3.setVerified(false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test12844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12844");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        staff3.logout();
        java.lang.String str5 = staff3.getID();
        java.lang.String str6 = staff3.getEmail();
        java.lang.String str7 = staff3.getPassword();
        java.lang.String str8 = staff3.getID();
        staff3.logout();
        staff3.logout();
        java.lang.String str11 = staff3.getPassword();
        java.lang.String str12 = staff3.getEmail();
        staff3.login("hi!", "staff");
        java.lang.String str16 = staff3.getEmail();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test12845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12845");
        model.Staff staff3 = new model.Staff("hi!", "", "hi!");
        staff3.logout();
        staff3.login("hi!", "hi!");
        staff3.viewProfile();
        staff3.login("", "staff");
        staff3.login("", "staff");
        java.lang.String str15 = staff3.getEmail();
        double double16 = staff3.getHourlyRate();
        java.lang.String str17 = staff3.getPassword();
        staff3.logout();
        staff3.login("hi!", "");
        java.lang.String str22 = staff3.getPassword();
        staff3.logout();
        staff3.setVerified(true);
        staff3.setVerified(false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 40.0d + "'", double16 == 40.0d);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test12846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12846");
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
        staff3.login("staff", "staff");
        java.lang.String str18 = staff3.getID();
        java.lang.String str19 = staff3.getEmail();
        staff3.login("", "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "staff" + "'", str14, "staff");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test12847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12847");
        model.Staff staff3 = new model.Staff("hi!", "", "hi!");
        staff3.setVerified(false);
        java.lang.String str6 = staff3.getPassword();
        java.lang.String str7 = staff3.getAccountType();
        staff3.logout();
        java.lang.String str9 = staff3.getID();
        staff3.viewProfile();
        java.lang.String str11 = staff3.getPassword();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "staff" + "'", str7, "staff");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test12848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12848");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        boolean boolean5 = staff3.isVerified();
        java.lang.String str6 = staff3.getAccountType();
        staff3.logout();
        double double8 = staff3.getHourlyRate();
        java.lang.String str9 = staff3.getEmail();
        java.lang.String str10 = staff3.getAccountType();
        boolean boolean11 = staff3.isVerified();
        java.lang.String str12 = staff3.getPassword();
        staff3.logout();
        java.lang.String str14 = staff3.getPassword();
        staff3.logout();
        java.lang.String str16 = staff3.getAccountType();
        staff3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "staff" + "'", str6, "staff");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 40.0d + "'", double8 == 40.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "staff" + "'", str10, "staff");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "staff" + "'", str16, "staff");
    }

    @Test
    public void test12849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12849");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        boolean boolean5 = staff3.isVerified();
        java.lang.String str6 = staff3.getAccountType();
        java.lang.String str7 = staff3.getAccountType();
        java.lang.String str8 = staff3.getEmail();
        java.lang.String str9 = staff3.getID();
        java.lang.String str10 = staff3.getID();
        java.lang.String str11 = staff3.getID();
        java.lang.String str12 = staff3.getPassword();
        java.lang.Class<?> wildcardClass13 = staff3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "staff" + "'", str6, "staff");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "staff" + "'", str7, "staff");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test12850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12850");
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
        java.lang.String str13 = staff3.getEmail();
        java.lang.String str14 = staff3.getID();
        java.lang.String str15 = staff3.getAccountType();
        java.lang.String str16 = staff3.getPassword();
        staff3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "staff" + "'", str11, "staff");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "staff" + "'", str15, "staff");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test12851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12851");
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
        java.lang.String str16 = staff3.getAccountType();
        java.lang.String str17 = staff3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "staff" + "'", str16, "staff");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "staff" + "'", str17, "staff");
    }

    @Test
    public void test12852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12852");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        double double6 = staff3.getHourlyRate();
        java.lang.String str7 = staff3.getPassword();
        java.lang.String str8 = staff3.getPassword();
        staff3.login("staff", "hi!");
        staff3.login("hi!", "");
        staff3.setVerified(false);
        java.lang.String str17 = staff3.getEmail();
        java.lang.String str18 = staff3.getAccountType();
        staff3.logout();
        staff3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 40.0d + "'", double6 == 40.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "staff" + "'", str18, "staff");
    }

    @Test
    public void test12853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12853");
        model.Staff staff3 = new model.Staff("hi!", "", "hi!");
        staff3.logout();
        staff3.login("hi!", "hi!");
        staff3.viewProfile();
        staff3.login("", "staff");
        staff3.login("", "staff");
        java.lang.String str15 = staff3.getID();
        java.lang.String str16 = staff3.getEmail();
        double double17 = staff3.getHourlyRate();
        staff3.login("hi!", "hi!");
        java.lang.String str21 = staff3.getEmail();
        boolean boolean22 = staff3.isVerified();
        staff3.viewProfile();
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 40.0d + "'", double17 == 40.0d);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test12854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12854");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getEmail();
        boolean boolean6 = staff3.isVerified();
        staff3.logout();
        double double8 = staff3.getHourlyRate();
        staff3.logout();
        java.lang.String str10 = staff3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 40.0d + "'", double8 == 40.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test12855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12855");
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
        staff3.viewProfile();
        java.lang.String str14 = staff3.getID();
        java.lang.String str15 = staff3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "staff" + "'", str11, "staff");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test12856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12856");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        double double6 = staff3.getHourlyRate();
        staff3.logout();
        staff3.setVerified(true);
        java.lang.String str10 = staff3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 40.0d + "'", double6 == 40.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "staff" + "'", str10, "staff");
    }

    @Test
    public void test12857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12857");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        staff3.logout();
        java.lang.String str5 = staff3.getAccountType();
        staff3.login("hi!", "hi!");
        java.lang.String str9 = staff3.getPassword();
        java.lang.Class<?> wildcardClass10 = staff3.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test12858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12858");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        boolean boolean5 = staff3.isVerified();
        java.lang.String str6 = staff3.getID();
        boolean boolean7 = staff3.isVerified();
        java.lang.String str8 = staff3.getID();
        java.lang.String str9 = staff3.getPassword();
        boolean boolean10 = staff3.isVerified();
        java.lang.String str11 = staff3.getPassword();
        staff3.setVerified(true);
        java.lang.String str14 = staff3.getPassword();
        java.lang.String str15 = staff3.getEmail();
        staff3.setVerified(true);
        java.lang.String str18 = staff3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test12859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12859");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        java.lang.String str6 = staff3.getPassword();
        java.lang.String str7 = staff3.getPassword();
        java.lang.String str8 = staff3.getID();
        java.lang.String str9 = staff3.getID();
        staff3.viewProfile();
        java.lang.String str11 = staff3.getPassword();
        staff3.viewProfile();
        java.lang.String str13 = staff3.getID();
        java.lang.String str14 = staff3.getPassword();
        java.lang.String str15 = staff3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test12860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12860");
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
        boolean boolean15 = staff3.isVerified();
        java.lang.String str16 = staff3.getEmail();
        java.lang.String str17 = staff3.getAccountType();
        staff3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "staff" + "'", str8, "staff");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "staff" + "'", str12, "staff");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "staff" + "'", str17, "staff");
    }

    @Test
    public void test12861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12861");
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
        java.lang.String str15 = staff3.getEmail();
        staff3.login("", "hi!");
        java.lang.String str19 = staff3.getEmail();
        java.lang.String str20 = staff3.getEmail();
        java.lang.String str21 = staff3.getID();
        java.lang.Class<?> wildcardClass22 = staff3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "staff" + "'", str6, "staff");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test12862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12862");
        model.Staff staff3 = new model.Staff("", "", "staff");
        java.lang.String str4 = staff3.getAccountType();
        java.lang.String str5 = staff3.getID();
        double double6 = staff3.getHourlyRate();
        staff3.logout();
        staff3.setVerified(false);
        java.lang.String str10 = staff3.getID();
        staff3.logout();
        double double12 = staff3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "staff" + "'", str4, "staff");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 40.0d + "'", double6 == 40.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "staff" + "'", str10, "staff");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 40.0d + "'", double12 == 40.0d);
    }

    @Test
    public void test12863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12863");
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
        staff3.viewProfile();
        staff3.login("", "staff");
        java.lang.String str18 = staff3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 40.0d + "'", double13 == 40.0d);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "staff" + "'", str18, "staff");
    }

    @Test
    public void test12864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12864");
        model.Staff staff3 = new model.Staff("hi!", "hi!", "");
        java.lang.String str4 = staff3.getEmail();
        java.lang.String str5 = staff3.getAccountType();
        double double6 = staff3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 40.0d + "'", double6 == 40.0d);
    }

    @Test
    public void test12865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12865");
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
        staff3.logout();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 40.0d + "'", double7 == 40.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test12866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12866");
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
        staff3.viewProfile();
        boolean boolean19 = staff3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 40.0d + "'", double17 == 40.0d);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test12867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12867");
        model.Staff staff3 = new model.Staff("staff", "", "");
        staff3.login("staff", "staff");
    }

    @Test
    public void test12868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12868");
        model.Staff staff3 = new model.Staff("hi!", "", "hi!");
        double double4 = staff3.getHourlyRate();
        staff3.logout();
        staff3.logout();
        java.lang.String str7 = staff3.getEmail();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 40.0d + "'", double4 == 40.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test12869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12869");
        model.Staff staff3 = new model.Staff("", "staff", "staff");
        staff3.setVerified(true);
        java.lang.String str6 = staff3.getPassword();
        boolean boolean7 = staff3.isVerified();
        java.lang.String str8 = staff3.getEmail();
        staff3.login("", "staff");
        java.lang.String str12 = staff3.getAccountType();
        java.lang.String str13 = staff3.getAccountType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "staff" + "'", str6, "staff");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "staff" + "'", str12, "staff");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "staff" + "'", str13, "staff");
    }

    @Test
    public void test12870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12870");
        model.Staff staff3 = new model.Staff("hi!", "", "hi!");
        staff3.setVerified(false);
        java.lang.String str6 = staff3.getEmail();
        java.lang.String str7 = staff3.getAccountType();
        staff3.viewProfile();
        java.lang.String str9 = staff3.getAccountType();
        java.lang.String str10 = staff3.getPassword();
        double double11 = staff3.getHourlyRate();
        java.lang.String str12 = staff3.getAccountType();
        staff3.login("", "");
        boolean boolean16 = staff3.isVerified();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "staff" + "'", str7, "staff");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "staff" + "'", str9, "staff");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 40.0d + "'", double11 == 40.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "staff" + "'", str12, "staff");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test12871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12871");
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
        java.lang.String str13 = staff3.getPassword();
        staff3.login("", "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 40.0d + "'", double12 == 40.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test12872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12872");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        boolean boolean5 = staff3.isVerified();
        java.lang.String str6 = staff3.getID();
        staff3.setVerified(false);
        java.lang.String str9 = staff3.getID();
        staff3.setVerified(false);
        java.lang.String str12 = staff3.getPassword();
        java.lang.String str13 = staff3.getPassword();
        staff3.viewProfile();
        java.lang.String str15 = staff3.getEmail();
        java.lang.String str16 = staff3.getID();
        staff3.logout();
        staff3.login("hi!", "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test12873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12873");
        model.Staff staff3 = new model.Staff("", "", "staff");
        java.lang.String str4 = staff3.getID();
        double double5 = staff3.getHourlyRate();
        double double6 = staff3.getHourlyRate();
        java.lang.String str7 = staff3.getAccountType();
        staff3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "staff" + "'", str4, "staff");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 40.0d + "'", double5 == 40.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 40.0d + "'", double6 == 40.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "staff" + "'", str7, "staff");
    }

    @Test
    public void test12874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12874");
        model.Staff staff3 = new model.Staff("staff", "hi!", "");
        staff3.login("hi!", "hi!");
        staff3.logout();
        java.lang.String str8 = staff3.getPassword();
        java.lang.String str9 = staff3.getID();
        double double10 = staff3.getHourlyRate();
        java.lang.String str11 = staff3.getAccountType();
        java.lang.String str12 = staff3.getAccountType();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 40.0d + "'", double10 == 40.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "staff" + "'", str11, "staff");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "staff" + "'", str12, "staff");
    }

    @Test
    public void test12875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12875");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        boolean boolean5 = staff3.isVerified();
        java.lang.String str6 = staff3.getAccountType();
        staff3.logout();
        boolean boolean8 = staff3.isVerified();
        staff3.logout();
        double double10 = staff3.getHourlyRate();
        staff3.logout();
        java.lang.String str12 = staff3.getPassword();
        staff3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "staff" + "'", str6, "staff");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 40.0d + "'", double10 == 40.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test12876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12876");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        boolean boolean6 = staff3.isVerified();
        staff3.logout();
        java.lang.String str8 = staff3.getPassword();
        boolean boolean9 = staff3.isVerified();
        staff3.viewProfile();
        java.lang.String str11 = staff3.getEmail();
        staff3.login("", "hi!");
        double double15 = staff3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 40.0d + "'", double15 == 40.0d);
    }

    @Test
    public void test12877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12877");
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
        java.lang.String str21 = staff3.getAccountType();
        java.lang.Class<?> wildcardClass22 = staff3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "staff" + "'", str17, "staff");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "staff" + "'", str21, "staff");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test12878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12878");
        model.Staff staff3 = new model.Staff("hi!", "hi!", "");
        staff3.logout();
        java.lang.String str5 = staff3.getEmail();
        java.lang.String str6 = staff3.getAccountType();
        java.lang.String str7 = staff3.getEmail();
        java.lang.String str8 = staff3.getPassword();
        staff3.logout();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "staff" + "'", str6, "staff");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test12879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12879");
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
        java.lang.String str13 = staff3.getID();
        double double14 = staff3.getHourlyRate();
        staff3.viewProfile();
        java.lang.String str16 = staff3.getID();
        staff3.logout();
        java.lang.Class<?> wildcardClass18 = staff3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 40.0d + "'", double6 == 40.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "staff" + "'", str11, "staff");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 40.0d + "'", double14 == 40.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test12880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12880");
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
        java.lang.String str16 = staff3.getPassword();
        java.lang.String str17 = staff3.getEmail();
        staff3.login("", "hi!");
        java.lang.String str21 = staff3.getID();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 40.0d + "'", double7 == 40.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 40.0d + "'", double10 == 40.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 40.0d + "'", double13 == 40.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
    }

    @Test
    public void test12881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12881");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getEmail();
        boolean boolean6 = staff3.isVerified();
        staff3.logout();
        staff3.login("hi!", "staff");
        java.lang.String str11 = staff3.getEmail();
        staff3.setVerified(false);
        staff3.setVerified(false);
        java.lang.String str16 = staff3.getAccountType();
        staff3.setVerified(true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "staff" + "'", str16, "staff");
    }

    @Test
    public void test12882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12882");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getEmail();
        boolean boolean6 = staff3.isVerified();
        staff3.logout();
        staff3.login("hi!", "staff");
        boolean boolean11 = staff3.isVerified();
        staff3.login("", "staff");
        staff3.logout();
        staff3.login("staff", "");
        java.lang.String str19 = staff3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test12883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12883");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        boolean boolean5 = staff3.isVerified();
        java.lang.String str6 = staff3.getID();
        staff3.setVerified(false);
        boolean boolean9 = staff3.isVerified();
        double double10 = staff3.getHourlyRate();
        java.lang.String str11 = staff3.getID();
        boolean boolean12 = staff3.isVerified();
        staff3.viewProfile();
        java.lang.String str14 = staff3.getAccountType();
        java.lang.String str15 = staff3.getEmail();
        staff3.setVerified(true);
        staff3.logout();
        staff3.setVerified(false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 40.0d + "'", double10 == 40.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "staff" + "'", str14, "staff");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test12884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12884");
        model.Staff staff3 = new model.Staff("hi!", "hi!", "staff");
        staff3.login("hi!", "hi!");
        staff3.viewProfile();
    }

    @Test
    public void test12885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12885");
        model.Staff staff3 = new model.Staff("", "", "staff");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getPassword();
        staff3.login("", "");
        staff3.login("hi!", "hi!");
        java.lang.String str12 = staff3.getID();
        staff3.viewProfile();
        java.lang.String str14 = staff3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "staff" + "'", str4, "staff");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "staff" + "'", str12, "staff");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "staff" + "'", str14, "staff");
    }

    @Test
    public void test12886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12886");
        model.Staff staff3 = new model.Staff("hi!", "staff", "");
        java.lang.String str4 = staff3.getEmail();
        staff3.viewProfile();
        staff3.viewProfile();
        java.lang.String str7 = staff3.getEmail();
        staff3.login("hi!", "");
        staff3.viewProfile();
        staff3.setVerified(true);
        double double14 = staff3.getHourlyRate();
        staff3.setVerified(true);
        java.lang.String str17 = staff3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 40.0d + "'", double14 == 40.0d);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "staff" + "'", str17, "staff");
    }

    @Test
    public void test12887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12887");
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
        java.lang.String str13 = staff3.getPassword();
        boolean boolean14 = staff3.isVerified();
        java.lang.String str15 = staff3.getAccountType();
        staff3.viewProfile();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 40.0d + "'", double7 == 40.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "staff" + "'", str10, "staff");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 40.0d + "'", double11 == 40.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "staff" + "'", str15, "staff");
    }

    @Test
    public void test12888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12888");
        model.Staff staff3 = new model.Staff("hi!", "", "hi!");
        double double4 = staff3.getHourlyRate();
        boolean boolean5 = staff3.isVerified();
        double double6 = staff3.getHourlyRate();
        java.lang.String str7 = staff3.getAccountType();
        boolean boolean8 = staff3.isVerified();
        staff3.setVerified(false);
        staff3.setVerified(true);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 40.0d + "'", double4 == 40.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 40.0d + "'", double6 == 40.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "staff" + "'", str7, "staff");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test12889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12889");
        model.Staff staff3 = new model.Staff("", "", "staff");
        staff3.login("staff", "");
        boolean boolean7 = staff3.isVerified();
        boolean boolean8 = staff3.isVerified();
        java.lang.String str9 = staff3.getEmail();
        java.lang.String str10 = staff3.getAccountType();
        java.lang.String str11 = staff3.getPassword();
        java.lang.String str12 = staff3.getEmail();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "staff" + "'", str10, "staff");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test12890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12890");
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
        staff3.login("", "hi!");
        staff3.viewProfile();
        java.lang.String str20 = staff3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "staff" + "'", str11, "staff");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test12891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12891");
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
        staff3.login("hi!", "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "staff" + "'", str18, "staff");
    }

    @Test
    public void test12892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12892");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        java.lang.String str6 = staff3.getPassword();
        java.lang.String str7 = staff3.getPassword();
        staff3.login("hi!", "hi!");
        boolean boolean11 = staff3.isVerified();
        java.lang.String str12 = staff3.getEmail();
        double double13 = staff3.getHourlyRate();
        java.lang.String str14 = staff3.getID();
        boolean boolean15 = staff3.isVerified();
        staff3.logout();
        double double17 = staff3.getHourlyRate();
        staff3.viewProfile();
        staff3.login("staff", "staff");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 40.0d + "'", double13 == 40.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 40.0d + "'", double17 == 40.0d);
    }

    @Test
    public void test12893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12893");
        model.Staff staff3 = new model.Staff("hi!", "", "hi!");
        staff3.logout();
        staff3.login("hi!", "hi!");
        java.lang.String str8 = staff3.getID();
        java.lang.String str9 = staff3.getPassword();
        java.lang.String str10 = staff3.getPassword();
        staff3.logout();
        staff3.viewProfile();
        java.lang.Class<?> wildcardClass13 = staff3.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test12894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12894");
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
        staff3.viewProfile();
        boolean boolean14 = staff3.isVerified();
        double double15 = staff3.getHourlyRate();
        java.lang.String str16 = staff3.getPassword();
        staff3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "staff" + "'", str11, "staff");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 40.0d + "'", double15 == 40.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test12895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12895");
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
        staff3.logout();
        staff3.logout();
        staff3.login("staff", "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "staff" + "'", str13, "staff");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test12896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12896");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        boolean boolean5 = staff3.isVerified();
        java.lang.String str6 = staff3.getID();
        java.lang.String str7 = staff3.getID();
        staff3.setVerified(true);
        java.lang.String str10 = staff3.getAccountType();
        java.lang.String str11 = staff3.getPassword();
        java.lang.String str12 = staff3.getAccountType();
        double double13 = staff3.getHourlyRate();
        staff3.viewProfile();
        java.lang.String str15 = staff3.getEmail();
        boolean boolean16 = staff3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "staff" + "'", str10, "staff");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "staff" + "'", str12, "staff");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 40.0d + "'", double13 == 40.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test12897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12897");
        model.Staff staff3 = new model.Staff("hi!", "staff", "");
        staff3.logout();
        java.lang.String str5 = staff3.getEmail();
        java.lang.String str6 = staff3.getEmail();
        boolean boolean7 = staff3.isVerified();
        java.lang.String str8 = staff3.getEmail();
        double double9 = staff3.getHourlyRate();
        double double10 = staff3.getHourlyRate();
        java.lang.String str11 = staff3.getPassword();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 40.0d + "'", double9 == 40.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 40.0d + "'", double10 == 40.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "staff" + "'", str11, "staff");
    }

    @Test
    public void test12898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12898");
        model.Staff staff3 = new model.Staff("hi!", "", "hi!");
        staff3.setVerified(false);
        staff3.viewProfile();
        java.lang.String str7 = staff3.getEmail();
        java.lang.String str8 = staff3.getAccountType();
        staff3.logout();
        staff3.login("", "");
        staff3.logout();
        java.lang.String str14 = staff3.getPassword();
        staff3.logout();
        staff3.setVerified(false);
        staff3.login("", "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "staff" + "'", str8, "staff");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test12899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12899");
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
        java.lang.String str16 = staff3.getPassword();
        java.lang.String str17 = staff3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 40.0d + "'", double14 == 40.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test12900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12900");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        staff3.logout();
        java.lang.String str5 = staff3.getID();
        java.lang.String str6 = staff3.getEmail();
        double double7 = staff3.getHourlyRate();
        boolean boolean8 = staff3.isVerified();
        boolean boolean9 = staff3.isVerified();
        staff3.login("", "staff");
        staff3.setVerified(true);
        staff3.login("staff", "hi!");
        staff3.logout();
        java.lang.String str19 = staff3.getPassword();
        staff3.setVerified(false);
        java.lang.String str22 = staff3.getPassword();
        staff3.login("", "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 40.0d + "'", double7 == 40.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test12901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12901");
        model.Staff staff3 = new model.Staff("hi!", "hi!", "");
        staff3.setVerified(true);
        boolean boolean6 = staff3.isVerified();
        java.lang.String str7 = staff3.getPassword();
        staff3.logout();
        staff3.login("staff", "");
        boolean boolean12 = staff3.isVerified();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test12902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12902");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        boolean boolean5 = staff3.isVerified();
        java.lang.String str6 = staff3.getID();
        java.lang.String str7 = staff3.getID();
        double double8 = staff3.getHourlyRate();
        java.lang.String str9 = staff3.getID();
        java.lang.String str10 = staff3.getEmail();
        java.lang.String str11 = staff3.getAccountType();
        staff3.logout();
        java.lang.String str13 = staff3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 40.0d + "'", double8 == 40.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "staff" + "'", str11, "staff");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test12903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12903");
        model.Staff staff3 = new model.Staff("hi!", "", "hi!");
        java.lang.String str4 = staff3.getAccountType();
        java.lang.String str5 = staff3.getEmail();
        double double6 = staff3.getHourlyRate();
        double double7 = staff3.getHourlyRate();
        staff3.logout();
        staff3.viewProfile();
        java.lang.String str10 = staff3.getPassword();
        double double11 = staff3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "staff" + "'", str4, "staff");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 40.0d + "'", double6 == 40.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 40.0d + "'", double7 == 40.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 40.0d + "'", double11 == 40.0d);
    }

    @Test
    public void test12904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12904");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        boolean boolean6 = staff3.isVerified();
        staff3.logout();
        double double8 = staff3.getHourlyRate();
        boolean boolean9 = staff3.isVerified();
        staff3.setVerified(false);
        double double12 = staff3.getHourlyRate();
        staff3.viewProfile();
        staff3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 40.0d + "'", double8 == 40.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 40.0d + "'", double12 == 40.0d);
    }

    @Test
    public void test12905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12905");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getEmail();
        boolean boolean6 = staff3.isVerified();
        staff3.logout();
        staff3.login("hi!", "staff");
        java.lang.String str11 = staff3.getEmail();
        double double12 = staff3.getHourlyRate();
        java.lang.String str13 = staff3.getPassword();
        staff3.viewProfile();
        staff3.login("hi!", "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 40.0d + "'", double12 == 40.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test12906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12906");
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
        boolean boolean14 = staff3.isVerified();
        staff3.viewProfile();
        staff3.setVerified(false);
        staff3.login("hi!", "");
        boolean boolean21 = staff3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "staff" + "'", str6, "staff");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test12907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12907");
        model.Staff staff3 = new model.Staff("hi!", "", "hi!");
        java.lang.String str4 = staff3.getAccountType();
        staff3.setVerified(true);
        java.lang.String str7 = staff3.getAccountType();
        boolean boolean8 = staff3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "staff" + "'", str4, "staff");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "staff" + "'", str7, "staff");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test12908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12908");
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
        java.lang.String str15 = staff3.getAccountType();
        staff3.logout();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 40.0d + "'", double7 == 40.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "staff" + "'", str15, "staff");
    }

    @Test
    public void test12909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12909");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        boolean boolean6 = staff3.isVerified();
        staff3.logout();
        java.lang.String str8 = staff3.getPassword();
        java.lang.String str9 = staff3.getID();
        staff3.logout();
        staff3.login("hi!", "staff");
        staff3.setVerified(true);
        java.lang.String str16 = staff3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test12910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12910");
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
        double double13 = staff3.getHourlyRate();
        staff3.setVerified(false);
        java.lang.String str16 = staff3.getID();
        staff3.viewProfile();
        java.lang.String str18 = staff3.getPassword();
        boolean boolean19 = staff3.isVerified();
        boolean boolean20 = staff3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "staff" + "'", str11, "staff");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 40.0d + "'", double13 == 40.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test12911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12911");
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
        java.lang.Class<?> wildcardClass19 = staff3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "staff" + "'", str4, "staff");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "staff" + "'", str11, "staff");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 40.0d + "'", double14 == 40.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test12912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12912");
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
        java.lang.String str17 = staff3.getPassword();
        java.lang.String str18 = staff3.getAccountType();
        staff3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "staff" + "'", str18, "staff");
    }

    @Test
    public void test12913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12913");
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
        java.lang.String str15 = staff3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 40.0d + "'", double13 == 40.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test12914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12914");
        model.Staff staff3 = new model.Staff("hi!", "staff", "");
        staff3.login("", "hi!");
        staff3.login("staff", "");
    }

    @Test
    public void test12915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12915");
        model.Staff staff3 = new model.Staff("hi!", "", "hi!");
        staff3.setVerified(false);
        staff3.viewProfile();
        double double7 = staff3.getHourlyRate();
        java.lang.String str8 = staff3.getID();
        staff3.setVerified(true);
        java.lang.Class<?> wildcardClass11 = staff3.getClass();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 40.0d + "'", double7 == 40.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test12916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12916");
        model.Staff staff3 = new model.Staff("hi!", "", "hi!");
        java.lang.String str4 = staff3.getAccountType();
        java.lang.String str5 = staff3.getEmail();
        staff3.viewProfile();
        staff3.logout();
        staff3.login("staff", "staff");
        double double11 = staff3.getHourlyRate();
        java.lang.String str12 = staff3.getPassword();
        staff3.login("staff", "staff");
        java.lang.String str16 = staff3.getPassword();
        staff3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "staff" + "'", str4, "staff");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 40.0d + "'", double11 == 40.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test12917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12917");
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
        staff3.setVerified(false);
        staff3.login("", "staff");
        boolean boolean24 = staff3.isVerified();
        staff3.setVerified(true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 40.0d + "'", double6 == 40.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test12918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12918");
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
        staff3.setVerified(false);
        staff3.viewProfile();
        staff3.logout();
        boolean boolean18 = staff3.isVerified();
        boolean boolean19 = staff3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "staff" + "'", str13, "staff");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test12919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12919");
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
        staff3.setVerified(false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test12920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12920");
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
        java.lang.String str14 = staff3.getEmail();
        java.lang.String str15 = staff3.getEmail();
        java.lang.String str16 = staff3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 40.0d + "'", double6 == 40.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "staff" + "'", str11, "staff");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test12921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12921");
        model.Staff staff3 = new model.Staff("hi!", "", "hi!");
        staff3.logout();
        staff3.login("hi!", "hi!");
        staff3.viewProfile();
        java.lang.String str9 = staff3.getPassword();
        java.lang.String str10 = staff3.getID();
        staff3.logout();
        staff3.login("", "staff");
        java.lang.String str15 = staff3.getID();
        boolean boolean16 = staff3.isVerified();
        staff3.login("hi!", "hi!");
        staff3.setVerified(false);
        staff3.login("", "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test12922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12922");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        staff3.login("", "");
        double double7 = staff3.getHourlyRate();
        boolean boolean8 = staff3.isVerified();
        java.lang.String str9 = staff3.getEmail();
        java.lang.String str10 = staff3.getID();
        boolean boolean11 = staff3.isVerified();
        staff3.viewProfile();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 40.0d + "'", double7 == 40.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test12923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12923");
        model.Staff staff3 = new model.Staff("hi!", "", "hi!");
        staff3.setVerified(false);
        java.lang.String str6 = staff3.getEmail();
        staff3.setVerified(false);
        staff3.login("staff", "hi!");
        java.lang.String str12 = staff3.getAccountType();
        double double13 = staff3.getHourlyRate();
        staff3.logout();
        staff3.viewProfile();
        double double16 = staff3.getHourlyRate();
        boolean boolean17 = staff3.isVerified();
        java.lang.String str18 = staff3.getAccountType();
        java.lang.String str19 = staff3.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "staff" + "'", str12, "staff");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 40.0d + "'", double13 == 40.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 40.0d + "'", double16 == 40.0d);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "staff" + "'", str18, "staff");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test12924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12924");
        model.Staff staff3 = new model.Staff("hi!", "", "hi!");
        java.lang.String str4 = staff3.getAccountType();
        java.lang.String str5 = staff3.getID();
        staff3.setVerified(true);
        staff3.login("staff", "staff");
        staff3.setVerified(true);
        java.lang.String str13 = staff3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "staff" + "'", str4, "staff");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test12925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12925");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        boolean boolean6 = staff3.isVerified();
        staff3.logout();
        staff3.setVerified(false);
        staff3.logout();
        double double11 = staff3.getHourlyRate();
        staff3.viewProfile();
        staff3.setVerified(false);
        java.lang.String str15 = staff3.getEmail();
        staff3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 40.0d + "'", double11 == 40.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test12926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12926");
        model.Staff staff3 = new model.Staff("hi!", "staff", "");
        java.lang.String str4 = staff3.getPassword();
        boolean boolean5 = staff3.isVerified();
        staff3.login("", "staff");
        java.lang.String str9 = staff3.getAccountType();
        java.lang.String str10 = staff3.getID();
        staff3.setVerified(true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "staff" + "'", str4, "staff");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "staff" + "'", str9, "staff");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test12927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12927");
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
        staff3.logout();
        java.lang.String str18 = staff3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "staff" + "'", str4, "staff");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test12928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12928");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        boolean boolean6 = staff3.isVerified();
        staff3.login("", "");
        staff3.login("staff", "staff");
        java.lang.String str13 = staff3.getPassword();
        staff3.viewProfile();
        java.lang.String str15 = staff3.getEmail();
        staff3.setVerified(true);
        staff3.login("", "staff");
        staff3.logout();
        staff3.setVerified(false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test12929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12929");
        model.Staff staff3 = new model.Staff("hi!", "hi!", "");
        staff3.viewProfile();
        java.lang.String str5 = staff3.getAccountType();
        java.lang.String str6 = staff3.getEmail();
        staff3.login("", "hi!");
        staff3.viewProfile();
        staff3.login("staff", "staff");
        boolean boolean14 = staff3.isVerified();
        java.lang.Class<?> wildcardClass15 = staff3.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test12930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12930");
        model.Staff staff3 = new model.Staff("hi!", "", "hi!");
        java.lang.String str4 = staff3.getPassword();
        double double5 = staff3.getHourlyRate();
        double double6 = staff3.getHourlyRate();
        staff3.viewProfile();
        staff3.setVerified(false);
        boolean boolean10 = staff3.isVerified();
        java.lang.String str11 = staff3.getPassword();
        java.lang.String str12 = staff3.getAccountType();
        staff3.login("hi!", "staff");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 40.0d + "'", double5 == 40.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 40.0d + "'", double6 == 40.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "staff" + "'", str12, "staff");
    }

    @Test
    public void test12931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12931");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        boolean boolean5 = staff3.isVerified();
        java.lang.String str6 = staff3.getID();
        java.lang.String str7 = staff3.getID();
        java.lang.String str8 = staff3.getID();
        java.lang.String str9 = staff3.getID();
        double double10 = staff3.getHourlyRate();
        java.lang.String str11 = staff3.getAccountType();
        double double12 = staff3.getHourlyRate();
        staff3.viewProfile();
        java.lang.Class<?> wildcardClass14 = staff3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 40.0d + "'", double10 == 40.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "staff" + "'", str11, "staff");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 40.0d + "'", double12 == 40.0d);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test12932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12932");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        boolean boolean6 = staff3.isVerified();
        staff3.login("", "");
        java.lang.String str10 = staff3.getID();
        java.lang.String str11 = staff3.getEmail();
        java.lang.String str12 = staff3.getID();
        java.lang.String str13 = staff3.getID();
        java.lang.String str14 = staff3.getID();
        staff3.setVerified(true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test12933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12933");
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
        staff3.logout();
        java.lang.String str24 = staff3.getPassword();
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 40.0d + "'", double8 == 40.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "staff" + "'", str10, "staff");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test12934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12934");
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
        boolean boolean17 = staff3.isVerified();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 40.0d + "'", double11 == 40.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "staff" + "'", str12, "staff");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test12935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12935");
        model.Staff staff3 = new model.Staff("hi!", "", "hi!");
        staff3.logout();
        staff3.login("hi!", "hi!");
        double double8 = staff3.getHourlyRate();
        java.lang.String str9 = staff3.getID();
        staff3.login("", "staff");
        staff3.viewProfile();
        java.lang.String str14 = staff3.getEmail();
        boolean boolean15 = staff3.isVerified();
        double double16 = staff3.getHourlyRate();
        boolean boolean17 = staff3.isVerified();
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 40.0d + "'", double8 == 40.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 40.0d + "'", double16 == 40.0d);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test12936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12936");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        boolean boolean5 = staff3.isVerified();
        java.lang.String str6 = staff3.getAccountType();
        staff3.logout();
        double double8 = staff3.getHourlyRate();
        java.lang.String str9 = staff3.getEmail();
        java.lang.String str10 = staff3.getAccountType();
        boolean boolean11 = staff3.isVerified();
        java.lang.String str12 = staff3.getPassword();
        staff3.setVerified(false);
        java.lang.String str15 = staff3.getPassword();
        java.lang.String str16 = staff3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "staff" + "'", str6, "staff");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 40.0d + "'", double8 == 40.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "staff" + "'", str10, "staff");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test12937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12937");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        boolean boolean6 = staff3.isVerified();
        staff3.login("", "");
        java.lang.String str10 = staff3.getID();
        java.lang.String str11 = staff3.getPassword();
        double double12 = staff3.getHourlyRate();
        java.lang.String str13 = staff3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 40.0d + "'", double12 == 40.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test12938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12938");
        model.Staff staff3 = new model.Staff("hi!", "", "hi!");
        staff3.setVerified(false);
        java.lang.String str6 = staff3.getEmail();
        java.lang.String str7 = staff3.getAccountType();
        java.lang.String str8 = staff3.getAccountType();
        boolean boolean9 = staff3.isVerified();
        java.lang.String str10 = staff3.getAccountType();
        java.lang.String str11 = staff3.getEmail();
        staff3.setVerified(true);
        double double14 = staff3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "staff" + "'", str7, "staff");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "staff" + "'", str8, "staff");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "staff" + "'", str10, "staff");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 40.0d + "'", double14 == 40.0d);
    }

    @Test
    public void test12939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12939");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        boolean boolean6 = staff3.isVerified();
        staff3.login("", "");
        double double10 = staff3.getHourlyRate();
        java.lang.String str11 = staff3.getPassword();
        staff3.logout();
        staff3.logout();
        java.lang.Class<?> wildcardClass14 = staff3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 40.0d + "'", double10 == 40.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test12940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12940");
        model.Staff staff3 = new model.Staff("", "staff", "");
        staff3.viewProfile();
        boolean boolean5 = staff3.isVerified();
        staff3.setVerified(false);
        staff3.logout();
        java.lang.String str9 = staff3.getPassword();
        boolean boolean10 = staff3.isVerified();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "staff" + "'", str9, "staff");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test12941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12941");
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
        staff3.login("hi!", "staff");
        staff3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "staff" + "'", str8, "staff");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 40.0d + "'", double13 == 40.0d);
    }

    @Test
    public void test12942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12942");
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
        java.lang.Class<?> wildcardClass16 = staff3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "staff" + "'", str10, "staff");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test12943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12943");
        model.Staff staff3 = new model.Staff("", "hi!", "hi!");
        staff3.login("staff", "staff");
        staff3.setVerified(false);
        staff3.login("", "staff");
    }

    @Test
    public void test12944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12944");
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
        staff3.setVerified(true);
        java.lang.String str19 = staff3.getAccountType();
        staff3.login("hi!", "");
        java.lang.String str23 = staff3.getID();
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
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "staff" + "'", str19, "staff");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
    }

    @Test
    public void test12945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12945");
        model.Staff staff3 = new model.Staff("hi!", "", "hi!");
        staff3.setVerified(false);
        java.lang.String str6 = staff3.getPassword();
        java.lang.String str7 = staff3.getAccountType();
        java.lang.String str8 = staff3.getEmail();
        staff3.setVerified(false);
        java.lang.String str11 = staff3.getPassword();
        java.lang.String str12 = staff3.getAccountType();
        staff3.viewProfile();
        staff3.viewProfile();
        java.lang.String str15 = staff3.getAccountType();
        java.lang.String str16 = staff3.getID();
        staff3.login("hi!", "staff");
        java.lang.Class<?> wildcardClass20 = staff3.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "staff" + "'", str7, "staff");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "staff" + "'", str12, "staff");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "staff" + "'", str15, "staff");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test12946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12946");
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
        java.lang.String str18 = staff3.getPassword();
        java.lang.String str19 = staff3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 40.0d + "'", double11 == 40.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test12947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12947");
        model.Staff staff3 = new model.Staff("hi!", "staff", "");
        java.lang.String str4 = staff3.getPassword();
        staff3.setVerified(false);
        boolean boolean7 = staff3.isVerified();
        staff3.setVerified(false);
        java.lang.String str10 = staff3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "staff" + "'", str4, "staff");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "staff" + "'", str10, "staff");
    }

    @Test
    public void test12948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12948");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        boolean boolean5 = staff3.isVerified();
        java.lang.String str6 = staff3.getID();
        boolean boolean7 = staff3.isVerified();
        staff3.logout();
        java.lang.String str9 = staff3.getID();
        staff3.setVerified(true);
        staff3.login("hi!", "hi!");
        java.lang.String str15 = staff3.getID();
        staff3.logout();
        java.lang.String str17 = staff3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "staff" + "'", str17, "staff");
    }

    @Test
    public void test12949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12949");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        boolean boolean5 = staff3.isVerified();
        java.lang.String str6 = staff3.getID();
        java.lang.String str7 = staff3.getID();
        double double8 = staff3.getHourlyRate();
        staff3.logout();
        staff3.logout();
        staff3.setVerified(true);
        java.lang.String str13 = staff3.getID();
        java.lang.String str14 = staff3.getEmail();
        staff3.setVerified(false);
        boolean boolean17 = staff3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 40.0d + "'", double8 == 40.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test12950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12950");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        double double6 = staff3.getHourlyRate();
        java.lang.String str7 = staff3.getPassword();
        staff3.login("", "staff");
        java.lang.String str11 = staff3.getPassword();
        staff3.logout();
        double double13 = staff3.getHourlyRate();
        staff3.logout();
        java.lang.String str15 = staff3.getEmail();
        boolean boolean16 = staff3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 40.0d + "'", double6 == 40.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 40.0d + "'", double13 == 40.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test12951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12951");
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
        staff3.logout();
        java.lang.String str17 = staff3.getEmail();
        staff3.setVerified(false);
        java.lang.String str20 = staff3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 40.0d + "'", double13 == 40.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test12952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12952");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        double double6 = staff3.getHourlyRate();
        staff3.logout();
        staff3.setVerified(true);
        java.lang.String str10 = staff3.getEmail();
        java.lang.String str11 = staff3.getID();
        java.lang.String str12 = staff3.getEmail();
        staff3.logout();
        java.lang.Class<?> wildcardClass14 = staff3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 40.0d + "'", double6 == 40.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test12953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12953");
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
        staff3.login("", "");
        java.lang.String str23 = staff3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
    }

    @Test
    public void test12954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12954");
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
        java.lang.String str19 = staff3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "staff" + "'", str8, "staff");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 40.0d + "'", double13 == 40.0d);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "staff" + "'", str19, "staff");
    }

    @Test
    public void test12955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12955");
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
        staff3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test12956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12956");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        boolean boolean5 = staff3.isVerified();
        java.lang.String str6 = staff3.getAccountType();
        java.lang.String str7 = staff3.getAccountType();
        java.lang.String str8 = staff3.getEmail();
        staff3.logout();
        java.lang.String str10 = staff3.getEmail();
        java.lang.String str11 = staff3.getEmail();
        java.lang.String str12 = staff3.getID();
        java.lang.String str13 = staff3.getEmail();
        boolean boolean14 = staff3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "staff" + "'", str6, "staff");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "staff" + "'", str7, "staff");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test12957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12957");
        model.Staff staff3 = new model.Staff("hi!", "", "hi!");
        staff3.logout();
        boolean boolean5 = staff3.isVerified();
        staff3.setVerified(true);
        staff3.viewProfile();
        java.lang.String str9 = staff3.getID();
        boolean boolean10 = staff3.isVerified();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test12958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12958");
        model.Staff staff3 = new model.Staff("hi!", "", "hi!");
        java.lang.String str4 = staff3.getAccountType();
        java.lang.String str5 = staff3.getID();
        staff3.login("", "staff");
        double double9 = staff3.getHourlyRate();
        staff3.login("hi!", "");
        double double13 = staff3.getHourlyRate();
        java.lang.String str14 = staff3.getID();
        staff3.setVerified(true);
        double double17 = staff3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "staff" + "'", str4, "staff");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 40.0d + "'", double9 == 40.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 40.0d + "'", double13 == 40.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 40.0d + "'", double17 == 40.0d);
    }

    @Test
    public void test12959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12959");
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
        java.lang.String str18 = staff3.getPassword();
        staff3.login("hi!", "");
        java.lang.String str22 = staff3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "staff" + "'", str10, "staff");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 40.0d + "'", double15 == 40.0d);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test12960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12960");
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
        double double19 = staff3.getHourlyRate();
        java.lang.String str20 = staff3.getPassword();
        java.lang.String str21 = staff3.getPassword();
        java.lang.String str22 = staff3.getPassword();
        boolean boolean23 = staff3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 40.0d + "'", double19 == 40.0d);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test12961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12961");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        staff3.setVerified(false);
        boolean boolean7 = staff3.isVerified();
        boolean boolean8 = staff3.isVerified();
        boolean boolean9 = staff3.isVerified();
        java.lang.String str10 = staff3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "staff" + "'", str10, "staff");
    }

    @Test
    public void test12962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12962");
        model.Staff staff3 = new model.Staff("hi!", "hi!", "");
        staff3.viewProfile();
        java.lang.String str5 = staff3.getAccountType();
        java.lang.String str6 = staff3.getEmail();
        staff3.login("", "hi!");
        staff3.viewProfile();
        java.lang.String str11 = staff3.getPassword();
        java.lang.String str12 = staff3.getPassword();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test12963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12963");
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
        java.lang.String str15 = staff3.getPassword();
        java.lang.String str16 = staff3.getPassword();
        double double17 = staff3.getHourlyRate();
        staff3.setVerified(false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 40.0d + "'", double17 == 40.0d);
    }

    @Test
    public void test12964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12964");
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
        staff3.logout();
        java.lang.String str17 = staff3.getID();
        staff3.logout();
        staff3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "staff" + "'", str13, "staff");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "staff" + "'", str14, "staff");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test12965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12965");
        model.Staff staff3 = new model.Staff("hi!", "hi!", "");
        staff3.logout();
        java.lang.String str5 = staff3.getEmail();
        staff3.logout();
        java.lang.String str7 = staff3.getEmail();
        java.lang.String str8 = staff3.getAccountType();
        java.lang.String str9 = staff3.getID();
        boolean boolean10 = staff3.isVerified();
        java.lang.String str11 = staff3.getID();
        java.lang.Class<?> wildcardClass12 = staff3.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "staff" + "'", str8, "staff");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test12966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12966");
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
        staff3.viewProfile();
        java.lang.String str14 = staff3.getID();
        staff3.viewProfile();
        staff3.viewProfile();
        boolean boolean17 = staff3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "staff" + "'", str11, "staff");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test12967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12967");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        boolean boolean6 = staff3.isVerified();
        staff3.viewProfile();
        staff3.viewProfile();
        staff3.logout();
        staff3.viewProfile();
        staff3.logout();
        staff3.setVerified(false);
        staff3.logout();
        java.lang.String str15 = staff3.getID();
        staff3.setVerified(true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test12968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12968");
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
        java.lang.String str16 = staff3.getAccountType();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 40.0d + "'", double7 == 40.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "staff" + "'", str15, "staff");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "staff" + "'", str16, "staff");
    }

    @Test
    public void test12969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12969");
        model.Staff staff3 = new model.Staff("hi!", "", "hi!");
        staff3.setVerified(false);
        java.lang.String str6 = staff3.getPassword();
        java.lang.String str7 = staff3.getAccountType();
        java.lang.String str8 = staff3.getEmail();
        staff3.setVerified(false);
        java.lang.String str11 = staff3.getEmail();
        staff3.setVerified(false);
        double double14 = staff3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "staff" + "'", str7, "staff");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 40.0d + "'", double14 == 40.0d);
    }

    @Test
    public void test12970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12970");
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
        java.lang.String str22 = staff3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "staff" + "'", str22, "staff");
    }

    @Test
    public void test12971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12971");
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
        staff3.setVerified(false);
        staff3.login("staff", "hi!");
        java.lang.String str23 = staff3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 40.0d + "'", double16 == 40.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 40.0d + "'", double17 == 40.0d);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "staff" + "'", str23, "staff");
    }

    @Test
    public void test12972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12972");
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
        java.lang.Class<?> wildcardClass15 = staff3.getClass();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test12973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12973");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        staff3.login("", "");
        staff3.viewProfile();
        staff3.viewProfile();
        staff3.login("", "");
        staff3.logout();
        java.lang.String str13 = staff3.getEmail();
        boolean boolean14 = staff3.isVerified();
        staff3.login("staff", "hi!");
        staff3.logout();
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test12974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12974");
        model.Staff staff3 = new model.Staff("hi!", "staff", "");
        staff3.logout();
        staff3.logout();
        java.lang.Class<?> wildcardClass6 = staff3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test12975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12975");
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
        boolean boolean15 = staff3.isVerified();
        java.lang.String str16 = staff3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 40.0d + "'", double6 == 40.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "staff" + "'", str11, "staff");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "staff" + "'", str14, "staff");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test12976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12976");
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
        java.lang.String str16 = staff3.getAccountType();
        java.lang.String str17 = staff3.getEmail();
        java.lang.String str18 = staff3.getID();
        java.lang.String str19 = staff3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 40.0d + "'", double13 == 40.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "staff" + "'", str16, "staff");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "staff" + "'", str19, "staff");
    }

    @Test
    public void test12977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12977");
        model.Staff staff3 = new model.Staff("hi!", "", "hi!");
        staff3.logout();
        staff3.login("hi!", "hi!");
        double double8 = staff3.getHourlyRate();
        boolean boolean9 = staff3.isVerified();
        staff3.setVerified(false);
        java.lang.String str12 = staff3.getPassword();
        java.lang.String str13 = staff3.getPassword();
        staff3.setVerified(false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 40.0d + "'", double8 == 40.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test12978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12978");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        double double6 = staff3.getHourlyRate();
        java.lang.String str7 = staff3.getPassword();
        java.lang.String str8 = staff3.getPassword();
        staff3.viewProfile();
        boolean boolean10 = staff3.isVerified();
        java.lang.String str11 = staff3.getPassword();
        staff3.viewProfile();
        staff3.setVerified(false);
        staff3.logout();
        staff3.login("hi!", "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 40.0d + "'", double6 == 40.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test12979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12979");
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
        boolean boolean22 = staff3.isVerified();
        java.lang.String str23 = staff3.getAccountType();
        double double24 = staff3.getHourlyRate();
        double double25 = staff3.getHourlyRate();
        double double26 = staff3.getHourlyRate();
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
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "staff" + "'", str23, "staff");
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 40.0d + "'", double24 == 40.0d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 40.0d + "'", double25 == 40.0d);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 40.0d + "'", double26 == 40.0d);
    }

    @Test
    public void test12980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12980");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        boolean boolean5 = staff3.isVerified();
        java.lang.String str6 = staff3.getID();
        java.lang.String str7 = staff3.getID();
        java.lang.String str8 = staff3.getID();
        java.lang.String str9 = staff3.getEmail();
        java.lang.String str10 = staff3.getPassword();
        boolean boolean11 = staff3.isVerified();
        java.lang.String str12 = staff3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test12981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12981");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        boolean boolean5 = staff3.isVerified();
        java.lang.String str6 = staff3.getAccountType();
        staff3.logout();
        java.lang.String str8 = staff3.getID();
        staff3.login("", "");
        java.lang.String str12 = staff3.getID();
        boolean boolean13 = staff3.isVerified();
        staff3.login("hi!", "");
        staff3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "staff" + "'", str6, "staff");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test12982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12982");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getEmail();
        java.lang.String str6 = staff3.getAccountType();
        java.lang.String str7 = staff3.getAccountType();
        java.lang.String str8 = staff3.getID();
        staff3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "staff" + "'", str6, "staff");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "staff" + "'", str7, "staff");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test12983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12983");
        model.Staff staff3 = new model.Staff("hi!", "hi!", "");
        staff3.logout();
        java.lang.String str5 = staff3.getEmail();
        double double6 = staff3.getHourlyRate();
        staff3.setVerified(false);
        staff3.login("", "");
        java.lang.String str12 = staff3.getEmail();
        staff3.viewProfile();
        staff3.viewProfile();
        java.lang.String str15 = staff3.getAccountType();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 40.0d + "'", double6 == 40.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "staff" + "'", str15, "staff");
    }

    @Test
    public void test12984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12984");
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
        staff3.setVerified(true);
        double double18 = staff3.getHourlyRate();
        java.lang.String str19 = staff3.getAccountType();
        double double20 = staff3.getHourlyRate();
        staff3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "staff" + "'", str10, "staff");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 40.0d + "'", double18 == 40.0d);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "staff" + "'", str19, "staff");
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 40.0d + "'", double20 == 40.0d);
    }

    @Test
    public void test12985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12985");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        boolean boolean5 = staff3.isVerified();
        java.lang.String str6 = staff3.getID();
        staff3.setVerified(false);
        java.lang.String str9 = staff3.getID();
        staff3.setVerified(false);
        boolean boolean12 = staff3.isVerified();
        java.lang.String str13 = staff3.getEmail();
        staff3.logout();
        staff3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test12986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12986");
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
        java.lang.String str17 = staff3.getAccountType();
        java.lang.String str18 = staff3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 40.0d + "'", double14 == 40.0d);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "staff" + "'", str17, "staff");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test12987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12987");
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
        staff3.logout();
        staff3.login("", "hi!");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 40.0d + "'", double8 == 40.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "staff" + "'", str10, "staff");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "staff" + "'", str11, "staff");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 40.0d + "'", double12 == 40.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 40.0d + "'", double14 == 40.0d);
    }

    @Test
    public void test12988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12988");
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
        staff3.logout();
        java.lang.String str23 = staff3.getID();
        java.lang.String str24 = staff3.getAccountType();
        java.lang.String str25 = staff3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "staff" + "'", str13, "staff");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "staff" + "'", str24, "staff");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
    }

    @Test
    public void test12989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12989");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        staff3.login("", "");
        double double7 = staff3.getHourlyRate();
        staff3.login("staff", "staff");
        boolean boolean11 = staff3.isVerified();
        java.lang.String str12 = staff3.getID();
        staff3.login("", "staff");
        staff3.setVerified(false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 40.0d + "'", double7 == 40.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test12990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12990");
        model.Staff staff3 = new model.Staff("hi!", "", "hi!");
        staff3.setVerified(false);
        staff3.viewProfile();
        java.lang.String str7 = staff3.getEmail();
        java.lang.String str8 = staff3.getID();
        staff3.login("hi!", "staff");
        staff3.setVerified(true);
        boolean boolean14 = staff3.isVerified();
        staff3.logout();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test12991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12991");
        model.Staff staff3 = new model.Staff("hi!", "", "hi!");
        java.lang.String str4 = staff3.getAccountType();
        java.lang.String str5 = staff3.getEmail();
        double double6 = staff3.getHourlyRate();
        staff3.viewProfile();
        java.lang.String str8 = staff3.getPassword();
        staff3.setVerified(true);
        java.lang.String str11 = staff3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "staff" + "'", str4, "staff");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 40.0d + "'", double6 == 40.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test12992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12992");
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
        java.lang.String str13 = staff3.getID();
        java.lang.String str14 = staff3.getPassword();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test12993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12993");
        model.Staff staff3 = new model.Staff("hi!", "", "hi!");
        staff3.setVerified(false);
        java.lang.String str6 = staff3.getEmail();
        java.lang.String str7 = staff3.getAccountType();
        staff3.viewProfile();
        staff3.viewProfile();
        staff3.setVerified(true);
        staff3.login("", "");
        java.lang.String str15 = staff3.getID();
        java.lang.String str16 = staff3.getAccountType();
        double double17 = staff3.getHourlyRate();
        staff3.login("staff", "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "staff" + "'", str7, "staff");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "staff" + "'", str16, "staff");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 40.0d + "'", double17 == 40.0d);
    }

    @Test
    public void test12994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12994");
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
        java.lang.String str13 = staff3.getEmail();
        java.lang.String str14 = staff3.getPassword();
        staff3.viewProfile();
        double double16 = staff3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 40.0d + "'", double7 == 40.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "staff" + "'", str10, "staff");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 40.0d + "'", double16 == 40.0d);
    }

    @Test
    public void test12995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12995");
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
        java.lang.String str16 = staff3.getID();
        java.lang.Class<?> wildcardClass17 = staff3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test12996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12996");
        model.Staff staff3 = new model.Staff("", "staff", "staff");
        double double4 = staff3.getHourlyRate();
        staff3.logout();
        staff3.setVerified(false);
        java.lang.String str8 = staff3.getEmail();
        java.lang.String str9 = staff3.getEmail();
        java.lang.String str10 = staff3.getAccountType();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 40.0d + "'", double4 == 40.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "staff" + "'", str10, "staff");
    }

    @Test
    public void test12997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12997");
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
        java.lang.String str14 = staff3.getID();
        java.lang.Class<?> wildcardClass15 = staff3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "staff" + "'", str6, "staff");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test12998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12998");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        boolean boolean5 = staff3.isVerified();
        java.lang.String str6 = staff3.getID();
        staff3.setVerified(false);
        java.lang.String str9 = staff3.getID();
        staff3.setVerified(false);
        staff3.logout();
        staff3.setVerified(false);
        double double15 = staff3.getHourlyRate();
        staff3.login("hi!", "hi!");
        java.lang.String str19 = staff3.getAccountType();
        java.lang.String str20 = staff3.getAccountType();
        staff3.logout();
        java.lang.String str22 = staff3.getAccountType();
        java.lang.String str23 = staff3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 40.0d + "'", double15 == 40.0d);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "staff" + "'", str19, "staff");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "staff" + "'", str20, "staff");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "staff" + "'", str22, "staff");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "staff" + "'", str23, "staff");
    }

    @Test
    public void test12999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12999");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        boolean boolean5 = staff3.isVerified();
        java.lang.String str6 = staff3.getID();
        boolean boolean7 = staff3.isVerified();
        java.lang.String str8 = staff3.getEmail();
        staff3.logout();
        java.lang.String str10 = staff3.getEmail();
        java.lang.String str11 = staff3.getAccountType();
        staff3.setVerified(false);
        boolean boolean14 = staff3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "staff" + "'", str11, "staff");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test13000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test13000");
        model.Staff staff3 = new model.Staff("hi!", "staff", "");
        java.lang.String str4 = staff3.getPassword();
        staff3.logout();
        staff3.setVerified(true);
        java.lang.String str8 = staff3.getEmail();
        staff3.login("staff", "");
        staff3.login("", "");
        staff3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "staff" + "'", str4, "staff");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }
}

