import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest31 {

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
    public void test15501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15501");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        java.lang.String str4 = chief2.getAccountType();
        java.lang.String str5 = chief2.getID();
        chief2.viewProfile();
        double double7 = chief2.getHourlyRate();
        boolean boolean8 = chief2.isVerified();
        double double9 = chief2.getHourlyRate();
        boolean boolean10 = chief2.isVerified();
        java.lang.String str11 = chief2.getID();
        java.lang.String str12 = chief2.getPassword();
        chief2.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "chief" + "'", str11, "chief");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test15502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15502");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.viewProfile();
        java.lang.String str4 = chief2.getPassword();
        chief2.login("", "");
        chief2.setVerified(true);
        chief2.logout();
        chief2.viewProfile();
        java.lang.String str12 = chief2.getPassword();
        chief2.viewProfile();
        chief2.viewProfile();
        java.lang.String str15 = chief2.getEmail();
        chief2.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test15503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15503");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.viewProfile();
        java.lang.String str4 = chief2.getPassword();
        chief2.logout();
        chief2.login("chief", "chief");
        chief2.setVerified(true);
        chief2.viewProfile();
        java.lang.String str12 = chief2.getEmail();
        double double13 = chief2.getHourlyRate();
        boolean boolean14 = chief2.isVerified();
        chief2.viewProfile();
        boolean boolean16 = chief2.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test15504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15504");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        java.lang.String str4 = chief2.getAccountType();
        java.lang.String str5 = chief2.getPassword();
        java.lang.String str6 = chief2.getPassword();
        chief2.setVerified(false);
        java.lang.String str9 = chief2.getPassword();
        boolean boolean10 = chief2.isVerified();
        double double11 = chief2.getHourlyRate();
        double double12 = chief2.getHourlyRate();
        chief2.logout();
        java.lang.String str14 = chief2.getPassword();
        java.lang.String str15 = chief2.getAccountType();
        double double16 = chief2.getHourlyRate();
        chief2.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "chief" + "'", str15, "chief");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
    }

    @Test
    public void test15505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15505");
        model.Chief chief2 = new model.Chief("", "chief");
        chief2.setVerified(false);
        java.lang.String str5 = chief2.getPassword();
        java.lang.String str6 = chief2.getAccountType();
        chief2.logout();
        chief2.viewProfile();
        java.lang.String str9 = chief2.getPassword();
        java.lang.String str10 = chief2.getID();
        java.lang.String str11 = chief2.getID();
        java.lang.String str12 = chief2.getID();
        java.lang.String str13 = chief2.getID();
        double double14 = chief2.getHourlyRate();
        java.lang.Class<?> wildcardClass15 = chief2.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "chief" + "'", str6, "chief");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "chief" + "'", str9, "chief");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "chief" + "'", str10, "chief");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "chief" + "'", str11, "chief");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "chief" + "'", str12, "chief");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "chief" + "'", str13, "chief");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test15506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15506");
        model.Chief chief2 = new model.Chief("", "chief");
        chief2.setVerified(false);
        chief2.logout();
        java.lang.String str6 = chief2.getPassword();
        chief2.logout();
        java.lang.String str8 = chief2.getEmail();
        java.lang.String str9 = chief2.getPassword();
        java.lang.String str10 = chief2.getPassword();
        java.lang.String str11 = chief2.getAccountType();
        boolean boolean12 = chief2.isVerified();
        chief2.viewProfile();
        java.lang.String str14 = chief2.getID();
        double double15 = chief2.getHourlyRate();
        chief2.logout();
        java.lang.String str17 = chief2.getAccountType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "chief" + "'", str6, "chief");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "chief" + "'", str9, "chief");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "chief" + "'", str10, "chief");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "chief" + "'", str11, "chief");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "chief" + "'", str14, "chief");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "chief" + "'", str17, "chief");
    }

    @Test
    public void test15507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15507");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        java.lang.String str4 = chief2.getAccountType();
        java.lang.String str5 = chief2.getID();
        double double6 = chief2.getHourlyRate();
        java.lang.String str7 = chief2.getEmail();
        chief2.logout();
        java.lang.String str9 = chief2.getID();
        chief2.login("hi!", "chief");
        chief2.logout();
        chief2.viewProfile();
        chief2.login("hi!", "chief");
        boolean boolean18 = chief2.isVerified();
        chief2.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "chief" + "'", str9, "chief");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test15508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15508");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        java.lang.String str4 = chief2.getAccountType();
        java.lang.String str5 = chief2.getPassword();
        java.lang.String str6 = chief2.getEmail();
        boolean boolean7 = chief2.isVerified();
        chief2.setVerified(true);
        java.lang.String str10 = chief2.getPassword();
        double double11 = chief2.getHourlyRate();
        java.lang.String str12 = chief2.getEmail();
        java.lang.String str13 = chief2.getEmail();
        chief2.login("hi!", "chief");
        chief2.login("", "hi!");
        chief2.logout();
        chief2.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test15509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15509");
        model.Chief chief2 = new model.Chief("", "chief");
        chief2.setVerified(false);
        chief2.logout();
        java.lang.String str6 = chief2.getPassword();
        java.lang.String str7 = chief2.getPassword();
        java.lang.String str8 = chief2.getAccountType();
        chief2.login("hi!", "chief");
        java.lang.String str12 = chief2.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "chief" + "'", str6, "chief");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "chief" + "'", str7, "chief");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "chief" + "'", str8, "chief");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test15510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15510");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        java.lang.String str4 = chief2.getAccountType();
        java.lang.String str5 = chief2.getID();
        chief2.viewProfile();
        double double7 = chief2.getHourlyRate();
        chief2.logout();
        boolean boolean9 = chief2.isVerified();
        chief2.viewProfile();
        chief2.login("hi!", "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test15511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15511");
        model.Chief chief2 = new model.Chief("hi!", "");
        java.lang.String str3 = chief2.getAccountType();
        chief2.setVerified(true);
        java.lang.String str6 = chief2.getEmail();
        chief2.viewProfile();
        chief2.logout();
        java.lang.String str9 = chief2.getPassword();
        java.lang.String str10 = chief2.getID();
        chief2.logout();
        java.lang.String str12 = chief2.getID();
        java.lang.String str13 = chief2.getID();
        java.lang.String str14 = chief2.getID();
        boolean boolean15 = chief2.isVerified();
        boolean boolean16 = chief2.isVerified();
        chief2.viewProfile();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "chief" + "'", str3, "chief");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "chief" + "'", str10, "chief");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "chief" + "'", str12, "chief");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "chief" + "'", str13, "chief");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "chief" + "'", str14, "chief");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test15512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15512");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        java.lang.String str4 = chief2.getAccountType();
        java.lang.String str5 = chief2.getID();
        double double6 = chief2.getHourlyRate();
        java.lang.String str7 = chief2.getID();
        boolean boolean8 = chief2.isVerified();
        java.lang.String str9 = chief2.getID();
        chief2.logout();
        java.lang.String str11 = chief2.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "chief" + "'", str7, "chief");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "chief" + "'", str9, "chief");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test15513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15513");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        chief2.logout();
        java.lang.String str5 = chief2.getAccountType();
        chief2.login("hi!", "chief");
        chief2.login("hi!", "chief");
        java.lang.String str12 = chief2.getAccountType();
        java.lang.String str13 = chief2.getPassword();
        java.lang.String str14 = chief2.getAccountType();
        java.lang.String str15 = chief2.getPassword();
        java.lang.String str16 = chief2.getPassword();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "chief" + "'", str12, "chief");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "chief" + "'", str14, "chief");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test15514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15514");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        java.lang.String str4 = chief2.getID();
        java.lang.String str5 = chief2.getID();
        chief2.viewProfile();
        chief2.viewProfile();
        java.lang.String str8 = chief2.getPassword();
        chief2.setVerified(false);
        chief2.setVerified(true);
        boolean boolean13 = chief2.isVerified();
        java.lang.String str14 = chief2.getAccountType();
        double double15 = chief2.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "chief" + "'", str14, "chief");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test15515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15515");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        chief2.viewProfile();
        chief2.setVerified(false);
        java.lang.String str7 = chief2.getID();
        java.lang.String str8 = chief2.getID();
        boolean boolean9 = chief2.isVerified();
        java.lang.String str10 = chief2.getID();
        chief2.login("hi!", "hi!");
        java.lang.String str14 = chief2.getEmail();
        java.lang.String str15 = chief2.getPassword();
        chief2.logout();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "chief" + "'", str7, "chief");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "chief" + "'", str8, "chief");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "chief" + "'", str10, "chief");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test15516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15516");
        model.Chief chief2 = new model.Chief("hi!", "");
        java.lang.String str3 = chief2.getID();
        chief2.logout();
        java.lang.String str5 = chief2.getID();
        java.lang.String str6 = chief2.getEmail();
        chief2.login("hi!", "chief");
        double double10 = chief2.getHourlyRate();
        double double11 = chief2.getHourlyRate();
        java.lang.String str12 = chief2.getAccountType();
        java.lang.String str13 = chief2.getAccountType();
        java.lang.String str14 = chief2.getAccountType();
        java.lang.String str15 = chief2.getAccountType();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "chief" + "'", str3, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "chief" + "'", str12, "chief");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "chief" + "'", str13, "chief");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "chief" + "'", str14, "chief");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "chief" + "'", str15, "chief");
    }

    @Test
    public void test15517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15517");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.viewProfile();
        java.lang.String str4 = chief2.getPassword();
        chief2.setVerified(false);
        chief2.login("", "");
        chief2.setVerified(true);
        java.lang.String str12 = chief2.getID();
        java.lang.String str13 = chief2.getAccountType();
        chief2.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "chief" + "'", str12, "chief");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "chief" + "'", str13, "chief");
    }

    @Test
    public void test15518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15518");
        model.Chief chief2 = new model.Chief("", "chief");
        chief2.setVerified(false);
        chief2.logout();
        java.lang.String str6 = chief2.getPassword();
        java.lang.String str7 = chief2.getPassword();
        java.lang.String str8 = chief2.getEmail();
        chief2.setVerified(true);
        java.lang.String str11 = chief2.getPassword();
        java.lang.String str12 = chief2.getAccountType();
        chief2.logout();
        double double14 = chief2.getHourlyRate();
        chief2.viewProfile();
        boolean boolean16 = chief2.isVerified();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "chief" + "'", str6, "chief");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "chief" + "'", str7, "chief");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "chief" + "'", str11, "chief");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "chief" + "'", str12, "chief");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test15519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15519");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.viewProfile();
        java.lang.String str4 = chief2.getPassword();
        chief2.login("", "");
        double double8 = chief2.getHourlyRate();
        double double9 = chief2.getHourlyRate();
        java.lang.String str10 = chief2.getEmail();
        java.lang.String str11 = chief2.getPassword();
        chief2.viewProfile();
        chief2.viewProfile();
        chief2.logout();
        java.lang.String str15 = chief2.getEmail();
        java.lang.String str16 = chief2.getPassword();
        java.lang.String str17 = chief2.getPassword();
        chief2.viewProfile();
        java.lang.String str19 = chief2.getPassword();
        java.lang.String str20 = chief2.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "chief" + "'", str20, "chief");
    }

    @Test
    public void test15520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15520");
        model.Chief chief2 = new model.Chief("hi!", "");
        java.lang.String str3 = chief2.getID();
        chief2.logout();
        java.lang.String str5 = chief2.getEmail();
        java.lang.String str6 = chief2.getPassword();
        java.lang.String str7 = chief2.getPassword();
        chief2.login("chief", "");
        chief2.viewProfile();
        java.lang.String str12 = chief2.getEmail();
        java.lang.String str13 = chief2.getEmail();
        java.lang.String str14 = chief2.getID();
        java.lang.String str15 = chief2.getAccountType();
        java.lang.String str16 = chief2.getID();
        java.lang.String str17 = chief2.getAccountType();
        chief2.login("", "chief");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "chief" + "'", str3, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "chief" + "'", str14, "chief");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "chief" + "'", str15, "chief");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "chief" + "'", str16, "chief");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "chief" + "'", str17, "chief");
    }

    @Test
    public void test15521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15521");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.setVerified(false);
        chief2.logout();
        java.lang.String str6 = chief2.getEmail();
        chief2.setVerified(false);
        java.lang.String str9 = chief2.getPassword();
        chief2.logout();
        java.lang.String str11 = chief2.getPassword();
        boolean boolean12 = chief2.isVerified();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test15522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15522");
        model.Chief chief2 = new model.Chief("", "chief");
        chief2.setVerified(false);
        java.lang.String str5 = chief2.getPassword();
        java.lang.String str6 = chief2.getAccountType();
        chief2.logout();
        double double8 = chief2.getHourlyRate();
        double double9 = chief2.getHourlyRate();
        java.lang.String str10 = chief2.getEmail();
        java.lang.String str11 = chief2.getAccountType();
        chief2.logout();
        double double13 = chief2.getHourlyRate();
        java.lang.String str14 = chief2.getID();
        java.lang.Class<?> wildcardClass15 = chief2.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "chief" + "'", str6, "chief");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "chief" + "'", str11, "chief");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "chief" + "'", str14, "chief");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test15523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15523");
        model.Chief chief2 = new model.Chief("hi!", "");
        java.lang.String str3 = chief2.getID();
        chief2.setVerified(true);
        java.lang.String str6 = chief2.getPassword();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "chief" + "'", str3, "chief");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test15524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15524");
        model.Chief chief2 = new model.Chief("hi!", "");
        java.lang.String str3 = chief2.getID();
        double double4 = chief2.getHourlyRate();
        chief2.login("hi!", "");
        java.lang.String str8 = chief2.getPassword();
        java.lang.String str9 = chief2.getEmail();
        chief2.login("", "");
        java.lang.String str13 = chief2.getAccountType();
        chief2.logout();
        boolean boolean15 = chief2.isVerified();
        java.lang.String str16 = chief2.getID();
        java.lang.String str17 = chief2.getPassword();
        java.lang.String str18 = chief2.getEmail();
        chief2.login("", "");
        chief2.viewProfile();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "chief" + "'", str3, "chief");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "chief" + "'", str13, "chief");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "chief" + "'", str16, "chief");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test15525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15525");
        model.Chief chief2 = new model.Chief("", "chief");
        java.lang.String str3 = chief2.getPassword();
        chief2.setVerified(false);
        java.lang.String str6 = chief2.getAccountType();
        java.lang.String str7 = chief2.getAccountType();
        chief2.logout();
        java.lang.String str9 = chief2.getEmail();
        java.lang.String str10 = chief2.getEmail();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "chief" + "'", str3, "chief");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "chief" + "'", str6, "chief");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "chief" + "'", str7, "chief");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test15526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15526");
        model.Chief chief2 = new model.Chief("hi!", "");
        java.lang.String str3 = chief2.getID();
        chief2.viewProfile();
        java.lang.String str5 = chief2.getID();
        java.lang.String str6 = chief2.getID();
        java.lang.String str7 = chief2.getPassword();
        java.lang.String str8 = chief2.getAccountType();
        java.lang.String str9 = chief2.getID();
        chief2.login("", "");
        chief2.logout();
        chief2.setVerified(false);
        chief2.login("chief", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "chief" + "'", str3, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "chief" + "'", str6, "chief");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "chief" + "'", str8, "chief");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "chief" + "'", str9, "chief");
    }

    @Test
    public void test15527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15527");
        model.Chief chief2 = new model.Chief("", "chief");
        chief2.setVerified(false);
        chief2.logout();
        java.lang.String str6 = chief2.getPassword();
        chief2.logout();
        java.lang.String str8 = chief2.getID();
        java.lang.String str9 = chief2.getPassword();
        chief2.viewProfile();
        chief2.setVerified(true);
        chief2.viewProfile();
        java.lang.String str14 = chief2.getPassword();
        chief2.login("hi!", "chief");
        java.lang.String str18 = chief2.getAccountType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "chief" + "'", str6, "chief");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "chief" + "'", str8, "chief");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "chief" + "'", str9, "chief");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "chief" + "'", str14, "chief");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "chief" + "'", str18, "chief");
    }

    @Test
    public void test15528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15528");
        model.Chief chief2 = new model.Chief("hi!", "");
        java.lang.String str3 = chief2.getID();
        double double4 = chief2.getHourlyRate();
        chief2.login("hi!", "");
        java.lang.String str8 = chief2.getEmail();
        java.lang.String str9 = chief2.getPassword();
        chief2.logout();
        chief2.setVerified(false);
        double double13 = chief2.getHourlyRate();
        chief2.logout();
        java.lang.String str15 = chief2.getPassword();
        java.lang.String str16 = chief2.getPassword();
        chief2.viewProfile();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "chief" + "'", str3, "chief");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test15529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15529");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        java.lang.String str4 = chief2.getAccountType();
        java.lang.String str5 = chief2.getID();
        double double6 = chief2.getHourlyRate();
        java.lang.String str7 = chief2.getID();
        boolean boolean8 = chief2.isVerified();
        java.lang.String str9 = chief2.getID();
        boolean boolean10 = chief2.isVerified();
        double double11 = chief2.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "chief" + "'", str7, "chief");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "chief" + "'", str9, "chief");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test15530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15530");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        java.lang.String str4 = chief2.getAccountType();
        java.lang.String str5 = chief2.getID();
        chief2.viewProfile();
        chief2.setVerified(true);
        java.lang.String str9 = chief2.getPassword();
        chief2.viewProfile();
        java.lang.String str11 = chief2.getEmail();
        double double12 = chief2.getHourlyRate();
        java.lang.String str13 = chief2.getPassword();
        double double14 = chief2.getHourlyRate();
        chief2.login("hi!", "");
        boolean boolean18 = chief2.isVerified();
        double double19 = chief2.getHourlyRate();
        java.lang.String str20 = chief2.getID();
        java.lang.String str21 = chief2.getEmail();
        chief2.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "chief" + "'", str20, "chief");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
    }

    @Test
    public void test15531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15531");
        model.Chief chief2 = new model.Chief("hi!", "");
        java.lang.String str3 = chief2.getID();
        double double4 = chief2.getHourlyRate();
        chief2.login("hi!", "");
        java.lang.String str8 = chief2.getPassword();
        chief2.setVerified(true);
        chief2.logout();
        java.lang.String str12 = chief2.getID();
        chief2.viewProfile();
        boolean boolean14 = chief2.isVerified();
        java.lang.String str15 = chief2.getAccountType();
        chief2.login("hi!", "");
        java.lang.String str19 = chief2.getEmail();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "chief" + "'", str3, "chief");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "chief" + "'", str12, "chief");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "chief" + "'", str15, "chief");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test15532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15532");
        model.Chief chief2 = new model.Chief("", "chief");
        chief2.setVerified(false);
        chief2.logout();
        java.lang.String str6 = chief2.getPassword();
        chief2.logout();
        java.lang.String str8 = chief2.getID();
        java.lang.String str9 = chief2.getPassword();
        chief2.logout();
        java.lang.String str11 = chief2.getID();
        java.lang.String str12 = chief2.getID();
        double double13 = chief2.getHourlyRate();
        java.lang.String str14 = chief2.getID();
        chief2.login("chief", "hi!");
        java.lang.String str18 = chief2.getAccountType();
        chief2.viewProfile();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "chief" + "'", str6, "chief");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "chief" + "'", str8, "chief");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "chief" + "'", str9, "chief");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "chief" + "'", str11, "chief");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "chief" + "'", str12, "chief");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "chief" + "'", str14, "chief");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "chief" + "'", str18, "chief");
    }

    @Test
    public void test15533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15533");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.setVerified(false);
        chief2.logout();
        java.lang.String str6 = chief2.getAccountType();
        chief2.setVerified(true);
        double double9 = chief2.getHourlyRate();
        java.lang.String str10 = chief2.getPassword();
        java.lang.String str11 = chief2.getEmail();
        java.lang.String str12 = chief2.getEmail();
        chief2.setVerified(false);
        chief2.setVerified(true);
        boolean boolean17 = chief2.isVerified();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "chief" + "'", str6, "chief");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test15534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15534");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        chief2.viewProfile();
        chief2.setVerified(false);
        chief2.logout();
        chief2.logout();
        java.lang.String str9 = chief2.getPassword();
        boolean boolean10 = chief2.isVerified();
        chief2.login("hi!", "");
        chief2.login("hi!", "chief");
        chief2.setVerified(true);
        java.lang.String str19 = chief2.getID();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "chief" + "'", str19, "chief");
    }

    @Test
    public void test15535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15535");
        model.Chief chief2 = new model.Chief("hi!", "");
        java.lang.String str3 = chief2.getAccountType();
        chief2.setVerified(true);
        java.lang.String str6 = chief2.getEmail();
        chief2.viewProfile();
        chief2.logout();
        boolean boolean9 = chief2.isVerified();
        java.lang.String str10 = chief2.getID();
        chief2.logout();
        java.lang.String str12 = chief2.getEmail();
        java.lang.String str13 = chief2.getEmail();
        boolean boolean14 = chief2.isVerified();
        chief2.viewProfile();
        java.lang.String str16 = chief2.getAccountType();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "chief" + "'", str3, "chief");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "chief" + "'", str10, "chief");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "chief" + "'", str16, "chief");
    }

    @Test
    public void test15536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15536");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        java.lang.String str4 = chief2.getAccountType();
        java.lang.String str5 = chief2.getID();
        boolean boolean6 = chief2.isVerified();
        java.lang.String str7 = chief2.getID();
        boolean boolean8 = chief2.isVerified();
        chief2.viewProfile();
        java.lang.String str10 = chief2.getAccountType();
        chief2.logout();
        chief2.login("", "");
        java.lang.String str15 = chief2.getAccountType();
        chief2.setVerified(true);
        java.lang.Class<?> wildcardClass18 = chief2.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "chief" + "'", str7, "chief");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "chief" + "'", str10, "chief");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "chief" + "'", str15, "chief");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test15537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15537");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        chief2.logout();
        double double5 = chief2.getHourlyRate();
        java.lang.String str6 = chief2.getEmail();
        boolean boolean7 = chief2.isVerified();
        double double8 = chief2.getHourlyRate();
        chief2.viewProfile();
        double double10 = chief2.getHourlyRate();
        java.lang.String str11 = chief2.getID();
        chief2.setVerified(false);
        boolean boolean14 = chief2.isVerified();
        chief2.login("chief", "hi!");
        java.lang.String str18 = chief2.getAccountType();
        chief2.viewProfile();
        double double20 = chief2.getHourlyRate();
        java.lang.String str21 = chief2.getEmail();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "chief" + "'", str11, "chief");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "chief" + "'", str18, "chief");
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
    }

    @Test
    public void test15538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15538");
        model.Chief chief2 = new model.Chief("hi!", "");
        java.lang.String str3 = chief2.getID();
        chief2.logout();
        chief2.viewProfile();
        chief2.logout();
        java.lang.String str7 = chief2.getPassword();
        java.lang.String str8 = chief2.getPassword();
        boolean boolean9 = chief2.isVerified();
        java.lang.String str10 = chief2.getPassword();
        java.lang.String str11 = chief2.getPassword();
        java.lang.String str12 = chief2.getPassword();
        java.lang.String str13 = chief2.getAccountType();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "chief" + "'", str3, "chief");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "chief" + "'", str13, "chief");
    }

    @Test
    public void test15539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15539");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.viewProfile();
        java.lang.String str4 = chief2.getPassword();
        chief2.login("", "");
        double double8 = chief2.getHourlyRate();
        boolean boolean9 = chief2.isVerified();
        double double10 = chief2.getHourlyRate();
        chief2.setVerified(true);
        chief2.logout();
        double double14 = chief2.getHourlyRate();
        boolean boolean15 = chief2.isVerified();
        java.lang.String str16 = chief2.getEmail();
        chief2.viewProfile();
        java.lang.Class<?> wildcardClass18 = chief2.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test15540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15540");
        model.Chief chief2 = new model.Chief("", "chief");
        chief2.setVerified(false);
        java.lang.String str5 = chief2.getPassword();
        java.lang.String str6 = chief2.getAccountType();
        chief2.logout();
        double double8 = chief2.getHourlyRate();
        java.lang.String str9 = chief2.getPassword();
        boolean boolean10 = chief2.isVerified();
        boolean boolean11 = chief2.isVerified();
        java.lang.String str12 = chief2.getID();
        double double13 = chief2.getHourlyRate();
        java.lang.Class<?> wildcardClass14 = chief2.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "chief" + "'", str6, "chief");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "chief" + "'", str9, "chief");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "chief" + "'", str12, "chief");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test15541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15541");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.viewProfile();
        java.lang.String str4 = chief2.getPassword();
        chief2.logout();
        boolean boolean6 = chief2.isVerified();
        chief2.setVerified(false);
        chief2.viewProfile();
        java.lang.String str10 = chief2.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "chief" + "'", str10, "chief");
    }

    @Test
    public void test15542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15542");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        java.lang.String str4 = chief2.getID();
        java.lang.String str5 = chief2.getAccountType();
        java.lang.String str6 = chief2.getAccountType();
        chief2.login("hi!", "");
        chief2.setVerified(false);
        boolean boolean12 = chief2.isVerified();
        chief2.viewProfile();
        double double14 = chief2.getHourlyRate();
        chief2.viewProfile();
        double double16 = chief2.getHourlyRate();
        chief2.setVerified(false);
        chief2.login("", "chief");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "chief" + "'", str6, "chief");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
    }

    @Test
    public void test15543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15543");
        model.Chief chief2 = new model.Chief("hi!", "");
        java.lang.String str3 = chief2.getID();
        chief2.viewProfile();
        java.lang.String str5 = chief2.getID();
        java.lang.String str6 = chief2.getID();
        java.lang.String str7 = chief2.getPassword();
        java.lang.String str8 = chief2.getAccountType();
        boolean boolean9 = chief2.isVerified();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "chief" + "'", str3, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "chief" + "'", str6, "chief");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "chief" + "'", str8, "chief");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test15544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15544");
        model.Chief chief2 = new model.Chief("", "chief");
        chief2.setVerified(false);
        java.lang.String str5 = chief2.getPassword();
        chief2.viewProfile();
        java.lang.String str7 = chief2.getAccountType();
        java.lang.String str8 = chief2.getEmail();
        java.lang.String str9 = chief2.getEmail();
        java.lang.String str10 = chief2.getID();
        java.lang.String str11 = chief2.getID();
        java.lang.String str12 = chief2.getEmail();
        chief2.viewProfile();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "chief" + "'", str7, "chief");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "chief" + "'", str10, "chief");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "chief" + "'", str11, "chief");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test15545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15545");
        model.Chief chief2 = new model.Chief("hi!", "");
        java.lang.String str3 = chief2.getID();
        java.lang.String str4 = chief2.getPassword();
        java.lang.String str5 = chief2.getPassword();
        java.lang.String str6 = chief2.getEmail();
        chief2.login("", "chief");
        chief2.login("chief", "hi!");
        chief2.login("hi!", "");
        double double16 = chief2.getHourlyRate();
        java.lang.String str17 = chief2.getPassword();
        double double18 = chief2.getHourlyRate();
        chief2.logout();
        java.lang.String str20 = chief2.getEmail();
        double double21 = chief2.getHourlyRate();
        java.lang.String str22 = chief2.getPassword();
        chief2.setVerified(true);
        chief2.login("", "hi!");
        java.lang.String str28 = chief2.getAccountType();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "chief" + "'", str3, "chief");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "chief" + "'", str28, "chief");
    }

    @Test
    public void test15546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15546");
        model.Chief chief2 = new model.Chief("hi!", "");
        java.lang.String str3 = chief2.getID();
        chief2.viewProfile();
        chief2.login("", "");
        double double8 = chief2.getHourlyRate();
        chief2.login("hi!", "");
        double double12 = chief2.getHourlyRate();
        chief2.login("chief", "chief");
        chief2.viewProfile();
        java.lang.String str17 = chief2.getEmail();
        chief2.setVerified(true);
        java.lang.String str20 = chief2.getAccountType();
        double double21 = chief2.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "chief" + "'", str3, "chief");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "chief" + "'", str20, "chief");
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
    }

    @Test
    public void test15547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15547");
        model.Chief chief2 = new model.Chief("hi!", "");
        java.lang.String str3 = chief2.getID();
        java.lang.String str4 = chief2.getPassword();
        java.lang.String str5 = chief2.getPassword();
        boolean boolean6 = chief2.isVerified();
        double double7 = chief2.getHourlyRate();
        chief2.viewProfile();
        chief2.logout();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "chief" + "'", str3, "chief");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test15548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15548");
        model.Chief chief2 = new model.Chief("hi!", "");
        java.lang.String str3 = chief2.getID();
        double double4 = chief2.getHourlyRate();
        chief2.login("hi!", "");
        java.lang.String str8 = chief2.getPassword();
        java.lang.String str9 = chief2.getID();
        java.lang.String str10 = chief2.getAccountType();
        boolean boolean11 = chief2.isVerified();
        java.lang.String str12 = chief2.getID();
        chief2.viewProfile();
        chief2.login("chief", "hi!");
        java.lang.String str17 = chief2.getID();
        java.lang.String str18 = chief2.getPassword();
        chief2.viewProfile();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "chief" + "'", str3, "chief");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "chief" + "'", str9, "chief");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "chief" + "'", str10, "chief");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "chief" + "'", str12, "chief");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "chief" + "'", str17, "chief");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test15549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15549");
        model.Chief chief2 = new model.Chief("hi!", "");
        java.lang.String str3 = chief2.getID();
        java.lang.String str4 = chief2.getPassword();
        java.lang.String str5 = chief2.getPassword();
        java.lang.String str6 = chief2.getEmail();
        java.lang.String str7 = chief2.getID();
        chief2.logout();
        java.lang.String str9 = chief2.getAccountType();
        chief2.setVerified(true);
        chief2.logout();
        chief2.logout();
        java.lang.String str14 = chief2.getEmail();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "chief" + "'", str3, "chief");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "chief" + "'", str7, "chief");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "chief" + "'", str9, "chief");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test15550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15550");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        chief2.viewProfile();
        chief2.setVerified(false);
        chief2.logout();
        chief2.logout();
        java.lang.String str9 = chief2.getID();
        chief2.setVerified(true);
        java.lang.String str12 = chief2.getAccountType();
        java.lang.String str13 = chief2.getEmail();
        java.lang.String str14 = chief2.getPassword();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "chief" + "'", str9, "chief");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "chief" + "'", str12, "chief");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test15551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15551");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        java.lang.String str4 = chief2.getAccountType();
        java.lang.String str5 = chief2.getID();
        double double6 = chief2.getHourlyRate();
        java.lang.String str7 = chief2.getID();
        boolean boolean8 = chief2.isVerified();
        java.lang.String str9 = chief2.getPassword();
        double double10 = chief2.getHourlyRate();
        java.lang.String str11 = chief2.getID();
        chief2.setVerified(true);
        java.lang.String str14 = chief2.getAccountType();
        chief2.login("chief", "");
        chief2.setVerified(false);
        chief2.setVerified(true);
        chief2.login("", "");
        double double25 = chief2.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "chief" + "'", str7, "chief");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "chief" + "'", str11, "chief");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "chief" + "'", str14, "chief");
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
    }

    @Test
    public void test15552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15552");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        java.lang.String str4 = chief2.getAccountType();
        java.lang.String str5 = chief2.getPassword();
        java.lang.String str6 = chief2.getEmail();
        boolean boolean7 = chief2.isVerified();
        chief2.setVerified(true);
        java.lang.String str10 = chief2.getPassword();
        chief2.setVerified(true);
        chief2.login("", "hi!");
        java.lang.String str16 = chief2.getAccountType();
        java.lang.String str17 = chief2.getID();
        chief2.viewProfile();
        chief2.setVerified(false);
        chief2.login("chief", "chief");
        java.lang.String str24 = chief2.getPassword();
        chief2.setVerified(false);
        boolean boolean27 = chief2.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "chief" + "'", str16, "chief");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "chief" + "'", str17, "chief");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test15553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15553");
        model.Chief chief2 = new model.Chief("hi!", "");
        java.lang.String str3 = chief2.getID();
        java.lang.String str4 = chief2.getPassword();
        double double5 = chief2.getHourlyRate();
        double double6 = chief2.getHourlyRate();
        java.lang.String str7 = chief2.getPassword();
        boolean boolean8 = chief2.isVerified();
        chief2.logout();
        chief2.setVerified(true);
        chief2.logout();
        chief2.logout();
        double double14 = chief2.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "chief" + "'", str3, "chief");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test15554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15554");
        model.Chief chief2 = new model.Chief("", "chief");
        java.lang.String str3 = chief2.getPassword();
        java.lang.String str4 = chief2.getPassword();
        boolean boolean5 = chief2.isVerified();
        java.lang.String str6 = chief2.getEmail();
        java.lang.String str7 = chief2.getPassword();
        double double8 = chief2.getHourlyRate();
        java.lang.String str9 = chief2.getAccountType();
        java.lang.String str10 = chief2.getPassword();
        java.lang.String str11 = chief2.getPassword();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "chief" + "'", str3, "chief");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "chief" + "'", str7, "chief");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "chief" + "'", str9, "chief");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "chief" + "'", str10, "chief");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "chief" + "'", str11, "chief");
    }

    @Test
    public void test15555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15555");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.viewProfile();
        java.lang.String str4 = chief2.getPassword();
        chief2.logout();
        java.lang.String str6 = chief2.getID();
        chief2.setVerified(false);
        chief2.viewProfile();
        double double10 = chief2.getHourlyRate();
        java.lang.String str11 = chief2.getAccountType();
        chief2.logout();
        java.lang.String str13 = chief2.getID();
        chief2.logout();
        java.lang.String str15 = chief2.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "chief" + "'", str6, "chief");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "chief" + "'", str11, "chief");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "chief" + "'", str13, "chief");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "chief" + "'", str15, "chief");
    }

    @Test
    public void test15556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15556");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        java.lang.String str4 = chief2.getAccountType();
        java.lang.String str5 = chief2.getID();
        chief2.viewProfile();
        chief2.setVerified(true);
        java.lang.String str9 = chief2.getPassword();
        chief2.viewProfile();
        java.lang.String str11 = chief2.getEmail();
        java.lang.String str12 = chief2.getID();
        java.lang.String str13 = chief2.getEmail();
        java.lang.String str14 = chief2.getEmail();
        chief2.login("", "hi!");
        chief2.login("hi!", "chief");
        boolean boolean21 = chief2.isVerified();
        chief2.setVerified(true);
        java.lang.String str24 = chief2.getAccountType();
        java.lang.String str25 = chief2.getEmail();
        chief2.viewProfile();
        java.lang.String str27 = chief2.getAccountType();
        java.lang.String str28 = chief2.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "chief" + "'", str12, "chief");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "chief" + "'", str24, "chief");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "chief" + "'", str27, "chief");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
    }

    @Test
    public void test15557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15557");
        model.Chief chief2 = new model.Chief("", "chief");
        chief2.setVerified(false);
        chief2.logout();
        java.lang.String str6 = chief2.getPassword();
        chief2.logout();
        java.lang.String str8 = chief2.getEmail();
        java.lang.String str9 = chief2.getPassword();
        java.lang.String str10 = chief2.getPassword();
        java.lang.String str11 = chief2.getPassword();
        java.lang.String str12 = chief2.getID();
        java.lang.String str13 = chief2.getPassword();
        chief2.login("chief", "");
        chief2.setVerified(true);
        java.lang.String str19 = chief2.getAccountType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "chief" + "'", str6, "chief");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "chief" + "'", str9, "chief");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "chief" + "'", str10, "chief");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "chief" + "'", str11, "chief");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "chief" + "'", str12, "chief");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "chief" + "'", str13, "chief");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "chief" + "'", str19, "chief");
    }

    @Test
    public void test15558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15558");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.viewProfile();
        java.lang.String str4 = chief2.getPassword();
        chief2.login("", "");
        chief2.setVerified(true);
        java.lang.String str10 = chief2.getPassword();
        chief2.setVerified(false);
        chief2.login("chief", "chief");
        boolean boolean16 = chief2.isVerified();
        chief2.logout();
        java.lang.String str18 = chief2.getID();
        chief2.viewProfile();
        chief2.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "chief" + "'", str18, "chief");
    }

    @Test
    public void test15559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15559");
        model.Chief chief2 = new model.Chief("hi!", "hi!");
        chief2.setVerified(true);
        boolean boolean5 = chief2.isVerified();
        java.lang.String str6 = chief2.getID();
        chief2.login("hi!", "chief");
        java.lang.Class<?> wildcardClass10 = chief2.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "chief" + "'", str6, "chief");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test15560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15560");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.viewProfile();
        java.lang.String str4 = chief2.getPassword();
        chief2.login("", "");
        java.lang.String str8 = chief2.getAccountType();
        chief2.logout();
        chief2.logout();
        chief2.viewProfile();
        java.lang.String str12 = chief2.getAccountType();
        java.lang.String str13 = chief2.getAccountType();
        java.lang.String str14 = chief2.getID();
        chief2.setVerified(false);
        boolean boolean17 = chief2.isVerified();
        java.lang.String str18 = chief2.getPassword();
        double double19 = chief2.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "chief" + "'", str8, "chief");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "chief" + "'", str12, "chief");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "chief" + "'", str13, "chief");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "chief" + "'", str14, "chief");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
    }

    @Test
    public void test15561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15561");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        java.lang.String str4 = chief2.getEmail();
        chief2.viewProfile();
        double double6 = chief2.getHourlyRate();
        java.lang.String str7 = chief2.getAccountType();
        chief2.login("chief", "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "chief" + "'", str7, "chief");
    }

    @Test
    public void test15562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15562");
        model.Chief chief2 = new model.Chief("", "chief");
        chief2.logout();
        chief2.login("hi!", "");
        chief2.login("", "");
        java.lang.String str10 = chief2.getAccountType();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "chief" + "'", str10, "chief");
    }

    @Test
    public void test15563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15563");
        model.Chief chief2 = new model.Chief("hi!", "");
        java.lang.String str3 = chief2.getID();
        java.lang.String str4 = chief2.getPassword();
        java.lang.String str5 = chief2.getPassword();
        java.lang.String str6 = chief2.getEmail();
        chief2.login("", "");
        boolean boolean10 = chief2.isVerified();
        double double11 = chief2.getHourlyRate();
        java.lang.Class<?> wildcardClass12 = chief2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "chief" + "'", str3, "chief");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test15564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15564");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        java.lang.String str4 = chief2.getAccountType();
        java.lang.String str5 = chief2.getID();
        boolean boolean6 = chief2.isVerified();
        chief2.logout();
        chief2.viewProfile();
        chief2.login("chief", "");
        double double12 = chief2.getHourlyRate();
        java.lang.String str13 = chief2.getEmail();
        java.lang.String str14 = chief2.getAccountType();
        java.lang.String str15 = chief2.getID();
        double double16 = chief2.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "chief" + "'", str14, "chief");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "chief" + "'", str15, "chief");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
    }

    @Test
    public void test15565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15565");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        java.lang.String str4 = chief2.getAccountType();
        java.lang.String str5 = chief2.getID();
        chief2.viewProfile();
        chief2.setVerified(true);
        java.lang.String str9 = chief2.getAccountType();
        boolean boolean10 = chief2.isVerified();
        chief2.viewProfile();
        java.lang.String str12 = chief2.getID();
        chief2.logout();
        chief2.viewProfile();
        chief2.setVerified(false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "chief" + "'", str9, "chief");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "chief" + "'", str12, "chief");
    }

    @Test
    public void test15566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15566");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        chief2.logout();
        double double5 = chief2.getHourlyRate();
        java.lang.String str6 = chief2.getEmail();
        chief2.logout();
        chief2.login("chief", "chief");
        boolean boolean11 = chief2.isVerified();
        boolean boolean12 = chief2.isVerified();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test15567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15567");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.viewProfile();
        java.lang.String str4 = chief2.getPassword();
        chief2.logout();
        double double6 = chief2.getHourlyRate();
        chief2.logout();
        boolean boolean8 = chief2.isVerified();
        chief2.viewProfile();
        chief2.logout();
        double double11 = chief2.getHourlyRate();
        java.lang.String str12 = chief2.getAccountType();
        chief2.viewProfile();
        java.lang.Class<?> wildcardClass14 = chief2.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "chief" + "'", str12, "chief");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test15568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15568");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.viewProfile();
        java.lang.String str4 = chief2.getPassword();
        chief2.viewProfile();
        java.lang.String str6 = chief2.getEmail();
        java.lang.String str7 = chief2.getEmail();
        chief2.setVerified(true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test15569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15569");
        model.Chief chief2 = new model.Chief("hi!", "");
        java.lang.String str3 = chief2.getID();
        chief2.setVerified(true);
        chief2.logout();
        java.lang.String str7 = chief2.getPassword();
        java.lang.String str8 = chief2.getEmail();
        chief2.logout();
        java.lang.Class<?> wildcardClass10 = chief2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "chief" + "'", str3, "chief");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test15570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15570");
        model.Chief chief2 = new model.Chief("hi!", "");
        java.lang.String str3 = chief2.getID();
        double double4 = chief2.getHourlyRate();
        chief2.login("hi!", "");
        java.lang.String str8 = chief2.getEmail();
        java.lang.String str9 = chief2.getPassword();
        chief2.logout();
        double double11 = chief2.getHourlyRate();
        java.lang.String str12 = chief2.getAccountType();
        chief2.viewProfile();
        java.lang.String str14 = chief2.getID();
        chief2.login("chief", "chief");
        java.lang.String str18 = chief2.getPassword();
        java.lang.String str19 = chief2.getAccountType();
        double double20 = chief2.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "chief" + "'", str3, "chief");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "chief" + "'", str12, "chief");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "chief" + "'", str14, "chief");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "chief" + "'", str19, "chief");
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
    }

    @Test
    public void test15571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15571");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        java.lang.String str4 = chief2.getAccountType();
        java.lang.String str5 = chief2.getID();
        java.lang.String str6 = chief2.getEmail();
        java.lang.String str7 = chief2.getEmail();
        java.lang.String str8 = chief2.getEmail();
        chief2.setVerified(true);
        chief2.viewProfile();
        chief2.setVerified(true);
        java.lang.String str14 = chief2.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test15572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15572");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        chief2.viewProfile();
        chief2.setVerified(false);
        java.lang.String str7 = chief2.getID();
        java.lang.String str8 = chief2.getID();
        java.lang.String str9 = chief2.getID();
        chief2.viewProfile();
        chief2.setVerified(false);
        java.lang.String str13 = chief2.getPassword();
        java.lang.String str14 = chief2.getEmail();
        boolean boolean15 = chief2.isVerified();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "chief" + "'", str7, "chief");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "chief" + "'", str8, "chief");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "chief" + "'", str9, "chief");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test15573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15573");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.viewProfile();
        java.lang.String str4 = chief2.getPassword();
        java.lang.String str5 = chief2.getEmail();
        chief2.logout();
        java.lang.String str7 = chief2.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "chief" + "'", str7, "chief");
    }

    @Test
    public void test15574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15574");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        java.lang.String str4 = chief2.getAccountType();
        java.lang.String str5 = chief2.getID();
        double double6 = chief2.getHourlyRate();
        java.lang.String str7 = chief2.getEmail();
        chief2.logout();
        double double9 = chief2.getHourlyRate();
        chief2.logout();
        java.lang.Class<?> wildcardClass11 = chief2.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test15575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15575");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        java.lang.String str4 = chief2.getAccountType();
        java.lang.String str5 = chief2.getID();
        boolean boolean6 = chief2.isVerified();
        java.lang.String str7 = chief2.getID();
        boolean boolean8 = chief2.isVerified();
        chief2.viewProfile();
        java.lang.String str10 = chief2.getAccountType();
        chief2.logout();
        boolean boolean12 = chief2.isVerified();
        chief2.viewProfile();
        double double14 = chief2.getHourlyRate();
        java.lang.String str15 = chief2.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "chief" + "'", str7, "chief");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "chief" + "'", str10, "chief");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test15576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15576");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        java.lang.String str4 = chief2.getID();
        java.lang.String str5 = chief2.getID();
        chief2.viewProfile();
        chief2.viewProfile();
        java.lang.String str8 = chief2.getPassword();
        chief2.setVerified(false);
        chief2.setVerified(true);
        boolean boolean13 = chief2.isVerified();
        java.lang.String str14 = chief2.getID();
        chief2.logout();
        java.lang.String str16 = chief2.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "chief" + "'", str14, "chief");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "chief" + "'", str16, "chief");
    }

    @Test
    public void test15577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15577");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        chief2.logout();
        java.lang.String str5 = chief2.getAccountType();
        chief2.login("hi!", "chief");
        java.lang.String str9 = chief2.getEmail();
        java.lang.String str10 = chief2.getID();
        java.lang.String str11 = chief2.getID();
        chief2.viewProfile();
        chief2.setVerified(true);
        java.lang.String str15 = chief2.getID();
        java.lang.Class<?> wildcardClass16 = chief2.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "chief" + "'", str10, "chief");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "chief" + "'", str11, "chief");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "chief" + "'", str15, "chief");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test15578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15578");
        model.Chief chief2 = new model.Chief("hi!", "");
        java.lang.String str3 = chief2.getID();
        double double4 = chief2.getHourlyRate();
        double double5 = chief2.getHourlyRate();
        java.lang.String str6 = chief2.getAccountType();
        chief2.login("", "");
        boolean boolean10 = chief2.isVerified();
        chief2.login("", "hi!");
        java.lang.String str14 = chief2.getID();
        chief2.logout();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "chief" + "'", str3, "chief");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "chief" + "'", str6, "chief");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "chief" + "'", str14, "chief");
    }

    @Test
    public void test15579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15579");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        java.lang.String str4 = chief2.getAccountType();
        java.lang.String str5 = chief2.getPassword();
        java.lang.String str6 = chief2.getEmail();
        boolean boolean7 = chief2.isVerified();
        chief2.setVerified(true);
        java.lang.String str10 = chief2.getAccountType();
        java.lang.String str11 = chief2.getAccountType();
        java.lang.String str12 = chief2.getEmail();
        chief2.viewProfile();
        boolean boolean14 = chief2.isVerified();
        chief2.logout();
        java.lang.String str16 = chief2.getAccountType();
        double double17 = chief2.getHourlyRate();
        double double18 = chief2.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "chief" + "'", str10, "chief");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "chief" + "'", str11, "chief");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "chief" + "'", str16, "chief");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
    }

    @Test
    public void test15580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15580");
        model.Chief chief2 = new model.Chief("", "chief");
        chief2.setVerified(false);
        chief2.logout();
        java.lang.String str6 = chief2.getPassword();
        chief2.login("chief", "");
        double double10 = chief2.getHourlyRate();
        java.lang.String str11 = chief2.getPassword();
        java.lang.String str12 = chief2.getID();
        java.lang.String str13 = chief2.getID();
        double double14 = chief2.getHourlyRate();
        boolean boolean15 = chief2.isVerified();
        java.lang.String str16 = chief2.getPassword();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "chief" + "'", str6, "chief");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "chief" + "'", str11, "chief");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "chief" + "'", str12, "chief");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "chief" + "'", str13, "chief");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "chief" + "'", str16, "chief");
    }

    @Test
    public void test15581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15581");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        chief2.viewProfile();
        chief2.setVerified(false);
        chief2.logout();
        chief2.logout();
        java.lang.String str9 = chief2.getPassword();
        chief2.viewProfile();
        chief2.setVerified(false);
        chief2.setVerified(true);
        chief2.viewProfile();
        chief2.login("", "chief");
        java.lang.String str19 = chief2.getAccountType();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "chief" + "'", str19, "chief");
    }

    @Test
    public void test15582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15582");
        model.Chief chief2 = new model.Chief("hi!", "");
        java.lang.String str3 = chief2.getID();
        chief2.logout();
        java.lang.String str5 = chief2.getEmail();
        java.lang.String str6 = chief2.getPassword();
        java.lang.String str7 = chief2.getPassword();
        chief2.viewProfile();
        java.lang.String str9 = chief2.getPassword();
        chief2.login("hi!", "");
        java.lang.String str13 = chief2.getPassword();
        double double14 = chief2.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "chief" + "'", str3, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test15583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15583");
        model.Chief chief2 = new model.Chief("hi!", "");
        java.lang.String str3 = chief2.getAccountType();
        chief2.setVerified(true);
        java.lang.String str6 = chief2.getEmail();
        chief2.viewProfile();
        boolean boolean8 = chief2.isVerified();
        java.lang.String str9 = chief2.getID();
        double double10 = chief2.getHourlyRate();
        boolean boolean11 = chief2.isVerified();
        chief2.logout();
        double double13 = chief2.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "chief" + "'", str3, "chief");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "chief" + "'", str9, "chief");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test15584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15584");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.setVerified(false);
        chief2.logout();
        java.lang.String str6 = chief2.getAccountType();
        chief2.setVerified(true);
        boolean boolean9 = chief2.isVerified();
        chief2.viewProfile();
        java.lang.String str11 = chief2.getPassword();
        java.lang.String str12 = chief2.getID();
        boolean boolean13 = chief2.isVerified();
        boolean boolean14 = chief2.isVerified();
        java.lang.String str15 = chief2.getPassword();
        java.lang.String str16 = chief2.getEmail();
        java.lang.String str17 = chief2.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "chief" + "'", str6, "chief");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "chief" + "'", str12, "chief");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test15585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15585");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.setVerified(false);
        chief2.logout();
        java.lang.String str6 = chief2.getAccountType();
        java.lang.String str7 = chief2.getEmail();
        java.lang.String str8 = chief2.getPassword();
        java.lang.String str9 = chief2.getAccountType();
        java.lang.String str10 = chief2.getID();
        java.lang.String str11 = chief2.getAccountType();
        java.lang.String str12 = chief2.getAccountType();
        java.lang.String str13 = chief2.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "chief" + "'", str6, "chief");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "chief" + "'", str9, "chief");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "chief" + "'", str10, "chief");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "chief" + "'", str11, "chief");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "chief" + "'", str12, "chief");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test15586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15586");
        model.Chief chief2 = new model.Chief("hi!", "");
        java.lang.String str3 = chief2.getID();
        java.lang.String str4 = chief2.getPassword();
        java.lang.String str5 = chief2.getPassword();
        java.lang.String str6 = chief2.getEmail();
        chief2.login("", "chief");
        chief2.login("chief", "hi!");
        chief2.viewProfile();
        java.lang.String str14 = chief2.getID();
        java.lang.String str15 = chief2.getAccountType();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "chief" + "'", str3, "chief");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "chief" + "'", str14, "chief");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "chief" + "'", str15, "chief");
    }

    @Test
    public void test15587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15587");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        chief2.viewProfile();
        chief2.setVerified(false);
        java.lang.String str7 = chief2.getEmail();
        java.lang.String str8 = chief2.getPassword();
        chief2.setVerified(false);
        java.lang.String str11 = chief2.getEmail();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test15588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15588");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.viewProfile();
        java.lang.String str4 = chief2.getPassword();
        chief2.logout();
        boolean boolean6 = chief2.isVerified();
        chief2.viewProfile();
        chief2.login("chief", "chief");
        chief2.viewProfile();
        chief2.login("", "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test15589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15589");
        model.Chief chief2 = new model.Chief("", "chief");
        chief2.setVerified(false);
        chief2.logout();
        java.lang.String str6 = chief2.getPassword();
        java.lang.String str7 = chief2.getPassword();
        java.lang.String str8 = chief2.getAccountType();
        java.lang.String str9 = chief2.getEmail();
        chief2.login("hi!", "hi!");
        chief2.setVerified(true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "chief" + "'", str6, "chief");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "chief" + "'", str7, "chief");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "chief" + "'", str8, "chief");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test15590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15590");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        chief2.logout();
        double double5 = chief2.getHourlyRate();
        java.lang.String str6 = chief2.getID();
        chief2.login("hi!", "chief");
        java.lang.String str10 = chief2.getAccountType();
        java.lang.String str11 = chief2.getID();
        double double12 = chief2.getHourlyRate();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "chief" + "'", str6, "chief");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "chief" + "'", str10, "chief");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "chief" + "'", str11, "chief");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test15591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15591");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        chief2.logout();
        double double5 = chief2.getHourlyRate();
        java.lang.String str6 = chief2.getEmail();
        boolean boolean7 = chief2.isVerified();
        chief2.logout();
        chief2.login("", "");
        double double12 = chief2.getHourlyRate();
        java.lang.String str13 = chief2.getID();
        java.lang.String str14 = chief2.getAccountType();
        chief2.logout();
        chief2.viewProfile();
        java.lang.Class<?> wildcardClass17 = chief2.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "chief" + "'", str13, "chief");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "chief" + "'", str14, "chief");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test15592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15592");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        chief2.viewProfile();
        chief2.setVerified(false);
        java.lang.String str7 = chief2.getID();
        chief2.logout();
        java.lang.String str9 = chief2.getPassword();
        chief2.login("hi!", "");
        java.lang.String str13 = chief2.getEmail();
        chief2.logout();
        java.lang.String str15 = chief2.getID();
        chief2.logout();
        double double17 = chief2.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "chief" + "'", str7, "chief");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "chief" + "'", str15, "chief");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
    }

    @Test
    public void test15593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15593");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        java.lang.String str4 = chief2.getAccountType();
        java.lang.String str5 = chief2.getID();
        double double6 = chief2.getHourlyRate();
        java.lang.String str7 = chief2.getEmail();
        java.lang.String str8 = chief2.getAccountType();
        java.lang.String str9 = chief2.getEmail();
        java.lang.String str10 = chief2.getID();
        java.lang.String str11 = chief2.getEmail();
        boolean boolean12 = chief2.isVerified();
        java.lang.String str13 = chief2.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "chief" + "'", str8, "chief");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "chief" + "'", str10, "chief");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "chief" + "'", str13, "chief");
    }

    @Test
    public void test15594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15594");
        model.Chief chief2 = new model.Chief("hi!", "");
        java.lang.String str3 = chief2.getID();
        double double4 = chief2.getHourlyRate();
        double double5 = chief2.getHourlyRate();
        chief2.logout();
        java.lang.String str7 = chief2.getAccountType();
        chief2.viewProfile();
        boolean boolean9 = chief2.isVerified();
        chief2.setVerified(false);
        java.lang.String str12 = chief2.getID();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "chief" + "'", str3, "chief");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "chief" + "'", str7, "chief");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "chief" + "'", str12, "chief");
    }

    @Test
    public void test15595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15595");
        model.Chief chief2 = new model.Chief("hi!", "");
        java.lang.String str3 = chief2.getPassword();
        chief2.logout();
        boolean boolean5 = chief2.isVerified();
        chief2.viewProfile();
        chief2.viewProfile();
        java.lang.String str8 = chief2.getEmail();
        java.lang.String str9 = chief2.getPassword();
        java.lang.Class<?> wildcardClass10 = chief2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test15596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15596");
        model.Chief chief2 = new model.Chief("", "chief");
        chief2.setVerified(false);
        java.lang.String str5 = chief2.getPassword();
        java.lang.String str6 = chief2.getAccountType();
        double double7 = chief2.getHourlyRate();
        java.lang.String str8 = chief2.getEmail();
        chief2.logout();
        chief2.viewProfile();
        chief2.setVerified(true);
        java.lang.String str13 = chief2.getPassword();
        chief2.setVerified(false);
        boolean boolean16 = chief2.isVerified();
        chief2.login("hi!", "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "chief" + "'", str6, "chief");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "chief" + "'", str13, "chief");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test15597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15597");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.viewProfile();
        double double4 = chief2.getHourlyRate();
        java.lang.String str5 = chief2.getEmail();
        boolean boolean6 = chief2.isVerified();
        java.lang.String str7 = chief2.getEmail();
        chief2.logout();
        double double9 = chief2.getHourlyRate();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test15598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15598");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.viewProfile();
        java.lang.String str4 = chief2.getPassword();
        chief2.login("", "");
        chief2.setVerified(true);
        chief2.logout();
        java.lang.String str11 = chief2.getEmail();
        chief2.setVerified(false);
        chief2.viewProfile();
        chief2.setVerified(true);
        java.lang.String str17 = chief2.getAccountType();
        java.lang.String str18 = chief2.getEmail();
        java.lang.String str19 = chief2.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "chief" + "'", str17, "chief");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "chief" + "'", str19, "chief");
    }

    @Test
    public void test15599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15599");
        model.Chief chief2 = new model.Chief("hi!", "");
        java.lang.String str3 = chief2.getPassword();
        chief2.viewProfile();
        chief2.setVerified(true);
        java.lang.String str7 = chief2.getEmail();
        java.lang.String str8 = chief2.getPassword();
        java.lang.String str9 = chief2.getID();
        java.lang.String str10 = chief2.getID();
        chief2.login("", "");
        chief2.login("hi!", "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "chief" + "'", str9, "chief");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "chief" + "'", str10, "chief");
    }

    @Test
    public void test15600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15600");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.viewProfile();
        java.lang.String str4 = chief2.getPassword();
        chief2.logout();
        java.lang.String str6 = chief2.getID();
        chief2.setVerified(false);
        chief2.viewProfile();
        java.lang.String str10 = chief2.getID();
        boolean boolean11 = chief2.isVerified();
        java.lang.String str12 = chief2.getPassword();
        java.lang.String str13 = chief2.getAccountType();
        chief2.login("hi!", "");
        java.lang.Class<?> wildcardClass17 = chief2.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "chief" + "'", str6, "chief");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "chief" + "'", str10, "chief");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "chief" + "'", str13, "chief");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test15601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15601");
        model.Chief chief2 = new model.Chief("hi!", "");
        java.lang.String str3 = chief2.getID();
        double double4 = chief2.getHourlyRate();
        chief2.login("hi!", "");
        java.lang.String str8 = chief2.getEmail();
        java.lang.String str9 = chief2.getPassword();
        chief2.logout();
        chief2.setVerified(true);
        chief2.login("", "hi!");
        java.lang.Class<?> wildcardClass16 = chief2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "chief" + "'", str3, "chief");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test15602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15602");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.viewProfile();
        java.lang.String str4 = chief2.getPassword();
        chief2.login("", "");
        double double8 = chief2.getHourlyRate();
        double double9 = chief2.getHourlyRate();
        java.lang.String str10 = chief2.getEmail();
        java.lang.String str11 = chief2.getPassword();
        chief2.viewProfile();
        chief2.viewProfile();
        chief2.logout();
        java.lang.String str15 = chief2.getEmail();
        java.lang.String str16 = chief2.getPassword();
        java.lang.String str17 = chief2.getPassword();
        chief2.viewProfile();
        java.lang.Class<?> wildcardClass19 = chief2.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test15603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15603");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.setVerified(false);
        chief2.logout();
        java.lang.String str6 = chief2.getAccountType();
        chief2.setVerified(true);
        boolean boolean9 = chief2.isVerified();
        chief2.viewProfile();
        chief2.logout();
        java.lang.String str12 = chief2.getAccountType();
        chief2.logout();
        double double14 = chief2.getHourlyRate();
        java.lang.String str15 = chief2.getPassword();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "chief" + "'", str6, "chief");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "chief" + "'", str12, "chief");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test15604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15604");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        chief2.viewProfile();
        chief2.setVerified(false);
        java.lang.String str7 = chief2.getID();
        java.lang.String str8 = chief2.getID();
        boolean boolean9 = chief2.isVerified();
        java.lang.String str10 = chief2.getID();
        java.lang.String str11 = chief2.getPassword();
        chief2.setVerified(true);
        boolean boolean14 = chief2.isVerified();
        java.lang.String str15 = chief2.getAccountType();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "chief" + "'", str7, "chief");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "chief" + "'", str8, "chief");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "chief" + "'", str10, "chief");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "chief" + "'", str15, "chief");
    }

    @Test
    public void test15605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15605");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.viewProfile();
        double double4 = chief2.getHourlyRate();
        chief2.setVerified(false);
        chief2.setVerified(false);
        java.lang.String str9 = chief2.getEmail();
        java.lang.Class<?> wildcardClass10 = chief2.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test15606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15606");
        model.Chief chief2 = new model.Chief("", "chief");
        chief2.setVerified(false);
        java.lang.String str5 = chief2.getPassword();
        java.lang.String str6 = chief2.getAccountType();
        chief2.logout();
        java.lang.String str8 = chief2.getID();
        chief2.logout();
        double double10 = chief2.getHourlyRate();
        chief2.logout();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "chief" + "'", str6, "chief");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "chief" + "'", str8, "chief");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test15607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15607");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.viewProfile();
        java.lang.String str4 = chief2.getPassword();
        chief2.viewProfile();
        chief2.login("", "");
        java.lang.String str9 = chief2.getPassword();
        java.lang.String str10 = chief2.getPassword();
        chief2.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test15608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15608");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.viewProfile();
        java.lang.String str4 = chief2.getPassword();
        chief2.login("", "");
        double double8 = chief2.getHourlyRate();
        chief2.setVerified(false);
        boolean boolean11 = chief2.isVerified();
        java.lang.String str12 = chief2.getAccountType();
        java.lang.String str13 = chief2.getAccountType();
        chief2.login("chief", "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "chief" + "'", str12, "chief");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "chief" + "'", str13, "chief");
    }

    @Test
    public void test15609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15609");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.viewProfile();
        java.lang.String str4 = chief2.getPassword();
        chief2.logout();
        java.lang.String str6 = chief2.getID();
        chief2.viewProfile();
        chief2.logout();
        java.lang.String str9 = chief2.getEmail();
        boolean boolean10 = chief2.isVerified();
        chief2.viewProfile();
        boolean boolean12 = chief2.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "chief" + "'", str6, "chief");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test15610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15610");
        model.Chief chief2 = new model.Chief("hi!", "");
        java.lang.String str3 = chief2.getAccountType();
        java.lang.String str4 = chief2.getID();
        java.lang.String str5 = chief2.getID();
        chief2.logout();
        boolean boolean7 = chief2.isVerified();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "chief" + "'", str3, "chief");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test15611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15611");
        model.Chief chief2 = new model.Chief("hi!", "");
        java.lang.String str3 = chief2.getID();
        java.lang.String str4 = chief2.getPassword();
        java.lang.String str5 = chief2.getPassword();
        java.lang.String str6 = chief2.getPassword();
        java.lang.String str7 = chief2.getAccountType();
        java.lang.String str8 = chief2.getID();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "chief" + "'", str3, "chief");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "chief" + "'", str7, "chief");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "chief" + "'", str8, "chief");
    }

    @Test
    public void test15612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15612");
        model.Chief chief2 = new model.Chief("", "chief");
        double double3 = chief2.getHourlyRate();
        double double4 = chief2.getHourlyRate();
        chief2.setVerified(true);
        chief2.setVerified(true);
        java.lang.String str9 = chief2.getPassword();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "chief" + "'", str9, "chief");
    }

    @Test
    public void test15613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15613");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.setVerified(false);
        chief2.logout();
        java.lang.String str6 = chief2.getEmail();
        java.lang.String str7 = chief2.getPassword();
        chief2.setVerified(true);
        java.lang.String str10 = chief2.getAccountType();
        java.lang.String str11 = chief2.getAccountType();
        chief2.setVerified(true);
        java.lang.String str14 = chief2.getID();
        java.lang.String str15 = chief2.getPassword();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "chief" + "'", str10, "chief");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "chief" + "'", str11, "chief");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "chief" + "'", str14, "chief");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test15614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15614");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.setVerified(false);
        chief2.logout();
        chief2.logout();
        java.lang.String str7 = chief2.getPassword();
        chief2.setVerified(true);
        double double10 = chief2.getHourlyRate();
        chief2.viewProfile();
        chief2.logout();
        java.lang.String str13 = chief2.getID();
        java.lang.String str14 = chief2.getAccountType();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "chief" + "'", str13, "chief");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "chief" + "'", str14, "chief");
    }

    @Test
    public void test15615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15615");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.viewProfile();
        java.lang.String str4 = chief2.getPassword();
        chief2.login("", "");
        double double8 = chief2.getHourlyRate();
        double double9 = chief2.getHourlyRate();
        java.lang.String str10 = chief2.getEmail();
        java.lang.String str11 = chief2.getAccountType();
        chief2.logout();
        java.lang.String str13 = chief2.getAccountType();
        chief2.setVerified(true);
        double double16 = chief2.getHourlyRate();
        java.lang.String str17 = chief2.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "chief" + "'", str11, "chief");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "chief" + "'", str13, "chief");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test15616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15616");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        java.lang.String str4 = chief2.getAccountType();
        java.lang.String str5 = chief2.getID();
        double double6 = chief2.getHourlyRate();
        java.lang.String str7 = chief2.getID();
        java.lang.String str8 = chief2.getEmail();
        double double9 = chief2.getHourlyRate();
        chief2.setVerified(false);
        java.lang.String str12 = chief2.getEmail();
        java.lang.String str13 = chief2.getID();
        java.lang.String str14 = chief2.getAccountType();
        chief2.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "chief" + "'", str7, "chief");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "chief" + "'", str13, "chief");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "chief" + "'", str14, "chief");
    }

    @Test
    public void test15617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15617");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        double double4 = chief2.getHourlyRate();
        java.lang.String str5 = chief2.getID();
        java.lang.String str6 = chief2.getAccountType();
        java.lang.String str7 = chief2.getAccountType();
        boolean boolean8 = chief2.isVerified();
        boolean boolean9 = chief2.isVerified();
        chief2.setVerified(false);
        java.lang.String str12 = chief2.getAccountType();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "chief" + "'", str6, "chief");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "chief" + "'", str7, "chief");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "chief" + "'", str12, "chief");
    }

    @Test
    public void test15618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15618");
        model.Chief chief2 = new model.Chief("hi!", "");
        java.lang.String str3 = chief2.getAccountType();
        chief2.setVerified(true);
        java.lang.String str6 = chief2.getEmail();
        chief2.viewProfile();
        chief2.logout();
        java.lang.String str9 = chief2.getAccountType();
        chief2.viewProfile();
        java.lang.String str11 = chief2.getAccountType();
        java.lang.String str12 = chief2.getPassword();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "chief" + "'", str3, "chief");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "chief" + "'", str9, "chief");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "chief" + "'", str11, "chief");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test15619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15619");
        model.Chief chief2 = new model.Chief("", "hi!");
        double double3 = chief2.getHourlyRate();
        java.lang.String str4 = chief2.getPassword();
        chief2.login("hi!", "");
        java.lang.String str8 = chief2.getPassword();
        chief2.setVerified(false);
        chief2.login("hi!", "hi!");
        boolean boolean14 = chief2.isVerified();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test15620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15620");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.setVerified(false);
        chief2.logout();
        java.lang.String str6 = chief2.getEmail();
        chief2.setVerified(false);
        chief2.setVerified(true);
        java.lang.String str11 = chief2.getEmail();
        java.lang.String str12 = chief2.getID();
        boolean boolean13 = chief2.isVerified();
        java.lang.String str14 = chief2.getAccountType();
        chief2.login("", "chief");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "chief" + "'", str12, "chief");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "chief" + "'", str14, "chief");
    }

    @Test
    public void test15621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15621");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.viewProfile();
        java.lang.String str4 = chief2.getPassword();
        chief2.login("", "");
        double double8 = chief2.getHourlyRate();
        double double9 = chief2.getHourlyRate();
        java.lang.String str10 = chief2.getEmail();
        java.lang.String str11 = chief2.getEmail();
        java.lang.String str12 = chief2.getID();
        chief2.viewProfile();
        chief2.viewProfile();
        chief2.login("chief", "chief");
        double double18 = chief2.getHourlyRate();
        chief2.setVerified(false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "chief" + "'", str12, "chief");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
    }

    @Test
    public void test15622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15622");
        model.Chief chief2 = new model.Chief("hi!", "");
        java.lang.String str3 = chief2.getID();
        java.lang.String str4 = chief2.getPassword();
        chief2.logout();
        chief2.viewProfile();
        double double7 = chief2.getHourlyRate();
        chief2.viewProfile();
        java.lang.String str9 = chief2.getEmail();
        chief2.logout();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "chief" + "'", str3, "chief");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test15623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15623");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        java.lang.String str4 = chief2.getAccountType();
        java.lang.String str5 = chief2.getPassword();
        java.lang.String str6 = chief2.getEmail();
        boolean boolean7 = chief2.isVerified();
        chief2.setVerified(true);
        chief2.login("", "hi!");
        java.lang.String str13 = chief2.getPassword();
        chief2.viewProfile();
        chief2.login("chief", "hi!");
        double double18 = chief2.getHourlyRate();
        java.lang.String str19 = chief2.getEmail();
        java.lang.String str20 = chief2.getEmail();
        java.lang.String str21 = chief2.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
    }

    @Test
    public void test15624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15624");
        model.Chief chief2 = new model.Chief("hi!", "");
        java.lang.String str3 = chief2.getID();
        double double4 = chief2.getHourlyRate();
        chief2.login("hi!", "");
        java.lang.String str8 = chief2.getEmail();
        java.lang.String str9 = chief2.getEmail();
        chief2.setVerified(false);
        java.lang.String str12 = chief2.getID();
        java.lang.String str13 = chief2.getAccountType();
        java.lang.String str14 = chief2.getAccountType();
        java.lang.String str15 = chief2.getEmail();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "chief" + "'", str3, "chief");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "chief" + "'", str12, "chief");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "chief" + "'", str13, "chief");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "chief" + "'", str14, "chief");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test15625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15625");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        java.lang.String str4 = chief2.getAccountType();
        java.lang.String str5 = chief2.getPassword();
        java.lang.String str6 = chief2.getEmail();
        boolean boolean7 = chief2.isVerified();
        chief2.login("", "chief");
        chief2.viewProfile();
        chief2.logout();
        chief2.viewProfile();
        chief2.logout();
        boolean boolean15 = chief2.isVerified();
        chief2.logout();
        double double17 = chief2.getHourlyRate();
        java.lang.String str18 = chief2.getEmail();
        java.lang.String str19 = chief2.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test15626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15626");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        chief2.logout();
        double double5 = chief2.getHourlyRate();
        java.lang.String str6 = chief2.getEmail();
        boolean boolean7 = chief2.isVerified();
        chief2.logout();
        double double9 = chief2.getHourlyRate();
        boolean boolean10 = chief2.isVerified();
        boolean boolean11 = chief2.isVerified();
        chief2.logout();
        chief2.setVerified(true);
        double double15 = chief2.getHourlyRate();
        boolean boolean16 = chief2.isVerified();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test15627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15627");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        java.lang.String str4 = chief2.getAccountType();
        java.lang.String str5 = chief2.getPassword();
        java.lang.String str6 = chief2.getEmail();
        boolean boolean7 = chief2.isVerified();
        chief2.setVerified(false);
        java.lang.String str10 = chief2.getID();
        java.lang.String str11 = chief2.getAccountType();
        java.lang.String str12 = chief2.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "chief" + "'", str10, "chief");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "chief" + "'", str11, "chief");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test15628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15628");
        model.Chief chief2 = new model.Chief("hi!", "");
        java.lang.String str3 = chief2.getID();
        java.lang.String str4 = chief2.getPassword();
        java.lang.String str5 = chief2.getPassword();
        java.lang.String str6 = chief2.getEmail();
        chief2.login("", "");
        boolean boolean10 = chief2.isVerified();
        chief2.viewProfile();
        java.lang.String str12 = chief2.getAccountType();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "chief" + "'", str3, "chief");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "chief" + "'", str12, "chief");
    }

    @Test
    public void test15629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15629");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.viewProfile();
        java.lang.String str4 = chief2.getPassword();
        java.lang.String str5 = chief2.getAccountType();
        chief2.setVerified(false);
        java.lang.String str8 = chief2.getAccountType();
        double double9 = chief2.getHourlyRate();
        boolean boolean10 = chief2.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "chief" + "'", str8, "chief");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test15630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15630");
        model.Chief chief2 = new model.Chief("hi!", "");
        java.lang.String str3 = chief2.getAccountType();
        double double4 = chief2.getHourlyRate();
        chief2.logout();
        java.lang.String str6 = chief2.getEmail();
        chief2.logout();
        double double8 = chief2.getHourlyRate();
        java.lang.String str9 = chief2.getID();
        double double10 = chief2.getHourlyRate();
        chief2.setVerified(false);
        chief2.logout();
        java.lang.String str14 = chief2.getPassword();
        boolean boolean15 = chief2.isVerified();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "chief" + "'", str3, "chief");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "chief" + "'", str9, "chief");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test15631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15631");
        model.Chief chief2 = new model.Chief("", "chief");
        chief2.setVerified(false);
        java.lang.String str5 = chief2.getPassword();
        java.lang.String str6 = chief2.getID();
        chief2.logout();
        java.lang.String str8 = chief2.getID();
        chief2.setVerified(true);
        java.lang.String str11 = chief2.getAccountType();
        chief2.setVerified(true);
        chief2.login("hi!", "");
        java.lang.String str17 = chief2.getEmail();
        java.lang.String str18 = chief2.getPassword();
        chief2.logout();
        java.lang.String str20 = chief2.getAccountType();
        double double21 = chief2.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "chief" + "'", str6, "chief");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "chief" + "'", str8, "chief");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "chief" + "'", str11, "chief");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "chief" + "'", str18, "chief");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "chief" + "'", str20, "chief");
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
    }

    @Test
    public void test15632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15632");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        java.lang.String str4 = chief2.getAccountType();
        java.lang.String str5 = chief2.getID();
        double double6 = chief2.getHourlyRate();
        java.lang.String str7 = chief2.getEmail();
        chief2.setVerified(true);
        java.lang.String str10 = chief2.getPassword();
        java.lang.String str11 = chief2.getEmail();
        boolean boolean12 = chief2.isVerified();
        chief2.setVerified(false);
        chief2.setVerified(true);
        java.lang.String str17 = chief2.getAccountType();
        chief2.viewProfile();
        boolean boolean19 = chief2.isVerified();
        boolean boolean20 = chief2.isVerified();
        boolean boolean21 = chief2.isVerified();
        double double22 = chief2.getHourlyRate();
        chief2.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "chief" + "'", str17, "chief");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
    }

    @Test
    public void test15633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15633");
        model.Chief chief2 = new model.Chief("hi!", "");
        java.lang.String str3 = chief2.getAccountType();
        java.lang.String str4 = chief2.getAccountType();
        chief2.viewProfile();
        chief2.viewProfile();
        java.lang.String str7 = chief2.getEmail();
        double double8 = chief2.getHourlyRate();
        java.lang.String str9 = chief2.getEmail();
        boolean boolean10 = chief2.isVerified();
        java.lang.String str11 = chief2.getEmail();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "chief" + "'", str3, "chief");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test15634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15634");
        model.Chief chief2 = new model.Chief("", "chief");
        chief2.setVerified(false);
        java.lang.String str5 = chief2.getPassword();
        java.lang.String str6 = chief2.getAccountType();
        boolean boolean7 = chief2.isVerified();
        chief2.setVerified(false);
        chief2.logout();
        double double11 = chief2.getHourlyRate();
        boolean boolean12 = chief2.isVerified();
        double double13 = chief2.getHourlyRate();
        java.lang.String str14 = chief2.getID();
        chief2.setVerified(false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "chief" + "'", str6, "chief");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "chief" + "'", str14, "chief");
    }

    @Test
    public void test15635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15635");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        chief2.logout();
        double double5 = chief2.getHourlyRate();
        java.lang.String str6 = chief2.getID();
        chief2.login("hi!", "chief");
        chief2.logout();
        chief2.setVerified(true);
        double double13 = chief2.getHourlyRate();
        chief2.viewProfile();
        double double15 = chief2.getHourlyRate();
        chief2.setVerified(false);
        boolean boolean18 = chief2.isVerified();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "chief" + "'", str6, "chief");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test15636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15636");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.viewProfile();
        java.lang.String str4 = chief2.getPassword();
        chief2.login("", "");
        java.lang.String str8 = chief2.getAccountType();
        chief2.logout();
        chief2.logout();
        chief2.viewProfile();
        java.lang.String str12 = chief2.getAccountType();
        java.lang.String str13 = chief2.getID();
        chief2.logout();
        chief2.logout();
        java.lang.String str16 = chief2.getAccountType();
        chief2.setVerified(true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "chief" + "'", str8, "chief");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "chief" + "'", str12, "chief");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "chief" + "'", str13, "chief");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "chief" + "'", str16, "chief");
    }

    @Test
    public void test15637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15637");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        java.lang.String str4 = chief2.getAccountType();
        java.lang.String str5 = chief2.getID();
        double double6 = chief2.getHourlyRate();
        java.lang.String str7 = chief2.getEmail();
        chief2.logout();
        chief2.login("hi!", "");
        java.lang.String str12 = chief2.getID();
        java.lang.String str13 = chief2.getEmail();
        java.lang.String str14 = chief2.getPassword();
        chief2.login("", "chief");
        chief2.setVerified(false);
        java.lang.Class<?> wildcardClass20 = chief2.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "chief" + "'", str12, "chief");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test15638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15638");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.setVerified(false);
        chief2.login("hi!", "hi!");
        chief2.setVerified(false);
        boolean boolean10 = chief2.isVerified();
        chief2.setVerified(false);
        java.lang.String str13 = chief2.getAccountType();
        java.lang.String str14 = chief2.getPassword();
        java.lang.String str15 = chief2.getID();
        chief2.viewProfile();
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "chief" + "'", str13, "chief");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "chief" + "'", str15, "chief");
    }

    @Test
    public void test15639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15639");
        model.Chief chief2 = new model.Chief("hi!", "");
        java.lang.String str3 = chief2.getAccountType();
        java.lang.String str4 = chief2.getID();
        java.lang.String str5 = chief2.getID();
        chief2.login("", "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "chief" + "'", str3, "chief");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
    }

    @Test
    public void test15640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15640");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.viewProfile();
        java.lang.String str4 = chief2.getPassword();
        chief2.logout();
        java.lang.String str6 = chief2.getID();
        chief2.setVerified(false);
        chief2.viewProfile();
        double double10 = chief2.getHourlyRate();
        java.lang.String str11 = chief2.getAccountType();
        java.lang.String str12 = chief2.getID();
        java.lang.String str13 = chief2.getEmail();
        double double14 = chief2.getHourlyRate();
        java.lang.String str15 = chief2.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "chief" + "'", str6, "chief");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "chief" + "'", str11, "chief");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "chief" + "'", str12, "chief");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "chief" + "'", str15, "chief");
    }

    @Test
    public void test15641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15641");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        chief2.logout();
        java.lang.String str5 = chief2.getAccountType();
        chief2.login("hi!", "chief");
        chief2.login("hi!", "chief");
        java.lang.String str12 = chief2.getAccountType();
        java.lang.String str13 = chief2.getAccountType();
        double double14 = chief2.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "chief" + "'", str12, "chief");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "chief" + "'", str13, "chief");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test15642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15642");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        chief2.viewProfile();
        chief2.setVerified(false);
        chief2.logout();
        chief2.logout();
        java.lang.String str9 = chief2.getPassword();
        chief2.viewProfile();
        chief2.setVerified(false);
        chief2.setVerified(true);
        chief2.setVerified(false);
        chief2.setVerified(false);
        chief2.viewProfile();
        chief2.viewProfile();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test15643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15643");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.viewProfile();
        java.lang.String str4 = chief2.getPassword();
        chief2.logout();
        java.lang.String str6 = chief2.getID();
        chief2.viewProfile();
        chief2.viewProfile();
        double double9 = chief2.getHourlyRate();
        chief2.login("hi!", "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "chief" + "'", str6, "chief");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test15644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15644");
        model.Chief chief2 = new model.Chief("hi!", "");
        java.lang.String str3 = chief2.getID();
        chief2.viewProfile();
        chief2.login("", "");
        java.lang.String str8 = chief2.getAccountType();
        double double9 = chief2.getHourlyRate();
        java.lang.String str10 = chief2.getID();
        boolean boolean11 = chief2.isVerified();
        java.lang.String str12 = chief2.getEmail();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "chief" + "'", str3, "chief");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "chief" + "'", str8, "chief");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "chief" + "'", str10, "chief");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test15645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15645");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.viewProfile();
        java.lang.String str4 = chief2.getPassword();
        java.lang.String str5 = chief2.getEmail();
        java.lang.String str6 = chief2.getID();
        double double7 = chief2.getHourlyRate();
        java.lang.String str8 = chief2.getID();
        chief2.login("hi!", "chief");
        chief2.setVerified(false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "chief" + "'", str6, "chief");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "chief" + "'", str8, "chief");
    }

    @Test
    public void test15646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15646");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        java.lang.String str4 = chief2.getAccountType();
        java.lang.String str5 = chief2.getID();
        boolean boolean6 = chief2.isVerified();
        java.lang.String str7 = chief2.getID();
        boolean boolean8 = chief2.isVerified();
        chief2.viewProfile();
        chief2.logout();
        boolean boolean11 = chief2.isVerified();
        java.lang.String str12 = chief2.getEmail();
        java.lang.String str13 = chief2.getEmail();
        chief2.login("", "chief");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "chief" + "'", str7, "chief");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test15647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15647");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        java.lang.String str4 = chief2.getAccountType();
        java.lang.String str5 = chief2.getID();
        chief2.setVerified(false);
        java.lang.String str8 = chief2.getAccountType();
        chief2.login("hi!", "");
        java.lang.String str12 = chief2.getAccountType();
        java.lang.String str13 = chief2.getEmail();
        java.lang.Class<?> wildcardClass14 = chief2.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "chief" + "'", str8, "chief");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "chief" + "'", str12, "chief");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test15648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15648");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        chief2.logout();
        double double5 = chief2.getHourlyRate();
        java.lang.String str6 = chief2.getEmail();
        boolean boolean7 = chief2.isVerified();
        chief2.logout();
        chief2.login("", "");
        double double12 = chief2.getHourlyRate();
        java.lang.String str13 = chief2.getID();
        java.lang.String str14 = chief2.getPassword();
        java.lang.String str15 = chief2.getPassword();
        java.lang.String str16 = chief2.getPassword();
        java.lang.String str17 = chief2.getID();
        java.lang.String str18 = chief2.getAccountType();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "chief" + "'", str13, "chief");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "chief" + "'", str17, "chief");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "chief" + "'", str18, "chief");
    }

    @Test
    public void test15649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15649");
        model.Chief chief2 = new model.Chief("hi!", "");
        java.lang.String str3 = chief2.getID();
        chief2.viewProfile();
        chief2.login("", "");
        double double8 = chief2.getHourlyRate();
        chief2.setVerified(true);
        chief2.login("", "chief");
        chief2.login("", "hi!");
        java.lang.String str17 = chief2.getAccountType();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "chief" + "'", str3, "chief");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "chief" + "'", str17, "chief");
    }

    @Test
    public void test15650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15650");
        model.Chief chief2 = new model.Chief("hi!", "");
        java.lang.String str3 = chief2.getID();
        chief2.logout();
        java.lang.String str5 = chief2.getID();
        java.lang.String str6 = chief2.getEmail();
        chief2.setVerified(false);
        chief2.login("", "chief");
        java.lang.String str12 = chief2.getPassword();
        chief2.viewProfile();
        java.lang.String str14 = chief2.getAccountType();
        chief2.logout();
        java.lang.String str16 = chief2.getEmail();
        java.lang.Class<?> wildcardClass17 = chief2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "chief" + "'", str3, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "chief" + "'", str14, "chief");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test15651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15651");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.setVerified(false);
        chief2.logout();
        java.lang.String str6 = chief2.getAccountType();
        chief2.setVerified(true);
        boolean boolean9 = chief2.isVerified();
        chief2.viewProfile();
        chief2.logout();
        java.lang.String str12 = chief2.getAccountType();
        chief2.logout();
        double double14 = chief2.getHourlyRate();
        java.lang.Class<?> wildcardClass15 = chief2.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "chief" + "'", str6, "chief");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "chief" + "'", str12, "chief");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test15652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15652");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        java.lang.String str4 = chief2.getAccountType();
        java.lang.String str5 = chief2.getPassword();
        java.lang.String str6 = chief2.getEmail();
        boolean boolean7 = chief2.isVerified();
        chief2.login("", "chief");
        chief2.logout();
        chief2.login("chief", "");
        java.lang.String str15 = chief2.getAccountType();
        java.lang.String str16 = chief2.getAccountType();
        chief2.login("chief", "");
        java.lang.String str20 = chief2.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "chief" + "'", str15, "chief");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "chief" + "'", str16, "chief");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test15653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15653");
        model.Chief chief2 = new model.Chief("hi!", "");
        java.lang.String str3 = chief2.getID();
        java.lang.String str4 = chief2.getPassword();
        java.lang.String str5 = chief2.getPassword();
        java.lang.String str6 = chief2.getID();
        boolean boolean7 = chief2.isVerified();
        chief2.logout();
        java.lang.String str9 = chief2.getID();
        chief2.login("", "hi!");
        boolean boolean13 = chief2.isVerified();
        chief2.login("chief", "chief");
        boolean boolean17 = chief2.isVerified();
        double double18 = chief2.getHourlyRate();
        double double19 = chief2.getHourlyRate();
        chief2.viewProfile();
        java.lang.String str21 = chief2.getID();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "chief" + "'", str3, "chief");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "chief" + "'", str6, "chief");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "chief" + "'", str9, "chief");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "chief" + "'", str21, "chief");
    }

    @Test
    public void test15654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15654");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        java.lang.String str4 = chief2.getAccountType();
        java.lang.String str5 = chief2.getPassword();
        java.lang.String str6 = chief2.getEmail();
        boolean boolean7 = chief2.isVerified();
        chief2.setVerified(true);
        java.lang.String str10 = chief2.getPassword();
        chief2.setVerified(true);
        java.lang.String str13 = chief2.getID();
        chief2.logout();
        java.lang.String str15 = chief2.getEmail();
        java.lang.String str16 = chief2.getID();
        chief2.login("chief", "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "chief" + "'", str13, "chief");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "chief" + "'", str16, "chief");
    }

    @Test
    public void test15655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15655");
        model.Chief chief2 = new model.Chief("hi!", "hi!");
        chief2.setVerified(true);
        chief2.setVerified(true);
        chief2.logout();
        java.lang.String str8 = chief2.getEmail();
        chief2.logout();
        java.lang.String str10 = chief2.getPassword();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test15656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15656");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        java.lang.String str4 = chief2.getAccountType();
        java.lang.String str5 = chief2.getID();
        chief2.viewProfile();
        chief2.setVerified(true);
        java.lang.String str9 = chief2.getPassword();
        chief2.viewProfile();
        chief2.login("chief", "");
        chief2.logout();
        double double15 = chief2.getHourlyRate();
        java.lang.String str16 = chief2.getID();
        java.lang.String str17 = chief2.getID();
        double double18 = chief2.getHourlyRate();
        chief2.setVerified(true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "chief" + "'", str16, "chief");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "chief" + "'", str17, "chief");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
    }

    @Test
    public void test15657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15657");
        model.Chief chief2 = new model.Chief("hi!", "");
        java.lang.String str3 = chief2.getPassword();
        chief2.viewProfile();
        java.lang.String str5 = chief2.getPassword();
        chief2.login("", "");
        double double9 = chief2.getHourlyRate();
        chief2.logout();
        java.lang.String str11 = chief2.getAccountType();
        java.lang.String str12 = chief2.getPassword();
        java.lang.String str13 = chief2.getID();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "chief" + "'", str11, "chief");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "chief" + "'", str13, "chief");
    }

    @Test
    public void test15658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15658");
        model.Chief chief2 = new model.Chief("", "hi!");
        double double3 = chief2.getHourlyRate();
        java.lang.String str4 = chief2.getPassword();
        java.lang.String str5 = chief2.getPassword();
        chief2.login("", "");
        chief2.viewProfile();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test15659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15659");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.viewProfile();
        java.lang.String str4 = chief2.getPassword();
        chief2.login("", "");
        double double8 = chief2.getHourlyRate();
        double double9 = chief2.getHourlyRate();
        java.lang.String str10 = chief2.getEmail();
        java.lang.String str11 = chief2.getAccountType();
        chief2.logout();
        java.lang.String str13 = chief2.getAccountType();
        chief2.login("chief", "hi!");
        java.lang.String str17 = chief2.getPassword();
        double double18 = chief2.getHourlyRate();
        chief2.viewProfile();
        chief2.viewProfile();
        boolean boolean21 = chief2.isVerified();
        boolean boolean22 = chief2.isVerified();
        chief2.logout();
        java.lang.String str24 = chief2.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "chief" + "'", str11, "chief");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "chief" + "'", str13, "chief");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
    }

    @Test
    public void test15660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15660");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.setVerified(false);
        chief2.logout();
        java.lang.String str6 = chief2.getAccountType();
        boolean boolean7 = chief2.isVerified();
        double double8 = chief2.getHourlyRate();
        java.lang.String str9 = chief2.getEmail();
        double double10 = chief2.getHourlyRate();
        chief2.logout();
        java.lang.String str12 = chief2.getEmail();
        chief2.setVerified(true);
        java.lang.String str15 = chief2.getAccountType();
        chief2.setVerified(false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "chief" + "'", str6, "chief");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "chief" + "'", str15, "chief");
    }

    @Test
    public void test15661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15661");
        model.Chief chief2 = new model.Chief("hi!", "");
        java.lang.String str3 = chief2.getID();
        double double4 = chief2.getHourlyRate();
        chief2.login("hi!", "");
        java.lang.String str8 = chief2.getEmail();
        java.lang.String str9 = chief2.getPassword();
        chief2.logout();
        chief2.setVerified(false);
        double double13 = chief2.getHourlyRate();
        chief2.logout();
        double double15 = chief2.getHourlyRate();
        boolean boolean16 = chief2.isVerified();
        chief2.viewProfile();
        double double18 = chief2.getHourlyRate();
        chief2.logout();
        chief2.setVerified(true);
        java.lang.String str22 = chief2.getEmail();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "chief" + "'", str3, "chief");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
    }

    @Test
    public void test15662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15662");
        model.Chief chief2 = new model.Chief("hi!", "");
        java.lang.String str3 = chief2.getAccountType();
        chief2.setVerified(true);
        java.lang.String str6 = chief2.getEmail();
        chief2.viewProfile();
        chief2.logout();
        chief2.setVerified(false);
        chief2.logout();
        chief2.login("hi!", "hi!");
        chief2.login("", "");
        java.lang.String str18 = chief2.getPassword();
        boolean boolean19 = chief2.isVerified();
        java.lang.String str20 = chief2.getPassword();
        chief2.logout();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "chief" + "'", str3, "chief");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test15663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15663");
        model.Chief chief2 = new model.Chief("hi!", "");
        java.lang.String str3 = chief2.getID();
        double double4 = chief2.getHourlyRate();
        chief2.login("hi!", "");
        java.lang.String str8 = chief2.getEmail();
        java.lang.String str9 = chief2.getPassword();
        chief2.logout();
        double double11 = chief2.getHourlyRate();
        java.lang.String str12 = chief2.getAccountType();
        java.lang.String str13 = chief2.getPassword();
        chief2.viewProfile();
        chief2.viewProfile();
        java.lang.String str16 = chief2.getPassword();
        java.lang.String str17 = chief2.getAccountType();
        chief2.logout();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "chief" + "'", str3, "chief");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "chief" + "'", str12, "chief");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "chief" + "'", str17, "chief");
    }

    @Test
    public void test15664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15664");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.viewProfile();
        java.lang.String str4 = chief2.getPassword();
        chief2.logout();
        java.lang.String str6 = chief2.getID();
        chief2.setVerified(false);
        chief2.viewProfile();
        java.lang.String str10 = chief2.getID();
        boolean boolean11 = chief2.isVerified();
        chief2.viewProfile();
        chief2.logout();
        chief2.logout();
        java.lang.String str15 = chief2.getEmail();
        java.lang.String str16 = chief2.getID();
        java.lang.String str17 = chief2.getAccountType();
        chief2.viewProfile();
        java.lang.Class<?> wildcardClass19 = chief2.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "chief" + "'", str6, "chief");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "chief" + "'", str10, "chief");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "chief" + "'", str16, "chief");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "chief" + "'", str17, "chief");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test15665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15665");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        chief2.logout();
        java.lang.String str5 = chief2.getAccountType();
        chief2.login("hi!", "chief");
        chief2.login("hi!", "chief");
        chief2.login("chief", "chief");
        chief2.login("hi!", "");
        java.lang.String str18 = chief2.getAccountType();
        java.lang.Class<?> wildcardClass19 = chief2.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "chief" + "'", str18, "chief");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test15666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15666");
        model.Chief chief2 = new model.Chief("hi!", "");
        java.lang.String str3 = chief2.getID();
        chief2.logout();
        chief2.login("hi!", "");
        chief2.setVerified(true);
        boolean boolean10 = chief2.isVerified();
        chief2.setVerified(false);
        chief2.login("", "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "chief" + "'", str3, "chief");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test15667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15667");
        model.Chief chief2 = new model.Chief("hi!", "");
        java.lang.String str3 = chief2.getID();
        double double4 = chief2.getHourlyRate();
        chief2.viewProfile();
        java.lang.String str6 = chief2.getAccountType();
        double double7 = chief2.getHourlyRate();
        chief2.viewProfile();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "chief" + "'", str3, "chief");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "chief" + "'", str6, "chief");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test15668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15668");
        model.Chief chief2 = new model.Chief("hi!", "");
        java.lang.String str3 = chief2.getID();
        chief2.logout();
        java.lang.String str5 = chief2.getEmail();
        java.lang.String str6 = chief2.getPassword();
        java.lang.String str7 = chief2.getPassword();
        java.lang.String str8 = chief2.getAccountType();
        chief2.setVerified(true);
        java.lang.String str11 = chief2.getID();
        chief2.logout();
        boolean boolean13 = chief2.isVerified();
        chief2.logout();
        java.lang.String str15 = chief2.getEmail();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "chief" + "'", str3, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "chief" + "'", str8, "chief");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "chief" + "'", str11, "chief");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test15669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15669");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        double double4 = chief2.getHourlyRate();
        java.lang.String str5 = chief2.getID();
        java.lang.String str6 = chief2.getAccountType();
        java.lang.String str7 = chief2.getAccountType();
        boolean boolean8 = chief2.isVerified();
        java.lang.String str9 = chief2.getID();
        java.lang.String str10 = chief2.getEmail();
        java.lang.String str11 = chief2.getEmail();
        java.lang.String str12 = chief2.getAccountType();
        java.lang.String str13 = chief2.getPassword();
        chief2.login("chief", "chief");
        chief2.login("", "chief");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "chief" + "'", str6, "chief");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "chief" + "'", str7, "chief");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "chief" + "'", str9, "chief");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "chief" + "'", str12, "chief");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test15670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15670");
        model.Chief chief2 = new model.Chief("", "chief");
        chief2.setVerified(false);
        java.lang.String str5 = chief2.getPassword();
        java.lang.String str6 = chief2.getAccountType();
        chief2.logout();
        chief2.viewProfile();
        boolean boolean9 = chief2.isVerified();
        java.lang.String str10 = chief2.getEmail();
        chief2.setVerified(false);
        java.lang.String str13 = chief2.getID();
        chief2.login("chief", "");
        java.lang.String str17 = chief2.getEmail();
        chief2.logout();
        chief2.viewProfile();
        java.lang.String str20 = chief2.getID();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "chief" + "'", str6, "chief");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "chief" + "'", str13, "chief");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "chief" + "'", str20, "chief");
    }

    @Test
    public void test15671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15671");
        model.Chief chief2 = new model.Chief("", "chief");
        chief2.setVerified(false);
        java.lang.String str5 = chief2.getPassword();
        java.lang.String str6 = chief2.getID();
        chief2.logout();
        java.lang.String str8 = chief2.getID();
        chief2.setVerified(true);
        java.lang.String str11 = chief2.getAccountType();
        chief2.login("hi!", "hi!");
        double double15 = chief2.getHourlyRate();
        double double16 = chief2.getHourlyRate();
        chief2.login("", "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "chief" + "'", str6, "chief");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "chief" + "'", str8, "chief");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "chief" + "'", str11, "chief");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
    }

    @Test
    public void test15672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15672");
        model.Chief chief2 = new model.Chief("chief", "");
        chief2.logout();
        chief2.logout();
        java.lang.String str5 = chief2.getAccountType();
        boolean boolean6 = chief2.isVerified();
        chief2.setVerified(false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test15673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15673");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        double double4 = chief2.getHourlyRate();
        java.lang.String str5 = chief2.getID();
        chief2.setVerified(true);
        chief2.logout();
        chief2.login("hi!", "hi!");
        chief2.setVerified(true);
        boolean boolean14 = chief2.isVerified();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test15674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15674");
        model.Chief chief2 = new model.Chief("hi!", "");
        java.lang.String str3 = chief2.getID();
        chief2.viewProfile();
        chief2.login("", "");
        double double8 = chief2.getHourlyRate();
        chief2.login("hi!", "");
        chief2.logout();
        java.lang.String str13 = chief2.getPassword();
        java.lang.String str14 = chief2.getID();
        double double15 = chief2.getHourlyRate();
        boolean boolean16 = chief2.isVerified();
        chief2.login("chief", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "chief" + "'", str3, "chief");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "chief" + "'", str14, "chief");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test15675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15675");
        model.Chief chief2 = new model.Chief("chief", "");
        boolean boolean3 = chief2.isVerified();
        java.lang.String str4 = chief2.getID();
        java.lang.String str5 = chief2.getPassword();
        double double6 = chief2.getHourlyRate();
        chief2.viewProfile();
        java.lang.String str8 = chief2.getPassword();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test15676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15676");
        model.Chief chief2 = new model.Chief("", "chief");
        chief2.setVerified(false);
        java.lang.String str5 = chief2.getPassword();
        java.lang.String str6 = chief2.getAccountType();
        chief2.logout();
        double double8 = chief2.getHourlyRate();
        double double9 = chief2.getHourlyRate();
        chief2.logout();
        chief2.viewProfile();
        java.lang.String str12 = chief2.getPassword();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "chief" + "'", str6, "chief");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "chief" + "'", str12, "chief");
    }

    @Test
    public void test15677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15677");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        java.lang.String str4 = chief2.getAccountType();
        java.lang.String str5 = chief2.getID();
        double double6 = chief2.getHourlyRate();
        java.lang.String str7 = chief2.getEmail();
        chief2.logout();
        java.lang.String str9 = chief2.getID();
        chief2.login("hi!", "chief");
        chief2.logout();
        java.lang.String str14 = chief2.getAccountType();
        double double15 = chief2.getHourlyRate();
        java.lang.String str16 = chief2.getID();
        boolean boolean17 = chief2.isVerified();
        double double18 = chief2.getHourlyRate();
        chief2.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "chief" + "'", str9, "chief");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "chief" + "'", str14, "chief");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "chief" + "'", str16, "chief");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
    }

    @Test
    public void test15678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15678");
        model.Chief chief2 = new model.Chief("hi!", "");
        java.lang.String str3 = chief2.getID();
        chief2.logout();
        java.lang.String str5 = chief2.getEmail();
        java.lang.String str6 = chief2.getPassword();
        java.lang.String str7 = chief2.getPassword();
        chief2.setVerified(true);
        chief2.setVerified(false);
        double double12 = chief2.getHourlyRate();
        double double13 = chief2.getHourlyRate();
        java.lang.String str14 = chief2.getPassword();
        chief2.logout();
        chief2.login("hi!", "");
        chief2.logout();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "chief" + "'", str3, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test15679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15679");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        java.lang.String str4 = chief2.getAccountType();
        java.lang.String str5 = chief2.getID();
        chief2.viewProfile();
        chief2.setVerified(true);
        boolean boolean9 = chief2.isVerified();
        java.lang.String str10 = chief2.getEmail();
        java.lang.String str11 = chief2.getEmail();
        java.lang.String str12 = chief2.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test15680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15680");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.viewProfile();
        java.lang.String str4 = chief2.getPassword();
        chief2.login("", "");
        java.lang.String str8 = chief2.getAccountType();
        chief2.logout();
        chief2.logout();
        chief2.viewProfile();
        java.lang.String str12 = chief2.getAccountType();
        java.lang.String str13 = chief2.getID();
        java.lang.String str14 = chief2.getID();
        chief2.viewProfile();
        chief2.viewProfile();
        chief2.viewProfile();
        java.lang.String str18 = chief2.getEmail();
        java.lang.Class<?> wildcardClass19 = chief2.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "chief" + "'", str8, "chief");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "chief" + "'", str12, "chief");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "chief" + "'", str13, "chief");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "chief" + "'", str14, "chief");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test15681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15681");
        model.Chief chief2 = new model.Chief("hi!", "");
        java.lang.String str3 = chief2.getPassword();
        chief2.logout();
        boolean boolean5 = chief2.isVerified();
        chief2.viewProfile();
        java.lang.String str7 = chief2.getID();
        java.lang.String str8 = chief2.getPassword();
        java.lang.String str9 = chief2.getID();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "chief" + "'", str7, "chief");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "chief" + "'", str9, "chief");
    }

    @Test
    public void test15682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15682");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        chief2.logout();
        double double5 = chief2.getHourlyRate();
        java.lang.String str6 = chief2.getEmail();
        boolean boolean7 = chief2.isVerified();
        chief2.logout();
        chief2.login("", "");
        double double12 = chief2.getHourlyRate();
        java.lang.String str13 = chief2.getID();
        java.lang.String str14 = chief2.getAccountType();
        chief2.viewProfile();
        boolean boolean16 = chief2.isVerified();
        java.lang.String str17 = chief2.getID();
        java.lang.String str18 = chief2.getEmail();
        chief2.logout();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "chief" + "'", str13, "chief");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "chief" + "'", str14, "chief");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "chief" + "'", str17, "chief");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test15683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15683");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        java.lang.String str4 = chief2.getAccountType();
        java.lang.String str5 = chief2.getID();
        boolean boolean6 = chief2.isVerified();
        chief2.logout();
        double double8 = chief2.getHourlyRate();
        chief2.setVerified(false);
        java.lang.String str11 = chief2.getID();
        boolean boolean12 = chief2.isVerified();
        chief2.setVerified(false);
        java.lang.String str15 = chief2.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "chief" + "'", str11, "chief");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "chief" + "'", str15, "chief");
    }

    @Test
    public void test15684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15684");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.viewProfile();
        java.lang.String str4 = chief2.getPassword();
        chief2.login("", "");
        chief2.setVerified(true);
        chief2.logout();
        java.lang.String str11 = chief2.getEmail();
        chief2.setVerified(false);
        java.lang.String str14 = chief2.getPassword();
        boolean boolean15 = chief2.isVerified();
        boolean boolean16 = chief2.isVerified();
        boolean boolean17 = chief2.isVerified();
        java.lang.String str18 = chief2.getPassword();
        chief2.setVerified(true);
        boolean boolean21 = chief2.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test15685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15685");
        model.Chief chief2 = new model.Chief("hi!", "");
        java.lang.String str3 = chief2.getID();
        double double4 = chief2.getHourlyRate();
        chief2.login("hi!", "");
        java.lang.String str8 = chief2.getPassword();
        java.lang.String str9 = chief2.getID();
        java.lang.String str10 = chief2.getAccountType();
        boolean boolean11 = chief2.isVerified();
        java.lang.String str12 = chief2.getID();
        chief2.viewProfile();
        chief2.viewProfile();
        java.lang.String str15 = chief2.getAccountType();
        chief2.login("chief", "");
        boolean boolean19 = chief2.isVerified();
        chief2.login("hi!", "chief");
        java.lang.String str23 = chief2.getAccountType();
        java.lang.String str24 = chief2.getPassword();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "chief" + "'", str3, "chief");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "chief" + "'", str9, "chief");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "chief" + "'", str10, "chief");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "chief" + "'", str12, "chief");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "chief" + "'", str15, "chief");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "chief" + "'", str23, "chief");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test15686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15686");
        model.Chief chief2 = new model.Chief("hi!", "");
        java.lang.String str3 = chief2.getID();
        java.lang.String str4 = chief2.getPassword();
        chief2.logout();
        boolean boolean6 = chief2.isVerified();
        java.lang.String str7 = chief2.getAccountType();
        java.lang.String str8 = chief2.getPassword();
        boolean boolean9 = chief2.isVerified();
        chief2.logout();
        java.lang.String str11 = chief2.getAccountType();
        chief2.viewProfile();
        chief2.viewProfile();
        double double14 = chief2.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "chief" + "'", str3, "chief");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "chief" + "'", str7, "chief");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "chief" + "'", str11, "chief");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test15687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15687");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        java.lang.String str4 = chief2.getAccountType();
        java.lang.String str5 = chief2.getID();
        double double6 = chief2.getHourlyRate();
        java.lang.String str7 = chief2.getID();
        boolean boolean8 = chief2.isVerified();
        java.lang.String str9 = chief2.getPassword();
        double double10 = chief2.getHourlyRate();
        chief2.login("", "chief");
        java.lang.String str14 = chief2.getAccountType();
        java.lang.String str15 = chief2.getEmail();
        java.lang.String str16 = chief2.getID();
        java.lang.String str17 = chief2.getAccountType();
        boolean boolean18 = chief2.isVerified();
        java.lang.String str19 = chief2.getAccountType();
        chief2.setVerified(false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "chief" + "'", str7, "chief");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "chief" + "'", str14, "chief");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "chief" + "'", str16, "chief");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "chief" + "'", str17, "chief");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "chief" + "'", str19, "chief");
    }

    @Test
    public void test15688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15688");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.setVerified(false);
        chief2.logout();
        java.lang.String str6 = chief2.getEmail();
        java.lang.String str7 = chief2.getAccountType();
        java.lang.String str8 = chief2.getEmail();
        chief2.viewProfile();
        java.lang.String str10 = chief2.getEmail();
        double double11 = chief2.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "chief" + "'", str7, "chief");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test15689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15689");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.viewProfile();
        java.lang.String str4 = chief2.getPassword();
        chief2.logout();
        java.lang.String str6 = chief2.getID();
        chief2.setVerified(false);
        chief2.viewProfile();
        java.lang.String str10 = chief2.getID();
        boolean boolean11 = chief2.isVerified();
        chief2.viewProfile();
        chief2.logout();
        chief2.logout();
        chief2.login("", "hi!");
        java.lang.String str18 = chief2.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "chief" + "'", str6, "chief");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "chief" + "'", str10, "chief");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "chief" + "'", str18, "chief");
    }

    @Test
    public void test15690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15690");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        java.lang.String str4 = chief2.getAccountType();
        java.lang.String str5 = chief2.getID();
        chief2.viewProfile();
        chief2.setVerified(true);
        java.lang.String str9 = chief2.getPassword();
        chief2.viewProfile();
        java.lang.String str11 = chief2.getEmail();
        java.lang.String str12 = chief2.getID();
        java.lang.String str13 = chief2.getEmail();
        java.lang.String str14 = chief2.getEmail();
        chief2.viewProfile();
        java.lang.String str16 = chief2.getID();
        chief2.setVerified(true);
        java.lang.String str19 = chief2.getAccountType();
        chief2.login("", "hi!");
        java.lang.String str23 = chief2.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "chief" + "'", str12, "chief");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "chief" + "'", str16, "chief");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "chief" + "'", str19, "chief");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test15691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15691");
        model.Chief chief2 = new model.Chief("", "chief");
        chief2.setVerified(false);
        chief2.logout();
        java.lang.String str6 = chief2.getPassword();
        chief2.logout();
        chief2.login("", "chief");
        boolean boolean11 = chief2.isVerified();
        chief2.logout();
        chief2.setVerified(false);
        chief2.logout();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "chief" + "'", str6, "chief");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test15692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15692");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.viewProfile();
        java.lang.String str4 = chief2.getPassword();
        chief2.login("", "");
        double double8 = chief2.getHourlyRate();
        double double9 = chief2.getHourlyRate();
        java.lang.String str10 = chief2.getEmail();
        java.lang.String str11 = chief2.getAccountType();
        chief2.logout();
        java.lang.String str13 = chief2.getAccountType();
        java.lang.String str14 = chief2.getAccountType();
        boolean boolean15 = chief2.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "chief" + "'", str11, "chief");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "chief" + "'", str13, "chief");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "chief" + "'", str14, "chief");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test15693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15693");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        chief2.viewProfile();
        chief2.setVerified(false);
        chief2.logout();
        chief2.logout();
        java.lang.String str9 = chief2.getEmail();
        chief2.login("", "chief");
        boolean boolean13 = chief2.isVerified();
        chief2.setVerified(false);
        chief2.login("chief", "hi!");
        chief2.setVerified(true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test15694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15694");
        model.Chief chief2 = new model.Chief("", "chief");
        chief2.logout();
        boolean boolean4 = chief2.isVerified();
        chief2.viewProfile();
        chief2.login("hi!", "hi!");
        chief2.logout();
        chief2.logout();
        chief2.setVerified(false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test15695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15695");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        java.lang.String str4 = chief2.getAccountType();
        java.lang.String str5 = chief2.getID();
        java.lang.String str6 = chief2.getEmail();
        java.lang.String str7 = chief2.getID();
        java.lang.String str8 = chief2.getEmail();
        chief2.login("hi!", "chief");
        boolean boolean12 = chief2.isVerified();
        chief2.login("chief", "chief");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "chief" + "'", str7, "chief");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test15696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15696");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.viewProfile();
        java.lang.String str4 = chief2.getPassword();
        chief2.login("", "");
        double double8 = chief2.getHourlyRate();
        double double9 = chief2.getHourlyRate();
        java.lang.String str10 = chief2.getEmail();
        java.lang.String str11 = chief2.getEmail();
        java.lang.String str12 = chief2.getID();
        chief2.viewProfile();
        chief2.viewProfile();
        java.lang.String str15 = chief2.getEmail();
        double double16 = chief2.getHourlyRate();
        double double17 = chief2.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "chief" + "'", str12, "chief");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
    }

    @Test
    public void test15697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15697");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        chief2.logout();
        double double5 = chief2.getHourlyRate();
        java.lang.String str6 = chief2.getEmail();
        java.lang.String str7 = chief2.getPassword();
        chief2.login("chief", "chief");
        chief2.setVerified(false);
        chief2.login("hi!", "chief");
        chief2.logout();
        chief2.viewProfile();
        chief2.setVerified(false);
        boolean boolean20 = chief2.isVerified();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test15698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15698");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.viewProfile();
        java.lang.String str4 = chief2.getPassword();
        chief2.viewProfile();
        chief2.login("", "");
        chief2.logout();
        double double10 = chief2.getHourlyRate();
        boolean boolean11 = chief2.isVerified();
        chief2.logout();
        double double13 = chief2.getHourlyRate();
        java.lang.String str14 = chief2.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "chief" + "'", str14, "chief");
    }

    @Test
    public void test15699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15699");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.viewProfile();
        java.lang.String str4 = chief2.getPassword();
        chief2.login("", "");
        chief2.login("chief", "hi!");
        chief2.logout();
        java.lang.Class<?> wildcardClass12 = chief2.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test15700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15700");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        chief2.logout();
        java.lang.String str5 = chief2.getAccountType();
        chief2.login("hi!", "chief");
        chief2.login("hi!", "chief");
        double double12 = chief2.getHourlyRate();
        boolean boolean13 = chief2.isVerified();
        chief2.viewProfile();
        chief2.logout();
        chief2.setVerified(true);
        boolean boolean18 = chief2.isVerified();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test15701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15701");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.viewProfile();
        java.lang.String str4 = chief2.getPassword();
        chief2.login("", "");
        double double8 = chief2.getHourlyRate();
        double double9 = chief2.getHourlyRate();
        java.lang.String str10 = chief2.getEmail();
        java.lang.String str11 = chief2.getEmail();
        java.lang.String str12 = chief2.getID();
        chief2.viewProfile();
        chief2.viewProfile();
        java.lang.String str15 = chief2.getEmail();
        java.lang.String str16 = chief2.getAccountType();
        java.lang.String str17 = chief2.getPassword();
        java.lang.String str18 = chief2.getPassword();
        chief2.setVerified(true);
        java.lang.String str21 = chief2.getID();
        java.lang.String str22 = chief2.getID();
        java.lang.String str23 = chief2.getID();
        chief2.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "chief" + "'", str12, "chief");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "chief" + "'", str16, "chief");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "chief" + "'", str21, "chief");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "chief" + "'", str22, "chief");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "chief" + "'", str23, "chief");
    }

    @Test
    public void test15702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15702");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        java.lang.String str4 = chief2.getAccountType();
        java.lang.String str5 = chief2.getPassword();
        java.lang.String str6 = chief2.getEmail();
        boolean boolean7 = chief2.isVerified();
        chief2.setVerified(true);
        java.lang.String str10 = chief2.getAccountType();
        java.lang.String str11 = chief2.getPassword();
        java.lang.String str12 = chief2.getAccountType();
        chief2.logout();
        chief2.logout();
        java.lang.String str15 = chief2.getID();
        java.lang.Class<?> wildcardClass16 = chief2.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "chief" + "'", str10, "chief");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "chief" + "'", str12, "chief");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "chief" + "'", str15, "chief");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test15703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15703");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.viewProfile();
        java.lang.String str4 = chief2.getPassword();
        chief2.login("", "");
        chief2.setVerified(true);
        java.lang.String str10 = chief2.getPassword();
        chief2.setVerified(false);
        chief2.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test15704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15704");
        model.Chief chief2 = new model.Chief("", "chief");
        chief2.setVerified(false);
        java.lang.String str5 = chief2.getPassword();
        java.lang.String str6 = chief2.getAccountType();
        boolean boolean7 = chief2.isVerified();
        boolean boolean8 = chief2.isVerified();
        java.lang.String str9 = chief2.getEmail();
        chief2.setVerified(false);
        double double12 = chief2.getHourlyRate();
        java.lang.String str13 = chief2.getID();
        java.lang.String str14 = chief2.getPassword();
        boolean boolean15 = chief2.isVerified();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "chief" + "'", str6, "chief");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "chief" + "'", str13, "chief");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "chief" + "'", str14, "chief");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test15705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15705");
        model.Chief chief2 = new model.Chief("hi!", "");
        java.lang.String str3 = chief2.getID();
        java.lang.String str4 = chief2.getPassword();
        chief2.logout();
        boolean boolean6 = chief2.isVerified();
        java.lang.String str7 = chief2.getAccountType();
        chief2.login("hi!", "hi!");
        double double11 = chief2.getHourlyRate();
        java.lang.String str12 = chief2.getAccountType();
        java.lang.String str13 = chief2.getEmail();
        double double14 = chief2.getHourlyRate();
        chief2.viewProfile();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "chief" + "'", str3, "chief");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "chief" + "'", str7, "chief");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "chief" + "'", str12, "chief");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test15706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15706");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        java.lang.String str4 = chief2.getAccountType();
        java.lang.String str5 = chief2.getID();
        chief2.viewProfile();
        chief2.setVerified(true);
        java.lang.String str9 = chief2.getPassword();
        boolean boolean10 = chief2.isVerified();
        java.lang.String str11 = chief2.getID();
        boolean boolean12 = chief2.isVerified();
        java.lang.Class<?> wildcardClass13 = chief2.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "chief" + "'", str11, "chief");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test15707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15707");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        java.lang.String str4 = chief2.getAccountType();
        java.lang.String str5 = chief2.getID();
        chief2.viewProfile();
        chief2.setVerified(true);
        java.lang.String str9 = chief2.getPassword();
        chief2.viewProfile();
        java.lang.String str11 = chief2.getEmail();
        double double12 = chief2.getHourlyRate();
        boolean boolean13 = chief2.isVerified();
        java.lang.String str14 = chief2.getID();
        chief2.viewProfile();
        boolean boolean16 = chief2.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "chief" + "'", str14, "chief");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test15708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15708");
        model.Chief chief2 = new model.Chief("", "hi!");
        double double3 = chief2.getHourlyRate();
        java.lang.String str4 = chief2.getPassword();
        java.lang.String str5 = chief2.getEmail();
        double double6 = chief2.getHourlyRate();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test15709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15709");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        java.lang.String str4 = chief2.getID();
        chief2.logout();
        chief2.setVerified(false);
        java.lang.String str8 = chief2.getPassword();
        chief2.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test15710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15710");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.viewProfile();
        java.lang.String str4 = chief2.getPassword();
        java.lang.String str5 = chief2.getEmail();
        java.lang.String str6 = chief2.getID();
        chief2.logout();
        java.lang.String str8 = chief2.getPassword();
        chief2.login("chief", "chief");
        chief2.setVerified(true);
        boolean boolean14 = chief2.isVerified();
        chief2.viewProfile();
        java.lang.String str16 = chief2.getAccountType();
        boolean boolean17 = chief2.isVerified();
        chief2.viewProfile();
        chief2.login("chief", "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "chief" + "'", str6, "chief");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "chief" + "'", str16, "chief");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test15711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15711");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        java.lang.String str4 = chief2.getAccountType();
        java.lang.String str5 = chief2.getID();
        chief2.viewProfile();
        chief2.setVerified(true);
        double double9 = chief2.getHourlyRate();
        chief2.viewProfile();
        java.lang.String str11 = chief2.getEmail();
        java.lang.String str12 = chief2.getEmail();
        java.lang.String str13 = chief2.getID();
        java.lang.String str14 = chief2.getID();
        boolean boolean15 = chief2.isVerified();
        java.lang.String str16 = chief2.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "chief" + "'", str13, "chief");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "chief" + "'", str14, "chief");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "chief" + "'", str16, "chief");
    }

    @Test
    public void test15712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15712");
        model.Chief chief2 = new model.Chief("", "chief");
        java.lang.String str3 = chief2.getPassword();
        java.lang.String str4 = chief2.getPassword();
        boolean boolean5 = chief2.isVerified();
        java.lang.String str6 = chief2.getEmail();
        java.lang.String str7 = chief2.getEmail();
        chief2.logout();
        chief2.login("chief", "");
        chief2.setVerified(false);
        chief2.setVerified(false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "chief" + "'", str3, "chief");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test15713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15713");
        model.Chief chief2 = new model.Chief("hi!", "hi!");
        chief2.setVerified(true);
        double double5 = chief2.getHourlyRate();
        java.lang.String str6 = chief2.getID();
        java.lang.String str7 = chief2.getPassword();
        chief2.setVerified(false);
        chief2.logout();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "chief" + "'", str6, "chief");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test15714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15714");
        model.Chief chief2 = new model.Chief("", "chief");
        chief2.setVerified(false);
        java.lang.String str5 = chief2.getPassword();
        java.lang.String str6 = chief2.getAccountType();
        boolean boolean7 = chief2.isVerified();
        boolean boolean8 = chief2.isVerified();
        java.lang.String str9 = chief2.getEmail();
        chief2.setVerified(false);
        java.lang.String str12 = chief2.getEmail();
        chief2.setVerified(false);
        chief2.login("hi!", "chief");
        boolean boolean18 = chief2.isVerified();
        chief2.login("hi!", "chief");
        chief2.setVerified(true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "chief" + "'", str6, "chief");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test15715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15715");
        model.Chief chief2 = new model.Chief("chief", "");
        boolean boolean3 = chief2.isVerified();
        java.lang.String str4 = chief2.getPassword();
        chief2.setVerified(true);
        java.lang.String str7 = chief2.getPassword();
        java.lang.String str8 = chief2.getEmail();
        double double9 = chief2.getHourlyRate();
        chief2.logout();
        chief2.logout();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "chief" + "'", str8, "chief");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test15716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15716");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.viewProfile();
        java.lang.String str4 = chief2.getPassword();
        chief2.logout();
        chief2.logout();
        boolean boolean7 = chief2.isVerified();
        chief2.viewProfile();
        chief2.login("hi!", "hi!");
        java.lang.String str12 = chief2.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test15717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15717");
        model.Chief chief2 = new model.Chief("hi!", "");
        java.lang.String str3 = chief2.getID();
        chief2.viewProfile();
        chief2.login("", "");
        double double8 = chief2.getHourlyRate();
        chief2.setVerified(true);
        java.lang.String str11 = chief2.getEmail();
        double double12 = chief2.getHourlyRate();
        java.lang.String str13 = chief2.getPassword();
        java.lang.String str14 = chief2.getPassword();
        chief2.viewProfile();
        chief2.viewProfile();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "chief" + "'", str3, "chief");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test15718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15718");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        chief2.logout();
        double double5 = chief2.getHourlyRate();
        java.lang.String str6 = chief2.getID();
        chief2.login("hi!", "chief");
        chief2.logout();
        chief2.setVerified(true);
        double double13 = chief2.getHourlyRate();
        java.lang.String str14 = chief2.getID();
        java.lang.String str15 = chief2.getPassword();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "chief" + "'", str6, "chief");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "chief" + "'", str14, "chief");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test15719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15719");
        model.Chief chief2 = new model.Chief("hi!", "");
        java.lang.String str3 = chief2.getID();
        java.lang.String str4 = chief2.getPassword();
        double double5 = chief2.getHourlyRate();
        double double6 = chief2.getHourlyRate();
        java.lang.String str7 = chief2.getPassword();
        boolean boolean8 = chief2.isVerified();
        chief2.logout();
        chief2.setVerified(true);
        java.lang.String str12 = chief2.getAccountType();
        java.lang.String str13 = chief2.getPassword();
        double double14 = chief2.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "chief" + "'", str3, "chief");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "chief" + "'", str12, "chief");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test15720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15720");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        java.lang.String str4 = chief2.getAccountType();
        java.lang.String str5 = chief2.getID();
        chief2.viewProfile();
        chief2.setVerified(true);
        boolean boolean9 = chief2.isVerified();
        chief2.setVerified(true);
        chief2.viewProfile();
        java.lang.String str13 = chief2.getEmail();
        java.lang.Class<?> wildcardClass14 = chief2.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test15721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15721");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        java.lang.String str4 = chief2.getAccountType();
        chief2.logout();
        java.lang.String str6 = chief2.getPassword();
        chief2.login("chief", "");
        chief2.login("chief", "");
        boolean boolean13 = chief2.isVerified();
        chief2.login("chief", "chief");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test15722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15722");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.viewProfile();
        java.lang.String str4 = chief2.getPassword();
        chief2.logout();
        chief2.login("chief", "chief");
        chief2.setVerified(true);
        chief2.viewProfile();
        chief2.viewProfile();
        java.lang.String str13 = chief2.getEmail();
        chief2.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test15723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15723");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        java.lang.String str4 = chief2.getAccountType();
        java.lang.String str5 = chief2.getPassword();
        java.lang.String str6 = chief2.getPassword();
        chief2.setVerified(false);
        java.lang.String str9 = chief2.getID();
        chief2.viewProfile();
        java.lang.String str11 = chief2.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "chief" + "'", str9, "chief");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "chief" + "'", str11, "chief");
    }

    @Test
    public void test15724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15724");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        java.lang.String str4 = chief2.getAccountType();
        java.lang.String str5 = chief2.getPassword();
        java.lang.String str6 = chief2.getEmail();
        boolean boolean7 = chief2.isVerified();
        chief2.login("", "chief");
        chief2.viewProfile();
        java.lang.String str12 = chief2.getID();
        chief2.logout();
        java.lang.String str14 = chief2.getAccountType();
        chief2.setVerified(false);
        java.lang.String str17 = chief2.getID();
        chief2.login("", "");
        chief2.login("", "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "chief" + "'", str12, "chief");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "chief" + "'", str14, "chief");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "chief" + "'", str17, "chief");
    }

    @Test
    public void test15725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15725");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        chief2.viewProfile();
        chief2.setVerified(false);
        chief2.logout();
        chief2.logout();
        java.lang.String str9 = chief2.getPassword();
        chief2.viewProfile();
        chief2.setVerified(false);
        chief2.setVerified(true);
        chief2.setVerified(false);
        boolean boolean17 = chief2.isVerified();
        java.lang.String str18 = chief2.getEmail();
        chief2.viewProfile();
        double double20 = chief2.getHourlyRate();
        java.lang.String str21 = chief2.getEmail();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
    }

    @Test
    public void test15726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15726");
        model.Chief chief2 = new model.Chief("", "chief");
        chief2.logout();
        chief2.login("hi!", "");
        java.lang.String str7 = chief2.getEmail();
        chief2.setVerified(false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test15727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15727");
        model.Chief chief2 = new model.Chief("hi!", "");
        java.lang.String str3 = chief2.getID();
        java.lang.String str4 = chief2.getPassword();
        chief2.logout();
        boolean boolean6 = chief2.isVerified();
        chief2.setVerified(false);
        java.lang.String str9 = chief2.getID();
        boolean boolean10 = chief2.isVerified();
        java.lang.String str11 = chief2.getPassword();
        chief2.login("", "hi!");
        chief2.login("", "hi!");
        java.lang.String str18 = chief2.getAccountType();
        java.lang.String str19 = chief2.getID();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "chief" + "'", str3, "chief");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "chief" + "'", str9, "chief");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "chief" + "'", str18, "chief");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "chief" + "'", str19, "chief");
    }

    @Test
    public void test15728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15728");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        double double4 = chief2.getHourlyRate();
        java.lang.String str5 = chief2.getID();
        java.lang.String str6 = chief2.getAccountType();
        java.lang.String str7 = chief2.getAccountType();
        boolean boolean8 = chief2.isVerified();
        java.lang.String str9 = chief2.getID();
        java.lang.String str10 = chief2.getEmail();
        double double11 = chief2.getHourlyRate();
        double double12 = chief2.getHourlyRate();
        boolean boolean13 = chief2.isVerified();
        chief2.setVerified(true);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "chief" + "'", str6, "chief");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "chief" + "'", str7, "chief");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "chief" + "'", str9, "chief");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test15729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15729");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.viewProfile();
        java.lang.String str4 = chief2.getPassword();
        chief2.login("", "");
        double double8 = chief2.getHourlyRate();
        double double9 = chief2.getHourlyRate();
        java.lang.String str10 = chief2.getEmail();
        java.lang.String str11 = chief2.getEmail();
        java.lang.String str12 = chief2.getID();
        boolean boolean13 = chief2.isVerified();
        boolean boolean14 = chief2.isVerified();
        chief2.setVerified(false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "chief" + "'", str12, "chief");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test15730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15730");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.viewProfile();
        java.lang.String str4 = chief2.getPassword();
        chief2.logout();
        java.lang.String str6 = chief2.getID();
        chief2.setVerified(false);
        chief2.viewProfile();
        java.lang.String str10 = chief2.getID();
        boolean boolean11 = chief2.isVerified();
        chief2.viewProfile();
        chief2.logout();
        chief2.logout();
        java.lang.String str15 = chief2.getEmail();
        chief2.viewProfile();
        chief2.setVerified(true);
        java.lang.String str19 = chief2.getID();
        java.lang.String str20 = chief2.getAccountType();
        double double21 = chief2.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "chief" + "'", str6, "chief");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "chief" + "'", str10, "chief");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "chief" + "'", str19, "chief");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "chief" + "'", str20, "chief");
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
    }

    @Test
    public void test15731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15731");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        java.lang.String str4 = chief2.getAccountType();
        java.lang.String str5 = chief2.getPassword();
        java.lang.String str6 = chief2.getEmail();
        boolean boolean7 = chief2.isVerified();
        chief2.setVerified(true);
        java.lang.String str10 = chief2.getPassword();
        chief2.setVerified(true);
        java.lang.String str13 = chief2.getID();
        chief2.logout();
        java.lang.String str15 = chief2.getEmail();
        java.lang.String str16 = chief2.getAccountType();
        java.lang.String str17 = chief2.getID();
        java.lang.String str18 = chief2.getID();
        double double19 = chief2.getHourlyRate();
        chief2.setVerified(false);
        java.lang.String str22 = chief2.getAccountType();
        double double23 = chief2.getHourlyRate();
        java.lang.String str24 = chief2.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "chief" + "'", str13, "chief");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "chief" + "'", str16, "chief");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "chief" + "'", str17, "chief");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "chief" + "'", str18, "chief");
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "chief" + "'", str22, "chief");
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "chief" + "'", str24, "chief");
    }

    @Test
    public void test15732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15732");
        model.Chief chief2 = new model.Chief("hi!", "");
        java.lang.String str3 = chief2.getID();
        chief2.logout();
        java.lang.String str5 = chief2.getID();
        java.lang.String str6 = chief2.getEmail();
        chief2.login("hi!", "chief");
        chief2.login("", "chief");
        chief2.login("chief", "hi!");
        boolean boolean16 = chief2.isVerified();
        java.lang.String str17 = chief2.getPassword();
        java.lang.String str18 = chief2.getEmail();
        chief2.login("chief", "chief");
        chief2.login("", "hi!");
        chief2.viewProfile();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "chief" + "'", str3, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test15733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15733");
        model.Chief chief2 = new model.Chief("hi!", "");
        java.lang.String str3 = chief2.getID();
        chief2.logout();
        chief2.login("hi!", "");
        boolean boolean8 = chief2.isVerified();
        double double9 = chief2.getHourlyRate();
        chief2.login("hi!", "chief");
        chief2.viewProfile();
        java.lang.String str14 = chief2.getID();
        java.lang.String str15 = chief2.getAccountType();
        double double16 = chief2.getHourlyRate();
        double double17 = chief2.getHourlyRate();
        double double18 = chief2.getHourlyRate();
        chief2.viewProfile();
        java.lang.String str20 = chief2.getID();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "chief" + "'", str3, "chief");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "chief" + "'", str14, "chief");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "chief" + "'", str15, "chief");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "chief" + "'", str20, "chief");
    }

    @Test
    public void test15734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15734");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        java.lang.String str4 = chief2.getID();
        java.lang.String str5 = chief2.getEmail();
        chief2.login("chief", "");
        boolean boolean9 = chief2.isVerified();
        chief2.viewProfile();
        chief2.login("chief", "chief");
        boolean boolean14 = chief2.isVerified();
        chief2.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test15735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15735");
        model.Chief chief2 = new model.Chief("hi!", "");
        java.lang.String str3 = chief2.getAccountType();
        chief2.setVerified(true);
        java.lang.String str6 = chief2.getEmail();
        chief2.viewProfile();
        chief2.logout();
        java.lang.String str9 = chief2.getAccountType();
        java.lang.String str10 = chief2.getPassword();
        double double11 = chief2.getHourlyRate();
        boolean boolean12 = chief2.isVerified();
        java.lang.String str13 = chief2.getPassword();
        double double14 = chief2.getHourlyRate();
        double double15 = chief2.getHourlyRate();
        boolean boolean16 = chief2.isVerified();
        double double17 = chief2.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "chief" + "'", str3, "chief");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "chief" + "'", str9, "chief");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
    }

    @Test
    public void test15736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15736");
        model.Chief chief2 = new model.Chief("hi!", "");
        java.lang.String str3 = chief2.getID();
        chief2.logout();
        java.lang.String str5 = chief2.getAccountType();
        chief2.logout();
        java.lang.String str7 = chief2.getAccountType();
        java.lang.String str8 = chief2.getAccountType();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "chief" + "'", str3, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "chief" + "'", str7, "chief");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "chief" + "'", str8, "chief");
    }

    @Test
    public void test15737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15737");
        model.Chief chief2 = new model.Chief("", "chief");
        chief2.setVerified(false);
        chief2.logout();
        java.lang.String str6 = chief2.getPassword();
        chief2.logout();
        java.lang.String str8 = chief2.getID();
        java.lang.String str9 = chief2.getPassword();
        chief2.logout();
        chief2.logout();
        chief2.setVerified(true);
        java.lang.String str14 = chief2.getEmail();
        chief2.setVerified(true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "chief" + "'", str6, "chief");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "chief" + "'", str8, "chief");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "chief" + "'", str9, "chief");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test15738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15738");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        chief2.logout();
        double double5 = chief2.getHourlyRate();
        java.lang.String str6 = chief2.getEmail();
        boolean boolean7 = chief2.isVerified();
        chief2.logout();
        chief2.login("", "");
        chief2.logout();
        chief2.logout();
        chief2.login("", "chief");
        chief2.setVerified(false);
        java.lang.String str19 = chief2.getAccountType();
        chief2.setVerified(true);
        java.lang.String str22 = chief2.getAccountType();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "chief" + "'", str19, "chief");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "chief" + "'", str22, "chief");
    }

    @Test
    public void test15739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15739");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        chief2.logout();
        java.lang.String str5 = chief2.getAccountType();
        chief2.login("hi!", "chief");
        chief2.login("hi!", "chief");
        chief2.setVerified(false);
        java.lang.String str14 = chief2.getAccountType();
        chief2.setVerified(true);
        chief2.setVerified(true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "chief" + "'", str14, "chief");
    }

    @Test
    public void test15740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15740");
        model.Chief chief2 = new model.Chief("hi!", "hi!");
        chief2.setVerified(true);
        boolean boolean5 = chief2.isVerified();
        chief2.login("", "hi!");
        chief2.login("", "chief");
        java.lang.String str12 = chief2.getID();
        java.lang.String str13 = chief2.getID();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "chief" + "'", str12, "chief");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "chief" + "'", str13, "chief");
    }

    @Test
    public void test15741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15741");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.setVerified(false);
        chief2.logout();
        java.lang.String str6 = chief2.getEmail();
        java.lang.String str7 = chief2.getPassword();
        java.lang.String str8 = chief2.getAccountType();
        java.lang.String str9 = chief2.getAccountType();
        chief2.logout();
        chief2.login("", "");
        java.lang.String str14 = chief2.getEmail();
        chief2.login("hi!", "chief");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "chief" + "'", str8, "chief");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "chief" + "'", str9, "chief");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test15742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15742");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.viewProfile();
        chief2.setVerified(false);
        java.lang.String str6 = chief2.getID();
        double double7 = chief2.getHourlyRate();
        boolean boolean8 = chief2.isVerified();
        java.lang.String str9 = chief2.getID();
        double double10 = chief2.getHourlyRate();
        java.lang.String str11 = chief2.getEmail();
        boolean boolean12 = chief2.isVerified();
        java.lang.String str13 = chief2.getPassword();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "chief" + "'", str6, "chief");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "chief" + "'", str9, "chief");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test15743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15743");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.setVerified(false);
        chief2.logout();
        java.lang.String str6 = chief2.getAccountType();
        chief2.setVerified(true);
        double double9 = chief2.getHourlyRate();
        java.lang.Class<?> wildcardClass10 = chief2.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "chief" + "'", str6, "chief");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test15744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15744");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.viewProfile();
        java.lang.String str4 = chief2.getPassword();
        java.lang.String str5 = chief2.getAccountType();
        chief2.setVerified(false);
        java.lang.String str8 = chief2.getAccountType();
        chief2.login("", "chief");
        chief2.logout();
        java.lang.String str13 = chief2.getAccountType();
        java.lang.String str14 = chief2.getAccountType();
        java.lang.String str15 = chief2.getEmail();
        chief2.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "chief" + "'", str8, "chief");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "chief" + "'", str13, "chief");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "chief" + "'", str14, "chief");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test15745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15745");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        chief2.viewProfile();
        chief2.setVerified(false);
        java.lang.String str7 = chief2.getID();
        chief2.logout();
        java.lang.String str9 = chief2.getAccountType();
        chief2.setVerified(false);
        java.lang.String str12 = chief2.getAccountType();
        chief2.login("hi!", "hi!");
        chief2.setVerified(false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "chief" + "'", str7, "chief");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "chief" + "'", str9, "chief");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "chief" + "'", str12, "chief");
    }

    @Test
    public void test15746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15746");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        java.lang.String str4 = chief2.getAccountType();
        java.lang.String str5 = chief2.getPassword();
        java.lang.String str6 = chief2.getEmail();
        boolean boolean7 = chief2.isVerified();
        chief2.setVerified(true);
        java.lang.String str10 = chief2.getPassword();
        double double11 = chief2.getHourlyRate();
        chief2.logout();
        java.lang.String str13 = chief2.getAccountType();
        java.lang.String str14 = chief2.getPassword();
        chief2.logout();
        java.lang.String str16 = chief2.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "chief" + "'", str13, "chief");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "chief" + "'", str16, "chief");
    }

    @Test
    public void test15747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15747");
        model.Chief chief2 = new model.Chief("hi!", "");
        java.lang.String str3 = chief2.getID();
        java.lang.String str4 = chief2.getPassword();
        double double5 = chief2.getHourlyRate();
        double double6 = chief2.getHourlyRate();
        chief2.setVerified(false);
        chief2.viewProfile();
        chief2.logout();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "chief" + "'", str3, "chief");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test15748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15748");
        model.Chief chief2 = new model.Chief("hi!", "");
        java.lang.String str3 = chief2.getID();
        java.lang.String str4 = chief2.getPassword();
        java.lang.String str5 = chief2.getPassword();
        java.lang.String str6 = chief2.getID();
        boolean boolean7 = chief2.isVerified();
        chief2.logout();
        java.lang.String str9 = chief2.getID();
        chief2.login("", "hi!");
        boolean boolean13 = chief2.isVerified();
        chief2.login("chief", "chief");
        boolean boolean17 = chief2.isVerified();
        java.lang.String str18 = chief2.getID();
        chief2.viewProfile();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "chief" + "'", str3, "chief");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "chief" + "'", str6, "chief");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "chief" + "'", str9, "chief");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "chief" + "'", str18, "chief");
    }

    @Test
    public void test15749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15749");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        java.lang.String str4 = chief2.getAccountType();
        java.lang.String str5 = chief2.getPassword();
        java.lang.String str6 = chief2.getEmail();
        boolean boolean7 = chief2.isVerified();
        chief2.setVerified(true);
        java.lang.String str10 = chief2.getPassword();
        chief2.setVerified(true);
        java.lang.String str13 = chief2.getID();
        chief2.logout();
        java.lang.String str15 = chief2.getEmail();
        java.lang.String str16 = chief2.getAccountType();
        java.lang.String str17 = chief2.getEmail();
        java.lang.String str18 = chief2.getPassword();
        chief2.login("chief", "chief");
        chief2.logout();
        java.lang.String str23 = chief2.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "chief" + "'", str13, "chief");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "chief" + "'", str16, "chief");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "chief" + "'", str23, "chief");
    }

    @Test
    public void test15750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15750");
        model.Chief chief2 = new model.Chief("hi!", "");
        java.lang.String str3 = chief2.getPassword();
        chief2.viewProfile();
        chief2.setVerified(true);
        chief2.setVerified(true);
        chief2.login("hi!", "hi!");
        java.lang.String str12 = chief2.getPassword();
        java.lang.String str13 = chief2.getID();
        double double14 = chief2.getHourlyRate();
        chief2.login("chief", "hi!");
        chief2.login("hi!", "hi!");
        double double21 = chief2.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "chief" + "'", str13, "chief");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
    }

    @Test
    public void test15751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15751");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        java.lang.String str4 = chief2.getAccountType();
        java.lang.String str5 = chief2.getID();
        chief2.viewProfile();
        chief2.setVerified(true);
        java.lang.String str9 = chief2.getPassword();
        chief2.viewProfile();
        java.lang.String str11 = chief2.getEmail();
        double double12 = chief2.getHourlyRate();
        java.lang.String str13 = chief2.getPassword();
        double double14 = chief2.getHourlyRate();
        chief2.login("hi!", "");
        boolean boolean18 = chief2.isVerified();
        double double19 = chief2.getHourlyRate();
        java.lang.String str20 = chief2.getID();
        java.lang.String str21 = chief2.getEmail();
        java.lang.String str22 = chief2.getID();
        boolean boolean23 = chief2.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "chief" + "'", str20, "chief");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "chief" + "'", str22, "chief");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test15752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15752");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.viewProfile();
        java.lang.String str4 = chief2.getPassword();
        java.lang.String str5 = chief2.getAccountType();
        double double6 = chief2.getHourlyRate();
        java.lang.String str7 = chief2.getID();
        chief2.login("", "chief");
        java.lang.String str11 = chief2.getPassword();
        chief2.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "chief" + "'", str7, "chief");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test15753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15753");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        java.lang.String str4 = chief2.getAccountType();
        chief2.logout();
        java.lang.String str6 = chief2.getPassword();
        java.lang.String str7 = chief2.getAccountType();
        double double8 = chief2.getHourlyRate();
        chief2.logout();
        chief2.setVerified(false);
        java.lang.String str12 = chief2.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "chief" + "'", str7, "chief");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "chief" + "'", str12, "chief");
    }

    @Test
    public void test15754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15754");
        model.Chief chief2 = new model.Chief("hi!", "");
        java.lang.String str3 = chief2.getAccountType();
        double double4 = chief2.getHourlyRate();
        chief2.login("hi!", "chief");
        chief2.logout();
        chief2.viewProfile();
        chief2.logout();
        java.lang.String str11 = chief2.getPassword();
        java.lang.String str12 = chief2.getAccountType();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "chief" + "'", str3, "chief");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "chief" + "'", str12, "chief");
    }

    @Test
    public void test15755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15755");
        model.Chief chief2 = new model.Chief("", "chief");
        chief2.logout();
        boolean boolean4 = chief2.isVerified();
        java.lang.String str5 = chief2.getPassword();
        chief2.setVerified(false);
        chief2.login("chief", "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
    }

    @Test
    public void test15756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15756");
        model.Chief chief2 = new model.Chief("hi!", "");
        java.lang.String str3 = chief2.getID();
        chief2.viewProfile();
        java.lang.String str5 = chief2.getID();
        java.lang.String str6 = chief2.getID();
        java.lang.String str7 = chief2.getPassword();
        java.lang.String str8 = chief2.getAccountType();
        java.lang.String str9 = chief2.getID();
        chief2.logout();
        java.lang.Class<?> wildcardClass11 = chief2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "chief" + "'", str3, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "chief" + "'", str6, "chief");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "chief" + "'", str8, "chief");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "chief" + "'", str9, "chief");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test15757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15757");
        model.Chief chief2 = new model.Chief("hi!", "");
        java.lang.String str3 = chief2.getID();
        chief2.logout();
        java.lang.String str5 = chief2.getID();
        chief2.setVerified(true);
        java.lang.String str8 = chief2.getEmail();
        chief2.viewProfile();
        double double10 = chief2.getHourlyRate();
        boolean boolean11 = chief2.isVerified();
        java.lang.String str12 = chief2.getPassword();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "chief" + "'", str3, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test15758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15758");
        model.Chief chief2 = new model.Chief("", "hi!");
        chief2.logout();
        chief2.setVerified(true);
        chief2.viewProfile();
        boolean boolean7 = chief2.isVerified();
        java.lang.String str8 = chief2.getID();
        java.lang.String str9 = chief2.getID();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "chief" + "'", str8, "chief");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "chief" + "'", str9, "chief");
    }

    @Test
    public void test15759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15759");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        java.lang.String str4 = chief2.getAccountType();
        java.lang.String str5 = chief2.getID();
        chief2.viewProfile();
        chief2.setVerified(true);
        java.lang.String str9 = chief2.getPassword();
        chief2.viewProfile();
        java.lang.String str11 = chief2.getEmail();
        double double12 = chief2.getHourlyRate();
        boolean boolean13 = chief2.isVerified();
        double double14 = chief2.getHourlyRate();
        java.lang.String str15 = chief2.getPassword();
        java.lang.Class<?> wildcardClass16 = chief2.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test15760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15760");
        model.Chief chief2 = new model.Chief("chief", "hi!");
        java.lang.String str3 = chief2.getEmail();
        java.lang.String str4 = chief2.getAccountType();
        double double5 = chief2.getHourlyRate();
        boolean boolean6 = chief2.isVerified();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "chief" + "'", str3, "chief");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test15761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15761");
        model.Chief chief2 = new model.Chief("hi!", "");
        java.lang.String str3 = chief2.getAccountType();
        chief2.setVerified(true);
        java.lang.String str6 = chief2.getEmail();
        chief2.viewProfile();
        chief2.logout();
        java.lang.String str9 = chief2.getAccountType();
        java.lang.String str10 = chief2.getPassword();
        double double11 = chief2.getHourlyRate();
        boolean boolean12 = chief2.isVerified();
        java.lang.String str13 = chief2.getPassword();
        double double14 = chief2.getHourlyRate();
        double double15 = chief2.getHourlyRate();
        java.lang.String str16 = chief2.getEmail();
        double double17 = chief2.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "chief" + "'", str3, "chief");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "chief" + "'", str9, "chief");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
    }

    @Test
    public void test15762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15762");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.setVerified(false);
        chief2.logout();
        double double6 = chief2.getHourlyRate();
        chief2.viewProfile();
        chief2.logout();
        java.lang.Class<?> wildcardClass9 = chief2.getClass();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test15763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15763");
        model.Chief chief2 = new model.Chief("", "chief");
        chief2.setVerified(false);
        java.lang.String str5 = chief2.getPassword();
        java.lang.String str6 = chief2.getAccountType();
        boolean boolean7 = chief2.isVerified();
        chief2.setVerified(false);
        chief2.setVerified(true);
        java.lang.String str12 = chief2.getEmail();
        chief2.logout();
        java.lang.String str14 = chief2.getPassword();
        chief2.setVerified(true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "chief" + "'", str6, "chief");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "chief" + "'", str14, "chief");
    }

    @Test
    public void test15764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15764");
        model.Chief chief2 = new model.Chief("chief", "");
        boolean boolean3 = chief2.isVerified();
        java.lang.String str4 = chief2.getID();
        chief2.setVerified(true);
        chief2.logout();
        chief2.setVerified(true);
        java.lang.String str10 = chief2.getAccountType();
        java.lang.String str11 = chief2.getID();
        chief2.login("", "chief");
        java.lang.Class<?> wildcardClass15 = chief2.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "chief" + "'", str10, "chief");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "chief" + "'", str11, "chief");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test15765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15765");
        model.Chief chief2 = new model.Chief("hi!", "");
        java.lang.String str3 = chief2.getAccountType();
        chief2.setVerified(true);
        java.lang.String str6 = chief2.getEmail();
        chief2.viewProfile();
        chief2.logout();
        chief2.setVerified(false);
        chief2.login("hi!", "");
        chief2.setVerified(false);
        java.lang.String str16 = chief2.getID();
        chief2.logout();
        java.lang.String str18 = chief2.getID();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "chief" + "'", str3, "chief");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "chief" + "'", str16, "chief");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "chief" + "'", str18, "chief");
    }

    @Test
    public void test15766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15766");
        model.Chief chief2 = new model.Chief("", "chief");
        chief2.setVerified(false);
        java.lang.String str5 = chief2.getPassword();
        java.lang.String str6 = chief2.getID();
        chief2.logout();
        java.lang.String str8 = chief2.getID();
        chief2.setVerified(true);
        java.lang.String str11 = chief2.getAccountType();
        chief2.login("hi!", "hi!");
        chief2.setVerified(false);
        double double17 = chief2.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "chief" + "'", str6, "chief");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "chief" + "'", str8, "chief");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "chief" + "'", str11, "chief");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
    }

    @Test
    public void test15767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15767");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        java.lang.String str4 = chief2.getAccountType();
        java.lang.String str5 = chief2.getPassword();
        java.lang.String str6 = chief2.getPassword();
        chief2.setVerified(false);
        java.lang.String str9 = chief2.getPassword();
        boolean boolean10 = chief2.isVerified();
        java.lang.String str11 = chief2.getID();
        java.lang.String str12 = chief2.getPassword();
        double double13 = chief2.getHourlyRate();
        java.lang.String str14 = chief2.getAccountType();
        double double15 = chief2.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "chief" + "'", str11, "chief");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "chief" + "'", str14, "chief");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test15768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15768");
        model.Chief chief2 = new model.Chief("hi!", "");
        java.lang.String str3 = chief2.getAccountType();
        chief2.setVerified(true);
        java.lang.String str6 = chief2.getEmail();
        chief2.viewProfile();
        chief2.logout();
        chief2.setVerified(false);
        chief2.login("hi!", "");
        chief2.setVerified(false);
        java.lang.String str16 = chief2.getID();
        chief2.setVerified(true);
        java.lang.String str19 = chief2.getID();
        chief2.viewProfile();
        java.lang.String str21 = chief2.getID();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "chief" + "'", str3, "chief");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "chief" + "'", str16, "chief");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "chief" + "'", str19, "chief");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "chief" + "'", str21, "chief");
    }

    @Test
    public void test15769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15769");
        model.Chief chief2 = new model.Chief("hi!", "");
        java.lang.String str3 = chief2.getID();
        java.lang.String str4 = chief2.getPassword();
        java.lang.String str5 = chief2.getPassword();
        java.lang.String str6 = chief2.getEmail();
        chief2.login("", "");
        boolean boolean10 = chief2.isVerified();
        java.lang.String str11 = chief2.getEmail();
        java.lang.String str12 = chief2.getEmail();
        java.lang.String str13 = chief2.getAccountType();
        double double14 = chief2.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "chief" + "'", str3, "chief");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "chief" + "'", str13, "chief");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test15770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15770");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.setVerified(false);
        chief2.logout();
        java.lang.String str6 = chief2.getAccountType();
        chief2.setVerified(true);
        boolean boolean9 = chief2.isVerified();
        chief2.viewProfile();
        java.lang.String str11 = chief2.getEmail();
        chief2.viewProfile();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "chief" + "'", str6, "chief");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test15771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15771");
        model.Chief chief2 = new model.Chief("hi!", "");
        java.lang.String str3 = chief2.getPassword();
        chief2.viewProfile();
        chief2.setVerified(true);
        chief2.logout();
        java.lang.String str8 = chief2.getID();
        chief2.setVerified(false);
        java.lang.String str11 = chief2.getAccountType();
        java.lang.Class<?> wildcardClass12 = chief2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "chief" + "'", str8, "chief");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "chief" + "'", str11, "chief");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test15772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15772");
        model.Chief chief2 = new model.Chief("hi!", "");
        java.lang.String str3 = chief2.getID();
        java.lang.String str4 = chief2.getPassword();
        chief2.logout();
        double double6 = chief2.getHourlyRate();
        boolean boolean7 = chief2.isVerified();
        chief2.logout();
        chief2.logout();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "chief" + "'", str3, "chief");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test15773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15773");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.viewProfile();
        chief2.setVerified(false);
        java.lang.String str6 = chief2.getID();
        chief2.viewProfile();
        boolean boolean8 = chief2.isVerified();
        java.lang.String str9 = chief2.getPassword();
        java.lang.String str10 = chief2.getID();
        chief2.login("", "chief");
        chief2.login("", "");
        chief2.logout();
        java.lang.String str18 = chief2.getEmail();
        java.lang.Class<?> wildcardClass19 = chief2.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "chief" + "'", str6, "chief");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "chief" + "'", str10, "chief");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test15774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15774");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.viewProfile();
        java.lang.String str4 = chief2.getID();
        java.lang.String str5 = chief2.getID();
        chief2.viewProfile();
        java.lang.String str7 = chief2.getAccountType();
        chief2.viewProfile();
        double double9 = chief2.getHourlyRate();
        boolean boolean10 = chief2.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "chief" + "'", str7, "chief");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test15775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15775");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        chief2.logout();
        double double5 = chief2.getHourlyRate();
        java.lang.String str6 = chief2.getEmail();
        java.lang.String str7 = chief2.getPassword();
        chief2.login("chief", "chief");
        chief2.setVerified(false);
        chief2.login("hi!", "chief");
        chief2.logout();
        java.lang.String str17 = chief2.getPassword();
        double double18 = chief2.getHourlyRate();
        java.lang.String str19 = chief2.getID();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "chief" + "'", str19, "chief");
    }

    @Test
    public void test15776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15776");
        model.Chief chief2 = new model.Chief("hi!", "");
        java.lang.String str3 = chief2.getID();
        chief2.viewProfile();
        java.lang.String str5 = chief2.getID();
        boolean boolean6 = chief2.isVerified();
        java.lang.String str7 = chief2.getEmail();
        chief2.setVerified(false);
        java.lang.String str10 = chief2.getAccountType();
        java.lang.String str11 = chief2.getID();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "chief" + "'", str3, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "chief" + "'", str10, "chief");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "chief" + "'", str11, "chief");
    }

    @Test
    public void test15777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15777");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.viewProfile();
        java.lang.String str4 = chief2.getPassword();
        chief2.login("", "");
        chief2.setVerified(true);
        chief2.logout();
        java.lang.String str11 = chief2.getEmail();
        chief2.setVerified(true);
        chief2.viewProfile();
        boolean boolean15 = chief2.isVerified();
        java.lang.String str16 = chief2.getID();
        java.lang.String str17 = chief2.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "chief" + "'", str16, "chief");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test15778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15778");
        model.Chief chief2 = new model.Chief("hi!", "");
        java.lang.String str3 = chief2.getID();
        double double4 = chief2.getHourlyRate();
        chief2.login("hi!", "");
        java.lang.String str8 = chief2.getEmail();
        java.lang.String str9 = chief2.getPassword();
        chief2.logout();
        chief2.setVerified(true);
        chief2.viewProfile();
        java.lang.String str14 = chief2.getPassword();
        java.lang.String str15 = chief2.getPassword();
        chief2.logout();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "chief" + "'", str3, "chief");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test15779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15779");
        model.Chief chief2 = new model.Chief("hi!", "");
        java.lang.String str3 = chief2.getID();
        double double4 = chief2.getHourlyRate();
        chief2.login("hi!", "");
        java.lang.String str8 = chief2.getEmail();
        java.lang.String str9 = chief2.getEmail();
        java.lang.String str10 = chief2.getID();
        java.lang.String str11 = chief2.getEmail();
        chief2.setVerified(true);
        java.lang.String str14 = chief2.getEmail();
        chief2.viewProfile();
        java.lang.String str16 = chief2.getEmail();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "chief" + "'", str3, "chief");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "chief" + "'", str10, "chief");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test15780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15780");
        model.Chief chief2 = new model.Chief("hi!", "");
        java.lang.String str3 = chief2.getID();
        java.lang.String str4 = chief2.getPassword();
        java.lang.String str5 = chief2.getPassword();
        java.lang.String str6 = chief2.getEmail();
        chief2.login("", "");
        java.lang.String str10 = chief2.getPassword();
        chief2.login("hi!", "");
        chief2.setVerified(true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "chief" + "'", str3, "chief");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test15781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15781");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        chief2.viewProfile();
        chief2.setVerified(false);
        java.lang.String str7 = chief2.getID();
        java.lang.String str8 = chief2.getID();
        boolean boolean9 = chief2.isVerified();
        java.lang.String str10 = chief2.getID();
        chief2.login("hi!", "hi!");
        java.lang.String str14 = chief2.getEmail();
        chief2.viewProfile();
        java.lang.String str16 = chief2.getEmail();
        java.lang.String str17 = chief2.getID();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "chief" + "'", str7, "chief");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "chief" + "'", str8, "chief");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "chief" + "'", str10, "chief");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "chief" + "'", str17, "chief");
    }

    @Test
    public void test15782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15782");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        java.lang.String str4 = chief2.getAccountType();
        java.lang.String str5 = chief2.getID();
        boolean boolean6 = chief2.isVerified();
        chief2.logout();
        chief2.viewProfile();
        chief2.login("chief", "");
        double double12 = chief2.getHourlyRate();
        java.lang.String str13 = chief2.getEmail();
        java.lang.String str14 = chief2.getAccountType();
        java.lang.String str15 = chief2.getPassword();
        chief2.setVerified(false);
        chief2.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "chief" + "'", str14, "chief");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test15783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15783");
        model.Chief chief2 = new model.Chief("", "chief");
        chief2.setVerified(false);
        chief2.logout();
        java.lang.String str6 = chief2.getPassword();
        chief2.logout();
        java.lang.String str8 = chief2.getEmail();
        chief2.viewProfile();
        chief2.logout();
        java.lang.String str11 = chief2.getAccountType();
        java.lang.String str12 = chief2.getEmail();
        boolean boolean13 = chief2.isVerified();
        double double14 = chief2.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "chief" + "'", str6, "chief");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "chief" + "'", str11, "chief");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test15784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15784");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        java.lang.String str4 = chief2.getAccountType();
        java.lang.String str5 = chief2.getID();
        java.lang.String str6 = chief2.getEmail();
        java.lang.String str7 = chief2.getEmail();
        java.lang.String str8 = chief2.getEmail();
        java.lang.String str9 = chief2.getID();
        java.lang.String str10 = chief2.getAccountType();
        double double11 = chief2.getHourlyRate();
        chief2.login("", "");
        java.lang.Class<?> wildcardClass15 = chief2.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "chief" + "'", str9, "chief");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "chief" + "'", str10, "chief");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test15785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15785");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        java.lang.String str4 = chief2.getAccountType();
        java.lang.String str5 = chief2.getID();
        chief2.viewProfile();
        chief2.setVerified(true);
        java.lang.String str9 = chief2.getPassword();
        chief2.viewProfile();
        java.lang.String str11 = chief2.getEmail();
        java.lang.String str12 = chief2.getID();
        java.lang.String str13 = chief2.getEmail();
        double double14 = chief2.getHourlyRate();
        java.lang.String str15 = chief2.getID();
        chief2.logout();
        double double17 = chief2.getHourlyRate();
        chief2.logout();
        java.lang.String str19 = chief2.getPassword();
        chief2.viewProfile();
        chief2.login("", "");
        chief2.setVerified(false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "chief" + "'", str12, "chief");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "chief" + "'", str15, "chief");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test15786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15786");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        java.lang.String str4 = chief2.getAccountType();
        java.lang.String str5 = chief2.getID();
        chief2.viewProfile();
        chief2.setVerified(true);
        java.lang.String str9 = chief2.getPassword();
        boolean boolean10 = chief2.isVerified();
        java.lang.String str11 = chief2.getID();
        java.lang.String str12 = chief2.getAccountType();
        double double13 = chief2.getHourlyRate();
        java.lang.String str14 = chief2.getID();
        java.lang.String str15 = chief2.getID();
        chief2.viewProfile();
        chief2.login("", "");
        java.lang.String str20 = chief2.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "chief" + "'", str11, "chief");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "chief" + "'", str12, "chief");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "chief" + "'", str14, "chief");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "chief" + "'", str15, "chief");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "chief" + "'", str20, "chief");
    }

    @Test
    public void test15787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15787");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        java.lang.String str4 = chief2.getEmail();
        java.lang.String str5 = chief2.getEmail();
        chief2.setVerified(true);
        chief2.login("", "");
        chief2.logout();
        double double12 = chief2.getHourlyRate();
        chief2.viewProfile();
        java.lang.Class<?> wildcardClass14 = chief2.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test15788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15788");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        java.lang.String str4 = chief2.getAccountType();
        java.lang.String str5 = chief2.getID();
        double double6 = chief2.getHourlyRate();
        java.lang.String str7 = chief2.getID();
        boolean boolean8 = chief2.isVerified();
        java.lang.String str9 = chief2.getPassword();
        double double10 = chief2.getHourlyRate();
        boolean boolean11 = chief2.isVerified();
        java.lang.String str12 = chief2.getAccountType();
        java.lang.String str13 = chief2.getID();
        double double14 = chief2.getHourlyRate();
        java.lang.String str15 = chief2.getPassword();
        java.lang.String str16 = chief2.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "chief" + "'", str7, "chief");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "chief" + "'", str12, "chief");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "chief" + "'", str13, "chief");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "chief" + "'", str16, "chief");
    }

    @Test
    public void test15789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15789");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.viewProfile();
        java.lang.String str4 = chief2.getPassword();
        java.lang.String str5 = chief2.getEmail();
        java.lang.String str6 = chief2.getID();
        chief2.logout();
        java.lang.String str8 = chief2.getPassword();
        java.lang.String str9 = chief2.getID();
        java.lang.String str10 = chief2.getAccountType();
        chief2.logout();
        java.lang.String str12 = chief2.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "chief" + "'", str6, "chief");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "chief" + "'", str9, "chief");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "chief" + "'", str10, "chief");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "chief" + "'", str12, "chief");
    }

    @Test
    public void test15790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15790");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        java.lang.String str4 = chief2.getAccountType();
        java.lang.String str5 = chief2.getPassword();
        java.lang.String str6 = chief2.getEmail();
        boolean boolean7 = chief2.isVerified();
        chief2.setVerified(true);
        java.lang.String str10 = chief2.getAccountType();
        java.lang.String str11 = chief2.getAccountType();
        chief2.setVerified(false);
        java.lang.String str14 = chief2.getID();
        chief2.login("hi!", "");
        java.lang.String str18 = chief2.getID();
        double double19 = chief2.getHourlyRate();
        chief2.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "chief" + "'", str10, "chief");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "chief" + "'", str11, "chief");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "chief" + "'", str14, "chief");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "chief" + "'", str18, "chief");
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
    }

    @Test
    public void test15791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15791");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        chief2.logout();
        double double5 = chief2.getHourlyRate();
        java.lang.String str6 = chief2.getID();
        chief2.login("hi!", "chief");
        java.lang.String str10 = chief2.getAccountType();
        chief2.login("hi!", "hi!");
        chief2.viewProfile();
        boolean boolean15 = chief2.isVerified();
        chief2.setVerified(false);
        double double18 = chief2.getHourlyRate();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "chief" + "'", str6, "chief");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "chief" + "'", str10, "chief");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
    }

    @Test
    public void test15792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15792");
        model.Chief chief2 = new model.Chief("", "chief");
        chief2.setVerified(false);
        chief2.logout();
        java.lang.String str6 = chief2.getPassword();
        chief2.logout();
        java.lang.String str8 = chief2.getEmail();
        chief2.viewProfile();
        chief2.logout();
        java.lang.String str11 = chief2.getPassword();
        java.lang.String str12 = chief2.getID();
        boolean boolean13 = chief2.isVerified();
        chief2.logout();
        boolean boolean15 = chief2.isVerified();
        java.lang.String str16 = chief2.getAccountType();
        boolean boolean17 = chief2.isVerified();
        java.lang.String str18 = chief2.getPassword();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "chief" + "'", str6, "chief");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "chief" + "'", str11, "chief");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "chief" + "'", str12, "chief");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "chief" + "'", str16, "chief");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "chief" + "'", str18, "chief");
    }

    @Test
    public void test15793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15793");
        model.Chief chief2 = new model.Chief("hi!", "");
        java.lang.String str3 = chief2.getID();
        java.lang.String str4 = chief2.getPassword();
        java.lang.String str5 = chief2.getPassword();
        java.lang.String str6 = chief2.getID();
        boolean boolean7 = chief2.isVerified();
        chief2.logout();
        java.lang.String str9 = chief2.getID();
        chief2.login("", "hi!");
        java.lang.String str13 = chief2.getAccountType();
        java.lang.String str14 = chief2.getAccountType();
        chief2.setVerified(false);
        boolean boolean17 = chief2.isVerified();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "chief" + "'", str3, "chief");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "chief" + "'", str6, "chief");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "chief" + "'", str9, "chief");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "chief" + "'", str13, "chief");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "chief" + "'", str14, "chief");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test15794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15794");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        java.lang.String str4 = chief2.getAccountType();
        java.lang.String str5 = chief2.getPassword();
        java.lang.String str6 = chief2.getEmail();
        boolean boolean7 = chief2.isVerified();
        chief2.setVerified(true);
        java.lang.String str10 = chief2.getAccountType();
        java.lang.String str11 = chief2.getAccountType();
        chief2.setVerified(false);
        chief2.viewProfile();
        java.lang.String str15 = chief2.getAccountType();
        java.lang.String str16 = chief2.getAccountType();
        double double17 = chief2.getHourlyRate();
        chief2.login("", "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "chief" + "'", str10, "chief");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "chief" + "'", str11, "chief");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "chief" + "'", str15, "chief");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "chief" + "'", str16, "chief");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
    }

    @Test
    public void test15795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15795");
        model.Chief chief2 = new model.Chief("hi!", "");
        java.lang.String str3 = chief2.getID();
        java.lang.String str4 = chief2.getPassword();
        chief2.logout();
        boolean boolean6 = chief2.isVerified();
        java.lang.String str7 = chief2.getAccountType();
        chief2.login("hi!", "hi!");
        double double11 = chief2.getHourlyRate();
        java.lang.String str12 = chief2.getAccountType();
        java.lang.String str13 = chief2.getPassword();
        double double14 = chief2.getHourlyRate();
        chief2.setVerified(true);
        chief2.logout();
        boolean boolean18 = chief2.isVerified();
        chief2.login("", "chief");
        java.lang.String str22 = chief2.getAccountType();
        java.lang.String str23 = chief2.getEmail();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "chief" + "'", str3, "chief");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "chief" + "'", str7, "chief");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "chief" + "'", str12, "chief");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "chief" + "'", str22, "chief");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
    }

    @Test
    public void test15796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15796");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        chief2.viewProfile();
        chief2.setVerified(false);
        chief2.logout();
        java.lang.String str8 = chief2.getEmail();
        chief2.login("hi!", "hi!");
        chief2.viewProfile();
        java.lang.String str13 = chief2.getPassword();
        double double14 = chief2.getHourlyRate();
        java.lang.Class<?> wildcardClass15 = chief2.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test15797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15797");
        model.Chief chief2 = new model.Chief("hi!", "");
        java.lang.String str3 = chief2.getID();
        double double4 = chief2.getHourlyRate();
        chief2.login("hi!", "");
        java.lang.String str8 = chief2.getEmail();
        java.lang.String str9 = chief2.getPassword();
        java.lang.String str10 = chief2.getAccountType();
        java.lang.String str11 = chief2.getEmail();
        chief2.logout();
        chief2.logout();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "chief" + "'", str3, "chief");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "chief" + "'", str10, "chief");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test15798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15798");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.viewProfile();
        java.lang.String str4 = chief2.getPassword();
        chief2.logout();
        java.lang.String str6 = chief2.getID();
        chief2.setVerified(false);
        chief2.viewProfile();
        boolean boolean10 = chief2.isVerified();
        java.lang.String str11 = chief2.getPassword();
        java.lang.String str12 = chief2.getEmail();
        java.lang.String str13 = chief2.getPassword();
        boolean boolean14 = chief2.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "chief" + "'", str6, "chief");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test15799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15799");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        chief2.viewProfile();
        chief2.setVerified(false);
        chief2.logout();
        chief2.logout();
        java.lang.String str9 = chief2.getPassword();
        boolean boolean10 = chief2.isVerified();
        chief2.logout();
        double double12 = chief2.getHourlyRate();
        chief2.setVerified(false);
        double double15 = chief2.getHourlyRate();
        boolean boolean16 = chief2.isVerified();
        java.lang.String str17 = chief2.getID();
        double double18 = chief2.getHourlyRate();
        chief2.viewProfile();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "chief" + "'", str17, "chief");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
    }

    @Test
    public void test15800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15800");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        java.lang.String str4 = chief2.getAccountType();
        java.lang.String str5 = chief2.getPassword();
        java.lang.String str6 = chief2.getPassword();
        chief2.setVerified(false);
        java.lang.String str9 = chief2.getPassword();
        boolean boolean10 = chief2.isVerified();
        double double11 = chief2.getHourlyRate();
        double double12 = chief2.getHourlyRate();
        chief2.logout();
        java.lang.String str14 = chief2.getPassword();
        boolean boolean15 = chief2.isVerified();
        boolean boolean16 = chief2.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test15801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15801");
        model.Chief chief2 = new model.Chief("", "chief");
        chief2.setVerified(false);
        java.lang.String str5 = chief2.getPassword();
        chief2.viewProfile();
        java.lang.String str7 = chief2.getAccountType();
        java.lang.String str8 = chief2.getEmail();
        java.lang.String str9 = chief2.getEmail();
        java.lang.String str10 = chief2.getID();
        java.lang.String str11 = chief2.getID();
        double double12 = chief2.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "chief" + "'", str7, "chief");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "chief" + "'", str10, "chief");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "chief" + "'", str11, "chief");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test15802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15802");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        java.lang.String str4 = chief2.getID();
        chief2.logout();
        double double6 = chief2.getHourlyRate();
        java.lang.String str7 = chief2.getAccountType();
        java.lang.String str8 = chief2.getPassword();
        chief2.setVerified(true);
        java.lang.String str11 = chief2.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "chief" + "'", str7, "chief");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test15803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15803");
        model.Chief chief2 = new model.Chief("hi!", "");
        java.lang.String str3 = chief2.getID();
        chief2.logout();
        java.lang.String str5 = chief2.getEmail();
        java.lang.String str6 = chief2.getPassword();
        java.lang.String str7 = chief2.getPassword();
        chief2.setVerified(true);
        chief2.setVerified(false);
        java.lang.String str12 = chief2.getAccountType();
        chief2.viewProfile();
        java.lang.String str14 = chief2.getPassword();
        chief2.login("hi!", "chief");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "chief" + "'", str3, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "chief" + "'", str12, "chief");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test15804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15804");
        model.Chief chief2 = new model.Chief("hi!", "");
        java.lang.String str3 = chief2.getID();
        double double4 = chief2.getHourlyRate();
        double double5 = chief2.getHourlyRate();
        java.lang.String str6 = chief2.getAccountType();
        chief2.viewProfile();
        java.lang.String str8 = chief2.getID();
        java.lang.String str9 = chief2.getEmail();
        double double10 = chief2.getHourlyRate();
        chief2.logout();
        java.lang.String str12 = chief2.getEmail();
        java.lang.String str13 = chief2.getPassword();
        double double14 = chief2.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "chief" + "'", str3, "chief");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "chief" + "'", str6, "chief");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "chief" + "'", str8, "chief");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test15805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15805");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        java.lang.String str4 = chief2.getAccountType();
        java.lang.String str5 = chief2.getPassword();
        chief2.login("hi!", "hi!");
        java.lang.String str9 = chief2.getPassword();
        boolean boolean10 = chief2.isVerified();
        boolean boolean11 = chief2.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test15806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15806");
        model.Chief chief2 = new model.Chief("hi!", "");
        java.lang.String str3 = chief2.getAccountType();
        chief2.setVerified(true);
        java.lang.String str6 = chief2.getEmail();
        chief2.viewProfile();
        chief2.logout();
        chief2.setVerified(false);
        boolean boolean11 = chief2.isVerified();
        java.lang.String str12 = chief2.getAccountType();
        chief2.login("", "chief");
        java.lang.String str16 = chief2.getID();
        java.lang.String str17 = chief2.getEmail();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "chief" + "'", str3, "chief");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "chief" + "'", str12, "chief");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "chief" + "'", str16, "chief");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test15807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15807");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.setVerified(false);
        chief2.logout();
        java.lang.String str6 = chief2.getEmail();
        java.lang.String str7 = chief2.getPassword();
        java.lang.String str8 = chief2.getAccountType();
        java.lang.String str9 = chief2.getAccountType();
        chief2.login("hi!", "");
        double double13 = chief2.getHourlyRate();
        chief2.login("", "hi!");
        chief2.setVerified(true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "chief" + "'", str8, "chief");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "chief" + "'", str9, "chief");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test15808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15808");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        java.lang.String str4 = chief2.getAccountType();
        java.lang.String str5 = chief2.getID();
        double double6 = chief2.getHourlyRate();
        java.lang.String str7 = chief2.getEmail();
        java.lang.String str8 = chief2.getPassword();
        java.lang.String str9 = chief2.getAccountType();
        chief2.login("hi!", "hi!");
        java.lang.String str13 = chief2.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "chief" + "'", str9, "chief");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test15809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15809");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.viewProfile();
        java.lang.String str4 = chief2.getPassword();
        chief2.logout();
        java.lang.String str6 = chief2.getID();
        chief2.setVerified(false);
        double double9 = chief2.getHourlyRate();
        java.lang.String str10 = chief2.getID();
        double double11 = chief2.getHourlyRate();
        java.lang.String str12 = chief2.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "chief" + "'", str6, "chief");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "chief" + "'", str10, "chief");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "chief" + "'", str12, "chief");
    }

    @Test
    public void test15810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15810");
        model.Chief chief2 = new model.Chief("hi!", "");
        java.lang.String str3 = chief2.getAccountType();
        java.lang.String str4 = chief2.getAccountType();
        boolean boolean5 = chief2.isVerified();
        chief2.setVerified(true);
        chief2.login("chief", "");
        java.lang.String str11 = chief2.getPassword();
        chief2.logout();
        boolean boolean13 = chief2.isVerified();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "chief" + "'", str3, "chief");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test15811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15811");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.setVerified(false);
        chief2.login("", "");
        boolean boolean8 = chief2.isVerified();
        java.lang.String str9 = chief2.getEmail();
        java.lang.String str10 = chief2.getAccountType();
        java.lang.String str11 = chief2.getPassword();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "chief" + "'", str10, "chief");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test15812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15812");
        model.Chief chief2 = new model.Chief("hi!", "");
        java.lang.String str3 = chief2.getID();
        double double4 = chief2.getHourlyRate();
        chief2.login("hi!", "");
        java.lang.String str8 = chief2.getPassword();
        java.lang.String str9 = chief2.getEmail();
        chief2.setVerified(false);
        java.lang.String str12 = chief2.getAccountType();
        chief2.login("hi!", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "chief" + "'", str3, "chief");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "chief" + "'", str12, "chief");
    }

    @Test
    public void test15813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15813");
        model.Chief chief2 = new model.Chief("hi!", "");
        java.lang.String str3 = chief2.getAccountType();
        chief2.setVerified(true);
        java.lang.String str6 = chief2.getEmail();
        chief2.viewProfile();
        chief2.logout();
        java.lang.String str9 = chief2.getAccountType();
        chief2.viewProfile();
        chief2.logout();
        chief2.login("chief", "");
        java.lang.String str15 = chief2.getID();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "chief" + "'", str3, "chief");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "chief" + "'", str9, "chief");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "chief" + "'", str15, "chief");
    }

    @Test
    public void test15814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15814");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.viewProfile();
        java.lang.String str4 = chief2.getPassword();
        chief2.login("", "");
        chief2.setVerified(true);
        chief2.logout();
        java.lang.String str11 = chief2.getEmail();
        chief2.setVerified(false);
        java.lang.String str14 = chief2.getPassword();
        boolean boolean15 = chief2.isVerified();
        boolean boolean16 = chief2.isVerified();
        chief2.logout();
        chief2.setVerified(true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test15815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15815");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        chief2.logout();
        java.lang.String str5 = chief2.getAccountType();
        chief2.login("hi!", "chief");
        java.lang.String str9 = chief2.getEmail();
        java.lang.String str10 = chief2.getID();
        java.lang.String str11 = chief2.getID();
        chief2.viewProfile();
        chief2.setVerified(true);
        java.lang.String str15 = chief2.getID();
        java.lang.String str16 = chief2.getID();
        java.lang.String str17 = chief2.getID();
        chief2.setVerified(false);
        chief2.viewProfile();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "chief" + "'", str10, "chief");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "chief" + "'", str11, "chief");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "chief" + "'", str15, "chief");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "chief" + "'", str16, "chief");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "chief" + "'", str17, "chief");
    }

    @Test
    public void test15816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15816");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        chief2.logout();
        double double5 = chief2.getHourlyRate();
        java.lang.String str6 = chief2.getID();
        double double7 = chief2.getHourlyRate();
        java.lang.String str8 = chief2.getPassword();
        java.lang.String str9 = chief2.getPassword();
        chief2.logout();
        java.lang.String str11 = chief2.getEmail();
        java.lang.String str12 = chief2.getID();
        java.lang.String str13 = chief2.getID();
        chief2.viewProfile();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "chief" + "'", str6, "chief");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "chief" + "'", str12, "chief");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "chief" + "'", str13, "chief");
    }

    @Test
    public void test15817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15817");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        java.lang.String str4 = chief2.getAccountType();
        chief2.logout();
        java.lang.String str6 = chief2.getID();
        double double7 = chief2.getHourlyRate();
        chief2.viewProfile();
        chief2.setVerified(true);
        chief2.viewProfile();
        double double12 = chief2.getHourlyRate();
        chief2.logout();
        chief2.viewProfile();
        java.lang.String str15 = chief2.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "chief" + "'", str6, "chief");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test15818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15818");
        model.Chief chief2 = new model.Chief("hi!", "");
        java.lang.String str3 = chief2.getID();
        double double4 = chief2.getHourlyRate();
        chief2.login("hi!", "");
        java.lang.String str8 = chief2.getPassword();
        java.lang.String str9 = chief2.getPassword();
        java.lang.String str10 = chief2.getPassword();
        double double11 = chief2.getHourlyRate();
        boolean boolean12 = chief2.isVerified();
        boolean boolean13 = chief2.isVerified();
        java.lang.String str14 = chief2.getAccountType();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "chief" + "'", str3, "chief");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "chief" + "'", str14, "chief");
    }

    @Test
    public void test15819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15819");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        java.lang.String str4 = chief2.getAccountType();
        java.lang.String str5 = chief2.getID();
        chief2.viewProfile();
        java.lang.String str7 = chief2.getAccountType();
        double double8 = chief2.getHourlyRate();
        java.lang.String str9 = chief2.getEmail();
        java.lang.String str10 = chief2.getAccountType();
        double double11 = chief2.getHourlyRate();
        java.lang.String str12 = chief2.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "chief" + "'", str7, "chief");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "chief" + "'", str10, "chief");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test15820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15820");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        java.lang.String str4 = chief2.getAccountType();
        java.lang.String str5 = chief2.getID();
        chief2.viewProfile();
        chief2.setVerified(true);
        java.lang.String str9 = chief2.getPassword();
        chief2.viewProfile();
        java.lang.String str11 = chief2.getEmail();
        double double12 = chief2.getHourlyRate();
        java.lang.String str13 = chief2.getPassword();
        double double14 = chief2.getHourlyRate();
        chief2.login("hi!", "");
        boolean boolean18 = chief2.isVerified();
        double double19 = chief2.getHourlyRate();
        java.lang.String str20 = chief2.getID();
        boolean boolean21 = chief2.isVerified();
        chief2.login("chief", "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "chief" + "'", str20, "chief");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test15821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15821");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.viewProfile();
        java.lang.String str4 = chief2.getPassword();
        java.lang.String str5 = chief2.getAccountType();
        double double6 = chief2.getHourlyRate();
        java.lang.String str7 = chief2.getID();
        chief2.login("", "chief");
        java.lang.String str11 = chief2.getPassword();
        chief2.viewProfile();
        chief2.setVerified(false);
        java.lang.String str15 = chief2.getAccountType();
        java.lang.String str16 = chief2.getPassword();
        chief2.login("chief", "chief");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "chief" + "'", str7, "chief");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "chief" + "'", str15, "chief");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test15822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15822");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.setVerified(false);
        chief2.logout();
        java.lang.String str6 = chief2.getEmail();
        java.lang.String str7 = chief2.getPassword();
        chief2.setVerified(true);
        chief2.logout();
        java.lang.String str11 = chief2.getPassword();
        java.lang.String str12 = chief2.getPassword();
        chief2.setVerified(false);
        java.lang.String str15 = chief2.getEmail();
        double double16 = chief2.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
    }

    @Test
    public void test15823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15823");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        java.lang.String str4 = chief2.getAccountType();
        java.lang.String str5 = chief2.getPassword();
        java.lang.String str6 = chief2.getEmail();
        boolean boolean7 = chief2.isVerified();
        chief2.login("", "chief");
        chief2.logout();
        java.lang.String str12 = chief2.getAccountType();
        chief2.setVerified(true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "chief" + "'", str12, "chief");
    }

    @Test
    public void test15824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15824");
        model.Chief chief2 = new model.Chief("hi!", "");
        java.lang.String str3 = chief2.getID();
        java.lang.String str4 = chief2.getPassword();
        java.lang.String str5 = chief2.getPassword();
        java.lang.String str6 = chief2.getEmail();
        double double7 = chief2.getHourlyRate();
        java.lang.String str8 = chief2.getPassword();
        boolean boolean9 = chief2.isVerified();
        chief2.setVerified(true);
        java.lang.String str12 = chief2.getID();
        chief2.setVerified(true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "chief" + "'", str3, "chief");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "chief" + "'", str12, "chief");
    }

    @Test
    public void test15825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15825");
        model.Chief chief2 = new model.Chief("", "chief");
        chief2.setVerified(false);
        chief2.logout();
        java.lang.String str6 = chief2.getPassword();
        java.lang.String str7 = chief2.getPassword();
        boolean boolean8 = chief2.isVerified();
        java.lang.String str9 = chief2.getPassword();
        chief2.viewProfile();
        boolean boolean11 = chief2.isVerified();
        chief2.setVerified(false);
        chief2.logout();
        chief2.viewProfile();
        java.lang.String str16 = chief2.getPassword();
        chief2.login("", "chief");
        java.lang.String str20 = chief2.getAccountType();
        chief2.setVerified(false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "chief" + "'", str6, "chief");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "chief" + "'", str7, "chief");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "chief" + "'", str9, "chief");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "chief" + "'", str16, "chief");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "chief" + "'", str20, "chief");
    }

    @Test
    public void test15826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15826");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        chief2.logout();
        double double5 = chief2.getHourlyRate();
        java.lang.String str6 = chief2.getEmail();
        boolean boolean7 = chief2.isVerified();
        chief2.logout();
        double double9 = chief2.getHourlyRate();
        boolean boolean10 = chief2.isVerified();
        java.lang.String str11 = chief2.getPassword();
        java.lang.String str12 = chief2.getID();
        chief2.logout();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "chief" + "'", str12, "chief");
    }

    @Test
    public void test15827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15827");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        java.lang.String str4 = chief2.getID();
        java.lang.String str5 = chief2.getEmail();
        chief2.login("hi!", "chief");
        boolean boolean9 = chief2.isVerified();
        double double10 = chief2.getHourlyRate();
        double double11 = chief2.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test15828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15828");
        model.Chief chief2 = new model.Chief("hi!", "");
        java.lang.String str3 = chief2.getID();
        chief2.logout();
        java.lang.String str5 = chief2.getEmail();
        java.lang.String str6 = chief2.getPassword();
        java.lang.String str7 = chief2.getPassword();
        chief2.setVerified(true);
        chief2.setVerified(false);
        chief2.login("chief", "chief");
        java.lang.String str15 = chief2.getAccountType();
        java.lang.String str16 = chief2.getEmail();
        boolean boolean17 = chief2.isVerified();
        java.lang.String str18 = chief2.getPassword();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "chief" + "'", str3, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "chief" + "'", str15, "chief");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test15829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15829");
        model.Chief chief2 = new model.Chief("hi!", "");
        java.lang.String str3 = chief2.getID();
        chief2.logout();
        java.lang.String str5 = chief2.getAccountType();
        boolean boolean6 = chief2.isVerified();
        chief2.viewProfile();
        chief2.viewProfile();
        java.lang.String str9 = chief2.getAccountType();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "chief" + "'", str3, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "chief" + "'", str9, "chief");
    }

    @Test
    public void test15830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15830");
        model.Chief chief2 = new model.Chief("hi!", "");
        java.lang.String str3 = chief2.getAccountType();
        java.lang.String str4 = chief2.getAccountType();
        java.lang.String str5 = chief2.getPassword();
        chief2.setVerified(true);
        java.lang.String str8 = chief2.getEmail();
        java.lang.String str9 = chief2.getAccountType();
        java.lang.String str10 = chief2.getPassword();
        chief2.logout();
        java.lang.String str12 = chief2.getPassword();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "chief" + "'", str3, "chief");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "chief" + "'", str9, "chief");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test15831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15831");
        model.Chief chief2 = new model.Chief("hi!", "");
        java.lang.String str3 = chief2.getID();
        chief2.logout();
        chief2.login("hi!", "");
        boolean boolean8 = chief2.isVerified();
        double double9 = chief2.getHourlyRate();
        chief2.login("hi!", "chief");
        java.lang.String str13 = chief2.getPassword();
        chief2.viewProfile();
        double double15 = chief2.getHourlyRate();
        java.lang.String str16 = chief2.getID();
        java.lang.Class<?> wildcardClass17 = chief2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "chief" + "'", str3, "chief");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "chief" + "'", str16, "chief");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test15832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15832");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        java.lang.String str4 = chief2.getAccountType();
        java.lang.String str5 = chief2.getPassword();
        java.lang.String str6 = chief2.getEmail();
        boolean boolean7 = chief2.isVerified();
        chief2.setVerified(true);
        java.lang.String str10 = chief2.getPassword();
        chief2.setVerified(true);
        chief2.login("", "hi!");
        java.lang.String str16 = chief2.getAccountType();
        chief2.setVerified(true);
        chief2.viewProfile();
        chief2.login("hi!", "chief");
        chief2.setVerified(true);
        java.lang.Class<?> wildcardClass25 = chief2.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "chief" + "'", str16, "chief");
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test15833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15833");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        chief2.logout();
        java.lang.String str5 = chief2.getID();
        java.lang.String str6 = chief2.getAccountType();
        chief2.logout();
        chief2.setVerified(false);
        chief2.setVerified(false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "chief" + "'", str6, "chief");
    }

    @Test
    public void test15834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15834");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        java.lang.String str4 = chief2.getAccountType();
        java.lang.String str5 = chief2.getID();
        chief2.viewProfile();
        chief2.setVerified(true);
        java.lang.String str9 = chief2.getAccountType();
        java.lang.String str10 = chief2.getPassword();
        chief2.login("", "chief");
        java.lang.String str14 = chief2.getAccountType();
        java.lang.String str15 = chief2.getID();
        chief2.setVerified(false);
        chief2.login("hi!", "chief");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "chief" + "'", str9, "chief");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "chief" + "'", str14, "chief");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "chief" + "'", str15, "chief");
    }

    @Test
    public void test15835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15835");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        java.lang.String str4 = chief2.getAccountType();
        boolean boolean5 = chief2.isVerified();
        chief2.viewProfile();
        boolean boolean7 = chief2.isVerified();
        chief2.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test15836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15836");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        java.lang.String str4 = chief2.getAccountType();
        chief2.logout();
        java.lang.String str6 = chief2.getPassword();
        chief2.logout();
        chief2.logout();
        chief2.setVerified(true);
        chief2.setVerified(true);
        java.lang.Class<?> wildcardClass13 = chief2.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test15837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15837");
        model.Chief chief2 = new model.Chief("hi!", "");
        java.lang.String str3 = chief2.getID();
        java.lang.String str4 = chief2.getPassword();
        java.lang.String str5 = chief2.getPassword();
        java.lang.String str6 = chief2.getEmail();
        chief2.viewProfile();
        java.lang.String str8 = chief2.getAccountType();
        java.lang.String str9 = chief2.getID();
        chief2.logout();
        java.lang.String str11 = chief2.getID();
        chief2.viewProfile();
        java.lang.String str13 = chief2.getAccountType();
        chief2.logout();
        java.lang.String str15 = chief2.getEmail();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "chief" + "'", str3, "chief");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "chief" + "'", str8, "chief");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "chief" + "'", str9, "chief");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "chief" + "'", str11, "chief");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "chief" + "'", str13, "chief");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test15838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15838");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.setVerified(false);
        chief2.logout();
        java.lang.String str6 = chief2.getEmail();
        java.lang.String str7 = chief2.getAccountType();
        java.lang.String str8 = chief2.getEmail();
        chief2.setVerified(false);
        chief2.logout();
        chief2.viewProfile();
        java.lang.String str13 = chief2.getAccountType();
        double double14 = chief2.getHourlyRate();
        chief2.logout();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "chief" + "'", str7, "chief");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "chief" + "'", str13, "chief");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test15839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15839");
        model.Chief chief2 = new model.Chief("hi!", "");
        java.lang.String str3 = chief2.getPassword();
        chief2.viewProfile();
        java.lang.String str5 = chief2.getPassword();
        chief2.login("", "");
        boolean boolean9 = chief2.isVerified();
        chief2.login("", "hi!");
        chief2.logout();
        java.lang.String str14 = chief2.getID();
        java.lang.Class<?> wildcardClass15 = chief2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "chief" + "'", str14, "chief");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test15840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15840");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        chief2.logout();
        double double5 = chief2.getHourlyRate();
        java.lang.String str6 = chief2.getEmail();
        boolean boolean7 = chief2.isVerified();
        chief2.logout();
        chief2.login("", "");
        java.lang.String str12 = chief2.getEmail();
        double double13 = chief2.getHourlyRate();
        double double14 = chief2.getHourlyRate();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test15841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15841");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.viewProfile();
        chief2.setVerified(false);
        java.lang.String str6 = chief2.getID();
        chief2.setVerified(false);
        chief2.login("", "chief");
        java.lang.String str12 = chief2.getEmail();
        double double13 = chief2.getHourlyRate();
        java.lang.String str14 = chief2.getAccountType();
        java.lang.String str15 = chief2.getEmail();
        chief2.viewProfile();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "chief" + "'", str6, "chief");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "chief" + "'", str14, "chief");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test15842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15842");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        java.lang.String str4 = chief2.getAccountType();
        java.lang.String str5 = chief2.getPassword();
        java.lang.String str6 = chief2.getEmail();
        boolean boolean7 = chief2.isVerified();
        chief2.setVerified(true);
        chief2.login("", "hi!");
        chief2.viewProfile();
        chief2.login("chief", "chief");
        chief2.logout();
        java.lang.String str18 = chief2.getEmail();
        chief2.setVerified(false);
        java.lang.String str21 = chief2.getAccountType();
        chief2.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "chief" + "'", str21, "chief");
    }

    @Test
    public void test15843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15843");
        model.Chief chief2 = new model.Chief("hi!", "");
        java.lang.String str3 = chief2.getAccountType();
        chief2.setVerified(true);
        java.lang.String str6 = chief2.getEmail();
        chief2.viewProfile();
        chief2.logout();
        chief2.setVerified(false);
        boolean boolean11 = chief2.isVerified();
        java.lang.String str12 = chief2.getAccountType();
        chief2.login("", "chief");
        java.lang.String str16 = chief2.getPassword();
        chief2.login("hi!", "");
        chief2.logout();
        chief2.login("hi!", "");
        boolean boolean24 = chief2.isVerified();
        chief2.login("hi!", "chief");
        java.lang.String str28 = chief2.getID();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "chief" + "'", str3, "chief");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "chief" + "'", str12, "chief");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "chief" + "'", str28, "chief");
    }

    @Test
    public void test15844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15844");
        model.Chief chief2 = new model.Chief("", "chief");
        chief2.viewProfile();
        boolean boolean4 = chief2.isVerified();
        chief2.setVerified(true);
        chief2.logout();
        boolean boolean8 = chief2.isVerified();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test15845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15845");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        java.lang.String str4 = chief2.getAccountType();
        java.lang.String str5 = chief2.getID();
        boolean boolean6 = chief2.isVerified();
        chief2.logout();
        chief2.viewProfile();
        chief2.login("chief", "");
        double double12 = chief2.getHourlyRate();
        boolean boolean13 = chief2.isVerified();
        boolean boolean14 = chief2.isVerified();
        double double15 = chief2.getHourlyRate();
        chief2.setVerified(false);
        java.lang.String str18 = chief2.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test15846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15846");
        model.Chief chief2 = new model.Chief("", "chief");
        chief2.setVerified(false);
        java.lang.String str5 = chief2.getPassword();
        java.lang.String str6 = chief2.getID();
        chief2.logout();
        chief2.logout();
        java.lang.String str9 = chief2.getPassword();
        java.lang.String str10 = chief2.getEmail();
        java.lang.String str11 = chief2.getPassword();
        java.lang.String str12 = chief2.getEmail();
        java.lang.String str13 = chief2.getAccountType();
        chief2.login("chief", "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "chief" + "'", str6, "chief");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "chief" + "'", str9, "chief");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "chief" + "'", str11, "chief");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "chief" + "'", str13, "chief");
    }

    @Test
    public void test15847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15847");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.setVerified(false);
        chief2.logout();
        java.lang.String str6 = chief2.getAccountType();
        chief2.setVerified(true);
        double double9 = chief2.getHourlyRate();
        java.lang.String str10 = chief2.getPassword();
        java.lang.String str11 = chief2.getID();
        java.lang.Class<?> wildcardClass12 = chief2.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "chief" + "'", str6, "chief");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "chief" + "'", str11, "chief");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test15848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15848");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.setVerified(false);
        chief2.logout();
        java.lang.String str6 = chief2.getEmail();
        java.lang.String str7 = chief2.getID();
        java.lang.String str8 = chief2.getEmail();
        double double9 = chief2.getHourlyRate();
        double double10 = chief2.getHourlyRate();
        chief2.login("hi!", "hi!");
        chief2.setVerified(false);
        java.lang.String str16 = chief2.getEmail();
        boolean boolean17 = chief2.isVerified();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "chief" + "'", str7, "chief");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test15849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15849");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        java.lang.String str4 = chief2.getAccountType();
        java.lang.String str5 = chief2.getPassword();
        java.lang.String str6 = chief2.getPassword();
        chief2.logout();
        java.lang.String str8 = chief2.getPassword();
        java.lang.String str9 = chief2.getID();
        chief2.logout();
        java.lang.String str11 = chief2.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "chief" + "'", str9, "chief");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "chief" + "'", str11, "chief");
    }

    @Test
    public void test15850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15850");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.viewProfile();
        java.lang.String str4 = chief2.getPassword();
        chief2.login("", "");
        double double8 = chief2.getHourlyRate();
        double double9 = chief2.getHourlyRate();
        java.lang.String str10 = chief2.getEmail();
        java.lang.String str11 = chief2.getAccountType();
        chief2.logout();
        chief2.logout();
        chief2.login("chief", "");
        chief2.login("", "");
        chief2.logout();
        java.lang.String str21 = chief2.getID();
        java.lang.String str22 = chief2.getID();
        java.lang.String str23 = chief2.getAccountType();
        java.lang.String str24 = chief2.getID();
        chief2.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "chief" + "'", str11, "chief");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "chief" + "'", str21, "chief");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "chief" + "'", str22, "chief");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "chief" + "'", str23, "chief");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "chief" + "'", str24, "chief");
    }

    @Test
    public void test15851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15851");
        model.Chief chief2 = new model.Chief("hi!", "");
        java.lang.String str3 = chief2.getID();
        java.lang.String str4 = chief2.getPassword();
        chief2.logout();
        boolean boolean6 = chief2.isVerified();
        chief2.setVerified(false);
        java.lang.String str9 = chief2.getID();
        boolean boolean10 = chief2.isVerified();
        java.lang.String str11 = chief2.getPassword();
        chief2.login("", "hi!");
        java.lang.String str15 = chief2.getPassword();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "chief" + "'", str3, "chief");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "chief" + "'", str9, "chief");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test15852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15852");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        chief2.viewProfile();
        chief2.setVerified(false);
        java.lang.String str7 = chief2.getEmail();
        java.lang.String str8 = chief2.getPassword();
        java.lang.String str9 = chief2.getID();
        boolean boolean10 = chief2.isVerified();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "chief" + "'", str9, "chief");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test15853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15853");
        model.Chief chief2 = new model.Chief("hi!", "");
        java.lang.String str3 = chief2.getID();
        java.lang.String str4 = chief2.getPassword();
        java.lang.String str5 = chief2.getPassword();
        chief2.viewProfile();
        chief2.setVerified(false);
        boolean boolean9 = chief2.isVerified();
        chief2.login("hi!", "");
        java.lang.String str13 = chief2.getEmail();
        java.lang.String str14 = chief2.getEmail();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "chief" + "'", str3, "chief");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test15854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15854");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        java.lang.String str4 = chief2.getAccountType();
        java.lang.String str5 = chief2.getID();
        java.lang.String str6 = chief2.getEmail();
        java.lang.String str7 = chief2.getEmail();
        java.lang.String str8 = chief2.getEmail();
        java.lang.String str9 = chief2.getID();
        java.lang.String str10 = chief2.getAccountType();
        chief2.viewProfile();
        java.lang.String str12 = chief2.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "chief" + "'", str9, "chief");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "chief" + "'", str10, "chief");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "chief" + "'", str12, "chief");
    }

    @Test
    public void test15855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15855");
        model.Chief chief2 = new model.Chief("hi!", "");
        java.lang.String str3 = chief2.getID();
        chief2.viewProfile();
        chief2.login("", "");
        double double8 = chief2.getHourlyRate();
        chief2.login("hi!", "");
        double double12 = chief2.getHourlyRate();
        chief2.login("chief", "chief");
        chief2.viewProfile();
        java.lang.String str17 = chief2.getEmail();
        java.lang.String str18 = chief2.getAccountType();
        chief2.viewProfile();
        java.lang.String str20 = chief2.getEmail();
        java.lang.Class<?> wildcardClass21 = chief2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "chief" + "'", str3, "chief");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "chief" + "'", str18, "chief");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test15856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15856");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        java.lang.String str4 = chief2.getAccountType();
        java.lang.String str5 = chief2.getID();
        double double6 = chief2.getHourlyRate();
        java.lang.String str7 = chief2.getEmail();
        chief2.setVerified(true);
        chief2.login("", "");
        chief2.logout();
        chief2.viewProfile();
        java.lang.String str15 = chief2.getAccountType();
        chief2.viewProfile();
        java.lang.String str17 = chief2.getPassword();
        java.lang.String str18 = chief2.getAccountType();
        chief2.login("", "chief");
        chief2.login("", "hi!");
        chief2.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "chief" + "'", str15, "chief");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "chief" + "'", str18, "chief");
    }

    @Test
    public void test15857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15857");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.viewProfile();
        java.lang.String str4 = chief2.getPassword();
        chief2.logout();
        java.lang.String str6 = chief2.getID();
        chief2.setVerified(false);
        double double9 = chief2.getHourlyRate();
        java.lang.String str10 = chief2.getID();
        java.lang.String str11 = chief2.getAccountType();
        double double12 = chief2.getHourlyRate();
        java.lang.String str13 = chief2.getID();
        java.lang.String str14 = chief2.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "chief" + "'", str6, "chief");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "chief" + "'", str10, "chief");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "chief" + "'", str11, "chief");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "chief" + "'", str13, "chief");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test15858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15858");
        model.Chief chief2 = new model.Chief("", "chief");
        chief2.setVerified(false);
        chief2.logout();
        java.lang.String str6 = chief2.getPassword();
        chief2.logout();
        java.lang.String str8 = chief2.getEmail();
        chief2.viewProfile();
        chief2.logout();
        java.lang.String str11 = chief2.getPassword();
        chief2.login("", "chief");
        java.lang.String str15 = chief2.getID();
        chief2.setVerified(false);
        boolean boolean18 = chief2.isVerified();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "chief" + "'", str6, "chief");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "chief" + "'", str11, "chief");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "chief" + "'", str15, "chief");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test15859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15859");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        java.lang.String str4 = chief2.getAccountType();
        java.lang.String str5 = chief2.getPassword();
        java.lang.String str6 = chief2.getPassword();
        chief2.setVerified(false);
        chief2.login("chief", "");
        chief2.setVerified(false);
        java.lang.String str14 = chief2.getPassword();
        boolean boolean15 = chief2.isVerified();
        java.lang.Class<?> wildcardClass16 = chief2.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test15860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15860");
        model.Chief chief2 = new model.Chief("", "chief");
        chief2.setVerified(false);
        java.lang.String str5 = chief2.getPassword();
        java.lang.String str6 = chief2.getAccountType();
        boolean boolean7 = chief2.isVerified();
        boolean boolean8 = chief2.isVerified();
        chief2.login("", "");
        chief2.login("", "");
        chief2.login("chief", "");
        boolean boolean18 = chief2.isVerified();
        java.lang.String str19 = chief2.getID();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "chief" + "'", str6, "chief");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "chief" + "'", str19, "chief");
    }

    @Test
    public void test15861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15861");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.viewProfile();
        java.lang.String str4 = chief2.getPassword();
        chief2.setVerified(false);
        chief2.login("", "");
        chief2.logout();
        chief2.logout();
        chief2.login("hi!", "chief");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test15862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15862");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        double double4 = chief2.getHourlyRate();
        java.lang.String str5 = chief2.getPassword();
        chief2.logout();
        chief2.logout();
        boolean boolean8 = chief2.isVerified();
        java.lang.String str9 = chief2.getAccountType();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "chief" + "'", str9, "chief");
    }

    @Test
    public void test15863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15863");
        model.Chief chief2 = new model.Chief("", "chief");
        chief2.logout();
        chief2.login("", "chief");
        chief2.logout();
        chief2.setVerified(true);
        chief2.logout();
        chief2.setVerified(true);
    }

    @Test
    public void test15864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15864");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.viewProfile();
        java.lang.String str4 = chief2.getPassword();
        chief2.login("", "");
        double double8 = chief2.getHourlyRate();
        double double9 = chief2.getHourlyRate();
        java.lang.String str10 = chief2.getEmail();
        java.lang.String str11 = chief2.getAccountType();
        chief2.logout();
        java.lang.String str13 = chief2.getAccountType();
        chief2.viewProfile();
        double double15 = chief2.getHourlyRate();
        java.lang.String str16 = chief2.getEmail();
        java.lang.String str17 = chief2.getEmail();
        java.lang.String str18 = chief2.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "chief" + "'", str11, "chief");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "chief" + "'", str13, "chief");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test15865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15865");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.viewProfile();
        java.lang.String str4 = chief2.getPassword();
        chief2.login("", "");
        java.lang.String str8 = chief2.getAccountType();
        chief2.logout();
        chief2.logout();
        chief2.viewProfile();
        chief2.logout();
        chief2.logout();
        java.lang.String str14 = chief2.getPassword();
        java.lang.String str15 = chief2.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "chief" + "'", str8, "chief");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "chief" + "'", str15, "chief");
    }

    @Test
    public void test15866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15866");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.setVerified(false);
        chief2.logout();
        java.lang.String str6 = chief2.getEmail();
        java.lang.String str7 = chief2.getAccountType();
        chief2.viewProfile();
        java.lang.String str9 = chief2.getEmail();
        double double10 = chief2.getHourlyRate();
        chief2.logout();
        boolean boolean12 = chief2.isVerified();
        boolean boolean13 = chief2.isVerified();
        java.lang.String str14 = chief2.getAccountType();
        chief2.viewProfile();
        java.lang.String str16 = chief2.getID();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "chief" + "'", str7, "chief");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "chief" + "'", str14, "chief");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "chief" + "'", str16, "chief");
    }

    @Test
    public void test15867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15867");
        model.Chief chief2 = new model.Chief("", "chief");
        chief2.setVerified(false);
        chief2.logout();
        chief2.login("chief", "hi!");
        java.lang.String str9 = chief2.getID();
        double double10 = chief2.getHourlyRate();
        java.lang.String str11 = chief2.getPassword();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "chief" + "'", str9, "chief");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "chief" + "'", str11, "chief");
    }

    @Test
    public void test15868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15868");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.viewProfile();
        java.lang.String str4 = chief2.getPassword();
        java.lang.String str5 = chief2.getEmail();
        java.lang.String str6 = chief2.getID();
        chief2.logout();
        boolean boolean8 = chief2.isVerified();
        chief2.setVerified(false);
        chief2.viewProfile();
        chief2.logout();
        java.lang.String str13 = chief2.getPassword();
        java.lang.String str14 = chief2.getPassword();
        java.lang.String str15 = chief2.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "chief" + "'", str6, "chief");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test15869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15869");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.viewProfile();
        chief2.setVerified(false);
        java.lang.String str6 = chief2.getID();
        java.lang.String str7 = chief2.getAccountType();
        chief2.login("", "");
        chief2.viewProfile();
        java.lang.String str12 = chief2.getPassword();
        chief2.login("chief", "hi!");
        chief2.login("hi!", "hi!");
        java.lang.String str19 = chief2.getID();
        java.lang.String str20 = chief2.getEmail();
        chief2.setVerified(true);
        boolean boolean23 = chief2.isVerified();
        java.lang.String str24 = chief2.getID();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "chief" + "'", str6, "chief");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "chief" + "'", str7, "chief");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "chief" + "'", str19, "chief");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "chief" + "'", str24, "chief");
    }

    @Test
    public void test15870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15870");
        model.Chief chief2 = new model.Chief("hi!", "");
        java.lang.String str3 = chief2.getAccountType();
        java.lang.String str4 = chief2.getAccountType();
        java.lang.String str5 = chief2.getPassword();
        java.lang.String str6 = chief2.getEmail();
        double double7 = chief2.getHourlyRate();
        java.lang.String str8 = chief2.getID();
        java.lang.String str9 = chief2.getEmail();
        java.lang.String str10 = chief2.getEmail();
        chief2.logout();
        chief2.setVerified(true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "chief" + "'", str3, "chief");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "chief" + "'", str8, "chief");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test15871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15871");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        chief2.logout();
        double double5 = chief2.getHourlyRate();
        java.lang.String str6 = chief2.getEmail();
        boolean boolean7 = chief2.isVerified();
        double double8 = chief2.getHourlyRate();
        java.lang.String str9 = chief2.getEmail();
        chief2.setVerified(true);
        java.lang.String str12 = chief2.getEmail();
        java.lang.Class<?> wildcardClass13 = chief2.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test15872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15872");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        chief2.logout();
        double double5 = chief2.getHourlyRate();
        java.lang.String str6 = chief2.getEmail();
        boolean boolean7 = chief2.isVerified();
        chief2.logout();
        chief2.login("", "");
        double double12 = chief2.getHourlyRate();
        java.lang.String str13 = chief2.getID();
        java.lang.String str14 = chief2.getAccountType();
        chief2.viewProfile();
        boolean boolean16 = chief2.isVerified();
        chief2.logout();
        java.lang.String str18 = chief2.getPassword();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "chief" + "'", str13, "chief");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "chief" + "'", str14, "chief");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test15873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15873");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        java.lang.String str4 = chief2.getAccountType();
        java.lang.String str5 = chief2.getID();
        boolean boolean6 = chief2.isVerified();
        chief2.logout();
        double double8 = chief2.getHourlyRate();
        java.lang.String str9 = chief2.getEmail();
        java.lang.String str10 = chief2.getPassword();
        boolean boolean11 = chief2.isVerified();
        chief2.login("chief", "");
        boolean boolean15 = chief2.isVerified();
        java.lang.String str16 = chief2.getAccountType();
        java.lang.String str17 = chief2.getID();
        chief2.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "chief" + "'", str16, "chief");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "chief" + "'", str17, "chief");
    }

    @Test
    public void test15874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15874");
        model.Chief chief2 = new model.Chief("hi!", "");
        java.lang.String str3 = chief2.getID();
        java.lang.String str4 = chief2.getPassword();
        double double5 = chief2.getHourlyRate();
        double double6 = chief2.getHourlyRate();
        chief2.login("", "");
        boolean boolean10 = chief2.isVerified();
        chief2.viewProfile();
        java.lang.String str12 = chief2.getID();
        chief2.setVerified(true);
        chief2.logout();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "chief" + "'", str3, "chief");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "chief" + "'", str12, "chief");
    }

    @Test
    public void test15875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15875");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        java.lang.String str4 = chief2.getAccountType();
        java.lang.String str5 = chief2.getID();
        java.lang.String str6 = chief2.getEmail();
        java.lang.String str7 = chief2.getID();
        java.lang.String str8 = chief2.getEmail();
        chief2.login("hi!", "chief");
        boolean boolean12 = chief2.isVerified();
        chief2.logout();
        boolean boolean14 = chief2.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "chief" + "'", str7, "chief");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test15876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15876");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.viewProfile();
        java.lang.String str4 = chief2.getPassword();
        chief2.logout();
        java.lang.String str6 = chief2.getID();
        chief2.setVerified(false);
        double double9 = chief2.getHourlyRate();
        java.lang.String str10 = chief2.getEmail();
        java.lang.String str11 = chief2.getAccountType();
        chief2.viewProfile();
        java.lang.String str13 = chief2.getAccountType();
        java.lang.String str14 = chief2.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "chief" + "'", str6, "chief");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "chief" + "'", str11, "chief");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "chief" + "'", str13, "chief");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "chief" + "'", str14, "chief");
    }

    @Test
    public void test15877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15877");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        chief2.logout();
        double double5 = chief2.getHourlyRate();
        java.lang.String str6 = chief2.getEmail();
        chief2.logout();
        chief2.login("chief", "chief");
        boolean boolean11 = chief2.isVerified();
        chief2.viewProfile();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test15878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15878");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        java.lang.String str4 = chief2.getAccountType();
        java.lang.String str5 = chief2.getPassword();
        java.lang.String str6 = chief2.getEmail();
        boolean boolean7 = chief2.isVerified();
        chief2.setVerified(true);
        java.lang.String str10 = chief2.getPassword();
        chief2.setVerified(true);
        chief2.login("", "hi!");
        java.lang.String str16 = chief2.getAccountType();
        java.lang.String str17 = chief2.getID();
        chief2.logout();
        java.lang.String str19 = chief2.getPassword();
        java.lang.String str20 = chief2.getID();
        java.lang.String str21 = chief2.getAccountType();
        java.lang.String str22 = chief2.getAccountType();
        boolean boolean23 = chief2.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "chief" + "'", str16, "chief");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "chief" + "'", str17, "chief");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "chief" + "'", str20, "chief");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "chief" + "'", str21, "chief");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "chief" + "'", str22, "chief");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test15879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15879");
        model.Chief chief2 = new model.Chief("", "chief");
        chief2.setVerified(false);
        java.lang.String str5 = chief2.getPassword();
        java.lang.String str6 = chief2.getAccountType();
        double double7 = chief2.getHourlyRate();
        chief2.logout();
        java.lang.String str9 = chief2.getEmail();
        chief2.setVerified(false);
        boolean boolean12 = chief2.isVerified();
        boolean boolean13 = chief2.isVerified();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "chief" + "'", str6, "chief");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test15880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15880");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        chief2.viewProfile();
        chief2.setVerified(false);
        chief2.logout();
        java.lang.String str8 = chief2.getEmail();
        chief2.login("", "chief");
        chief2.logout();
        java.lang.String str13 = chief2.getID();
        java.lang.Class<?> wildcardClass14 = chief2.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "chief" + "'", str13, "chief");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test15881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15881");
        model.Chief chief2 = new model.Chief("", "chief");
        chief2.setVerified(false);
        java.lang.String str5 = chief2.getPassword();
        java.lang.String str6 = chief2.getAccountType();
        chief2.logout();
        double double8 = chief2.getHourlyRate();
        double double9 = chief2.getHourlyRate();
        java.lang.String str10 = chief2.getPassword();
        chief2.viewProfile();
        chief2.login("hi!", "");
        java.lang.String str15 = chief2.getEmail();
        boolean boolean16 = chief2.isVerified();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "chief" + "'", str6, "chief");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "chief" + "'", str10, "chief");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test15882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15882");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        chief2.viewProfile();
        chief2.setVerified(false);
        chief2.logout();
        java.lang.String str8 = chief2.getEmail();
        chief2.login("hi!", "hi!");
        chief2.viewProfile();
        java.lang.String str13 = chief2.getEmail();
        double double14 = chief2.getHourlyRate();
        boolean boolean15 = chief2.isVerified();
        java.lang.String str16 = chief2.getID();
        chief2.logout();
        java.lang.String str18 = chief2.getPassword();
        chief2.viewProfile();
        java.lang.String str20 = chief2.getPassword();
        java.lang.String str21 = chief2.getEmail();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "chief" + "'", str16, "chief");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
    }

    @Test
    public void test15883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15883");
        model.Chief chief2 = new model.Chief("hi!", "");
        java.lang.String str3 = chief2.getAccountType();
        chief2.setVerified(true);
        java.lang.String str6 = chief2.getEmail();
        chief2.viewProfile();
        chief2.logout();
        chief2.setVerified(false);
        boolean boolean11 = chief2.isVerified();
        java.lang.String str12 = chief2.getAccountType();
        java.lang.String str13 = chief2.getID();
        chief2.setVerified(false);
        chief2.viewProfile();
        chief2.login("hi!", "hi!");
        boolean boolean20 = chief2.isVerified();
        java.lang.Class<?> wildcardClass21 = chief2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "chief" + "'", str3, "chief");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "chief" + "'", str12, "chief");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "chief" + "'", str13, "chief");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test15884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15884");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.viewProfile();
        java.lang.String str4 = chief2.getPassword();
        chief2.login("", "");
        chief2.setVerified(true);
        chief2.logout();
        java.lang.String str11 = chief2.getID();
        chief2.logout();
        double double13 = chief2.getHourlyRate();
        java.lang.String str14 = chief2.getEmail();
        java.lang.String str15 = chief2.getPassword();
        java.lang.String str16 = chief2.getPassword();
        boolean boolean17 = chief2.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "chief" + "'", str11, "chief");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test15885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15885");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.viewProfile();
        java.lang.String str4 = chief2.getPassword();
        chief2.logout();
        java.lang.String str6 = chief2.getID();
        chief2.setVerified(false);
        chief2.viewProfile();
        java.lang.String str10 = chief2.getID();
        java.lang.String str11 = chief2.getID();
        chief2.viewProfile();
        java.lang.String str13 = chief2.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "chief" + "'", str6, "chief");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "chief" + "'", str10, "chief");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "chief" + "'", str11, "chief");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "chief" + "'", str13, "chief");
    }

    @Test
    public void test15886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15886");
        model.Chief chief2 = new model.Chief("hi!", "");
        java.lang.String str3 = chief2.getAccountType();
        double double4 = chief2.getHourlyRate();
        chief2.login("hi!", "chief");
        chief2.logout();
        chief2.login("hi!", "hi!");
        chief2.login("", "hi!");
        java.lang.String str15 = chief2.getAccountType();
        java.lang.String str16 = chief2.getID();
        double double17 = chief2.getHourlyRate();
        chief2.logout();
        java.lang.Class<?> wildcardClass19 = chief2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "chief" + "'", str3, "chief");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "chief" + "'", str15, "chief");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "chief" + "'", str16, "chief");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test15887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15887");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        chief2.logout();
        double double5 = chief2.getHourlyRate();
        java.lang.String str6 = chief2.getAccountType();
        chief2.setVerified(true);
        chief2.login("", "chief");
        java.lang.String str12 = chief2.getAccountType();
        java.lang.String str13 = chief2.getPassword();
        java.lang.String str14 = chief2.getPassword();
        java.lang.String str15 = chief2.getEmail();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "chief" + "'", str6, "chief");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "chief" + "'", str12, "chief");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test15888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15888");
        model.Chief chief2 = new model.Chief("", "chief");
        chief2.setVerified(false);
        java.lang.String str5 = chief2.getPassword();
        java.lang.String str6 = chief2.getAccountType();
        chief2.logout();
        double double8 = chief2.getHourlyRate();
        double double9 = chief2.getHourlyRate();
        java.lang.String str10 = chief2.getPassword();
        java.lang.String str11 = chief2.getAccountType();
        java.lang.String str12 = chief2.getEmail();
        chief2.setVerified(true);
        chief2.logout();
        chief2.setVerified(false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "chief" + "'", str6, "chief");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "chief" + "'", str10, "chief");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "chief" + "'", str11, "chief");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test15889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15889");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        java.lang.String str4 = chief2.getAccountType();
        java.lang.String str5 = chief2.getID();
        chief2.setVerified(false);
        chief2.logout();
        chief2.login("", "chief");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
    }

    @Test
    public void test15890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15890");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.setVerified(false);
        chief2.logout();
        double double6 = chief2.getHourlyRate();
        chief2.login("chief", "");
        boolean boolean10 = chief2.isVerified();
        chief2.login("hi!", "");
        java.lang.String str14 = chief2.getEmail();
        java.lang.Class<?> wildcardClass15 = chief2.getClass();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test15891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15891");
        model.Chief chief2 = new model.Chief("hi!", "");
        java.lang.String str3 = chief2.getID();
        chief2.logout();
        chief2.login("hi!", "");
        chief2.setVerified(false);
        java.lang.String str10 = chief2.getEmail();
        boolean boolean11 = chief2.isVerified();
        boolean boolean12 = chief2.isVerified();
        chief2.viewProfile();
        java.lang.String str14 = chief2.getID();
        chief2.setVerified(true);
        java.lang.String str17 = chief2.getAccountType();
        java.lang.String str18 = chief2.getAccountType();
        java.lang.String str19 = chief2.getEmail();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "chief" + "'", str3, "chief");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "chief" + "'", str14, "chief");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "chief" + "'", str17, "chief");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "chief" + "'", str18, "chief");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test15892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15892");
        model.Chief chief2 = new model.Chief("hi!", "");
        java.lang.String str3 = chief2.getPassword();
        chief2.viewProfile();
        chief2.setVerified(true);
        chief2.setVerified(true);
        java.lang.String str9 = chief2.getPassword();
        chief2.setVerified(true);
        java.lang.String str12 = chief2.getID();
        chief2.viewProfile();
        chief2.viewProfile();
        java.lang.String str15 = chief2.getEmail();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "chief" + "'", str12, "chief");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test15893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15893");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        chief2.viewProfile();
        chief2.setVerified(false);
        chief2.logout();
        java.lang.String str8 = chief2.getEmail();
        chief2.setVerified(false);
        chief2.viewProfile();
        chief2.login("", "");
        double double15 = chief2.getHourlyRate();
        chief2.login("", "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test15894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15894");
        model.Chief chief2 = new model.Chief("", "chief");
        chief2.setVerified(false);
        java.lang.String str5 = chief2.getPassword();
        java.lang.String str6 = chief2.getAccountType();
        chief2.logout();
        chief2.viewProfile();
        boolean boolean9 = chief2.isVerified();
        chief2.viewProfile();
        chief2.login("chief", "chief");
        double double14 = chief2.getHourlyRate();
        double double15 = chief2.getHourlyRate();
        java.lang.String str16 = chief2.getID();
        java.lang.Class<?> wildcardClass17 = chief2.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "chief" + "'", str6, "chief");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "chief" + "'", str16, "chief");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test15895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15895");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        chief2.viewProfile();
        chief2.setVerified(false);
        chief2.logout();
        chief2.logout();
        java.lang.String str9 = chief2.getPassword();
        boolean boolean10 = chief2.isVerified();
        chief2.logout();
        double double12 = chief2.getHourlyRate();
        chief2.logout();
        double double14 = chief2.getHourlyRate();
        java.lang.String str15 = chief2.getEmail();
        java.lang.String str16 = chief2.getAccountType();
        java.lang.String str17 = chief2.getEmail();
        java.lang.String str18 = chief2.getID();
        java.lang.String str19 = chief2.getAccountType();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "chief" + "'", str16, "chief");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "chief" + "'", str18, "chief");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "chief" + "'", str19, "chief");
    }

    @Test
    public void test15896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15896");
        model.Chief chief2 = new model.Chief("hi!", "");
        java.lang.String str3 = chief2.getID();
        chief2.logout();
        chief2.login("hi!", "");
        boolean boolean8 = chief2.isVerified();
        chief2.setVerified(false);
        java.lang.String str11 = chief2.getAccountType();
        java.lang.String str12 = chief2.getAccountType();
        java.lang.String str13 = chief2.getPassword();
        boolean boolean14 = chief2.isVerified();
        chief2.login("chief", "");
        java.lang.String str18 = chief2.getPassword();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "chief" + "'", str3, "chief");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "chief" + "'", str11, "chief");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "chief" + "'", str12, "chief");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test15897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15897");
        model.Chief chief2 = new model.Chief("hi!", "");
        java.lang.String str3 = chief2.getID();
        java.lang.String str4 = chief2.getPassword();
        chief2.logout();
        double double6 = chief2.getHourlyRate();
        java.lang.String str7 = chief2.getPassword();
        java.lang.String str8 = chief2.getID();
        java.lang.String str9 = chief2.getID();
        chief2.login("hi!", "");
        java.lang.String str13 = chief2.getAccountType();
        java.lang.String str14 = chief2.getAccountType();
        java.lang.Class<?> wildcardClass15 = chief2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "chief" + "'", str3, "chief");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "chief" + "'", str8, "chief");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "chief" + "'", str9, "chief");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "chief" + "'", str13, "chief");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "chief" + "'", str14, "chief");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test15898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15898");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        java.lang.String str4 = chief2.getAccountType();
        java.lang.String str5 = chief2.getPassword();
        java.lang.String str6 = chief2.getEmail();
        boolean boolean7 = chief2.isVerified();
        chief2.setVerified(true);
        java.lang.String str10 = chief2.getPassword();
        chief2.setVerified(true);
        chief2.login("", "hi!");
        double double16 = chief2.getHourlyRate();
        java.lang.String str17 = chief2.getPassword();
        java.lang.String str18 = chief2.getID();
        chief2.login("chief", "chief");
        chief2.login("", "chief");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "chief" + "'", str18, "chief");
    }

    @Test
    public void test15899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15899");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.viewProfile();
        java.lang.String str4 = chief2.getPassword();
        java.lang.String str5 = chief2.getEmail();
        chief2.logout();
        chief2.setVerified(true);
        chief2.viewProfile();
        java.lang.String str10 = chief2.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "chief" + "'", str10, "chief");
    }

    @Test
    public void test15900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15900");
        model.Chief chief2 = new model.Chief("hi!", "");
        java.lang.String str3 = chief2.getID();
        java.lang.String str4 = chief2.getPassword();
        java.lang.String str5 = chief2.getPassword();
        java.lang.String str6 = chief2.getEmail();
        chief2.login("", "chief");
        chief2.login("chief", "hi!");
        chief2.login("hi!", "");
        double double16 = chief2.getHourlyRate();
        java.lang.String str17 = chief2.getPassword();
        double double18 = chief2.getHourlyRate();
        chief2.logout();
        java.lang.String str20 = chief2.getEmail();
        double double21 = chief2.getHourlyRate();
        java.lang.String str22 = chief2.getAccountType();
        java.lang.String str23 = chief2.getPassword();
        java.lang.String str24 = chief2.getPassword();
        boolean boolean25 = chief2.isVerified();
        chief2.login("chief", "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "chief" + "'", str3, "chief");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "chief" + "'", str22, "chief");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test15901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15901");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        java.lang.String str4 = chief2.getID();
        java.lang.String str5 = chief2.getEmail();
        chief2.login("hi!", "chief");
        boolean boolean9 = chief2.isVerified();
        double double10 = chief2.getHourlyRate();
        chief2.viewProfile();
        java.lang.String str12 = chief2.getPassword();
        java.lang.String str13 = chief2.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "chief" + "'", str13, "chief");
    }

    @Test
    public void test15902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15902");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        java.lang.String str4 = chief2.getAccountType();
        java.lang.String str5 = chief2.getID();
        boolean boolean6 = chief2.isVerified();
        chief2.logout();
        chief2.viewProfile();
        chief2.login("chief", "");
        java.lang.String str12 = chief2.getAccountType();
        java.lang.String str13 = chief2.getID();
        chief2.login("", "hi!");
        java.lang.String str17 = chief2.getEmail();
        chief2.login("", "chief");
        java.lang.String str21 = chief2.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "chief" + "'", str12, "chief");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "chief" + "'", str13, "chief");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test15903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15903");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.viewProfile();
        java.lang.String str4 = chief2.getPassword();
        java.lang.String str5 = chief2.getEmail();
        java.lang.String str6 = chief2.getID();
        double double7 = chief2.getHourlyRate();
        java.lang.String str8 = chief2.getID();
        double double9 = chief2.getHourlyRate();
        chief2.setVerified(true);
        chief2.logout();
        chief2.viewProfile();
        java.lang.String str14 = chief2.getPassword();
        double double15 = chief2.getHourlyRate();
        boolean boolean16 = chief2.isVerified();
        double double17 = chief2.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "chief" + "'", str6, "chief");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "chief" + "'", str8, "chief");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
    }

    @Test
    public void test15904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15904");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.viewProfile();
        java.lang.String str4 = chief2.getPassword();
        boolean boolean5 = chief2.isVerified();
        java.lang.String str6 = chief2.getID();
        java.lang.String str7 = chief2.getID();
        chief2.setVerified(true);
        chief2.login("chief", "hi!");
        chief2.login("", "chief");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "chief" + "'", str6, "chief");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "chief" + "'", str7, "chief");
    }

    @Test
    public void test15905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15905");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        java.lang.String str4 = chief2.getAccountType();
        chief2.logout();
        java.lang.String str6 = chief2.getPassword();
        chief2.logout();
        double double8 = chief2.getHourlyRate();
        chief2.viewProfile();
        chief2.logout();
        boolean boolean11 = chief2.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test15906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15906");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        chief2.viewProfile();
        chief2.setVerified(false);
        java.lang.String str7 = chief2.getID();
        chief2.logout();
        java.lang.String str9 = chief2.getAccountType();
        chief2.logout();
        chief2.logout();
        java.lang.String str12 = chief2.getPassword();
        java.lang.String str13 = chief2.getAccountType();
        java.lang.String str14 = chief2.getEmail();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "chief" + "'", str7, "chief");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "chief" + "'", str9, "chief");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "chief" + "'", str13, "chief");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test15907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15907");
        model.Chief chief2 = new model.Chief("hi!", "");
        java.lang.String str3 = chief2.getID();
        java.lang.String str4 = chief2.getPassword();
        chief2.logout();
        boolean boolean6 = chief2.isVerified();
        java.lang.String str7 = chief2.getAccountType();
        java.lang.String str8 = chief2.getPassword();
        java.lang.String str9 = chief2.getID();
        chief2.logout();
        java.lang.Class<?> wildcardClass11 = chief2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "chief" + "'", str3, "chief");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "chief" + "'", str7, "chief");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "chief" + "'", str9, "chief");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test15908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15908");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        chief2.viewProfile();
        chief2.setVerified(false);
        java.lang.String str7 = chief2.getID();
        java.lang.String str8 = chief2.getID();
        java.lang.String str9 = chief2.getID();
        chief2.viewProfile();
        java.lang.String str11 = chief2.getEmail();
        chief2.viewProfile();
        chief2.logout();
        double double14 = chief2.getHourlyRate();
        java.lang.Class<?> wildcardClass15 = chief2.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "chief" + "'", str7, "chief");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "chief" + "'", str8, "chief");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "chief" + "'", str9, "chief");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test15909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15909");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.setVerified(false);
        chief2.logout();
        chief2.logout();
        java.lang.String str7 = chief2.getEmail();
        java.lang.Class<?> wildcardClass8 = chief2.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test15910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15910");
        model.Chief chief2 = new model.Chief("hi!", "");
        java.lang.String str3 = chief2.getID();
        java.lang.String str4 = chief2.getPassword();
        double double5 = chief2.getHourlyRate();
        double double6 = chief2.getHourlyRate();
        chief2.login("", "");
        chief2.viewProfile();
        chief2.viewProfile();
        java.lang.String str12 = chief2.getID();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "chief" + "'", str3, "chief");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "chief" + "'", str12, "chief");
    }

    @Test
    public void test15911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15911");
        model.Chief chief2 = new model.Chief("hi!", "");
        java.lang.String str3 = chief2.getAccountType();
        chief2.setVerified(true);
        java.lang.String str6 = chief2.getEmail();
        chief2.viewProfile();
        boolean boolean8 = chief2.isVerified();
        java.lang.String str9 = chief2.getID();
        java.lang.String str10 = chief2.getPassword();
        chief2.viewProfile();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "chief" + "'", str3, "chief");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "chief" + "'", str9, "chief");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test15912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15912");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        java.lang.String str4 = chief2.getAccountType();
        java.lang.String str5 = chief2.getPassword();
        java.lang.String str6 = chief2.getEmail();
        boolean boolean7 = chief2.isVerified();
        chief2.setVerified(true);
        java.lang.String str10 = chief2.getEmail();
        java.lang.String str11 = chief2.getID();
        java.lang.String str12 = chief2.getAccountType();
        chief2.login("chief", "hi!");
        chief2.logout();
        chief2.viewProfile();
        java.lang.String str18 = chief2.getEmail();
        double double19 = chief2.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "chief" + "'", str11, "chief");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "chief" + "'", str12, "chief");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
    }

    @Test
    public void test15913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15913");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        chief2.viewProfile();
        chief2.setVerified(false);
        java.lang.String str7 = chief2.getID();
        double double8 = chief2.getHourlyRate();
        double double9 = chief2.getHourlyRate();
        java.lang.String str10 = chief2.getEmail();
        java.lang.String str11 = chief2.getEmail();
        chief2.viewProfile();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "chief" + "'", str7, "chief");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test15914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15914");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.viewProfile();
        chief2.setVerified(false);
        java.lang.String str6 = chief2.getID();
        java.lang.String str7 = chief2.getPassword();
        boolean boolean8 = chief2.isVerified();
        boolean boolean9 = chief2.isVerified();
        chief2.login("hi!", "hi!");
        chief2.setVerified(false);
        chief2.login("", "hi!");
        java.lang.String str18 = chief2.getAccountType();
        java.lang.String str19 = chief2.getID();
        double double20 = chief2.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "chief" + "'", str6, "chief");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "chief" + "'", str18, "chief");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "chief" + "'", str19, "chief");
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
    }

    @Test
    public void test15915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15915");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        java.lang.String str4 = chief2.getAccountType();
        java.lang.String str5 = chief2.getPassword();
        java.lang.String str6 = chief2.getPassword();
        chief2.setVerified(false);
        chief2.viewProfile();
        java.lang.String str10 = chief2.getPassword();
        java.lang.String str11 = chief2.getAccountType();
        chief2.viewProfile();
        java.lang.String str13 = chief2.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "chief" + "'", str11, "chief");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "chief" + "'", str13, "chief");
    }

    @Test
    public void test15916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15916");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.viewProfile();
        chief2.setVerified(false);
        java.lang.String str6 = chief2.getID();
        chief2.setVerified(false);
        boolean boolean9 = chief2.isVerified();
        boolean boolean10 = chief2.isVerified();
        chief2.login("", "chief");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "chief" + "'", str6, "chief");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test15917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15917");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.setVerified(false);
        chief2.logout();
        java.lang.String str6 = chief2.getEmail();
        java.lang.String str7 = chief2.getPassword();
        boolean boolean8 = chief2.isVerified();
        chief2.login("", "hi!");
        java.lang.String str12 = chief2.getAccountType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "chief" + "'", str12, "chief");
    }

    @Test
    public void test15918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15918");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        java.lang.String str4 = chief2.getAccountType();
        java.lang.String str5 = chief2.getID();
        double double6 = chief2.getHourlyRate();
        java.lang.String str7 = chief2.getEmail();
        chief2.setVerified(true);
        java.lang.String str10 = chief2.getID();
        java.lang.String str11 = chief2.getEmail();
        double double12 = chief2.getHourlyRate();
        java.lang.String str13 = chief2.getPassword();
        chief2.logout();
        chief2.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "chief" + "'", str10, "chief");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test15919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15919");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.viewProfile();
        java.lang.String str4 = chief2.getPassword();
        chief2.login("", "");
        double double8 = chief2.getHourlyRate();
        boolean boolean9 = chief2.isVerified();
        double double10 = chief2.getHourlyRate();
        java.lang.String str11 = chief2.getEmail();
        java.lang.String str12 = chief2.getPassword();
        chief2.login("", "");
        java.lang.String str16 = chief2.getEmail();
        java.lang.String str17 = chief2.getPassword();
        chief2.setVerified(false);
        chief2.logout();
        java.lang.String str21 = chief2.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "chief" + "'", str21, "chief");
    }

    @Test
    public void test15920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15920");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        java.lang.String str4 = chief2.getAccountType();
        java.lang.String str5 = chief2.getPassword();
        java.lang.String str6 = chief2.getEmail();
        boolean boolean7 = chief2.isVerified();
        chief2.login("", "chief");
        chief2.logout();
        chief2.logout();
        boolean boolean13 = chief2.isVerified();
        chief2.logout();
        java.lang.String str15 = chief2.getEmail();
        chief2.setVerified(true);
        chief2.logout();
        chief2.login("hi!", "hi!");
        double double22 = chief2.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
    }

    @Test
    public void test15921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15921");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        chief2.viewProfile();
        chief2.setVerified(false);
        java.lang.String str7 = chief2.getEmail();
        chief2.logout();
        chief2.setVerified(false);
        chief2.logout();
        java.lang.String str12 = chief2.getEmail();
        java.lang.String str13 = chief2.getPassword();
        chief2.login("", "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test15922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15922");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.viewProfile();
        java.lang.String str4 = chief2.getPassword();
        chief2.logout();
        java.lang.String str6 = chief2.getID();
        chief2.setVerified(false);
        chief2.viewProfile();
        java.lang.String str10 = chief2.getID();
        chief2.logout();
        java.lang.String str12 = chief2.getAccountType();
        chief2.login("", "chief");
        chief2.setVerified(true);
        boolean boolean18 = chief2.isVerified();
        chief2.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "chief" + "'", str6, "chief");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "chief" + "'", str10, "chief");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "chief" + "'", str12, "chief");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test15923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15923");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        chief2.logout();
        double double5 = chief2.getHourlyRate();
        java.lang.String str6 = chief2.getEmail();
        java.lang.String str7 = chief2.getPassword();
        chief2.login("chief", "chief");
        chief2.setVerified(false);
        chief2.login("hi!", "chief");
        chief2.logout();
        java.lang.String str17 = chief2.getID();
        java.lang.String str18 = chief2.getEmail();
        java.lang.String str19 = chief2.getAccountType();
        java.lang.String str20 = chief2.getEmail();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "chief" + "'", str17, "chief");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "chief" + "'", str19, "chief");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test15924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15924");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.viewProfile();
        chief2.viewProfile();
        java.lang.String str5 = chief2.getAccountType();
        chief2.viewProfile();
        java.lang.String str7 = chief2.getEmail();
        chief2.setVerified(false);
        java.lang.String str10 = chief2.getID();
        chief2.login("", "hi!");
        chief2.setVerified(true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "chief" + "'", str10, "chief");
    }

    @Test
    public void test15925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15925");
        model.Chief chief2 = new model.Chief("hi!", "");
        java.lang.String str3 = chief2.getAccountType();
        java.lang.String str4 = chief2.getAccountType();
        java.lang.String str5 = chief2.getPassword();
        java.lang.String str6 = chief2.getEmail();
        double double7 = chief2.getHourlyRate();
        java.lang.String str8 = chief2.getID();
        java.lang.String str9 = chief2.getEmail();
        java.lang.String str10 = chief2.getEmail();
        java.lang.String str11 = chief2.getPassword();
        chief2.viewProfile();
        java.lang.String str13 = chief2.getPassword();
        double double14 = chief2.getHourlyRate();
        java.lang.String str15 = chief2.getAccountType();
        java.lang.Class<?> wildcardClass16 = chief2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "chief" + "'", str3, "chief");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "chief" + "'", str8, "chief");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "chief" + "'", str15, "chief");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test15926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15926");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        java.lang.String str4 = chief2.getID();
        java.lang.String str5 = chief2.getEmail();
        chief2.login("hi!", "chief");
        boolean boolean9 = chief2.isVerified();
        double double10 = chief2.getHourlyRate();
        chief2.viewProfile();
        chief2.viewProfile();
        java.lang.String str13 = chief2.getEmail();
        java.lang.String str14 = chief2.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test15927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15927");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        java.lang.String str4 = chief2.getAccountType();
        java.lang.String str5 = chief2.getPassword();
        java.lang.String str6 = chief2.getEmail();
        boolean boolean7 = chief2.isVerified();
        chief2.setVerified(true);
        java.lang.String str10 = chief2.getPassword();
        chief2.setVerified(true);
        chief2.login("", "hi!");
        java.lang.String str16 = chief2.getAccountType();
        java.lang.String str17 = chief2.getEmail();
        java.lang.String str18 = chief2.getEmail();
        java.lang.String str19 = chief2.getEmail();
        double double20 = chief2.getHourlyRate();
        java.lang.String str21 = chief2.getID();
        java.lang.String str22 = chief2.getEmail();
        java.lang.String str23 = chief2.getEmail();
        chief2.logout();
        java.lang.String str25 = chief2.getID();
        double double26 = chief2.getHourlyRate();
        chief2.logout();
        java.lang.Class<?> wildcardClass28 = chief2.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "chief" + "'", str16, "chief");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "chief" + "'", str21, "chief");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "chief" + "'", str25, "chief");
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.0d + "'", double26 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test15928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15928");
        model.Chief chief2 = new model.Chief("hi!", "");
        java.lang.String str3 = chief2.getPassword();
        java.lang.String str4 = chief2.getEmail();
        double double5 = chief2.getHourlyRate();
        chief2.viewProfile();
        boolean boolean7 = chief2.isVerified();
        java.lang.String str8 = chief2.getEmail();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test15929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15929");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.viewProfile();
        chief2.setVerified(false);
        java.lang.String str6 = chief2.getID();
        java.lang.String str7 = chief2.getAccountType();
        java.lang.String str8 = chief2.getPassword();
        double double9 = chief2.getHourlyRate();
        java.lang.String str10 = chief2.getPassword();
        boolean boolean11 = chief2.isVerified();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "chief" + "'", str6, "chief");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "chief" + "'", str7, "chief");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test15930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15930");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        java.lang.String str4 = chief2.getAccountType();
        java.lang.String str5 = chief2.getPassword();
        java.lang.String str6 = chief2.getEmail();
        boolean boolean7 = chief2.isVerified();
        chief2.setVerified(true);
        java.lang.String str10 = chief2.getEmail();
        java.lang.String str11 = chief2.getID();
        chief2.viewProfile();
        java.lang.String str13 = chief2.getEmail();
        java.lang.String str14 = chief2.getID();
        boolean boolean15 = chief2.isVerified();
        chief2.login("", "");
        java.lang.String str19 = chief2.getEmail();
        double double20 = chief2.getHourlyRate();
        java.lang.String str21 = chief2.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "chief" + "'", str11, "chief");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "chief" + "'", str14, "chief");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test15931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15931");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        java.lang.String str4 = chief2.getAccountType();
        java.lang.String str5 = chief2.getID();
        double double6 = chief2.getHourlyRate();
        java.lang.String str7 = chief2.getEmail();
        double double8 = chief2.getHourlyRate();
        chief2.login("chief", "hi!");
        java.lang.String str12 = chief2.getAccountType();
        chief2.viewProfile();
        java.lang.String str14 = chief2.getAccountType();
        chief2.login("", "hi!");
        java.lang.String str18 = chief2.getID();
        java.lang.String str19 = chief2.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "chief" + "'", str12, "chief");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "chief" + "'", str14, "chief");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "chief" + "'", str18, "chief");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "chief" + "'", str19, "chief");
    }

    @Test
    public void test15932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15932");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        chief2.logout();
        double double5 = chief2.getHourlyRate();
        java.lang.String str6 = chief2.getEmail();
        java.lang.String str7 = chief2.getPassword();
        chief2.login("chief", "chief");
        java.lang.String str11 = chief2.getID();
        chief2.viewProfile();
        chief2.setVerified(true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "chief" + "'", str11, "chief");
    }

    @Test
    public void test15933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15933");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        chief2.logout();
        double double5 = chief2.getHourlyRate();
        java.lang.String str6 = chief2.getID();
        chief2.login("hi!", "chief");
        java.lang.String str10 = chief2.getAccountType();
        chief2.setVerified(false);
        java.lang.String str13 = chief2.getAccountType();
        java.lang.String str14 = chief2.getPassword();
        java.lang.String str15 = chief2.getEmail();
        chief2.login("chief", "hi!");
        java.lang.String str19 = chief2.getID();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "chief" + "'", str6, "chief");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "chief" + "'", str10, "chief");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "chief" + "'", str13, "chief");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "chief" + "'", str19, "chief");
    }

    @Test
    public void test15934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15934");
        model.Chief chief2 = new model.Chief("hi!", "");
        java.lang.String str3 = chief2.getID();
        chief2.logout();
        java.lang.String str5 = chief2.getAccountType();
        boolean boolean6 = chief2.isVerified();
        java.lang.String str7 = chief2.getEmail();
        double double8 = chief2.getHourlyRate();
        chief2.logout();
        boolean boolean10 = chief2.isVerified();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "chief" + "'", str3, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test15935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15935");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.viewProfile();
        java.lang.String str4 = chief2.getPassword();
        chief2.logout();
        java.lang.String str6 = chief2.getID();
        chief2.setVerified(false);
        chief2.viewProfile();
        java.lang.String str10 = chief2.getID();
        boolean boolean11 = chief2.isVerified();
        chief2.viewProfile();
        chief2.logout();
        chief2.setVerified(true);
        java.lang.String str16 = chief2.getAccountType();
        chief2.login("hi!", "");
        chief2.logout();
        boolean boolean21 = chief2.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "chief" + "'", str6, "chief");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "chief" + "'", str10, "chief");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "chief" + "'", str16, "chief");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test15936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15936");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.setVerified(false);
        chief2.logout();
        java.lang.String str6 = chief2.getEmail();
        java.lang.String str7 = chief2.getAccountType();
        chief2.viewProfile();
        java.lang.String str9 = chief2.getEmail();
        double double10 = chief2.getHourlyRate();
        chief2.logout();
        boolean boolean12 = chief2.isVerified();
        boolean boolean13 = chief2.isVerified();
        java.lang.String str14 = chief2.getAccountType();
        java.lang.Class<?> wildcardClass15 = chief2.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "chief" + "'", str7, "chief");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "chief" + "'", str14, "chief");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test15937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15937");
        model.Chief chief2 = new model.Chief("hi!", "");
        java.lang.String str3 = chief2.getID();
        java.lang.String str4 = chief2.getPassword();
        java.lang.String str5 = chief2.getPassword();
        java.lang.String str6 = chief2.getEmail();
        double double7 = chief2.getHourlyRate();
        java.lang.String str8 = chief2.getPassword();
        chief2.login("", "hi!");
        java.lang.String str12 = chief2.getEmail();
        chief2.viewProfile();
        chief2.logout();
        java.lang.String str15 = chief2.getAccountType();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "chief" + "'", str3, "chief");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "chief" + "'", str15, "chief");
    }

    @Test
    public void test15938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15938");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        java.lang.String str4 = chief2.getAccountType();
        java.lang.String str5 = chief2.getPassword();
        java.lang.String str6 = chief2.getEmail();
        boolean boolean7 = chief2.isVerified();
        chief2.setVerified(true);
        java.lang.String str10 = chief2.getEmail();
        java.lang.String str11 = chief2.getID();
        chief2.viewProfile();
        java.lang.String str13 = chief2.getEmail();
        java.lang.String str14 = chief2.getID();
        boolean boolean15 = chief2.isVerified();
        java.lang.String str16 = chief2.getEmail();
        chief2.setVerified(true);
        java.lang.String str19 = chief2.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "chief" + "'", str11, "chief");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "chief" + "'", str14, "chief");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test15939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15939");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        chief2.viewProfile();
        chief2.setVerified(false);
        java.lang.String str7 = chief2.getID();
        java.lang.String str8 = chief2.getID();
        boolean boolean9 = chief2.isVerified();
        java.lang.String str10 = chief2.getID();
        java.lang.String str11 = chief2.getPassword();
        chief2.setVerified(true);
        boolean boolean14 = chief2.isVerified();
        chief2.setVerified(false);
        double double17 = chief2.getHourlyRate();
        chief2.viewProfile();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "chief" + "'", str7, "chief");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "chief" + "'", str8, "chief");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "chief" + "'", str10, "chief");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
    }

    @Test
    public void test15940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15940");
        model.Chief chief2 = new model.Chief("", "chief");
        chief2.setVerified(false);
        java.lang.String str5 = chief2.getPassword();
        java.lang.String str6 = chief2.getID();
        chief2.logout();
        java.lang.String str8 = chief2.getID();
        chief2.setVerified(true);
        java.lang.String str11 = chief2.getAccountType();
        chief2.login("hi!", "hi!");
        double double15 = chief2.getHourlyRate();
        java.lang.String str16 = chief2.getID();
        java.lang.String str17 = chief2.getPassword();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "chief" + "'", str6, "chief");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "chief" + "'", str8, "chief");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "chief" + "'", str11, "chief");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "chief" + "'", str16, "chief");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "chief" + "'", str17, "chief");
    }

    @Test
    public void test15941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15941");
        model.Chief chief2 = new model.Chief("", "chief");
        chief2.setVerified(false);
        java.lang.String str5 = chief2.getPassword();
        java.lang.String str6 = chief2.getID();
        java.lang.String str7 = chief2.getAccountType();
        java.lang.String str8 = chief2.getID();
        java.lang.String str9 = chief2.getID();
        chief2.login("chief", "hi!");
        chief2.viewProfile();
        chief2.login("chief", "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "chief" + "'", str6, "chief");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "chief" + "'", str7, "chief");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "chief" + "'", str8, "chief");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "chief" + "'", str9, "chief");
    }

    @Test
    public void test15942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15942");
        model.Chief chief2 = new model.Chief("hi!", "");
        java.lang.String str3 = chief2.getID();
        chief2.logout();
        java.lang.String str5 = chief2.getEmail();
        java.lang.String str6 = chief2.getPassword();
        java.lang.String str7 = chief2.getPassword();
        chief2.logout();
        chief2.login("chief", "");
        java.lang.String str12 = chief2.getAccountType();
        java.lang.String str13 = chief2.getEmail();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "chief" + "'", str3, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "chief" + "'", str12, "chief");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test15943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15943");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        java.lang.String str4 = chief2.getAccountType();
        java.lang.String str5 = chief2.getID();
        chief2.viewProfile();
        double double7 = chief2.getHourlyRate();
        java.lang.String str8 = chief2.getAccountType();
        chief2.login("hi!", "hi!");
        java.lang.String str12 = chief2.getID();
        java.lang.String str13 = chief2.getID();
        chief2.setVerified(false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "chief" + "'", str8, "chief");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "chief" + "'", str12, "chief");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "chief" + "'", str13, "chief");
    }

    @Test
    public void test15944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15944");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.viewProfile();
        java.lang.String str4 = chief2.getPassword();
        java.lang.String str5 = chief2.getAccountType();
        double double6 = chief2.getHourlyRate();
        boolean boolean7 = chief2.isVerified();
        double double8 = chief2.getHourlyRate();
        boolean boolean9 = chief2.isVerified();
        java.lang.String str10 = chief2.getID();
        chief2.setVerified(true);
        java.lang.String str13 = chief2.getAccountType();
        chief2.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "chief" + "'", str10, "chief");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "chief" + "'", str13, "chief");
    }

    @Test
    public void test15945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15945");
        model.Chief chief2 = new model.Chief("", "chief");
        chief2.login("hi!", "chief");
        java.lang.String str6 = chief2.getPassword();
        chief2.logout();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "chief" + "'", str6, "chief");
    }

    @Test
    public void test15946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15946");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        java.lang.String str4 = chief2.getAccountType();
        java.lang.String str5 = chief2.getPassword();
        java.lang.String str6 = chief2.getEmail();
        boolean boolean7 = chief2.isVerified();
        chief2.setVerified(true);
        java.lang.String str10 = chief2.getPassword();
        chief2.setVerified(true);
        chief2.login("", "hi!");
        java.lang.String str16 = chief2.getAccountType();
        chief2.setVerified(true);
        chief2.viewProfile();
        chief2.login("hi!", "chief");
        chief2.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "chief" + "'", str16, "chief");
    }

    @Test
    public void test15947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15947");
        model.Chief chief2 = new model.Chief("hi!", "");
        java.lang.String str3 = chief2.getID();
        java.lang.String str4 = chief2.getPassword();
        java.lang.String str5 = chief2.getPassword();
        java.lang.String str6 = chief2.getEmail();
        double double7 = chief2.getHourlyRate();
        java.lang.String str8 = chief2.getPassword();
        boolean boolean9 = chief2.isVerified();
        double double10 = chief2.getHourlyRate();
        java.lang.String str11 = chief2.getEmail();
        double double12 = chief2.getHourlyRate();
        chief2.logout();
        java.lang.String str14 = chief2.getEmail();
        chief2.viewProfile();
        double double16 = chief2.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "chief" + "'", str3, "chief");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
    }

    @Test
    public void test15948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15948");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.viewProfile();
        java.lang.String str4 = chief2.getPassword();
        chief2.login("", "");
        chief2.setVerified(true);
        java.lang.String str10 = chief2.getPassword();
        chief2.setVerified(false);
        chief2.login("chief", "chief");
        java.lang.String str16 = chief2.getAccountType();
        chief2.viewProfile();
        java.lang.String str18 = chief2.getID();
        chief2.setVerified(true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "chief" + "'", str16, "chief");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "chief" + "'", str18, "chief");
    }

    @Test
    public void test15949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15949");
        model.Chief chief2 = new model.Chief("chief", "");
        boolean boolean3 = chief2.isVerified();
        java.lang.String str4 = chief2.getID();
        chief2.setVerified(true);
        chief2.logout();
        java.lang.String str8 = chief2.getEmail();
        chief2.setVerified(true);
        java.lang.String str11 = chief2.getAccountType();
        boolean boolean12 = chief2.isVerified();
        java.lang.Class<?> wildcardClass13 = chief2.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "chief" + "'", str8, "chief");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "chief" + "'", str11, "chief");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test15950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15950");
        model.Chief chief2 = new model.Chief("hi!", "");
        java.lang.String str3 = chief2.getID();
        double double4 = chief2.getHourlyRate();
        chief2.login("hi!", "");
        java.lang.String str8 = chief2.getPassword();
        java.lang.String str9 = chief2.getEmail();
        chief2.login("", "");
        chief2.setVerified(true);
        boolean boolean15 = chief2.isVerified();
        chief2.logout();
        chief2.login("", "chief");
        chief2.setVerified(false);
        java.lang.String str22 = chief2.getID();
        double double23 = chief2.getHourlyRate();
        java.lang.String str24 = chief2.getPassword();
        java.lang.String str25 = chief2.getID();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "chief" + "'", str3, "chief");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "chief" + "'", str22, "chief");
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "chief" + "'", str25, "chief");
    }

    @Test
    public void test15951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15951");
        model.Chief chief2 = new model.Chief("hi!", "");
        java.lang.String str3 = chief2.getID();
        java.lang.String str4 = chief2.getPassword();
        java.lang.String str5 = chief2.getPassword();
        java.lang.String str6 = chief2.getEmail();
        chief2.login("", "");
        boolean boolean10 = chief2.isVerified();
        double double11 = chief2.getHourlyRate();
        chief2.login("hi!", "hi!");
        java.lang.String str15 = chief2.getEmail();
        java.lang.String str16 = chief2.getID();
        double double17 = chief2.getHourlyRate();
        java.lang.String str18 = chief2.getPassword();
        java.lang.String str19 = chief2.getPassword();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "chief" + "'", str3, "chief");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "chief" + "'", str16, "chief");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test15952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15952");
        model.Chief chief2 = new model.Chief("", "chief");
        chief2.setVerified(false);
        java.lang.String str5 = chief2.getPassword();
        java.lang.String str6 = chief2.getAccountType();
        chief2.logout();
        chief2.viewProfile();
        boolean boolean9 = chief2.isVerified();
        java.lang.String str10 = chief2.getEmail();
        chief2.setVerified(false);
        double double13 = chief2.getHourlyRate();
        boolean boolean14 = chief2.isVerified();
        chief2.setVerified(false);
        chief2.viewProfile();
        java.lang.String str18 = chief2.getID();
        chief2.viewProfile();
        chief2.setVerified(true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "chief" + "'", str6, "chief");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "chief" + "'", str18, "chief");
    }

    @Test
    public void test15953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15953");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        java.lang.String str4 = chief2.getID();
        java.lang.String str5 = chief2.getID();
        chief2.viewProfile();
        chief2.viewProfile();
        java.lang.String str8 = chief2.getPassword();
        chief2.setVerified(false);
        chief2.setVerified(true);
        boolean boolean13 = chief2.isVerified();
        chief2.login("chief", "chief");
        chief2.login("", "hi!");
        java.lang.String str20 = chief2.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test15954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15954");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        java.lang.String str4 = chief2.getAccountType();
        java.lang.String str5 = chief2.getID();
        chief2.setVerified(false);
        boolean boolean8 = chief2.isVerified();
        java.lang.String str9 = chief2.getPassword();
        chief2.viewProfile();
        java.lang.String str11 = chief2.getAccountType();
        java.lang.String str12 = chief2.getID();
        java.lang.Class<?> wildcardClass13 = chief2.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "chief" + "'", str11, "chief");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "chief" + "'", str12, "chief");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test15955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15955");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.viewProfile();
        chief2.setVerified(false);
        java.lang.String str6 = chief2.getID();
        java.lang.String str7 = chief2.getPassword();
        boolean boolean8 = chief2.isVerified();
        boolean boolean9 = chief2.isVerified();
        chief2.login("hi!", "hi!");
        chief2.setVerified(false);
        java.lang.String str15 = chief2.getEmail();
        chief2.login("chief", "hi!");
        double double19 = chief2.getHourlyRate();
        boolean boolean20 = chief2.isVerified();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "chief" + "'", str6, "chief");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test15956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15956");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.setVerified(false);
        chief2.logout();
        java.lang.String str6 = chief2.getAccountType();
        chief2.setVerified(true);
        double double9 = chief2.getHourlyRate();
        chief2.login("hi!", "chief");
        java.lang.String str13 = chief2.getID();
        java.lang.String str14 = chief2.getID();
        java.lang.String str15 = chief2.getPassword();
        java.lang.String str16 = chief2.getEmail();
        java.lang.String str17 = chief2.getAccountType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "chief" + "'", str6, "chief");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "chief" + "'", str13, "chief");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "chief" + "'", str14, "chief");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "chief" + "'", str17, "chief");
    }

    @Test
    public void test15957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15957");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.setVerified(false);
        chief2.logout();
        java.lang.String str6 = chief2.getEmail();
        java.lang.String str7 = chief2.getPassword();
        chief2.setVerified(true);
        java.lang.String str10 = chief2.getAccountType();
        boolean boolean11 = chief2.isVerified();
        chief2.login("", "hi!");
        chief2.logout();
        java.lang.String str16 = chief2.getPassword();
        chief2.viewProfile();
        chief2.setVerified(false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "chief" + "'", str10, "chief");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test15958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15958");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        double double4 = chief2.getHourlyRate();
        java.lang.String str5 = chief2.getID();
        java.lang.String str6 = chief2.getAccountType();
        java.lang.String str7 = chief2.getAccountType();
        boolean boolean8 = chief2.isVerified();
        java.lang.String str9 = chief2.getID();
        java.lang.String str10 = chief2.getAccountType();
        chief2.setVerified(true);
        java.lang.String str13 = chief2.getAccountType();
        double double14 = chief2.getHourlyRate();
        chief2.viewProfile();
        java.lang.String str16 = chief2.getEmail();
        chief2.logout();
        chief2.logout();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "chief" + "'", str6, "chief");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "chief" + "'", str7, "chief");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "chief" + "'", str9, "chief");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "chief" + "'", str10, "chief");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "chief" + "'", str13, "chief");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test15959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15959");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.setVerified(false);
        chief2.logout();
        java.lang.String str6 = chief2.getEmail();
        java.lang.String str7 = chief2.getAccountType();
        java.lang.String str8 = chief2.getEmail();
        chief2.viewProfile();
        chief2.setVerified(true);
        java.lang.String str12 = chief2.getID();
        chief2.setVerified(false);
        java.lang.String str15 = chief2.getID();
        java.lang.String str16 = chief2.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "chief" + "'", str7, "chief");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "chief" + "'", str12, "chief");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "chief" + "'", str15, "chief");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test15960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15960");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        double double4 = chief2.getHourlyRate();
        java.lang.String str5 = chief2.getID();
        java.lang.String str6 = chief2.getPassword();
        java.lang.String str7 = chief2.getPassword();
        chief2.login("", "");
        java.lang.String str11 = chief2.getAccountType();
        java.lang.String str12 = chief2.getID();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "chief" + "'", str11, "chief");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "chief" + "'", str12, "chief");
    }

    @Test
    public void test15961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15961");
        model.Chief chief2 = new model.Chief("", "hi!");
        chief2.logout();
        chief2.logout();
        chief2.setVerified(false);
        java.lang.String str7 = chief2.getEmail();
        chief2.viewProfile();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test15962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15962");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        java.lang.String str4 = chief2.getAccountType();
        java.lang.String str5 = chief2.getID();
        chief2.viewProfile();
        chief2.setVerified(true);
        java.lang.String str9 = chief2.getPassword();
        boolean boolean10 = chief2.isVerified();
        chief2.logout();
        java.lang.String str12 = chief2.getID();
        java.lang.String str13 = chief2.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "chief" + "'", str12, "chief");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test15963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15963");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        double double4 = chief2.getHourlyRate();
        java.lang.String str5 = chief2.getID();
        chief2.viewProfile();
        chief2.logout();
        double double8 = chief2.getHourlyRate();
        java.lang.String str9 = chief2.getID();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "chief" + "'", str9, "chief");
    }

    @Test
    public void test15964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15964");
        model.Chief chief2 = new model.Chief("hi!", "");
        java.lang.String str3 = chief2.getPassword();
        chief2.viewProfile();
        java.lang.String str5 = chief2.getPassword();
        java.lang.String str6 = chief2.getAccountType();
        java.lang.String str7 = chief2.getID();
        chief2.login("", "hi!");
        chief2.viewProfile();
        boolean boolean12 = chief2.isVerified();
        java.lang.String str13 = chief2.getEmail();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "chief" + "'", str6, "chief");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "chief" + "'", str7, "chief");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test15965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15965");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        chief2.logout();
        double double5 = chief2.getHourlyRate();
        java.lang.String str6 = chief2.getEmail();
        boolean boolean7 = chief2.isVerified();
        chief2.logout();
        chief2.login("", "chief");
        boolean boolean12 = chief2.isVerified();
        boolean boolean13 = chief2.isVerified();
        java.lang.String str14 = chief2.getAccountType();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "chief" + "'", str14, "chief");
    }

    @Test
    public void test15966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15966");
        model.Chief chief2 = new model.Chief("hi!", "");
        java.lang.String str3 = chief2.getAccountType();
        chief2.setVerified(true);
        chief2.login("", "");
        chief2.setVerified(false);
        java.lang.String str11 = chief2.getAccountType();
        java.lang.String str12 = chief2.getAccountType();
        java.lang.String str13 = chief2.getID();
        java.lang.Class<?> wildcardClass14 = chief2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "chief" + "'", str3, "chief");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "chief" + "'", str11, "chief");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "chief" + "'", str12, "chief");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "chief" + "'", str13, "chief");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test15967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15967");
        model.Chief chief2 = new model.Chief("hi!", "");
        java.lang.String str3 = chief2.getID();
        chief2.viewProfile();
        java.lang.String str5 = chief2.getEmail();
        chief2.login("", "hi!");
        chief2.viewProfile();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "chief" + "'", str3, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test15968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15968");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        java.lang.String str4 = chief2.getAccountType();
        java.lang.String str5 = chief2.getID();
        boolean boolean6 = chief2.isVerified();
        chief2.logout();
        double double8 = chief2.getHourlyRate();
        java.lang.String str9 = chief2.getEmail();
        java.lang.String str10 = chief2.getPassword();
        java.lang.String str11 = chief2.getEmail();
        chief2.viewProfile();
        chief2.logout();
        chief2.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test15969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15969");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        java.lang.String str4 = chief2.getAccountType();
        java.lang.String str5 = chief2.getID();
        boolean boolean6 = chief2.isVerified();
        chief2.logout();
        double double8 = chief2.getHourlyRate();
        java.lang.String str9 = chief2.getEmail();
        java.lang.String str10 = chief2.getPassword();
        boolean boolean11 = chief2.isVerified();
        chief2.login("chief", "");
        chief2.login("hi!", "chief");
        boolean boolean18 = chief2.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test15970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15970");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.viewProfile();
        java.lang.String str4 = chief2.getPassword();
        chief2.logout();
        chief2.logout();
        boolean boolean7 = chief2.isVerified();
        chief2.setVerified(true);
        double double10 = chief2.getHourlyRate();
        chief2.login("", "chief");
        java.lang.String str14 = chief2.getID();
        java.lang.String str15 = chief2.getAccountType();
        boolean boolean16 = chief2.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "chief" + "'", str14, "chief");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "chief" + "'", str15, "chief");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test15971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15971");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        java.lang.String str4 = chief2.getAccountType();
        java.lang.String str5 = chief2.getID();
        chief2.viewProfile();
        chief2.setVerified(true);
        java.lang.String str9 = chief2.getPassword();
        chief2.viewProfile();
        java.lang.String str11 = chief2.getEmail();
        chief2.logout();
        chief2.setVerified(true);
        java.lang.String str15 = chief2.getPassword();
        chief2.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test15972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15972");
        model.Chief chief2 = new model.Chief("chief", "");
        boolean boolean3 = chief2.isVerified();
        java.lang.String str4 = chief2.getPassword();
        chief2.setVerified(true);
        java.lang.String str7 = chief2.getPassword();
        chief2.viewProfile();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test15973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15973");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        double double4 = chief2.getHourlyRate();
        java.lang.String str5 = chief2.getID();
        chief2.setVerified(true);
        chief2.logout();
        double double9 = chief2.getHourlyRate();
        java.lang.String str10 = chief2.getEmail();
        java.lang.String str11 = chief2.getPassword();
        java.lang.String str12 = chief2.getID();
        java.lang.Class<?> wildcardClass13 = chief2.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "chief" + "'", str12, "chief");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test15974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15974");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        chief2.logout();
        double double5 = chief2.getHourlyRate();
        java.lang.String str6 = chief2.getEmail();
        boolean boolean7 = chief2.isVerified();
        double double8 = chief2.getHourlyRate();
        chief2.viewProfile();
        double double10 = chief2.getHourlyRate();
        java.lang.String str11 = chief2.getPassword();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test15975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15975");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        chief2.viewProfile();
        chief2.setVerified(false);
        java.lang.String str7 = chief2.getID();
        java.lang.String str8 = chief2.getID();
        java.lang.String str9 = chief2.getID();
        chief2.viewProfile();
        java.lang.String str11 = chief2.getEmail();
        double double12 = chief2.getHourlyRate();
        java.lang.String str13 = chief2.getEmail();
        chief2.viewProfile();
        java.lang.String str15 = chief2.getAccountType();
        chief2.viewProfile();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "chief" + "'", str7, "chief");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "chief" + "'", str8, "chief");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "chief" + "'", str9, "chief");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "chief" + "'", str15, "chief");
    }

    @Test
    public void test15976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15976");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        chief2.logout();
        double double5 = chief2.getHourlyRate();
        java.lang.String str6 = chief2.getEmail();
        java.lang.String str7 = chief2.getPassword();
        double double8 = chief2.getHourlyRate();
        chief2.viewProfile();
        chief2.setVerified(true);
        java.lang.String str12 = chief2.getEmail();
        chief2.viewProfile();
        double double14 = chief2.getHourlyRate();
        chief2.logout();
        java.lang.String str16 = chief2.getEmail();
        java.lang.Class<?> wildcardClass17 = chief2.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test15977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15977");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        java.lang.String str4 = chief2.getAccountType();
        java.lang.String str5 = chief2.getPassword();
        java.lang.String str6 = chief2.getEmail();
        boolean boolean7 = chief2.isVerified();
        chief2.setVerified(true);
        java.lang.String str10 = chief2.getPassword();
        chief2.setVerified(true);
        chief2.login("", "hi!");
        java.lang.String str16 = chief2.getAccountType();
        java.lang.String str17 = chief2.getID();
        chief2.viewProfile();
        chief2.setVerified(false);
        chief2.login("chief", "chief");
        boolean boolean24 = chief2.isVerified();
        chief2.login("hi!", "");
        java.lang.String str28 = chief2.getPassword();
        double double29 = chief2.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "chief" + "'", str16, "chief");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "chief" + "'", str17, "chief");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 0.0d + "'", double29 == 0.0d);
    }

    @Test
    public void test15978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15978");
        model.Chief chief2 = new model.Chief("hi!", "");
        java.lang.String str3 = chief2.getID();
        chief2.logout();
        java.lang.String str5 = chief2.getID();
        java.lang.String str6 = chief2.getEmail();
        chief2.login("hi!", "chief");
        chief2.login("", "chief");
        chief2.login("chief", "hi!");
        chief2.setVerified(true);
        java.lang.String str18 = chief2.getEmail();
        boolean boolean19 = chief2.isVerified();
        chief2.viewProfile();
        java.lang.String str21 = chief2.getEmail();
        chief2.logout();
        java.lang.String str23 = chief2.getAccountType();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "chief" + "'", str3, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "chief" + "'", str23, "chief");
    }

    @Test
    public void test15979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15979");
        model.Chief chief2 = new model.Chief("", "chief");
        chief2.setVerified(false);
        chief2.logout();
        java.lang.String str6 = chief2.getPassword();
        java.lang.String str7 = chief2.getPassword();
        boolean boolean8 = chief2.isVerified();
        java.lang.String str9 = chief2.getPassword();
        java.lang.String str10 = chief2.getPassword();
        chief2.logout();
        chief2.viewProfile();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "chief" + "'", str6, "chief");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "chief" + "'", str7, "chief");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "chief" + "'", str9, "chief");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "chief" + "'", str10, "chief");
    }

    @Test
    public void test15980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15980");
        model.Chief chief2 = new model.Chief("hi!", "");
        java.lang.String str3 = chief2.getID();
        java.lang.String str4 = chief2.getPassword();
        chief2.logout();
        double double6 = chief2.getHourlyRate();
        java.lang.String str7 = chief2.getPassword();
        java.lang.String str8 = chief2.getPassword();
        java.lang.String str9 = chief2.getEmail();
        chief2.setVerified(true);
        chief2.logout();
        java.lang.String str13 = chief2.getAccountType();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "chief" + "'", str3, "chief");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "chief" + "'", str13, "chief");
    }

    @Test
    public void test15981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15981");
        model.Chief chief2 = new model.Chief("hi!", "");
        java.lang.String str3 = chief2.getAccountType();
        java.lang.String str4 = chief2.getID();
        java.lang.String str5 = chief2.getID();
        chief2.viewProfile();
        chief2.setVerified(false);
        java.lang.String str9 = chief2.getAccountType();
        chief2.login("chief", "");
        chief2.viewProfile();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "chief" + "'", str3, "chief");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "chief" + "'", str9, "chief");
    }

    @Test
    public void test15982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15982");
        model.Chief chief2 = new model.Chief("hi!", "");
        java.lang.String str3 = chief2.getID();
        chief2.logout();
        java.lang.String str5 = chief2.getID();
        java.lang.String str6 = chief2.getEmail();
        chief2.login("hi!", "chief");
        chief2.login("", "chief");
        chief2.login("chief", "hi!");
        java.lang.String str16 = chief2.getEmail();
        boolean boolean17 = chief2.isVerified();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "chief" + "'", str3, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test15983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15983");
        model.Chief chief2 = new model.Chief("", "chief");
        chief2.setVerified(false);
        java.lang.String str5 = chief2.getPassword();
        java.lang.String str6 = chief2.getAccountType();
        chief2.logout();
        chief2.viewProfile();
        boolean boolean9 = chief2.isVerified();
        boolean boolean10 = chief2.isVerified();
        chief2.login("hi!", "chief");
        double double14 = chief2.getHourlyRate();
        java.lang.String str15 = chief2.getID();
        chief2.login("hi!", "chief");
        chief2.setVerified(false);
        java.lang.String str21 = chief2.getID();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "chief" + "'", str6, "chief");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "chief" + "'", str15, "chief");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "chief" + "'", str21, "chief");
    }

    @Test
    public void test15984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15984");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        java.lang.String str4 = chief2.getAccountType();
        java.lang.String str5 = chief2.getID();
        chief2.viewProfile();
        java.lang.String str7 = chief2.getAccountType();
        double double8 = chief2.getHourlyRate();
        chief2.logout();
        chief2.viewProfile();
        java.lang.String str11 = chief2.getID();
        boolean boolean12 = chief2.isVerified();
        java.lang.String str13 = chief2.getPassword();
        chief2.setVerified(true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "chief" + "'", str7, "chief");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "chief" + "'", str11, "chief");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test15985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15985");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.viewProfile();
        chief2.setVerified(false);
        java.lang.String str6 = chief2.getID();
        java.lang.String str7 = chief2.getAccountType();
        chief2.login("", "");
        chief2.viewProfile();
        java.lang.String str12 = chief2.getPassword();
        chief2.login("chief", "hi!");
        chief2.login("hi!", "hi!");
        chief2.logout();
        double double20 = chief2.getHourlyRate();
        chief2.setVerified(false);
        chief2.setVerified(true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "chief" + "'", str6, "chief");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "chief" + "'", str7, "chief");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
    }

    @Test
    public void test15986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15986");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.viewProfile();
        java.lang.String str4 = chief2.getPassword();
        chief2.login("", "");
        chief2.setVerified(true);
        chief2.logout();
        java.lang.String str11 = chief2.getID();
        chief2.logout();
        double double13 = chief2.getHourlyRate();
        java.lang.String str14 = chief2.getEmail();
        java.lang.String str15 = chief2.getPassword();
        java.lang.String str16 = chief2.getPassword();
        chief2.setVerified(true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "chief" + "'", str11, "chief");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test15987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15987");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        java.lang.String str4 = chief2.getAccountType();
        java.lang.String str5 = chief2.getPassword();
        java.lang.String str6 = chief2.getEmail();
        boolean boolean7 = chief2.isVerified();
        chief2.setVerified(true);
        java.lang.String str10 = chief2.getPassword();
        chief2.setVerified(true);
        chief2.login("", "hi!");
        java.lang.String str16 = chief2.getAccountType();
        java.lang.String str17 = chief2.getID();
        java.lang.String str18 = chief2.getEmail();
        chief2.login("", "hi!");
        java.lang.String str22 = chief2.getAccountType();
        chief2.logout();
        boolean boolean24 = chief2.isVerified();
        java.lang.String str25 = chief2.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "chief" + "'", str16, "chief");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "chief" + "'", str17, "chief");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "chief" + "'", str22, "chief");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
    }

    @Test
    public void test15988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15988");
        model.Chief chief2 = new model.Chief("hi!", "");
        java.lang.String str3 = chief2.getID();
        double double4 = chief2.getHourlyRate();
        chief2.login("hi!", "");
        java.lang.String str8 = chief2.getEmail();
        java.lang.String str9 = chief2.getEmail();
        java.lang.String str10 = chief2.getID();
        java.lang.String str11 = chief2.getEmail();
        chief2.setVerified(true);
        java.lang.String str14 = chief2.getEmail();
        chief2.viewProfile();
        java.lang.String str16 = chief2.getPassword();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "chief" + "'", str3, "chief");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "chief" + "'", str10, "chief");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test15989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15989");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        java.lang.String str4 = chief2.getEmail();
        java.lang.String str5 = chief2.getEmail();
        chief2.setVerified(true);
        chief2.setVerified(false);
        java.lang.String str10 = chief2.getEmail();
        java.lang.String str11 = chief2.getID();
        java.lang.String str12 = chief2.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "chief" + "'", str11, "chief");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test15990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15990");
        model.Chief chief2 = new model.Chief("", "chief");
        chief2.setVerified(false);
        java.lang.String str5 = chief2.getPassword();
        java.lang.String str6 = chief2.getID();
        double double7 = chief2.getHourlyRate();
        chief2.viewProfile();
        java.lang.String str9 = chief2.getPassword();
        double double10 = chief2.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "chief" + "'", str6, "chief");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "chief" + "'", str9, "chief");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test15991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15991");
        model.Chief chief2 = new model.Chief("hi!", "");
        java.lang.String str3 = chief2.getPassword();
        java.lang.String str4 = chief2.getEmail();
        double double5 = chief2.getHourlyRate();
        chief2.viewProfile();
        boolean boolean7 = chief2.isVerified();
        chief2.setVerified(true);
        java.lang.String str10 = chief2.getPassword();
        chief2.logout();
        java.lang.Class<?> wildcardClass12 = chief2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test15992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15992");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        java.lang.String str4 = chief2.getAccountType();
        java.lang.String str5 = chief2.getID();
        double double6 = chief2.getHourlyRate();
        java.lang.String str7 = chief2.getEmail();
        double double8 = chief2.getHourlyRate();
        boolean boolean9 = chief2.isVerified();
        chief2.logout();
        boolean boolean11 = chief2.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test15993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15993");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.viewProfile();
        java.lang.String str4 = chief2.getPassword();
        chief2.login("", "");
        chief2.setVerified(true);
        chief2.logout();
        chief2.viewProfile();
        boolean boolean12 = chief2.isVerified();
        chief2.login("hi!", "");
        boolean boolean16 = chief2.isVerified();
        java.lang.String str17 = chief2.getAccountType();
        java.lang.String str18 = chief2.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "chief" + "'", str17, "chief");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test15994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15994");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        java.lang.String str4 = chief2.getAccountType();
        java.lang.String str5 = chief2.getPassword();
        java.lang.String str6 = chief2.getEmail();
        boolean boolean7 = chief2.isVerified();
        chief2.login("", "chief");
        chief2.viewProfile();
        double double12 = chief2.getHourlyRate();
        chief2.login("", "hi!");
        java.lang.String str16 = chief2.getAccountType();
        chief2.setVerified(false);
        java.lang.String str19 = chief2.getEmail();
        java.lang.String str20 = chief2.getEmail();
        java.lang.String str21 = chief2.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "chief" + "'", str16, "chief");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
    }

    @Test
    public void test15995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15995");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        java.lang.String str4 = chief2.getAccountType();
        java.lang.String str5 = chief2.getPassword();
        java.lang.String str6 = chief2.getEmail();
        boolean boolean7 = chief2.isVerified();
        chief2.setVerified(true);
        java.lang.String str10 = chief2.getEmail();
        java.lang.String str11 = chief2.getAccountType();
        java.lang.String str12 = chief2.getID();
        java.lang.String str13 = chief2.getEmail();
        chief2.viewProfile();
        java.lang.String str15 = chief2.getPassword();
        chief2.logout();
        chief2.viewProfile();
        chief2.viewProfile();
        java.lang.String str19 = chief2.getAccountType();
        chief2.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "chief" + "'", str11, "chief");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "chief" + "'", str12, "chief");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "chief" + "'", str19, "chief");
    }

    @Test
    public void test15996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15996");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.setVerified(false);
        chief2.logout();
        java.lang.String str6 = chief2.getEmail();
        java.lang.String str7 = chief2.getPassword();
        chief2.setVerified(true);
        double double10 = chief2.getHourlyRate();
        chief2.logout();
        chief2.login("chief", "");
        chief2.logout();
        chief2.logout();
        chief2.setVerified(false);
        java.lang.String str19 = chief2.getEmail();
        chief2.setVerified(true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test15997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15997");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.viewProfile();
        java.lang.String str4 = chief2.getPassword();
        chief2.login("", "");
        java.lang.String str8 = chief2.getAccountType();
        chief2.logout();
        chief2.logout();
        chief2.viewProfile();
        chief2.logout();
        double double13 = chief2.getHourlyRate();
        java.lang.String str14 = chief2.getID();
        chief2.login("", "hi!");
        java.lang.String str18 = chief2.getID();
        chief2.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "chief" + "'", str8, "chief");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "chief" + "'", str14, "chief");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "chief" + "'", str18, "chief");
    }

    @Test
    public void test15998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15998");
        model.Chief chief2 = new model.Chief("hi!", "hi!");
        chief2.setVerified(true);
        chief2.setVerified(false);
        java.lang.String str7 = chief2.getPassword();
        chief2.logout();
        chief2.viewProfile();
        java.lang.String str10 = chief2.getPassword();
        chief2.viewProfile();
        chief2.viewProfile();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test15999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15999");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        java.lang.String str4 = chief2.getID();
        double double5 = chief2.getHourlyRate();
        chief2.logout();
        java.lang.String str7 = chief2.getPassword();
        double double8 = chief2.getHourlyRate();
        java.lang.String str9 = chief2.getID();
        java.lang.String str10 = chief2.getEmail();
        boolean boolean11 = chief2.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "chief" + "'", str9, "chief");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test16000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test16000");
        model.Chief chief2 = new model.Chief("", "chief");
        chief2.setVerified(false);
        java.lang.String str5 = chief2.getPassword();
        java.lang.String str6 = chief2.getAccountType();
        chief2.logout();
        chief2.viewProfile();
        boolean boolean9 = chief2.isVerified();
        java.lang.String str10 = chief2.getEmail();
        chief2.viewProfile();
        java.lang.String str12 = chief2.getID();
        java.lang.String str13 = chief2.getID();
        java.lang.String str14 = chief2.getPassword();
        java.lang.String str15 = chief2.getID();
        java.lang.String str16 = chief2.getID();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "chief" + "'", str6, "chief");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "chief" + "'", str12, "chief");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "chief" + "'", str13, "chief");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "chief" + "'", str14, "chief");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "chief" + "'", str15, "chief");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "chief" + "'", str16, "chief");
    }
}

